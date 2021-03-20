package b.l.a.c.f.e;

public final class x9 extends e<x9, u9> implements f0 {
    /* access modifiers changed from: private */
    public static final x9 zzf;
    /* access modifiers changed from: private */
    public int zzb;
    private i<w9> zze = m0.f3159k;

    static {
        x9 x9Var = new x9();
        zzf = x9Var;
        e.r(x9.class, x9Var);
    }

    public static u9 t() {
        return (u9) zzf.i();
    }

    public static void w(x9 x9Var, w9 w9Var) {
        w9Var.getClass();
        i<w9> iVar = x9Var.zze;
        if (!iVar.a()) {
            int size = iVar.size();
            x9Var.zze = iVar.h(size == 0 ? 10 : size + size);
        }
        x9Var.zze.add(w9Var);
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", w9.class});
        } else if (i3 == 3) {
            return new x9();
        } else {
            if (i3 == 4) {
                return new u9((t9) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzf;
        }
    }

    public final w9 s() {
        return this.zze.get(0);
    }
}
