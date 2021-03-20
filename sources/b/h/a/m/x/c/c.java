package b.h.a.m.x.c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.o;
import b.h.a.m.p;
import b.h.a.m.s;
import b.h.a.m.v.c0.b;

public class c implements s<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    public static final o<Integer> f850b = o.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final o<Bitmap.CompressFormat> c = new o<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, o.f584e);
    @Nullable
    public final b a;

    public c(@NonNull b bVar) {
        this.a = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|41|(0)|45|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (r6 == null) goto L_0x006e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c2 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064 A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf A[SYNTHETIC, Splitter:B:43:0x00bf] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(@androidx.annotation.NonNull java.lang.Object r9, @androidx.annotation.NonNull java.io.File r10, @androidx.annotation.NonNull b.h.a.m.p r11) {
        /*
            r8 = this;
            b.h.a.m.v.w r9 = (b.h.a.m.v.w) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            b.h.a.m.o<android.graphics.Bitmap$CompressFormat> r1 = c
            java.lang.Object r1 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L_0x0015
            goto L_0x0020
        L_0x0015:
            boolean r1 = r9.hasAlpha()
            if (r1 == 0) goto L_0x001e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0020
        L_0x001e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0020:
            r9.getWidth()
            r9.getHeight()
            int r2 = b.h.a.s.f.f1014b     // Catch:{ all -> 0x00c3 }
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00c3 }
            b.h.a.m.o<java.lang.Integer> r4 = f850b     // Catch:{ all -> 0x00c3 }
            java.lang.Object r4 = r11.c(r4)     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00c3 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00c3 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005c }
            r7.<init>(r10)     // Catch:{ IOException -> 0x005c }
            b.h.a.m.v.c0.b r10 = r8.a     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            if (r10 == 0) goto L_0x004c
            b.h.a.m.u.c r10 = new b.h.a.m.u.c     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            b.h.a.m.v.c0.b r6 = r8.a     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r6 = r10
            goto L_0x004d
        L_0x004c:
            r6 = r7
        L_0x004d:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x005c }
            r6.close()     // Catch:{ IOException -> 0x005c }
            r5 = 1
            goto L_0x006b
        L_0x0055:
            r9 = move-exception
            goto L_0x00bd
        L_0x0057:
            r10 = move-exception
            r6 = r7
            goto L_0x005d
        L_0x005a:
            r9 = move-exception
            goto L_0x00bc
        L_0x005c:
            r10 = move-exception
        L_0x005d:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x0069
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch:{ all -> 0x005a }
        L_0x0069:
            if (r6 == 0) goto L_0x006e
        L_0x006b:
            r6.close()     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x00c3 }
            if (r10 == 0) goto L_0x00bb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r10.<init>()     // Catch:{ all -> 0x00c3 }
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch:{ all -> 0x00c3 }
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            int r1 = b.h.a.s.j.d(r9)     // Catch:{ all -> 0x00c3 }
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            double r1 = b.h.a.s.f.a(r2)     // Catch:{ all -> 0x00c3 }
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            b.h.a.m.o<android.graphics.Bitmap$CompressFormat> r1 = c     // Catch:{ all -> 0x00c3 }
            java.lang.Object r11 = r11.c(r1)     // Catch:{ all -> 0x00c3 }
            r10.append(r11)     // Catch:{ all -> 0x00c3 }
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch:{ all -> 0x00c3 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00c3 }
            r10.append(r9)     // Catch:{ all -> 0x00c3 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x00c3 }
            android.util.Log.v(r0, r9)     // Catch:{ all -> 0x00c3 }
        L_0x00bb:
            return r5
        L_0x00bc:
            r7 = r6
        L_0x00bd:
            if (r7 == 0) goto L_0x00c2
            r7.close()     // Catch:{ IOException -> 0x00c2 }
        L_0x00c2:
            throw r9     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.x.c.c.a(java.lang.Object, java.io.File, b.h.a.m.p):boolean");
    }

    @NonNull
    public b.h.a.m.c b(@NonNull p pVar) {
        return b.h.a.m.c.TRANSFORMED;
    }
}
