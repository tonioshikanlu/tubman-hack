package b.l.a.c.f.i;

import java.util.List;

public final class i0 extends p5<i0, h0> implements r6 {
    /* access modifiers changed from: private */
    public static final i0 zzj;
    private int zza;
    private int zze;
    private v5<t0> zzf;
    private v5<k0> zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        i0 i0Var = new i0();
        zzj = i0Var;
        p5.q(i0.class, i0Var);
    }

    public i0() {
        y6<Object> y6Var = y6.f3815k;
        this.zzf = y6Var;
        this.zzg = y6Var;
    }

    public static /* synthetic */ void B(i0 i0Var, int i2, t0 t0Var) {
        v5<t0> v5Var = i0Var.zzf;
        if (!v5Var.a()) {
            i0Var.zzf = p5.l(v5Var);
        }
        i0Var.zzf.set(i2, t0Var);
    }

    public static /* synthetic */ void C(i0 i0Var, int i2, k0 k0Var) {
        v5<k0> v5Var = i0Var.zzg;
        if (!v5Var.a()) {
            i0Var.zzg = p5.l(v5Var);
        }
        i0Var.zzg.set(i2, k0Var);
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zza", "zze", "zzf", t0.class, "zzg", k0.class, "zzh", "zzi"});
        } else if (i3 == 3) {
            return new i0();
        } else {
            if (i3 == 4) {
                return new h0((g0) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzj;
        }
    }

    public final boolean s() {
        return (this.zza & 1) != 0;
    }

    public final int t() {
        return this.zze;
    }

    public final List<t0> u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final t0 w(int i2) {
        return this.zzf.get(i2);
    }

    public final List<k0> x() {
        return this.zzg;
    }

    public final int y() {
        return this.zzg.size();
    }

    public final k0 z(int i2) {
        return this.zzg.get(i2);
    }
}
