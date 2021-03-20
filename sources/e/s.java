package e;

import e.x.b.a;
import e.x.c.i;
import java.io.Serializable;

public final class s<T> implements f<T>, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public a<? extends T> f7918h;

    /* renamed from: i  reason: collision with root package name */
    public Object f7919i = p.a;

    public s(a<? extends T> aVar) {
        i.e(aVar, "initializer");
        this.f7918h = aVar;
    }

    public T getValue() {
        if (this.f7919i == p.a) {
            a<? extends T> aVar = this.f7918h;
            i.c(aVar);
            this.f7919i = aVar.e();
            this.f7918h = null;
        }
        return this.f7919i;
    }

    public String toString() {
        return this.f7919i != p.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
