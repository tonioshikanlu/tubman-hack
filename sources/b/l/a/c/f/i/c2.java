package b.l.a.c.f.i;

import java.util.List;

public final class c2 extends p5<c2, b2> implements r6 {
    /* access modifiers changed from: private */
    public static final c2 zzh;
    private u5 zza;
    private u5 zze;
    private v5<l1> zzf;
    private v5<e2> zzg;

    static {
        c2 c2Var = new c2();
        zzh = c2Var;
        p5.q(c2.class, c2Var);
    }

    public c2() {
        g6 g6Var = g6.f3568k;
        this.zza = g6Var;
        this.zze = g6Var;
        y6<Object> y6Var = y6.f3815k;
        this.zzf = y6Var;
        this.zzg = y6Var;
    }

    public static b2 C() {
        return (b2) zzh.m();
    }

    public static c2 D() {
        return zzh;
    }

    public static void F(c2 c2Var, Iterable iterable) {
        u5 u5Var = c2Var.zza;
        if (!((h4) u5Var).f3587h) {
            c2Var.zza = p5.k(u5Var);
        }
        g4.i(iterable, c2Var.zza);
    }

    public static void G(c2 c2Var) {
        c2Var.zza = g6.f3568k;
    }

    public static void H(c2 c2Var, Iterable iterable) {
        u5 u5Var = c2Var.zze;
        if (!((h4) u5Var).f3587h) {
            c2Var.zze = p5.k(u5Var);
        }
        g4.i(iterable, c2Var.zze);
    }

    public static void I(c2 c2Var) {
        c2Var.zze = g6.f3568k;
    }

    public static void J(c2 c2Var, Iterable iterable) {
        v5<l1> v5Var = c2Var.zzf;
        if (!v5Var.a()) {
            c2Var.zzf = p5.l(v5Var);
        }
        g4.i(iterable, c2Var.zzf);
    }

    public static void K(c2 c2Var, int i2) {
        v5<l1> v5Var = c2Var.zzf;
        if (!v5Var.a()) {
            c2Var.zzf = p5.l(v5Var);
        }
        c2Var.zzf.remove(i2);
    }

    public static void L(c2 c2Var, Iterable iterable) {
        v5<e2> v5Var = c2Var.zzg;
        if (!v5Var.a()) {
            c2Var.zzg = p5.l(v5Var);
        }
        g4.i(iterable, c2Var.zzg);
    }

    public static void M(c2 c2Var, int i2) {
        v5<e2> v5Var = c2Var.zzg;
        if (!v5Var.a()) {
            c2Var.zzg = p5.l(v5Var);
        }
        c2Var.zzg.remove(i2);
    }

    public final int A() {
        return this.zzg.size();
    }

    public final e2 B(int i2) {
        return this.zzg.get(i2);
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzh, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zza", "zze", "zzf", l1.class, "zzg", e2.class});
        } else if (i3 == 3) {
            return new c2();
        } else {
            if (i3 == 4) {
                return new b2((f1) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzh;
        }
    }

    public final List<Long> s() {
        return this.zza;
    }

    public final int t() {
        return ((g6) this.zza).size();
    }

    public final List<Long> u() {
        return this.zze;
    }

    public final int v() {
        return ((g6) this.zze).size();
    }

    public final List<l1> w() {
        return this.zzf;
    }

    public final int x() {
        return this.zzf.size();
    }

    public final l1 y(int i2) {
        return this.zzf.get(i2);
    }

    public final List<e2> z() {
        return this.zzg;
    }
}
