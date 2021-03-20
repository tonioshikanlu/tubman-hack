package b.l.a.c.f.e;

public final class ca extends e<ca, ba> implements f0 {
    /* access modifiers changed from: private */
    public static final ca zze;
    private String zzb = "";

    static {
        ca caVar = new ca();
        zze = caVar;
        e.r(ca.class, caVar);
    }

    public static ca t(um umVar, fn fnVar) {
        return (ca) e.e(zze, umVar, fnVar);
    }

    public static ca u() {
        return zze;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzb"});
        } else if (i3 == 3) {
            return new ca();
        } else {
            if (i3 == 4) {
                return new ba();
            }
            if (i3 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final String s() {
        return this.zzb;
    }
}
