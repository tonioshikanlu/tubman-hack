package b.j.a.c.i0;

import b.e.a.a.a;
import b.j.a.c.i;
import b.j.a.c.i0.o;
import b.j.a.c.j0.g;
import b.j.a.c.j0.m;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

public final class n implements Serializable {
    public static final k A;
    public static final k B;

    /* renamed from: j  reason: collision with root package name */
    public static final i[] f2183j = new i[0];

    /* renamed from: k  reason: collision with root package name */
    public static final n f2184k = new n();

    /* renamed from: l  reason: collision with root package name */
    public static final m f2185l = m.f2173n;

    /* renamed from: m  reason: collision with root package name */
    public static final Class<?> f2186m;

    /* renamed from: n  reason: collision with root package name */
    public static final Class<?> f2187n;

    /* renamed from: o  reason: collision with root package name */
    public static final Class<?> f2188o;

    /* renamed from: p  reason: collision with root package name */
    public static final Class<?> f2189p;

    /* renamed from: q  reason: collision with root package name */
    public static final Class<?> f2190q;
    public static final Class<?> r;
    public static final Class<?> s;
    public static final Class<?> t;
    public static final k u;
    public static final k v;
    public static final k w;
    public static final k x;
    public static final k y;
    public static final k z;

    /* renamed from: h  reason: collision with root package name */
    public final m<Object, i> f2191h = new m<>(16, 200);

    /* renamed from: i  reason: collision with root package name */
    public final o f2192i = new o(this);

    static {
        Class<String> cls = String.class;
        f2186m = cls;
        Class<Object> cls2 = Object.class;
        f2187n = cls2;
        Class<Comparable> cls3 = Comparable.class;
        f2188o = cls3;
        Class<Class> cls4 = Class.class;
        f2189p = cls4;
        Class<Enum> cls5 = Enum.class;
        f2190q = cls5;
        Class<?> cls6 = Boolean.TYPE;
        r = cls6;
        Class<?> cls7 = Integer.TYPE;
        s = cls7;
        Class<?> cls8 = Long.TYPE;
        t = cls8;
        u = new k(cls6);
        v = new k(cls7);
        w = new k(cls8);
        x = new k(cls);
        y = new k(cls2);
        z = new k(cls3);
        A = new k(cls5);
        B = new k(cls4);
    }

    public static i o() {
        Objects.requireNonNull(f2184k);
        return y;
    }

    public i a(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == r) {
                return u;
            }
            if (cls == s) {
                return v;
            }
            if (cls == t) {
                return w;
            }
            return null;
        } else if (cls == f2186m) {
            return x;
        } else {
            if (cls == f2187n) {
                return y;
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.i b(b.j.a.c.i0.c r6, java.lang.reflect.Type r7, b.j.a.c.i0.m r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof java.lang.Class
            if (r0 == 0) goto L_0x000e
            java.lang.Class r7 = (java.lang.Class) r7
            b.j.a.c.i0.m r8 = f2185l
            b.j.a.c.i r6 = r5.c(r6, r7, r8)
            goto L_0x0108
        L_0x000e:
            boolean r0 = r7 instanceof java.lang.reflect.ParameterizedType
            r1 = 0
            if (r0 == 0) goto L_0x005a
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.reflect.Type r0 = r7.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<?> r2 = f2190q
            if (r0 != r2) goto L_0x0023
            b.j.a.c.i0.k r6 = A
            goto L_0x0108
        L_0x0023:
            java.lang.Class<?> r2 = f2188o
            if (r0 != r2) goto L_0x002b
            b.j.a.c.i0.k r6 = z
            goto L_0x0108
        L_0x002b:
            java.lang.Class<?> r2 = f2189p
            if (r0 != r2) goto L_0x0033
            b.j.a.c.i0.k r6 = B
            goto L_0x0108
        L_0x0033:
            java.lang.reflect.Type[] r7 = r7.getActualTypeArguments()
            if (r7 != 0) goto L_0x003b
            r2 = r1
            goto L_0x003c
        L_0x003b:
            int r2 = r7.length
        L_0x003c:
            if (r2 != 0) goto L_0x0041
            b.j.a.c.i0.m r7 = f2185l
            goto L_0x0054
        L_0x0041:
            b.j.a.c.i[] r3 = new b.j.a.c.i[r2]
        L_0x0043:
            if (r1 >= r2) goto L_0x0050
            r4 = r7[r1]
            b.j.a.c.i r4 = r5.b(r6, r4, r8)
            r3[r1] = r4
            int r1 = r1 + 1
            goto L_0x0043
        L_0x0050:
            b.j.a.c.i0.m r7 = b.j.a.c.i0.m.c(r0, r3)
        L_0x0054:
            b.j.a.c.i r6 = r5.c(r6, r0, r7)
            goto L_0x0108
        L_0x005a:
            boolean r0 = r7 instanceof b.j.a.c.i
            if (r0 == 0) goto L_0x0061
            b.j.a.c.i r7 = (b.j.a.c.i) r7
            return r7
        L_0x0061:
            boolean r0 = r7 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0075
            java.lang.reflect.GenericArrayType r7 = (java.lang.reflect.GenericArrayType) r7
            java.lang.reflect.Type r7 = r7.getGenericComponentType()
            b.j.a.c.i r6 = r5.b(r6, r7, r8)
            b.j.a.c.i0.a r6 = b.j.a.c.i0.a.U(r6, r8)
            goto L_0x0108
        L_0x0075:
            boolean r0 = r7 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x00f8
            java.lang.reflect.TypeVariable r7 = (java.lang.reflect.TypeVariable) r7
            java.lang.String r0 = r7.getName()
            if (r8 == 0) goto L_0x00f0
            java.lang.String[] r2 = r8.f2174h
            int r2 = r2.length
            r3 = r1
        L_0x0085:
            if (r3 >= r2) goto L_0x00a5
            java.lang.String[] r4 = r8.f2174h
            r4 = r4[r3]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x00a2
            b.j.a.c.i[] r2 = r8.f2175i
            r2 = r2[r3]
            boolean r3 = r2 instanceof b.j.a.c.i0.j
            if (r3 == 0) goto L_0x00a6
            r3 = r2
            b.j.a.c.i0.j r3 = (b.j.a.c.i0.j) r3
            b.j.a.c.i r3 = r3.f2166q
            if (r3 == 0) goto L_0x00a6
            r2 = r3
            goto L_0x00a6
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0085
        L_0x00a5:
            r2 = 0
        L_0x00a6:
            if (r2 == 0) goto L_0x00aa
            r6 = r2
            goto L_0x0108
        L_0x00aa:
            java.lang.String[] r2 = r8.f2176j
            r3 = 1
            if (r2 == 0) goto L_0x00c0
            int r2 = r2.length
        L_0x00b0:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x00c0
            java.lang.String[] r4 = r8.f2176j
            r4 = r4[r2]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x00b0
            r2 = r3
            goto L_0x00c1
        L_0x00c0:
            r2 = r1
        L_0x00c1:
            if (r2 == 0) goto L_0x00c6
            b.j.a.c.i0.k r6 = y
            goto L_0x0108
        L_0x00c6:
            java.lang.String[] r2 = r8.f2176j
            if (r2 != 0) goto L_0x00cc
            r4 = r1
            goto L_0x00cd
        L_0x00cc:
            int r4 = r2.length
        L_0x00cd:
            if (r4 != 0) goto L_0x00d2
            java.lang.String[] r2 = new java.lang.String[r3]
            goto L_0x00da
        L_0x00d2:
            int r3 = r4 + 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
        L_0x00da:
            r2[r4] = r0
            b.j.a.c.i0.m r0 = new b.j.a.c.i0.m
            java.lang.String[] r3 = r8.f2174h
            b.j.a.c.i[] r8 = r8.f2175i
            r0.<init>(r3, r8, r2)
            java.lang.reflect.Type[] r7 = r7.getBounds()
            r7 = r7[r1]
            b.j.a.c.i r6 = r5.b(r6, r7, r0)
            goto L_0x0108
        L_0x00f0:
            java.lang.Error r6 = new java.lang.Error
            java.lang.String r7 = "No Bindings!"
            r6.<init>(r7)
            throw r6
        L_0x00f8:
            boolean r0 = r7 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0109
            java.lang.reflect.WildcardType r7 = (java.lang.reflect.WildcardType) r7
            java.lang.reflect.Type[] r7 = r7.getUpperBounds()
            r7 = r7[r1]
            b.j.a.c.i r6 = r5.b(r6, r7, r8)
        L_0x0108:
            return r6
        L_0x0109:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unrecognized Type: "
            java.lang.StringBuilder r8 = b.e.a.a.a.y(r8)
            if (r7 != 0) goto L_0x0116
            java.lang.String r7 = "[null]"
            goto L_0x011a
        L_0x0116:
            java.lang.String r7 = r7.toString()
        L_0x011a:
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.i0.n.b(b.j.a.c.i0.c, java.lang.reflect.Type, b.j.a.c.i0.m):b.j.a.c.i");
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.i c(b.j.a.c.i0.c r20, java.lang.Class<?> r21, b.j.a.c.i0.m r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r11 = r21
            r12 = r22
            b.j.a.c.i r2 = r0.a(r11)
            if (r2 == 0) goto L_0x000f
            return r2
        L_0x000f:
            if (r12 == 0) goto L_0x0023
            boolean r2 = r22.e()
            if (r2 == 0) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            b.j.a.c.i0.m$a r2 = new b.j.a.c.i0.m$a
            b.j.a.c.i[] r3 = r12.f2175i
            int r4 = r12.f2177k
            r2.<init>(r11, r3, r4)
            r13 = r2
            goto L_0x0024
        L_0x0023:
            r13 = r11
        L_0x0024:
            b.j.a.c.j0.m<java.lang.Object, b.j.a.c.i> r2 = r0.f2191h
            java.util.concurrent.ConcurrentHashMap<K, V> r2 = r2.f2226i
            java.lang.Object r2 = r2.get(r13)
            b.j.a.c.i r2 = (b.j.a.c.i) r2
            if (r2 == 0) goto L_0x0031
            return r2
        L_0x0031:
            if (r1 != 0) goto L_0x003a
            b.j.a.c.i0.c r1 = new b.j.a.c.i0.c
            r1.<init>(r11)
            r14 = r1
            goto L_0x006d
        L_0x003a:
            java.lang.Class<?> r3 = r1.f2161b
            if (r3 != r11) goto L_0x0040
            r3 = r1
            goto L_0x004d
        L_0x0040:
            b.j.a.c.i0.c r3 = r1.a
        L_0x0042:
            if (r3 == 0) goto L_0x004c
            java.lang.Class<?> r4 = r3.f2161b
            if (r4 != r11) goto L_0x0049
            goto L_0x004d
        L_0x0049:
            b.j.a.c.i0.c r3 = r3.a
            goto L_0x0042
        L_0x004c:
            r3 = 0
        L_0x004d:
            if (r3 == 0) goto L_0x0067
            b.j.a.c.i0.j r1 = new b.j.a.c.i0.j
            b.j.a.c.i0.m r2 = f2185l
            r1.<init>(r11, r2)
            java.util.ArrayList<b.j.a.c.i0.j> r2 = r3.c
            if (r2 != 0) goto L_0x0061
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.c = r2
        L_0x0061:
            java.util.ArrayList<b.j.a.c.i0.j> r2 = r3.c
            r2.add(r1)
            return r1
        L_0x0067:
            b.j.a.c.i0.c r3 = new b.j.a.c.i0.c
            r3.<init>(r1, r11)
            r14 = r3
        L_0x006d:
            boolean r1 = r21.isArray()
            if (r1 == 0) goto L_0x0083
            java.lang.Class r1 = r21.getComponentType()
            b.j.a.c.i r1 = r0.b(r14, r1, r12)
            b.j.a.c.i0.a r1 = b.j.a.c.i0.a.U(r1, r12)
            r18 = r13
            goto L_0x01b7
        L_0x0083:
            boolean r1 = r21.isInterface()
            if (r1 == 0) goto L_0x0091
            b.j.a.c.i[] r1 = r0.e(r14, r11, r12)
            r3 = 0
        L_0x008e:
            r15 = r1
            r10 = r3
            goto L_0x00a5
        L_0x0091:
            java.lang.annotation.Annotation[] r1 = b.j.a.c.j0.g.a
            java.lang.reflect.Type r1 = r21.getGenericSuperclass()
            if (r1 != 0) goto L_0x009b
            r1 = 0
            goto L_0x009f
        L_0x009b:
            b.j.a.c.i r1 = r0.b(r14, r1, r12)
        L_0x009f:
            r3 = r1
            b.j.a.c.i[] r1 = r0.e(r14, r11, r12)
            goto L_0x008e
        L_0x00a5:
            java.lang.Class<java.util.Properties> r1 = java.util.Properties.class
            if (r11 != r1) goto L_0x00b7
            b.j.a.c.i0.k r6 = x
            r1 = r21
            r2 = r22
            r3 = r10
            r4 = r15
            r5 = r6
            b.j.a.c.i0.g r2 = b.j.a.c.i0.g.b0(r1, r2, r3, r4, r5, r6)
            goto L_0x00bd
        L_0x00b7:
            if (r10 == 0) goto L_0x00bd
            b.j.a.c.i r2 = r10.K(r11, r12, r10, r15)
        L_0x00bd:
            if (r2 != 0) goto L_0x01b4
            if (r12 != 0) goto L_0x00c5
            b.j.a.c.i0.m r1 = f2185l
            r3 = r1
            goto L_0x00c6
        L_0x00c5:
            r3 = r12
        L_0x00c6:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            java.lang.String r2 = ": cannot determine type parameters"
            r4 = 0
            r5 = 1
            if (r11 != r1) goto L_0x010f
            java.lang.Class<java.util.Properties> r1 = java.util.Properties.class
            if (r11 != r1) goto L_0x00d5
            b.j.a.c.i0.k r1 = x
            goto L_0x0103
        L_0x00d5:
            java.util.List r1 = r3.d()
            int r6 = r1.size()
            if (r6 == 0) goto L_0x0101
            r7 = 2
            if (r6 != r7) goto L_0x00f1
            java.lang.Object r2 = r1.get(r4)
            b.j.a.c.i r2 = (b.j.a.c.i) r2
            java.lang.Object r1 = r1.get(r5)
            b.j.a.c.i r1 = (b.j.a.c.i) r1
            r6 = r1
            r5 = r2
            goto L_0x0105
        L_0x00f1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Strange Map type "
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r3)
            java.lang.String r2 = b.e.a.a.a.e(r11, r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x0101:
            b.j.a.c.i0.k r1 = y
        L_0x0103:
            r5 = r1
            r6 = r5
        L_0x0105:
            r1 = r21
            r2 = r3
            r3 = r10
            r4 = r15
            b.j.a.c.i0.g r1 = b.j.a.c.i0.g.b0(r1, r2, r3, r4, r5, r6)
            goto L_0x013c
        L_0x010f:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            if (r11 != r1) goto L_0x0150
            java.util.List r1 = r3.d()
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x0121
            b.j.a.c.i0.k r1 = y
        L_0x011f:
            r6 = r1
            goto L_0x012e
        L_0x0121:
            int r6 = r1.size()
            if (r6 != r5) goto L_0x0140
            java.lang.Object r1 = r1.get(r4)
            b.j.a.c.i r1 = (b.j.a.c.i) r1
            goto L_0x011f
        L_0x012e:
            b.j.a.c.i0.e r16 = new b.j.a.c.i0.e
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r16
            r2 = r21
            r4 = r10
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x013c:
            r18 = r13
            r13 = r10
            goto L_0x0199
        L_0x0140:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Strange Collection type "
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r3)
            java.lang.String r2 = b.e.a.a.a.e(r11, r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x0150:
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r1 = java.util.concurrent.atomic.AtomicReference.class
            if (r11 != r1) goto L_0x0195
            java.util.List r1 = r3.d()
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x0162
            b.j.a.c.i0.k r1 = y
        L_0x0160:
            r6 = r1
            goto L_0x016f
        L_0x0162:
            int r6 = r1.size()
            if (r6 != r5) goto L_0x0185
            java.lang.Object r1 = r1.get(r4)
            b.j.a.c.i r1 = (b.j.a.c.i) r1
            goto L_0x0160
        L_0x016f:
            b.j.a.c.i0.i r16 = new b.j.a.c.i0.i
            r7 = 0
            r8 = 0
            r9 = 0
            r17 = 0
            r1 = r16
            r2 = r21
            r4 = r10
            r5 = r15
            r18 = r13
            r13 = r10
            r10 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0199
        L_0x0185:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Strange Reference type "
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r3)
            java.lang.String r2 = b.e.a.a.a.e(r11, r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x0195:
            r18 = r13
            r13 = r10
            r1 = 0
        L_0x0199:
            if (r1 != 0) goto L_0x01b7
            int r1 = r15.length
            r2 = 0
        L_0x019d:
            if (r2 >= r1) goto L_0x01ac
            r3 = r15[r2]
            b.j.a.c.i r3 = r3.K(r11, r12, r13, r15)
            if (r3 == 0) goto L_0x01a9
            r1 = r3
            goto L_0x01ad
        L_0x01a9:
            int r2 = r2 + 1
            goto L_0x019d
        L_0x01ac:
            r1 = 0
        L_0x01ad:
            if (r1 != 0) goto L_0x01b7
            b.j.a.c.i r1 = r0.d(r11, r12, r13, r15)
            goto L_0x01b7
        L_0x01b4:
            r18 = r13
            r1 = r2
        L_0x01b7:
            java.util.ArrayList<b.j.a.c.i0.j> r2 = r14.c
            if (r2 == 0) goto L_0x01ef
            java.util.Iterator r2 = r2.iterator()
        L_0x01bf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ef
            java.lang.Object r3 = r2.next()
            b.j.a.c.i0.j r3 = (b.j.a.c.i0.j) r3
            b.j.a.c.i r4 = r3.f2166q
            if (r4 != 0) goto L_0x01d2
            r3.f2166q = r1
            goto L_0x01bf
        L_0x01d2:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r4 = "Trying to re-set self reference; old value = "
            java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
            b.j.a.c.i r3 = r3.f2166q
            r4.append(r3)
            java.lang.String r3 = ", new = "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L_0x01ef:
            boolean r2 = r1.u()
            if (r2 != 0) goto L_0x01fc
            b.j.a.c.j0.m<java.lang.Object, b.j.a.c.i> r2 = r0.f2191h
            r11 = r18
            r2.c(r11, r1)
        L_0x01fc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.i0.n.c(b.j.a.c.i0.c, java.lang.Class, b.j.a.c.i0.m):b.j.a.c.i");
    }

    public i d(Class<?> cls, m mVar, i iVar, i[] iVarArr) {
        return new k(cls, mVar, iVar, iVarArr, (Object) null, (Object) null, false);
    }

    public i[] e(c cVar, Class<?> cls, m mVar) {
        Annotation[] annotationArr = g.a;
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return f2183j;
        }
        int length = genericInterfaces.length;
        i[] iVarArr = new i[length];
        for (int i2 = 0; i2 < length; i2++) {
            iVarArr[i2] = b(cVar, genericInterfaces[i2], mVar);
        }
        return iVarArr;
    }

    public final boolean f(i iVar, i iVar2) {
        if (iVar2 instanceof h) {
            ((h) iVar2).r = iVar;
            return true;
        } else if (iVar.f2152h != iVar2.f2152h) {
            return false;
        } else {
            List<i> d = iVar.j().d();
            List<i> d2 = iVar2.j().d();
            int size = d.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!f(d.get(i2), d2.get(i2))) {
                    return false;
                }
            }
            return true;
        }
    }

    public e g(Class<? extends Collection> cls, i iVar) {
        m mVar;
        String[] strArr = m.f2171l;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            mVar = m.f2173n;
        } else if (length == 1) {
            mVar = new m(new String[]{typeParameters[0].getName()}, new i[]{iVar}, (String[]) null);
        } else {
            StringBuilder y2 = a.y("Cannot create TypeBindings for class ");
            y2.append(cls.getName());
            y2.append(" with 1 type parameter: class expects ");
            y2.append(length);
            throw new IllegalArgumentException(y2.toString());
        }
        e eVar = (e) c((c) null, cls, mVar);
        if (mVar.e() && iVar != null) {
            i k2 = eVar.i(Collection.class).k();
            if (!k2.equals(iVar)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", new Object[]{g.y(cls), iVar, k2}));
            }
        }
        return eVar;
    }

    public i h(String str) {
        o oVar = this.f2192i;
        Objects.requireNonNull(oVar);
        o.a aVar = new o.a(str.trim());
        i b2 = oVar.b(aVar);
        if (!aVar.hasMoreTokens()) {
            return b2;
        }
        throw oVar.a(aVar, "Unexpected tokens after complete type");
    }

    public i i(i iVar, Class<?> cls) {
        Class<?> cls2 = iVar.f2152h;
        if (cls2 == cls) {
            return iVar;
        }
        i i2 = iVar.i(cls);
        if (i2 != null) {
            return i2;
        }
        if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", new Object[]{cls.getName(), iVar}));
        }
        throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", new Object[]{cls.getName(), iVar}));
    }

    public g j(Class<? extends Map> cls, i iVar, i iVar2) {
        m mVar;
        i[] iVarArr = {iVar, iVar2};
        String[] strArr = m.f2171l;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            mVar = m.f2173n;
        } else {
            int length = typeParameters.length;
            String[] strArr2 = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr2[i2] = typeParameters[i2].getName();
            }
            if (length != iVarArr.length) {
                StringBuilder y2 = a.y("Cannot create TypeBindings for class ");
                a.I(cls, y2, " with ");
                y2.append(iVarArr.length);
                y2.append(" type parameter");
                y2.append(iVarArr.length == 1 ? "" : "s");
                y2.append(": class expects ");
                y2.append(length);
                throw new IllegalArgumentException(y2.toString());
            }
            mVar = new m(strArr2, iVarArr, (String[]) null);
        }
        g gVar = (g) c((c) null, cls, mVar);
        if (mVar.e()) {
            i i3 = gVar.i(Map.class);
            i n2 = i3.n();
            if (n2.equals(iVar)) {
                i k2 = i3.k();
                if (!k2.equals(iVar2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", new Object[]{g.y(cls), iVar2, k2}));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", new Object[]{g.y(cls), iVar, n2}));
            }
        }
        return gVar;
    }

    public i k(i iVar, Class<?> cls) {
        i iVar2;
        m mVar;
        String str;
        i iVar3;
        i iVar4;
        Class<Object> cls2 = Object.class;
        Class<?> cls3 = iVar.f2152h;
        if (cls3 == cls) {
            return iVar;
        }
        if (cls3 != cls2) {
            if (!cls3.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format("Class %s not subtype of %s", new Object[]{cls.getName(), iVar}));
            } else if (!iVar.j().e()) {
                if (iVar.A()) {
                    if (iVar.G()) {
                        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                            mVar = m.b(cls, iVar.n(), iVar.k());
                            iVar2 = c((c) null, cls, mVar);
                            return iVar2.O(iVar);
                        }
                    } else if (iVar.y()) {
                        if (cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class || cls == TreeSet.class) {
                            mVar = m.a(cls, iVar.k());
                            iVar2 = c((c) null, cls, mVar);
                            return iVar2.O(iVar);
                        } else if (cls3 == EnumSet.class) {
                            return iVar;
                        }
                    }
                }
                int length = cls.getTypeParameters().length;
                if (length != 0) {
                    h[] hVarArr = new h[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        hVarArr[i2] = new h(i2);
                    }
                    i i3 = c((c) null, cls, m.c(cls, hVarArr)).i(iVar.f2152h);
                    if (i3 != null) {
                        List<i> d = iVar.j().d();
                        List<i> d2 = i3.j().d();
                        int size = d.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                str = null;
                                break;
                            }
                            iVar3 = d.get(i4);
                            iVar4 = d2.get(i4);
                            if (!f(iVar3, iVar4)) {
                                if (!(iVar3.f2152h == cls2)) {
                                    if (i4 == 0) {
                                        if (iVar.f2152h == Map.class) {
                                            if (iVar4.f2152h == cls2) {
                                                continue;
                                            }
                                        }
                                    }
                                    if (!iVar3.E() || !iVar3.J(iVar4.f2152h)) {
                                        str = String.format("Type parameter #%d/%d differs; can not specialize %s with %s", new Object[]{Integer.valueOf(i4 + 1), Integer.valueOf(size), iVar3.c(), iVar4.c()});
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i4++;
                        }
                        str = String.format("Type parameter #%d/%d differs; can not specialize %s with %s", new Object[]{Integer.valueOf(i4 + 1), Integer.valueOf(size), iVar3.c(), iVar4.c()});
                        if (str == null) {
                            i[] iVarArr = new i[length];
                            for (int i5 = 0; i5 < length; i5++) {
                                i iVar5 = hVarArr[i5].r;
                                if (iVar5 == null) {
                                    iVar5 = o();
                                }
                                iVarArr[i5] = iVar5;
                            }
                            iVar2 = c((c) null, cls, m.c(cls, iVarArr));
                            return iVar2.O(iVar);
                        }
                        StringBuilder y2 = a.y("Failed to specialize base type ");
                        y2.append(iVar.c());
                        y2.append(" as ");
                        y2.append(cls.getName());
                        y2.append(", problem: ");
                        y2.append(str);
                        throw new IllegalArgumentException(y2.toString());
                    }
                    throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", new Object[]{iVar.f2152h.getName(), cls.getName()}));
                }
            }
        }
        mVar = f2185l;
        iVar2 = c((c) null, cls, mVar);
        return iVar2.O(iVar);
    }

    public Class<?> l(String str) {
        Throwable th = null;
        if (str.indexOf(46) < 0) {
            Class<?> cls = "int".equals(str) ? Integer.TYPE : "long".equals(str) ? Long.TYPE : "float".equals(str) ? Float.TYPE : "double".equals(str) ? Double.TYPE : "boolean".equals(str) ? Boolean.TYPE : "byte".equals(str) ? Byte.TYPE : "char".equals(str) ? Character.TYPE : "short".equals(str) ? Short.TYPE : "void".equals(str) ? Void.TYPE : null;
            if (cls != null) {
                return cls;
            }
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Exception e2) {
                th = g.r(e2);
            }
        }
        try {
            return Class.forName(str);
        } catch (Exception e3) {
            if (th == null) {
                th = g.r(e3);
            }
            g.E(th);
            throw new ClassNotFoundException(th.getMessage(), th);
        }
    }

    public i[] m(i iVar, Class<?> cls) {
        i i2 = iVar.i(cls);
        return i2 == null ? f2183j : i2.j().f2175i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = a(r3);
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.i n(java.lang.Class<?> r3) {
        /*
            r2 = this;
            b.j.a.c.i0.m r0 = f2185l
            boolean r1 = r0.e()
            if (r1 == 0) goto L_0x000f
            b.j.a.c.i r1 = r2.a(r3)
            if (r1 == 0) goto L_0x000f
            goto L_0x0014
        L_0x000f:
            r1 = 0
            b.j.a.c.i r1 = r2.d(r3, r0, r1, r1)
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.i0.n.n(java.lang.Class):b.j.a.c.i");
    }
}
