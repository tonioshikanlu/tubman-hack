package e.a.a.a.y0.e.z;

import b.q.a.a;
import e.a.a.a.y0.e.q;
import e.a.a.a.y0.e.t;
import e.a.a.a.y0.h.v;
import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class e {
    public final List<q> a;

    public e(t tVar) {
        i.e(tVar, "typeTable");
        List<q> list = tVar.f9108j;
        int i2 = 0;
        if ((tVar.f9107i & 1) == 1) {
            int i3 = tVar.f9109k;
            i.d(list, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(a.C(list, 10));
            for (T next : list) {
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    q qVar = (q) next;
                    if (i2 >= i3) {
                        Objects.requireNonNull(qVar);
                        q.c z = q.z(qVar);
                        z.f9060k |= 2;
                        z.f9062m = true;
                        qVar = z.l();
                        if (!qVar.g()) {
                            throw new v();
                        }
                    }
                    arrayList.add(qVar);
                    i2 = i4;
                } else {
                    g.S();
                    throw null;
                }
            }
            list = arrayList;
        }
        i.d(list, "run {\n        val origin… else originalTypes\n    }");
        this.a = list;
    }

    public final q a(int i2) {
        return this.a.get(i2);
    }
}
