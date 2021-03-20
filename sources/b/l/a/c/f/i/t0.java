package b.l.a.c.f.i;

public final class t0 extends p5<t0, s0> implements r6 {
    /* access modifiers changed from: private */
    public static final t0 zzk;
    private int zza;
    private int zze;
    private String zzf = "";
    private m0 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        t0 t0Var = new t0();
        zzk = t0Var;
        p5.q(t0.class, t0Var);
    }

    public static s0 A() {
        return (s0) zzk.m();
    }

    public static /* synthetic */ void C(t0 t0Var, String str) {
        t0Var.zza |= 2;
        t0Var.zzf = str;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i3 == 3) {
            return new t0();
        } else {
            if (i3 == 4) {
                return new s0((g0) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzk;
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

    public final m0 v() {
        m0 m0Var = this.zzg;
        return m0Var == null ? m0.A() : m0Var;
    }

    public final boolean w() {
        return this.zzh;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return (this.zza & 32) != 0;
    }

    public final boolean z() {
        return this.zzj;
    }
}
