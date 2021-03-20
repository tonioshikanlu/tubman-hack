package g.a.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class d<T> extends n {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    private volatile Object _consensus = c.a;

    public final Object a(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = c.a;
        if (obj2 == obj3) {
            obj2 = c(obj);
            Object obj4 = this._consensus;
            if (obj4 != obj3) {
                obj2 = obj4;
            } else if (!a.compareAndSet(this, obj3, obj2)) {
                obj2 = this._consensus;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t, Object obj);

    public abstract Object c(T t);
}
