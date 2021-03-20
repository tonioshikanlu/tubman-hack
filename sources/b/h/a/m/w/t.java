package b.h.a.m.w;

import b.h.a.m.d;
import b.h.a.m.v.c0.b;
import java.io.InputStream;

public class t implements d<InputStream> {
    public final b a;

    public t(b bVar) {
        this.a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[Catch:{ all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040 A[SYNTHETIC, Splitter:B:22:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004c A[SYNTHETIC, Splitter:B:29:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(@androidx.annotation.NonNull java.lang.Object r5, @androidx.annotation.NonNull java.io.File r6, @androidx.annotation.NonNull b.h.a.m.p r7) {
        /*
            r4 = this;
            java.io.InputStream r5 = (java.io.InputStream) r5
            java.lang.String r7 = "StreamEncoder"
            b.h.a.m.v.c0.b r0 = r4.a
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r0 = r0.e(r2, r1)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0031 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0031 }
        L_0x0017:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            r2 = -1
            if (r6 == r2) goto L_0x0022
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            goto L_0x0017
        L_0x0022:
            r3.close()     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            r1 = 1
            r3.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0043
        L_0x002a:
            r5 = move-exception
            goto L_0x004a
        L_0x002c:
            r5 = move-exception
            r2 = r3
            goto L_0x0032
        L_0x002f:
            r5 = move-exception
            goto L_0x0049
        L_0x0031:
            r5 = move-exception
        L_0x0032:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x002f }
            if (r6 == 0) goto L_0x003e
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x002f }
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            b.h.a.m.v.c0.b r5 = r4.a
            r5.d(r0)
            return r1
        L_0x0049:
            r3 = r2
        L_0x004a:
            if (r3 == 0) goto L_0x004f
            r3.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            b.h.a.m.v.c0.b r6 = r4.a
            r6.d(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.w.t.a(java.lang.Object, java.io.File, b.h.a.m.p):boolean");
    }
}
