package b.l.a.c.i.b;

import androidx.annotation.WorkerThread;

public final class m8 {
    public l8 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q8 f4160b;

    public m8(q8 q8Var) {
        this.f4160b = q8Var;
    }

    @WorkerThread
    public final void a() {
        this.f4160b.h();
        l8 l8Var = this.a;
        if (l8Var != null) {
            this.f4160b.c.removeCallbacks(l8Var);
        }
        if (this.f4160b.a.f4114g.r((String) null, x2.u0)) {
            this.f4160b.a.q().v.b(false);
        }
    }
}
