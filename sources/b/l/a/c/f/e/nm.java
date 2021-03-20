package b.l.a.c.f.e;

import java.util.Iterator;

public abstract class nm implements Iterator {
    public abstract byte a();

    public final /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
