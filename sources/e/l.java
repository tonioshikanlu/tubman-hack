package e;

import b.m.a.t.i;
import e.x.b.a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class l<T> implements f<T>, Serializable {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<l<?>, Object> f7909j = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, i.f5973b);

    /* renamed from: h  reason: collision with root package name */
    public volatile a<? extends T> f7910h;

    /* renamed from: i  reason: collision with root package name */
    private volatile Object f7911i = p.a;

    public l(a<? extends T> aVar) {
        e.x.c.i.e(aVar, "initializer");
        this.f7910h = aVar;
    }

    public T getValue() {
        T t = this.f7911i;
        T t2 = p.a;
        if (t != t2) {
            return t;
        }
        a<? extends T> aVar = this.f7910h;
        if (aVar != null) {
            T e2 = aVar.e();
            if (f7909j.compareAndSet(this, t2, e2)) {
                this.f7910h = null;
                return e2;
            }
        }
        return this.f7911i;
    }

    public String toString() {
        return this.f7911i != p.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
