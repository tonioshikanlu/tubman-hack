package b.j.a.c.b0.z;

import b.e.a.a.a;
import b.j.a.b.i;
import b.j.a.c.b0.u;
import b.j.a.c.f;
import b.j.a.c.g;
import java.util.Collection;
import java.util.Map;

public final class l extends u.a {
    public final String x;
    public final boolean y;
    public final u z;

    public l(u uVar, String str, u uVar2, boolean z2) {
        super(uVar);
        this.x = str;
        this.z = uVar2;
        this.y = z2;
    }

    public final void B(Object obj, Object obj2) {
        D(obj, obj2);
    }

    public Object D(Object obj, Object obj2) {
        if (obj2 != null) {
            if (!this.y) {
                this.z.B(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        this.z.B(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object next : (Collection) obj2) {
                    if (next != null) {
                        this.z.B(next, obj);
                    }
                }
            } else if (obj2 instanceof Map) {
                for (Object next2 : ((Map) obj2).values()) {
                    if (next2 != null) {
                        this.z.B(next2, obj);
                    }
                }
            } else {
                StringBuilder y2 = a.y("Unsupported container type (");
                y2.append(obj2.getClass().getName());
                y2.append(") when resolving reference '");
                throw new IllegalStateException(a.q(y2, this.x, "'"));
            }
        }
        return this.w.D(obj, obj2);
    }

    public u L(u uVar) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    public void f(i iVar, g gVar, Object obj) {
        D(obj, this.w.c(iVar, gVar));
    }

    public Object g(i iVar, g gVar, Object obj) {
        return D(obj, c(iVar, gVar));
    }

    public void k(f fVar) {
        this.w.k(fVar);
        this.z.k(fVar);
    }
}
