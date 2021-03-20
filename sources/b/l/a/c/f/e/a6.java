package b.l.a.c.f.e;

public final class a6 extends e<a6, z5> implements f0 {
    /* access modifiers changed from: private */
    public static final a6 zzf;
    private int zzb;
    private c6 zze;

    static {
        a6 a6Var = new a6();
        zzf = a6Var;
        e.r(a6.class, a6Var);
    }

    public static a6 u(um umVar, fn fnVar) {
        return (a6) e.e(zzf, umVar, fnVar);
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new a6();
        } else {
            if (i3 == 4) {
                return new z5();
            }
            if (i3 != 5) {
                return null;
            }
            return zzf;
        }
    }

    public final int s() {
        return this.zzb;
    }

    public final c6 t() {
        c6 c6Var = this.zze;
        return c6Var == null ? c6.t() : c6Var;
    }
}
