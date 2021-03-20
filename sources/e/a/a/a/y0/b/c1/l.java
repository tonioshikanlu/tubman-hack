package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.y;
import e.a.a.a.y0.b.z;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public final class l implements z {
    public final List<z> a;

    public l(List<? extends z> list) {
        i.e(list, "providers");
        this.a = list;
    }

    public List<y> a(b bVar) {
        i.e(bVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (z a2 : this.a) {
            arrayList.addAll(a2.a(bVar));
        }
        return g.W(arrayList);
    }

    public Collection<b> y(b bVar, e.x.b.l<? super d, Boolean> lVar) {
        i.e(bVar, "fqName");
        i.e(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (z y : this.a) {
            hashSet.addAll(y.y(bVar, lVar));
        }
        return hashSet;
    }
}
