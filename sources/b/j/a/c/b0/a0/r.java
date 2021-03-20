package b.j.a.c.b0.a0;

import b.j.a.b.l;
import b.j.a.c.b0.i;
import b.j.a.c.d;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.j;
import b.j.a.c.o;
import b.j.a.c.z.a;
import java.util.AbstractMap;
import java.util.Map;

@a
public class r extends g<Map.Entry<Object, Object>> implements i {

    /* renamed from: o  reason: collision with root package name */
    public final o f1717o;

    /* renamed from: p  reason: collision with root package name */
    public final j<Object> f1718p;

    /* renamed from: q  reason: collision with root package name */
    public final c f1719q;

    public r(b.j.a.c.i iVar, o oVar, j<Object> jVar, c cVar) {
        super(iVar, (b.j.a.c.b0.r) null, (Boolean) null);
        if (iVar.g() == 2) {
            this.f1717o = oVar;
            this.f1718p = jVar;
            this.f1719q = cVar;
            return;
        }
        throw new IllegalArgumentException("Missing generic type information for " + iVar);
    }

    public j<?> a(g gVar, d dVar) {
        o oVar = this.f1717o;
        if (oVar == null) {
            oVar = gVar.t(this.f1668k.f(0), dVar);
        } else if (oVar instanceof b.j.a.c.b0.j) {
            oVar = ((b.j.a.c.b0.j) oVar).a(gVar, dVar);
        }
        j X = X(gVar, dVar, this.f1718p);
        b.j.a.c.i f = this.f1668k.f(1);
        j q2 = X == null ? gVar.q(f, dVar) : gVar.F(X, dVar, f);
        c cVar = this.f1719q;
        if (cVar != null) {
            cVar = cVar.f(dVar);
        }
        return (this.f1717o == oVar && this.f1718p == q2 && this.f1719q == cVar) ? this : new r(this, oVar, (j<Object>) q2, cVar);
    }

    public j<Object> c0() {
        return this.f1718p;
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        l g0 = iVar.g0();
        l lVar = l.START_OBJECT;
        if (g0 == lVar || g0 == l.FIELD_NAME || g0 == l.END_OBJECT) {
            if (g0 == lVar) {
                g0 = iVar.T0();
            }
            l lVar2 = l.FIELD_NAME;
            if (g0 == lVar2) {
                o oVar = this.f1717o;
                j<Object> jVar = this.f1718p;
                c cVar = this.f1719q;
                String e0 = iVar.e0();
                Object a = oVar.a(e0, gVar);
                try {
                    Object c = iVar.T0() == l.VALUE_NULL ? jVar.c(gVar) : cVar == null ? jVar.d(iVar, gVar) : jVar.f(iVar, gVar, cVar);
                    l T0 = iVar.T0();
                    if (T0 == l.END_OBJECT) {
                        return new AbstractMap.SimpleEntry(a, c);
                    }
                    if (T0 == lVar2) {
                        gVar.Y(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", iVar.e0());
                        throw null;
                    }
                    gVar.Y(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + T0, new Object[0]);
                    throw null;
                } catch (Exception e2) {
                    e0(e2, Map.Entry.class, e0);
                    throw null;
                }
            } else if (g0 == l.END_OBJECT) {
                gVar.Y(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
                throw null;
            } else {
                gVar.G(this.f1761h, iVar);
                throw null;
            }
        } else {
            w(iVar, gVar);
            return null;
        }
    }

    public Object e(b.j.a.b.i iVar, g gVar, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        return cVar.d(iVar, gVar);
    }

    public r(r rVar, o oVar, j<Object> jVar, c cVar) {
        super((g<?>) rVar, rVar.f1669l, rVar.f1670m);
        this.f1717o = oVar;
        this.f1718p = jVar;
        this.f1719q = cVar;
    }
}
