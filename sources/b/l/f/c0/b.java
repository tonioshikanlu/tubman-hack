package b.l.f.c0;

public final class b extends s {

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f5591b;
    public static final char[] c = {'T', 'N', '*', 'E'};
    public static final char[] d = {'/', ':', '+', '.'};

    /* renamed from: e  reason: collision with root package name */
    public static final char f5592e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f5591b = cArr;
        f5592e = cArr[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean[] d(java.lang.String r11) {
        /*
            r10 = this;
            char r0 = f5592e
            int r1 = r11.length()
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 >= r4) goto L_0x0011
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0063
        L_0x0011:
            char r1 = r11.charAt(r3)
            char r1 = java.lang.Character.toUpperCase(r1)
            int r4 = r11.length()
            int r4 = r4 - r2
            char r4 = r11.charAt(r4)
            char r4 = java.lang.Character.toUpperCase(r4)
            char[] r5 = f5591b
            boolean r6 = b.l.f.c0.a.i(r5, r1)
            boolean r5 = b.l.f.c0.a.i(r5, r4)
            char[] r7 = c
            boolean r1 = b.l.f.c0.a.i(r7, r1)
            boolean r4 = b.l.f.c0.a.i(r7, r4)
            java.lang.String r7 = "Invalid start/end guards: "
            if (r6 == 0) goto L_0x004b
            if (r5 == 0) goto L_0x0041
            goto L_0x0070
        L_0x0041:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r7.concat(r11)
            r0.<init>(r11)
            throw r0
        L_0x004b:
            if (r1 == 0) goto L_0x005a
            if (r4 == 0) goto L_0x0050
            goto L_0x0070
        L_0x0050:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r7.concat(r11)
            r0.<init>(r11)
            throw r0
        L_0x005a:
            if (r5 != 0) goto L_0x0142
            if (r4 != 0) goto L_0x0142
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x0063:
            r1.append(r0)
            r1.append(r11)
            r1.append(r0)
            java.lang.String r11 = r1.toString()
        L_0x0070:
            r0 = 20
            r1 = r2
        L_0x0073:
            int r4 = r11.length()
            int r4 = r4 - r2
            if (r1 >= r4) goto L_0x00c6
            char r4 = r11.charAt(r1)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L_0x00c1
            char r4 = r11.charAt(r1)
            r5 = 45
            if (r4 == r5) goto L_0x00c1
            char r4 = r11.charAt(r1)
            r5 = 36
            if (r4 != r5) goto L_0x0095
            goto L_0x00c1
        L_0x0095:
            char[] r4 = d
            char r5 = r11.charAt(r1)
            boolean r4 = b.l.f.c0.a.i(r4, r5)
            if (r4 == 0) goto L_0x00a4
            int r0 = r0 + 10
            goto L_0x00c3
        L_0x00a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot encode : '"
            r2.<init>(r3)
            char r11 = r11.charAt(r1)
            r2.append(r11)
            r11 = 39
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            throw r0
        L_0x00c1:
            int r0 = r0 + 9
        L_0x00c3:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x00c6:
            int r1 = r11.length()
            int r1 = r1 - r2
            int r1 = r1 + r0
            boolean[] r0 = new boolean[r1]
            r1 = r3
            r4 = r1
        L_0x00d0:
            int r5 = r11.length()
            if (r1 >= r5) goto L_0x0141
            char r5 = r11.charAt(r1)
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r1 == 0) goto L_0x00e7
            int r6 = r11.length()
            int r6 = r6 - r2
            if (r1 != r6) goto L_0x0103
        L_0x00e7:
            r6 = 42
            if (r5 == r6) goto L_0x0101
            r6 = 69
            if (r5 == r6) goto L_0x00fe
            r6 = 78
            if (r5 == r6) goto L_0x00fb
            r6 = 84
            if (r5 == r6) goto L_0x00f8
            goto L_0x0103
        L_0x00f8:
            r5 = 65
            goto L_0x0103
        L_0x00fb:
            r5 = 66
            goto L_0x0103
        L_0x00fe:
            r5 = 68
            goto L_0x0103
        L_0x0101:
            r5 = 67
        L_0x0103:
            r6 = r3
        L_0x0104:
            char[] r7 = b.l.f.c0.a.d
            int r8 = r7.length
            if (r6 >= r8) goto L_0x0115
            char r7 = r7[r6]
            if (r5 != r7) goto L_0x0112
            int[] r5 = b.l.f.c0.a.f5586e
            r5 = r5[r6]
            goto L_0x0116
        L_0x0112:
            int r6 = r6 + 1
            goto L_0x0104
        L_0x0115:
            r5 = r3
        L_0x0116:
            r7 = r2
            r6 = r3
            r8 = r6
        L_0x0119:
            r9 = 7
            if (r6 >= r9) goto L_0x0133
            r0[r4] = r7
            int r4 = r4 + 1
            int r9 = 6 - r6
            int r9 = r5 >> r9
            r9 = r9 & r2
            if (r9 == 0) goto L_0x012d
            if (r8 != r2) goto L_0x012a
            goto L_0x012d
        L_0x012a:
            int r8 = r8 + 1
            goto L_0x0119
        L_0x012d:
            r7 = r7 ^ 1
            int r6 = r6 + 1
            r8 = r3
            goto L_0x0119
        L_0x0133:
            int r5 = r11.length()
            int r5 = r5 - r2
            if (r1 >= r5) goto L_0x013e
            r0[r4] = r3
            int r4 = r4 + 1
        L_0x013e:
            int r1 = r1 + 1
            goto L_0x00d0
        L_0x0141:
            return r0
        L_0x0142:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r7.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.c0.b.d(java.lang.String):boolean[]");
    }
}
