package e.a.a.a.y0.m.l1;

import b.q.a.a;
import e.a.a.a.y0.j.l;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.f;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.x;
import e.h;
import e.x.c.i;

public final class m implements l {
    public final l c;
    public final f d;

    public m(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        this.d = fVar;
        l lVar = new l(l.f9392e, fVar);
        i.d(lVar, "OverridingUtil.createWit…efiner(kotlinTypeRefiner)");
        this.c = lVar;
    }

    public l a() {
        return this.c;
    }

    public boolean b(d0 d0Var, d0 d0Var2) {
        i.e(d0Var, "a");
        i.e(d0Var2, "b");
        b bVar = new b(false, false, false, this.d, 6);
        i1 Z0 = d0Var.Z0();
        i1 Z02 = d0Var2.Z0();
        i.e(bVar, "$this$equalTypes");
        i.e(Z0, "a");
        i.e(Z02, "b");
        return f.a.c(bVar, Z0, Z02);
    }

    public f c() {
        return this.d;
    }

    public boolean d(d0 d0Var, d0 d0Var2) {
        i.e(d0Var, "subtype");
        i.e(d0Var2, "supertype");
        b bVar = new b(true, false, false, this.d, 6);
        i1 Z0 = d0Var.Z0();
        i1 Z02 = d0Var2.Z0();
        i.e(bVar, "$this$isSubtypeOf");
        i.e(Z0, "subType");
        i.e(Z02, "superType");
        return f.f(f.a, bVar, Z0, Z02, false, 8);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2, types: [e.a.a.a.y0.m.d0] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.a.a.a.y0.m.k0 e(e.a.a.a.y0.m.k0 r18) {
        /*
            r17 = this;
            java.lang.String r0 = "type"
            r1 = r18
            e.x.c.i.e(r1, r0)
            e.a.a.a.y0.m.v0 r0 = r18.W0()
            boolean r2 = r0 instanceof e.a.a.a.y0.j.s.a.c
            r3 = 1
            r4 = 0
            r5 = 10
            r6 = 0
            if (r2 == 0) goto L_0x0092
            e.a.a.a.y0.j.s.a.c r0 = (e.a.a.a.y0.j.s.a.c) r0
            e.a.a.a.y0.m.y0 r2 = r0.f9408b
            e.a.a.a.y0.m.j1 r7 = r2.b()
            e.a.a.a.y0.m.j1 r8 = e.a.a.a.y0.m.j1.IN_VARIANCE
            if (r7 != r8) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r3 = r4
        L_0x0022:
            if (r3 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r6
        L_0x0026:
            if (r2 == 0) goto L_0x0032
            e.a.a.a.y0.m.d0 r2 = r2.d()
            if (r2 == 0) goto L_0x0032
            e.a.a.a.y0.m.i1 r6 = r2.Z0()
        L_0x0032:
            r10 = r6
            e.a.a.a.y0.m.l1.j r2 = r0.a
            if (r2 != 0) goto L_0x0079
            e.a.a.a.y0.m.y0 r12 = r0.f9408b
            java.util.Collection r2 = r0.h()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = b.q.a.a.C(r2, r5)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x004a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005e
            java.lang.Object r4 = r2.next()
            e.a.a.a.y0.m.d0 r4 = (e.a.a.a.y0.m.d0) r4
            e.a.a.a.y0.m.i1 r4 = r4.Z0()
            r3.add(r4)
            goto L_0x004a
        L_0x005e:
            e.a.a.a.y0.m.l1.j r2 = new e.a.a.a.y0.m.l1.j
            r14 = 0
            java.lang.String r4 = "projection"
            e.x.c.i.e(r12, r4)
            java.lang.String r4 = "supertypes"
            e.x.c.i.e(r3, r4)
            e.a.a.a.y0.m.l1.i r13 = new e.a.a.a.y0.m.l1.i
            r13.<init>(r3)
            r15 = 0
            r16 = 8
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r0.a = r2
        L_0x0079:
            e.a.a.a.y0.m.l1.h r2 = new e.a.a.a.y0.m.l1.h
            e.a.a.a.y0.m.n1.b r8 = e.a.a.a.y0.m.n1.b.FOR_SUBTYPING
            e.a.a.a.y0.m.l1.j r9 = r0.a
            e.x.c.i.c(r9)
            e.a.a.a.y0.b.a1.h r11 = r18.k()
            boolean r12 = r18.X0()
            r13 = 0
            r14 = 32
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r2
        L_0x0092:
            boolean r2 = r0 instanceof e.a.a.a.y0.j.t.s
            if (r2 == 0) goto L_0x00d9
            e.a.a.a.y0.j.t.s r0 = (e.a.a.a.y0.j.t.s) r0
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = b.q.a.a.C(r6, r5)
            r0.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L_0x00a8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c5
            java.lang.Object r3 = r2.next()
            e.a.a.a.y0.m.d0 r3 = (e.a.a.a.y0.m.d0) r3
            boolean r5 = r18.X0()
            e.a.a.a.y0.m.d0 r3 = e.a.a.a.y0.m.f1.k(r3, r5)
            java.lang.String r5 = "TypeUtils.makeNullableAs…t, type.isMarkedNullable)"
            e.x.c.i.d(r3, r5)
            r0.add(r3)
            goto L_0x00a8
        L_0x00c5:
            e.a.a.a.y0.m.b0 r2 = new e.a.a.a.y0.m.b0
            r2.<init>(r0)
            e.a.a.a.y0.b.a1.h r0 = r18.k()
            e.t.o r3 = e.t.o.f7934h
            e.a.a.a.y0.j.y.i r1 = r18.z()
            e.a.a.a.y0.m.k0 r0 = e.a.a.a.y0.m.e0.h(r0, r2, r3, r4, r1)
            return r0
        L_0x00d9:
            boolean r2 = r0 instanceof e.a.a.a.y0.m.b0
            if (r2 == 0) goto L_0x0134
            boolean r2 = r18.X0()
            if (r2 == 0) goto L_0x0134
            e.a.a.a.y0.m.b0 r0 = (e.a.a.a.y0.m.b0) r0
            java.util.LinkedHashSet<e.a.a.a.y0.m.d0> r1 = r0.f9648b
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = b.q.a.a.C(r1, r5)
            r2.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x00f4:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0109
            java.lang.Object r4 = r1.next()
            e.a.a.a.y0.m.d0 r4 = (e.a.a.a.y0.m.d0) r4
            e.a.a.a.y0.m.d0 r4 = e.a.a.a.y0.m.o1.c.U(r4)
            r2.add(r4)
            r4 = r3
            goto L_0x00f4
        L_0x0109:
            if (r4 != 0) goto L_0x010c
            goto L_0x012c
        L_0x010c:
            e.a.a.a.y0.m.d0 r1 = r0.a
            if (r1 == 0) goto L_0x0114
            e.a.a.a.y0.m.d0 r6 = e.a.a.a.y0.m.o1.c.U(r1)
        L_0x0114:
            java.lang.String r1 = "typesToIntersect"
            e.x.c.i.e(r2, r1)
            r2.isEmpty()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r2)
            r1.hashCode()
            e.a.a.a.y0.m.b0 r2 = new e.a.a.a.y0.m.b0
            r2.<init>(r1)
            r2.a = r6
            r6 = r2
        L_0x012c:
            if (r6 == 0) goto L_0x012f
            r0 = r6
        L_0x012f:
            e.a.a.a.y0.m.k0 r0 = r0.e()
            goto L_0x0135
        L_0x0134:
            r0 = r1
        L_0x0135:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.l1.m.e(e.a.a.a.y0.m.k0):e.a.a.a.y0.m.k0");
    }

    public i1 f(i1 i1Var) {
        i1 i1Var2;
        i.e(i1Var, "type");
        if (i1Var instanceof k0) {
            i1Var2 = e((k0) i1Var);
        } else if (i1Var instanceof x) {
            x xVar = (x) i1Var;
            k0 e2 = e(xVar.f9767i);
            k0 e3 = e(xVar.f9768j);
            if (e2 == xVar.f9767i && e3 == xVar.f9768j) {
                i1Var2 = i1Var;
            } else {
                i1Var2 = e0.c(e2, e3);
            }
        } else {
            throw new h();
        }
        return a.z1(i1Var2, i1Var);
    }
}
