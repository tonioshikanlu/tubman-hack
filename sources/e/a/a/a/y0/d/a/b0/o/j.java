package e.a.a.a.y0.d.a.b0.o;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.j.v.b;
import e.a.a.a.y0.m.a1;
import e.a.a.a.y0.m.b1;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.m.w;
import e.a.a.a.y0.m.y0;
import e.h;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.List;

public final class j extends b1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8469b;
    public static final a c;
    public static final j d = new j();

    public static final class a extends k implements l<f, k0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e f8470h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ k0 f8471i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ a f8472j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, k0 k0Var, a aVar) {
            super(1);
            this.f8470h = eVar;
            this.f8471i = k0Var;
            this.f8472j = aVar;
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.f.a g2;
            e a;
            f fVar = (f) obj;
            i.e(fVar, "kotlinTypeRefiner");
            e eVar = this.f8470h;
            if (!(eVar instanceof e)) {
                eVar = null;
            }
            if (eVar == null || (g2 = b.g(eVar)) == null || (a = fVar.a(g2)) == null || i.a(a, this.f8470h)) {
                return null;
            }
            return (k0) j.d.i(this.f8471i, a, this.f8472j).f7906h;
        }
    }

    static {
        e.a.a.a.y0.d.a.z.k kVar = e.a.a.a.y0.d.a.z.k.COMMON;
        f8469b = i.c(kVar, false, (r0) null, 3).a(b.FLEXIBLE_LOWER_BOUND);
        c = i.c(kVar, false, (r0) null, 3).a(b.FLEXIBLE_UPPER_BOUND);
    }

    public y0 e(d0 d0Var) {
        i.e(d0Var, "key");
        return new a1(j(d0Var));
    }

    public boolean f() {
        return false;
    }

    public final y0 h(r0 r0Var, a aVar, d0 d0Var) {
        j1 j1Var = j1.INVARIANT;
        i.e(r0Var, "parameter");
        i.e(aVar, "attr");
        i.e(d0Var, "erasedUpperBound");
        int ordinal = aVar.f8456b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (!r0Var.u().f9690i) {
                return new a1(j1Var, b.f(r0Var).o());
            }
            List<r0> g2 = d0Var.W0().g();
            i.d(g2, "erasedUpperBound.constructor.parameters");
            return g2.isEmpty() ^ true ? new a1(j1.OUT_VARIANCE, d0Var) : i.b(r0Var, aVar);
        } else if (ordinal == 2) {
            return new a1(j1Var, d0Var);
        } else {
            throw new h();
        }
    }

    public final e.j<k0, Boolean> i(k0 k0Var, e eVar, a aVar) {
        Object obj;
        Boolean bool = Boolean.FALSE;
        if (k0Var.W0().g().isEmpty()) {
            return new e.j<>(k0Var, bool);
        }
        if (g.A(k0Var)) {
            y0 y0Var = k0Var.V0().get(0);
            j1 b2 = y0Var.b();
            d0 d2 = y0Var.d();
            i.d(d2, "componentTypeProjection.type");
            return new e.j<>(e0.g(k0Var.k(), k0Var.W0(), b.q.a.a.l2(new a1(b2, j(d2))), k0Var.X0(), (f) null, 16), bool);
        } else if (b.q.a.a.I1(k0Var)) {
            StringBuilder y = b.e.a.a.a.y("Raw error type: ");
            y.append(k0Var.W0());
            k0 d3 = w.d(y.toString());
            i.d(d3, "ErrorUtils.createErrorTy…pe: ${type.constructor}\")");
            return new e.j<>(d3, bool);
        } else {
            e.a.a.a.y0.j.y.i C = eVar.C(d);
            i.d(C, "declaration.getMemberScope(RawSubstitution)");
            e.a.a.a.y0.b.a1.h k2 = k0Var.k();
            v0 p2 = eVar.p();
            i.d(p2, "declaration.typeConstructor");
            v0 p3 = eVar.p();
            i.d(p3, "declaration.typeConstructor");
            List<r0> g2 = p3.g();
            i.d(g2, "declaration.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(b.q.a.a.C(g2, 10));
            for (r0 r0Var : g2) {
                i.d(r0Var, "parameter");
                e.a.a.a.y0.f.b bVar = i.a;
                d0 a2 = i.a(r0Var, (r0) null, new h(r0Var));
                j1 j1Var = j1.INVARIANT;
                i.e(r0Var, "parameter");
                i.e(aVar, "attr");
                i.e(a2, "erasedUpperBound");
                int ordinal = aVar.f8456b.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    if (!r0Var.u().f9690i) {
                        obj = new a1(j1Var, b.f(r0Var).o());
                    } else {
                        List<r0> g3 = a2.W0().g();
                        i.d(g3, "erasedUpperBound.constructor.parameters");
                        obj = g3.isEmpty() ^ true ? new a1(j1.OUT_VARIANCE, a2) : i.b(r0Var, aVar);
                    }
                } else if (ordinal == 2) {
                    obj = new a1(j1Var, a2);
                } else {
                    throw new h();
                }
                arrayList.add(obj);
            }
            return new e.j<>(e0.i(k2, p2, arrayList, k0Var.X0(), C, new a(eVar, k0Var, aVar)), Boolean.TRUE);
        }
    }

    public final d0 j(d0 d0Var) {
        e.a.a.a.y0.b.h d2 = d0Var.W0().d();
        if (d2 instanceof r0) {
            r0 r0Var = (r0) d2;
            e.a.a.a.y0.f.b bVar = i.a;
            return j(i.a(r0Var, (r0) null, new h(r0Var)));
        } else if (d2 instanceof e) {
            e.a.a.a.y0.b.h d3 = b.q.a.a.s3(d0Var).W0().d();
            if (d3 instanceof e) {
                e.j<k0, Boolean> i2 = i(b.q.a.a.o2(d0Var), (e) d2, f8469b);
                k0 k0Var = (k0) i2.f7906h;
                boolean booleanValue = ((Boolean) i2.f7907i).booleanValue();
                e.j<k0, Boolean> i3 = i(b.q.a.a.s3(d0Var), (e) d3, c);
                k0 k0Var2 = (k0) i3.f7906h;
                return (booleanValue || ((Boolean) i3.f7907i).booleanValue()) ? new k(k0Var, k0Var2) : e0.c(k0Var, k0Var2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class " + "but \"" + d3 + "\" while for lower it's \"" + d2 + '\"').toString());
        } else {
            throw new IllegalStateException(("Unexpected declaration kind: " + d2).toString());
        }
    }
}
