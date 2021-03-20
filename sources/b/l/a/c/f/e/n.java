package b.l.a.c.f.e;

public class n {
    public volatile e0 a;

    /* renamed from: b  reason: collision with root package name */
    public volatile um f3179b;

    static {
        fn.a();
    }

    public final int a() {
        if (this.f3179b != null) {
            return ((rm) this.f3179b).f3265k.length;
        }
        if (this.a != null) {
            return this.a.o();
        }
        return 0;
    }

    public final um b() {
        if (this.f3179b != null) {
            return this.f3179b;
        }
        synchronized (this) {
            if (this.f3179b != null) {
                um umVar = this.f3179b;
                return umVar;
            }
            this.f3179b = this.a == null ? um.f3344i : this.a.n();
            um umVar2 = this.f3179b;
            return umVar2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(b.l.a.c.f.e.e0 r2) {
        /*
            r1 = this;
            b.l.a.c.f.e.e0 r0 = r1.a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            b.l.a.c.f.e.e0 r0 = r1.a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.a = r2     // Catch:{ l -> 0x0011 }
            b.l.a.c.f.e.um r0 = b.l.a.c.f.e.um.f3344i     // Catch:{ l -> 0x0011 }
            r1.f3179b = r0     // Catch:{ l -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.a = r2     // Catch:{ all -> 0x001b }
            b.l.a.c.f.e.um r2 = b.l.a.c.f.e.um.f3344i     // Catch:{ all -> 0x001b }
            r1.f3179b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.n.c(b.l.a.c.f.e.e0):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        e0 e0Var = this.a;
        e0 e0Var2 = nVar.a;
        if (e0Var == null && e0Var2 == null) {
            return b().equals(nVar.b());
        }
        if (e0Var != null && e0Var2 != null) {
            return e0Var.equals(e0Var2);
        }
        if (e0Var != null) {
            nVar.c(e0Var.q());
            return e0Var.equals(nVar.a);
        }
        c(e0Var2.q());
        return this.a.equals(e0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
