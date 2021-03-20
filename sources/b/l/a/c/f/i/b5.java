package b.l.a.c.f.i;

public final class b5 {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3495b;

    public b5(Object obj, int i2) {
        this.a = obj;
        this.f3495b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj;
        return this.a == b5Var.a && this.f3495b == b5Var.f3495b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.f3495b;
    }
}
