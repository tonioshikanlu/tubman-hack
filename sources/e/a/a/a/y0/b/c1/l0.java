package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.c1.r;
import e.a.a.a.y0.b.d;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.d1;
import e.a.l;
import e.x.c.i;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l0 extends r implements k0 {
    public static final /* synthetic */ l[] N = {v.c(new q(v.a(l0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final a O = new a((DefaultConstructorMarker) null);
    public d K;
    public final m L;
    public final q0 M;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b extends k implements e.x.b.a<l0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ l0 f8218h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ d f8219i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(l0 l0Var, d dVar) {
            super(0);
            this.f8218h = l0Var;
            this.f8219i = dVar;
        }

        public Object e() {
            l0 l0Var = this.f8218h;
            m mVar = l0Var.L;
            q0 q0Var = l0Var.M;
            d dVar = this.f8219i;
            h k2 = dVar.k();
            b.a i2 = this.f8219i.i();
            i.d(i2, "underlyingConstructorDescriptor.kind");
            m0 w = this.f8218h.M.w();
            i.d(w, "typeAliasDescriptor.source");
            l0 l0Var2 = new l0(mVar, q0Var, dVar, l0Var, k2, i2, w);
            a aVar = l0.O;
            q0 q0Var2 = this.f8218h.M;
            Objects.requireNonNull(aVar);
            i0 i0Var = null;
            d1 d = q0Var2.o() == null ? null : d1.d(q0Var2.F0());
            if (d == null) {
                return null;
            }
            i0 K = this.f8219i.K();
            if (K != null) {
                i0Var = K.c(d);
            }
            List<r0> A = this.f8218h.M.A();
            List<w0> n2 = this.f8218h.n();
            d0 d0Var = this.f8218h.f8243n;
            i.c(d0Var);
            l0Var2.V0((i0) null, i0Var, A, n2, d0Var, e.a.a.a.y0.b.v.FINAL, this.f8218h.M.getVisibility());
            return l0Var2;
        }
    }

    public l0(m mVar, q0 q0Var, d dVar, k0 k0Var, h hVar, b.a aVar, m0 m0Var) {
        super(q0Var, k0Var, hVar, e.a.a.a.y0.f.d.n("<init>"), aVar, m0Var);
        this.L = mVar;
        this.M = q0Var;
        this.y = q0Var.J0();
        mVar.d(new b(this, dVar));
        this.K = dVar;
    }

    public r K0(e.a.a.a.y0.b.k kVar, s sVar, b.a aVar, e.a.a.a.y0.f.d dVar, h hVar, m0 m0Var) {
        i.e(kVar, "newOwner");
        i.e(aVar, "kind");
        i.e(hVar, "annotations");
        i.e(m0Var, "source");
        return new l0(this.L, this.M, this.K, this, hVar, b.a.DECLARATION, m0Var);
    }

    public boolean S() {
        return this.K.S();
    }

    public e T() {
        e T = this.K.T();
        i.d(T, "underlyingConstructorDescriptor.constructedClass");
        return T;
    }

    public d a0() {
        return this.K;
    }

    public e.a.a.a.y0.b.i b() {
        return this.M;
    }

    /* renamed from: b1 */
    public k0 w0(e.a.a.a.y0.b.k kVar, e.a.a.a.y0.b.v vVar, z0 z0Var, b.a aVar, boolean z) {
        i.e(kVar, "newOwner");
        i.e(vVar, "modality");
        i.e(z0Var, "visibility");
        i.e(aVar, "kind");
        r.c cVar = (r.c) x();
        cVar.j(kVar);
        cVar.l(vVar);
        cVar.g(z0Var);
        cVar.m(aVar);
        cVar.u(z);
        s e2 = cVar.e();
        Objects.requireNonNull(e2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (k0) e2;
    }

    /* renamed from: c1 */
    public k0 j0() {
        s a2 = super.j0();
        Objects.requireNonNull(a2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (k0) a2;
    }

    /* renamed from: d1 */
    public k0 c(d1 d1Var) {
        i.e(d1Var, "substitutor");
        s c = super.c(d1Var);
        Objects.requireNonNull(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        l0 l0Var = (l0) c;
        d0 d0Var = l0Var.f8243n;
        i.c(d0Var);
        d1 d = d1.d(d0Var);
        i.d(d, "TypeSubstitutor.create(s…asConstructor.returnType)");
        d c2 = this.K.a().c(d);
        if (c2 == null) {
            return null;
        }
        l0Var.K = c2;
        return l0Var;
    }

    public d0 f() {
        d0 d0Var = this.f8243n;
        i.c(d0Var);
        return d0Var;
    }

    /* renamed from: b  reason: collision with other method in class */
    public e.a.a.a.y0.b.k m29b() {
        return this.M;
    }
}
