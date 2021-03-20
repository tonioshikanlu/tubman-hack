package b.l.a.c.f.e;

public final class c8 extends e<c8, b8> implements f0 {
    /* access modifiers changed from: private */
    public static final c8 zze;
    private f8 zzb;

    static {
        c8 c8Var = new c8();
        zze = c8Var;
        e.r(c8.class, c8Var);
    }

    public static c8 t(um umVar, fn fnVar) {
        return (c8) e.e(zze, umVar, fnVar);
    }

    public static b8 u() {
        return (b8) zze.i();
    }

    public static /* synthetic */ void w(c8 c8Var, f8 f8Var) {
        f8Var.getClass();
        c8Var.zzb = f8Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzb"});
        } else if (i3 == 3) {
            return new c8();
        } else {
            if (i3 == 4) {
                return new b8((a8) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final f8 s() {
        f8 f8Var = this.zzb;
        return f8Var == null ? f8.w() : f8Var;
    }
}
