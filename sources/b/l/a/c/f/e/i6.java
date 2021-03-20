package b.l.a.c.f.e;

public final class i6 extends e<i6, h6> implements f0 {
    /* access modifiers changed from: private */
    public static final i6 zzf;
    private o6 zzb;
    private z8 zze;

    static {
        i6 i6Var = new i6();
        zzf = i6Var;
        e.r(i6.class, i6Var);
    }

    public static i6 u(um umVar, fn fnVar) {
        return (i6) e.e(zzf, umVar, fnVar);
    }

    public static h6 v() {
        return (h6) zzf.i();
    }

    public static /* synthetic */ void x(i6 i6Var, o6 o6Var) {
        o6Var.getClass();
        i6Var.zzb = o6Var;
    }

    public static /* synthetic */ void y(i6 i6Var, z8 z8Var) {
        z8Var.getClass();
        i6Var.zze = z8Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new i6();
        } else {
            if (i3 == 4) {
                return new h6((g6) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzf;
        }
    }

    public final o6 s() {
        o6 o6Var = this.zzb;
        return o6Var == null ? o6.w() : o6Var;
    }

    public final z8 t() {
        z8 z8Var = this.zze;
        return z8Var == null ? z8.w() : z8Var;
    }
}
