package b.l.d.s.j;

import b.l.d.s.c;
import b.l.d.s.e;
import b.l.d.s.f;
import b.l.d.s.j.e;

public final /* synthetic */ class a implements e {
    public static final a a = new a();

    public void a(Object obj, Object obj2) {
        f fVar = (f) obj2;
        e.a aVar = e.f5290e;
        StringBuilder y = b.e.a.a.a.y("Couldn't find encoder for type ");
        y.append(obj.getClass().getCanonicalName());
        throw new c(y.toString());
    }
}
