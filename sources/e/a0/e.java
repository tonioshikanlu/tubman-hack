package e.a0;

import e.x.c.i;

public class e {
    public static final int a(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static final b b(int i2, int i3) {
        return new b(i2, i3, -1);
    }

    public static final b c(b bVar, int i2) {
        i.e(bVar, "$this$step");
        boolean z = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        i.e(valueOf, "step");
        if (z) {
            int i3 = bVar.f7883h;
            int i4 = bVar.f7884i;
            if (bVar.f7885j <= 0) {
                i2 = -i2;
            }
            return new b(i3, i4, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final d d(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new d(i2, i3 - 1);
        }
        d dVar = d.f7891l;
        return d.f7890k;
    }
}
