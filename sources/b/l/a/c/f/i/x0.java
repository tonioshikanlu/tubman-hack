package b.l.a.c.f.i;

import java.util.List;

public final class x0 extends p5<x0, u0> implements r6 {
    /* access modifiers changed from: private */
    public static final x0 zzi;
    private int zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private v5<String> zzh = y6.f3815k;

    static {
        x0 x0Var = new x0();
        zzi = x0Var;
        p5.q(x0.class, x0Var);
    }

    public static x0 A() {
        return zzi;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zza", "zze", v0.a, "zzf", "zzg", "zzh"});
        } else if (i3 == 3) {
            return new x0();
        } else {
            if (i3 == 4) {
                return new u0();
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

    public final w0 t() {
        w0 d = w0.d(this.zze);
        return d == null ? w0.UNKNOWN_MATCH_TYPE : d;
    }

    public final boolean u() {
        return (this.zza & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zza & 4) != 0;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final List<String> y() {
        return this.zzh;
    }

    public final int z() {
        return this.zzh.size();
    }
}
