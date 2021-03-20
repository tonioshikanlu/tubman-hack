package b.j.a.b.s;

import b.e.a.a.a;
import java.io.Writer;

public final class k extends Writer {
    public static String b(int i2) {
        StringBuilder y;
        String str;
        if (i2 > 1114111) {
            y = a.y("Illegal character point (0x");
            y.append(Integer.toHexString(i2));
            str = ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i2 >= 55296) {
            y = a.y(i2 <= 56319 ? "Unmatched first part of surrogate pair (0x" : "Unmatched second part of surrogate pair (0x");
            y.append(Integer.toHexString(i2));
            y.append(")");
            return y.toString();
        } else {
            y = a.y("Illegal character point (0x");
            y.append(Integer.toHexString(i2));
            str = ") to output";
        }
        y.append(str);
        return y.toString();
    }
}
