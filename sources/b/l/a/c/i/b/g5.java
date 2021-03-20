package b.l.a.c.i.b;

public abstract class g5 extends f5 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f4014b;

    public g5(l4 l4Var) {
        super(l4Var);
        this.a.F++;
    }

    public abstract boolean i();

    public void j() {
    }

    public final boolean k() {
        return this.f4014b;
    }

    public final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f4014b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!i()) {
            this.a.G.incrementAndGet();
            this.f4014b = true;
        }
    }

    public final void n() {
        if (!this.f4014b) {
            j();
            this.a.G.incrementAndGet();
            this.f4014b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
