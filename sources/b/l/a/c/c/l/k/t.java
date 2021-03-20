package b.l.a.c.c.l.k;

import android.os.Bundle;
import android.os.DeadObjectException;
import b.l.a.c.c.b;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.h;
import b.l.a.c.c.m.u;
import com.google.android.gms.common.api.Status;

public final class t implements m0 {
    public final p0 a;

    public t(p0 p0Var) {
        this.a = p0Var;
    }

    public final void a() {
    }

    public final boolean b() {
        j0 j0Var = this.a.f2701m;
        j0Var.f2674b.lock();
        j0Var.f2674b.unlock();
        this.a.f((b) null);
        return true;
    }

    public final void c() {
    }

    public final <A extends a.b, T extends d<? extends h, A>> T d(T t) {
        try {
            o1 o1Var = this.a.f2701m.w;
            o1Var.a.add(t);
            t.f7269g.set(o1Var.f2690b);
            j0 j0Var = this.a.f2701m;
            a.f fVar = j0Var.f2684o.get(t.f2624o);
            b.l.a.c.b.a.B(fVar, "Appropriate Api was not requested.");
            if (fVar.a() || !this.a.f2695g.containsKey(t.f2624o)) {
                if (fVar instanceof u) {
                    u uVar = (u) fVar;
                    fVar = null;
                }
                t.k(fVar);
                return t;
            }
            t.l(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            p0 p0Var = this.a;
            p0Var.f2694e.sendMessage(p0Var.f2694e.obtainMessage(1, new v(this, this)));
        }
    }

    public final void g(int i2) {
        this.a.f((b) null);
        this.a.f2702n.c(i2, false);
    }

    public final void k(Bundle bundle) {
    }

    public final void o(b bVar, a<?> aVar, boolean z) {
    }
}
