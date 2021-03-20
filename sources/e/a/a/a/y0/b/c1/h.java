package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.c1.g;
import e.a.a.a.y0.j.y.b;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.j.y.n;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.o1.c;
import e.a.a.a.y0.o.l;
import e.x.b.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class h implements a<i> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g.b f8208h;

    public h(g.b bVar) {
        this.f8208h = bVar;
    }

    public Object e() {
        StringBuilder y = b.e.a.a.a.y("Scope for type parameter ");
        y.append(this.f8208h.f8205h.e());
        String sb = y.toString();
        List<d0> upperBounds = g.this.getUpperBounds();
        int i2 = n.c;
        e.x.c.i.e(sb, "message");
        e.x.c.i.e(upperBounds, "types");
        ArrayList arrayList = new ArrayList(b.q.a.a.C(upperBounds, 10));
        for (d0 z : upperBounds) {
            arrayList.add(z.z());
        }
        l<i> T = c.T(arrayList);
        i i3 = b.i(sb, T);
        return T.f9824h <= 1 ? i3 : new n(sb, i3, (DefaultConstructorMarker) null);
    }
}
