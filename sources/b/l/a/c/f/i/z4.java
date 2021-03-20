package b.l.a.c.f.i;

import java.nio.charset.Charset;

public final class z4 {
    public final y4 a;

    public z4(y4 y4Var) {
        Charset charset = w5.a;
        this.a = y4Var;
        y4Var.a = this;
    }

    public final void a(int i2, float f) {
        this.a.g(i2, Float.floatToRawIntBits(f));
    }

    public final void b(int i2, double d) {
        this.a.i(i2, Double.doubleToRawLongBits(d));
    }

    public final void c(int i2, int i3) {
        this.a.f(i2, (i3 >> 31) ^ (i3 + i3));
    }

    public final void d(int i2, long j2) {
        this.a.h(i2, (j2 >> 63) ^ (j2 + j2));
    }

    public final void e(int i2, Object obj, a7 a7Var) {
        q6 q6Var = (q6) obj;
        w4 w4Var = (w4) this.a;
        w4Var.o((i2 << 3) | 2);
        g4 g4Var = (g4) q6Var;
        int g2 = g4Var.g();
        if (g2 == -1) {
            g2 = a7Var.c(g4Var);
            g4Var.h(g2);
        }
        w4Var.o(g2);
        a7Var.g(q6Var, w4Var.a);
    }

    public final void f(int i2, Object obj, a7 a7Var) {
        y4 y4Var = this.a;
        y4Var.d(i2, 3);
        a7Var.g((q6) obj, y4Var.a);
        y4Var.d(i2, 4);
    }
}
