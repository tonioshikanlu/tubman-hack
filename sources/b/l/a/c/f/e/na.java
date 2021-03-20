package b.l.a.c.f.e;

public final class na extends e<na, ma> implements f0 {
    /* access modifiers changed from: private */
    public static final na zzf;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public um zze = um.f3344i;

    static {
        na naVar = new na();
        zzf = naVar;
        e.r(na.class, naVar);
    }

    public static na u(um umVar, fn fnVar) {
        return (na) e.e(zzf, umVar, fnVar);
    }

    public static ma v() {
        return (ma) zzf.i();
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new na();
        } else {
            if (i3 == 4) {
                return new ma((la) null);
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

    public final um t() {
        return this.zze;
    }
}
