package e.a.a.a.y0.d.a.e0;

import b.q.a.a;
import e.a.a.a.y0.d.a.a;
import e.a.a.a.y0.d.a.b0.e;
import e.a.a.a.y0.d.a.b0.h;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.y0;
import e.r;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;

public final class p extends k implements e.x.b.p<d0, h, r> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ArrayList f8557h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(ArrayList arrayList) {
        super(2);
        this.f8557h = arrayList;
    }

    public final void a(d0 d0Var, h hVar) {
        i.e(d0Var, "type");
        i.e(hVar, "ownerContext");
        h Q = a.Q(hVar, d0Var.k());
        ArrayList arrayList = this.f8557h;
        e a = Q.a();
        arrayList.add(new v(d0Var, a != null ? a.a(a.C0170a.TYPE_USE) : null));
        for (y0 next : d0Var.V0()) {
            if (next.c()) {
                ArrayList arrayList2 = this.f8557h;
                d0 d = next.d();
                i.d(d, "arg.type");
                arrayList2.add(new v(d, (d) null));
            } else {
                d0 d2 = next.d();
                i.d(d2, "arg.type");
                a(d2, Q);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((d0) obj, (h) obj2);
        return r.a;
    }
}
