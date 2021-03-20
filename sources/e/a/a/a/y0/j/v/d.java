package e.a.a.a.y0.j.v;

import e.a.a.a.y0.o.b;
import e.x.b.l;
import e.x.c.i;
import e.x.c.u;

public final class d extends b<e.a.a.a.y0.b.b, e.a.a.a.y0.b.b> {
    public final /* synthetic */ u a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f9423b;

    public d(u uVar, l lVar) {
        this.a = uVar;
        this.f9423b = lVar;
    }

    public Object a() {
        return (e.a.a.a.y0.b.b) this.a.f7989h;
    }

    public void b(Object obj) {
        T t = (e.a.a.a.y0.b.b) obj;
        i.e(t, "current");
        if (((e.a.a.a.y0.b.b) this.a.f7989h) == null && ((Boolean) this.f9423b.invoke(t)).booleanValue()) {
            this.a.f7989h = t;
        }
    }

    public boolean c(Object obj) {
        i.e((e.a.a.a.y0.b.b) obj, "current");
        return ((e.a.a.a.y0.b.b) this.a.f7989h) == null;
    }
}
