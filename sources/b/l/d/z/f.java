package b.l.d.z;

import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {
    public final e a;

    public f(e eVar) {
        this.a = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        b.l.d.z.e.b(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        if (r1 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        b.l.d.z.e.b(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a3, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r8 = this;
            b.l.d.z.e r0 = r8.a
            java.net.URL r1 = r0.f5409h
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = r2 + 22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Starting download of: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "FirebaseMessaging"
            android.util.Log.i(r2, r1)
            java.net.URL r1 = r0.f5409h     // Catch:{ IOException -> 0x00a4 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x00a4 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x00a4 }
            int r3 = b.l.a.c.f.f.c.a     // Catch:{ all -> 0x009b }
            b.l.a.c.f.f.e r3 = new b.l.a.c.f.f.e     // Catch:{ all -> 0x009b }
            r3.<init>(r1)     // Catch:{ all -> 0x009b }
            r0.f5411j = r1     // Catch:{ all -> 0x0094 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch:{ all -> 0x0094 }
            if (r4 == 0) goto L_0x006e
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r2, r5)     // Catch:{ all -> 0x0094 }
            if (r5 == 0) goto L_0x0064
            java.net.URL r5 = r0.f5409h     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0094 }
            int r6 = r5.length()     // Catch:{ all -> 0x0094 }
            int r6 = r6 + 31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r7.<init>(r6)     // Catch:{ all -> 0x0094 }
            java.lang.String r6 = "Successfully downloaded image: "
            r7.append(r6)     // Catch:{ all -> 0x0094 }
            r7.append(r5)     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0094 }
            android.util.Log.d(r2, r5)     // Catch:{ all -> 0x0094 }
        L_0x0064:
            r5 = 0
            b.l.d.z.e.b(r5, r3)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x006d
            b.l.d.z.e.b(r5, r1)     // Catch:{ IOException -> 0x00a4 }
        L_0x006d:
            return r4
        L_0x006e:
            java.net.URL r4 = r0.f5409h     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0094 }
            int r5 = r4.length()     // Catch:{ all -> 0x0094 }
            int r5 = r5 + 24
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r6.<init>(r5)     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = "Failed to decode image: "
            r6.append(r5)     // Catch:{ all -> 0x0094 }
            r6.append(r4)     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0094 }
            android.util.Log.w(r2, r4)     // Catch:{ all -> 0x0094 }
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0094 }
            r5.<init>(r4)     // Catch:{ all -> 0x0094 }
            throw r5     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r5 = move-exception
            b.l.d.z.e.b(r4, r3)     // Catch:{ all -> 0x009b }
            throw r5     // Catch:{ all -> 0x009b }
        L_0x009b:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x009d }
        L_0x009d:
            r4 = move-exception
            if (r1 == 0) goto L_0x00a3
            b.l.d.z.e.b(r3, r1)     // Catch:{ IOException -> 0x00a4 }
        L_0x00a3:
            throw r4     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            r1 = move-exception
            java.net.URL r0 = r0.f5409h
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            int r3 = r3 + 26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Failed to download image: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.z.f.call():java.lang.Object");
    }
}
