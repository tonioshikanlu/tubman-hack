package b.l.a.c.i.b;

public final class h6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g f4039h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ long f4040i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f4041j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ long f4042k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f4043l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ m6 f4044m;

    public h6(m6 m6Var, g gVar, long j2, int i2, long j3, boolean z) {
        this.f4044m = m6Var;
        this.f4039h = gVar;
        this.f4040i = j2;
        this.f4041j = i2;
        this.f4042k = j3;
        this.f4043l = z;
    }

    public final void run() {
        this.f4044m.z(this.f4039h);
        this.f4044m.n(this.f4040i, false);
        m6.t(this.f4044m, this.f4039h, this.f4041j, this.f4042k, true, this.f4043l);
    }
}
