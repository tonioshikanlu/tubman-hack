package e.a.a.a.y0.n;

import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.l1.d;
import e.a.a.a.y0.n.g;
import e.a.a.a.y0.n.m;
import e.a.a.a.y0.n.n;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class j extends a {
    public static final List<d> a;

    /* renamed from: b  reason: collision with root package name */
    public static final j f9781b = new j();

    public static final class a extends k implements l<s, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f9782h = new a();

        public a() {
            super(1);
        }

        public Object invoke(Object obj) {
            s sVar = (s) obj;
            i.e(sVar, "$receiver");
            List<w0> n2 = sVar.n();
            i.d(n2, "valueParameters");
            w0 w0Var = (w0) g.A(n2);
            boolean z = false;
            if (w0Var != null) {
                if (!e.a.a.a.y0.j.v.b.a(w0Var) && w0Var.R() == null) {
                    z = true;
                }
            }
            j jVar = j.f9781b;
            if (!z) {
                return "last parameter should not have a default value or be a vararg";
            }
            return null;
        }
    }

    public static final class b extends k implements l<s, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f9783h = new b();

        public b() {
            super(1);
        }

        public Object invoke(Object obj) {
            boolean z;
            s sVar = (s) obj;
            i.e(sVar, "$receiver");
            k kVar = k.f9785h;
            j jVar = j.f9781b;
            e.a.a.a.y0.b.k b2 = sVar.b();
            i.d(b2, "containingDeclaration");
            boolean a = kVar.a(b2);
            boolean z2 = true;
            if (!a) {
                Collection<? extends s> g2 = sVar.g();
                i.d(g2, "overriddenDescriptors");
                if (!g2.isEmpty()) {
                    Iterator<T> it = g2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        s sVar2 = (s) it.next();
                        k kVar2 = k.f9785h;
                        i.d(sVar2, "it");
                        e.a.a.a.y0.b.k b3 = sVar2.b();
                        i.d(b3, "it.containingDeclaration");
                        if (kVar2.a(b3)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z2 = false;
                }
            }
            if (!z2) {
                return "must override ''equals()'' in Any";
            }
            return null;
        }
    }

    public static final class c extends k implements l<s, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f9784h = new c();

        public c() {
            super(1);
        }

        public Object invoke(Object obj) {
            boolean z;
            s sVar = (s) obj;
            i.e(sVar, "$receiver");
            i0 K = sVar.K();
            if (K == null) {
                K = sVar.U();
            }
            j jVar = j.f9781b;
            boolean z2 = false;
            if (K != null) {
                d0 f = sVar.f();
                if (f != null) {
                    d0 d = K.d();
                    i.d(d, "receiver.type");
                    i.e(f, "$this$isSubtypeOf");
                    i.e(d, "superType");
                    z = d.a.d(f, d);
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            if (!z2) {
                return "receiver must be a supertype of the return type";
            }
            return null;
        }
    }

    static {
        e.a.a.a.y0.f.d dVar = l.f9790i;
        g.b bVar = g.b.f9780b;
        b[] bVarArr = {bVar, new n.a(1)};
        e.a.a.a.y0.f.d dVar2 = l.f9791j;
        b[] bVarArr2 = {bVar, new n.a(2)};
        e.a.a.a.y0.f.d dVar3 = l.a;
        i iVar = i.a;
        f fVar = f.a;
        b[] bVarArr3 = {bVar, iVar, new n.a(2), fVar};
        e.a.a.a.y0.f.d dVar4 = l.f9786b;
        b[] bVarArr4 = {bVar, iVar, new n.a(3), fVar};
        e.a.a.a.y0.f.d dVar5 = l.c;
        b[] bVarArr5 = {bVar, iVar, new n.b(2), fVar};
        e.a.a.a.y0.f.d dVar6 = l.f9788g;
        b[] bVarArr6 = {bVar};
        e.a.a.a.y0.f.d dVar7 = l.f;
        n.d dVar8 = n.d.f9806b;
        m.a aVar = m.a.d;
        b[] bVarArr7 = {bVar, dVar8, iVar, aVar};
        e.a.a.a.y0.f.d dVar9 = l.f9789h;
        n.c cVar = n.c.f9805b;
        b[] bVarArr8 = {bVar, cVar};
        e.a.a.a.y0.f.d dVar10 = l.f9792k;
        b[] bVarArr9 = {bVar, cVar};
        e.a.a.a.y0.f.d dVar11 = l.f9793l;
        b[] bVarArr10 = {bVar, cVar, aVar};
        e.a.a.a.y0.f.d dVar12 = l.y;
        b[] bVarArr11 = {bVar, dVar8, iVar};
        e.a.a.a.y0.f.d dVar13 = l.d;
        b[] bVarArr12 = {g.a.f9779b};
        e.a.a.a.y0.f.d dVar14 = l.f9787e;
        b[] bVarArr13 = {bVar, m.b.d, dVar8, iVar};
        Set<e.a.a.a.y0.f.d> set = l.G;
        b[] bVarArr14 = {bVar, dVar8, iVar};
        Set<e.a.a.a.y0.f.d> set2 = l.F;
        b[] bVarArr15 = {bVar, cVar};
        List B = e.t.g.B(l.f9795n, l.f9796o);
        b[] bVarArr16 = {bVar};
        Set<e.a.a.a.y0.f.d> set3 = l.H;
        b[] bVarArr17 = {bVar, m.c.d, dVar8, iVar};
        e.c0.d dVar15 = l.f9794m;
        b[] bVarArr18 = {bVar, cVar};
        e eVar = e.f9778h;
        i.e(dVar15, "regex");
        i.e(bVarArr18, "checks");
        i.e(eVar, "additionalChecks");
        a = e.t.g.B(new d(dVar, bVarArr, (l) null, 4), new d(dVar2, bVarArr2, (l<? super s, String>) a.f9782h), new d(dVar3, bVarArr3, (l) null, 4), new d(dVar4, bVarArr4, (l) null, 4), new d(dVar5, bVarArr5, (l) null, 4), new d(dVar6, bVarArr6, (l) null, 4), new d(dVar7, bVarArr7, (l) null, 4), new d(dVar9, bVarArr8, (l) null, 4), new d(dVar10, bVarArr9, (l) null, 4), new d(dVar11, bVarArr10, (l) null, 4), new d(dVar12, bVarArr11, (l) null, 4), new d(dVar13, bVarArr12, (l<? super s, String>) b.f9783h), new d(dVar14, bVarArr13, (l) null, 4), new d((Collection) set, bVarArr14, (l) null, 4), new d((Collection) set2, bVarArr15, (l) null, 4), new d((Collection<e.a.a.a.y0.f.d>) B, bVarArr16, (l<? super s, String>) c.f9784h), new d((Collection) set3, bVarArr17, (l) null, 4), new d((e.a.a.a.y0.f.d) null, dVar15, (Collection<e.a.a.a.y0.f.d>) null, eVar, (b[]) Arrays.copyOf(bVarArr18, 2)));
    }

    public List<d> a() {
        return a;
    }
}
