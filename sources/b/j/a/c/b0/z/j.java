package b.j.a.c.b0.z;

import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.c.b0.u;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import java.lang.reflect.Constructor;

public final class j extends u.a {
    public final transient Constructor<?> x;

    public j(u uVar, Constructor<?> constructor) {
        super(uVar);
        this.x = constructor;
    }

    public u L(u uVar) {
        return uVar == this.w ? this : new j(uVar, this.x);
    }

    public void f(i iVar, g gVar, Object obj) {
        Object obj2;
        if (iVar.g0() == l.VALUE_NULL) {
            obj2 = this.f1800o.c(gVar);
        } else {
            c cVar = this.f1801p;
            if (cVar != null) {
                obj2 = this.f1800o.f(iVar, gVar, cVar);
            } else {
                try {
                    Object newInstance = this.x.newInstance(new Object[]{obj});
                    this.f1800o.e(iVar, gVar, newInstance);
                    obj2 = newInstance;
                } catch (Exception e2) {
                    b.j.a.c.j0.g.F(e2, String.format("Failed to instantiate class %s, problem: %s", new Object[]{this.x.getDeclaringClass().getName(), e2.getMessage()}));
                    throw null;
                }
            }
        }
        this.w.B(obj, obj2);
    }

    public Object g(i iVar, g gVar, Object obj) {
        return this.w.D(obj, c(iVar, gVar));
    }
}
