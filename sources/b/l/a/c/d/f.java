package b.l.a.c.d;

import b.l.a.c.d.a;
import java.util.Iterator;

public final class f implements e<T> {
    public final /* synthetic */ a a;

    public f(a aVar) {
        this.a = aVar;
    }

    public final void a(T t) {
        a aVar = this.a;
        aVar.a = t;
        Iterator it = aVar.c.iterator();
        while (it.hasNext()) {
            ((a.C0063a) it.next()).a(this.a.a);
        }
        this.a.c.clear();
        this.a.f2831b = null;
    }
}
