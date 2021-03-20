package b.l.a.c.f.i;

import java.util.List;

public final class u1 extends p5<u1, t1> implements r6 {
    /* access modifiers changed from: private */
    public static final u1 zze;
    private v5<w1> zza = y6.f3815k;

    static {
        u1 u1Var = new u1();
        zze = u1Var;
        p5.q(u1.class, u1Var);
    }

    public static t1 u() {
        return (t1) zze.m();
    }

    public static /* synthetic */ void w(u1 u1Var, w1 w1Var) {
        v5<w1> v5Var = u1Var.zza;
        if (!v5Var.a()) {
            u1Var.zza = p5.l(v5Var);
        }
        u1Var.zza.add(w1Var);
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", w1.class});
        } else if (i3 == 3) {
            return new u1();
        } else {
            if (i3 == 4) {
                return new t1((f1) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final List<w1> s() {
        return this.zza;
    }

    public final w1 t() {
        return this.zza.get(0);
    }
}
