package b.l.a.c.f.e;

public final class i8 extends e<i8, h8> implements f0 {
    /* access modifiers changed from: private */
    public static final i8 zzg;
    /* access modifiers changed from: private */
    public int zzb;
    private l8 zze;
    /* access modifiers changed from: private */
    public um zzf = um.f3344i;

    static {
        i8 i8Var = new i8();
        zzg = i8Var;
        e.r(i8.class, i8Var);
    }

    public static i8 v(um umVar, fn fnVar) {
        return (i8) e.e(zzg, umVar, fnVar);
    }

    public static h8 w() {
        return (h8) zzg.i();
    }

    public static /* synthetic */ void z(i8 i8Var, l8 l8Var) {
        l8Var.getClass();
        i8Var.zze = l8Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        } else if (i3 == 3) {
            return new i8();
        } else {
            if (i3 == 4) {
                return new h8((g8) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final int s() {
        return this.zzb;
    }

    public final l8 t() {
        l8 l8Var = this.zze;
        return l8Var == null ? l8.y() : l8Var;
    }

    public final um u() {
        return this.zzf;
    }
}
