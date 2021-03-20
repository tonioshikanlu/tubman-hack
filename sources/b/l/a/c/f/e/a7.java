package b.l.a.c.f.e;

public final class a7 extends e<a7, z6> implements f0 {
    /* access modifiers changed from: private */
    public static final a7 zze;
    /* access modifiers changed from: private */
    public int zzb;

    static {
        a7 a7Var = new a7();
        zze = a7Var;
        e.r(a7.class, a7Var);
    }

    public static z6 t() {
        return (z6) zze.i();
    }

    public static a7 u() {
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
            return new a7();
        } else {
            if (i3 == 4) {
                return new z6((y6) null);
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
