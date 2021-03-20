package e.a.a.a.y0.d.a;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.d.a.a0.f;
import e.a.a.a.y0.d.a.b0.o.j;
import e.a.a.a.y0.j.h;
import e.a.a.a.y0.j.l;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.o1.c;
import e.b0.f;
import e.b0.s;
import e.t.g;
import e.t.o;
import e.x.b.l;
import e.x.c.i;
import java.util.List;

public final class k implements h {

    public static final class a extends e.x.c.k implements l<w0, d0> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f8573h = new a();

        public a() {
            super(1);
        }

        public Object invoke(Object obj) {
            w0 w0Var = (w0) obj;
            i.d(w0Var, "it");
            return w0Var.d();
        }
    }

    public h.b a(e.a.a.a.y0.b.a aVar, e.a.a.a.y0.b.a aVar2, e eVar) {
        boolean z;
        e.a.a.a.y0.b.a aVar3;
        boolean z2;
        h.b bVar = h.b.UNKNOWN;
        i.e(aVar, "superDescriptor");
        i.e(aVar2, "subDescriptor");
        if (!(aVar2 instanceof f)) {
            return bVar;
        }
        f fVar = (f) aVar2;
        List<r0> B = fVar.B();
        i.d(B, "subDescriptor.typeParameters");
        if (!B.isEmpty()) {
            return bVar;
        }
        l.d i2 = e.a.a.a.y0.j.l.i(aVar, aVar2);
        d0 d0Var = null;
        if ((i2 != null ? i2.c() : null) != null) {
            return bVar;
        }
        List<w0> n2 = fVar.n();
        i.d(n2, "subDescriptor.valueParameters");
        e.b0.h<R> g2 = s.g(g.d(n2), a.f8573h);
        d0 d0Var2 = fVar.f8243n;
        i.c(d0Var2);
        e.b0.h<R> i3 = s.i(g2, d0Var2);
        i0 i0Var = fVar.f8244o;
        if (i0Var != null) {
            d0Var = i0Var.d();
        }
        List C = g.C(d0Var);
        i.e(i3, "$this$plus");
        i.e(C, "elements");
        f.a aVar4 = new f.a((e.b0.f) c.z(c.d0(i3, g.d(C))));
        while (true) {
            if (!aVar4.a()) {
                z = false;
                break;
            }
            d0 d0Var3 = (d0) aVar4.next();
            if (!(!d0Var3.V0().isEmpty()) || (d0Var3.Z0() instanceof e.a.a.a.y0.d.a.b0.o.k)) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z || (aVar3 = (e.a.a.a.y0.b.a) aVar.c(j.d.c())) == null) {
            return bVar;
        }
        if (aVar3 instanceof l0) {
            l0 l0Var = (l0) aVar3;
            List<r0> B2 = l0Var.B();
            i.d(B2, "erasedSuper.typeParameters");
            if (!B2.isEmpty()) {
                aVar3 = l0Var.x().i(o.f7934h).e();
                i.c(aVar3);
            }
        }
        l.d n3 = e.a.a.a.y0.j.l.d.n(aVar3, aVar2, false);
        i.d(n3, "OverridingUtil.DEFAULT.i…er, subDescriptor, false)");
        l.d.a c = n3.c();
        i.d(c, "OverridingUtil.DEFAULT.i…Descriptor, false).result");
        return c.ordinal() != 0 ? bVar : h.b.OVERRIDABLE;
    }

    public h.a b() {
        return h.a.SUCCESS_ONLY;
    }
}
