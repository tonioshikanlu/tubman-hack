package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.f.d;
import e.x.b.l;
import e.x.c.k;

public final class n extends k implements l<Class<?>, d> {

    /* renamed from: h  reason: collision with root package name */
    public static final n f8301h = new n();

    public n() {
        super(1);
    }

    public Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!d.m(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return d.l(simpleName);
        }
        return null;
    }
}
