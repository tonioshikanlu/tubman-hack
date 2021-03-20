package e.a.a.a.y0.d.a.b0.o;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.j0;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.x;
import e.a.a.a.y0.m.y0;
import e.c0.h;
import e.j;
import e.t.g;
import e.x.b.l;
import e.x.b.p;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class k extends x implements j0 {

    public static final class a extends e.x.c.k implements p<String, String, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f8473h = new a();

        public a() {
            super(2);
        }

        public final boolean a(String str, String str2) {
            i.e(str, "first");
            i.e(str2, "second");
            return i.a(str, h.t(str2, "out ")) || i.a(str2, "*");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(a((String) obj, (String) obj2));
        }
    }

    public static final class b extends e.x.c.k implements l<d0, List<? extends String>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.y0.i.c f8474h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e.a.a.a.y0.i.c cVar) {
            super(1);
            this.f8474h = cVar;
        }

        /* renamed from: a */
        public final List<String> invoke(d0 d0Var) {
            i.e(d0Var, "type");
            List<y0> V0 = d0Var.V0();
            ArrayList arrayList = new ArrayList(b.q.a.a.C(V0, 10));
            for (y0 x : V0) {
                arrayList.add(this.f8474h.x(x));
            }
            return arrayList;
        }
    }

    public static final class c extends e.x.c.k implements p<String, String, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f8475h = new c();

        public c() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, String str2) {
            i.e(str, "$this$replaceArgs");
            i.e(str2, "newArgs");
            if (!h.c(str, '<', false, 2)) {
                return str;
            }
            return h.I(str, '<', (String) null, 2) + '<' + str2 + '>' + h.H(str, '>', (String) null, 2);
        }
    }

    public static final class d extends e.x.c.k implements l<String, CharSequence> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f8476h = new d();

        public d() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            i.e(str, "it");
            return "(raw) " + str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(k0 k0Var, k0 k0Var2) {
        super(k0Var, k0Var2);
        i.e(k0Var, "lowerBound");
        i.e(k0Var2, "upperBound");
        e.a.a.a.y0.m.l1.d.a.d(k0Var, k0Var2);
    }

    public k(k0 k0Var, k0 k0Var2, boolean z) {
        super(k0Var, k0Var2);
        if (!z) {
            e.a.a.a.y0.m.l1.d.a.d(k0Var, k0Var2);
        }
    }

    public i1 a1(boolean z) {
        return new k(this.f9767i.a1(z), this.f9768j.a1(z));
    }

    public i1 c1(e.a.a.a.y0.b.a1.h hVar) {
        i.e(hVar, "newAnnotations");
        return new k(this.f9767i.e1(hVar), this.f9768j.e1(hVar));
    }

    public k0 d1() {
        return this.f9767i;
    }

    public String e1(e.a.a.a.y0.i.c cVar, e.a.a.a.y0.i.i iVar) {
        i.e(cVar, "renderer");
        i.e(iVar, "options");
        a aVar = a.f8473h;
        b bVar = new b(cVar);
        c cVar2 = c.f8475h;
        String w = cVar.w(this.f9767i);
        String w2 = cVar.w(this.f9768j);
        if (iVar.m()) {
            return "raw (" + w + ".." + w2 + ')';
        } else if (this.f9768j.V0().isEmpty()) {
            return cVar.t(w, w2, e.a.a.a.y0.m.o1.c.D(this));
        } else {
            List<String> a2 = bVar.invoke(this.f9767i);
            List<String> a3 = bVar.invoke(this.f9768j);
            String x = g.x(a2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, d.f8476h, 30);
            ArrayList arrayList = (ArrayList) g.f0(a2, a3);
            boolean z = true;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    j jVar = (j) it.next();
                    if (!a.f8473h.a((String) jVar.f7906h, (String) jVar.f7907i)) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                w2 = cVar2.invoke(w2, x);
            }
            String a4 = cVar2.invoke(w, x);
            return i.a(a4, w2) ? a4 : cVar.t(a4, w2, e.a.a.a.y0.m.o1.c.D(this));
        }
    }

    /* renamed from: f1 */
    public x b1(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        d0 g2 = fVar.g(this.f9767i);
        Objects.requireNonNull(g2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        d0 g3 = fVar.g(this.f9768j);
        Objects.requireNonNull(g3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new k((k0) g2, (k0) g3, true);
    }

    public e.a.a.a.y0.j.y.i z() {
        e.a.a.a.y0.b.h d2 = W0().d();
        if (!(d2 instanceof e)) {
            d2 = null;
        }
        e eVar = (e) d2;
        if (eVar != null) {
            e.a.a.a.y0.j.y.i C = eVar.C(j.d);
            i.d(C, "classDescriptor.getMemberScope(RawSubstitution)");
            return C;
        }
        StringBuilder y = b.e.a.a.a.y("Incorrect classifier: ");
        y.append(W0().d());
        throw new IllegalStateException(y.toString().toString());
    }
}
