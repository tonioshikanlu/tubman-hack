package e.a.a.a.y0.d.a.b0.o;

import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.d.a.b0.h;
import e.a.a.a.y0.d.a.b0.m;
import e.a.a.a.y0.d.a.d0.f;
import e.a.a.a.y0.d.a.d0.j;
import e.a.a.a.y0.d.a.d0.u;
import e.a.a.a.y0.d.a.d0.v;
import e.a.a.a.y0.d.a.d0.z;
import e.a.a.a.y0.d.a.z.k;
import e.a.a.a.y0.f.a;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.v0;
import e.x.c.i;

public final class g {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final m f8467b;

    public g(h hVar, m mVar) {
        i.e(hVar, "c");
        i.e(mVar, "typeParameterResolver");
        this.a = hVar;
        this.f8467b = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ff, code lost:
        if (r13 == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011a, code lost:
        if (r4 != null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b2, code lost:
        if ((!r2.isEmpty()) != false) goto L_0x01b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.a.a.a.y0.m.k0 a(e.a.a.a.y0.d.a.d0.j r19, e.a.a.a.y0.d.a.b0.o.a r20, e.a.a.a.y0.m.k0 r21) {
        /*
            r18 = this;
            r6 = r18
            r7 = r20
            r0 = r21
            e.a.a.a.y0.m.j1 r1 = e.a.a.a.y0.m.j1.OUT_VARIANCE
            e.a.a.a.y0.d.a.z.k r2 = e.a.a.a.y0.d.a.z.k.SUPERTYPE
            e.a.a.a.y0.d.a.b0.o.b r3 = e.a.a.a.y0.d.a.b0.o.b.FLEXIBLE_LOWER_BOUND
            if (r0 == 0) goto L_0x0017
            e.a.a.a.y0.b.a1.h r4 = r21.k()
            if (r4 == 0) goto L_0x0017
            r8 = r19
            goto L_0x0020
        L_0x0017:
            e.a.a.a.y0.d.a.b0.f r4 = new e.a.a.a.y0.d.a.b0.f
            e.a.a.a.y0.d.a.b0.h r5 = r6.a
            r8 = r19
            r4.<init>(r5, r8)
        L_0x0020:
            r9 = r4
            e.a.a.a.y0.d.a.d0.i r4 = r19.b()
            r5 = 0
            r10 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0160
            boolean r12 = r4 instanceof e.a.a.a.y0.d.a.d0.g
            if (r12 == 0) goto L_0x0134
            r12 = r4
            e.a.a.a.y0.d.a.d0.g r12 = (e.a.a.a.y0.d.a.d0.g) r12
            e.a.a.a.y0.f.b r13 = r12.e()
            if (r13 == 0) goto L_0x011d
            boolean r4 = r7.c
            if (r4 == 0) goto L_0x009d
            e.a.a.a.y0.f.b r4 = e.a.a.a.y0.d.a.b0.o.i.a
            boolean r4 = e.x.c.i.a(r13, r4)
            if (r4 == 0) goto L_0x009d
            e.a.a.a.y0.d.a.b0.h r4 = r6.a
            e.a.a.a.y0.d.a.b0.c r4 = r4.c
            e.a.a.a.y0.a.j r4 = r4.f8357p
            e.a.a.a.y0.a.j$a r13 = r4.f7680b
            e.a.l[] r14 = e.a.a.a.y0.a.j.d
            r14 = r14[r11]
            java.util.Objects.requireNonNull(r13)
            java.lang.String r13 = "types"
            e.x.c.i.e(r4, r13)
            java.lang.String r13 = "property"
            e.x.c.i.e(r14, r13)
            java.lang.String r13 = r14.getName()
            java.lang.String r13 = e.c0.h.a(r13)
            e.a.a.a.y0.f.d r13 = e.a.a.a.y0.f.d.l(r13)
            java.lang.String r14 = "Name.identifier(className)"
            e.x.c.i.d(r13, r14)
            e.f r14 = r4.a
            java.lang.Object r14 = r14.getValue()
            e.a.a.a.y0.j.y.i r14 = (e.a.a.a.y0.j.y.i) r14
            e.a.a.a.y0.c.a.d r15 = e.a.a.a.y0.c.a.d.FROM_REFLECTION
            e.a.a.a.y0.b.h r14 = r14.b(r13, r15)
            boolean r15 = r14 instanceof e.a.a.a.y0.b.e
            if (r15 != 0) goto L_0x0080
            r14 = r5
        L_0x0080:
            e.a.a.a.y0.b.e r14 = (e.a.a.a.y0.b.e) r14
            if (r14 == 0) goto L_0x0086
            goto L_0x0107
        L_0x0086:
            e.a.a.a.y0.b.x r4 = r4.c
            e.a.a.a.y0.f.a r14 = new e.a.a.a.y0.f.a
            e.a.a.a.y0.f.b r15 = e.a.a.a.y0.a.k.a
            r14.<init>(r15, r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            java.util.List r13 = b.q.a.a.l2(r13)
            e.a.a.a.y0.b.e r14 = r4.a(r14, r13)
            goto L_0x0107
        L_0x009d:
            e.a.a.a.y0.a.p.c r4 = e.a.a.a.y0.a.p.c.f7720m
            e.a.a.a.y0.d.a.b0.h r14 = r6.a
            e.a.a.a.y0.d.a.b0.c r14 = r14.c
            e.a.a.a.y0.b.w r14 = r14.f8356o
            e.a.a.a.y0.a.g r14 = r14.v()
            r15 = 4
            e.a.a.a.y0.b.e r14 = e.a.a.a.y0.a.p.c.k(r4, r13, r14, r5, r15)
            if (r14 == 0) goto L_0x0106
            boolean r13 = r4.i(r14)
            if (r13 == 0) goto L_0x0107
            e.a.a.a.y0.d.a.b0.o.b r13 = r7.f8456b
            if (r13 == r3) goto L_0x0101
            e.a.a.a.y0.d.a.z.k r13 = r7.a
            if (r13 == r2) goto L_0x0101
            e.a.a.a.y0.d.a.b0.o.c r13 = e.a.a.a.y0.d.a.b0.o.c.f8461h
            java.util.List r15 = r19.y()
            java.lang.Object r15 = e.t.g.A(r15)
            e.a.a.a.y0.d.a.d0.v r15 = (e.a.a.a.y0.d.a.d0.v) r15
            boolean r13 = r13.a(r15)
            if (r13 != 0) goto L_0x00d1
            goto L_0x00fe
        L_0x00d1:
            e.a.a.a.y0.b.e r13 = r4.e(r14)
            e.a.a.a.y0.m.v0 r13 = r13.p()
            java.lang.String r15 = "JavaToKotlinClassMap.con…         .typeConstructor"
            e.x.c.i.d(r13, r15)
            java.util.List r13 = r13.g()
            java.lang.String r15 = "JavaToKotlinClassMap.con…ypeConstructor.parameters"
            e.x.c.i.d(r13, r15)
            java.lang.Object r13 = e.t.g.A(r13)
            e.a.a.a.y0.b.r0 r13 = (e.a.a.a.y0.b.r0) r13
            if (r13 == 0) goto L_0x00fe
            e.a.a.a.y0.m.j1 r13 = r13.u()
            if (r13 == 0) goto L_0x00fe
            java.lang.String r15 = "JavaToKotlinClassMap.con….variance ?: return false"
            e.x.c.i.d(r13, r15)
            if (r13 == r1) goto L_0x00fe
            r13 = r10
            goto L_0x00ff
        L_0x00fe:
            r13 = r11
        L_0x00ff:
            if (r13 == 0) goto L_0x0107
        L_0x0101:
            e.a.a.a.y0.b.e r14 = r4.e(r14)
            goto L_0x0107
        L_0x0106:
            r14 = r5
        L_0x0107:
            if (r14 == 0) goto L_0x010a
            goto L_0x0114
        L_0x010a:
            e.a.a.a.y0.d.a.b0.h r4 = r6.a
            e.a.a.a.y0.d.a.b0.c r4 = r4.c
            e.a.a.a.y0.d.a.b0.j r4 = r4.f8352k
            e.a.a.a.y0.b.e r14 = r4.a(r12)
        L_0x0114:
            if (r14 == 0) goto L_0x0160
            e.a.a.a.y0.m.v0 r4 = r14.p()
            if (r4 == 0) goto L_0x0160
            goto L_0x0164
        L_0x011d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Class type should have a FQ name: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x0134:
            boolean r12 = r4 instanceof e.a.a.a.y0.d.a.d0.w
            if (r12 == 0) goto L_0x0149
            e.a.a.a.y0.d.a.b0.m r12 = r6.f8467b
            e.a.a.a.y0.d.a.d0.w r4 = (e.a.a.a.y0.d.a.d0.w) r4
            e.a.a.a.y0.b.r0 r4 = r12.a(r4)
            if (r4 == 0) goto L_0x0147
            e.a.a.a.y0.m.v0 r4 = r4.p()
            goto L_0x0164
        L_0x0147:
            r12 = r5
            goto L_0x0165
        L_0x0149:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown classifier kind: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0160:
            e.a.a.a.y0.m.v0 r4 = r18.b(r19)
        L_0x0164:
            r12 = r4
        L_0x0165:
            if (r12 == 0) goto L_0x0311
            e.a.a.a.y0.d.a.b0.o.b r4 = r7.f8456b
            if (r4 != r3) goto L_0x016d
            r13 = r11
            goto L_0x0179
        L_0x016d:
            boolean r3 = r7.c
            if (r3 != 0) goto L_0x0177
            e.a.a.a.y0.d.a.z.k r3 = r7.a
            if (r3 == r2) goto L_0x0177
            r2 = r10
            goto L_0x0178
        L_0x0177:
            r2 = r11
        L_0x0178:
            r13 = r2
        L_0x0179:
            if (r0 == 0) goto L_0x0180
            e.a.a.a.y0.m.v0 r2 = r21.W0()
            goto L_0x0181
        L_0x0180:
            r2 = r5
        L_0x0181:
            boolean r2 = e.x.c.i.a(r2, r12)
            if (r2 == 0) goto L_0x0194
            boolean r2 = r19.O()
            if (r2 != 0) goto L_0x0194
            if (r13 == 0) goto L_0x0194
            e.a.a.a.y0.m.k0 r0 = r0.a1(r10)
            return r0
        L_0x0194:
            boolean r14 = r19.O()
            java.lang.String r0 = "constructor.parameters"
            if (r14 != 0) goto L_0x01b7
            java.util.List r2 = r19.y()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x01b5
            java.util.List r2 = r12.g()
            e.x.c.i.d(r2, r0)
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r10
            if (r2 == 0) goto L_0x01b5
            goto L_0x01b7
        L_0x01b5:
            r2 = r11
            goto L_0x01b8
        L_0x01b7:
            r2 = r10
        L_0x01b8:
            java.util.List r3 = r12.g()
            e.x.c.i.d(r3, r0)
            java.lang.String r15 = "parameter"
            r0 = 10
            if (r2 == 0) goto L_0x0227
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = b.q.a.a.C(r3, r0)
            r8.<init>(r0)
            java.util.Iterator r10 = r3.iterator()
        L_0x01d2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x021d
            java.lang.Object r0 = r10.next()
            r11 = r0
            e.a.a.a.y0.b.r0 r11 = (e.a.a.a.y0.b.r0) r11
            e.a.a.a.y0.m.g0 r5 = new e.a.a.a.y0.m.g0
            e.a.a.a.y0.d.a.b0.h r0 = r6.a
            e.a.a.a.y0.d.a.b0.c r0 = r0.c
            e.a.a.a.y0.l.m r4 = r0.a
            e.a.a.a.y0.d.a.b0.o.e r3 = new e.a.a.a.y0.d.a.b0.o.e
            r0 = r3
            r1 = r11
            r2 = r18
            r19 = r10
            r10 = r3
            r3 = r20
            r16 = r13
            r13 = r4
            r4 = r12
            r17 = r12
            r12 = r5
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r12.<init>(r13, r10)
            e.a.a.a.y0.d.a.b0.o.j r0 = e.a.a.a.y0.d.a.b0.o.j.d
            e.x.c.i.d(r11, r15)
            if (r14 == 0) goto L_0x0209
            r1 = r7
            goto L_0x020f
        L_0x0209:
            e.a.a.a.y0.d.a.b0.o.b r1 = e.a.a.a.y0.d.a.b0.o.b.INFLEXIBLE
            e.a.a.a.y0.d.a.b0.o.a r1 = r7.a(r1)
        L_0x020f:
            e.a.a.a.y0.m.y0 r0 = r0.h(r11, r1, r12)
            r8.add(r0)
            r10 = r19
            r13 = r16
            r12 = r17
            goto L_0x01d2
        L_0x021d:
            r17 = r12
            r16 = r13
            java.util.List r0 = e.t.g.W(r8)
            goto L_0x0303
        L_0x0227:
            r17 = r12
            r16 = r13
            int r2 = r3.size()
            java.util.List r4 = r19.y()
            int r4 = r4.size()
            if (r2 == r4) goto L_0x0272
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = b.q.a.a.C(r3, r0)
            r1.<init>(r0)
            java.util.Iterator r0 = r3.iterator()
        L_0x0246:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x026c
            java.lang.Object r2 = r0.next()
            e.a.a.a.y0.b.r0 r2 = (e.a.a.a.y0.b.r0) r2
            e.a.a.a.y0.m.a1 r3 = new e.a.a.a.y0.m.a1
            java.lang.String r4 = "p"
            e.x.c.i.d(r2, r4)
            e.a.a.a.y0.f.d r2 = r2.getName()
            java.lang.String r2 = r2.e()
            e.a.a.a.y0.m.k0 r2 = e.a.a.a.y0.m.w.d(r2)
            r3.<init>(r2)
            r1.add(r3)
            goto L_0x0246
        L_0x026c:
            java.util.List r0 = e.t.g.W(r1)
            goto L_0x0303
        L_0x0272:
            java.util.List r2 = r19.y()
            java.lang.Iterable r2 = e.t.g.e0(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = b.q.a.a.C(r2, r0)
            r4.<init>(r0)
            e.t.s r2 = (e.t.s) r2
            java.util.Iterator r0 = r2.iterator()
        L_0x0289:
            r2 = r0
            e.t.t r2 = (e.t.t) r2
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x02ff
            java.lang.Object r2 = r2.next()
            e.t.r r2 = (e.t.r) r2
            int r7 = r2.a
            T r2 = r2.f7937b
            e.a.a.a.y0.d.a.d0.v r2 = (e.a.a.a.y0.d.a.d0.v) r2
            r3.size()
            java.lang.Object r7 = r3.get(r7)
            e.a.a.a.y0.b.r0 r7 = (e.a.a.a.y0.b.r0) r7
            e.a.a.a.y0.d.a.z.k r8 = e.a.a.a.y0.d.a.z.k.COMMON
            r12 = 3
            e.a.a.a.y0.d.a.b0.o.a r13 = e.a.a.a.y0.d.a.b0.o.i.c(r8, r11, r5, r12)
            e.x.c.i.d(r7, r15)
            e.a.a.a.y0.m.j1 r14 = e.a.a.a.y0.m.j1.INVARIANT
            boolean r10 = r2 instanceof e.a.a.a.y0.d.a.d0.z
            if (r10 == 0) goto L_0x02ef
            e.a.a.a.y0.d.a.d0.z r2 = (e.a.a.a.y0.d.a.d0.z) r2
            e.a.a.a.y0.d.a.d0.v r10 = r2.t()
            boolean r2 = r2.H()
            if (r2 == 0) goto L_0x02c5
            r2 = r1
            goto L_0x02c7
        L_0x02c5:
            e.a.a.a.y0.m.j1 r2 = e.a.a.a.y0.m.j1.IN_VARIANCE
        L_0x02c7:
            if (r10 == 0) goto L_0x02ea
            e.a.a.a.y0.m.j1 r5 = r7.u()
            if (r5 != r14) goto L_0x02d0
            goto L_0x02d8
        L_0x02d0:
            e.a.a.a.y0.m.j1 r5 = r7.u()
            if (r2 == r5) goto L_0x02d8
            r5 = 1
            goto L_0x02d9
        L_0x02d8:
            r5 = r11
        L_0x02d9:
            if (r5 == 0) goto L_0x02dc
            goto L_0x02ea
        L_0x02dc:
            r5 = 0
            e.a.a.a.y0.d.a.b0.o.a r8 = e.a.a.a.y0.d.a.b0.o.i.c(r8, r11, r5, r12)
            e.a.a.a.y0.m.d0 r5 = r6.d(r10, r8)
            e.a.a.a.y0.m.y0 r2 = e.a.a.a.y0.m.o1.c.u(r5, r2, r7)
            goto L_0x02f9
        L_0x02ea:
            e.a.a.a.y0.m.y0 r2 = e.a.a.a.y0.d.a.b0.o.i.b(r7, r13)
            goto L_0x02f9
        L_0x02ef:
            e.a.a.a.y0.m.a1 r5 = new e.a.a.a.y0.m.a1
            e.a.a.a.y0.m.d0 r2 = r6.d(r2, r13)
            r5.<init>(r14, r2)
            r2 = r5
        L_0x02f9:
            r4.add(r2)
            r5 = 0
            r10 = 1
            goto L_0x0289
        L_0x02ff:
            java.util.List r0 = e.t.g.W(r4)
        L_0x0303:
            r11 = 0
            r12 = 16
            r7 = r9
            r8 = r17
            r9 = r0
            r10 = r16
            e.a.a.a.y0.m.k0 r0 = e.a.a.a.y0.m.e0.g(r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0311:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.b0.o.g.a(e.a.a.a.y0.d.a.d0.j, e.a.a.a.y0.d.a.b0.o.a, e.a.a.a.y0.m.k0):e.a.a.a.y0.m.k0");
    }

    public final v0 b(j jVar) {
        a l2 = a.l(new b(jVar.P()));
        i.d(l2, "ClassId.topLevel(FqName(…classifierQualifiedName))");
        v0 p2 = this.a.c.d.b().f9578m.a(l2, b.q.a.a.l2(0)).p();
        i.d(p2, "c.components.deserialize…istOf(0)).typeConstructor");
        return p2;
    }

    public final d0 c(f fVar, a aVar, boolean z) {
        j1 j1Var = j1.OUT_VARIANCE;
        j1 j1Var2 = j1.INVARIANT;
        i.e(fVar, "arrayType");
        i.e(aVar, "attr");
        v v = fVar.v();
        u uVar = (u) (!(v instanceof u) ? null : v);
        e.a.a.a.y0.a.i d = uVar != null ? uVar.d() : null;
        if (d != null) {
            k0 r = this.a.c.f8356o.v().r(d);
            i.d(r, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            return aVar.c ? r : e0.c(r, r.a1(true));
        }
        d0 d2 = d(v, i.c(k.COMMON, aVar.c, (r0) null, 2));
        if (aVar.c) {
            if (!z) {
                j1Var = j1Var2;
            }
            k0 h2 = this.a.c.f8356o.v().h(j1Var, d2);
            i.d(h2, "c.module.builtIns.getArr…ctionKind, componentType)");
            return h2;
        }
        k0 h3 = this.a.c.f8356o.v().h(j1Var2, d2);
        i.d(h3, "c.module.builtIns.getArr…INVARIANT, componentType)");
        return e0.c(h3, this.a.c.f8356o.v().h(j1Var, d2).a1(true));
    }

    public final d0 d(v vVar, a aVar) {
        h hVar;
        d0 d;
        k0 a2;
        k0 k0Var;
        i.e(aVar, "attr");
        if (vVar instanceof u) {
            e.a.a.a.y0.a.i d2 = ((u) vVar).d();
            if (d2 != null) {
                k0Var = this.a.c.f8356o.v().u(d2);
            } else {
                k0Var = this.a.c.f8356o.v().y();
            }
            i.d(k0Var, "if (primitiveType != nul….module.builtIns.unitType");
            return k0Var;
        }
        boolean z = false;
        if (vVar instanceof j) {
            j jVar = (j) vVar;
            f fVar = new f(jVar);
            if (!aVar.c && aVar.a != k.SUPERTYPE) {
                z = true;
            }
            boolean O = jVar.O();
            if (O || z) {
                k0 a3 = a(jVar, aVar.a(b.FLEXIBLE_LOWER_BOUND), (k0) null);
                if (!(a3 == null || (a2 = a(jVar, aVar.a(b.FLEXIBLE_UPPER_BOUND), a3)) == null)) {
                    return O ? new k(a3, a2) : e0.c(a3, a2);
                }
            } else {
                k0 a4 = a(jVar, aVar, (k0) null);
                if (a4 != null) {
                    return a4;
                }
            }
            return fVar.e();
        } else if (vVar instanceof f) {
            return c((f) vVar, aVar, false);
        } else {
            if (vVar instanceof z) {
                v t = ((z) vVar).t();
                if (t != null && (d = d(t, aVar)) != null) {
                    return d;
                }
                hVar = this.a;
            } else if (vVar == null) {
                hVar = this.a;
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + vVar);
            }
            k0 l2 = hVar.c.f8356o.v().l();
            i.d(l2, "c.module.builtIns.defaultBound");
            return l2;
        }
    }
}
