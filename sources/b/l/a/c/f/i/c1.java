package b.l.a.c.f.i;

import java.util.List;

public final class c1 extends p5<c1, b1> implements r6 {
    /* access modifiers changed from: private */
    public static final c1 zzn;
    private int zza;
    private long zze;
    private String zzf = "";
    private int zzg;
    private v5<e1> zzh;
    private v5<a1> zzi;
    private v5<i0> zzj;
    private String zzk;
    private boolean zzl;
    private v5<n2> zzm;

    static {
        c1 c1Var = new c1();
        zzn = c1Var;
        p5.q(c1.class, c1Var);
    }

    public c1() {
        y6<Object> y6Var = y6.f3815k;
        this.zzh = y6Var;
        this.zzi = y6Var;
        this.zzj = y6Var;
        this.zzk = "";
        this.zzm = y6Var;
    }

    public static b1 B() {
        return (b1) zzn.m();
    }

    public static c1 C() {
        return zzn;
    }

    public static /* synthetic */ void E(c1 c1Var, int i2, a1 a1Var) {
        v5<a1> v5Var = c1Var.zzi;
        if (!v5Var.a()) {
            c1Var.zzi = p5.l(v5Var);
        }
        c1Var.zzi.set(i2, a1Var);
    }

    public static void F(c1 c1Var) {
        c1Var.zzj = y6.f3815k;
    }

    public final boolean A() {
        return this.zzl;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", e1.class, "zzi", a1.class, "zzj", i0.class, "zzk", "zzl", "zzm", n2.class});
        } else if (i3 == 3) {
            return new c1();
        } else {
            if (i3 == 4) {
                return new b1((y0) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzn;
        }
    }

    public final boolean s() {
        return (this.zza & 1) != 0;
    }

    public final long t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zza & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final List<e1> w() {
        return this.zzh;
    }

    public final int x() {
        return this.zzi.size();
    }

    public final a1 y(int i2) {
        return this.zzi.get(i2);
    }

    public final List<i0> z() {
        return this.zzj;
    }
}
