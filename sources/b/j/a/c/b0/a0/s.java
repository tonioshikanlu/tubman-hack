package b.j.a.c.b0.a0;

import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.g;

public class s extends z<Object> {

    /* renamed from: k  reason: collision with root package name */
    public static final s f1720k = new s();

    public s() {
        super((Class<?>) Object.class);
    }

    public Object d(i iVar, g gVar) {
        if (iVar.L0(l.FIELD_NAME)) {
            while (true) {
                l T0 = iVar.T0();
                if (T0 == null || T0 == l.END_OBJECT) {
                    return null;
                }
                iVar.a1();
            }
        } else {
            iVar.a1();
            return null;
        }
    }

    public Object f(i iVar, g gVar, c cVar) {
        int k0 = iVar.k0();
        if (k0 == 1 || k0 == 3 || k0 == 5) {
            return cVar.b(iVar, gVar);
        }
        return null;
    }

    public Boolean n(f fVar) {
        return Boolean.FALSE;
    }
}
