package b.j.a.c.h0.t;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.v.b;
import b.j.a.c.y;
import java.util.TimeZone;

public class u0 extends r0<TimeZone> {
    public u0() {
        super(TimeZone.class);
    }

    public void f(Object obj, f fVar, y yVar) {
        fVar.Q0(((TimeZone) obj).getID());
    }

    public void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        TimeZone timeZone = (TimeZone) obj;
        b d = fVar2.d(timeZone, l.VALUE_STRING);
        d.f1539b = TimeZone.class;
        b e2 = fVar2.e(fVar, d);
        fVar.Q0(timeZone.getID());
        fVar2.f(fVar, e2);
    }
}
