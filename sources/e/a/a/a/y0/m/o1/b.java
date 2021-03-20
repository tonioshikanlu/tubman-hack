package e.a.a.a.y0.m.o1;

import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.m.i1;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;

public final class b extends k implements l<i1, Boolean> {

    /* renamed from: h  reason: collision with root package name */
    public static final b f9742h = new b();

    public b() {
        super(1);
    }

    public Object invoke(Object obj) {
        i1 i1Var = (i1) obj;
        i.e(i1Var, "it");
        h d = i1Var.W0().d();
        boolean z = false;
        if (d != null && ((d instanceof q0) || (d instanceof r0))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
