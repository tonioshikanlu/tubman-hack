package e.a.a.a;

import e.a.a.a.y0.b.d1.a.i;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.j;
import e.a.a.a.y0.b.s;
import e.a.e;
import e.a.l;
import e.c0.d;
import e.c0.h;
import e.r;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public abstract class n implements e.x.c.c {

    /* renamed from: h  reason: collision with root package name */
    public static final Class<?> f7561h = Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");

    /* renamed from: i  reason: collision with root package name */
    public static final d f7562i = new d("<v#(\\d+)>");

    public abstract class a {
        public static final /* synthetic */ l[] c = {v.c(new q(v.a(a.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};
        public final n0 a = b.q.a.a.k2(new C0131a(this));

        /* renamed from: e.a.a.a.n$a$a  reason: collision with other inner class name */
        public static final class C0131a extends k implements e.x.b.a<i> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ a f7564h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0131a(a aVar) {
                super(0);
                this.f7564h = aVar;
            }

            public Object e() {
                return m0.a(n.this.e());
            }
        }

        public a() {
        }
    }

    public enum b {
        DECLARED,
        INHERITED
    }

    public static final class c extends c {
        public c(n nVar, n nVar2) {
            super(nVar2);
        }

        public Object e(j jVar, Object obj) {
            e.x.c.i.e(jVar, "descriptor");
            e.x.c.i.e((r) obj, "data");
            throw new IllegalStateException("No constructors should appear here: " + jVar);
        }
    }

    public abstract Collection<s> B(e.a.a.a.y0.f.d dVar);

    public abstract f0 C(int i2);

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x001e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<e.a.a.a.g<?>> D(e.a.a.a.y0.j.y.i r9, e.a.a.a.n.b r10) {
        /*
            r8 = this;
            java.lang.String r0 = "scope"
            e.x.c.i.e(r9, r0)
            java.lang.String r0 = "belonginess"
            e.x.c.i.e(r10, r0)
            e.a.a.a.n$c r0 = new e.a.a.a.n$c
            r0.<init>(r8, r8)
            r1 = 0
            r2 = 3
            java.util.Collection r9 = b.q.a.a.E0(r9, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x001e:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x006f
            java.lang.Object r3 = r9.next()
            e.a.a.a.y0.b.k r3 = (e.a.a.a.y0.b.k) r3
            boolean r4 = r3 instanceof e.a.a.a.y0.b.b
            if (r4 == 0) goto L_0x0068
            r4 = r3
            e.a.a.a.y0.b.b r4 = (e.a.a.a.y0.b.b) r4
            e.a.a.a.y0.b.z0 r5 = r4.getVisibility()
            e.a.a.a.y0.b.z0 r6 = e.a.a.a.y0.b.y0.f7852h
            boolean r5 = e.x.c.i.a(r5, r6)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x0068
            java.lang.String r5 = "member"
            e.x.c.i.e(r4, r5)
            e.a.a.a.y0.b.b$a r4 = r4.i()
            java.lang.String r5 = "member.kind"
            e.x.c.i.d(r4, r5)
            boolean r4 = r4.d()
            e.a.a.a.n$b r5 = e.a.a.a.n.b.DECLARED
            r7 = 0
            if (r10 != r5) goto L_0x0058
            r5 = r6
            goto L_0x0059
        L_0x0058:
            r5 = r7
        L_0x0059:
            if (r4 != r5) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r6 = r7
        L_0x005d:
            if (r6 == 0) goto L_0x0068
            e.r r4 = e.r.a
            java.lang.Object r3 = r3.l0(r0, r4)
            e.a.a.a.g r3 = (e.a.a.a.g) r3
            goto L_0x0069
        L_0x0068:
            r3 = r1
        L_0x0069:
            if (r3 == 0) goto L_0x001e
            r2.add(r3)
            goto L_0x001e
        L_0x006f:
            java.util.List r9 = e.t.g.W(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.n.D(e.a.a.a.y0.j.y.i, e.a.a.a.n$b):java.util.Collection");
    }

    public Class<?> E() {
        Class<?> e2 = e();
        List<e<? extends Object>> list = e.a.a.a.y0.b.d1.b.b.a;
        e.x.c.i.e(e2, "$this$wrapperByPrimitive");
        Class<?> cls = e.a.a.a.y0.b.d1.b.b.c.get(e2);
        return cls != null ? cls : e();
    }

    public abstract Collection<f0> F(e.a.a.a.y0.f.d dVar);

    public final List<Class<?>> G(String str) {
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        while (str.charAt(i3) != ')') {
            int i4 = i3;
            while (str.charAt(i4) == '[') {
                i4++;
            }
            char charAt = str.charAt(i4);
            if (h.c("VZCBSIFJD", charAt, false, 2)) {
                i2 = i4 + 1;
            } else if (charAt == 'L') {
                i2 = h.k(str, ';', i3, false, 4) + 1;
            } else {
                throw new l0(b.e.a.a.a.m("Unknown type prefix in the method signature: ", str));
            }
            arrayList.add(J(str, i3, i2));
            i3 = i2;
        }
        return arrayList;
    }

    public final Class<?> H(String str) {
        return J(str, h.k(str, ')', 0, false, 6) + 1, str.length());
    }

    public final Method I(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        Method I;
        if (z) {
            clsArr[0] = cls;
        }
        Method L = L(cls, str, clsArr, cls2);
        if (L != null) {
            return L;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (I = I(superclass, str, clsArr, cls2, z)) != null) {
            return I;
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            Method I2 = I(cls3, str, clsArr, cls2, z);
            if (I2 != null) {
                return I2;
            }
            if (z) {
                Class<?> l3 = b.q.a.a.l3(e.a.a.a.y0.b.d1.b.b.e(cls3), cls3.getName() + "$DefaultImpls");
                if (l3 != null) {
                    e.x.c.i.d(cls3, "superInterface");
                    clsArr[0] = cls3;
                    Method L2 = L(l3, str, clsArr, cls2);
                    if (L2 != null) {
                        return L2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public final Class<?> J(String str, int i2, int i3) {
        Class<?> cls;
        char charAt = str.charAt(i2);
        if (charAt == 'F') {
            cls = Float.TYPE;
        } else if (charAt == 'L') {
            ClassLoader e2 = e.a.a.a.y0.b.d1.b.b.e(e());
            String substring = str.substring(i2 + 1, i3 - 1);
            e.x.c.i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            cls = e2.loadClass(h.v(substring, '/', '.', false, 4));
        } else if (charAt == 'S') {
            cls = Short.TYPE;
        } else if (charAt == 'V') {
            cls = Void.TYPE;
        } else if (charAt == 'I') {
            cls = Integer.TYPE;
        } else if (charAt == 'J') {
            cls = Long.TYPE;
        } else if (charAt == 'Z') {
            cls = Boolean.TYPE;
        } else if (charAt != '[') {
            switch (charAt) {
                case 'B':
                    cls = Byte.TYPE;
                    break;
                case 'C':
                    cls = Character.TYPE;
                    break;
                case 'D':
                    cls = Double.TYPE;
                    break;
                default:
                    throw new l0(b.e.a.a.a.m("Unknown type prefix in the method signature: ", str));
            }
        } else {
            cls = e.a.a.a.y0.b.d1.b.b.a(J(str, i2 + 1, i3));
        }
        e.x.c.i.d(cls, "when (desc[begin]) {\n   …nature: $desc\")\n        }");
        return cls;
    }

    public final Constructor<?> K(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            if (array != null) {
                Class[] clsArr = (Class[]) array;
                return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a A[LOOP:0: B:6:0x0029->B:17:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method L(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Class<?> r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r9.length     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r9, r1)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r8, r1)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r2 = "result"
            e.x.c.i.d(r1, r2)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.Class r2 = r1.getReturnType()     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r2 = e.x.c.i.a(r2, r10)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r2 == 0) goto L_0x001d
            r0 = r1
            goto L_0x005d
        L_0x001d:
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r1 = "declaredMethods"
            e.x.c.i.d(r7, r1)     // Catch:{ NoSuchMethodException -> 0x005d }
            int r1 = r7.length     // Catch:{ NoSuchMethodException -> 0x005d }
            r2 = 0
            r3 = r2
        L_0x0029:
            if (r3 >= r1) goto L_0x005d
            r4 = r7[r3]     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r5 = "method"
            e.x.c.i.d(r4, r5)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r5 = r4.getName()     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r5 = e.x.c.i.a(r5, r8)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r5 == 0) goto L_0x0055
            java.lang.Class r5 = r4.getReturnType()     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r5 = e.x.c.i.a(r5, r10)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r5 == 0) goto L_0x0055
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch:{ NoSuchMethodException -> 0x005d }
            e.x.c.i.c(r5)     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r5 = java.util.Arrays.equals(r5, r9)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r5 == 0) goto L_0x0055
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = r2
        L_0x0056:
            if (r5 == 0) goto L_0x005a
            r0 = r4
            goto L_0x005d
        L_0x005a:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.n.L(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class):java.lang.reflect.Method");
    }

    public final void p(List<Class<?>> list, String str, boolean z) {
        Object obj;
        List<Class<?>> G = G(str);
        list.addAll(G);
        int size = ((((ArrayList) G).size() + 32) - 1) / 32;
        for (int i2 = 0; i2 < size; i2++) {
            Class cls = Integer.TYPE;
            e.x.c.i.d(cls, "Integer.TYPE");
            list.add(cls);
        }
        if (z) {
            obj = f7561h;
            e.x.c.i.d(obj, "DEFAULT_CONSTRUCTOR_MARKER");
        } else {
            obj = Object.class;
        }
        list.add(obj);
    }

    public final Method r(String str, String str2) {
        Method I;
        e.x.c.i.e(str, "name");
        e.x.c.i.e(str2, "desc");
        if (e.x.c.i.a(str, "<init>")) {
            return null;
        }
        Object[] array = G(str2).toArray(new Class[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Class[] clsArr = (Class[]) array;
        Class<?> H = H(str2);
        Method I2 = I(E(), str, clsArr, H, false);
        if (I2 != null) {
            return I2;
        }
        if (!E().isInterface() || (I = I(Object.class, str, clsArr, H, false)) == null) {
            return null;
        }
        return I;
    }

    public abstract Collection<j> s();
}
