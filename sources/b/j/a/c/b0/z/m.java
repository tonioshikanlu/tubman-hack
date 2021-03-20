package b.j.a.c.b0.z;

import b.j.a.b.i;
import b.j.a.c.b0.u;
import b.j.a.c.e0.h;
import b.j.a.c.g;

public class m extends u.a {
    public final h x;

    public m(u uVar, h hVar) {
        super(uVar);
        this.x = hVar;
    }

    public void B(Object obj, Object obj2) {
        if (obj2 != null) {
            this.w.B(obj, obj2);
        }
    }

    public Object D(Object obj, Object obj2) {
        return obj2 != null ? this.w.D(obj, obj2) : obj;
    }

    public u L(u uVar) {
        return new m(uVar, this.x);
    }

    public void f(i iVar, g gVar, Object obj) {
        Object k2 = this.x.k(obj);
        u uVar = this.w;
        Object c = k2 == null ? uVar.c(iVar, gVar) : uVar.i(iVar, gVar, k2);
        if (c != k2) {
            this.w.B(obj, c);
        }
    }

    public Object g(i iVar, g gVar, Object obj) {
        Object k2 = this.x.k(obj);
        u uVar = this.w;
        Object c = k2 == null ? uVar.c(iVar, gVar) : uVar.i(iVar, gVar, k2);
        return (c == k2 || c == null) ? obj : this.w.D(obj, c);
    }
}
