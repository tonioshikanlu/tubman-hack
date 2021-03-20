package b.l.a.c.f.e;

public final class r6 extends e<r6, q6> implements f0 {
    /* access modifiers changed from: private */
    public static final r6 zze;
    /* access modifiers changed from: private */
    public int zzb;

    static {
        r6 r6Var = new r6();
        zze = r6Var;
        e.r(r6.class, r6Var);
    }

    public static q6 t() {
        return (q6) zze.i();
    }

    public static r6 u() {
        return zze;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        } else if (i3 == 3) {
            return new r6();
        } else {
            if (i3 == 4) {
                return new q6((p6) null);
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
