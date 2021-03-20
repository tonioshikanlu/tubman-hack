package b.l.a.c.f.e;

public final class s8 extends e<s8, r8> implements f0 {
    /* access modifiers changed from: private */
    public static final s8 zzf;
    /* access modifiers changed from: private */
    public um zzb = um.f3344i;
    private x9 zze;

    static {
        s8 s8Var = new s8();
        zzf = s8Var;
        e.r(s8.class, s8Var);
    }

    public static s8 t(byte[] bArr, fn fnVar) {
        return (s8) e.f(zzf, bArr, fnVar);
    }

    public static r8 u() {
        return (r8) zzf.i();
    }

    public static /* synthetic */ void x(s8 s8Var, x9 x9Var) {
        x9Var.getClass();
        s8Var.zze = x9Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new s8();
        } else {
            if (i3 == 4) {
                return new r8((q8) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzf;
        }
    }

    public final um s() {
        return this.zzb;
    }
}
