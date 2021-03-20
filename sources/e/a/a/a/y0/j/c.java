package e.a.a.a.y0.j;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.m.l1.d;
import e.a.a.a.y0.m.v0;
import e.x.c.i;

public final class c implements d.a {
    public final /* synthetic */ boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f9377b;
    public final /* synthetic */ a c;

    public c(boolean z, a aVar, a aVar2) {
        this.a = z;
        this.f9377b = aVar;
        this.c = aVar2;
    }

    public boolean a(v0 v0Var, v0 v0Var2) {
        i.e(v0Var, "c1");
        i.e(v0Var2, "c2");
        if (i.a(v0Var, v0Var2)) {
            return true;
        }
        h d = v0Var.d();
        h d2 = v0Var2.d();
        if (!(d instanceof r0) || !(d2 instanceof r0)) {
            return false;
        }
        return e.a.b((r0) d, (r0) d2, this.a, new b(this));
    }
}
