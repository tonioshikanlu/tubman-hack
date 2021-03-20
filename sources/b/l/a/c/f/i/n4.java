package b.l.a.c.f.i;

import java.util.Iterator;

public abstract class n4 implements Iterator {
    public abstract byte a();

    public final /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
