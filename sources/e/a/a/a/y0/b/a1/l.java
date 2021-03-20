package e.a.a.a.y0.b.a1;

import e.a.a.a.y0.f.b;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class l implements h {

    /* renamed from: h  reason: collision with root package name */
    public final h f7793h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7794i = false;

    /* renamed from: j  reason: collision with root package name */
    public final e.x.b.l<b, Boolean> f7795j;

    public l(h hVar, e.x.b.l<? super b, Boolean> lVar) {
        i.e(hVar, "delegate");
        i.e(lVar, "fqNameFilter");
        i.e(hVar, "delegate");
        i.e(lVar, "fqNameFilter");
        this.f7793h = hVar;
        this.f7795j = lVar;
    }

    public final boolean d(c cVar) {
        b e2 = cVar.e();
        return e2 != null && this.f7795j.invoke(e2).booleanValue();
    }

    public c i(b bVar) {
        i.e(bVar, "fqName");
        if (this.f7795j.invoke(bVar).booleanValue()) {
            return this.f7793h.i(bVar);
        }
        return null;
    }

    public boolean isEmpty() {
        boolean z;
        h hVar = this.f7793h;
        if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
            Iterator it = hVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (d((c) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        return this.f7794i ? !z : z;
    }

    public Iterator<c> iterator() {
        h hVar = this.f7793h;
        ArrayList arrayList = new ArrayList();
        for (Object next : hVar) {
            if (d((c) next)) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    public boolean x(b bVar) {
        i.e(bVar, "fqName");
        if (this.f7795j.invoke(bVar).booleanValue()) {
            return this.f7793h.x(bVar);
        }
        return false;
    }
}
