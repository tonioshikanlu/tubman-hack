package b.l.a.c.f.e;

public final class o7 extends e<o7, n7> implements f0 {
    /* access modifiers changed from: private */
    public static final o7 zzf;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public um zze = um.f3344i;

    static {
        o7 o7Var = new o7();
        zzf = o7Var;
        e.r(o7.class, o7Var);
    }

    public static o7 u(um umVar, fn fnVar) {
        return (o7) e.e(zzf, umVar, fnVar);
    }

    public static n7 v() {
        return (n7) zzf.i();
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new o7();
        } else {
            if (i3 == 4) {
                return new n7((m7) null);
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
