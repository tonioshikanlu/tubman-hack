package b.j.a.c.b0.a0;

import b.j.a.b.l;
import b.j.a.c.b0.i;
import b.j.a.c.b0.x;
import b.j.a.c.d;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.j;
import b.j.a.c.j0.a;
import java.util.concurrent.atomic.AtomicReference;

public abstract class w<T> extends z<T> implements i {

    /* renamed from: k  reason: collision with root package name */
    public final b.j.a.c.i f1752k;

    /* renamed from: l  reason: collision with root package name */
    public final x f1753l;

    /* renamed from: m  reason: collision with root package name */
    public final c f1754m;

    /* renamed from: n  reason: collision with root package name */
    public final j<Object> f1755n;

    public w(b.j.a.c.i iVar, x xVar, c cVar, j<?> jVar) {
        super(iVar);
        this.f1753l = xVar;
        this.f1752k = iVar;
        this.f1755n = jVar;
        this.f1754m = cVar;
    }

    public b.j.a.c.i Z() {
        return this.f1752k;
    }

    public j<?> a(g gVar, d dVar) {
        j jVar = this.f1755n;
        j q2 = jVar == null ? gVar.q(this.f1752k.a(), dVar) : gVar.F(jVar, dVar, this.f1752k.a());
        c cVar = this.f1754m;
        if (cVar != null) {
            cVar = cVar.f(dVar);
        }
        if (q2 == this.f1755n && cVar == this.f1754m) {
            return this;
        }
        c cVar2 = (c) this;
        return new c(cVar2.f1752k, cVar2.f1753l, cVar, q2);
    }

    public T d(b.j.a.b.i iVar, g gVar) {
        x xVar = this.f1753l;
        if (xVar != null) {
            return e(iVar, gVar, xVar.u(gVar));
        }
        c cVar = this.f1754m;
        return new AtomicReference(cVar == null ? this.f1755n.d(iVar, gVar) : this.f1755n.f(iVar, gVar, cVar));
    }

    public T e(b.j.a.b.i iVar, g gVar, T t) {
        Object obj;
        if (this.f1755n.n(gVar.f1993j).equals(Boolean.FALSE) || this.f1754m != null) {
            c cVar = this.f1754m;
            obj = cVar == null ? this.f1755n.d(iVar, gVar) : this.f1755n.f(iVar, gVar, cVar);
        } else {
            Object obj2 = ((AtomicReference) t).get();
            if (obj2 == null) {
                c cVar2 = this.f1754m;
                return new AtomicReference(cVar2 == null ? this.f1755n.d(iVar, gVar) : this.f1755n.f(iVar, gVar, cVar2));
            }
            obj = this.f1755n.e(iVar, gVar, obj2);
        }
        T t2 = (AtomicReference) t;
        t2.set(obj);
        return t2;
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        if (iVar.g0() == l.VALUE_NULL) {
            return new AtomicReference();
        }
        c cVar2 = this.f1754m;
        if (cVar2 == null) {
            return d(iVar, gVar);
        }
        return new AtomicReference(cVar2.b(iVar, gVar));
    }

    public a h() {
        return a.DYNAMIC;
    }
}
