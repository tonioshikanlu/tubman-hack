package b.l.a.c.f.e;

public final class z7 extends e<z7, y7> implements f0 {
    /* access modifiers changed from: private */
    public static final z7 zze;
    private l9 zzb;

    static {
        z7 z7Var = new z7();
        zze = z7Var;
        e.r(z7.class, z7Var);
    }

    public static y7 t() {
        return (y7) zze.i();
    }

    public static z7 u() {
        return zze;
    }

    public static /* synthetic */ void w(z7 z7Var, l9 l9Var) {
        l9Var.getClass();
        z7Var.zzb = l9Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zze, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzb"});
        } else if (i3 == 3) {
            return new z7();
        } else {
            if (i3 == 4) {
                return new y7((x7) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final l9 s() {
        l9 l9Var = this.zzb;
        return l9Var == null ? l9.w() : l9Var;
    }
}
