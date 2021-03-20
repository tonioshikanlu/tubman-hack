package b.l.a.c.f.e;

public final class c6 extends e<c6, b6> implements f0 {
    /* access modifiers changed from: private */
    public static final c6 zze;
    private int zzb;

    static {
        c6 c6Var = new c6();
        zze = c6Var;
        e.r(c6.class, c6Var);
    }

    public static c6 t() {
        return zze;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        } else if (i3 == 3) {
            return new c6();
        } else {
            if (i3 == 4) {
                return new b6();
            }
            if (i3 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final int s() {
        return this.zzb;
    }
}
