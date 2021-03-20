package b.l.f.c0;

import b.l.f.a;
import b.l.f.g;
import b.l.f.h;
import b.l.f.y.b;
import java.util.Map;

public final class b0 extends z {
    public b a(String str, a aVar, int i2, int i3, Map<g, ?> map) {
        if (aVar == a.UPC_E) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = b.e.a.a.a.g(str, y.r(a0.s(str)));
            } catch (h e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (length == 8) {
            try {
                if (!y.j(a0.s(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        s.c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i2 = a0.f5589k[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int b2 = s.b(zArr, 0, y.d, true) + 0;
            for (int i3 = 1; i3 <= 6; i3++) {
                int digit2 = Character.digit(str.charAt(i3), 10);
                if (((i2 >> (6 - i3)) & 1) == 1) {
                    digit2 += 10;
                }
                b2 += s.b(zArr, b2, y.f5654h[digit2], false);
            }
            s.b(zArr, b2, y.f, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }
}
