package b.l.a.c.f.e;

public final class ha extends e<ha, ga> implements f0 {
    /* access modifiers changed from: private */
    public static final ha zzf;
    private String zzb = "";
    private l9 zze;

    static {
        ha haVar = new ha();
        zzf = haVar;
        e.r(ha.class, haVar);
    }

    public static ha u(um umVar, fn fnVar) {
        return (ha) e.e(zzf, umVar, fnVar);
    }

    public static ha v() {
        return zzf;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new ha();
        } else {
            if (i3 == 4) {
                return new ga();
            }
            if (i3 != 5) {
                return null;
            }
            return zzf;
        }
    }

    public final String s() {
        return this.zzb;
    }

    public final l9 t() {
        l9 l9Var = this.zze;
        return l9Var == null ? l9.w() : l9Var;
    }
}
