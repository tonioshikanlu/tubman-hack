package b.l.a.c.f.e;

public final class y5 extends e<y5, x5> implements f0 {
    /* access modifiers changed from: private */
    public static final y5 zzg;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public um zze = um.f3344i;
    private c6 zzf;

    static {
        y5 y5Var = new y5();
        zzg = y5Var;
        e.r(y5.class, y5Var);
    }

    public static /* synthetic */ void A(y5 y5Var, c6 c6Var) {
        c6Var.getClass();
        y5Var.zzf = c6Var;
    }

    public static y5 v(um umVar, fn fnVar) {
        return (y5) e.e(zzg, umVar, fnVar);
    }

    public static x5 w() {
        return (x5) zzg.i();
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        } else if (i3 == 3) {
            return new y5();
        } else {
            if (i3 == 4) {
                return new x5((w5) null);
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

    public final um t() {
        return this.zze;
    }

    public final c6 u() {
        c6 c6Var = this.zzf;
        return c6Var == null ? c6.t() : c6Var;
    }
}
