package b.l.a.c.f.e;

public final class v7 extends e<v7, u7> implements f0 {
    /* access modifiers changed from: private */
    public static final v7 zzb;

    static {
        v7 v7Var = new v7();
        zzb = v7Var;
        e.r(v7.class, v7Var);
    }

    public static v7 s(um umVar, fn fnVar) {
        return (v7) e.e(zzb, umVar, fnVar);
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzb, "\u0000\u0000", (Object[]) null);
        }
        if (i3 == 3) {
            return new v7();
        }
        if (i3 == 4) {
            return new u7();
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
