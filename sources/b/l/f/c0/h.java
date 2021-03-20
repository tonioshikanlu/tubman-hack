package b.l.f.c0;

import b.l.f.a;
import b.l.f.g;
import b.l.f.y.b;
import java.util.Map;

public class h extends s {
    public static int f(boolean[] zArr, int i2, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            boolean z = true;
            int i5 = i2 + i4;
            if (((1 << (8 - i4)) & i3) == 0) {
                z = false;
            }
            zArr[i5] = z;
        }
        return 9;
    }

    public static int g(String str, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        return i3 % 47;
    }

    public b a(String str, a aVar, int i2, int i3, Map<g, ?> map) {
        if (aVar == a.CODE_93) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] d(String str) {
        String str2;
        int i2;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == 0) {
                str2 = "bU";
            } else {
                if (charAt <= 26) {
                    sb.append('a');
                    i2 = (charAt + 'A') - 1;
                } else if (charAt <= 31) {
                    sb.append('b');
                    i2 = (charAt + 'A') - 27;
                } else {
                    if (!(charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+')) {
                        if (charAt <= ',') {
                            sb.append('c');
                            i2 = (charAt + 'A') - 33;
                        } else if (charAt > '9') {
                            if (charAt == ':') {
                                str2 = "cZ";
                            } else if (charAt <= '?') {
                                sb.append('b');
                                i2 = (charAt + 'F') - 59;
                            } else if (charAt == '@') {
                                str2 = "bV";
                            } else if (charAt > 'Z') {
                                if (charAt <= '_') {
                                    sb.append('b');
                                    i2 = (charAt + 'K') - 91;
                                } else if (charAt == '`') {
                                    str2 = "bW";
                                } else if (charAt <= 'z') {
                                    sb.append('d');
                                    i2 = (charAt + 'A') - 97;
                                } else if (charAt <= 127) {
                                    sb.append('b');
                                    i2 = (charAt + 'P') - 123;
                                } else {
                                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
                                }
                            }
                        }
                    }
                    sb.append(charAt);
                }
                charAt = (char) i2;
                sb.append(charAt);
            }
            sb.append(str2);
        }
        String sb2 = sb.toString();
        int length2 = sb2.length();
        if (length2 <= 80) {
            boolean[] zArr = new boolean[(((sb2.length() + 2 + 2) * 9) + 1)];
            f(zArr, 0, g.f5637e);
            int i4 = 9;
            for (int i5 = 0; i5 < length2; i5++) {
                f(zArr, i4, g.d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(sb2.charAt(i5))]);
                i4 += 9;
            }
            int g2 = g(sb2, 20);
            int[] iArr = g.d;
            f(zArr, i4, iArr[g2]);
            int i6 = i4 + 9;
            StringBuilder y = b.e.a.a.a.y(sb2);
            y.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(g2));
            f(zArr, i6, iArr[g(y.toString(), 15)]);
            int i7 = i6 + 9;
            f(zArr, i7, g.f5637e);
            zArr[i7 + 9] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length2)));
    }
}
