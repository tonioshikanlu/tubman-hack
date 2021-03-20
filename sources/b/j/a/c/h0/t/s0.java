package b.j.a.c.h0.t;

import b.j.a.a.k;
import b.j.a.c.a0.e;
import b.j.a.c.a0.g;
import b.j.a.c.b;
import b.j.a.c.d;
import b.j.a.c.e0.h;
import b.j.a.c.h0.l;
import b.j.a.c.i;
import b.j.a.c.j0.j;
import b.j.a.c.n;
import b.j.a.c.x;
import b.j.a.c.y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public abstract class s0<T> extends n<T> implements Object {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f2136i = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final Class<T> f2137h;

    public s0(s0<?> s0Var) {
        this.f2137h = s0Var.f2137h;
    }

    public s0(i iVar) {
        this.f2137h = iVar.f2152h;
    }

    public s0(Class<T> cls) {
        this.f2137h = cls;
    }

    public s0(Class<?> cls, boolean z) {
        this.f2137h = cls;
    }

    public static final boolean j(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public Class<T> c() {
        return this.f2137h;
    }

    public n<?> k(y yVar, d dVar, n<?> nVar) {
        n<?> nVar2;
        h e2;
        Object P;
        Object obj = f2136i;
        Map map = (Map) yVar.D(obj);
        if (map == null) {
            map = new IdentityHashMap();
            e.a aVar = (e.a) yVar.f2324l;
            Map<Object, Object> map2 = aVar.f1601i;
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                hashMap.put(obj, map == null ? e.a.f1599k : map);
                aVar = new e.a(aVar.f1600h, hashMap);
            } else {
                map2.put(obj, map);
            }
            yVar.f2324l = aVar;
        } else if (map.get(dVar) != null) {
            return nVar;
        }
        map.put(dVar, Boolean.TRUE);
        try {
            b B = yVar.B();
            if (!j(B, dVar) || (e2 = dVar.e()) == null || (P = B.P(e2)) == null) {
                nVar2 = nVar;
            } else {
                j<Object, Object> f = yVar.f(dVar.e(), P);
                i c = f.c(yVar.h());
                nVar2 = new l0(f, c, (nVar != null || c.F()) ? nVar : yVar.y(c));
            }
            if (nVar2 != null) {
                return yVar.G(nVar2, dVar);
            }
            map.remove(dVar);
            return nVar;
        } finally {
            map.remove(dVar);
        }
    }

    public k.d l(y yVar, d dVar, Class<?> cls) {
        if (dVar != null) {
            return dVar.j(yVar.f2320h, cls);
        }
        yVar.f2320h.f1616q.a(cls);
        return g.f1607j;
    }

    public l m(y yVar, Object obj, Object obj2) {
        Objects.requireNonNull(yVar.f2320h);
        Class<T> cls = this.f2137h;
        yVar.m(cls, "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        throw null;
    }

    public void n(y yVar, Throwable th, Object obj, int i2) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        b.j.a.c.j0.g.C(th);
        boolean z = yVar == null || yVar.K(x.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof b.j.a.c.k)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            b.j.a.c.j0.g.E(th);
        }
        throw b.j.a.c.k.g(th, obj, i2);
    }

    public void o(y yVar, Throwable th, Object obj, String str) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        b.j.a.c.j0.g.C(th);
        boolean z = yVar == null || yVar.K(x.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof b.j.a.c.k)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            b.j.a.c.j0.g.E(th);
        }
        throw b.j.a.c.k.h(th, obj, str);
    }
}
