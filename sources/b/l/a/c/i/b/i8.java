package b.l.a.c.i.b;

import b.l.a.c.c.p.c;
import java.util.Objects;

public final class i8 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f4063h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ q8 f4064i;

    public i8(q8 q8Var, long j2) {
        this.f4064i = q8Var;
        this.f4063h = j2;
    }

    public final void run() {
        q8 q8Var = this.f4064i;
        long j2 = this.f4063h;
        q8Var.h();
        q8Var.l();
        q8Var.a.a().f4096n.b("Activity resumed, time", Long.valueOf(j2));
        f fVar = q8Var.a.f4114g;
        w2<Boolean> w2Var = x2.u0;
        if (fVar.r((String) null, w2Var)) {
            if (q8Var.a.f4114g.w() || q8Var.a.q().v.a()) {
                o8 o8Var = q8Var.f4237e;
                o8Var.d.h();
                o8Var.c.c();
                o8Var.a = j2;
                o8Var.f4203b = j2;
            }
            q8Var.f.a();
        } else {
            q8Var.f.a();
            if (q8Var.a.f4114g.w()) {
                o8 o8Var2 = q8Var.f4237e;
                o8Var2.d.h();
                o8Var2.c.c();
                o8Var2.a = j2;
                o8Var2.f4203b = j2;
            }
        }
        p8 p8Var = q8Var.d;
        p8Var.a.h();
        if (p8Var.a.a.j()) {
            if (!p8Var.a.a.f4114g.r((String) null, w2Var)) {
                p8Var.a.a.q().v.b(false);
            }
            Objects.requireNonNull((c) p8Var.a.a.f4121n);
            p8Var.b(System.currentTimeMillis(), false);
        }
    }
}
