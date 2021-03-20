package b.l.a.c.f.i;

import java.util.List;

public final class k0 extends p5<k0, j0> implements r6 {
    /* access modifiers changed from: private */
    public static final k0 zzm;
    private int zza;
    private int zze;
    private String zzf = "";
    private v5<m0> zzg = y6.f3815k;
    private boolean zzh;
    private r0 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        k0 k0Var = new k0();
        zzm = k0Var;
        p5.q(k0.class, k0Var);
    }

    public static j0 E() {
        return (j0) zzm.m();
    }

    public static /* synthetic */ void G(k0 k0Var, String str) {
        k0Var.zza |= 2;
        k0Var.zzf = str;
    }

    public static /* synthetic */ void H(k0 k0Var, int i2, m0 m0Var) {
        m0Var.getClass();
        v5<m0> v5Var = k0Var.zzg;
        if (!v5Var.a()) {
            k0Var.zzg = p5.l(v5Var);
        }
        k0Var.zzg.set(i2, m0Var);
    }

    public final boolean A() {
        return this.zzj;
    }

    public final boolean B() {
        return this.zzk;
    }

    public final boolean C() {
        return (this.zza & 64) != 0;
    }

    public final boolean D() {
        return this.zzl;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zza", "zze", "zzf", "zzg", m0.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i3 == 3) {
            return new k0();
        } else {
            if (i3 == 4) {
                return new j0((g0) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzm;
        }
    }

    public final boolean s() {
        return (this.zza & 1) != 0;
    }

    public final int t() {
        return this.zze;
    }

    public final String u() {
        return this.zzf;
    }

    public final List<m0> v() {
        return this.zzg;
    }

    public final int w() {
        return this.zzg.size();
    }

    public final m0 x(int i2) {
        return this.zzg.get(i2);
    }

    public final boolean y() {
        return (this.zza & 8) != 0;
    }

    public final r0 z() {
        r0 r0Var = this.zzi;
        return r0Var == null ? r0.C() : r0Var;
    }
}
