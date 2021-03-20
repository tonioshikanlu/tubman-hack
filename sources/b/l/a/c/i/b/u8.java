package b.l.a.c.i.b;

public abstract class u8 extends f5 implements h5 {

    /* renamed from: b  reason: collision with root package name */
    public final d9 f4305b;
    public boolean c;

    public u8(d9 d9Var) {
        super(d9Var.f3979j);
        this.f4305b = d9Var;
        d9Var.f3984o++;
    }

    public final void i() {
        if (!this.c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (!this.c) {
            k();
            this.f4305b.f3985p++;
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean k();
}
