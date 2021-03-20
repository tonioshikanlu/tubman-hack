package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.d.a.d0.u;
import e.a.a.a.y0.j.w.c;
import e.x.c.i;
import java.lang.reflect.Type;

public final class c0 extends d0 implements u {
    public final Class<?> a;

    public c0(Class<?> cls) {
        i.e(cls, "reflectType");
        this.a = cls;
    }

    public Type Q() {
        return this.a;
    }

    public e.a.a.a.y0.a.i d() {
        if (i.a(this.a, Void.TYPE)) {
            return null;
        }
        c e2 = c.e(this.a.getName());
        i.d(e2, "JvmPrimitiveType.get(reflectType.name)");
        return e2.l();
    }
}
