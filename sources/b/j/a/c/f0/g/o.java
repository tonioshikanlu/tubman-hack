package b.j.a.c.f0.g;

import b.e.a.a.a;
import b.j.a.c.b0.a0.s;
import b.j.a.c.f0.c;
import b.j.a.c.f0.d;
import b.j.a.c.h;
import b.j.a.c.i;
import b.j.a.c.j;
import b.j.a.c.j0.g;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class o extends c implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final d f1980h;

    /* renamed from: i  reason: collision with root package name */
    public final i f1981i;

    /* renamed from: j  reason: collision with root package name */
    public final b.j.a.c.d f1982j;

    /* renamed from: k  reason: collision with root package name */
    public final i f1983k;

    /* renamed from: l  reason: collision with root package name */
    public final String f1984l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f1985m;

    /* renamed from: n  reason: collision with root package name */
    public final Map<String, j<Object>> f1986n;

    /* renamed from: o  reason: collision with root package name */
    public j<Object> f1987o;

    public o(o oVar, b.j.a.c.d dVar) {
        this.f1981i = oVar.f1981i;
        this.f1980h = oVar.f1980h;
        this.f1984l = oVar.f1984l;
        this.f1985m = oVar.f1985m;
        this.f1986n = oVar.f1986n;
        this.f1983k = oVar.f1983k;
        this.f1987o = oVar.f1987o;
        this.f1982j = dVar;
    }

    public o(i iVar, d dVar, String str, boolean z, i iVar2) {
        this.f1981i = iVar;
        this.f1980h = dVar;
        Annotation[] annotationArr = g.a;
        this.f1984l = str == null ? "" : str;
        this.f1985m = z;
        this.f1986n = new ConcurrentHashMap(16, 0.75f, 2);
        this.f1983k = iVar2;
        this.f1982j = null;
    }

    public Class<?> g() {
        return g.A(this.f1983k);
    }

    public final String h() {
        return this.f1984l;
    }

    public d i() {
        return this.f1980h;
    }

    public Object k(b.j.a.b.i iVar, b.j.a.c.g gVar, Object obj) {
        return m(gVar, obj instanceof String ? (String) obj : String.valueOf(obj)).d(iVar, gVar);
    }

    public final j<Object> l(b.j.a.c.g gVar) {
        j<Object> jVar;
        i iVar = this.f1983k;
        if (iVar == null) {
            if (!gVar.O(h.FAIL_ON_INVALID_SUBTYPE)) {
                return s.f1720k;
            }
            return null;
        } else if (g.t(iVar.f2152h)) {
            return s.f1720k;
        } else {
            synchronized (this.f1983k) {
                if (this.f1987o == null) {
                    this.f1987o = gVar.q(this.f1983k, this.f1982j);
                }
                jVar = this.f1987o;
            }
            return jVar;
        }
    }

    public final j<Object> m(b.j.a.c.g gVar, String str) {
        j<Object> jVar = this.f1986n.get(str);
        if (jVar == null) {
            i f = this.f1980h.f(gVar, str);
            if (f == null) {
                jVar = l(gVar);
                if (jVar == null) {
                    String d = this.f1980h.d();
                    String m2 = d == null ? "type ids are not statically known" : a.m("known type ids = ", d);
                    b.j.a.c.d dVar = this.f1982j;
                    if (dVar != null) {
                        m2 = String.format("%s (for POJO property '%s')", new Object[]{m2, dVar.getName()});
                    }
                    gVar.I(this.f1981i, str, this.f1980h, m2);
                    return null;
                }
            } else {
                i iVar = this.f1981i;
                if (iVar != null && iVar.getClass() == f.getClass() && !f.t()) {
                    f = gVar.h().k(this.f1981i, f.f2152h);
                }
                jVar = gVar.q(f, this.f1982j);
            }
            this.f1986n.put(str, jVar);
        }
        return jVar;
    }

    public String n() {
        return this.f1981i.f2152h.getName();
    }

    public String toString() {
        StringBuilder v = a.v('[');
        v.append(getClass().getName());
        v.append("; base-type:");
        v.append(this.f1981i);
        v.append("; id-resolver: ");
        v.append(this.f1980h);
        v.append(']');
        return v.toString();
    }
}
