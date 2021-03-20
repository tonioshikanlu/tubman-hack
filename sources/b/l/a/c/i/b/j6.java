package b.l.a.c.i.b;

public final class j6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g f4076h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f4077i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f4078j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f4079k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ m6 f4080l;

    public j6(m6 m6Var, g gVar, int i2, long j2, boolean z) {
        this.f4080l = m6Var;
        this.f4076h = gVar;
        this.f4077i = i2;
        this.f4078j = j2;
        this.f4079k = z;
    }

    public final void run() {
        this.f4080l.z(this.f4076h);
        m6.t(this.f4080l, this.f4076h, this.f4077i, this.f4078j, false, this.f4079k);
    }
}
