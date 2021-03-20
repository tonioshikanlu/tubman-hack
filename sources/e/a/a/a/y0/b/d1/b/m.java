package e.a.a.a.y0.b.d1.b;

import e.x.b.l;
import e.x.c.i;
import e.x.c.k;

public final class m extends k implements l<Class<?>, Boolean> {

    /* renamed from: h  reason: collision with root package name */
    public static final m f8300h = new m();

    public m() {
        super(1);
    }

    public Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        i.d(simpleName, "it.simpleName");
        return Boolean.valueOf(simpleName.length() == 0);
    }
}
