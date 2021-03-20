package b.l.f.c0;

import b.l.f.m;
import b.l.f.y.a;

public final class a0 extends y {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f5588j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k  reason: collision with root package name */
    public static final int[][] f5589k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i  reason: collision with root package name */
    public final int[] f5590i = new int[4];

    public static String s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    public boolean i(String str) {
        return y.j(s(str));
    }

    public int[] l(a aVar, int i2) {
        int[] iArr = f5588j;
        return y.o(aVar, i2, true, iArr, new int[iArr.length]);
    }

    public int m(a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f5590i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i2 = aVar.f5810i;
        int i3 = iArr[1];
        int i4 = 0;
        for (int i5 = 0; i5 < 6 && i3 < i2; i5++) {
            int k2 = y.k(aVar, iArr2, i3, y.f5654h);
            sb.append((char) ((k2 % 10) + 48));
            for (int i6 : iArr2) {
                i3 += i6;
            }
            if (k2 >= 10) {
                i4 |= 1 << (5 - i5);
            }
        }
        for (int i7 = 0; i7 <= 1; i7++) {
            for (int i8 = 0; i8 < 10; i8++) {
                if (i4 == f5589k[i7][i8]) {
                    sb.insert(0, (char) (i7 + 48));
                    sb.append((char) (i8 + 48));
                    return i3;
                }
            }
        }
        throw m.f5759j;
    }

    public b.l.f.a q() {
        return b.l.f.a.UPC_E;
    }
}
