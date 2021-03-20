package b.l.a.c.f.e;

public final class j7 extends e<j7, i7> implements f0 {
    /* access modifiers changed from: private */
    public static final j7 zzf;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public um zze = um.f3344i;

    static {
        j7 j7Var = new j7();
        zzf = j7Var;
        e.r(j7.class, j7Var);
    }

    public static j7 u(um umVar, fn fnVar) {
        return (j7) e.e(zzf, umVar, fnVar);
    }

    public static i7 v() {
        return (i7) zzf.i();
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new j7();
        } else {
            if (i3 == 4) {
                return new i7((h7) null);
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
