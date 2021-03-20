package b.j.a.c.b0.a0;

import b.j.a.a.k;
import b.j.a.b.l;
import b.j.a.c.b0.i;
import b.j.a.c.b0.r;
import b.j.a.c.b0.x;
import b.j.a.c.d;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.j;
import b.j.a.c.z.a;
import java.util.Collection;

@a
public final class f0 extends g<Collection<String>> implements i {

    /* renamed from: o  reason: collision with root package name */
    public final j<String> f1665o;

    /* renamed from: p  reason: collision with root package name */
    public final x f1666p;

    /* renamed from: q  reason: collision with root package name */
    public final j<Object> f1667q;

    public f0(b.j.a.c.i iVar, x xVar, j<?> jVar, j<?> jVar2, r rVar, Boolean bool) {
        super(iVar, rVar, bool);
        this.f1665o = jVar2;
        this.f1666p = xVar;
        this.f1667q = jVar;
    }

    public f0(b.j.a.c.i iVar, j<?> jVar, x xVar) {
        super(iVar, (r) jVar, (Boolean) null);
        this.f1665o = jVar;
        this.f1666p = xVar;
        this.f1667q = null;
    }

    public j<?> a(g gVar, d dVar) {
        j jVar;
        x xVar = this.f1666p;
        j<Object> q2 = (xVar == null || xVar.z() == null) ? null : gVar.q(this.f1666p.A(gVar.f1993j), dVar);
        j jVar2 = this.f1665o;
        b.j.a.c.i k2 = this.f1668k.k();
        if (jVar2 == null) {
            jVar = X(gVar, dVar, jVar2);
            if (jVar == null) {
                jVar = gVar.q(k2, dVar);
            }
        } else {
            jVar = gVar.F(jVar2, dVar, k2);
        }
        k.a aVar = k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY;
        k.d Y = Y(gVar, dVar, Collection.class);
        Boolean b2 = Y != null ? Y.b(aVar) : null;
        r W = W(gVar, dVar, jVar);
        j jVar3 = b.j.a.c.j0.g.u(jVar) ? null : jVar;
        return (this.f1670m == b2 && this.f1669l == W && this.f1665o == jVar3 && this.f1667q == q2) ? this : new f0(this.f1668k, this.f1666p, q2, jVar3, W, b2);
    }

    public j<Object> c0() {
        return this.f1665o;
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        j<Object> jVar = this.f1667q;
        if (jVar != null) {
            return (Collection) this.f1666p.v(gVar, jVar.d(iVar, gVar));
        }
        Collection collection = (Collection) this.f1666p.u(gVar);
        f0(iVar, gVar, collection);
        return collection;
    }

    public x d0() {
        return this.f1666p;
    }

    public /* bridge */ /* synthetic */ Object e(b.j.a.b.i iVar, g gVar, Object obj) {
        Collection collection = (Collection) obj;
        f0(iVar, gVar, collection);
        return collection;
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        return cVar.c(iVar, gVar);
    }

    public Collection<String> f0(b.j.a.b.i iVar, g gVar, Collection<String> collection) {
        Object obj;
        String str;
        Object obj2;
        if (!iVar.O0()) {
            Boolean bool = this.f1670m;
            if (bool == Boolean.TRUE || (bool == null && gVar.O(h.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
                j jVar = this.f1665o;
                if (iVar.g0() == l.VALUE_NULL) {
                    if (!this.f1671n) {
                        obj2 = this.f1669l.c(gVar);
                    }
                    return collection;
                } else if (jVar == null) {
                    str = O(iVar, gVar);
                    collection.add(str);
                    return collection;
                } else {
                    obj2 = jVar.d(iVar, gVar);
                }
                str = (String) obj2;
                collection.add(str);
                return collection;
            }
            gVar.G(this.f1668k.f2152h, iVar);
            throw null;
        }
        j jVar2 = this.f1665o;
        if (jVar2 != null) {
            while (true) {
                if (iVar.S0() == null) {
                    l g0 = iVar.g0();
                    if (g0 == l.END_ARRAY) {
                        return collection;
                    }
                    if (g0 == l.VALUE_NULL) {
                        if (!this.f1671n) {
                            obj = this.f1669l.c(gVar);
                            collection.add((String) obj);
                        }
                    }
                }
                obj = jVar2.d(iVar, gVar);
                collection.add((String) obj);
            }
        } else {
            while (true) {
                try {
                    String S0 = iVar.S0();
                    if (S0 == null) {
                        l g02 = iVar.g0();
                        if (g02 == l.END_ARRAY) {
                            return collection;
                        }
                        if (g02 != l.VALUE_NULL) {
                            S0 = O(iVar, gVar);
                        } else if (!this.f1671n) {
                            S0 = (String) this.f1669l.c(gVar);
                        }
                    }
                    collection.add(S0);
                } catch (Exception e2) {
                    throw b.j.a.c.k.g(e2, collection, collection.size());
                }
            }
        }
    }

    public boolean m() {
        return this.f1665o == null && this.f1667q == null;
    }
}
