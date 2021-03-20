package e.a.a.a.y0.d.a.e0;

import b.q.a.a;
import e.a.a.a.y0.b.a1.c;
import e.a.a.a.y0.b.a1.h;
import e.t.n;
import e.x.c.i;
import java.util.Iterator;

public final class b implements h {

    /* renamed from: h  reason: collision with root package name */
    public final e.a.a.a.y0.f.b f8497h;

    public b(e.a.a.a.y0.f.b bVar) {
        i.e(bVar, "fqNameToMatch");
        this.f8497h = bVar;
    }

    public c i(e.a.a.a.y0.f.b bVar) {
        i.e(bVar, "fqName");
        if (i.a(bVar, this.f8497h)) {
            return a.a;
        }
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<c> iterator() {
        return n.f7933h;
    }

    public boolean x(e.a.a.a.y0.f.b bVar) {
        i.e(bVar, "fqName");
        return a.n1(this, bVar);
    }
}
