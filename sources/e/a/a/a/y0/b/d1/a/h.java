package e.a.a.a.y0.b.d1.a;

import b.e.a.a.a;
import e.a.a.a.y0.b.c1.b;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.k.b.p;
import e.x.c.i;
import java.util.List;

public final class h implements p {

    /* renamed from: b  reason: collision with root package name */
    public static final h f8285b = new h();

    public void a(e eVar, List<String> list) {
        i.e(eVar, "descriptor");
        i.e(list, "unresolvedSuperClasses");
        StringBuilder y = a.y("Incomplete hierarchy for class ");
        y.append(((b) eVar).getName());
        y.append(", unresolved classes ");
        y.append(list);
        throw new IllegalStateException(y.toString());
    }

    public void b(e.a.a.a.y0.b.b bVar) {
        i.e(bVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }
}
