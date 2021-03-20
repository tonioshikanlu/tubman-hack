package e;

import e.x.b.a;
import e.x.c.i;
import java.io.Serializable;

public final class m<T> implements f<T>, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public a<? extends T> f7912h;

    /* renamed from: i  reason: collision with root package name */
    public volatile Object f7913i = p.a;

    /* renamed from: j  reason: collision with root package name */
    public final Object f7914j = this;

    public m(a aVar, Object obj, int i2) {
        int i3 = i2 & 2;
        i.e(aVar, "initializer");
        this.f7912h = aVar;
    }

    public T getValue() {
        T t;
        T t2 = this.f7913i;
        T t3 = p.a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.f7914j) {
            t = this.f7913i;
            if (t == t3) {
                a aVar = this.f7912h;
                i.c(aVar);
                t = aVar.e();
                this.f7913i = t;
                this.f7912h = null;
            }
        }
        return t;
    }

    public String toString() {
        return this.f7913i != p.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
