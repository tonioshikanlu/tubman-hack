package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.z;
import e.x.b.a;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.List;

public final class y extends k implements a<l> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a0 f8279h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var) {
        super(0);
        this.f8279h = a0Var;
    }

    public Object e() {
        w wVar = this.f8279h.f8156k;
        if (wVar != null) {
            List<a0> b2 = wVar.b();
            b2.contains(this.f8279h);
            for (a0 a0Var : b2) {
                z zVar = a0Var.f8157l;
            }
            ArrayList arrayList = new ArrayList(b.q.a.a.C(b2, 10));
            for (a0 a0Var2 : b2) {
                z zVar2 = a0Var2.f8157l;
                i.c(zVar2);
                arrayList.add(zVar2);
            }
            return new l(arrayList);
        }
        StringBuilder y = b.e.a.a.a.y("Dependencies of module ");
        y.append(this.f8279h.w0());
        y.append(" were not set before querying module content");
        throw new AssertionError(y.toString());
    }
}
