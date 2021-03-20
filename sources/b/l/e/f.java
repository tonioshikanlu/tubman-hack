package b.l.e;

import b.l.e.g0.a;
import b.l.e.g0.b;
import b.l.e.g0.c;

public class f extends b0<Number> {
    public f(k kVar) {
    }

    public Object a(a aVar) {
        if (aVar.v0() != b.NULL) {
            return Double.valueOf(aVar.m0());
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
        k.a(number.doubleValue());
        cVar.p0(number);
    }
}
