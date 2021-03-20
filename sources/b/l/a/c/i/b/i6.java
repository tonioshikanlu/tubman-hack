package b.l.a.c.i.b;

public final class i6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g f4056h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f4057i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f4058j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f4059k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ m6 f4060l;

    public i6(m6 m6Var, g gVar, int i2, long j2, boolean z) {
        this.f4060l = m6Var;
        this.f4056h = gVar;
        this.f4057i = i2;
        this.f4058j = j2;
        this.f4059k = z;
    }

    public final void run() {
        this.f4060l.z(this.f4056h);
        m6.t(this.f4060l, this.f4056h, this.f4057i, this.f4058j, false, this.f4059k);
    }
}
