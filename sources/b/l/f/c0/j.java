package b.l.f.c0;

import b.l.f.a;
import b.l.f.g;
import b.l.f.h;
import b.l.f.y.b;
import java.util.Map;

public final class j extends z {
    public b a(String str, a aVar, int i2, int i3, Map<g, ?> map) {
        if (aVar == a.EAN_13) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = b.e.a.a.a.g(str, y.r(str));
            } catch (h e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (length == 13) {
            try {
                if (!y.j(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        s.c(str);
        int i2 = i.f5639j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b2 = s.b(zArr, 0, y.d, true) + 0;
        for (int i3 = 1; i3 <= 6; i3++) {
            int digit = Character.digit(str.charAt(i3), 10);
            if (((i2 >> (6 - i3)) & 1) == 1) {
                digit += 10;
            }
            b2 += s.b(zArr, b2, y.f5654h[digit], false);
        }
        int b3 = s.b(zArr, b2, y.f5652e, false) + b2;
        for (int i4 = 7; i4 <= 12; i4++) {
            b3 += s.b(zArr, b3, y.f5653g[Character.digit(str.charAt(i4), 10)], true);
        }
        s.b(zArr, b3, y.d, true);
        return zArr;
    }
}
