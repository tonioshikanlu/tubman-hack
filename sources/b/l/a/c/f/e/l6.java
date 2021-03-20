package b.l.a.c.f.e;

public final class l6 extends e<l6, k6> implements f0 {
    /* access modifiers changed from: private */
    public static final l6 zzg;
    /* access modifiers changed from: private */
    public int zzb;
    private r6 zze;
    /* access modifiers changed from: private */
    public um zzf = um.f3344i;

    static {
        l6 l6Var = new l6();
        zzg = l6Var;
        e.r(l6.class, l6Var);
    }

    public static /* synthetic */ void A(l6 l6Var, r6 r6Var) {
        r6Var.getClass();
        l6Var.zze = r6Var;
    }

    public static l6 v(um umVar, fn fnVar) {
        return (l6) e.e(zzg, umVar, fnVar);
    }

    public static k6 w() {
        return (k6) zzg.i();
    }

    public static l6 x() {
        return zzg;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        } else if (i3 == 3) {
            return new l6();
        } else {
            if (i3 == 4) {
                return new k6((j6) null);
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

    public final r6 t() {
        r6 r6Var = this.zze;
        return r6Var == null ? r6.u() : r6Var;
    }

    public final um u() {
        return this.zzf;
    }
}
