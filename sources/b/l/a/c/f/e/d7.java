package b.l.a.c.f.e;

public final class d7 extends e<d7, c7> implements f0 {
    /* access modifiers changed from: private */
    public static final d7 zzf;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public um zze = um.f3344i;

    static {
        d7 d7Var = new d7();
        zzf = d7Var;
        e.r(d7.class, d7Var);
    }

    public static d7 u(um umVar, fn fnVar) {
        return (d7) e.e(zzf, umVar, fnVar);
    }

    public static c7 v() {
        return (c7) zzf.i();
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new d7();
        } else {
            if (i3 == 4) {
                return new c7((b7) null);
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
