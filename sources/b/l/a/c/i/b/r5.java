package b.l.a.c.i.b;

public final class r5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f4240h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m6 f4241i;

    public r5(m6 m6Var, long j2) {
        this.f4241i = m6Var;
        this.f4240h = j2;
    }

    public final void run() {
        this.f4241i.a.q().f4363p.b(this.f4240h);
        this.f4241i.a.a().f4095m.b("Session timeout duration set", Long.valueOf(this.f4240h));
    }
}
