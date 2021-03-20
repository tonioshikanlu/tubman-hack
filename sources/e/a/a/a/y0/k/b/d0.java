package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.f.a;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;

public final class d0 extends k implements l<Integer, h> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c0 f9497h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var) {
        super(1);
        this.f9497h = c0Var;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        c0 c0Var = this.f9497h;
        a D0 = b.q.a.a.D0(c0Var.d.d, intValue);
        q0 q0Var = null;
        if (D0.c) {
            return null;
        }
        w wVar = c0Var.d.c.c;
        i.e(wVar, "$this$findTypeAliasAcrossModuleDependencies");
        i.e(D0, "classId");
        h m0 = b.q.a.a.m0(wVar, D0);
        if (m0 instanceof q0) {
            q0Var = m0;
        }
        return q0Var;
    }
}
