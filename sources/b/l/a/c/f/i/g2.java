package b.l.a.c.f.i;

import com.google.android.material.shadow.ShadowDrawableWrapper;

public final class g2 extends p5<g2, f2> implements r6 {
    /* access modifiers changed from: private */
    public static final g2 zzk;
    private int zza;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        g2 g2Var = new g2();
        zzk = g2Var;
        p5.q(g2.class, g2Var);
    }

    public static f2 B() {
        return (f2) zzk.m();
    }

    public static /* synthetic */ void D(g2 g2Var, long j2) {
        g2Var.zza |= 1;
        g2Var.zze = j2;
    }

    public static /* synthetic */ void E(g2 g2Var, String str) {
        str.getClass();
        g2Var.zza |= 2;
        g2Var.zzf = str;
    }

    public static /* synthetic */ void F(g2 g2Var, String str) {
        str.getClass();
        g2Var.zza |= 4;
        g2Var.zzg = str;
    }

    public static /* synthetic */ void G(g2 g2Var) {
        g2Var.zza &= -5;
        g2Var.zzg = zzk.zzg;
    }

    public static /* synthetic */ void H(g2 g2Var, long j2) {
        g2Var.zza |= 8;
        g2Var.zzh = j2;
    }

    public static /* synthetic */ void I(g2 g2Var) {
        g2Var.zza &= -9;
        g2Var.zzh = 0;
    }

    public static /* synthetic */ void J(g2 g2Var, double d) {
        g2Var.zza |= 32;
        g2Var.zzj = d;
    }

    public static /* synthetic */ void K(g2 g2Var) {
        g2Var.zza &= -33;
        g2Var.zzj = ShadowDrawableWrapper.COS_45;
    }

    public final double A() {
        return this.zzj;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i3 == 3) {
            return new g2();
        } else {
            if (i3 == 4) {
                return new f2((f1) null);
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

    public final long t() {
        return this.zze;
    }

    public final String u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zza & 4) != 0;
    }

    public final String w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zza & 8) != 0;
    }

    public final long y() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zza & 32) != 0;
    }
}
