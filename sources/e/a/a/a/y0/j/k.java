package e.a.a.a.y0.j;

import e.a.a.a.y0.b.b;
import e.x.c.i;
import java.util.Collection;

public abstract class k {
    public abstract void a(b bVar);

    public abstract void b(b bVar, b bVar2);

    public abstract void c(b bVar, b bVar2);

    public void d(b bVar, Collection<? extends b> collection) {
        i.e(bVar, "member");
        i.e(collection, "overridden");
        bVar.s0(collection);
    }
}
