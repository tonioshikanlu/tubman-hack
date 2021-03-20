package e.v;

import e.v.f;
import e.v.f.a;
import e.x.b.l;
import e.x.c.i;

public abstract class b<B extends f.a, E extends B> implements f.b<E> {
    public final f.b<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final l<f.a, E> f7944b;

    public b(f.b<B> bVar, l<? super f.a, ? extends E> lVar) {
        i.e(bVar, "baseKey");
        i.e(lVar, "safeCast");
        this.f7944b = lVar;
        this.a = bVar instanceof b ? ((b) bVar).a : bVar;
    }
}
