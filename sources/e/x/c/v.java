package e.x.c;

import e.a.e;
import e.a.j;
import e.a.m;

public class v {
    public static final w a;

    /* renamed from: b  reason: collision with root package name */
    public static final e[] f7990b = new e[0];

    static {
        w wVar;
        try {
            wVar = (w) Class.forName("e.a.a.a.q0").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            wVar = null;
        }
        if (wVar == null) {
            wVar = new w();
        }
        a = wVar;
    }

    public static e a(Class cls) {
        return a.b(cls);
    }

    public static j b(l lVar) {
        return a.d(lVar);
    }

    public static m c(p pVar) {
        return a.e(pVar);
    }
}
