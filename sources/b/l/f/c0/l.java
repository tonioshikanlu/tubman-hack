package b.l.f.c0;

import b.l.f.a;
import b.l.f.g;
import b.l.f.h;
import b.l.f.y.b;
import java.util.Map;

public final class l extends z {
    public b a(String str, a aVar, int i2, int i3, Map<g, ?> map) {
        if (aVar == a.EAN_8) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = b.e.a.a.a.g(str, y.r(str));
            } catch (h e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (length == 8) {
            try {
                if (!y.j(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        s.c(str);
        boolean[] zArr = new boolean[67];
        int b2 = s.b(zArr, 0, y.d, true) + 0;
        for (int i2 = 0; i2 <= 3; i2++) {
            b2 += s.b(zArr, b2, y.f5653g[Character.digit(str.charAt(i2), 10)], false);
        }
        int b3 = s.b(zArr, b2, y.f5652e, false) + b2;
        for (int i3 = 4; i3 <= 7; i3++) {
            b3 += s.b(zArr, b3, y.f5653g[Character.digit(str.charAt(i3), 10)], true);
        }
        s.b(zArr, b3, y.d, true);
        return zArr;
    }
}
