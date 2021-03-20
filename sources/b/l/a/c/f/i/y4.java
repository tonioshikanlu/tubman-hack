package b.l.a.c.f.i;

import java.util.logging.Logger;

public abstract class y4 extends l4 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f3813b = Logger.getLogger(y4.class.getName());
    public static final boolean c = y7.f3820g;
    public z4 a;

    public y4() {
    }

    public /* synthetic */ y4(v4 v4Var) {
    }

    public static int a(t4 t4Var) {
        int l2 = t4Var.l();
        return u(l2) + l2;
    }

    public static int b(q6 q6Var, a7 a7Var) {
        g4 g4Var = (g4) q6Var;
        int g2 = g4Var.g();
        if (g2 == -1) {
            g2 = a7Var.c(g4Var);
            g4Var.h(g2);
        }
        return u(g2) + g2;
    }

    @Deprecated
    public static int c(int i2, q6 q6Var, a7 a7Var) {
        int u = u(i2 << 3);
        int i3 = u + u;
        g4 g4Var = (g4) q6Var;
        int g2 = g4Var.g();
        if (g2 == -1) {
            g2 = a7Var.c(g4Var);
            g4Var.h(g2);
        }
        return i3 + g2;
    }

    public static int s(int i2) {
        return u(i2 << 3);
    }

    public static int t(int i2) {
        if (i2 >= 0) {
            return u(i2);
        }
        return 10;
    }

    public static int u(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        return (i2 & -268435456) == 0 ? 4 : 5;
    }

    public static int v(long j2) {
        int i2;
        if ((-128 & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if ((-34359738368L & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if ((-2097152 & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? i2 + 1 : i2;
    }

    public static int w(String str) {
        int i2;
        try {
            i2 = d8.b(str);
        } catch (b8 unused) {
            i2 = str.getBytes(w5.a).length;
        }
        return u(i2) + i2;
    }

    public abstract void d(int i2, int i3);

    public abstract void e(int i2, int i3);

    public abstract void f(int i2, int i3);

    public abstract void g(int i2, int i3);

    public abstract void h(int i2, long j2);

    public abstract void i(int i2, long j2);

    public abstract void j(int i2, boolean z);

    public abstract void k(int i2, String str);

    public abstract void l(int i2, t4 t4Var);

    public abstract void m(byte b2);

    public abstract void n(int i2);

    public abstract void o(int i2);

    public abstract void p(int i2);

    public abstract void q(long j2);

    public abstract void r(long j2);
}
