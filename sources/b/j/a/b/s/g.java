package b.j.a.b.s;

import androidx.exifinterface.media.ExifInterface;
import com.airbnb.lottie.utils.Utils;

public final class g {
    public static final String a = String.valueOf(Integer.MIN_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final String f1480b = String.valueOf(Long.MIN_VALUE);
    public static final int[] c = new int[1000];
    public static final String[] d = {"0", "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", "10"};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f1481e = {"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    static {
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = 0;
                while (i5 < 10) {
                    c[i2] = ((i3 + 48) << 16) | ((i4 + 48) << 8) | (i5 + 48);
                    i5++;
                    i2++;
                }
            }
        }
    }

    public static int a(int i2, byte[] bArr, int i3) {
        int i4 = c[i2];
        int i5 = i3 + 1;
        bArr[i3] = (byte) (i4 >> 16);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i4 >> 8);
        int i7 = i6 + 1;
        bArr[i6] = (byte) i4;
        return i7;
    }

    public static int b(int i2, char[] cArr, int i3) {
        int i4 = c[i2];
        int i5 = i3 + 1;
        cArr[i3] = (char) (i4 >> 16);
        int i6 = i5 + 1;
        cArr[i5] = (char) ((i4 >> 8) & 127);
        int i7 = i6 + 1;
        cArr[i6] = (char) (i4 & 127);
        return i7;
    }

    public static int c(int i2, byte[] bArr, int i3) {
        int i4 = c[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                bArr[i3] = (byte) (i4 >> 16);
                i3++;
            }
            bArr[i3] = (byte) (i4 >> 8);
            i3++;
        }
        int i5 = i3 + 1;
        bArr[i3] = (byte) i4;
        return i5;
    }

    public static int d(int i2, char[] cArr, int i3) {
        int i4 = c[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                cArr[i3] = (char) (i4 >> 16);
                i3++;
            }
            cArr[i3] = (char) ((i4 >> 8) & 127);
            i3++;
        }
        int i5 = i3 + 1;
        cArr[i3] = (char) (i4 & 127);
        return i5;
    }

    public static int e(int i2, byte[] bArr, int i3) {
        int i4 = i2 / 1000;
        int i5 = i2 - (i4 * 1000);
        int i6 = i4 / 1000;
        int i7 = i4 - (i6 * 1000);
        int[] iArr = c;
        int i8 = iArr[i6];
        int i9 = i3 + 1;
        bArr[i3] = (byte) (i8 >> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i8 >> 8);
        int i11 = i10 + 1;
        bArr[i10] = (byte) i8;
        int i12 = iArr[i7];
        int i13 = i11 + 1;
        bArr[i11] = (byte) (i12 >> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i12 >> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) i12;
        int i16 = iArr[i5];
        int i17 = i15 + 1;
        bArr[i15] = (byte) (i16 >> 16);
        int i18 = i17 + 1;
        bArr[i17] = (byte) (i16 >> 8);
        int i19 = i18 + 1;
        bArr[i18] = (byte) i16;
        return i19;
    }

    public static int f(int i2, char[] cArr, int i3) {
        int i4 = i2 / 1000;
        int i5 = i2 - (i4 * 1000);
        int i6 = i4 / 1000;
        int[] iArr = c;
        int i7 = iArr[i6];
        int i8 = i3 + 1;
        cArr[i3] = (char) (i7 >> 16);
        int i9 = i8 + 1;
        cArr[i8] = (char) ((i7 >> 8) & 127);
        int i10 = i9 + 1;
        cArr[i9] = (char) (i7 & 127);
        int i11 = iArr[i4 - (i6 * 1000)];
        int i12 = i10 + 1;
        cArr[i10] = (char) (i11 >> 16);
        int i13 = i12 + 1;
        cArr[i12] = (char) ((i11 >> 8) & 127);
        int i14 = i13 + 1;
        cArr[i13] = (char) (i11 & 127);
        int i15 = iArr[i5];
        int i16 = i14 + 1;
        cArr[i14] = (char) (i15 >> 16);
        int i17 = i16 + 1;
        cArr[i16] = (char) ((i15 >> 8) & 127);
        int i18 = i17 + 1;
        cArr[i17] = (char) (i15 & 127);
        return i18;
    }

    public static boolean g(double d2) {
        return Double.isNaN(d2) || Double.isInfinite(d2);
    }

    public static boolean h(float f) {
        return Float.isNaN(f) || Float.isInfinite(f);
    }

    public static int i(int i2, byte[] bArr, int i3) {
        int i4;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                int length = a.length();
                int i5 = 0;
                while (i5 < length) {
                    bArr[i3] = (byte) a.charAt(i5);
                    i5++;
                    i3++;
                }
                return i3;
            }
            bArr[i3] = 45;
            i2 = -i2;
            i3++;
        }
        if (i2 < 1000000) {
            if (i2 >= 1000) {
                int i6 = i2 / 1000;
                return a(i2 - (i6 * 1000), bArr, c(i6, bArr, i3));
            } else if (i2 >= 10) {
                return c(i2, bArr, i3);
            } else {
                int i7 = i3 + 1;
                bArr[i3] = (byte) (i2 + 48);
                return i7;
            }
        } else if (i2 >= 1000000000) {
            int i8 = i2 - Utils.SECOND_IN_NANOS;
            if (i8 >= 1000000000) {
                i8 -= Utils.SECOND_IN_NANOS;
                i4 = i3 + 1;
                bArr[i3] = 50;
            } else {
                i4 = i3 + 1;
                bArr[i3] = 49;
            }
            return e(i8, bArr, i4);
        } else {
            int i9 = i2 / 1000;
            int i10 = i9 / 1000;
            return a(i2 - (i9 * 1000), bArr, a(i9 - (i10 * 1000), bArr, c(i10, bArr, i3)));
        }
    }

    public static int j(int i2, char[] cArr, int i3) {
        int i4;
        int b2;
        int i5;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                String str = a;
                int length = str.length();
                str.getChars(0, length, cArr, i3);
                return length + i3;
            }
            cArr[i3] = '-';
            i2 = -i2;
            i3++;
        }
        if (i2 < 1000000) {
            if (i2 >= 1000) {
                int i6 = i2 / 1000;
                i4 = i2 - (i6 * 1000);
                b2 = d(i6, cArr, i3);
            } else if (i2 >= 10) {
                return d(i2, cArr, i3);
            } else {
                cArr[i3] = (char) (i2 + 48);
                return i3 + 1;
            }
        } else if (i2 >= 1000000000) {
            int i7 = i2 - Utils.SECOND_IN_NANOS;
            if (i7 >= 1000000000) {
                i7 -= Utils.SECOND_IN_NANOS;
                i5 = i3 + 1;
                cArr[i3] = '2';
            } else {
                i5 = i3 + 1;
                cArr[i3] = '1';
            }
            return f(i7, cArr, i5);
        } else {
            int i8 = i2 / 1000;
            i4 = i2 - (i8 * 1000);
            int i9 = i8 / 1000;
            b2 = b(i8 - (i9 * 1000), cArr, d(i9, cArr, i3));
        }
        return b(i4, cArr, b2);
    }

    public static int k(long j2, byte[] bArr, int i2) {
        int i3;
        int i4;
        if (j2 < 0) {
            if (j2 > -2147483648L) {
                return i((int) j2, bArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                int length = f1480b.length();
                int i5 = 0;
                while (i5 < length) {
                    bArr[i2] = (byte) f1480b.charAt(i5);
                    i5++;
                    i2++;
                }
                return i2;
            }
            bArr[i2] = 45;
            j2 = -j2;
            i2++;
        } else if (j2 <= 2147483647L) {
            return i((int) j2, bArr, i2);
        }
        long j3 = j2 / 1000000000;
        long j4 = j2 - (j3 * 1000000000);
        if (j3 < 1000000000) {
            int i6 = (int) j3;
            if (i6 >= 1000000) {
                int i7 = i6 / 1000;
                int i8 = i6 - (i7 * 1000);
                int i9 = i7 / 1000;
                int c2 = c(i9, bArr, i2);
                int[] iArr = c;
                int i10 = iArr[i7 - (i9 * 1000)];
                int i11 = c2 + 1;
                bArr[c2] = (byte) (i10 >> 16);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 >> 8);
                int i13 = i12 + 1;
                bArr[i12] = (byte) i10;
                int i14 = iArr[i8];
                int i15 = i13 + 1;
                bArr[i13] = (byte) (i14 >> 16);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (i14 >> 8);
                i4 = i16 + 1;
                bArr[i16] = (byte) i14;
            } else if (i6 < 1000) {
                i3 = c(i6, bArr, i2);
            } else {
                int i17 = i6 / 1000;
                int i18 = i6 - (i17 * 1000);
                int[] iArr2 = c;
                int i19 = iArr2[i17];
                if (i17 > 9) {
                    if (i17 > 99) {
                        bArr[i2] = (byte) (i19 >> 16);
                        i2++;
                    }
                    bArr[i2] = (byte) (i19 >> 8);
                    i2++;
                }
                int i20 = i2 + 1;
                bArr[i2] = (byte) i19;
                int i21 = iArr2[i18];
                int i22 = i20 + 1;
                bArr[i20] = (byte) (i21 >> 16);
                int i23 = i22 + 1;
                bArr[i22] = (byte) (i21 >> 8);
                i4 = i23 + 1;
                bArr[i23] = (byte) i21;
            }
            i3 = i4;
        } else {
            long j5 = j3 / 1000000000;
            int c3 = c((int) j5, bArr, i2);
            i3 = e((int) (j3 - (1000000000 * j5)), bArr, c3);
        }
        return e((int) j4, bArr, i3);
    }

    public static int l(long j2, char[] cArr, int i2) {
        int i3;
        int i4;
        if (j2 < 0) {
            if (j2 > -2147483648L) {
                return j((int) j2, cArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                String str = f1480b;
                int length = str.length();
                str.getChars(0, length, cArr, i2);
                return length + i2;
            }
            cArr[i2] = '-';
            j2 = -j2;
            i2++;
        } else if (j2 <= 2147483647L) {
            return j((int) j2, cArr, i2);
        }
        long j3 = j2 / 1000000000;
        long j4 = j2 - (j3 * 1000000000);
        if (j3 < 1000000000) {
            int i5 = (int) j3;
            if (i5 >= 1000000) {
                int i6 = i5 / 1000;
                int i7 = i5 - (i6 * 1000);
                int i8 = i6 / 1000;
                int d2 = d(i8, cArr, i2);
                int[] iArr = c;
                int i9 = iArr[i6 - (i8 * 1000)];
                int i10 = d2 + 1;
                cArr[d2] = (char) (i9 >> 16);
                int i11 = i10 + 1;
                cArr[i10] = (char) ((i9 >> 8) & 127);
                int i12 = i11 + 1;
                cArr[i11] = (char) (i9 & 127);
                int i13 = iArr[i7];
                int i14 = i12 + 1;
                cArr[i12] = (char) (i13 >> 16);
                int i15 = i14 + 1;
                cArr[i14] = (char) ((i13 >> 8) & 127);
                i4 = i15 + 1;
                cArr[i15] = (char) (i13 & 127);
            } else if (i5 < 1000) {
                i3 = d(i5, cArr, i2);
            } else {
                int i16 = i5 / 1000;
                int i17 = i5 - (i16 * 1000);
                int[] iArr2 = c;
                int i18 = iArr2[i16];
                if (i16 > 9) {
                    if (i16 > 99) {
                        cArr[i2] = (char) (i18 >> 16);
                        i2++;
                    }
                    cArr[i2] = (char) ((i18 >> 8) & 127);
                    i2++;
                }
                int i19 = i2 + 1;
                cArr[i2] = (char) (i18 & 127);
                int i20 = iArr2[i17];
                int i21 = i19 + 1;
                cArr[i19] = (char) (i20 >> 16);
                int i22 = i21 + 1;
                cArr[i21] = (char) ((i20 >> 8) & 127);
                i4 = i22 + 1;
                cArr[i22] = (char) (i20 & 127);
            }
            i3 = i4;
        } else {
            long j5 = j3 / 1000000000;
            int d3 = d((int) j5, cArr, i2);
            i3 = f((int) (j3 - (1000000000 * j5)), cArr, d3);
        }
        return f((int) j4, cArr, i3);
    }

    public static String m(int i2) {
        String[] strArr = d;
        if (i2 < strArr.length) {
            if (i2 >= 0) {
                return strArr[i2];
            }
            int i3 = (-i2) - 1;
            String[] strArr2 = f1481e;
            if (i3 < strArr2.length) {
                return strArr2[i3];
            }
        }
        return Integer.toString(i2);
    }
}
