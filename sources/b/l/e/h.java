package b.l.e;

import b.l.e.g0.a;
import b.l.e.g0.b;
import b.l.e.g0.c;

public class h extends b0<Number> {
    public Object a(a aVar) {
        if (aVar.v0() != b.NULL) {
            return Long.valueOf(aVar.o0());
        }
        aVar.r0();
        return null;
    }

    public void b(c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.Y();
        } else {
            cVar.q0(number.toString());
        }
    }
}
