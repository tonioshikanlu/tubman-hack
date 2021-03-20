package b.l.a.c.f.e;

public final class r9 extends e<r9, q9> implements f0 {
    /* access modifiers changed from: private */
    public static final r9 zzh;
    private h9 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        r9 r9Var = new r9();
        zzh = r9Var;
        e.r(r9.class, r9Var);
    }

    public static q9 x() {
        return (q9) zzh.i();
    }

    public static /* synthetic */ void z(r9 r9Var, h9 h9Var) {
        h9Var.getClass();
        r9Var.zzb = h9Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        } else if (i3 == 3) {
            return new r9();
        } else {
            if (i3 == 4) {
                return new q9((o9) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzh;
        }
    }

    public final boolean s() {
        return this.zzb != null;
    }

    public final h9 t() {
        h9 h9Var = this.zzb;
        return h9Var == null ? h9.w() : h9Var;
    }

    public final i9 u() {
        int i2 = this.zze;
        i9 i9Var = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : i9.DESTROYED : i9.DISABLED : i9.ENABLED : i9.UNKNOWN_STATUS;
        return i9Var == null ? i9.UNRECOGNIZED : i9Var;
    }

    public final int v() {
        return this.zzf;
    }

    public final ia w() {
        ia d = ia.d(this.zzg);
        return d == null ? ia.UNRECOGNIZED : d;
    }
}
