package b.j.a.c;

import b.j.a.b.i;
import b.j.a.c.b0.r;
import b.j.a.c.b0.u;
import b.j.a.c.f0.c;
import java.util.Collection;

public abstract class j<T> implements r {

    public static abstract class a extends j<Object> {
    }

    public T c(g gVar) {
        return null;
    }

    public abstract T d(i iVar, g gVar);

    public T e(i iVar, g gVar, T t) {
        if (gVar.P(p.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return d(iVar, gVar);
        }
        StringBuilder y = b.e.a.a.a.y("Cannot update object of type ");
        y.append(t.getClass().getName());
        y.append(" (by deserializer of type ");
        y.append(getClass().getName());
        y.append(")");
        throw new UnsupportedOperationException(y.toString());
    }

    public Object f(i iVar, g gVar, c cVar) {
        return cVar.b(iVar, gVar);
    }

    public u g(String str) {
        StringBuilder C = b.e.a.a.a.C("Cannot handle managed/back reference '", str, "': type: value deserializer of type ");
        C.append(getClass().getName());
        C.append(" does not support them");
        throw new IllegalArgumentException(C.toString());
    }

    public b.j.a.c.j0.a h() {
        return b.j.a.c.j0.a.DYNAMIC;
    }

    public Object i(g gVar) {
        return c(gVar);
    }

    public Collection<Object> j() {
        return null;
    }

    public b.j.a.c.b0.z.r k() {
        return null;
    }

    public Class<?> l() {
        return null;
    }

    public boolean m() {
        return false;
    }

    public Boolean n(f fVar) {
        return null;
    }

    public j<T> o(b.j.a.c.j0.r rVar) {
        return this;
    }
}
