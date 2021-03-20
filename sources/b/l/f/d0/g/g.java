package b.l.f.d0.g;

import androidx.exifinterface.media.ExifInterface;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class g {
    public static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, ExifInterface.START_CODE, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5688b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, ExifInterface.START_CODE, 40, 41, 63, 123, 125, 39, 0};
    public static final byte[] c;
    public static final byte[] d = new byte[128];

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f5689e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i3 >= bArr2.length) {
                break;
            }
            byte b2 = bArr2[i3];
            if (b2 > 0) {
                c[b2] = (byte) i3;
            }
            i3++;
        }
        Arrays.fill(d, (byte) -1);
        while (true) {
            byte[] bArr3 = f5688b;
            if (i2 < bArr3.length) {
                byte b3 = bArr3[i2];
                if (b3 > 0) {
                    d[b3] = (byte) i2;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public static void a(byte[] bArr, int i2, int i3, int i4, StringBuilder sb) {
        int i5;
        sb.append((i3 == 1 && i4 == 0) ? 913 : i3 % 6 == 0 ? (char) 924 : 901);
        if (i3 >= 6) {
            char[] cArr = new char[5];
            i5 = i2;
            while ((i2 + i3) - i5 >= 6) {
                long j2 = 0;
                for (int i6 = 0; i6 < 6; i6++) {
                    j2 = (j2 << 8) + ((long) (bArr[i5 + i6] & ExifInterface.MARKER));
                }
                for (int i7 = 0; i7 < 5; i7++) {
                    cArr[i7] = (char) ((int) (j2 % 900));
                    j2 /= 900;
                }
                for (int i8 = 4; i8 >= 0; i8--) {
                    sb.append(cArr[i8]);
                }
                i5 += 6;
            }
        } else {
            i5 = i2;
        }
        while (i5 < i2 + i3) {
            sb.append((char) (bArr[i5] & ExifInterface.MARKER));
            i5++;
        }
    }

    public static void b(String str, int i2, int i3, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i3 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i4 = 0;
        while (i4 < i3) {
            sb2.setLength(0);
            int min = Math.min(44, i3 - i4);
            StringBuilder sb3 = new StringBuilder("1");
            int i5 = i2 + i4;
            sb3.append(str.substring(i5, i5 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            int length = sb2.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                sb.append(sb2.charAt(length));
            }
            i4 += min;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009f, code lost:
        if (r11 == ' ') goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ce A[EDGE_INSN: B:73:0x00ce->B:58:0x00ce ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0012 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            byte[] r3 = d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r5 = 2
            r6 = 1
            r8 = r20
            r9 = 0
        L_0x0012:
            int r10 = r17 + r9
            char r11 = r0.charAt(r10)
            r12 = 26
            r13 = 32
            r14 = 28
            r15 = 27
            r7 = 29
            if (r8 == 0) goto L_0x0099
            if (r8 == r6) goto L_0x0076
            r12 = -1
            if (r8 == r5) goto L_0x003a
            byte r10 = r3[r11]
            if (r10 == r12) goto L_0x002f
            r10 = r6
            goto L_0x0030
        L_0x002f:
            r10 = 0
        L_0x0030:
            if (r10 == 0) goto L_0x0036
            byte r10 = r3[r11]
            goto L_0x00c6
        L_0x0036:
            r4.append(r7)
            goto L_0x004f
        L_0x003a:
            boolean r13 = g(r11)
            if (r13 == 0) goto L_0x0046
            byte[] r10 = c
            byte r10 = r10[r11]
            goto L_0x00c6
        L_0x0046:
            boolean r13 = e(r11)
            if (r13 == 0) goto L_0x0051
            r4.append(r14)
        L_0x004f:
            r8 = 0
            goto L_0x0012
        L_0x0051:
            boolean r13 = d(r11)
            if (r13 == 0) goto L_0x0058
            goto L_0x00af
        L_0x0058:
            int r10 = r10 + 1
            if (r10 >= r1) goto L_0x0070
            char r10 = r0.charAt(r10)
            byte r10 = r3[r10]
            if (r10 == r12) goto L_0x0066
            r10 = r6
            goto L_0x0067
        L_0x0066:
            r10 = 0
        L_0x0067:
            if (r10 == 0) goto L_0x0070
            r8 = 3
            r7 = 25
            r4.append(r7)
            goto L_0x0012
        L_0x0070:
            r4.append(r7)
            byte r10 = r3[r11]
            goto L_0x00c6
        L_0x0076:
            boolean r10 = d(r11)
            if (r10 == 0) goto L_0x0082
            if (r11 != r13) goto L_0x007f
            goto L_0x00a1
        L_0x007f:
            int r11 = r11 + -97
            goto L_0x00a7
        L_0x0082:
            boolean r10 = e(r11)
            if (r10 == 0) goto L_0x008c
            r4.append(r15)
            goto L_0x00a5
        L_0x008c:
            boolean r10 = g(r11)
            if (r10 == 0) goto L_0x0093
            goto L_0x00bb
        L_0x0093:
            r4.append(r7)
            byte r10 = r3[r11]
            goto L_0x00c6
        L_0x0099:
            boolean r10 = e(r11)
            if (r10 == 0) goto L_0x00a9
            if (r11 != r13) goto L_0x00a5
        L_0x00a1:
            r4.append(r12)
            goto L_0x00ca
        L_0x00a5:
            int r11 = r11 + -65
        L_0x00a7:
            char r10 = (char) r11
            goto L_0x00c7
        L_0x00a9:
            boolean r10 = d(r11)
            if (r10 == 0) goto L_0x00b5
        L_0x00af:
            r4.append(r15)
            r8 = r6
            goto L_0x0012
        L_0x00b5:
            boolean r10 = g(r11)
            if (r10 == 0) goto L_0x00c1
        L_0x00bb:
            r4.append(r14)
            r8 = r5
            goto L_0x0012
        L_0x00c1:
            r4.append(r7)
            byte r10 = r3[r11]
        L_0x00c6:
            char r10 = (char) r10
        L_0x00c7:
            r4.append(r10)
        L_0x00ca:
            int r9 = r9 + 1
            if (r9 < r1) goto L_0x0012
            int r0 = r4.length()
            r1 = 0
            r3 = 0
        L_0x00d4:
            if (r1 >= r0) goto L_0x00f2
            int r9 = r1 % 2
            if (r9 == 0) goto L_0x00dc
            r9 = r6
            goto L_0x00dd
        L_0x00dc:
            r9 = 0
        L_0x00dd:
            if (r9 == 0) goto L_0x00eb
            int r3 = r3 * 30
            char r9 = r4.charAt(r1)
            int r9 = r9 + r3
            char r3 = (char) r9
            r2.append(r3)
            goto L_0x00ef
        L_0x00eb:
            char r3 = r4.charAt(r1)
        L_0x00ef:
            int r1 = r1 + 1
            goto L_0x00d4
        L_0x00f2:
            int r0 = r0 % r5
            if (r0 == 0) goto L_0x00fc
            int r3 = r3 * 30
            int r3 = r3 + r7
            char r0 = (char) r3
            r2.append(r0)
        L_0x00fc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.d0.g.g.c(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    public static boolean d(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    public static boolean e(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    public static boolean f(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean g(char c2) {
        return c[c2] != -1;
    }
}
