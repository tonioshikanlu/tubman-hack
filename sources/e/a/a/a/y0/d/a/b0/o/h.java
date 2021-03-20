package e.a.a.a.y0.d.a.b0.o;

import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.w;
import e.x.b.a;
import e.x.c.i;
import e.x.c.k;

public final class h extends k implements a<k0> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r0 f8468h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(r0 r0Var) {
        super(0);
        this.f8468h = r0Var;
    }

    public Object e() {
        StringBuilder y = b.e.a.a.a.y("Can't compute erased upper bound of type parameter `");
        y.append(this.f8468h);
        y.append('`');
        k0 d = w.d(y.toString());
        i.d(d, "ErrorUtils.createErrorTy… type parameter `$this`\")");
        return d;
    }
}
