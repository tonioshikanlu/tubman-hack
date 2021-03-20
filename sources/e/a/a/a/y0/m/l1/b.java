package e.a.a.a.y0.m.l1;

import b.q.a.a;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.j.t.q;
import e.a.a.a.y0.m.b0;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.g;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.l1.l;
import e.a.a.a.y0.m.n1.d;
import e.a.a.a.y0.m.n1.e;
import e.a.a.a.y0.m.n1.h;
import e.a.a.a.y0.m.n1.j;
import e.a.a.a.y0.m.n1.k;
import e.a.a.a.y0.m.n1.o;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.m.x0;
import e.x.c.i;
import e.x.c.v;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class b extends g implements c {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9699e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9700g;

    /* renamed from: h  reason: collision with root package name */
    public final f f9701h;

    public b(boolean z, boolean z2, boolean z3, f fVar, int i2) {
        z2 = (i2 & 2) != 0 ? true : z2;
        z3 = (i2 & 4) != 0 ? true : z3;
        fVar = (i2 & 8) != 0 ? f.a.a : fVar;
        i.e(fVar, "kotlinTypeRefiner");
        this.f9699e = z;
        this.f = z2;
        this.f9700g = z3;
        this.f9701h = fVar;
    }

    public h A(e.a.a.a.y0.m.n1.f fVar) {
        i.e(fVar, "$this$lowerBound");
        return a.m2(fVar);
    }

    public boolean B(h hVar) {
        i.e(hVar, "$this$isPrimitiveType");
        return a.W1(hVar);
    }

    public boolean D(k kVar, k kVar2) {
        i.e(kVar, "a");
        i.e(kVar2, "b");
        if (!(kVar instanceof v0)) {
            throw new IllegalArgumentException(a.h(kVar).toString());
        } else if (kVar2 instanceof v0) {
            v0 v0Var = (v0) kVar;
            v0 v0Var2 = (v0) kVar2;
            i.e(v0Var, "a");
            i.e(v0Var2, "b");
            if (v0Var instanceof q) {
                return ((q) v0Var).e(v0Var2);
            }
            return v0Var2 instanceof q ? ((q) v0Var2).e(v0Var) : i.a(v0Var, v0Var2);
        } else {
            throw new IllegalArgumentException(a.h(kVar2).toString());
        }
    }

    public List<h> F(h hVar, k kVar) {
        i.e(hVar, "$this$fastCorrespondingSupertypes");
        i.e(kVar, "constructor");
        i.e(hVar, "$this$fastCorrespondingSupertypes");
        i.e(kVar, "constructor");
        i.e(hVar, "$this$fastCorrespondingSupertypes");
        i.e(kVar, "constructor");
        i.e(hVar, "$this$fastCorrespondingSupertypes");
        i.e(kVar, "constructor");
        return null;
    }

    public j G(e.a.a.a.y0.m.n1.i iVar, int i2) {
        i.e(iVar, "$this$get");
        i.e(iVar, "$this$get");
        i.e(iVar, "$this$get");
        return a.s0(this, iVar, i2);
    }

    public j H(h hVar, int i2) {
        i.e(hVar, "$this$getArgumentOrNull");
        i.e(hVar, "$this$getArgumentOrNull");
        i.e(hVar, "$this$getArgumentOrNull");
        return a.y0(this, hVar, i2);
    }

    public boolean I(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$hasFlexibleNullability");
        i.e(gVar, "$this$hasFlexibleNullability");
        i.e(gVar, "$this$hasFlexibleNullability");
        return a.p1(this, gVar);
    }

    public boolean K(h hVar) {
        i.e(hVar, "$this$isClassType");
        i.e(hVar, "$this$isClassType");
        i.e(hVar, "$this$isClassType");
        i.e(hVar, "$this$isClassType");
        return W(d(hVar));
    }

    public boolean L(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$isDefinitelyNotNullType");
        i.e(gVar, "$this$isDefinitelyNotNullType");
        i.e(gVar, "$this$isDefinitelyNotNullType");
        return a.D1(this, gVar);
    }

    public boolean M(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$isDynamic");
        i.e(gVar, "$this$isDynamic");
        i.e(gVar, "$this$isDynamic");
        return a.F1(this, gVar);
    }

    public boolean N() {
        return this.f9699e;
    }

    public boolean O(h hVar) {
        i.e(hVar, "$this$isIntegerLiteralType");
        i.e(hVar, "$this$isIntegerLiteralType");
        i.e(hVar, "$this$isIntegerLiteralType");
        i.e(hVar, "$this$isIntegerLiteralType");
        return Y(d(hVar));
    }

    public e.a.a.a.y0.m.n1.g P(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "type");
        if (gVar instanceof d0) {
            Objects.requireNonNull(l.f9715b);
            return l.a.a.f(((d0) gVar).Z0());
        }
        throw new IllegalArgumentException(a.h(gVar).toString());
    }

    public e.a.a.a.y0.m.n1.g Q(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "type");
        if (gVar instanceof d0) {
            return this.f9701h.g((d0) gVar);
        }
        throw new IllegalArgumentException(a.h(gVar).toString());
    }

    public g.a R(h hVar) {
        i.e(hVar, "type");
        i.e(this, "$this$classicSubstitutionSupertypePolicy");
        i.e(hVar, "type");
        if (hVar instanceof k0) {
            return new a(this, x0.f9769b.a((d0) hVar).c());
        }
        throw new IllegalArgumentException(a.h(hVar).toString());
    }

    public e.a.a.a.y0.m.n1.i S(h hVar) {
        i.e(hVar, "$this$asArgumentList");
        i.e(hVar, "$this$asArgumentList");
        if (hVar instanceof k0) {
            return (e.a.a.a.y0.m.n1.i) hVar;
        }
        throw new IllegalArgumentException(b.e.a.a.a.t(hVar, b.e.a.a.a.D("ClassicTypeSystemContext couldn't handle: ", hVar, ", ")).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.a.a.a.y0.m.n1.h T(e.a.a.a.y0.m.n1.h r21, e.a.a.a.y0.m.n1.b r22) {
        /*
            r20 = this;
            r0 = r21
            r8 = r22
            java.lang.String r1 = "type"
            e.x.c.i.e(r0, r1)
            java.lang.String r2 = "status"
            e.x.c.i.e(r8, r2)
            e.x.c.i.e(r0, r1)
            e.x.c.i.e(r8, r2)
            boolean r3 = r0 instanceof e.a.a.a.y0.m.k0
            if (r3 == 0) goto L_0x01cb
            r9 = r0
            e.a.a.a.y0.m.k0 r9 = (e.a.a.a.y0.m.k0) r9
            e.x.c.i.e(r9, r1)
            e.x.c.i.e(r8, r2)
            e.a.a.a.y0.m.j1 r10 = e.a.a.a.y0.m.j1.INVARIANT
            java.util.List r0 = r9.V0()
            int r0 = r0.size()
            e.a.a.a.y0.m.v0 r1 = r9.W0()
            java.util.List r1 = r1.g()
            int r1 = r1.size()
            r11 = 0
            if (r0 == r1) goto L_0x003b
            goto L_0x006a
        L_0x003b:
            java.util.List r12 = r9.V0()
            boolean r0 = r12 instanceof java.util.Collection
            r13 = 0
            r1 = 1
            if (r0 == 0) goto L_0x004c
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x004c
            goto L_0x0068
        L_0x004c:
            java.util.Iterator r0 = r12.iterator()
        L_0x0050:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r0.next()
            e.a.a.a.y0.m.y0 r2 = (e.a.a.a.y0.m.y0) r2
            e.a.a.a.y0.m.j1 r2 = r2.b()
            if (r2 != r10) goto L_0x0064
            r2 = r1
            goto L_0x0065
        L_0x0064:
            r2 = r13
        L_0x0065:
            if (r2 != 0) goto L_0x0050
            r1 = r13
        L_0x0068:
            if (r1 == 0) goto L_0x006d
        L_0x006a:
            r4 = r11
            goto L_0x01b5
        L_0x006d:
            e.a.a.a.y0.m.v0 r0 = r9.W0()
            java.util.List r0 = r0.g()
            java.lang.String r1 = "type.constructor.parameters"
            e.x.c.i.d(r0, r1)
            java.util.List r0 = e.t.g.f0(r12, r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r1 = 10
            int r1 = b.q.a.a.C(r0, r1)
            r14.<init>(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r15 = r0.iterator()
        L_0x008f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r15.next()
            e.j r0 = (e.j) r0
            A r1 = r0.f7906h
            r3 = r1
            e.a.a.a.y0.m.y0 r3 = (e.a.a.a.y0.m.y0) r3
            B r0 = r0.f7907i
            r6 = r0
            e.a.a.a.y0.b.r0 r6 = (e.a.a.a.y0.b.r0) r6
            e.a.a.a.y0.m.j1 r0 = r3.b()
            if (r0 != r10) goto L_0x00ac
            goto L_0x00fc
        L_0x00ac:
            boolean r0 = r3.c()
            if (r0 != 0) goto L_0x00c5
            e.a.a.a.y0.m.j1 r0 = r3.b()
            e.a.a.a.y0.m.j1 r1 = e.a.a.a.y0.m.j1.IN_VARIANCE
            if (r0 != r1) goto L_0x00c5
            e.a.a.a.y0.m.d0 r0 = r3.d()
            e.a.a.a.y0.m.i1 r0 = r0.Z0()
            r16 = r0
            goto L_0x00c7
        L_0x00c5:
            r16 = r11
        L_0x00c7:
            e.a.a.a.y0.m.l1.h r17 = new e.a.a.a.y0.m.l1.h
            java.lang.String r0 = "parameter"
            e.x.c.i.d(r6, r0)
            java.lang.String r0 = "captureStatus"
            e.x.c.i.e(r8, r0)
            java.lang.String r0 = "projection"
            e.x.c.i.e(r3, r0)
            java.lang.String r0 = "typeParameter"
            e.x.c.i.e(r6, r0)
            e.a.a.a.y0.m.l1.j r18 = new e.a.a.a.y0.m.l1.j
            r19 = 0
            r5 = 0
            r7 = 6
            r4 = 0
            r2 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r5 = 0
            r6 = 0
            r7 = 56
            r0 = r17
            r1 = r22
            r3 = r16
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            e.a.a.a.y0.m.y0 r3 = e.a.a.a.y0.m.o1.c.j(r17)
        L_0x00fc:
            r14.add(r3)
            goto L_0x008f
        L_0x0100:
            e.a.a.a.y0.m.x0$a r0 = e.a.a.a.y0.m.x0.f9769b
            e.a.a.a.y0.m.v0 r1 = r9.W0()
            e.a.a.a.y0.m.b1 r0 = r0.b(r1, r14)
            e.a.a.a.y0.m.d1 r0 = r0.c()
            int r1 = r12.size()
        L_0x0112:
            if (r13 >= r1) goto L_0x01b4
            java.lang.Object r2 = r12.get(r13)
            e.a.a.a.y0.m.y0 r2 = (e.a.a.a.y0.m.y0) r2
            java.lang.Object r3 = r14.get(r13)
            e.a.a.a.y0.m.y0 r3 = (e.a.a.a.y0.m.y0) r3
            e.a.a.a.y0.m.j1 r4 = r2.b()
            if (r4 != r10) goto L_0x0128
            goto L_0x01b0
        L_0x0128:
            e.a.a.a.y0.m.v0 r4 = r9.W0()
            java.util.List r4 = r4.g()
            java.lang.Object r4 = r4.get(r13)
            java.lang.String r5 = "type.constructor.parameters[index]"
            e.x.c.i.d(r4, r5)
            e.a.a.a.y0.b.r0 r4 = (e.a.a.a.y0.b.r0) r4
            java.util.List r4 = r4.getUpperBounds()
            java.lang.String r5 = "type.constructor.parameters[index].upperBounds"
            e.x.c.i.d(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x014d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0170
            java.lang.Object r6 = r4.next()
            e.a.a.a.y0.m.d0 r6 = (e.a.a.a.y0.m.d0) r6
            e.a.a.a.y0.m.l1.l$a r7 = e.a.a.a.y0.m.l1.l.f9715b
            java.util.Objects.requireNonNull(r7)
            e.a.a.a.y0.m.l1.m r7 = e.a.a.a.y0.m.l1.l.a.a
            e.a.a.a.y0.m.d0 r6 = r0.i(r6, r10)
            e.a.a.a.y0.m.i1 r6 = r6.Z0()
            e.a.a.a.y0.m.i1 r6 = r7.f(r6)
            r5.add(r6)
            goto L_0x014d
        L_0x0170:
            boolean r4 = r2.c()
            if (r4 != 0) goto L_0x0194
            e.a.a.a.y0.m.j1 r4 = r2.b()
            e.a.a.a.y0.m.j1 r6 = e.a.a.a.y0.m.j1.OUT_VARIANCE
            if (r4 != r6) goto L_0x0194
            e.a.a.a.y0.m.l1.l$a r4 = e.a.a.a.y0.m.l1.l.f9715b
            java.util.Objects.requireNonNull(r4)
            e.a.a.a.y0.m.l1.m r4 = e.a.a.a.y0.m.l1.l.a.a
            e.a.a.a.y0.m.d0 r2 = r2.d()
            e.a.a.a.y0.m.i1 r2 = r2.Z0()
            e.a.a.a.y0.m.i1 r2 = r4.f(r2)
            r5.add(r2)
        L_0x0194:
            e.a.a.a.y0.m.d0 r2 = r3.d()
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType"
            java.util.Objects.requireNonNull(r2, r3)
            e.a.a.a.y0.m.l1.h r2 = (e.a.a.a.y0.m.l1.h) r2
            e.a.a.a.y0.m.l1.j r2 = r2.f9703j
            java.util.Objects.requireNonNull(r2)
            java.lang.String r3 = "supertypes"
            e.x.c.i.e(r5, r3)
            e.a.a.a.y0.m.l1.k r3 = new e.a.a.a.y0.m.l1.k
            r3.<init>(r5)
            r2.c = r3
        L_0x01b0:
            int r13 = r13 + 1
            goto L_0x0112
        L_0x01b4:
            r4 = r14
        L_0x01b5:
            if (r4 == 0) goto L_0x01ca
            e.a.a.a.y0.b.a1.h r2 = r9.k()
            e.a.a.a.y0.m.v0 r3 = r9.W0()
            boolean r5 = r9.X0()
            r6 = 0
            r7 = 16
            e.a.a.a.y0.m.k0 r11 = e.a.a.a.y0.m.e0.g(r2, r3, r4, r5, r6, r7)
        L_0x01ca:
            return r11
        L_0x01cb:
            java.lang.String r1 = "ClassicTypeSystemContext couldn't handle: "
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = b.e.a.a.a.D(r1, r0, r2)
            java.lang.String r0 = b.e.a.a.a.t(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.l1.b.T(e.a.a.a.y0.m.n1.h, e.a.a.a.y0.m.n1.b):e.a.a.a.y0.m.n1.h");
    }

    public e.a.a.a.y0.m.n1.l U(k kVar, int i2) {
        i.e(kVar, "$this$getParameter");
        i.e(kVar, "$this$getParameter");
        r0 r0Var = ((v0) kVar).g().get(i2);
        i.d(r0Var, "this.parameters[index]");
        return r0Var;
    }

    public o V(e.a.a.a.y0.m.n1.l lVar) {
        i.e(lVar, "$this$getVariance");
        i.e(lVar, "$this$getVariance");
        if (lVar instanceof r0) {
            j1 u = ((r0) lVar).u();
            i.d(u, "this.variance");
            return a.M(u);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + v.a(lVar.getClass())).toString());
    }

    public boolean W(k kVar) {
        i.e(kVar, "$this$isClassTypeConstructor");
        return a.C1(kVar);
    }

    public boolean X(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$isError");
        i.e(gVar, "$this$isError");
        if (gVar instanceof d0) {
            return a.I1((d0) gVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + v.a(gVar.getClass())).toString());
    }

    public boolean Y(k kVar) {
        i.e(kVar, "$this$isIntegerLiteralTypeConstructor");
        return a.P1(kVar);
    }

    public boolean Z(k kVar) {
        i.e(kVar, "$this$isIntersection");
        i.e(kVar, "$this$isIntersection");
        if (kVar instanceof v0) {
            return kVar instanceof b0;
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public h a(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$asSimpleType");
        return a.u(gVar);
    }

    public boolean a0(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$isNothing");
        i.e(gVar, "$this$isNothing");
        i.e(gVar, "$this$isNothing");
        return a.T1(this, gVar);
    }

    public boolean b(k kVar, k kVar2) {
        i.e(kVar, "c1");
        i.e(kVar2, "c2");
        return a.H1(kVar, kVar2);
    }

    public boolean b0(h hVar) {
        i.e(hVar, "$this$isStubType");
        i.e(hVar, "$this$isStubType");
        if (hVar instanceof k0) {
            return false;
        }
        throw new IllegalArgumentException(b.e.a.a.a.t(hVar, b.e.a.a.a.D("ClassicTypeSystemContext couldn't handle: ", hVar, ", ")).toString());
    }

    public int c(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$argumentsCount");
        return a.m(gVar);
    }

    public int c0(k kVar) {
        i.e(kVar, "$this$parametersCount");
        i.e(kVar, "$this$parametersCount");
        if (kVar instanceof v0) {
            return ((v0) kVar).g().size();
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public k d(h hVar) {
        i.e(hVar, "$this$typeConstructor");
        return a.n3(hVar);
    }

    public int d0(e.a.a.a.y0.m.n1.i iVar) {
        i.e(iVar, "$this$size");
        i.e(iVar, "$this$size");
        i.e(iVar, "$this$size");
        return a.V2(this, iVar);
    }

    public h e(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$upperBoundIfFlexible");
        i.e(gVar, "$this$upperBoundIfFlexible");
        i.e(gVar, "$this$upperBoundIfFlexible");
        return a.r3(this, gVar);
    }

    public Collection<e.a.a.a.y0.m.n1.g> e0(k kVar) {
        i.e(kVar, "$this$supertypes");
        i.e(kVar, "$this$supertypes");
        if (kVar instanceof v0) {
            Collection<d0> h2 = ((v0) kVar).h();
            i.d(h2, "this.supertypes");
            return h2;
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(kVar, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar, ", ")).toString());
    }

    public boolean f(h hVar) {
        i.e(hVar, "$this$isMarkedNullable");
        return a.S1(hVar);
    }

    public h g(h hVar, boolean z) {
        i.e(hVar, "$this$withNullability");
        return a.t3(hVar, z);
    }

    public boolean h(k kVar) {
        i.e(kVar, "$this$isInlineClass");
        return a.N1(kVar);
    }

    public e.a.a.a.y0.m.n1.g i(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$getSubstitutedUnderlyingType");
        return a.f1(gVar);
    }

    public e.a.a.a.y0.m.n1.g j(e.a.a.a.y0.m.n1.l lVar) {
        i.e(lVar, "$this$getRepresentativeUpperBound");
        return a.e1(lVar);
    }

    public h k(e.a.a.a.y0.m.n1.f fVar) {
        i.e(fVar, "$this$upperBound");
        return a.q3(fVar);
    }

    public boolean l(k kVar) {
        i.e(kVar, "$this$isNothingConstructor");
        return a.U1(kVar);
    }

    public j m(e.a.a.a.y0.m.n1.g gVar, int i2) {
        i.e(gVar, "$this$getArgument");
        return a.x0(gVar, i2);
    }

    public h n(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$lowerBoundIfFlexible");
        i.e(gVar, "$this$lowerBoundIfFlexible");
        i.e(gVar, "$this$lowerBoundIfFlexible");
        return a.n2(this, gVar);
    }

    public k o(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$typeConstructor");
        i.e(gVar, "$this$typeConstructor");
        i.e(gVar, "$this$typeConstructor");
        return a.o3(this, gVar);
    }

    public o p(j jVar) {
        i.e(jVar, "$this$getVariance");
        return a.k1(jVar);
    }

    public boolean q(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$isMarkedNullable");
        return a.R1(this, gVar);
    }

    public boolean r(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$isNullableType");
        return a.V1(gVar);
    }

    public e.a.a.a.y0.m.n1.l s(k kVar) {
        i.e(kVar, "$this$getTypeParameterClassifier");
        return a.h1(kVar);
    }

    public boolean t(j jVar) {
        i.e(jVar, "$this$isStarProjection");
        return a.X1(jVar);
    }

    public e.a.a.a.y0.m.n1.f u(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$asFlexibleType");
        return a.q(gVar);
    }

    public d v(h hVar) {
        i.e(hVar, "$this$asDefinitelyNotNullType");
        return a.n(hVar);
    }

    public boolean w(h hVar, h hVar2) {
        i.e(hVar, "a");
        i.e(hVar2, "b");
        return a.t1(hVar, hVar2);
    }

    public e.a.a.a.y0.m.n1.g x(j jVar) {
        i.e(jVar, "$this$getType");
        return a.g1(jVar);
    }

    public e y(e.a.a.a.y0.m.n1.f fVar) {
        i.e(fVar, "$this$asDynamicType");
        return a.o(fVar);
    }

    public e.a.a.a.y0.m.n1.g z(e.a.a.a.y0.m.n1.g gVar) {
        i.e(gVar, "$this$makeNullable");
        return a.p2(this, gVar);
    }
}
