package e.a.a.a.y0.m.l1;

import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.j.v.b;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.f1;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.m.y0;
import java.util.List;
import java.util.Objects;

public class r {
    public final q a;

    public enum a {
        IN,
        OUT,
        INV,
        STAR
    }

    public r(q qVar) {
        this.a = qVar;
    }

    public static /* synthetic */ void a(int i2) {
        String str = (i2 == 7 || i2 == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 7 || i2 == 10) ? 2 : 3)];
        switch (i2) {
            case 1:
            case 3:
            case 16:
            case 18:
                objArr[0] = "supertype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 21:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 19:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 20:
                objArr[0] = "supertypeArgumentProjection";
                break;
            default:
                objArr[0] = "subtype";
                break;
        }
        if (i2 == 7) {
            objArr[1] = "getOutType";
        } else if (i2 != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i2) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 15:
            case 16:
                objArr[2] = "isSubtypeOf";
                break;
            case 17:
            case 18:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 19:
            case 20:
            case 21:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 7 || i2 == 10) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.a.a.a.y0.m.d0 d(e.a.a.a.y0.m.d0 r9, e.a.a.a.y0.m.d0 r10, e.a.a.a.y0.m.l1.q r11) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x012a
            if (r10 == 0) goto L_0x0125
            if (r11 == 0) goto L_0x0120
            e.a.a.a.y0.m.x0$a r1 = e.a.a.a.y0.m.x0.f9769b
            e.a.a.a.y0.m.j1 r2 = e.a.a.a.y0.m.j1.INVARIANT
            java.lang.String r3 = "subtype"
            e.x.c.i.e(r9, r3)
            java.lang.String r3 = "supertype"
            e.x.c.i.e(r10, r3)
            java.lang.String r3 = "typeCheckingProcedureCallbacks"
            e.x.c.i.e(r11, r3)
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            e.a.a.a.y0.m.l1.p r4 = new e.a.a.a.y0.m.l1.p
            r4.<init>(r9, r0)
            r3.add(r4)
            e.a.a.a.y0.m.v0 r9 = r10.W0()
        L_0x002b:
            boolean r10 = r3.isEmpty()
            if (r10 != 0) goto L_0x011f
            java.lang.Object r10 = r3.poll()
            e.a.a.a.y0.m.l1.p r10 = (e.a.a.a.y0.m.l1.p) r10
            e.a.a.a.y0.m.d0 r4 = r10.a
            e.a.a.a.y0.m.v0 r5 = r4.W0()
            boolean r6 = r11.b(r5, r9)
            if (r6 == 0) goto L_0x00fd
            boolean r0 = r4.X0()
        L_0x0047:
            e.a.a.a.y0.m.l1.p r10 = r10.f9717b
            if (r10 == 0) goto L_0x00b8
            e.a.a.a.y0.m.d0 r3 = r10.a
            java.util.List r5 = r3.V0()
            boolean r6 = r5 instanceof java.util.Collection
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x005e
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x005e
            goto L_0x007b
        L_0x005e:
            java.util.Iterator r5 = r5.iterator()
        L_0x0062:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007b
            java.lang.Object r6 = r5.next()
            e.a.a.a.y0.m.y0 r6 = (e.a.a.a.y0.m.y0) r6
            e.a.a.a.y0.m.j1 r6 = r6.b()
            if (r6 == r2) goto L_0x0076
            r6 = r7
            goto L_0x0077
        L_0x0076:
            r6 = r8
        L_0x0077:
            if (r6 == 0) goto L_0x0062
            r5 = r7
            goto L_0x007c
        L_0x007b:
            r5 = r8
        L_0x007c:
            java.lang.String r6 = "TypeConstructorSubstitut…uted, Variance.INVARIANT)"
            if (r5 == 0) goto L_0x009c
            e.a.a.a.y0.m.b1 r5 = r1.a(r3)
            e.a.a.a.y0.m.b1 r5 = b.q.a.a.v3(r5, r8, r7)
            e.a.a.a.y0.m.d1 r5 = r5.c()
            e.a.a.a.y0.m.d0 r4 = r5.i(r4, r2)
            e.x.c.i.d(r4, r6)
            e.a.a.a.y0.m.p1.a r4 = e.a.a.a.y0.m.o1.c.g(r4)
            T r4 = r4.f9746b
            e.a.a.a.y0.m.d0 r4 = (e.a.a.a.y0.m.d0) r4
            goto L_0x00ab
        L_0x009c:
            e.a.a.a.y0.m.b1 r5 = r1.a(r3)
            e.a.a.a.y0.m.d1 r5 = r5.c()
            e.a.a.a.y0.m.d0 r4 = r5.i(r4, r2)
            e.x.c.i.d(r4, r6)
        L_0x00ab:
            if (r0 != 0) goto L_0x00b6
            boolean r0 = r3.X0()
            if (r0 == 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r0 = r8
            goto L_0x0047
        L_0x00b6:
            r0 = r7
            goto L_0x0047
        L_0x00b8:
            e.a.a.a.y0.m.v0 r10 = r4.W0()
            boolean r1 = r11.b(r10, r9)
            if (r1 == 0) goto L_0x00c7
            e.a.a.a.y0.m.d0 r0 = e.a.a.a.y0.m.f1.k(r4, r0)
            goto L_0x011f
        L_0x00c7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Type constructors should be equals!\n"
            java.lang.String r2 = "substitutedSuperType: "
            java.lang.StringBuilder r1 = b.e.a.a.a.B(r1, r2)
            java.lang.String r2 = b.q.a.a.g0(r10)
            r1.append(r2)
            java.lang.String r2 = ", \n\n"
            r1.append(r2)
            java.lang.String r2 = "supertype: "
            r1.append(r2)
            java.lang.String r2 = b.q.a.a.g0(r9)
            r1.append(r2)
            java.lang.String r2 = " \n"
            r1.append(r2)
            boolean r9 = r11.b(r10, r9)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x00fd:
            java.util.Collection r4 = r5.h()
            java.util.Iterator r4 = r4.iterator()
        L_0x0105:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x002b
            java.lang.Object r5 = r4.next()
            e.a.a.a.y0.m.d0 r5 = (e.a.a.a.y0.m.d0) r5
            e.a.a.a.y0.m.l1.p r6 = new e.a.a.a.y0.m.l1.p
            java.lang.String r7 = "immediateSupertype"
            e.x.c.i.d(r5, r7)
            r6.<init>(r5, r10)
            r3.add(r6)
            goto L_0x0105
        L_0x011f:
            return r0
        L_0x0120:
            r9 = 4
            a(r9)
            throw r0
        L_0x0125:
            r9 = 3
            a(r9)
            throw r0
        L_0x012a:
            r9 = 2
            a(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.l1.r.d(e.a.a.a.y0.m.d0, e.a.a.a.y0.m.d0, e.a.a.a.y0.m.l1.q):e.a.a.a.y0.m.d0");
    }

    public static a e(r0 r0Var, y0 y0Var) {
        a aVar = a.STAR;
        j1 j1Var = j1.OUT_VARIANCE;
        if (r0Var != null) {
            j1 u = r0Var.u();
            j1 b2 = y0Var.b();
            if (b2 == j1.INVARIANT) {
                j1 j1Var2 = b2;
                b2 = u;
                u = j1Var2;
            }
            j1 j1Var3 = j1.IN_VARIANCE;
            if (u == j1Var3 && b2 == j1Var) {
                return aVar;
            }
            if (u == j1Var && b2 == j1Var3) {
                return aVar;
            }
            if (b2 != null) {
                int ordinal = b2.ordinal();
                if (ordinal == 0) {
                    return a.INV;
                }
                if (ordinal == 1) {
                    return a.IN;
                }
                if (ordinal == 2) {
                    return a.OUT;
                }
                throw new IllegalStateException("Unknown variance");
            }
            a.d(0);
            throw null;
        }
        a(13);
        throw null;
    }

    public static d0 f(r0 r0Var, y0 y0Var) {
        j1 b2 = y0Var.b();
        j1 j1Var = j1.OUT_VARIANCE;
        d0 o2 = b2 == j1Var || r0Var.u() == j1Var ? b.f(r0Var).o() : y0Var.d();
        if (o2 != null) {
            return o2;
        }
        a(10);
        throw null;
    }

    public static d0 g(r0 r0Var, y0 y0Var) {
        j1 b2 = y0Var.b();
        j1 j1Var = j1.IN_VARIANCE;
        d0 p2 = b2 == j1Var || r0Var.u() == j1Var ? b.f(r0Var).p() : y0Var.d();
        if (p2 != null) {
            return p2;
        }
        a(7);
        throw null;
    }

    public final boolean b(y0 y0Var, y0 y0Var2, r0 r0Var) {
        if (y0Var == null) {
            a(19);
            throw null;
        } else if (y0Var2 == null) {
            a(20);
            throw null;
        } else if (r0Var != null) {
            j1 u = r0Var.u();
            j1 j1Var = j1.INVARIANT;
            if (u != j1Var || y0Var.b() == j1Var || y0Var2.b() != j1Var) {
                return false;
            }
            q qVar = this.a;
            d0 d = y0Var2.d();
            Objects.requireNonNull(qVar);
            if (d != null) {
                return false;
            }
            q.a(8);
            throw null;
        } else {
            a(21);
            throw null;
        }
    }

    public boolean c(d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            a(11);
            throw null;
        } else if (d0Var2 == null) {
            a(12);
            throw null;
        } else if (d0Var == d0Var2) {
            return true;
        } else {
            if (b.q.a.a.K1(d0Var)) {
                return b.q.a.a.K1(d0Var2) ? !b.q.a.a.I1(d0Var) && !b.q.a.a.I1(d0Var2) && i(d0Var, d0Var2) && i(d0Var2, d0Var) : h(d0Var2, d0Var);
            }
            if (b.q.a.a.K1(d0Var2)) {
                return h(d0Var, d0Var2);
            }
            if (d0Var.X0() != d0Var2.X0()) {
                return false;
            }
            if (d0Var.X0()) {
                return this.a.c(f1.i(d0Var), f1.i(d0Var2), this);
            }
            v0 W0 = d0Var.W0();
            v0 W02 = d0Var2.W0();
            if (!this.a.b(W0, W02)) {
                return false;
            }
            List<y0> V0 = d0Var.V0();
            List<y0> V02 = d0Var2.V0();
            if (V0.size() != V02.size()) {
                return false;
            }
            for (int i2 = 0; i2 < V0.size(); i2++) {
                y0 y0Var = V0.get(i2);
                y0 y0Var2 = V02.get(i2);
                if (!y0Var.c() || !y0Var2.c()) {
                    r0 r0Var = W0.g().get(i2);
                    b(y0Var, y0Var2, r0Var);
                    if (e(r0Var, y0Var) != e(W02.g().get(i2), y0Var2) || !this.a.c(y0Var.d(), y0Var2.d(), this)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public boolean h(d0 d0Var, d0 d0Var2) {
        return i(b.q.a.a.p(d0Var2).f9767i, d0Var) && i(d0Var, b.q.a.a.p(d0Var2).f9768j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i(e.a.a.a.y0.m.d0 r11, e.a.a.a.y0.m.d0 r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0189
            if (r12 == 0) goto L_0x0183
            java.lang.String r1 = "first"
            e.x.c.i.e(r11, r1)
            java.lang.String r1 = "second"
            e.x.c.i.e(r12, r1)
            e.a.a.a.y0.m.i1 r1 = r11.Z0()
            boolean r2 = r1 instanceof e.a.a.a.y0.m.r0
            if (r2 != 0) goto L_0x0018
            r1 = r0
        L_0x0018:
            e.a.a.a.y0.m.r0 r1 = (e.a.a.a.y0.m.r0) r1
            r2 = 0
            if (r1 == 0) goto L_0x0022
            boolean r1 = r1.R0(r12)
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            r3 = 1
            if (r1 != 0) goto L_0x003e
            e.a.a.a.y0.m.i1 r1 = r12.Z0()
            boolean r4 = r1 instanceof e.a.a.a.y0.m.r0
            if (r4 != 0) goto L_0x002f
            r1 = r0
        L_0x002f:
            e.a.a.a.y0.m.r0 r1 = (e.a.a.a.y0.m.r0) r1
            if (r1 == 0) goto L_0x0038
            boolean r1 = r1.R0(r11)
            goto L_0x0039
        L_0x0038:
            r1 = r2
        L_0x0039:
            if (r1 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r1 = r2
            goto L_0x003f
        L_0x003e:
            r1 = r3
        L_0x003f:
            if (r1 == 0) goto L_0x004f
            boolean r11 = r11.X0()
            if (r11 == 0) goto L_0x004d
            boolean r11 = r12.X0()
            if (r11 == 0) goto L_0x004e
        L_0x004d:
            r2 = r3
        L_0x004e:
            return r2
        L_0x004f:
            java.lang.String r1 = "$this$getSubtypeRepresentative"
            e.x.c.i.e(r11, r1)
            e.a.a.a.y0.m.i1 r1 = r11.Z0()
            boolean r4 = r1 instanceof e.a.a.a.y0.m.r0
            if (r4 != 0) goto L_0x005d
            r1 = r0
        L_0x005d:
            e.a.a.a.y0.m.r0 r1 = (e.a.a.a.y0.m.r0) r1
            if (r1 == 0) goto L_0x0068
            e.a.a.a.y0.m.d0 r1 = r1.P0()
            if (r1 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = r11
        L_0x0069:
            java.lang.String r4 = "$this$getSupertypeRepresentative"
            e.x.c.i.e(r12, r4)
            e.a.a.a.y0.m.i1 r4 = r12.Z0()
            boolean r5 = r4 instanceof e.a.a.a.y0.m.r0
            if (r5 != 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r0 = r4
        L_0x0078:
            e.a.a.a.y0.m.r0 r0 = (e.a.a.a.y0.m.r0) r0
            if (r0 == 0) goto L_0x0083
            e.a.a.a.y0.m.d0 r0 = r0.w0()
            if (r0 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r0 = r12
        L_0x0084:
            if (r1 != r11) goto L_0x017e
            if (r0 == r12) goto L_0x008a
            goto L_0x017e
        L_0x008a:
            boolean r0 = b.q.a.a.I1(r11)
            if (r0 != 0) goto L_0x017c
            boolean r0 = b.q.a.a.I1(r12)
            if (r0 == 0) goto L_0x0098
            goto L_0x017c
        L_0x0098:
            boolean r0 = r12.X0()
            if (r0 != 0) goto L_0x00a6
            boolean r0 = r11.X0()
            if (r0 == 0) goto L_0x00a6
            goto L_0x017d
        L_0x00a6:
            e.a.a.a.y0.a.g$d r0 = e.a.a.a.y0.a.g.f7647k
            e.a.a.a.y0.f.c r0 = r0.f7653b
            boolean r0 = e.a.a.a.y0.a.g.C(r11, r0)
            if (r0 == 0) goto L_0x00b2
            goto L_0x017c
        L_0x00b2:
            e.a.a.a.y0.m.l1.q r0 = r10.a
            e.a.a.a.y0.m.d0 r11 = d(r11, r12, r0)
            if (r11 != 0) goto L_0x00c1
            e.a.a.a.y0.m.l1.q r11 = r10.a
            java.util.Objects.requireNonNull(r11)
            goto L_0x017d
        L_0x00c1:
            boolean r0 = r12.X0()
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r11.X0()
            if (r0 == 0) goto L_0x00cf
            goto L_0x017d
        L_0x00cf:
            e.a.a.a.y0.m.v0 r0 = r11.W0()
            java.util.List r11 = r11.V0()
            java.util.List r12 = r12.V0()
            int r1 = r11.size()
            int r4 = r12.size()
            if (r1 == r4) goto L_0x00e7
            goto L_0x017d
        L_0x00e7:
            java.util.List r0 = r0.g()
            r1 = r2
        L_0x00ec:
            int r4 = r0.size()
            if (r1 >= r4) goto L_0x017c
            java.lang.Object r4 = r0.get(r1)
            e.a.a.a.y0.b.r0 r4 = (e.a.a.a.y0.b.r0) r4
            java.lang.Object r5 = r12.get(r1)
            e.a.a.a.y0.m.y0 r5 = (e.a.a.a.y0.m.y0) r5
            java.lang.Object r6 = r11.get(r1)
            e.a.a.a.y0.m.y0 r6 = (e.a.a.a.y0.m.y0) r6
            boolean r7 = r5.c()
            if (r7 == 0) goto L_0x010c
            goto L_0x0178
        L_0x010c:
            r10.b(r6, r5, r4)
            e.a.a.a.y0.m.d0 r7 = r6.d()
            boolean r7 = b.q.a.a.I1(r7)
            if (r7 != 0) goto L_0x0126
            e.a.a.a.y0.m.d0 r7 = r5.d()
            boolean r7 = b.q.a.a.I1(r7)
            if (r7 == 0) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            r7 = r2
            goto L_0x0127
        L_0x0126:
            r7 = r3
        L_0x0127:
            if (r7 != 0) goto L_0x014e
            e.a.a.a.y0.m.j1 r7 = r4.u()
            e.a.a.a.y0.m.j1 r8 = e.a.a.a.y0.m.j1.INVARIANT
            if (r7 != r8) goto L_0x014e
            e.a.a.a.y0.m.j1 r7 = r6.b()
            if (r7 != r8) goto L_0x014e
            e.a.a.a.y0.m.j1 r7 = r5.b()
            if (r7 != r8) goto L_0x014e
            e.a.a.a.y0.m.l1.q r4 = r10.a
            e.a.a.a.y0.m.d0 r6 = r6.d()
            e.a.a.a.y0.m.d0 r5 = r5.d()
            boolean r4 = r4.c(r6, r5, r10)
            if (r4 != 0) goto L_0x0178
            goto L_0x017d
        L_0x014e:
            e.a.a.a.y0.m.d0 r7 = g(r4, r5)
            e.a.a.a.y0.m.d0 r8 = g(r4, r6)
            e.a.a.a.y0.m.l1.q r9 = r10.a
            boolean r7 = r9.d(r8, r7, r10)
            if (r7 != 0) goto L_0x015f
            goto L_0x017d
        L_0x015f:
            e.a.a.a.y0.m.d0 r7 = f(r4, r5)
            e.a.a.a.y0.m.d0 r4 = f(r4, r6)
            e.a.a.a.y0.m.j1 r5 = r5.b()
            e.a.a.a.y0.m.j1 r6 = e.a.a.a.y0.m.j1.OUT_VARIANCE
            if (r5 == r6) goto L_0x0178
            e.a.a.a.y0.m.l1.q r5 = r10.a
            boolean r4 = r5.d(r7, r4, r10)
            if (r4 != 0) goto L_0x0178
            goto L_0x017d
        L_0x0178:
            int r1 = r1 + 1
            goto L_0x00ec
        L_0x017c:
            r2 = r3
        L_0x017d:
            return r2
        L_0x017e:
            boolean r11 = r10.i(r1, r0)
            return r11
        L_0x0183:
            r11 = 16
            a(r11)
            throw r0
        L_0x0189:
            r11 = 15
            a(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.l1.r.i(e.a.a.a.y0.m.d0, e.a.a.a.y0.m.d0):boolean");
    }
}
