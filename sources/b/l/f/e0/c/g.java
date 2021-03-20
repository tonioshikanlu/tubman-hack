package b.l.f.e0.c;

import androidx.appcompat.widget.ActivityChooserView;

public final class g {
    public static final int[][] c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f5719b;

    public g(int i2) {
        int i3 = (i2 >> 3) & 3;
        if (i3 >= 0) {
            f[] fVarArr = f.f5716m;
            if (i3 < fVarArr.length) {
                this.a = fVarArr[i3];
                this.f5719b = (byte) (i2 & 7);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static g a(int i2, int i3) {
        int b2;
        int i4 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i5 = 0;
        for (int[] iArr : c) {
            int i6 = iArr[0];
            if (i6 == i2 || i6 == i3) {
                return new g(iArr[1]);
            }
            int b3 = b(i2, i6);
            if (b3 < i4) {
                i5 = iArr[1];
                i4 = b3;
            }
            if (i2 != i3 && (b2 = b(i3, i6)) < i4) {
                i5 = iArr[1];
                i4 = b2;
            }
        }
        if (i4 <= 3) {
            return new g(i5);
        }
        return null;
    }

    public static int b(int i2, int i3) {
        return Integer.bitCount(i2 ^ i3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.f5719b == gVar.f5719b;
    }

    public int hashCode() {
        return (this.a.ordinal() << 3) | this.f5719b;
    }
}
