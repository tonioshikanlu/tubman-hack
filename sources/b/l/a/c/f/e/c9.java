package b.l.a.c.f.e;

public final class c9 extends e<c9, b9> implements f0 {
    /* access modifiers changed from: private */
    public static final c9 zzf;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        c9 c9Var = new c9();
        zzf = c9Var;
        e.r(c9.class, c9Var);
    }

    public static b9 u() {
        return (b9) zzf.i();
    }

    public static c9 v() {
        return zzf;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new c9();
        } else {
            if (i3 == 4) {
                return new b9((a9) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzf;
        }
    }

    public final t8 s() {
        t8 d = t8.d(this.zzb);
        return d == null ? t8.UNRECOGNIZED : d;
    }

    public final int t() {
        return this.zze;
    }
}
