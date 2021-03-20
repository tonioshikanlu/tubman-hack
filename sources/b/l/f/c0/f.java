package b.l.f.c0;

import b.l.f.a;
import b.l.f.g;
import b.l.f.y.b;
import java.util.Map;

public final class f extends s {
    public static void f(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i4 = 1;
            if (((1 << (8 - i3)) & i2) != 0) {
                i4 = 2;
            }
            iArr[i3] = i4;
        }
    }

    public b a(String str, a aVar, int i2, int i3, Map<g, ?> map) {
        if (aVar == a.CODE_39) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] d(String str) {
        String str2;
        int i2;
        int i3;
        int length = str.length();
        if (length <= 80) {
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i4)) < 0) {
                    int length2 = str.length();
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < length2; i5++) {
                        char charAt = str.charAt(i5);
                        if (charAt != 0) {
                            if (charAt != ' ') {
                                if (charAt == '@') {
                                    str2 = "%V";
                                } else if (charAt == '`') {
                                    str2 = "%W";
                                } else if (!(charAt == '-' || charAt == '.')) {
                                    if (charAt <= 26) {
                                        sb.append('$');
                                        i3 = charAt - 1;
                                    } else if (charAt < ' ') {
                                        sb.append('%');
                                        i3 = charAt - 27;
                                    } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                                        sb.append('/');
                                        i3 = charAt - '!';
                                    } else {
                                        if (charAt <= '9') {
                                            i2 = (charAt - '0') + 48;
                                        } else if (charAt <= '?') {
                                            sb.append('%');
                                            i2 = (charAt - ';') + 70;
                                        } else if (charAt <= 'Z') {
                                            i3 = charAt - 'A';
                                        } else if (charAt <= '_') {
                                            sb.append('%');
                                            i2 = (charAt - '[') + 75;
                                        } else if (charAt <= 'z') {
                                            sb.append('+');
                                            i3 = charAt - 'a';
                                        } else if (charAt <= 127) {
                                            sb.append('%');
                                            i2 = (charAt - '{') + 80;
                                        } else {
                                            throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i5) + "'");
                                        }
                                        charAt = (char) i2;
                                    }
                                    i2 = i3 + 65;
                                    charAt = (char) i2;
                                }
                            }
                            sb.append(charAt);
                        } else {
                            str2 = "%U";
                        }
                        sb.append(str2);
                    }
                    str = sb.toString();
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i4++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[((length * 13) + 25)];
            f(148, iArr);
            int b2 = s.b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int b3 = s.b(zArr, b2, iArr2, false) + b2;
            for (int i6 = 0; i6 < length; i6++) {
                f(e.d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i6))], iArr);
                int b4 = s.b(zArr, b3, iArr, true) + b3;
                b3 = s.b(zArr, b4, iArr2, false) + b4;
            }
            f(148, iArr);
            s.b(zArr, b3, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
