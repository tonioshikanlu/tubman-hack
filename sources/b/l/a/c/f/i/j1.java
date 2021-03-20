package b.l.a.c.f.i;

public final class j1 extends p5<j1, i1> implements r6 {
    /* access modifiers changed from: private */
    public static final j1 zzi;
    private int zza;
    private int zze;
    private c2 zzf;
    private c2 zzg;
    private boolean zzh;

    static {
        j1 j1Var = new j1();
        zzi = j1Var;
        p5.q(j1.class, j1Var);
    }

    public static /* synthetic */ void B(j1 j1Var, int i2) {
        j1Var.zza |= 1;
        j1Var.zze = i2;
    }

    public static /* synthetic */ void C(j1 j1Var, c2 c2Var) {
        j1Var.zzf = c2Var;
        j1Var.zza |= 2;
    }

    public static /* synthetic */ void D(j1 j1Var, c2 c2Var) {
        j1Var.zzg = c2Var;
        j1Var.zza |= 4;
    }

    public static /* synthetic */ void E(j1 j1Var, boolean z) {
        j1Var.zza |= 8;
        j1Var.zzh = z;
    }

    public static i1 z() {
        return (i1) zzi.m();
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i3 == 3) {
            return new j1();
        } else {
            if (i3 == 4) {
                return new i1((f1) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzi;
        }
    }

    public final boolean s() {
        return (this.zza & 1) != 0;
    }

    public final int t() {
        return this.zze;
    }

    public final c2 u() {
        c2 c2Var = this.zzf;
        return c2Var == null ? c2.D() : c2Var;
    }

    public final boolean v() {
        return (this.zza & 4) != 0;
    }

    public final c2 w() {
        c2 c2Var = this.zzg;
        return c2Var == null ? c2.D() : c2Var;
    }

    public final boolean x() {
        return (this.zza & 8) != 0;
    }

    public final boolean y() {
        return this.zzh;
    }
}
