package b.j.a.c.b0.a0;

import b.j.a.c.b0.r;
import b.j.a.c.b0.x;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.i;
import b.j.a.c.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class a extends f {
    public a(i iVar, j<Object> jVar, c cVar, x xVar) {
        super(iVar, jVar, cVar, xVar);
    }

    public a(i iVar, j<Object> jVar, c cVar, x xVar, j<Object> jVar2, r rVar, Boolean bool) {
        super(iVar, jVar, cVar, xVar, jVar2, rVar, bool);
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        return cVar.c(iVar, gVar);
    }

    public Collection<Object> f0(g gVar) {
        return null;
    }

    /* renamed from: g0 */
    public Collection<Object> e(b.j.a.b.i iVar, g gVar, Collection<Object> collection) {
        if (collection != null) {
            return super.e(iVar, gVar, collection);
        }
        if (!iVar.O0()) {
            return h0(iVar, gVar, new ArrayBlockingQueue(1));
        }
        Collection<Object> g0 = super.e(iVar, gVar, new ArrayList());
        return new ArrayBlockingQueue(g0.size(), false, g0);
    }

    public f i0(j jVar, j jVar2, c cVar, r rVar, Boolean bool) {
        return new a(this.f1668k, jVar2, cVar, this.f1663q, jVar, rVar, bool);
    }
}
