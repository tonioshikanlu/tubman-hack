package b.j.a.c.b0;

import b.j.a.b.l;
import b.j.a.c.b0.z.y;
import b.j.a.c.d;
import b.j.a.c.e0.f;
import b.j.a.c.e0.h;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.i;
import b.j.a.c.j;
import b.j.a.c.k;
import b.j.a.c.o;
import java.io.Closeable;
import java.io.Serializable;
import java.util.Map;

public class t implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final d f1788h;

    /* renamed from: i  reason: collision with root package name */
    public final h f1789i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1790j;

    /* renamed from: k  reason: collision with root package name */
    public final i f1791k;

    /* renamed from: l  reason: collision with root package name */
    public j<Object> f1792l;

    /* renamed from: m  reason: collision with root package name */
    public final c f1793m;

    /* renamed from: n  reason: collision with root package name */
    public final o f1794n;

    public static class a extends y.a {
        public final t c;
        public final Object d;

        /* renamed from: e  reason: collision with root package name */
        public final String f1795e;

        public a(t tVar, v vVar, Class<?> cls, Object obj, String str) {
            super(vVar, cls);
            this.c = tVar;
            this.d = obj;
            this.f1795e = str;
        }

        public void a(Object obj, Object obj2) {
            if (obj.equals(this.a.f1803k.f1855b.f1304j)) {
                this.c.c(this.d, this.f1795e, obj2);
                return;
            }
            StringBuilder y = b.e.a.a.a.y("Trying to resolve a forward reference with id [");
            y.append(obj.toString());
            y.append("] that wasn't previously registered.");
            throw new IllegalArgumentException(y.toString());
        }
    }

    public t(d dVar, h hVar, i iVar, o oVar, j<Object> jVar, c cVar) {
        this.f1788h = dVar;
        this.f1789i = hVar;
        this.f1791k = iVar;
        this.f1792l = jVar;
        this.f1793m = cVar;
        this.f1794n = oVar;
        this.f1790j = hVar instanceof f;
    }

    public Object a(b.j.a.b.i iVar, g gVar) {
        if (iVar.g0() == l.VALUE_NULL) {
            return this.f1792l.c(gVar);
        }
        c cVar = this.f1793m;
        return cVar != null ? this.f1792l.f(iVar, gVar, cVar) : this.f1792l.d(iVar, gVar);
    }

    public final void b(b.j.a.b.i iVar, g gVar, Object obj, String str) {
        try {
            o oVar = this.f1794n;
            c(obj, oVar == null ? str : oVar.a(str, gVar), a(iVar, gVar));
        } catch (v e2) {
            if (this.f1792l.k() != null) {
                e2.f1803k.a(new a(this, e2, this.f1791k.f2152h, obj, str));
                return;
            }
            throw new k((Closeable) iVar, "Unresolved forward reference but no identity info.", (Throwable) e2);
        }
    }

    public void c(Object obj, Object obj2, Object obj3) {
        try {
            if (this.f1790j) {
                Map map = (Map) ((f) this.f1789i).k(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                    return;
                }
                return;
            }
            ((b.j.a.c.e0.i) this.f1789i).f1913k.invoke(obj, new Object[]{obj2, obj3});
        } catch (Exception e2) {
            if (e2 instanceof IllegalArgumentException) {
                String f = b.j.a.c.j0.g.f(obj3);
                StringBuilder sb = new StringBuilder("Problem deserializing \"any\" property '");
                sb.append(obj2);
                StringBuilder y = b.e.a.a.a.y("' of class ");
                y.append(this.f1789i.h().getName());
                y.append(" (expected type: ");
                sb.append(y.toString());
                sb.append(this.f1791k);
                sb.append("; actual type: ");
                sb.append(f);
                sb.append(")");
                String i2 = b.j.a.c.j0.g.i(e2);
                if (i2 != null) {
                    sb.append(", problem: ");
                } else {
                    i2 = " (no error message provided)";
                }
                sb.append(i2);
                throw new k((Closeable) null, sb.toString(), (Throwable) e2);
            }
            b.j.a.c.j0.g.D(e2);
            b.j.a.c.j0.g.E(e2);
            Throwable r = b.j.a.c.j0.g.r(e2);
            throw new k((Closeable) null, b.j.a.c.j0.g.i(r), r);
        }
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("[any property on class ");
        y.append(this.f1789i.h().getName());
        y.append("]");
        return y.toString();
    }
}
