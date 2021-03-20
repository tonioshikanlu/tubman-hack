package com.segment.analytics;

import android.text.TextUtils;
import b.e.a.a.a;
import com.segment.analytics.internal.Utils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPOutputStream;

public class Client {
    public final ConnectionFactory connectionFactory;
    public final String writeKey;

    public static abstract class Connection implements Closeable {
        public final HttpURLConnection connection;
        public final InputStream is;
        public final OutputStream os;

        public Connection(HttpURLConnection httpURLConnection, InputStream inputStream, OutputStream outputStream) {
            if (httpURLConnection != null) {
                this.connection = httpURLConnection;
                this.is = inputStream;
                this.os = outputStream;
                return;
            }
            throw new IllegalArgumentException("connection == null");
        }

        public void close() {
            this.connection.disconnect();
        }
    }

    public static class HTTPException extends IOException {
        public final String responseBody;
        public final int responseCode;
        public final String responseMessage;

        public HTTPException(int i2, String str, String str2) {
            super("HTTP " + i2 + ": " + str + ". Response: " + str2);
            this.responseCode = i2;
            this.responseMessage = str;
            this.responseBody = str2;
        }

        public boolean is4xx() {
            int i2 = this.responseCode;
            return i2 >= 400 && i2 < 500;
        }
    }

    public Client(String str, ConnectionFactory connectionFactory2) {
        this.writeKey = str;
        this.connectionFactory = connectionFactory2;
    }

    private static Connection createGetConnection(HttpURLConnection httpURLConnection) {
        return new Connection(httpURLConnection, Utils.getInputStream(httpURLConnection), (OutputStream) null) {
            public void close() {
                super.close();
                this.is.close();
            }
        };
    }

    private static Connection createPostConnection(HttpURLConnection httpURLConnection) {
        return new Connection(httpURLConnection, (InputStream) null, TextUtils.equals("gzip", httpURLConnection.getRequestProperty("Content-Encoding")) ? new GZIPOutputStream(httpURLConnection.getOutputStream()) : httpURLConnection.getOutputStream()) {
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
                if (r1 == null) goto L_0x0036;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
                throw new com.segment.analytics.Client.HTTPException(r0, r5.connection.getResponseMessage(), r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
                if (r1 != null) goto L_0x0017;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
                r1.close();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void close() {
                /*
                    r5 = this;
                    java.net.HttpURLConnection r0 = r5.connection     // Catch:{ all -> 0x0051 }
                    int r0 = r0.getResponseCode()     // Catch:{ all -> 0x0051 }
                    r1 = 300(0x12c, float:4.2E-43)
                    if (r0 < r1) goto L_0x0048
                    r1 = 0
                    java.net.HttpURLConnection r2 = r5.connection     // Catch:{ IOException -> 0x001d }
                    java.io.InputStream r1 = com.segment.analytics.internal.Utils.getInputStream(r2)     // Catch:{ IOException -> 0x001d }
                    java.lang.String r2 = com.segment.analytics.internal.Utils.readFully((java.io.InputStream) r1)     // Catch:{ IOException -> 0x001d }
                    if (r1 == 0) goto L_0x0036
                L_0x0017:
                    r1.close()     // Catch:{ all -> 0x0051 }
                    goto L_0x0036
                L_0x001b:
                    r0 = move-exception
                    goto L_0x0042
                L_0x001d:
                    r2 = move-exception
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x001b }
                    r3.<init>()     // Catch:{ all -> 0x001b }
                    java.lang.String r4 = "Could not read response body for rejected message: "
                    r3.append(r4)     // Catch:{ all -> 0x001b }
                    java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x001b }
                    r3.append(r2)     // Catch:{ all -> 0x001b }
                    java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x001b }
                    if (r1 == 0) goto L_0x0036
                    goto L_0x0017
                L_0x0036:
                    com.segment.analytics.Client$HTTPException r1 = new com.segment.analytics.Client$HTTPException     // Catch:{ all -> 0x0051 }
                    java.net.HttpURLConnection r3 = r5.connection     // Catch:{ all -> 0x0051 }
                    java.lang.String r3 = r3.getResponseMessage()     // Catch:{ all -> 0x0051 }
                    r1.<init>(r0, r3, r2)     // Catch:{ all -> 0x0051 }
                    throw r1     // Catch:{ all -> 0x0051 }
                L_0x0042:
                    if (r1 == 0) goto L_0x0047
                    r1.close()     // Catch:{ all -> 0x0051 }
                L_0x0047:
                    throw r0     // Catch:{ all -> 0x0051 }
                L_0x0048:
                    super.close()
                    java.io.OutputStream r0 = r5.os
                    r0.close()
                    return
                L_0x0051:
                    r0 = move-exception
                    super.close()
                    java.io.OutputStream r1 = r5.os
                    r1.close()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.Client.AnonymousClass1.close():void");
            }
        };
    }

    public Connection fetchSettings() {
        HttpURLConnection projectSettings = this.connectionFactory.projectSettings(this.writeKey);
        int responseCode = projectSettings.getResponseCode();
        if (responseCode == 200) {
            return createGetConnection(projectSettings);
        }
        projectSettings.disconnect();
        StringBuilder z = a.z("HTTP ", responseCode, ": ");
        z.append(projectSettings.getResponseMessage());
        throw new IOException(z.toString());
    }

    public Connection upload() {
        return createPostConnection(this.connectionFactory.upload(this.writeKey));
    }
}
