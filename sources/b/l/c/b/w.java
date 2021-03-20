package b.l.c.b;

import java.util.Comparator;

public abstract class w<T> implements Comparator<T> {
    public <S extends T> w<S> a() {
        return new z(this);
    }

    public abstract int compare(T t, T t2);
}
