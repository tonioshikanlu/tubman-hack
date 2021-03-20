package b.l.a.c.f.e;

public final class l7 extends e<l7, k7> implements f0 {
    /* access modifiers changed from: private */
    public static final l7 zzf;
    private int zzb;
    private int zze;

    static {
        l7 l7Var = new l7();
        zzf = l7Var;
        e.r(l7.class, l7Var);
    }

    public static l7 t(um umVar, fn fnVar) {
        return (l7) e.e(zzf, umVar, fnVar);
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzb"});
        } else if (i3 == 3) {
            return new l7();
        } else {
            if (i3 == 4) {
                return new k7();
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
