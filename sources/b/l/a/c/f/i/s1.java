package b.l.a.c.f.i;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.List;

public final class s1 extends p5<s1, r1> implements r6 {
    /* access modifiers changed from: private */
    public static final s1 zzk;
    private int zza;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    private v5<s1> zzj = y6.f3815k;

    static {
        s1 s1Var = new s1();
        zzk = s1Var;
        p5.q(s1.class, s1Var);
    }

    public static r1 E() {
        return (r1) zzk.m();
    }

    public static /* synthetic */ void G(s1 s1Var, String str) {
        str.getClass();
        s1Var.zza |= 1;
        s1Var.zze = str;
    }

    public static /* synthetic */ void H(s1 s1Var, String str) {
        str.getClass();
        s1Var.zza |= 2;
        s1Var.zzf = str;
    }

    public static /* synthetic */ void I(s1 s1Var) {
        s1Var.zza &= -3;
        s1Var.zzf = zzk.zzf;
    }

    public static /* synthetic */ void J(s1 s1Var, long j2) {
        s1Var.zza |= 4;
        s1Var.zzg = j2;
    }

    public static /* synthetic */ void K(s1 s1Var) {
        s1Var.zza &= -5;
        s1Var.zzg = 0;
    }

    public static /* synthetic */ void L(s1 s1Var, double d) {
        s1Var.zza |= 16;
        s1Var.zzi = d;
    }

    public static /* synthetic */ void M(s1 s1Var) {
        s1Var.zza &= -17;
        s1Var.zzi = ShadowDrawableWrapper.COS_45;
    }

    public static void N(s1 s1Var, s1 s1Var2) {
        v5<s1> v5Var = s1Var.zzj;
        if (!v5Var.a()) {
            s1Var.zzj = p5.l(v5Var);
        }
        s1Var.zzj.add(s1Var2);
    }

    public static void O(s1 s1Var, Iterable iterable) {
        v5<s1> v5Var = s1Var.zzj;
        if (!v5Var.a()) {
            s1Var.zzj = p5.l(v5Var);
        }
        g4.i(iterable, s1Var.zzj);
    }

    public static void P(s1 s1Var) {
        s1Var.zzj = y6.f3815k;
    }

    public final boolean A() {
        return (this.zza & 16) != 0;
    }

    public final double B() {
        return this.zzi;
    }

    public final List<s1> C() {
        return this.zzj;
    }

    public final int D() {
        return this.zzj.size();
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", s1.class});
        } else if (i3 == 3) {
            return new s1();
        } else {
            if (i3 == 4) {
                return new r1((f1) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzk;
        }
    }

    public final boolean s() {
        return (this.zza & 1) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zza & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zza & 4) != 0;
    }

    public final long x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zza & 8) != 0;
    }

    public final float z() {
        return this.zzh;
    }
}
