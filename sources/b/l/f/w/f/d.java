package b.l.f.w.f;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f5790b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    public static final int[][] c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    public static final int[][] d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[][] f5791e;
    public final byte[] a;

    static {
        Class<int> cls = int.class;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{5, 256});
        d = iArr;
        iArr[0][32] = 1;
        for (int i2 = 65; i2 <= 90; i2++) {
            d[0][i2] = (i2 - 65) + 2;
        }
        d[1][32] = 1;
        for (int i3 = 97; i3 <= 122; i3++) {
            d[1][i3] = (i3 - 97) + 2;
        }
        d[2][32] = 1;
        for (int i4 = 48; i4 <= 57; i4++) {
            d[2][i4] = (i4 - 48) + 2;
        }
        int[][] iArr2 = d;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i5 = 0; i5 < 28; i5++) {
            d[3][iArr3[i5]] = i5;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i6 = 0; i6 < 31; i6++) {
            if (iArr4[i6] > 0) {
                d[4][iArr4[i6]] = i6;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, new int[]{6, 6});
        f5791e = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f5791e;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public d(byte[] bArr) {
        this.a = bArr;
    }

    public static Collection<f> a(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f next : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f fVar = (f) it.next();
                if (fVar.d(next)) {
                    z = false;
                    break;
                } else if (next.d(fVar)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }
}
