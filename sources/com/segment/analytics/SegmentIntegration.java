package com.segment.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.JsonWriter;
import b.e.a.a.a;
import com.segment.analytics.PayloadQueue;
import com.segment.analytics.integrations.AliasPayload;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.integrations.GroupPayload;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.Logger;
import com.segment.analytics.integrations.ScreenPayload;
import com.segment.analytics.integrations.TrackPayload;
import com.segment.analytics.internal.Utils;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SegmentIntegration extends Integration<Void> {
    public static final Integration.Factory FACTORY = new Integration.Factory() {
        public Integration<?> create(ValueMap valueMap, Analytics analytics) {
            return SegmentIntegration.create(analytics.getApplication(), analytics.client, analytics.cartographer, analytics.networkExecutor, analytics.stats, Collections.unmodifiableMap(analytics.bundledIntegrations), analytics.tag, analytics.flushIntervalInMillis, analytics.flushQueueSize, analytics.getLogger(), analytics.crypto);
        }

        public String key() {
            return SegmentIntegration.SEGMENT_KEY;
        }
    };
    public static final int MAX_BATCH_SIZE = 475000;
    public static final int MAX_PAYLOAD_SIZE = 32000;
    public static final int MAX_QUEUE_SIZE = 1000;
    public static final String SEGMENT_KEY = "Segment.io";
    private static final String SEGMENT_THREAD_NAME = "Segment-SegmentDispatcher";
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Map<String, Boolean> bundledIntegrations;
    private final Cartographer cartographer;
    private final Client client;
    private final Context context;
    private final Crypto crypto;
    public final Object flushLock = new Object();
    private final int flushQueueSize;
    private final ScheduledExecutorService flushScheduler;
    private final Handler handler;
    private final Logger logger;
    private final ExecutorService networkExecutor;
    private final PayloadQueue payloadQueue;
    private final HandlerThread segmentThread;
    private final Stats stats;

    public static class BatchPayloadWriter implements Closeable {
        private final BufferedWriter bufferedWriter;
        private final JsonWriter jsonWriter;
        private boolean needsComma = false;

        public BatchPayloadWriter(OutputStream outputStream) {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(outputStream));
            this.bufferedWriter = bufferedWriter2;
            this.jsonWriter = new JsonWriter(bufferedWriter2);
        }

        public BatchPayloadWriter beginBatchArray() {
            this.jsonWriter.name("batch").beginArray();
            this.needsComma = false;
            return this;
        }

        public BatchPayloadWriter beginObject() {
            this.jsonWriter.beginObject();
            return this;
        }

        public void close() {
            this.jsonWriter.close();
        }

        public BatchPayloadWriter emitPayloadObject(String str) {
            if (this.needsComma) {
                this.bufferedWriter.write(44);
            } else {
                this.needsComma = true;
            }
            this.bufferedWriter.write(str);
            return this;
        }

        public BatchPayloadWriter endBatchArray() {
            if (this.needsComma) {
                this.jsonWriter.endArray();
                return this;
            }
            throw new IOException("At least one payload must be provided.");
        }

        public BatchPayloadWriter endObject() {
            this.jsonWriter.name("sentAt").value(Utils.toISO8601Date(new Date())).endObject();
            return this;
        }
    }

    public static class PayloadWriter implements PayloadQueue.ElementVisitor {
        public final Crypto crypto;
        public int payloadCount;
        public int size;
        public final BatchPayloadWriter writer;

        public PayloadWriter(BatchPayloadWriter batchPayloadWriter, Crypto crypto2) {
            this.writer = batchPayloadWriter;
            this.crypto = crypto2;
        }

        public boolean read(InputStream inputStream, int i2) {
            InputStream decrypt = this.crypto.decrypt(inputStream);
            int i3 = this.size + i2;
            if (i3 > 475000) {
                return false;
            }
            this.size = i3;
            byte[] bArr = new byte[i2];
            decrypt.read(bArr, 0, i2);
            this.writer.emitPayloadObject(new String(bArr, SegmentIntegration.UTF_8).trim());
            this.payloadCount++;
            return true;
        }
    }

    public static class SegmentDispatcherHandler extends Handler {
        public static final int REQUEST_ENQUEUE = 0;
        public static final int REQUEST_FLUSH = 1;
        private final SegmentIntegration segmentIntegration;

        public SegmentDispatcherHandler(Looper looper, SegmentIntegration segmentIntegration2) {
            super(looper);
            this.segmentIntegration = segmentIntegration2;
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.segmentIntegration.performEnqueue((BasePayload) message.obj);
            } else if (i2 == 1) {
                this.segmentIntegration.submitFlush();
            } else {
                StringBuilder y = a.y("Unknown dispatcher message: ");
                y.append(message.what);
                throw new AssertionError(y.toString());
            }
        }
    }

    public SegmentIntegration(Context context2, Client client2, Cartographer cartographer2, ExecutorService executorService, PayloadQueue payloadQueue2, Stats stats2, Map<String, Boolean> map, long j2, int i2, Logger logger2, Crypto crypto2) {
        int i3 = i2;
        this.context = context2;
        this.client = client2;
        this.networkExecutor = executorService;
        this.payloadQueue = payloadQueue2;
        this.stats = stats2;
        this.logger = logger2;
        this.bundledIntegrations = map;
        this.cartographer = cartographer2;
        this.flushQueueSize = i3;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new Utils.AnalyticsThreadFactory());
        this.flushScheduler = newScheduledThreadPool;
        this.crypto = crypto2;
        HandlerThread handlerThread = new HandlerThread(SEGMENT_THREAD_NAME, 10);
        this.segmentThread = handlerThread;
        handlerThread.start();
        this.handler = new SegmentDispatcherHandler(handlerThread.getLooper(), this);
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                SegmentIntegration.this.flush();
            }
        }, payloadQueue2.size() >= i3 ? 0 : j2, j2, TimeUnit.MILLISECONDS);
    }

    public static synchronized SegmentIntegration create(Context context2, Client client2, Cartographer cartographer2, ExecutorService executorService, Stats stats2, Map<String, Boolean> map, String str, long j2, int i2, Logger logger2, Crypto crypto2) {
        PayloadQueue.PersistentQueue persistentQueue;
        SegmentIntegration segmentIntegration;
        synchronized (SegmentIntegration.class) {
            try {
                Logger logger3 = logger2;
                persistentQueue = new PayloadQueue.PersistentQueue(createQueueFile(context2.getDir("segment-disk-queue", 0), str));
            } catch (IOException e2) {
                logger2.error(e2, "Could not create disk queue. Falling back to memory queue.", new Object[0]);
                persistentQueue = new PayloadQueue.MemoryQueue();
            }
            segmentIntegration = new SegmentIntegration(context2, client2, cartographer2, executorService, persistentQueue, stats2, map, j2, i2, logger2, crypto2);
        }
        return segmentIntegration;
    }

    public static QueueFile createQueueFile(File file, String str) {
        Utils.createDirectory(file);
        File file2 = new File(file, str);
        try {
            return new QueueFile(file2);
        } catch (IOException unused) {
            if (file2.delete()) {
                return new QueueFile(file2);
            }
            throw new IOException("Could not create queue file (" + str + ") in " + file + ".");
        }
    }

    private void dispatchEnqueue(BasePayload basePayload) {
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(0, basePayload));
    }

    private boolean shouldFlush() {
        return this.payloadQueue.size() > 0 && Utils.isConnected(this.context);
    }

    public void alias(AliasPayload aliasPayload) {
        dispatchEnqueue(aliasPayload);
    }

    public void flush() {
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(1));
    }

    public void group(GroupPayload groupPayload) {
        dispatchEnqueue(groupPayload);
    }

    public void identify(IdentifyPayload identifyPayload) {
        dispatchEnqueue(identifyPayload);
    }

    public void performEnqueue(BasePayload basePayload) {
        ValueMap integrations = basePayload.integrations();
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.bundledIntegrations.size() + integrations.size());
        linkedHashMap.putAll(integrations);
        linkedHashMap.putAll(this.bundledIntegrations);
        linkedHashMap.remove(SEGMENT_KEY);
        ValueMap valueMap = new ValueMap();
        valueMap.putAll(basePayload);
        valueMap.put(BasePayload.INTEGRATIONS_KEY, (Object) linkedHashMap);
        if (this.payloadQueue.size() >= 1000) {
            synchronized (this.flushLock) {
                if (this.payloadQueue.size() >= 1000) {
                    this.logger.info("Queue is at max capacity (%s), removing oldest payload.", Integer.valueOf(this.payloadQueue.size()));
                    try {
                        this.payloadQueue.remove(1);
                    } catch (IOException e2) {
                        this.logger.error(e2, "Unable to remove oldest payload from queue.", new Object[0]);
                        return;
                    }
                }
            }
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.cartographer.toJson(valueMap, new OutputStreamWriter(this.crypto.encrypt(byteArrayOutputStream)));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray == null || byteArray.length == 0 || byteArray.length > 32000) {
                throw new IOException("Could not serialize payload " + valueMap);
            }
            this.payloadQueue.add(byteArray);
            this.logger.verbose("Enqueued %s payload. %s elements in the queue.", basePayload, Integer.valueOf(this.payloadQueue.size()));
            if (this.payloadQueue.size() >= this.flushQueueSize) {
                submitFlush();
            }
        } catch (IOException e3) {
            this.logger.error(e3, "Could not add payload %s to queue: %s.", valueMap, this.payloadQueue);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r9.logger.error(r0, "Error while uploading payloads", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0098, code lost:
        com.segment.analytics.internal.Utils.closeQuietly(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
        r6 = r5;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        r9.logger.error(r6, "Payloads were rejected by server. Marked for removal.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r9.payloadQueue.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r9.logger.error(r6, "Unable to remove " + r5 + " payload(s) from queue.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d3, code lost:
        com.segment.analytics.internal.Utils.closeQuietly(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r9.logger.error(r6, "Error while uploading payloads", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00de, code lost:
        com.segment.analytics.internal.Utils.closeQuietly(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00ba */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0090 A[ExcHandler: IOException (r0v3 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v5 com.segment.analytics.Client$Connection) = (r3v2 com.segment.analytics.Client$Connection), (r3v7 com.segment.analytics.Client$Connection), (r3v7 com.segment.analytics.Client$Connection), (r3v7 com.segment.analytics.Client$Connection) binds: [B:4:0x0018, B:5:?, B:6:0x0046, B:7:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:4:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab A[Catch:{ HTTPException -> 0x008c, IOException -> 0x0090, all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void performFlush() {
        /*
            r9 = this;
            java.lang.String r0 = " payload(s) from queue."
            java.lang.String r1 = "Unable to remove "
            java.lang.String r2 = "Error while uploading payloads"
            boolean r3 = r9.shouldFlush()
            if (r3 != 0) goto L_0x000d
            return
        L_0x000d:
            com.segment.analytics.integrations.Logger r3 = r9.logger
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "Uploading payloads in queue to Segment."
            r3.verbose(r6, r5)
            r3 = 0
            com.segment.analytics.Client r5 = r9.client     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            com.segment.analytics.Client$Connection r3 = r5.upload()     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            com.segment.analytics.SegmentIntegration$BatchPayloadWriter r5 = new com.segment.analytics.SegmentIntegration$BatchPayloadWriter     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            java.io.OutputStream r6 = r3.os     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            r5.<init>(r6)     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            com.segment.analytics.SegmentIntegration$BatchPayloadWriter r5 = r5.beginObject()     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            com.segment.analytics.SegmentIntegration$BatchPayloadWriter r5 = r5.beginBatchArray()     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            com.segment.analytics.SegmentIntegration$PayloadWriter r6 = new com.segment.analytics.SegmentIntegration$PayloadWriter     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            com.segment.analytics.Crypto r7 = r9.crypto     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            r6.<init>(r5, r7)     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            com.segment.analytics.PayloadQueue r7 = r9.payloadQueue     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            r7.forEach(r6)     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            com.segment.analytics.SegmentIntegration$BatchPayloadWriter r5 = r5.endBatchArray()     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            com.segment.analytics.SegmentIntegration$BatchPayloadWriter r5 = r5.endObject()     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            r5.close()     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            int r5 = r6.payloadCount     // Catch:{ HTTPException -> 0x009c, IOException -> 0x0090 }
            r3.close()     // Catch:{ HTTPException -> 0x008c, IOException -> 0x0090 }
            com.segment.analytics.internal.Utils.closeQuietly(r3)
            com.segment.analytics.PayloadQueue r2 = r9.payloadQueue     // Catch:{ IOException -> 0x007f }
            r2.remove(r5)     // Catch:{ IOException -> 0x007f }
            com.segment.analytics.integrations.Logger r0 = r9.logger
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1[r4] = r2
            r2 = 1
            com.segment.analytics.PayloadQueue r3 = r9.payloadQueue
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "Uploaded %s payloads. %s remain in the queue."
            r0.verbose(r2, r1)
            com.segment.analytics.Stats r0 = r9.stats
            r0.dispatchFlush(r5)
            com.segment.analytics.PayloadQueue r0 = r9.payloadQueue
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x007e
            r9.performFlush()
        L_0x007e:
            return
        L_0x007f:
            r2 = move-exception
            com.segment.analytics.integrations.Logger r3 = r9.logger
            java.lang.String r0 = b.e.a.a.a.h(r1, r5, r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r3.error(r2, r0, r1)
            return
        L_0x008c:
            r6 = move-exception
            goto L_0x009f
        L_0x008e:
            r0 = move-exception
            goto L_0x00e2
        L_0x0090:
            r0 = move-exception
            com.segment.analytics.integrations.Logger r1 = r9.logger     // Catch:{ all -> 0x008e }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x008e }
            r1.error(r0, r2, r4)     // Catch:{ all -> 0x008e }
            com.segment.analytics.internal.Utils.closeQuietly(r3)
            return
        L_0x009c:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x009f:
            boolean r7 = r6.is4xx()     // Catch:{ all -> 0x008e }
            if (r7 == 0) goto L_0x00d7
            int r7 = r6.responseCode     // Catch:{ all -> 0x008e }
            r8 = 429(0x1ad, float:6.01E-43)
            if (r7 == r8) goto L_0x00d7
            com.segment.analytics.integrations.Logger r2 = r9.logger     // Catch:{ all -> 0x008e }
            java.lang.String r7 = "Payloads were rejected by server. Marked for removal."
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x008e }
            r2.error(r6, r7, r8)     // Catch:{ all -> 0x008e }
            com.segment.analytics.PayloadQueue r2 = r9.payloadQueue     // Catch:{ IOException -> 0x00ba }
            r2.remove(r5)     // Catch:{ IOException -> 0x00ba }
            goto L_0x00d3
        L_0x00ba:
            com.segment.analytics.integrations.Logger r2 = r9.logger     // Catch:{ all -> 0x008e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r7.<init>()     // Catch:{ all -> 0x008e }
            r7.append(r1)     // Catch:{ all -> 0x008e }
            r7.append(r5)     // Catch:{ all -> 0x008e }
            r7.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x008e }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x008e }
            r2.error(r6, r0, r1)     // Catch:{ all -> 0x008e }
        L_0x00d3:
            com.segment.analytics.internal.Utils.closeQuietly(r3)
            return
        L_0x00d7:
            com.segment.analytics.integrations.Logger r0 = r9.logger     // Catch:{ all -> 0x008e }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x008e }
            r0.error(r6, r2, r1)     // Catch:{ all -> 0x008e }
            com.segment.analytics.internal.Utils.closeQuietly(r3)
            return
        L_0x00e2:
            com.segment.analytics.internal.Utils.closeQuietly(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.SegmentIntegration.performFlush():void");
    }

    public void screen(ScreenPayload screenPayload) {
        dispatchEnqueue(screenPayload);
    }

    public void shutdown() {
        this.flushScheduler.shutdownNow();
        this.segmentThread.quit();
        Utils.closeQuietly(this.payloadQueue);
    }

    public void submitFlush() {
        if (shouldFlush()) {
            if (this.networkExecutor.isShutdown()) {
                this.logger.info("A call to flush() was made after shutdown() has been called.  In-flight events may not be uploaded right away.", new Object[0]);
            } else {
                this.networkExecutor.submit(new Runnable() {
                    public void run() {
                        synchronized (SegmentIntegration.this.flushLock) {
                            SegmentIntegration.this.performFlush();
                        }
                    }
                });
            }
        }
    }

    public void track(TrackPayload trackPayload) {
        dispatchEnqueue(trackPayload);
    }
}
