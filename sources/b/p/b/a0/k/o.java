package b.p.b.a0.k;

import b.e.a.a.a;
import b.p.b.s;
import java.net.ProtocolException;

public final class o {
    public final s a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6668b;
    public final String c;

    public o(s sVar, int i2, String str) {
        this.a = sVar;
        this.f6668b = i2;
        this.c = str;
    }

    public static o a(String str) {
        String str2;
        s sVar = s.HTTP_1_0;
        int i2 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(a.m("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    sVar = s.HTTP_1_1;
                } else {
                    throw new ProtocolException(a.m("Unexpected status line: ", str));
                }
            }
        } else if (str.startsWith("ICY ")) {
            i2 = 4;
        } else {
            throw new ProtocolException(a.m("Unexpected status line: ", str));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                } else {
                    throw new ProtocolException(a.m("Unexpected status line: ", str));
                }
                return new o(sVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(a.m("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(a.m("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == s.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f6668b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }
}
