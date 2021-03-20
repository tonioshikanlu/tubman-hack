package b.j.a.c.h0.s;

import b.j.a.a.r;
import b.j.a.c.b;
import b.j.a.c.d;
import b.j.a.c.f0.f;
import b.j.a.c.h0.h;
import b.j.a.c.h0.s.l;
import b.j.a.c.j0.c;
import b.j.a.c.k;
import b.j.a.c.n;
import b.j.a.c.y;
import b.j.a.c.z.a;
import java.util.Map;
import java.util.Objects;

@a
public class i extends h<Map.Entry<?, ?>> implements b.j.a.c.h0.i {

    /* renamed from: j  reason: collision with root package name */
    public final d f2054j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2055k;

    /* renamed from: l  reason: collision with root package name */
    public final b.j.a.c.i f2056l;

    /* renamed from: m  reason: collision with root package name */
    public final b.j.a.c.i f2057m;

    /* renamed from: n  reason: collision with root package name */
    public final b.j.a.c.i f2058n;

    /* renamed from: o  reason: collision with root package name */
    public n<Object> f2059o;

    /* renamed from: p  reason: collision with root package name */
    public n<Object> f2060p;

    /* renamed from: q  reason: collision with root package name */
    public final f f2061q;
    public l r;
    public final Object s;
    public final boolean t;

    public i(i iVar, n nVar, n nVar2, Object obj, boolean z) {
        super(Map.class, false);
        this.f2056l = iVar.f2056l;
        this.f2057m = iVar.f2057m;
        this.f2058n = iVar.f2058n;
        this.f2055k = iVar.f2055k;
        this.f2061q = iVar.f2061q;
        this.f2059o = nVar;
        this.f2060p = nVar2;
        this.r = l.b.f2067b;
        this.f2054j = iVar.f2054j;
        this.s = obj;
        this.t = z;
    }

    public i(b.j.a.c.i iVar, b.j.a.c.i iVar2, b.j.a.c.i iVar3, boolean z, f fVar, d dVar) {
        super(iVar);
        this.f2056l = iVar;
        this.f2057m = iVar2;
        this.f2058n = iVar3;
        this.f2055k = z;
        this.f2061q = fVar;
        this.f2054j = dVar;
        this.r = l.b.f2067b;
        this.s = null;
        this.t = false;
    }

    public n<?> a(y yVar, d dVar) {
        n nVar;
        n nVar2;
        boolean z;
        Object obj;
        r.b m2;
        r.a aVar;
        Object obj2 = r.a.NON_EMPTY;
        b B = yVar.B();
        b.j.a.c.e0.h e2 = dVar == null ? null : dVar.e();
        if (e2 == null || B == null) {
            nVar2 = null;
            nVar = null;
        } else {
            Object t2 = B.t(e2);
            nVar = t2 != null ? yVar.N(e2, t2) : null;
            Object d = B.d(e2);
            nVar2 = d != null ? yVar.N(e2, d) : null;
        }
        if (nVar2 == null) {
            nVar2 = this.f2060p;
        }
        n k2 = k(yVar, dVar, nVar2);
        if (k2 == null && this.f2055k && !this.f2058n.F()) {
            k2 = yVar.z(this.f2058n, dVar);
        }
        n nVar3 = k2;
        if (nVar == null) {
            nVar = this.f2059o;
        }
        n u = nVar == null ? yVar.u(this.f2057m, dVar) : yVar.G(nVar, dVar);
        Object obj3 = this.s;
        boolean z2 = this.t;
        if (dVar == null || (m2 = dVar.m(yVar.f2320h, (Class<?>) null)) == null || (aVar = m2.f1354i) == r.a.USE_DEFAULTS) {
            obj = obj3;
            z = z2;
        } else {
            int ordinal = aVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            obj2 = b.a.a.n.f.i(this.f2058n);
                            if (obj2 != null && obj2.getClass().isArray()) {
                                obj2 = c.a(obj2);
                            }
                        } else if (ordinal != 5) {
                            z = false;
                            obj = null;
                        } else {
                            obj2 = yVar.H((b.j.a.c.e0.r) null, m2.f1356k);
                            if (obj2 != null) {
                                z = yVar.I(obj2);
                                obj = obj2;
                            }
                        }
                    }
                } else if (!this.f2058n.b()) {
                    obj2 = null;
                }
                obj = obj2;
            } else {
                obj = null;
            }
            z = true;
        }
        return new i(this, u, nVar3, obj, z);
    }

    public boolean d(y yVar, Object obj) {
        Object value = ((Map.Entry) obj).getValue();
        if (value == null) {
            return this.t;
        }
        if (this.s != null) {
            n<Object> nVar = this.f2060p;
            if (nVar == null) {
                Class<?> cls = value.getClass();
                n<Object> c = this.r.c(cls);
                if (c == null) {
                    try {
                        l lVar = this.r;
                        d dVar = this.f2054j;
                        Objects.requireNonNull(lVar);
                        n<Object> A = yVar.A(cls, dVar);
                        l b2 = lVar.b(cls, A);
                        if (lVar != b2) {
                            this.r = b2;
                        }
                        nVar = A;
                    } catch (k unused) {
                    }
                } else {
                    nVar = c;
                }
            }
            Object obj2 = this.s;
            return obj2 == r.a.NON_EMPTY ? nVar.d(yVar, value) : obj2.equals(value);
        }
        return false;
    }

    public void f(Object obj, b.j.a.b.f fVar, y yVar) {
        Map.Entry entry = (Map.Entry) obj;
        fVar.O0(entry);
        r(entry, fVar, yVar);
        fVar.r0();
    }

    public void g(Object obj, b.j.a.b.f fVar, y yVar, f fVar2) {
        Map.Entry entry = (Map.Entry) obj;
        fVar.Y(entry);
        b.j.a.b.v.b e2 = fVar2.e(fVar, fVar2.d(entry, b.j.a.b.l.START_OBJECT));
        r(entry, fVar, yVar);
        fVar2.f(fVar, e2);
    }

    public h<?> q(f fVar) {
        return new i(this, this.f2059o, this.f2060p, this.s, this.t);
    }

    public void r(Map.Entry<?, ?> entry, b.j.a.b.f fVar, y yVar) {
        n<Object> nVar;
        n<Object> nVar2;
        f fVar2 = this.f2061q;
        Object key = entry.getKey();
        if (key == null) {
            nVar = yVar.f2328p;
        } else {
            nVar = this.f2059o;
        }
        Object value = entry.getValue();
        if (value != null) {
            nVar2 = this.f2060p;
            if (nVar2 == null) {
                Class<?> cls = value.getClass();
                n<Object> c = this.r.c(cls);
                if (c != null) {
                    nVar2 = c;
                } else if (this.f2058n.t()) {
                    l lVar = this.r;
                    l.d a = lVar.a(yVar.d(this.f2058n, cls), yVar, this.f2054j);
                    l lVar2 = a.f2069b;
                    if (lVar != lVar2) {
                        this.r = lVar2;
                    }
                    nVar2 = a.a;
                } else {
                    l lVar3 = this.r;
                    d dVar = this.f2054j;
                    Objects.requireNonNull(lVar3);
                    n<Object> A = yVar.A(cls, dVar);
                    l b2 = lVar3.b(cls, A);
                    if (lVar3 != b2) {
                        this.r = b2;
                    }
                    nVar2 = A;
                }
            }
            Object obj = this.s;
            if (obj != null && ((obj == r.a.NON_EMPTY && nVar2.d(yVar, value)) || this.s.equals(value))) {
                return;
            }
        } else if (!this.t) {
            nVar2 = yVar.f2327o;
        } else {
            return;
        }
        nVar.f(key, fVar, yVar);
        if (fVar2 == null) {
            try {
                nVar2.f(value, fVar, yVar);
            } catch (Exception e2) {
                o(yVar, e2, entry, "" + key);
                throw null;
            }
        } else {
            nVar2.g(value, fVar, yVar, fVar2);
        }
    }
}
