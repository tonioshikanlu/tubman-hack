package b.l.a.c.f.e;

public final class pa extends e<pa, oa> implements f0 {
    /* access modifiers changed from: private */
    public static final pa zzb;

    static {
        pa paVar = new pa();
        zzb = paVar;
        e.r(pa.class, paVar);
    }

    public static pa s(um umVar, fn fnVar) {
        return (pa) e.e(zzb, umVar, fnVar);
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
            return new pa();
        }
        if (i3 == 4) {
            return new oa();
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
