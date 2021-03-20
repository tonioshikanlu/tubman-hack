package b.l.a.a.f.q.h;

import b.l.a.a.f.h;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final l f2525h;

    /* renamed from: i  reason: collision with root package name */
    public final h f2526i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2527j;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f2528k;

    public g(l lVar, h hVar, int i2, Runnable runnable) {
        this.f2525h = lVar;
        this.f2526i = hVar;
        this.f2527j = i2;
        this.f2528k = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.d.a(r1, r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            b.l.a.a.f.q.h.l r0 = r8.f2525h
            b.l.a.a.f.h r1 = r8.f2526i
            int r2 = r8.f2527j
            java.lang.Runnable r3 = r8.f2528k
            r4 = 1
            b.l.a.a.f.r.b r5 = r0.f     // Catch:{ a -> 0x0044 }
            b.l.a.a.f.q.i.c r6 = r0.c     // Catch:{ a -> 0x0044 }
            r6.getClass()     // Catch:{ a -> 0x0044 }
            b.l.a.a.f.q.h.j r7 = new b.l.a.a.f.q.h.j     // Catch:{ a -> 0x0044 }
            r7.<init>(r6)     // Catch:{ a -> 0x0044 }
            r5.b(r7)     // Catch:{ a -> 0x0044 }
            android.content.Context r5 = r0.a     // Catch:{ a -> 0x0044 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ a -> 0x0044 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ a -> 0x0044 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ a -> 0x0044 }
            if (r5 == 0) goto L_0x0030
            boolean r5 = r5.isConnected()     // Catch:{ a -> 0x0044 }
            if (r5 == 0) goto L_0x0030
            r5 = r4
            goto L_0x0031
        L_0x0030:
            r5 = 0
        L_0x0031:
            if (r5 != 0) goto L_0x003e
            b.l.a.a.f.r.b r5 = r0.f     // Catch:{ a -> 0x0044 }
            b.l.a.a.f.q.h.k r6 = new b.l.a.a.f.q.h.k     // Catch:{ a -> 0x0044 }
            r6.<init>(r0, r1, r2)     // Catch:{ a -> 0x0044 }
            r5.b(r6)     // Catch:{ a -> 0x0044 }
            goto L_0x004a
        L_0x003e:
            r0.a(r1, r2)     // Catch:{ a -> 0x0044 }
            goto L_0x004a
        L_0x0042:
            r0 = move-exception
            goto L_0x004e
        L_0x0044:
            b.l.a.a.f.q.h.r r0 = r0.d     // Catch:{ all -> 0x0042 }
            int r2 = r2 + r4
            r0.a(r1, r2)     // Catch:{ all -> 0x0042 }
        L_0x004a:
            r3.run()
            return
        L_0x004e:
            r3.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.a.f.q.h.g.run():void");
    }
}
