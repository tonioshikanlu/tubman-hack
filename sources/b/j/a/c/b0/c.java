package b.j.a.c.b0;

import b.j.a.b.l;
import b.j.a.c.b0.z.b;
import b.j.a.c.b0.z.u;
import b.j.a.c.b0.z.w;
import b.j.a.c.b0.z.x;
import b.j.a.c.b0.z.y;
import b.j.a.c.g;
import b.j.a.c.i;
import b.j.a.c.j;
import b.j.a.c.j0.n;
import b.j.a.c.j0.r;
import b.j.a.c.j0.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class c extends d implements Serializable {
    public transient Exception E;
    public volatile transient r F;

    public static class a extends y.a {
        public final g c;
        public final u d;

        /* renamed from: e  reason: collision with root package name */
        public Object f1768e;

        public a(g gVar, v vVar, i iVar, u uVar) {
            super(vVar, iVar);
            this.c = gVar;
            this.d = uVar;
        }

        public void a(Object obj, Object obj2) {
            Object obj3 = this.f1768e;
            if (obj3 != null) {
                this.d.B(obj3, obj2);
                return;
            }
            g gVar = this.c;
            u uVar = this.d;
            gVar.W(uVar, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", uVar.f1796k.f2305h, uVar.o().getName());
            throw null;
        }
    }

    public c(d dVar) {
        super(dVar, dVar.w);
    }

    public c(d dVar, b.j.a.c.b0.z.c cVar) {
        super(dVar, cVar);
    }

    public c(d dVar, b.j.a.c.b0.z.r rVar) {
        super(dVar, rVar);
    }

    public c(d dVar, r rVar) {
        super(dVar, rVar);
    }

    public c(d dVar, Set<String> set) {
        super(dVar, set);
    }

    public c(e eVar, b.j.a.c.c cVar, b.j.a.c.b0.z.c cVar2, Map<String, u> map, HashSet<String> hashSet, boolean z, boolean z2) {
        super(eVar, cVar, cVar2, map, hashSet, z, z2);
    }

    public Object A0(b.j.a.b.i iVar, g gVar) {
        Class<?> cls;
        Object u0;
        Object obj;
        b.j.a.c.b0.z.r rVar = this.C;
        if (rVar != null) {
            rVar.b();
        }
        if (!this.f1775q) {
            Object u = this.f1771m.u(gVar);
            iVar.Y0(u);
            if (iVar.b() && (u0 = iVar.u0()) != null) {
                f0(iVar, gVar, u, u0);
            }
            if (this.t != null) {
                t0(gVar, u);
            }
            if (!this.x || (cls = gVar.f1995l) == null) {
                if (iVar.M0(5)) {
                    String e0 = iVar.e0();
                    do {
                        iVar.T0();
                        u v = this.s.v(e0);
                        if (v != null) {
                            try {
                                v.f(iVar, gVar, u);
                            } catch (Exception e2) {
                                x0(e2, u, e0, gVar);
                                throw null;
                            }
                        } else {
                            s0(iVar, gVar, u, e0);
                        }
                        e0 = iVar.R0();
                    } while (e0 != null);
                }
                return u;
            }
            C0(iVar, gVar, u, cls);
            return u;
        } else if (this.A != null) {
            j<Object> jVar = this.f1772n;
            if (jVar != null) {
                return this.f1771m.v(gVar, jVar.d(iVar, gVar));
            }
            u uVar = this.f1774p;
            if (uVar != null) {
                x xVar = new x(iVar, gVar, uVar.a, this.C);
                z zVar = new z(iVar, gVar);
                zVar.N0();
                l g0 = iVar.g0();
                while (true) {
                    l lVar = l.FIELD_NAME;
                    if (g0 == lVar) {
                        String e02 = iVar.e0();
                        iVar.T0();
                        u c = uVar.c(e02);
                        if (c != null) {
                            if (xVar.b(c, z0(iVar, gVar, c))) {
                                l T0 = iVar.T0();
                                try {
                                    Object a2 = uVar.a(gVar, xVar);
                                    iVar.Y0(a2);
                                    while (T0 == l.FIELD_NAME) {
                                        zVar.g1(iVar);
                                        T0 = iVar.T0();
                                    }
                                    l lVar2 = l.END_OBJECT;
                                    if (T0 == lVar2) {
                                        zVar.r0();
                                        if (a2.getClass() == this.f1769k.f2152h) {
                                            obj = a2;
                                        } else {
                                            gVar.W(c, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                                            throw null;
                                        }
                                    } else {
                                        gVar.b0(this, lVar2, "Attempted to unwrap '%s' value", this.f1769k.f2152h.getName());
                                        throw null;
                                    }
                                } catch (Exception e3) {
                                    y0(e3, gVar);
                                    throw null;
                                }
                            }
                        } else if (!xVar.d(e02)) {
                            u v2 = this.s.v(e02);
                            if (v2 != null) {
                                xVar.f1853h = new w.c(xVar.f1853h, z0(iVar, gVar, v2), v2);
                            } else {
                                Set<String> set = this.v;
                                if (set != null && set.contains(e02)) {
                                    p0(iVar, gVar, this.f1769k.f2152h, e02);
                                } else if (this.u == null) {
                                    zVar.v.o(e02);
                                    zVar.V0(lVar, e02);
                                    zVar.g1(iVar);
                                } else {
                                    z c1 = z.c1(iVar);
                                    zVar.v.o(e02);
                                    zVar.V0(lVar, e02);
                                    zVar.b1(c1);
                                    try {
                                        t tVar = this.u;
                                        xVar.c(tVar, e02, tVar.a(c1.f1(), gVar));
                                    } catch (Exception e4) {
                                        x0(e4, this.f1769k.f2152h, e02, gVar);
                                        throw null;
                                    }
                                }
                            }
                        }
                        g0 = iVar.T0();
                    } else {
                        try {
                            obj = uVar.a(gVar, xVar);
                            break;
                        } catch (Exception e5) {
                            y0(e5, gVar);
                            throw null;
                        }
                    }
                }
                this.A.a(gVar, obj, zVar);
                return obj;
            }
            z zVar2 = new z(iVar, gVar);
            zVar2.N0();
            Object u2 = this.f1771m.u(gVar);
            iVar.Y0(u2);
            if (this.t != null) {
                t0(gVar, u2);
            }
            Class<?> cls2 = this.x ? gVar.f1995l : null;
            String e03 = iVar.M0(5) ? iVar.e0() : null;
            while (e03 != null) {
                iVar.T0();
                u v3 = this.s.v(e03);
                if (v3 == null) {
                    Set<String> set2 = this.v;
                    if (set2 != null && set2.contains(e03)) {
                        p0(iVar, gVar, u2, e03);
                    } else if (this.u == null) {
                        zVar2.v.o(e03);
                        zVar2.V0(l.FIELD_NAME, e03);
                        zVar2.g1(iVar);
                    } else {
                        z c12 = z.c1(iVar);
                        zVar2.v.o(e03);
                        zVar2.V0(l.FIELD_NAME, e03);
                        zVar2.b1(c12);
                        try {
                            this.u.b(c12.f1(), gVar, u2, e03);
                        } catch (Exception e6) {
                            x0(e6, u2, e03, gVar);
                            throw null;
                        }
                    }
                } else if (cls2 == null || v3.F(cls2)) {
                    try {
                        v3.f(iVar, gVar, u2);
                    } catch (Exception e7) {
                        x0(e7, u2, e03, gVar);
                        throw null;
                    }
                } else {
                    iVar.a1();
                }
                e03 = iVar.R0();
            }
            zVar2.r0();
            this.A.a(gVar, u2, zVar2);
            return u2;
        } else {
            b.j.a.c.b0.z.g gVar2 = this.B;
            if (gVar2 == null) {
                Object n0 = n0(iVar, gVar);
                if (this.t != null) {
                    t0(gVar, n0);
                }
                return n0;
            } else if (this.f1774p != null) {
                b.j.a.c.b0.z.g gVar3 = new b.j.a.c.b0.z.g(gVar2);
                u uVar2 = this.f1774p;
                x xVar2 = new x(iVar, gVar, uVar2.a, this.C);
                z zVar3 = new z(iVar, gVar);
                zVar3.N0();
                l g02 = iVar.g0();
                while (g02 == l.FIELD_NAME) {
                    String e04 = iVar.e0();
                    iVar.T0();
                    u c2 = uVar2.c(e04);
                    if (c2 != null) {
                        if (!gVar3.e(iVar, gVar, e04, (Object) null) && xVar2.b(c2, z0(iVar, gVar, c2))) {
                            l T02 = iVar.T0();
                            try {
                                Object a3 = uVar2.a(gVar, xVar2);
                                while (T02 == l.FIELD_NAME) {
                                    iVar.T0();
                                    zVar3.g1(iVar);
                                    T02 = iVar.T0();
                                }
                                Class<?> cls3 = a3.getClass();
                                i iVar2 = this.f1769k;
                                if (cls3 == iVar2.f2152h) {
                                    gVar3.d(iVar, gVar, a3);
                                    return a3;
                                }
                                gVar.l(iVar2, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", new Object[]{iVar2, a3.getClass()}));
                                throw null;
                            } catch (Exception e8) {
                                x0(e8, this.f1769k.f2152h, e04, gVar);
                                throw null;
                            }
                        }
                    } else if (!xVar2.d(e04)) {
                        u v4 = this.s.v(e04);
                        if (v4 != null) {
                            xVar2.f1853h = new w.c(xVar2.f1853h, v4.c(iVar, gVar), v4);
                        } else if (!gVar3.e(iVar, gVar, e04, (Object) null)) {
                            Set<String> set3 = this.v;
                            if (set3 == null || !set3.contains(e04)) {
                                t tVar2 = this.u;
                                if (tVar2 != null) {
                                    xVar2.c(tVar2, e04, tVar2.a(iVar, gVar));
                                }
                            } else {
                                p0(iVar, gVar, this.f1769k.f2152h, e04);
                            }
                        }
                    }
                    g02 = iVar.T0();
                }
                zVar3.r0();
                try {
                    return gVar3.c(iVar, gVar, xVar2, uVar2);
                } catch (Exception e9) {
                    y0(e9, gVar);
                    throw null;
                }
            } else {
                j<Object> jVar2 = this.f1772n;
                if (jVar2 != null) {
                    return this.f1771m.v(gVar, jVar2.d(iVar, gVar));
                }
                Object u3 = this.f1771m.u(gVar);
                B0(iVar, gVar, u3);
                return u3;
            }
        }
    }

    public Object B0(b.j.a.b.i iVar, g gVar, Object obj) {
        Class<?> cls = this.x ? gVar.f1995l : null;
        b.j.a.c.b0.z.g gVar2 = new b.j.a.c.b0.z.g(this.B);
        l g0 = iVar.g0();
        while (g0 == l.FIELD_NAME) {
            String e0 = iVar.e0();
            l T0 = iVar.T0();
            u v = this.s.v(e0);
            if (v != null) {
                if (T0.f1445o) {
                    gVar2.f(iVar, gVar, e0, obj);
                }
                if (cls == null || v.F(cls)) {
                    try {
                        v.f(iVar, gVar, obj);
                    } catch (Exception e2) {
                        x0(e2, obj, e0, gVar);
                        throw null;
                    }
                } else {
                    iVar.a1();
                }
            } else {
                Set<String> set = this.v;
                if (set != null && set.contains(e0)) {
                    p0(iVar, gVar, obj, e0);
                } else if (!gVar2.e(iVar, gVar, e0, obj)) {
                    t tVar = this.u;
                    if (tVar != null) {
                        try {
                            tVar.b(iVar, gVar, obj, e0);
                        } catch (Exception e3) {
                            x0(e3, obj, e0, gVar);
                            throw null;
                        }
                    } else {
                        b0(iVar, gVar, obj, e0);
                    }
                }
            }
            g0 = iVar.T0();
        }
        gVar2.d(iVar, gVar, obj);
        return obj;
    }

    public final Object C0(b.j.a.b.i iVar, g gVar, Object obj, Class<?> cls) {
        if (iVar.M0(5)) {
            String e0 = iVar.e0();
            do {
                iVar.T0();
                u v = this.s.v(e0);
                if (v == null) {
                    s0(iVar, gVar, obj, e0);
                } else if (!v.F(cls)) {
                    iVar.a1();
                } else {
                    try {
                        v.f(iVar, gVar, obj);
                    } catch (Exception e2) {
                        x0(e2, obj, e0, gVar);
                        throw null;
                    }
                }
                e0 = iVar.R0();
            } while (e0 != null);
        }
        return obj;
    }

    public final Object D0(b.j.a.b.i iVar, g gVar) {
        Object u = this.f1771m.u(gVar);
        iVar.Y0(u);
        if (iVar.M0(5)) {
            String e0 = iVar.e0();
            do {
                iVar.T0();
                u v = this.s.v(e0);
                if (v != null) {
                    try {
                        v.f(iVar, gVar, u);
                    } catch (Exception e2) {
                        x0(e2, u, e0, gVar);
                        throw null;
                    }
                } else {
                    s0(iVar, gVar, u, e0);
                }
                e0 = iVar.R0();
            } while (e0 != null);
        }
        return u;
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        Object o0;
        Object obj;
        if (iVar.P0()) {
            boolean z = this.r;
            iVar.T0();
            if (z) {
                return D0(iVar, gVar);
            }
            if (this.C != null) {
                return A0(iVar, gVar);
            }
            return A0(iVar, gVar);
        }
        l g0 = iVar.g0();
        if (g0 != null) {
            switch (g0.ordinal()) {
                case 2:
                case 5:
                    if (this.r) {
                        return D0(iVar, gVar);
                    }
                    if (this.C != null) {
                        return A0(iVar, gVar);
                    }
                    return A0(iVar, gVar);
                case 3:
                    return i0(iVar, gVar);
                case 6:
                    if (this.C != null) {
                        o0 = m0(iVar, gVar);
                    } else {
                        j<Object> c0 = c0();
                        if (c0 == null || this.f1771m.g()) {
                            o0 = iVar.o0();
                            if (o0 != null && !this.f1769k.J(o0.getClass())) {
                                i iVar2 = this.f1769k;
                                Class<?> cls = iVar2.f2152h;
                                for (n nVar = gVar.f1993j.t; nVar != null; nVar = nVar.f2227b) {
                                    Objects.requireNonNull((m) nVar.a);
                                    Object obj2 = m.a;
                                }
                                throw new b.j.a.c.c0.c(gVar.f1996m, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", new Object[]{b.j.a.c.j0.g.y(cls), b.j.a.c.j0.g.f(o0)}), o0, cls);
                            }
                        } else {
                            o0 = this.f1771m.v(gVar, c0.d(iVar, gVar));
                            if (this.t != null) {
                                t0(gVar, o0);
                            }
                        }
                    }
                    return o0;
                case 7:
                    return o0(iVar, gVar);
                case 8:
                    return l0(iVar, gVar);
                case 9:
                    return k0(iVar, gVar);
                case 10:
                case 11:
                    return j0(iVar, gVar);
                case 12:
                    if (iVar.X0()) {
                        z zVar = new z(iVar, gVar);
                        zVar.r0();
                        b.j.a.b.i e1 = zVar.e1(iVar);
                        e1.T0();
                        if (this.r) {
                            l lVar = l.END_OBJECT;
                            obj = D0(e1, gVar);
                        } else {
                            obj = A0(e1, gVar);
                        }
                        e1.close();
                        return obj;
                    }
                    gVar.G(this.f1769k.f2152h, iVar);
                    throw null;
            }
        }
        gVar.G(this.f1769k.f2152h, iVar);
        throw null;
    }

    public Object d0(b.j.a.b.i iVar, g gVar) {
        u uVar = this.f1774p;
        x xVar = new x(iVar, gVar, uVar.a, this.C);
        Class<?> cls = this.x ? gVar.f1995l : null;
        l g0 = iVar.g0();
        ArrayList<a> arrayList = null;
        z zVar = null;
        while (true) {
            l lVar = l.FIELD_NAME;
            if (g0 == lVar) {
                String e0 = iVar.e0();
                iVar.T0();
                if (!xVar.d(e0)) {
                    u c = uVar.c(e0);
                    if (c == null) {
                        u v = this.s.v(e0);
                        if (v != null) {
                            try {
                                xVar.f1853h = new w.c(xVar.f1853h, z0(iVar, gVar, v), v);
                            } catch (v e2) {
                                a aVar = new a(gVar, e2, v.f1797l, v);
                                e2.f1803k.a(aVar);
                                if (arrayList == null) {
                                    arrayList = new ArrayList<>();
                                }
                                arrayList.add(aVar);
                            }
                        } else {
                            Set<String> set = this.v;
                            if (set == null || !set.contains(e0)) {
                                t tVar = this.u;
                                if (tVar != null) {
                                    try {
                                        xVar.c(tVar, e0, tVar.a(iVar, gVar));
                                    } catch (Exception e3) {
                                        x0(e3, this.f1769k.f2152h, e0, gVar);
                                        throw null;
                                    }
                                } else {
                                    if (zVar == null) {
                                        zVar = new z(iVar, gVar);
                                    }
                                    zVar.v.o(e0);
                                    zVar.V0(lVar, e0);
                                    zVar.g1(iVar);
                                }
                            } else {
                                p0(iVar, gVar, this.f1769k.f2152h, e0);
                            }
                        }
                    } else if (cls != null && !c.F(cls)) {
                        iVar.a1();
                    } else if (xVar.b(c, z0(iVar, gVar, c))) {
                        iVar.T0();
                        try {
                            Object a2 = uVar.a(gVar, xVar);
                            if (a2 == null) {
                                Class<?> cls2 = this.f1769k.f2152h;
                                if (this.E == null) {
                                    this.E = new NullPointerException("JSON Creator returned null");
                                }
                                gVar.B(cls2, (Object) null, this.E);
                                throw null;
                            }
                            iVar.Y0(a2);
                            if (a2.getClass() != this.f1769k.f2152h) {
                                return q0(iVar, gVar, a2, zVar);
                            }
                            if (zVar != null) {
                                r0(gVar, a2, zVar);
                            }
                            e(iVar, gVar, a2);
                            return a2;
                        } catch (Exception e4) {
                            y0(e4, gVar);
                            throw null;
                        }
                    }
                }
                g0 = iVar.T0();
            } else {
                try {
                    Object a3 = uVar.a(gVar, xVar);
                    if (arrayList != null) {
                        for (a aVar2 : arrayList) {
                            aVar2.f1768e = a3;
                        }
                    }
                    if (zVar != null) {
                        if (a3.getClass() != this.f1769k.f2152h) {
                            return q0((b.j.a.b.i) null, gVar, a3, zVar);
                        }
                        r0(gVar, a3, zVar);
                    }
                    return a3;
                } catch (Exception e5) {
                    y0(e5, gVar);
                    throw null;
                }
            }
        }
    }

    public Object e(b.j.a.b.i iVar, g gVar, Object obj) {
        String str;
        Class<?> cls;
        iVar.Y0(obj);
        if (this.t != null) {
            t0(gVar, obj);
        }
        if (this.A != null) {
            l g0 = iVar.g0();
            if (g0 == l.START_OBJECT) {
                g0 = iVar.T0();
            }
            z zVar = new z(iVar, gVar);
            zVar.N0();
            Class<?> cls2 = this.x ? gVar.f1995l : null;
            while (true) {
                l lVar = l.FIELD_NAME;
                if (g0 == lVar) {
                    String e0 = iVar.e0();
                    u v = this.s.v(e0);
                    iVar.T0();
                    if (v == null) {
                        Set<String> set = this.v;
                        if (set != null && set.contains(e0)) {
                            p0(iVar, gVar, obj, e0);
                        } else if (this.u == null) {
                            zVar.v.o(e0);
                            zVar.V0(lVar, e0);
                            zVar.g1(iVar);
                        } else {
                            z c1 = z.c1(iVar);
                            zVar.v.o(e0);
                            zVar.V0(lVar, e0);
                            zVar.b1(c1);
                            try {
                                this.u.b(c1.f1(), gVar, obj, e0);
                            } catch (Exception e2) {
                                x0(e2, obj, e0, gVar);
                                throw null;
                            }
                        }
                    } else if (cls2 == null || v.F(cls2)) {
                        try {
                            v.f(iVar, gVar, obj);
                        } catch (Exception e3) {
                            x0(e3, obj, e0, gVar);
                            throw null;
                        }
                    } else {
                        iVar.a1();
                    }
                    g0 = iVar.T0();
                } else {
                    zVar.r0();
                    this.A.a(gVar, obj, zVar);
                    return obj;
                }
            }
        } else if (this.B != null) {
            B0(iVar, gVar, obj);
            return obj;
        } else {
            if (iVar.P0()) {
                str = iVar.R0();
                if (str == null) {
                    return obj;
                }
            } else if (!iVar.M0(5)) {
                return obj;
            } else {
                str = iVar.e0();
            }
            if (!this.x || (cls = gVar.f1995l) == null) {
                do {
                    iVar.T0();
                    u v2 = this.s.v(str);
                    if (v2 != null) {
                        try {
                            v2.f(iVar, gVar, obj);
                        } catch (Exception e4) {
                            x0(e4, obj, str, gVar);
                            throw null;
                        }
                    } else {
                        s0(iVar, gVar, obj, str);
                    }
                    str = iVar.R0();
                } while (str != null);
                return obj;
            }
            C0(iVar, gVar, obj, cls);
            return obj;
        }
    }

    public d h0() {
        return new b(this, this.s.f1813m);
    }

    public j<Object> o(r rVar) {
        if (getClass() != c.class || this.F == rVar) {
            return this;
        }
        this.F = rVar;
        try {
            return new c((d) this, rVar);
        } finally {
            this.F = null;
        }
    }

    public d u0(b.j.a.c.b0.z.c cVar) {
        return new c((d) this, cVar);
    }

    public d v0(Set set) {
        return new c((d) this, (Set<String>) set);
    }

    public d w0(b.j.a.c.b0.z.r rVar) {
        return new c((d) this, rVar);
    }

    public final Object z0(b.j.a.b.i iVar, g gVar, u uVar) {
        try {
            return uVar.c(iVar, gVar);
        } catch (Exception e2) {
            x0(e2, this.f1769k.f2152h, uVar.f1796k.f2305h, gVar);
            throw null;
        }
    }
}
