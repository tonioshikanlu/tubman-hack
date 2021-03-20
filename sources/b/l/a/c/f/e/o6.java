package b.l.a.c.f.e;

public final class o6 extends e<o6, n6> implements f0 {
    /* access modifiers changed from: private */
    public static final o6 zzf;
    private r6 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        o6 o6Var = new o6();
        zzf = o6Var;
        e.r(o6.class, o6Var);
    }

    public static o6 u(um umVar, fn fnVar) {
        return (o6) e.e(zzf, umVar, fnVar);
    }

    public static n6 v() {
        return (n6) zzf.i();
    }

    public static o6 w() {
        return zzf;
    }

    public static /* synthetic */ void y(o6 o6Var, r6 r6Var) {
        r6Var.getClass();
        o6Var.zzb = r6Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new o6();
        } else {
            if (i3 == 4) {
                return new n6((m6) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzf;
        }
    }

    public final r6 s() {
        r6 r6Var = this.zzb;
        return r6Var == null ? r6.u() : r6Var;
    }

    public final int t() {
        return this.zze;
    }
}
