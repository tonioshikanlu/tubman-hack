package b.j.a.c.b0.z;

import b.j.a.b.l;
import b.j.a.c.b0.d;
import b.j.a.c.b0.u;
import b.j.a.c.b0.z.w;
import b.j.a.c.e0.i;
import b.j.a.c.f;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.j;
import b.j.a.c.j0.r;
import java.util.Set;

public class a extends d {
    public final d E;
    public final u[] F;
    public final i G;
    public final b.j.a.c.i H;

    public a(d dVar, b.j.a.c.i iVar, u[] uVarArr, i iVar2) {
        super(dVar, dVar.w);
        this.E = dVar;
        this.H = iVar;
        this.F = uVarArr;
        this.G = iVar2;
    }

    public final Object A0(g gVar, Object obj) {
        try {
            return this.G.f1913k.invoke(obj, (Object[]) null);
        } catch (Exception e2) {
            y0(e2, gVar);
            throw null;
        }
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        Object obj;
        if (!iVar.O0()) {
            z0(iVar, gVar);
            throw null;
        } else if (!this.r) {
            if (this.f1775q) {
                obj = n0(iVar, gVar);
            } else {
                Object u = this.f1771m.u(gVar);
                if (this.t != null) {
                    t0(gVar, u);
                }
                Class<?> cls = this.x ? gVar.f1995l : null;
                u[] uVarArr = this.F;
                int length = uVarArr.length;
                int i2 = 0;
                while (true) {
                    l T0 = iVar.T0();
                    l lVar = l.END_ARRAY;
                    if (T0 == lVar) {
                        break;
                    } else if (i2 != length) {
                        u uVar = uVarArr[i2];
                        i2++;
                        if (uVar == null || (cls != null && !uVar.F(cls))) {
                            iVar.a1();
                        } else {
                            try {
                                uVar.g(iVar, gVar, u);
                            } catch (Exception e2) {
                                x0(e2, u, uVar.f1796k.f2305h, gVar);
                                throw null;
                            }
                        }
                    } else if (this.w || !gVar.O(h.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        while (iVar.T0() != l.END_ARRAY) {
                            iVar.a1();
                        }
                    } else {
                        gVar.b0(this, lVar, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                        throw null;
                    }
                }
                obj = u;
            }
            return A0(gVar, obj);
        } else {
            Object u2 = this.f1771m.u(gVar);
            u[] uVarArr2 = this.F;
            int length2 = uVarArr2.length;
            int i3 = 0;
            while (iVar.T0() != l.END_ARRAY) {
                if (i3 != length2) {
                    u uVar2 = uVarArr2[i3];
                    if (uVar2 != null) {
                        try {
                            u2 = uVar2.g(iVar, gVar, u2);
                        } catch (Exception e3) {
                            x0(e3, u2, uVar2.f1796k.f2305h, gVar);
                            throw null;
                        }
                    } else {
                        iVar.a1();
                    }
                    i3++;
                } else if (this.w || !gVar.O(h.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    while (iVar.T0() != l.END_ARRAY) {
                        iVar.a1();
                    }
                    return A0(gVar, u2);
                } else {
                    gVar.Z(this.f1769k.f2152h, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                    throw null;
                }
            }
            return A0(gVar, u2);
        }
    }

    public final Object d0(b.j.a.b.i iVar, g gVar) {
        u uVar = this.f1774p;
        x xVar = new x(iVar, gVar, uVar.a, this.C);
        u[] uVarArr = this.F;
        int length = uVarArr.length;
        Class<?> cls = this.x ? gVar.f1995l : null;
        Object obj = null;
        int i2 = 0;
        while (iVar.T0() != l.END_ARRAY) {
            u uVar2 = i2 < length ? uVarArr[i2] : null;
            if (uVar2 == null || (cls != null && !uVar2.F(cls))) {
                iVar.a1();
            } else if (obj != null) {
                try {
                    obj = uVar2.g(iVar, gVar, obj);
                } catch (Exception e2) {
                    x0(e2, obj, uVar2.f1796k.f2305h, gVar);
                    throw null;
                }
            } else {
                String str = uVar2.f1796k.f2305h;
                u c = uVar.c(str);
                if (c != null) {
                    if (xVar.b(c, c.c(iVar, gVar))) {
                        try {
                            obj = uVar.a(gVar, xVar);
                            Class<?> cls2 = obj.getClass();
                            b.j.a.c.i iVar2 = this.f1769k;
                            Class<?> cls3 = iVar2.f2152h;
                            if (cls2 != cls3) {
                                gVar.l(iVar2, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", new Object[]{cls3.getName(), obj.getClass().getName()}));
                                throw null;
                            }
                        } catch (Exception e3) {
                            x0(e3, this.f1769k.f2152h, str, gVar);
                            throw null;
                        }
                    } else {
                        continue;
                    }
                } else if (!xVar.d(str)) {
                    xVar.f1853h = new w.c(xVar.f1853h, uVar2.c(iVar, gVar), uVar2);
                }
            }
            i2++;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return uVar.a(gVar, xVar);
        } catch (Exception e4) {
            y0(e4, gVar);
            throw null;
        }
    }

    public Object e(b.j.a.b.i iVar, g gVar, Object obj) {
        return this.E.e(iVar, gVar, obj);
    }

    public d h0() {
        return this;
    }

    public Boolean n(f fVar) {
        return Boolean.FALSE;
    }

    public j<Object> o(r rVar) {
        return this.E.o(rVar);
    }

    public d u0(c cVar) {
        return new a(this.E.u0(cVar), this.H, this.F, this.G);
    }

    public d v0(Set<String> set) {
        return new a(this.E.v0(set), this.H, this.F, this.G);
    }

    public d w0(r rVar) {
        return new a(this.E.w0(rVar), this.H, this.F, this.G);
    }

    public Object z0(b.j.a.b.i iVar, g gVar) {
        gVar.H(this.f1769k.f2152h, iVar.g0(), iVar, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this.f1769k.f2152h.getName(), iVar.g0());
        throw null;
    }
}
