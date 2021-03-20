package e.a.a.a.y0.a.p;

import e.a.a.a.y0.a.b;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.y;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.List;

public final class d extends k implements l<w, b> {

    /* renamed from: h  reason: collision with root package name */
    public static final d f7722h = new d();

    public d() {
        super(1);
    }

    public Object invoke(Object obj) {
        w wVar = (w) obj;
        i.e(wVar, "module");
        e.a.a.a.y0.f.b bVar = e.f7723e;
        i.d(bVar, "KOTLIN_FQ_NAME");
        List<y> f0 = wVar.o0(bVar).f0();
        ArrayList arrayList = new ArrayList();
        for (T next : f0) {
            if (next instanceof b) {
                arrayList.add(next);
            }
        }
        return (b) g.o(arrayList);
    }
}
