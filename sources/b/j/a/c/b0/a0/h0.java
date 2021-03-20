package b.j.a.c.b0.a0;

import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.c.b0.c;
import b.j.a.c.b0.d;
import b.j.a.c.b0.t;
import b.j.a.c.b0.u;
import b.j.a.c.b0.x;
import b.j.a.c.g;
import b.j.a.c.j;
import b.j.a.c.j0.r;
import java.util.Set;

public class h0 extends c {
    public h0(c cVar) {
        super(cVar);
        this.r = false;
    }

    public h0(c cVar, r rVar) {
        super((d) cVar, rVar);
    }

    public Object A0(i iVar, g gVar) {
        if (this.f1774p != null) {
            return d0(iVar, gVar);
        }
        j<Object> jVar = this.f1772n;
        if (jVar != null) {
            return this.f1771m.v(gVar, jVar.d(iVar, gVar));
        }
        if (!this.f1769k.w()) {
            boolean g2 = this.f1771m.g();
            boolean i2 = this.f1771m.i();
            if (g2 || i2) {
                int i3 = 0;
                Object obj = null;
                Object[] objArr = null;
                while (iVar.g0() != l.END_OBJECT) {
                    String e0 = iVar.e0();
                    u v = this.s.v(e0);
                    iVar.T0();
                    if (v != null) {
                        if (obj != null) {
                            v.f(iVar, gVar, obj);
                        } else {
                            if (objArr == null) {
                                int i4 = this.s.f1810j;
                                objArr = new Object[(i4 + i4)];
                            }
                            int i5 = i3 + 1;
                            objArr[i3] = v;
                            i3 = i5 + 1;
                            objArr[i5] = v.c(iVar, gVar);
                        }
                    } else if (!"message".equals(e0) || !g2) {
                        Set<String> set = this.v;
                        if (set == null || !set.contains(e0)) {
                            t tVar = this.u;
                            if (tVar != null) {
                                tVar.b(iVar, gVar, obj, e0);
                            } else {
                                b0(iVar, gVar, obj, e0);
                            }
                        } else {
                            iVar.a1();
                        }
                    } else {
                        obj = this.f1771m.r(gVar, iVar.H0());
                        if (objArr != null) {
                            for (int i6 = 0; i6 < i3; i6 += 2) {
                                ((u) objArr[i6]).B(obj, objArr[i6 + 1]);
                            }
                            objArr = null;
                        }
                    }
                    iVar.T0();
                }
                if (obj == null) {
                    x xVar = this.f1771m;
                    obj = g2 ? xVar.r(gVar, (String) null) : xVar.u(gVar);
                    if (objArr != null) {
                        for (int i7 = 0; i7 < i3; i7 += 2) {
                            ((u) objArr[i7]).B(obj, objArr[i7 + 1]);
                        }
                    }
                }
                return obj;
            }
            gVar.D(this.f1769k.f2152h, this.f1771m, iVar, "Throwable needs a default contructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
            throw null;
        }
        gVar.D(this.f1769k.f2152h, this.f1771m, iVar, "abstract type (need to add/enable type information?)", new Object[0]);
        throw null;
    }

    public j<Object> o(r rVar) {
        return h0.class != h0.class ? this : new h0(this, rVar);
    }
}
