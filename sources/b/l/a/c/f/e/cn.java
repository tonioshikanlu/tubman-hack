package b.l.a.c.f.e;

import java.nio.charset.Charset;

public final class cn {
    public final bn a;

    public cn(bn bnVar) {
        Charset charset = j.a;
        this.a = bnVar;
        bnVar.a = this;
    }

    public final void a(int i2, float f) {
        this.a.n(i2, Float.floatToRawIntBits(f));
    }

    public final void b(int i2, double d) {
        this.a.q(i2, Double.doubleToRawLongBits(d));
    }

    public final void c(int i2, int i3) {
        this.a.m(i2, bn.g(i3));
    }

    public final void d(int i2, long j2) {
        this.a.o(i2, bn.h(j2));
    }

    public final void e(int i2, Object obj, o0 o0Var) {
        this.a.u(i2, (e0) obj, o0Var);
    }

    public final void f(int i2, Object obj, o0 o0Var) {
        bn bnVar = this.a;
        bnVar.k(i2, 3);
        o0Var.h((e0) obj, bnVar.a);
        bnVar.k(i2, 4);
    }
}
