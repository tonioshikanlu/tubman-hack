package b.l.f.c0.c0.f.d;

import b.l.f.m;
import b.l.f.y.a;

public final class e extends i {
    public final String c;
    public final String d;

    public e(a aVar, String str, String str2) {
        super(aVar);
        this.c = str2;
        this.d = str;
    }

    public String a() {
        if (this.a.f5810i == 84) {
            StringBuilder sb = new StringBuilder();
            b(sb, 8);
            f(sb, 48, 20);
            int d2 = s.d(this.f5618b.a, 68, 16);
            if (d2 != 38400) {
                sb.append('(');
                sb.append(this.c);
                sb.append(')');
                int i2 = d2 % 32;
                int i3 = d2 / 32;
                int i4 = (i3 % 12) + 1;
                int i5 = i3 / 12;
                if (i5 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i5);
                if (i4 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i4);
                if (i2 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i2);
            }
            return sb.toString();
        }
        throw m.f5759j;
    }

    public void d(StringBuilder sb, int i2) {
        sb.append('(');
        sb.append(this.d);
        sb.append(i2 / 100000);
        sb.append(')');
    }

    public int e(int i2) {
        return i2 % 100000;
    }
}
