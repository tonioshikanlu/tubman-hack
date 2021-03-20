package b.l.f.z.e;

public final class l extends c {
    public int c(char c, StringBuilder sb) {
        int i2;
        int i3;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i3 = (c - '0') + 4;
            } else if (c < 'a' || c > 'z') {
                if (c < ' ') {
                    sb.append(0);
                } else {
                    if (c <= '/') {
                        sb.append(1);
                        i2 = c - '!';
                    } else if (c <= '@') {
                        sb.append(1);
                        i2 = (c - ':') + 15;
                    } else if (c >= '[' && c <= '_') {
                        sb.append(1);
                        i2 = (c - '[') + 22;
                    } else if (c == '`') {
                        sb.append(2);
                        i2 = c - '`';
                    } else if (c <= 'Z') {
                        sb.append(2);
                        i2 = (c - 'A') + 1;
                    } else if (c <= 127) {
                        sb.append(2);
                        i2 = (c - '{') + 27;
                    } else {
                        sb.append("\u0001\u001e");
                        return c((char) (c - 128), sb) + 2;
                    }
                    c = (char) i2;
                }
                sb.append(c);
                return 2;
            } else {
                i3 = (c - 'a') + 14;
            }
            c2 = (char) i3;
        }
        sb.append(c2);
        return 1;
    }

    public int d() {
        return 2;
    }
}
