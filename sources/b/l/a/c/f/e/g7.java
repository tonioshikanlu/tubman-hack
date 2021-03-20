package b.l.a.c.f.e;

public final class g7 extends e<g7, f7> implements f0 {
    /* access modifiers changed from: private */
    public static final g7 zzf;
    /* access modifiers changed from: private */
    public int zzb;
    private int zze;

    static {
        g7 g7Var = new g7();
        zzf = g7Var;
        e.r(g7.class, g7Var);
    }

    public static g7 t(um umVar, fn fnVar) {
        return (g7) e.e(zzf, umVar, fnVar);
    }

    public static f7 u() {
        return (f7) zzf.i();
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new g7();
        } else {
            if (i3 == 4) {
                return new f7((e7) null);
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
}
