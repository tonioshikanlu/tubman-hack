package b.l.f.c0;

import b.l.f.a;
import b.l.f.g;
import b.l.f.u;
import b.l.f.y.b;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class s implements u {
    public static final Pattern a = Pattern.compile("[0-9]+");

    public static int b(boolean[] zArr, int i2, int[] iArr, boolean z) {
        int i3 = 0;
        for (int i4 : iArr) {
            int i5 = 0;
            while (i5 < i4) {
                zArr[i2] = z;
                i5++;
                i2++;
            }
            i3 += i4;
            z = !z;
        }
        return i3;
    }

    public static void c(String str) {
        if (!a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    public b a(String str, a aVar, int i2, int i3, Map<g, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i2 + 'x' + i3);
        } else {
            int e2 = e();
            if (map != null) {
                g gVar = g.MARGIN;
                if (map.containsKey(gVar)) {
                    e2 = Integer.parseInt(map.get(gVar).toString());
                }
            }
            boolean[] d = d(str);
            int length = d.length;
            int i4 = e2 + length;
            int max = Math.max(i2, i4);
            int max2 = Math.max(1, i3);
            int i5 = max / i4;
            int i6 = (max - (length * i5)) / 2;
            b bVar = new b(max, max2);
            int i7 = 0;
            while (i7 < length) {
                if (d[i7]) {
                    bVar.h(i6, 0, i5, max2);
                }
                i7++;
                i6 += i5;
            }
            return bVar;
        }
    }

    public abstract boolean[] d(String str);

    public int e() {
        return 10;
    }
}
