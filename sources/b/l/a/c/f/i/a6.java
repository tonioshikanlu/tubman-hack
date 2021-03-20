package b.l.a.c.f.i;

public class a6 {
    public volatile q6 a;

    /* renamed from: b  reason: collision with root package name */
    public volatile t4 f3488b;

    static {
        c5.a();
    }

    public final int a() {
        if (this.f3488b != null) {
            return ((r4) this.f3488b).f3710k.length;
        }
        if (this.a != null) {
            return this.a.b();
        }
        return 0;
    }

    public final t4 b() {
        if (this.f3488b != null) {
            return this.f3488b;
        }
        synchronized (this) {
            if (this.f3488b != null) {
                t4 t4Var = this.f3488b;
                return t4Var;
            }
            this.f3488b = this.a == null ? t4.f3759i : this.a.a();
            t4 t4Var2 = this.f3488b;
            return t4Var2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(b.l.a.c.f.i.q6 r2) {
        /*
            r1 = this;
            b.l.a.c.f.i.q6 r0 = r1.a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            b.l.a.c.f.i.q6 r0 = r1.a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.a = r2     // Catch:{ y5 -> 0x0011 }
            b.l.a.c.f.i.t4 r0 = b.l.a.c.f.i.t4.f3759i     // Catch:{ y5 -> 0x0011 }
            r1.f3488b = r0     // Catch:{ y5 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.a = r2     // Catch:{ all -> 0x001b }
            b.l.a.c.f.i.t4 r2 = b.l.a.c.f.i.t4.f3759i     // Catch:{ all -> 0x001b }
            r1.f3488b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.a6.c(b.l.a.c.f.i.q6):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        q6 q6Var = this.a;
        q6 q6Var2 = a6Var.a;
        if (q6Var == null && q6Var2 == null) {
            return b().equals(a6Var.b());
        }
        if (q6Var != null && q6Var2 != null) {
            return q6Var.equals(q6Var2);
        }
        if (q6Var != null) {
            a6Var.c(q6Var.d());
            return q6Var.equals(a6Var.a);
        }
        c(q6Var2.d());
        return this.a.equals(q6Var2);
    }

    public int hashCode() {
        return 1;
    }
}
