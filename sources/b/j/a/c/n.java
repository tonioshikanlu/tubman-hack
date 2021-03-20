package b.j.a.c;

import b.j.a.b.f;
import b.j.a.c.j0.r;

public abstract class n<T> {

    public static abstract class a extends n<Object> {
    }

    public Class<T> c() {
        return null;
    }

    public boolean d(y yVar, T t) {
        return t == null;
    }

    public boolean e() {
        return false;
    }

    public abstract void f(T t, f fVar, y yVar);

    public void g(T t, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        Class<?> c = c();
        if (c == null) {
            c = t.getClass();
        }
        yVar.l(yVar.e(c), String.format("Type id handling not implemented for type %s (by serializer of type %s)", new Object[]{c.getName(), getClass().getName()}));
        throw null;
    }

    public n<T> h(r rVar) {
        return this;
    }

    public boolean i() {
        return false;
    }
}
