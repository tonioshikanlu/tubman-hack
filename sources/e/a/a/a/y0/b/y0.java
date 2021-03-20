package e.a.a.a.y0.b;

import androidx.core.os.EnvironmentCompat;
import e.a.a.a.y0.b.c1.k0;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.n.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

public class y0 {
    public static final z0 a;

    /* renamed from: b  reason: collision with root package name */
    public static final z0 f7849b;
    public static final z0 c;
    public static final z0 d;

    /* renamed from: e  reason: collision with root package name */
    public static final z0 f7850e;
    public static final z0 f;

    /* renamed from: g  reason: collision with root package name */
    public static final z0 f7851g = new j("inherited", false);

    /* renamed from: h  reason: collision with root package name */
    public static final z0 f7852h = new k("invisible_fake", false);

    /* renamed from: i  reason: collision with root package name */
    public static final z0 f7853i = new l(EnvironmentCompat.MEDIA_UNKNOWN, false);

    /* renamed from: j  reason: collision with root package name */
    public static final Map<z0, Integer> f7854j;

    /* renamed from: k  reason: collision with root package name */
    public static final z0 f7855k;

    /* renamed from: l  reason: collision with root package name */
    public static final e.a.a.a.y0.j.y.o.d f7856l = new a();

    /* renamed from: m  reason: collision with root package name */
    public static final e.a.a.a.y0.j.y.o.d f7857m = new b();
    @Deprecated

    /* renamed from: n  reason: collision with root package name */
    public static final e.a.a.a.y0.j.y.o.d f7858n = new c();

    /* renamed from: o  reason: collision with root package name */
    public static final e.a.a.a.y0.n.h f7859o;

    public static class a implements e.a.a.a.y0.j.y.o.d {
        public d0 d() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class b implements e.a.a.a.y0.j.y.o.d {
        public d0 d() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class c implements e.a.a.a.y0.j.y.o.d {
        public d0 d() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class d extends z0 {
        public d(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "what";
            } else if (i2 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$1";
            if (i2 == 1 || i2 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(e.a.a.a.y0.j.y.o.d dVar, o oVar, k kVar) {
            k kVar2;
            if (oVar == null) {
                e(1);
                throw null;
            } else if (kVar != null) {
                if (e.a.a.a.y0.j.g.y(oVar)) {
                    if (kVar != null) {
                        if (e.a.a.a.y0.j.g.f(kVar) != n0.a) {
                            return y0.d(oVar, kVar);
                        }
                    } else {
                        e(0);
                        throw null;
                    }
                }
                if (oVar instanceof j) {
                    i b2 = ((j) oVar).b();
                    if (e.a.a.a.y0.j.g.v(b2) && e.a.a.a.y0.j.g.y(b2) && (kVar instanceof j) && e.a.a.a.y0.j.g.y(kVar.b()) && y0.d(oVar, kVar)) {
                        return true;
                    }
                }
                k kVar3 = oVar;
                while (kVar3 != null) {
                    k b3 = kVar3.b();
                    if ((b3 instanceof e) && !e.a.a.a.y0.j.g.p(b3)) {
                        kVar2 = b3;
                        break;
                    }
                    boolean z = b3 instanceof y;
                    kVar3 = b3;
                    if (z) {
                        kVar2 = b3;
                        break;
                    }
                }
                kVar2 = kVar3;
                if (kVar2 == null) {
                    return false;
                }
                while (kVar != null) {
                    if (kVar2 == kVar) {
                        return true;
                    }
                    if (!(kVar instanceof y)) {
                        kVar = kVar.b();
                    } else if (!(kVar2 instanceof y) || !((y) kVar2).e().equals(((y) kVar).e()) || !e.a.a.a.y0.j.g.d(kVar).equals(e.a.a.a.y0.j.g.d(kVar2))) {
                        return false;
                    } else {
                        return true;
                    }
                }
                return false;
            } else {
                e(2);
                throw null;
            }
        }
    }

    public static class e extends z0 {
        public e(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public String b() {
            return "private/*private to this*/";
        }

        public boolean c(e.a.a.a.y0.j.y.o.d dVar, o oVar, k kVar) {
            k j2;
            if (oVar == null) {
                e(0);
                throw null;
            } else if (kVar != null) {
                if (y0.a.c(dVar, oVar, kVar)) {
                    if (dVar == y0.f7857m) {
                        return true;
                    }
                    if (!(dVar == y0.f7856l || (j2 = e.a.a.a.y0.j.g.j(oVar, e.class)) == null || !(dVar instanceof e.a.a.a.y0.j.y.o.f))) {
                        return ((e.a.a.a.y0.j.y.o.f) dVar).o().a().equals(j2.a());
                    }
                }
                return false;
            } else {
                e(1);
                throw null;
            }
        }
    }

    public static class f extends z0 {
        public f(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "from";
            } else if (i2 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i2 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$3";
            if (i2 == 2 || i2 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
            if (b.q.a.a.E1(r0) == false) goto L_0x007c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(e.a.a.a.y0.j.y.o.d r7, e.a.a.a.y0.b.o r8, e.a.a.a.y0.b.k r9) {
            /*
                r6 = this;
                java.lang.Class<e.a.a.a.y0.b.e> r0 = e.a.a.a.y0.b.e.class
                r1 = 0
                r2 = 0
                if (r8 == 0) goto L_0x0091
                r3 = 1
                if (r9 == 0) goto L_0x008d
                e.a.a.a.y0.b.k r4 = e.a.a.a.y0.j.g.j(r8, r0)
                e.a.a.a.y0.b.e r4 = (e.a.a.a.y0.b.e) r4
                e.a.a.a.y0.b.k r9 = e.a.a.a.y0.j.g.k(r9, r0, r2)
                e.a.a.a.y0.b.e r9 = (e.a.a.a.y0.b.e) r9
                if (r9 != 0) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 == 0) goto L_0x002f
                boolean r5 = e.a.a.a.y0.j.g.p(r4)
                if (r5 == 0) goto L_0x002f
                e.a.a.a.y0.b.k r4 = e.a.a.a.y0.j.g.j(r4, r0)
                e.a.a.a.y0.b.e r4 = (e.a.a.a.y0.b.e) r4
                if (r4 == 0) goto L_0x002f
                boolean r4 = e.a.a.a.y0.j.g.w(r9, r4)
                if (r4 == 0) goto L_0x002f
                return r3
            L_0x002f:
                e.a.a.a.y0.b.o r4 = e.a.a.a.y0.j.g.A(r8)
                e.a.a.a.y0.b.k r0 = e.a.a.a.y0.j.g.j(r4, r0)
                e.a.a.a.y0.b.e r0 = (e.a.a.a.y0.b.e) r0
                if (r0 != 0) goto L_0x003c
                return r2
            L_0x003c:
                boolean r0 = e.a.a.a.y0.j.g.w(r9, r0)
                if (r0 == 0) goto L_0x0084
                if (r4 == 0) goto L_0x007f
                e.a.a.a.y0.j.y.o.d r0 = e.a.a.a.y0.b.y0.f7858n
                if (r7 != r0) goto L_0x0049
                goto L_0x007c
            L_0x0049:
                boolean r0 = r4 instanceof e.a.a.a.y0.b.b
                if (r0 != 0) goto L_0x004e
                goto L_0x007b
            L_0x004e:
                boolean r0 = r4 instanceof e.a.a.a.y0.b.j
                if (r0 == 0) goto L_0x0053
                goto L_0x007b
            L_0x0053:
                e.a.a.a.y0.j.y.o.d r0 = e.a.a.a.y0.b.y0.f7857m
                if (r7 != r0) goto L_0x0058
                goto L_0x007b
            L_0x0058:
                e.a.a.a.y0.j.y.o.d r0 = e.a.a.a.y0.b.y0.f7856l
                if (r7 == r0) goto L_0x007c
                if (r7 != 0) goto L_0x005f
                goto L_0x007c
            L_0x005f:
                boolean r0 = r7 instanceof e.a.a.a.y0.j.y.o.e
                if (r0 == 0) goto L_0x006b
                r0 = r7
                e.a.a.a.y0.j.y.o.e r0 = (e.a.a.a.y0.j.y.o.e) r0
                e.a.a.a.y0.m.d0 r0 = r0.a()
                goto L_0x006f
            L_0x006b:
                e.a.a.a.y0.m.d0 r0 = r7.d()
            L_0x006f:
                boolean r1 = e.a.a.a.y0.j.g.x(r0, r9)
                if (r1 != 0) goto L_0x007b
                boolean r0 = b.q.a.a.E1(r0)
                if (r0 == 0) goto L_0x007c
            L_0x007b:
                r2 = r3
            L_0x007c:
                if (r2 == 0) goto L_0x0084
                return r3
            L_0x007f:
                r7 = 2
                e(r7)
                throw r1
            L_0x0084:
                e.a.a.a.y0.b.k r9 = r9.b()
                boolean r7 = r6.c(r7, r8, r9)
                return r7
            L_0x008d:
                e(r3)
                throw r1
            L_0x0091:
                e(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.b.y0.f.c(e.a.a.a.y0.j.y.o.d, e.a.a.a.y0.b.o, e.a.a.a.y0.b.k):boolean");
        }
    }

    public static class g extends z0 {
        public g(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(e.a.a.a.y0.j.y.o.d dVar, o oVar, k kVar) {
            if (oVar == null) {
                e(0);
                throw null;
            } else if (kVar != null) {
                if (!e.a.a.a.y0.j.g.d(kVar).I(e.a.a.a.y0.j.g.d(oVar))) {
                    return false;
                }
                return y0.f7859o.a(oVar, kVar);
            } else {
                e(1);
                throw null;
            }
        }
    }

    public static class h extends z0 {
        public h(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(e.a.a.a.y0.j.y.o.d dVar, o oVar, k kVar) {
            if (oVar == null) {
                e(0);
                throw null;
            } else if (kVar != null) {
                return true;
            } else {
                e(1);
                throw null;
            }
        }
    }

    public static class i extends z0 {
        public i(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(e.a.a.a.y0.j.y.o.d dVar, o oVar, k kVar) {
            if (oVar == null) {
                e(0);
                throw null;
            } else if (kVar == null) {
                e(1);
                throw null;
            } else {
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        }
    }

    public static class j extends z0 {
        public j(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(e.a.a.a.y0.j.y.o.d dVar, o oVar, k kVar) {
            if (oVar == null) {
                e(0);
                throw null;
            } else if (kVar == null) {
                e(1);
                throw null;
            } else {
                throw new IllegalStateException("Visibility is unknown yet");
            }
        }
    }

    public static class k extends z0 {
        public k(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(e.a.a.a.y0.j.y.o.d dVar, o oVar, k kVar) {
            if (oVar == null) {
                e(0);
                throw null;
            } else if (kVar != null) {
                return false;
            } else {
                e(1);
                throw null;
            }
        }
    }

    public static class l extends z0 {
        public l(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean c(e.a.a.a.y0.j.y.o.d dVar, o oVar, k kVar) {
            if (oVar == null) {
                e(0);
                throw null;
            } else if (kVar != null) {
                return false;
            } else {
                e(1);
                throw null;
            }
        }
    }

    static {
        Class<e.a.a.a.y0.n.h> cls = e.a.a.a.y0.n.h.class;
        d dVar = new d("private", false);
        a = dVar;
        e eVar = new e("private_to_this", false);
        f7849b = eVar;
        f fVar = new f("protected", true);
        c = fVar;
        g gVar = new g("internal", false);
        d = gVar;
        h hVar = new h("public", true);
        f7850e = hVar;
        i iVar = new i("local", false);
        f = iVar;
        Collections.unmodifiableSet(e.t.g.M(dVar, eVar, gVar, iVar));
        HashMap W = e.a.a.a.y0.m.o1.c.W(4);
        W.put(eVar, 0);
        W.put(dVar, 0);
        W.put(gVar, 1);
        W.put(fVar, 1);
        W.put(hVar, 2);
        f7854j = Collections.unmodifiableMap(W);
        f7855k = hVar;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        f7859o = it.hasNext() ? (e.a.a.a.y0.n.h) it.next() : h.a.a;
    }

    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        if (!(i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7)) {
            switch (i2) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                    objArr[0] = "visibility";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities";
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Integer b(z0 z0Var, z0 z0Var2) {
        if (z0Var == null) {
            a(12);
            throw null;
        } else if (z0Var2 != null) {
            Integer a2 = z0Var.a(z0Var2);
            if (a2 != null) {
                return a2;
            }
            Integer a3 = z0Var2.a(z0Var);
            if (a3 != null) {
                return Integer.valueOf(-a3.intValue());
            }
            return null;
        } else {
            a(13);
            throw null;
        }
    }

    public static o c(e.a.a.a.y0.j.y.o.d dVar, o oVar, k kVar) {
        o c2;
        if (oVar == null) {
            a(8);
            throw null;
        } else if (kVar != null) {
            k a2 = oVar.a();
            while (true) {
                o oVar2 = (o) a2;
                if (oVar2 != null && oVar2.getVisibility() != f) {
                    if (!oVar2.getVisibility().c(dVar, oVar2, kVar)) {
                        return oVar2;
                    }
                    a2 = e.a.a.a.y0.j.g.j(oVar2, o.class);
                }
            }
            if (!(oVar instanceof k0) || (c2 = c(dVar, ((k0) oVar).a0(), kVar)) == null) {
                return null;
            }
            return c2;
        } else {
            a(9);
            throw null;
        }
    }

    public static boolean d(k kVar, k kVar2) {
        if (kVar != null) {
            n0 f2 = e.a.a.a.y0.j.g.f(kVar2);
            if (f2 != n0.a) {
                return f2.equals(e.a.a.a.y0.j.g.f(kVar));
            }
            return false;
        }
        a(6);
        throw null;
    }

    public static boolean e(z0 z0Var) {
        if (z0Var != null) {
            return z0Var == a || z0Var == f7849b;
        }
        a(14);
        throw null;
    }

    public static boolean f(o oVar, k kVar) {
        if (kVar != null) {
            return c(f7857m, oVar, kVar) == null;
        }
        a(3);
        throw null;
    }
}
