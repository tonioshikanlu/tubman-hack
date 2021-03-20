package b.l.a.c.f.e;

public final class l9 extends e<l9, k9> implements f0 {
    /* access modifiers changed from: private */
    public static final l9 zzg;
    private String zzb = "";
    /* access modifiers changed from: private */
    public um zze = um.f3344i;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        l9 l9Var = new l9();
        zzg = l9Var;
        e.r(l9.class, l9Var);
    }

    public static k9 v() {
        return (k9) zzg.i();
    }

    public static l9 w() {
        return zzg;
    }

    public static /* synthetic */ void y(l9 l9Var, String str) {
        str.getClass();
        l9Var.zzb = str;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        } else if (i3 == 3) {
            return new l9();
        } else {
            if (i3 == 4) {
                return new k9((j9) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final String s() {
        return this.zzb;
    }

    public final um t() {
        return this.zze;
    }

    public final ia u() {
        ia d = ia.d(this.zzf);
        return d == null ? ia.UNRECOGNIZED : d;
    }
}
