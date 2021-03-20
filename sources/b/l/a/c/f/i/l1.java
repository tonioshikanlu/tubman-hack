package b.l.a.c.f.i;

public final class l1 extends p5<l1, k1> implements r6 {
    /* access modifiers changed from: private */
    public static final l1 zzg;
    private int zza;
    private int zze;
    private long zzf;

    static {
        l1 l1Var = new l1();
        zzg = l1Var;
        p5.q(l1.class, l1Var);
    }

    public static k1 w() {
        return (k1) zzg.m();
    }

    public static /* synthetic */ void y(l1 l1Var, int i2) {
        l1Var.zza |= 1;
        l1Var.zze = i2;
    }

    public static /* synthetic */ void z(l1 l1Var, long j2) {
        l1Var.zza |= 2;
        l1Var.zzf = j2;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i3 == 3) {
            return new l1();
        } else {
            if (i3 == 4) {
                return new k1((f1) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final boolean s() {
        return (this.zza & 1) != 0;
    }

    public final int t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zza & 2) != 0;
    }

    public final long v() {
        return this.zzf;
    }
}
