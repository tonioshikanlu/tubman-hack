package b.l.a.c.f.i;

public final class m0 extends p5<m0, l0> implements r6 {
    /* access modifiers changed from: private */
    public static final m0 zzi;
    private int zza;
    private x0 zze;
    private r0 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        m0 m0Var = new m0();
        zzi = m0Var;
        p5.q(m0.class, m0Var);
    }

    public static m0 A() {
        return zzi;
    }

    public static /* synthetic */ void C(m0 m0Var, String str) {
        m0Var.zza |= 8;
        m0Var.zzh = str;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i3 == 3) {
            return new m0();
        } else {
            if (i3 == 4) {
                return new l0((g0) null);
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

    public final x0 t() {
        x0 x0Var = this.zze;
        return x0Var == null ? x0.A() : x0Var;
    }

    public final boolean u() {
        return (this.zza & 2) != 0;
    }

    public final r0 v() {
        r0 r0Var = this.zzf;
        return r0Var == null ? r0.C() : r0Var;
    }

    public final boolean w() {
        return (this.zza & 4) != 0;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zza & 8) != 0;
    }

    public final String z() {
        return this.zzh;
    }
}
