package b.l.f.c0;

import androidx.appcompat.widget.ActivityChooserView;
import b.l.f.e;
import b.l.f.m;
import b.l.f.q;
import b.l.f.s;
import java.util.Arrays;
import java.util.Map;

public final class a extends r {
    public static final char[] d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f5586e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    public static final char[] f = {'A', 'B', 'C', 'D'};
    public final StringBuilder a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public int[] f5587b = new int[80];
    public int c = 0;

    public static boolean i(char[] cArr, char c2) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c3 == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    public q d(int i2, b.l.f.y.a aVar, Map<e, ?> map) {
        b.l.f.y.a aVar2 = aVar;
        Map<e, ?> map2 = map;
        Arrays.fill(this.f5587b, 0);
        this.c = 0;
        int h2 = aVar2.h(0);
        int i3 = aVar2.f5810i;
        if (h2 < i3) {
            int i4 = 0;
            boolean z = true;
            while (h2 < i3) {
                if (aVar2.f(h2) != z) {
                    i4++;
                } else {
                    j(i4);
                    z = !z;
                    i4 = 1;
                }
                h2++;
            }
            j(i4);
            int i5 = 1;
            while (i5 < this.c) {
                int k2 = k(i5);
                if (k2 != -1 && i(f, d[k2])) {
                    int i6 = 0;
                    for (int i7 = i5; i7 < i5 + 7; i7++) {
                        i6 += this.f5587b[i7];
                    }
                    if (i5 == 1 || this.f5587b[i5 - 1] >= i6 / 2) {
                        this.a.setLength(0);
                        int i8 = i5;
                        while (true) {
                            int k3 = k(i8);
                            if (k3 != -1) {
                                this.a.append((char) k3);
                                i8 += 8;
                                if ((this.a.length() <= 1 || !i(f, d[k3])) && i8 < this.c) {
                                    int i9 = i2;
                                }
                            } else {
                                throw m.f5759j;
                            }
                        }
                        int i10 = i8 - 1;
                        int i11 = this.f5587b[i10];
                        int i12 = 0;
                        for (int i13 = -8; i13 < -1; i13++) {
                            i12 += this.f5587b[i8 + i13];
                        }
                        if (i8 >= this.c || i11 >= i12 / 2) {
                            int[] iArr = {0, 0, 0, 0};
                            int[] iArr2 = {0, 0, 0, 0};
                            int length = this.a.length() - 1;
                            int i14 = i5;
                            int i15 = 0;
                            while (true) {
                                int i16 = f5586e[this.a.charAt(i15)];
                                for (int i17 = 6; i17 >= 0; i17--) {
                                    int i18 = (i17 & 1) + ((i16 & 1) << 1);
                                    iArr[i18] = iArr[i18] + this.f5587b[i14 + i17];
                                    iArr2[i18] = iArr2[i18] + 1;
                                    i16 >>= 1;
                                }
                                if (i15 >= length) {
                                    break;
                                }
                                i14 += 8;
                                i15++;
                            }
                            float[] fArr = new float[4];
                            float[] fArr2 = new float[4];
                            int i19 = 0;
                            for (int i20 = 2; i19 < i20; i20 = 2) {
                                fArr2[i19] = 0.0f;
                                int i21 = i19 + 2;
                                fArr2[i21] = ((((float) iArr[i21]) / ((float) iArr2[i21])) + (((float) iArr[i19]) / ((float) iArr2[i19]))) / 2.0f;
                                fArr[i19] = fArr2[i21];
                                fArr[i21] = ((((float) iArr[i21]) * 2.0f) + 1.5f) / ((float) iArr2[i21]);
                                i19++;
                            }
                            int i22 = i5;
                            int i23 = 0;
                            loop8:
                            while (true) {
                                int i24 = f5586e[this.a.charAt(i23)];
                                int i25 = 6;
                                while (i25 >= 0) {
                                    int i26 = (i25 & 1) + ((i24 & 1) << 1);
                                    float f2 = (float) this.f5587b[i22 + i25];
                                    if (f2 >= fArr2[i26] && f2 <= fArr[i26]) {
                                        i24 >>= 1;
                                        i25--;
                                    }
                                }
                                if (i23 < length) {
                                    i22 += 8;
                                    i23++;
                                } else {
                                    for (int i27 = 0; i27 < this.a.length(); i27++) {
                                        StringBuilder sb = this.a;
                                        sb.setCharAt(i27, d[sb.charAt(i27)]);
                                    }
                                    char charAt = this.a.charAt(0);
                                    char[] cArr = f;
                                    if (i(cArr, charAt)) {
                                        StringBuilder sb2 = this.a;
                                        if (!i(cArr, sb2.charAt(sb2.length() - 1))) {
                                            throw m.f5759j;
                                        } else if (this.a.length() > 3) {
                                            if (map2 == null || !map2.containsKey(e.RETURN_CODABAR_START_END)) {
                                                StringBuilder sb3 = this.a;
                                                sb3.deleteCharAt(sb3.length() - 1);
                                                this.a.deleteCharAt(0);
                                            }
                                            int i28 = 0;
                                            for (int i29 = 0; i29 < i5; i29++) {
                                                i28 += this.f5587b[i29];
                                            }
                                            float f3 = (float) i28;
                                            while (i5 < i10) {
                                                i28 += this.f5587b[i5];
                                                i5++;
                                            }
                                            float f4 = (float) i2;
                                            return new q(this.a.toString(), (byte[]) null, new s[]{new s(f3, f4), new s((float) i28, f4)}, b.l.f.a.CODABAR);
                                        } else {
                                            throw m.f5759j;
                                        }
                                    } else {
                                        throw m.f5759j;
                                    }
                                }
                            }
                            throw m.f5759j;
                        }
                        throw m.f5759j;
                    }
                }
                int i30 = i2;
                i5 += 2;
            }
            throw m.f5759j;
        }
        throw m.f5759j;
    }

    public final void j(int i2) {
        int[] iArr = this.f5587b;
        int i3 = this.c;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.c = i4;
        if (i4 >= iArr.length) {
            int[] iArr2 = new int[(i4 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.f5587b = iArr2;
        }
    }

    public final int k(int i2) {
        int i3 = i2 + 7;
        if (i3 >= this.c) {
            return -1;
        }
        int[] iArr = this.f5587b;
        int i4 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        for (int i8 = i2; i8 < i3; i8 += 2) {
            int i9 = iArr[i8];
            if (i9 < i6) {
                i6 = i9;
            }
            if (i9 > i7) {
                i7 = i9;
            }
        }
        int i10 = (i6 + i7) / 2;
        int i11 = 0;
        for (int i12 = i2 + 1; i12 < i3; i12 += 2) {
            int i13 = iArr[i12];
            if (i13 < i4) {
                i4 = i13;
            }
            if (i13 > i11) {
                i11 = i13;
            }
        }
        int i14 = (i4 + i11) / 2;
        int i15 = 128;
        int i16 = 0;
        for (int i17 = 0; i17 < 7; i17++) {
            i15 >>= 1;
            if (iArr[i2 + i17] > ((i17 & 1) == 0 ? i10 : i14)) {
                i16 |= i15;
            }
        }
        while (true) {
            int[] iArr2 = f5586e;
            if (i5 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i5] == i16) {
                return i5;
            }
            i5++;
        }
    }
}
