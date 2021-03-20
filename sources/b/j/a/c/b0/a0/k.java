package b.j.a.c.b0.a0;

import b.j.a.a.k;
import b.j.a.b.l;
import b.j.a.c.b0.i;
import b.j.a.c.d;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.j;
import java.util.EnumSet;

public class k extends z<EnumSet<?>> implements i {

    /* renamed from: k  reason: collision with root package name */
    public final b.j.a.c.i f1687k;

    /* renamed from: l  reason: collision with root package name */
    public final Class<Enum> f1688l;

    /* renamed from: m  reason: collision with root package name */
    public j<Enum<?>> f1689m;

    /* renamed from: n  reason: collision with root package name */
    public final Boolean f1690n;

    public k(k kVar, j<?> jVar, Boolean bool) {
        super((z<?>) kVar);
        this.f1687k = kVar.f1687k;
        this.f1688l = kVar.f1688l;
        this.f1689m = jVar;
        this.f1690n = bool;
    }

    public k(b.j.a.c.i iVar, j<?> jVar) {
        super((Class<?>) EnumSet.class);
        this.f1687k = iVar;
        Class<?> cls = iVar.f2152h;
        this.f1688l = cls;
        if (cls.isEnum()) {
            this.f1689m = null;
            this.f1690n = null;
            return;
        }
        throw new IllegalArgumentException("Type " + iVar + " not Java Enum type");
    }

    public j<?> a(g gVar, d dVar) {
        k.a aVar = k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY;
        k.d Y = Y(gVar, dVar, EnumSet.class);
        Boolean b2 = Y != null ? Y.b(aVar) : null;
        j jVar = this.f1689m;
        j q2 = jVar == null ? gVar.q(this.f1687k, dVar) : gVar.F(jVar, dVar, this.f1687k);
        return (this.f1690n == b2 && this.f1689m == q2) ? this : new k(this, q2, b2);
    }

    public final EnumSet<?> c0(b.j.a.b.i iVar, g gVar, EnumSet enumSet) {
        while (true) {
            try {
                l T0 = iVar.T0();
                if (T0 == l.END_ARRAY) {
                    return enumSet;
                }
                if (T0 != l.VALUE_NULL) {
                    Enum d = this.f1689m.d(iVar, gVar);
                    if (d != null) {
                        enumSet.add(d);
                    }
                } else {
                    gVar.G(this.f1688l, iVar);
                    throw null;
                }
            } catch (Exception e2) {
                throw b.j.a.c.k.g(e2, enumSet, enumSet.size());
            }
        }
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        EnumSet<E> noneOf = EnumSet.noneOf(this.f1688l);
        if (!iVar.O0()) {
            d0(iVar, gVar, noneOf);
        } else {
            c0(iVar, gVar, noneOf);
        }
        return noneOf;
    }

    public EnumSet<?> d0(b.j.a.b.i iVar, g gVar, EnumSet enumSet) {
        Boolean bool = this.f1690n;
        if (!(bool == Boolean.TRUE || (bool == null && gVar.O(h.ACCEPT_SINGLE_VALUE_AS_ARRAY)))) {
            gVar.G(EnumSet.class, iVar);
            throw null;
        } else if (!iVar.L0(l.VALUE_NULL)) {
            try {
                Enum d = this.f1689m.d(iVar, gVar);
                if (d != null) {
                    enumSet.add(d);
                }
                return enumSet;
            } catch (Exception e2) {
                throw b.j.a.c.k.g(e2, enumSet, enumSet.size());
            }
        } else {
            gVar.G(this.f1688l, iVar);
            throw null;
        }
    }

    public Object e(b.j.a.b.i iVar, g gVar, Object obj) {
        EnumSet enumSet = (EnumSet) obj;
        if (!iVar.O0()) {
            d0(iVar, gVar, enumSet);
        } else {
            c0(iVar, gVar, enumSet);
        }
        return enumSet;
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        return cVar.c(iVar, gVar);
    }

    public boolean m() {
        return this.f1687k.f2154j == null;
    }

    public Boolean n(f fVar) {
        return Boolean.TRUE;
    }
}
