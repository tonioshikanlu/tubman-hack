package b.l.a.c.i.b;

import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@WorkerThread
public final class p6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final URL f4210h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4211i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q6 f4212j;

    /* renamed from: k  reason: collision with root package name */
    public final j4 f4213k;

    public p6(q6 q6Var, String str, URL url, j4 j4Var) {
        this.f4212j = q6Var;
        a.x(str);
        Objects.requireNonNull(url, "null reference");
        this.f4210h = url;
        this.f4213k = j4Var;
        this.f4211i = str;
    }

    public final void a(int i2, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f4212j.a.d().q(new o6(this, i2, exc, bArr, map));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[SYNTHETIC, Splitter:B:24:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            b.l.a.c.i.b.q6 r0 = r10.f4212j
            r0.g()
            r0 = 0
            r1 = 0
            b.l.a.c.i.b.q6 r2 = r10.f4212j     // Catch:{ IOException -> 0x006a, all -> 0x005c }
            java.net.URL r3 = r10.f4210h     // Catch:{ IOException -> 0x006a, all -> 0x005c }
            java.net.HttpURLConnection r2 = r2.o(r3)     // Catch:{ IOException -> 0x006a, all -> 0x005c }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x0056, all -> 0x0050 }
            java.util.Map r4 = r2.getHeaderFields()     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x003e }
            r5.<init>()     // Catch:{ all -> 0x003e }
            java.io.InputStream r6 = r2.getInputStream()     // Catch:{ all -> 0x003e }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x003c }
        L_0x0024:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x003c }
            if (r8 <= 0) goto L_0x002e
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x003c }
            goto L_0x0024
        L_0x002e:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x003c }
            r6.close()     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
            r2.disconnect()
            r10.a(r3, r1, r0, r4)
            return
        L_0x003c:
            r0 = move-exception
            goto L_0x0040
        L_0x003e:
            r0 = move-exception
            r6 = r1
        L_0x0040:
            if (r6 == 0) goto L_0x0045
            r6.close()     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
        L_0x0045:
            throw r0     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            goto L_0x0061
        L_0x0048:
            r0 = move-exception
            goto L_0x006f
        L_0x004a:
            r0 = move-exception
            r4 = r1
            goto L_0x0061
        L_0x004d:
            r0 = move-exception
            r4 = r1
            goto L_0x006f
        L_0x0050:
            r3 = move-exception
            r4 = r1
            r9 = r3
            r3 = r0
            r0 = r9
            goto L_0x0061
        L_0x0056:
            r3 = move-exception
            r4 = r1
            r9 = r3
            r3 = r0
            r0 = r9
            goto L_0x006f
        L_0x005c:
            r2 = move-exception
            r3 = r0
            r4 = r1
            r0 = r2
            r2 = r4
        L_0x0061:
            if (r2 == 0) goto L_0x0066
            r2.disconnect()
        L_0x0066:
            r10.a(r3, r1, r1, r4)
            throw r0
        L_0x006a:
            r2 = move-exception
            r3 = r0
            r4 = r1
            r0 = r2
            r2 = r4
        L_0x006f:
            if (r2 == 0) goto L_0x0074
            r2.disconnect()
        L_0x0074:
            r10.a(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.p6.run():void");
    }
}
