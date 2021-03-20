package b.q.a;

import android.annotation.TargetApi;
import android.graphics.RectF;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.appcompat.widget.ActivityChooserView;
import e.a.a.a.c0;
import e.a.a.a.o0;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.c1.h0;
import e.a.a.a.y0.b.c1.n0;
import e.a.a.a.y0.b.d1.b.a0;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.g0;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.j;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s0;
import e.a.a.a.y0.b.t0;
import e.a.a.a.y0.b.u0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.x0;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.c.a.b;
import e.a.a.a.y0.c.a.c;
import e.a.a.a.y0.c.a.e;
import e.a.a.a.y0.c.a.f;
import e.a.a.a.y0.d.b.k;
import e.a.a.a.y0.d.b.v;
import e.a.a.a.y0.e.n;
import e.a.a.a.y0.e.q;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.k.b.p;
import e.a.a.a.y0.m.a1;
import e.a.a.a.y0.m.b1;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.d1;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.f1;
import e.a.a.a.y0.m.g1;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.n1.g;
import e.a.a.a.y0.m.n1.k;
import e.a.a.a.y0.m.n1.m;
import e.a.a.a.y0.m.q0;
import e.a.a.a.y0.m.u;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.m.x;
import e.a.a.a.y0.m.y0;
import e.a.a.a.y0.m.z;
import e.a.a.a.y0.o.m;
import e.b0.s;
import e.b0.t;
import e.k;
import e.r;
import e.t.o;
import e.x.b.l;
import e.x.c.i;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.Set;

public final class a {
    public static final void A(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                k(th, th2);
            }
        }
    }

    public static final Object A0(c0.a<?, ?> aVar) {
        i.e(aVar, "$this$boundReceiver");
        c0<?> H = aVar.H();
        return B(H.f7502p, H.D());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: e.v.d<? super T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: e.v.j.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: e.v.d<? super T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: e.v.d<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: e.v.d<? super T>} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> e.v.d<T> A1(e.v.d<? super T> r2) {
        /*
            java.lang.String r0 = "$this$intercepted"
            e.x.c.i.e(r2, r0)
            boolean r0 = r2 instanceof e.v.j.a.c
            if (r0 != 0) goto L_0x000b
            r0 = 0
            goto L_0x000c
        L_0x000b:
            r0 = r2
        L_0x000c:
            e.v.j.a.c r0 = (e.v.j.a.c) r0
            if (r0 == 0) goto L_0x0030
            e.v.d<java.lang.Object> r2 = r0.f7963i
            if (r2 == 0) goto L_0x0015
            goto L_0x0030
        L_0x0015:
            e.v.f r2 = r0.f7964j
            e.x.c.i.c(r2)
            int r1 = e.v.e.d
            e.v.e$a r1 = e.v.e.a.a
            e.v.f$a r2 = r2.get(r1)
            e.v.e r2 = (e.v.e) r2
            if (r2 == 0) goto L_0x002d
            e.v.d r2 = r2.q(r0)
            if (r2 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r2 = r0
        L_0x002e:
            r0.f7963i = r2
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.A1(e.v.d):e.v.d");
    }

    public static final void A2(c cVar, b bVar, y yVar, d dVar) {
        e.a.a.a.y0.c.a.a d;
        i.e(cVar, "$this$record");
        i.e(bVar, "from");
        i.e(yVar, "scopeOwner");
        i.e(dVar, "name");
        String b2 = yVar.e().b();
        i.d(b2, "scopeOwner.fqName.asString()");
        String e2 = dVar.e();
        i.d(e2, "name.asString()");
        i.e(cVar, "$this$recordPackageLookup");
        i.e(bVar, "from");
        i.e(b2, "packageFqName");
        i.e(e2, "name");
        if (cVar != c.a.a && (d = bVar.d()) != null) {
            cVar.a(d.a(), cVar.b() ? d.b() : e.f8318j, b2, f.PACKAGE, e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r2 = i1((r0 = f3((r0 = H0(r2)))), r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object B(java.lang.Object r1, e.a.a.a.y0.b.b r2) {
        /*
            java.lang.String r0 = "descriptor"
            e.x.c.i.e(r2, r0)
            boolean r0 = r2 instanceof e.a.a.a.y0.b.f0
            if (r0 == 0) goto L_0x0013
            r0 = r2
            e.a.a.a.y0.b.x0 r0 = (e.a.a.a.y0.b.x0) r0
            boolean r0 = a2(r0)
            if (r0 == 0) goto L_0x0013
            return r1
        L_0x0013:
            e.a.a.a.y0.m.d0 r0 = H0(r2)
            if (r0 == 0) goto L_0x002c
            java.lang.Class r0 = f3(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.reflect.Method r2 = i1(r0, r2)
            if (r2 == 0) goto L_0x002c
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = r2.invoke(r1, r0)
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.B(java.lang.Object, e.a.a.a.y0.b.b):java.lang.Object");
    }

    public static float[] B0(RectF rectF) {
        return new float[]{rectF.centerX(), rectF.centerY()};
    }

    public static final boolean B1(d0 d0Var) {
        i.e(d0Var, "$this$isCaptured");
        return d0Var.W0() instanceof e.a.a.a.y0.j.s.a.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r0 != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String B2(e.a.a.a.y0.f.d r7) {
        /*
            java.lang.String r0 = "$this$render"
            e.x.c.i.e(r7, r0)
            boolean r0 = r7.f9211i
            r1 = 0
            java.lang.String r2 = "asString()"
            if (r0 == 0) goto L_0x000d
            goto L_0x0040
        L_0x000d:
            java.lang.String r0 = r7.e()
            e.x.c.i.d(r0, r2)
            java.util.Set<java.lang.String> r3 = e.a.a.a.y0.i.m.a
            boolean r3 = r3.contains(r0)
            r4 = 1
            if (r3 != 0) goto L_0x003f
            r3 = r1
        L_0x001e:
            int r5 = r0.length()
            if (r3 >= r5) goto L_0x003c
            char r5 = r0.charAt(r3)
            boolean r6 = java.lang.Character.isLetterOrDigit(r5)
            if (r6 != 0) goto L_0x0034
            r6 = 95
            if (r5 == r6) goto L_0x0034
            r5 = r4
            goto L_0x0035
        L_0x0034:
            r5 = r1
        L_0x0035:
            if (r5 == 0) goto L_0x0039
            r0 = r4
            goto L_0x003d
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x003c:
            r0 = r1
        L_0x003d:
            if (r0 == 0) goto L_0x0040
        L_0x003f:
            r1 = r4
        L_0x0040:
            if (r1 == 0) goto L_0x006e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = r7.e()
            e.x.c.i.d(r7, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 96
            java.lang.String r3 = java.lang.String.valueOf(r2)
            r1.append(r3)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.append(r7)
            r0.append(r2)
            java.lang.String r7 = r0.toString()
            goto L_0x0075
        L_0x006e:
            java.lang.String r7 = r7.e()
            e.x.c.i.d(r7, r2)
        L_0x0075:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.B2(e.a.a.a.y0.f.d):java.lang.String");
    }

    public static final <T> int C(Iterable<? extends T> iterable, int i2) {
        i.e(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static e.a.a.a.y0.f.c C0(k kVar) {
        i.e(kVar, "$this$getClassFqNameUnsafe");
        if (kVar instanceof v0) {
            h d = ((v0) kVar).d();
            Objects.requireNonNull(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return e.a.a.a.y0.j.v.b.i((e.a.a.a.y0.b.e) d);
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public static boolean C1(k kVar) {
        i.e(kVar, "$this$isClassTypeConstructor");
        if (kVar instanceof v0) {
            return ((v0) kVar).d() instanceof e.a.a.a.y0.b.e;
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public static final String C2(List<d> list) {
        i.e(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (d next : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(B2(next));
        }
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final <T extends Comparable<?>> int D(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static final e.a.a.a.y0.f.a D0(e.a.a.a.y0.e.z.c cVar, int i2) {
        i.e(cVar, "$this$getClassId");
        e.a.a.a.y0.f.a f = e.a.a.a.y0.f.a.f(cVar.c(i2), cVar.b(i2));
        i.d(f, "ClassId.fromString(getQu… isLocalClassName(index))");
        return f;
    }

    public static boolean D1(m mVar, g gVar) {
        i.e(gVar, "$this$isDefinitelyNotNullType");
        e.a.a.a.y0.m.n1.h a = mVar.a(gVar);
        return (a != null ? mVar.v(a) : null) != null;
    }

    public static final d0 D2(d0 d0Var, List<? extends y0> list, e.a.a.a.y0.b.a1.h hVar) {
        i.e(d0Var, "$this$replace");
        i.e(list, "newArguments");
        i.e(hVar, "newAnnotations");
        if ((list.isEmpty() || list == d0Var.V0()) && hVar == d0Var.k()) {
            return d0Var;
        }
        i1 Z0 = d0Var.Z0();
        if (Z0 instanceof x) {
            x xVar = (x) Z0;
            return e0.c(E2(xVar.f9767i, list, hVar), E2(xVar.f9768j, list, hVar));
        } else if (Z0 instanceof k0) {
            return E2((k0) Z0, list, hVar);
        } else {
            throw new e.h();
        }
    }

    public static final e.a.a.a.y0.b.a1.h E(e.a.a.a.y0.b.a1.h hVar, e.a.a.a.y0.b.a1.h hVar2) {
        i.e(hVar, "first");
        i.e(hVar2, "second");
        if (hVar.isEmpty()) {
            return hVar2;
        }
        if (hVar2.isEmpty()) {
            return hVar;
        }
        return new e.a.a.a.y0.b.a1.k(hVar, hVar2);
    }

    public static Collection E0(e.a.a.a.y0.j.y.k kVar, e.a.a.a.y0.j.y.d dVar, l lVar, int i2, Object obj) {
        l<d, Boolean> lVar2;
        if ((i2 & 1) != 0) {
            dVar = e.a.a.a.y0.j.y.d.f9446n;
        }
        if ((i2 & 2) != 0) {
            Objects.requireNonNull(e.a.a.a.y0.j.y.i.a);
            lVar2 = i.a.a;
        } else {
            lVar2 = null;
        }
        return kVar.c(dVar, lVar2);
    }

    public static final boolean E1(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$isDynamic");
        return d0Var.Z0() instanceof u;
    }

    public static final k0 E2(k0 k0Var, List<? extends y0> list, e.a.a.a.y0.b.a1.h hVar) {
        e.x.c.i.e(k0Var, "$this$replace");
        e.x.c.i.e(list, "newArguments");
        e.x.c.i.e(hVar, "newAnnotations");
        if (list.isEmpty() && hVar == k0Var.k()) {
            return k0Var;
        }
        if (list.isEmpty()) {
            return k0Var.e1(hVar);
        }
        return e0.g(hVar, k0Var.W0(), list, k0Var.X0(), (e.a.a.a.y0.m.l1.f) null, 16);
    }

    public static final List<r0> F(e.a.a.a.y0.b.i iVar) {
        List<r0> list;
        e.a.a.a.y0.b.k kVar;
        v0 p2;
        e.x.c.i.e(iVar, "$this$computeConstructorTypeParameters");
        List<r0> A = iVar.A();
        e.x.c.i.d(A, "declaredTypeParameters");
        if (!iVar.t() && !(iVar.b() instanceof e.a.a.a.y0.b.a)) {
            return A;
        }
        e.b0.h<e.a.a.a.y0.b.k> l2 = e.a.a.a.y0.j.v.b.l(iVar);
        s0 s0Var = s0.f7833h;
        e.x.c.i.e(l2, "$this$takeWhile");
        e.x.c.i.e(s0Var, "predicate");
        List j2 = s.j(s.e(s.c(new t(l2, s0Var), t0.f7834h), u0.f7835h));
        Iterator<e.a.a.a.y0.b.k> it = e.a.a.a.y0.j.v.b.l(iVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                kVar = null;
                break;
            }
            kVar = it.next();
            if (kVar instanceof e.a.a.a.y0.b.e) {
                break;
            }
        }
        e.a.a.a.y0.b.e eVar = (e.a.a.a.y0.b.e) kVar;
        if (!(eVar == null || (p2 = eVar.p()) == null)) {
            list = p2.g();
        }
        if (list == null) {
            list = o.f7934h;
        }
        if (!j2.isEmpty() || !list.isEmpty()) {
            List<T> I = e.t.g.I(j2, list);
            ArrayList arrayList = new ArrayList(C(I, 10));
            for (T t : I) {
                e.x.c.i.d(t, "it");
                arrayList.add(new e.a.a.a.y0.b.c(t, iVar, A.size()));
            }
            return e.t.g.I(A, arrayList);
        }
        List<r0> A2 = iVar.A();
        e.x.c.i.d(A2, "declaredTypeParameters");
        return A2;
    }

    public static float[] F0(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    public static boolean F1(m mVar, g gVar) {
        e.x.c.i.e(gVar, "$this$isDynamic");
        e.a.a.a.y0.m.n1.f u = mVar.u(gVar);
        return (u != null ? mVar.y(u) : null) != null;
    }

    public static /* synthetic */ k0 F2(k0 k0Var, List<y0> list, e.a.a.a.y0.b.a1.h hVar, int i2) {
        if ((i2 & 1) != 0) {
            list = k0Var.V0();
        }
        if ((i2 & 2) != 0) {
            hVar = k0Var.k();
        }
        return E2(k0Var, list, hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r3.q(r4) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.a.a.y0.m.n1.g G(e.a.a.a.y0.m.e1 r3, e.a.a.a.y0.m.n1.g r4, java.util.HashSet<e.a.a.a.y0.m.n1.k> r5) {
        /*
            e.a.a.a.y0.m.n1.k r0 = r3.o(r4)
            boolean r1 = r5.add(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000c
            return r2
        L_0x000c:
            e.a.a.a.y0.m.n1.l r1 = r3.s(r0)
            if (r1 == 0) goto L_0x0032
            e.a.a.a.y0.m.n1.g r0 = r3.j(r1)
            e.a.a.a.y0.m.n1.g r5 = G(r3, r0, r5)
            if (r5 == 0) goto L_0x0030
            boolean r0 = r3.r(r5)
            if (r0 != 0) goto L_0x002e
            boolean r4 = r3.q(r4)
            if (r4 != 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            e.a.a.a.y0.m.n1.g r4 = r3.z(r5)
            goto L_0x0061
        L_0x002e:
            r4 = r5
            goto L_0x0061
        L_0x0030:
            r4 = r2
            goto L_0x0061
        L_0x0032:
            boolean r0 = r3.h(r0)
            if (r0 == 0) goto L_0x0061
            e.a.a.a.y0.m.n1.g r0 = r3.i(r4)
            if (r0 == 0) goto L_0x0060
            e.a.a.a.y0.m.n1.g r5 = G(r3, r0, r5)
            if (r5 == 0) goto L_0x0060
            boolean r0 = r3.r(r4)
            if (r0 != 0) goto L_0x004b
            goto L_0x002e
        L_0x004b:
            boolean r0 = r3.r(r5)
            if (r0 == 0) goto L_0x0052
            goto L_0x0061
        L_0x0052:
            boolean r0 = r5 instanceof e.a.a.a.y0.m.n1.h
            if (r0 == 0) goto L_0x0029
            r0 = r5
            e.a.a.a.y0.m.n1.h r0 = (e.a.a.a.y0.m.n1.h) r0
            boolean r0 = r3.B(r0)
            if (r0 == 0) goto L_0x0029
            goto L_0x0061
        L_0x0060:
            return r2
        L_0x0061:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.G(e.a.a.a.y0.m.e1, e.a.a.a.y0.m.n1.g, java.util.HashSet):e.a.a.a.y0.m.n1.g");
    }

    public static final d0 G0(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$getEnhancement");
        if (d0Var instanceof g1) {
            return ((g1) d0Var).e0();
        }
        return null;
    }

    public static boolean G1(e.a.a.a.y0.b.s sVar) {
        return sVar.i() == b.a.SYNTHESIZED && e.a.a.a.y0.j.g.q(sVar.b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean G2(e.a.a.a.y0.m.d0 r4) {
        /*
            java.lang.String r0 = "$this$isInlineClassThatRequiresMangling"
            e.x.c.i.e(r4, r0)
            e.a.a.a.y0.m.v0 r1 = r4.W0()
            e.a.a.a.y0.b.h r1 = r1.d()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002f
            e.x.c.i.e(r1, r0)
            boolean r0 = M1(r1)
            if (r0 == 0) goto L_0x002a
            e.a.a.a.y0.b.e r1 = (e.a.a.a.y0.b.e) r1
            e.a.a.a.y0.f.b r0 = e.a.a.a.y0.j.v.b.h(r1)
            e.a.a.a.y0.f.b r1 = e.a.a.a.y0.j.g.f9381g
            boolean r0 = e.x.c.i.a(r0, r1)
            if (r0 != 0) goto L_0x002a
            r0 = r2
            goto L_0x002b
        L_0x002a:
            r0 = r3
        L_0x002b:
            if (r0 != r2) goto L_0x002f
            r0 = r2
            goto L_0x0030
        L_0x002f:
            r0 = r3
        L_0x0030:
            if (r0 != 0) goto L_0x003a
            boolean r4 = Y1(r4)
            if (r4 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = r3
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.G2(e.a.a.a.y0.m.d0):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        if ((r3 instanceof e.a.a.a.y0.b.g0) == false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String H(e.a.a.a.y0.b.s r3, boolean r4, boolean r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 1
            if (r0 == 0) goto L_0x0006
            r4 = r1
        L_0x0006:
            r6 = r6 & 2
            if (r6 == 0) goto L_0x000b
            r5 = r1
        L_0x000b:
            java.lang.String r6 = "$this$computeJvmDescriptor"
            e.x.c.i.e(r3, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r5 == 0) goto L_0x002e
            boolean r5 = r3 instanceof e.a.a.a.y0.b.j
            if (r5 == 0) goto L_0x001e
            java.lang.String r5 = "<init>"
            goto L_0x002b
        L_0x001e:
            e.a.a.a.y0.f.d r5 = r3.getName()
            java.lang.String r5 = r5.e()
            java.lang.String r0 = "name.asString()"
            e.x.c.i.d(r5, r0)
        L_0x002b:
            r6.append(r5)
        L_0x002e:
            java.lang.String r5 = "("
            r6.append(r5)
            e.a.a.a.y0.b.i0 r5 = r3.U()
            if (r5 == 0) goto L_0x004a
            java.lang.String r0 = "it"
            e.x.c.i.d(r5, r0)
            e.a.a.a.y0.m.d0 r5 = r5.d()
            java.lang.String r0 = "it.type"
            e.x.c.i.d(r5, r0)
            l(r6, r5)
        L_0x004a:
            java.util.List r5 = r3.n()
            java.util.Iterator r5 = r5.iterator()
        L_0x0052:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r5.next()
            e.a.a.a.y0.b.w0 r0 = (e.a.a.a.y0.b.w0) r0
            java.lang.String r2 = "parameter"
            e.x.c.i.d(r0, r2)
            e.a.a.a.y0.m.d0 r0 = r0.d()
            java.lang.String r2 = "parameter.type"
            e.x.c.i.d(r0, r2)
            l(r6, r0)
            goto L_0x0052
        L_0x0070:
            java.lang.String r5 = ")"
            r6.append(r5)
            if (r4 == 0) goto L_0x00b8
            java.lang.String r4 = "descriptor"
            e.x.c.i.e(r3, r4)
            boolean r4 = r3 instanceof e.a.a.a.y0.b.j
            if (r4 == 0) goto L_0x0081
            goto L_0x00a1
        L_0x0081:
            e.a.a.a.y0.m.d0 r4 = r3.f()
            e.x.c.i.c(r4)
            boolean r4 = e.a.a.a.y0.a.g.O(r4)
            if (r4 == 0) goto L_0x00a0
            e.a.a.a.y0.m.d0 r4 = r3.f()
            e.x.c.i.c(r4)
            boolean r4 = e.a.a.a.y0.m.f1.g(r4)
            if (r4 != 0) goto L_0x00a0
            boolean r4 = r3 instanceof e.a.a.a.y0.b.g0
            if (r4 != 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            if (r1 == 0) goto L_0x00a9
            java.lang.String r3 = "V"
            r6.append(r3)
            goto L_0x00b8
        L_0x00a9:
            e.a.a.a.y0.m.d0 r3 = r3.f()
            e.x.c.i.c(r3)
            java.lang.String r4 = "returnType!!"
            e.x.c.i.d(r3, r4)
            l(r6, r3)
        L_0x00b8:
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            e.x.c.i.d(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.H(e.a.a.a.y0.b.s, boolean, boolean, int):java.lang.String");
    }

    public static final d0 H0(e.a.a.a.y0.b.b bVar) {
        i0 U = bVar.U();
        i0 K = bVar.K();
        if (U != null) {
            return U.d();
        }
        if (K == null) {
            return null;
        }
        if (bVar instanceof j) {
            return K.d();
        }
        e.a.a.a.y0.b.k b2 = bVar.b();
        if (!(b2 instanceof e.a.a.a.y0.b.e)) {
            b2 = null;
        }
        e.a.a.a.y0.b.e eVar = (e.a.a.a.y0.b.e) b2;
        if (eVar != null) {
            return eVar.s();
        }
        return null;
    }

    public static boolean H1(k kVar, k kVar2) {
        e.x.c.i.e(kVar, "c1");
        e.x.c.i.e(kVar2, "c2");
        if (!(kVar instanceof v0)) {
            throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
        } else if (kVar2 instanceof v0) {
            return e.x.c.i.a(kVar, kVar2);
        } else {
            throw new IllegalArgumentException(b.e.a.a.a.u(kVar2, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar2, ", ")).toString());
        }
    }

    public static final e.a.a.a.y0.b.a1.h H2(e.a.a.a.y0.d.a.b0.h hVar, e.a.a.a.y0.d.a.d0.d dVar) {
        e.x.c.i.e(hVar, "$this$resolveAnnotations");
        e.x.c.i.e(dVar, "annotationsOwner");
        return new e.a.a.a.y0.d.a.b0.f(hVar, dVar);
    }

    public static final String I(e.a.a.a.y0.b.a aVar) {
        String str;
        e.x.c.i.e(aVar, "$this$computeJvmSignature");
        if (e.a.a.a.y0.j.g.t(aVar)) {
            return null;
        }
        e.a.a.a.y0.b.k b2 = aVar.b();
        if (!(b2 instanceof e.a.a.a.y0.b.e)) {
            b2 = null;
        }
        e.a.a.a.y0.b.e eVar = (e.a.a.a.y0.b.e) b2;
        if (eVar != null) {
            d name = eVar.getName();
            e.x.c.i.d(name, "classDescriptor.name");
            if (name.f9211i) {
                return null;
            }
            e.a.a.a.y0.b.a a = aVar.a();
            if (!(a instanceof l0)) {
                a = null;
            }
            l0 l0Var = (l0) a;
            if (l0Var != null) {
                String H = H(l0Var, false, false, 3);
                e.x.c.i.e(eVar, "classDescriptor");
                e.x.c.i.e(H, "jvmDescriptor");
                e.x.c.i.e(eVar, "$this$internalName");
                e.a.a.a.y0.a.p.c cVar = e.a.a.a.y0.a.p.c.f7720m;
                e.a.a.a.y0.f.c j2 = e.a.a.a.y0.j.v.b.h(eVar).j();
                e.x.c.i.d(j2, "fqNameSafe.toUnsafe()");
                e.a.a.a.y0.f.a l2 = cVar.l(j2);
                if (l2 != null) {
                    e.a.a.a.y0.j.w.b b3 = e.a.a.a.y0.j.w.b.b(l2);
                    e.x.c.i.d(b3, "JvmClassName.byClassId(it)");
                    str = b3.e();
                    e.x.c.i.d(str, "JvmClassName.byClassId(it).internalName");
                } else {
                    str = v.a(eVar, e.a.a.a.y0.d.b.t.a);
                }
                e.x.c.i.e(str, "internalName");
                e.x.c.i.e(H, "jvmDescriptor");
                return str + '.' + H;
            }
        }
        return null;
    }

    public static final <M extends h.d<M>, T> T I0(h.d<M> dVar, h.f<M, T> fVar) {
        e.x.c.i.e(dVar, "$this$getExtensionOrNull");
        e.x.c.i.e(fVar, "extension");
        if (dVar.m(fVar)) {
            return dVar.l(fVar);
        }
        return null;
    }

    public static final boolean I1(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$isError");
        i1 Z0 = d0Var.Z0();
        return (Z0 instanceof e.a.a.a.y0.m.v) || ((Z0 instanceof x) && (((x) Z0).d1() instanceof e.a.a.a.y0.m.v));
    }

    public static final e.a.a.a.y0.b.e I2(w wVar, e.a.a.a.y0.f.b bVar, e.a.a.a.y0.c.a.b bVar2) {
        e.a.a.a.y0.b.l lVar;
        e.a.a.a.y0.j.y.i v0;
        e.x.c.i.e(wVar, "$this$resolveClassByFqName");
        e.x.c.i.e(bVar, "fqName");
        e.x.c.i.e(bVar2, "lookupLocation");
        e.a.a.a.y0.b.l lVar2 = null;
        if (bVar.d()) {
            return null;
        }
        e.a.a.a.y0.f.b e2 = bVar.e();
        e.x.c.i.d(e2, "fqName.parent()");
        e.a.a.a.y0.j.y.i z = wVar.o0(e2).z();
        d g2 = bVar.g();
        e.x.c.i.d(g2, "fqName.shortName()");
        e.a.a.a.y0.b.h b2 = z.b(g2, bVar2);
        if (!(b2 instanceof e.a.a.a.y0.b.e)) {
            b2 = null;
        }
        e.a.a.a.y0.b.e eVar = (e.a.a.a.y0.b.e) b2;
        if (eVar != null) {
            return eVar;
        }
        e.a.a.a.y0.f.b e3 = bVar.e();
        e.x.c.i.d(e3, "fqName.parent()");
        e.a.a.a.y0.b.e I2 = I2(wVar, e3, bVar2);
        if (I2 == null || (v0 = I2.v0()) == null) {
            lVar = null;
        } else {
            d g3 = bVar.g();
            e.x.c.i.d(g3, "fqName.shortName()");
            lVar = v0.b(g3, bVar2);
        }
        if (lVar instanceof e.a.a.a.y0.b.e) {
            lVar2 = lVar;
        }
        return (e.a.a.a.y0.b.e) lVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0024 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x016e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.a.a.y0.d.a.b0.e J(e.a.a.a.y0.d.a.b0.h r17, e.a.a.a.y0.b.a1.h r18) {
        /*
            r0 = r17
            java.lang.String r1 = "$this$computeNewDefaultTypeQualifiers"
            e.x.c.i.e(r0, r1)
            java.lang.String r1 = "additionalAnnotations"
            r2 = r18
            e.x.c.i.e(r2, r1)
            e.a.a.a.y0.d.a.b0.c r1 = r0.c
            e.a.a.a.y0.d.a.a r1 = r1.f8358q
            boolean r1 = r1.f8325b
            if (r1 == 0) goto L_0x001b
            e.a.a.a.y0.d.a.b0.e r0 = r17.a()
            return r0
        L_0x001b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r18.iterator()
        L_0x0024:
            boolean r3 = r2.hasNext()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x01a3
            java.lang.Object r3 = r2.next()
            e.a.a.a.y0.b.a1.c r3 = (e.a.a.a.y0.b.a1.c) r3
            e.a.a.a.y0.o.k r6 = e.a.a.a.y0.o.k.IGNORE
            e.a.a.a.y0.d.a.b0.c r7 = r0.c
            e.a.a.a.y0.d.a.a r7 = r7.f8358q
            java.util.Objects.requireNonNull(r7)
            java.lang.String r8 = "annotationDescriptor"
            e.x.c.i.e(r3, r8)
            e.a.a.a.y0.o.i r9 = r7.c
            boolean r9 = r9.a()
            r10 = 0
            if (r9 == 0) goto L_0x004a
            goto L_0x0079
        L_0x004a:
            java.util.Map<e.a.a.a.y0.f.b, e.a.a.a.y0.d.a.b0.k> r9 = e.a.a.a.y0.d.a.b.f8341e
            e.a.a.a.y0.f.b r11 = r3.e()
            java.lang.Object r9 = r9.get(r11)
            e.a.a.a.y0.d.a.b0.k r9 = (e.a.a.a.y0.d.a.b0.k) r9
            if (r9 == 0) goto L_0x0079
            e.a.a.a.y0.d.a.e0.h r11 = r9.a
            java.util.Collection<e.a.a.a.y0.d.a.a$a> r9 = r9.f8371b
            e.a.a.a.y0.o.k r12 = r7.b(r3)
            if (r12 == r6) goto L_0x0064
            r13 = r5
            goto L_0x0065
        L_0x0064:
            r13 = r4
        L_0x0065:
            if (r13 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r12 = r10
        L_0x0069:
            if (r12 == 0) goto L_0x0079
            e.a.a.a.y0.d.a.b0.k r13 = new e.a.a.a.y0.d.a.b0.k
            boolean r12 = r12.d()
            e.a.a.a.y0.d.a.e0.h r11 = e.a.a.a.y0.d.a.e0.h.a(r11, r10, r12, r5)
            r13.<init>(r11, r9)
            goto L_0x007a
        L_0x0079:
            r13 = r10
        L_0x007a:
            if (r13 == 0) goto L_0x007f
            r10 = r13
            goto L_0x019c
        L_0x007f:
            e.x.c.i.e(r3, r8)
            e.a.a.a.y0.o.i r8 = r7.c
            boolean r8 = r8.a()
            if (r8 == 0) goto L_0x008c
            goto L_0x0135
        L_0x008c:
            e.a.a.a.y0.b.e r8 = e.a.a.a.y0.j.v.b.e(r3)
            if (r8 == 0) goto L_0x0135
            e.a.a.a.y0.b.a1.h r9 = r8.k()
            e.a.a.a.y0.f.b r11 = e.a.a.a.y0.d.a.b.c
            boolean r9 = r9.x(r11)
            if (r9 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r8 = r10
        L_0x00a0:
            if (r8 == 0) goto L_0x0135
            e.a.a.a.y0.b.e r9 = e.a.a.a.y0.j.v.b.e(r3)
            e.x.c.i.c(r9)
            e.a.a.a.y0.b.a1.h r9 = r9.k()
            e.a.a.a.y0.b.a1.c r9 = r9.i(r11)
            e.x.c.i.c(r9)
            java.util.Map r9 = r9.a()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x00c5:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00f0
            java.lang.Object r12 = r9.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            e.a.a.a.y0.f.d r13 = (e.a.a.a.y0.f.d) r13
            java.lang.Object r12 = r12.getValue()
            e.a.a.a.y0.j.t.g r12 = (e.a.a.a.y0.j.t.g) r12
            e.a.a.a.y0.f.d r14 = e.a.a.a.y0.d.a.t.f8577b
            boolean r13 = e.x.c.i.a(r13, r14)
            if (r13 == 0) goto L_0x00ea
            java.util.List r12 = r7.a(r12)
            goto L_0x00ec
        L_0x00ea:
            e.t.o r12 = e.t.o.f7934h
        L_0x00ec:
            e.t.g.b(r11, r12)
            goto L_0x00c5
        L_0x00f0:
            java.util.Iterator r9 = r11.iterator()
            r11 = r4
        L_0x00f5:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0109
            java.lang.Object r12 = r9.next()
            e.a.a.a.y0.d.a.a$a r12 = (e.a.a.a.y0.d.a.a.C0170a) r12
            int r12 = r12.ordinal()
            int r12 = r5 << r12
            r11 = r11 | r12
            goto L_0x00f5
        L_0x0109:
            e.a.a.a.y0.b.a1.h r8 = r8.k()
            java.util.Iterator r8 = r8.iterator()
        L_0x0111:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x012a
            java.lang.Object r9 = r8.next()
            r12 = r9
            e.a.a.a.y0.b.a1.c r12 = (e.a.a.a.y0.b.a1.c) r12
            e.a.a.a.y0.b.a1.c r12 = r7.d(r12)
            if (r12 == 0) goto L_0x0126
            r12 = r5
            goto L_0x0127
        L_0x0126:
            r12 = r4
        L_0x0127:
            if (r12 == 0) goto L_0x0111
            goto L_0x012b
        L_0x012a:
            r9 = r10
        L_0x012b:
            e.a.a.a.y0.b.a1.c r9 = (e.a.a.a.y0.b.a1.c) r9
            if (r9 == 0) goto L_0x0135
            e.a.a.a.y0.d.a.a$b r8 = new e.a.a.a.y0.d.a.a$b
            r8.<init>(r9, r11)
            goto L_0x0136
        L_0x0135:
            r8 = r10
        L_0x0136:
            if (r8 == 0) goto L_0x019c
            e.a.a.a.y0.b.a1.c r9 = r8.a
            e.a.a.a.y0.d.a.a$a[] r11 = e.a.a.a.y0.d.a.a.C0170a.values()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r13 = r4
        L_0x0144:
            r14 = 4
            if (r13 >= r14) goto L_0x0171
            r14 = r11[r13]
            int r15 = r8.f8331b
            r16 = r15 & 8
            if (r16 == 0) goto L_0x0152
            r16 = r5
            goto L_0x0154
        L_0x0152:
            r16 = r4
        L_0x0154:
            if (r16 != 0) goto L_0x0168
            int r16 = r14.ordinal()
            int r16 = r5 << r16
            r15 = r15 & r16
            if (r15 == 0) goto L_0x0162
            r15 = r5
            goto L_0x0163
        L_0x0162:
            r15 = r4
        L_0x0163:
            if (r15 == 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            r15 = r4
            goto L_0x0169
        L_0x0168:
            r15 = r5
        L_0x0169:
            if (r15 == 0) goto L_0x016e
            r12.add(r14)
        L_0x016e:
            int r13 = r13 + 1
            goto L_0x0144
        L_0x0171:
            e.a.a.a.y0.o.k r3 = r7.c(r3)
            if (r3 == 0) goto L_0x0178
            goto L_0x017c
        L_0x0178:
            e.a.a.a.y0.o.k r3 = r7.b(r9)
        L_0x017c:
            java.util.Objects.requireNonNull(r3)
            if (r3 != r6) goto L_0x0182
            r4 = r5
        L_0x0182:
            if (r4 == 0) goto L_0x0185
            goto L_0x019c
        L_0x0185:
            e.a.a.a.y0.d.a.b0.c r4 = r0.c
            e.a.a.a.y0.d.a.e0.l r4 = r4.r
            e.a.a.a.y0.d.a.e0.h r4 = r4.b(r9)
            if (r4 == 0) goto L_0x019c
            boolean r3 = r3.d()
            e.a.a.a.y0.d.a.e0.h r3 = e.a.a.a.y0.d.a.e0.h.a(r4, r10, r3, r5)
            e.a.a.a.y0.d.a.b0.k r10 = new e.a.a.a.y0.d.a.b0.k
            r10.<init>(r3, r12)
        L_0x019c:
            if (r10 == 0) goto L_0x0024
            r1.add(r10)
            goto L_0x0024
        L_0x01a3:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x01ae
            e.a.a.a.y0.d.a.b0.e r0 = r17.a()
            return r0
        L_0x01ae:
            e.a.a.a.y0.d.a.b0.e r2 = r17.a()
            if (r2 == 0) goto L_0x01be
            java.util.EnumMap<e.a.a.a.y0.d.a.a$a, e.a.a.a.y0.d.a.e0.h> r2 = r2.a
            if (r2 == 0) goto L_0x01be
            java.util.EnumMap r3 = new java.util.EnumMap
            r3.<init>(r2)
            goto L_0x01c5
        L_0x01be:
            java.util.EnumMap r3 = new java.util.EnumMap
            java.lang.Class<e.a.a.a.y0.d.a.a$a> r2 = e.a.a.a.y0.d.a.a.C0170a.class
            r3.<init>(r2)
        L_0x01c5:
            java.util.Iterator r1 = r1.iterator()
        L_0x01c9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01ee
            java.lang.Object r2 = r1.next()
            e.a.a.a.y0.d.a.b0.k r2 = (e.a.a.a.y0.d.a.b0.k) r2
            e.a.a.a.y0.d.a.e0.h r6 = r2.a
            java.util.Collection<e.a.a.a.y0.d.a.a$a> r2 = r2.f8371b
            java.util.Iterator r2 = r2.iterator()
        L_0x01dd:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01c9
            java.lang.Object r4 = r2.next()
            e.a.a.a.y0.d.a.a$a r4 = (e.a.a.a.y0.d.a.a.C0170a) r4
            r3.put(r4, r6)
            r4 = r5
            goto L_0x01dd
        L_0x01ee:
            if (r4 != 0) goto L_0x01f5
            e.a.a.a.y0.d.a.b0.e r0 = r17.a()
            goto L_0x01fa
        L_0x01f5:
            e.a.a.a.y0.d.a.b0.e r0 = new e.a.a.a.y0.d.a.b0.e
            r0.<init>(r3)
        L_0x01fa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.J(e.a.a.a.y0.d.a.b0.h, e.a.a.a.y0.b.a1.h):e.a.a.a.y0.d.a.b0.e");
    }

    public static final <M extends h.d<M>, T> T J0(h.d<M> dVar, h.f<M, List<T>> fVar, int i2) {
        e.x.c.i.e(dVar, "$this$getExtensionOrNull");
        e.x.c.i.e(fVar, "extension");
        dVar.r(fVar);
        e.a.a.a.y0.h.g<h.e> gVar = dVar.f9239h;
        h.e eVar = fVar.d;
        Objects.requireNonNull(gVar);
        if (eVar.f9244k) {
            Object f = gVar.f(eVar);
            if (i2 >= (f == null ? 0 : ((List) f).size())) {
                return null;
            }
            dVar.r(fVar);
            e.a.a.a.y0.h.g<h.e> gVar2 = dVar.f9239h;
            h.e eVar2 = fVar.d;
            Objects.requireNonNull(gVar2);
            if (eVar2.f9244k) {
                Object f2 = gVar2.f(eVar2);
                if (f2 != null) {
                    return fVar.a(((List) f2).get(i2));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public static final boolean J1(e.a.a.a.y0.b.e eVar) {
        e.x.c.i.e(eVar, "$this$isFinalClass");
        return eVar.q() == e.a.a.a.y0.b.v.FINAL && eVar.i() != e.a.a.a.y0.b.f.ENUM_CLASS;
    }

    public static <D extends e.a.a.a.y0.b.b> Collection<D> J2(d dVar, Collection<D> collection, Collection<D> collection2, e.a.a.a.y0.b.e eVar, p pVar, e.a.a.a.y0.j.l lVar, boolean z) {
        if (dVar == null) {
            b(12);
            throw null;
        } else if (collection == null) {
            b(13);
            throw null;
        } else if (collection2 == null) {
            b(14);
            throw null;
        } else if (eVar == null) {
            b(15);
            throw null;
        } else if (pVar == null) {
            b(16);
            throw null;
        } else if (lVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            lVar.h(dVar, collection, collection2, eVar, new e.a.a.a.y0.d.a.z.a(pVar, linkedHashSet, z));
            return linkedHashSet;
        } else {
            b(17);
            throw null;
        }
    }

    public static final <T> boolean K(T[] tArr, T t) {
        e.x.c.i.e(tArr, "$this$contains");
        return y1(tArr, t) >= 0;
    }

    public static e.a.a.a.y0.f.b K0(e.a.a.a.y0.b.a1.c cVar) {
        e.a.a.a.y0.b.e e2 = e.a.a.a.y0.j.v.b.e(cVar);
        if (e2 == null) {
            return null;
        }
        if (e.a.a.a.y0.m.w.j(e2)) {
            e2 = null;
        }
        if (e2 != null) {
            return e.a.a.a.y0.j.v.b.d(e2);
        }
        return null;
    }

    public static final boolean K1(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$isFlexible");
        return d0Var.Z0() instanceof x;
    }

    public static <D extends e.a.a.a.y0.b.b> Collection<D> K2(d dVar, Collection<D> collection, Collection<D> collection2, e.a.a.a.y0.b.e eVar, p pVar, e.a.a.a.y0.j.l lVar) {
        if (dVar == null) {
            b(0);
            throw null;
        } else if (collection == null) {
            b(1);
            throw null;
        } else if (collection2 == null) {
            b(2);
            throw null;
        } else if (eVar == null) {
            b(3);
            throw null;
        } else if (pVar == null) {
            b(4);
            throw null;
        } else if (lVar != null) {
            return J2(dVar, collection, collection2, eVar, pVar, lVar, false);
        } else {
            b(5);
            throw null;
        }
    }

    public static final <T> Collection<T> L(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        e.x.c.i.e(iterable, "$this$convertToSetForSetOperationWith");
        e.x.c.i.e(iterable2, "source");
        if (!(iterable instanceof Set)) {
            if (iterable instanceof Collection) {
                if (((Collection) iterable2).size() >= 2) {
                    Collection<T> collection = (Collection) iterable;
                    if (!(collection.size() > 2 && (collection instanceof ArrayList))) {
                        return collection;
                    }
                }
            }
            return e.t.g.U(iterable);
        }
        return (Collection) iterable;
    }

    public static final <T> Class<T> L0(e.a.e<T> eVar) {
        e.x.c.i.e(eVar, "$this$java");
        Class<?> e2 = ((e.x.c.c) eVar).e();
        Objects.requireNonNull(e2, "null cannot be cast to non-null type java.lang.Class<T>");
        return e2;
    }

    public static final boolean L1(e.a.a.a.y0.b.a aVar) {
        e.x.c.i.e(aVar, "$this$isGetterOfUnderlyingPropertyOfInlineClass");
        if (aVar instanceof g0) {
            f0 z0 = ((g0) aVar).z0();
            e.x.c.i.d(z0, "correspondingProperty");
            if (a2(z0)) {
                return true;
            }
        }
        return false;
    }

    public static <D extends e.a.a.a.y0.b.b> Collection<D> L2(d dVar, Collection<D> collection, Collection<D> collection2, e.a.a.a.y0.b.e eVar, p pVar, e.a.a.a.y0.j.l lVar) {
        if (collection == null) {
            b(7);
            throw null;
        } else if (eVar == null) {
            b(9);
            throw null;
        } else if (pVar == null) {
            b(10);
            throw null;
        } else if (lVar != null) {
            return J2(dVar, collection, collection2, eVar, pVar, lVar, true);
        } else {
            b(11);
            throw null;
        }
    }

    public static final e.a.a.a.y0.m.n1.o M(j1 j1Var) {
        e.x.c.i.e(j1Var, "$this$convertVariance");
        int ordinal = j1Var.ordinal();
        if (ordinal == 0) {
            return e.a.a.a.y0.m.n1.o.INV;
        }
        if (ordinal == 1) {
            return e.a.a.a.y0.m.n1.o.IN;
        }
        if (ordinal == 2) {
            return e.a.a.a.y0.m.n1.o.OUT;
        }
        throw new e.h();
    }

    public static final Field M0(e.a.l<?> lVar) {
        e.x.c.i.e(lVar, "$this$javaField");
        c0<?> c = e.a.a.a.v0.c(lVar);
        if (c != null) {
            return c.J();
        }
        return null;
    }

    public static final boolean M1(e.a.a.a.y0.b.k kVar) {
        e.x.c.i.e(kVar, "$this$isInlineClass");
        return (kVar instanceof e.a.a.a.y0.b.e) && ((e.a.a.a.y0.b.e) kVar).l();
    }

    public static final q M2(e.a.a.a.y0.e.i iVar, e.a.a.a.y0.e.z.e eVar) {
        e.x.c.i.e(iVar, "$this$returnType");
        e.x.c.i.e(eVar, "typeTable");
        if (iVar.v()) {
            q qVar = iVar.f8930n;
            e.x.c.i.d(qVar, "returnType");
            return qVar;
        }
        if ((iVar.f8926j & 16) == 16) {
            return eVar.a(iVar.f8931o);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final void N(int i2, int i3) {
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r2.u();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.reflect.Method N0(e.a.h<?> r2) {
        /*
            java.lang.String r0 = "$this$javaMethod"
            e.x.c.i.e(r2, r0)
            e.a.a.a.g r2 = e.a.a.a.v0.a(r2)
            r0 = 0
            if (r2 == 0) goto L_0x0017
            e.a.a.a.x0.h r2 = r2.u()
            if (r2 == 0) goto L_0x0017
            java.lang.reflect.Member r2 = r2.e()
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            boolean r1 = r2 instanceof java.lang.reflect.Method
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.N0(e.a.h):java.lang.reflect.Method");
    }

    public static boolean N1(k kVar) {
        e.x.c.i.e(kVar, "$this$isInlineClass");
        if (kVar instanceof v0) {
            e.a.a.a.y0.b.h d = ((v0) kVar).d();
            if (!(d instanceof e.a.a.a.y0.b.e)) {
                d = null;
            }
            e.a.a.a.y0.b.e eVar = (e.a.a.a.y0.b.e) d;
            return eVar != null && eVar.l();
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public static final q N2(n nVar, e.a.a.a.y0.e.z.e eVar) {
        e.x.c.i.e(nVar, "$this$returnType");
        e.x.c.i.e(eVar, "typeTable");
        if (nVar.v()) {
            q qVar = nVar.f8987n;
            e.x.c.i.d(qVar, "returnType");
            return qVar;
        }
        if ((nVar.f8983j & 16) == 16) {
            return eVar.a(nVar.f8988o);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final long O(InputStream inputStream, OutputStream outputStream, int i2) {
        e.x.c.i.e(inputStream, "$this$copyTo");
        e.x.c.i.e(outputStream, "out");
        byte[] bArr = new byte[i2];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += (long) read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static final <T> Class<T> O0(e.a.e<T> eVar) {
        e.x.c.i.e(eVar, "$this$javaObjectType");
        Class<?> e2 = ((e.x.c.c) eVar).e();
        if (!e2.isPrimitive()) {
            return e2;
        }
        String name = e2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : e2;
            case 104431:
                return name.equals("int") ? Integer.class : e2;
            case 3039496:
                return name.equals("byte") ? Byte.class : e2;
            case 3052374:
                return name.equals("char") ? Character.class : e2;
            case 3327612:
                return name.equals("long") ? Long.class : e2;
            case 3625364:
                return name.equals("void") ? Void.class : e2;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : e2;
            case 97526364:
                return name.equals("float") ? Float.class : e2;
            case 109413500:
                return name.equals("short") ? Short.class : e2;
            default:
                return e2;
        }
    }

    public static final boolean O1(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$isInlineClassType");
        e.a.a.a.y0.b.h d = d0Var.W0().d();
        if (d != null) {
            return M1(d);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r4 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r1 = e.t.g.d0(e.t.g.L(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        return e.t.g.P(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T O2(java.util.Set<? extends T> r1, T r2, T r3, T r4, boolean r5) {
        /*
            java.lang.String r0 = "$this$select"
            e.x.c.i.e(r1, r0)
            java.lang.String r0 = "low"
            e.x.c.i.e(r2, r0)
            java.lang.String r0 = "high"
            e.x.c.i.e(r3, r0)
            if (r5 == 0) goto L_0x0036
            boolean r5 = r1.contains(r2)
            r0 = 0
            if (r5 == 0) goto L_0x001a
            r1 = r2
            goto L_0x0023
        L_0x001a:
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x0022
            r1 = r3
            goto L_0x0023
        L_0x0022:
            r1 = r0
        L_0x0023:
            boolean r2 = e.x.c.i.a(r1, r2)
            if (r2 == 0) goto L_0x0031
            boolean r2 = e.x.c.i.a(r4, r3)
            if (r2 == 0) goto L_0x0031
            r4 = r0
            goto L_0x0035
        L_0x0031:
            if (r4 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r4 = r1
        L_0x0035:
            return r4
        L_0x0036:
            if (r4 == 0) goto L_0x0040
            java.util.Set r1 = e.t.g.L(r1, r4)
            java.util.Set r1 = e.t.g.d0(r1)
        L_0x0040:
            java.lang.Object r1 = e.t.g.P(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.O2(java.util.Set, java.lang.Object, java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    public static final List<w0> P(Collection<e.a.a.a.y0.d.a.a0.k> collection, Collection<? extends w0> collection2, e.a.a.a.y0.b.a aVar) {
        e.x.c.i.e(collection, "newValueParametersTypes");
        e.x.c.i.e(collection2, "oldValueParameters");
        e.x.c.i.e(aVar, "newOwner");
        collection.size();
        collection2.size();
        List<e.j<T, R>> f0 = e.t.g.f0(collection, collection2);
        ArrayList arrayList = new ArrayList(C(f0, 10));
        Iterator it = ((ArrayList) f0).iterator();
        while (it.hasNext()) {
            e.j jVar = (e.j) it.next();
            e.a.a.a.y0.d.a.a0.k kVar = (e.a.a.a.y0.d.a.a0.k) jVar.f7906h;
            w0 w0Var = (w0) jVar.f7907i;
            int h2 = w0Var.h();
            e.a.a.a.y0.b.a1.h k2 = w0Var.k();
            d name = w0Var.getName();
            e.x.c.i.d(name, "oldParameter.name");
            d0 d0Var = kVar.a;
            boolean z = kVar.f8339b;
            boolean E = w0Var.E();
            boolean I0 = w0Var.I0();
            d0 g2 = w0Var.R() != null ? e.a.a.a.y0.j.v.b.k(aVar).v().g(kVar.a) : null;
            m0 w = w0Var.w();
            e.x.c.i.d(w, "oldParameter.source");
            arrayList.add(new n0(aVar, (w0) null, h2, k2, name, d0Var, z, E, I0, g2, w));
        }
        return arrayList;
    }

    public static final <T> Class<T> P0(e.a.e<T> eVar) {
        e.x.c.i.e(eVar, "$this$javaPrimitiveType");
        Class<?> e2 = ((e.x.c.c) eVar).e();
        if (e2.isPrimitive()) {
            return e2;
        }
        String name = e2.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    public static boolean P1(k kVar) {
        e.x.c.i.e(kVar, "$this$isIntegerLiteralTypeConstructor");
        if (kVar instanceof v0) {
            return kVar instanceof e.a.a.a.y0.j.t.q;
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public static final e.a.a.a.y0.d.a.e0.g P2(Set<? extends e.a.a.a.y0.d.a.e0.g> set, e.a.a.a.y0.d.a.e0.g gVar, boolean z) {
        e.x.c.i.e(set, "$this$select");
        e.a.a.a.y0.d.a.e0.g gVar2 = e.a.a.a.y0.d.a.e0.g.FORCE_FLEXIBILITY;
        return gVar == gVar2 ? gVar2 : (e.a.a.a.y0.d.a.e0.g) O2(set, e.a.a.a.y0.d.a.e0.g.NOT_NULL, e.a.a.a.y0.d.a.e0.g.NULLABLE, gVar, z);
    }

    public static final e.a.a.a.y0.d.a.b0.h Q(e.a.a.a.y0.d.a.b0.h hVar, e.a.a.a.y0.b.a1.h hVar2) {
        e.x.c.i.e(hVar, "$this$copyWithNewDefaultTypeQualifiers");
        e.x.c.i.e(hVar2, "additionalAnnotations");
        return hVar2.isEmpty() ? hVar : new e.a.a.a.y0.d.a.b0.h(hVar.c, hVar.d, g2(e.g.NONE, new e.a.a.a.y0.d.a.b0.b(hVar, hVar2)));
    }

    public static final Type Q0(e.a.n nVar) {
        Type A;
        e.x.c.i.e(nVar, "$this$javaType");
        Type A2 = ((e.a.a.a.i0) nVar).A();
        if (A2 != null) {
            return A2;
        }
        e.x.c.i.e(nVar, "$this$javaType");
        if (!(nVar instanceof e.x.c.j) || (A = ((e.x.c.j) nVar).A()) == null) {
            return e.a.u.b(nVar, false);
        }
        return A;
    }

    public static final boolean Q1(f0 f0Var) {
        e.x.c.i.e(f0Var, "$this$isJavaField");
        return f0Var.j() == null;
    }

    public static final <H> Collection<H> Q2(Collection<? extends H> collection, l<? super H, ? extends e.a.a.a.y0.b.a> lVar) {
        Object obj;
        e.x.c.i.e(collection, "$this$selectMostSpecificInEachOverridableGroup");
        e.x.c.i.e(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        e.a.a.a.y0.o.m a = m.b.a();
        while (!linkedList.isEmpty()) {
            Object o2 = e.t.g.o(linkedList);
            e.a.a.a.y0.o.m a2 = m.b.a();
            Collection<H> g2 = e.a.a.a.y0.j.l.g(o2, linkedList, lVar, new e.a.a.a.y0.j.p(a2));
            e.x.c.i.d(g2, "OverridingUtil.extractMe…nflictedHandles.add(it) }");
            ArrayList arrayList = (ArrayList) g2;
            if (arrayList.size() != 1 || !a2.isEmpty()) {
                obj = e.a.a.a.y0.j.l.s(g2, lVar);
                e.x.c.i.d(obj, "OverridingUtil.selectMos…roup, descriptorByHandle)");
                e.a.a.a.y0.b.a aVar = (e.a.a.a.y0.b.a) lVar.invoke(obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    e.x.c.i.d(next, "it");
                    if (!e.a.a.a.y0.j.l.k(aVar, (e.a.a.a.y0.b.a) lVar.invoke(next))) {
                        a2.add(next);
                    }
                }
                if (!a2.isEmpty()) {
                    a.addAll(a2);
                }
            } else {
                obj = e.t.g.N(g2);
                e.x.c.i.d(obj, "overridableGroup.single()");
            }
            a.add(obj);
        }
        return a;
    }

    public static final <T> T R(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        e.x.c.i.e(cls, "annotationClass");
        e.x.c.i.e(map, "values");
        e.x.c.i.e(list, "methods");
        e.a.a.a.x0.b bVar = new e.a.a.a.x0.b(cls, list, map);
        e.f h2 = h2(new e.a.a.a.x0.c(map));
        e.f h22 = h2(new e.a.a.a.x0.f(cls, map));
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new e.a.a.a.x0.d(cls, h22, (e.a.l) null, h2, (e.a.l) null, bVar, map));
        Objects.requireNonNull(newProxyInstance, "null cannot be cast to non-null type T");
        return newProxyInstance;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: e.a.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.e<?> R0(e.a.f r5) {
        /*
            java.lang.String r0 = "$this$jvmErasure"
            e.x.c.i.e(r5, r0)
            boolean r0 = r5 instanceof e.a.e
            if (r0 == 0) goto L_0x000c
            e.a.e r5 = (e.a.e) r5
            goto L_0x0072
        L_0x000c:
            boolean r0 = r5 instanceof e.a.o
            if (r0 == 0) goto L_0x0073
            e.a.o r5 = (e.a.o) r5
            java.util.List r5 = r5.getUpperBounds()
            java.util.Iterator r0 = r5.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r0.next()
            r3 = r1
            e.a.n r3 = (e.a.n) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"
            java.util.Objects.requireNonNull(r3, r4)
            e.a.a.a.i0 r3 = (e.a.a.a.i0) r3
            e.a.a.a.y0.m.d0 r3 = r3.f7548k
            e.a.a.a.y0.m.v0 r3 = r3.W0()
            e.a.a.a.y0.b.h r3 = r3.d()
            boolean r4 = r3 instanceof e.a.a.a.y0.b.e
            if (r4 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r2 = r3
        L_0x003f:
            e.a.a.a.y0.b.e r2 = (e.a.a.a.y0.b.e) r2
            if (r2 == 0) goto L_0x0055
            e.a.a.a.y0.b.f r3 = r2.i()
            e.a.a.a.y0.b.f r4 = e.a.a.a.y0.b.f.INTERFACE
            if (r3 == r4) goto L_0x0055
            e.a.a.a.y0.b.f r2 = r2.i()
            e.a.a.a.y0.b.f r3 = e.a.a.a.y0.b.f.ANNOTATION_CLASS
            if (r2 == r3) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x001a
            r2 = r1
        L_0x0059:
            e.a.n r2 = (e.a.n) r2
            if (r2 == 0) goto L_0x005e
            goto L_0x0065
        L_0x005e:
            java.lang.Object r5 = e.t.g.q(r5)
            r2 = r5
            e.a.n r2 = (e.a.n) r2
        L_0x0065:
            if (r2 == 0) goto L_0x006c
            e.a.e r5 = S0(r2)
            goto L_0x0072
        L_0x006c:
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            e.a.e r5 = e.x.c.v.a(r5)
        L_0x0072:
            return r5
        L_0x0073:
            e.a.a.a.l0 r0 = new e.a.a.a.l0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot calculate JVM erasure for type: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.R0(e.a.f):e.a.e");
    }

    public static boolean R1(e.a.a.a.y0.m.l1.c cVar, g gVar) {
        e.x.c.i.e(gVar, "$this$isMarkedNullable");
        e.x.c.i.e(gVar, "$this$isMarkedNullable");
        return (gVar instanceof e.a.a.a.y0.m.n1.h) && cVar.f((e.a.a.a.y0.m.n1.h) gVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r3 = r3.C();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R2(e.a.d<?> r3, boolean r4) {
        /*
            java.lang.String r0 = "$this$isAccessible"
            e.x.c.i.e(r3, r0)
            boolean r0 = r3 instanceof e.a.i
            java.lang.String r1 = "$this$javaGetter"
            if (r0 == 0) goto L_0x0039
            r0 = r3
            e.a.l r0 = (e.a.l) r0
            java.lang.reflect.Field r2 = M0(r0)
            if (r2 == 0) goto L_0x0017
            r2.setAccessible(r4)
        L_0x0017:
            e.x.c.i.e(r0, r1)
            e.a.l$b r0 = r0.j()
            java.lang.reflect.Method r0 = N0(r0)
            if (r0 == 0) goto L_0x0027
            r0.setAccessible(r4)
        L_0x0027:
            e.a.i r3 = (e.a.i) r3
            java.lang.String r0 = "$this$javaSetter"
            e.x.c.i.e(r3, r0)
            e.a.i$a r3 = r3.m()
            java.lang.reflect.Method r3 = N0(r3)
            if (r3 == 0) goto L_0x00e7
            goto L_0x008f
        L_0x0039:
            boolean r0 = r3 instanceof e.a.l
            if (r0 == 0) goto L_0x0056
            e.a.l r3 = (e.a.l) r3
            java.lang.reflect.Field r0 = M0(r3)
            if (r0 == 0) goto L_0x0048
            r0.setAccessible(r4)
        L_0x0048:
            e.x.c.i.e(r3, r1)
            e.a.l$b r3 = r3.j()
            java.lang.reflect.Method r3 = N0(r3)
            if (r3 == 0) goto L_0x00e7
            goto L_0x008f
        L_0x0056:
            boolean r0 = r3 instanceof e.a.l.b
            if (r0 == 0) goto L_0x0073
            r0 = r3
            e.a.l$b r0 = (e.a.l.b) r0
            e.a.l r0 = r0.p()
            java.lang.reflect.Field r0 = M0(r0)
            if (r0 == 0) goto L_0x006a
            r0.setAccessible(r4)
        L_0x006a:
            e.a.h r3 = (e.a.h) r3
            java.lang.reflect.Method r3 = N0(r3)
            if (r3 == 0) goto L_0x00e7
            goto L_0x008f
        L_0x0073:
            boolean r0 = r3 instanceof e.a.i.a
            if (r0 == 0) goto L_0x0093
            r0 = r3
            e.a.i$a r0 = (e.a.i.a) r0
            e.a.l r0 = r0.p()
            java.lang.reflect.Field r0 = M0(r0)
            if (r0 == 0) goto L_0x0087
            r0.setAccessible(r4)
        L_0x0087:
            e.a.h r3 = (e.a.h) r3
            java.lang.reflect.Method r3 = N0(r3)
            if (r3 == 0) goto L_0x00e7
        L_0x008f:
            r3.setAccessible(r4)
            goto L_0x00e7
        L_0x0093:
            boolean r0 = r3 instanceof e.a.h
            if (r0 == 0) goto L_0x00e8
            r0 = r3
            e.a.h r0 = (e.a.h) r0
            java.lang.reflect.Method r1 = N0(r0)
            if (r1 == 0) goto L_0x00a3
            r1.setAccessible(r4)
        L_0x00a3:
            e.a.a.a.g r3 = e.a.a.a.v0.a(r3)
            r1 = 0
            if (r3 == 0) goto L_0x00b5
            e.a.a.a.x0.h r3 = r3.C()
            if (r3 == 0) goto L_0x00b5
            java.lang.reflect.Member r3 = r3.e()
            goto L_0x00b6
        L_0x00b5:
            r3 = r1
        L_0x00b6:
            boolean r2 = r3 instanceof java.lang.reflect.AccessibleObject
            if (r2 != 0) goto L_0x00bb
            r3 = r1
        L_0x00bb:
            java.lang.reflect.AccessibleObject r3 = (java.lang.reflect.AccessibleObject) r3
            if (r3 == 0) goto L_0x00c3
            r2 = 1
            r3.setAccessible(r2)
        L_0x00c3:
            java.lang.String r3 = "$this$javaConstructor"
            e.x.c.i.e(r0, r3)
            e.a.a.a.g r3 = e.a.a.a.v0.a(r0)
            if (r3 == 0) goto L_0x00d9
            e.a.a.a.x0.h r3 = r3.u()
            if (r3 == 0) goto L_0x00d9
            java.lang.reflect.Member r3 = r3.e()
            goto L_0x00da
        L_0x00d9:
            r3 = r1
        L_0x00da:
            boolean r0 = r3 instanceof java.lang.reflect.Constructor
            if (r0 != 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r1 = r3
        L_0x00e0:
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            if (r1 == 0) goto L_0x00e7
            r1.setAccessible(r4)
        L_0x00e7:
            return
        L_0x00e8:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown callable: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.R2(e.a.d, boolean):void");
    }

    public static final y0 S(y0 y0Var, r0 r0Var) {
        if (r0Var == null || y0Var.b() == j1.INVARIANT) {
            return y0Var;
        }
        if (r0Var.u() != y0Var.b()) {
            e.x.c.i.e(y0Var, "typeProjection");
            e.a.a.a.y0.j.s.a.c cVar = new e.a.a.a.y0.j.s.a.c(y0Var);
            Objects.requireNonNull(e.a.a.a.y0.b.a1.h.f7785e);
            return new a1(new e.a.a.a.y0.j.s.a.a(y0Var, cVar, false, h.a.a));
        } else if (!y0Var.c()) {
            return new a1(y0Var.d());
        } else {
            e.a.a.a.y0.l.m mVar = e.a.a.a.y0.l.e.f9624e;
            e.x.c.i.d(mVar, "LockBasedStorageManager.NO_LOCKS");
            return new a1(new e.a.a.a.y0.m.g0(mVar, new e.a.a.a.y0.j.s.a.d(y0Var)));
        }
    }

    public static final e.a.e<?> S0(e.a.n nVar) {
        e.a.e<?> R0;
        e.x.c.i.e(nVar, "$this$jvmErasure");
        e.a.f b2 = nVar.b();
        if (b2 != null && (R0 = R0(b2)) != null) {
            return R0;
        }
        throw new e.a.a.a.l0("Cannot calculate JVM erasure for type: " + nVar);
    }

    public static boolean S1(e.a.a.a.y0.m.n1.h hVar) {
        e.x.c.i.e(hVar, "$this$isMarkedNullable");
        if (hVar instanceof k0) {
            return ((k0) hVar).X0();
        }
        throw new IllegalArgumentException(b.e.a.a.a.t(hVar, b.e.a.a.a.D("ClassicTypeSystemContext couldn't handle: ", hVar, ", ")).toString());
    }

    public static final <T> Set<T> S2(T t) {
        Set<T> singleton = Collections.singleton(t);
        e.x.c.i.d(singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }

    public static final <R, T> e.v.d<r> T(e.x.b.p<? super R, ? super e.v.d<? super T>, ? extends Object> pVar, R r, e.v.d<? super T> dVar) {
        e.x.c.i.e(pVar, "$this$createCoroutineUnintercepted");
        e.x.c.i.e(dVar, "completion");
        e.x.c.i.e(dVar, "completion");
        if (pVar instanceof e.v.j.a.a) {
            return ((e.v.j.a.a) pVar).a(r, dVar);
        }
        e.v.f context = dVar.getContext();
        return context == e.v.h.f7949h ? new e.v.i.b(dVar, dVar, pVar, r) : new e.v.i.c(dVar, context, dVar, context, pVar, r);
    }

    public static final String T0(e.a.a.a.y0.b.b bVar) {
        e.x.c.i.e(bVar, "callableMemberDescriptor");
        e.a.a.a.y0.b.b Z0 = e.a.a.a.y0.a.g.B(bVar) ? Z0(bVar) : null;
        if (Z0 == null) {
            return null;
        }
        e.a.a.a.y0.b.b m2 = e.a.a.a.y0.j.v.b.m(Z0);
        if (m2 instanceof f0) {
            return e.a.a.a.y0.d.a.g.f8571e.a(m2);
        }
        if (!(m2 instanceof l0)) {
            return null;
        }
        e.a.a.a.y0.d.a.d dVar = e.a.a.a.y0.d.a.d.f;
        l0 l0Var = (l0) m2;
        e.x.c.i.e(l0Var, "functionDescriptor");
        Map<String, d> map = e.a.a.a.y0.d.a.d.c;
        String I = I(l0Var);
        d dVar2 = I != null ? map.get(I) : null;
        if (dVar2 != null) {
            return dVar2.e();
        }
        return null;
    }

    public static boolean T1(e.a.a.a.y0.m.n1.m mVar, g gVar) {
        e.x.c.i.e(gVar, "$this$isNothing");
        return mVar.l(mVar.o(gVar)) && !mVar.r(gVar);
    }

    public static final char T2(char[] cArr) {
        e.x.c.i.e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static e.a.a.a.y0.b.c1.f0 U(f0 f0Var, e.a.a.a.y0.b.a1.h hVar) {
        if (hVar != null) {
            return a0(f0Var, hVar, true, false, false, f0Var.w());
        }
        c(14);
        throw null;
    }

    public static final <T> e.a.e<T> U0(Class<T> cls) {
        e.x.c.i.e(cls, "$this$kotlin");
        return e.x.c.v.a(cls);
    }

    public static boolean U1(k kVar) {
        e.x.c.i.e(kVar, "$this$isNothingConstructor");
        if (kVar instanceof v0) {
            return e.a.a.a.y0.a.g.M((v0) kVar, e.a.a.a.y0.a.g.f7647k.f7653b);
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public static final <T> T U2(T[] tArr) {
        e.x.c.i.e(tArr, "$this$single");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static e.a.a.a.y0.b.c1.g0 V(f0 f0Var, e.a.a.a.y0.b.a1.h hVar, e.a.a.a.y0.b.a1.h hVar2) {
        if (hVar == null) {
            c(1);
            throw null;
        } else if (hVar2 != null) {
            m0 w = f0Var.w();
            if (w != null) {
                return f0(f0Var, hVar, hVar2, true, false, false, f0Var.getVisibility(), w);
            }
            c(6);
            throw null;
        } else {
            c(2);
            throw null;
        }
    }

    public static final <T> int V0(T[] tArr) {
        e.x.c.i.e(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    public static boolean V1(g gVar) {
        e.x.c.i.e(gVar, "$this$isNullableType");
        if (gVar instanceof d0) {
            return f1.g((d0) gVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + e.x.c.v.a(gVar.getClass())).toString());
    }

    public static int V2(e.a.a.a.y0.m.n1.m mVar, e.a.a.a.y0.m.n1.i iVar) {
        e.x.c.i.e(iVar, "$this$size");
        if (iVar instanceof e.a.a.a.y0.m.n1.h) {
            return mVar.c((g) iVar);
        }
        if (iVar instanceof e.a.a.a.y0.m.n1.a) {
            return ((e.a.a.a.y0.m.n1.a) iVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + iVar + ", " + e.x.c.v.a(iVar.getClass())).toString());
    }

    public static l0 W(e.a.a.a.y0.b.e eVar) {
        e.a.a.a.y0.b.e eVar2 = eVar;
        if (eVar2 != null) {
            h.a aVar = e.a.a.a.y0.b.a1.h.f7785e;
            Objects.requireNonNull(aVar);
            e.a.a.a.y0.b.a1.h hVar = h.a.a;
            e.a.a.a.y0.b.c1.i0 c1 = e.a.a.a.y0.b.c1.i0.c1(eVar2, hVar, e.a.a.a.y0.j.g.f9379b, b.a.SYNTHESIZED, eVar.w());
            Objects.requireNonNull(aVar);
            e.a.a.a.y0.b.c1.i0 i0Var = c1;
            e.a.a.a.y0.b.c1.i0 e1 = i0Var.V0((i0) null, (i0) null, Collections.emptyList(), Collections.singletonList(new n0(c1, (w0) null, 0, hVar, d.l("value"), e.a.a.a.y0.j.v.b.f(eVar).w(), false, false, false, (d0) null, eVar.w())), eVar.s(), e.a.a.a.y0.b.v.FINAL, e.a.a.a.y0.b.y0.f7850e);
            if (e1 != null) {
                return e1;
            }
            c(25);
            throw null;
        }
        c(24);
        throw null;
    }

    @TargetApi(17)
    public static int W0() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(3379, iArr3, 0);
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
        EGL14.eglTerminate(eglGetDisplay);
        return iArr3[0];
    }

    public static boolean W1(e.a.a.a.y0.m.n1.h hVar) {
        e.x.c.i.e(hVar, "$this$isPrimitiveType");
        if (hVar instanceof d0) {
            return e.a.a.a.y0.a.g.J((d0) hVar);
        }
        throw new IllegalArgumentException(b.e.a.a.a.t(hVar, b.e.a.a.a.D("ClassicTypeSystemContext couldn't handle: ", hVar, ", ")).toString());
    }

    public static final <T> void W2(List<T> list, Comparator<? super T> comparator) {
        e.x.c.i.e(list, "$this$sortWith");
        e.x.c.i.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static l0 X(e.a.a.a.y0.b.e eVar) {
        if (eVar != null) {
            Objects.requireNonNull(e.a.a.a.y0.b.a1.h.f7785e);
            e.a.a.a.y0.b.c1.i0 e1 = e.a.a.a.y0.b.c1.i0.c1(eVar, h.a.a, e.a.a.a.y0.j.g.a, b.a.SYNTHESIZED, eVar.w()).V0((i0) null, (i0) null, Collections.emptyList(), Collections.emptyList(), e.a.a.a.y0.j.v.b.f(eVar).h(j1.INVARIANT, eVar.s()), e.a.a.a.y0.b.v.FINAL, e.a.a.a.y0.b.y0.f7850e);
            if (e1 != null) {
                return e1;
            }
            c(23);
            throw null;
        }
        c(22);
        throw null;
    }

    public static final d X0(e.a.a.a.y0.e.z.c cVar, int i2) {
        e.x.c.i.e(cVar, "$this$getName");
        d j2 = d.j(cVar.a(i2));
        e.x.c.i.d(j2, "Name.guessByFirstCharacter(getString(index))");
        return j2;
    }

    public static boolean X1(e.a.a.a.y0.m.n1.j jVar) {
        e.x.c.i.e(jVar, "$this$isStarProjection");
        if (jVar instanceof y0) {
            return ((y0) jVar).c();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + e.x.c.v.a(jVar.getClass())).toString());
    }

    public static final <T> List<T> X2(T[] tArr, Comparator<? super T> comparator) {
        e.x.c.i.e(tArr, "$this$sortedWith");
        e.x.c.i.e(comparator, "comparator");
        e.x.c.i.e(tArr, "$this$sortedArrayWith");
        e.x.c.i.e(comparator, "comparator");
        if (!(tArr.length == 0)) {
            tArr = Arrays.copyOf(tArr, tArr.length);
            e.x.c.i.d(tArr, "java.util.Arrays.copyOf(this, size)");
            e.x.c.i.e(tArr, "$this$sortWith");
            e.x.c.i.e(comparator, "comparator");
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        return e.t.g.c(tArr);
    }

    public static i0 Y(e.a.a.a.y0.b.a aVar, d0 d0Var, e.a.a.a.y0.b.a1.h hVar) {
        if (hVar == null) {
            c(30);
            throw null;
        } else if (d0Var == null) {
            return null;
        } else {
            return new h0(aVar, new e.a.a.a.y0.j.y.o.b(aVar, d0Var, (e.a.a.a.y0.j.y.o.d) null), hVar);
        }
    }

    public static final Integer Y0(int[] iArr, int i2) {
        e.x.c.i.e(iArr, "$this$getOrNull");
        if (i2 >= 0) {
            e.x.c.i.e(iArr, "$this$lastIndex");
            if (i2 <= iArr.length - 1) {
                return Integer.valueOf(iArr[i2]);
            }
        }
        return null;
    }

    public static final boolean Y1(d0 d0Var) {
        e.a.a.a.y0.b.h d = d0Var.W0().d();
        if (!(d instanceof r0)) {
            d = null;
        }
        r0 r0Var = (r0) d;
        if (r0Var != null) {
            return G2(e.a.a.a.y0.m.o1.c.G(r0Var));
        }
        return false;
    }

    public static final d0 Y2(r0 r0Var) {
        e.x.c.i.e(r0Var, "$this$starProjectionType");
        e.a.a.a.y0.b.k b2 = r0Var.b();
        Objects.requireNonNull(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
        v0 p2 = ((e.a.a.a.y0.b.i) b2).p();
        e.x.c.i.d(p2, "classDescriptor.typeConstructor");
        List<r0> g2 = p2.g();
        e.x.c.i.d(g2, "classDescriptor.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(C(g2, 10));
        for (r0 r0Var2 : g2) {
            e.x.c.i.d(r0Var2, "it");
            arrayList.add(r0Var2.p());
        }
        d1 e2 = d1.e(new q0(arrayList));
        List<d0> upperBounds = r0Var.getUpperBounds();
        e.x.c.i.d(upperBounds, "this.upperBounds");
        d0 k2 = e2.k((d0) e.t.g.o(upperBounds), j1.OUT_VARIANCE);
        if (k2 != null) {
            return k2;
        }
        k0 l2 = e.a.a.a.y0.j.v.b.f(r0Var).l();
        e.x.c.i.d(l2, "builtIns.defaultBound");
        return l2;
    }

    public static final Object Z(Throwable th) {
        e.x.c.i.e(th, "exception");
        return new k.a(th);
    }

    public static final <T extends e.a.a.a.y0.b.b> T Z0(T t) {
        l lVar;
        e.x.c.i.e(t, "$this$getOverriddenBuiltinWithDifferentJvmName");
        e.a.a.a.y0.d.a.d dVar = e.a.a.a.y0.d.a.d.f;
        if (!e.a.a.a.y0.d.a.d.d.contains(t.getName())) {
            e.a.a.a.y0.d.a.g gVar = e.a.a.a.y0.d.a.g.f8571e;
            if (!e.a.a.a.y0.d.a.g.d.contains(e.a.a.a.y0.j.v.b.m(t).getName())) {
                return null;
            }
        }
        if ((t instanceof f0) || (t instanceof e.a.a.a.y0.b.e0)) {
            lVar = e.a.a.a.y0.d.a.w.f8594h;
        } else if (!(t instanceof l0)) {
            return null;
        } else {
            lVar = e.a.a.a.y0.d.a.x.f8595h;
        }
        return e.a.a.a.y0.j.v.b.c(t, false, lVar, 1);
    }

    public static boolean Z1(e.a.a.a.y0.m.n1.k kVar) {
        e.x.c.i.e(kVar, "$this$isUnderKotlinPackage");
        if (kVar instanceof v0) {
            e.a.a.a.y0.b.h d = ((v0) kVar).d();
            return d != null && e.a.a.a.y0.a.g.N(d);
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public static d1 Z2(List<r0> list, b1 b1Var, e.a.a.a.y0.b.k kVar, List<r0> list2) {
        if (b1Var == null) {
            d(1);
            throw null;
        } else if (kVar == null) {
            d(2);
            throw null;
        } else if (list2 != null) {
            d1 a3 = a3(list, b1Var, kVar, list2, (boolean[]) null);
            if (a3 != null) {
                return a3;
            }
            throw new AssertionError("Substitution failed");
        } else {
            d(3);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i2 == 1 || i2 == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static e.a.a.a.y0.b.c1.f0 a0(f0 f0Var, e.a.a.a.y0.b.a1.h hVar, boolean z, boolean z2, boolean z3, m0 m0Var) {
        if (hVar == null) {
            c(18);
            throw null;
        } else if (m0Var != null) {
            return new e.a.a.a.y0.b.c1.f0(f0Var, hVar, f0Var.q(), f0Var.getVisibility(), z, z2, z3, b.a.DECLARATION, (g0) null, m0Var);
        } else {
            c(19);
            throw null;
        }
    }

    public static final <T extends e.a.a.a.y0.b.b> T a1(T t) {
        e.x.c.i.e(t, "$this$getOverriddenSpecialBuiltin");
        T Z0 = Z0(t);
        if (Z0 != null) {
            return Z0;
        }
        e.a.a.a.y0.d.a.e eVar = e.a.a.a.y0.d.a.e.f8485g;
        d name = t.getName();
        e.x.c.i.d(name, "name");
        if (!eVar.b(name)) {
            return null;
        }
        return e.a.a.a.y0.j.v.b.c(t, false, e.a.a.a.y0.d.a.y.f8596h, 1);
    }

    public static final boolean a2(x0 x0Var) {
        e.x.c.i.e(x0Var, "$this$isUnderlyingPropertyOfInlineClass");
        e.a.a.a.y0.b.k b2 = x0Var.b();
        e.x.c.i.d(b2, "this.containingDeclaration");
        if (!M1(b2)) {
            return false;
        }
        w0 p3 = p3((e.a.a.a.y0.b.e) b2);
        return e.x.c.i.a(p3 != null ? p3.getName() : null, x0Var.getName());
    }

    public static d1 a3(List<r0> list, b1 b1Var, e.a.a.a.y0.b.k kVar, List<r0> list2, boolean[] zArr) {
        b1 b1Var2 = b1Var;
        List<r0> list3 = list2;
        if (list == null) {
            d(5);
            throw null;
        } else if (b1Var2 == null) {
            d(6);
            throw null;
        } else if (kVar == null) {
            d(7);
            throw null;
        } else if (list3 != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i2 = 0;
            for (r0 next : list) {
                e.a.a.a.y0.b.c1.m0 V0 = e.a.a.a.y0.b.c1.m0.V0(kVar, next.k(), next.Z(), next.u(), next.getName(), i2, m0.a, next.M());
                hashMap.put(next.p(), new a1(V0.s()));
                hashMap2.put(next, V0);
                list3.add(V0);
                i2++;
            }
            e.x.c.i.e(hashMap, "map");
            d1 f = d1.f(b1Var2, new e.a.a.a.y0.m.w0(hashMap, false));
            for (r0 next2 : list) {
                e.a.a.a.y0.b.c1.m0 m0Var = (e.a.a.a.y0.b.c1.m0) hashMap2.get(next2);
                for (d0 next3 : next2.getUpperBounds()) {
                    d0 k2 = f.k(next3, j1.IN_VARIANCE);
                    if (k2 == null) {
                        return null;
                    }
                    if (!(k2 == next3 || zArr == null)) {
                        zArr[0] = true;
                    }
                    m0Var.P0(k2);
                }
                m0Var.R0();
                m0Var.t = true;
            }
            return f;
        } else {
            d(8);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i2) {
        String str = i2 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i2 != 18 ? 3 : 2)];
        switch (i2) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
            case 21:
                objArr[0] = "member";
                break;
            case 22:
            case 23:
                objArr[0] = "method";
                break;
            default:
                objArr[0] = "name";
                break;
        }
        if (i2 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i2) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            case 21:
                objArr[2] = "isObjectMethodInInterface";
                break;
            case 22:
                objArr[2] = "isObjectMethod";
                break;
            case 23:
                objArr[2] = "isMethodWithOneObjectParameter";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        throw (i2 != 18 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if ((r0 != null && O1(r0)) != false) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <M extends java.lang.reflect.Member> e.a.a.a.x0.h<M> b0(e.a.a.a.x0.h<? extends M> r5, e.a.a.a.y0.b.b r6, boolean r7) {
        /*
            java.lang.String r0 = "$this$createInlineClassAwareCallerIfNeeded"
            e.x.c.i.e(r5, r0)
            java.lang.String r0 = "descriptor"
            e.x.c.i.e(r6, r0)
            boolean r0 = L1(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x006b
            java.util.List r0 = r6.n()
            java.lang.String r3 = "descriptor.valueParameters"
            e.x.c.i.d(r0, r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0023
        L_0x0021:
            r0 = r1
            goto L_0x0048
        L_0x0023:
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r0.next()
            e.a.a.a.y0.b.w0 r3 = (e.a.a.a.y0.b.w0) r3
            java.lang.String r4 = "it"
            e.x.c.i.d(r3, r4)
            e.a.a.a.y0.m.d0 r3 = r3.d()
            java.lang.String r4 = "it.type"
            e.x.c.i.d(r3, r4)
            boolean r3 = O1(r3)
            if (r3 == 0) goto L_0x0027
            r0 = r2
        L_0x0048:
            if (r0 != 0) goto L_0x006b
            e.a.a.a.y0.m.d0 r0 = r6.f()
            if (r0 == 0) goto L_0x0056
            boolean r0 = O1(r0)
            if (r0 == r2) goto L_0x006b
        L_0x0056:
            boolean r0 = r5 instanceof e.a.a.a.x0.g
            if (r0 != 0) goto L_0x006c
            e.a.a.a.y0.m.d0 r0 = H0(r6)
            if (r0 == 0) goto L_0x0068
            boolean r0 = O1(r0)
            if (r0 != r2) goto L_0x0068
            r0 = r2
            goto L_0x0069
        L_0x0068:
            r0 = r1
        L_0x0069:
            if (r0 == 0) goto L_0x006c
        L_0x006b:
            r1 = r2
        L_0x006c:
            if (r1 == 0) goto L_0x0074
            e.a.a.a.x0.j r0 = new e.a.a.a.x0.j
            r0.<init>(r6, r5, r7)
            r5 = r0
        L_0x0074:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.b0(e.a.a.a.x0.h, e.a.a.a.y0.b.b, boolean):e.a.a.a.x0.h");
    }

    public static final e.a.a.a.y0.d.a.b0.n.o b1(e.a.a.a.y0.b.e eVar) {
        e.a.a.a.y0.d.a.b0.n.o oVar;
        e.a.a.a.y0.b.e eVar2;
        e.x.c.i.e(eVar, "$this$getParentJavaStaticClassScope");
        int i2 = e.a.a.a.y0.j.v.b.a;
        e.x.c.i.e(eVar, "$this$getSuperClassNotAny");
        Iterator<d0> it = eVar.s().W0().h().iterator();
        while (true) {
            oVar = null;
            if (!it.hasNext()) {
                eVar2 = null;
                break;
            }
            d0 next = it.next();
            if (!e.a.a.a.y0.a.g.z(next)) {
                e.a.a.a.y0.b.h d = next.W0().d();
                if (e.a.a.a.y0.j.g.o(d)) {
                    Objects.requireNonNull(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    eVar2 = (e.a.a.a.y0.b.e) d;
                    break;
                }
            }
        }
        if (eVar2 == null) {
            return null;
        }
        e.a.a.a.y0.j.y.i y0 = eVar2.y0();
        if (y0 instanceof e.a.a.a.y0.d.a.b0.n.o) {
            oVar = y0;
        }
        e.a.a.a.y0.d.a.b0.n.o oVar2 = oVar;
        return oVar2 != null ? oVar2 : b1(eVar2);
    }

    public static boolean b2(byte[] bArr, int i2, int i3) {
        return v2(bArr, i2, i3) == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0047, code lost:
        if (r0.charAt(r2.length()) == '.') goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.a.a.y0.f.b b3(e.a.a.a.y0.f.b r5, e.a.a.a.y0.f.b r6) {
        /*
            java.lang.String r0 = "$this$tail"
            e.x.c.i.e(r5, r0)
            java.lang.String r0 = "prefix"
            e.x.c.i.e(r6, r0)
            java.lang.String r0 = "$this$isSubpackageOf"
            e.x.c.i.e(r5, r0)
            java.lang.String r0 = "packageName"
            e.x.c.i.e(r6, r0)
            boolean r0 = e.x.c.i.a(r5, r6)
            r1 = 1
            if (r0 == 0) goto L_0x001c
            goto L_0x0049
        L_0x001c:
            boolean r0 = r6.d()
            if (r0 == 0) goto L_0x0023
            goto L_0x0049
        L_0x0023:
            java.lang.String r0 = r5.b()
            java.lang.String r2 = "this.asString()"
            e.x.c.i.d(r0, r2)
            java.lang.String r2 = r6.b()
            java.lang.String r3 = "packageName.asString()"
            e.x.c.i.d(r2, r3)
            r3 = 0
            r4 = 2
            boolean r4 = e.c0.h.C(r0, r2, r3, r4)
            if (r4 == 0) goto L_0x004a
            int r2 = r2.length()
            char r0 = r0.charAt(r2)
            r2 = 46
            if (r0 != r2) goto L_0x004a
        L_0x0049:
            r3 = r1
        L_0x004a:
            if (r3 == 0) goto L_0x0082
            boolean r0 = r6.d()
            if (r0 == 0) goto L_0x0053
            goto L_0x0082
        L_0x0053:
            boolean r0 = e.x.c.i.a(r5, r6)
            if (r0 == 0) goto L_0x0061
            e.a.a.a.y0.f.b r5 = e.a.a.a.y0.f.b.c
            java.lang.String r6 = "FqName.ROOT"
            e.x.c.i.d(r5, r6)
            goto L_0x0082
        L_0x0061:
            e.a.a.a.y0.f.b r0 = new e.a.a.a.y0.f.b
            java.lang.String r5 = r5.b()
            java.lang.String r2 = "asString()"
            e.x.c.i.d(r5, r2)
            java.lang.String r6 = r6.b()
            int r6 = r6.length()
            int r6 = r6 + r1
            java.lang.String r5 = r5.substring(r6)
            java.lang.String r6 = "(this as java.lang.String).substring(startIndex)"
            e.x.c.i.d(r5, r6)
            r0.<init>((java.lang.String) r5)
            r5 = r0
        L_0x0082:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.b3(e.a.a.a.y0.f.b, e.a.a.a.y0.f.b):e.a.a.a.y0.f.b");
    }

    public static /* synthetic */ void c(int i2) {
        String str = (i2 == 12 || i2 == 23 || i2 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 12 || i2 == 23 || i2 == 25) ? 2 : 3)];
        switch (i2) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        if (i2 == 12) {
            objArr[1] = "createSetter";
        } else if (i2 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i2 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i2) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 12 || i2 == 23 || i2 == 25) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static <T> T c0(Class<?> cls, Class<T> cls2) {
        try {
            return cls.asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            throw new ServiceConfigurationError(b.e.a.a.a.e(cls, b.e.a.a.a.y("Provider "), " could not be instantiated."), e2);
        }
    }

    public static e.a.a.a.y0.a.i c1(e.a.a.a.y0.m.n1.k kVar) {
        e.x.c.i.e(kVar, "$this$getPrimitiveArrayType");
        if (kVar instanceof v0) {
            e.a.a.a.y0.b.h d = ((v0) kVar).d();
            Objects.requireNonNull(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return e.a.a.a.y0.a.g.s((e.a.a.a.y0.b.e) d);
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public static final <T> Iterator<T> c2(T[] tArr) {
        e.x.c.i.e(tArr, "array");
        return new e.x.c.a(tArr);
    }

    public static final void c3(Object obj) {
        if (obj instanceof k.a) {
            throw ((k.a) obj).f7908h;
        }
    }

    public static /* synthetic */ void d(int i2) {
        String str = i2 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i2 != 4 ? 3 : 2)];
        switch (i2) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i2 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i2 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        throw (i2 != 4 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public static final e.a.a.a.y0.d.a.e0.d d0(e.a.a.a.y0.d.a.e0.g gVar, e.a.a.a.y0.d.a.e0.e eVar, boolean z, boolean z2) {
        return (!z2 || gVar != e.a.a.a.y0.d.a.e0.g.NOT_NULL) ? new e.a.a.a.y0.d.a.e0.d(gVar, eVar, false, z) : new e.a.a.a.y0.d.a.e0.d(gVar, eVar, true, z);
    }

    public static e.a.a.a.y0.a.i d1(e.a.a.a.y0.m.n1.k kVar) {
        e.x.c.i.e(kVar, "$this$getPrimitiveType");
        if (kVar instanceof v0) {
            e.a.a.a.y0.b.h d = ((v0) kVar).d();
            Objects.requireNonNull(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return e.a.a.a.y0.a.g.v((e.a.a.a.y0.b.e) d);
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public static final <T, A extends Appendable> A d2(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        e.x.c.i.e(tArr, "$this$joinTo");
        e.x.c.i.e(a, "buffer");
        e.x.c.i.e(charSequence, "separator");
        e.x.c.i.e(charSequence2, "prefix");
        e.x.c.i.e(charSequence3, "postfix");
        e.x.c.i.e(charSequence4, "truncated");
        a.append(charSequence2);
        int i3 = 0;
        for (T t : tArr) {
            i3++;
            if (i3 > 1) {
                a.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            e.a.a.a.y0.m.o1.c.f(a, t, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <T, C extends Collection<? super T>> C d3(T[] tArr, C c) {
        e.x.c.i.e(tArr, "$this$toCollection");
        e.x.c.i.e(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    public static final e.a.a.a.y0.f.b e(e.a.a.a.y0.f.b bVar, String str) {
        e.a.a.a.y0.f.b c = bVar.c(d.l(str));
        e.x.c.i.d(c, "child(Name.identifier(name))");
        return c;
    }

    public static final e.a.a.a.y0.m.x0 e0(e.a.a.a.y0.b.e eVar, e.a.a.a.y0.b.e eVar2) {
        e.x.c.i.e(eVar, "from");
        e.x.c.i.e(eVar2, "to");
        eVar.A().size();
        eVar2.A().size();
        List<r0> A = eVar.A();
        e.x.c.i.d(A, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(C(A, 10));
        for (r0 p2 : A) {
            arrayList.add(p2.p());
        }
        List<r0> A2 = eVar2.A();
        e.x.c.i.d(A2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(C(A2, 10));
        for (r0 r0Var : A2) {
            e.x.c.i.d(r0Var, "it");
            k0 s = r0Var.s();
            e.x.c.i.d(s, "it.defaultType");
            arrayList2.add(e.a.a.a.y0.m.o1.c.j(s));
        }
        Map X = e.t.g.X(e.t.g.f0(arrayList, arrayList2));
        e.x.c.i.e(X, "map");
        return new e.a.a.a.y0.m.w0(X, false);
    }

    public static g e1(e.a.a.a.y0.m.n1.l lVar) {
        e.x.c.i.e(lVar, "$this$getRepresentativeUpperBound");
        if (lVar instanceof r0) {
            return e.a.a.a.y0.m.o1.c.G((r0) lVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + e.x.c.v.a(lVar.getClass())).toString());
    }

    public static String e2(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = charSequence;
        String str = (i3 & 2) != 0 ? "" : charSequence2;
        String str2 = (i3 & 4) != 0 ? "" : charSequence3;
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        String str3 = (i3 & 16) != 0 ? "..." : null;
        l lVar2 = (i3 & 32) != 0 ? null : lVar;
        e.x.c.i.e(objArr, "$this$joinToString");
        e.x.c.i.e(charSequence5, "separator");
        e.x.c.i.e(str, "prefix");
        e.x.c.i.e(str2, "postfix");
        e.x.c.i.e(str3, "truncated");
        StringBuilder sb = new StringBuilder();
        d2(objArr, sb, charSequence5, str, str2, i4, str3, lVar2);
        String sb2 = sb.toString();
        e.x.c.i.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final Class<?> e3(e.a.a.a.y0.b.k kVar) {
        if (kVar instanceof e.a.a.a.y0.b.e) {
            e.a.a.a.y0.b.e eVar = (e.a.a.a.y0.b.e) kVar;
            if (eVar.l()) {
                Class<?> j2 = e.a.a.a.v0.j(eVar);
                if (j2 != null) {
                    return j2;
                }
                StringBuilder y = b.e.a.a.a.y("Class object for the class ");
                y.append(eVar.getName());
                y.append(" cannot be found (classId=");
                y.append(e.a.a.a.y0.j.v.b.g((e.a.a.a.y0.b.h) kVar));
                y.append(')');
                throw new e.a.a.a.l0(y.toString());
            }
        }
        return null;
    }

    public static final e.a.a.a.y0.f.b f(e.a.a.a.y0.f.c cVar, String str) {
        e.a.a.a.y0.f.b i2 = cVar.c(d.l(str)).i();
        e.x.c.i.d(i2, "child(Name.identifier(name)).toSafe()");
        return i2;
    }

    public static e.a.a.a.y0.b.c1.g0 f0(f0 f0Var, e.a.a.a.y0.b.a1.h hVar, e.a.a.a.y0.b.a1.h hVar2, boolean z, boolean z2, boolean z3, z0 z0Var, m0 m0Var) {
        e.a.a.a.y0.b.a1.h hVar3 = hVar2;
        if (hVar == null) {
            c(8);
            throw null;
        } else if (hVar3 == null) {
            c(9);
            throw null;
        } else if (z0Var == null) {
            c(10);
            throw null;
        } else if (m0Var != null) {
            e.a.a.a.y0.b.c1.g0 g0Var = new e.a.a.a.y0.b.c1.g0(f0Var, hVar, f0Var.q(), z0Var, z, z2, z3, b.a.DECLARATION, (e.a.a.a.y0.b.h0) null, m0Var);
            g0Var.V0(e.a.a.a.y0.b.c1.g0.P0(g0Var, f0Var.d(), hVar2));
            return g0Var;
        } else {
            c(11);
            throw null;
        }
    }

    public static g f1(g gVar) {
        e.x.c.i.e(gVar, "$this$getSubstitutedUnderlyingType");
        if (gVar instanceof d0) {
            d0 d0Var = (d0) gVar;
            e.x.c.i.e(d0Var, "$this$substitutedUnderlyingType");
            e.x.c.i.e(d0Var, "$this$unsubstitutedUnderlyingParameter");
            e.a.a.a.y0.b.h d = d0Var.W0().d();
            if (!(d instanceof e.a.a.a.y0.b.e)) {
                d = null;
            }
            e.a.a.a.y0.b.e eVar = (e.a.a.a.y0.b.e) d;
            w0 p3 = eVar != null ? p3(eVar) : null;
            if (p3 == null) {
                return null;
            }
            e.a.a.a.y0.j.y.i z = d0Var.z();
            d name = p3.getName();
            e.x.c.i.d(name, "parameter.name");
            f0 f0Var = (f0) e.t.g.P(z.d(name, e.a.a.a.y0.c.a.d.FOR_ALREADY_TRACKED));
            if (f0Var != null) {
                return f0Var.d();
            }
            return null;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + e.x.c.v.a(gVar.getClass())).toString());
    }

    public static final <T> T f2(T[] tArr) {
        e.x.c.i.e(tArr, "$this$last");
        if (!(tArr.length == 0)) {
            return tArr[V0(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Class<?> f3(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$toInlineClass");
        return e3(d0Var.W0().d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.a.a.x0.h g(e.a.a.a.c0.a r6, boolean r7) {
        /*
            java.lang.Class<?> r0 = e.a.a.a.n.f7561h
            e.c0.d r0 = e.a.a.a.n.f7562i
            e.a.a.a.c0 r1 = r6.H()
            java.lang.String r1 = r1.f7501o
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L_0x0014
            e.a.a.a.x0.l r6 = e.a.a.a.x0.l.a
            goto L_0x01e3
        L_0x0014:
            e.a.a.a.d0 r0 = new e.a.a.a.d0
            r0.<init>(r6)
            e.a.a.a.e0 r1 = new e.a.a.a.e0
            r1.<init>(r6)
            e.a.a.a.f0 r2 = new e.a.a.a.f0
            r2.<init>(r6, r7, r1, r0)
            e.a.a.a.t0 r1 = e.a.a.a.t0.f7583b
            e.a.a.a.c0 r1 = r6.H()
            e.a.a.a.y0.b.f0 r1 = r1.D()
            e.a.a.a.f r1 = e.a.a.a.t0.c(r1)
            boolean r3 = r1 instanceof e.a.a.a.f.c
            if (r3 == 0) goto L_0x0155
            e.a.a.a.f$c r1 = (e.a.a.a.f.c) r1
            e.a.a.a.y0.e.a0.a$d r3 = r1.d
            r4 = 0
            if (r7 == 0) goto L_0x0045
            boolean r7 = r3.j()
            if (r7 == 0) goto L_0x004e
            e.a.a.a.y0.e.a0.a$c r7 = r3.f8720l
            goto L_0x004f
        L_0x0045:
            boolean r7 = r3.k()
            if (r7 == 0) goto L_0x004e
            e.a.a.a.y0.e.a0.a$c r7 = r3.f8721m
            goto L_0x004f
        L_0x004e:
            r7 = r4
        L_0x004f:
            if (r7 == 0) goto L_0x006b
            e.a.a.a.c0 r3 = r6.H()
            e.a.a.a.n r3 = r3.f7499m
            e.a.a.a.y0.e.z.c r4 = r1.f7525e
            int r5 = r7.f8707j
            java.lang.String r4 = r4.a(r5)
            e.a.a.a.y0.e.z.c r1 = r1.f7525e
            int r7 = r7.f8708k
            java.lang.String r7 = r1.a(r7)
            java.lang.reflect.Method r4 = r3.r(r4, r7)
        L_0x006b:
            if (r4 != 0) goto L_0x0106
            e.a.a.a.c0 r7 = r6.H()
            e.a.a.a.y0.b.f0 r7 = r7.D()
            boolean r7 = a2(r7)
            if (r7 == 0) goto L_0x00e3
            e.a.a.a.c0 r7 = r6.H()
            e.a.a.a.y0.b.f0 r7 = r7.D()
            e.a.a.a.y0.b.z0 r7 = r7.getVisibility()
            e.a.a.a.y0.b.z0 r0 = e.a.a.a.y0.b.y0.d
            boolean r7 = e.x.c.i.a(r7, r0)
            if (r7 == 0) goto L_0x00e3
            e.a.a.a.c0 r7 = r6.H()
            e.a.a.a.y0.b.f0 r7 = r7.D()
            e.a.a.a.y0.b.k r7 = r7.b()
            java.lang.Class r7 = e3(r7)
            if (r7 == 0) goto L_0x00c7
            e.a.a.a.c0 r0 = r6.H()
            e.a.a.a.y0.b.f0 r0 = r0.D()
            java.lang.reflect.Method r7 = i1(r7, r0)
            if (r7 == 0) goto L_0x00c7
            boolean r0 = r6.F()
            if (r0 == 0) goto L_0x00c0
            e.a.a.a.x0.k$a r0 = new e.a.a.a.x0.k$a
            java.lang.Object r1 = A0(r6)
            r0.<init>(r7, r1)
            goto L_0x0186
        L_0x00c0:
            e.a.a.a.x0.k$b r0 = new e.a.a.a.x0.k$b
            r0.<init>(r7)
            goto L_0x0186
        L_0x00c7:
            e.a.a.a.l0 r7 = new e.a.a.a.l0
            java.lang.String r0 = "Underlying property of inline class "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            e.a.a.a.c0 r6 = r6.H()
            r0.append(r6)
            java.lang.String r6 = " should have a field"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x00e3:
            e.a.a.a.c0 r7 = r6.H()
            java.lang.reflect.Field r7 = r7.J()
            if (r7 == 0) goto L_0x00ef
            goto L_0x015d
        L_0x00ef:
            e.a.a.a.l0 r7 = new e.a.a.a.l0
            java.lang.String r0 = "No accessors or field is found for property "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            e.a.a.a.c0 r6 = r6.H()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0106:
            int r7 = r4.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L_0x0127
            boolean r7 = r6.F()
            if (r7 == 0) goto L_0x0120
            e.a.a.a.x0.i$g$a r7 = new e.a.a.a.x0.i$g$a
            java.lang.Object r0 = A0(r6)
            r7.<init>(r4, r0)
            goto L_0x0125
        L_0x0120:
            e.a.a.a.x0.i$g$d r7 = new e.a.a.a.x0.i$g$d
            r7.<init>(r4)
        L_0x0125:
            r0 = r7
            goto L_0x0186
        L_0x0127:
            boolean r7 = r0.a()
            if (r7 == 0) goto L_0x013f
            boolean r7 = r6.F()
            if (r7 == 0) goto L_0x0139
            e.a.a.a.x0.i$g$b r7 = new e.a.a.a.x0.i$g$b
            r7.<init>(r4)
            goto L_0x0125
        L_0x0139:
            e.a.a.a.x0.i$g$e r7 = new e.a.a.a.x0.i$g$e
            r7.<init>(r4)
            goto L_0x0125
        L_0x013f:
            boolean r7 = r6.F()
            if (r7 == 0) goto L_0x014f
            e.a.a.a.x0.i$g$c r7 = new e.a.a.a.x0.i$g$c
            java.lang.Object r0 = A0(r6)
            r7.<init>(r4, r0)
            goto L_0x0125
        L_0x014f:
            e.a.a.a.x0.i$g$f r7 = new e.a.a.a.x0.i$g$f
            r7.<init>(r4)
            goto L_0x0125
        L_0x0155:
            boolean r0 = r1 instanceof e.a.a.a.f.a
            if (r0 == 0) goto L_0x0162
            e.a.a.a.f$a r1 = (e.a.a.a.f.a) r1
            java.lang.reflect.Field r7 = r1.a
        L_0x015d:
            e.a.a.a.x0.i r0 = r2.invoke(r7)
            goto L_0x0186
        L_0x0162:
            boolean r0 = r1 instanceof e.a.a.a.f.b
            if (r0 == 0) goto L_0x01a5
            e.a.a.a.f$b r1 = (e.a.a.a.f.b) r1
            if (r7 == 0) goto L_0x016d
            java.lang.reflect.Method r7 = r1.a
            goto L_0x0171
        L_0x016d:
            java.lang.reflect.Method r7 = r1.f7523b
            if (r7 == 0) goto L_0x0190
        L_0x0171:
            boolean r0 = r6.F()
            if (r0 == 0) goto L_0x0181
            e.a.a.a.x0.i$g$a r0 = new e.a.a.a.x0.i$g$a
            java.lang.Object r1 = A0(r6)
            r0.<init>(r7, r1)
            goto L_0x0186
        L_0x0181:
            e.a.a.a.x0.i$g$d r0 = new e.a.a.a.x0.i$g$d
            r0.<init>(r7)
        L_0x0186:
            e.a.a.a.y0.b.e0 r6 = r6.G()
            r7 = 0
            e.a.a.a.x0.h r6 = b0(r0, r6, r7)
            goto L_0x01e3
        L_0x0190:
            e.a.a.a.l0 r6 = new e.a.a.a.l0
            java.lang.String r7 = "No source found for setter of Java method property: "
            java.lang.StringBuilder r7 = b.e.a.a.a.y(r7)
            java.lang.reflect.Method r0 = r1.a
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x01a5:
            boolean r0 = r1 instanceof e.a.a.a.f.d
            if (r0 == 0) goto L_0x0212
            e.a.a.a.f$d r1 = (e.a.a.a.f.d) r1
            if (r7 == 0) goto L_0x01b0
            e.a.a.a.e$e r7 = r1.a
            goto L_0x01b4
        L_0x01b0:
            e.a.a.a.e$e r7 = r1.f7526b
            if (r7 == 0) goto L_0x01fb
        L_0x01b4:
            e.a.a.a.c0 r0 = r6.H()
            e.a.a.a.n r0 = r0.f7499m
            e.a.a.a.y0.e.a0.b.e$b r7 = r7.f7521b
            java.lang.String r1 = r7.a
            java.lang.String r7 = r7.f8766b
            java.lang.reflect.Method r7 = r0.r(r1, r7)
            if (r7 == 0) goto L_0x01e4
            int r0 = r7.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            boolean r0 = r6.F()
            if (r0 == 0) goto L_0x01de
            e.a.a.a.x0.i$g$a r0 = new e.a.a.a.x0.i$g$a
            java.lang.Object r6 = A0(r6)
            r0.<init>(r7, r6)
            r6 = r0
            goto L_0x01e3
        L_0x01de:
            e.a.a.a.x0.i$g$d r6 = new e.a.a.a.x0.i$g$d
            r6.<init>(r7)
        L_0x01e3:
            return r6
        L_0x01e4:
            e.a.a.a.l0 r7 = new e.a.a.a.l0
            java.lang.String r0 = "No accessor found for property "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            e.a.a.a.c0 r6 = r6.H()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x01fb:
            e.a.a.a.l0 r7 = new e.a.a.a.l0
            java.lang.String r0 = "No setter found for property "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            e.a.a.a.c0 r6 = r6.H()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0212:
            e.h r6 = new e.h
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.g(e.a.a.a.c0$a, boolean):e.a.a.a.x0.h");
    }

    public static final String g0(v0 v0Var) {
        StringBuilder sb = new StringBuilder();
        e.a.a.a.y0.m.l1.w wVar = new e.a.a.a.y0.m.l1.w(sb);
        wVar.invoke("type: " + v0Var);
        wVar.invoke("hashCode: " + v0Var.hashCode());
        wVar.invoke("javaClass: " + v0Var.getClass().getCanonicalName());
        for (e.a.a.a.y0.b.k d = v0Var.d(); d != null; d = d.b()) {
            StringBuilder y = b.e.a.a.a.y("fqName: ");
            y.append(e.a.a.a.y0.i.c.a.q(d));
            wVar.invoke(y.toString());
            wVar.invoke("javaClass: " + d.getClass().getCanonicalName());
        }
        String sb2 = sb.toString();
        e.x.c.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static g g1(e.a.a.a.y0.m.n1.j jVar) {
        e.x.c.i.e(jVar, "$this$getType");
        if (jVar instanceof y0) {
            return ((y0) jVar).d().Z0();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + e.x.c.v.a(jVar.getClass())).toString());
    }

    public static final <T> e.f<T> g2(e.g gVar, e.x.b.a<? extends T> aVar) {
        e.x.c.i.e(gVar, "mode");
        e.x.c.i.e(aVar, "initializer");
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return new e.m(aVar, (Object) null, 2);
        }
        if (ordinal == 1) {
            return new e.l(aVar);
        }
        if (ordinal == 2) {
            return new e.s(aVar);
        }
        throw new e.h();
    }

    public static final <T> List<T> g3(T[] tArr) {
        e.x.c.i.e(tArr, "$this$toList");
        int length = tArr.length;
        return length != 0 ? length != 1 ? h3(tArr) : l2(tArr[0]) : o.f7934h;
    }

    public static final String h(Object obj) {
        StringBuilder y = b.e.a.a.a.y("ClassicTypeCheckerContext couldn't handle ");
        y.append(e.x.c.v.a(obj.getClass()));
        y.append(' ');
        y.append(obj);
        return y.toString();
    }

    public static float h0(float f, float f2, float f3, float f4) {
        float f5 = f / (f4 / 2.0f);
        float f6 = f3 / 2.0f;
        if (f5 < 1.0f) {
            return (f6 * f5 * f5 * f5) + f2;
        }
        float f7 = f5 - 2.0f;
        return (((f7 * f7 * f7) + 2.0f) * f6) + f2;
    }

    public static e.a.a.a.y0.m.n1.l h1(e.a.a.a.y0.m.n1.k kVar) {
        e.x.c.i.e(kVar, "$this$getTypeParameterClassifier");
        if (kVar instanceof v0) {
            e.a.a.a.y0.b.h d = ((v0) kVar).d();
            if (!(d instanceof r0)) {
                d = null;
            }
            return (r0) d;
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public static final <T> e.f<T> h2(e.x.b.a<? extends T> aVar) {
        e.x.c.i.e(aVar, "initializer");
        return new e.m(aVar, (Object) null, 2);
    }

    public static final <T> List<T> h3(T[] tArr) {
        e.x.c.i.e(tArr, "$this$toMutableList");
        e.x.c.i.e(tArr, "$this$asCollection");
        return new ArrayList(new e.t.d(tArr, false));
    }

    public static final String i(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        e.x.c.i.d(parameterTypes, "parameterTypes");
        sb.append(e2(parameterTypes, "", "(", ")", 0, (CharSequence) null, e.a.a.a.u0.f7586h, 24));
        sb.append(e.a.a.a.y0.b.d1.b.b.c(method.getReturnType()));
        return sb.toString();
    }

    public static e.a.a.a.y0.b.a1.c i0(e.a.a.a.y0.b.a1.h hVar, e.a.a.a.y0.f.b bVar) {
        Object obj;
        e.x.c.i.e(bVar, "fqName");
        Iterator it = hVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (e.x.c.i.a(((e.a.a.a.y0.b.a1.c) obj).e(), bVar)) {
                break;
            }
        }
        return (e.a.a.a.y0.b.a1.c) obj;
    }

    public static final Method i1(Class<?> cls, e.a.a.a.y0.b.b bVar) {
        e.x.c.i.e(cls, "$this$getUnboxMethod");
        e.x.c.i.e(bVar, "descriptor");
        try {
            return cls.getDeclaredMethod("unbox-impl", new Class[0]);
        } catch (NoSuchMethodException unused) {
            throw new e.a.a.a.l0("No unbox method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    public static <T> o0<T> i2(e.x.b.a<T> aVar) {
        return new o0<>(aVar);
    }

    public static final <T> Set<T> i3(T[] tArr) {
        e.x.c.i.e(tArr, "$this$toSet");
        int length = tArr.length;
        if (length == 0) {
            return e.t.q.f7936h;
        }
        if (length == 1) {
            return S2(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(q2(tArr.length));
        d3(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final e.a.a.a.y0.d.a.v j(String str, String str2, String str3, String str4) {
        d l2 = d.l(str2);
        e.x.c.i.d(l2, "Name.identifier(name)");
        String str5 = str2 + '(' + str3 + ')' + str4;
        e.x.c.i.e(str, "internalName");
        e.x.c.i.e(str5, "jvmDescriptor");
        return new e.a.a.a.y0.d.a.v(l2, str + '.' + str5);
    }

    public static e.a.a.a.y0.b.d1.b.c j0(e.a.a.a.y0.b.d1.b.f fVar, e.a.a.a.y0.f.b bVar) {
        Annotation[] declaredAnnotations;
        e.x.c.i.e(bVar, "fqName");
        AnnotatedElement m2 = fVar.m();
        if (m2 == null || (declaredAnnotations = m2.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k0(declaredAnnotations, bVar);
    }

    public static final <T> Object j1(e.a.a.a.y0.l.i iVar, e.a.l lVar) {
        e.x.c.i.e(iVar, "$this$getValue");
        e.x.c.i.e(lVar, "p");
        return iVar.e();
    }

    public static <T> e.a.a.a.n0<T> j2(T t, e.x.b.a<T> aVar) {
        if (aVar != null) {
            return new e.a.a.a.n0<>(t, aVar);
        }
        a(1);
        throw null;
    }

    public static final <K, V> Map<K, V> j3(Map<? extends K, ? extends V> map) {
        e.x.c.i.e(map, "$this$toSingletonMap");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        e.x.c.i.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static final void k(Throwable th, Throwable th2) {
        e.x.c.i.e(th, "$this$addSuppressed");
        e.x.c.i.e(th2, "exception");
        if (th != th2) {
            e.w.b.a.a(th, th2);
        }
    }

    public static final e.a.a.a.y0.b.d1.b.c k0(Annotation[] annotationArr, e.a.a.a.y0.f.b bVar) {
        Annotation annotation;
        e.x.c.i.e(annotationArr, "$this$findAnnotation");
        e.x.c.i.e(bVar, "fqName");
        int length = annotationArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i2];
            if (e.x.c.i.a(e.a.a.a.y0.b.d1.b.b.b(L0(t0(annotation))).b(), bVar)) {
                break;
            }
            i2++;
        }
        if (annotation != null) {
            return new e.a.a.a.y0.b.d1.b.c(annotation);
        }
        return null;
    }

    public static e.a.a.a.y0.m.n1.o k1(e.a.a.a.y0.m.n1.j jVar) {
        e.x.c.i.e(jVar, "$this$getVariance");
        if (jVar instanceof y0) {
            j1 b2 = ((y0) jVar).b();
            e.x.c.i.d(b2, "this.projectionKind");
            return M(b2);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + e.x.c.v.a(jVar.getClass())).toString());
    }

    public static <T> e.a.a.a.n0<T> k2(e.x.b.a<T> aVar) {
        return j2((Object) null, aVar);
    }

    public static RectF k3(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i2 = 1; i2 < fArr.length; i2 += 2) {
            float round = ((float) Math.round(fArr[i2 - 1] * 10.0f)) / 10.0f;
            float round2 = ((float) Math.round(fArr[i2] * 10.0f)) / 10.0f;
            float f = rectF.left;
            if (round < f) {
                f = round;
            }
            rectF.left = f;
            float f2 = rectF.top;
            if (round2 < f2) {
                f2 = round2;
            }
            rectF.top = f2;
            float f3 = rectF.right;
            if (round <= f3) {
                round = f3;
            }
            rectF.right = round;
            float f4 = rectF.bottom;
            if (round2 <= f4) {
                round2 = f4;
            }
            rectF.bottom = round2;
        }
        rectF.sort();
        return rectF;
    }

    public static final void l(StringBuilder sb, d0 d0Var) {
        sb.append(s2(d0Var));
    }

    public static final e.a.a.a.y0.b.e l0(w wVar, e.a.a.a.y0.f.a aVar) {
        e.x.c.i.e(wVar, "$this$findClassAcrossModuleDependencies");
        e.x.c.i.e(aVar, "classId");
        e.a.a.a.y0.b.h m0 = m0(wVar, aVar);
        if (!(m0 instanceof e.a.a.a.y0.b.e)) {
            m0 = null;
        }
        return (e.a.a.a.y0.b.e) m0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<e.a.a.a.y0.e.z.f> l1(e.a.a.a.y0.k.b.g0.g r20) {
        /*
            e.a.a.a.y0.h.p r0 = r20.X()
            e.a.a.a.y0.e.z.c r1 = r20.Q0()
            e.a.a.a.y0.e.z.g r2 = r20.L0()
            java.lang.String r3 = "proto"
            e.x.c.i.e(r0, r3)
            java.lang.String r3 = "nameResolver"
            e.x.c.i.e(r1, r3)
            java.lang.String r4 = "table"
            e.x.c.i.e(r2, r4)
            boolean r5 = r0 instanceof e.a.a.a.y0.e.c
            if (r5 == 0) goto L_0x0024
            e.a.a.a.y0.e.c r0 = (e.a.a.a.y0.e.c) r0
            java.util.List<java.lang.Integer> r0 = r0.B
            goto L_0x0047
        L_0x0024:
            boolean r5 = r0 instanceof e.a.a.a.y0.e.d
            if (r5 == 0) goto L_0x002d
            e.a.a.a.y0.e.d r0 = (e.a.a.a.y0.e.d) r0
            java.util.List<java.lang.Integer> r0 = r0.f8853m
            goto L_0x0047
        L_0x002d:
            boolean r5 = r0 instanceof e.a.a.a.y0.e.i
            if (r5 == 0) goto L_0x0036
            e.a.a.a.y0.e.i r0 = (e.a.a.a.y0.e.i) r0
            java.util.List<java.lang.Integer> r0 = r0.u
            goto L_0x0047
        L_0x0036:
            boolean r5 = r0 instanceof e.a.a.a.y0.e.n
            if (r5 == 0) goto L_0x003f
            e.a.a.a.y0.e.n r0 = (e.a.a.a.y0.e.n) r0
            java.util.List<java.lang.Integer> r0 = r0.v
            goto L_0x0047
        L_0x003f:
            boolean r5 = r0 instanceof e.a.a.a.y0.e.r
            if (r5 == 0) goto L_0x0143
            e.a.a.a.y0.e.r r0 = (e.a.a.a.y0.e.r) r0
            java.util.List<java.lang.Integer> r0 = r0.s
        L_0x0047:
            java.lang.String r5 = "ids"
            e.x.c.i.d(r0, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0055:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0142
            java.lang.Object r6 = r0.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.String r7 = "id"
            e.x.c.i.d(r6, r7)
            int r6 = r6.intValue()
            e.x.c.i.e(r1, r3)
            e.x.c.i.e(r2, r4)
            java.util.List<e.a.a.a.y0.e.v> r7 = r2.a
            java.lang.Object r6 = e.t.g.t(r7, r6)
            e.a.a.a.y0.e.v r6 = (e.a.a.a.y0.e.v) r6
            if (r6 == 0) goto L_0x013a
            int r7 = r6.f9132i
            r8 = 1
            r7 = r7 & r8
            r9 = 0
            if (r7 != r8) goto L_0x0083
            r7 = r8
            goto L_0x0084
        L_0x0083:
            r7 = r9
        L_0x0084:
            if (r7 == 0) goto L_0x008d
            int r7 = r6.f9133j
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x008e
        L_0x008d:
            r7 = 0
        L_0x008e:
            int r10 = r6.f9132i
            r11 = 2
            r10 = r10 & r11
            if (r10 != r11) goto L_0x0096
            r10 = r8
            goto L_0x0097
        L_0x0096:
            r10 = r9
        L_0x0097:
            if (r10 == 0) goto L_0x00a0
            int r10 = r6.f9134k
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x00a1
        L_0x00a0:
            r10 = 0
        L_0x00a1:
            r12 = 16
            r13 = 8
            if (r10 == 0) goto L_0x00c2
            e.a.a.a.y0.e.z.f$a r7 = new e.a.a.a.y0.e.z.f$a
            int r14 = r10.intValue()
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r10.intValue()
            int r15 = r15 >> 8
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r10 = r10.intValue()
            int r10 = r10 >> r12
            r10 = r10 & 255(0xff, float:3.57E-43)
            r7.<init>(r14, r15, r10)
            goto L_0x00e3
        L_0x00c2:
            if (r7 == 0) goto L_0x00e1
            e.a.a.a.y0.e.z.f$a r10 = new e.a.a.a.y0.e.z.f$a
            int r14 = r7.intValue()
            r14 = r14 & 7
            int r15 = r7.intValue()
            int r15 = r15 >> 3
            r15 = r15 & 15
            int r7 = r7.intValue()
            int r7 = r7 >> 7
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r10.<init>(r14, r15, r7)
            r15 = r10
            goto L_0x00e4
        L_0x00e1:
            e.a.a.a.y0.e.z.f$a r7 = e.a.a.a.y0.e.z.f.a.d
        L_0x00e3:
            r15 = r7
        L_0x00e4:
            e.a.a.a.y0.e.v$c r7 = r6.f9135l
            e.x.c.i.c(r7)
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x00ff
            if (r7 == r8) goto L_0x00fc
            if (r7 != r11) goto L_0x00f6
            e.b r7 = e.b.HIDDEN
            goto L_0x0101
        L_0x00f6:
            e.h r0 = new e.h
            r0.<init>()
            throw r0
        L_0x00fc:
            e.b r7 = e.b.ERROR
            goto L_0x0101
        L_0x00ff:
            e.b r7 = e.b.WARNING
        L_0x0101:
            r17 = r7
            int r7 = r6.f9132i
            r7 = r7 & r13
            if (r7 != r13) goto L_0x010a
            r7 = r8
            goto L_0x010b
        L_0x010a:
            r7 = r9
        L_0x010b:
            if (r7 == 0) goto L_0x0114
            int r7 = r6.f9136m
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0115
        L_0x0114:
            r7 = 0
        L_0x0115:
            r18 = r7
            int r7 = r6.f9132i
            r7 = r7 & r12
            if (r7 != r12) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            r8 = r9
        L_0x011e:
            if (r8 == 0) goto L_0x0127
            int r7 = r6.f9137n
            java.lang.String r7 = r1.a(r7)
            goto L_0x0128
        L_0x0127:
            r7 = 0
        L_0x0128:
            r19 = r7
            e.a.a.a.y0.e.z.f r7 = new e.a.a.a.y0.e.z.f
            e.a.a.a.y0.e.v$d r6 = r6.f9138o
            java.lang.String r8 = "info.versionKind"
            e.x.c.i.d(r6, r8)
            r14 = r7
            r16 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x013b
        L_0x013a:
            r7 = 0
        L_0x013b:
            if (r7 == 0) goto L_0x0055
            r5.add(r7)
            goto L_0x0055
        L_0x0142:
            return r5
        L_0x0143:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected declaration: "
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            java.lang.Class r0 = r0.getClass()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.l1(e.a.a.a.y0.k.b.g0.g):java.util.List");
    }

    public static final <T> List<T> l2(T t) {
        List<T> singletonList = Collections.singletonList(t);
        e.x.c.i.d(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static final Class<?> l3(ClassLoader classLoader, String str) {
        e.x.c.i.e(classLoader, "$this$tryLoadClass");
        e.x.c.i.e(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static int m(g gVar) {
        e.x.c.i.e(gVar, "$this$argumentsCount");
        if (gVar instanceof d0) {
            return ((d0) gVar).V0().size();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + e.x.c.v.a(gVar.getClass())).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.a.a.y0.b.h m0(e.a.a.a.y0.b.w r11, e.a.a.a.y0.f.a r12) {
        /*
            e.a.a.a.y0.c.a.d r0 = e.a.a.a.y0.c.a.d.FROM_DESERIALIZATION
            java.lang.String r1 = "$this$findClassifierAcrossModuleDependencies"
            e.x.c.i.e(r11, r1)
            java.lang.String r1 = "classId"
            e.x.c.i.e(r12, r1)
            e.a.a.a.y0.b.w$a<e.a.a.a.y0.j.q> r1 = e.a.a.a.y0.j.r.a
            java.lang.Object r1 = r11.E0(r1)
            e.a.a.a.y0.j.q r1 = (e.a.a.a.y0.j.q) r1
            r2 = 0
            if (r1 == 0) goto L_0x001c
            e.a.a.a.y0.b.w r1 = r1.a(r11)
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            java.lang.String r3 = "name"
            r4 = 1
            java.lang.String r5 = "segments.first()"
            java.lang.String r6 = "classId.relativeClassName.pathSegments()"
            java.lang.String r7 = "classId.packageFqName"
            if (r1 != 0) goto L_0x0086
            e.a.a.a.y0.f.b r1 = r12.h()
            e.x.c.i.d(r1, r7)
            e.a.a.a.y0.b.b0 r11 = r11.o0(r1)
            e.a.a.a.y0.f.b r12 = r12.i()
            java.util.List r12 = r12.f()
            e.x.c.i.d(r12, r6)
            e.a.a.a.y0.j.y.i r11 = r11.z()
            java.lang.Object r1 = e.t.g.o(r12)
            e.x.c.i.d(r1, r5)
            e.a.a.a.y0.f.d r1 = (e.a.a.a.y0.f.d) r1
            e.a.a.a.y0.b.h r11 = r11.b(r1, r0)
            if (r11 == 0) goto L_0x0145
            int r1 = r12.size()
            java.util.List r12 = r12.subList(r4, r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x005d:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00e6
            java.lang.Object r1 = r12.next()
            e.a.a.a.y0.f.d r1 = (e.a.a.a.y0.f.d) r1
            boolean r4 = r11 instanceof e.a.a.a.y0.b.e
            if (r4 != 0) goto L_0x006f
            goto L_0x0145
        L_0x006f:
            e.a.a.a.y0.b.e r11 = (e.a.a.a.y0.b.e) r11
            e.a.a.a.y0.j.y.i r11 = r11.v0()
            e.x.c.i.d(r1, r3)
            e.a.a.a.y0.b.h r11 = r11.b(r1, r0)
            boolean r1 = r11 instanceof e.a.a.a.y0.b.e
            if (r1 != 0) goto L_0x0081
            r11 = r2
        L_0x0081:
            e.a.a.a.y0.b.e r11 = (e.a.a.a.y0.b.e) r11
            if (r11 == 0) goto L_0x0145
            goto L_0x005d
        L_0x0086:
            e.a.a.a.y0.f.b r8 = r12.h()
            e.x.c.i.d(r8, r7)
            e.a.a.a.y0.b.b0 r11 = r11.o0(r8)
            e.a.a.a.y0.f.b r8 = r12.i()
            java.util.List r8 = r8.f()
            e.x.c.i.d(r8, r6)
            e.a.a.a.y0.j.y.i r11 = r11.z()
            java.lang.Object r9 = e.t.g.o(r8)
            e.x.c.i.d(r9, r5)
            e.a.a.a.y0.f.d r9 = (e.a.a.a.y0.f.d) r9
            e.a.a.a.y0.b.h r11 = r11.b(r9, r0)
            if (r11 == 0) goto L_0x00e3
            int r9 = r8.size()
            java.util.List r8 = r8.subList(r4, r9)
            java.util.Iterator r8 = r8.iterator()
        L_0x00bb:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e4
            java.lang.Object r9 = r8.next()
            e.a.a.a.y0.f.d r9 = (e.a.a.a.y0.f.d) r9
            boolean r10 = r11 instanceof e.a.a.a.y0.b.e
            if (r10 != 0) goto L_0x00cc
            goto L_0x00e3
        L_0x00cc:
            e.a.a.a.y0.b.e r11 = (e.a.a.a.y0.b.e) r11
            e.a.a.a.y0.j.y.i r11 = r11.v0()
            e.x.c.i.d(r9, r3)
            e.a.a.a.y0.b.h r11 = r11.b(r9, r0)
            boolean r9 = r11 instanceof e.a.a.a.y0.b.e
            if (r9 != 0) goto L_0x00de
            r11 = r2
        L_0x00de:
            e.a.a.a.y0.b.e r11 = (e.a.a.a.y0.b.e) r11
            if (r11 == 0) goto L_0x00e3
            goto L_0x00bb
        L_0x00e3:
            r11 = r2
        L_0x00e4:
            if (r11 == 0) goto L_0x00e8
        L_0x00e6:
            r2 = r11
            goto L_0x0145
        L_0x00e8:
            e.a.a.a.y0.f.b r11 = r12.h()
            e.x.c.i.d(r11, r7)
            e.a.a.a.y0.b.b0 r11 = r1.o0(r11)
            e.a.a.a.y0.f.b r12 = r12.i()
            java.util.List r12 = r12.f()
            e.x.c.i.d(r12, r6)
            e.a.a.a.y0.j.y.i r11 = r11.z()
            java.lang.Object r1 = e.t.g.o(r12)
            e.x.c.i.d(r1, r5)
            e.a.a.a.y0.f.d r1 = (e.a.a.a.y0.f.d) r1
            e.a.a.a.y0.b.h r11 = r11.b(r1, r0)
            if (r11 == 0) goto L_0x0145
            int r1 = r12.size()
            java.util.List r12 = r12.subList(r4, r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x011d:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00e6
            java.lang.Object r1 = r12.next()
            e.a.a.a.y0.f.d r1 = (e.a.a.a.y0.f.d) r1
            boolean r4 = r11 instanceof e.a.a.a.y0.b.e
            if (r4 != 0) goto L_0x012e
            goto L_0x0145
        L_0x012e:
            e.a.a.a.y0.b.e r11 = (e.a.a.a.y0.b.e) r11
            e.a.a.a.y0.j.y.i r11 = r11.v0()
            e.x.c.i.d(r1, r3)
            e.a.a.a.y0.b.h r11 = r11.b(r1, r0)
            boolean r1 = r11 instanceof e.a.a.a.y0.b.e
            if (r1 != 0) goto L_0x0140
            r11 = r2
        L_0x0140:
            e.a.a.a.y0.b.e r11 = (e.a.a.a.y0.b.e) r11
            if (r11 == 0) goto L_0x0145
            goto L_0x011d
        L_0x0145:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.m0(e.a.a.a.y0.b.w, e.a.a.a.y0.f.a):e.a.a.a.y0.b.h");
    }

    public static z0 m1(a0 a0Var) {
        int x = a0Var.x();
        z0 z0Var = Modifier.isPublic(x) ? e.a.a.a.y0.b.y0.f7850e : Modifier.isPrivate(x) ? e.a.a.a.y0.b.y0.a : Modifier.isProtected(x) ? Modifier.isStatic(x) ? e.a.a.a.y0.d.a.r.f8576b : e.a.a.a.y0.d.a.r.c : e.a.a.a.y0.d.a.r.a;
        e.x.c.i.d(z0Var, "modifiers.let { modifier…Y\n            }\n        }");
        return z0Var;
    }

    public static e.a.a.a.y0.m.n1.h m2(e.a.a.a.y0.m.n1.f fVar) {
        e.x.c.i.e(fVar, "$this$lowerBound");
        if (fVar instanceof x) {
            return ((x) fVar).f9767i;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + e.x.c.v.a(fVar.getClass())).toString());
    }

    public static final q m3(e.a.a.a.y0.e.u uVar, e.a.a.a.y0.e.z.e eVar) {
        e.x.c.i.e(uVar, "$this$type");
        e.x.c.i.e(eVar, "typeTable");
        if (uVar.t()) {
            q qVar = uVar.f9119m;
            e.x.c.i.d(qVar, "type");
            return qVar;
        }
        if ((uVar.f9116j & 8) == 8) {
            return eVar.a(uVar.f9120n);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    public static e.a.a.a.y0.m.n1.d n(e.a.a.a.y0.m.n1.h hVar) {
        e.x.c.i.e(hVar, "$this$asDefinitelyNotNullType");
        if (hVar instanceof k0) {
            if (!(hVar instanceof e.a.a.a.y0.m.p)) {
                hVar = null;
            }
            return (e.a.a.a.y0.m.p) hVar;
        }
        throw new IllegalArgumentException(b.e.a.a.a.t(hVar, b.e.a.a.a.D("ClassicTypeSystemContext couldn't handle: ", hVar, ", ")).toString());
    }

    public static final e.a.a.a.y0.d.b.l n0(e.a.a.a.y0.d.b.k kVar, e.a.a.a.y0.f.a aVar) {
        e.x.c.i.e(kVar, "$this$findKotlinClass");
        e.x.c.i.e(aVar, "classId");
        k.a c = kVar.c(aVar);
        if (c != null) {
            return c.a();
        }
        return null;
    }

    public static boolean n1(e.a.a.a.y0.b.a1.h hVar, e.a.a.a.y0.f.b bVar) {
        e.x.c.i.e(bVar, "fqName");
        return hVar.i(bVar) != null;
    }

    public static e.a.a.a.y0.m.n1.h n2(e.a.a.a.y0.m.n1.m mVar, g gVar) {
        e.a.a.a.y0.m.n1.h A;
        e.x.c.i.e(gVar, "$this$lowerBoundIfFlexible");
        e.a.a.a.y0.m.n1.f u = mVar.u(gVar);
        if (u != null && (A = mVar.A(u)) != null) {
            return A;
        }
        e.a.a.a.y0.m.n1.h a = mVar.a(gVar);
        e.x.c.i.c(a);
        return a;
    }

    public static e.a.a.a.y0.m.n1.k n3(e.a.a.a.y0.m.n1.h hVar) {
        e.x.c.i.e(hVar, "$this$typeConstructor");
        if (hVar instanceof k0) {
            return ((k0) hVar).W0();
        }
        throw new IllegalArgumentException(b.e.a.a.a.t(hVar, b.e.a.a.a.D("ClassicTypeSystemContext couldn't handle: ", hVar, ", ")).toString());
    }

    public static e.a.a.a.y0.m.n1.e o(e.a.a.a.y0.m.n1.f fVar) {
        e.x.c.i.e(fVar, "$this$asDynamicType");
        if (fVar instanceof x) {
            if (!(fVar instanceof u)) {
                fVar = null;
            }
            return (u) fVar;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + e.x.c.v.a(fVar.getClass())).toString());
    }

    public static final e.a.a.a.y0.b.e o0(w wVar, e.a.a.a.y0.f.a aVar, e.a.a.a.y0.b.x xVar) {
        e.x.c.i.e(wVar, "$this$findNonGenericClassAcrossDependencies");
        e.x.c.i.e(aVar, "classId");
        e.x.c.i.e(xVar, "notFoundClasses");
        e.a.a.a.y0.b.e l0 = l0(wVar, aVar);
        return l0 != null ? l0 : xVar.a(aVar, s.j(s.g(e.a.a.a.y0.m.o1.c.B(aVar, e.a.a.a.y0.b.q.f7831q), e.a.a.a.y0.b.r.f7832h)));
    }

    public static boolean o1(g gVar, e.a.a.a.y0.f.b bVar) {
        e.x.c.i.e(gVar, "$this$hasAnnotation");
        e.x.c.i.e(bVar, "fqName");
        if (gVar instanceof d0) {
            return ((d0) gVar).k().x(bVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + e.x.c.v.a(gVar.getClass())).toString());
    }

    public static final k0 o2(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$lowerIfFlexible");
        i1 Z0 = d0Var.Z0();
        if (Z0 instanceof x) {
            return ((x) Z0).f9767i;
        }
        if (Z0 instanceof k0) {
            return (k0) Z0;
        }
        throw new e.h();
    }

    public static e.a.a.a.y0.m.n1.k o3(e.a.a.a.y0.m.n1.m mVar, g gVar) {
        e.x.c.i.e(gVar, "$this$typeConstructor");
        e.a.a.a.y0.m.n1.h a = mVar.a(gVar);
        if (a == null) {
            a = mVar.n(gVar);
        }
        return mVar.d(a);
    }

    public static final x p(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$asFlexibleType");
        i1 Z0 = d0Var.Z0();
        Objects.requireNonNull(Z0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (x) Z0;
    }

    public static final <T> T p0(T[] tArr) {
        e.x.c.i.e(tArr, "$this$first");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static boolean p1(e.a.a.a.y0.m.n1.m mVar, g gVar) {
        e.x.c.i.e(gVar, "$this$hasFlexibleNullability");
        return mVar.f(mVar.n(gVar)) != mVar.f(mVar.e(gVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r2.g(r0, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.a.a.a.y0.m.n1.g p2(e.a.a.a.y0.m.l1.c r2, e.a.a.a.y0.m.n1.g r3) {
        /*
            java.lang.String r0 = "$this$makeNullable"
            e.x.c.i.e(r3, r0)
            e.x.c.i.e(r3, r0)
            e.a.a.a.y0.m.n1.h r0 = r2.a(r3)
            if (r0 == 0) goto L_0x0016
            r1 = 1
            e.a.a.a.y0.m.n1.h r2 = r2.g(r0, r1)
            if (r2 == 0) goto L_0x0016
            r3 = r2
        L_0x0016:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.p2(e.a.a.a.y0.m.l1.c, e.a.a.a.y0.m.n1.g):e.a.a.a.y0.m.n1.g");
    }

    public static final w0 p3(e.a.a.a.y0.b.e eVar) {
        e.a.a.a.y0.b.d x0;
        List<w0> n2;
        e.x.c.i.e(eVar, "$this$underlyingRepresentation");
        if (!eVar.l() || (x0 = eVar.x0()) == null || (n2 = x0.n()) == null) {
            return null;
        }
        return (w0) e.t.g.Q(n2);
    }

    public static e.a.a.a.y0.m.n1.f q(g gVar) {
        e.x.c.i.e(gVar, "$this$asFlexibleType");
        if (gVar instanceof d0) {
            i1 Z0 = ((d0) gVar).Z0();
            if (!(Z0 instanceof x)) {
                Z0 = null;
            }
            return (x) Z0;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + e.x.c.v.a(gVar.getClass())).toString());
    }

    public static final <T> T q0(T[] tArr) {
        e.x.c.i.e(tArr, "$this$firstOrNull");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final boolean q1(e.a.a.a.y0.b.e eVar, e.a.a.a.y0.b.a aVar) {
        e.x.c.i.e(eVar, "$this$hasRealKotlinSuperClassWithOverrideOf");
        e.x.c.i.e(aVar, "specialCallableDescriptor");
        e.a.a.a.y0.b.k b2 = aVar.b();
        Objects.requireNonNull(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        k0 s = ((e.a.a.a.y0.b.e) b2).s();
        e.x.c.i.d(s, "(specialCallableDescript…ssDescriptor).defaultType");
        while (true) {
            eVar = e.a.a.a.y0.j.g.l(eVar);
            boolean z = false;
            if (eVar == null) {
                return false;
            }
            if (!(eVar instanceof e.a.a.a.y0.d.a.a0.d)) {
                k0 s2 = eVar.s();
                if (s2 != null) {
                    if (e.a.a.a.y0.m.l1.r.d(s2, s, new e.a.a.a.y0.m.l1.q()) != null) {
                        z = true;
                    }
                    if (z) {
                        return !e.a.a.a.y0.a.g.B(eVar);
                    }
                } else {
                    e.a.a.a.y0.m.l1.r.a(0);
                    throw null;
                }
            }
        }
    }

    public static final int q2(int i2) {
        return i2 < 0 ? i2 : i2 < 3 ? i2 + 1 : i2 < 1073741824 ? (int) ((((float) i2) / 0.75f) + 1.0f) : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public static e.a.a.a.y0.m.n1.h q3(e.a.a.a.y0.m.n1.f fVar) {
        e.x.c.i.e(fVar, "$this$upperBound");
        if (fVar instanceof x) {
            return ((x) fVar).f9768j;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + e.x.c.v.a(fVar.getClass())).toString());
    }

    public static final <T> Iterable<T> r(T[] tArr) {
        e.x.c.i.e(tArr, "$this$asIterable");
        return tArr.length == 0 ? o.f7934h : new e.t.h(tArr);
    }

    public static final Set<d> r0(Iterable<? extends e.a.a.a.y0.j.y.i> iterable) {
        e.x.c.i.e(iterable, "$this$flatMapClassifierNamesOrNull");
        HashSet hashSet = new HashSet();
        for (e.a.a.a.y0.j.y.i g2 : iterable) {
            Set<d> g3 = g2.g();
            if (g3 == null) {
                return null;
            }
            e.t.g.b(hashSet, g3);
        }
        return hashSet;
    }

    public static final boolean r1(e.a.a.a.y0.e.i iVar) {
        e.x.c.i.e(iVar, "$this$hasReceiver");
        return iVar.t() || iVar.u();
    }

    public static final <K, V> Map<K, V> r2(e.j<? extends K, ? extends V> jVar) {
        e.x.c.i.e(jVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(jVar.f7906h, jVar.f7907i);
        e.x.c.i.d(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    public static e.a.a.a.y0.m.n1.h r3(e.a.a.a.y0.m.n1.m mVar, g gVar) {
        e.a.a.a.y0.m.n1.h k2;
        e.x.c.i.e(gVar, "$this$upperBoundIfFlexible");
        e.a.a.a.y0.m.n1.f u = mVar.u(gVar);
        if (u != null && (k2 = mVar.k(u)) != null) {
            return k2;
        }
        e.a.a.a.y0.m.n1.h a = mVar.a(gVar);
        e.x.c.i.c(a);
        return a;
    }

    public static final <T> e.b0.h<T> s(T[] tArr) {
        e.x.c.i.e(tArr, "$this$asSequence");
        return tArr.length == 0 ? e.b0.d.a : new e.t.i(tArr);
    }

    public static e.a.a.a.y0.m.n1.j s0(e.a.a.a.y0.m.n1.m mVar, e.a.a.a.y0.m.n1.i iVar, int i2) {
        e.x.c.i.e(iVar, "$this$get");
        if (iVar instanceof e.a.a.a.y0.m.n1.h) {
            return mVar.m((g) iVar, i2);
        }
        if (iVar instanceof e.a.a.a.y0.m.n1.a) {
            Object obj = ((e.a.a.a.y0.m.n1.a) iVar).get(i2);
            e.x.c.i.d(obj, "get(index)");
            return (e.a.a.a.y0.m.n1.j) obj;
        }
        throw new IllegalStateException(("unknown type argument list type: " + iVar + ", " + e.x.c.v.a(iVar.getClass())).toString());
    }

    public static final boolean s1(n nVar) {
        e.x.c.i.e(nVar, "$this$hasReceiver");
        return nVar.t() || nVar.u();
    }

    public static final e.a.a.a.y0.d.b.h s2(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$mapToJvmType");
        return (e.a.a.a.y0.d.b.h) v.b(d0Var, e.a.a.a.y0.d.b.j.a, e.a.a.a.y0.d.b.u.f8651m, e.a.a.a.y0.d.b.t.a, e.a.a.a.y0.o.g.f9808b);
    }

    public static final k0 s3(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$upperIfFlexible");
        i1 Z0 = d0Var.Z0();
        if (Z0 instanceof x) {
            return ((x) Z0).f9768j;
        }
        if (Z0 instanceof k0) {
            return (k0) Z0;
        }
        throw new e.h();
    }

    public static final k0 t(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$asSimpleType");
        i1 Z0 = d0Var.Z0();
        if (!(Z0 instanceof k0)) {
            Z0 = null;
        }
        k0 k0Var = (k0) Z0;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + d0Var).toString());
    }

    public static final <T extends Annotation> e.a.e<? extends T> t0(T t) {
        e.x.c.i.e(t, "$this$annotationClass");
        e.a.e<? extends T> U0 = U0(t.annotationType());
        Objects.requireNonNull(U0, "null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
        return U0;
    }

    public static boolean t1(e.a.a.a.y0.m.n1.h hVar, e.a.a.a.y0.m.n1.h hVar2) {
        e.x.c.i.e(hVar, "a");
        e.x.c.i.e(hVar2, "b");
        if (!(hVar instanceof k0)) {
            throw new IllegalArgumentException(b.e.a.a.a.t(hVar, b.e.a.a.a.D("ClassicTypeSystemContext couldn't handle: ", hVar, ", ")).toString());
        } else if (hVar2 instanceof k0) {
            return ((k0) hVar).V0() == ((k0) hVar2).V0();
        } else {
            throw new IllegalArgumentException(b.e.a.a.a.t(hVar2, b.e.a.a.a.D("ClassicTypeSystemContext couldn't handle: ", hVar2, ", ")).toString());
        }
    }

    public static final int t2(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 >= 0 ? i4 : i4 + i3;
    }

    public static e.a.a.a.y0.m.n1.h t3(e.a.a.a.y0.m.n1.h hVar, boolean z) {
        e.x.c.i.e(hVar, "$this$withNullability");
        if (hVar instanceof k0) {
            return ((k0) hVar).a1(z);
        }
        throw new IllegalArgumentException(b.e.a.a.a.t(hVar, b.e.a.a.a.D("ClassicTypeSystemContext couldn't handle: ", hVar, ", ")).toString());
    }

    public static e.a.a.a.y0.m.n1.h u(g gVar) {
        e.x.c.i.e(gVar, "$this$asSimpleType");
        if (gVar instanceof d0) {
            i1 Z0 = ((d0) gVar).Z0();
            if (!(Z0 instanceof k0)) {
                Z0 = null;
            }
            return (k0) Z0;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + e.x.c.v.a(gVar.getClass())).toString());
    }

    public static w0 u0(d dVar, e.a.a.a.y0.b.e eVar) {
        if (dVar == null) {
            b(19);
            throw null;
        } else if (eVar != null) {
            Collection<e.a.a.a.y0.b.d> r = eVar.r();
            if (r.size() != 1) {
                return null;
            }
            for (w0 next : r.iterator().next().n()) {
                if (next.getName().equals(dVar)) {
                    return next;
                }
            }
            return null;
        } else {
            b(20);
            throw null;
        }
    }

    public static int u1(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    public static final q u2(q qVar, e.a.a.a.y0.e.z.e eVar) {
        e.x.c.i.e(qVar, "$this$outerType");
        e.x.c.i.e(eVar, "typeTable");
        if (qVar.w()) {
            return qVar.t;
        }
        if ((qVar.f9033j & 512) == 512) {
            return eVar.a(qVar.u);
        }
        return null;
    }

    public static final i1 u3(i1 i1Var, d0 d0Var) {
        e.x.c.i.e(i1Var, "$this$wrapEnhancement");
        if (d0Var == null) {
            return i1Var;
        }
        if (i1Var instanceof k0) {
            return new e.a.a.a.y0.m.m0((k0) i1Var, d0Var);
        }
        if (i1Var instanceof x) {
            return new z((x) i1Var, d0Var);
        }
        throw new e.h();
    }

    public static final e.a.a.a.y0.b.d0 v(d0 d0Var, e.a.a.a.y0.b.i iVar, int i2) {
        e.a.a.a.y0.b.i iVar2 = null;
        if (iVar == null || e.a.a.a.y0.m.w.j(iVar)) {
            return null;
        }
        int size = iVar.A().size() + i2;
        if (!iVar.t()) {
            if (size != d0Var.V0().size()) {
                e.a.a.a.y0.j.g.t(iVar);
            }
            return new e.a.a.a.y0.b.d0(iVar, d0Var.V0().subList(i2, d0Var.V0().size()), (e.a.a.a.y0.b.d0) null);
        }
        List<y0> subList = d0Var.V0().subList(i2, size);
        e.a.a.a.y0.b.k b2 = iVar.b();
        if (b2 instanceof e.a.a.a.y0.b.i) {
            iVar2 = b2;
        }
        return new e.a.a.a.y0.b.d0(iVar, subList, v(d0Var, iVar2, size));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getDeclaredAnnotations();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<e.a.a.a.y0.b.d1.b.c> v0(e.a.a.a.y0.b.d1.b.f r0) {
        /*
            java.lang.reflect.AnnotatedElement r0 = r0.m()
            if (r0 == 0) goto L_0x0011
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            if (r0 == 0) goto L_0x0011
            java.util.List r0 = w0(r0)
            goto L_0x0013
        L_0x0011:
            e.t.o r0 = e.t.o.f7934h
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.v0(e.a.a.a.y0.b.d1.b.f):java.util.List");
    }

    public static int v1(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    public static int v2(byte[] bArr, int i2, int i3) {
        while (r8 < i3 && bArr[r8] >= 0) {
            i2 = r8 + 1;
        }
        if (r8 >= i3) {
            return 0;
        }
        while (r8 < i3) {
            int i4 = r8 + 1;
            byte b2 = bArr[r8];
            if (b2 < 0) {
                if (b2 >= -32) {
                    if (b2 < -16) {
                        if (i4 < i3 - 1) {
                            int i5 = i4 + 1;
                            byte b3 = bArr[i4];
                            if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                                r8 = i5 + 1;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                    } else if (i4 < i3 - 2) {
                        int i6 = i4 + 1;
                        byte b4 = bArr[i4];
                        if (b4 <= -65) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                                int i7 = i6 + 1;
                                if (bArr[i6] <= -65) {
                                    i4 = i7 + 1;
                                    if (bArr[i7] > -65) {
                                    }
                                }
                            }
                        }
                    }
                    return w1(bArr, i4, i3);
                } else if (i4 >= i3) {
                    return b2;
                } else {
                    if (b2 >= -62) {
                        r8 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                }
                return -1;
            }
            r8 = i4;
        }
        return 0;
    }

    public static b1 v3(b1 b1Var, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        e.x.c.i.e(b1Var, "$this$wrapWithCapturingSubstitution");
        if (!(b1Var instanceof e.a.a.a.y0.m.a0)) {
            return new e.a.a.a.y0.j.s.a.e(b1Var, z, b1Var);
        }
        e.a.a.a.y0.m.a0 a0Var = (e.a.a.a.y0.m.a0) b1Var;
        r0[] r0VarArr = a0Var.f9645b;
        y0[] y0VarArr = a0Var.c;
        e.x.c.i.e(y0VarArr, "$this$zip");
        e.x.c.i.e(r0VarArr, "other");
        int min = Math.min(y0VarArr.length, r0VarArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i3 = 0; i3 < min; i3++) {
            arrayList.add(new e.j(y0VarArr[i3], r0VarArr[i3]));
        }
        ArrayList arrayList2 = new ArrayList(C(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e.j jVar = (e.j) it.next();
            arrayList2.add(S((y0) jVar.f7906h, (r0) jVar.f7907i));
        }
        Object[] array = arrayList2.toArray(new y0[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new e.a.a.a.y0.m.a0(r0VarArr, (y0[]) array, z);
    }

    public static <M extends Member> void w(e.a.a.a.x0.h<? extends M> hVar, Object[] objArr) {
        e.x.c.i.e(objArr, "args");
        if (z0(hVar) != objArr.length) {
            StringBuilder y = b.e.a.a.a.y("Callable expects ");
            y.append(z0(hVar));
            y.append(" arguments, but ");
            throw new IllegalArgumentException(b.e.a.a.a.o(y, objArr.length, " were provided."));
        }
    }

    public static final List<e.a.a.a.y0.b.d1.b.c> w0(Annotation[] annotationArr) {
        e.x.c.i.e(annotationArr, "$this$getAnnotations");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation cVar : annotationArr) {
            arrayList.add(new e.a.a.a.y0.b.d1.b.c(cVar));
        }
        return arrayList;
    }

    public static int w1(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 != 0) {
            if (i4 == 1) {
                return u1(b2, bArr[i2]);
            }
            if (i4 == 2) {
                return v1(b2, bArr[i2], bArr[i2 + 1]);
            }
            throw new AssertionError();
        } else if (b2 > -12) {
            return -1;
        } else {
            return b2;
        }
    }

    public static final d w2(d dVar, boolean z) {
        e.x.c.i.e(dVar, "methodName");
        return x2(dVar, "set", false, z ? "is" : null, 4);
    }

    public static <T> T x(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static e.a.a.a.y0.m.n1.j x0(g gVar, int i2) {
        e.x.c.i.e(gVar, "$this$getArgument");
        if (gVar instanceof d0) {
            return ((d0) gVar).V0().get(i2);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + e.x.c.v.a(gVar.getClass())).toString());
    }

    public static final int x1(int[] iArr, int i2) {
        e.x.c.i.e(iArr, "$this$indexOf");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0127, code lost:
        if (e.a.a.a.y0.f.d.m(r6) == false) goto L_0x0129;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.a.a.a.y0.f.d x2(e.a.a.a.y0.f.d r6, java.lang.String r7, boolean r8, java.lang.String r9, int r10) {
        /*
            r0 = r10 & 4
            r1 = 1
            if (r0 == 0) goto L_0x0006
            r8 = r1
        L_0x0006:
            r10 = r10 & 8
            r0 = 0
            if (r10 == 0) goto L_0x000c
            r9 = r0
        L_0x000c:
            boolean r10 = r6.f9211i
            if (r10 == 0) goto L_0x0012
            goto L_0x0129
        L_0x0012:
            java.lang.String r10 = r6.h()
            java.lang.String r2 = "methodName.identifier"
            e.x.c.i.d(r10, r2)
            r2 = 2
            r3 = 0
            boolean r2 = e.c0.h.C(r10, r7, r3, r2)
            if (r2 != 0) goto L_0x0025
            goto L_0x0129
        L_0x0025:
            int r2 = r10.length()
            int r4 = r7.length()
            if (r2 != r4) goto L_0x0031
            goto L_0x0129
        L_0x0031:
            r2 = 122(0x7a, float:1.71E-43)
            r4 = 97
            int r5 = r7.length()
            char r5 = r10.charAt(r5)
            if (r4 <= r5) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            if (r2 < r5) goto L_0x0044
            goto L_0x0129
        L_0x0044:
            if (r9 == 0) goto L_0x0057
            java.lang.StringBuilder r6 = b.e.a.a.a.y(r9)
            java.lang.String r7 = e.c0.h.t(r10, r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x012b
        L_0x0057:
            if (r8 != 0) goto L_0x005b
            goto L_0x012f
        L_0x005b:
            java.lang.String r6 = e.c0.h.t(r10, r7)
            java.lang.String r7 = "$this$decapitalizeSmartForCompiler"
            e.x.c.i.e(r6, r7)
            int r7 = r6.length()
            if (r7 != 0) goto L_0x006c
            r7 = r1
            goto L_0x006d
        L_0x006c:
            r7 = r3
        L_0x006d:
            if (r7 != 0) goto L_0x0123
            boolean r7 = e.a.a.a.y0.m.o1.c.Q(r6, r3, r1)
            if (r7 != 0) goto L_0x0077
            goto L_0x0123
        L_0x0077:
            int r7 = r6.length()
            java.lang.String r8 = "(this as java.lang.String).substring(startIndex)"
            if (r7 == r1) goto L_0x00e7
            boolean r7 = e.a.a.a.y0.m.o1.c.Q(r6, r1, r1)
            if (r7 != 0) goto L_0x0086
            goto L_0x00e7
        L_0x0086:
            java.lang.String r7 = "$this$indices"
            e.x.c.i.e(r6, r7)
            e.a0.d r7 = new e.a0.d
            int r9 = r6.length()
            int r9 = r9 + -1
            r7.<init>(r3, r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x009a:
            r9 = r7
            e.a0.c r9 = (e.a0.c) r9
            boolean r9 = r9.f7887i
            if (r9 == 0) goto L_0x00b4
            java.lang.Object r9 = r7.next()
            r10 = r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            boolean r10 = e.a.a.a.y0.m.o1.c.Q(r6, r10, r1)
            r10 = r10 ^ r1
            if (r10 == 0) goto L_0x009a
            goto L_0x00b5
        L_0x00b4:
            r9 = r0
        L_0x00b5:
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x00e2
            int r7 = r9.intValue()
            int r7 = r7 - r1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r6.substring(r3, r7)
            java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            e.x.c.i.d(r10, r2)
            java.lang.String r10 = e.a.a.a.y0.m.o1.c.r0(r10, r1)
            r9.append(r10)
            java.lang.String r6 = r6.substring(r7)
            e.x.c.i.d(r6, r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x0123
        L_0x00e2:
            java.lang.String r6 = e.a.a.a.y0.m.o1.c.r0(r6, r1)
            goto L_0x0123
        L_0x00e7:
            java.lang.String r7 = "$this$decapitalizeAsciiOnly"
            e.x.c.i.e(r6, r7)
            int r7 = r6.length()
            if (r7 != 0) goto L_0x00f4
            r7 = r1
            goto L_0x00f5
        L_0x00f4:
            r7 = r3
        L_0x00f5:
            if (r7 == 0) goto L_0x00f8
            goto L_0x0123
        L_0x00f8:
            char r7 = r6.charAt(r3)
            r9 = 90
            r10 = 65
            if (r10 <= r7) goto L_0x0103
            goto L_0x0123
        L_0x0103:
            if (r9 < r7) goto L_0x0123
            char r7 = java.lang.Character.toLowerCase(r7)
            java.lang.String r6 = r6.substring(r1)
            e.x.c.i.d(r6, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
        L_0x0123:
            boolean r7 = e.a.a.a.y0.f.d.m(r6)
            if (r7 != 0) goto L_0x012b
        L_0x0129:
            r6 = r0
            goto L_0x012f
        L_0x012b:
            e.a.a.a.y0.f.d r6 = e.a.a.a.y0.f.d.l(r6)
        L_0x012f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.a.x2(e.a.a.a.y0.f.d, java.lang.String, boolean, java.lang.String, int):e.a.a.a.y0.f.d");
    }

    public static e.a.a.a.y0.d.a.b0.h y(e.a.a.a.y0.d.a.b0.h hVar, e.a.a.a.y0.b.g gVar, e.a.a.a.y0.d.a.d0.x xVar, int i2, int i3) {
        e.a.a.a.y0.d.a.b0.m mVar;
        if ((i3 & 2) != 0) {
            xVar = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        e.x.c.i.e(hVar, "$this$childForClassOrPackage");
        e.x.c.i.e(gVar, "containingDeclaration");
        e.f g2 = g2(e.g.NONE, new e.a.a.a.y0.d.a.b0.a(hVar, gVar));
        e.a.a.a.y0.d.a.b0.c cVar = hVar.c;
        if (xVar != null) {
            mVar = new e.a.a.a.y0.d.a.b0.i(hVar, gVar, xVar, i2);
        } else {
            mVar = hVar.d;
        }
        return new e.a.a.a.y0.d.a.b0.h(cVar, mVar, g2);
    }

    public static e.a.a.a.y0.m.n1.j y0(e.a.a.a.y0.m.n1.m mVar, e.a.a.a.y0.m.n1.h hVar, int i2) {
        e.x.c.i.e(hVar, "$this$getArgumentOrNull");
        int c = mVar.c(hVar);
        if (i2 >= 0 && c > i2) {
            return mVar.m(hVar, i2);
        }
        return null;
    }

    public static final <T> int y1(T[] tArr, T t) {
        e.x.c.i.e(tArr, "$this$indexOf");
        int i2 = 0;
        if (t == null) {
            int length = tArr.length;
            while (i2 < length) {
                if (tArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i2 < length2) {
            if (e.x.c.i.a(t, tArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final q y2(e.a.a.a.y0.e.i iVar, e.a.a.a.y0.e.z.e eVar) {
        e.x.c.i.e(iVar, "$this$receiverType");
        e.x.c.i.e(eVar, "typeTable");
        if (iVar.t()) {
            return iVar.f8933q;
        }
        if (iVar.u()) {
            return eVar.a(iVar.r);
        }
        return null;
    }

    public static final e.a.a.a.y0.d.a.b0.h z(e.a.a.a.y0.d.a.b0.h hVar, e.a.a.a.y0.b.k kVar, e.a.a.a.y0.d.a.d0.x xVar, int i2) {
        e.x.c.i.e(hVar, "$this$childForMethod");
        e.x.c.i.e(kVar, "containingDeclaration");
        e.x.c.i.e(xVar, "typeParameterOwner");
        return new e.a.a.a.y0.d.a.b0.h(hVar.c, new e.a.a.a.y0.d.a.b0.i(hVar, kVar, xVar, i2), hVar.f8367e);
    }

    public static final int z0(e.a.a.a.x0.h<?> hVar) {
        e.x.c.i.e(hVar, "$this$arity");
        return hVar.a().size();
    }

    public static final i1 z1(i1 i1Var, d0 d0Var) {
        e.x.c.i.e(i1Var, "$this$inheritEnhancement");
        e.x.c.i.e(d0Var, "origin");
        return u3(i1Var, G0(d0Var));
    }

    public static final void z2(c cVar, e.a.a.a.y0.c.a.b bVar, e.a.a.a.y0.b.e eVar, d dVar) {
        e.a.a.a.y0.c.a.a d;
        e.x.c.i.e(cVar, "$this$record");
        e.x.c.i.e(bVar, "from");
        e.x.c.i.e(eVar, "scopeOwner");
        e.x.c.i.e(dVar, "name");
        if (cVar != c.a.a && (d = bVar.d()) != null) {
            e b2 = cVar.b() ? d.b() : e.f8318j;
            String a = d.a();
            String b3 = e.a.a.a.y0.j.g.g(eVar).b();
            e.x.c.i.d(b3, "DescriptorUtils.getFqName(scopeOwner).asString()");
            f fVar = f.CLASSIFIER;
            String e2 = dVar.e();
            e.x.c.i.d(e2, "name.asString()");
            cVar.a(a, b2, b3, fVar, e2);
        }
    }
}
