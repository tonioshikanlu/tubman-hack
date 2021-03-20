package b.l.a.c.i.b;

import b.l.a.c.c.p.c;
import java.util.Objects;

public final class j8 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f4084h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ q8 f4085i;

    public j8(q8 q8Var, long j2) {
        this.f4085i = q8Var;
        this.f4084h = j2;
    }

    public final void run() {
        q8 q8Var = this.f4085i;
        long j2 = this.f4084h;
        q8Var.h();
        q8Var.l();
        q8Var.a.a().f4096n.b("Activity paused, time", Long.valueOf(j2));
        m8 m8Var = q8Var.f;
        Objects.requireNonNull((c) m8Var.f4160b.a.f4121n);
        l8 l8Var = new l8(m8Var, System.currentTimeMillis(), j2);
        m8Var.a = l8Var;
        m8Var.f4160b.c.postDelayed(l8Var, 2000);
        if (q8Var.a.f4114g.w()) {
            q8Var.f4237e.c.c();
        }
        p8 p8Var = q8Var.d;
        if (!p8Var.a.a.f4114g.r((String) null, x2.u0)) {
            p8Var.a.a.q().v.b(true);
        }
    }
}
