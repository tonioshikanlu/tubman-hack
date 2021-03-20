package b.l.f.c0.c0;

import androidx.appcompat.widget.ActivityChooserView;
import b.l.f.c0.r;
import b.l.f.m;

public abstract class a extends r {
    public final int[] a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5593b;
    public final float[] c;
    public final float[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f5594e;
    public final int[] f;

    public a() {
        int[] iArr = new int[8];
        this.f5593b = iArr;
        this.c = new float[4];
        this.d = new float[4];
        this.f5594e = new int[(iArr.length / 2)];
        this.f = new int[(iArr.length / 2)];
    }

    public static void i(int[] iArr, float[] fArr) {
        int i2 = 0;
        float f2 = fArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            if (fArr[i3] < f2) {
                f2 = fArr[i3];
                i2 = i3;
            }
        }
        iArr[i2] = iArr[i2] - 1;
    }

    public static void j(int[] iArr, float[] fArr) {
        int i2 = 0;
        float f2 = fArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            if (fArr[i3] > f2) {
                f2 = fArr[i3];
                i2 = i3;
            }
        }
        iArr[i2] = iArr[i2] + 1;
    }

    public static boolean k(int[] iArr) {
        int i2 = iArr[0] + iArr[1];
        float f2 = ((float) i2) / ((float) ((iArr[2] + i2) + iArr[3]));
        if (f2 >= 0.7916667f && f2 <= 0.89285713f) {
            int i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i4 = Integer.MIN_VALUE;
            for (int i5 : iArr) {
                if (i5 > i4) {
                    i4 = i5;
                }
                if (i5 < i3) {
                    i3 = i5;
                }
            }
            if (i4 < i3 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int l(int[] iArr, int[][] iArr2) {
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            if (r.f(iArr, iArr2[i2], 0.45f) < 0.2f) {
                return i2;
            }
        }
        throw m.f5759j;
    }
}
