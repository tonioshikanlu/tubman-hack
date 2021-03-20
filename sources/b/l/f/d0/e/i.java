package b.l.f.d0.e;

import b.l.f.d0.a;
import java.lang.reflect.Array;

public final class i {
    public static final float[][] a;

    static {
        int i2;
        int[] iArr = a.f5657b;
        int length = iArr.length;
        int[] iArr2 = new int[2];
        iArr2[1] = 8;
        iArr2[0] = length;
        a = (float[][]) Array.newInstance(float.class, iArr2);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 & 1;
            int i6 = 0;
            while (i6 < 8) {
                float f = 0.0f;
                while (true) {
                    i2 = i4 & 1;
                    if (i2 != i5) {
                        break;
                    }
                    f += 1.0f;
                    i4 >>= 1;
                }
                a[i3][(8 - i6) - 1] = f / 17.0f;
                i6++;
                i5 = i2;
            }
        }
    }
}
