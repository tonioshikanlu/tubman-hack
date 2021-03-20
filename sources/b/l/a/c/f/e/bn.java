package b.l.a.c.f.e;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class bn extends lm {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f2875b = Logger.getLogger(bn.class.getName());
    public static final boolean c = n1.f3183g;
    public cn a;

    public bn() {
    }

    public /* synthetic */ bn(xm xmVar) {
    }

    public static int B(int i2) {
        return b(i2 << 3);
    }

    public static int C(int i2) {
        if (i2 >= 0) {
            return b(i2);
        }
        return 10;
    }

    public static int b(int i2) {
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

    public static int c(long j2) {
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

    public static int d(String str) {
        int i2;
        try {
            i2 = s1.b(str);
        } catch (q1 unused) {
            i2 = str.getBytes(j.a).length;
        }
        return b(i2) + i2;
    }

    public static int e(um umVar) {
        int l2 = umVar.l();
        return b(l2) + l2;
    }

    public static int f(e0 e0Var, o0 o0Var) {
        gm gmVar = (gm) e0Var;
        int b2 = gmVar.b();
        if (b2 == -1) {
            b2 = o0Var.c(gmVar);
            gmVar.c(b2);
        }
        return b(b2) + b2;
    }

    public static int g(int i2) {
        return (i2 >> 31) ^ (i2 + i2);
    }

    public static long h(long j2) {
        return (j2 >> 63) ^ (j2 + j2);
    }

    @Deprecated
    public static int j(int i2, e0 e0Var, o0 o0Var) {
        int b2 = b(i2 << 3);
        int i3 = b2 + b2;
        gm gmVar = (gm) e0Var;
        int b3 = gmVar.b();
        if (b3 == -1) {
            b3 = o0Var.c(gmVar);
            gmVar.c(b3);
        }
        return i3 + b3;
    }

    public abstract void A(long j2);

    public final void i(String str, q1 q1Var) {
        f2875b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", q1Var);
        byte[] bytes = str.getBytes(j.a);
        try {
            int length = bytes.length;
            x(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zm(e2);
        } catch (zm e3) {
            throw e3;
        }
    }

    public abstract void k(int i2, int i3);

    public abstract void l(int i2, int i3);

    public abstract void m(int i2, int i3);

    public abstract void n(int i2, int i3);

    public abstract void o(int i2, long j2);

    public abstract int p();

    public abstract void q(int i2, long j2);

    public abstract void r(int i2, boolean z);

    public abstract void s(int i2, String str);

    public abstract void t(int i2, um umVar);

    public abstract void u(int i2, e0 e0Var, o0 o0Var);

    public abstract void v(byte b2);

    public abstract void w(int i2);

    public abstract void x(int i2);

    public abstract void y(int i2);

    public abstract void z(long j2);
}
