package b.l.a.c.f.e;

public final class u6 extends e<u6, t6> implements f0 {
    /* access modifiers changed from: private */
    public static final u6 zzg;
    /* access modifiers changed from: private */
    public int zzb;
    private a7 zze;
    /* access modifiers changed from: private */
    public um zzf = um.f3344i;

    static {
        u6 u6Var = new u6();
        zzg = u6Var;
        e.r(u6.class, u6Var);
    }

    public static u6 v(um umVar, fn fnVar) {
        return (u6) e.e(zzg, umVar, fnVar);
    }

    public static t6 w() {
        return (t6) zzg.i();
    }

    public static /* synthetic */ void z(u6 u6Var, a7 a7Var) {
        a7Var.getClass();
        u6Var.zze = a7Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        } else if (i3 == 3) {
            return new u6();
        } else {
            if (i3 == 4) {
                return new t6((s6) null);
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

    public final a7 t() {
        a7 a7Var = this.zze;
        return a7Var == null ? a7.u() : a7Var;
    }

    public final um u() {
        return this.zzf;
    }
}
