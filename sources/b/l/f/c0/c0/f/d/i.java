package b.l.f.c0.c0.f.d;

import b.l.f.y.a;

public abstract class i extends h {
    public i(a aVar) {
        super(aVar);
    }

    public abstract void d(StringBuilder sb, int i2);

    public abstract int e(int i2);

    public final void f(StringBuilder sb, int i2, int i3) {
        int d = s.d(this.f5618b.a, i2, i3);
        d(sb, d);
        int e2 = e(d);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (e2 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(e2);
    }
}
