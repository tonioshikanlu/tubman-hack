package b.j.a.c.b0;

import b.j.a.a.b;
import b.j.a.c.a0.f;
import b.j.a.c.d;
import b.j.a.c.e0.a0;
import b.j.a.c.e0.h;
import b.j.a.c.e0.l;
import b.j.a.c.e0.m;
import b.j.a.c.e0.p;
import b.j.a.c.e0.r;
import b.j.a.c.f0.a;
import b.j.a.c.f0.c;
import b.j.a.c.f0.e;
import b.j.a.c.i;
import b.j.a.c.i0.n;
import b.j.a.c.j;
import b.j.a.c.j0.d;
import b.j.a.c.j0.g;
import b.j.a.c.j0.k;
import b.j.a.c.o;
import b.j.a.c.s;
import b.j.a.c.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public abstract class b extends o implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final Class<?> f1762i = CharSequence.class;

    /* renamed from: j  reason: collision with root package name */
    public static final Class<?> f1763j = Iterable.class;

    /* renamed from: k  reason: collision with root package name */
    public static final Class<?> f1764k = Map.Entry.class;

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap<String, Class<? extends Map>> f1765l;

    /* renamed from: m  reason: collision with root package name */
    public static final HashMap<String, Class<? extends Collection>> f1766m;

    /* renamed from: h  reason: collision with root package name */
    public final f f1767h;

    static {
        new t("@JsonUnwrapped");
        HashMap<String, Class<? extends Map>> hashMap = new HashMap<>();
        f1765l = hashMap;
        hashMap.put(Map.class.getName(), LinkedHashMap.class);
        hashMap.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        hashMap.put(SortedMap.class.getName(), TreeMap.class);
        hashMap.put(NavigableMap.class.getName(), TreeMap.class);
        hashMap.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        HashMap<String, Class<? extends Collection>> hashMap2 = new HashMap<>();
        f1766m = hashMap2;
        hashMap2.put(Collection.class.getName(), ArrayList.class);
        hashMap2.put(List.class.getName(), ArrayList.class);
        hashMap2.put(Set.class.getName(), HashSet.class);
        hashMap2.put(SortedSet.class.getName(), TreeSet.class);
        hashMap2.put(Queue.class.getName(), LinkedList.class);
        hashMap2.put("java.util.Deque", LinkedList.class);
        hashMap2.put("java.util.NavigableSet", TreeSet.class);
    }

    public b(f fVar) {
        this.f1767h = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0128 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.j<?> a(b.j.a.c.g r13, b.j.a.c.i0.e r14, b.j.a.c.c r15) {
        /*
            r12 = this;
            b.j.a.c.i r0 = r14.f2162q
            java.lang.Object r1 = r0.f2154j
            b.j.a.c.j r1 = (b.j.a.c.j) r1
            b.j.a.c.f r8 = r13.f1993j
            java.lang.Object r2 = r0.f2155k
            b.j.a.c.f0.c r2 = (b.j.a.c.f0.c) r2
            if (r2 != 0) goto L_0x0012
            b.j.a.c.f0.c r2 = r12.b(r8, r0)
        L_0x0012:
            r9 = r2
            b.j.a.c.a0.f r2 = r12.f1767h
            java.lang.Iterable r2 = r2.b()
            r10 = r2
            b.j.a.c.j0.d r10 = (b.j.a.c.j0.d) r10
        L_0x001c:
            boolean r2 = r10.hasNext()
            r11 = 0
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r10.next()
            b.j.a.c.b0.p r2 = (b.j.a.c.b0.p) r2
            r3 = r14
            r4 = r8
            r5 = r15
            r6 = r9
            r7 = r1
            b.j.a.c.j r2 = r2.d(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x001c
            goto L_0x0036
        L_0x0035:
            r2 = r11
        L_0x0036:
            if (r2 != 0) goto L_0x0049
            java.lang.Class<?> r3 = r14.f2152h
            if (r1 != 0) goto L_0x0049
            java.lang.Class<java.util.EnumSet> r4 = java.util.EnumSet.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L_0x0049
            b.j.a.c.b0.a0.k r2 = new b.j.a.c.b0.a0.k
            r2.<init>(r0, r11)
        L_0x0049:
            if (r2 != 0) goto L_0x013d
            boolean r3 = r14.E()
            if (r3 != 0) goto L_0x0057
            boolean r3 = r14.w()
            if (r3 == 0) goto L_0x009b
        L_0x0057:
            java.lang.Class<?> r3 = r14.f2152h
            java.util.HashMap<java.lang.String, java.lang.Class<? extends java.util.Collection>> r4 = f1766m
            java.lang.String r3 = r3.getName()
            java.lang.Object r3 = r4.get(r3)
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 != 0) goto L_0x0069
            r3 = r11
            goto L_0x0073
        L_0x0069:
            b.j.a.c.a0.a r4 = r8.f1609i
            b.j.a.c.i0.n r4 = r4.f1589k
            b.j.a.c.i r3 = r4.k(r14, r3)
            b.j.a.c.i0.e r3 = (b.j.a.c.i0.e) r3
        L_0x0073:
            if (r3 != 0) goto L_0x0096
            java.lang.Object r2 = r14.f2155k
            if (r2 == 0) goto L_0x007f
            b.j.a.c.b0.a r2 = new b.j.a.c.b0.a
            r2.<init>(r15)
            goto L_0x009b
        L_0x007f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Cannot find a deserializer for non-concrete Collection type "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            r13.<init>(r14)
            throw r13
        L_0x0096:
            b.j.a.c.c r15 = r8.w(r3)
            r14 = r3
        L_0x009b:
            if (r2 != 0) goto L_0x013d
            b.j.a.c.b0.x r13 = r12.t(r13, r15)
            boolean r15 = r13.i()
            r2 = 0
            r3 = 1
            if (r15 != 0) goto L_0x0129
            java.lang.Class<java.util.concurrent.ArrayBlockingQueue> r15 = java.util.concurrent.ArrayBlockingQueue.class
            java.lang.Class<?> r4 = r14.f2152h
            if (r4 != r15) goto L_0x00b1
            r15 = r3
            goto L_0x00b2
        L_0x00b1:
            r15 = r2
        L_0x00b2:
            if (r15 == 0) goto L_0x00ba
            b.j.a.c.b0.a0.a r15 = new b.j.a.c.b0.a0.a
            r15.<init>(r14, r1, r9, r13)
            return r15
        L_0x00ba:
            java.lang.Class<?> r15 = b.j.a.c.b0.z.k.a
            boolean r15 = r14.v(r15)
            if (r15 == 0) goto L_0x00cf
            r15 = 7
            java.lang.Class<java.util.List> r4 = java.util.List.class
            b.j.a.c.b0.z.k$b r5 = new b.j.a.c.b0.z.k$b
            b.j.a.c.i r4 = r14.i(r4)
            r5.<init>(r15, r4, r11)
            goto L_0x0121
        L_0x00cf:
            java.lang.Class<?> r15 = b.j.a.c.b0.z.k.c
            boolean r15 = r14.v(r15)
            if (r15 == 0) goto L_0x00e4
            r15 = 2
            java.lang.Class<java.util.List> r4 = java.util.List.class
            b.j.a.c.b0.z.k$b r5 = new b.j.a.c.b0.z.k$b
            b.j.a.c.i r4 = r14.i(r4)
            r5.<init>(r15, r4, r11)
            goto L_0x0121
        L_0x00e4:
            java.lang.Class<?> r15 = b.j.a.c.b0.z.k.f1832b
            boolean r15 = r14.v(r15)
            if (r15 == 0) goto L_0x00f8
            java.lang.Class<java.util.Set> r15 = java.util.Set.class
            b.j.a.c.b0.z.k$b r5 = new b.j.a.c.b0.z.k$b
            b.j.a.c.i r15 = r14.i(r15)
            r5.<init>(r3, r15, r11)
            goto L_0x0121
        L_0x00f8:
            java.lang.Class<?> r15 = b.j.a.c.b0.z.k.f
            boolean r15 = r14.v(r15)
            if (r15 == 0) goto L_0x010d
            r15 = 5
            java.lang.Class<java.util.List> r4 = java.util.List.class
            b.j.a.c.b0.z.k$b r5 = new b.j.a.c.b0.z.k$b
            b.j.a.c.i r4 = r14.i(r4)
            r5.<init>(r15, r4, r11)
            goto L_0x0121
        L_0x010d:
            java.lang.Class<?> r15 = b.j.a.c.b0.z.k.f1833e
            boolean r15 = r14.v(r15)
            if (r15 == 0) goto L_0x0126
            r15 = 4
            java.lang.Class<java.util.Set> r4 = java.util.Set.class
            b.j.a.c.b0.z.k$b r5 = new b.j.a.c.b0.z.k$b
            b.j.a.c.i r4 = r14.i(r4)
            r5.<init>(r15, r4, r11)
        L_0x0121:
            b.j.a.c.b0.a0.y r11 = new b.j.a.c.b0.a0.y
            r11.<init>(r5)
        L_0x0126:
            if (r11 == 0) goto L_0x0129
            return r11
        L_0x0129:
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            java.lang.Class<?> r0 = r0.f2152h
            if (r0 != r15) goto L_0x0130
            r2 = r3
        L_0x0130:
            if (r2 == 0) goto L_0x0138
            b.j.a.c.b0.a0.f0 r2 = new b.j.a.c.b0.a0.f0
            r2.<init>(r14, r1, r13)
            goto L_0x013d
        L_0x0138:
            b.j.a.c.b0.a0.f r2 = new b.j.a.c.b0.a0.f
            r2.<init>(r14, r1, r9, r13)
        L_0x013d:
            b.j.a.c.a0.f r13 = r12.f1767h
            boolean r13 = r13.c()
            if (r13 == 0) goto L_0x015d
            b.j.a.c.a0.f r13 = r12.f1767h
            java.lang.Iterable r13 = r13.a()
            b.j.a.c.j0.d r13 = (b.j.a.c.j0.d) r13
        L_0x014d:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x015d
            java.lang.Object r14 = r13.next()
            b.j.a.c.b0.g r14 = (b.j.a.c.b0.g) r14
            java.util.Objects.requireNonNull(r14)
            goto L_0x014d
        L_0x015d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.b.a(b.j.a.c.g, b.j.a.c.i0.e, b.j.a.c.c):b.j.a.c.j");
    }

    public c b(b.j.a.c.f fVar, i iVar) {
        Collection<a> collection;
        b.j.a.c.e0.b bVar = ((p) fVar.m(iVar.f2152h)).f1937e;
        e Y = fVar.e().Y(fVar, bVar, iVar);
        if (Y == null) {
            Y = fVar.f1609i.f1590l;
            if (Y == null) {
                return null;
            }
            collection = null;
        } else {
            collection = fVar.f1611l.b(fVar, bVar);
        }
        if (Y.e() == null && iVar.w()) {
            c(fVar, iVar);
            if (!iVar.v(iVar.f2152h)) {
                Y = Y.b(iVar.f2152h);
            }
        }
        try {
            return Y.f(fVar, iVar, collection);
        } catch (IllegalArgumentException e2) {
            b.j.a.c.c0.b bVar2 = new b.j.a.c.c0.b((b.j.a.b.i) null, g.i(e2), iVar);
            bVar2.initCause(e2);
            throw bVar2;
        }
    }

    public i c(b.j.a.c.f fVar, i iVar) {
        Class<?> cls = iVar.f2152h;
        Objects.requireNonNull(this.f1767h);
        b.j.a.c.a[] aVarArr = f.f1604j;
        if (aVarArr.length > 0) {
            d dVar = new d(aVarArr);
            while (dVar.hasNext()) {
                Objects.requireNonNull((b.j.a.c.a) dVar.next());
            }
        }
        return iVar;
    }

    public void d(b.j.a.c.g gVar, b.j.a.c.c cVar, b.j.a.c.b0.z.e eVar, b.j.a.c.b0.z.d dVar) {
        t tVar;
        int i2 = 0;
        if (1 != dVar.c) {
            int i3 = -1;
            int i4 = -1;
            while (true) {
                if (i2 >= dVar.c) {
                    i3 = i4;
                    break;
                }
                if (dVar.d[i2].c == null) {
                    if (i4 >= 0) {
                        break;
                    }
                    i4 = i2;
                }
                i2++;
            }
            if (i3 < 0 || dVar.d(i3) != null) {
                f(gVar, cVar, eVar, dVar);
            } else {
                e(gVar, cVar, eVar, dVar);
            }
        } else {
            l e2 = dVar.e(0);
            b.a c = dVar.c(0);
            r rVar = dVar.d[0].f1818b;
            t h2 = (rVar == null || !rVar.K()) ? null : rVar.h();
            r f = dVar.f(0);
            boolean z = (h2 == null && c == null) ? false : true;
            if (z || f == null) {
                tVar = h2;
            } else {
                t d = dVar.d(0);
                if (d == null || !f.p()) {
                    tVar = d;
                    z = false;
                } else {
                    tVar = d;
                    z = true;
                }
            }
            if (z) {
                eVar.d(dVar.f1817b, true, new u[]{n(gVar, cVar, tVar, 0, e2, c)});
                return;
            }
            k(eVar, dVar.f1817b, true, true);
            if (f != null) {
                ((a0) f).f1880o = null;
            }
        }
    }

    public void e(b.j.a.c.g gVar, b.j.a.c.c cVar, b.j.a.c.b0.z.e eVar, b.j.a.c.b0.z.d dVar) {
        b.j.a.c.g gVar2 = gVar;
        b.j.a.c.c cVar2 = cVar;
        b.j.a.c.b0.z.e eVar2 = eVar;
        b.j.a.c.b0.z.d dVar2 = dVar;
        int i2 = dVar2.c;
        u[] uVarArr = new u[i2];
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            l e2 = dVar2.e(i4);
            b.a c = dVar2.c(i4);
            if (c != null) {
                uVarArr[i4] = n(gVar, cVar, (t) null, i4, e2, c);
            } else if (i3 < 0) {
                i3 = i4;
            } else {
                gVar2.V(cVar2, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i3), Integer.valueOf(i4), dVar2);
                throw null;
            }
        }
        if (i3 < 0) {
            gVar2.V(cVar2, "No argument left as delegating for Creator %s: exactly one required", dVar2);
            throw null;
        } else if (i2 == 1) {
            k(eVar2, dVar2.f1817b, true, true);
            r f = dVar2.f(0);
            if (f != null) {
                ((a0) f).f1880o = null;
            }
        } else {
            eVar2.c(dVar2.f1817b, true, uVarArr, i3);
        }
    }

    public void f(b.j.a.c.g gVar, b.j.a.c.c cVar, b.j.a.c.b0.z.e eVar, b.j.a.c.b0.z.d dVar) {
        int i2 = dVar.c;
        u[] uVarArr = new u[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            b.a c = dVar.c(i3);
            l e2 = dVar.e(i3);
            t d = dVar.d(i3);
            if (d == null) {
                if (gVar.x().Z(e2) == null) {
                    d = dVar.b(i3);
                    if (d == null && c == null) {
                        gVar.V(cVar, "Argument #%d has no property name, is not Injectable: can not use as Creator %s", Integer.valueOf(i3), dVar);
                        throw null;
                    }
                } else {
                    m(gVar, cVar, e2);
                    throw null;
                }
            }
            uVarArr[i3] = n(gVar, cVar, d, i3, e2, c);
        }
        eVar.d(dVar.f1817b, true, uVarArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = r5.getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(b.j.a.c.b r3, b.j.a.c.e0.m r4, b.j.a.c.e0.r r5) {
        /*
            r2 = this;
            r0 = 1
            if (r5 == 0) goto L_0x0009
            boolean r1 = r5.K()
            if (r1 != 0) goto L_0x0014
        L_0x0009:
            r1 = 0
            b.j.a.c.e0.l r4 = r4.r(r1)
            b.j.a.a.b$a r3 = r3.o(r4)
            if (r3 == 0) goto L_0x0015
        L_0x0014:
            return r0
        L_0x0015:
            if (r5 == 0) goto L_0x002a
            java.lang.String r3 = r5.getName()
            if (r3 == 0) goto L_0x002a
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002a
            boolean r3 = r5.p()
            if (r3 == 0) goto L_0x002a
            return r0
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.b.g(b.j.a.c.b, b.j.a.c.e0.m, b.j.a.c.e0.r):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: b.j.a.c.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: b.j.a.c.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: b.j.a.c.b0.z.e$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: b.j.a.c.b0.u[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: b.j.a.c.b0.u[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: b.j.a.c.b0.u[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: b.j.a.c.b0.u[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: b.j.a.c.e0.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: b.j.a.c.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: b.j.a.c.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: b.j.a.c.t} */
    /* JADX WARNING: type inference failed for: r13v5, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r13v9, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r26v2 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15, types: [b.j.a.c.e0.m] */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.b0.x h(b.j.a.c.g r34, b.j.a.c.c r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            b.j.a.a.h$a r10 = b.j.a.a.h.a.DISABLED
            b.j.a.c.b0.z.e r11 = new b.j.a.c.b0.z.e
            b.j.a.c.f r0 = r8.f1993j
            r11.<init>(r9, r0)
            b.j.a.c.b r12 = r34.x()
            b.j.a.c.f r0 = r8.f1993j
            b.j.a.c.i r1 = r9.a
            java.lang.Class<?> r1 = r1.f2152h
            r13 = r9
            b.j.a.c.e0.p r13 = (b.j.a.c.e0.p) r13
            b.j.a.c.e0.b r2 = r13.f1937e
            b.j.a.c.e0.i0 r14 = r0.k(r1, r2)
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.util.List r1 = r13.h()
            java.util.Iterator r1 = r1.iterator()
            r15 = r0
        L_0x002f:
            boolean r0 = r1.hasNext()
            r6 = 4
            r2 = 0
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r1.next()
            b.j.a.c.e0.r r0 = (b.j.a.c.e0.r) r0
            java.util.Iterator r17 = r0.x()
        L_0x0041:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x002f
            java.lang.Object r18 = r17.next()
            r5 = r18
            b.j.a.c.e0.l r5 = (b.j.a.c.e0.l) r5
            b.j.a.c.e0.m r4 = r5.f1923j
            java.lang.Object r19 = r15.get(r4)
            b.j.a.c.e0.r[] r19 = (b.j.a.c.e0.r[]) r19
            int r5 = r5.f1925l
            if (r19 != 0) goto L_0x0072
            boolean r19 = r15.isEmpty()
            if (r19 == 0) goto L_0x0066
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
        L_0x0066:
            int r3 = r4.t()
            b.j.a.c.e0.r[] r3 = new b.j.a.c.e0.r[r3]
            r15.put(r4, r3)
            r19 = r3
            goto L_0x0076
        L_0x0072:
            r3 = r19[r5]
            if (r3 != 0) goto L_0x0079
        L_0x0076:
            r19[r5] = r0
            goto L_0x0041
        L_0x0079:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r2 = r19[r5]
            r3 = 2
            r1[r3] = r2
            r5 = 3
            r1[r5] = r0
            java.lang.String r0 = "Conflict: parameter #%d of %s bound to more than one property; %s vs %s"
            r8.V(r9, r0, r1)
            r0 = 0
            throw r0
        L_0x0093:
            r5 = 3
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.List r1 = r35.f()
            java.util.Iterator r1 = r1.iterator()
            r3 = r2
        L_0x00a2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x010e
            java.lang.Object r4 = r1.next()
            b.j.a.c.e0.i r4 = (b.j.a.c.e0.i) r4
            b.j.a.c.f r5 = r8.f1993j
            b.j.a.a.h$a r5 = r12.e(r5, r4)
            int r6 = r4.t()
            if (r5 != 0) goto L_0x00cf
            r2 = 1
            if (r6 != r2) goto L_0x00d7
            r2 = r14
            b.j.a.c.e0.i0$a r2 = (b.j.a.c.e0.i0.a) r2
            boolean r2 = r2.c(r4)
            if (r2 == 0) goto L_0x00d7
            r2 = 0
            b.j.a.c.b0.z.d r4 = b.j.a.c.b0.z.d.a(r12, r4, r2)
            r0.add(r4)
            goto L_0x00d7
        L_0x00cf:
            if (r5 != r10) goto L_0x00d2
            goto L_0x00d7
        L_0x00d2:
            if (r6 != 0) goto L_0x00d9
            r11.e(r4)
        L_0x00d7:
            r5 = 2
            goto L_0x010a
        L_0x00d9:
            int r2 = r5.ordinal()
            r5 = 1
            if (r2 == r5) goto L_0x00ff
            r5 = 2
            if (r2 == r5) goto L_0x00f1
            java.lang.Object r2 = r15.get(r4)
            b.j.a.c.e0.r[] r2 = (b.j.a.c.e0.r[]) r2
            b.j.a.c.b0.z.d r2 = b.j.a.c.b0.z.d.a(r12, r4, r2)
            r7.d(r8, r9, r11, r2)
            goto L_0x0108
        L_0x00f1:
            java.lang.Object r2 = r15.get(r4)
            b.j.a.c.e0.r[] r2 = (b.j.a.c.e0.r[]) r2
            b.j.a.c.b0.z.d r2 = b.j.a.c.b0.z.d.a(r12, r4, r2)
            r7.f(r8, r9, r11, r2)
            goto L_0x0108
        L_0x00ff:
            r2 = 0
            r5 = 2
            b.j.a.c.b0.z.d r4 = b.j.a.c.b0.z.d.a(r12, r4, r2)
            r7.e(r8, r9, r11, r4)
        L_0x0108:
            int r3 = r3 + 1
        L_0x010a:
            r2 = 0
            r5 = 3
            r6 = 4
            goto L_0x00a2
        L_0x010e:
            r5 = 2
            if (r3 <= 0) goto L_0x0120
        L_0x0111:
            r24 = r10
            r28 = r13
            r19 = r14
            r16 = r15
            r13 = 0
            r14 = 1
            r17 = 4
            r10 = r5
            goto L_0x0242
        L_0x0120:
            java.util.Iterator r18 = r0.iterator()
        L_0x0124:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = r18.next()
            b.j.a.c.b0.z.d r0 = (b.j.a.c.b0.z.d) r0
            int r6 = r0.c
            b.j.a.c.e0.m r4 = r0.f1817b
            java.lang.Object r1 = r15.get(r4)
            r21 = r1
            b.j.a.c.e0.r[] r21 = (b.j.a.c.e0.r[]) r21
            r3 = 1
            if (r6 == r3) goto L_0x0142
            r1 = 0
            r2 = 0
            goto L_0x0124
        L_0x0142:
            r2 = 0
            b.j.a.c.e0.r r0 = r0.f(r2)
            boolean r1 = r7.g(r12, r4, r0)
            if (r1 != 0) goto L_0x0161
            r1 = r14
            b.j.a.c.e0.i0$a r1 = (b.j.a.c.e0.i0.a) r1
            boolean r1 = r1.c(r4)
            r7.k(r11, r4, r2, r1)
            if (r0 == 0) goto L_0x015f
            b.j.a.c.e0.a0 r0 = (b.j.a.c.e0.a0) r0
            r1 = 0
            r0.f1880o = r1
            goto L_0x0124
        L_0x015f:
            r1 = 0
            goto L_0x0124
        L_0x0161:
            r1 = 0
            b.j.a.c.b0.u[] r0 = new b.j.a.c.b0.u[r6]
            r20 = r2
            r22 = r20
            r19 = r14
            r16 = r15
            r15 = r1
            r14 = r22
        L_0x016f:
            if (r14 >= r6) goto L_0x01f5
            b.j.a.c.e0.l r5 = r4.r(r14)
            if (r21 != 0) goto L_0x017a
            r24 = r1
            goto L_0x017c
        L_0x017a:
            r24 = r21[r14]
        L_0x017c:
            b.j.a.a.b$a r25 = r12.o(r5)
            if (r24 != 0) goto L_0x0185
            r26 = r1
            goto L_0x0189
        L_0x0185:
            b.j.a.c.t r26 = r24.h()
        L_0x0189:
            if (r24 == 0) goto L_0x01b5
            boolean r24 = r24.K()
            if (r24 == 0) goto L_0x01b5
            int r20 = r20 + 1
            r24 = r10
            r10 = r0
            r0 = r33
            r27 = r1
            r1 = r34
            r28 = r13
            r13 = r2
            r2 = r35
            r13 = r27
            r3 = r26
            r29 = r4
            r4 = r14
            r30 = r6
            r17 = 4
            r6 = r25
            b.j.a.c.b0.u r0 = r0.n(r1, r2, r3, r4, r5, r6)
            r10[r14] = r0
            goto L_0x01e0
        L_0x01b5:
            r29 = r4
            r30 = r6
            r24 = r10
            r28 = r13
            r17 = 4
            r10 = r0
            r13 = r1
            if (r25 == 0) goto L_0x01d7
            int r22 = r22 + 1
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r26
            r4 = r14
            r6 = r25
            b.j.a.c.b0.u r0 = r0.n(r1, r2, r3, r4, r5, r6)
            r10[r14] = r0
            goto L_0x01e0
        L_0x01d7:
            b.j.a.c.j0.r r0 = r12.Z(r5)
            if (r0 != 0) goto L_0x01f1
            if (r15 != 0) goto L_0x01e0
            r15 = r5
        L_0x01e0:
            int r14 = r14 + 1
            r0 = r10
            r1 = r13
            r10 = r24
            r13 = r28
            r4 = r29
            r6 = r30
            r2 = 0
            r3 = 1
            r5 = 2
            goto L_0x016f
        L_0x01f1:
            r7.m(r8, r9, r5)
            throw r13
        L_0x01f5:
            r29 = r4
            r30 = r6
            r24 = r10
            r28 = r13
            r17 = 4
            r10 = r0
            r13 = r1
            int r0 = r20 + 0
            if (r20 > 0) goto L_0x020a
            if (r22 <= 0) goto L_0x0208
            goto L_0x020a
        L_0x0208:
            r2 = 0
            goto L_0x0223
        L_0x020a:
            int r0 = r0 + r22
            r1 = r30
            if (r0 != r1) goto L_0x0217
            r0 = r29
            r2 = 0
            r11.d(r0, r2, r10)
            goto L_0x0223
        L_0x0217:
            r0 = r29
            r2 = 0
            if (r20 != 0) goto L_0x022e
            int r3 = r22 + 1
            if (r3 != r1) goto L_0x022e
            r11.c(r0, r2, r10, r2)
        L_0x0223:
            r15 = r16
            r14 = r19
            r10 = r24
            r13 = r28
            r5 = 2
            goto L_0x0124
        L_0x022e:
            r10 = 2
            java.lang.Object[] r1 = new java.lang.Object[r10]
            int r3 = r15.f1925l
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r14 = 1
            r1[r14] = r0
            java.lang.String r0 = "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r8.V(r9, r0, r1)
            throw r13
        L_0x0242:
            b.j.a.c.i r0 = r9.a
            boolean r0 = r0.z()
            r18 = 7
            if (r0 == 0) goto L_0x0538
            r6 = r28
            b.j.a.c.e0.b r0 = r6.f1937e
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x0258
            goto L_0x0538
        L_0x0258:
            b.j.a.c.e0.b r0 = r6.f1937e
            b.j.a.c.e0.b$a r0 = r0.g()
            b.j.a.c.e0.d r0 = r0.a
            if (r0 == 0) goto L_0x0277
            b.j.a.c.e0.m[] r1 = r11.d
            r2 = 0
            r1 = r1[r2]
            if (r1 == 0) goto L_0x026b
            r2 = r14
            goto L_0x026c
        L_0x026b:
            r2 = 0
        L_0x026c:
            if (r2 == 0) goto L_0x0274
            boolean r1 = r7.l(r8, r0)
            if (r1 == 0) goto L_0x0277
        L_0x0274:
            r11.e(r0)
        L_0x0277:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            b.j.a.c.e0.b r1 = r6.f1937e
            java.util.List r1 = r1.j()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x0287:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02f3
            java.lang.Object r3 = r1.next()
            b.j.a.c.e0.d r3 = (b.j.a.c.e0.d) r3
            b.j.a.c.f r4 = r8.f1993j
            b.j.a.a.h$a r4 = r12.e(r4, r3)
            r5 = r24
            if (r5 != r4) goto L_0x02a0
        L_0x029d:
            r4 = r16
            goto L_0x02bd
        L_0x02a0:
            if (r4 != 0) goto L_0x02bf
            r4 = r19
            b.j.a.c.e0.i0$a r4 = (b.j.a.c.e0.i0.a) r4
            boolean r4 = r4.c(r3)
            if (r4 == 0) goto L_0x029d
            r4 = r16
            java.lang.Object r16 = r4.get(r3)
            r15 = r16
            b.j.a.c.e0.r[] r15 = (b.j.a.c.e0.r[]) r15
            b.j.a.c.b0.z.d r3 = b.j.a.c.b0.z.d.a(r12, r3, r15)
            r0.add(r3)
        L_0x02bd:
            r15 = r4
            goto L_0x02ee
        L_0x02bf:
            r15 = r16
            int r4 = r4.ordinal()
            if (r4 == r14) goto L_0x02e5
            if (r4 == r10) goto L_0x02d7
            java.lang.Object r4 = r15.get(r3)
            b.j.a.c.e0.r[] r4 = (b.j.a.c.e0.r[]) r4
            b.j.a.c.b0.z.d r3 = b.j.a.c.b0.z.d.a(r12, r3, r4)
            r7.d(r8, r9, r11, r3)
            goto L_0x02ec
        L_0x02d7:
            java.lang.Object r4 = r15.get(r3)
            b.j.a.c.e0.r[] r4 = (b.j.a.c.e0.r[]) r4
            b.j.a.c.b0.z.d r3 = b.j.a.c.b0.z.d.a(r12, r3, r4)
            r7.f(r8, r9, r11, r3)
            goto L_0x02ec
        L_0x02e5:
            b.j.a.c.b0.z.d r3 = b.j.a.c.b0.z.d.a(r12, r3, r13)
            r7.e(r8, r9, r11, r3)
        L_0x02ec:
            int r2 = r2 + 1
        L_0x02ee:
            r24 = r5
            r16 = r15
            goto L_0x0287
        L_0x02f3:
            if (r2 <= 0) goto L_0x02f7
            goto L_0x0538
        L_0x02f7:
            java.util.Iterator r15 = r0.iterator()
            r16 = r13
        L_0x02fd:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0450
            java.lang.Object r0 = r15.next()
            r5 = r0
            b.j.a.c.b0.z.d r5 = (b.j.a.c.b0.z.d) r5
            int r4 = r5.c
            b.j.a.c.e0.m r3 = r5.f1817b
            if (r4 != r14) goto L_0x0363
            r2 = 0
            b.j.a.c.e0.r r0 = r5.f(r2)
            boolean r1 = r7.g(r12, r3, r0)
            if (r1 == 0) goto L_0x0349
            b.j.a.c.b0.u[] r4 = new b.j.a.c.b0.u[r14]
            b.j.a.c.t r20 = r5.d(r2)
            r21 = 0
            b.j.a.c.e0.l r22 = r5.e(r2)
            b.j.a.a.b$a r23 = r5.c(r2)
            r0 = r33
            r1 = r34
            r5 = r2
            r2 = r35
            r14 = r3
            r3 = r20
            r10 = r4
            r4 = r21
            r13 = r5
            r5 = r22
            r31 = r6
            r6 = r23
            b.j.a.c.b0.u r0 = r0.n(r1, r2, r3, r4, r5, r6)
            r10[r13] = r0
            r11.d(r14, r13, r10)
            goto L_0x035f
        L_0x0349:
            r13 = r2
            r14 = r3
            r31 = r6
            r1 = r19
            b.j.a.c.e0.i0$a r1 = (b.j.a.c.e0.i0.a) r1
            boolean r1 = r1.c(r14)
            r7.k(r11, r14, r13, r1)
            if (r0 == 0) goto L_0x035f
            b.j.a.c.e0.a0 r0 = (b.j.a.c.e0.a0) r0
            r1 = 0
            r0.f1880o = r1
        L_0x035f:
            r25 = r15
            goto L_0x0433
        L_0x0363:
            r14 = r3
            r31 = r6
            r0 = -1
            b.j.a.c.b0.u[] r10 = new b.j.a.c.b0.u[r4]
            r13 = r0
            r6 = 0
            r20 = 0
            r21 = 0
        L_0x036f:
            if (r6 >= r4) goto L_0x03ea
            b.j.a.c.e0.l r3 = r14.r(r6)
            b.j.a.c.e0.r r0 = r5.f(r6)
            b.j.a.a.b$a r22 = r12.o(r3)
            if (r0 != 0) goto L_0x0382
            r23 = 0
            goto L_0x0388
        L_0x0382:
            b.j.a.c.t r1 = r0.h()
            r23 = r1
        L_0x0388:
            if (r0 == 0) goto L_0x03af
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x03af
            int r20 = r20 + 1
            r0 = r33
            r1 = r34
            r2 = r35
            r24 = r3
            r3 = r23
            r25 = r15
            r15 = r4
            r4 = r6
            r32 = r5
            r5 = r24
            r26 = r6
            r6 = r22
            b.j.a.c.b0.u r0 = r0.n(r1, r2, r3, r4, r5, r6)
            r10[r26] = r0
            goto L_0x03dd
        L_0x03af:
            r24 = r3
            r32 = r5
            r26 = r6
            r25 = r15
            r15 = r4
            if (r22 == 0) goto L_0x03d1
            int r21 = r21 + 1
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r23
            r4 = r26
            r5 = r24
            r6 = r22
            b.j.a.c.b0.u r0 = r0.n(r1, r2, r3, r4, r5, r6)
            r10[r26] = r0
            goto L_0x03dd
        L_0x03d1:
            r0 = r24
            b.j.a.c.j0.r r1 = r12.Z(r0)
            if (r1 != 0) goto L_0x03e5
            if (r13 >= 0) goto L_0x03dd
            r13 = r26
        L_0x03dd:
            int r6 = r26 + 1
            r4 = r15
            r15 = r25
            r5 = r32
            goto L_0x036f
        L_0x03e5:
            r7.m(r8, r9, r0)
            r0 = 0
            throw r0
        L_0x03ea:
            r32 = r5
            r25 = r15
            r15 = r4
            int r0 = r20 + 0
            if (r20 > 0) goto L_0x03f8
            if (r21 <= 0) goto L_0x03f6
            goto L_0x03f8
        L_0x03f6:
            r0 = 0
            goto L_0x041a
        L_0x03f8:
            int r0 = r0 + r21
            if (r0 != r15) goto L_0x0401
            r0 = 0
            r11.d(r14, r0, r10)
            goto L_0x0433
        L_0x0401:
            r0 = 0
            if (r20 != 0) goto L_0x040c
            int r1 = r21 + 1
            if (r1 != r15) goto L_0x040c
            r11.c(r14, r0, r10, r0)
            goto L_0x0433
        L_0x040c:
            r1 = r32
            b.j.a.c.t r1 = r1.b(r13)
            if (r1 == 0) goto L_0x043c
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x043c
        L_0x041a:
            b.j.a.c.e0.m[] r1 = r11.d
            r1 = r1[r0]
            if (r1 == 0) goto L_0x0422
            r2 = 1
            goto L_0x0423
        L_0x0422:
            r2 = 0
        L_0x0423:
            if (r2 != 0) goto L_0x0433
            if (r16 != 0) goto L_0x042c
            java.util.LinkedList r16 = new java.util.LinkedList
            r16.<init>()
        L_0x042c:
            r0 = r16
            r0.add(r14)
            r16 = r0
        L_0x0433:
            r15 = r25
            r6 = r31
            r10 = 2
            r13 = 0
            r14 = 1
            goto L_0x02fd
        L_0x043c:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r14
            java.lang.String r1 = "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r8.V(r9, r1, r0)
            r10 = 0
            throw r10
        L_0x0450:
            r31 = r6
            r10 = r13
            if (r16 == 0) goto L_0x0538
            b.j.a.c.e0.m[] r0 = r11.d
            r1 = 6
            r2 = r0[r1]
            if (r2 == 0) goto L_0x045e
            r2 = 1
            goto L_0x045f
        L_0x045e:
            r2 = 0
        L_0x045f:
            if (r2 != 0) goto L_0x0538
            r0 = r0[r18]
            if (r0 == 0) goto L_0x0467
            r2 = 1
            goto L_0x0468
        L_0x0467:
            r2 = 0
        L_0x0468:
            if (r2 != 0) goto L_0x0538
            java.util.Iterator r13 = r16.iterator()
            r14 = r10
            r15 = r14
        L_0x0470:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x04f7
            java.lang.Object r0 = r13.next()
            r6 = r0
            b.j.a.c.e0.m r6 = (b.j.a.c.e0.m) r6
            r0 = r19
            b.j.a.c.e0.i0$a r0 = (b.j.a.c.e0.i0.a) r0
            boolean r0 = r0.c(r6)
            if (r0 != 0) goto L_0x0488
            goto L_0x0470
        L_0x0488:
            int r5 = r6.t()
            b.j.a.c.b0.u[] r4 = new b.j.a.c.b0.u[r5]
            r3 = 0
        L_0x048f:
            if (r3 >= r5) goto L_0x04e9
            b.j.a.c.e0.l r2 = r6.r(r3)
            if (r12 == 0) goto L_0x04b1
            b.j.a.c.t r0 = r12.v(r2)
            if (r0 == 0) goto L_0x049e
            goto L_0x04ae
        L_0x049e:
            java.lang.String r0 = r12.n(r2)
            if (r0 == 0) goto L_0x04b1
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x04b1
            b.j.a.c.t r0 = b.j.a.c.t.a(r0)
        L_0x04ae:
            r16 = r0
            goto L_0x04b3
        L_0x04b1:
            r16 = r10
        L_0x04b3:
            if (r16 == 0) goto L_0x0470
            boolean r0 = r16.e()
            if (r0 == 0) goto L_0x04bc
            goto L_0x0470
        L_0x04bc:
            int r1 = r2.f1925l
            r20 = 0
            r0 = r33
            r21 = r1
            r1 = r34
            r22 = r2
            r2 = r35
            r23 = r3
            r3 = r16
            r16 = r4
            r4 = r21
            r21 = r5
            r5 = r22
            r22 = r6
            r6 = r20
            b.j.a.c.b0.u r0 = r0.n(r1, r2, r3, r4, r5, r6)
            r16[r23] = r0
            int r3 = r23 + 1
            r4 = r16
            r5 = r21
            r6 = r22
            goto L_0x048f
        L_0x04e9:
            r16 = r4
            r22 = r6
            if (r14 == 0) goto L_0x04f1
            r3 = r10
            goto L_0x04f8
        L_0x04f1:
            r15 = r16
            r14 = r22
            goto L_0x0470
        L_0x04f7:
            r3 = r14
        L_0x04f8:
            if (r3 == 0) goto L_0x0538
            r0 = 0
            r11.d(r3, r0, r15)
            int r0 = r15.length
            r2 = 0
        L_0x0500:
            if (r2 >= r0) goto L_0x0538
            r1 = r15[r2]
            b.j.a.c.t r3 = r1.f1796k
            r4 = r31
            boolean r5 = r4.j(r3)
            if (r5 != 0) goto L_0x0533
            b.j.a.c.f r5 = r8.f1993j
            b.j.a.c.e0.h r21 = r1.e()
            b.j.a.a.r$b r24 = b.j.a.c.e0.r.f1946h
            b.j.a.c.j0.x r1 = new b.j.a.c.j0.x
            b.j.a.c.b r20 = r5.e()
            r23 = 0
            r19 = r1
            r22 = r3
            r19.<init>(r20, r21, r22, r23, r24)
            boolean r3 = r4.j(r3)
            if (r3 == 0) goto L_0x052c
            goto L_0x0533
        L_0x052c:
            java.util.List r3 = r4.h()
            r3.add(r1)
        L_0x0533:
            int r2 = r2 + 1
            r31 = r4
            goto L_0x0500
        L_0x0538:
            b.j.a.c.e0.m[] r0 = r11.d
            r1 = 6
            r0 = r0[r1]
            b.j.a.c.b0.u[] r1 = r11.f1822g
            b.j.a.c.i r0 = r11.a(r8, r0, r1)
            b.j.a.c.e0.m[] r1 = r11.d
            r2 = 8
            r1 = r1[r2]
            b.j.a.c.b0.u[] r3 = r11.f1823h
            b.j.a.c.i r1 = r11.a(r8, r1, r3)
            b.j.a.c.c r3 = r11.a
            b.j.a.c.i r3 = r3.a
            b.j.a.c.e0.m[] r4 = r11.d
            r5 = 0
            r4 = r4[r5]
            if (r4 == 0) goto L_0x0587
            java.lang.Class r5 = r4.h()
            java.lang.Class<java.util.List> r6 = java.util.List.class
            if (r5 == r6) goto L_0x057e
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            if (r5 != r6) goto L_0x0567
            goto L_0x057e
        L_0x0567:
            java.lang.Class<java.util.LinkedHashMap> r6 = java.util.LinkedHashMap.class
            if (r5 != r6) goto L_0x0572
            b.j.a.c.b0.z.e$a r5 = new b.j.a.c.b0.z.e$a
            r6 = 3
            r5.<init>(r4, r6)
            goto L_0x0585
        L_0x0572:
            r6 = 3
            java.lang.Class<java.util.HashMap> r8 = java.util.HashMap.class
            if (r5 != r8) goto L_0x0588
            b.j.a.c.b0.z.e$a r5 = new b.j.a.c.b0.z.e$a
            r8 = 2
            r5.<init>(r4, r8)
            goto L_0x0585
        L_0x057e:
            r6 = 3
            b.j.a.c.b0.z.e$a r5 = new b.j.a.c.b0.z.e$a
            r8 = 1
            r5.<init>(r4, r8)
        L_0x0585:
            r4 = r5
            goto L_0x0588
        L_0x0587:
            r6 = 3
        L_0x0588:
            b.j.a.c.b0.a0.d0 r5 = new b.j.a.c.b0.a0.d0
            r5.<init>(r3)
            b.j.a.c.e0.m[] r3 = r11.d
            r8 = 6
            r8 = r3[r8]
            b.j.a.c.b0.u[] r9 = r11.f1822g
            r10 = r3[r18]
            b.j.a.c.b0.u[] r12 = r11.f1824i
            r5.f1647j = r4
            r5.f1651n = r8
            r5.f1650m = r0
            r5.f1652o = r9
            r5.f1648k = r10
            r5.f1649l = r12
            r0 = r3[r2]
            b.j.a.c.b0.u[] r2 = r11.f1823h
            r5.f1654q = r0
            r5.f1653p = r1
            r5.r = r2
            r0 = 1
            r0 = r3[r0]
            r5.s = r0
            r0 = 2
            r0 = r3[r0]
            r5.t = r0
            r0 = r3[r6]
            r5.u = r0
            r0 = r3[r17]
            r5.v = r0
            r0 = 5
            r0 = r3[r0]
            r5.w = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.b.h(b.j.a.c.g, b.j.a.c.c):b.j.a.c.b0.x");
    }

    public j<?> i(Class<?> cls, b.j.a.c.f fVar, b.j.a.c.c cVar) {
        d dVar = (d) this.f1767h.b();
        while (dVar.hasNext()) {
            j<?> g2 = ((p) dVar.next()).g(cls, fVar, cVar);
            if (g2 != null) {
                return g2;
            }
        }
        return null;
    }

    public i j(b.j.a.c.f fVar, Class<?> cls) {
        i b2 = fVar.f1609i.f1589k.b((b.j.a.c.i0.c) null, cls, n.f2185l);
        c(fVar, b2);
        if (b2.f2152h == cls) {
            return null;
        }
        return b2;
    }

    public boolean k(b.j.a.c.b0.z.e eVar, m mVar, boolean z, boolean z2) {
        Class<?> v = mVar.v(0);
        if (v == String.class || v == f1762i) {
            if (z || z2) {
                eVar.f(mVar, 1, z);
            }
            return true;
        } else if (v == Integer.TYPE || v == Integer.class) {
            if (z || z2) {
                eVar.f(mVar, 2, z);
            }
            return true;
        } else if (v == Long.TYPE || v == Long.class) {
            if (z || z2) {
                eVar.f(mVar, 3, z);
            }
            return true;
        } else if (v == Double.TYPE || v == Double.class) {
            if (z || z2) {
                eVar.f(mVar, 4, z);
            }
            return true;
        } else if (v == Boolean.TYPE || v == Boolean.class) {
            if (z || z2) {
                eVar.f(mVar, 5, z);
            }
            return true;
        } else if (!z) {
            return false;
        } else {
            eVar.c(mVar, z, (u[]) null, 0);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r0.e(r2.f1993j, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l(b.j.a.c.g r2, b.j.a.c.e0.a r3) {
        /*
            r1 = this;
            b.j.a.c.b r0 = r2.x()
            if (r0 == 0) goto L_0x0014
            b.j.a.c.f r2 = r2.f1993j
            b.j.a.a.h$a r2 = r0.e(r2, r3)
            if (r2 == 0) goto L_0x0014
            b.j.a.a.h$a r3 = b.j.a.a.h.a.DISABLED
            if (r2 == r3) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.b.l(b.j.a.c.g, b.j.a.c.e0.a):boolean");
    }

    public void m(b.j.a.c.g gVar, b.j.a.c.c cVar, l lVar) {
        gVar.l(cVar.a, String.format("Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", new Object[]{Integer.valueOf(lVar.f1925l)}));
        throw null;
    }

    public u n(b.j.a.c.g gVar, b.j.a.c.c cVar, t tVar, int i2, l lVar, b.a aVar) {
        Object obj;
        b.j.a.c.g gVar2 = gVar;
        l lVar2 = lVar;
        b.a aVar2 = aVar;
        b.j.a.c.f fVar = gVar2.f1993j;
        b.j.a.c.b x = gVar.x();
        s a = x == null ? s.f2294q : s.a(x.j0(lVar2), x.I(lVar2), x.L(lVar2), x.H(lVar2));
        i u = u(gVar2, lVar2, lVar2.f1924k);
        Objects.requireNonNull(x);
        d.a aVar3 = new d.a(tVar, u, (t) null, lVar, a);
        c cVar2 = (c) u.f2155k;
        if (cVar2 == null) {
            cVar2 = b(fVar, u);
        }
        c cVar3 = cVar2;
        if (aVar2 == null) {
            obj = null;
        } else {
            obj = aVar2.f1269h;
        }
        k kVar = new k(tVar, u, aVar3.f1866j, cVar3, ((p) cVar).f1937e.f1894p, lVar, i2, obj, a);
        j<Object> q2 = q(gVar2, lVar2);
        if (q2 == null) {
            q2 = (j) u.f2154j;
        }
        return q2 != null ? kVar.J(gVar2.E(q2, kVar, u)) : kVar;
    }

    public k o(Class<?> cls, b.j.a.c.f fVar, h hVar) {
        if (hVar != null) {
            if (fVar.b()) {
                g.e(hVar.j(), fVar.o(b.j.a.c.p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            b.j.a.c.b e2 = fVar.e();
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            HashMap hashMap = new HashMap();
            int length = enumArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                Enum enumR = enumArr[length];
                try {
                    Object k2 = hVar.k(enumR);
                    if (k2 != null) {
                        hashMap.put(k2.toString(), enumR);
                    }
                } catch (Exception e3) {
                    throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + enumR + ": " + e3.getMessage());
                }
            }
            return new k(cls, enumArr, hashMap, e2 != null ? e2.g(cls) : null);
        }
        b.j.a.c.b e4 = fVar.e();
        Enum[] enumArr2 = (Enum[]) cls.getEnumConstants();
        if (enumArr2 != null) {
            String[] k3 = e4.k(cls, enumArr2, new String[enumArr2.length]);
            HashMap hashMap2 = new HashMap();
            int length2 = enumArr2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                String str = k3[i2];
                if (str == null) {
                    str = enumArr2[i2].name();
                }
                hashMap2.put(str, enumArr2[i2]);
            }
            return new k(cls, enumArr2, hashMap2, e4.g(cls));
        }
        throw new IllegalArgumentException(b.e.a.a.a.d(cls, b.e.a.a.a.y("No enum constants for class ")));
    }

    public j<Object> q(b.j.a.c.g gVar, b.j.a.c.e0.a aVar) {
        Object j2;
        b.j.a.c.b x = gVar.x();
        if (x == null || (j2 = x.j(aVar)) == null) {
            return null;
        }
        return gVar.o(aVar, j2);
    }

    public o r(b.j.a.c.g gVar, b.j.a.c.e0.a aVar) {
        Object r;
        b.j.a.c.b x = gVar.x();
        if (x == null || (r = x.r(aVar)) == null) {
            return null;
        }
        return gVar.Q(aVar, r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.b0.x t(b.j.a.c.g r9, b.j.a.c.c r10) {
        /*
            r8 = this;
            b.j.a.c.f r0 = r9.f1993j
            r1 = r10
            b.j.a.c.e0.p r1 = (b.j.a.c.e0.p) r1
            b.j.a.c.e0.b r1 = r1.f1937e
            b.j.a.c.b r2 = r9.x()
            java.lang.Object r1 = r2.a0(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0060
            boolean r3 = r1 instanceof b.j.a.c.b0.x
            if (r3 == 0) goto L_0x0017
            goto L_0x0039
        L_0x0017:
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L_0x004e
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r3 = b.j.a.c.j0.g.t(r1)
            if (r3 == 0) goto L_0x0024
            goto L_0x0060
        L_0x0024:
            java.lang.Class<b.j.a.c.b0.x> r3 = b.j.a.c.b0.x.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x003c
            b.j.a.c.a0.a r3 = r0.f1609i
            java.util.Objects.requireNonNull(r3)
            boolean r3 = r0.b()
            java.lang.Object r1 = b.j.a.c.j0.g.h(r1, r3)
        L_0x0039:
            b.j.a.c.b0.x r1 = (b.j.a.c.b0.x) r1
            goto L_0x0061
        L_0x003c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r10 = b.e.a.a.a.y(r10)
            java.lang.String r0 = "; expected Class<ValueInstantiator>"
            java.lang.String r10 = b.e.a.a.a.e(r1, r10, r0)
            r9.<init>(r10)
            throw r9
        L_0x004e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "AnnotationIntrospector returned key deserializer definition of type "
            java.lang.StringBuilder r10 = b.e.a.a.a.y(r10)
            java.lang.String r0 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            java.lang.String r10 = b.e.a.a.a.f(r1, r10, r0)
            r9.<init>(r10)
            throw r9
        L_0x0060:
            r1 = r2
        L_0x0061:
            if (r1 != 0) goto L_0x00b4
            b.j.a.c.i r1 = r10.a
            java.lang.Class<?> r1 = r1.f2152h
            java.lang.Class<b.j.a.b.g> r3 = b.j.a.b.g.class
            if (r1 != r3) goto L_0x0071
            b.j.a.c.b0.a0.o r1 = new b.j.a.c.b0.a0.o
            r1.<init>()
            goto L_0x00ae
        L_0x0071:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x0095
            java.util.Set r3 = java.util.Collections.EMPTY_SET
            java.lang.Class r4 = r3.getClass()
            if (r4 != r1) goto L_0x0087
            b.j.a.c.j0.i r1 = new b.j.a.c.j0.i
            r1.<init>(r3)
            goto L_0x00ae
        L_0x0087:
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            java.lang.Class r4 = r3.getClass()
            if (r4 != r1) goto L_0x00ad
            b.j.a.c.j0.i r1 = new b.j.a.c.j0.i
            r1.<init>(r3)
            goto L_0x00ae
        L_0x0095:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x00ad
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            java.lang.Class r3 = r3.getClass()
            if (r3 != r1) goto L_0x00ad
            b.j.a.c.j0.i r1 = new b.j.a.c.j0.i
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            r1.<init>(r3)
            goto L_0x00ae
        L_0x00ad:
            r1 = r2
        L_0x00ae:
            if (r1 != 0) goto L_0x00b4
            b.j.a.c.b0.x r1 = r8.h(r9, r10)
        L_0x00b4:
            b.j.a.c.a0.f r3 = r8.f1767h
            java.util.Objects.requireNonNull(r3)
            b.j.a.c.b0.y[] r3 = b.j.a.c.a0.f.f1605k
            int r4 = r3.length
            r5 = 1
            r6 = 0
            if (r4 <= 0) goto L_0x00c2
            r4 = r5
            goto L_0x00c3
        L_0x00c2:
            r4 = r6
        L_0x00c3:
            if (r4 == 0) goto L_0x00f4
            b.j.a.c.a0.f r4 = r8.f1767h
            b.j.a.c.j0.d r7 = new b.j.a.c.j0.d
            java.util.Objects.requireNonNull(r4)
            r7.<init>(r3)
        L_0x00cf:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x00f4
            java.lang.Object r3 = r7.next()
            b.j.a.c.b0.y r3 = (b.j.a.c.b0.y) r3
            b.j.a.c.b0.x r1 = r3.a(r0, r10, r1)
            if (r1 == 0) goto L_0x00e2
            goto L_0x00cf
        L_0x00e2:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0[r6] = r1
            java.lang.String r1 = "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator"
            r9.V(r10, r1, r0)
            throw r2
        L_0x00f4:
            b.j.a.c.e0.l r9 = r1.D()
            if (r9 != 0) goto L_0x00fb
            return r1
        L_0x00fb:
            b.j.a.c.e0.l r9 = r1.D()
            b.j.a.c.e0.m r10 = r9.f1923j
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Argument #"
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            int r9 = r9.f1925l
            r1.append(r9)
            java.lang.String r9 = " of constructor "
            r1.append(r9)
            r1.append(r10)
            java.lang.String r9 = " has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.b.t(b.j.a.c.g, b.j.a.c.c):b.j.a.c.b0.x");
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.i u(b.j.a.c.g r6, b.j.a.c.e0.h r7, b.j.a.c.i r8) {
        /*
            r5 = this;
            b.j.a.c.b r0 = r6.x()
            if (r0 != 0) goto L_0x0007
            return r8
        L_0x0007:
            boolean r1 = r8.G()
            if (r1 == 0) goto L_0x0025
            b.j.a.c.i r1 = r8.n()
            if (r1 == 0) goto L_0x0025
            java.lang.Object r1 = r0.r(r7)
            b.j.a.c.o r1 = r6.Q(r7, r1)
            if (r1 == 0) goto L_0x0025
            b.j.a.c.i0.f r8 = (b.j.a.c.i0.f) r8
            b.j.a.c.i0.f r8 = r8.X(r1)
            b.j.a.c.i r1 = r8.f2163q
        L_0x0025:
            boolean r1 = r8.r()
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r0.c(r7)
            b.j.a.c.j r1 = r6.o(r7, r1)
            if (r1 == 0) goto L_0x0039
            b.j.a.c.i r8 = r8.N(r1)
        L_0x0039:
            b.j.a.c.f r1 = r6.f1993j
            b.j.a.c.b r2 = r1.e()
            b.j.a.c.f0.e r2 = r2.G(r1, r7, r8)
            b.j.a.c.i r3 = r8.k()
            if (r2 != 0) goto L_0x004e
            b.j.a.c.f0.c r1 = r5.b(r1, r3)
            goto L_0x0058
        L_0x004e:
            b.j.a.c.f0.b r4 = r1.f1611l
            java.util.Collection r4 = r4.c(r1, r7, r3)
            b.j.a.c.f0.c r1 = r2.f(r1, r3, r4)
        L_0x0058:
            if (r1 == 0) goto L_0x005e
            b.j.a.c.i r8 = r8.M(r1)
        L_0x005e:
            b.j.a.c.f r1 = r6.f1993j
            b.j.a.c.b r2 = r1.e()
            b.j.a.c.f0.e r2 = r2.M(r1, r7, r8)
            if (r2 != 0) goto L_0x006f
            b.j.a.c.f0.c r1 = r5.b(r1, r8)
            goto L_0x0079
        L_0x006f:
            b.j.a.c.f0.b r3 = r1.f1611l
            java.util.Collection r3 = r3.c(r1, r7, r8)
            b.j.a.c.f0.c r1 = r2.f(r1, r8, r3)
        L_0x0079:
            if (r1 == 0) goto L_0x007f
            b.j.a.c.i r8 = r8.Q(r1)
        L_0x007f:
            b.j.a.c.f r6 = r6.f1993j
            b.j.a.c.i r6 = r0.n0(r6, r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.b.u(b.j.a.c.g, b.j.a.c.e0.h, b.j.a.c.i):b.j.a.c.i");
    }
}
