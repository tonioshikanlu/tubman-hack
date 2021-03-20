package e.a.a.a.y0.m;

import e.a.a.a.y0.m.n1.f;
import e.a.a.a.y0.m.n1.g;
import e.a.a.a.y0.m.n1.h;
import e.a.a.a.y0.m.n1.j;
import e.a.a.a.y0.m.n1.m;

public final class d {
    public static final boolean a(m mVar, h hVar, h hVar2) {
        if (mVar.c(hVar) == mVar.c(hVar2) && mVar.f(hVar) == mVar.f(hVar2)) {
            if ((mVar.v(hVar) == null) == (mVar.v(hVar2) == null) && mVar.b(mVar.d(hVar), mVar.d(hVar2))) {
                if (mVar.w(hVar, hVar2)) {
                    return true;
                }
                int c = mVar.c(hVar);
                for (int i2 = 0; i2 < c; i2++) {
                    j m2 = mVar.m(hVar, i2);
                    j m3 = mVar.m(hVar2, i2);
                    if (mVar.t(m2) != mVar.t(m3)) {
                        return false;
                    }
                    if (!mVar.t(m2) && (mVar.p(m2) != mVar.p(m3) || !b(mVar, mVar.x(m2), mVar.x(m3)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean b(m mVar, g gVar, g gVar2) {
        if (gVar == gVar2) {
            return true;
        }
        h a = mVar.a(gVar);
        h a2 = mVar.a(gVar2);
        if (a != null && a2 != null) {
            return a(mVar, a, a2);
        }
        f u = mVar.u(gVar);
        f u2 = mVar.u(gVar2);
        if (u == null || u2 == null) {
            return false;
        }
        return a(mVar, mVar.A(u), mVar.A(u2)) && a(mVar, mVar.k(u), mVar.k(u2));
    }
}
