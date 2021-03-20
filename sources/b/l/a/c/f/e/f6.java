package b.l.a.c.f.e;

public final class f6 extends e<f6, e6> implements f0 {
    /* access modifiers changed from: private */
    public static final f6 zzg;
    /* access modifiers changed from: private */
    public int zzb;
    private l6 zze;
    private w8 zzf;

    static {
        f6 f6Var = new f6();
        zzg = f6Var;
        e.r(f6.class, f6Var);
    }

    public static /* synthetic */ void A(f6 f6Var, w8 w8Var) {
        w8Var.getClass();
        f6Var.zzf = w8Var;
    }

    public static f6 v(um umVar, fn fnVar) {
        return (f6) e.e(zzg, umVar, fnVar);
    }

    public static e6 w() {
        return (e6) zzg.i();
    }

    public static /* synthetic */ void z(f6 f6Var, l6 l6Var) {
        l6Var.getClass();
        f6Var.zze = l6Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        } else if (i3 == 3) {
            return new f6();
        } else {
            if (i3 == 4) {
                return new e6((d6) null);
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

    public final l6 t() {
        l6 l6Var = this.zze;
        return l6Var == null ? l6.x() : l6Var;
    }

    public final w8 u() {
        w8 w8Var = this.zzf;
        return w8Var == null ? w8.x() : w8Var;
    }
}
