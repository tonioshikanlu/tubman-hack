package b.j.a.c.e0;

import b.j.a.a.k;
import b.j.a.a.r;
import b.j.a.c.a0.g;
import b.j.a.c.a0.h;
import b.j.a.c.b;
import b.j.a.c.d;
import b.j.a.c.s;
import b.j.a.c.t;
import java.io.Serializable;
import java.util.List;

public abstract class u implements d, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final s f1948h;

    /* renamed from: i  reason: collision with root package name */
    public transient k.d f1949i;

    /* renamed from: j  reason: collision with root package name */
    public transient List<t> f1950j;

    public u(u uVar) {
        this.f1948h = uVar.f1948h;
        this.f1949i = uVar.f1949i;
    }

    public u(s sVar) {
        this.f1948h = sVar == null ? s.f2294q : sVar;
    }

    public k.d j(g<?> gVar, Class<?> cls) {
        h e2;
        k.d dVar = this.f1949i;
        if (dVar == null) {
            ((h) gVar).f1616q.a(cls);
            k.d dVar2 = g.f1607j;
            dVar = null;
            b e3 = gVar.e();
            if (!(e3 == null || (e2 = e()) == null)) {
                dVar = e3.m(e2);
            }
            if (dVar2 != null) {
                if (dVar != null) {
                    dVar2 = dVar2.f(dVar);
                }
                dVar = dVar2;
            } else if (dVar == null) {
                dVar = d.f1863b;
            }
            this.f1949i = dVar;
        }
        return dVar;
    }

    public s l() {
        return this.f1948h;
    }

    public r.b m(g<?> gVar, Class<?> cls) {
        b e2 = gVar.e();
        h e3 = e();
        if (e3 == null) {
            return gVar.i(cls);
        }
        r.b g2 = gVar.g(cls, e3.e());
        if (e2 == null) {
            return g2;
        }
        r.b K = e2.K(e3);
        return g2 == null ? K : g2.a(K);
    }
}
