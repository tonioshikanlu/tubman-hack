package b.l.b.a.d.z;

public class b extends d {
    public static final char[] c = {'+'};
    public static final char[] d = "0123456789ABCDEF".toCharArray();
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean[] f4833b;

    @Deprecated
    public b(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric ASCII characters are always 'safe' and should not be escaped.");
        } else if (z && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        } else if (!str.contains("%")) {
            this.a = z;
            char[] charArray = str.toCharArray();
            int i2 = 122;
            for (char max : charArray) {
                i2 = Math.max(max, i2);
            }
            boolean[] zArr = new boolean[(i2 + 1)];
            for (int i3 = 48; i3 <= 57; i3++) {
                zArr[i3] = true;
            }
            for (int i4 = 65; i4 <= 90; i4++) {
                zArr[i4] = true;
            }
            for (int i5 = 97; i5 <= 122; i5++) {
                zArr[i5] = true;
            }
            for (char c2 : charArray) {
                zArr[c2] = true;
            }
            this.f4833b = zArr;
        } else {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            int r2 = r21.length()
            r3 = 0
            r4 = r3
        L_0x000a:
            if (r4 >= r2) goto L_0x0229
            char r5 = r1.charAt(r4)
            boolean[] r6 = r0.f4833b
            int r7 = r6.length
            if (r5 >= r7) goto L_0x001d
            boolean r5 = r6[r5]
            if (r5 != 0) goto L_0x001a
            goto L_0x001d
        L_0x001a:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x001d:
            int r2 = r21.length()
            java.lang.ThreadLocal<char[]> r5 = b.l.b.a.d.z.c.a
            java.lang.Object r5 = r5.get()
            char[] r5 = (char[]) r5
            r6 = r3
            r7 = r6
        L_0x002b:
            if (r4 >= r2) goto L_0x0210
            if (r4 >= r2) goto L_0x0208
            int r8 = r4 + 1
            char r9 = r1.charAt(r4)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r9 < r10) goto L_0x00a4
            r10 = 57343(0xdfff, float:8.0355E-41)
            if (r9 <= r10) goto L_0x0040
            goto L_0x00a4
        L_0x0040:
            r10 = 56319(0xdbff, float:7.892E-41)
            java.lang.String r11 = " at index "
            java.lang.String r12 = "' with value "
            if (r9 > r10) goto L_0x007f
            if (r8 != r2) goto L_0x004d
            int r9 = -r9
            goto L_0x00a4
        L_0x004d:
            char r10 = r1.charAt(r8)
            boolean r13 = java.lang.Character.isLowSurrogate(r10)
            if (r13 == 0) goto L_0x005c
            int r9 = java.lang.Character.toCodePoint(r9, r10)
            goto L_0x00a4
        L_0x005c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected low surrogate but got char '"
            r2.append(r3)
            r2.append(r10)
            r2.append(r12)
            r2.append(r10)
            r2.append(r11)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected low surrogate character '"
            r2.append(r3)
            r2.append(r9)
            r2.append(r12)
            r2.append(r9)
            r2.append(r11)
            int r8 = r8 + -1
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00a4:
            if (r9 < 0) goto L_0x0200
            boolean[] r8 = r0.f4833b
            int r10 = r8.length
            r11 = 2
            r12 = 32
            r13 = 1
            if (r9 >= r10) goto L_0x00b6
            boolean r8 = r8[r9]
            if (r8 == 0) goto L_0x00b6
            r8 = 0
            goto L_0x01af
        L_0x00b6:
            if (r9 != r12) goto L_0x00c0
            boolean r8 = r0.a
            if (r8 == 0) goto L_0x00c0
            char[] r8 = c
            goto L_0x01af
        L_0x00c0:
            r8 = 127(0x7f, float:1.78E-43)
            r10 = 37
            r12 = 3
            if (r9 > r8) goto L_0x00db
            char[] r8 = new char[r12]
            r8[r3] = r10
            char[] r10 = d
            r12 = r9 & 15
            char r12 = r10[r12]
            r8[r11] = r12
            int r12 = r9 >>> 4
            char r10 = r10[r12]
            r8[r13] = r10
            goto L_0x01af
        L_0x00db:
            r8 = 2047(0x7ff, float:2.868E-42)
            r13 = 5
            r14 = 6
            r15 = 4
            r16 = 8
            if (r9 > r8) goto L_0x010e
            char[] r8 = new char[r14]
            r8[r3] = r10
            r8[r12] = r10
            char[] r10 = d
            r12 = r9 & 15
            char r12 = r10[r12]
            r8[r13] = r12
            int r12 = r9 >>> 4
            r13 = r12 & 3
            r13 = r13 | 8
            char r13 = r10[r13]
            r8[r15] = r13
            int r12 = r12 >>> r11
            r13 = r12 & 15
            char r13 = r10[r13]
            r8[r11] = r13
            int r12 = r12 >>> 4
            r12 = r12 | 12
            char r10 = r10[r12]
            r13 = 1
            r8[r13] = r10
            goto L_0x01af
        L_0x010e:
            r8 = 1
            r15 = 65535(0xffff, float:9.1834E-41)
            r13 = 9
            r17 = 7
            if (r9 > r15) goto L_0x0155
            char[] r13 = new char[r13]
            r13[r3] = r10
            r15 = 69
            r13[r8] = r15
            r13[r12] = r10
            r13[r14] = r10
            char[] r8 = d
            r10 = r9 & 15
            char r10 = r8[r10]
            r13[r16] = r10
            int r10 = r9 >>> 4
            r12 = r10 & 3
            r12 = r12 | 8
            char r12 = r8[r12]
            r13[r17] = r12
            int r10 = r10 >>> r11
            r12 = r10 & 15
            char r12 = r8[r12]
            r14 = 5
            r13[r14] = r12
            int r10 = r10 >>> 4
            r12 = r10 & 3
            r12 = r12 | 8
            char r12 = r8[r12]
            r14 = 4
            r13[r14] = r12
            int r10 = r10 >>> r11
            char r8 = r8[r10]
            r13[r11] = r8
            r8 = 1
            r19 = r13
            r13 = r8
            r8 = r19
            goto L_0x01af
        L_0x0155:
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r8) goto L_0x01f4
            r8 = 12
            char[] r8 = new char[r8]
            r8[r3] = r10
            r15 = 70
            r18 = 1
            r8[r18] = r15
            r8[r12] = r10
            r8[r14] = r10
            r8[r13] = r10
            r10 = 11
            char[] r12 = d
            r13 = r9 & 15
            char r13 = r12[r13]
            r8[r10] = r13
            int r10 = r9 >>> 4
            r13 = 10
            r14 = r10 & 3
            r14 = r14 | 8
            char r14 = r12[r14]
            r8[r13] = r14
            int r10 = r10 >>> r11
            r13 = r10 & 15
            char r13 = r12[r13]
            r8[r16] = r13
            int r10 = r10 >>> 4
            r13 = r10 & 3
            r13 = r13 | 8
            char r13 = r12[r13]
            r8[r17] = r13
            int r10 = r10 >>> r11
            r13 = r10 & 15
            char r13 = r12[r13]
            r14 = 5
            r8[r14] = r13
            int r10 = r10 >>> 4
            r13 = r10 & 3
            r13 = r13 | 8
            char r13 = r12[r13]
            r14 = 4
            r8[r14] = r13
            int r10 = r10 >>> r11
            r10 = r10 & 7
            char r10 = r12[r10]
            r8[r11] = r10
            r13 = r18
        L_0x01af:
            boolean r9 = java.lang.Character.isSupplementaryCodePoint(r9)
            if (r9 == 0) goto L_0x01b6
            goto L_0x01b7
        L_0x01b6:
            r11 = r13
        L_0x01b7:
            int r11 = r11 + r4
            if (r8 == 0) goto L_0x01df
            int r9 = r4 - r6
            int r10 = r7 + r9
            int r12 = r8.length
            int r12 = r12 + r10
            int r13 = r5.length
            if (r13 >= r12) goto L_0x01cf
            int r12 = r12 + r2
            int r12 = r12 - r4
            int r12 = r12 + 32
            char[] r12 = new char[r12]
            if (r7 <= 0) goto L_0x01ce
            java.lang.System.arraycopy(r5, r3, r12, r3, r7)
        L_0x01ce:
            r5 = r12
        L_0x01cf:
            if (r9 <= 0) goto L_0x01d5
            r1.getChars(r6, r4, r5, r7)
            r7 = r10
        L_0x01d5:
            int r4 = r8.length
            if (r4 <= 0) goto L_0x01de
            int r4 = r8.length
            java.lang.System.arraycopy(r8, r3, r5, r7, r4)
            int r4 = r8.length
            int r7 = r7 + r4
        L_0x01de:
            r6 = r11
        L_0x01df:
            r4 = r11
        L_0x01e0:
            if (r4 >= r2) goto L_0x002b
            char r8 = r1.charAt(r4)
            boolean[] r9 = r0.f4833b
            int r10 = r9.length
            if (r8 >= r10) goto L_0x002b
            boolean r8 = r9[r8]
            if (r8 != 0) goto L_0x01f1
            goto L_0x002b
        L_0x01f1:
            int r4 = r4 + 1
            goto L_0x01e0
        L_0x01f4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid unicode character value "
            java.lang.String r2 = b.e.a.a.a.g(r2, r9)
            r1.<init>(r2)
            throw r1
        L_0x0200:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Trailing high surrogate at end of input"
            r1.<init>(r2)
            throw r1
        L_0x0208:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "Index exceeds specified range"
            r1.<init>(r2)
            throw r1
        L_0x0210:
            int r4 = r2 - r6
            if (r4 <= 0) goto L_0x0224
            int r4 = r4 + r7
            int r8 = r5.length
            if (r8 >= r4) goto L_0x0220
            char[] r8 = new char[r4]
            if (r7 <= 0) goto L_0x021f
            java.lang.System.arraycopy(r5, r3, r8, r3, r7)
        L_0x021f:
            r5 = r8
        L_0x0220:
            r1.getChars(r6, r2, r5, r7)
            r7 = r4
        L_0x0224:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5, r3, r7)
        L_0x0229:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.d.z.b.a(java.lang.String):java.lang.String");
    }
}
