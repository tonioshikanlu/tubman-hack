package b.l.a.c.f.i;

import java.util.List;

public final class e2 extends p5<e2, d2> implements r6 {
    /* access modifiers changed from: private */
    public static final e2 zzg;
    private int zza;
    private int zze;
    private u5 zzf = g6.f3568k;

    static {
        e2 e2Var = new e2();
        zzg = e2Var;
        p5.q(e2.class, e2Var);
    }

    public static void A(e2 e2Var, Iterable iterable) {
        u5 u5Var = e2Var.zzf;
        if (!((h4) u5Var).f3587h) {
            e2Var.zzf = p5.k(u5Var);
        }
        g4.i(iterable, e2Var.zzf);
    }

    public static d2 x() {
        return (d2) zzg.m();
    }

    public static /* synthetic */ void z(e2 e2Var, int i2) {
        e2Var.zza |= 1;
        e2Var.zze = i2;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zza", "zze", "zzf"});
        } else if (i3 == 3) {
            return new e2();
        } else {
            if (i3 == 4) {
                return new d2((f1) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final boolean s() {
        return (this.zza & 1) != 0;
    }

    public final int t() {
        return this.zze;
    }

    public final List<Long> u() {
        return this.zzf;
    }

    public final int v() {
        return ((g6) this.zzf).size();
    }

    public final long w(int i2) {
        g6 g6Var = (g6) this.zzf;
        g6Var.p(i2);
        return g6Var.f3569i[i2];
    }
}
