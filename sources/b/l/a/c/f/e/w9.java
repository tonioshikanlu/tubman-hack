package b.l.a.c.f.e;

public final class w9 extends e<w9, v9> implements f0 {
    /* access modifiers changed from: private */
    public static final w9 zzh;
    private String zzb = "";
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        w9 w9Var = new w9();
        zzh = w9Var;
        e.r(w9.class, w9Var);
    }

    public static v9 t() {
        return (v9) zzh.i();
    }

    public static /* synthetic */ void v(w9 w9Var, String str) {
        str.getClass();
        w9Var.zzb = str;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        } else if (i3 == 3) {
            return new w9();
        } else {
            if (i3 == 4) {
                return new v9((t9) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzh;
        }
    }

    public final int s() {
        return this.zzf;
    }
}
