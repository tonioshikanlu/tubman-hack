package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.d.a.d0.v;
import e.x.c.i;
import java.lang.reflect.Type;

public abstract class d0 implements v {
    public abstract Type Q();

    public boolean equals(Object obj) {
        return (obj instanceof d0) && i.a(Q(), ((d0) obj).Q());
    }

    public int hashCode() {
        return Q().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + Q();
    }
}
