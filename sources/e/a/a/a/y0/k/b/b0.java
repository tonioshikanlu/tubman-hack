package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.h;
import e.a.a.a.y0.f.a;
import e.x.b.l;
import e.x.c.k;

public final class b0 extends k implements l<Integer, h> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c0 f9488h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var) {
        super(1);
        this.f9488h = c0Var;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        c0 c0Var = this.f9488h;
        a D0 = b.q.a.a.D0(c0Var.d.d, intValue);
        if (D0.c) {
            return c0Var.d.c.b(D0);
        }
        return b.q.a.a.m0(c0Var.d.c.c, D0);
    }
}
