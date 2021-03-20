package b.l.f.c0.c0.f.d;

import b.l.f.y.a;

public abstract class h extends j {
    public h(a aVar) {
        super(aVar);
    }

    public final void b(StringBuilder sb, int i2) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        c(sb, i2, length);
    }

    public final void c(StringBuilder sb, int i2, int i3) {
        int i4 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            int c = this.f5618b.c((i5 * 10) + i2, 10);
            if (c / 100 == 0) {
                sb.append('0');
            }
            if (c / 10 == 0) {
                sb.append('0');
            }
            sb.append(c);
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 13; i7++) {
            int charAt = sb.charAt(i7 + i3) - '0';
            if ((i7 & 1) == 0) {
                charAt *= 3;
            }
            i6 += charAt;
        }
        int i8 = 10 - (i6 % 10);
        if (i8 != 10) {
            i4 = i8;
        }
        sb.append(i4);
    }
}
