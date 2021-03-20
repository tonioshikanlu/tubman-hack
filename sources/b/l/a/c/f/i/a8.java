package b.l.a.c.f.i;

import b.l.a.c.b.a;

public final class a8 extends z7 {
    public final int a(int i2, byte[] bArr, int i3, int i4) {
        while (r9 < i4 && bArr[r9] >= 0) {
            i3 = r9 + 1;
        }
        if (r9 >= i4) {
            return 0;
        }
        while (r9 < i4) {
            int i5 = r9 + 1;
            byte b2 = bArr[r9];
            if (b2 < 0) {
                if (b2 >= -32) {
                    if (b2 < -16) {
                        if (i5 < i4 - 1) {
                            int i6 = i5 + 1;
                            byte b3 = bArr[i5];
                            if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                                r9 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                    } else if (i5 < i4 - 2) {
                        int i7 = i5 + 1;
                        byte b4 = bArr[i5];
                        if (b4 <= -65) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                                int i8 = i7 + 1;
                                if (bArr[i7] <= -65) {
                                    i5 = i8 + 1;
                                    if (bArr[i8] > -65) {
                                    }
                                }
                            }
                        }
                    }
                    return d8.c(bArr, i5, i4);
                } else if (i5 >= i4) {
                    return b2;
                } else {
                    if (b2 >= -62) {
                        r9 = i5 + 1;
                        if (bArr[i5] > -65) {
                        }
                    }
                }
                return -1;
            }
            r9 = i5;
        }
        return 0;
    }

    public final String b(byte[] bArr, int i2, int i3) {
        int i4;
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) >= 0) {
            int i5 = i2 + i3;
            char[] cArr = new char[i3];
            int i6 = 0;
            while (r13 < i5) {
                byte b2 = bArr[r13];
                if (!a.u1(b2)) {
                    break;
                }
                i2 = r13 + 1;
                cArr[i4] = (char) b2;
                i6 = i4 + 1;
            }
            while (r13 < i5) {
                int i7 = r13 + 1;
                byte b3 = bArr[r13];
                if (a.u1(b3)) {
                    int i8 = i4 + 1;
                    cArr[i4] = (char) b3;
                    r13 = i7;
                    while (true) {
                        i4 = i8;
                        if (r13 >= i5) {
                            break;
                        }
                        byte b4 = bArr[r13];
                        if (!a.u1(b4)) {
                            break;
                        }
                        r13++;
                        i8 = i4 + 1;
                        cArr[i4] = (char) b4;
                    }
                } else {
                    if (!(b3 < -32)) {
                        if (b3 < -16) {
                            if (i7 < i5 - 1) {
                                int i9 = i7 + 1;
                                a.m2(b3, bArr[i7], bArr[i9], cArr, i4);
                                r13 = i9 + 1;
                                i4++;
                            } else {
                                throw y5.d();
                            }
                        } else if (i7 < i5 - 2) {
                            int i10 = i7 + 1;
                            int i11 = i10 + 1;
                            a.q2(b3, bArr[i7], bArr[i10], bArr[i11], cArr, i4);
                            i4 += 2;
                            r13 = i11 + 1;
                        } else {
                            throw y5.d();
                        }
                    } else if (i7 < i5) {
                        a.Y1(b3, bArr[i7], cArr, i4);
                        r13 = i7 + 1;
                        i4++;
                    } else {
                        throw y5.d();
                    }
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    public final int c(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        char charAt;
        int length = charSequence.length();
        int i7 = i3 + i2;
        int i8 = 0;
        while (i8 < length && (i6 = i8 + i2) < i7 && (charAt = charSequence.charAt(i8)) < 128) {
            bArr[i6] = (byte) charAt;
            i8++;
        }
        if (i8 == length) {
            return i2 + length;
        }
        int i9 = i2 + i8;
        while (i8 < length) {
            char charAt2 = charSequence.charAt(i8);
            if (charAt2 < 128 && i9 < i7) {
                i5 = i9 + 1;
                bArr[i9] = (byte) charAt2;
            } else if (charAt2 < 2048 && i9 <= i7 - 2) {
                int i10 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 >>> 6) | 960);
                i9 = i10 + 1;
                bArr[i10] = (byte) ((charAt2 & '?') | 128);
                i8++;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i9 <= i7 - 3) {
                int i11 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 >>> 12) | 480);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i5 = i12 + 1;
                bArr[i12] = (byte) ((charAt2 & '?') | 128);
            } else if (i9 <= i7 - 4) {
                int i13 = i8 + 1;
                if (i13 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i13);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i14 = i9 + 1;
                        bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i9 = i16 + 1;
                        bArr[i16] = (byte) ((codePoint & 63) | 128);
                        i8 = i13;
                        i8++;
                    } else {
                        i8 = i13;
                    }
                }
                throw new b8(i8 - 1, length);
            } else if (charAt2 < 55296 || charAt2 > 57343 || ((i4 = i8 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i9);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new b8(i8, length);
            }
            i9 = i5;
            i8++;
        }
        return i9;
    }
}
