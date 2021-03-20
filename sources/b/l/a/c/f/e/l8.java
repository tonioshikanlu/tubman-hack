package b.l.a.c.f.e;

public final class l8 extends e<l8, k8> implements f0 {
    /* access modifiers changed from: private */
    public static final l8 zzh;
    /* access modifiers changed from: private */
    public int zzb;
    private f8 zze;
    /* access modifiers changed from: private */
    public um zzf;
    /* access modifiers changed from: private */
    public um zzg;

    static {
        l8 l8Var = new l8();
        zzh = l8Var;
        e.r(l8.class, l8Var);
    }

    public l8() {
        um umVar = um.f3344i;
        this.zzf = umVar;
        this.zzg = umVar;
    }

    public static /* synthetic */ void B(l8 l8Var, f8 f8Var) {
        f8Var.getClass();
        l8Var.zze = f8Var;
    }

    public static l8 w(um umVar, fn fnVar) {
        return (l8) e.e(zzh, umVar, fnVar);
    }

    public static k8 x() {
        return (k8) zzh.i();
    }

    public static l8 y() {
        return zzh;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzb", "zze", "zzf", "zzg"});
        } else if (i3 == 3) {
            return new l8();
        } else {
            if (i3 == 4) {
                return new k8((j8) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzh;
        }
    }

    public final int s() {
        return this.zzb;
    }

    public final f8 t() {
        f8 f8Var = this.zze;
        return f8Var == null ? f8.w() : f8Var;
    }

    public final um u() {
        return this.zzf;
    }

    public final um v() {
        return this.zzg;
    }
}
