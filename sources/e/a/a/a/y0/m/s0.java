package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.c;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.j.y.i;
import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class s0 {
    public static final a c = new a((DefaultConstructorMarker) null);
    public final u0 a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9753b;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public s0(u0 u0Var, boolean z) {
        i.e(u0Var, "reportStrategy");
        this.a = u0Var;
        this.f9753b = z;
    }

    public final void a(h hVar, h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((c) it.next()).e());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            if (hashSet.contains(cVar.e())) {
                this.a.a(cVar);
            }
        }
    }

    public final k0 b(k0 k0Var, h hVar) {
        if (b.q.a.a.I1(k0Var)) {
            return k0Var;
        }
        boolean I1 = b.q.a.a.I1(k0Var);
        h k2 = k0Var.k();
        if (!I1) {
            k2 = b.q.a.a.E(hVar, k2);
        }
        return b.q.a.a.F2(k0Var, (List) null, k2, 1);
    }

    public final k0 c(t0 t0Var, h hVar, boolean z, int i2, boolean z2) {
        y0 d = d(new a1(j1.INVARIANT, t0Var.f9755b.L()), t0Var, (r0) null, i2);
        d0 d2 = d.d();
        i.d(d2, "expandedProjection.type");
        k0 t = b.q.a.a.t(d2);
        if (b.q.a.a.I1(t)) {
            return t;
        }
        d.b();
        a(t.k(), hVar);
        k0 m2 = f1.m(b(t, hVar), z);
        i.d(m2, "expandedType.combineAnno…fNeeded(it, isNullable) }");
        if (!z2) {
            return m2;
        }
        v0 p2 = t0Var.f9755b.p();
        i.d(p2, "descriptor.typeConstructor");
        return n0.c(m2, e0.h(hVar, p2, t0Var.c, z, i.b.f9460b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.a.a.a.y0.m.y0 d(e.a.a.a.y0.m.y0 r16, e.a.a.a.y0.m.t0 r17, e.a.a.a.y0.b.r0 r18, int r19) {
        /*
            r15 = this;
            r6 = r15
            r7 = r17
            r0 = r18
            r8 = r19
            e.a.a.a.y0.m.j1 r1 = e.a.a.a.y0.m.j1.INVARIANT
            e.a.a.a.y0.b.q0 r2 = r7.f9755b
            r3 = 100
            if (r8 > r3) goto L_0x02e9
            boolean r2 = r16.c()
            java.lang.String r3 = "TypeUtils.makeStarProjec…ypeParameterDescriptor!!)"
            if (r2 == 0) goto L_0x0018
            goto L_0x0045
        L_0x0018:
            e.a.a.a.y0.m.d0 r2 = r16.d()
            java.lang.String r4 = "underlyingProjection.type"
            e.x.c.i.d(r2, r4)
            e.a.a.a.y0.m.v0 r4 = r2.W0()
            java.lang.String r5 = "constructor"
            e.x.c.i.e(r4, r5)
            e.a.a.a.y0.b.h r4 = r4.d()
            boolean r5 = r4 instanceof e.a.a.a.y0.b.r0
            r9 = 0
            if (r5 == 0) goto L_0x003c
            java.util.Map<e.a.a.a.y0.b.r0, e.a.a.a.y0.m.y0> r5 = r7.d
            java.lang.Object r4 = r5.get(r4)
            e.a.a.a.y0.m.y0 r4 = (e.a.a.a.y0.m.y0) r4
            goto L_0x003d
        L_0x003c:
            r4 = r9
        L_0x003d:
            if (r4 == 0) goto L_0x00ef
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0050
        L_0x0045:
            e.x.c.i.c(r18)
            e.a.a.a.y0.m.y0 r0 = e.a.a.a.y0.m.f1.n(r18)
            e.x.c.i.d(r0, r3)
            return r0
        L_0x0050:
            e.a.a.a.y0.m.d0 r3 = r4.d()
            e.a.a.a.y0.m.i1 r3 = r3.Z0()
            e.a.a.a.y0.m.j1 r4 = r4.b()
            java.lang.String r5 = "argument.projectionKind"
            e.x.c.i.d(r4, r5)
            e.a.a.a.y0.m.j1 r5 = r16.b()
            java.lang.String r8 = "underlyingProjection.projectionKind"
            e.x.c.i.d(r5, r8)
            if (r5 != r4) goto L_0x006d
            goto L_0x007b
        L_0x006d:
            if (r5 != r1) goto L_0x0070
            goto L_0x007b
        L_0x0070:
            if (r4 != r1) goto L_0x0074
            r4 = r5
            goto L_0x007b
        L_0x0074:
            e.a.a.a.y0.m.u0 r5 = r6.a
            e.a.a.a.y0.b.q0 r8 = r7.f9755b
            r5.b(r8, r0, r3)
        L_0x007b:
            if (r0 == 0) goto L_0x0084
            e.a.a.a.y0.m.j1 r5 = r18.u()
            if (r5 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r5 = r1
        L_0x0085:
            java.lang.String r8 = "typeParameterDescriptor?…nce ?: Variance.INVARIANT"
            e.x.c.i.d(r5, r8)
            if (r5 != r4) goto L_0x008d
            goto L_0x009a
        L_0x008d:
            if (r5 != r1) goto L_0x0090
            goto L_0x009a
        L_0x0090:
            if (r4 != r1) goto L_0x0093
            goto L_0x009b
        L_0x0093:
            e.a.a.a.y0.m.u0 r1 = r6.a
            e.a.a.a.y0.b.q0 r5 = r7.f9755b
            r1.b(r5, r0, r3)
        L_0x009a:
            r1 = r4
        L_0x009b:
            e.a.a.a.y0.b.a1.h r0 = r2.k()
            e.a.a.a.y0.b.a1.h r4 = r3.k()
            r15.a(r0, r4)
            boolean r0 = r3 instanceof e.a.a.a.y0.m.u
            if (r0 == 0) goto L_0x00d0
            e.a.a.a.y0.m.u r3 = (e.a.a.a.y0.m.u) r3
            e.a.a.a.y0.b.a1.h r0 = r2.k()
            boolean r2 = b.q.a.a.I1(r3)
            e.a.a.a.y0.b.a1.h r4 = r3.k()
            if (r2 == 0) goto L_0x00bb
            goto L_0x00bf
        L_0x00bb:
            e.a.a.a.y0.b.a1.h r4 = b.q.a.a.E(r0, r4)
        L_0x00bf:
            java.lang.String r0 = "newAnnotations"
            e.x.c.i.e(r4, r0)
            e.a.a.a.y0.m.u r0 = new e.a.a.a.y0.m.u
            e.a.a.a.y0.m.k0 r2 = r3.f9768j
            e.a.a.a.y0.a.g r2 = e.a.a.a.y0.m.o1.c.D(r2)
            r0.<init>(r2, r4)
            goto L_0x00e9
        L_0x00d0:
            e.a.a.a.y0.m.k0 r0 = b.q.a.a.t(r3)
            boolean r3 = r2.X0()
            e.a.a.a.y0.m.k0 r0 = e.a.a.a.y0.m.f1.m(r0, r3)
            java.lang.String r3 = "TypeUtils.makeNullableIf…romType.isMarkedNullable)"
            e.x.c.i.d(r0, r3)
            e.a.a.a.y0.b.a1.h r2 = r2.k()
            e.a.a.a.y0.m.k0 r0 = r15.b(r0, r2)
        L_0x00e9:
            e.a.a.a.y0.m.a1 r2 = new e.a.a.a.y0.m.a1
            r2.<init>(r1, r0)
            return r2
        L_0x00ef:
            e.a.a.a.y0.m.d0 r0 = r16.d()
            e.a.a.a.y0.m.i1 r0 = r0.Z0()
            boolean r2 = b.q.a.a.E1(r0)
            if (r2 == 0) goto L_0x00ff
            goto L_0x02e6
        L_0x00ff:
            e.a.a.a.y0.m.k0 r10 = b.q.a.a.t(r0)
            boolean r0 = b.q.a.a.I1(r10)
            if (r0 != 0) goto L_0x02e6
            java.lang.String r0 = "$this$requiresTypeAliasExpansion"
            e.x.c.i.e(r10, r0)
            e.a.a.a.y0.m.o1.b r0 = e.a.a.a.y0.m.o1.b.f9742h
            boolean r0 = e.a.a.a.y0.m.o1.c.t(r10, r0)
            if (r0 != 0) goto L_0x0118
            goto L_0x02e6
        L_0x0118:
            e.a.a.a.y0.m.v0 r0 = r10.W0()
            e.a.a.a.y0.b.h r2 = r0.d()
            java.util.List r3 = r0.g()
            r3.size()
            java.util.List r3 = r10.V0()
            r3.size()
            boolean r3 = r2 instanceof e.a.a.a.y0.b.r0
            if (r3 == 0) goto L_0x0136
            r1 = r16
            goto L_0x02e4
        L_0x0136:
            boolean r3 = r2 instanceof e.a.a.a.y0.b.q0
            r4 = 0
            if (r3 == 0) goto L_0x021e
            e.a.a.a.y0.b.q0 r2 = (e.a.a.a.y0.b.q0) r2
            boolean r3 = r7.a(r2)
            if (r3 == 0) goto L_0x0164
            e.a.a.a.y0.m.u0 r0 = r6.a
            r0.c(r2)
            e.a.a.a.y0.m.a1 r0 = new e.a.a.a.y0.m.a1
            java.lang.String r3 = "Recursive type alias: "
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r3)
            e.a.a.a.y0.f.d r2 = r2.getName()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            e.a.a.a.y0.m.k0 r2 = e.a.a.a.y0.m.w.d(r2)
            r0.<init>(r1, r2)
            goto L_0x02e8
        L_0x0164:
            java.util.List r1 = r10.V0()
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r11 = b.q.a.a.C(r1, r5)
            r3.<init>(r11)
            java.util.Iterator r1 = r1.iterator()
        L_0x0177:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x01a0
            java.lang.Object r11 = r1.next()
            int r12 = r4 + 1
            if (r4 < 0) goto L_0x019c
            e.a.a.a.y0.m.y0 r11 = (e.a.a.a.y0.m.y0) r11
            java.util.List r13 = r0.g()
            java.lang.Object r4 = r13.get(r4)
            e.a.a.a.y0.b.r0 r4 = (e.a.a.a.y0.b.r0) r4
            int r13 = r8 + 1
            e.a.a.a.y0.m.y0 r4 = r15.d(r11, r7, r4, r13)
            r3.add(r4)
            r4 = r12
            goto L_0x0177
        L_0x019c:
            e.t.g.S()
            throw r9
        L_0x01a0:
            java.lang.String r0 = "typeAliasDescriptor"
            e.x.c.i.e(r2, r0)
            java.lang.String r0 = "arguments"
            e.x.c.i.e(r3, r0)
            e.a.a.a.y0.m.v0 r0 = r2.p()
            java.lang.String r1 = "typeAliasDescriptor.typeConstructor"
            e.x.c.i.d(r0, r1)
            java.util.List r0 = r0.g()
            java.lang.String r1 = "typeAliasDescriptor.typeConstructor.parameters"
            e.x.c.i.d(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = b.q.a.a.C(r0, r5)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x01c9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01e2
            java.lang.Object r4 = r0.next()
            e.a.a.a.y0.b.r0 r4 = (e.a.a.a.y0.b.r0) r4
            java.lang.String r5 = "it"
            e.x.c.i.d(r4, r5)
            e.a.a.a.y0.b.r0 r4 = r4.a()
            r1.add(r4)
            goto L_0x01c9
        L_0x01e2:
            java.util.List r0 = e.t.g.f0(r1, r3)
            java.util.Map r4 = e.t.g.X(r0)
            e.a.a.a.y0.m.t0 r9 = new e.a.a.a.y0.m.t0
            r5 = 0
            r0 = r9
            r1 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            e.a.a.a.y0.b.a1.h r2 = r10.k()
            boolean r3 = r10.X0()
            int r4 = r8 + 1
            r5 = 0
            r0 = r15
            r1 = r9
            e.a.a.a.y0.m.k0 r0 = r0.c(r1, r2, r3, r4, r5)
            e.a.a.a.y0.m.k0 r1 = r15.e(r10, r7, r8)
            boolean r2 = b.q.a.a.E1(r0)
            if (r2 == 0) goto L_0x020f
            goto L_0x0213
        L_0x020f:
            e.a.a.a.y0.m.k0 r0 = e.a.a.a.y0.m.n0.c(r0, r1)
        L_0x0213:
            e.a.a.a.y0.m.a1 r1 = new e.a.a.a.y0.m.a1
            e.a.a.a.y0.m.j1 r2 = r16.b()
            r1.<init>(r2, r0)
            goto L_0x02e4
        L_0x021e:
            e.a.a.a.y0.m.k0 r0 = r15.e(r10, r7, r8)
            e.a.a.a.y0.m.d1 r2 = e.a.a.a.y0.m.d1.d(r0)
            java.lang.String r3 = "TypeSubstitutor.create(substitutedType)"
            e.x.c.i.d(r2, r3)
            java.util.List r3 = r0.V0()
            java.util.Iterator r3 = r3.iterator()
        L_0x0233:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x02db
            java.lang.Object r5 = r3.next()
            int r7 = r4 + 1
            if (r4 < 0) goto L_0x02d7
            e.a.a.a.y0.m.y0 r5 = (e.a.a.a.y0.m.y0) r5
            boolean r8 = r5.c()
            if (r8 != 0) goto L_0x02d4
            e.a.a.a.y0.m.d0 r8 = r5.d()
            java.lang.String r11 = "substitutedArgument.type"
            e.x.c.i.d(r8, r11)
            java.lang.String r12 = "$this$containsTypeAliasParameters"
            e.x.c.i.e(r8, r12)
            e.a.a.a.y0.m.o1.a r12 = e.a.a.a.y0.m.o1.a.f9741h
            boolean r8 = e.a.a.a.y0.m.o1.c.t(r8, r12)
            if (r8 != 0) goto L_0x02d4
            java.util.List r8 = r10.V0()
            java.lang.Object r8 = r8.get(r4)
            e.a.a.a.y0.m.y0 r8 = (e.a.a.a.y0.m.y0) r8
            e.a.a.a.y0.m.v0 r12 = r10.W0()
            java.util.List r12 = r12.g()
            java.lang.Object r4 = r12.get(r4)
            e.a.a.a.y0.b.r0 r4 = (e.a.a.a.y0.b.r0) r4
            boolean r12 = r6.f9753b
            if (r12 == 0) goto L_0x02d4
            e.a.a.a.y0.m.u0 r12 = r6.a
            e.a.a.a.y0.m.d0 r8 = r8.d()
            java.lang.String r13 = "unsubstitutedArgument.type"
            e.x.c.i.d(r8, r13)
            e.a.a.a.y0.m.d0 r5 = r5.d()
            e.x.c.i.d(r5, r11)
            java.lang.String r11 = "typeParameter"
            e.x.c.i.d(r4, r11)
            java.lang.String r11 = "reportStrategy"
            e.x.c.i.e(r12, r11)
            java.lang.String r11 = "unsubstitutedArgument"
            e.x.c.i.e(r8, r11)
            java.lang.String r11 = "typeArgument"
            e.x.c.i.e(r5, r11)
            java.lang.String r11 = "typeParameterDescriptor"
            e.x.c.i.e(r4, r11)
            java.lang.String r11 = "substitutor"
            e.x.c.i.e(r2, r11)
            java.util.List r11 = r4.getUpperBounds()
            java.util.Iterator r11 = r11.iterator()
        L_0x02b3:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x02d4
            java.lang.Object r13 = r11.next()
            e.a.a.a.y0.m.d0 r13 = (e.a.a.a.y0.m.d0) r13
            e.a.a.a.y0.m.d0 r13 = r2.i(r13, r1)
            java.lang.String r14 = "substitutor.safeSubstitu…ound, Variance.INVARIANT)"
            e.x.c.i.d(r13, r14)
            e.a.a.a.y0.m.l1.d r14 = e.a.a.a.y0.m.l1.d.a
            boolean r14 = r14.d(r5, r13)
            if (r14 != 0) goto L_0x02b3
            r12.d(r13, r8, r5, r4)
            goto L_0x02b3
        L_0x02d4:
            r4 = r7
            goto L_0x0233
        L_0x02d7:
            e.t.g.S()
            throw r9
        L_0x02db:
            e.a.a.a.y0.m.a1 r1 = new e.a.a.a.y0.m.a1
            e.a.a.a.y0.m.j1 r2 = r16.b()
            r1.<init>(r2, r0)
        L_0x02e4:
            r0 = r1
            goto L_0x02e8
        L_0x02e6:
            r0 = r16
        L_0x02e8:
            return r0
        L_0x02e9:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Too deep recursion while expanding type alias "
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            e.a.a.a.y0.f.d r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.s0.d(e.a.a.a.y0.m.y0, e.a.a.a.y0.m.t0, e.a.a.a.y0.b.r0, int):e.a.a.a.y0.m.y0");
    }

    public final k0 e(k0 k0Var, t0 t0Var, int i2) {
        v0 W0 = k0Var.W0();
        List<y0> V0 = k0Var.V0();
        ArrayList arrayList = new ArrayList(b.q.a.a.C(V0, 10));
        int i3 = 0;
        for (T next : V0) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                y0 y0Var = (y0) next;
                y0 d = d(y0Var, t0Var, W0.g().get(i3), i2 + 1);
                if (!d.c()) {
                    d = new a1(d.b(), f1.l(d.d(), y0Var.d().X0()));
                }
                arrayList.add(d);
                i3 = i4;
            } else {
                g.S();
                throw null;
            }
        }
        return b.q.a.a.F2(k0Var, arrayList, (h) null, 2);
    }
}
