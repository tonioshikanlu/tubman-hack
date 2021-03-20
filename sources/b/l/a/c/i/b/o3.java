package b.l.a.c.i.b;

import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;
import java.net.URL;
import java.util.Map;

@WorkerThread
public final class o3 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final URL f4187h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f4188i;

    /* renamed from: j  reason: collision with root package name */
    public final m3 f4189j;

    /* renamed from: k  reason: collision with root package name */
    public final String f4190k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, String> f4191l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p3 f4192m;

    public o3(p3 p3Var, String str, URL url, byte[] bArr, Map<String, String> map, m3 m3Var) {
        this.f4192m = p3Var;
        a.x(str);
        this.f4187h = url;
        this.f4188i = bArr;
        this.f4189j = m3Var;
        this.f4190k = str;
        this.f4191l = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ce A[SYNTHETIC, Splitter:B:41:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb A[SYNTHETIC, Splitter:B:59:0x00eb] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0128 A[SYNTHETIC, Splitter:B:71:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            b.l.a.c.i.b.p3 r1 = r12.f4192m
            r1.g()
            r1 = 0
            r2 = 0
            b.l.a.c.i.b.p3 r3 = r12.f4192m     // Catch:{ IOException -> 0x0120, all -> 0x00e4 }
            java.net.URL r4 = r12.f4187h     // Catch:{ IOException -> 0x0120, all -> 0x00e4 }
            java.net.HttpURLConnection r3 = r3.m(r4)     // Catch:{ IOException -> 0x0120, all -> 0x00e4 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f4191l     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            if (r4 == 0) goto L_0x0039
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
        L_0x001d:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            goto L_0x001d
        L_0x0039:
            byte[] r4 = r12.f4188i     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            if (r4 == 0) goto L_0x0088
            b.l.a.c.i.b.p3 r4 = r12.f4192m     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            b.l.a.c.i.b.d9 r4 = r4.f4305b     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            b.l.a.c.i.b.f9 r4 = r4.P()     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            byte[] r5 = r12.f4188i     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            byte[] r4 = r4.F(r5)     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            b.l.a.c.i.b.p3 r5 = r12.f4192m     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            b.l.a.c.i.b.l4 r5 = r5.a     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            b.l.a.c.i.b.k3 r5 = r5.a()     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            b.l.a.c.i.b.i3 r5 = r5.f4096n     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            int r6 = r4.length     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            java.lang.String r7 = "Uploading data. size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            r5.b(r7, r8)     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r3.addRequestProperty(r5, r7)     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            r3.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            r3.connect()     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            r5.write(r4)     // Catch:{ IOException -> 0x0081, all -> 0x007b }
            r5.close()     // Catch:{ IOException -> 0x0081, all -> 0x007b }
            goto L_0x0088
        L_0x007b:
            r4 = move-exception
            r8 = r1
            r11 = r2
            r2 = r5
            goto L_0x00e9
        L_0x0081:
            r4 = move-exception
            r8 = r1
            r11 = r2
            r9 = r4
            r2 = r5
            goto L_0x0126
        L_0x0088:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00e0, all -> 0x00dc }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00da, all -> 0x00d8 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00ca }
            r4.<init>()     // Catch:{ all -> 0x00ca }
            java.io.InputStream r5 = r3.getInputStream()     // Catch:{ all -> 0x00ca }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00c8 }
        L_0x009d:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00c8 }
            if (r7 <= 0) goto L_0x00a7
            r4.write(r6, r1, r7)     // Catch:{ all -> 0x00c8 }
            goto L_0x009d
        L_0x00a7:
            byte[] r10 = r4.toByteArray()     // Catch:{ all -> 0x00c8 }
            r5.close()     // Catch:{ IOException -> 0x00d5, all -> 0x00d2 }
            r3.disconnect()
            b.l.a.c.i.b.p3 r0 = r12.f4192m
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.i4 r0 = r0.d()
            b.l.a.c.i.b.n3 r1 = new b.l.a.c.i.b.n3
            java.lang.String r6 = r12.f4190k
            b.l.a.c.i.b.m3 r7 = r12.f4189j
            r9 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00c4:
            r0.q(r1)
            return
        L_0x00c8:
            r1 = move-exception
            goto L_0x00cc
        L_0x00ca:
            r1 = move-exception
            r5 = r2
        L_0x00cc:
            if (r5 == 0) goto L_0x00d1
            r5.close()     // Catch:{ IOException -> 0x00d5, all -> 0x00d2 }
        L_0x00d1:
            throw r1     // Catch:{ IOException -> 0x00d5, all -> 0x00d2 }
        L_0x00d2:
            r1 = move-exception
            r4 = r1
            goto L_0x00e9
        L_0x00d5:
            r1 = move-exception
            r4 = r1
            goto L_0x0125
        L_0x00d8:
            r4 = move-exception
            goto L_0x00de
        L_0x00da:
            r4 = move-exception
            goto L_0x00e2
        L_0x00dc:
            r4 = move-exception
            r8 = r1
        L_0x00de:
            r11 = r2
            goto L_0x00e9
        L_0x00e0:
            r4 = move-exception
            r8 = r1
        L_0x00e2:
            r11 = r2
            goto L_0x0125
        L_0x00e4:
            r3 = move-exception
            r4 = r3
            r8 = r1
            r3 = r2
            r11 = r3
        L_0x00e9:
            if (r2 == 0) goto L_0x0103
            r2.close()     // Catch:{ IOException -> 0x00ef }
            goto L_0x0103
        L_0x00ef:
            r1 = move-exception
            b.l.a.c.i.b.p3 r2 = r12.f4192m
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f
            java.lang.String r5 = r12.f4190k
            java.lang.Object r5 = b.l.a.c.i.b.k3.t(r5)
            r2.c(r0, r5, r1)
        L_0x0103:
            if (r3 == 0) goto L_0x0108
            r3.disconnect()
        L_0x0108:
            b.l.a.c.i.b.p3 r0 = r12.f4192m
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.i4 r0 = r0.d()
            b.l.a.c.i.b.n3 r1 = new b.l.a.c.i.b.n3
            java.lang.String r6 = r12.f4190k
            b.l.a.c.i.b.m3 r7 = r12.f4189j
            r9 = 0
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.q(r1)
            throw r4
        L_0x0120:
            r3 = move-exception
            r4 = r3
            r8 = r1
            r3 = r2
            r11 = r3
        L_0x0125:
            r9 = r4
        L_0x0126:
            if (r2 == 0) goto L_0x0140
            r2.close()     // Catch:{ IOException -> 0x012c }
            goto L_0x0140
        L_0x012c:
            r1 = move-exception
            b.l.a.c.i.b.p3 r2 = r12.f4192m
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f
            java.lang.String r4 = r12.f4190k
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r4)
            r2.c(r0, r4, r1)
        L_0x0140:
            if (r3 == 0) goto L_0x0145
            r3.disconnect()
        L_0x0145:
            b.l.a.c.i.b.p3 r0 = r12.f4192m
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.i4 r0 = r0.d()
            b.l.a.c.i.b.n3 r1 = new b.l.a.c.i.b.n3
            java.lang.String r6 = r12.f4190k
            b.l.a.c.i.b.m3 r7 = r12.f4189j
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.o3.run():void");
    }
}
