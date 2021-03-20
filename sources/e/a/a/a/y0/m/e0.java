package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.c1.v;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.j.t.q;
import e.a.a.a.y0.j.y.n;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.u0;
import e.t.g;
import e.t.o;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e0 {
    public static final e0 a = new e0();

    public static final class a extends k implements l {

        /* renamed from: h  reason: collision with root package name */
        public static final a f9657h = new a();

        public a() {
            super(1);
        }

        public Object invoke(Object obj) {
            i.e((f) obj, "<anonymous parameter 0>");
            return null;
        }
    }

    public static final class b {
        public final k0 a;

        /* renamed from: b  reason: collision with root package name */
        public final v0 f9658b;

        public b(k0 k0Var, v0 v0Var) {
            this.a = k0Var;
            this.f9658b = v0Var;
        }
    }

    public static final class c extends k implements l<f, k0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ v0 f9659h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ List f9660i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ h f9661j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ boolean f9662k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(v0 v0Var, List list, h hVar, boolean z) {
            super(1);
            this.f9659h = v0Var;
            this.f9660i = list;
            this.f9661j = hVar;
            this.f9662k = z;
        }

        public Object invoke(Object obj) {
            f fVar = (f) obj;
            i.e(fVar, "refiner");
            b a = e0.a(e0.a, this.f9659h, fVar, this.f9660i);
            if (a == null) {
                return null;
            }
            k0 k0Var = a.a;
            if (k0Var != null) {
                return k0Var;
            }
            h hVar = this.f9661j;
            v0 v0Var = a.f9658b;
            i.c(v0Var);
            return e0.f(hVar, v0Var, this.f9660i, this.f9662k, fVar);
        }
    }

    public static final class d extends k implements l<f, k0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ v0 f9663h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ List f9664i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ h f9665j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ boolean f9666k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.y0.j.y.i f9667l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(v0 v0Var, List list, h hVar, boolean z, e.a.a.a.y0.j.y.i iVar) {
            super(1);
            this.f9663h = v0Var;
            this.f9664i = list;
            this.f9665j = hVar;
            this.f9666k = z;
            this.f9667l = iVar;
        }

        public Object invoke(Object obj) {
            f fVar = (f) obj;
            i.e(fVar, "kotlinTypeRefiner");
            b a = e0.a(e0.a, this.f9663h, fVar, this.f9664i);
            if (a == null) {
                return null;
            }
            k0 k0Var = a.a;
            if (k0Var != null) {
                return k0Var;
            }
            h hVar = this.f9665j;
            v0 v0Var = a.f9658b;
            i.c(v0Var);
            return e0.h(hVar, v0Var, this.f9664i, this.f9666k, this.f9667l);
        }
    }

    static {
        a aVar = a.f9657h;
    }

    public static final b a(e0 e0Var, v0 v0Var, f fVar, List list) {
        e.a.a.a.y0.b.h e2;
        b bVar;
        e.a.a.a.y0.b.h d2 = v0Var.d();
        if (d2 == null || (e2 = fVar.e(d2)) == null) {
            return null;
        }
        if (e2 instanceof q0) {
            bVar = new b(b((q0) e2, list), (v0) null);
        } else {
            v0 a2 = e2.p().a(fVar);
            i.d(a2, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
            bVar = new b((k0) null, a2);
        }
        return bVar;
    }

    public static final k0 b(q0 q0Var, List<? extends y0> list) {
        i.e(q0Var, "$this$computeExpandedType");
        i.e(list, "arguments");
        s0 s0Var = new s0(u0.a.a, false);
        i.e(q0Var, "typeAliasDescriptor");
        i.e(list, "arguments");
        v0 p2 = q0Var.p();
        i.d(p2, "typeAliasDescriptor.typeConstructor");
        List<r0> g2 = p2.g();
        i.d(g2, "typeAliasDescriptor.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(b.q.a.a.C(g2, 10));
        for (r0 r0Var : g2) {
            i.d(r0Var, "it");
            arrayList.add(r0Var.a());
        }
        t0 t0Var = new t0((t0) null, q0Var, list, g.X(g.f0(arrayList, list)), (DefaultConstructorMarker) null);
        Objects.requireNonNull(h.f7785e);
        h hVar = h.a.a;
        i.e(t0Var, "typeAliasExpansion");
        i.e(hVar, "annotations");
        return s0Var.c(t0Var, hVar, false, 0, true);
    }

    public static final i1 c(k0 k0Var, k0 k0Var2) {
        i.e(k0Var, "lowerBound");
        i.e(k0Var2, "upperBound");
        return i.a(k0Var, k0Var2) ? k0Var : new y(k0Var, k0Var2);
    }

    public static final k0 d(h hVar, q qVar, boolean z) {
        i.e(hVar, "annotations");
        i.e(qVar, "constructor");
        o oVar = o.f7934h;
        e.a.a.a.y0.j.y.i c2 = w.c("Scope for integer literal type", true);
        i.d(c2, "ErrorUtils.createErrorSc…eger literal type\", true)");
        return h(hVar, qVar, oVar, z, c2);
    }

    public static final k0 e(h hVar, e eVar, List<? extends y0> list) {
        i.e(hVar, "annotations");
        i.e(eVar, "descriptor");
        i.e(list, "arguments");
        v0 p2 = eVar.p();
        i.d(p2, "descriptor.typeConstructor");
        return g(hVar, p2, list, false, (f) null, 16);
    }

    public static final k0 f(h hVar, v0 v0Var, List<? extends y0> list, boolean z, f fVar) {
        e.a.a.a.y0.j.y.i a2;
        i.e(hVar, "annotations");
        i.e(v0Var, "constructor");
        i.e(list, "arguments");
        if (!hVar.isEmpty() || !list.isEmpty() || z || v0Var.d() == null) {
            e.a.a.a.y0.b.h d2 = v0Var.d();
            if (d2 instanceof r0) {
                a2 = d2.s().z();
            } else if (d2 instanceof e) {
                if (fVar == null) {
                    fVar = e.a.a.a.y0.j.v.b.j(e.a.a.a.y0.j.v.b.k(d2));
                }
                v vVar = null;
                e eVar = (e) d2;
                if (list.isEmpty()) {
                    i.e(eVar, "$this$getRefinedUnsubstitutedMemberScopeIfPossible");
                    i.e(fVar, "kotlinTypeRefiner");
                    i.e(eVar, "$this$getRefinedUnsubstitutedMemberScopeIfPossible");
                    i.e(fVar, "kotlinTypeRefiner");
                    if (eVar instanceof v) {
                        vVar = eVar;
                    }
                    v vVar2 = (v) vVar;
                    if (vVar2 == null || (a2 = vVar2.e0(fVar)) == null) {
                        a2 = eVar.G0();
                        i.d(a2, "this.unsubstitutedMemberScope");
                    }
                } else {
                    b1 b2 = x0.f9769b.b(v0Var, list);
                    i.e(eVar, "$this$getRefinedMemberScopeIfPossible");
                    i.e(b2, "typeSubstitution");
                    i.e(fVar, "kotlinTypeRefiner");
                    i.e(eVar, "$this$getRefinedMemberScopeIfPossible");
                    i.e(b2, "typeSubstitution");
                    i.e(fVar, "kotlinTypeRefiner");
                    if (eVar instanceof v) {
                        vVar = eVar;
                    }
                    v vVar3 = vVar;
                    if (vVar3 == null || (a2 = vVar3.c0(b2, fVar)) == null) {
                        a2 = eVar.C(b2);
                        i.d(a2, "this.getMemberScope(\n   …ubstitution\n            )");
                    }
                }
            } else if (d2 instanceof q0) {
                StringBuilder y = b.e.a.a.a.y("Scope for abbreviation: ");
                y.append(((q0) d2).getName());
                a2 = w.c(y.toString(), true);
                i.d(a2, "ErrorUtils.createErrorSc…{descriptor.name}\", true)");
            } else if (v0Var instanceof b0) {
                a2 = n.a.a("member scope for intersection type", ((b0) v0Var).f9648b);
            } else {
                throw new IllegalStateException("Unsupported classifier: " + d2 + " for constructor: " + v0Var);
            }
            return i(hVar, v0Var, list, z, a2, new c(v0Var, list, hVar, z));
        }
        e.a.a.a.y0.b.h d3 = v0Var.d();
        i.c(d3);
        i.d(d3, "constructor.declarationDescriptor!!");
        k0 s = d3.s();
        i.d(s, "constructor.declarationDescriptor!!.defaultType");
        return s;
    }

    public static /* synthetic */ k0 g(h hVar, v0 v0Var, List list, boolean z, f fVar, int i2) {
        int i3 = i2 & 16;
        return f(hVar, v0Var, list, z, (f) null);
    }

    public static final k0 h(h hVar, v0 v0Var, List<? extends y0> list, boolean z, e.a.a.a.y0.j.y.i iVar) {
        i.e(hVar, "annotations");
        i.e(v0Var, "constructor");
        i.e(list, "arguments");
        i.e(iVar, "memberScope");
        v0 v0Var2 = v0Var;
        List<? extends y0> list2 = list;
        l0 l0Var = new l0(v0Var2, list2, z, iVar, new d(v0Var2, list2, hVar, z, iVar));
        return hVar.isEmpty() ? l0Var : new m(l0Var, hVar);
    }

    public static final k0 i(h hVar, v0 v0Var, List<? extends y0> list, boolean z, e.a.a.a.y0.j.y.i iVar, l<? super f, ? extends k0> lVar) {
        i.e(hVar, "annotations");
        i.e(v0Var, "constructor");
        i.e(list, "arguments");
        i.e(iVar, "memberScope");
        i.e(lVar, "refinedTypeFactory");
        l0 l0Var = new l0(v0Var, list, z, iVar, lVar);
        return hVar.isEmpty() ? l0Var : new m(l0Var, hVar);
    }
}
