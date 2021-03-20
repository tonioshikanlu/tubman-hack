package b.j.a.c.a0;

import b.j.a.a.f;
import b.j.a.a.k;
import b.j.a.a.p;
import b.j.a.a.r;
import b.j.a.c.a0.b;
import b.j.a.c.a0.c;
import b.j.a.c.a0.e;
import b.j.a.c.a0.h;
import b.j.a.c.e0.f0;
import b.j.a.c.e0.i0;
import b.j.a.c.j0.w;
import b.j.a.c.p;
import b.j.a.c.t;
import java.io.Serializable;
import java.util.Objects;

public abstract class h<CFG extends b, T extends h<CFG, T>> extends g<T> implements Serializable {
    public static final int r = g.c(p.class);
    public static final int s = ((((p.AUTO_DETECT_FIELDS.f2281i | p.AUTO_DETECT_GETTERS.f2281i) | p.AUTO_DETECT_IS_GETTERS.f2281i) | p.AUTO_DETECT_SETTERS.f2281i) | p.AUTO_DETECT_CREATORS.f2281i);

    /* renamed from: k  reason: collision with root package name */
    public final f0 f1610k;

    /* renamed from: l  reason: collision with root package name */
    public final b.j.a.c.f0.b f1611l;

    /* renamed from: m  reason: collision with root package name */
    public final t f1612m;

    /* renamed from: n  reason: collision with root package name */
    public final Class<?> f1613n;

    /* renamed from: o  reason: collision with root package name */
    public final e f1614o;

    /* renamed from: p  reason: collision with root package name */
    public final w f1615p;

    /* renamed from: q  reason: collision with root package name */
    public final d f1616q;

    public h(a aVar, b.j.a.c.f0.b bVar, f0 f0Var, w wVar, d dVar) {
        super(aVar, r);
        this.f1610k = f0Var;
        this.f1611l = bVar;
        this.f1615p = wVar;
        this.f1612m = null;
        this.f1613n = null;
        this.f1614o = e.a.f1598j;
        this.f1616q = dVar;
    }

    public h(h<CFG, T> hVar, int i2) {
        super(hVar, i2);
        this.f1610k = hVar.f1610k;
        this.f1611l = hVar.f1611l;
        this.f1615p = hVar.f1615p;
        this.f1612m = hVar.f1612m;
        this.f1613n = hVar.f1613n;
        this.f1614o = hVar.f1614o;
        this.f1616q = hVar.f1616q;
    }

    public final Class<?> a(Class<?> cls) {
        Objects.requireNonNull(this.f1610k);
        return null;
    }

    public final c f(Class<?> cls) {
        c a = this.f1616q.a(cls);
        return a == null ? c.a.a : a;
    }

    public final r.b g(Class<?> cls, Class<?> cls2) {
        c a = this.f1616q.a(cls2);
        r.b i2 = i(cls);
        if (i2 == null) {
            return null;
        }
        return i2.a((r.b) null);
    }

    public final k.d h(Class<?> cls) {
        c a = this.f1616q.a(cls);
        return g.f1607j;
    }

    public final r.b i(Class<?> cls) {
        c a = this.f1616q.a(cls);
        r.b bVar = this.f1616q.f1595h;
        if (bVar == null) {
            return null;
        }
        return bVar.a((r.b) null);
    }

    public final i0<?> k(Class<?> cls, b.j.a.c.e0.b bVar) {
        f.a aVar = f.a.NONE;
        i0<?> i0Var = this.f1616q.f1597j;
        int i2 = this.f1608h;
        int i3 = s;
        i0.a aVar2 = i0Var;
        if ((i2 & i3) != i3) {
            i0.a aVar3 = i0Var;
            if (!o(p.AUTO_DETECT_FIELDS)) {
                i0.a aVar4 = (i0.a) i0Var;
                f.a aVar5 = aVar4.f1920l;
                aVar3 = aVar4;
                if (aVar5 != aVar) {
                    aVar3 = new i0.a(aVar4.f1916h, aVar4.f1917i, aVar4.f1918j, aVar4.f1919k, aVar);
                }
            }
            i0.a aVar6 = aVar3;
            if (!o(p.AUTO_DETECT_GETTERS)) {
                i0.a aVar7 = (i0.a) aVar3;
                f.a aVar8 = aVar7.f1916h;
                aVar6 = aVar7;
                if (aVar8 != aVar) {
                    aVar6 = new i0.a(aVar, aVar7.f1917i, aVar7.f1918j, aVar7.f1919k, aVar7.f1920l);
                }
            }
            i0.a aVar9 = aVar6;
            if (!o(p.AUTO_DETECT_IS_GETTERS)) {
                i0.a aVar10 = (i0.a) aVar6;
                f.a aVar11 = aVar10.f1917i;
                aVar9 = aVar10;
                if (aVar11 != aVar) {
                    aVar9 = new i0.a(aVar10.f1916h, aVar, aVar10.f1918j, aVar10.f1919k, aVar10.f1920l);
                }
            }
            i0.a aVar12 = aVar9;
            if (!o(p.AUTO_DETECT_SETTERS)) {
                i0.a aVar13 = (i0.a) aVar9;
                f.a aVar14 = aVar13.f1918j;
                aVar12 = aVar13;
                if (aVar14 != aVar) {
                    aVar12 = new i0.a(aVar13.f1916h, aVar13.f1917i, aVar, aVar13.f1919k, aVar13.f1920l);
                }
            }
            aVar2 = aVar12;
            if (!o(p.AUTO_DETECT_CREATORS)) {
                i0.a aVar15 = (i0.a) aVar12;
                f.a aVar16 = aVar15.f1919k;
                aVar2 = aVar15;
                if (aVar16 != aVar) {
                    aVar2 = new i0.a(aVar15.f1916h, aVar15.f1917i, aVar15.f1918j, aVar, aVar15.f1920l);
                }
            }
        }
        b.j.a.c.b e2 = e();
        i0<?> i0Var2 = aVar2;
        if (e2 != null) {
            i0Var2 = e2.b(bVar, aVar2);
        }
        if (this.f1616q.a(cls) == null) {
            return i0Var2;
        }
        i0.a aVar17 = (i0.a) i0Var2;
        Objects.requireNonNull(aVar17);
        return aVar17;
    }

    public abstract T q(int i2);

    public final p.a r(Class<?> cls, b.j.a.c.e0.b bVar) {
        b.j.a.c.b e2 = e();
        p.a J = e2 == null ? null : e2.J(bVar);
        this.f1616q.a(cls);
        p.a aVar = p.a.f1338m;
        if (J == null) {
            return null;
        }
        return J;
    }

    public final T t(b.j.a.c.p... pVarArr) {
        int i2 = this.f1608h;
        for (b.j.a.c.p pVar : pVarArr) {
            i2 |= pVar.f2281i;
        }
        return i2 == this.f1608h ? this : q(i2);
    }

    public final T u(b.j.a.c.p... pVarArr) {
        int i2 = this.f1608h;
        for (b.j.a.c.p pVar : pVarArr) {
            i2 &= ~pVar.f2281i;
        }
        return i2 == this.f1608h ? this : q(i2);
    }
}
