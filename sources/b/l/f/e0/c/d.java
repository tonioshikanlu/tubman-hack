package b.l.f.e0.c;

import b.l.f.h;
import b.l.f.y.c;
import java.io.UnsupportedEncodingException;

public final class d {
    public static final char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(c cVar, StringBuilder sb, int i2, boolean z) {
        while (i2 > 1) {
            if (cVar.a() >= 11) {
                int b2 = cVar.b(11);
                sb.append(f(b2 / 45));
                sb.append(f(b2 % 45));
                i2 -= 2;
            } else {
                throw h.a();
            }
        }
        if (i2 == 1) {
            if (cVar.a() >= 6) {
                sb.append(f(cVar.b(6)));
            } else {
                throw h.a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i3 = length + 1;
                        if (sb.charAt(i3) == '%') {
                            sb.deleteCharAt(i3);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x013f, code lost:
        if (r1 == 2) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0143, code lost:
        if ((r17 * 10) >= r0) goto L_0x014d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(b.l.f.y.c r21, java.lang.StringBuilder r22, int r23, b.l.f.y.d r24, java.util.Collection<byte[]> r25, java.util.Map<b.l.f.e, ?> r26) {
        /*
            r0 = r23
            r1 = r26
            int r2 = r0 << 3
            int r3 = r21.a()
            if (r2 > r3) goto L_0x0175
            byte[] r2 = new byte[r0]
            r3 = 0
            r4 = r3
        L_0x0010:
            if (r4 >= r0) goto L_0x0020
            r5 = 8
            r6 = r21
            int r5 = r6.b(r5)
            byte r5 = (byte) r5
            r2[r4] = r5
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0020:
            if (r24 != 0) goto L_0x0158
            java.lang.String r4 = b.l.f.y.j.a
            if (r1 == 0) goto L_0x003a
            b.l.f.e r4 = b.l.f.e.CHARACTER_SET
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L_0x003a
            java.lang.Object r0 = r1.get(r4)
            java.lang.String r0 = r0.toString()
            r20 = r2
            goto L_0x015e
        L_0x003a:
            r1 = 2
            r4 = 3
            r5 = 1
            if (r0 <= r4) goto L_0x0053
            byte r6 = r2[r3]
            r7 = -17
            if (r6 != r7) goto L_0x0053
            byte r6 = r2[r5]
            r7 = -69
            if (r6 != r7) goto L_0x0053
            byte r6 = r2[r1]
            r7 = -65
            if (r6 != r7) goto L_0x0053
            r6 = r5
            goto L_0x0054
        L_0x0053:
            r6 = r3
        L_0x0054:
            r1 = r3
            r9 = r1
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r17 = r15
            r18 = r17
            r19 = r18
            r7 = r5
            r8 = r7
        L_0x0064:
            if (r9 >= r0) goto L_0x0113
            if (r5 != 0) goto L_0x006c
            if (r7 != 0) goto L_0x006c
            if (r8 == 0) goto L_0x0113
        L_0x006c:
            byte r4 = r2[r9]
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r8 == 0) goto L_0x00a0
            r20 = r2
            r2 = r4 & 128(0x80, float:1.794E-43)
            if (r10 <= 0) goto L_0x007d
            if (r2 == 0) goto L_0x009e
            int r10 = r10 + -1
            goto L_0x00a2
        L_0x007d:
            if (r2 == 0) goto L_0x00a2
            r2 = r4 & 64
            if (r2 == 0) goto L_0x009e
            int r10 = r10 + 1
            r2 = r4 & 32
            if (r2 != 0) goto L_0x008c
            int r12 = r12 + 1
            goto L_0x00a2
        L_0x008c:
            int r10 = r10 + 1
            r2 = r4 & 16
            if (r2 != 0) goto L_0x0095
            int r13 = r13 + 1
            goto L_0x00a2
        L_0x0095:
            int r10 = r10 + 1
            r2 = r4 & 8
            if (r2 != 0) goto L_0x009e
            int r14 = r14 + 1
            goto L_0x00a2
        L_0x009e:
            r8 = 0
            goto L_0x00a2
        L_0x00a0:
            r20 = r2
        L_0x00a2:
            r2 = 127(0x7f, float:1.78E-43)
            if (r5 == 0) goto L_0x00c0
            if (r4 <= r2) goto L_0x00ae
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 >= r2) goto L_0x00ae
            r5 = 0
            goto L_0x00c0
        L_0x00ae:
            r2 = 159(0x9f, float:2.23E-43)
            if (r4 <= r2) goto L_0x00c0
            r2 = 192(0xc0, float:2.69E-43)
            if (r4 < r2) goto L_0x00be
            r2 = 215(0xd7, float:3.01E-43)
            if (r4 == r2) goto L_0x00be
            r2 = 247(0xf7, float:3.46E-43)
            if (r4 != r2) goto L_0x00c0
        L_0x00be:
            int r17 = r17 + 1
        L_0x00c0:
            if (r7 == 0) goto L_0x010c
            if (r11 <= 0) goto L_0x00d4
            r2 = 64
            if (r4 < r2) goto L_0x010b
            r2 = 127(0x7f, float:1.78E-43)
            if (r4 == r2) goto L_0x010b
            r2 = 252(0xfc, float:3.53E-43)
            if (r4 <= r2) goto L_0x00d1
            goto L_0x010b
        L_0x00d1:
            int r11 = r11 + -1
            goto L_0x010c
        L_0x00d4:
            r2 = 128(0x80, float:1.794E-43)
            if (r4 == r2) goto L_0x010b
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 == r2) goto L_0x010b
            r2 = 239(0xef, float:3.35E-43)
            if (r4 <= r2) goto L_0x00e1
            goto L_0x010b
        L_0x00e1:
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 <= r2) goto L_0x00f5
            r2 = 224(0xe0, float:3.14E-43)
            if (r4 >= r2) goto L_0x00f5
            int r1 = r1 + 1
            int r2 = r19 + 1
            if (r2 <= r15) goto L_0x00f0
            r15 = r2
        L_0x00f0:
            r19 = r2
            r18 = 0
            goto L_0x010c
        L_0x00f5:
            r2 = 127(0x7f, float:1.78E-43)
            if (r4 <= r2) goto L_0x0106
            int r11 = r11 + 1
            int r2 = r18 + 1
            if (r2 <= r3) goto L_0x0103
            r3 = r2
            r18 = r3
            goto L_0x0108
        L_0x0103:
            r18 = r2
            goto L_0x0108
        L_0x0106:
            r18 = 0
        L_0x0108:
            r19 = 0
            goto L_0x010c
        L_0x010b:
            r7 = 0
        L_0x010c:
            int r9 = r9 + 1
            r2 = r20
            r4 = 3
            goto L_0x0064
        L_0x0113:
            r20 = r2
            if (r8 == 0) goto L_0x011a
            if (r10 <= 0) goto L_0x011a
            r8 = 0
        L_0x011a:
            if (r7 == 0) goto L_0x0121
            if (r11 <= 0) goto L_0x0121
            r16 = 0
            goto L_0x0123
        L_0x0121:
            r16 = r7
        L_0x0123:
            if (r8 == 0) goto L_0x012c
            if (r6 != 0) goto L_0x0152
            int r12 = r12 + r13
            int r12 = r12 + r14
            if (r12 <= 0) goto L_0x012c
            goto L_0x0152
        L_0x012c:
            if (r16 == 0) goto L_0x0138
            boolean r2 = b.l.f.y.j.f5838b
            if (r2 != 0) goto L_0x014d
            r2 = 3
            if (r15 >= r2) goto L_0x014d
            if (r3 < r2) goto L_0x0138
            goto L_0x014d
        L_0x0138:
            if (r5 == 0) goto L_0x0146
            if (r16 == 0) goto L_0x0146
            r2 = 2
            if (r15 != r2) goto L_0x0141
            if (r1 == r2) goto L_0x014d
        L_0x0141:
            int r1 = r17 * 10
            if (r1 < r0) goto L_0x0148
            goto L_0x014d
        L_0x0146:
            if (r5 == 0) goto L_0x014b
        L_0x0148:
            java.lang.String r0 = "ISO8859_1"
            goto L_0x015e
        L_0x014b:
            if (r16 == 0) goto L_0x0150
        L_0x014d:
            java.lang.String r0 = "SJIS"
            goto L_0x015e
        L_0x0150:
            if (r8 == 0) goto L_0x0155
        L_0x0152:
            java.lang.String r0 = "UTF8"
            goto L_0x015e
        L_0x0155:
            java.lang.String r0 = b.l.f.y.j.a
            goto L_0x015e
        L_0x0158:
            r20 = r2
            java.lang.String r0 = r24.name()
        L_0x015e:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r2 = r20
            r1.<init>(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r0 = r22
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r0 = r25
            r0.add(r2)
            return
        L_0x0170:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        L_0x0175:
            b.l.f.h r0 = b.l.f.h.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.e0.c.d.b(b.l.f.y.c, java.lang.StringBuilder, int, b.l.f.y.d, java.util.Collection, java.util.Map):void");
    }

    public static void c(c cVar, StringBuilder sb, int i2) {
        if (i2 * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i2 * 2)];
            int i3 = 0;
            while (i2 > 0) {
                int b2 = cVar.b(13);
                int i4 = (b2 % 96) | ((b2 / 96) << 8);
                int i5 = i4 + (i4 < 2560 ? 41377 : 42657);
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i2--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw h.a();
            }
        } else {
            throw h.a();
        }
    }

    public static void d(c cVar, StringBuilder sb, int i2) {
        if (i2 * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i2 * 2)];
            int i3 = 0;
            while (i2 > 0) {
                int b2 = cVar.b(13);
                int i4 = (b2 % 192) | ((b2 / 192) << 8);
                int i5 = i4 + (i4 < 7936 ? 33088 : 49472);
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i2--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw h.a();
            }
        } else {
            throw h.a();
        }
    }

    public static void e(c cVar, StringBuilder sb, int i2) {
        while (i2 >= 3) {
            if (cVar.a() >= 10) {
                int b2 = cVar.b(10);
                if (b2 < 1000) {
                    sb.append(f(b2 / 100));
                    sb.append(f((b2 / 10) % 10));
                    sb.append(f(b2 % 10));
                    i2 -= 3;
                } else {
                    throw h.a();
                }
            } else {
                throw h.a();
            }
        }
        if (i2 == 2) {
            if (cVar.a() >= 7) {
                int b3 = cVar.b(7);
                if (b3 < 100) {
                    sb.append(f(b3 / 10));
                    sb.append(f(b3 % 10));
                    return;
                }
                throw h.a();
            }
            throw h.a();
        } else if (i2 != 1) {
        } else {
            if (cVar.a() >= 4) {
                int b4 = cVar.b(4);
                if (b4 < 10) {
                    sb.append(f(b4));
                    return;
                }
                throw h.a();
            }
            throw h.a();
        }
    }

    public static char f(int i2) {
        char[] cArr = a;
        if (i2 < cArr.length) {
            return cArr[i2];
        }
        throw h.a();
    }
}
