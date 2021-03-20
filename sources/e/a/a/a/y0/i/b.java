package e.a.a.a.y0.i;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.g;
import e.t.x;
import e.x.c.i;
import java.util.ArrayList;
import java.util.List;

public interface b {

    public static final class a implements b {
        public static final a a = new a();

        public String a(h hVar, c cVar) {
            i.e(hVar, "classifier");
            i.e(cVar, "renderer");
            if (hVar instanceof r0) {
                d name = ((r0) hVar).getName();
                i.d(name, "classifier.name");
                return cVar.v(name, false);
            }
            e.a.a.a.y0.f.c g2 = g.g(hVar);
            i.d(g2, "DescriptorUtils.getFqName(classifier)");
            return cVar.u(g2);
        }
    }

    /* renamed from: e.a.a.a.y0.i.b$b  reason: collision with other inner class name */
    public static final class C0208b implements b {
        public static final C0208b a = new C0208b();

        public String a(h hVar, c cVar) {
            boolean z;
            i.e(hVar, "classifier");
            i.e(cVar, "renderer");
            if (hVar instanceof r0) {
                d name = ((r0) hVar).getName();
                i.d(name, "classifier.name");
                return cVar.v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            k kVar = hVar;
            do {
                arrayList.add(kVar.getName());
                k b2 = kVar.b();
                z = b2 instanceof e;
                kVar = b2;
            } while (z);
            i.e(arrayList, "$this$asReversed");
            return b.q.a.a.C2(new x(arrayList));
        }
    }

    public static final class c implements b {
        public static final c a = new c();

        public String a(h hVar, c cVar) {
            i.e(hVar, "classifier");
            i.e(cVar, "renderer");
            return b(hVar);
        }

        public final String b(h hVar) {
            String str;
            d name = hVar.getName();
            i.d(name, "descriptor.name");
            String B2 = b.q.a.a.B2(name);
            if (hVar instanceof r0) {
                return B2;
            }
            k b2 = hVar.b();
            i.d(b2, "descriptor.containingDeclaration");
            if (b2 instanceof e) {
                str = b((h) b2);
            } else if (b2 instanceof y) {
                e.a.a.a.y0.f.c j2 = ((y) b2).e().j();
                i.d(j2, "descriptor.fqName.toUnsafe()");
                i.e(j2, "$this$render");
                List<d> g2 = j2.g();
                i.d(g2, "pathSegments()");
                str = b.q.a.a.C2(g2);
            } else {
                str = null;
            }
            return (str == null || !(i.a(str, "") ^ true)) ? B2 : b.e.a.a.a.n(str, ".", B2);
        }
    }

    String a(h hVar, c cVar);
}
