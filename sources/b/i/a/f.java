package b.i.a;

import android.graphics.Matrix;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import b.i.a.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class f {
    public e0 a = null;

    /* renamed from: b  reason: collision with root package name */
    public b.r f1077b = new b.r();
    public Map<String, k0> c = new HashMap();

    public static class a {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public float f1078b;
        public float c;
        public float d;

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.f1078b = f2;
            this.c = f3;
            this.d = f4;
        }

        public a(a aVar) {
            this.a = aVar.a;
            this.f1078b = aVar.f1078b;
            this.c = aVar.c;
            this.d = aVar.d;
        }

        public float a() {
            return this.a + this.c;
        }

        public float b() {
            return this.f1078b + this.d;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("[");
            y.append(this.a);
            y.append(" ");
            y.append(this.f1078b);
            y.append(" ");
            y.append(this.c);
            y.append(" ");
            y.append(this.d);
            y.append("]");
            return y.toString();
        }
    }

    public static class a0 extends k {

        /* renamed from: o  reason: collision with root package name */
        public o f1079o;

        /* renamed from: p  reason: collision with root package name */
        public o f1080p;

        /* renamed from: q  reason: collision with root package name */
        public o f1081q;
        public o r;
        public o s;
        public o t;

        public String o() {
            return "rect";
        }
    }

    public interface a1 {
    }

    public static class b {
        public o a;

        /* renamed from: b  reason: collision with root package name */
        public o f1082b;
        public o c;
        public o d;

        public b(o oVar, o oVar2, o oVar3, o oVar4) {
            this.a = oVar;
            this.f1082b = oVar2;
            this.c = oVar3;
            this.d = oVar4;
        }
    }

    public static class b0 extends k0 implements i0 {
        public List<m0> c() {
            return Collections.emptyList();
        }

        public void f(m0 m0Var) {
        }

        public String o() {
            return "solidColor";
        }
    }

    public static class b1 extends m0 implements w0 {
        public String c;

        public b1(String str) {
            this.c = str;
        }

        public a1 k() {
            return null;
        }

        public String toString() {
            return b.e.a.a.a.q(b.e.a.a.a.y("TextChild: '"), this.c, "'");
        }
    }

    public static class c extends k {

        /* renamed from: o  reason: collision with root package name */
        public o f1083o;

        /* renamed from: p  reason: collision with root package name */
        public o f1084p;

        /* renamed from: q  reason: collision with root package name */
        public o f1085q;

        public String o() {
            return "circle";
        }
    }

    public static class c0 extends k0 implements i0 {

        /* renamed from: h  reason: collision with root package name */
        public Float f1086h;

        public List<m0> c() {
            return Collections.emptyList();
        }

        public void f(m0 m0Var) {
        }

        public String o() {
            return "stop";
        }
    }

    public enum c1 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public static class d extends l implements s {

        /* renamed from: o  reason: collision with root package name */
        public Boolean f1097o;

        public String o() {
            return "clipPath";
        }
    }

    public static class d0 implements Cloneable {
        public h A;
        public C0042f B;
        public Boolean C;
        public b D;
        public String E;
        public String F;
        public String G;
        public Boolean H;
        public Boolean I;
        public n0 J;
        public Float K;
        public String L;
        public a M;
        public String N;
        public n0 O;
        public Float P;
        public n0 Q;
        public Float R;
        public i S;
        public e T;

        /* renamed from: h  reason: collision with root package name */
        public long f1098h = 0;

        /* renamed from: i  reason: collision with root package name */
        public n0 f1099i;

        /* renamed from: j  reason: collision with root package name */
        public a f1100j;

        /* renamed from: k  reason: collision with root package name */
        public Float f1101k;

        /* renamed from: l  reason: collision with root package name */
        public n0 f1102l;

        /* renamed from: m  reason: collision with root package name */
        public Float f1103m;

        /* renamed from: n  reason: collision with root package name */
        public o f1104n;

        /* renamed from: o  reason: collision with root package name */
        public c f1105o;

        /* renamed from: p  reason: collision with root package name */
        public d f1106p;

        /* renamed from: q  reason: collision with root package name */
        public Float f1107q;
        public o[] r;
        public o s;
        public Float t;
        public e u;
        public List<String> v;
        public o w;
        public Integer x;
        public b y;
        public g z;

        public enum a {
            NonZero,
            EvenOdd
        }

        public enum b {
            Normal,
            Italic,
            Oblique
        }

        public enum c {
            Butt,
            Round,
            Square
        }

        public enum d {
            Miter,
            Round,
            Bevel
        }

        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        /* renamed from: b.i.a.f$d0$f  reason: collision with other inner class name */
        public enum C0042f {
            Start,
            Middle,
            End
        }

        public enum g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum h {
            LTR,
            RTL
        }

        public enum i {
            None,
            NonScalingStroke
        }

        public static d0 a() {
            d0 d0Var = new d0();
            d0Var.f1098h = -1;
            e eVar = e.f1146i;
            d0Var.f1099i = eVar;
            a aVar = a.NonZero;
            d0Var.f1100j = aVar;
            Float valueOf = Float.valueOf(1.0f);
            d0Var.f1101k = valueOf;
            d0Var.f1102l = null;
            d0Var.f1103m = valueOf;
            d0Var.f1104n = new o(1.0f);
            d0Var.f1105o = c.Butt;
            d0Var.f1106p = d.Miter;
            d0Var.f1107q = Float.valueOf(4.0f);
            d0Var.r = null;
            d0Var.s = new o(0.0f);
            d0Var.t = valueOf;
            d0Var.u = eVar;
            d0Var.v = null;
            d0Var.w = new o(12.0f, c1.pt);
            d0Var.x = 400;
            d0Var.y = b.Normal;
            d0Var.z = g.None;
            d0Var.A = h.LTR;
            d0Var.B = C0042f.Start;
            Boolean bool = Boolean.TRUE;
            d0Var.C = bool;
            d0Var.D = null;
            d0Var.E = null;
            d0Var.F = null;
            d0Var.G = null;
            d0Var.H = bool;
            d0Var.I = bool;
            d0Var.J = eVar;
            d0Var.K = valueOf;
            d0Var.L = null;
            d0Var.M = aVar;
            d0Var.N = null;
            d0Var.O = null;
            d0Var.P = valueOf;
            d0Var.Q = null;
            d0Var.R = valueOf;
            d0Var.S = i.None;
            d0Var.T = e.auto;
            return d0Var;
        }

        public Object clone() {
            d0 d0Var = (d0) super.clone();
            o[] oVarArr = this.r;
            if (oVarArr != null) {
                d0Var.r = (o[]) oVarArr.clone();
            }
            return d0Var;
        }
    }

    public static class d1 extends l {

        /* renamed from: o  reason: collision with root package name */
        public String f1143o;

        /* renamed from: p  reason: collision with root package name */
        public o f1144p;

        /* renamed from: q  reason: collision with root package name */
        public o f1145q;
        public o r;
        public o s;

        public String o() {
            return "use";
        }
    }

    public static class e extends n0 {

        /* renamed from: i  reason: collision with root package name */
        public static final e f1146i = new e(ViewCompat.MEASURED_STATE_MASK);

        /* renamed from: j  reason: collision with root package name */
        public static final e f1147j = new e(0);

        /* renamed from: h  reason: collision with root package name */
        public int f1148h;

        public e(int i2) {
            this.f1148h = i2;
        }

        public String toString() {
            return String.format("#%08x", new Object[]{Integer.valueOf(this.f1148h)});
        }
    }

    public static class e0 extends q0 {

        /* renamed from: p  reason: collision with root package name */
        public o f1149p;

        /* renamed from: q  reason: collision with root package name */
        public o f1150q;
        public o r;
        public o s;

        public String o() {
            return "svg";
        }
    }

    public static class e1 extends q0 implements s {
        public String o() {
            return "view";
        }
    }

    /* renamed from: b.i.a.f$f  reason: collision with other inner class name */
    public static class C0043f extends n0 {

        /* renamed from: h  reason: collision with root package name */
        public static C0043f f1151h = new C0043f();
    }

    public interface f0 {
        Set<String> a();

        void b(String str);

        Set<String> e();

        void g(Set<String> set);

        String h();

        void i(Set<String> set);

        void j(Set<String> set);

        void l(Set<String> set);

        Set<String> m();

        Set<String> n();
    }

    public static class g extends l implements s {
        public String o() {
            return "defs";
        }
    }

    public static abstract class g0 extends j0 implements i0, f0 {

        /* renamed from: i  reason: collision with root package name */
        public List<m0> f1152i = new ArrayList();

        /* renamed from: j  reason: collision with root package name */
        public Set<String> f1153j = null;

        /* renamed from: k  reason: collision with root package name */
        public String f1154k = null;

        /* renamed from: l  reason: collision with root package name */
        public Set<String> f1155l = null;

        /* renamed from: m  reason: collision with root package name */
        public Set<String> f1156m = null;

        public Set<String> a() {
            return this.f1153j;
        }

        public void b(String str) {
            this.f1154k = str;
        }

        public List<m0> c() {
            return this.f1152i;
        }

        public Set<String> e() {
            return null;
        }

        public void f(m0 m0Var) {
            this.f1152i.add(m0Var);
        }

        public void g(Set<String> set) {
            this.f1155l = set;
        }

        public String h() {
            return this.f1154k;
        }

        public void i(Set<String> set) {
            this.f1156m = set;
        }

        public void j(Set<String> set) {
        }

        public void l(Set<String> set) {
            this.f1153j = set;
        }

        public Set<String> m() {
            return this.f1155l;
        }

        public Set<String> n() {
            return this.f1156m;
        }
    }

    public static class h extends k {

        /* renamed from: o  reason: collision with root package name */
        public o f1157o;

        /* renamed from: p  reason: collision with root package name */
        public o f1158p;

        /* renamed from: q  reason: collision with root package name */
        public o f1159q;
        public o r;

        public String o() {
            return "ellipse";
        }
    }

    public static abstract class h0 extends j0 implements f0 {

        /* renamed from: i  reason: collision with root package name */
        public Set<String> f1160i = null;

        /* renamed from: j  reason: collision with root package name */
        public String f1161j = null;

        /* renamed from: k  reason: collision with root package name */
        public Set<String> f1162k = null;

        /* renamed from: l  reason: collision with root package name */
        public Set<String> f1163l = null;

        /* renamed from: m  reason: collision with root package name */
        public Set<String> f1164m = null;

        public Set<String> a() {
            return this.f1160i;
        }

        public void b(String str) {
            this.f1161j = str;
        }

        public Set<String> e() {
            return this.f1162k;
        }

        public void g(Set<String> set) {
            this.f1163l = set;
        }

        public String h() {
            return this.f1161j;
        }

        public void i(Set<String> set) {
            this.f1164m = set;
        }

        public void j(Set<String> set) {
            this.f1162k = set;
        }

        public void l(Set<String> set) {
            this.f1160i = set;
        }

        public Set<String> m() {
            return this.f1163l;
        }

        public Set<String> n() {
            return this.f1164m;
        }
    }

    public static abstract class i extends k0 implements i0 {

        /* renamed from: h  reason: collision with root package name */
        public List<m0> f1165h = new ArrayList();

        /* renamed from: i  reason: collision with root package name */
        public Boolean f1166i;

        /* renamed from: j  reason: collision with root package name */
        public Matrix f1167j;

        /* renamed from: k  reason: collision with root package name */
        public j f1168k;

        /* renamed from: l  reason: collision with root package name */
        public String f1169l;

        public List<m0> c() {
            return this.f1165h;
        }

        public void f(m0 m0Var) {
            if (m0Var instanceof c0) {
                this.f1165h.add(m0Var);
                return;
            }
            throw new h("Gradient elements cannot contain " + m0Var + " elements.");
        }
    }

    public interface i0 {
        List<m0> c();

        void f(m0 m0Var);
    }

    public enum j {
        pad,
        reflect,
        repeat
    }

    public static abstract class j0 extends k0 {

        /* renamed from: h  reason: collision with root package name */
        public a f1174h = null;
    }

    public static abstract class k extends h0 implements m {

        /* renamed from: n  reason: collision with root package name */
        public Matrix f1175n;

        public void d(Matrix matrix) {
            this.f1175n = matrix;
        }
    }

    public static abstract class k0 extends m0 {
        public String c = null;
        public Boolean d = null;

        /* renamed from: e  reason: collision with root package name */
        public d0 f1176e = null;
        public d0 f = null;

        /* renamed from: g  reason: collision with root package name */
        public List<String> f1177g = null;

        public String toString() {
            return o();
        }
    }

    public static class l extends g0 implements m {

        /* renamed from: n  reason: collision with root package name */
        public Matrix f1178n;

        public void d(Matrix matrix) {
            this.f1178n = matrix;
        }

        public String o() {
            return "group";
        }
    }

    public static class l0 extends i {

        /* renamed from: m  reason: collision with root package name */
        public o f1179m;

        /* renamed from: n  reason: collision with root package name */
        public o f1180n;

        /* renamed from: o  reason: collision with root package name */
        public o f1181o;

        /* renamed from: p  reason: collision with root package name */
        public o f1182p;

        public String o() {
            return "linearGradient";
        }
    }

    public interface m {
        void d(Matrix matrix);
    }

    public static class m0 {
        public f a;

        /* renamed from: b  reason: collision with root package name */
        public i0 f1183b;

        public String o() {
            return "";
        }
    }

    public static class n extends o0 implements m {

        /* renamed from: o  reason: collision with root package name */
        public String f1184o;

        /* renamed from: p  reason: collision with root package name */
        public o f1185p;

        /* renamed from: q  reason: collision with root package name */
        public o f1186q;
        public o r;
        public o s;
        public Matrix t;

        public void d(Matrix matrix) {
            this.t = matrix;
        }

        public String o() {
            return "image";
        }
    }

    public static abstract class n0 implements Cloneable {
    }

    public static class o implements Cloneable {

        /* renamed from: h  reason: collision with root package name */
        public float f1187h;

        /* renamed from: i  reason: collision with root package name */
        public c1 f1188i;

        public o(float f) {
            this.f1187h = f;
            this.f1188i = c1.px;
        }

        public o(float f, c1 c1Var) {
            this.f1187h = f;
            this.f1188i = c1Var;
        }

        public float a(float f) {
            int ordinal = this.f1188i.ordinal();
            return ordinal != 0 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 6 ? ordinal != 7 ? this.f1187h : (this.f1187h * f) / 6.0f : (this.f1187h * f) / 72.0f : (this.f1187h * f) / 25.4f : (this.f1187h * f) / 2.54f : this.f1187h * f : this.f1187h;
        }

        public float b(g gVar) {
            if (this.f1188i != c1.percent) {
                return d(gVar);
            }
            a z = gVar.z();
            if (z == null) {
                return this.f1187h;
            }
            float f = z.c;
            float f2 = z.d;
            if (f == f2) {
                return (this.f1187h * f) / 100.0f;
            }
            return (this.f1187h * ((float) (Math.sqrt((double) ((f2 * f2) + (f * f))) / 1.414213562373095d))) / 100.0f;
        }

        public float c(g gVar, float f) {
            return this.f1188i == c1.percent ? (this.f1187h * f) / 100.0f : d(gVar);
        }

        public float d(g gVar) {
            float f;
            float f2;
            switch (this.f1188i.ordinal()) {
                case 0:
                    return this.f1187h;
                case 1:
                    return this.f1187h * gVar.c.d.getTextSize();
                case 2:
                    return this.f1187h * (gVar.c.d.getTextSize() / 2.0f);
                case 3:
                    float f3 = this.f1187h;
                    Objects.requireNonNull(gVar);
                    return f3 * 96.0f;
                case 4:
                    float f4 = this.f1187h;
                    Objects.requireNonNull(gVar);
                    f2 = f4 * 96.0f;
                    f = 2.54f;
                    break;
                case 5:
                    float f5 = this.f1187h;
                    Objects.requireNonNull(gVar);
                    f2 = f5 * 96.0f;
                    f = 25.4f;
                    break;
                case 6:
                    float f6 = this.f1187h;
                    Objects.requireNonNull(gVar);
                    f2 = f6 * 96.0f;
                    f = 72.0f;
                    break;
                case 7:
                    float f7 = this.f1187h;
                    Objects.requireNonNull(gVar);
                    f2 = f7 * 96.0f;
                    f = 6.0f;
                    break;
                case 8:
                    a z = gVar.z();
                    if (z != null) {
                        f2 = this.f1187h * z.c;
                        f = 100.0f;
                        break;
                    } else {
                        return this.f1187h;
                    }
                default:
                    return this.f1187h;
            }
            return f2 / f;
        }

        public float f(g gVar) {
            if (this.f1188i != c1.percent) {
                return d(gVar);
            }
            a z = gVar.z();
            return z == null ? this.f1187h : (this.f1187h * z.d) / 100.0f;
        }

        public boolean g() {
            return this.f1187h < 0.0f;
        }

        public boolean h() {
            return this.f1187h == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f1187h) + this.f1188i;
        }
    }

    public static abstract class o0 extends g0 {

        /* renamed from: n  reason: collision with root package name */
        public e f1189n = null;
    }

    public static class p extends k {

        /* renamed from: o  reason: collision with root package name */
        public o f1190o;

        /* renamed from: p  reason: collision with root package name */
        public o f1191p;

        /* renamed from: q  reason: collision with root package name */
        public o f1192q;
        public o r;

        public String o() {
            return "line";
        }
    }

    public static class p0 extends i {

        /* renamed from: m  reason: collision with root package name */
        public o f1193m;

        /* renamed from: n  reason: collision with root package name */
        public o f1194n;

        /* renamed from: o  reason: collision with root package name */
        public o f1195o;

        /* renamed from: p  reason: collision with root package name */
        public o f1196p;

        /* renamed from: q  reason: collision with root package name */
        public o f1197q;

        public String o() {
            return "radialGradient";
        }
    }

    public static class q extends q0 implements s {

        /* renamed from: p  reason: collision with root package name */
        public boolean f1198p;

        /* renamed from: q  reason: collision with root package name */
        public o f1199q;
        public o r;
        public o s;
        public o t;
        public Float u;

        public String o() {
            return "marker";
        }
    }

    public static abstract class q0 extends o0 {

        /* renamed from: o  reason: collision with root package name */
        public a f1200o;
    }

    public static class r extends g0 implements s {

        /* renamed from: n  reason: collision with root package name */
        public Boolean f1201n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f1202o;

        /* renamed from: p  reason: collision with root package name */
        public o f1203p;

        /* renamed from: q  reason: collision with root package name */
        public o f1204q;

        public String o() {
            return "mask";
        }
    }

    public static class r0 extends l {
        public String o() {
            return "switch";
        }
    }

    public interface s {
    }

    public static class s0 extends q0 implements s {
        public String o() {
            return "symbol";
        }
    }

    public static class t extends n0 {

        /* renamed from: h  reason: collision with root package name */
        public String f1205h;

        /* renamed from: i  reason: collision with root package name */
        public n0 f1206i;

        public t(String str, n0 n0Var) {
            this.f1205h = str;
            this.f1206i = n0Var;
        }

        public String toString() {
            return this.f1205h + " " + this.f1206i;
        }
    }

    public static class t0 extends x0 implements w0 {

        /* renamed from: n  reason: collision with root package name */
        public String f1207n;

        /* renamed from: o  reason: collision with root package name */
        public a1 f1208o;

        public a1 k() {
            return this.f1208o;
        }

        public String o() {
            return "tref";
        }
    }

    public static class u extends k {

        /* renamed from: o  reason: collision with root package name */
        public v f1209o;

        /* renamed from: p  reason: collision with root package name */
        public Float f1210p;

        public String o() {
            return "path";
        }
    }

    public static class u0 extends z0 implements w0 {
        public a1 r;

        public a1 k() {
            return this.r;
        }

        public String o() {
            return "tspan";
        }
    }

    public static class v implements w {
        public byte[] a = new byte[8];

        /* renamed from: b  reason: collision with root package name */
        public int f1211b = 0;
        public float[] c = new float[16];
        public int d = 0;

        public void a(float f, float f2) {
            f((byte) 0);
            g(2);
            float[] fArr = this.c;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            fArr[i2] = f;
            this.d = i3 + 1;
            fArr[i3] = f2;
        }

        public void b(float f, float f2, float f3, float f4, float f5, float f6) {
            f((byte) 2);
            g(6);
            float[] fArr = this.c;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            fArr[i2] = f;
            int i4 = i3 + 1;
            this.d = i4;
            fArr[i3] = f2;
            int i5 = i4 + 1;
            this.d = i5;
            fArr[i4] = f3;
            int i6 = i5 + 1;
            this.d = i6;
            fArr[i5] = f4;
            int i7 = i6 + 1;
            this.d = i7;
            fArr[i6] = f5;
            this.d = i7 + 1;
            fArr[i7] = f6;
        }

        public void c(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            f(((z ? (char) 2 : 0) | true) | z2 ? (byte) 1 : 0);
            g(5);
            float[] fArr = this.c;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            fArr[i2] = f;
            int i4 = i3 + 1;
            this.d = i4;
            fArr[i3] = f2;
            int i5 = i4 + 1;
            this.d = i5;
            fArr[i4] = f3;
            int i6 = i5 + 1;
            this.d = i6;
            fArr[i5] = f4;
            this.d = i6 + 1;
            fArr[i6] = f5;
        }

        public void close() {
            f((byte) 8);
        }

        public void d(float f, float f2, float f3, float f4) {
            f((byte) 3);
            g(4);
            float[] fArr = this.c;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            fArr[i2] = f;
            int i4 = i3 + 1;
            this.d = i4;
            fArr[i3] = f2;
            int i5 = i4 + 1;
            this.d = i5;
            fArr[i4] = f3;
            this.d = i5 + 1;
            fArr[i5] = f4;
        }

        public void e(float f, float f2) {
            f((byte) 1);
            g(2);
            float[] fArr = this.c;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            fArr[i2] = f;
            this.d = i3 + 1;
            fArr[i3] = f2;
        }

        public final void f(byte b2) {
            int i2 = this.f1211b;
            byte[] bArr = this.a;
            if (i2 == bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.a = bArr2;
            }
            byte[] bArr3 = this.a;
            int i3 = this.f1211b;
            this.f1211b = i3 + 1;
            bArr3[i3] = b2;
        }

        public final void g(int i2) {
            float[] fArr = this.c;
            if (fArr.length < this.d + i2) {
                float[] fArr2 = new float[(fArr.length * 2)];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.c = fArr2;
            }
        }

        public void h(w wVar) {
            int i2;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f1211b; i4++) {
                byte b2 = this.a[i4];
                if (b2 == 0) {
                    float[] fArr = this.c;
                    int i5 = i3 + 1;
                    i2 = i5 + 1;
                    wVar.a(fArr[i3], fArr[i5]);
                } else if (b2 != 1) {
                    if (b2 == 2) {
                        float[] fArr2 = this.c;
                        int i6 = i3 + 1;
                        float f = fArr2[i3];
                        int i7 = i6 + 1;
                        float f2 = fArr2[i6];
                        int i8 = i7 + 1;
                        float f3 = fArr2[i7];
                        int i9 = i8 + 1;
                        float f4 = fArr2[i8];
                        int i10 = i9 + 1;
                        float f5 = fArr2[i9];
                        i3 = i10 + 1;
                        wVar.b(f, f2, f3, f4, f5, fArr2[i10]);
                    } else if (b2 == 3) {
                        float[] fArr3 = this.c;
                        int i11 = i3 + 1;
                        int i12 = i11 + 1;
                        int i13 = i12 + 1;
                        wVar.d(fArr3[i3], fArr3[i11], fArr3[i12], fArr3[i13]);
                        i3 = i13 + 1;
                    } else if (b2 != 8) {
                        boolean z = (b2 & 2) != 0;
                        boolean z2 = (b2 & 1) != 0;
                        float[] fArr4 = this.c;
                        int i14 = i3 + 1;
                        float f6 = fArr4[i3];
                        int i15 = i14 + 1;
                        float f7 = fArr4[i14];
                        int i16 = i15 + 1;
                        float f8 = fArr4[i15];
                        int i17 = i16 + 1;
                        wVar.c(f6, f7, f8, z, z2, fArr4[i16], fArr4[i17]);
                        i3 = i17 + 1;
                    } else {
                        wVar.close();
                    }
                } else {
                    float[] fArr5 = this.c;
                    int i18 = i3 + 1;
                    i2 = i18 + 1;
                    wVar.e(fArr5[i3], fArr5[i18]);
                }
                i3 = i2;
            }
        }
    }

    public static class v0 extends z0 implements a1, m {
        public Matrix r;

        public void d(Matrix matrix) {
            this.r = matrix;
        }

        public String o() {
            return NotificationCompat.MessagingStyle.Message.KEY_TEXT;
        }
    }

    public interface w {
        void a(float f, float f2);

        void b(float f, float f2, float f3, float f4, float f5, float f6);

        void c(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void d(float f, float f2, float f3, float f4);

        void e(float f, float f2);
    }

    public interface w0 {
        a1 k();
    }

    public static class x extends q0 implements s {

        /* renamed from: p  reason: collision with root package name */
        public Boolean f1212p;

        /* renamed from: q  reason: collision with root package name */
        public Boolean f1213q;
        public Matrix r;
        public o s;
        public o t;
        public o u;
        public o v;
        public String w;

        public String o() {
            return "pattern";
        }
    }

    public static abstract class x0 extends g0 {
        public void f(m0 m0Var) {
            if (m0Var instanceof w0) {
                this.f1152i.add(m0Var);
                return;
            }
            throw new h("Text content elements cannot contain " + m0Var + " elements.");
        }
    }

    public static class y extends k {

        /* renamed from: o  reason: collision with root package name */
        public float[] f1214o;

        public String o() {
            return "polyline";
        }
    }

    public static class y0 extends x0 implements w0 {

        /* renamed from: n  reason: collision with root package name */
        public String f1215n;

        /* renamed from: o  reason: collision with root package name */
        public o f1216o;

        /* renamed from: p  reason: collision with root package name */
        public a1 f1217p;

        public a1 k() {
            return this.f1217p;
        }

        public String o() {
            return "textPath";
        }
    }

    public static class z extends y {
        public String o() {
            return "polygon";
        }
    }

    public static abstract class z0 extends x0 {

        /* renamed from: n  reason: collision with root package name */
        public List<o> f1218n;

        /* renamed from: o  reason: collision with root package name */
        public List<o> f1219o;

        /* renamed from: p  reason: collision with root package name */
        public List<o> f1220p;

        /* renamed from: q  reason: collision with root package name */
        public List<o> f1221q;
    }

    public float a() {
        c1 c1Var;
        e0 e0Var = this.a;
        if (e0Var != null) {
            o oVar = e0Var.r;
            o oVar2 = e0Var.s;
            if (oVar == null || oVar2 == null || oVar.f1188i == (c1Var = c1.percent) || oVar2.f1188i == c1Var) {
                a aVar = e0Var.f1200o;
                if (aVar != null) {
                    float f = aVar.c;
                    if (f != 0.0f) {
                        float f2 = aVar.d;
                        if (f2 != 0.0f) {
                            return f / f2;
                        }
                    }
                }
                return -1.0f;
            } else if (oVar.h() || oVar2.h()) {
                return -1.0f;
            } else {
                return oVar.a(96.0f) / oVar2.a(96.0f);
            }
        } else {
            throw new IllegalArgumentException("SVG document is empty");
        }
    }

    public final a b(float f) {
        c1 c1Var;
        c1 c1Var2;
        c1 c1Var3;
        c1 c1Var4;
        float f2;
        c1 c1Var5;
        e0 e0Var = this.a;
        o oVar = e0Var.r;
        o oVar2 = e0Var.s;
        if (oVar == null || oVar.h() || (c1Var = oVar.f1188i) == (c1Var2 = c1.percent) || c1Var == (c1Var3 = c1.em) || c1Var == (c1Var4 = c1.ex)) {
            return new a(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float a2 = oVar.a(f);
        if (oVar2 == null) {
            a aVar = this.a.f1200o;
            f2 = aVar != null ? (aVar.d * a2) / aVar.c : a2;
        } else if (oVar2.h() || (c1Var5 = oVar2.f1188i) == c1Var2 || c1Var5 == c1Var3 || c1Var5 == c1Var4) {
            return new a(-1.0f, -1.0f, -1.0f, -1.0f);
        } else {
            f2 = oVar2.a(f);
        }
        return new a(0.0f, 0.0f, a2, f2);
    }

    public float c() {
        if (this.a != null) {
            return b(96.0f).d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public float d() {
        if (this.a != null) {
            return b(96.0f).c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public final k0 e(i0 i0Var, String str) {
        k0 e2;
        k0 k0Var = (k0) i0Var;
        if (str.equals(k0Var.c)) {
            return k0Var;
        }
        for (m0 next : i0Var.c()) {
            if (next instanceof k0) {
                k0 k0Var2 = (k0) next;
                if (str.equals(k0Var2.c)) {
                    return k0Var2;
                }
                if ((next instanceof i0) && (e2 = e((i0) next, str)) != null) {
                    return e2;
                }
            }
        }
        return null;
    }

    public k0 f(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.a.c)) {
            return this.a;
        }
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        k0 e2 = e(this.a, str);
        this.c.put(str, e2);
        return e2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.i.a.f.m0 g(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\""
            boolean r2 = r5.startsWith(r1)
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r2 = r5.endsWith(r1)
            if (r2 == 0) goto L_0x001f
            int r2 = r5.length()
            int r2 = r2 - r3
            java.lang.String r5 = r5.substring(r3, r2)
            java.lang.String r2 = "\\\""
            goto L_0x0038
        L_0x001f:
            java.lang.String r1 = "'"
            boolean r2 = r5.startsWith(r1)
            if (r2 == 0) goto L_0x003c
            boolean r2 = r5.endsWith(r1)
            if (r2 == 0) goto L_0x003c
            int r2 = r5.length()
            int r2 = r2 - r3
            java.lang.String r5 = r5.substring(r3, r2)
            java.lang.String r2 = "\\'"
        L_0x0038:
            java.lang.String r5 = r5.replace(r2, r1)
        L_0x003c:
            java.lang.String r1 = "\\\n"
            java.lang.String r2 = ""
            java.lang.String r5 = r5.replace(r1, r2)
            java.lang.String r1 = "\\A"
            java.lang.String r2 = "\n"
            java.lang.String r5 = r5.replace(r1, r2)
            int r1 = r5.length()
            if (r1 <= r3) goto L_0x0063
            java.lang.String r1 = "#"
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L_0x0063
            java.lang.String r5 = r5.substring(r3)
            b.i.a.f$k0 r5 = r4.f(r5)
            return r5
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.f.g(java.lang.String):b.i.a.f$m0");
    }

    public void h(float f) {
        e0 e0Var = this.a;
        if (e0Var != null) {
            e0Var.s = new o(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void i(float f) {
        e0 e0Var = this.a;
        if (e0Var != null) {
            e0Var.r = new o(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }
}
