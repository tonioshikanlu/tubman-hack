package e.a.a.a.y0.m.o1;

import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.m.i1;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;

public final class a extends k implements l<i1, Boolean> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f9741h = new a();

    public a() {
        super(1);
    }

    public Object invoke(Object obj) {
        i1 i1Var = (i1) obj;
        i.e(i1Var, "it");
        h d = i1Var.W0().d();
        boolean z = false;
        if (d != null) {
            i.e(d, "$this$isTypeAliasParameter");
            if ((d instanceof r0) && (((r0) d).b() instanceof q0)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
