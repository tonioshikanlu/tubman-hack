package b.l.a.c.f.i;

public final class a1 extends p5<a1, z0> implements r6 {
    /* access modifiers changed from: private */
    public static final a1 zzi;
    private int zza;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        a1 a1Var = new a1();
        zzi = a1Var;
        p5.q(a1.class, a1Var);
    }

    public static /* synthetic */ void y(a1 a1Var, String str) {
        str.getClass();
        a1Var.zza |= 1;
        a1Var.zze = str;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i3 == 3) {
            return new a1();
        } else {
            if (i3 == 4) {
                return new z0((y0) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzi;
        }
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zza & 8) != 0;
    }

    public final int w() {
        return this.zzh;
    }
}
