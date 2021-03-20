package e.a.a.a.y0.m;

import com.segment.analytics.integrations.BasePayload;
import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.a1.k;
import e.a.a.a.y0.b.a1.l;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.m.l1.j;
import e.a.a.a.y0.m.o1.c;
import e.a.a.a.y0.m.p1.d;
import e.x.c.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class d1 {

    /* renamed from: b  reason: collision with root package name */
    public static final d1 f9651b = e(b1.a);
    public final b1 a;

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public enum b {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public d1(b1 b1Var) {
        if (b1Var != null) {
            this.a = b1Var;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        if (!(i2 == 6 || i2 == 31 || i2 == 34)) {
            switch (i2) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    switch (i2) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            break;
                        default:
                            switch (i2) {
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                    break;
                                default:
                                    switch (i2) {
                                        case 37:
                                        case 38:
                                        case 39:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i2 == 6 || i2 == 31 || i2 == 34)) {
            switch (i2) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    switch (i2) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            break;
                        default:
                            switch (i2) {
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                    break;
                                default:
                                    switch (i2) {
                                        case 37:
                                        case 38:
                                        case 39:
                                            break;
                                        default:
                                            i3 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i3 = 2;
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "first";
                break;
            case 2:
                objArr[0] = "second";
                break;
            case 3:
                objArr[0] = "substitutionContext";
                break;
            case 4:
                objArr[0] = BasePayload.CONTEXT_KEY;
                break;
            case 6:
            case 9:
            case 10:
            case 11:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 26:
            case 27:
            case 28:
            case 29:
            case 31:
            case 34:
            case 37:
            case 38:
            case 39:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 7:
            case 12:
                objArr[0] = "type";
                break;
            case 8:
            case 13:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 14:
            case 15:
            case 33:
                objArr[0] = "typeProjection";
                break;
            case 16:
            case 25:
                objArr[0] = "originalProjection";
                break;
            case 23:
                objArr[0] = "originalType";
                break;
            case 24:
                objArr[0] = "substituted";
                break;
            case 30:
                objArr[0] = "annotations";
                break;
            case 32:
            case 35:
                objArr[0] = "typeParameterVariance";
                break;
            case 36:
                objArr[0] = "projectionKind";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        if (i2 == 6) {
            objArr[1] = "getSubstitution";
        } else if (i2 != 31) {
            if (i2 != 34) {
                switch (i2) {
                    case 9:
                    case 10:
                    case 11:
                        objArr[1] = "safeSubstitute";
                        break;
                    default:
                        switch (i2) {
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                objArr[1] = "unsafeSubstitute";
                                break;
                            default:
                                switch (i2) {
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                        objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                        break;
                                    default:
                                        switch (i2) {
                                            case 37:
                                            case 38:
                                            case 39:
                                                break;
                                            default:
                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                break;
                                        }
                                }
                        }
                }
            }
            objArr[1] = "combine";
        } else {
            objArr[1] = "filterOutUnsafeVariance";
        }
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case 5:
                    objArr[2] = "<init>";
                    break;
                case 6:
                case 9:
                case 10:
                case 11:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 26:
                case 27:
                case 28:
                case 29:
                case 31:
                case 34:
                case 37:
                case 38:
                case 39:
                    break;
                case 7:
                case 8:
                    objArr[2] = "safeSubstitute";
                    break;
                case 12:
                case 13:
                case 14:
                    objArr[2] = "substitute";
                    break;
                case 15:
                    objArr[2] = "substituteWithoutApproximation";
                    break;
                case 16:
                    objArr[2] = "unsafeSubstitute";
                    break;
                case 23:
                case 24:
                case 25:
                    objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                    break;
                case 30:
                    objArr[2] = "filterOutUnsafeVariance";
                    break;
                case 32:
                case 33:
                case 35:
                case 36:
                    objArr[2] = "combine";
                    break;
                default:
                    objArr[2] = "create";
                    break;
            }
        } else {
            objArr[2] = "createChainedSubstitutor";
        }
        String format = String.format(str, objArr);
        if (!(i2 == 6 || i2 == 31 || i2 == 34)) {
            switch (i2) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    switch (i2) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            break;
                        default:
                            switch (i2) {
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                    break;
                                default:
                                    switch (i2) {
                                        case 37:
                                        case 38:
                                        case 39:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public static j1 b(j1 j1Var, j1 j1Var2) {
        if (j1Var == null) {
            a(35);
            throw null;
        } else if (j1Var2 != null) {
            j1 j1Var3 = j1.INVARIANT;
            if (j1Var == j1Var3) {
                if (j1Var2 != null) {
                    return j1Var2;
                }
                a(37);
                throw null;
            } else if (j1Var2 == j1Var3) {
                if (j1Var != null) {
                    return j1Var;
                }
                a(38);
                throw null;
            } else if (j1Var != j1Var2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + j1Var + "' and " + "projection kind '" + j1Var2 + "' cannot be combined");
            } else if (j1Var2 != null) {
                return j1Var2;
            } else {
                a(39);
                throw null;
            }
        } else {
            a(36);
            throw null;
        }
    }

    public static b c(j1 j1Var, j1 j1Var2) {
        j1 j1Var3 = j1.OUT_VARIANCE;
        j1 j1Var4 = j1.IN_VARIANCE;
        return (j1Var == j1Var4 && j1Var2 == j1Var3) ? b.OUT_IN_IN_POSITION : (j1Var == j1Var3 && j1Var2 == j1Var4) ? b.IN_IN_OUT_POSITION : b.NO_CONFLICT;
    }

    public static d1 d(d0 d0Var) {
        if (d0Var != null) {
            return e(x0.f9769b.b(d0Var.W0(), d0Var.V0()));
        }
        a(4);
        throw null;
    }

    public static d1 e(b1 b1Var) {
        return new d1(b1Var);
    }

    public static d1 f(b1 b1Var, b1 b1Var2) {
        if (b1Var == null) {
            a(1);
            throw null;
        } else if (b1Var2 != null) {
            i.e(b1Var, "first");
            i.e(b1Var2, "second");
            if (b1Var.f()) {
                b1Var = b1Var2;
            } else if (!b1Var2.f()) {
                b1Var = new t(b1Var, b1Var2, (DefaultConstructorMarker) null);
            }
            return e(b1Var);
        } else {
            a(2);
            throw null;
        }
    }

    public static String j(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!c.O(th)) {
                return "[Exception while computing toString(): " + th + "]";
            }
            throw th;
        }
    }

    public b1 g() {
        b1 b1Var = this.a;
        if (b1Var != null) {
            return b1Var;
        }
        a(6);
        throw null;
    }

    public boolean h() {
        return this.a.f();
    }

    public d0 i(d0 d0Var, j1 j1Var) {
        if (d0Var == null) {
            a(7);
            throw null;
        } else if (h()) {
            return d0Var;
        } else {
            try {
                d0 d = m(new a1(j1Var, d0Var), (r0) null, 0).d();
                if (d != null) {
                    return d;
                }
                a(10);
                throw null;
            } catch (a e2) {
                return w.d(e2.getMessage());
            }
        }
    }

    public d0 k(d0 d0Var, j1 j1Var) {
        a1 a1Var;
        if (d0Var == null) {
            a(12);
            throw null;
        } else if (j1Var != null) {
            y0 l2 = l(new a1(j1Var, g().g(d0Var, j1Var)));
            if (this.a.a() || this.a.b()) {
                boolean b2 = this.a.b();
                if (l2 == null) {
                    l2 = null;
                } else if (!l2.c()) {
                    d0 d = l2.d();
                    i.d(d, "typeProjection.type");
                    if (f1.c(d, e.a.a.a.y0.m.p1.c.f9748h)) {
                        j1 b3 = l2.b();
                        i.d(b3, "typeProjection.projectionKind");
                        if (b3 == j1.OUT_VARIANCE) {
                            a1Var = new a1(b3, (d0) c.g(d).f9746b);
                        } else if (b2) {
                            a1Var = new a1(b3, (d0) c.g(d).a);
                        } else {
                            d1 e2 = e(new d());
                            i.d(e2, "TypeSubstitutor.create(o…ojection\n        }\n    })");
                            l2 = e2.l(l2);
                        }
                        l2 = a1Var;
                    }
                }
            }
            if (l2 == null) {
                return null;
            }
            return l2.d();
        } else {
            a(13);
            throw null;
        }
    }

    public y0 l(y0 y0Var) {
        if (y0Var == null) {
            a(15);
            throw null;
        } else if (h()) {
            return y0Var;
        } else {
            try {
                return m(y0Var, (r0) null, 0);
            } catch (a unused) {
                return null;
            }
        }
    }

    public final y0 m(y0 y0Var, r0 r0Var, int i2) {
        d0 d0Var = null;
        if (y0Var != null) {
            b1 b1Var = this.a;
            if (i2 > 100) {
                StringBuilder y = b.e.a.a.a.y("Recursion too deep. Most likely infinite loop while substituting ");
                y.append(j(y0Var));
                y.append("; substitution: ");
                y.append(j(b1Var));
                throw new IllegalStateException(y.toString());
            } else if (y0Var.c()) {
                return y0Var;
            } else {
                d0 d = y0Var.d();
                if (d instanceof g1) {
                    g1 g1Var = (g1) d;
                    i1 K0 = g1Var.K0();
                    d0 e0 = g1Var.e0();
                    y0 m2 = m(new a1(y0Var.b(), K0), r0Var, i2 + 1);
                    return new a1(m2.b(), b.q.a.a.u3(m2.d().Z0(), k(e0, y0Var.b())));
                } else if (b.q.a.a.E1(d) || (d.Z0() instanceof j0)) {
                    return y0Var;
                } else {
                    y0 e2 = this.a.e(d);
                    if (e2 == null) {
                        e2 = null;
                    } else if (d.k().x(g.f7647k.F)) {
                        v0 W0 = e2.d().W0();
                        if (W0 instanceof j) {
                            y0 y0Var2 = ((j) W0).f9709b;
                            j1 b2 = y0Var2.b();
                            b c = c(y0Var.b(), b2);
                            b bVar = b.OUT_IN_IN_POSITION;
                            if (c == bVar) {
                                e2 = new a1(y0Var2.d());
                            } else if (r0Var != null && c(r0Var.u(), b2) == bVar) {
                                e2 = new a1(y0Var2.d());
                            }
                        }
                    }
                    j1 b3 = y0Var.b();
                    if (e2 == null && b.q.a.a.K1(d)) {
                        i.e(d, "$this$isCustomTypeVariable");
                        i1 Z0 = d.Z0();
                        if (!(Z0 instanceof o)) {
                            Z0 = null;
                        }
                        o oVar = (o) Z0;
                        if (!(oVar != null ? oVar.c0() : false)) {
                            x p2 = b.q.a.a.p(d);
                            int i3 = i2 + 1;
                            y0 m3 = m(new a1(b3, p2.f9767i), r0Var, i3);
                            y0 m4 = m(new a1(b3, p2.f9768j), r0Var, i3);
                            j1 b4 = m3.b();
                            if (m3.d() == p2.f9767i && m4.d() == p2.f9768j) {
                                return y0Var;
                            }
                            return new a1(b4, e0.c(b.q.a.a.t(m3.d()), b.q.a.a.t(m4.d())));
                        }
                    }
                    if (g.G(d) || b.q.a.a.I1(d)) {
                        return y0Var;
                    }
                    if (e2 != null) {
                        b c2 = c(b3, e2.b());
                        if (!b.q.a.a.B1(d)) {
                            int ordinal = c2.ordinal();
                            if (ordinal == 1) {
                                return new a1(j1.OUT_VARIANCE, d.W0().v().p());
                            }
                            if (ordinal == 2) {
                                throw new a("Out-projection in in-position");
                            }
                        }
                        i.e(d, "$this$getCustomTypeVariable");
                        i1 Z02 = d.Z0();
                        if (!(Z02 instanceof o)) {
                            Z02 = null;
                        }
                        o oVar2 = (o) Z02;
                        if (oVar2 == null || !oVar2.c0()) {
                            oVar2 = null;
                        }
                        if (e2.c()) {
                            return e2;
                        }
                        d0 j0 = oVar2 != null ? oVar2.j0(e2.d()) : f1.l(e2.d(), d.X0());
                        if (!d.k().isEmpty()) {
                            h d2 = this.a.d(d.k());
                            if (d2 != null) {
                                if (d2.x(g.f7647k.F)) {
                                    d2 = new l(d2, new c1());
                                }
                                j0 = c.Y(j0, new k(j0.k(), d2));
                            } else {
                                a(30);
                                throw null;
                            }
                        }
                        if (c2 == b.NO_CONFLICT) {
                            b3 = b(b3, e2.b());
                        }
                        return new a1(b3, j0);
                    }
                    j1 j1Var = j1.INVARIANT;
                    d0 d3 = y0Var.d();
                    j1 b5 = y0Var.b();
                    if (d3.W0().d() instanceof r0) {
                        return y0Var;
                    }
                    i.e(d3, "$this$getAbbreviation");
                    i.e(d3, "$this$getAbbreviatedType");
                    i1 Z03 = d3.Z0();
                    if (!(Z03 instanceof a)) {
                        Z03 = null;
                    }
                    a aVar = (a) Z03;
                    k0 k0Var = aVar != null ? aVar.f9644j : null;
                    if (k0Var != null) {
                        d0Var = k(k0Var, j1Var);
                    }
                    List<r0> g2 = d3.W0().g();
                    List<y0> V0 = d3.V0();
                    ArrayList arrayList = new ArrayList(g2.size());
                    boolean z = false;
                    for (int i4 = 0; i4 < g2.size(); i4++) {
                        r0 r0Var2 = g2.get(i4);
                        y0 y0Var3 = V0.get(i4);
                        y0 m5 = m(y0Var3, r0Var2, i2 + 1);
                        int ordinal2 = c(r0Var2.u(), m5.b()).ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1 || ordinal2 == 2) {
                                m5 = f1.n(r0Var2);
                            }
                        } else if (r0Var2.u() != j1Var && !m5.c()) {
                            m5 = new a1(j1Var, m5.d());
                        }
                        if (m5 != y0Var3) {
                            z = true;
                        }
                        arrayList.add(m5);
                    }
                    if (z) {
                        V0 = arrayList;
                    }
                    d0 D2 = b.q.a.a.D2(d3, V0, this.a.d(d3.k()));
                    if ((D2 instanceof k0) && (d0Var instanceof k0)) {
                        D2 = n0.c((k0) D2, (k0) d0Var);
                    }
                    return new a1(b5, D2);
                }
            }
        } else {
            a(16);
            throw null;
        }
    }
}
