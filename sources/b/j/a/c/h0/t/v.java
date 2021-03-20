package b.j.a.c.h0.t;

import b.j.a.a.k;
import b.j.a.b.f;
import b.j.a.c.d;
import b.j.a.c.h0.i;
import b.j.a.c.n;
import b.j.a.c.y;
import b.j.a.c.z.a;
import java.math.BigDecimal;
import java.math.BigInteger;

@a
public class v extends r0<Number> implements i {

    /* renamed from: j  reason: collision with root package name */
    public static final v f2147j = new v(Number.class);

    public v(Class<? extends Number> cls) {
        super(cls, false);
        Class<BigInteger> cls2 = BigInteger.class;
    }

    public n<?> a(y yVar, d dVar) {
        k.d l2 = l(yVar, dVar, this.f2137h);
        return (l2 == null || l2.f1327i.ordinal() != 8) ? this : v0.f2148j;
    }

    public void f(Object obj, f fVar, y yVar) {
        Number number = (Number) obj;
        if (number instanceof BigDecimal) {
            fVar.A0((BigDecimal) number);
        } else if (number instanceof BigInteger) {
            fVar.B0((BigInteger) number);
        } else if (number instanceof Long) {
            fVar.y0(number.longValue());
        } else if (number instanceof Double) {
            fVar.v0(number.doubleValue());
        } else if (number instanceof Float) {
            fVar.w0(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            fVar.x0(number.intValue());
        } else {
            fVar.z0(number.toString());
        }
    }
}
