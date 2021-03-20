package e.a.a.a.y0.d.b;

import e.a.a.a.y0.f.a;
import e.a.a.a.y0.k.b.f;
import e.a.a.a.y0.k.b.g;
import e.x.c.i;

public final class e implements g {
    public final k a;

    /* renamed from: b  reason: collision with root package name */
    public final d f8644b;

    public e(k kVar, d dVar) {
        i.e(kVar, "kotlinClassFinder");
        i.e(dVar, "deserializedDescriptorResolver");
        this.a = kVar;
        this.f8644b = dVar;
    }

    public f a(a aVar) {
        i.e(aVar, "classId");
        l n0 = b.q.a.a.n0(this.a, aVar);
        if (n0 == null) {
            return null;
        }
        i.a(n0.g(), aVar);
        return this.f8644b.f(n0);
    }
}
