package e.a.a.a.y0.a;

import androidx.core.app.NotificationCompat;
import androidx.renderscript.ScriptIntrinsicBLAS;
import e.a.a.a.y0.a.a;
import e.a.a.a.y0.a.o.b;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b0;
import e.a.a.a.y0.b.b1.a;
import e.a.a.a.y0.b.b1.c;
import e.a.a.a.y0.b.c1.a0;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.g0;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.h0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.b.z;
import e.a.a.a.y0.l.e;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.a1;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.f1;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.v0;
import e.x.b.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class g {

    /* renamed from: e  reason: collision with root package name */
    public static final e.a.a.a.y0.f.d f7642e;
    public static final e.a.a.a.y0.f.b f;

    /* renamed from: g  reason: collision with root package name */
    public static final e.a.a.a.y0.f.b f7643g;

    /* renamed from: h  reason: collision with root package name */
    public static final e.a.a.a.y0.f.b f7644h;

    /* renamed from: i  reason: collision with root package name */
    public static final e.a.a.a.y0.f.b f7645i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<e.a.a.a.y0.f.b> f7646j;

    /* renamed from: k  reason: collision with root package name */
    public static final d f7647k = new d();

    /* renamed from: l  reason: collision with root package name */
    public static final e.a.a.a.y0.f.d f7648l = e.a.a.a.y0.f.d.n("<built-ins module>");
    public a0 a;

    /* renamed from: b  reason: collision with root package name */
    public final i<e> f7649b;
    public final e.a.a.a.y0.l.g<e.a.a.a.y0.f.d, e.a.a.a.y0.b.e> c;
    public final m d;

    public class a implements e.x.b.a<Collection<b0>> {
        public a() {
        }

        public Object e() {
            return Arrays.asList(new b0[]{g.this.a.o0(g.f), g.this.a.o0(g.f7644h), g.this.a.o0(g.f7645i), g.this.a.o0(g.f7643g)});
        }
    }

    public class b implements e.x.b.a<e> {
        public b() {
        }

        public Object e() {
            EnumMap enumMap = new EnumMap(i.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            i[] values = i.values();
            for (int i2 = 0; i2 < 8; i2++) {
                i iVar = values[i2];
                k0 b2 = g.b(g.this, iVar.h().e());
                k0 b3 = g.b(g.this, iVar.e().e());
                enumMap.put(iVar, b3);
                hashMap.put(b2, b3);
                hashMap2.put(b3, b2);
            }
            return new e(enumMap, hashMap, hashMap2, (a) null);
        }
    }

    public class c implements l<e.a.a.a.y0.f.d, e.a.a.a.y0.b.e> {
        public c() {
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.f.d dVar = (e.a.a.a.y0.f.d) obj;
            a0 a0Var = g.this.a;
            e.a.a.a.y0.f.b bVar = g.f;
            e.a.a.a.y0.j.y.i z = a0Var.o0(bVar).z();
            if (z != null) {
                h b2 = z.b(dVar, e.a.a.a.y0.c.a.d.FROM_BUILTINS);
                if (b2 == null) {
                    StringBuilder y = b.e.a.a.a.y("Built-in class ");
                    y.append(bVar.c(dVar));
                    y.append(" is not found");
                    throw new AssertionError(y.toString());
                } else if (b2 instanceof e.a.a.a.y0.b.e) {
                    return (e.a.a.a.y0.b.e) b2;
                } else {
                    throw new AssertionError("Must be a class descriptor " + dVar + ", but was " + b2);
                }
            } else {
                g.a(10);
                throw null;
            }
        }
    }

    public static class d {
        public final e.a.a.a.y0.f.b A;
        public final e.a.a.a.y0.f.b B;
        public final e.a.a.a.y0.f.b C;
        public final e.a.a.a.y0.f.b D;
        public final e.a.a.a.y0.f.b E;
        public final e.a.a.a.y0.f.b F;
        public final e.a.a.a.y0.f.b G;
        public final e.a.a.a.y0.f.b H;
        public final e.a.a.a.y0.f.b I;
        public final e.a.a.a.y0.f.b J;
        public final e.a.a.a.y0.f.b K;
        public final e.a.a.a.y0.f.b L;
        public final e.a.a.a.y0.f.b M;
        public final e.a.a.a.y0.f.b N;
        public final e.a.a.a.y0.f.b O;
        public final e.a.a.a.y0.f.b P;
        public final e.a.a.a.y0.f.b Q;
        public final e.a.a.a.y0.f.b R;
        public final e.a.a.a.y0.f.b S;
        public final e.a.a.a.y0.f.b T;
        public final e.a.a.a.y0.f.b U;
        public final e.a.a.a.y0.f.b V;
        public final e.a.a.a.y0.f.c W;
        public final e.a.a.a.y0.f.c X;
        public final e.a.a.a.y0.f.a Y;
        public final e.a.a.a.y0.f.b Z;
        public final e.a.a.a.y0.f.c a = e("Any");
        public final e.a.a.a.y0.f.b a0;

        /* renamed from: b  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7653b = e("Nothing");
        public final e.a.a.a.y0.f.b b0;
        public final e.a.a.a.y0.f.c c = e("Cloneable");
        public final e.a.a.a.y0.f.b c0;
        public final e.a.a.a.y0.f.c d;
        public final e.a.a.a.y0.f.a d0;

        /* renamed from: e  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7654e;
        public final e.a.a.a.y0.f.a e0;
        public final e.a.a.a.y0.f.c f;
        public final e.a.a.a.y0.f.a f0;

        /* renamed from: g  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7655g;
        public final e.a.a.a.y0.f.a g0;

        /* renamed from: h  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7656h;
        public final Set<e.a.a.a.y0.f.d> h0;

        /* renamed from: i  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7657i;
        public final Set<e.a.a.a.y0.f.d> i0;

        /* renamed from: j  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7658j;
        public final Map<e.a.a.a.y0.f.c, i> j0;

        /* renamed from: k  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7659k;
        public final Map<e.a.a.a.y0.f.c, i> k0;

        /* renamed from: l  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7660l;

        /* renamed from: m  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7661m;

        /* renamed from: n  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7662n;

        /* renamed from: o  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7663o;

        /* renamed from: p  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7664p;

        /* renamed from: q  reason: collision with root package name */
        public final e.a.a.a.y0.f.c f7665q;
        public final e.a.a.a.y0.f.b r;
        public final e.a.a.a.y0.f.b s;
        public final e.a.a.a.y0.f.b t;
        public final e.a.a.a.y0.f.b u;
        public final e.a.a.a.y0.f.b v;
        public final e.a.a.a.y0.f.b w;
        public final e.a.a.a.y0.f.b x;
        public final e.a.a.a.y0.f.b y;
        public final e.a.a.a.y0.f.b z;

        public d() {
            d("Suppress");
            this.d = e("Unit");
            this.f7654e = e("CharSequence");
            this.f = e("String");
            this.f7655g = e("Array");
            this.f7656h = e("Boolean");
            this.f7657i = e("Char");
            this.f7658j = e("Byte");
            this.f7659k = e("Short");
            this.f7660l = e("Int");
            this.f7661m = e("Long");
            this.f7662n = e("Float");
            this.f7663o = e("Double");
            this.f7664p = e("Number");
            this.f7665q = e("Enum");
            e("Function");
            this.r = d("Throwable");
            this.s = d("Comparable");
            f("IntRange");
            f("LongRange");
            this.t = d("Deprecated");
            d("DeprecatedSinceKotlin");
            this.u = d("DeprecationLevel");
            this.v = d("ReplaceWith");
            this.w = d("ExtensionFunctionType");
            this.x = d("ParameterName");
            this.y = d("Annotation");
            this.z = b("Target");
            this.A = b("AnnotationTarget");
            this.B = b("AnnotationRetention");
            this.C = b("Retention");
            this.D = b("Repeatable");
            this.E = b("MustBeDocumented");
            this.F = d("UnsafeVariance");
            d("PublishedApi");
            this.G = c("Iterator");
            this.H = c("Iterable");
            this.I = c("Collection");
            this.J = c("List");
            this.K = c("ListIterator");
            this.L = c("Set");
            e.a.a.a.y0.f.b c2 = c("Map");
            this.M = c2;
            this.N = c2.c(e.a.a.a.y0.f.d.l("Entry"));
            this.O = c("MutableIterator");
            this.P = c("MutableIterable");
            this.Q = c("MutableCollection");
            this.R = c("MutableList");
            this.S = c("MutableListIterator");
            this.T = c("MutableSet");
            e.a.a.a.y0.f.b c3 = c("MutableMap");
            this.U = c3;
            this.V = c3.c(e.a.a.a.y0.f.d.l("MutableEntry"));
            this.W = g("KClass");
            g("KCallable");
            g("KProperty0");
            g("KProperty1");
            g("KProperty2");
            g("KMutableProperty0");
            g("KMutableProperty1");
            g("KMutableProperty2");
            e.a.a.a.y0.f.c g2 = g("KProperty");
            this.X = g2;
            g("KMutableProperty");
            this.Y = e.a.a.a.y0.f.a.l(g2.i());
            g("KDeclarationContainer");
            e.a.a.a.y0.f.b d2 = d("UByte");
            this.Z = d2;
            e.a.a.a.y0.f.b d3 = d("UShort");
            this.a0 = d3;
            e.a.a.a.y0.f.b d4 = d("UInt");
            this.b0 = d4;
            e.a.a.a.y0.f.b d5 = d("ULong");
            this.c0 = d5;
            this.d0 = e.a.a.a.y0.f.a.l(d2);
            this.e0 = e.a.a.a.y0.f.a.l(d3);
            this.f0 = e.a.a.a.y0.f.a.l(d4);
            this.g0 = e.a.a.a.y0.f.a.l(d5);
            i.values();
            this.h0 = new HashSet(e.a.a.a.y0.m.o1.c.n(8));
            i.values();
            this.i0 = new HashSet(e.a.a.a.y0.m.o1.c.n(8));
            i.values();
            this.j0 = e.a.a.a.y0.m.o1.c.W(8);
            i.values();
            this.k0 = e.a.a.a.y0.m.o1.c.W(8);
            i[] values = i.values();
            for (int i2 = 0; i2 < 8; i2++) {
                i iVar = values[i2];
                this.h0.add(iVar.h());
                this.i0.add(iVar.e());
                this.j0.put(e(iVar.h().e()), iVar);
                this.k0.put(e(iVar.e().e()), iVar);
            }
        }

        public static /* synthetic */ void a(int i2) {
            int i3 = i2;
            String str = (i3 == 1 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i3 == 1 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11) ? 2 : 3)];
            if (i3 == 1 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$FqNames";
            } else {
                objArr[0] = "simpleName";
            }
            if (i3 == 1) {
                objArr[1] = "fqNameUnsafe";
            } else if (i3 == 3) {
                objArr[1] = "fqName";
            } else if (i3 == 5) {
                objArr[1] = "collectionsFqName";
            } else if (i3 == 7) {
                objArr[1] = "rangesFqName";
            } else if (i3 == 9) {
                objArr[1] = "reflect";
            } else if (i3 != 11) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$FqNames";
            } else {
                objArr[1] = "annotationName";
            }
            switch (i3) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                    break;
                case 2:
                    objArr[2] = "fqName";
                    break;
                case 4:
                    objArr[2] = "collectionsFqName";
                    break;
                case 6:
                    objArr[2] = "rangesFqName";
                    break;
                case 8:
                    objArr[2] = "reflect";
                    break;
                case 10:
                    objArr[2] = "annotationName";
                    break;
                default:
                    objArr[2] = "fqNameUnsafe";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i3 == 1 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public static e.a.a.a.y0.f.b b(String str) {
            return g.f7643g.c(e.a.a.a.y0.f.d.l(str));
        }

        public static e.a.a.a.y0.f.b c(String str) {
            return g.f7644h.c(e.a.a.a.y0.f.d.l(str));
        }

        public static e.a.a.a.y0.f.b d(String str) {
            if (str != null) {
                return g.f.c(e.a.a.a.y0.f.d.l(str));
            }
            a(2);
            throw null;
        }

        public static e.a.a.a.y0.f.c e(String str) {
            if (str != null) {
                e.a.a.a.y0.f.c j2 = d(str).j();
                if (j2 != null) {
                    return j2;
                }
                a(1);
                throw null;
            }
            a(0);
            throw null;
        }

        public static e.a.a.a.y0.f.c f(String str) {
            e.a.a.a.y0.f.c j2 = g.f7645i.c(e.a.a.a.y0.f.d.l(str)).j();
            if (j2 != null) {
                return j2;
            }
            a(7);
            throw null;
        }

        public static e.a.a.a.y0.f.c g(String str) {
            e.a.a.a.y0.f.c j2 = k.a.c(e.a.a.a.y0.f.d.l(str)).j();
            if (j2 != null) {
                return j2;
            }
            a(9);
            throw null;
        }
    }

    public static class e {
        public final Map<i, k0> a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<d0, k0> f7666b;
        public final Map<k0, k0> c;

        public e(Map map, Map map2, Map map3, a aVar) {
            this.a = map;
            this.f7666b = map2;
            this.c = map3;
        }
    }

    static {
        e.a.a.a.y0.f.d l2 = e.a.a.a.y0.f.d.l("kotlin");
        f7642e = l2;
        e.a.a.a.y0.f.b k2 = e.a.a.a.y0.f.b.k(l2);
        f = k2;
        e.a.a.a.y0.f.b c2 = k2.c(e.a.a.a.y0.f.d.l("annotation"));
        f7643g = c2;
        e.a.a.a.y0.f.b c3 = k2.c(e.a.a.a.y0.f.d.l("collections"));
        f7644h = c3;
        e.a.a.a.y0.f.b c4 = k2.c(e.a.a.a.y0.f.d.l("ranges"));
        f7645i = c4;
        k2.c(e.a.a.a.y0.f.d.l(NotificationCompat.MessagingStyle.Message.KEY_TEXT));
        f7646j = e.t.g.M(k2, c3, c4, c2, k.a, k2.c(e.a.a.a.y0.f.d.l("internal")), e.a.a.a.y0.j.g.c);
    }

    public g(m mVar) {
        this.d = mVar;
        mVar.a(new a());
        this.f7649b = mVar.a(new b());
        this.c = mVar.h(new c());
    }

    public static boolean A(d0 d0Var) {
        if (d0Var != null) {
            return C(d0Var, f7647k.f7655g);
        }
        a(87);
        throw null;
    }

    public static boolean B(k kVar) {
        if (kVar != null) {
            return e.a.a.a.y0.j.g.k(kVar, b.class, false) != null;
        }
        a(8);
        throw null;
    }

    public static boolean C(d0 d0Var, e.a.a.a.y0.f.c cVar) {
        if (d0Var == null) {
            a(96);
            throw null;
        } else if (cVar != null) {
            return M(d0Var.W0(), cVar);
        } else {
            a(97);
            throw null;
        }
    }

    public static boolean D(d0 d0Var, e.a.a.a.y0.f.c cVar) {
        if (d0Var == null) {
            a(128);
            throw null;
        } else if (cVar != null) {
            return C(d0Var, cVar) && !d0Var.X0();
        } else {
            a(129);
            throw null;
        }
    }

    public static boolean E(k kVar) {
        if (kVar.a().k().x(f7647k.t)) {
            return true;
        }
        if (!(kVar instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) kVar;
        boolean Q = f0Var.Q();
        g0 j2 = f0Var.j();
        h0 m2 = f0Var.m();
        if (j2 != null && E(j2)) {
            if (!Q) {
                return true;
            }
            if (m2 != null && E(m2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(d0 d0Var, e.a.a.a.y0.f.c cVar) {
        if (d0Var == null) {
            a(104);
            throw null;
        } else if (cVar != null) {
            return !d0Var.X0() && C(d0Var, cVar);
        } else {
            a(105);
            throw null;
        }
    }

    public static boolean G(d0 d0Var) {
        if (d0Var != null) {
            return C(d0Var, f7647k.f7653b) && !f1.g(d0Var);
        }
        a(130);
        throw null;
    }

    public static boolean H(d0 d0Var) {
        if (d0Var != null) {
            return z(d0Var) && d0Var.X0();
        }
        a(134);
        throw null;
    }

    public static boolean I(e.a.a.a.y0.b.e eVar) {
        if (eVar != null) {
            return v(eVar) != null;
        }
        a(95);
        throw null;
    }

    public static boolean J(d0 d0Var) {
        if (!d0Var.X0()) {
            h d2 = d0Var.W0().d();
            if ((d2 instanceof e.a.a.a.y0.b.e) && I((e.a.a.a.y0.b.e) d2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(e.a.a.a.y0.b.e eVar) {
        if (eVar != null) {
            d dVar = f7647k;
            return c(eVar, dVar.a) || c(eVar, dVar.f7653b);
        }
        a(106);
        throw null;
    }

    public static boolean L(d0 d0Var) {
        return F(d0Var, f7647k.f);
    }

    public static boolean M(v0 v0Var, e.a.a.a.y0.f.c cVar) {
        if (v0Var == null) {
            a(100);
            throw null;
        } else if (cVar != null) {
            h d2 = v0Var.d();
            return (d2 instanceof e.a.a.a.y0.b.e) && c(d2, cVar);
        } else {
            a(101);
            throw null;
        }
    }

    public static boolean N(k kVar) {
        while (kVar != null) {
            if (kVar instanceof y) {
                return ((y) kVar).e().i(f7642e);
            }
            kVar = kVar.b();
        }
        return false;
    }

    public static boolean O(d0 d0Var) {
        return F(d0Var, f7647k.d);
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 70:
            case 71:
            case 72:
            case 76:
            case 83:
            case 85:
            case 86:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 70:
            case 71:
            case 72:
            case 76:
            case 83:
            case 85:
            case 86:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 74:
                objArr[0] = "module";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 70:
            case 71:
            case 72:
            case 76:
            case 83:
            case 85:
            case 86:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 8:
            case 9:
            case 79:
            case 80:
            case 88:
            case 95:
            case 102:
            case 106:
            case 107:
            case 139:
            case 140:
            case ScriptIntrinsicBLAS.RIGHT:
            case 150:
            case 151:
            case 152:
                objArr[0] = "descriptor";
                break;
            case 11:
            case 97:
            case 99:
            case 101:
            case 103:
            case 105:
            case 129:
                objArr[0] = "fqName";
                break;
            case 13:
                objArr[0] = "simpleName";
                break;
            case 15:
            case 16:
            case 55:
            case 87:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 98:
            case 104:
            case 108:
            case 109:
            case 110:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 130:
            case ScriptIntrinsicBLAS.NON_UNIT:
            case ScriptIntrinsicBLAS.UNIT:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case ScriptIntrinsicBLAS.LEFT:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 154:
                objArr[0] = "type";
                break;
            case 48:
                objArr[0] = "classSimpleName";
                break;
            case 69:
                objArr[0] = "arrayType";
                break;
            case 73:
                objArr[0] = "notNullArrayType";
                break;
            case 75:
            case 155:
                objArr[0] = "primitiveType";
                break;
            case 77:
                objArr[0] = "kotlinType";
                break;
            case 78:
                objArr[0] = "arrayFqName";
                break;
            case 81:
                objArr[0] = "projectionType";
                break;
            case 82:
            case 84:
                objArr[0] = "argument";
                break;
            case 100:
                objArr[0] = "typeConstructor";
                break;
            case 111:
                objArr[0] = "classDescriptor";
                break;
            case 153:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i2) {
            case 2:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 3:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 4:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 5:
                objArr[1] = "getStorageManager";
                break;
            case 6:
                objArr[1] = "getBuiltInsModule";
                break;
            case 7:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 10:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 12:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 17:
                objArr[1] = "getFunctionName";
                break;
            case 18:
                objArr[1] = "getKFunctionFqName";
                break;
            case 19:
                objArr[1] = "getSuspendFunctionName";
                break;
            case 20:
                objArr[1] = "getSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKFunction";
                break;
            case 22:
                objArr[1] = "getKSuspendFunction";
                break;
            case 23:
                objArr[1] = "getKClass";
                break;
            case 24:
                objArr[1] = "getKCallable";
                break;
            case 25:
                objArr[1] = "getKProperty";
                break;
            case 26:
                objArr[1] = "getKProperty0";
                break;
            case 27:
                objArr[1] = "getKProperty1";
                break;
            case 28:
                objArr[1] = "getKProperty2";
                break;
            case 29:
                objArr[1] = "getKMutableProperty0";
                break;
            case 30:
                objArr[1] = "getKMutableProperty1";
                break;
            case 31:
                objArr[1] = "getKMutableProperty2";
                break;
            case 32:
                objArr[1] = "getIterator";
                break;
            case 33:
                objArr[1] = "getIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterable";
                break;
            case 35:
                objArr[1] = "getMutableIterator";
                break;
            case 36:
                objArr[1] = "getCollection";
                break;
            case 37:
                objArr[1] = "getMutableCollection";
                break;
            case 38:
                objArr[1] = "getList";
                break;
            case 39:
                objArr[1] = "getMutableList";
                break;
            case 40:
                objArr[1] = "getSet";
                break;
            case 41:
                objArr[1] = "getMutableSet";
                break;
            case 42:
                objArr[1] = "getMap";
                break;
            case 43:
                objArr[1] = "getMutableMap";
                break;
            case 44:
                objArr[1] = "getMapEntry";
                break;
            case 45:
                objArr[1] = "getMutableMapEntry";
                break;
            case 46:
                objArr[1] = "getListIterator";
                break;
            case 47:
                objArr[1] = "getMutableListIterator";
                break;
            case 49:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 50:
                objArr[1] = "getNothingType";
                break;
            case 51:
                objArr[1] = "getNullableNothingType";
                break;
            case 52:
                objArr[1] = "getAnyType";
                break;
            case 53:
                objArr[1] = "getNullableAnyType";
                break;
            case 54:
                objArr[1] = "getDefaultBound";
                break;
            case 56:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 57:
                objArr[1] = "getNumberType";
                break;
            case 58:
                objArr[1] = "getByteType";
                break;
            case 59:
                objArr[1] = "getShortType";
                break;
            case 60:
                objArr[1] = "getIntType";
                break;
            case 61:
                objArr[1] = "getLongType";
                break;
            case 62:
                objArr[1] = "getFloatType";
                break;
            case 63:
                objArr[1] = "getDoubleType";
                break;
            case 64:
                objArr[1] = "getCharType";
                break;
            case 65:
                objArr[1] = "getBooleanType";
                break;
            case 66:
                objArr[1] = "getUnitType";
                break;
            case 67:
                objArr[1] = "getStringType";
                break;
            case 68:
                objArr[1] = "getIterableType";
                break;
            case 70:
            case 71:
            case 72:
                objArr[1] = "getArrayElementType";
                break;
            case 76:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 83:
                objArr[1] = "getArrayType";
                break;
            case 85:
                objArr[1] = "getEnumType";
                break;
            case 86:
                objArr[1] = "getAnnotationType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
        }
        switch (i2) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 70:
            case 71:
            case 72:
            case 76:
            case 83:
            case 85:
            case 86:
                break;
            case 8:
                objArr[2] = "isBuiltIn";
                break;
            case 9:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 11:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 13:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 15:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 16:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 48:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 55:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 69:
                objArr[2] = "getArrayElementType";
                break;
            case 73:
            case 74:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 78:
            case 90:
                objArr[2] = "isPrimitiveArray";
                break;
            case 79:
            case 92:
                objArr[2] = "getPrimitiveType";
                break;
            case 80:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 81:
            case 82:
                objArr[2] = "getArrayType";
                break;
            case 84:
                objArr[2] = "getEnumType";
                break;
            case 87:
                objArr[2] = "isArray";
                break;
            case 88:
            case 89:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 93:
                objArr[2] = "isPrimitiveType";
                break;
            case 94:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveClass";
                break;
            case 96:
            case 97:
            case 98:
            case 99:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 100:
            case 101:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "classFqNameEquals";
                break;
            case 104:
            case 105:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 106:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 107:
            case 108:
                objArr[2] = "isAny";
                break;
            case 109:
            case 111:
                objArr[2] = "isBoolean";
                break;
            case 110:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 112:
                objArr[2] = "isNumber";
                break;
            case 113:
                objArr[2] = "isChar";
                break;
            case 114:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 115:
                objArr[2] = "isInt";
                break;
            case 116:
                objArr[2] = "isByte";
                break;
            case 117:
                objArr[2] = "isLong";
                break;
            case 118:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 119:
                objArr[2] = "isShort";
                break;
            case 120:
                objArr[2] = "isFloat";
                break;
            case 121:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 122:
                objArr[2] = "isDouble";
                break;
            case 123:
                objArr[2] = "isUByte";
                break;
            case 124:
                objArr[2] = "isUShort";
                break;
            case 125:
                objArr[2] = "isUInt";
                break;
            case 126:
                objArr[2] = "isULong";
                break;
            case 127:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 128:
            case 129:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 130:
                objArr[2] = "isNothing";
                break;
            case ScriptIntrinsicBLAS.NON_UNIT:
                objArr[2] = "isNullableNothing";
                break;
            case ScriptIntrinsicBLAS.UNIT:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 133:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 134:
                objArr[2] = "isNullableAny";
                break;
            case 135:
                objArr[2] = "isDefaultBound";
                break;
            case 136:
                objArr[2] = "isUnit";
                break;
            case 137:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 138:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 139:
                objArr[2] = "isMemberOfAny";
                break;
            case 140:
            case ScriptIntrinsicBLAS.LEFT:
                objArr[2] = "isEnum";
                break;
            case ScriptIntrinsicBLAS.RIGHT:
            case 143:
                objArr[2] = "isComparable";
                break;
            case 144:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 145:
                objArr[2] = "isListOrNullableList";
                break;
            case 146:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 147:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 148:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 149:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 150:
                objArr[2] = "isKClass";
                break;
            case 151:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 152:
                objArr[2] = "isCloneable";
                break;
            case 153:
                objArr[2] = "isDeprecated";
                break;
            case 154:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            case 155:
                objArr[2] = "getPrimitiveFqName";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 70:
            case 71:
            case 72:
            case 76:
            case 83:
            case 85:
            case 86:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public static k0 b(g gVar, String str) {
        Objects.requireNonNull(gVar);
        if (str != null) {
            k0 s = gVar.j(str).s();
            if (s != null) {
                return s;
            }
            a(49);
            throw null;
        }
        a(48);
        throw null;
    }

    public static boolean c(h hVar, e.a.a.a.y0.f.c cVar) {
        if (hVar == null) {
            a(102);
            throw null;
        } else if (cVar != null) {
            return hVar.getName().equals(cVar.h()) && cVar.equals(e.a.a.a.y0.j.g.g(hVar));
        } else {
            a(103);
            throw null;
        }
    }

    public static String m(int i2) {
        String g2 = b.e.a.a.a.g("Function", i2);
        if (g2 != null) {
            return g2;
        }
        a(17);
        throw null;
    }

    public static i s(k kVar) {
        d dVar = f7647k;
        if (dVar.i0.contains(kVar.getName())) {
            return dVar.k0.get(e.a.a.a.y0.j.g.g(kVar));
        }
        return null;
    }

    public static e.a.a.a.y0.f.b t(i iVar) {
        if (iVar != null) {
            return f.c(iVar.h());
        }
        a(155);
        throw null;
    }

    public static i v(k kVar) {
        if (kVar != null) {
            d dVar = f7647k;
            if (dVar.h0.contains(kVar.getName())) {
                return dVar.j0.get(e.a.a.a.y0.j.g.g(kVar));
            }
            return null;
        }
        a(79);
        throw null;
    }

    public static boolean z(d0 d0Var) {
        if (d0Var != null) {
            return C(d0Var, f7647k.a);
        }
        a(133);
        throw null;
    }

    public void d(boolean z) {
        a0 a0Var = new a0(f7648l, this.d, this, (e.a.a.a.y0.g.a) null, (Map) null, (e.a.a.a.y0.f.d) null, 48);
        this.a = a0Var;
        Objects.requireNonNull(a.a);
        z a2 = ((a) a.C0135a.a.getValue()).a(this.d, this.a, k(), q(), e(), z);
        e.x.c.i.e(a2, "providerForModuleContent");
        a0Var.f8157l = a2;
        a0 a0Var2 = this.a;
        a0Var2.K0(a0Var2);
    }

    public e.a.a.a.y0.b.b1.a e() {
        return a.C0141a.a;
    }

    public k0 f() {
        k0 s = j("Any").s();
        if (s != null) {
            return s;
        }
        a(52);
        throw null;
    }

    public d0 g(d0 d0Var) {
        e.a.a.a.y0.f.a g2;
        e.a.a.a.y0.b.e l0;
        k0 k0Var = null;
        if (d0Var == null) {
            a(69);
            throw null;
        } else if (!A(d0Var)) {
            d0 i2 = f1.i(d0Var);
            d0 d0Var2 = ((e) this.f7649b.e()).c.get(i2);
            if (d0Var2 != null) {
                return d0Var2;
            }
            if (i2 != null) {
                h d2 = i2.W0().d();
                w e2 = d2 == null ? null : e.a.a.a.y0.j.g.e(d2);
                if (e2 != null) {
                    h d3 = i2.W0().d();
                    if (d3 != null) {
                        n nVar = n.f7690e;
                        e.a.a.a.y0.f.d name = d3.getName();
                        e.x.c.i.e(name, "name");
                        if (n.d.contains(name) && (g2 = e.a.a.a.y0.j.v.b.g(d3)) != null) {
                            e.x.c.i.e(g2, "arrayClassId");
                            e.a.a.a.y0.f.a aVar = n.f7689b.get(g2);
                            if (!(aVar == null || (l0 = b.q.a.a.l0(e2, aVar)) == null)) {
                                k0Var = l0.s();
                            }
                        }
                    }
                    if (k0Var != null) {
                        return k0Var;
                    }
                }
                throw new IllegalStateException("not array: " + d0Var);
            }
            e.a.a.a.y0.j.g.a(18);
            throw null;
        } else if (d0Var.V0().size() == 1) {
            d0 d4 = d0Var.V0().get(0).d();
            if (d4 != null) {
                return d4;
            }
            a(70);
            throw null;
        } else {
            throw new IllegalStateException();
        }
    }

    public k0 h(j1 j1Var, d0 d0Var) {
        if (d0Var != null) {
            List singletonList = Collections.singletonList(new a1(j1Var, d0Var));
            Objects.requireNonNull(e.a.a.a.y0.b.a1.h.f7785e);
            return e0.e(h.a.a, j("Array"), singletonList);
        }
        a(82);
        throw null;
    }

    public e.a.a.a.y0.b.e i(e.a.a.a.y0.f.b bVar) {
        if (bVar != null) {
            e.a.a.a.y0.b.e I2 = b.q.a.a.I2(this.a, bVar, e.a.a.a.y0.c.a.d.FROM_BUILTINS);
            if (I2 != null) {
                return I2;
            }
            a(12);
            throw null;
        }
        a(11);
        throw null;
    }

    public final e.a.a.a.y0.b.e j(String str) {
        if (str != null) {
            e.a.a.a.y0.b.e eVar = (e.a.a.a.y0.b.e) ((e.m) this.c).invoke(e.a.a.a.y0.f.d.l(str));
            if (eVar != null) {
                return eVar;
            }
            a(14);
            throw null;
        }
        a(13);
        throw null;
    }

    public Iterable<e.a.a.a.y0.b.b1.b> k() {
        List singletonList = Collections.singletonList(new e.a.a.a.y0.a.o.a(this.d, this.a));
        if (singletonList != null) {
            return singletonList;
        }
        a(4);
        throw null;
    }

    public k0 l() {
        k0 p2 = p();
        if (p2 != null) {
            return p2;
        }
        a(54);
        throw null;
    }

    public k0 n() {
        k0 u = u(i.INT);
        if (u != null) {
            return u;
        }
        a(60);
        throw null;
    }

    public k0 o() {
        k0 s = j("Nothing").s();
        if (s != null) {
            return s;
        }
        a(50);
        throw null;
    }

    public k0 p() {
        k0 d1 = f().a1(true);
        if (d1 != null) {
            return d1;
        }
        a(53);
        throw null;
    }

    public e.a.a.a.y0.b.b1.c q() {
        return c.b.a;
    }

    public k0 r(i iVar) {
        if (iVar != null) {
            k0 k0Var = ((e) this.f7649b.e()).a.get(iVar);
            if (k0Var != null) {
                return k0Var;
            }
            a(76);
            throw null;
        }
        a(75);
        throw null;
    }

    public k0 u(i iVar) {
        if (iVar == null) {
            a(55);
            throw null;
        } else if (iVar != null) {
            k0 s = j(iVar.h().e()).s();
            if (s != null) {
                return s;
            }
            a(56);
            throw null;
        } else {
            a(15);
            throw null;
        }
    }

    public k0 w() {
        k0 s = j("String").s();
        if (s != null) {
            return s;
        }
        a(67);
        throw null;
    }

    public e.a.a.a.y0.b.e x(int i2) {
        e.a.a.a.y0.f.b bVar = e.a.a.a.y0.j.g.c;
        String str = b.c.SuspendFunction.f7708i + i2;
        if (str != null) {
            e.a.a.a.y0.b.e i3 = i(bVar.c(e.a.a.a.y0.f.d.l(str)));
            if (i3 != null) {
                return i3;
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    public k0 y() {
        k0 s = j("Unit").s();
        if (s != null) {
            return s;
        }
        a(66);
        throw null;
    }
}
