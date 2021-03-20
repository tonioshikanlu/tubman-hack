package b.j.a.c.e0;

import b.j.a.c.e0.g;
import b.j.a.c.e0.g0;
import b.j.a.c.e0.j;
import b.j.a.c.e0.s;
import b.j.a.c.i;
import b.j.a.c.i0.c;
import b.j.a.c.i0.m;
import b.j.a.c.i0.n;
import b.j.a.c.j0.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b extends a implements g0 {
    public static final a u = new a((d) null, Collections.emptyList(), Collections.emptyList());

    /* renamed from: h  reason: collision with root package name */
    public final i f1886h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f1887i;

    /* renamed from: j  reason: collision with root package name */
    public final m f1888j;

    /* renamed from: k  reason: collision with root package name */
    public final List<i> f1889k;

    /* renamed from: l  reason: collision with root package name */
    public final b.j.a.c.b f1890l;

    /* renamed from: m  reason: collision with root package name */
    public final n f1891m;

    /* renamed from: n  reason: collision with root package name */
    public final s.a f1892n;

    /* renamed from: o  reason: collision with root package name */
    public final Class<?> f1893o;

    /* renamed from: p  reason: collision with root package name */
    public final b.j.a.c.j0.b f1894p;

    /* renamed from: q  reason: collision with root package name */
    public a f1895q;
    public k r;
    public List<f> s;
    public transient Boolean t;

    public static final class a {
        public final d a;

        /* renamed from: b  reason: collision with root package name */
        public final List<d> f1896b;
        public final List<i> c;

        public a(d dVar, List<d> list, List<i> list2) {
            this.a = dVar;
            this.f1896b = list;
            this.c = list2;
        }
    }

    public b(i iVar, Class<?> cls, List<i> list, Class<?> cls2, b.j.a.c.j0.b bVar, m mVar, b.j.a.c.b bVar2, s.a aVar, n nVar) {
        this.f1886h = iVar;
        this.f1887i = cls;
        this.f1889k = list;
        this.f1893o = cls2;
        this.f1894p = bVar;
        this.f1888j = mVar;
        this.f1890l = bVar2;
        this.f1892n = aVar;
        this.f1891m = nVar;
    }

    public b(Class<?> cls) {
        this.f1886h = null;
        this.f1887i = cls;
        this.f1889k = Collections.emptyList();
        this.f1893o = null;
        this.f1894p = n.f1927b;
        this.f1888j = m.f2173n;
        this.f1890l = null;
        this.f1892n = null;
        this.f1891m = null;
    }

    public i a(Type type) {
        return this.f1891m.b((c) null, type, this.f1888j);
    }

    public <A extends Annotation> A c(Class<A> cls) {
        return this.f1894p.a(cls);
    }

    public String d() {
        return this.f1887i.getName();
    }

    public Class<?> e() {
        return this.f1887i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!g.s(obj, b.class)) {
            return false;
        }
        return ((b) obj).f1887i == this.f1887i;
    }

    public i f() {
        return this.f1886h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.j.a.c.e0.b.a g() {
        /*
            r17 = this;
            r0 = r17
            b.j.a.c.e0.b$a r1 = r0.f1895q
            if (r1 != 0) goto L_0x01f4
            b.j.a.c.i r1 = r0.f1886h
            if (r1 != 0) goto L_0x000e
            b.j.a.c.e0.b$a r1 = u
            goto L_0x01f2
        L_0x000e:
            b.j.a.c.b r2 = r0.f1890l
            java.lang.Class<?> r3 = r0.f1893o
            b.j.a.c.e0.e r4 = new b.j.a.c.e0.e
            r4.<init>(r2, r0)
            boolean r2 = r1.B()
            r6 = 0
            if (r2 != 0) goto L_0x004c
            java.lang.Class<?> r2 = r1.f2152h
            b.j.a.c.j0.g$a[] r2 = b.j.a.c.j0.g.n(r2)
            int r7 = r2.length
            r9 = r6
            r10 = r9
            r8 = 0
        L_0x0028:
            if (r8 >= r7) goto L_0x004e
            r11 = r2[r8]
            java.lang.reflect.Constructor<?> r12 = r11.a
            boolean r12 = r12.isSynthetic()
            r12 = r12 ^ 1
            if (r12 != 0) goto L_0x0037
            goto L_0x0049
        L_0x0037:
            int r12 = r11.a()
            if (r12 != 0) goto L_0x003f
            r9 = r11
            goto L_0x0049
        L_0x003f:
            if (r10 != 0) goto L_0x0046
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0046:
            r10.add(r11)
        L_0x0049:
            int r8 = r8 + 1
            goto L_0x0028
        L_0x004c:
            r9 = r6
            r10 = r9
        L_0x004e:
            if (r10 != 0) goto L_0x005b
            java.util.List r2 = java.util.Collections.emptyList()
            if (r9 != 0) goto L_0x0058
            goto L_0x00f5
        L_0x0058:
            r7 = r2
            r2 = 0
            goto L_0x006d
        L_0x005b:
            int r2 = r10.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
            r8 = 0
        L_0x0065:
            if (r8 >= r2) goto L_0x006d
            r7.add(r6)
            int r8 = r8 + 1
            goto L_0x0065
        L_0x006d:
            if (r3 == 0) goto L_0x00cf
            b.j.a.c.j0.g$a[] r8 = b.j.a.c.j0.g.n(r3)
            int r11 = r8.length
            r13 = r6
            r12 = 0
        L_0x0076:
            if (r12 >= r11) goto L_0x00cf
            r14 = r8[r12]
            int r15 = r14.a()
            if (r15 != 0) goto L_0x008a
            if (r9 == 0) goto L_0x00cb
            b.j.a.c.e0.d r9 = r4.i(r9, r14)
            r4.f1902e = r9
            r9 = r6
            goto L_0x00cb
        L_0x008a:
            if (r10 == 0) goto L_0x00cb
            if (r13 != 0) goto L_0x00a8
            b.j.a.c.e0.w[] r13 = new b.j.a.c.e0.w[r2]
            r15 = 0
        L_0x0091:
            if (r15 >= r2) goto L_0x00a8
            b.j.a.c.e0.w r5 = new b.j.a.c.e0.w
            java.lang.Object r16 = r10.get(r15)
            r6 = r16
            b.j.a.c.j0.g$a r6 = (b.j.a.c.j0.g.a) r6
            java.lang.reflect.Constructor<?> r6 = r6.a
            r5.<init>((java.lang.reflect.Constructor<?>) r6)
            r13[r15] = r5
            int r15 = r15 + 1
            r6 = 0
            goto L_0x0091
        L_0x00a8:
            b.j.a.c.e0.w r5 = new b.j.a.c.e0.w
            java.lang.reflect.Constructor<?> r6 = r14.a
            r5.<init>((java.lang.reflect.Constructor<?>) r6)
            r6 = 0
        L_0x00b0:
            if (r6 >= r2) goto L_0x00cb
            r15 = r13[r6]
            boolean r15 = r5.equals(r15)
            if (r15 == 0) goto L_0x00c8
            java.lang.Object r5 = r10.get(r6)
            b.j.a.c.j0.g$a r5 = (b.j.a.c.j0.g.a) r5
            b.j.a.c.e0.d r5 = r4.k(r5, r14)
            r7.set(r6, r5)
            goto L_0x00cb
        L_0x00c8:
            int r6 = r6 + 1
            goto L_0x00b0
        L_0x00cb:
            int r12 = r12 + 1
            r6 = 0
            goto L_0x0076
        L_0x00cf:
            r5 = 0
            if (r9 == 0) goto L_0x00d8
            b.j.a.c.e0.d r6 = r4.i(r9, r5)
            r4.f1902e = r6
        L_0x00d8:
            r6 = 0
        L_0x00d9:
            if (r6 >= r2) goto L_0x00f4
            java.lang.Object r8 = r7.get(r6)
            b.j.a.c.e0.d r8 = (b.j.a.c.e0.d) r8
            if (r8 != 0) goto L_0x00f0
            java.lang.Object r8 = r10.get(r6)
            b.j.a.c.j0.g$a r8 = (b.j.a.c.j0.g.a) r8
            b.j.a.c.e0.d r8 = r4.k(r8, r5)
            r7.set(r6, r8)
        L_0x00f0:
            int r6 = r6 + 1
            r5 = 0
            goto L_0x00d9
        L_0x00f4:
            r2 = r7
        L_0x00f5:
            java.lang.Class<?> r1 = r1.f2152h
            java.lang.reflect.Method[] r1 = b.j.a.c.j0.g.m(r1)
            int r5 = r1.length
            r6 = 0
            r7 = 0
        L_0x00fe:
            if (r7 >= r5) goto L_0x011a
            r8 = r1[r7]
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 != 0) goto L_0x010d
            goto L_0x0117
        L_0x010d:
            if (r6 != 0) goto L_0x0114
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0114:
            r6.add(r8)
        L_0x0117:
            int r7 = r7 + 1
            goto L_0x00fe
        L_0x011a:
            if (r6 != 0) goto L_0x0122
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x01a5
        L_0x0122:
            int r1 = r6.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            r7 = 0
        L_0x012c:
            if (r7 >= r1) goto L_0x0135
            r8 = 0
            r5.add(r8)
            int r7 = r7 + 1
            goto L_0x012c
        L_0x0135:
            if (r3 == 0) goto L_0x0188
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r7 = r3.length
            r8 = 0
            r9 = 0
        L_0x013e:
            if (r9 >= r7) goto L_0x0188
            r10 = r3[r9]
            int r11 = r10.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)
            if (r11 != 0) goto L_0x014d
            goto L_0x0185
        L_0x014d:
            if (r8 != 0) goto L_0x0164
            b.j.a.c.e0.w[] r8 = new b.j.a.c.e0.w[r1]
            r11 = 0
        L_0x0152:
            if (r11 >= r1) goto L_0x0164
            b.j.a.c.e0.w r12 = new b.j.a.c.e0.w
            java.lang.Object r13 = r6.get(r11)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r12.<init>((java.lang.reflect.Method) r13)
            r8[r11] = r12
            int r11 = r11 + 1
            goto L_0x0152
        L_0x0164:
            b.j.a.c.e0.w r11 = new b.j.a.c.e0.w
            r11.<init>((java.lang.reflect.Method) r10)
            r12 = 0
        L_0x016a:
            if (r12 >= r1) goto L_0x0185
            r13 = r8[r12]
            boolean r13 = r11.equals(r13)
            if (r13 == 0) goto L_0x0182
            java.lang.Object r11 = r6.get(r12)
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            b.j.a.c.e0.i r10 = r4.j(r11, r10)
            r5.set(r12, r10)
            goto L_0x0185
        L_0x0182:
            int r12 = r12 + 1
            goto L_0x016a
        L_0x0185:
            int r9 = r9 + 1
            goto L_0x013e
        L_0x0188:
            r3 = 0
        L_0x0189:
            if (r3 >= r1) goto L_0x01a4
            java.lang.Object r7 = r5.get(r3)
            b.j.a.c.e0.i r7 = (b.j.a.c.e0.i) r7
            if (r7 != 0) goto L_0x01a1
            java.lang.Object r7 = r6.get(r3)
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r8 = 0
            b.j.a.c.e0.i r7 = r4.j(r7, r8)
            r5.set(r3, r7)
        L_0x01a1:
            int r3 = r3 + 1
            goto L_0x0189
        L_0x01a4:
            r1 = r5
        L_0x01a5:
            b.j.a.c.b r3 = r4.a
            if (r3 == 0) goto L_0x01ea
            b.j.a.c.e0.d r5 = r4.f1902e
            if (r5 == 0) goto L_0x01b6
            boolean r3 = r3.i0(r5)
            if (r3 == 0) goto L_0x01b6
            r3 = 0
            r4.f1902e = r3
        L_0x01b6:
            int r3 = r2.size()
        L_0x01ba:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x01d0
            b.j.a.c.b r5 = r4.a
            java.lang.Object r6 = r2.get(r3)
            b.j.a.c.e0.h r6 = (b.j.a.c.e0.h) r6
            boolean r5 = r5.i0(r6)
            if (r5 == 0) goto L_0x01ba
            r2.remove(r3)
            goto L_0x01ba
        L_0x01d0:
            int r3 = r1.size()
        L_0x01d4:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x01ea
            b.j.a.c.b r5 = r4.a
            java.lang.Object r6 = r1.get(r3)
            b.j.a.c.e0.h r6 = (b.j.a.c.e0.h) r6
            boolean r5 = r5.i0(r6)
            if (r5 == 0) goto L_0x01d4
            r1.remove(r3)
            goto L_0x01d4
        L_0x01ea:
            b.j.a.c.e0.b$a r3 = new b.j.a.c.e0.b$a
            b.j.a.c.e0.d r4 = r4.f1902e
            r3.<init>(r4, r2, r1)
            r1 = r3
        L_0x01f2:
            r0.f1895q = r1
        L_0x01f4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.e0.b.g():b.j.a.c.e0.b$a");
    }

    public final k h() {
        boolean z;
        Class<?> a2;
        k kVar = this.r;
        if (kVar == null) {
            i iVar = this.f1886h;
            if (iVar == null) {
                kVar = new k();
            } else {
                b.j.a.c.b bVar = this.f1890l;
                s.a aVar = this.f1892n;
                n nVar = this.f1891m;
                List<i> list = this.f1889k;
                Class<?> cls = this.f1893o;
                j jVar = new j(bVar, aVar);
                Class<Object> cls2 = Object.class;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                jVar.f(this, iVar.f2152h, linkedHashMap, cls);
                Iterator<i> it = list.iterator();
                while (true) {
                    Class<?> cls3 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    i next = it.next();
                    s.a aVar2 = jVar.d;
                    if (aVar2 != null) {
                        cls3 = aVar2.a(next.f2152h);
                    }
                    jVar.f(new g0.a(nVar, next.j()), next.f2152h, linkedHashMap, cls3);
                }
                s.a aVar3 = jVar.d;
                if (aVar3 == null || (a2 = aVar3.a(cls2)) == null) {
                    z = false;
                } else {
                    jVar.g(this, iVar.f2152h, linkedHashMap, a2);
                    z = true;
                }
                if (z && jVar.a != null && !linkedHashMap.isEmpty()) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        w wVar = (w) entry.getKey();
                        if ("hashCode".equals(wVar.a) && wVar.f1956b.length == 0) {
                            try {
                                Method declaredMethod = cls2.getDeclaredMethod(wVar.a, new Class[0]);
                                if (declaredMethod != null) {
                                    j.a aVar4 = (j.a) entry.getValue();
                                    aVar4.c = jVar.d(aVar4.c, declaredMethod.getDeclaredAnnotations());
                                    aVar4.f1921b = declaredMethod;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    kVar = new k();
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        j.a aVar5 = (j.a) entry2.getValue();
                        Method method = aVar5.f1921b;
                        i iVar2 = method == null ? null : new i(aVar5.a, method, aVar5.c.b(), (o[]) null);
                        if (iVar2 != null) {
                            linkedHashMap2.put(entry2.getKey(), iVar2);
                        }
                    }
                    kVar = new k(linkedHashMap2);
                }
            }
            this.r = kVar;
        }
        return kVar;
    }

    public int hashCode() {
        return this.f1887i.getName().hashCode();
    }

    public Iterable<f> i() {
        List<f> list = this.s;
        if (list == null) {
            i iVar = this.f1886h;
            if (iVar == null) {
                list = Collections.emptyList();
            } else {
                Map<String, g.a> f = new g(this.f1890l, this.f1891m, this.f1892n).f(this, iVar, (Map<String, g.a>) null);
                if (f == null) {
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList(f.size());
                    for (g.a next : f.values()) {
                        arrayList.add(new f(next.a, next.f1905b, next.c.b()));
                    }
                    list = arrayList;
                }
            }
            this.s = list;
        }
        return list;
    }

    public List<d> j() {
        return g().f1896b;
    }

    public List<i> k() {
        return g().c;
    }

    public boolean l() {
        Boolean bool = this.t;
        if (bool == null) {
            bool = Boolean.valueOf(b.j.a.c.j0.g.v(this.f1887i));
            this.t = bool;
        }
        return bool.booleanValue();
    }

    public String toString() {
        return b.e.a.a.a.e(this.f1887i, b.e.a.a.a.y("[AnnotedClass "), "]");
    }
}
