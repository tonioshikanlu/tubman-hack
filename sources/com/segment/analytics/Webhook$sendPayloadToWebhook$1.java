package com.segment.analytics;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 1, 15})
public final class Webhook$sendPayloadToWebhook$1 implements Runnable {
    public final /* synthetic */ ValueMap $payload;
    public final /* synthetic */ Webhook this$0;

    public Webhook$sendPayloadToWebhook$1(Webhook webhook, ValueMap valueMap) {
        this.this$0 = webhook;
        this.$payload = valueMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007d, code lost:
        if (r0 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        if (r0 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
        android.util.Log.w(r7.this$0.tag, "Failed to send payload, statusCode=" + r2 + ", body=" + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d3, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d4, code lost:
        b.q.a.a.A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d7, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c9 A[Catch:{ all -> 0x0080 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.segment.analytics.Webhook r0 = r7.this$0
            java.lang.String r0 = r0.tag
            java.lang.String r1 = "Running "
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            com.segment.analytics.ValueMap r2 = r7.$payload
            java.lang.String r3 = "type"
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.String r2 = " payload through "
            r1.append(r2)
            com.segment.analytics.Webhook r2 = r7.this$0
            java.lang.String r2 = r2.integrationKey
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00d8 }
            com.segment.analytics.Webhook r1 = r7.this$0     // Catch:{ MalformedURLException -> 0x00d8 }
            java.lang.String r1 = r1.webhookUrl     // Catch:{ MalformedURLException -> 0x00d8 }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x00d8 }
            java.net.URLConnection r0 = r0.openConnection()
            java.lang.String r1 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            java.util.Objects.requireNonNull(r0, r1)
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r1 = 1
            r0.setDoOutput(r1)
            r1 = 0
            r0.setChunkedStreamingMode(r1)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r0.setRequestProperty(r1, r2)
            java.io.DataOutputStream r1 = new java.io.DataOutputStream
            java.io.OutputStream r2 = r0.getOutputStream()
            r1.<init>(r2)
            com.segment.analytics.ValueMap r2 = r7.$payload
            org.json.JSONObject r2 = r2.toJsonObject()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "payload.toJsonObject().toString()"
            e.x.c.i.d(r2, r3)
            r1.writeBytes(r2)
            int r2 = r0.getResponseCode()     // Catch:{ all -> 0x00d1 }
            r3 = 300(0x12c, float:4.2E-43)
            r4 = 0
            if (r2 < r3) goto L_0x00cd
            java.io.InputStream r0 = com.segment.analytics.internal.Utils.getInputStream(r0)     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            java.lang.String r3 = com.segment.analytics.internal.Utils.readFully((java.io.InputStream) r0)     // Catch:{ IOException -> 0x0083 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a0
        L_0x0080:
            r2 = move-exception
            r4 = r0
            goto L_0x00c6
        L_0x0083:
            r3 = move-exception
            goto L_0x0089
        L_0x0085:
            r0 = move-exception
            goto L_0x00c7
        L_0x0087:
            r3 = move-exception
            r0 = r4
        L_0x0089:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r5.<init>()     // Catch:{ all -> 0x0080 }
            java.lang.String r6 = "Could not read response body for rejected message: "
            r5.append(r6)     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0080 }
            r5.append(r3)     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x00a3
        L_0x00a0:
            r0.close()     // Catch:{ all -> 0x00d1 }
        L_0x00a3:
            com.segment.analytics.Webhook r0 = r7.this$0     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = r0.tag     // Catch:{ all -> 0x00d1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d1 }
            r5.<init>()     // Catch:{ all -> 0x00d1 }
            java.lang.String r6 = "Failed to send payload, statusCode="
            r5.append(r6)     // Catch:{ all -> 0x00d1 }
            r5.append(r2)     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = ", body="
            r5.append(r2)     // Catch:{ all -> 0x00d1 }
            r5.append(r3)     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x00d1 }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x00d1 }
            goto L_0x00cd
        L_0x00c6:
            r0 = r2
        L_0x00c7:
            if (r4 == 0) goto L_0x00cc
            r4.close()     // Catch:{ all -> 0x00d1 }
        L_0x00cc:
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00cd:
            b.q.a.a.A(r1, r4)
            return
        L_0x00d1:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r2 = move-exception
            b.q.a.a.A(r1, r0)
            throw r2
        L_0x00d8:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Attempted to use malformed url: "
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            com.segment.analytics.Webhook r3 = r7.this$0
            java.lang.String r3 = r3.webhookUrl
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.Webhook$sendPayloadToWebhook$1.run():void");
    }
}
