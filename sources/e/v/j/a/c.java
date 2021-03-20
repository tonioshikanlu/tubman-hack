package e.v.j.a;

import e.v.d;
import e.v.e;
import e.v.f;
import e.x.c.i;

public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public transient d<Object> f7963i;

    /* renamed from: j  reason: collision with root package name */
    public final f f7964j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar) {
        super(dVar);
        f context = dVar != null ? dVar.getContext() : null;
        this.f7964j = context;
    }

    public c(d<Object> dVar, f fVar) {
        super(dVar);
        this.f7964j = fVar;
    }

    public void e() {
        d<Object> dVar = this.f7963i;
        if (!(dVar == null || dVar == this)) {
            f fVar = this.f7964j;
            i.c(fVar);
            int i2 = e.d;
            f.a aVar = fVar.get(e.a.a);
            i.c(aVar);
            ((e) aVar).e(dVar);
        }
        this.f7963i = b.f7962h;
    }

    public f getContext() {
        f fVar = this.f7964j;
        i.c(fVar);
        return fVar;
    }
}
