package b.j.a.c.h0;

import b.j.a.b.f;
import b.j.a.c.d;
import b.j.a.c.e0.h;
import b.j.a.c.h0.t.t;
import b.j.a.c.n;
import b.j.a.c.y;
import java.util.Map;

public class a {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2033b;
    public n<Object> c;
    public t d;

    public a(d dVar, h hVar, n<?> nVar) {
        this.f2033b = hVar;
        this.a = dVar;
        this.c = nVar;
        if (nVar instanceof t) {
            this.d = (t) nVar;
        }
    }

    public void a(Object obj, f fVar, y yVar) {
        Object k2 = this.f2033b.k(obj);
        if (k2 != null) {
            if (k2 instanceof Map) {
                t tVar = this.d;
                if (tVar != null) {
                    tVar.v((Map) k2, fVar, yVar);
                } else {
                    this.c.f(k2, fVar, yVar);
                }
            } else {
                yVar.l(this.a.d(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", new Object[]{this.f2033b.d(), k2.getClass().getName()}));
                throw null;
            }
        }
    }
}
