package e.a.a.a.y0.m.o1;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.utils.Utils;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.f;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.m.a1;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.d1;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.f1;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.p0;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.m.x;
import e.a.a.a.y0.n.b;
import e.b0.d;
import e.b0.g;
import e.b0.h;
import e.b0.m;
import e.b0.n;
import e.b0.u;
import e.j;
import e.k;
import e.v.e;
import e.x.b.a;
import e.x.b.l;
import e.x.c.i;
import g.a.a0;
import g.a.b1;
import g.a.e1;
import g.a.f0;
import g.a.g0;
import g.a.g1;
import g.a.h0;
import g.a.j0;
import g.a.n1;
import g.a.r;
import g.a.r1;
import g.a.v;
import g.a.y;
import g.a.y0;
import g.a.z;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlinx.coroutines.CoroutineExceptionHandler;
import n.m0.f.d;
import o.o;
import o.p;
import o.t;
import o.w;

public final class c {
    public static final String A(long j2) {
        StringBuilder sb;
        long j3;
        StringBuilder sb2;
        long j4;
        StringBuilder sb3;
        long j5;
        if (j2 <= ((long) -999500000)) {
            sb = new StringBuilder();
            j3 = j2 - ((long) 500000000);
        } else {
            if (j2 <= ((long) -999500)) {
                sb2 = new StringBuilder();
                j4 = j2 - ((long) 500000);
            } else {
                if (j2 <= 0) {
                    sb3 = new StringBuilder();
                    j5 = j2 - ((long) 500);
                } else if (j2 < ((long) 999500)) {
                    sb3 = new StringBuilder();
                    j5 = j2 + ((long) 500);
                } else if (j2 < ((long) 999500000)) {
                    sb2 = new StringBuilder();
                    j4 = j2 + ((long) 500000);
                } else {
                    sb = new StringBuilder();
                    j3 = j2 + ((long) 500000000);
                }
                sb3.append(j5 / ((long) 1000));
                sb3.append(" µs");
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
                i.d(format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb3.append(j4 / ((long) 1000000));
            sb3.append(" ms");
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
            i.d(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb3.append(j3 / ((long) Utils.SECOND_IN_NANOS));
        sb3.append(" s ");
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
        i.d(format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    public static final <T> h<T> B(T t, l<? super T, ? extends T> lVar) {
        i.e(lVar, "nextFunction");
        return t == null ? d.a : new g(new n(t), lVar);
    }

    public static final <T> h<T> C(a<? extends T> aVar) {
        i.e(aVar, "nextFunction");
        g gVar = new g(aVar, new m(aVar));
        i.e(gVar, "$this$constrainOnce");
        return gVar instanceof e.b0.a ? (e.b0.a) gVar : new e.b0.a(gVar);
    }

    public static final e.a.a.a.y0.a.g D(d0 d0Var) {
        i.e(d0Var, "$this$builtIns");
        e.a.a.a.y0.a.g v = d0Var.W0().v();
        i.d(v, "constructor.builtIns");
        return v;
    }

    public static final String E(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String F(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final d0 G(r0 r0Var) {
        T t;
        i.e(r0Var, "$this$representativeUpperBound");
        List<d0> upperBounds = r0Var.getUpperBounds();
        i.d(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<d0> upperBounds2 = r0Var.getUpperBounds();
        i.d(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T d = ((d0) next).W0().d();
            if (d instanceof e) {
                t = d;
            }
            e eVar = (e) t;
            boolean z = false;
            if (!(eVar == null || eVar.i() == f.INTERFACE || eVar.i() == f.ANNOTATION_CLASS)) {
                z = true;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        d0 d0Var = (d0) t;
        if (d0Var != null) {
            return d0Var;
        }
        List<d0> upperBounds3 = r0Var.getUpperBounds();
        i.d(upperBounds3, "upperBounds");
        Object o2 = e.t.g.o(upperBounds3);
        i.d(o2, "upperBounds.first()");
        return (d0) o2;
    }

    public static final void H(e.v.f fVar, Throwable th) {
        try {
            int i2 = CoroutineExceptionHandler.f;
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.a.a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fVar, th);
            } else {
                y.a(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                b.q.a.a.k(runtimeException, th);
                th = runtimeException;
            }
            y.a(fVar, th);
        }
    }

    public static <N> Boolean I(Collection<N> collection, e.a.a.a.y0.o.c<N> cVar, l<N, Boolean> lVar) {
        return (Boolean) w(collection, cVar, new e.a.a.a.y0.o.a(lVar, new boolean[1]));
    }

    public static String J(b bVar, s sVar) {
        i.e(sVar, "functionDescriptor");
        if (!bVar.b(sVar)) {
            return bVar.getDescription();
        }
        return null;
    }

    public static /* synthetic */ j0 K(y0 y0Var, boolean z, boolean z2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return y0Var.O(z, z2, lVar);
    }

    public static final boolean L(AssertionError assertionError) {
        Logger logger = p.a;
        i.e(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? e.c0.h.d(message, "getsockname failed", false, 2) : false;
    }

    public static final boolean M(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final boolean N(o.e eVar) {
        i.e(eVar, "$this$isProbablyUtf8");
        try {
            o.e eVar2 = new o.e();
            long j2 = eVar.f10453i;
            eVar.z(eVar2, 0, j2 > 64 ? 64 : j2);
            for (int i2 = 0; i2 < 16; i2++) {
                if (eVar2.D()) {
                    return true;
                }
                int o0 = eVar2.o0();
                if (Character.isISOControl(o0) && !Character.isWhitespace(o0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static final boolean O(Throwable th) {
        i.e(th, "$this$isProcessCanceledException");
        Class cls = th.getClass();
        while (!i.a(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final boolean P(d0 d0Var) {
        i.e(d0Var, "$this$isTypeParameter");
        return f1.h(d0Var);
    }

    public static final boolean Q(String str, int i2, boolean z) {
        char charAt = str.charAt(i2);
        return z ? 'A' <= charAt && 'Z' >= charAt : Character.isUpperCase(charAt);
    }

    public static final boolean R(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static y0 S(z zVar, e.v.f fVar, a0 a0Var, e.x.b.p pVar, int i2, Object obj) {
        a0 a0Var2 = null;
        e.v.h hVar = (i2 & 1) != 0 ? e.v.h.f7949h : null;
        if ((i2 & 2) != 0) {
            a0Var2 = a0.DEFAULT;
        }
        e.v.f a = v.a(zVar, hVar);
        Objects.requireNonNull(a0Var2);
        g.a.b g1Var = a0Var2 == a0.LAZY ? new g1(a, pVar) : new n1(a, true);
        g1Var.M(a0Var2, g1Var, pVar);
        return g1Var;
    }

    public static final e.a.a.a.y0.o.l<e.a.a.a.y0.j.y.i> T(Iterable<? extends e.a.a.a.y0.j.y.i> iterable) {
        i.e(iterable, "scopes");
        e.a.a.a.y0.o.l<e.a.a.a.y0.j.y.i> lVar = new e.a.a.a.y0.o.l<>();
        for (Object next : iterable) {
            e.a.a.a.y0.j.y.i iVar = (e.a.a.a.y0.j.y.i) next;
            if ((iVar == null || iVar == i.b.f9460b) ? false : true) {
                lVar.add(next);
            }
        }
        return lVar;
    }

    public static final d0 U(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$makeNullable");
        d0 j2 = f1.j(d0Var);
        e.x.c.i.d(j2, "TypeUtils.makeNullable(this)");
        return j2;
    }

    public static boolean V(SSLSocketFactory sSLSocketFactory) {
        e.x.c.i.e(sSLSocketFactory, "sslSocketFactory");
        return false;
    }

    public static final <K, V> HashMap<K, V> W(int i2) {
        return new HashMap<>(n(i2));
    }

    public static final <T> Object X(Object obj, e.v.d<? super T> dVar) {
        return obj instanceof r ? b.q.a.a.Z(((r) obj).a) : obj;
    }

    public static final d0 Y(d0 d0Var, e.a.a.a.y0.b.a1.h hVar) {
        e.x.c.i.e(d0Var, "$this$replaceAnnotations");
        e.x.c.i.e(hVar, "newAnnotations");
        return (!d0Var.k().isEmpty() || !hVar.isEmpty()) ? d0Var.Z0().c1(hVar) : d0Var;
    }

    public static final d0 Z(d0 d0Var) {
        k0 k0Var;
        e.x.c.i.e(d0Var, "$this$replaceArgumentsWithStarProjections");
        i1 Z0 = d0Var.Z0();
        if (Z0 instanceof x) {
            x xVar = (x) Z0;
            k0 k0Var2 = xVar.f9767i;
            if (!k0Var2.W0().g().isEmpty() && k0Var2.W0().d() != null) {
                List<r0> g2 = k0Var2.W0().g();
                e.x.c.i.d(g2, "constructor.parameters");
                ArrayList arrayList = new ArrayList(b.q.a.a.C(g2, 10));
                for (r0 p0Var : g2) {
                    arrayList.add(new p0(p0Var));
                }
                k0Var2 = b.q.a.a.F2(k0Var2, arrayList, (e.a.a.a.y0.b.a1.h) null, 2);
            }
            k0 k0Var3 = xVar.f9768j;
            if (!k0Var3.W0().g().isEmpty() && k0Var3.W0().d() != null) {
                List<r0> g3 = k0Var3.W0().g();
                e.x.c.i.d(g3, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(b.q.a.a.C(g3, 10));
                for (r0 p0Var2 : g3) {
                    arrayList2.add(new p0(p0Var2));
                }
                k0Var3 = b.q.a.a.F2(k0Var3, arrayList2, (e.a.a.a.y0.b.a1.h) null, 2);
            }
            k0Var = e0.c(k0Var2, k0Var3);
        } else if (Z0 instanceof k0) {
            k0 k0Var4 = (k0) Z0;
            boolean isEmpty = k0Var4.W0().g().isEmpty();
            k0Var = k0Var4;
            if (!isEmpty) {
                e.a.a.a.y0.b.h d = k0Var4.W0().d();
                k0Var = k0Var4;
                if (d != null) {
                    List<r0> g4 = k0Var4.W0().g();
                    e.x.c.i.d(g4, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(b.q.a.a.C(g4, 10));
                    for (r0 p0Var3 : g4) {
                        arrayList3.add(new p0(p0Var3));
                    }
                    k0Var = b.q.a.a.F2(k0Var4, arrayList3, (e.a.a.a.y0.b.a1.h) null, 2);
                }
            }
        } else {
            throw new e.h();
        }
        return b.q.a.a.z1(k0Var, Z0);
    }

    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        switch (i2) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i2) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final d0 a0(d0 d0Var, List<e.a.a.a.y0.m.p1.f> list) {
        a1 a1Var;
        a1 a1Var2;
        d0Var.V0().size();
        list.size();
        ArrayList arrayList = new ArrayList(b.q.a.a.C(list, 10));
        for (e.a.a.a.y0.m.p1.f fVar : list) {
            j1 j1Var = j1.OUT_VARIANCE;
            j1 j1Var2 = j1.IN_VARIANCE;
            Objects.requireNonNull(fVar);
            e.a.a.a.y0.m.l1.d.a.d(fVar.f9750b, fVar.c);
            e.a.a.a.y0.m.p1.e eVar = new e.a.a.a.y0.m.p1.e(fVar);
            if (e.x.c.i.a(fVar.f9750b, fVar.c)) {
                a1Var = new a1(fVar.f9750b);
            } else {
                if (e.a.a.a.y0.a.g.G(fVar.f9750b) && fVar.a.u() != j1Var2) {
                    a1Var2 = new a1(eVar.invoke(j1Var), fVar.c);
                } else if (e.a.a.a.y0.a.g.H(fVar.c)) {
                    a1Var = new a1(eVar.invoke(j1Var2), fVar.f9750b);
                } else {
                    a1Var2 = new a1(eVar.invoke(j1Var), fVar.c);
                }
                a1Var = a1Var2;
            }
            arrayList.add(a1Var);
        }
        return b.q.a.a.D2(d0Var, arrayList, d0Var.k());
    }

    public static final z b(e.v.f fVar) {
        if (fVar.get(y0.f10039g) == null) {
            fVar = fVar.plus(c((y0) null, 1, (Object) null));
        }
        return new g.a.a.e(fVar);
    }

    public static final <T> void b0(h0<? super T> h0Var, e.v.d<? super T> dVar, boolean z) {
        Object g2 = h0Var.g();
        Throwable d = h0Var.d(g2);
        Object Z = d != null ? b.q.a.a.Z(d) : h0Var.e(g2);
        if (z) {
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
            g.a.a.f fVar = (g.a.a.f) dVar;
            e.v.f context = fVar.getContext();
            Object b2 = g.a.a.a.b(context, fVar.f9904m);
            try {
                fVar.f9906o.c(Z);
            } finally {
                g.a.a.a.a(context, b2);
            }
        } else {
            dVar.c(Z);
        }
    }

    public static g.a.p c(y0 y0Var, int i2, Object obj) {
        int i3 = i2 & 1;
        return new b1((y0) null);
    }

    public static final int c0(w wVar, int i2) {
        int i3;
        e.x.c.i.e(wVar, "$this$segment");
        int[] iArr = wVar.f10494n;
        int i4 = i2 + 1;
        int length = wVar.f10493m.length;
        e.x.c.i.e(iArr, "$this$binarySearch");
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static final void d(n.m0.f.a aVar, n.m0.f.c cVar, String str) {
        d.b bVar = n.m0.f.d.f10161j;
        Logger logger = n.m0.f.d.f10160i;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f);
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        e.x.c.i.d(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.c);
        logger.fine(sb.toString());
    }

    public static final <T> h<T> d0(T... tArr) {
        e.x.c.i.e(tArr, "elements");
        return tArr.length == 0 ? e.b0.d.a : b.q.a.a.s(tArr);
    }

    public static final <T> void e(Collection<T> collection, T t) {
        e.x.c.i.e(collection, "$this$addIfNotNull");
        if (t != null) {
            collection.add(t);
        }
    }

    public static final o.x e0(Socket socket) {
        Logger logger = p.a;
        e.x.c.i.e(socket, "$this$sink");
        o.y yVar = new o.y(socket);
        OutputStream outputStream = socket.getOutputStream();
        e.x.c.i.d(outputStream, "getOutputStream()");
        o.r rVar = new o.r(outputStream, yVar);
        e.x.c.i.e(rVar, "sink");
        return new o.c(yVar, rVar);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [e.x.b.l, e.x.b.l<? super T, ? extends java.lang.CharSequence>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void f(java.lang.Appendable r1, T r2, e.x.b.l<? super T, ? extends java.lang.CharSequence> r3) {
        /*
            java.lang.String r0 = "$this$appendElement"
            e.x.c.i.e(r1, r0)
            if (r3 == 0) goto L_0x000c
            java.lang.Object r2 = r3.invoke(r2)
            goto L_0x0014
        L_0x000c:
            if (r2 == 0) goto L_0x0011
            boolean r3 = r2 instanceof java.lang.CharSequence
            goto L_0x0012
        L_0x0011:
            r3 = 1
        L_0x0012:
            if (r3 == 0) goto L_0x0017
        L_0x0014:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L_0x0029
        L_0x0017:
            boolean r3 = r2 instanceof java.lang.Character
            if (r3 == 0) goto L_0x0025
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r1.append(r2)
            goto L_0x002c
        L_0x0025:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L_0x0029:
            r1.append(r2)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.o1.c.f(java.lang.Appendable, java.lang.Object, e.x.b.l):void");
    }

    public static final o.z f0(InputStream inputStream) {
        Logger logger = p.a;
        e.x.c.i.e(inputStream, "$this$source");
        return new o(inputStream, new o.a0());
    }

    public static final e.a.a.a.y0.m.p1.a<d0> g(d0 d0Var) {
        Object obj;
        e.a.a.a.y0.m.p1.f fVar;
        e.x.c.i.e(d0Var, "type");
        if (b.q.a.a.K1(d0Var)) {
            e.a.a.a.y0.m.p1.a<d0> g2 = g(b.q.a.a.o2(d0Var));
            e.a.a.a.y0.m.p1.a<d0> g3 = g(b.q.a.a.s3(d0Var));
            return new e.a.a.a.y0.m.p1.a<>(b.q.a.a.z1(e0.c(b.q.a.a.o2((d0) g2.a), b.q.a.a.s3((d0) g3.a)), d0Var), b.q.a.a.z1(e0.c(b.q.a.a.o2((d0) g2.f9746b), b.q.a.a.s3((d0) g3.f9746b)), d0Var));
        }
        v0 W0 = d0Var.W0();
        boolean z = true;
        if (b.q.a.a.B1(d0Var)) {
            Objects.requireNonNull(W0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            e.a.a.a.y0.m.y0 c = ((e.a.a.a.y0.j.s.a.b) W0).c();
            e.a.a.a.y0.m.p1.b bVar = new e.a.a.a.y0.m.p1.b(d0Var);
            d0 d = c.d();
            e.x.c.i.d(d, "typeProjection.type");
            d0 a = bVar.invoke(d);
            int ordinal = c.b().ordinal();
            if (ordinal == 1) {
                k0 p2 = D(d0Var).p();
                e.x.c.i.d(p2, "type.builtIns.nullableAnyType");
                return new e.a.a.a.y0.m.p1.a<>(a, p2);
            } else if (ordinal == 2) {
                k0 o2 = D(d0Var).o();
                e.x.c.i.d(o2, "type.builtIns.nothingType");
                return new e.a.a.a.y0.m.p1.a<>(bVar.invoke(o2), a);
            } else {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + c);
            }
        } else if (d0Var.V0().isEmpty() || d0Var.V0().size() != W0.g().size()) {
            return new e.a.a.a.y0.m.p1.a<>(d0Var, d0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<e.a.a.a.y0.m.y0> V0 = d0Var.V0();
            List<r0> g4 = W0.g();
            e.x.c.i.d(g4, "typeConstructor.parameters");
            Iterator it = ((ArrayList) e.t.g.f0(V0, g4)).iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                e.a.a.a.y0.m.y0 y0Var = (e.a.a.a.y0.m.y0) jVar.f7906h;
                r0 r0Var = (r0) jVar.f7907i;
                e.x.c.i.d(r0Var, "typeParameter");
                j1 u = r0Var.u();
                d1 d1Var = d1.f9651b;
                if (u == null) {
                    d1.a(32);
                    throw null;
                } else if (y0Var != null) {
                    int ordinal2 = (y0Var.c() ? j1.OUT_VARIANCE : d1.b(u, y0Var.b())).ordinal();
                    if (ordinal2 == 0) {
                        d0 d2 = y0Var.d();
                        e.x.c.i.d(d2, "type");
                        d0 d3 = y0Var.d();
                        e.x.c.i.d(d3, "type");
                        fVar = new e.a.a.a.y0.m.p1.f(r0Var, d2, d3);
                    } else if (ordinal2 == 1) {
                        d0 d4 = y0Var.d();
                        e.x.c.i.d(d4, "type");
                        k0 p3 = e.a.a.a.y0.j.v.b.f(r0Var).p();
                        e.x.c.i.d(p3, "typeParameter.builtIns.nullableAnyType");
                        fVar = new e.a.a.a.y0.m.p1.f(r0Var, d4, p3);
                    } else if (ordinal2 == 2) {
                        k0 o3 = e.a.a.a.y0.j.v.b.f(r0Var).o();
                        e.x.c.i.d(o3, "typeParameter.builtIns.nothingType");
                        d0 d5 = y0Var.d();
                        e.x.c.i.d(d5, "type");
                        fVar = new e.a.a.a.y0.m.p1.f(r0Var, o3, d5);
                    } else {
                        throw new e.h();
                    }
                    if (y0Var.c()) {
                        arrayList.add(fVar);
                        arrayList2.add(fVar);
                    } else {
                        e.a.a.a.y0.m.p1.a<d0> g5 = g(fVar.f9750b);
                        e.a.a.a.y0.m.p1.a<d0> g6 = g(fVar.c);
                        e.a.a.a.y0.m.p1.f fVar2 = new e.a.a.a.y0.m.p1.f(fVar.a, (d0) g5.f9746b, (d0) g6.a);
                        e.a.a.a.y0.m.p1.f fVar3 = new e.a.a.a.y0.m.p1.f(fVar.a, (d0) g5.a, (d0) g6.f9746b);
                        arrayList.add(fVar2);
                        arrayList2.add(fVar3);
                    }
                } else {
                    d1.a(33);
                    throw null;
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    e.a.a.a.y0.m.p1.f fVar4 = (e.a.a.a.y0.m.p1.f) it2.next();
                    Objects.requireNonNull(fVar4);
                    if (!e.a.a.a.y0.m.l1.d.a.d(fVar4.f9750b, fVar4.c)) {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                obj = D(d0Var).o();
                e.x.c.i.d(obj, "type.builtIns.nothingType");
            } else {
                obj = a0(d0Var, arrayList);
            }
            return new e.a.a.a.y0.m.p1.a<>(obj, a0(d0Var, arrayList2));
        }
    }

    public static final o.z g0(Socket socket) {
        Logger logger = p.a;
        e.x.c.i.e(socket, "$this$source");
        o.y yVar = new o.y(socket);
        InputStream inputStream = socket.getInputStream();
        e.x.c.i.d(inputStream, "getInputStream()");
        o oVar = new o(inputStream, yVar);
        e.x.c.i.e(oVar, "source");
        return new o.d(yVar, oVar);
    }

    public static final boolean h(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        e.x.c.i.e(bArr, "a");
        e.x.c.i.e(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final void h0(e.v.d<? super e.r> dVar, e.v.d<?> dVar2) {
        try {
            g.a.a.g.b(b.q.a.a.A1(dVar), e.r.a, (l) null, 2);
        } catch (Throwable th) {
            ((g.a.b) dVar2).c(b.q.a.a.Z(th));
        }
    }

    public static final <T> h<T> i(Iterator<? extends T> it) {
        e.x.c.i.e(it, "$this$asSequence");
        e.b0.j jVar = new e.b0.j(it);
        e.x.c.i.e(jVar, "$this$constrainOnce");
        return jVar instanceof e.b0.a ? (e.b0.a) jVar : new e.b0.a(jVar);
    }

    public static void i0(e.x.b.p pVar, Object obj, e.v.d dVar, l lVar, int i2) {
        int i3 = i2 & 4;
        try {
            g.a.a.g.a(b.q.a.a.A1(b.q.a.a.T(pVar, obj, dVar)), e.r.a, (l<? super Throwable, e.r>) null);
        } catch (Throwable th) {
            dVar.c(b.q.a.a.Z(th));
        }
    }

    public static final e.a.a.a.y0.m.y0 j(d0 d0Var) {
        e.x.c.i.e(d0Var, "$this$asTypeProjection");
        return new a1(d0Var);
    }

    public static final <T, R> Object j0(g.a.a.p<? super T> pVar, R r, e.x.b.p<? super R, ? super e.v.d<? super T>, ? extends Object> pVar2) {
        Object obj;
        Object v;
        pVar.K();
        if (pVar2 != null) {
            try {
                e.x.c.y.b(pVar2, 2);
                obj = pVar2.invoke(r, pVar);
            } catch (Throwable th) {
                obj = new r(th, false, 2);
            }
            e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
            if (obj == aVar || (v = pVar.v(obj)) == e1.f9944b) {
                return aVar;
            }
            if (!(v instanceof r)) {
                return e1.a(v);
            }
            throw ((r) v).a;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    public static g.a.d0 k(z zVar, e.v.f fVar, a0 a0Var, e.x.b.p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fVar = e.v.h.f7949h;
        }
        a0 a0Var2 = (i2 & 2) != 0 ? a0.DEFAULT : null;
        e.v.f a = v.a(zVar, fVar);
        Objects.requireNonNull(a0Var2);
        f0 f1Var = a0Var2 == a0.LAZY ? new g.a.f1(a, pVar) : new f0(a, true);
        f1Var.M(a0Var2, f1Var, pVar);
        return f1Var;
    }

    public static final long k0(String str, long j2, long j3, long j4) {
        String l0 = l0(str);
        if (l0 == null) {
            return j2;
        }
        e.x.c.i.e(l0, "$this$toLongOrNull");
        Long M = e.c0.h.M(l0, 10);
        if (M != null) {
            long longValue = M.longValue();
            if (j3 <= longValue && j4 >= longValue) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + l0 + '\'').toString());
    }

    public static final o.f l(o.x xVar) {
        e.x.c.i.e(xVar, "$this$buffer");
        return new o.s(xVar);
    }

    public static final String l0(String str) {
        int i2 = g.a.a.r.a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final o.g m(o.z zVar) {
        e.x.c.i.e(zVar, "$this$buffer");
        return new t(zVar);
    }

    public static int m0(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return (int) k0(str, (long) i2, (long) i3, (long) i4);
    }

    public static final int n(int i2) {
        if (i2 < 3) {
            return 3;
        }
        return (i2 / 3) + i2 + 1;
    }

    public static /* synthetic */ long n0(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = RecyclerView.FOREVER_NS;
        }
        return k0(str, j2, j5, j4);
    }

    public static final String o(String str) {
        char charAt;
        e.x.c.i.e(str, "$this$capitalizeAsciiOnly");
        if ((str.length() == 0) || 'a' > (charAt = str.charAt(0)) || 'z' < charAt) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        e.x.c.i.d(substring, "(this as java.lang.String).substring(startIndex)");
        return String.valueOf(upperCase) + substring;
    }

    public static final String o0(String str) {
        e.x.c.i.e(str, "$this$toCanonicalHost");
        int i2 = 0;
        int i3 = -1;
        if (e.c0.h.d(str, ":", false, 2)) {
            InetAddress v = (!e.c0.h.C(str, "[", false, 2) || !e.c0.h.e(str, "]", false, 2)) ? v(str, 0, str.length()) : v(str, 1, str.length() - 1);
            if (v == null) {
                return null;
            }
            byte[] address = v.getAddress();
            if (address.length == 16) {
                e.x.c.i.d(address, "address");
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i3 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                o.e eVar = new o.e();
                while (i2 < address.length) {
                    if (i2 == i3) {
                        eVar.u0(58);
                        i2 += i5;
                        if (i2 == 16) {
                            eVar.u0(58);
                        }
                    } else {
                        if (i2 > 0) {
                            eVar.u0(58);
                        }
                        byte b2 = address[i2];
                        byte[] bArr = n.m0.c.a;
                        eVar.o((long) (((b2 & ExifInterface.MARKER) << 8) | (address[i2 + 1] & ExifInterface.MARKER)));
                        i2 += 2;
                    }
                }
                return eVar.m0();
            } else if (address.length == 4) {
                return v.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                e.x.c.i.d(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                e.x.c.i.d(locale, "Locale.US");
                String lowerCase = ascii.toLowerCase(locale);
                e.x.c.i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    char charAt = lowerCase.charAt(i8);
                    if (e.x.c.i.g(charAt, 31) <= 0) {
                        break;
                    } else if (e.x.c.i.g(charAt, 127) >= 0) {
                        break;
                    } else if (e.c0.h.k(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        break;
                    } else {
                        i8++;
                    }
                }
                i2 = 1;
                if (i2 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static final void p(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final String p0(e.v.d<?> dVar) {
        String str;
        if (dVar instanceof g.a.a.f) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + F(dVar);
        } catch (Throwable th) {
            str = b.q.a.a.Z(th);
        }
        Throwable a = k.a(str);
        String str2 = str;
        if (a != null) {
            str2 = dVar.getClass().getName() + '@' + F(dVar);
        }
        return (String) str2;
    }

    public static final int q(int i2) {
        if (2 <= i2 && 36 >= i2) {
            return i2;
        }
        StringBuilder z = b.e.a.a.a.z("radix ", i2, " was not in valid range ");
        z.append(new e.a0.d(2, 36));
        throw new IllegalArgumentException(z.toString());
    }

    public static final String q0(byte b2) {
        char[] cArr = o.b0.b.a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final <T> List<T> r(ArrayList<T> arrayList) {
        e.x.c.i.e(arrayList, "$this$compact");
        int size = arrayList.size();
        if (size == 0) {
            return e.t.o.f7934h;
        }
        if (size == 1) {
            return b.q.a.a.l2(e.t.g.o(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final String r0(String str, boolean z) {
        if (z) {
            e.x.c.i.e(str, "$this$toLowerCaseAsciiOnly");
            StringBuilder sb = new StringBuilder(str.length());
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if ('A' <= charAt && 'Z' >= charAt) {
                    charAt = Character.toLowerCase(charAt);
                }
                sb.append(charAt);
            }
            String sb2 = sb.toString();
            e.x.c.i.d(sb2, "builder.toString()");
            return sb2;
        }
        String lowerCase = str.toLowerCase();
        e.x.c.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    public static final <T> Collection<T> s(Collection<? extends T> collection, Collection<? extends T> collection2) {
        e.x.c.i.e(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final <T> Object s0(Object obj, l<? super Throwable, e.r> lVar) {
        Throwable a = k.a(obj);
        return a == null ? lVar != null ? new g.a.s(obj, lVar) : obj : new r(a, false, 2);
    }

    public static final boolean t(d0 d0Var, l<? super i1, Boolean> lVar) {
        e.x.c.i.e(d0Var, "$this$contains");
        e.x.c.i.e(lVar, "predicate");
        return f1.c(d0Var, lVar);
    }

    public static X509TrustManager t0(SSLSocketFactory sSLSocketFactory) {
        e.x.c.i.e(sSLSocketFactory, "sslSocketFactory");
        return null;
    }

    public static final e.a.a.a.y0.m.y0 u(d0 d0Var, j1 j1Var, r0 r0Var) {
        e.x.c.i.e(d0Var, "type");
        e.x.c.i.e(j1Var, "projectionKind");
        if ((r0Var != null ? r0Var.u() : null) == j1Var) {
            j1Var = j1.INVARIANT;
        }
        return new a1(j1Var, d0Var);
    }

    /* JADX INFO: finally extract failed */
    public static final <T> Object u0(e.v.f fVar, e.x.b.p<? super z, ? super e.v.d<? super T>, ? extends Object> pVar, e.v.d<? super T> dVar) {
        Object obj;
        e.v.f fVar2 = ((e.v.j.a.c) dVar).f7964j;
        e.x.c.i.c(fVar2);
        e.v.f plus = fVar2.plus(fVar);
        y0 y0Var = (y0) plus.get(y0.f10039g);
        if (y0Var == null || y0Var.b()) {
            if (plus == fVar2) {
                g.a.a.p pVar2 = new g.a.a.p(plus, dVar);
                obj = j0(pVar2, pVar2, pVar);
            } else {
                int i2 = e.v.e.d;
                e.a aVar = e.a.a;
                if (e.x.c.i.a((e.v.e) plus.get(aVar), (e.v.e) fVar2.get(aVar))) {
                    r1 r1Var = new r1(plus, dVar);
                    Object b2 = g.a.a.a.b(plus, (Object) null);
                    try {
                        Object j0 = j0(r1Var, r1Var, pVar);
                        g.a.a.a.a(plus, b2);
                        obj = j0;
                    } catch (Throwable th) {
                        g.a.a.a.a(plus, b2);
                        throw th;
                    }
                } else {
                    g0 g0Var = new g0(plus, dVar);
                    g0Var.K();
                    i0(pVar, g0Var, g0Var, (l) null, 4);
                    obj = g0Var.P();
                }
            }
            if (obj == e.v.i.a.COROUTINE_SUSPENDED) {
                e.x.c.i.e(dVar, "frame");
            }
            return obj;
        }
        throw y0Var.S();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r0 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress v(java.lang.String r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r18
            r8 = r4
            r9 = r8
            r7 = r5
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00df
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 4
            r13 = 255(0xff, float:3.57E-43)
            if (r11 > r1) goto L_0x0033
            java.lang.String r14 = "::"
            boolean r14 = e.c0.h.B(r0, r14, r6, r5, r12)
            if (r14 == 0) goto L_0x0033
            if (r8 == r4) goto L_0x0027
            return r10
        L_0x0027:
            int r7 = r7 + 2
            if (r11 != r1) goto L_0x002f
            r0 = r2
            r8 = r7
            goto L_0x00e0
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00ac
        L_0x0033:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r11 = ":"
            boolean r11 = e.c0.h.B(r0, r11, r6, r5, r12)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = e.c0.h.B(r0, r11, r6, r5, r12)
            if (r6 == 0) goto L_0x00aa
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r1) goto L_0x009c
            if (r11 != r2) goto L_0x0051
            goto L_0x005b
        L_0x0051:
            if (r11 == r6) goto L_0x005f
            char r14 = r0.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005d
        L_0x005b:
            r0 = r5
            goto L_0x00a2
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r15 = r5
            r14 = r9
        L_0x0061:
            if (r14 >= r1) goto L_0x008b
            char r5 = r0.charAt(r14)
            r2 = 48
            int r16 = e.x.c.i.g(r5, r2)
            if (r16 < 0) goto L_0x008b
            r4 = 57
            int r4 = e.x.c.i.g(r5, r4)
            if (r4 <= 0) goto L_0x0078
            goto L_0x008b
        L_0x0078:
            if (r15 != 0) goto L_0x007d
            if (r9 == r14) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r13) goto L_0x0084
            goto L_0x00a1
        L_0x0084:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0061
        L_0x008b:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x004c
        L_0x009c:
            int r6 = r6 + r12
            if (r11 != r6) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00a5
            return r10
        L_0x00a5:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00e0
        L_0x00aa:
            return r10
        L_0x00ab:
            r9 = r6
        L_0x00ac:
            r6 = r9
            r2 = 0
        L_0x00ae:
            if (r6 >= r1) goto L_0x00c2
            char r4 = r0.charAt(r6)
            int r4 = n.m0.c.q(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00ae
        L_0x00c2:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00de
            if (r4 <= r12) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r13
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00de:
            return r10
        L_0x00df:
            r0 = r2
        L_0x00e0:
            if (r7 == r0) goto L_0x00f5
            r1 = -1
            if (r8 != r1) goto L_0x00e6
            return r10
        L_0x00e6:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00f5:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.o1.c.v(java.lang.String, int, int):java.net.InetAddress");
    }

    public static <N, R> R w(Collection<N> collection, e.a.a.a.y0.o.c<N> cVar, e.a.a.a.y0.o.d<N, R> dVar) {
        if (collection == null) {
            a(4);
            throw null;
        } else if (cVar != null) {
            e.a.a.a.y0.o.f fVar = new e.a.a.a.y0.o.f();
            for (N x : collection) {
                x(x, cVar, fVar, dVar);
            }
            return dVar.a();
        } else {
            a(5);
            throw null;
        }
    }

    public static <N> void x(N n2, e.a.a.a.y0.o.c<N> cVar, e.a.a.a.y0.o.e<N> eVar, e.a.a.a.y0.o.d<N, ?> dVar) {
        if (n2 == null) {
            a(22);
            throw null;
        } else if (cVar == null) {
            a(23);
            throw null;
        } else if (eVar == null) {
            a(24);
            throw null;
        } else if (dVar == null) {
            a(25);
            throw null;
        } else if (((e.a.a.a.y0.o.f) eVar).a.add(n2) && dVar.c(n2)) {
            for (Object x : cVar.a(n2)) {
                x(x, cVar, eVar, dVar);
            }
            dVar.b(n2);
        }
    }

    public static final boolean y(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    public static final <T> h<T> z(h<? extends h<? extends T>> hVar) {
        e.x.c.i.e(hVar, "$this$flatten");
        e.b0.k kVar = e.b0.k.f9862h;
        if (!(hVar instanceof u)) {
            return new e.b0.f(hVar, e.b0.l.f9863h, kVar);
        }
        u uVar = (u) hVar;
        e.x.c.i.e(kVar, "iterator");
        return new e.b0.f(uVar.a, uVar.f9874b, kVar);
    }
}
