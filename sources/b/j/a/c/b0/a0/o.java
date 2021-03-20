package b.j.a.c.b0.a0;

import b.j.a.b.g;
import b.j.a.c.b0.k;
import b.j.a.c.b0.u;
import b.j.a.c.b0.x;
import b.j.a.c.e0.l;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.i;
import b.j.a.c.i0.n;
import b.j.a.c.j0.b;
import b.j.a.c.s;
import b.j.a.c.t;

public class o extends x.a {
    public o() {
        super((Class<?>) g.class);
    }

    public static k F(String str, i iVar, int i2) {
        return new k(t.a(str), iVar, (t) null, (c) null, (b) null, (l) null, i2, (Object) null, s.f2292o);
    }

    public u[] B(f fVar) {
        i d = fVar.d(Integer.TYPE);
        i d2 = fVar.d(Long.TYPE);
        return new u[]{F("sourceRef", fVar.f1609i.f1589k.b((b.j.a.c.i0.c) null, Object.class, n.f2185l), 0), F("byteOffset", d2, 1), F("charOffset", d2, 2), F("lineNr", d, 3), F("columnNr", d, 4)};
    }

    public boolean f() {
        return true;
    }

    public Object q(b.j.a.c.g gVar, Object[] objArr) {
        long j2;
        int i2;
        int i3;
        Object obj = objArr[0];
        Number number = objArr[1];
        long longValue = number == null ? 0 : number.longValue();
        Number number2 = objArr[2];
        if (number2 == null) {
            j2 = 0;
        } else {
            j2 = number2.longValue();
        }
        Number number3 = objArr[3];
        if (number3 == null) {
            i2 = 0;
        } else {
            i2 = number3.intValue();
        }
        Number number4 = objArr[4];
        if (number4 == null) {
            i3 = 0;
        } else {
            i3 = number4.intValue();
        }
        return new g(obj, longValue, j2, i2, i3);
    }
}
