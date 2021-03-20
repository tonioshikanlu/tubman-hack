package b.j.a.c.a0;

import b.j.a.a.k;
import b.j.a.a.r;
import b.j.a.c.a0.g;
import b.j.a.c.b;
import b.j.a.c.e0.i0;
import b.j.a.c.e0.q;
import b.j.a.c.e0.s;
import b.j.a.c.e0.x;
import b.j.a.c.i;
import b.j.a.c.i0.c;
import b.j.a.c.i0.n;
import b.j.a.c.p;
import java.io.Serializable;

public abstract class g<T extends g<T>> implements s.a, Serializable {

    /* renamed from: j  reason: collision with root package name */
    public static final k.d f1607j = k.d.f1325o;

    /* renamed from: h  reason: collision with root package name */
    public final int f1608h;

    /* renamed from: i  reason: collision with root package name */
    public final a f1609i;

    static {
        r.b bVar = r.b.f1352l;
        r.b bVar2 = r.b.f1352l;
    }

    public g(a aVar, int i2) {
        this.f1609i = aVar;
        this.f1608h = i2;
    }

    public g(g<T> gVar, int i2) {
        this.f1609i = gVar.f1609i;
        this.f1608h = i2;
    }

    public static <F extends Enum<F> & b> int c(Class<F> cls) {
        int i2 = 0;
        for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
            b bVar = (b) enumR;
            if (bVar.d()) {
                i2 |= bVar.e();
            }
        }
        return i2;
    }

    public final boolean b() {
        return o(p.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public final i d(Class<?> cls) {
        return this.f1609i.f1589k.b((c) null, cls, n.f2185l);
    }

    public b e() {
        if (o(p.USE_ANNOTATIONS)) {
            return this.f1609i.f1587i;
        }
        return x.f1957h;
    }

    public abstract c f(Class<?> cls);

    public abstract r.b g(Class<?> cls, Class<?> cls2);

    public abstract k.d h(Class<?> cls);

    public abstract r.b i(Class<?> cls);

    public r.b j(Class<?> cls, r.b bVar) {
        c a = ((h) this).f1616q.a(cls);
        return bVar;
    }

    public abstract i0<?> k(Class<?> cls, b.j.a.c.e0.b bVar);

    public b.j.a.c.c l(i iVar) {
        q qVar = (q) this.f1609i.f1586h;
        b.j.a.c.e0.p b2 = qVar.b(iVar);
        if (b2 != null) {
            return b2;
        }
        b.j.a.c.e0.p pVar = (b.j.a.c.e0.p) qVar.f1945h.f2226i.get(iVar);
        if (pVar != null) {
            return pVar;
        }
        b.j.a.c.e0.p i2 = b.j.a.c.e0.p.i(this, iVar, qVar.c(this, iVar, this));
        qVar.f1945h.b(iVar, i2);
        return i2;
    }

    public b.j.a.c.c m(Class<?> cls) {
        return l(this.f1609i.f1589k.b((c) null, cls, n.f2185l));
    }

    public final boolean n() {
        return o(p.USE_ANNOTATIONS);
    }

    public final boolean o(p pVar) {
        return (pVar.f2281i & this.f1608h) != 0;
    }
}
