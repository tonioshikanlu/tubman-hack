package b.j.a.b.s;

import java.util.Arrays;

public final class a {
    public static final char[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f1461b;
    public static final int[] c;
    public static final int[] d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1462e;
    public static final int[] f;

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1463g;

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f1464h;

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f1465i;

    /* renamed from: b.j.a.b.s.a$a  reason: collision with other inner class name */
    public static class C0046a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0046a f1466b = new C0046a();
        public int[][] a = new int[128][];
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        a = charArray;
        int length = charArray.length;
        f1461b = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            f1461b[i2] = (byte) a[i2];
        }
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i4 = 128; i4 < 256; i4++) {
            iArr2[i4] = (i4 & 224) == 192 ? 2 : (i4 & 240) == 224 ? 3 : (i4 & 248) == 240 ? 4 : -1;
        }
        d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f1462e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f1463g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f1464h = iArr8;
        int[] iArr9 = new int[256];
        f1465i = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            f1465i[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr10 = f1465i;
            int i9 = i8 + 10;
            iArr10[i8 + 97] = i9;
            iArr10[i8 + 65] = i9;
        }
    }

    public static void a(StringBuilder sb, String str) {
        int[] iArr = f1464h;
        int length = iArr.length;
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < length && iArr[charAt] != 0) {
                sb.append('\\');
                int i3 = iArr[charAt];
                if (i3 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = a;
                    sb.append(cArr[charAt >> 4]);
                    charAt = cArr[charAt & 15];
                } else {
                    charAt = (char) i3;
                }
            }
            sb.append(charAt);
        }
    }

    public static int[] b(int i2) {
        if (i2 == 34) {
            return f1464h;
        }
        C0046a aVar = C0046a.f1466b;
        int[] iArr = aVar.a[i2];
        if (iArr == null) {
            iArr = Arrays.copyOf(f1464h, 128);
            if (iArr[i2] == 0) {
                iArr[i2] = -1;
            }
            aVar.a[i2] = iArr;
        }
        return iArr;
    }
}
