package e.a.a.a.y0.b;

import e.a.a.a.y0.f.d;
import e.b0.s;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class a0 implements z {
    public final Collection<y> a;

    public static final class a extends k implements l<y, e.a.a.a.y0.f.b> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f7768h = new a();

        public a() {
            super(1);
        }

        public Object invoke(Object obj) {
            y yVar = (y) obj;
            i.e(yVar, "it");
            return yVar.e();
        }
    }

    public static final class b extends k implements l<e.a.a.a.y0.f.b, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.y0.f.b f7769h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e.a.a.a.y0.f.b bVar) {
            super(1);
            this.f7769h = bVar;
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.f.b bVar = (e.a.a.a.y0.f.b) obj;
            i.e(bVar, "it");
            return Boolean.valueOf(!bVar.d() && i.a(bVar.e(), this.f7769h));
        }
    }

    public a0(Collection<? extends y> collection) {
        i.e(collection, "packageFragments");
        this.a = collection;
    }

    public List<y> a(e.a.a.a.y0.f.b bVar) {
        i.e(bVar, "fqName");
        Collection<y> collection = this.a;
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            if (i.a(((y) next).e(), bVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Collection<e.a.a.a.y0.f.b> y(e.a.a.a.y0.f.b bVar, l<? super d, Boolean> lVar) {
        i.e(bVar, "fqName");
        i.e(lVar, "nameFilter");
        return s.j(s.c(s.g(g.d(this.a), a.f7768h), new b(bVar)));
    }
}
