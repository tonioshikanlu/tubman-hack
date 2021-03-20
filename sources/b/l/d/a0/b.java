package b.l.d.a0;

import b.l.d.p.e;
import b.l.d.p.g;
import java.util.Set;

public final /* synthetic */ class b implements g {
    public static final b a = new b();

    public Object a(e eVar) {
        Set<e> b2 = eVar.b(e.class);
        d dVar = d.f4906b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = d.f4906b;
                if (dVar == null) {
                    dVar = new d();
                    d.f4906b = dVar;
                }
            }
        }
        return new c(b2, dVar);
    }
}
