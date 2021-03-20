package b.j.a.c.b0.a0;

import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.z.a;

@a
public class g0 extends c0<String> {

    /* renamed from: k  reason: collision with root package name */
    public static final g0 f1672k = new g0();

    public g0() {
        super((Class<?>) String.class);
    }

    /* renamed from: c0 */
    public String d(i iVar, g gVar) {
        String H0;
        if (iVar.L0(l.VALUE_STRING)) {
            return iVar.x0();
        }
        l g0 = iVar.g0();
        if (g0 == l.START_ARRAY) {
            return (String) v(iVar, gVar);
        }
        if (g0 == l.VALUE_EMBEDDED_OBJECT) {
            Object o0 = iVar.o0();
            if (o0 == null) {
                return null;
            }
            return o0 instanceof byte[] ? gVar.z().f((byte[]) o0, false) : o0.toString();
        } else if (g0.f1445o && (H0 = iVar.H0()) != null) {
            return H0;
        } else {
            gVar.G(this.f1761h, iVar);
            throw null;
        }
    }

    public Object f(i iVar, g gVar, c cVar) {
        return d(iVar, gVar);
    }

    public Object i(g gVar) {
        return "";
    }

    public boolean m() {
        return true;
    }
}
