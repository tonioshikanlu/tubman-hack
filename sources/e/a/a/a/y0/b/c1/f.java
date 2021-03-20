package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.m;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.n;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.f1;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.v0;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.Collection;
import java.util.List;

public abstract class f extends n implements q0 {

    /* renamed from: l  reason: collision with root package name */
    public List<? extends r0> f8192l;

    /* renamed from: m  reason: collision with root package name */
    public final b f8193m = new b(this);

    /* renamed from: n  reason: collision with root package name */
    public final z0 f8194n;

    public static final class a extends k implements l<i1, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ f f8195h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(1);
            this.f8195h = fVar;
        }

        public Object invoke(Object obj) {
            i1 i1Var = (i1) obj;
            i.d(i1Var, "type");
            boolean z = false;
            if (!b.q.a.a.I1(i1Var)) {
                h d = i1Var.W0().d();
                if ((d instanceof r0) && (i.a(((r0) d).b(), this.f8195h) ^ true)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class b implements v0 {
        public final /* synthetic */ f a;

        public b(f fVar) {
            this.a = fVar;
        }

        public v0 a(e.a.a.a.y0.m.l1.f fVar) {
            i.e(fVar, "kotlinTypeRefiner");
            return this;
        }

        public boolean b() {
            return true;
        }

        public h d() {
            return this.a;
        }

        public List<r0> g() {
            List<? extends r0> list = ((e.a.a.a.y0.k.b.g0.l) this.a).r;
            if (list != null) {
                return list;
            }
            i.m("typeConstructorParameters");
            throw null;
        }

        public Collection<d0> h() {
            Collection<d0> h2 = ((e.a.a.a.y0.k.b.g0.l) this.a).L().W0().h();
            i.d(h2, "declarationDescriptor.un…pe.constructor.supertypes");
            return h2;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("[typealias ");
            y.append(this.a.getName().e());
            y.append(']');
            return y.toString();
        }

        public g v() {
            return e.a.a.a.y0.j.v.b.f(this.a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(e.a.a.a.y0.b.k kVar, e.a.a.a.y0.b.a1.h hVar, d dVar, m0 m0Var, z0 z0Var) {
        super(kVar, hVar, dVar, m0Var);
        i.e(kVar, "containingDeclaration");
        i.e(hVar, "annotations");
        i.e(dVar, "name");
        i.e(m0Var, "sourceElement");
        i.e(z0Var, "visibilityImpl");
        this.f8194n = z0Var;
    }

    public List<r0> A() {
        List<? extends r0> list = this.f8192l;
        if (list != null) {
            return list;
        }
        i.m("declaredTypeParametersImpl");
        throw null;
    }

    public boolean J() {
        return false;
    }

    public boolean J0() {
        return false;
    }

    public h a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public e.a.a.a.y0.b.k m26a() {
        return this;
    }

    public z0 getVisibility() {
        return this.f8194n;
    }

    public n j0() {
        return this;
    }

    public <R, D> R l0(m<R, D> mVar, D d) {
        i.e(mVar, "visitor");
        return mVar.j(this, d);
    }

    public boolean m0() {
        return false;
    }

    public v0 p() {
        return this.f8193m;
    }

    public boolean t() {
        return f1.c(((e.a.a.a.y0.k.b.g0.l) this).L(), new a(this));
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("typealias ");
        y.append(getName().e());
        return y.toString();
    }
}
