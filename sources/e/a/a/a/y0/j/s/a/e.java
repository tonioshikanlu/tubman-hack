package e.a.a.a.y0.j.s.a;

import b.q.a.a;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.m.b1;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.q;
import e.a.a.a.y0.m.y0;
import e.x.c.i;

public final class e extends q {
    public final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(b1 b1Var, boolean z, b1 b1Var2) {
        super(b1Var2);
        this.c = z;
    }

    public boolean b() {
        return this.c;
    }

    public y0 e(d0 d0Var) {
        i.e(d0Var, "key");
        i.e(d0Var, "key");
        y0 e2 = this.f9751b.e(d0Var);
        r0 r0Var = null;
        if (e2 == null) {
            return null;
        }
        h d = d0Var.W0().d();
        if (d instanceof r0) {
            r0Var = d;
        }
        return a.S(e2, r0Var);
    }
}
