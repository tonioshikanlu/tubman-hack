package b.l.c.b;

import b.l.a.c.b.a;
import java.io.Serializable;

public class t<E> extends q<E> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final E f4886h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4887i;

    public t(E e2, int i2) {
        this.f4886h = e2;
        this.f4887i = i2;
        a.w(i2, "count");
    }

    public final int getCount() {
        return this.f4887i;
    }

    public final E m() {
        return this.f4886h;
    }
}
