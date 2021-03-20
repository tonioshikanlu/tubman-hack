package b.j.a.c.h0;

import b.j.a.c.a0.i;
import b.j.a.c.b;
import b.j.a.c.c;
import b.j.a.c.e0.p;
import b.j.a.c.h0.t.l0;
import b.j.a.c.j0.d;
import b.j.a.c.j0.j;
import b.j.a.c.k;
import b.j.a.c.n;
import b.j.a.c.w;
import b.j.a.c.y;
import java.io.Serializable;
import java.util.Objects;

public class f extends b implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final f f2049k = new f((i) null);

    public f(i iVar) {
        super((i) null);
    }

    public n<Object> a(y yVar, b.j.a.c.i iVar) {
        b.j.a.c.i iVar2;
        w wVar = yVar.f2320h;
        c v = wVar.v(iVar);
        n e2 = e(yVar, ((p) v).f1937e);
        if (e2 != null) {
            return e2;
        }
        b e3 = wVar.e();
        boolean z = false;
        j<Object, Object> jVar = null;
        if (e3 == null) {
            iVar2 = iVar;
        } else {
            try {
                iVar2 = e3.o0(wVar, ((p) v).f1937e, iVar);
            } catch (k e4) {
                yVar.M(v, e4.getMessage(), new Object[0]);
                throw null;
            }
        }
        if (iVar2 != iVar) {
            if (!iVar2.v(iVar.f2152h)) {
                v = wVar.v(iVar2);
            }
            z = true;
        }
        p pVar = (p) v;
        b bVar = pVar.d;
        if (bVar != null) {
            jVar = pVar.g(bVar.Q(pVar.f1937e));
        }
        if (jVar == null) {
            return h(yVar, iVar2, v, z);
        }
        b.j.a.c.i c = jVar.c(yVar.h());
        if (!c.v(iVar2.f2152h)) {
            v = wVar.v(c);
            e2 = e(yVar, ((p) v).f1937e);
        }
        if (e2 == null && !c.F()) {
            e2 = h(yVar, c, v, true);
        }
        return new l0(jVar, c, e2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x021f, code lost:
        if (r3.b() != false) goto L_0x0221;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.h0.c g(b.j.a.c.y r17, b.j.a.c.e0.r r18, b.j.a.c.h0.k r19, boolean r20, b.j.a.c.e0.h r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r4 = r18
            r14 = r19
            r0 = r21
            b.j.a.c.t r6 = r18.h()
            b.j.a.c.i r11 = r21.f()
            b.j.a.c.d$a r3 = new b.j.a.c.d$a
            b.j.a.c.t r8 = r18.E()
            b.j.a.c.s r10 = r18.l()
            r5 = r3
            r7 = r11
            r9 = r21
            r5.<init>(r6, r7, r8, r9, r10)
            b.j.a.c.n r5 = r1.e(r2, r0)
            boolean r6 = r5 instanceof b.j.a.c.h0.n
            if (r6 == 0) goto L_0x0031
            r6 = r5
            b.j.a.c.h0.n r6 = (b.j.a.c.h0.n) r6
            r6.b(r2)
        L_0x0031:
            b.j.a.c.n r8 = r2.F(r5, r3)
            boolean r3 = r11.A()
            r5 = 0
            if (r3 != 0) goto L_0x0045
            boolean r3 = r11.b()
            if (r3 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r3 = r5
            goto L_0x0064
        L_0x0045:
            b.j.a.c.w r3 = r2.f2320h
            b.j.a.c.i r6 = r11.k()
            b.j.a.c.b r7 = r3.e()
            b.j.a.c.f0.e r7 = r7.G(r3, r0, r11)
            if (r7 != 0) goto L_0x005a
            b.j.a.c.f0.f r3 = r1.b(r3, r6)
            goto L_0x0064
        L_0x005a:
            b.j.a.c.f0.b r9 = r3.f1611l
            java.util.Collection r9 = r9.a(r3, r0, r6)
            b.j.a.c.f0.f r3 = r7.c(r3, r6, r9)
        L_0x0064:
            b.j.a.c.w r6 = r2.f2320h
            b.j.a.c.b r7 = r6.e()
            b.j.a.c.f0.e r7 = r7.M(r6, r0, r11)
            if (r7 != 0) goto L_0x0075
            b.j.a.c.f0.f r6 = r1.b(r6, r11)
            goto L_0x007f
        L_0x0075:
            b.j.a.c.f0.b r9 = r6.f1611l
            java.util.Collection r9 = r9.a(r6, r0, r11)
            b.j.a.c.f0.f r6 = r7.c(r6, r11, r9)
        L_0x007f:
            r9 = r6
            b.j.a.a.r$a r6 = b.j.a.a.r.a.NON_EMPTY
            r7 = 0
            r10 = r20
            b.j.a.c.i r10 = r14.a(r0, r10, r11)     // Catch:{ k -> 0x028b }
            if (r3 == 0) goto L_0x00bb
            if (r10 != 0) goto L_0x008e
            r10 = r11
        L_0x008e:
            b.j.a.c.i r12 = r10.k()
            if (r12 == 0) goto L_0x009d
            b.j.a.c.i r3 = r10.M(r3)
            r3.k()
            r10 = r3
            goto L_0x00bb
        L_0x009d:
            b.j.a.c.c r0 = r14.f2050b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "serialization type "
            r3.append(r6)
            r3.append(r10)
            java.lang.String r6 = " has no content"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r2.L(r0, r4, r3, r6)
            throw r5
        L_0x00bb:
            if (r10 != 0) goto L_0x00bf
            r3 = r11
            goto L_0x00c0
        L_0x00bf:
            r3 = r10
        L_0x00c0:
            b.j.a.c.e0.h r5 = r18.v()
            if (r5 == 0) goto L_0x027f
            java.lang.Class r5 = r5.e()
            b.j.a.c.w r7 = r14.a
            java.lang.Class<?> r12 = r3.f2152h
            b.j.a.a.r$b r13 = r14.f2051e
            java.util.Objects.requireNonNull(r7)
            b.j.a.c.a0.d r15 = r7.f1616q
            r15.a(r12)
            b.j.a.c.a0.d r7 = r7.f1616q
            r7.a(r5)
            r5 = 3
            b.j.a.a.r$b[] r7 = new b.j.a.a.r.b[r5]
            r12 = 0
            r7[r12] = r13
            r12 = 1
            r13 = 0
            r7[r12] = r13
            r15 = 2
            r7[r15] = r13
            r15 = 0
        L_0x00eb:
            if (r15 >= r5) goto L_0x00fd
            r5 = r7[r15]
            if (r5 == 0) goto L_0x00f9
            if (r13 != 0) goto L_0x00f4
            goto L_0x00f8
        L_0x00f4:
            b.j.a.a.r$b r5 = r13.a(r5)
        L_0x00f8:
            r13 = r5
        L_0x00f9:
            int r15 = r15 + 1
            r5 = 3
            goto L_0x00eb
        L_0x00fd:
            b.j.a.a.r$b r5 = r18.r()
            b.j.a.a.r$b r5 = r13.a(r5)
            b.j.a.a.r$a r7 = r5.f1353h
            b.j.a.a.r$a r13 = b.j.a.a.r.a.USE_DEFAULTS
            if (r7 != r13) goto L_0x010d
            b.j.a.a.r$a r7 = b.j.a.a.r.a.ALWAYS
        L_0x010d:
            int r7 = r7.ordinal()
            if (r7 == r12) goto L_0x0225
            r13 = 2
            if (r7 == r13) goto L_0x021b
            r13 = 3
            if (r7 == r13) goto L_0x0221
            r13 = 4
            if (r7 == r13) goto L_0x0133
            r13 = 5
            if (r7 == r13) goto L_0x0123
            r5 = 0
            r12 = r5
            goto L_0x0225
        L_0x0123:
            java.lang.Class<?> r3 = r5.f1355j
            java.lang.Object r3 = r2.H(r4, r3)
            if (r3 != 0) goto L_0x012d
            goto L_0x020a
        L_0x012d:
            boolean r12 = r2.I(r3)
            goto L_0x020a
        L_0x0133:
            boolean r5 = r14.f
            if (r5 == 0) goto L_0x0203
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Object r6 = r14.d
            if (r6 != 0) goto L_0x01b8
            b.j.a.c.c r6 = r14.f2050b
            b.j.a.c.w r7 = r14.a
            boolean r7 = r7.b()
            b.j.a.c.e0.p r6 = (b.j.a.c.e0.p) r6
            b.j.a.c.e0.b r13 = r6.f1937e
            b.j.a.c.e0.b$a r13 = r13.g()
            b.j.a.c.e0.d r13 = r13.a
            if (r13 != 0) goto L_0x0153
            r6 = 0
            goto L_0x0169
        L_0x0153:
            if (r7 == 0) goto L_0x0160
            b.j.a.c.a0.g<?> r7 = r6.c
            b.j.a.c.p r15 = b.j.a.c.p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r7 = r7.o(r15)
            r13.g(r7)
        L_0x0160:
            java.lang.reflect.Constructor<?> r7 = r13.f1901k     // Catch:{ Exception -> 0x016f }
            r13 = 0
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x016f }
            java.lang.Object r6 = r7.newInstance(r13)     // Catch:{ Exception -> 0x016f }
        L_0x0169:
            if (r6 != 0) goto L_0x016c
            r6 = r5
        L_0x016c:
            r14.d = r6
            goto L_0x01b8
        L_0x016f:
            r0 = move-exception
        L_0x0170:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x017b
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x0170
        L_0x017b:
            b.j.a.c.j0.g.C(r0)
            b.j.a.c.j0.g.E(r0)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Failed to instantiate bean of type "
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r3)
            b.j.a.c.e0.b r4 = r6.f1937e
            java.lang.Class<?> r4 = r4.f1887i
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ": ("
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ") "
            r3.append(r4)
            java.lang.String r4 = b.j.a.c.j0.g.i(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x01b8:
            if (r6 != r5) goto L_0x01bc
            r5 = 0
            goto L_0x01be
        L_0x01bc:
            java.lang.Object r5 = r14.d
        L_0x01be:
            if (r5 == 0) goto L_0x0203
            b.j.a.c.p r3 = b.j.a.c.p.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r3 = r2.J(r3)
            if (r3 == 0) goto L_0x01d3
            b.j.a.c.w r3 = r14.a
            b.j.a.c.p r6 = b.j.a.c.p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r3 = r3.o(r6)
            r0.g(r3)
        L_0x01d3:
            java.lang.Object r3 = r0.k(r5)     // Catch:{ Exception -> 0x01d9 }
            r5 = 0
            goto L_0x0208
        L_0x01d9:
            r0 = move-exception
            java.lang.String r2 = r18.getName()
        L_0x01de:
            java.lang.Throwable r3 = r0.getCause()
            if (r3 == 0) goto L_0x01e9
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x01de
        L_0x01e9:
            b.j.a.c.j0.g.C(r0)
            b.j.a.c.j0.g.E(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Failed to get property '"
            java.lang.String r4 = "' of default "
            java.lang.StringBuilder r2 = b.e.a.a.a.C(r3, r2, r4)
            java.lang.String r3 = " instance"
            java.lang.String r2 = b.e.a.a.a.f(r5, r2, r3)
            r0.<init>(r2)
            throw r0
        L_0x0203:
            java.lang.Object r3 = b.a.a.n.f.i(r3)
            r5 = r12
        L_0x0208:
            if (r3 != 0) goto L_0x020b
        L_0x020a:
            goto L_0x023b
        L_0x020b:
            java.lang.Class r6 = r3.getClass()
            boolean r6 = r6.isArray()
            if (r6 == 0) goto L_0x0219
            java.lang.Object r3 = b.j.a.c.j0.c.a(r3)
        L_0x0219:
            r6 = r3
            goto L_0x0238
        L_0x021b:
            boolean r3 = r3.b()
            if (r3 == 0) goto L_0x023a
        L_0x0221:
            int r3 = b.j.a.c.h0.c.B
        L_0x0223:
            r13 = r6
            goto L_0x023c
        L_0x0225:
            boolean r3 = r3.A()
            if (r3 == 0) goto L_0x023a
            b.j.a.c.w r3 = r14.a
            b.j.a.c.x r5 = b.j.a.c.x.WRITE_EMPTY_JSON_ARRAYS
            boolean r3 = r3.w(r5)
            if (r3 != 0) goto L_0x023a
            int r3 = b.j.a.c.h0.c.B
            r5 = r12
        L_0x0238:
            r12 = r5
            goto L_0x0223
        L_0x023a:
            r3 = 0
        L_0x023b:
            r13 = r3
        L_0x023c:
            java.lang.Class[] r3 = r18.u()
            if (r3 != 0) goto L_0x0248
            b.j.a.c.c r3 = r14.f2050b
            java.lang.Class[] r3 = r3.a()
        L_0x0248:
            r15 = r3
            b.j.a.c.h0.c r7 = new b.j.a.c.h0.c
            b.j.a.c.c r3 = r14.f2050b
            b.j.a.c.e0.p r3 = (b.j.a.c.e0.p) r3
            b.j.a.c.e0.b r3 = r3.f1937e
            b.j.a.c.j0.b r6 = r3.f1894p
            r3 = r7
            r4 = r18
            r5 = r21
            r1 = r7
            r7 = r11
            r11 = r12
            r12 = r13
            r13 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            b.j.a.c.b r3 = r14.c
            java.lang.Object r3 = r3.y(r0)
            if (r3 == 0) goto L_0x026f
            b.j.a.c.n r2 = r2.N(r0, r3)
            r1.c(r2)
        L_0x026f:
            b.j.a.c.b r2 = r14.c
            b.j.a.c.j0.r r0 = r2.Z(r0)
            if (r0 == 0) goto L_0x027d
            b.j.a.c.h0.s.r r7 = new b.j.a.c.h0.s.r
            r7.<init>(r1, r0)
            goto L_0x027e
        L_0x027d:
            r7 = r1
        L_0x027e:
            return r7
        L_0x027f:
            b.j.a.c.c r0 = r14.f2050b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "could not determine property type"
            r2.L(r0, r4, r3, r1)
            r0 = 0
            throw r0
        L_0x028b:
            r0 = move-exception
            r1 = r0
            b.j.a.c.c r0 = r14.f2050b
            java.lang.String r1 = b.j.a.c.j0.g.i(r1)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r2.L(r0, r4, r1, r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.f.g(b.j.a.c.y, b.j.a.c.e0.r, b.j.a.c.h0.k, boolean, b.j.a.c.e0.h):b.j.a.c.h0.c");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: b.j.a.c.h0.s.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v51, resolved type: b.j.a.c.n<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v167, resolved type: b.j.a.c.n<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v59, resolved type: b.j.a.c.n<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v178, resolved type: b.j.a.c.n<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v217, resolved type: b.j.a.c.h0.t.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v218, resolved type: b.j.a.c.h0.t.t} */
    /* JADX WARNING: type inference failed for: r5v14, types: [b.j.a.c.h0.s.k] */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0494, code lost:
        if (r1.b() != false) goto L_0x0496;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05f8, code lost:
        if (r1.b() != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0172, code lost:
        if (r8.K(b.j.a.c.x.WRITE_NULL_MAP_VALUES) == false) goto L_0x0174;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04b5 A[LOOP:11: B:240:0x04b5->B:243:0x04c5, LOOP_START, PHI: r2 
      PHI: (r2v98 b.j.a.c.n) = (r2v97 b.j.a.c.n), (r2v102 b.j.a.c.n) binds: [B:239:0x04ae, B:243:0x04c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x0a0f  */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0a3a  */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x0a8c  */
    /* JADX WARNING: Removed duplicated region for block: B:547:0x0ac7  */
    /* JADX WARNING: Removed duplicated region for block: B:564:0x0b0d  */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x0ba3  */
    /* JADX WARNING: Removed duplicated region for block: B:593:0x0bc6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<?> h(b.j.a.c.y r27, b.j.a.c.i r28, b.j.a.c.c r29, boolean r30) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r0 = r28
            r6 = r29
            r9 = r30
            b.j.a.a.k$c r5 = b.j.a.a.k.c.OBJECT
            b.j.a.a.r$a r4 = b.j.a.a.r.a.ALWAYS
            b.j.a.a.r$a r3 = b.j.a.a.r.a.USE_DEFAULTS
            b.j.a.c.w r2 = r8.f2320h
            boolean r1 = r28.A()
            r10 = 0
            if (r1 == 0) goto L_0x03eb
            if (r9 != 0) goto L_0x0022
            boolean r1 = r7.f(r2, r6, r10)
            r16 = r1
            goto L_0x0024
        L_0x0022:
            r16 = r9
        L_0x0024:
            b.j.a.c.w r1 = r8.f2320h
            if (r16 != 0) goto L_0x003e
            boolean r9 = r0.f2156l
            if (r9 == 0) goto L_0x003e
            boolean r9 = r28.A()
            if (r9 == 0) goto L_0x003c
            b.j.a.c.i r9 = r28.k()
            boolean r9 = r9.F()
            if (r9 != 0) goto L_0x003e
        L_0x003c:
            r9 = 1
            goto L_0x0040
        L_0x003e:
            r9 = r16
        L_0x0040:
            b.j.a.c.i r10 = r28.k()
            b.j.a.c.f0.f r15 = r7.b(r1, r10)
            if (r15 == 0) goto L_0x004b
            r9 = 0
        L_0x004b:
            r14 = r9
            r13 = r6
            b.j.a.c.e0.p r13 = (b.j.a.c.e0.p) r13
            b.j.a.c.e0.b r9 = r13.f1937e
            b.j.a.c.b r10 = r27.B()
            java.lang.Object r10 = r10.d(r9)
            if (r10 == 0) goto L_0x0060
            b.j.a.c.n r9 = r8.N(r9, r10)
            goto L_0x0061
        L_0x0060:
            r9 = 0
        L_0x0061:
            r12 = r9
            boolean r9 = r28.G()
            if (r9 == 0) goto L_0x01fe
            r11 = r0
            b.j.a.c.i0.f r11 = (b.j.a.c.i0.f) r11
            b.j.a.c.e0.b r9 = r13.f1937e
            b.j.a.c.b r10 = r27.B()
            java.lang.Object r10 = r10.t(r9)
            if (r10 == 0) goto L_0x007c
            b.j.a.c.n r9 = r8.N(r9, r10)
            goto L_0x007d
        L_0x007c:
            r9 = 0
        L_0x007d:
            r21 = r9
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            java.lang.Class<?> r10 = r11.f2152h
            boolean r9 = r9.isAssignableFrom(r10)
            if (r9 == 0) goto L_0x019b
            r1 = r11
            b.j.a.c.i0.g r1 = (b.j.a.c.i0.g) r1
            r9 = 0
            b.j.a.a.k$d r9 = r6.b(r9)
            if (r9 == 0) goto L_0x009c
            b.j.a.a.k$c r9 = r9.f1327i
            if (r9 != r5) goto L_0x009c
            r1 = 0
            r24 = r2
            goto L_0x01f6
        L_0x009c:
            b.j.a.c.w r11 = r8.f2320h
            java.lang.Iterable r9 = r26.i()
            r17 = r9
            b.j.a.c.j0.d r17 = (b.j.a.c.j0.d) r17
            r9 = 0
        L_0x00a7:
            boolean r10 = r17.hasNext()
            if (r10 == 0) goto L_0x00dc
            java.lang.Object r9 = r17.next()
            b.j.a.c.h0.q r9 = (b.j.a.c.h0.q) r9
            r18 = 2
            r10 = r11
            r30 = r11
            r11 = r1
            r22 = r12
            r12 = r29
            r24 = r2
            r2 = r13
            r13 = r21
            r19 = r14
            r14 = r15
            r20 = r15
            r15 = r22
            b.j.a.c.n r9 = r9.g(r10, r11, r12, r13, r14, r15)
            if (r9 == 0) goto L_0x00d0
            goto L_0x00e9
        L_0x00d0:
            r11 = r30
            r13 = r2
            r14 = r19
            r15 = r20
            r12 = r22
            r2 = r24
            goto L_0x00a7
        L_0x00dc:
            r24 = r2
            r30 = r11
            r22 = r12
            r2 = r13
            r19 = r14
            r20 = r15
            r18 = 2
        L_0x00e9:
            r10 = r18
            if (r9 != 0) goto L_0x017a
            b.j.a.c.n r9 = r7.d(r8, r1, r6)
            if (r9 != 0) goto L_0x017a
            b.j.a.c.b r9 = r30.e()
            b.j.a.c.e0.b r11 = r2.f1937e
            java.lang.Object r23 = r9.l(r11)
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            b.j.a.c.e0.b r2 = r2.f1937e
            r11 = r30
            b.j.a.a.p$a r2 = r11.r(r9, r2)
            if (r2 != 0) goto L_0x010b
            r2 = 0
            goto L_0x010f
        L_0x010b:
            java.util.Set r2 = r2.d()
        L_0x010f:
            r17 = r2
            r18 = r1
            b.j.a.c.h0.t.t r1 = b.j.a.c.h0.t.t.u(r17, r18, r19, r20, r21, r22, r23)
            b.j.a.c.i r2 = r1.f2141m
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            b.j.a.a.r$b r9 = r7.c(r8, r6, r2, r9)
            if (r9 != 0) goto L_0x0123
            r11 = r3
            goto L_0x0125
        L_0x0123:
            b.j.a.a.r$a r11 = r9.f1354i
        L_0x0125:
            if (r11 == r3) goto L_0x016b
            if (r11 != r4) goto L_0x012a
            goto L_0x016b
        L_0x012a:
            int r11 = r11.ordinal()
            if (r11 == r10) goto L_0x015f
            r10 = 3
            if (r11 == r10) goto L_0x0166
            r10 = 4
            if (r11 == r10) goto L_0x014a
            r2 = 5
            if (r11 == r2) goto L_0x013b
            r2 = 0
            goto L_0x0174
        L_0x013b:
            java.lang.Class<?> r2 = r9.f1356k
            r9 = 0
            java.lang.Object r2 = r8.H(r9, r2)
            if (r2 != 0) goto L_0x0145
            goto L_0x0174
        L_0x0145:
            boolean r9 = r8.I(r2)
            goto L_0x0175
        L_0x014a:
            java.lang.Object r2 = b.a.a.n.f.i(r2)
            if (r2 == 0) goto L_0x0174
            java.lang.Class r9 = r2.getClass()
            boolean r9 = r9.isArray()
            if (r9 == 0) goto L_0x0174
            java.lang.Object r2 = b.j.a.c.j0.c.a(r2)
            goto L_0x0174
        L_0x015f:
            r9 = 0
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x0169
        L_0x0166:
            java.lang.Object r2 = b.j.a.c.h0.t.t.x
            goto L_0x0174
        L_0x0169:
            r2 = r9
            goto L_0x0174
        L_0x016b:
            r2 = 0
            b.j.a.c.x r9 = b.j.a.c.x.WRITE_NULL_MAP_VALUES
            boolean r9 = r8.K(r9)
            if (r9 != 0) goto L_0x017b
        L_0x0174:
            r9 = 1
        L_0x0175:
            b.j.a.c.h0.t.t r1 = r1.z(r2, r9)
            goto L_0x017b
        L_0x017a:
            r1 = r9
        L_0x017b:
            b.j.a.c.a0.i r2 = r7.f2036h
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x01f6
            b.j.a.c.a0.i r2 = r7.f2036h
            java.lang.Iterable r2 = r2.b()
            b.j.a.c.j0.d r2 = (b.j.a.c.j0.d) r2
        L_0x018b:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x01f6
            java.lang.Object r9 = r2.next()
            b.j.a.c.h0.g r9 = (b.j.a.c.h0.g) r9
            java.util.Objects.requireNonNull(r9)
            goto L_0x018b
        L_0x019b:
            r24 = r2
            r22 = r12
            r20 = r15
            r2 = 0
            java.lang.Iterable r9 = r26.i()
            r17 = r9
            b.j.a.c.j0.d r17 = (b.j.a.c.j0.d) r17
        L_0x01aa:
            boolean r9 = r17.hasNext()
            if (r9 == 0) goto L_0x01cc
            java.lang.Object r2 = r17.next()
            r9 = r2
            b.j.a.c.h0.q r9 = (b.j.a.c.h0.q) r9
            r10 = r1
            r18 = r11
            r12 = r29
            r13 = r21
            r14 = r20
            r15 = r22
            b.j.a.c.n r2 = r9.d(r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x01c9
            goto L_0x01cc
        L_0x01c9:
            r11 = r18
            goto L_0x01aa
        L_0x01cc:
            if (r2 != 0) goto L_0x01d3
            b.j.a.c.n r1 = r26.d(r27, r28, r29)
            goto L_0x01d4
        L_0x01d3:
            r1 = r2
        L_0x01d4:
            if (r1 == 0) goto L_0x01f6
            b.j.a.c.a0.i r2 = r7.f2036h
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x01f6
            b.j.a.c.a0.i r2 = r7.f2036h
            java.lang.Iterable r2 = r2.b()
            b.j.a.c.j0.d r2 = (b.j.a.c.j0.d) r2
        L_0x01e6:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x01f6
            java.lang.Object r9 = r2.next()
            b.j.a.c.h0.g r9 = (b.j.a.c.h0.g) r9
            java.util.Objects.requireNonNull(r9)
            goto L_0x01e6
        L_0x01f6:
            r14 = r3
            r15 = r4
            r11 = r5
            r12 = r6
            r13 = r24
            goto L_0x03e4
        L_0x01fe:
            r24 = r2
            r22 = r12
            r19 = r14
            r20 = r15
            r2 = 0
            boolean r9 = r28.y()
            if (r9 == 0) goto L_0x0357
            r9 = r0
            b.j.a.c.i0.d r9 = (b.j.a.c.i0.d) r9
            java.lang.Class<java.util.Collection> r10 = java.util.Collection.class
            java.lang.Class<?> r11 = r9.f2152h
            boolean r10 = r10.isAssignableFrom(r11)
            if (r10 == 0) goto L_0x02f1
            b.j.a.c.i0.e r9 = (b.j.a.c.i0.e) r9
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            b.j.a.c.w r11 = r8.f2320h
            java.lang.Iterable r1 = r26.i()
            r12 = r1
            b.j.a.c.j0.d r12 = (b.j.a.c.j0.d) r12
        L_0x0227:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0257
            java.lang.Object r1 = r12.next()
            b.j.a.c.h0.q r1 = (b.j.a.c.h0.q) r1
            r13 = r24
            r2 = r11
            r14 = r3
            r3 = r9
            r15 = r4
            r4 = r29
            r17 = r11
            r11 = r5
            r5 = r20
            r30 = r12
            r12 = r6
            r6 = r22
            b.j.a.c.n r2 = r1.f(r2, r3, r4, r5, r6)
            if (r2 == 0) goto L_0x024c
            goto L_0x025d
        L_0x024c:
            r5 = r11
            r6 = r12
            r24 = r13
            r3 = r14
            r4 = r15
            r11 = r17
            r12 = r30
            goto L_0x0227
        L_0x0257:
            r14 = r3
            r15 = r4
            r11 = r5
            r12 = r6
            r13 = r24
        L_0x025d:
            if (r2 != 0) goto L_0x02d0
            b.j.a.c.n r2 = r7.d(r8, r9, r12)
            if (r2 != 0) goto L_0x02d0
            r1 = 0
            b.j.a.a.k$d r1 = r12.b(r1)
            if (r1 == 0) goto L_0x0272
            b.j.a.a.k$c r1 = r1.f1327i
            if (r1 != r11) goto L_0x0272
            goto L_0x03e3
        L_0x0272:
            java.lang.Class<?> r1 = r9.f2152h
            java.lang.Class<java.util.EnumSet> r3 = java.util.EnumSet.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x028b
            b.j.a.c.i r1 = r9.f2162q
            boolean r2 = r1.B()
            if (r2 != 0) goto L_0x0285
            r1 = 0
        L_0x0285:
            b.j.a.c.h0.t.n r2 = new b.j.a.c.h0.t.n
            r2.<init>(r1)
            goto L_0x02d0
        L_0x028b:
            b.j.a.c.i r3 = r9.f2162q
            java.lang.Class<?> r3 = r3.f2152h
            java.lang.Class<java.util.RandomAccess> r4 = java.util.RandomAccess.class
            boolean r1 = r4.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x02b7
            if (r3 != r10) goto L_0x02a9
            boolean r1 = b.j.a.c.j0.g.u(r22)
            if (r1 == 0) goto L_0x02a2
            b.j.a.c.h0.s.g r1 = b.j.a.c.h0.s.g.f2053k
            r2 = r1
        L_0x02a2:
            r5 = r19
            r6 = r20
            r4 = r22
            goto L_0x02c7
        L_0x02a9:
            b.j.a.c.i r1 = r9.f2162q
            b.j.a.c.h0.s.f r2 = new b.j.a.c.h0.s.f
            r5 = r19
            r6 = r20
            r4 = r22
            r2.<init>(r1, r5, r6, r4)
            goto L_0x02c7
        L_0x02b7:
            r5 = r19
            r6 = r20
            r4 = r22
            if (r3 != r10) goto L_0x02c7
            boolean r1 = b.j.a.c.j0.g.u(r4)
            if (r1 == 0) goto L_0x02c7
            b.j.a.c.h0.s.o r2 = b.j.a.c.h0.s.o.f2077k
        L_0x02c7:
            if (r2 != 0) goto L_0x02d0
            b.j.a.c.i r1 = r9.f2162q
            b.j.a.c.h0.t.j r2 = new b.j.a.c.h0.t.j
            r2.<init>(r1, r5, r6, r4)
        L_0x02d0:
            r1 = r2
            b.j.a.c.a0.i r2 = r7.f2036h
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x03e4
            b.j.a.c.a0.i r2 = r7.f2036h
            java.lang.Iterable r2 = r2.b()
            b.j.a.c.j0.d r2 = (b.j.a.c.j0.d) r2
        L_0x02e1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03e4
            java.lang.Object r3 = r2.next()
            b.j.a.c.h0.g r3 = (b.j.a.c.h0.g) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x02e1
        L_0x02f1:
            r14 = r3
            r15 = r4
            r11 = r5
            r12 = r6
            r6 = r20
            r4 = r22
            r13 = r24
            java.lang.Iterable r2 = r26.i()
            r10 = r2
            b.j.a.c.j0.d r10 = (b.j.a.c.j0.d) r10
            r2 = 0
        L_0x0303:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x032d
            java.lang.Object r2 = r10.next()
            b.j.a.c.h0.q r2 = (b.j.a.c.h0.q) r2
            r17 = r1
            r1 = r2
            r2 = r17
            r3 = r9
            r5 = r4
            r4 = r29
            r22 = r5
            r5 = r6
            r20 = r6
            r6 = r22
            b.j.a.c.n r2 = r1.b(r2, r3, r4, r5, r6)
            if (r2 == 0) goto L_0x0326
            goto L_0x032d
        L_0x0326:
            r1 = r17
            r6 = r20
            r4 = r22
            goto L_0x0303
        L_0x032d:
            if (r2 != 0) goto L_0x0334
            b.j.a.c.n r1 = r26.d(r27, r28, r29)
            goto L_0x0335
        L_0x0334:
            r1 = r2
        L_0x0335:
            if (r1 == 0) goto L_0x03e4
            b.j.a.c.a0.i r2 = r7.f2036h
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x03e4
            b.j.a.c.a0.i r2 = r7.f2036h
            java.lang.Iterable r2 = r2.b()
            b.j.a.c.j0.d r2 = (b.j.a.c.j0.d) r2
        L_0x0347:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03e4
            java.lang.Object r3 = r2.next()
            b.j.a.c.h0.g r3 = (b.j.a.c.h0.g) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x0347
        L_0x0357:
            r14 = r3
            r15 = r4
            r11 = r5
            r12 = r6
            r5 = r19
            r13 = r24
            boolean r1 = r28.x()
            if (r1 == 0) goto L_0x03e3
            r9 = r0
            b.j.a.c.i0.a r9 = (b.j.a.c.i0.a) r9
            b.j.a.c.w r10 = r8.f2320h
            java.lang.Iterable r1 = r26.i()
            r17 = r1
            b.j.a.c.j0.d r17 = (b.j.a.c.j0.d) r17
            r1 = 0
        L_0x0373:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x0396
            java.lang.Object r1 = r17.next()
            b.j.a.c.h0.q r1 = (b.j.a.c.h0.q) r1
            r2 = r10
            r3 = r9
            r4 = r29
            r6 = r5
            r5 = r20
            r18 = r10
            r10 = r6
            r6 = r22
            b.j.a.c.n r1 = r1.c(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0392
            goto L_0x0397
        L_0x0392:
            r5 = r10
            r10 = r18
            goto L_0x0373
        L_0x0396:
            r10 = r5
        L_0x0397:
            if (r1 != 0) goto L_0x03c3
            java.lang.Class<?> r2 = r9.f2152h
            r3 = r22
            if (r3 == 0) goto L_0x03a5
            boolean r4 = b.j.a.c.j0.g.u(r3)
            if (r4 == 0) goto L_0x03b8
        L_0x03a5:
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            if (r1 != r2) goto L_0x03ac
            b.j.a.c.h0.s.n r1 = b.j.a.c.h0.s.n.f2075m
            goto L_0x03b8
        L_0x03ac:
            java.util.HashMap<java.lang.String, b.j.a.c.n<?>> r1 = b.j.a.c.h0.t.k0.a
            java.lang.String r2 = r2.getName()
            java.lang.Object r1 = r1.get(r2)
            b.j.a.c.n r1 = (b.j.a.c.n) r1
        L_0x03b8:
            if (r1 != 0) goto L_0x03c3
            b.j.a.c.h0.t.d0 r1 = new b.j.a.c.h0.t.d0
            b.j.a.c.i r2 = r9.f2157q
            r4 = r20
            r1.<init>(r2, r10, r4, r3)
        L_0x03c3:
            b.j.a.c.a0.i r2 = r7.f2036h
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x03e4
            b.j.a.c.a0.i r2 = r7.f2036h
            java.lang.Iterable r2 = r2.b()
            b.j.a.c.j0.d r2 = (b.j.a.c.j0.d) r2
        L_0x03d3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03e4
            java.lang.Object r3 = r2.next()
            b.j.a.c.h0.g r3 = (b.j.a.c.h0.g) r3
            java.util.Objects.requireNonNull(r3)
            goto L_0x03d3
        L_0x03e3:
            r1 = 0
        L_0x03e4:
            if (r1 == 0) goto L_0x03e7
            return r1
        L_0x03e7:
            r9 = r16
            goto L_0x04ce
        L_0x03eb:
            r13 = r2
            r14 = r3
            r15 = r4
            r11 = r5
            r12 = r6
            boolean r1 = r28.b()
            if (r1 == 0) goto L_0x04ae
            r10 = r0
            b.j.a.c.i0.i r10 = (b.j.a.c.i0.i) r10
            b.j.a.c.i r1 = r10.f2165q
            java.lang.Object r2 = r1.f2155k
            b.j.a.c.f0.f r2 = (b.j.a.c.f0.f) r2
            b.j.a.c.w r6 = r8.f2320h
            if (r2 != 0) goto L_0x0407
            b.j.a.c.f0.f r2 = r7.b(r6, r1)
        L_0x0407:
            r5 = r2
            java.lang.Object r1 = r1.f2154j
            r4 = r1
            b.j.a.c.n r4 = (b.j.a.c.n) r4
            java.lang.Iterable r1 = r26.i()
            r16 = r1
            b.j.a.c.j0.d r16 = (b.j.a.c.j0.d) r16
        L_0x0415:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x043c
            java.lang.Object r1 = r16.next()
            b.j.a.c.h0.q r1 = (b.j.a.c.h0.q) r1
            r2 = r6
            r3 = r10
            r17 = r4
            r4 = r29
            r18 = r5
            r19 = r6
            r6 = r17
            b.j.a.c.n r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0435
            goto L_0x04c8
        L_0x0435:
            r4 = r17
            r5 = r18
            r6 = r19
            goto L_0x0415
        L_0x043c:
            r17 = r4
            r18 = r5
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r1 = java.util.concurrent.atomic.AtomicReference.class
            boolean r1 = r10.I(r1)
            if (r1 == 0) goto L_0x04ac
            b.j.a.c.i r1 = r10.f2165q
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r2 = java.util.concurrent.atomic.AtomicReference.class
            b.j.a.a.r$b r2 = r7.c(r8, r12, r1, r2)
            if (r2 != 0) goto L_0x0454
            r3 = r14
            goto L_0x0456
        L_0x0454:
            b.j.a.a.r$a r3 = r2.f1354i
        L_0x0456:
            if (r3 == r14) goto L_0x049c
            if (r3 != r15) goto L_0x045b
            goto L_0x049c
        L_0x045b:
            int r3 = r3.ordinal()
            r4 = 2
            if (r3 == r4) goto L_0x0490
            r4 = 3
            if (r3 == r4) goto L_0x0496
            r4 = 4
            if (r3 == r4) goto L_0x047b
            r1 = 5
            if (r3 == r1) goto L_0x046c
            goto L_0x0499
        L_0x046c:
            java.lang.Class<?> r1 = r2.f1356k
            r2 = 0
            java.lang.Object r1 = r8.H(r2, r1)
            if (r1 != 0) goto L_0x0476
            goto L_0x049a
        L_0x0476:
            boolean r2 = r8.I(r1)
            goto L_0x049e
        L_0x047b:
            java.lang.Object r1 = b.a.a.n.f.i(r1)
            if (r1 == 0) goto L_0x049a
            java.lang.Class r2 = r1.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L_0x049a
            java.lang.Object r1 = b.j.a.c.j0.c.a(r1)
            goto L_0x049a
        L_0x0490:
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0499
        L_0x0496:
            java.lang.Object r1 = b.j.a.c.h0.t.t.x
            goto L_0x049a
        L_0x0499:
            r1 = 0
        L_0x049a:
            r2 = 1
            goto L_0x049e
        L_0x049c:
            r1 = 0
            r2 = 0
        L_0x049e:
            b.j.a.c.h0.t.c r3 = new b.j.a.c.h0.t.c
            r5 = r17
            r4 = r18
            r3.<init>(r10, r9, r4, r5)
            b.j.a.c.h0.t.f0 r1 = r3.r(r1, r2)
            goto L_0x04c8
        L_0x04ac:
            r1 = 0
            goto L_0x04c8
        L_0x04ae:
            java.lang.Iterable r1 = r26.i()
            b.j.a.c.j0.d r1 = (b.j.a.c.j0.d) r1
            r2 = 0
        L_0x04b5:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x04c7
            java.lang.Object r2 = r1.next()
            b.j.a.c.h0.q r2 = (b.j.a.c.h0.q) r2
            b.j.a.c.n r2 = r2.e(r13, r0, r12)
            if (r2 == 0) goto L_0x04b5
        L_0x04c7:
            r1 = r2
        L_0x04c8:
            if (r1 != 0) goto L_0x04ce
            b.j.a.c.n r1 = r26.d(r27, r28, r29)
        L_0x04ce:
            if (r1 != 0) goto L_0x0bc7
            java.lang.Class<?> r1 = r0.f2152h
            java.lang.String r1 = r1.getName()
            java.util.HashMap<java.lang.String, b.j.a.c.n<?>> r2 = b.j.a.c.h0.b.f2034i
            java.lang.Object r2 = r2.get(r1)
            b.j.a.c.n r2 = (b.j.a.c.n) r2
            if (r2 != 0) goto L_0x04f2
            java.util.HashMap<java.lang.String, java.lang.Class<? extends b.j.a.c.n<?>>> r3 = b.j.a.c.h0.b.f2035j
            java.lang.Object r1 = r3.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L_0x04f2
            r2 = 0
            java.lang.Object r1 = b.j.a.c.j0.g.h(r1, r2)
            b.j.a.c.n r1 = (b.j.a.c.n) r1
            goto L_0x04f8
        L_0x04f2:
            r1 = 0
            r25 = r2
            r2 = r1
            r1 = r25
        L_0x04f8:
            if (r1 != 0) goto L_0x0bc7
            java.lang.Class<?> r1 = r0.f2152h
            b.j.a.c.d0.e r3 = b.j.a.c.d0.e.f1873k
            b.j.a.c.w r4 = r8.f2320h
            java.util.Objects.requireNonNull(r3)
            java.lang.Class<?> r5 = r0.f2152h
            b.j.a.c.d0.a r6 = b.j.a.c.d0.e.f1872j
            if (r6 == 0) goto L_0x0510
            b.j.a.c.n r6 = r6.d(r5)
            if (r6 == 0) goto L_0x0510
            goto L_0x0546
        L_0x0510:
            java.lang.Class<?> r6 = b.j.a.c.d0.e.f1870h
            if (r6 == 0) goto L_0x0524
            boolean r6 = r6.isAssignableFrom(r5)
            if (r6 == 0) goto L_0x0524
            java.lang.String r4 = "com.fasterxml.jackson.databind.ext.DOMSerializer"
            java.lang.Object r3 = r3.b(r4)
            r6 = r3
            b.j.a.c.n r6 = (b.j.a.c.n) r6
            goto L_0x0546
        L_0x0524:
            java.lang.String r6 = r5.getName()
            java.lang.String r10 = "javax.xml."
            boolean r6 = r6.startsWith(r10)
            if (r6 != 0) goto L_0x0536
            boolean r5 = r3.a(r5, r10)
            if (r5 == 0) goto L_0x053e
        L_0x0536:
            java.lang.String r5 = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers"
            java.lang.Object r3 = r3.b(r5)
            if (r3 != 0) goto L_0x0540
        L_0x053e:
            r6 = 0
            goto L_0x0546
        L_0x0540:
            b.j.a.c.h0.q r3 = (b.j.a.c.h0.q) r3
            b.j.a.c.n r6 = r3.e(r4, r0, r12)
        L_0x0546:
            if (r6 == 0) goto L_0x0549
            goto L_0x0560
        L_0x0549:
            java.lang.Class<java.util.Calendar> r3 = java.util.Calendar.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x0555
            b.j.a.c.h0.t.h r1 = b.j.a.c.h0.t.h.f2115m
        L_0x0553:
            r6 = r1
            goto L_0x0560
        L_0x0555:
            java.lang.Class<java.util.Date> r3 = java.util.Date.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x0563
            b.j.a.c.h0.t.k r1 = b.j.a.c.h0.t.k.f2117m
            goto L_0x0553
        L_0x0560:
            r1 = 1
            goto L_0x0700
        L_0x0563:
            java.lang.Class<java.util.Map$Entry> r3 = java.util.Map.Entry.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x0623
            java.lang.Class<java.util.Map$Entry> r1 = java.util.Map.Entry.class
            b.j.a.c.i r1 = r0.i(r1)
            b.j.a.c.i r18 = r1.h(r2)
            r3 = 1
            b.j.a.c.i r1 = r1.h(r3)
            java.lang.Class<java.util.Map$Entry> r4 = java.util.Map.Entry.class
            b.j.a.c.w r5 = r8.f2320h
            b.j.a.c.a0.d r5 = r5.f1616q
            r5.a(r4)
            b.j.a.a.k$d r4 = b.j.a.c.a0.g.f1607j
            r5 = 0
            b.j.a.a.k$d r5 = r12.b(r5)
            if (r5 != 0) goto L_0x058d
            goto L_0x0591
        L_0x058d:
            b.j.a.a.k$d r4 = r5.f(r4)
        L_0x0591:
            b.j.a.a.k$c r4 = r4.f1327i
            if (r4 != r11) goto L_0x0598
            r1 = 0
            goto L_0x061e
        L_0x0598:
            b.j.a.c.h0.s.i r4 = new b.j.a.c.h0.s.i
            b.j.a.c.w r5 = r8.f2320h
            b.j.a.c.f0.f r21 = r7.b(r5, r1)
            r22 = 0
            r16 = r4
            r17 = r1
            r19 = r1
            r20 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22)
            java.lang.Class<java.util.Map$Entry> r5 = java.util.Map.Entry.class
            b.j.a.a.r$b r5 = r7.c(r8, r12, r1, r5)
            if (r5 != 0) goto L_0x05b7
            r6 = r14
            goto L_0x05b9
        L_0x05b7:
            b.j.a.a.r$a r6 = r5.f1354i
        L_0x05b9:
            if (r6 == r14) goto L_0x061d
            if (r6 != r15) goto L_0x05bf
            goto L_0x061d
        L_0x05bf:
            int r6 = r6.ordinal()
            r10 = 2
            if (r6 == r10) goto L_0x05f4
            r10 = 3
            if (r6 == r10) goto L_0x05fa
            r10 = 4
            if (r6 == r10) goto L_0x05df
            r1 = 5
            if (r6 == r1) goto L_0x05d0
            goto L_0x05fd
        L_0x05d0:
            java.lang.Class<?> r1 = r5.f1356k
            r5 = 0
            java.lang.Object r1 = r8.H(r5, r1)
            if (r1 != 0) goto L_0x05da
            goto L_0x05fe
        L_0x05da:
            boolean r5 = r8.I(r1)
            goto L_0x05ff
        L_0x05df:
            java.lang.Object r1 = b.a.a.n.f.i(r1)
            if (r1 == 0) goto L_0x05fe
            java.lang.Class r5 = r1.getClass()
            boolean r5 = r5.isArray()
            if (r5 == 0) goto L_0x05fe
            java.lang.Object r1 = b.j.a.c.j0.c.a(r1)
            goto L_0x05fe
        L_0x05f4:
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x05fd
        L_0x05fa:
            java.lang.Object r1 = b.j.a.c.h0.t.t.x
            goto L_0x05fe
        L_0x05fd:
            r1 = 0
        L_0x05fe:
            r5 = r3
        L_0x05ff:
            java.lang.Object r6 = r4.s
            if (r6 != r1) goto L_0x0608
            boolean r6 = r4.t
            if (r6 != r5) goto L_0x0608
            goto L_0x061f
        L_0x0608:
            b.j.a.c.h0.s.i r6 = new b.j.a.c.h0.s.i
            b.j.a.c.n<java.lang.Object> r10 = r4.f2059o
            b.j.a.c.n<java.lang.Object> r11 = r4.f2060p
            r14 = r6
            r15 = r4
            r16 = r10
            r17 = r11
            r18 = r1
            r19 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            r4 = r6
            goto L_0x061f
        L_0x061d:
            r1 = r4
        L_0x061e:
            r4 = r1
        L_0x061f:
            r1 = r3
            r6 = r4
            goto L_0x0700
        L_0x0623:
            r3 = 1
            java.lang.Class<java.nio.ByteBuffer> r4 = java.nio.ByteBuffer.class
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L_0x0632
            b.j.a.c.h0.t.g r1 = new b.j.a.c.h0.t.g
            r1.<init>()
            goto L_0x0666
        L_0x0632:
            java.lang.Class<java.net.InetAddress> r4 = java.net.InetAddress.class
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L_0x0640
            b.j.a.c.h0.t.p r1 = new b.j.a.c.h0.t.p
            r1.<init>()
            goto L_0x0666
        L_0x0640:
            java.lang.Class<java.net.InetSocketAddress> r4 = java.net.InetSocketAddress.class
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L_0x064e
            b.j.a.c.h0.t.q r1 = new b.j.a.c.h0.t.q
            r1.<init>()
            goto L_0x0666
        L_0x064e:
            java.lang.Class<java.util.TimeZone> r4 = java.util.TimeZone.class
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L_0x065c
            b.j.a.c.h0.t.u0 r1 = new b.j.a.c.h0.t.u0
            r1.<init>()
            goto L_0x0666
        L_0x065c:
            java.lang.Class<java.nio.charset.Charset> r4 = java.nio.charset.Charset.class
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L_0x0669
            b.j.a.c.h0.t.v0 r1 = b.j.a.c.h0.t.v0.f2148j
        L_0x0666:
            r6 = r1
            goto L_0x06ff
        L_0x0669:
            java.lang.Class<java.lang.Number> r4 = java.lang.Number.class
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L_0x0690
            r1 = 0
            b.j.a.a.k$d r1 = r12.b(r1)
            if (r1 == 0) goto L_0x068d
            b.j.a.a.k$c r1 = r1.f1327i
            int r1 = r1.ordinal()
            r4 = 3
            if (r1 == r4) goto L_0x06fe
            r4 = 4
            if (r1 == r4) goto L_0x06fe
            r4 = 8
            if (r1 == r4) goto L_0x0689
            goto L_0x068d
        L_0x0689:
            b.j.a.c.h0.t.v0 r6 = b.j.a.c.h0.t.v0.f2148j
            goto L_0x06ff
        L_0x068d:
            b.j.a.c.h0.t.v r6 = b.j.a.c.h0.t.v.f2147j
            goto L_0x06ff
        L_0x0690:
            java.lang.Class<java.lang.Enum> r4 = java.lang.Enum.class
            boolean r1 = r4.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x06fe
            b.j.a.c.w r1 = r8.f2320h
            r4 = 0
            b.j.a.a.k$d r4 = r12.b(r4)
            if (r4 == 0) goto L_0x06cc
            b.j.a.a.k$c r5 = r4.f1327i
            if (r5 != r11) goto L_0x06cc
            r1 = r12
            b.j.a.c.e0.p r1 = (b.j.a.c.e0.p) r1
            java.util.List r1 = r1.h()
            java.util.Iterator r1 = r1.iterator()
        L_0x06b0:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x06fe
            java.lang.Object r4 = r1.next()
            b.j.a.c.e0.r r4 = (b.j.a.c.e0.r) r4
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "declaringClass"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x06b0
            r1.remove()
            goto L_0x06fe
        L_0x06cc:
            java.lang.Class<?> r5 = r0.f2152h
            int r6 = b.j.a.c.h0.t.m.f2124l
            b.j.a.c.j0.l r1 = b.j.a.c.j0.l.a(r1, r5)
            r6 = 0
            java.lang.Boolean r4 = b.j.a.c.h0.t.m.q(r5, r4, r3, r6)
            b.j.a.c.h0.t.m r6 = new b.j.a.c.h0.t.m
            r6.<init>(r1, r4)
            b.j.a.c.a0.i r1 = r7.f2036h
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x06ff
            b.j.a.c.a0.i r1 = r7.f2036h
            java.lang.Iterable r1 = r1.b()
            b.j.a.c.j0.d r1 = (b.j.a.c.j0.d) r1
        L_0x06ee:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x06ff
            java.lang.Object r4 = r1.next()
            b.j.a.c.h0.g r4 = (b.j.a.c.h0.g) r4
            java.util.Objects.requireNonNull(r4)
            goto L_0x06ee
        L_0x06fe:
            r6 = 0
        L_0x06ff:
            r1 = r3
        L_0x0700:
            if (r6 != 0) goto L_0x0bc6
            java.lang.Class<?> r3 = r0.f2152h
            java.lang.String r4 = b.j.a.c.j0.g.d(r3)
            if (r4 != 0) goto L_0x0711
            boolean r3 = b.j.a.c.j0.g.x(r3)
            if (r3 != 0) goto L_0x0711
            r2 = r1
        L_0x0711:
            if (r2 != 0) goto L_0x071b
            boolean r1 = r28.B()
            if (r1 != 0) goto L_0x071b
            r1 = 0
            goto L_0x0727
        L_0x071b:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            b.j.a.c.i r2 = r12.a
            java.lang.Class<?> r2 = r2.f2152h
            if (r2 != r1) goto L_0x072b
            b.j.a.c.n r1 = r8.E(r1)
        L_0x0727:
            r30 = r9
            goto L_0x0b0b
        L_0x072b:
            b.j.a.c.w r10 = r8.f2320h
            b.j.a.c.h0.e r11 = new b.j.a.c.h0.e
            r11.<init>(r12)
            r11.f2045b = r10
            r14 = r12
            b.j.a.c.e0.p r14 = (b.j.a.c.e0.p) r14
            java.util.List r1 = r14.h()
            b.j.a.c.w r2 = r8.f2320h
            b.j.a.c.b r3 = r2.e()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r5 = r1.iterator()
        L_0x074a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0789
            java.lang.Object r6 = r5.next()
            b.j.a.c.e0.r r6 = (b.j.a.c.e0.r) r6
            b.j.a.c.e0.h r15 = r6.v()
            if (r15 != 0) goto L_0x075d
            goto L_0x0785
        L_0x075d:
            java.lang.Class r6 = r6.C()
            java.lang.Object r15 = r4.get(r6)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            if (r15 != 0) goto L_0x077f
            r2.f(r6)
            b.j.a.c.c r15 = r2.m(r6)
            b.j.a.c.e0.p r15 = (b.j.a.c.e0.p) r15
            b.j.a.c.e0.b r15 = r15.f1937e
            java.lang.Boolean r15 = r3.l0(r15)
            if (r15 != 0) goto L_0x077c
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
        L_0x077c:
            r4.put(r6, r15)
        L_0x077f:
            boolean r6 = r15.booleanValue()
            if (r6 == 0) goto L_0x074a
        L_0x0785:
            r5.remove()
            goto L_0x074a
        L_0x0789:
            b.j.a.c.p r3 = b.j.a.c.p.REQUIRE_SETTERS_FOR_GETTERS
            boolean r3 = r2.o(r3)
            if (r3 == 0) goto L_0x07b1
            java.util.Iterator r3 = r1.iterator()
        L_0x0795:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x07b1
            java.lang.Object r4 = r3.next()
            b.j.a.c.e0.r r4 = (b.j.a.c.e0.r) r4
            boolean r5 = r4.n()
            if (r5 != 0) goto L_0x0795
            boolean r4 = r4.J()
            if (r4 != 0) goto L_0x0795
            r3.remove()
            goto L_0x0795
        L_0x07b1:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x07bd
            r1 = 2
            r2 = 0
            r30 = r9
            goto L_0x084d
        L_0x07bd:
            r3 = 0
            boolean r15 = r7.f(r2, r12, r3)
            b.j.a.c.h0.k r6 = new b.j.a.c.h0.k
            r6.<init>(r2, r12)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = r1.size()
            r5.<init>(r2)
            java.util.Iterator r16 = r1.iterator()
        L_0x07d4:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0848
            java.lang.Object r1 = r16.next()
            r3 = r1
            b.j.a.c.e0.r r3 = (b.j.a.c.e0.r) r3
            b.j.a.c.e0.h r1 = r3.v()
            boolean r2 = r3.L()
            if (r2 == 0) goto L_0x0811
            if (r1 == 0) goto L_0x07d4
            b.j.a.c.e0.h r2 = r11.f2047g
            if (r2 != 0) goto L_0x07f4
            r11.f2047g = r1
            goto L_0x07d4
        L_0x07f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Multiple type ids specified with "
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            b.j.a.c.e0.h r3 = r11.f2047g
            r2.append(r3)
            java.lang.String r3 = " and "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0811:
            b.j.a.c.b$a r2 = r3.t()
            if (r2 == 0) goto L_0x0823
            b.j.a.c.b$a$a r2 = r2.a
            b.j.a.c.b$a$a r4 = b.j.a.c.b.a.C0049a.BACK_REFERENCE
            if (r2 != r4) goto L_0x081f
            r2 = 1
            goto L_0x0820
        L_0x081f:
            r2 = 0
        L_0x0820:
            if (r2 == 0) goto L_0x0823
            goto L_0x07d4
        L_0x0823:
            boolean r2 = r1 instanceof b.j.a.c.e0.i
            if (r2 == 0) goto L_0x082a
            b.j.a.c.e0.i r1 = (b.j.a.c.e0.i) r1
            goto L_0x082c
        L_0x082a:
            b.j.a.c.e0.f r1 = (b.j.a.c.e0.f) r1
        L_0x082c:
            r17 = r1
            r1 = r26
            r2 = r27
            r4 = r6
            r30 = r9
            r9 = r5
            r5 = r15
            r18 = r6
            r6 = r17
            b.j.a.c.h0.c r1 = r1.g(r2, r3, r4, r5, r6)
            r9.add(r1)
            r5 = r9
            r6 = r18
            r9 = r30
            goto L_0x07d4
        L_0x0848:
            r30 = r9
            r9 = r5
            r1 = 2
            r2 = r9
        L_0x084d:
            if (r2 != 0) goto L_0x0856
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x08bf
        L_0x0856:
            int r3 = r2.size()
            r4 = 0
        L_0x085b:
            if (r4 >= r3) goto L_0x08bd
            java.lang.Object r5 = r2.get(r4)
            b.j.a.c.h0.c r5 = (b.j.a.c.h0.c) r5
            b.j.a.c.f0.f r6 = r5.v
            if (r6 == 0) goto L_0x08b6
            b.j.a.a.c0$a r9 = r6.c()
            b.j.a.a.c0$a r15 = b.j.a.a.c0.a.EXTERNAL_PROPERTY
            if (r9 == r15) goto L_0x0870
            goto L_0x08b6
        L_0x0870:
            java.lang.String r6 = r6.b()
            b.j.a.c.t r6 = b.j.a.c.t.a(r6)
            java.util.Iterator r9 = r2.iterator()
        L_0x087c:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L_0x08b6
            java.lang.Object r15 = r9.next()
            b.j.a.c.h0.c r15 = (b.j.a.c.h0.c) r15
            if (r15 == r5) goto L_0x087c
            r16 = r2
            b.j.a.c.t r2 = r15.f2038l
            if (r2 == 0) goto L_0x0895
            boolean r2 = r2.equals(r6)
            goto L_0x08ad
        L_0x0895:
            b.j.a.b.s.i r2 = r15.f2037k
            java.lang.String r2 = r2.f1484h
            java.lang.String r15 = r6.f2305h
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x08ac
            java.lang.String r2 = r6.f2306i
            if (r2 == 0) goto L_0x08a7
            r2 = 1
            goto L_0x08a8
        L_0x08a7:
            r2 = 0
        L_0x08a8:
            if (r2 != 0) goto L_0x08ac
            r2 = 1
            goto L_0x08ad
        L_0x08ac:
            r2 = 0
        L_0x08ad:
            if (r2 == 0) goto L_0x08b3
            r2 = 0
            r5.v = r2
            goto L_0x08b8
        L_0x08b3:
            r2 = r16
            goto L_0x087c
        L_0x08b6:
            r16 = r2
        L_0x08b8:
            int r4 = r4 + 1
            r2 = r16
            goto L_0x085b
        L_0x08bd:
            r16 = r2
        L_0x08bf:
            b.j.a.c.b r3 = r27.B()
            b.j.a.c.e0.b r4 = r14.f1937e
            r3.a(r10, r4, r2)
            b.j.a.c.a0.i r3 = r7.f2036h
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x08e8
            b.j.a.c.a0.i r3 = r7.f2036h
            java.lang.Iterable r3 = r3.b()
            b.j.a.c.j0.d r3 = (b.j.a.c.j0.d) r3
        L_0x08d8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x08e8
            java.lang.Object r4 = r3.next()
            b.j.a.c.h0.g r4 = (b.j.a.c.h0.g) r4
            java.util.Objects.requireNonNull(r4)
            goto L_0x08d8
        L_0x08e8:
            b.j.a.c.i r3 = r12.a
            java.lang.Class<?> r3 = r3.f2152h
            b.j.a.c.e0.b r4 = r14.f1937e
            b.j.a.a.p$a r3 = r10.r(r3, r4)
            if (r3 == 0) goto L_0x091c
            java.util.Set r3 = r3.d()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x091c
            java.util.Iterator r4 = r2.iterator()
        L_0x0902:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x091c
            java.lang.Object r5 = r4.next()
            b.j.a.c.h0.c r5 = (b.j.a.c.h0.c) r5
            b.j.a.b.s.i r5 = r5.f2037k
            java.lang.String r5 = r5.f1484h
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L_0x0902
            r4.remove()
            goto L_0x0902
        L_0x091c:
            b.j.a.c.a0.i r3 = r7.f2036h
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x093c
            b.j.a.c.a0.i r3 = r7.f2036h
            java.lang.Iterable r3 = r3.b()
            b.j.a.c.j0.d r3 = (b.j.a.c.j0.d) r3
        L_0x092c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x093c
            java.lang.Object r4 = r3.next()
            b.j.a.c.h0.g r4 = (b.j.a.c.h0.g) r4
            java.util.Objects.requireNonNull(r4)
            goto L_0x092c
        L_0x093c:
            b.j.a.c.e0.y r3 = r14.f1940i
            if (r3 != 0) goto L_0x0943
            r3 = 0
            goto L_0x09c2
        L_0x0943:
            java.lang.Class<? extends b.j.a.a.i0<?>> r4 = r3.f1958b
            java.lang.Class<b.j.a.a.k0> r5 = b.j.a.a.k0.class
            if (r4 != r5) goto L_0x09a3
            b.j.a.c.t r4 = r3.a
            java.lang.String r4 = r4.f2305h
            int r5 = r2.size()
            r6 = 0
        L_0x0952:
            if (r6 == r5) goto L_0x097b
            java.lang.Object r9 = r2.get(r6)
            b.j.a.c.h0.c r9 = (b.j.a.c.h0.c) r9
            b.j.a.b.s.i r15 = r9.f2037k
            java.lang.String r15 = r15.f1484h
            boolean r15 = r4.equals(r15)
            if (r15 == 0) goto L_0x0978
            if (r6 <= 0) goto L_0x096d
            r2.remove(r6)
            r4 = 0
            r2.add(r4, r9)
        L_0x096d:
            b.j.a.c.i r4 = r9.f2039m
            b.j.a.c.h0.s.k r5 = new b.j.a.c.h0.s.k
            r5.<init>((b.j.a.c.e0.y) r3, (b.j.a.c.h0.c) r9)
            boolean r3 = r3.f1959e
            r6 = 0
            goto L_0x09be
        L_0x0978:
            int r6 = r6 + 1
            goto L_0x0952
        L_0x097b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid Object Id definition for "
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            b.j.a.c.i r2 = r12.a
            java.lang.Class<?> r2 = r2.f2152h
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ": cannot find property with name '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x09a3:
            b.j.a.c.i r4 = r8.e(r4)
            b.j.a.c.i0.n r5 = r27.h()
            java.lang.Class<b.j.a.a.i0> r6 = b.j.a.a.i0.class
            b.j.a.c.i[] r4 = r5.m(r4, r6)
            r5 = 0
            r4 = r4[r5]
            b.j.a.c.e0.b r5 = r14.f1937e
            b.j.a.a.i0 r5 = r8.j(r5, r3)
            b.j.a.c.t r6 = r3.a
            boolean r3 = r3.f1959e
        L_0x09be:
            b.j.a.c.h0.s.j r3 = b.j.a.c.h0.s.j.a(r4, r6, r5, r3)
        L_0x09c2:
            r11.f2048h = r3
            r11.c = r2
            b.j.a.c.b r2 = r10.e()
            b.j.a.c.e0.b r3 = r14.f1937e
            java.lang.Object r2 = r2.l(r3)
            r11.f = r2
            b.j.a.c.e0.z r2 = r14.f1936b
            if (r2 != 0) goto L_0x09d7
            goto L_0x0a0c
        L_0x09d7:
            boolean r3 = r2.f1965j
            if (r3 != 0) goto L_0x09de
            r2.g()
        L_0x09de:
            java.util.LinkedList<b.j.a.c.e0.h> r3 = r2.f1968m
            if (r3 == 0) goto L_0x0a0c
            int r3 = r3.size()
            r4 = 1
            if (r3 > r4) goto L_0x09f2
            java.util.LinkedList<b.j.a.c.e0.h> r1 = r2.f1968m
            java.lang.Object r1 = r1.getFirst()
            b.j.a.c.e0.h r1 = (b.j.a.c.e0.h) r1
            goto L_0x0a0d
        L_0x09f2:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.util.LinkedList<b.j.a.c.e0.h> r1 = r2.f1968m
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            r0[r3] = r1
            java.util.LinkedList<b.j.a.c.e0.h> r1 = r2.f1968m
            java.lang.Object r1 = r1.get(r4)
            r0[r4] = r1
            java.lang.String r1 = "Multiple 'any-getters' defined (%s vs %s)"
            r2.h(r1, r0)
            r0 = 0
            throw r0
        L_0x0a0c:
            r1 = 0
        L_0x0a0d:
            if (r1 == 0) goto L_0x0a38
            java.lang.Class r2 = r1.e()
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x0a1c
            goto L_0x0a38
        L_0x0a1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid 'any-getter' annotation on method "
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            java.lang.String r1 = r1.d()
            r2.append(r1)
            java.lang.String r1 = "(): return type is not instance of java.util.Map"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0a38:
            if (r1 == 0) goto L_0x0a7a
            b.j.a.c.i r16 = r1.f()
            b.j.a.c.p r2 = b.j.a.c.p.USE_STATIC_TYPING
            boolean r17 = r10.o(r2)
            b.j.a.c.i r2 = r16.k()
            b.j.a.c.f0.f r18 = r7.b(r10, r2)
            b.j.a.c.n r3 = r7.e(r8, r1)
            if (r3 != 0) goto L_0x0a5d
            r15 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            b.j.a.c.h0.t.t r3 = b.j.a.c.h0.t.t.u(r15, r16, r17, r18, r19, r20, r21)
        L_0x0a5d:
            java.lang.String r4 = r1.d()
            b.j.a.c.t r16 = b.j.a.c.t.a(r4)
            b.j.a.c.d$a r4 = new b.j.a.c.d$a
            r18 = 0
            b.j.a.c.s r20 = b.j.a.c.s.f2293p
            r15 = r4
            r17 = r2
            r19 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            b.j.a.c.h0.a r2 = new b.j.a.c.h0.a
            r2.<init>(r4, r1, r3)
            r11.f2046e = r2
        L_0x0a7a:
            java.util.List<b.j.a.c.h0.c> r1 = r11.c
            b.j.a.c.p r2 = b.j.a.c.p.DEFAULT_VIEW_INCLUSION
            boolean r2 = r10.o(r2)
            int r3 = r1.size()
            b.j.a.c.h0.c[] r4 = new b.j.a.c.h0.c[r3]
            r5 = 0
            r6 = 0
        L_0x0a8a:
            if (r6 >= r3) goto L_0x0aba
            java.lang.Object r9 = r1.get(r6)
            b.j.a.c.h0.c r9 = (b.j.a.c.h0.c) r9
            java.lang.Class<?>[] r10 = r9.z
            if (r10 != 0) goto L_0x0a9d
            if (r2 == 0) goto L_0x0a9a
            r4[r6] = r9
        L_0x0a9a:
            r16 = r1
            goto L_0x0ab5
        L_0x0a9d:
            int r5 = r5 + 1
            int r15 = r10.length
            r16 = r1
            r1 = 1
            if (r15 != r1) goto L_0x0aae
            b.j.a.c.h0.s.e r1 = new b.j.a.c.h0.s.e
            r15 = 0
            r10 = r10[r15]
            r1.<init>(r9, r10)
            goto L_0x0ab3
        L_0x0aae:
            b.j.a.c.h0.s.d r1 = new b.j.a.c.h0.s.d
            r1.<init>(r9, r10)
        L_0x0ab3:
            r4[r6] = r1
        L_0x0ab5:
            int r6 = r6 + 1
            r1 = r16
            goto L_0x0a8a
        L_0x0aba:
            if (r2 == 0) goto L_0x0abf
            if (r5 != 0) goto L_0x0abf
            goto L_0x0ac9
        L_0x0abf:
            java.util.List<b.j.a.c.h0.c> r1 = r11.c
            int r1 = r1.size()
            if (r3 != r1) goto L_0x0ba3
            r11.d = r4
        L_0x0ac9:
            b.j.a.c.a0.i r1 = r7.f2036h
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0ae9
            b.j.a.c.a0.i r1 = r7.f2036h
            java.lang.Iterable r1 = r1.b()
            b.j.a.c.j0.d r1 = (b.j.a.c.j0.d) r1
        L_0x0ad9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0ae9
            java.lang.Object r2 = r1.next()
            b.j.a.c.h0.g r2 = (b.j.a.c.h0.g) r2
            java.util.Objects.requireNonNull(r2)
            goto L_0x0ad9
        L_0x0ae9:
            b.j.a.c.n r1 = r11.a()     // Catch:{ RuntimeException -> 0x0b80 }
            if (r1 != 0) goto L_0x0b0b
            b.j.a.c.e0.b r2 = r14.f1937e
            b.j.a.c.j0.b r2 = r2.f1894p
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0afb
            r2 = 1
            goto L_0x0afc
        L_0x0afb:
            r2 = 0
        L_0x0afc:
            if (r2 == 0) goto L_0x0b0b
            b.j.a.c.c r1 = r11.a
            b.j.a.c.i r1 = r1.a
            b.j.a.c.h0.d r2 = new b.j.a.c.h0.d
            b.j.a.c.h0.c[] r3 = b.j.a.c.h0.t.d.r
            r4 = 0
            r2.<init>(r1, r4, r3, r4)
            r1 = r2
        L_0x0b0b:
            if (r1 != 0) goto L_0x0bc7
            java.lang.Class<?> r1 = r0.f2152h
            java.lang.Class<java.util.Iterator> r2 = java.util.Iterator.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L_0x0b3c
            b.j.a.c.a0.a r1 = r13.f1609i
            b.j.a.c.i0.n r1 = r1.f1589k
            java.lang.Class<java.util.Iterator> r2 = java.util.Iterator.class
            b.j.a.c.i[] r0 = r1.m(r0, r2)
            if (r0 == 0) goto L_0x0b2c
            int r1 = r0.length
            r2 = 1
            if (r1 == r2) goto L_0x0b28
            goto L_0x0b2c
        L_0x0b28:
            r1 = 0
            r0 = r0[r1]
            goto L_0x0b30
        L_0x0b2c:
            b.j.a.c.i r0 = b.j.a.c.i0.n.o()
        L_0x0b30:
            b.j.a.c.h0.s.h r1 = new b.j.a.c.h0.s.h
            b.j.a.c.f0.f r2 = r7.b(r13, r0)
            r9 = r30
            r1.<init>(r0, r9, r2)
            goto L_0x0b75
        L_0x0b3c:
            r9 = r30
            java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L_0x0b69
            b.j.a.c.a0.a r1 = r13.f1609i
            b.j.a.c.i0.n r1 = r1.f1589k
            java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
            b.j.a.c.i[] r0 = r1.m(r0, r2)
            if (r0 == 0) goto L_0x0b5b
            int r1 = r0.length
            r2 = 1
            if (r1 == r2) goto L_0x0b57
            goto L_0x0b5b
        L_0x0b57:
            r1 = 0
            r0 = r0[r1]
            goto L_0x0b5f
        L_0x0b5b:
            b.j.a.c.i r0 = b.j.a.c.i0.n.o()
        L_0x0b5f:
            b.j.a.c.h0.t.r r1 = new b.j.a.c.h0.t.r
            b.j.a.c.f0.f r2 = r7.b(r13, r0)
            r1.<init>(r0, r9, r2)
            goto L_0x0b75
        L_0x0b69:
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0b74
            b.j.a.c.h0.t.v0 r1 = b.j.a.c.h0.t.v0.f2148j
            goto L_0x0b75
        L_0x0b74:
            r1 = 0
        L_0x0b75:
            if (r1 != 0) goto L_0x0bc7
            b.j.a.c.i r0 = r12.a
            java.lang.Class<?> r0 = r0.f2152h
            b.j.a.c.n r1 = r8.E(r0)
            goto L_0x0bc7
        L_0x0b80:
            r0 = move-exception
            r1 = r0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            b.j.a.c.i r2 = r12.a
            r3 = 0
            r0[r3] = r2
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            r3 = 1
            r0[r3] = r2
            java.lang.String r1 = r1.getMessage()
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "Failed to construct BeanSerializer for %s: (%s) %s"
            r8.M(r12, r1, r0)
            r0 = 0
            throw r0
        L_0x0ba3:
            r0 = 2
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 0
            r0[r3] = r2
            java.util.List<b.j.a.c.h0.c> r2 = r11.c
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            java.lang.String r2 = "Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x0bc6:
            r1 = r6
        L_0x0bc7:
            if (r1 == 0) goto L_0x0be9
            b.j.a.c.a0.i r0 = r7.f2036h
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0be9
            b.j.a.c.a0.i r0 = r7.f2036h
            java.lang.Iterable r0 = r0.b()
            b.j.a.c.j0.d r0 = (b.j.a.c.j0.d) r0
        L_0x0bd9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0be9
            java.lang.Object r2 = r0.next()
            b.j.a.c.h0.g r2 = (b.j.a.c.h0.g) r2
            java.util.Objects.requireNonNull(r2)
            goto L_0x0bd9
        L_0x0be9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.f.h(b.j.a.c.y, b.j.a.c.i, b.j.a.c.c, boolean):b.j.a.c.n");
    }

    public Iterable<q> i() {
        Objects.requireNonNull(this.f2036h);
        return new d(i.f1617h);
    }
}
