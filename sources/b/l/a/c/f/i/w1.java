package b.l.a.c.f.i;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import com.amplitude.api.DeviceInfo;
import java.util.List;

public final class w1 extends p5<w1, v1> implements r6 {
    /* access modifiers changed from: private */
    public static final w1 zzZ;
    public static final /* synthetic */ int zza = 0;
    private String zzA = "";
    private long zzB;
    private int zzC;
    private String zzD = "";
    private String zzE = "";
    private boolean zzF;
    private v5<j1> zzG;
    private String zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL;
    private long zzM;
    private long zzN;
    private String zzO;
    private String zzP;
    private int zzQ;
    private String zzR;
    private a2 zzS;
    private t5 zzT;
    private long zzU;
    private long zzV;
    private String zzW;
    private String zzX;
    private int zzY;
    private int zze;
    private int zzf;
    private int zzg;
    private v5<o1> zzh;
    private v5<g2> zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        w1 w1Var = new w1();
        zzZ = w1Var;
        p5.q(w1.class, w1Var);
    }

    public w1() {
        y6<Object> y6Var = y6.f3815k;
        this.zzh = y6Var;
        this.zzi = y6Var;
        this.zzG = y6Var;
        this.zzH = "";
        this.zzL = "";
        this.zzO = "";
        this.zzP = "";
        this.zzR = "";
        this.zzT = q5.f3702k;
        this.zzW = "";
        this.zzX = "";
    }

    public static v1 C0() {
        return (v1) zzZ.m();
    }

    public static /* synthetic */ void E0(w1 w1Var) {
        w1Var.zze |= 1;
        w1Var.zzg = 1;
    }

    public static /* synthetic */ void F0(w1 w1Var, int i2, o1 o1Var) {
        w1Var.T0();
        w1Var.zzh.set(i2, o1Var);
    }

    public static /* synthetic */ void G0(w1 w1Var, o1 o1Var) {
        w1Var.T0();
        w1Var.zzh.add(o1Var);
    }

    public static /* synthetic */ void H0(w1 w1Var, Iterable iterable) {
        w1Var.T0();
        g4.i(iterable, w1Var.zzh);
    }

    public static void I0(w1 w1Var) {
        w1Var.zzh = y6.f3815k;
    }

    public static /* synthetic */ void J0(w1 w1Var, int i2) {
        w1Var.T0();
        w1Var.zzh.remove(i2);
    }

    public static /* synthetic */ void K0(w1 w1Var, int i2, g2 g2Var) {
        g2Var.getClass();
        w1Var.U0();
        w1Var.zzi.set(i2, g2Var);
    }

    public static /* synthetic */ void L0(w1 w1Var, g2 g2Var) {
        g2Var.getClass();
        w1Var.U0();
        w1Var.zzi.add(g2Var);
    }

    public static /* synthetic */ void M0(w1 w1Var, int i2) {
        w1Var.U0();
        w1Var.zzi.remove(i2);
    }

    public static /* synthetic */ void N0(w1 w1Var, long j2) {
        w1Var.zze |= 2;
        w1Var.zzj = j2;
    }

    public static /* synthetic */ void O0(w1 w1Var, long j2) {
        w1Var.zze |= 4;
        w1Var.zzk = j2;
    }

    public static /* synthetic */ void P0(w1 w1Var, long j2) {
        w1Var.zze |= 8;
        w1Var.zzl = j2;
    }

    public static /* synthetic */ void Q0(w1 w1Var, long j2) {
        w1Var.zze |= 16;
        w1Var.zzm = j2;
    }

    public static /* synthetic */ void R0(w1 w1Var) {
        w1Var.zze &= -17;
        w1Var.zzm = 0;
    }

    public static /* synthetic */ void T(w1 w1Var, long j2) {
        w1Var.zze |= 32;
        w1Var.zzn = j2;
    }

    public static /* synthetic */ void U(w1 w1Var) {
        w1Var.zze &= -33;
        w1Var.zzn = 0;
    }

    public static /* synthetic */ void V(w1 w1Var) {
        w1Var.zze |= 64;
        w1Var.zzo = DeviceInfo.OS_NAME;
    }

    public static /* synthetic */ void V0(w1 w1Var, String str) {
        str.getClass();
        w1Var.zze |= 16777216;
        w1Var.zzH = str;
    }

    public static /* synthetic */ void W(w1 w1Var, String str) {
        str.getClass();
        w1Var.zze |= 128;
        w1Var.zzp = str;
    }

    public static /* synthetic */ void W0(w1 w1Var, int i2) {
        w1Var.zze |= 33554432;
        w1Var.zzI = i2;
    }

    public static /* synthetic */ void X(w1 w1Var, String str) {
        str.getClass();
        w1Var.zze |= 256;
        w1Var.zzq = str;
    }

    public static /* synthetic */ void X0(w1 w1Var) {
        w1Var.zze &= -268435457;
        w1Var.zzL = zzZ.zzL;
    }

    public static /* synthetic */ void Y(w1 w1Var, String str) {
        str.getClass();
        w1Var.zze |= 512;
        w1Var.zzr = str;
    }

    public static /* synthetic */ void Y0(w1 w1Var, long j2) {
        w1Var.zze |= 536870912;
        w1Var.zzM = j2;
    }

    public static /* synthetic */ void Z(w1 w1Var, int i2) {
        w1Var.zze |= 1024;
        w1Var.zzs = i2;
    }

    public static /* synthetic */ void Z0(w1 w1Var, long j2) {
        w1Var.zze |= BasicMeasure.EXACTLY;
        w1Var.zzN = j2;
    }

    public static /* synthetic */ void a0(w1 w1Var, String str) {
        str.getClass();
        w1Var.zze |= 2048;
        w1Var.zzt = str;
    }

    public static /* synthetic */ void a1(w1 w1Var) {
        w1Var.zze &= ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        w1Var.zzO = zzZ.zzO;
    }

    public static /* synthetic */ void b0(w1 w1Var, String str) {
        str.getClass();
        w1Var.zze |= 4096;
        w1Var.zzu = str;
    }

    public static /* synthetic */ void b1(w1 w1Var, int i2) {
        w1Var.zzf |= 2;
        w1Var.zzQ = i2;
    }

    public static /* synthetic */ void c0(w1 w1Var, String str) {
        str.getClass();
        w1Var.zze |= 8192;
        w1Var.zzv = str;
    }

    public static /* synthetic */ void c1(w1 w1Var, String str) {
        str.getClass();
        w1Var.zzf |= 4;
        w1Var.zzR = str;
    }

    public static /* synthetic */ void d0(w1 w1Var, long j2) {
        w1Var.zze |= 16384;
        w1Var.zzw = j2;
    }

    public static void d1(w1 w1Var, Iterable iterable) {
        t5 t5Var = w1Var.zzT;
        if (!((h4) t5Var).f3587h) {
            q5 q5Var = (q5) t5Var;
            int i2 = q5Var.f3704j;
            w1Var.zzT = q5Var.h(i2 == 0 ? 10 : i2 + i2);
        }
        g4.i(iterable, w1Var.zzT);
    }

    public static /* synthetic */ void e0(w1 w1Var) {
        w1Var.zze |= 32768;
        w1Var.zzx = 39000;
    }

    public static /* synthetic */ void e1(w1 w1Var, long j2) {
        w1Var.zzf |= 16;
        w1Var.zzU = j2;
    }

    public static /* synthetic */ void f0(w1 w1Var, String str) {
        str.getClass();
        w1Var.zze |= 65536;
        w1Var.zzy = str;
    }

    public static /* synthetic */ void f1(w1 w1Var, long j2) {
        w1Var.zzf |= 32;
        w1Var.zzV = j2;
    }

    public static /* synthetic */ void g0(w1 w1Var) {
        w1Var.zze &= -65537;
        w1Var.zzy = zzZ.zzy;
    }

    public static /* synthetic */ void g1(w1 w1Var, String str) {
        str.getClass();
        w1Var.zzf |= 64;
        w1Var.zzW = str;
    }

    public static /* synthetic */ void h0(w1 w1Var, boolean z) {
        w1Var.zze |= 131072;
        w1Var.zzz = z;
    }

    public static /* synthetic */ void h1(w1 w1Var, String str) {
        str.getClass();
        w1Var.zzf |= 128;
        w1Var.zzX = str;
    }

    public static /* synthetic */ void i0(w1 w1Var) {
        w1Var.zze &= -131073;
        w1Var.zzz = false;
    }

    public static /* synthetic */ void j0(w1 w1Var, String str) {
        str.getClass();
        w1Var.zze |= 262144;
        w1Var.zzA = str;
    }

    public static /* synthetic */ void k0(w1 w1Var) {
        w1Var.zze &= -262145;
        w1Var.zzA = zzZ.zzA;
    }

    public static /* synthetic */ void l0(w1 w1Var, long j2) {
        w1Var.zze |= 524288;
        w1Var.zzB = j2;
    }

    public static /* synthetic */ void m0(w1 w1Var, int i2) {
        w1Var.zze |= 1048576;
        w1Var.zzC = i2;
    }

    public static /* synthetic */ void n0(w1 w1Var, String str) {
        w1Var.zze |= 2097152;
        w1Var.zzD = str;
    }

    public static /* synthetic */ void o0(w1 w1Var) {
        w1Var.zze &= -2097153;
        w1Var.zzD = zzZ.zzD;
    }

    public static /* synthetic */ void p0(w1 w1Var, String str) {
        str.getClass();
        w1Var.zze |= 4194304;
        w1Var.zzE = str;
    }

    public static /* synthetic */ void q0(w1 w1Var, boolean z) {
        w1Var.zze |= 8388608;
        w1Var.zzF = z;
    }

    public static /* synthetic */ void r0(w1 w1Var, Iterable iterable) {
        v5<j1> v5Var = w1Var.zzG;
        if (!v5Var.a()) {
            w1Var.zzG = p5.l(v5Var);
        }
        g4.i(iterable, w1Var.zzG);
    }

    public static void s0(w1 w1Var) {
        w1Var.zzG = y6.f3815k;
    }

    public final boolean A() {
        return this.zzz;
    }

    public final boolean A0() {
        return (this.zzf & 128) != 0;
    }

    public final String A1() {
        return this.zzq;
    }

    public final String B() {
        return this.zzA;
    }

    public final String B0() {
        return this.zzX;
    }

    public final String B1() {
        return this.zzr;
    }

    public final boolean C() {
        return (this.zze & 524288) != 0;
    }

    public final boolean C1() {
        return (this.zze & 1024) != 0;
    }

    public final long D() {
        return this.zzB;
    }

    public final int D1() {
        return this.zzs;
    }

    public final boolean E() {
        return (this.zze & 1048576) != 0;
    }

    public final String E1() {
        return this.zzt;
    }

    public final int F() {
        return this.zzC;
    }

    public final String G() {
        return this.zzD;
    }

    public final String H() {
        return this.zzE;
    }

    public final boolean I() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean J() {
        return this.zzF;
    }

    public final List<j1> K() {
        return this.zzG;
    }

    public final String L() {
        return this.zzH;
    }

    public final boolean M() {
        return (this.zze & 33554432) != 0;
    }

    public final int N() {
        return this.zzI;
    }

    public final boolean O() {
        return (this.zze & 536870912) != 0;
    }

    public final long P() {
        return this.zzM;
    }

    public final boolean Q() {
        return (this.zze & BasicMeasure.EXACTLY) != 0;
    }

    public final long R() {
        return this.zzN;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final int S0() {
        return this.zzg;
    }

    public final void T0() {
        v5<o1> v5Var = this.zzh;
        if (!v5Var.a()) {
            this.zzh = p5.l(v5Var);
        }
    }

    public final void U0() {
        v5<g2> v5Var = this.zzi;
        if (!v5Var.a()) {
            this.zzi = p5.l(v5Var);
        }
    }

    public final List<o1> i1() {
        return this.zzh;
    }

    public final int j1() {
        return this.zzh.size();
    }

    public final o1 k1(int i2) {
        return this.zzh.get(i2);
    }

    public final List<g2> l1() {
        return this.zzi;
    }

    public final int m1() {
        return this.zzi.size();
    }

    public final g2 n1(int i2) {
        return this.zzi.get(i2);
    }

    public final boolean o1() {
        return (this.zze & 2) != 0;
    }

    public final long p1() {
        return this.zzj;
    }

    public final boolean q1() {
        return (this.zze & 4) != 0;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzZ, "\u0001-\u0000\u0002\u00015-\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(", new Object[]{"zze", "zzf", "zzg", "zzh", o1.class, "zzi", g2.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", j1.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", g1.a});
        } else if (i3 == 3) {
            return new w1();
        } else {
            if (i3 == 4) {
                return new v1((f1) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzZ;
        }
    }

    public final long r1() {
        return this.zzk;
    }

    public final String s() {
        return this.zzu;
    }

    public final boolean s1() {
        return (this.zze & 8) != 0;
    }

    public final String t() {
        return this.zzv;
    }

    public final String t0() {
        return this.zzO;
    }

    public final long t1() {
        return this.zzl;
    }

    public final boolean u() {
        return (this.zze & 16384) != 0;
    }

    public final boolean u0() {
        return (this.zzf & 2) != 0;
    }

    public final boolean u1() {
        return (this.zze & 16) != 0;
    }

    public final long v() {
        return this.zzw;
    }

    public final int v0() {
        return this.zzQ;
    }

    public final long v1() {
        return this.zzm;
    }

    public final boolean w() {
        return (this.zze & 32768) != 0;
    }

    public final String w0() {
        return this.zzR;
    }

    public final boolean w1() {
        return (this.zze & 32) != 0;
    }

    public final long x() {
        return this.zzx;
    }

    public final boolean x0() {
        return (this.zzf & 16) != 0;
    }

    public final long x1() {
        return this.zzn;
    }

    public final String y() {
        return this.zzy;
    }

    public final long y0() {
        return this.zzU;
    }

    public final String y1() {
        return this.zzo;
    }

    public final boolean z() {
        return (this.zze & 131072) != 0;
    }

    public final String z0() {
        return this.zzW;
    }

    public final String z1() {
        return this.zzp;
    }
}
