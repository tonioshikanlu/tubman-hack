package g.a;

import b.q.a.a;
import e.a.a.a.y0.m.o1.c;
import e.k;
import e.r;
import e.v.d;
import e.v.f;
import e.x.c.i;
import g.a.u1.h;
import java.util.concurrent.CancellationException;

public abstract class h0<T> extends h {

    /* renamed from: j  reason: collision with root package name */
    public int f9954j;

    public h0(int i2) {
        this.f9954j = i2;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract d<T> b();

    public Throwable d(Object obj) {
        if (!(obj instanceof r)) {
            obj = null;
        }
        r rVar = (r) obj;
        if (rVar != null) {
            return rVar.a;
        }
        return null;
    }

    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                a.k(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            i.c(th);
            c.H(b().getContext(), new b0("Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object g();

    public final void run() {
        f context;
        Object b2;
        Object Z;
        Object obj = r.a;
        g.a.u1.i iVar = this.f10028i;
        try {
            d b3 = b();
            if (b3 != null) {
                g.a.a.f fVar = (g.a.a.f) b3;
                d<T> dVar = fVar.f9906o;
                context = dVar.getContext();
                Object g2 = g();
                b2 = g.a.a.a.b(context, fVar.f9904m);
                Throwable d = d(g2);
                y0 y0Var = (d != null || !c.M(this.f9954j)) ? null : (y0) context.get(y0.f10039g);
                if (y0Var == null || y0Var.b()) {
                    Z = d != null ? a.Z(d) : e(g2);
                } else {
                    CancellationException S = y0Var.S();
                    a(g2, S);
                    Z = a.Z(S);
                }
                dVar.c(Z);
                g.a.a.a.a(context, b2);
                try {
                    iVar.H();
                } catch (Throwable th) {
                    obj = a.Z(th);
                }
                f((Throwable) null, k.a(obj));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
        } catch (Throwable th2) {
            try {
                iVar.H();
            } catch (Throwable th3) {
                obj = a.Z(th3);
            }
            f(th2, k.a(obj));
        }
    }
}
