package b.j.a.c.f0;

import b.j.a.a.c0;
import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.c.d;
import b.j.a.c.g;

public abstract class c {
    public static Object a(i iVar, g gVar, b.j.a.c.i iVar2) {
        Class<?> cls = iVar2.f2152h;
        Class<Boolean> cls2 = Boolean.class;
        l g0 = iVar.g0();
        if (g0 == null) {
            return null;
        }
        switch (g0.ordinal()) {
            case 7:
                if (cls.isAssignableFrom(String.class)) {
                    return iVar.x0();
                }
                return null;
            case 8:
                if (cls.isAssignableFrom(Integer.class)) {
                    return Integer.valueOf(iVar.q0());
                }
                return null;
            case 9:
                if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(iVar.n0());
                }
                return null;
            case 10:
                if (cls.isAssignableFrom(cls2)) {
                    return Boolean.TRUE;
                }
                return null;
            case 11:
                if (cls.isAssignableFrom(cls2)) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    public abstract Object b(i iVar, g gVar);

    public abstract Object c(i iVar, g gVar);

    public abstract Object d(i iVar, g gVar);

    public abstract Object e(i iVar, g gVar);

    public abstract c f(d dVar);

    public abstract Class<?> g();

    public abstract String h();

    public abstract d i();

    public abstract c0.a j();
}
