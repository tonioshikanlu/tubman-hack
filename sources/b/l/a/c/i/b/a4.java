package b.l.a.c.i.b;

public abstract class a4 extends b3 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f3887b;

    public a4(l4 l4Var) {
        super(l4Var);
        this.a.F++;
    }

    public final void i() {
        if (!this.f3887b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f3887b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!k()) {
            this.a.G.incrementAndGet();
            this.f3887b = true;
        }
    }

    public abstract boolean k();
}
