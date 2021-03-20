package b.j.a.c.h0.s;

import b.j.a.c.d;
import b.j.a.c.h0.h;
import b.j.a.c.h0.t.b;
import b.j.a.c.i;
import b.j.a.c.n;
import b.j.a.c.x;
import b.j.a.c.y;
import b.j.a.c.z.a;
import java.util.List;

@a
public final class f extends b<List<?>> {
    public f(f fVar, d dVar, b.j.a.c.f0.f fVar2, n<?> nVar, Boolean bool) {
        super((b<?>) fVar, dVar, fVar2, nVar, bool);
    }

    public f(i iVar, boolean z, b.j.a.c.f0.f fVar, n<Object> nVar) {
        super((Class<?>) List.class, iVar, z, fVar, nVar);
    }

    public boolean d(y yVar, Object obj) {
        return ((List) obj).isEmpty();
    }

    public void f(Object obj, b.j.a.b.f fVar, y yVar) {
        List list = (List) obj;
        int size = list.size();
        if (size != 1 || ((this.f2086m != null || !yVar.K(x.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.f2086m != Boolean.TRUE)) {
            fVar.M0(size);
            u(list, fVar, yVar);
            fVar.q0();
            return;
        }
        u(list, fVar, yVar);
    }

    public h<?> q(b.j.a.c.f0.f fVar) {
        return new f(this, this.f2084k, fVar, this.f2088o, this.f2086m);
    }

    public b v(d dVar, b.j.a.c.f0.f fVar, n nVar, Boolean bool) {
        return new f(this, dVar, fVar, nVar, bool);
    }

    /* renamed from: w */
    public void u(List<?> list, b.j.a.b.f fVar, y yVar) {
        n<Object> nVar = this.f2088o;
        int i2 = 0;
        if (nVar != null) {
            int size = list.size();
            if (size != 0) {
                b.j.a.c.f0.f fVar2 = this.f2087n;
                while (i2 < size) {
                    Object obj = list.get(i2);
                    if (obj == null) {
                        try {
                            yVar.t(fVar);
                        } catch (Exception e2) {
                            n(yVar, e2, list, i2);
                            throw null;
                        }
                    } else if (fVar2 == null) {
                        nVar.f(obj, fVar, yVar);
                    } else {
                        nVar.g(obj, fVar, yVar, fVar2);
                    }
                    i2++;
                }
            }
        } else if (this.f2087n != null) {
            int size2 = list.size();
            if (size2 != 0) {
                try {
                    b.j.a.c.f0.f fVar3 = this.f2087n;
                    l lVar = this.f2089p;
                    while (i2 < size2) {
                        Object obj2 = list.get(i2);
                        if (obj2 == null) {
                            yVar.t(fVar);
                        } else {
                            Class<?> cls = obj2.getClass();
                            n<Object> c = lVar.c(cls);
                            if (c == null) {
                                c = this.f2083j.t() ? r(lVar, yVar.d(this.f2083j, cls), yVar) : t(lVar, cls, yVar);
                                lVar = this.f2089p;
                            }
                            c.g(obj2, fVar, yVar, fVar3);
                        }
                        i2++;
                    }
                } catch (Exception e3) {
                    n(yVar, e3, list, 0);
                    throw null;
                }
            }
        } else {
            int size3 = list.size();
            if (size3 != 0) {
                try {
                    l lVar2 = this.f2089p;
                    while (i2 < size3) {
                        Object obj3 = list.get(i2);
                        if (obj3 == null) {
                            yVar.t(fVar);
                        } else {
                            Class<?> cls2 = obj3.getClass();
                            n<Object> c2 = lVar2.c(cls2);
                            if (c2 == null) {
                                c2 = this.f2083j.t() ? r(lVar2, yVar.d(this.f2083j, cls2), yVar) : t(lVar2, cls2, yVar);
                                lVar2 = this.f2089p;
                            }
                            c2.f(obj3, fVar, yVar);
                        }
                        i2++;
                    }
                } catch (Exception e4) {
                    n(yVar, e4, list, 0);
                    throw null;
                }
            }
        }
    }
}
