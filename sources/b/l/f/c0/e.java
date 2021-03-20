package b.l.f.c0;

import androidx.appcompat.widget.ActivityChooserView;
import b.l.f.d;
import b.l.f.m;
import b.l.f.q;
import b.l.f.s;
import b.l.f.y.a;
import java.util.Arrays;
import java.util.Map;

public final class e extends r {
    public static final int[] d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f5636b = new StringBuilder(20);
    public final int[] c = new int[9];

    public e(boolean z) {
        this.a = z;
    }

    public static int i(int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            int i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (int i4 : iArr) {
                if (i4 < i3 && i4 > i2) {
                    i3 = i4;
                }
            }
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = iArr[i8];
                if (i9 > i3) {
                    i6 |= 1 << ((length - 1) - i8);
                    i5++;
                    i7 += i9;
                }
            }
            if (i5 == 3) {
                for (int i10 = 0; i10 < length && i5 > 0; i10++) {
                    int i11 = iArr[i10];
                    if (i11 > i3) {
                        i5--;
                        if ((i11 << 1) >= i7) {
                            return -1;
                        }
                    }
                }
                return i6;
            } else if (i5 <= 3) {
                return -1;
            } else {
                i2 = i3;
            }
        }
    }

    public q d(int i2, a aVar, Map<b.l.f.e, ?> map) {
        char c2;
        a aVar2 = aVar;
        int[] iArr = this.c;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f5636b;
        sb.setLength(0);
        int i3 = aVar2.f5810i;
        int g2 = aVar2.g(0);
        int length = iArr.length;
        boolean z = false;
        int i4 = 0;
        int i5 = g2;
        while (g2 < i3) {
            if (aVar2.f(g2) != z) {
                iArr[i4] = iArr[i4] + 1;
                int i6 = i2;
            } else {
                if (i4 != length - 1) {
                    int i7 = i2;
                    i4++;
                } else if (i(iArr) != 148 || !aVar2.j(Math.max(0, i5 - ((g2 - i5) / 2)), i5, false)) {
                    int i8 = i2;
                    i5 += iArr[0] + iArr[1];
                    int i9 = i4 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i9);
                    iArr[i9] = 0;
                    iArr[i4] = 0;
                    i4 = i9;
                } else {
                    int[] iArr2 = {i5, g2};
                    int g3 = aVar2.g(iArr2[1]);
                    int i10 = aVar2.f5810i;
                    while (true) {
                        r.g(aVar2, g3, iArr);
                        int i11 = i(iArr);
                        if (i11 >= 0) {
                            int i12 = 0;
                            while (true) {
                                int[] iArr3 = d;
                                if (i12 < iArr3.length) {
                                    if (iArr3[i12] == i11) {
                                        c2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i12);
                                        break;
                                    }
                                    i12++;
                                } else if (i11 == 148) {
                                    c2 = '*';
                                } else {
                                    throw m.f5759j;
                                }
                            }
                            sb.append(c2);
                            int i13 = g3;
                            for (int i14 : iArr) {
                                i13 += i14;
                            }
                            int g4 = aVar2.g(i13);
                            if (c2 == '*') {
                                sb.setLength(sb.length() - 1);
                                int i15 = 0;
                                for (int i16 : iArr) {
                                    i15 += i16;
                                }
                                int i17 = (g4 - g3) - i15;
                                if (g4 == i10 || (i17 << 1) >= i15) {
                                    if (this.a) {
                                        int length2 = sb.length() - 1;
                                        int i18 = 0;
                                        for (int i19 = 0; i19 < length2; i19++) {
                                            i18 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f5636b.charAt(i19));
                                        }
                                        if (sb.charAt(length2) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i18 % 43)) {
                                            sb.setLength(length2);
                                        } else {
                                            throw d.a();
                                        }
                                    }
                                    if (sb.length() != 0) {
                                        float f = (float) i2;
                                        return new q(sb.toString(), (byte[]) null, new s[]{new s(((float) (iArr2[1] + iArr2[0])) / 2.0f, f), new s((((float) i15) / 2.0f) + ((float) g3), f)}, b.l.f.a.CODE_39);
                                    }
                                    throw m.f5759j;
                                }
                                throw m.f5759j;
                            }
                            int i20 = i2;
                            g3 = g4;
                        } else {
                            throw m.f5759j;
                        }
                    }
                }
                iArr[i4] = 1;
                z = !z;
            }
            g2++;
        }
        throw m.f5759j;
    }
}
