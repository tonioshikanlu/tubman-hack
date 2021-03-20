package b.l.f.z.e;

import b.l.f.x.a.g;

public final class a implements g {
    public void a(h hVar) {
        String str = hVar.a;
        int i2 = hVar.f;
        int length = str.length();
        int i3 = 0;
        if (i2 < length) {
            loop0:
            while (true) {
                char charAt = str.charAt(i2);
                while (true) {
                    if (!g.M(charAt) || i2 >= length) {
                        break loop0;
                    }
                    i3++;
                    i2++;
                    if (i2 < length) {
                    }
                }
            }
        }
        if (i3 >= 2) {
            char charAt2 = hVar.a.charAt(hVar.f);
            char charAt3 = hVar.a.charAt(hVar.f + 1);
            if (!g.M(charAt2) || !g.M(charAt3)) {
                throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
            }
            hVar.f5877e.append((char) b.e.a.a.a.b(charAt3, -48, (charAt2 - '0') * 10, 130));
            hVar.f += 2;
            return;
        }
        char b2 = hVar.b();
        int T = g.T(hVar.a, hVar.f, 0);
        if (T != 0) {
            if (T == 1) {
                hVar.f5877e.append(230);
                hVar.f5878g = 1;
            } else if (T == 2) {
                hVar.f5877e.append(239);
                hVar.f5878g = 2;
            } else if (T == 3) {
                hVar.f5877e.append(238);
                hVar.f5878g = 3;
            } else if (T == 4) {
                hVar.f5877e.append(240);
                hVar.f5878g = 4;
            } else if (T == 5) {
                hVar.f5877e.append(231);
                hVar.f5878g = 5;
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(T)));
            }
        } else if (g.N(b2)) {
            hVar.f5877e.append(235);
            hVar.f5877e.append((char) ((b2 - 128) + 1));
            hVar.f++;
        } else {
            hVar.f5877e.append((char) (b2 + 1));
            hVar.f++;
        }
    }
}
