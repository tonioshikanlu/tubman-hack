package b.l.a.c.f.i;

public final class t6<T> implements a7<T> {
    public final q6 a;

    /* renamed from: b  reason: collision with root package name */
    public final n7<?, ?> f3762b;
    public final boolean c;
    public final d5<?> d;

    public t6(n7<?, ?> n7Var, d5<?> d5Var, q6 q6Var) {
        this.f3762b = n7Var;
        this.c = d5Var.a(q6Var);
        this.d = d5Var;
        this.a = q6Var;
    }

    public final T a() {
        return ((m5) this.a.c()).l();
    }

    public final boolean b(T t) {
        this.d.b(t);
        throw null;
    }

    public final int c(T t) {
        n7<?, ?> n7Var = this.f3762b;
        int g2 = n7Var.g(n7Var.d(t));
        if (!this.c) {
            return g2;
        }
        this.d.b(t);
        throw null;
    }

    public final void d(T t, T t2) {
        n7<?, ?> n7Var = this.f3762b;
        Class<?> cls = c7.a;
        n7Var.c(t, n7Var.f(n7Var.d(t), n7Var.d(t2)));
        if (this.c) {
            this.d.b(t2);
            throw null;
        }
    }

    public final int e(T t) {
        int hashCode = this.f3762b.d(t).hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.b(t);
        throw null;
    }

    public final boolean f(T t, T t2) {
        if (!this.f3762b.d(t).equals(this.f3762b.d(t2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.b(t);
        this.d.b(t2);
        throw null;
    }

    public final void g(T t, z4 z4Var) {
        this.d.b(t);
        throw null;
    }

    public final void h(T t) {
        this.f3762b.e(t);
        this.d.c(t);
    }

    public final void i(T t, byte[] bArr, int i2, int i3, j4 j4Var) {
        p5 p5Var = (p5) t;
        if (p5Var.zzc == o7.f) {
            p5Var.zzc = o7.a();
        }
        n5 n5Var = (n5) t;
        throw null;
    }
}
