package b.l.a.c.f.i;

import java.util.List;

public final class o1 extends p5<o1, n1> implements r6 {
    /* access modifiers changed from: private */
    public static final o1 zzj;
    private int zza;
    private v5<s1> zze = y6.f3815k;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        o1 o1Var = new o1();
        zzj = o1Var;
        p5.q(o1.class, o1Var);
    }

    public static n1 C() {
        return (n1) zzj.m();
    }

    public static /* synthetic */ void E(o1 o1Var, int i2, s1 s1Var) {
        s1Var.getClass();
        o1Var.M();
        o1Var.zze.set(i2, s1Var);
    }

    public static /* synthetic */ void F(o1 o1Var, s1 s1Var) {
        s1Var.getClass();
        o1Var.M();
        o1Var.zze.add(s1Var);
    }

    public static /* synthetic */ void G(o1 o1Var, Iterable iterable) {
        o1Var.M();
        g4.i(iterable, o1Var.zze);
    }

    public static void H(o1 o1Var) {
        o1Var.zze = y6.f3815k;
    }

    public static /* synthetic */ void I(o1 o1Var, int i2) {
        o1Var.M();
        o1Var.zze.remove(i2);
    }

    public static /* synthetic */ void J(o1 o1Var, String str) {
        str.getClass();
        o1Var.zza |= 1;
        o1Var.zzf = str;
    }

    public static /* synthetic */ void K(o1 o1Var, long j2) {
        o1Var.zza |= 2;
        o1Var.zzg = j2;
    }

    public static /* synthetic */ void L(o1 o1Var, long j2) {
        o1Var.zza |= 4;
        o1Var.zzh = j2;
    }

    public final boolean A() {
        return (this.zza & 8) != 0;
    }

    public final int B() {
        return this.zzi;
    }

    public final void M() {
        v5<s1> v5Var = this.zze;
        if (!v5Var.a()) {
            this.zze = p5.l(v5Var);
        }
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zza", "zze", s1.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i3 == 3) {
            return new o1();
        } else {
            if (i3 == 4) {
                return new n1((f1) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzj;
        }
    }

    public final List<s1> s() {
        return this.zze;
    }

    public final int t() {
        return this.zze.size();
    }

    public final s1 u(int i2) {
        return this.zze.get(i2);
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zza & 2) != 0;
    }

    public final long x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zza & 4) != 0;
    }

    public final long z() {
        return this.zzh;
    }
}
