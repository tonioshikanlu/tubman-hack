package b.l.a.c.f.e;

public final class q7 extends e<q7, p7> implements f0 {
    /* access modifiers changed from: private */
    public static final q7 zze;
    private int zzb;

    static {
        q7 q7Var = new q7();
        zze = q7Var;
        e.r(q7.class, q7Var);
    }

    public static q7 t(um umVar, fn fnVar) {
        return (q7) e.e(zze, umVar, fnVar);
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        } else if (i3 == 3) {
            return new q7();
        } else {
            if (i3 == 4) {
                return new p7();
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
