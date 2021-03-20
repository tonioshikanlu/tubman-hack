package b.l.c.b;

import b.l.c.b.o;

public abstract class s<E> extends a0<o.a<E>> {
    public void clear() {
        d().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof o.a)) {
            return false;
        }
        o.a aVar = (o.a) obj;
        return aVar.getCount() > 0 && d().S(aVar.m()) == aVar.getCount();
    }

    public abstract o<E> d();

    public boolean remove(Object obj) {
        if (obj instanceof o.a) {
            o.a aVar = (o.a) obj;
            Object m2 = aVar.m();
            int count = aVar.getCount();
            if (count != 0) {
                return d().F(m2, count, 0);
            }
        }
        return false;
    }
}
