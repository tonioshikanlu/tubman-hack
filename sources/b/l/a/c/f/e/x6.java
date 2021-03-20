package b.l.a.c.f.e;

public final class x6 extends e<x6, w6> implements f0 {
    /* access modifiers changed from: private */
    public static final x6 zzf;
    private a7 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        x6 x6Var = new x6();
        zzf = x6Var;
        e.r(x6.class, x6Var);
    }

    public static x6 u(um umVar, fn fnVar) {
        return (x6) e.e(zzf, umVar, fnVar);
    }

    public static w6 v() {
        return (w6) zzf.i();
    }

    public static /* synthetic */ void x(x6 x6Var, a7 a7Var) {
        a7Var.getClass();
        x6Var.zzb = a7Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new x6();
        } else {
            if (i3 == 4) {
                return new w6((v6) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzf;
        }
    }

    public final a7 s() {
        a7 a7Var = this.zzb;
        return a7Var == null ? a7.u() : a7Var;
    }

    public final int t() {
        return this.zze;
    }
}
