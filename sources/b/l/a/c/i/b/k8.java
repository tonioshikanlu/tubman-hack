package b.l.a.c.i.b;

import android.os.Bundle;

public final /* synthetic */ class k8 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final l8 f4106h;

    public k8(l8 l8Var) {
        this.f4106h = l8Var;
    }

    public final void run() {
        l8 l8Var = this.f4106h;
        m8 m8Var = l8Var.f4132j;
        long j2 = l8Var.f4130h;
        long j3 = l8Var.f4131i;
        m8Var.f4160b.h();
        m8Var.f4160b.a.a().f4095m.a("Application going to the background");
        boolean z = true;
        if (m8Var.f4160b.a.f4114g.r((String) null, x2.u0)) {
            m8Var.f4160b.a.q().v.b(true);
        }
        Bundle bundle = new Bundle();
        if (!m8Var.f4160b.a.f4114g.w()) {
            m8Var.f4160b.f4237e.c.c();
            if (m8Var.f4160b.a.f4114g.r((String) null, x2.l0)) {
                o8 o8Var = m8Var.f4160b.f4237e;
                long j4 = o8Var.f4203b;
                o8Var.f4203b = j3;
                bundle.putLong("_et", j3 - j4);
                b7.r(m8Var.f4160b.a.y().p(true), bundle, true);
            } else {
                z = false;
            }
            m8Var.f4160b.f4237e.a(false, z, j3);
        }
        m8Var.f4160b.a.s().B("auto", "_ab", j2, bundle);
    }
}
