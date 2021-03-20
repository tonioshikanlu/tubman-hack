package b.j.a.c.b0;

import b.j.a.c.c0.b;
import b.j.a.c.g;
import b.j.a.c.i;
import b.j.a.c.j;
import b.j.a.c.k;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class n implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final ConcurrentHashMap<i, j<Object>> f1786h = new ConcurrentHashMap<>(64, 0.75f, 4);

    /* renamed from: i  reason: collision with root package name */
    public final HashMap<i, j<Object>> f1787i = new HashMap<>(8);

    public j<Object> a(g gVar, o oVar, i iVar) {
        try {
            j<Object> b2 = b(gVar, oVar, iVar);
            if (b2 == null) {
                return null;
            }
            boolean z = !e(iVar) && b2.m();
            if (b2 instanceof s) {
                this.f1787i.put(iVar, b2);
                ((s) b2).b(gVar);
                this.f1787i.remove(iVar);
            }
            if (z) {
                this.f1786h.put(iVar, b2);
            }
            return b2;
        } catch (IllegalArgumentException e2) {
            throw new k((Closeable) gVar.f1996m, b.j.a.c.j0.g.i(e2), (Throwable) e2);
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.j<java.lang.Object> b(b.j.a.c.g r21, b.j.a.c.b0.o r22, b.j.a.c.i r23) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r0 = r22
            r3 = r23
            b.j.a.c.f r4 = r2.f1993j
            boolean r5 = r23.w()
            if (r5 != 0) goto L_0x001c
            boolean r5 = r23.G()
            if (r5 != 0) goto L_0x001c
            boolean r5 = r23.y()
            if (r5 == 0) goto L_0x001f
        L_0x001c:
            r0.c(r4, r3)
        L_0x001f:
            b.j.a.c.c r5 = r4.v(r3)
            r6 = r5
            b.j.a.c.e0.p r6 = (b.j.a.c.e0.p) r6
            b.j.a.c.e0.b r7 = r6.f1937e
            b.j.a.c.b r8 = r21.x()
            java.lang.Object r8 = r8.j(r7)
            r9 = 0
            if (r8 != 0) goto L_0x0035
            r8 = r9
            goto L_0x005a
        L_0x0035:
            b.j.a.c.j r8 = r2.o(r7, r8)
            b.j.a.c.b r10 = r21.x()
            java.lang.Object r10 = r10.i(r7)
            if (r10 != 0) goto L_0x0045
            r7 = r9
            goto L_0x0049
        L_0x0045:
            b.j.a.c.j0.j r7 = r2.f(r7, r10)
        L_0x0049:
            if (r7 != 0) goto L_0x004c
            goto L_0x005a
        L_0x004c:
            b.j.a.c.i0.n r10 = r21.h()
            b.j.a.c.i r10 = r7.b(r10)
            b.j.a.c.b0.a0.y r11 = new b.j.a.c.b0.a0.y
            r11.<init>(r7, r10, r8)
            r8 = r11
        L_0x005a:
            if (r8 == 0) goto L_0x005d
            return r8
        L_0x005d:
            b.j.a.c.e0.b r6 = r6.f1937e
            b.j.a.c.b r7 = r21.x()
            if (r7 != 0) goto L_0x0068
            r6 = r3
            goto L_0x00e2
        L_0x0068:
            boolean r8 = r23.G()
            if (r8 == 0) goto L_0x008e
            b.j.a.c.i r8 = r23.n()
            if (r8 == 0) goto L_0x008e
            java.lang.Object r8 = r8.f2154j
            if (r8 != 0) goto L_0x008e
            java.lang.Object r8 = r7.r(r6)
            if (r8 == 0) goto L_0x008e
            b.j.a.c.o r8 = r2.Q(r6, r8)
            if (r8 == 0) goto L_0x008e
            r10 = r3
            b.j.a.c.i0.f r10 = (b.j.a.c.i0.f) r10
            b.j.a.c.i0.f r8 = r10.X(r8)
            b.j.a.c.i r10 = r8.f2163q
            goto L_0x008f
        L_0x008e:
            r8 = r3
        L_0x008f:
            b.j.a.c.i r10 = r8.k()
            if (r10 == 0) goto L_0x00dc
            java.lang.Object r10 = r10.f2154j
            if (r10 != 0) goto L_0x00dc
            java.lang.Object r10 = r7.c(r6)
            if (r10 == 0) goto L_0x00dc
            boolean r11 = r10 instanceof b.j.a.c.j
            if (r11 == 0) goto L_0x00a6
            b.j.a.c.j r10 = (b.j.a.c.j) r10
            goto L_0x00be
        L_0x00a6:
            java.lang.Class<b.j.a.c.j$a> r11 = b.j.a.c.j.a.class
            boolean r12 = r10 instanceof java.lang.Class
            if (r12 == 0) goto L_0x00c6
            java.lang.Class r10 = (java.lang.Class) r10
            if (r10 == r11) goto L_0x00b6
            boolean r11 = b.j.a.c.j0.g.t(r10)
            if (r11 == 0) goto L_0x00b7
        L_0x00b6:
            r10 = r9
        L_0x00b7:
            if (r10 == 0) goto L_0x00be
            b.j.a.c.j r10 = r2.o(r6, r10)
            goto L_0x00bf
        L_0x00be:
            r10 = r9
        L_0x00bf:
            if (r10 == 0) goto L_0x00dc
            b.j.a.c.i r8 = r8.N(r10)
            goto L_0x00dc
        L_0x00c6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "AnnotationIntrospector."
            java.lang.String r3 = "findContentDeserializer"
            java.lang.String r4 = "() returned value of type "
            java.lang.StringBuilder r2 = b.e.a.a.a.C(r2, r3, r4)
            java.lang.String r3 = ": expected type JsonSerializer or Class<JsonSerializer> instead"
            java.lang.String r2 = b.e.a.a.a.f(r10, r2, r3)
            r0.<init>(r2)
            throw r0
        L_0x00dc:
            b.j.a.c.f r10 = r2.f1993j
            b.j.a.c.i r6 = r7.n0(r10, r6, r8)
        L_0x00e2:
            if (r6 == r3) goto L_0x00ea
            b.j.a.c.c r5 = r4.v(r6)
            r13 = r6
            goto L_0x00eb
        L_0x00ea:
            r13 = r3
        L_0x00eb:
            r3 = r5
            b.j.a.c.e0.p r3 = (b.j.a.c.e0.p) r3
            b.j.a.c.b r6 = r3.d
            if (r6 != 0) goto L_0x00f4
            r3 = r9
            goto L_0x00fa
        L_0x00f4:
            b.j.a.c.e0.b r3 = r3.f1937e
            java.lang.Class r3 = r6.B(r3)
        L_0x00fa:
            if (r3 == 0) goto L_0x02b1
            b.j.a.c.b0.f r0 = (b.j.a.c.b0.f) r0
            java.util.Objects.requireNonNull(r0)
            b.j.a.c.i r3 = r2.n(r3)
            b.j.a.c.f r15 = r2.f1993j
            b.j.a.c.a0.a r4 = r15.f1609i
            b.j.a.c.e0.s r4 = r4.f1586h
            b.j.a.c.e0.q r4 = (b.j.a.c.e0.q) r4
            b.j.a.c.e0.b r5 = r4.c(r15, r3, r15)
            boolean r6 = r15.n()
            if (r6 == 0) goto L_0x011c
            b.j.a.c.b r6 = r15.e()
            goto L_0x011d
        L_0x011c:
            r6 = r9
        L_0x011d:
            if (r6 != 0) goto L_0x0121
            r6 = r9
            goto L_0x0125
        L_0x0121:
            b.j.a.c.z.e$a r6 = r6.D(r5)
        L_0x0125:
            if (r6 != 0) goto L_0x012a
            java.lang.String r6 = "with"
            goto L_0x012c
        L_0x012a:
            java.lang.String r6 = r6.f2330b
        L_0x012c:
            r19 = r6
            b.j.a.c.e0.z r6 = new b.j.a.c.e0.z
            r16 = 0
            r14 = r6
            r17 = r3
            r18 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            b.j.a.c.e0.p r5 = new b.j.a.c.e0.p
            r5.<init>(r6)
            b.j.a.c.j0.m<b.j.a.c.i, b.j.a.c.e0.p> r4 = r4.f1945h
            r4.c(r3, r5)
            b.j.a.c.b0.x r3 = r0.t(r2, r5)     // Catch:{ NoClassDefFoundError -> 0x02a8, IllegalArgumentException -> 0x029a }
            b.j.a.c.f r4 = r2.f1993j
            b.j.a.c.b0.e r11 = new b.j.a.c.b0.e
            r11.<init>(r5, r2)
            r11.f1779h = r3
            r0.w(r2, r5, r11)
            r0.y(r2, r5, r11)
            r0.v(r2, r5, r11)
            r0.x(r5, r11)
            b.j.a.c.b r2 = r5.d
            if (r2 != 0) goto L_0x0163
            r2 = r9
            goto L_0x0169
        L_0x0163:
            b.j.a.c.e0.b r3 = r5.f1937e
            b.j.a.c.z.e$a r2 = r2.D(r3)
        L_0x0169:
            if (r2 != 0) goto L_0x016e
            java.lang.String r2 = "build"
            goto L_0x0170
        L_0x016e:
            java.lang.String r2 = r2.a
        L_0x0170:
            b.j.a.c.e0.i r3 = r5.d(r2, r9)
            if (r3 == 0) goto L_0x0187
            boolean r5 = r4.b()
            if (r5 == 0) goto L_0x0187
            java.lang.reflect.Method r5 = r3.f1913k
            b.j.a.c.p r6 = b.j.a.c.p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r4 = r4.o(r6)
            b.j.a.c.j0.g.e(r5, r4)
        L_0x0187:
            r11.f1783l = r3
            b.j.a.c.a0.f r3 = r0.f1767h
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x01a9
            b.j.a.c.a0.f r3 = r0.f1767h
            java.lang.Iterable r3 = r3.a()
            b.j.a.c.j0.d r3 = (b.j.a.c.j0.d) r3
        L_0x0199:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01a9
            java.lang.Object r4 = r3.next()
            b.j.a.c.b0.g r4 = (b.j.a.c.b0.g) r4
            java.util.Objects.requireNonNull(r4)
            goto L_0x0199
        L_0x01a9:
            b.j.a.c.e0.i r3 = r11.f1783l
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 != 0) goto L_0x01d3
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x01b7
            goto L_0x0211
        L_0x01b7:
            b.j.a.c.g r0 = r11.f1776b
            b.j.a.c.c r3 = r11.c
            b.j.a.c.i r3 = r3.a
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Class<?> r7 = r3.f2152h
            java.lang.String r7 = r7.getName()
            r5[r4] = r7
            r5[r6] = r2
            java.lang.String r2 = "Builder class %s does not have build method (name: '%s')"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            r0.l(r3, r2)
            throw r9
        L_0x01d3:
            java.lang.Class r2 = r3.w()
            java.lang.Class<?> r3 = r13.f2152h
            if (r2 == r3) goto L_0x0211
            boolean r7 = r2.isAssignableFrom(r3)
            if (r7 != 0) goto L_0x0211
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x01e8
            goto L_0x0211
        L_0x01e8:
            b.j.a.c.g r0 = r11.f1776b
            b.j.a.c.c r3 = r11.c
            b.j.a.c.i r3 = r3.a
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            b.j.a.c.e0.i r8 = r11.f1783l
            java.lang.String r8 = r8.i()
            r7[r4] = r8
            java.lang.String r2 = r2.getName()
            r7[r6] = r2
            java.lang.Class<?> r2 = r13.f2152h
            java.lang.String r2 = r2.getName()
            r7[r5] = r2
            java.lang.String r2 = "Build method '%s' has wrong return type (%s), not compatible with POJO type (%s)"
            java.lang.String r2 = java.lang.String.format(r2, r7)
            r0.l(r3, r2)
            throw r9
        L_0x0211:
            java.util.Map<java.lang.String, b.j.a.c.b0.u> r2 = r11.d
            java.util.Collection r2 = r2.values()
            r11.b(r2)
            b.j.a.c.f r3 = r11.a
            b.j.a.c.p r4 = b.j.a.c.p.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            boolean r3 = r3.o(r4)
            java.util.Map r4 = r11.a(r2)
            b.j.a.c.b0.z.c r5 = new b.j.a.c.b0.z.c
            r5.<init>(r3, r2, r4)
            r5.n()
            b.j.a.c.f r3 = r11.a
            b.j.a.c.p r4 = b.j.a.c.p.DEFAULT_VIEW_INCLUSION
            boolean r3 = r3.o(r4)
            r3 = r3 ^ r6
            if (r3 != 0) goto L_0x0252
            java.util.Iterator r2 = r2.iterator()
        L_0x023d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0252
            java.lang.Object r4 = r2.next()
            b.j.a.c.b0.u r4 = (b.j.a.c.b0.u) r4
            boolean r4 = r4.y()
            if (r4 == 0) goto L_0x023d
            r18 = r6
            goto L_0x0254
        L_0x0252:
            r18 = r3
        L_0x0254:
            b.j.a.c.b0.z.r r2 = r11.f1780i
            if (r2 == 0) goto L_0x0267
            b.j.a.c.b0.z.t r2 = new b.j.a.c.b0.z.t
            b.j.a.c.b0.z.r r3 = r11.f1780i
            b.j.a.c.s r4 = b.j.a.c.s.f2292o
            r2.<init>((b.j.a.c.b0.z.r) r3, (b.j.a.c.s) r4)
            b.j.a.c.b0.z.c r2 = r5.H(r2)
            r14 = r2
            goto L_0x0268
        L_0x0267:
            r14 = r5
        L_0x0268:
            b.j.a.c.b0.h r2 = new b.j.a.c.b0.h
            b.j.a.c.c r12 = r11.c
            java.util.HashMap<java.lang.String, b.j.a.c.b0.u> r15 = r11.f
            java.util.HashSet<java.lang.String> r3 = r11.f1778g
            boolean r4 = r11.f1782k
            r10 = r2
            r16 = r3
            r17 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            b.j.a.c.a0.f r3 = r0.f1767h
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x02b0
            b.j.a.c.a0.f r0 = r0.f1767h
            java.lang.Iterable r0 = r0.a()
            b.j.a.c.j0.d r0 = (b.j.a.c.j0.d) r0
        L_0x028a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02b0
            java.lang.Object r3 = r0.next()
            b.j.a.c.b0.g r3 = (b.j.a.c.b0.g) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x028a
        L_0x029a:
            r0 = move-exception
            r3 = r0
            b.j.a.b.i r0 = r2.f1996m
            java.lang.String r2 = b.j.a.c.j0.g.i(r3)
            b.j.a.c.c0.b r3 = new b.j.a.c.c0.b
            r3.<init>((b.j.a.b.i) r0, (java.lang.String) r2, (b.j.a.c.c) r5, (b.j.a.c.e0.r) r9)
            throw r3
        L_0x02a8:
            r0 = move-exception
            r2 = r0
            b.j.a.c.b0.z.f r0 = new b.j.a.c.b0.z.f
            r0.<init>(r2)
            r2 = r0
        L_0x02b0:
            return r2
        L_0x02b1:
            r3 = r5
            b.j.a.c.e0.p r3 = (b.j.a.c.e0.p) r3
            b.j.a.c.b r6 = r3.d
            if (r6 != 0) goto L_0x02b9
            goto L_0x02c3
        L_0x02b9:
            b.j.a.c.e0.b r7 = r3.f1937e
            java.lang.Object r6 = r6.i(r7)
            b.j.a.c.j0.j r9 = r3.g(r6)
        L_0x02c3:
            if (r9 != 0) goto L_0x02ca
            b.j.a.c.j r0 = r1.c(r2, r0, r13, r5)
            return r0
        L_0x02ca:
            b.j.a.c.i0.n r3 = r21.h()
            b.j.a.c.i r3 = r9.b(r3)
            java.lang.Class<?> r6 = r13.f2152h
            boolean r6 = r3.v(r6)
            if (r6 != 0) goto L_0x02de
            b.j.a.c.c r5 = r4.v(r3)
        L_0x02de:
            b.j.a.c.b0.a0.y r4 = new b.j.a.c.b0.a0.y
            b.j.a.c.j r0 = r1.c(r2, r0, r3, r5)
            r4.<init>(r9, r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.n.b(b.j.a.c.g, b.j.a.c.b0.o, b.j.a.c.i):b.j.a.c.j");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: b.j.a.c.j<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: b.j.a.c.b0.a0.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: b.j.a.c.b0.a0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: b.j.a.c.b0.a0.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: b.j.a.c.b0.a0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: b.j.a.c.b0.a0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: b.j.a.c.b0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: b.j.a.c.b0.a0.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: b.j.a.c.b0.a0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: b.j.a.c.b0.a0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: b.j.a.c.b0.a0.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: b.j.a.c.b0.a0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: b.j.a.c.b0.a0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: b.j.a.c.b0.a0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: b.j.a.c.b0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v89, resolved type: b.j.a.c.b0.a0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v98, resolved type: b.j.a.c.b0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v99, resolved type: b.j.a.c.b0.a0.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: b.j.a.c.b0.a0.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v100, resolved type: b.j.a.c.b0.a0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: b.j.a.c.b0.a0.u} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v2, types: [b.j.a.c.j<?>] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5, types: [b.j.a.c.b0.x] */
    /* JADX WARNING: type inference failed for: r10v7, types: [b.j.a.c.j<?>] */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r10v9, types: [b.j.a.c.j<?>] */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r1v49 */
    /* JADX WARNING: type inference failed for: r10v11, types: [java.util.Set<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r2v52, types: [b.j.a.c.i] */
    /* JADX WARNING: type inference failed for: r1v72, types: [b.j.a.c.j] */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: type inference failed for: r10v16 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r1v97 */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x028e, code lost:
        if (r1 == null) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0752, code lost:
        if (r6 == null) goto L_0x0757;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x089e, code lost:
        if (r6.endsWith("DataSource") != false) goto L_0x08a5;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0718  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0818 A[LOOP:17: B:451:0x0812->B:453:0x0818, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0826  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0851  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x08af  */
    /* JADX WARNING: Removed duplicated region for block: B:550:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.j<?> c(b.j.a.c.g r22, b.j.a.c.b0.o r23, b.j.a.c.i r24, b.j.a.c.c r25) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r8 = r25
            b.j.a.a.k$c r3 = b.j.a.a.k.c.OBJECT
            java.lang.Class r6 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            b.j.a.c.f r4 = r0.f1993j
            boolean r5 = r24.B()
            r9 = 0
            if (r5 == 0) goto L_0x00cd
            b.j.a.c.b0.b r1 = (b.j.a.c.b0.b) r1
            java.util.Objects.requireNonNull(r1)
            b.j.a.c.f r3 = r0.f1993j
            java.lang.Class<?> r2 = r2.f2152h
            b.j.a.c.j r4 = r1.i(r2, r3, r8)
            if (r4 != 0) goto L_0x00ac
            b.j.a.c.b0.x r14 = r1.h(r0, r8)
            r5 = r14
            b.j.a.c.b0.a0.d0 r5 = (b.j.a.c.b0.a0.d0) r5
            b.j.a.c.b0.u[] r15 = r5.f1649l
            java.util.List r5 = r25.f()
            java.util.Iterator r5 = r5.iterator()
        L_0x0037:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r5.next()
            r12 = r6
            b.j.a.c.e0.i r12 = (b.j.a.c.e0.i) r12
            boolean r6 = r1.l(r0, r12)
            if (r6 == 0) goto L_0x0037
            int r6 = r12.t()
            if (r6 != 0) goto L_0x006a
            int r0 = b.j.a.c.b0.a0.i.f1677p
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x0063
            java.lang.reflect.Method r0 = r12.f1913k
            b.j.a.c.p r4 = b.j.a.c.p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r4 = r3.o(r4)
            b.j.a.c.j0.g.e(r0, r4)
        L_0x0063:
            b.j.a.c.b0.a0.l r0 = new b.j.a.c.b0.a0.l
            r0.<init>((java.lang.Class<?>) r2, (b.j.a.c.e0.i) r12)
        L_0x0068:
            r4 = r0
            goto L_0x0093
        L_0x006a:
            java.lang.Class r6 = r12.w()
            boolean r6 = r6.isAssignableFrom(r2)
            if (r6 == 0) goto L_0x0037
            int r0 = b.j.a.c.b0.a0.i.f1677p
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x0087
            java.lang.reflect.Method r0 = r12.f1913k
            b.j.a.c.p r4 = b.j.a.c.p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r4 = r3.o(r4)
            b.j.a.c.j0.g.e(r0, r4)
        L_0x0087:
            b.j.a.c.b0.a0.l r0 = new b.j.a.c.b0.a0.l
            b.j.a.c.i r13 = r12.u(r9)
            r10 = r0
            r11 = r2
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0068
        L_0x0093:
            if (r4 != 0) goto L_0x00ac
            b.j.a.c.b0.a0.i r4 = new b.j.a.c.b0.a0.i
            b.j.a.c.e0.h r0 = r25.c()
            b.j.a.c.j0.k r0 = r1.o(r2, r3, r0)
            b.j.a.c.p r2 = b.j.a.c.p.ACCEPT_CASE_INSENSITIVE_ENUMS
            boolean r2 = r3.o(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4.<init>((b.j.a.c.j0.k) r0, (java.lang.Boolean) r2)
        L_0x00ac:
            b.j.a.c.a0.f r0 = r1.f1767h
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00cc
            b.j.a.c.a0.f r0 = r1.f1767h
            java.lang.Iterable r0 = r0.a()
            b.j.a.c.j0.d r0 = (b.j.a.c.j0.d) r0
        L_0x00bc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r1 = r0.next()
            b.j.a.c.b0.g r1 = (b.j.a.c.b0.g) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x00bc
        L_0x00cc:
            return r4
        L_0x00cd:
            boolean r5 = r24.A()
            r10 = 0
            if (r5 == 0) goto L_0x0414
            boolean r5 = r24.x()
            if (r5 == 0) goto L_0x01a4
            r9 = r2
            b.j.a.c.i0.a r9 = (b.j.a.c.i0.a) r9
            r11 = r1
            b.j.a.c.b0.b r11 = (b.j.a.c.b0.b) r11
            java.util.Objects.requireNonNull(r11)
            b.j.a.c.f r12 = r0.f1993j
            b.j.a.c.i r13 = r9.f2157q
            java.lang.Object r0 = r13.f2154j
            r14 = r0
            b.j.a.c.j r14 = (b.j.a.c.j) r14
            java.lang.Object r0 = r13.f2155k
            b.j.a.c.f0.c r0 = (b.j.a.c.f0.c) r0
            if (r0 != 0) goto L_0x00f6
            b.j.a.c.f0.c r0 = r11.b(r12, r13)
        L_0x00f6:
            r15 = r0
            b.j.a.c.a0.f r0 = r11.f1767h
            java.lang.Iterable r0 = r0.b()
            r16 = r0
            b.j.a.c.j0.d r16 = (b.j.a.c.j0.d) r16
        L_0x0101:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x011a
            java.lang.Object r0 = r16.next()
            b.j.a.c.b0.p r0 = (b.j.a.c.b0.p) r0
            r1 = r9
            r2 = r12
            r3 = r25
            r4 = r15
            r5 = r14
            b.j.a.c.j r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0101
            r10 = r0
        L_0x011a:
            if (r10 != 0) goto L_0x0182
            if (r14 != 0) goto L_0x017d
            java.lang.Class<?> r0 = r13.f2152h
            boolean r1 = r13.H()
            if (r1 == 0) goto L_0x0178
            int r1 = b.j.a.c.b0.a0.v.f1746n
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L_0x0130
            b.j.a.c.b0.a0.v$f r0 = b.j.a.c.b0.a0.v.f.f1750o
            goto L_0x01a3
        L_0x0130:
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L_0x0138
            b.j.a.c.b0.a0.v$g r0 = b.j.a.c.b0.a0.v.g.f1751o
            goto L_0x01a3
        L_0x0138:
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L_0x0142
            b.j.a.c.b0.a0.v$b r0 = new b.j.a.c.b0.a0.v$b
            r0.<init>()
            goto L_0x01a3
        L_0x0142:
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto L_0x014c
            b.j.a.c.b0.a0.v$h r0 = new b.j.a.c.b0.a0.v$h
            r0.<init>()
            goto L_0x01a3
        L_0x014c:
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L_0x0156
            b.j.a.c.b0.a0.v$e r0 = new b.j.a.c.b0.a0.v$e
            r0.<init>()
            goto L_0x01a3
        L_0x0156:
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L_0x0160
            b.j.a.c.b0.a0.v$d r0 = new b.j.a.c.b0.a0.v$d
            r0.<init>()
            goto L_0x01a3
        L_0x0160:
            if (r0 != r6) goto L_0x0168
            b.j.a.c.b0.a0.v$a r0 = new b.j.a.c.b0.a0.v$a
            r0.<init>()
            goto L_0x01a3
        L_0x0168:
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L_0x0172
            b.j.a.c.b0.a0.v$c r0 = new b.j.a.c.b0.a0.v$c
            r0.<init>()
            goto L_0x01a3
        L_0x0172:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0178:
            if (r0 != r7) goto L_0x017d
            b.j.a.c.b0.a0.e0 r0 = b.j.a.c.b0.a0.e0.f1656p
            goto L_0x01a3
        L_0x017d:
            b.j.a.c.b0.a0.u r10 = new b.j.a.c.b0.a0.u
            r10.<init>(r9, r14, r15)
        L_0x0182:
            b.j.a.c.a0.f r0 = r11.f1767h
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x01a2
            b.j.a.c.a0.f r0 = r11.f1767h
            java.lang.Iterable r0 = r0.a()
            b.j.a.c.j0.d r0 = (b.j.a.c.j0.d) r0
        L_0x0192:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01a2
            java.lang.Object r1 = r0.next()
            b.j.a.c.b0.g r1 = (b.j.a.c.b0.g) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x0192
        L_0x01a2:
            r0 = r10
        L_0x01a3:
            return r0
        L_0x01a4:
            boolean r5 = r24.G()
            if (r5 == 0) goto L_0x0391
            b.j.a.a.k$d r5 = r8.b(r10)
            if (r5 == 0) goto L_0x01b4
            b.j.a.a.k$c r5 = r5.f1327i
            if (r5 == r3) goto L_0x0391
        L_0x01b4:
            r7 = r2
            b.j.a.c.i0.f r7 = (b.j.a.c.i0.f) r7
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Class<?> r3 = r7.f2152h
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x032a
            r9 = r7
            b.j.a.c.i0.g r9 = (b.j.a.c.i0.g) r9
            r15 = r1
            b.j.a.c.b0.b r15 = (b.j.a.c.b0.b) r15
            java.util.Objects.requireNonNull(r15)
            b.j.a.c.f r14 = r0.f1993j
            b.j.a.c.i r11 = r9.f2163q
            b.j.a.c.i r1 = r9.r
            java.lang.Object r2 = r1.f2154j
            r18 = r2
            b.j.a.c.j r18 = (b.j.a.c.j) r18
            java.lang.Object r2 = r11.f2154j
            r19 = r2
            b.j.a.c.o r19 = (b.j.a.c.o) r19
            java.lang.Object r2 = r1.f2155k
            b.j.a.c.f0.c r2 = (b.j.a.c.f0.c) r2
            if (r2 != 0) goto L_0x01e9
            b.j.a.c.f0.c r1 = r15.b(r14, r1)
            r20 = r1
            goto L_0x01eb
        L_0x01e9:
            r20 = r2
        L_0x01eb:
            b.j.a.c.a0.f r1 = r15.f1767h
            java.lang.Iterable r1 = r1.b()
            r12 = r1
            b.j.a.c.j0.d r12 = (b.j.a.c.j0.d) r12
        L_0x01f4:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0211
            java.lang.Object r1 = r12.next()
            b.j.a.c.b0.p r1 = (b.j.a.c.b0.p) r1
            r2 = r9
            r3 = r14
            r4 = r25
            r5 = r19
            r6 = r20
            r7 = r18
            b.j.a.c.j r1 = r1.i(r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x01f4
            goto L_0x0212
        L_0x0211:
            r1 = r10
        L_0x0212:
            if (r1 != 0) goto L_0x0308
            java.lang.Class<?> r2 = r9.f2152h
            java.lang.Class<java.util.EnumMap> r3 = java.util.EnumMap.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x024d
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            if (r2 != r1) goto L_0x0224
            r13 = r10
            goto L_0x0229
        L_0x0224:
            b.j.a.c.b0.x r1 = r15.t(r0, r8)
            r13 = r1
        L_0x0229:
            java.lang.Class<?> r1 = r11.f2152h
            if (r1 == 0) goto L_0x0245
            boolean r1 = r1.isEnum()
            if (r1 == 0) goto L_0x0245
            b.j.a.c.b0.a0.j r1 = new b.j.a.c.b0.a0.j
            r3 = 0
            r17 = 0
            r11 = r1
            r12 = r9
            r7 = r14
            r14 = r3
            r6 = r15
            r15 = r18
            r16 = r20
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x024f
        L_0x0245:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot construct EnumMap; generic (key) type not available"
            r0.<init>(r1)
            throw r0
        L_0x024d:
            r7 = r14
            r6 = r15
        L_0x024f:
            if (r1 != 0) goto L_0x0306
            boolean r3 = r9.E()
            if (r3 != 0) goto L_0x0292
            boolean r3 = r9.w()
            if (r3 == 0) goto L_0x025e
            goto L_0x0292
        L_0x025e:
            java.lang.Class<?> r1 = b.j.a.c.b0.z.k.d
            boolean r1 = r9.v(r1)
            if (r1 == 0) goto L_0x0273
            r1 = 3
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            b.j.a.c.b0.z.k$b r3 = new b.j.a.c.b0.z.k$b
            b.j.a.c.i r2 = r9.i(r2)
            r3.<init>(r1, r2, r10)
            goto L_0x0287
        L_0x0273:
            java.lang.Class<?> r1 = b.j.a.c.b0.z.k.f1834g
            boolean r1 = r9.v(r1)
            if (r1 == 0) goto L_0x028d
            r1 = 6
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            b.j.a.c.b0.z.k$b r3 = new b.j.a.c.b0.z.k$b
            b.j.a.c.i r2 = r9.i(r2)
            r3.<init>(r1, r2, r10)
        L_0x0287:
            b.j.a.c.b0.a0.y r1 = new b.j.a.c.b0.a0.y
            r1.<init>(r3)
            goto L_0x028e
        L_0x028d:
            r1 = r10
        L_0x028e:
            if (r1 == 0) goto L_0x02ba
            goto L_0x0329
        L_0x0292:
            java.util.HashMap<java.lang.String, java.lang.Class<? extends java.util.Map>> r3 = b.j.a.c.b0.b.f1765l
            java.lang.String r2 = r2.getName()
            java.lang.Object r2 = r3.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 == 0) goto L_0x02b1
            b.j.a.c.a0.a r3 = r7.f1609i
            b.j.a.c.i0.n r3 = r3.f1589k
            b.j.a.c.i r2 = r3.k(r9, r2)
            r9 = r2
            b.j.a.c.i0.g r9 = (b.j.a.c.i0.g) r9
            b.j.a.c.c r2 = r7.w(r9)
        L_0x02af:
            r4 = r9
            goto L_0x02bc
        L_0x02b1:
            java.lang.Object r1 = r9.f2155k
            if (r1 == 0) goto L_0x02ef
            b.j.a.c.b0.a r1 = new b.j.a.c.b0.a
            r1.<init>(r8)
        L_0x02ba:
            r2 = r8
            goto L_0x02af
        L_0x02bc:
            if (r1 != 0) goto L_0x0306
            b.j.a.c.b0.x r5 = r6.t(r0, r2)
            b.j.a.c.b0.a0.q r1 = new b.j.a.c.b0.a0.q
            r3 = r1
            r0 = r6
            r6 = r19
            r9 = r7
            r7 = r18
            r8 = r20
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            b.j.a.c.e0.p r2 = (b.j.a.c.e0.p) r2
            b.j.a.c.e0.b r2 = r2.f1937e
            b.j.a.a.p$a r2 = r9.r(r3, r2)
            if (r2 != 0) goto L_0x02de
            r2 = r10
            goto L_0x02e2
        L_0x02de:
            java.util.Set r2 = r2.c()
        L_0x02e2:
            if (r2 == 0) goto L_0x02ec
            int r3 = r2.size()
            if (r3 != 0) goto L_0x02eb
            goto L_0x02ec
        L_0x02eb:
            r10 = r2
        L_0x02ec:
            r1.w = r10
            goto L_0x0309
        L_0x02ef:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find a deserializer for non-concrete Map type "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0306:
            r0 = r6
            goto L_0x0309
        L_0x0308:
            r0 = r15
        L_0x0309:
            b.j.a.c.a0.f r2 = r0.f1767h
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x0329
            b.j.a.c.a0.f r0 = r0.f1767h
            java.lang.Iterable r0 = r0.a()
            b.j.a.c.j0.d r0 = (b.j.a.c.j0.d) r0
        L_0x0319:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0329
            java.lang.Object r2 = r0.next()
            b.j.a.c.b0.g r2 = (b.j.a.c.b0.g) r2
            java.util.Objects.requireNonNull(r2)
            goto L_0x0319
        L_0x0329:
            return r1
        L_0x032a:
            r9 = r1
            b.j.a.c.b0.b r9 = (b.j.a.c.b0.b) r9
            java.util.Objects.requireNonNull(r9)
            b.j.a.c.i r1 = r7.f2163q
            b.j.a.c.i r2 = r7.r
            b.j.a.c.f r11 = r0.f1993j
            java.lang.Object r0 = r2.f2154j
            r12 = r0
            b.j.a.c.j r12 = (b.j.a.c.j) r12
            java.lang.Object r0 = r1.f2154j
            r13 = r0
            b.j.a.c.o r13 = (b.j.a.c.o) r13
            java.lang.Object r0 = r2.f2155k
            b.j.a.c.f0.c r0 = (b.j.a.c.f0.c) r0
            if (r0 != 0) goto L_0x034a
            b.j.a.c.f0.c r0 = r9.b(r11, r2)
        L_0x034a:
            r14 = r0
            b.j.a.c.a0.f r0 = r9.f1767h
            java.lang.Iterable r0 = r0.b()
            r15 = r0
            b.j.a.c.j0.d r15 = (b.j.a.c.j0.d) r15
        L_0x0354:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x036e
            java.lang.Object r0 = r15.next()
            b.j.a.c.b0.p r0 = (b.j.a.c.b0.p) r0
            r1 = r7
            r2 = r11
            r3 = r25
            r4 = r13
            r5 = r14
            r6 = r12
            b.j.a.c.j r0 = r0.c(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0354
            r10 = r0
        L_0x036e:
            if (r10 == 0) goto L_0x0390
            b.j.a.c.a0.f r0 = r9.f1767h
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0390
            b.j.a.c.a0.f r0 = r9.f1767h
            java.lang.Iterable r0 = r0.a()
            b.j.a.c.j0.d r0 = (b.j.a.c.j0.d) r0
        L_0x0380:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0390
            java.lang.Object r1 = r0.next()
            b.j.a.c.b0.g r1 = (b.j.a.c.b0.g) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x0380
        L_0x0390:
            return r10
        L_0x0391:
            boolean r5 = r24.y()
            if (r5 == 0) goto L_0x0414
            b.j.a.a.k$d r5 = r8.b(r10)
            if (r5 == 0) goto L_0x03a1
            b.j.a.a.k$c r5 = r5.f1327i
            if (r5 == r3) goto L_0x0414
        L_0x03a1:
            r6 = r2
            b.j.a.c.i0.d r6 = (b.j.a.c.i0.d) r6
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            java.lang.Class<?> r3 = r6.f2152h
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x03b5
            b.j.a.c.i0.e r6 = (b.j.a.c.i0.e) r6
            b.j.a.c.j r0 = r1.a(r0, r6, r8)
            return r0
        L_0x03b5:
            r7 = r1
            b.j.a.c.b0.b r7 = (b.j.a.c.b0.b) r7
            java.util.Objects.requireNonNull(r7)
            b.j.a.c.i r1 = r6.f2162q
            java.lang.Object r2 = r1.f2154j
            r9 = r2
            b.j.a.c.j r9 = (b.j.a.c.j) r9
            b.j.a.c.f r11 = r0.f1993j
            java.lang.Object r0 = r1.f2155k
            b.j.a.c.f0.c r0 = (b.j.a.c.f0.c) r0
            if (r0 != 0) goto L_0x03ce
            b.j.a.c.f0.c r0 = r7.b(r11, r1)
        L_0x03ce:
            r12 = r0
            b.j.a.c.a0.f r0 = r7.f1767h
            java.lang.Iterable r0 = r0.b()
            r13 = r0
            b.j.a.c.j0.d r13 = (b.j.a.c.j0.d) r13
        L_0x03d8:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x03f1
            java.lang.Object r0 = r13.next()
            b.j.a.c.b0.p r0 = (b.j.a.c.b0.p) r0
            r1 = r6
            r2 = r11
            r3 = r25
            r4 = r12
            r5 = r9
            b.j.a.c.j r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x03d8
            r10 = r0
        L_0x03f1:
            if (r10 == 0) goto L_0x0413
            b.j.a.c.a0.f r0 = r7.f1767h
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0413
            b.j.a.c.a0.f r0 = r7.f1767h
            java.lang.Iterable r0 = r0.a()
            b.j.a.c.j0.d r0 = (b.j.a.c.j0.d) r0
        L_0x0403:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0413
            java.lang.Object r1 = r0.next()
            b.j.a.c.b0.g r1 = (b.j.a.c.b0.g) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x0403
        L_0x0413:
            return r10
        L_0x0414:
            boolean r3 = r24.b()
            if (r3 == 0) goto L_0x0498
            r7 = r2
            b.j.a.c.i0.i r7 = (b.j.a.c.i0.i) r7
            r9 = r1
            b.j.a.c.b0.b r9 = (b.j.a.c.b0.b) r9
            java.util.Objects.requireNonNull(r9)
            b.j.a.c.i r1 = r7.f2165q
            java.lang.Object r2 = r1.f2154j
            r11 = r2
            b.j.a.c.j r11 = (b.j.a.c.j) r11
            b.j.a.c.f r12 = r0.f1993j
            java.lang.Object r2 = r1.f2155k
            b.j.a.c.f0.c r2 = (b.j.a.c.f0.c) r2
            if (r2 != 0) goto L_0x0436
            b.j.a.c.f0.c r2 = r9.b(r12, r1)
        L_0x0436:
            r13 = r2
            b.j.a.c.a0.f r1 = r9.f1767h
            java.lang.Iterable r1 = r1.b()
            r14 = r1
            b.j.a.c.j0.d r14 = (b.j.a.c.j0.d) r14
        L_0x0440:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0459
            java.lang.Object r1 = r14.next()
            b.j.a.c.b0.p r1 = (b.j.a.c.b0.p) r1
            r2 = r7
            r3 = r12
            r4 = r25
            r5 = r13
            r6 = r11
            b.j.a.c.j r1 = r1.b(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0440
            goto L_0x045a
        L_0x0459:
            r1 = r10
        L_0x045a:
            if (r1 != 0) goto L_0x0475
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r2 = java.util.concurrent.atomic.AtomicReference.class
            boolean r2 = r7.I(r2)
            if (r2 == 0) goto L_0x0475
            java.lang.Class<?> r1 = r7.f2152h
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r2 = java.util.concurrent.atomic.AtomicReference.class
            if (r1 != r2) goto L_0x046b
            goto L_0x046f
        L_0x046b:
            b.j.a.c.b0.x r10 = r9.t(r0, r8)
        L_0x046f:
            b.j.a.c.b0.a0.c r1 = new b.j.a.c.b0.a0.c
            r1.<init>(r7, r10, r13, r11)
            goto L_0x0497
        L_0x0475:
            if (r1 == 0) goto L_0x0497
            b.j.a.c.a0.f r0 = r9.f1767h
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0497
            b.j.a.c.a0.f r0 = r9.f1767h
            java.lang.Iterable r0 = r0.a()
            b.j.a.c.j0.d r0 = (b.j.a.c.j0.d) r0
        L_0x0487:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0497
            java.lang.Object r2 = r0.next()
            b.j.a.c.b0.g r2 = (b.j.a.c.b0.g) r2
            java.util.Objects.requireNonNull(r2)
            goto L_0x0487
        L_0x0497:
            return r1
        L_0x0498:
            java.lang.Class<b.j.a.c.l> r3 = b.j.a.c.l.class
            java.lang.Class<?> r5 = r2.f2152h
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L_0x04e1
            r0 = r1
            b.j.a.c.b0.b r0 = (b.j.a.c.b0.b) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<?> r1 = r2.f2152h
            b.j.a.c.a0.f r0 = r0.f1767h
            java.lang.Iterable r0 = r0.b()
            b.j.a.c.j0.d r0 = (b.j.a.c.j0.d) r0
        L_0x04b2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x04c5
            java.lang.Object r2 = r0.next()
            b.j.a.c.b0.p r2 = (b.j.a.c.b0.p) r2
            b.j.a.c.j r2 = r2.f(r1, r4, r8)
            if (r2 == 0) goto L_0x04b2
            r10 = r2
        L_0x04c5:
            if (r10 == 0) goto L_0x04c8
            goto L_0x04e0
        L_0x04c8:
            b.j.a.c.b0.a0.p r0 = b.j.a.c.b0.a0.p.f1709l
            java.lang.Class<b.j.a.c.g0.o> r0 = b.j.a.c.g0.o.class
            if (r1 != r0) goto L_0x04d4
            b.j.a.c.b0.a0.p$b r0 = b.j.a.c.b0.a0.p.b.f1711l
            b.j.a.c.b0.a0.p$b r0 = b.j.a.c.b0.a0.p.b.f1711l
        L_0x04d2:
            r10 = r0
            goto L_0x04e0
        L_0x04d4:
            java.lang.Class<b.j.a.c.g0.a> r0 = b.j.a.c.g0.a.class
            if (r1 != r0) goto L_0x04dd
            b.j.a.c.b0.a0.p$a r0 = b.j.a.c.b0.a0.p.a.f1710l
            b.j.a.c.b0.a0.p$a r0 = b.j.a.c.b0.a0.p.a.f1710l
            goto L_0x04d2
        L_0x04dd:
            b.j.a.c.b0.a0.p r0 = b.j.a.c.b0.a0.p.f1709l
            goto L_0x04d2
        L_0x04e0:
            return r10
        L_0x04e1:
            b.j.a.c.b0.f r1 = (b.j.a.c.b0.f) r1
            java.util.Objects.requireNonNull(r1)
            b.j.a.c.a[] r3 = b.j.a.c.a0.f.f1604j
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            b.j.a.c.f r5 = r0.f1993j
            b.j.a.c.a0.f r11 = r1.f1767h
            java.lang.Iterable r11 = r11.b()
            b.j.a.c.j0.d r11 = (b.j.a.c.j0.d) r11
        L_0x04f4:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0507
            java.lang.Object r12 = r11.next()
            b.j.a.c.b0.p r12 = (b.j.a.c.b0.p) r12
            b.j.a.c.j r12 = r12.e(r2, r5, r8)
            if (r12 == 0) goto L_0x04f4
            goto L_0x0508
        L_0x0507:
            r12 = r10
        L_0x0508:
            if (r12 == 0) goto L_0x050c
            goto L_0x08a4
        L_0x050c:
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.Class<?> r11 = r2.f2152h
            boolean r5 = r5.isAssignableFrom(r11)
            if (r5 == 0) goto L_0x05ad
            b.j.a.c.b0.e r2 = new b.j.a.c.b0.e
            r2.<init>(r8, r0)
            b.j.a.c.b0.x r3 = r1.t(r0, r8)
            r2.f1779h = r3
            r1.w(r0, r8, r2)
            java.lang.Class<?>[] r3 = b.j.a.c.b0.f.f1784n
            java.lang.String r4 = "initCause"
            b.j.a.c.e0.i r3 = r8.d(r4, r3)
            if (r3 == 0) goto L_0x0558
            b.j.a.c.f r4 = r0.f1993j
            b.j.a.c.t r13 = new b.j.a.c.t
            java.lang.String r5 = "cause"
            r13.<init>(r5)
            b.j.a.a.r$b r15 = b.j.a.c.e0.r.f1946h
            b.j.a.c.j0.x r5 = new b.j.a.c.j0.x
            b.j.a.c.b r11 = r4.e()
            r14 = 0
            r10 = r5
            r12 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            b.j.a.c.i r3 = r3.u(r9)
            b.j.a.c.b0.u r0 = r1.A(r0, r8, r5, r3)
            if (r0 == 0) goto L_0x0558
            java.util.Map<java.lang.String, b.j.a.c.b0.u> r3 = r2.d
            b.j.a.c.t r4 = r0.f1796k
            java.lang.String r4 = r4.f2305h
            r3.put(r4, r0)
        L_0x0558:
            java.lang.String r0 = "localizedMessage"
            r2.c(r0)
            java.lang.String r0 = "suppressed"
            r2.c(r0)
            b.j.a.c.a0.f r0 = r1.f1767h
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0582
            b.j.a.c.a0.f r0 = r1.f1767h
            java.lang.Iterable r0 = r0.a()
            b.j.a.c.j0.d r0 = (b.j.a.c.j0.d) r0
        L_0x0572:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0582
            java.lang.Object r3 = r0.next()
            b.j.a.c.b0.g r3 = (b.j.a.c.b0.g) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x0572
        L_0x0582:
            b.j.a.c.j r0 = r2.e()
            b.j.a.c.b0.a0.h0 r12 = new b.j.a.c.b0.a0.h0
            b.j.a.c.b0.c r0 = (b.j.a.c.b0.c) r0
            r12.<init>(r0)
            b.j.a.c.a0.f r0 = r1.f1767h
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x08a4
            b.j.a.c.a0.f r0 = r1.f1767h
            java.lang.Iterable r0 = r0.a()
            b.j.a.c.j0.d r0 = (b.j.a.c.j0.d) r0
        L_0x059d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x08a4
            java.lang.Object r1 = r0.next()
            b.j.a.c.b0.g r1 = (b.j.a.c.b0.g) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x059d
        L_0x05ad:
            boolean r5 = r24.w()
            if (r5 == 0) goto L_0x05d9
            boolean r5 = r24.H()
            if (r5 != 0) goto L_0x05d9
            boolean r5 = r24.B()
            if (r5 != 0) goto L_0x05d9
            b.j.a.c.a0.f r5 = r1.f1767h
            b.j.a.c.j0.d r11 = new b.j.a.c.j0.d
            java.util.Objects.requireNonNull(r5)
            r11.<init>(r3)
        L_0x05c9:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x05d9
            java.lang.Object r5 = r11.next()
            b.j.a.c.a r5 = (b.j.a.c.a) r5
            java.util.Objects.requireNonNull(r5)
            goto L_0x05c9
        L_0x05d9:
            java.lang.Class<?> r5 = r2.f2152h
            r11 = 1
            if (r5 != r4) goto L_0x0603
            b.j.a.c.f r5 = r0.f1993j
            b.j.a.c.a0.f r6 = r1.f1767h
            java.util.Objects.requireNonNull(r6)
            int r3 = r3.length
            if (r3 <= 0) goto L_0x05ea
            r3 = r11
            goto L_0x05eb
        L_0x05ea:
            r3 = r9
        L_0x05eb:
            if (r3 == 0) goto L_0x05fa
            java.lang.Class<java.util.List> r3 = java.util.List.class
            b.j.a.c.i r3 = r1.j(r5, r3)
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            b.j.a.c.i r5 = r1.j(r5, r6)
            goto L_0x05fc
        L_0x05fa:
            r3 = r10
            r5 = r3
        L_0x05fc:
            b.j.a.c.b0.a0.k0 r6 = new b.j.a.c.b0.a0.k0
            r6.<init>((b.j.a.c.i) r3, (b.j.a.c.i) r5)
            goto L_0x0754
        L_0x0603:
            if (r5 == r7) goto L_0x07fd
            java.lang.Class<?> r3 = b.j.a.c.b0.b.f1762i
            if (r5 != r3) goto L_0x060b
            goto L_0x07fd
        L_0x060b:
            java.lang.Class<?> r3 = b.j.a.c.b0.b.f1763j
            if (r5 != r3) goto L_0x0630
            b.j.a.c.i0.n r5 = r22.h()
            b.j.a.c.i[] r3 = r5.m(r2, r3)
            if (r3 == 0) goto L_0x0620
            int r6 = r3.length
            if (r6 == r11) goto L_0x061d
            goto L_0x0620
        L_0x061d:
            r3 = r3[r9]
            goto L_0x0624
        L_0x0620:
            b.j.a.c.i r3 = b.j.a.c.i0.n.o()
        L_0x0624:
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            b.j.a.c.i0.e r3 = r5.g(r6, r3)
            b.j.a.c.j r3 = r1.a(r0, r3, r8)
            goto L_0x07ff
        L_0x0630:
            java.lang.Class<?> r3 = b.j.a.c.b0.b.f1764k
            if (r5 != r3) goto L_0x0658
            b.j.a.c.i r3 = r2.h(r9)
            b.j.a.c.i r5 = r2.h(r11)
            java.lang.Object r6 = r5.f2155k
            b.j.a.c.f0.c r6 = (b.j.a.c.f0.c) r6
            if (r6 != 0) goto L_0x0648
            b.j.a.c.f r6 = r0.f1993j
            b.j.a.c.f0.c r6 = r1.b(r6, r5)
        L_0x0648:
            java.lang.Object r5 = r5.f2154j
            b.j.a.c.j r5 = (b.j.a.c.j) r5
            java.lang.Object r3 = r3.f2154j
            b.j.a.c.o r3 = (b.j.a.c.o) r3
            b.j.a.c.b0.a0.r r7 = new b.j.a.c.b0.a0.r
            r7.<init>((b.j.a.c.i) r2, (b.j.a.c.o) r3, (b.j.a.c.j<java.lang.Object>) r5, (b.j.a.c.f0.c) r6)
            r12 = r7
            goto L_0x0800
        L_0x0658:
            java.lang.String r3 = r5.getName()
            boolean r7 = r5.isPrimitive()
            if (r7 != 0) goto L_0x066a
            java.lang.String r7 = "java."
            boolean r7 = r3.startsWith(r7)
            if (r7 == 0) goto L_0x0757
        L_0x066a:
            java.util.HashSet<java.lang.String> r7 = b.j.a.c.b0.a0.t.a
            boolean r7 = r5.isPrimitive()
            if (r7 == 0) goto L_0x06b0
            java.lang.Class r7 = java.lang.Integer.TYPE
            if (r5 != r7) goto L_0x067a
            b.j.a.c.b0.a0.t$h r6 = b.j.a.c.b0.a0.t.h.f1733n
            goto L_0x0716
        L_0x067a:
            if (r5 != r6) goto L_0x0680
            b.j.a.c.b0.a0.t$c r6 = b.j.a.c.b0.a0.t.c.f1723n
            goto L_0x0716
        L_0x0680:
            java.lang.Class r6 = java.lang.Long.TYPE
            if (r5 != r6) goto L_0x0688
            b.j.a.c.b0.a0.t$i r6 = b.j.a.c.b0.a0.t.i.f1735n
            goto L_0x0716
        L_0x0688:
            java.lang.Class r6 = java.lang.Double.TYPE
            if (r5 != r6) goto L_0x0690
            b.j.a.c.b0.a0.t$f r6 = b.j.a.c.b0.a0.t.f.f1729n
            goto L_0x0716
        L_0x0690:
            java.lang.Class r6 = java.lang.Character.TYPE
            if (r5 != r6) goto L_0x0698
            b.j.a.c.b0.a0.t$e r6 = b.j.a.c.b0.a0.t.e.f1727n
            goto L_0x0716
        L_0x0698:
            java.lang.Class r6 = java.lang.Byte.TYPE
            if (r5 != r6) goto L_0x06a0
            b.j.a.c.b0.a0.t$d r6 = b.j.a.c.b0.a0.t.d.f1725n
            goto L_0x0716
        L_0x06a0:
            java.lang.Class r6 = java.lang.Short.TYPE
            if (r5 != r6) goto L_0x06a8
            b.j.a.c.b0.a0.t$l r6 = b.j.a.c.b0.a0.t.l.f1741n
            goto L_0x0716
        L_0x06a8:
            java.lang.Class r6 = java.lang.Float.TYPE
            if (r5 != r6) goto L_0x0705
            b.j.a.c.b0.a0.t$g r6 = b.j.a.c.b0.a0.t.g.f1731n
            goto L_0x0716
        L_0x06b0:
            java.util.HashSet<java.lang.String> r6 = b.j.a.c.b0.a0.t.a
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x0715
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            if (r5 != r6) goto L_0x06bf
            b.j.a.c.b0.a0.t$h r6 = b.j.a.c.b0.a0.t.h.f1734o
            goto L_0x0716
        L_0x06bf:
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            if (r5 != r6) goto L_0x06c6
            b.j.a.c.b0.a0.t$c r6 = b.j.a.c.b0.a0.t.c.f1724o
            goto L_0x0716
        L_0x06c6:
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            if (r5 != r6) goto L_0x06cd
            b.j.a.c.b0.a0.t$i r6 = b.j.a.c.b0.a0.t.i.f1736o
            goto L_0x0716
        L_0x06cd:
            java.lang.Class<java.lang.Double> r6 = java.lang.Double.class
            if (r5 != r6) goto L_0x06d4
            b.j.a.c.b0.a0.t$f r6 = b.j.a.c.b0.a0.t.f.f1730o
            goto L_0x0716
        L_0x06d4:
            java.lang.Class<java.lang.Character> r6 = java.lang.Character.class
            if (r5 != r6) goto L_0x06db
            b.j.a.c.b0.a0.t$e r6 = b.j.a.c.b0.a0.t.e.f1728o
            goto L_0x0716
        L_0x06db:
            java.lang.Class<java.lang.Byte> r6 = java.lang.Byte.class
            if (r5 != r6) goto L_0x06e2
            b.j.a.c.b0.a0.t$d r6 = b.j.a.c.b0.a0.t.d.f1726o
            goto L_0x0716
        L_0x06e2:
            java.lang.Class<java.lang.Short> r6 = java.lang.Short.class
            if (r5 != r6) goto L_0x06e9
            b.j.a.c.b0.a0.t$l r6 = b.j.a.c.b0.a0.t.l.f1742o
            goto L_0x0716
        L_0x06e9:
            java.lang.Class<java.lang.Float> r6 = java.lang.Float.class
            if (r5 != r6) goto L_0x06f0
            b.j.a.c.b0.a0.t$g r6 = b.j.a.c.b0.a0.t.g.f1732o
            goto L_0x0716
        L_0x06f0:
            java.lang.Class<java.lang.Number> r6 = java.lang.Number.class
            if (r5 != r6) goto L_0x06f7
            b.j.a.c.b0.a0.t$j r6 = b.j.a.c.b0.a0.t.j.f1737k
            goto L_0x0716
        L_0x06f7:
            java.lang.Class<java.math.BigDecimal> r6 = java.math.BigDecimal.class
            if (r5 != r6) goto L_0x06fe
            b.j.a.c.b0.a0.t$a r6 = b.j.a.c.b0.a0.t.a.f1721k
            goto L_0x0716
        L_0x06fe:
            java.lang.Class<java.math.BigInteger> r6 = java.math.BigInteger.class
            if (r5 != r6) goto L_0x0705
            b.j.a.c.b0.a0.t$b r6 = b.j.a.c.b0.a0.t.b.f1722k
            goto L_0x0716
        L_0x0705:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Internal error: can't find deserializer for "
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            java.lang.String r1 = b.e.a.a.a.d(r5, r1)
            r0.<init>(r1)
            throw r0
        L_0x0715:
            r6 = r10
        L_0x0716:
            if (r6 != 0) goto L_0x0752
            java.util.HashSet<java.lang.String> r6 = b.j.a.c.b0.a0.h.a
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x0751
            java.lang.Class<java.util.Calendar> r6 = java.util.Calendar.class
            if (r5 != r6) goto L_0x072a
            b.j.a.c.b0.a0.h$a r6 = new b.j.a.c.b0.a0.h$a
            r6.<init>()
            goto L_0x0752
        L_0x072a:
            java.lang.Class<java.util.Date> r6 = java.util.Date.class
            if (r5 != r6) goto L_0x0731
            b.j.a.c.b0.a0.h$c r6 = b.j.a.c.b0.a0.h.c.f1676m
            goto L_0x0752
        L_0x0731:
            java.lang.Class<java.sql.Date> r6 = java.sql.Date.class
            if (r5 != r6) goto L_0x073b
            b.j.a.c.b0.a0.h$d r6 = new b.j.a.c.b0.a0.h$d
            r6.<init>()
            goto L_0x0752
        L_0x073b:
            java.lang.Class<java.sql.Timestamp> r6 = java.sql.Timestamp.class
            if (r5 != r6) goto L_0x0745
            b.j.a.c.b0.a0.h$e r6 = new b.j.a.c.b0.a0.h$e
            r6.<init>()
            goto L_0x0752
        L_0x0745:
            java.lang.Class<java.util.GregorianCalendar> r6 = java.util.GregorianCalendar.class
            if (r5 != r6) goto L_0x0751
            b.j.a.c.b0.a0.h$a r6 = new b.j.a.c.b0.a0.h$a
            java.lang.Class<java.util.GregorianCalendar> r7 = java.util.GregorianCalendar.class
            r6.<init>(r7)
            goto L_0x0752
        L_0x0751:
            r6 = r10
        L_0x0752:
            if (r6 == 0) goto L_0x0757
        L_0x0754:
            r12 = r6
            goto L_0x0800
        L_0x0757:
            java.lang.Class<b.j.a.c.j0.z> r6 = b.j.a.c.j0.z.class
            if (r5 != r6) goto L_0x0762
            b.j.a.c.b0.a0.i0 r3 = new b.j.a.c.b0.a0.i0
            r3.<init>()
            goto L_0x07ff
        L_0x0762:
            b.j.a.c.d0.e r6 = b.j.a.c.d0.e.f1873k
            b.j.a.c.f r7 = r0.f1993j
            java.util.Objects.requireNonNull(r6)
            java.lang.Class<?> r12 = r2.f2152h
            b.j.a.c.d0.a r13 = b.j.a.c.d0.e.f1872j
            if (r13 == 0) goto L_0x0776
            b.j.a.c.j r13 = r13.c(r12)
            if (r13 == 0) goto L_0x0776
            goto L_0x07b9
        L_0x0776:
            java.lang.Class<?> r13 = b.j.a.c.d0.e.f1870h
            if (r13 == 0) goto L_0x0783
            boolean r13 = r13.isAssignableFrom(r12)
            if (r13 == 0) goto L_0x0783
            java.lang.String r7 = "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer"
            goto L_0x078f
        L_0x0783:
            java.lang.Class<?> r13 = b.j.a.c.d0.e.f1871i
            if (r13 == 0) goto L_0x0797
            boolean r13 = r13.isAssignableFrom(r12)
            if (r13 == 0) goto L_0x0797
            java.lang.String r7 = "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer"
        L_0x078f:
            java.lang.Object r6 = r6.b(r7)
            r13 = r6
            b.j.a.c.j r13 = (b.j.a.c.j) r13
            goto L_0x07b9
        L_0x0797:
            java.lang.String r13 = r12.getName()
            java.lang.String r14 = "javax.xml."
            boolean r13 = r13.startsWith(r14)
            if (r13 != 0) goto L_0x07a9
            boolean r12 = r6.a(r12, r14)
            if (r12 == 0) goto L_0x07b1
        L_0x07a9:
            java.lang.String r12 = "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers"
            java.lang.Object r6 = r6.b(r12)
            if (r6 != 0) goto L_0x07b3
        L_0x07b1:
            r13 = r10
            goto L_0x07b9
        L_0x07b3:
            b.j.a.c.b0.p r6 = (b.j.a.c.b0.p) r6
            b.j.a.c.j r13 = r6.e(r2, r7, r8)
        L_0x07b9:
            if (r13 == 0) goto L_0x07bd
            r12 = r13
            goto L_0x0800
        L_0x07bd:
            java.util.HashSet<java.lang.String> r6 = b.j.a.c.b0.a0.n.a
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L_0x07fb
            b.j.a.c.b0.a0.m$a r3 = b.j.a.c.b0.a0.m.f0(r5)
            if (r3 == 0) goto L_0x07cc
            goto L_0x07ff
        L_0x07cc:
            java.lang.Class<java.util.UUID> r3 = java.util.UUID.class
            if (r5 != r3) goto L_0x07d6
            b.j.a.c.b0.a0.j0 r3 = new b.j.a.c.b0.a0.j0
            r3.<init>()
            goto L_0x07ff
        L_0x07d6:
            java.lang.Class<java.lang.StackTraceElement> r3 = java.lang.StackTraceElement.class
            if (r5 != r3) goto L_0x07e0
            b.j.a.c.b0.a0.x r3 = new b.j.a.c.b0.a0.x
            r3.<init>()
            goto L_0x07ff
        L_0x07e0:
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r3 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r5 != r3) goto L_0x07ea
            b.j.a.c.b0.a0.b r3 = new b.j.a.c.b0.a0.b
            r3.<init>()
            goto L_0x07ff
        L_0x07ea:
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            if (r5 != r3) goto L_0x07f4
            b.j.a.c.b0.a0.e r3 = new b.j.a.c.b0.a0.e
            r3.<init>()
            goto L_0x07ff
        L_0x07f4:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            if (r5 != r3) goto L_0x07fb
            b.j.a.c.b0.a0.s r3 = b.j.a.c.b0.a0.s.f1720k
            goto L_0x07ff
        L_0x07fb:
            r12 = r10
            goto L_0x0800
        L_0x07fd:
            b.j.a.c.b0.a0.g0 r3 = b.j.a.c.b0.a0.g0.f1672k
        L_0x07ff:
            r12 = r3
        L_0x0800:
            if (r12 == 0) goto L_0x0822
            b.j.a.c.a0.f r3 = r1.f1767h
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x0822
            b.j.a.c.a0.f r3 = r1.f1767h
            java.lang.Iterable r3 = r3.a()
            b.j.a.c.j0.d r3 = (b.j.a.c.j0.d) r3
        L_0x0812:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0822
            java.lang.Object r5 = r3.next()
            b.j.a.c.b0.g r5 = (b.j.a.c.b0.g) r5
            java.util.Objects.requireNonNull(r5)
            goto L_0x0812
        L_0x0822:
            if (r12 == 0) goto L_0x0826
            goto L_0x08a4
        L_0x0826:
            java.lang.Class<?> r3 = r2.f2152h
            java.lang.String r5 = b.j.a.c.j0.g.d(r3)
            java.lang.String r6 = ") as a Bean"
            java.lang.String r7 = " (of type "
            java.lang.String r12 = "Cannot deserialize Class "
            if (r5 != 0) goto L_0x08df
            boolean r5 = b.j.a.c.j0.g.x(r3)
            if (r5 != 0) goto L_0x08cd
            boolean r5 = b.j.a.c.j0.g.w(r3)     // Catch:{ NullPointerException | SecurityException -> 0x084e }
            if (r5 != 0) goto L_0x0848
            java.lang.reflect.Method r5 = r3.getEnclosingMethod()     // Catch:{ NullPointerException | SecurityException -> 0x084e }
            if (r5 == 0) goto L_0x0848
            r5 = r11
            goto L_0x0849
        L_0x0848:
            r5 = r9
        L_0x0849:
            if (r5 == 0) goto L_0x084e
            java.lang.String r5 = "local/anonymous"
            goto L_0x084f
        L_0x084e:
            r5 = r10
        L_0x084f:
            if (r5 != 0) goto L_0x08af
            b.j.a.c.f0.g.n r3 = b.j.a.c.f0.g.n.c
            java.util.Objects.requireNonNull(r3)
            java.lang.Class<?> r5 = r2.f2152h
            java.lang.String r6 = r5.getName()
            java.util.Set<java.lang.String> r3 = r3.a
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L_0x08a5
            boolean r3 = r5.isInterface()
            if (r3 == 0) goto L_0x086b
            goto L_0x08a0
        L_0x086b:
            java.lang.String r3 = "org.springframework."
            boolean r3 = r6.startsWith(r3)
            if (r3 == 0) goto L_0x0890
        L_0x0873:
            if (r5 == 0) goto L_0x08a0
            if (r5 == r4) goto L_0x08a0
            java.lang.String r3 = r5.getSimpleName()
            java.lang.String r7 = "AbstractPointcutAdvisor"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x08a5
            java.lang.String r7 = "AbstractApplicationContext"
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L_0x08a5
            java.lang.Class r5 = r5.getSuperclass()
            goto L_0x0873
        L_0x0890:
            java.lang.String r3 = "com.mchange.v2.c3p0."
            boolean r3 = r6.startsWith(r3)
            if (r3 == 0) goto L_0x08a0
            java.lang.String r3 = "DataSource"
            boolean r3 = r6.endsWith(r3)
            if (r3 != 0) goto L_0x08a5
        L_0x08a0:
            b.j.a.c.j r12 = r1.z(r0, r2, r8)
        L_0x08a4:
            return r12
        L_0x08a5:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r9] = r6
            java.lang.String r2 = "Illegal type (%s) to deserialize: prevented for security reasons"
            r0.V(r8, r2, r1)
            throw r10
        L_0x08af:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r12)
            java.lang.String r2 = r3.getName()
            r1.append(r2)
            r1.append(r7)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x08cd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot deserialize Proxy class "
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            java.lang.String r2 = " as a Bean"
            java.lang.String r1 = b.e.a.a.a.e(r3, r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x08df:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r12)
            java.lang.String r2 = r3.getName()
            r1.append(r2)
            r1.append(r7)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.n.c(b.j.a.c.g, b.j.a.c.b0.o, b.j.a.c.i, b.j.a.c.c):b.j.a.c.j");
    }

    public j<Object> d(i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        } else if (e(iVar)) {
            return null;
        } else {
            return this.f1786h.get(iVar);
        }
    }

    public final boolean e(i iVar) {
        if (!iVar.A()) {
            return false;
        }
        i k2 = iVar.k();
        if (k2 != null && (k2.f2154j != null || k2.f2155k != null)) {
            return true;
        }
        if (!iVar.G() || iVar.n().f2154j == null) {
            return false;
        }
        return true;
    }

    public j<Object> f(g gVar, o oVar, i iVar) {
        j<Object> jVar;
        j<Object> d = d(iVar);
        if (d == null) {
            synchronized (this.f1787i) {
                d = d(iVar);
                if (d == null) {
                    int size = this.f1787i.size();
                    if (size <= 0 || (jVar = this.f1787i.get(iVar)) == null) {
                        try {
                            j<Object> a = a(gVar, oVar, iVar);
                            d = a;
                        } finally {
                            if (size == 0) {
                                if (this.f1787i.size() > 0) {
                                    this.f1787i.clear();
                                }
                            }
                        }
                    } else {
                        d = jVar;
                    }
                }
            }
            if (d == null) {
                Class<?> cls = iVar.f2152h;
                Annotation[] annotationArr = b.j.a.c.j0.g.a;
                if (!((cls.getModifiers() & 1536) == 0)) {
                    throw new b(gVar.f1996m, "Cannot find a Value deserializer for abstract type " + iVar, iVar);
                }
                throw new b(gVar.f1996m, "Cannot find a Value deserializer for type " + iVar, iVar);
            }
        }
        return d;
    }
}
