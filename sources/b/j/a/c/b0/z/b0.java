package b.j.a.c.b0.z;

import b.j.a.b.i;
import b.j.a.c.b0.u;
import b.j.a.c.g;
import b.j.a.c.j0.z;
import java.util.ArrayList;
import java.util.List;

public class b0 {
    public final List<u> a;

    public b0() {
        this.a = new ArrayList();
    }

    public b0(List<u> list) {
        this.a = list;
    }

    public Object a(g gVar, Object obj, z zVar) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            i d1 = zVar.d1();
            d1.T0();
            this.a.get(i2).f(d1, gVar, obj);
        }
        return obj;
    }
}
