package b.l.a.c.i.b;

public final class p5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f4208h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m6 f4209i;

    public p5(m6 m6Var, boolean z) {
        this.f4209i = m6Var;
        this.f4208h = z;
    }

    public final void run() {
        boolean j2 = this.f4209i.a.j();
        boolean i2 = this.f4209i.a.i();
        this.f4209i.a.B = Boolean.valueOf(this.f4208h);
        if (i2 == this.f4208h) {
            this.f4209i.a.a().f4096n.b("Default data collection state already set to", Boolean.valueOf(this.f4208h));
        }
        if (this.f4209i.a.j() == j2 || this.f4209i.a.j() != this.f4209i.a.i()) {
            this.f4209i.a.a().f4093k.c("Default data collection is different than actual status", Boolean.valueOf(this.f4208h), Boolean.valueOf(j2));
        }
        this.f4209i.v();
    }
}
