package b.j.a.c.f0.g;

import b.e.a.a.a;
import b.j.a.a.c0;
import b.j.a.b.l;
import b.j.a.b.m;
import b.j.a.c.d;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.i;
import b.j.a.c.j;
import b.j.a.c.j0.z;
import java.io.Serializable;

public class h extends o implements Serializable {
    public h(h hVar, d dVar) {
        super(hVar, dVar);
    }

    public h(i iVar, b.j.a.c.f0.d dVar, String str, boolean z, i iVar2) {
        super(iVar, dVar, str, z, iVar2);
    }

    public Object b(b.j.a.b.i iVar, g gVar) {
        return o(iVar, gVar);
    }

    public Object c(b.j.a.b.i iVar, g gVar) {
        return o(iVar, gVar);
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        return o(iVar, gVar);
    }

    public Object e(b.j.a.b.i iVar, g gVar) {
        return o(iVar, gVar);
    }

    public c f(d dVar) {
        return dVar == this.f1982j ? this : new h(this, dVar);
    }

    public c0.a j() {
        return c0.a.WRAPPER_OBJECT;
    }

    public Object o(b.j.a.b.i iVar, g gVar) {
        Object C0;
        if (iVar.e() && (C0 = iVar.C0()) != null) {
            return k(iVar, gVar, C0);
        }
        l g0 = iVar.g0();
        l lVar = l.START_OBJECT;
        if (g0 == lVar) {
            l T0 = iVar.T0();
            l lVar2 = l.FIELD_NAME;
            if (T0 != lVar2) {
                i iVar2 = this.f1981i;
                StringBuilder y = a.y("need JSON String that contains type id (for subtype of ");
                y.append(n());
                y.append(")");
                gVar.a0(iVar2, lVar2, y.toString(), new Object[0]);
                throw null;
            }
        } else if (g0 != l.FIELD_NAME) {
            i iVar3 = this.f1981i;
            StringBuilder y2 = a.y("need JSON Object to contain As.WRAPPER_OBJECT type information for class ");
            y2.append(n());
            gVar.a0(iVar3, lVar, y2.toString(), new Object[0]);
            throw null;
        }
        String x0 = iVar.x0();
        j<Object> m2 = m(gVar, x0);
        iVar.T0();
        b.j.a.b.w.i iVar4 = iVar;
        if (this.f1985m) {
            l g02 = iVar.g0();
            iVar4 = iVar;
            if (g02 == lVar) {
                z zVar = new z((m) null, false);
                zVar.N0();
                zVar.t0(this.f1984l);
                zVar.Q0(x0);
                iVar.q();
                b.j.a.b.w.i c1 = b.j.a.b.w.i.c1(false, zVar.e1(iVar), iVar);
                c1.T0();
                iVar4 = c1;
            }
        }
        Object d = m2.d(iVar4, gVar);
        l T02 = iVar4.T0();
        l lVar3 = l.END_OBJECT;
        if (T02 == lVar3) {
            return d;
        }
        gVar.a0(this.f1981i, lVar3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        throw null;
    }
}
