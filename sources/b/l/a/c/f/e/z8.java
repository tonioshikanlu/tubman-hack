package b.l.a.c.f.e;

public final class z8 extends e<z8, y8> implements f0 {
    /* access modifiers changed from: private */
    public static final z8 zzg;
    private c9 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        z8 z8Var = new z8();
        zzg = z8Var;
        e.r(z8.class, z8Var);
    }

    public static z8 u(um umVar, fn fnVar) {
        return (z8) e.e(zzg, umVar, fnVar);
    }

    public static y8 v() {
        return (y8) zzg.i();
    }

    public static z8 w() {
        return zzg;
    }

    public static /* synthetic */ void y(z8 z8Var, c9 c9Var) {
        c9Var.getClass();
        z8Var.zzb = c9Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze", "zzf"});
        } else if (i3 == 3) {
            return new z8();
        } else {
            if (i3 == 4) {
                return new y8((x8) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final c9 s() {
        c9 c9Var = this.zzb;
        return c9Var == null ? c9.v() : c9Var;
    }

    public final int t() {
        return this.zze;
    }
}
