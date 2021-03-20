package b.l.f.z.e;

import b.l.f.x.a.g;

public final class m extends c {
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.d()) {
                break;
            }
            char b2 = hVar.b();
            hVar.f++;
            c(b2, sb);
            if (sb.length() % 3 == 0) {
                c.f(hVar, sb);
                if (g.T(hVar.a, hVar.f, 3) != 3) {
                    hVar.f5878g = 0;
                    break;
                }
            }
        }
        e(hVar, sb);
    }

    public int c(char c, StringBuilder sb) {
        char c2;
        int i2;
        if (c == 13) {
            c2 = 0;
        } else if (c == ' ') {
            c2 = 3;
        } else if (c == '*') {
            sb.append(1);
            return 1;
        } else if (c != '>') {
            if (c >= '0' && c <= '9') {
                i2 = (c - '0') + 4;
            } else if (c < 'A' || c > 'Z') {
                g.I(c);
                throw null;
            } else {
                i2 = (c - 'A') + 14;
            }
            c2 = (char) i2;
        } else {
            c2 = 2;
        }
        sb.append(c2);
        return 1;
    }

    public int d() {
        return 3;
    }

    public void e(h hVar, StringBuilder sb) {
        hVar.e();
        int a = hVar.f5879h.f5883b - hVar.a();
        hVar.f -= sb.length();
        if (hVar.c() > 1 || a > 1 || hVar.c() != a) {
            hVar.f5877e.append(254);
        }
        if (hVar.f5878g < 0) {
            hVar.f5878g = 0;
        }
    }
}
