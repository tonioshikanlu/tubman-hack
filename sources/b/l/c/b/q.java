package b.l.c.b;

import b.l.a.c.b.a;
import b.l.c.b.o;

public abstract class q<E> implements o.a<E> {
    public boolean equals(Object obj) {
        if (!(obj instanceof o.a)) {
            return false;
        }
        o.a aVar = (o.a) obj;
        return getCount() == aVar.getCount() && a.U(m(), aVar.m());
    }

    public int hashCode() {
        Object m2 = m();
        return (m2 == null ? 0 : m2.hashCode()) ^ getCount();
    }

    public String toString() {
        String valueOf = String.valueOf(m());
        int count = getCount();
        if (count == 1) {
            return valueOf;
        }
        return valueOf + " x " + count;
    }
}
