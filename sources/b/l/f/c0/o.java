package b.l.f.c0;

import b.l.f.a;
import b.l.f.g;
import b.l.f.y.b;
import java.util.Map;

public final class o extends s {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f5645b = {1, 1, 1, 1};
    public static final int[] c = {3, 1, 1};
    public static final int[][] d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    public b a(String str, a aVar, int i2, int i3, Map<g, ?> map) {
        if (aVar == a.ITF) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            s.c(str);
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int b2 = s.b(zArr, 0, f5645b, true);
            for (int i2 = 0; i2 < length; i2 += 2) {
                int digit = Character.digit(str.charAt(i2), 10);
                int digit2 = Character.digit(str.charAt(i2 + 1), 10);
                int[] iArr = new int[10];
                for (int i3 = 0; i3 < 5; i3++) {
                    int i4 = i3 * 2;
                    int[][] iArr2 = d;
                    iArr[i4] = iArr2[digit][i3];
                    iArr[i4 + 1] = iArr2[digit2][i3];
                }
                b2 += s.b(zArr, b2, iArr, true);
            }
            s.b(zArr, b2, c, true);
            return zArr;
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }
}
