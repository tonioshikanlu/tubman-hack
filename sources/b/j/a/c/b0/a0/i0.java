package b.j.a.c.b0.a0;

import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.c.g;
import b.j.a.c.j0.z;
import b.j.a.c.z.a;

@a
public class i0 extends c0<z> {
    public i0() {
        super((Class<?>) z.class);
    }

    public Object d(i iVar, g gVar) {
        l T0;
        z zVar = new z(iVar, (g) null);
        if (iVar.k0() != l.FIELD_NAME.f1441k) {
            zVar.g1(iVar);
        } else {
            zVar.N0();
            do {
                zVar.g1(iVar);
                T0 = iVar.T0();
            } while (T0 == l.FIELD_NAME);
            l lVar = l.END_OBJECT;
            if (T0 == lVar) {
                zVar.r0();
            } else {
                String b2 = gVar.b("Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + T0, new Object[0]);
                throw gVar.f0(gVar.f1996m, z.class, lVar, b2);
            }
        }
        return zVar;
    }
}
