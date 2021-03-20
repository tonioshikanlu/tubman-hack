package b.l.a.c.f.i;

public final class r0 extends p5<r0, n0> implements r6 {
    /* access modifiers changed from: private */
    public static final r0 zzj;
    private int zza;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        r0 r0Var = new r0();
        zzj = r0Var;
        p5.q(r0.class, r0Var);
    }

    public static r0 C() {
        return zzj;
    }

    public final boolean A() {
        return (this.zza & 16) != 0;
    }

    public final String B() {
        return this.zzi;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zza", "zze", p0.a, "zzf", "zzg", "zzh", "zzi"});
        } else if (i3 == 3) {
            return new r0();
        } else {
            if (i3 == 4) {
                return new n0();
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

    public final q0 t() {
        q0 d = q0.d(this.zze);
        return d == null ? q0.UNKNOWN_COMPARISON_TYPE : d;
    }

    public final boolean u() {
        return (this.zza & 2) != 0;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zza & 4) != 0;
    }

    public final String x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zza & 8) != 0;
    }

    public final String z() {
        return this.zzh;
    }
}
