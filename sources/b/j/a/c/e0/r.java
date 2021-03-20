package b.j.a.c.e0;

import b.j.a.a.r;
import b.j.a.c.b;
import b.j.a.c.i;
import b.j.a.c.j0.g;
import b.j.a.c.j0.s;
import b.j.a.c.t;
import java.util.Iterator;

public abstract class r implements s {

    /* renamed from: h  reason: collision with root package name */
    public static final r.b f1946h = r.b.f1352l;

    static {
        r.b bVar = r.b.f1352l;
    }

    public abstract h A();

    public abstract i B();

    public abstract Class<?> C();

    public abstract i D();

    public abstract t E();

    public abstract boolean F();

    public abstract boolean G();

    public boolean H(t tVar) {
        return h().equals(tVar);
    }

    public abstract boolean I();

    public abstract boolean J();

    public boolean K() {
        return J();
    }

    public boolean L() {
        return false;
    }

    public abstract String getName();

    public abstract t h();

    public abstract b.j.a.c.s l();

    public boolean n() {
        Object w = w();
        if (w == null && (w = D()) == null) {
            w = y();
        }
        return w != null;
    }

    public boolean p() {
        return v() != null;
    }

    public abstract r.b r();

    public y s() {
        return null;
    }

    public b.a t() {
        return null;
    }

    public Class<?>[] u() {
        return null;
    }

    public h v() {
        i z = z();
        return z == null ? y() : z;
    }

    public abstract l w();

    public Iterator<l> x() {
        return g.c;
    }

    public abstract f y();

    public abstract i z();
}
