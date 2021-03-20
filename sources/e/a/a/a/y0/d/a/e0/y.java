package e.a.a.a.y0.d.a.e0;

import b.q.a.a;
import e.a.a.a.y0.d.a.b0.o.k;
import e.a.a.a.y0.d.a.t;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.x;
import e.h;
import e.x.b.l;
import e.x.c.i;

public final class y {
    public static final b a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f8568b;

    static {
        b bVar = t.f8582j;
        i.d(bVar, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        a = new b(bVar);
        b bVar2 = t.f8583k;
        i.d(bVar2, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
        f8568b = new b(bVar2);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.a.a.y0.d.a.e0.u a(e.a.a.a.y0.m.k0 r19, e.x.b.l<? super java.lang.Integer, e.a.a.a.y0.d.a.e0.d> r20, int r21, e.a.a.a.y0.d.a.e0.w r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            boolean r3 = d(r22)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x001e
            java.util.List r3 = r19.V0()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x001e
            e.a.a.a.y0.d.a.e0.u r1 = new e.a.a.a.y0.d.a.e0.u
            r1.<init>(r0, r5, r4)
            return r1
        L_0x001e:
            e.a.a.a.y0.m.v0 r3 = r19.W0()
            e.a.a.a.y0.b.h r3 = r3.d()
            if (r3 == 0) goto L_0x01e6
            java.lang.String r6 = "constructor.declarationD…pleResult(this, 1, false)"
            e.x.c.i.d(r3, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)
            java.lang.Object r6 = r1.invoke(r6)
            e.a.a.a.y0.d.a.e0.d r6 = (e.a.a.a.y0.d.a.e0.d) r6
            boolean r7 = d(r22)
            if (r7 != 0) goto L_0x003e
            goto L_0x008c
        L_0x003e:
            boolean r7 = r3 instanceof e.a.a.a.y0.b.e
            if (r7 != 0) goto L_0x0043
            goto L_0x008c
        L_0x0043:
            e.a.a.a.y0.a.p.c r7 = e.a.a.a.y0.a.p.c.f7720m
            e.a.a.a.y0.d.a.e0.e r8 = r6.f8500b
            if (r8 != 0) goto L_0x004a
            goto L_0x008c
        L_0x004a:
            int r8 = r8.ordinal()
            if (r8 == 0) goto L_0x006c
            if (r8 == r5) goto L_0x0053
            goto L_0x008c
        L_0x0053:
            e.a.a.a.y0.d.a.e0.w r8 = e.a.a.a.y0.d.a.e0.w.FLEXIBLE_UPPER
            if (r2 != r8) goto L_0x008c
            r8 = r3
            e.a.a.a.y0.b.e r8 = (e.a.a.a.y0.b.e) r8
            boolean r9 = r7.i(r8)
            if (r9 == 0) goto L_0x008c
            e.a.a.a.y0.b.e r3 = r7.e(r8)
            e.a.a.a.y0.d.a.e0.c r7 = new e.a.a.a.y0.d.a.e0.c
            e.a.a.a.y0.d.a.e0.b r8 = f8568b
            r7.<init>(r3, r8)
            goto L_0x0090
        L_0x006c:
            e.a.a.a.y0.d.a.e0.w r8 = e.a.a.a.y0.d.a.e0.w.FLEXIBLE_LOWER
            if (r2 != r8) goto L_0x008c
            r8 = r3
            e.a.a.a.y0.b.e r8 = (e.a.a.a.y0.b.e) r8
            boolean r9 = r7.h(r8)
            if (r9 == 0) goto L_0x008c
            java.lang.String r3 = "mutable"
            e.x.c.i.e(r8, r3)
            java.util.HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.b> r9 = e.a.a.a.y0.a.p.c.f7717j
            e.a.a.a.y0.b.e r3 = r7.f(r8, r9, r3)
            e.a.a.a.y0.d.a.e0.c r7 = new e.a.a.a.y0.d.a.e0.c
            e.a.a.a.y0.d.a.e0.b r8 = f8568b
            r7.<init>(r3, r8)
            goto L_0x0090
        L_0x008c:
            e.a.a.a.y0.d.a.e0.c r7 = c(r3)
        L_0x0090:
            T r3 = r7.a
            e.a.a.a.y0.b.h r3 = (e.a.a.a.y0.b.h) r3
            e.a.a.a.y0.b.a1.h r7 = r7.f8498b
            e.a.a.a.y0.m.v0 r9 = r3.p()
            java.lang.String r8 = "enhancedClassifier.typeConstructor"
            e.x.c.i.d(r9, r8)
            int r10 = r21 + 1
            if (r7 == 0) goto L_0x00a5
            r11 = r5
            goto L_0x00a6
        L_0x00a5:
            r11 = r4
        L_0x00a6:
            java.util.List r12 = r19.V0()
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = b.q.a.a.C(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
            r14 = r4
        L_0x00ba:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x0129
            java.lang.Object r15 = r12.next()
            int r16 = r14 + 1
            if (r14 < 0) goto L_0x0124
            e.a.a.a.y0.m.y0 r15 = (e.a.a.a.y0.m.y0) r15
            boolean r17 = r15.c()
            if (r17 == 0) goto L_0x00e8
            int r10 = r10 + 1
            e.a.a.a.y0.m.v0 r15 = r3.p()
            e.x.c.i.d(r15, r8)
            java.util.List r15 = r15.g()
            java.lang.Object r14 = r15.get(r14)
            e.a.a.a.y0.b.r0 r14 = (e.a.a.a.y0.b.r0) r14
            e.a.a.a.y0.m.y0 r14 = e.a.a.a.y0.m.f1.n(r14)
            goto L_0x011c
        L_0x00e8:
            e.a.a.a.y0.m.d0 r17 = r15.d()
            e.a.a.a.y0.m.i1 r4 = r17.Z0()
            e.a.a.a.y0.d.a.e0.k r4 = b(r4, r1, r10)
            if (r11 != 0) goto L_0x00fd
            boolean r11 = r4.c
            if (r11 == 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r11 = 0
            goto L_0x00fe
        L_0x00fd:
            r11 = r5
        L_0x00fe:
            int r5 = r4.f8545b
            int r10 = r10 + r5
            e.a.a.a.y0.m.d0 r4 = r4.a()
            e.a.a.a.y0.m.j1 r5 = r15.b()
            java.lang.String r15 = "arg.projectionKind"
            e.x.c.i.d(r5, r15)
            java.util.List r15 = r9.g()
            java.lang.Object r14 = r15.get(r14)
            e.a.a.a.y0.b.r0 r14 = (e.a.a.a.y0.b.r0) r14
            e.a.a.a.y0.m.y0 r14 = e.a.a.a.y0.m.o1.c.u(r4, r5, r14)
        L_0x011c:
            r13.add(r14)
            r14 = r16
            r4 = 0
            r5 = 1
            goto L_0x00ba
        L_0x0124:
            e.t.g.S()
            r0 = 0
            throw r0
        L_0x0129:
            boolean r1 = d(r22)
            if (r1 != 0) goto L_0x0130
            goto L_0x013e
        L_0x0130:
            e.a.a.a.y0.d.a.e0.g r1 = r6.a
            if (r1 != 0) goto L_0x0135
            goto L_0x013e
        L_0x0135:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0155
            r2 = 1
            if (r1 == r2) goto L_0x014b
        L_0x013e:
            boolean r1 = r19.X0()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            e.a.a.a.y0.d.a.e0.c r1 = c(r1)
            goto L_0x015f
        L_0x014b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            e.a.a.a.y0.d.a.e0.c r2 = new e.a.a.a.y0.d.a.e0.c
            e.a.a.a.y0.d.a.e0.b r3 = a
            r2.<init>(r1, r3)
            goto L_0x015e
        L_0x0155:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            e.a.a.a.y0.d.a.e0.c r2 = new e.a.a.a.y0.d.a.e0.c
            e.a.a.a.y0.d.a.e0.b r3 = a
            r2.<init>(r1, r3)
        L_0x015e:
            r1 = r2
        L_0x015f:
            T r2 = r1.a
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            e.a.a.a.y0.b.a1.h r1 = r1.f8498b
            if (r11 != 0) goto L_0x0170
            if (r1 == 0) goto L_0x016e
            goto L_0x0170
        L_0x016e:
            r3 = 0
            goto L_0x0171
        L_0x0170:
            r3 = 1
        L_0x0171:
            int r4 = r10 - r21
            if (r3 != 0) goto L_0x017c
            e.a.a.a.y0.d.a.e0.u r1 = new e.a.a.a.y0.d.a.e0.u
            r3 = 0
            r1.<init>(r0, r4, r3)
            return r1
        L_0x017c:
            r3 = 0
            r5 = 3
            e.a.a.a.y0.b.a1.h[] r5 = new e.a.a.a.y0.b.a1.h[r5]
            e.a.a.a.y0.b.a1.h r8 = r19.k()
            r5[r3] = r8
            r3 = 1
            r5[r3] = r7
            r7 = 2
            r5[r7] = r1
            java.util.List r5 = e.t.g.D(r5)
            r7 = r5
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r7 = r7.size()
            if (r7 == 0) goto L_0x01da
            if (r7 == r3) goto L_0x01a5
            e.a.a.a.y0.b.a1.k r3 = new e.a.a.a.y0.b.a1.k
            java.util.List r5 = e.t.g.W(r5)
            r3.<init>((java.util.List<? extends e.a.a.a.y0.b.a1.h>) r5)
            goto L_0x01ab
        L_0x01a5:
            java.lang.Object r3 = e.t.g.O(r5)
            e.a.a.a.y0.b.a1.h r3 = (e.a.a.a.y0.b.a1.h) r3
        L_0x01ab:
            r8 = r3
            r12 = 0
            r3 = 16
            r10 = r13
            r11 = r2
            r13 = r3
            e.a.a.a.y0.m.k0 r2 = e.a.a.a.y0.m.e0.g(r8, r9, r10, r11, r12, r13)
            boolean r3 = r6.c
            if (r3 == 0) goto L_0x01c0
            e.a.a.a.y0.d.a.e0.f r3 = new e.a.a.a.y0.d.a.e0.f
            r3.<init>(r2)
            r2 = r3
        L_0x01c0:
            if (r1 == 0) goto L_0x01c9
            boolean r1 = r6.d
            if (r1 == 0) goto L_0x01c9
            r18 = 1
            goto L_0x01cb
        L_0x01c9:
            r18 = 0
        L_0x01cb:
            if (r18 == 0) goto L_0x01d1
            e.a.a.a.y0.m.i1 r2 = b.q.a.a.u3(r0, r2)
        L_0x01d1:
            e.a.a.a.y0.d.a.e0.u r0 = new e.a.a.a.y0.d.a.e0.u
            e.a.a.a.y0.m.k0 r2 = (e.a.a.a.y0.m.k0) r2
            r1 = 1
            r0.<init>(r2, r4, r1)
            return r0
        L_0x01da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "At least one Annotations object expected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01e6:
            r1 = r5
            e.a.a.a.y0.d.a.e0.u r2 = new e.a.a.a.y0.d.a.e0.u
            r3 = 0
            r2.<init>(r0, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.e0.y.a(e.a.a.a.y0.m.k0, e.x.b.l, int, e.a.a.a.y0.d.a.e0.w):e.a.a.a.y0.d.a.e0.u");
    }

    public static final k b(i1 i1Var, l<? super Integer, d> lVar, int i2) {
        i1 i1Var2;
        boolean z = false;
        if (a.I1(i1Var)) {
            return new k(i1Var, 1, false);
        }
        if (i1Var instanceof x) {
            x xVar = (x) i1Var;
            u a2 = a(xVar.f9767i, lVar, i2, w.FLEXIBLE_LOWER);
            u a3 = a(xVar.f9768j, lVar, i2, w.FLEXIBLE_UPPER);
            int i3 = a2.f8545b;
            int i4 = a3.f8545b;
            if (a2.c || a3.c) {
                z = true;
            }
            d0 G0 = a.G0(a2.d);
            if (G0 == null) {
                G0 = a.G0(a3.d);
            }
            if (z) {
                if (i1Var instanceof k) {
                    i1Var2 = new k(a2.d, a3.d);
                } else {
                    i1Var2 = e0.c(a2.d, a3.d);
                }
                i1Var = a.u3(i1Var2, G0);
            }
            return new k(i1Var, a2.f8545b, z);
        } else if (i1Var instanceof k0) {
            return a((k0) i1Var, lVar, i2, w.INFLEXIBLE);
        } else {
            throw new h();
        }
    }

    public static final <T> c<T> c(T t) {
        return new c<>(t, (e.a.a.a.y0.b.a1.h) null);
    }

    public static final boolean d(w wVar) {
        i.e(wVar, "$this$shouldEnhance");
        return wVar != w.INFLEXIBLE;
    }
}
