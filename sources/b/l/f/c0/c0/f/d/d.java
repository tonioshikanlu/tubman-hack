package b.l.f.c0.c0.f.d;

import b.l.f.m;
import b.l.f.y.a;

public final class d extends h {
    public d(a aVar) {
        super(aVar);
    }

    public String a() {
        if (this.a.f5810i >= 48) {
            StringBuilder sb = new StringBuilder();
            b(sb, 8);
            int c = this.f5618b.c(48, 2);
            sb.append("(393");
            sb.append(c);
            sb.append(')');
            int c2 = this.f5618b.c(50, 10);
            if (c2 / 100 == 0) {
                sb.append('0');
            }
            if (c2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(c2);
            sb.append(this.f5618b.b(60, (String) null).f5626b);
            return sb.toString();
        }
        throw m.f5759j;
    }
}
