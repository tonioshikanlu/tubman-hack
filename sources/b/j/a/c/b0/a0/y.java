package b.j.a.c.b0.a0;

import b.e.a.a.a;
import b.j.a.c.b0.i;
import b.j.a.c.b0.s;
import b.j.a.c.d;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.j0.j;

public class y<T> extends z<T> implements i, s {

    /* renamed from: k  reason: collision with root package name */
    public final j<Object, T> f1756k;

    /* renamed from: l  reason: collision with root package name */
    public final b.j.a.c.i f1757l;

    /* renamed from: m  reason: collision with root package name */
    public final b.j.a.c.j<Object> f1758m;

    public y(j<?, T> jVar) {
        super((Class<?>) Object.class);
        this.f1756k = jVar;
        this.f1757l = null;
        this.f1758m = null;
    }

    public y(j<Object, T> jVar, b.j.a.c.i iVar, b.j.a.c.j<?> jVar2) {
        super(iVar);
        this.f1756k = jVar;
        this.f1757l = iVar;
        this.f1758m = jVar2;
    }

    public b.j.a.c.j<?> a(g gVar, d dVar) {
        b.j.a.c.j<Object> jVar = this.f1758m;
        if (jVar != null) {
            b.j.a.c.j<?> F = gVar.F(jVar, dVar, this.f1757l);
            if (F == this.f1758m) {
                return this;
            }
            j<Object, T> jVar2 = this.f1756k;
            b.j.a.c.i iVar = this.f1757l;
            b.j.a.c.j0.g.G(y.class, this, "withDelegate");
            return new y(jVar2, iVar, F);
        }
        b.j.a.c.i b2 = this.f1756k.b(gVar.h());
        j<Object, T> jVar3 = this.f1756k;
        b.j.a.c.j<Object> q2 = gVar.q(b2, dVar);
        b.j.a.c.j0.g.G(y.class, this, "withDelegate");
        return new y(jVar3, b2, q2);
    }

    public void b(g gVar) {
        b.j.a.c.j<Object> jVar = this.f1758m;
        if (jVar != null && (jVar instanceof s)) {
            ((s) jVar).b(gVar);
        }
    }

    public T d(b.j.a.b.i iVar, g gVar) {
        Object d = this.f1758m.d(iVar, gVar);
        if (d == null) {
            return null;
        }
        return this.f1756k.a(d);
    }

    public T e(b.j.a.b.i iVar, g gVar, Object obj) {
        if (this.f1757l.f2152h.isAssignableFrom(obj.getClass())) {
            return this.f1758m.e(iVar, gVar, obj);
        }
        StringBuilder y = a.y("Cannot update object of type %s (using deserializer for type %s)");
        y.append(obj.getClass().getName());
        throw new UnsupportedOperationException(String.format(y.toString(), new Object[]{this.f1757l}));
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        Object d = this.f1758m.d(iVar, gVar);
        if (d == null) {
            return null;
        }
        return this.f1756k.a(d);
    }

    public Class<?> l() {
        return this.f1758m.l();
    }

    public Boolean n(f fVar) {
        return this.f1758m.n(fVar);
    }
}
