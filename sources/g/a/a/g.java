package g.a.a;

import b.q.a.a;
import e.a.a.a.y0.m.o1.c;
import e.r;
import e.v.d;
import e.v.f;
import e.x.b.l;
import g.a.m0;
import g.a.p1;
import g.a.s;
import g.a.y0;
import java.util.concurrent.CancellationException;

public final class g {
    public static final q a = new q("UNDEFINED");

    /* renamed from: b  reason: collision with root package name */
    public static final q f9907b = new q("REUSABLE_CLAIMED");

    public static final <T> void a(d<? super T> dVar, Object obj, l<? super Throwable, r> lVar) {
        boolean z;
        f context;
        Object b2;
        if (dVar instanceof f) {
            f fVar = (f) dVar;
            Object s0 = c.s0(obj, lVar);
            if (fVar.f9905n.n0(fVar.getContext())) {
                fVar.f9902k = s0;
                fVar.f9954j = 1;
                fVar.f9905n.m0(fVar.getContext(), fVar);
                return;
            }
            p1 p1Var = p1.f9975b;
            m0 a2 = p1.a();
            if (a2.s0()) {
                fVar.f9902k = s0;
                fVar.f9954j = 1;
                a2.q0(fVar);
                return;
            }
            a2.r0(true);
            try {
                y0 y0Var = (y0) fVar.getContext().get(y0.f10039g);
                if (y0Var == null || y0Var.b()) {
                    z = false;
                } else {
                    CancellationException S = y0Var.S();
                    if (s0 instanceof s) {
                        ((s) s0).f9981b.invoke(S);
                    }
                    fVar.c(a.Z(S));
                    z = true;
                }
                if (!z) {
                    context = fVar.getContext();
                    b2 = a.b(context, fVar.f9904m);
                    fVar.f9906o.c(obj);
                    a.a(context, b2);
                }
                do {
                } while (a2.t0());
            } catch (Throwable th) {
                try {
                    fVar.f(th, (Throwable) null);
                } catch (Throwable th2) {
                    a2.o0(true);
                    throw th2;
                }
            }
            a2.o0(true);
            return;
        }
        dVar.c(obj);
    }

    public static /* synthetic */ void b(d dVar, Object obj, l lVar, int i2) {
        int i3 = i2 & 2;
        a(dVar, obj, (l<? super Throwable, r>) null);
    }
}
