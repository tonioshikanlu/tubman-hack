package b.l.e;

import b.l.e.g0.a;
import b.l.e.g0.b;
import b.l.e.g0.c;

public class g extends b0<Number> {
    public g(k kVar) {
    }

    public Object a(a aVar) {
        if (aVar.v0() != b.NULL) {
            return Float.valueOf((float) aVar.m0());
        }
        aVar.r0();
        return null;
    }

    public void b(c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.Y();
            return;
        }
        k.a((double) number.floatValue());
        cVar.p0(number);
    }
}
