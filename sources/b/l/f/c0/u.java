package b.l.f.c0;

import b.l.f.a;
import b.l.f.g;
import b.l.f.y.b;
import java.util.Map;

public final class u implements b.l.f.u {
    public final j a = new j();

    public b a(String str, a aVar, int i2, int i3, Map<g, ?> map) {
        if (aVar == a.UPC_A) {
            return this.a.a("0".concat(String.valueOf(str)), a.EAN_13, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
