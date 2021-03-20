package b.l.a.c.f.e;

public final class w8 extends e<w8, v8> implements f0 {
    /* access modifiers changed from: private */
    public static final w8 zzg;
    /* access modifiers changed from: private */
    public int zzb;
    private c9 zze;
    /* access modifiers changed from: private */
    public um zzf = um.f3344i;

    static {
        w8 w8Var = new w8();
        zzg = w8Var;
        e.r(w8.class, w8Var);
    }

    public static /* synthetic */ void A(w8 w8Var, c9 c9Var) {
        c9Var.getClass();
        w8Var.zze = c9Var;
    }

    public static w8 v(um umVar, fn fnVar) {
        return (w8) e.e(zzg, umVar, fnVar);
    }

    public static v8 w() {
        return (v8) zzg.i();
    }

    public static w8 x() {
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
            return new w8();
        } else {
            if (i3 == 4) {
                return new v8((u8) null);
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

    public final c9 t() {
        c9 c9Var = this.zze;
        return c9Var == null ? c9.v() : c9Var;
    }

    public final um u() {
        return this.zzf;
    }
}
