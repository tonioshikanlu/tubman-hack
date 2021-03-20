package n.m0.g;

import e.x.c.i;
import java.io.IOException;
import java.util.Objects;
import n.a0;
import n.c0;
import n.e0;
import n.h0;
import n.m0.h.g;

public final class a implements a0 {
    public static final a a = new a();

    public h0 a(a0.a aVar) {
        i.e(aVar, "chain");
        g gVar = (g) aVar;
        e eVar = gVar.f10232b;
        Objects.requireNonNull(eVar);
        i.e(gVar, "chain");
        synchronized (eVar) {
            if (!eVar.s) {
                throw new IllegalStateException("released".toString());
            } else if (!(!eVar.r)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!(!eVar.f10195q)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        d dVar = eVar.f10191m;
        i.c(dVar);
        c0 c0Var = eVar.w;
        i.e(c0Var, "client");
        i.e(gVar, "chain");
        try {
            c cVar = new c(eVar, eVar.f10187i, dVar, dVar.a(gVar.f10234g, gVar.f10235h, gVar.f10236i, 0, c0Var.f10055m, !i.a(gVar.f.c, "GET")).k(c0Var, gVar));
            eVar.f10194p = cVar;
            eVar.u = cVar;
            synchronized (eVar) {
                eVar.f10195q = true;
                eVar.r = true;
            }
            if (!eVar.t) {
                return g.b(gVar, 0, cVar, (e0) null, 0, 0, 0, 61).c(gVar.f);
            }
            throw new IOException("Canceled");
        } catch (l e2) {
            dVar.c(e2.f10220h);
            throw e2;
        } catch (IOException e3) {
            dVar.c(e3);
            throw new l(e3);
        }
    }
}
