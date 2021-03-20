package n.m0.h;

import b.e.a.a.a;
import e.c0.h;
import e.x.c.i;
import java.net.ProtocolException;
import n.d0;

public final class j {
    public final d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10240b;
    public final String c;

    public j(d0 d0Var, int i2, String str) {
        i.e(d0Var, "protocol");
        i.e(str, "message");
        this.a = d0Var;
        this.f10240b = i2;
        this.c = str;
    }

    public static final j a(String str) {
        String str2;
        d0 d0Var = d0.HTTP_1_0;
        i.e(str, "statusLine");
        int i2 = 9;
        if (h.C(str, "HTTP/1.", false, 2)) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(a.m("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    d0Var = d0.HTTP_1_1;
                } else {
                    throw new ProtocolException(a.m("Unexpected status line: ", str));
                }
            }
        } else if (h.C(str, "ICY ", false, 2)) {
            i2 = 4;
        } else {
            throw new ProtocolException(a.m("Unexpected status line: ", str));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                String substring = str.substring(i2, i3);
                i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                    i.d(str2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new ProtocolException(a.m("Unexpected status line: ", str));
                }
                return new j(d0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(a.m("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(a.m("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == d0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f10240b);
        sb.append(' ');
        sb.append(this.c);
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
