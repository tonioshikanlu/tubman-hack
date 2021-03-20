package b.l.f.z.e;

import androidx.core.view.InputDeviceCompat;
import b.e.a.a.a;
import b.l.f.x.a.g;

public final class b implements g {
    public void a(h hVar) {
        StringBuilder v = a.v(0);
        while (true) {
            if (!hVar.d()) {
                break;
            }
            v.append(hVar.b());
            int i2 = hVar.f + 1;
            hVar.f = i2;
            if (g.T(hVar.a, i2, 5) != 5) {
                hVar.f5878g = 0;
                break;
            }
        }
        int length = v.length() - 1;
        int a = hVar.a() + length + 1;
        hVar.f(a);
        boolean z = hVar.f5879h.f5883b - a > 0;
        if (hVar.d() || z) {
            if (length <= 249) {
                v.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                v.setCharAt(0, (char) ((length / 250) + 249));
                v.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = v.length();
        for (int i3 = 0; i3 < length2; i3++) {
            int a2 = (((hVar.a() + 1) * 149) % 255) + 1 + v.charAt(i3);
            if (a2 > 255) {
                a2 += InputDeviceCompat.SOURCE_ANY;
            }
            hVar.f5877e.append((char) a2);
        }
    }
}
