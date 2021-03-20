package b.l.d.o.e0;

import b.l.d.o.t;
import b.l.d.o.y;
import java.util.ArrayList;
import java.util.List;

public final class d {
    public final j0 a;

    public d(j0 j0Var) {
        this.a = j0Var;
    }

    public final List<t> a() {
        p pVar = this.a.s;
        if (pVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (y add : pVar.f4994h) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
