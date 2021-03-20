package b.l.a.c.c.l.k;

import android.os.Bundle;
import b.l.a.c.c.b;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.h;
import java.util.Collections;

public final class g0 implements m0 {
    public final p0 a;

    public g0(p0 p0Var) {
        this.a = p0Var;
    }

    public final void a() {
        for (a.f b2 : this.a.f.values()) {
            b2.b();
        }
        this.a.f2701m.f2685p = Collections.emptySet();
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
        p0 p0Var = this.a;
        p0Var.a.lock();
        try {
            p0Var.f2699k = new x(p0Var, p0Var.f2696h, p0Var.f2697i, p0Var.d, p0Var.f2698j, p0Var.a, p0Var.c);
            p0Var.f2699k.a();
            p0Var.f2693b.signalAll();
        } finally {
            p0Var.a.unlock();
        }
    }

    public final <A extends a.b, T extends d<? extends h, A>> T d(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void g(int i2) {
    }

    public final void k(Bundle bundle) {
    }

    public final void o(b bVar, a<?> aVar, boolean z) {
    }
}
