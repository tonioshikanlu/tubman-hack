package b.l.f.e0.c;

import b.l.f.h;
import b.l.f.y.b;

public final class a {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public j f5701b;
    public g c;
    public boolean d;

    public a(b bVar) {
        int i2 = bVar.f5812i;
        if (i2 < 21 || (i2 & 3) != 1) {
            throw h.a();
        }
        this.a = bVar;
    }

    public final int a(int i2, int i3, int i4) {
        return this.d ? this.a.b(i3, i2) : this.a.b(i2, i3) ? (i4 << 1) | 1 : i4 << 1;
    }

    public void b() {
        int i2 = 0;
        while (i2 < this.a.f5811h) {
            int i3 = i2 + 1;
            int i4 = i3;
            while (true) {
                b bVar = this.a;
                if (i4 >= bVar.f5812i) {
                    break;
                }
                if (bVar.b(i2, i4) != this.a.b(i4, i2)) {
                    this.a.a(i4, i2);
                    this.a.a(i2, i4);
                }
                i4++;
            }
            i2 = i3;
        }
    }

    public g c() {
        g gVar = this.c;
        if (gVar != null) {
            return gVar;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 6; i4++) {
            i3 = a(i4, 8, i3);
        }
        int a2 = a(8, 7, a(8, 8, a(7, 8, i3)));
        for (int i5 = 5; i5 >= 0; i5--) {
            a2 = a(8, i5, a2);
        }
        int i6 = this.a.f5812i;
        int i7 = i6 - 7;
        for (int i8 = i6 - 1; i8 >= i7; i8--) {
            i2 = a(8, i8, i2);
        }
        for (int i9 = i6 - 8; i9 < i6; i9++) {
            i2 = a(i9, 8, i2);
        }
        g a3 = g.a(a2, i2);
        if (a3 == null) {
            a3 = g.a(a2 ^ 21522, i2 ^ 21522);
        }
        this.c = a3;
        if (a3 != null) {
            return a3;
        }
        throw h.a();
    }

    public j d() {
        j jVar = this.f5701b;
        if (jVar != null) {
            return jVar;
        }
        int i2 = this.a.f5812i;
        int i3 = (i2 - 17) / 4;
        if (i3 <= 6) {
            return j.d(i3);
        }
        int i4 = i2 - 11;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 5; i7 >= 0; i7--) {
            for (int i8 = i2 - 9; i8 >= i4; i8--) {
                i6 = a(i8, i7, i6);
            }
        }
        j b2 = j.b(i6);
        if (b2 == null || b2.c() != i2) {
            for (int i9 = 5; i9 >= 0; i9--) {
                for (int i10 = i2 - 9; i10 >= i4; i10--) {
                    i5 = a(i9, i10, i5);
                }
            }
            j b3 = j.b(i5);
            if (b3 == null || b3.c() != i2) {
                throw h.a();
            }
            this.f5701b = b3;
            return b3;
        }
        this.f5701b = b2;
        return b2;
    }

    public void e() {
        if (this.c != null) {
            c cVar = c.values()[this.c.f5719b];
            b bVar = this.a;
            cVar.e(bVar, bVar.f5812i);
        }
    }
}
