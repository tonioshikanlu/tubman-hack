package b.l.a.c.i.b;

import android.os.Handler;
import b.l.a.c.c.p.c;
import b.l.a.c.f.i.q8;
import java.util.Objects;

public abstract class l {
    public static volatile Handler d;
    public final h5 a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f4110b;
    public volatile long c;

    public l(h5 h5Var) {
        Objects.requireNonNull(h5Var, "null reference");
        this.a = h5Var;
        this.f4110b = new k(this, h5Var);
    }

    public abstract void a();

    public final void b(long j2) {
        c();
        if (j2 >= 0) {
            Objects.requireNonNull((c) this.a.c());
            this.c = System.currentTimeMillis();
            if (!d().postDelayed(this.f4110b, j2)) {
                this.a.a().f.b("Failed to schedule delayed post. time", Long.valueOf(j2));
            }
        }
    }

    public final void c() {
        this.c = 0;
        d().removeCallbacks(this.f4110b);
    }

    public final Handler d() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (l.class) {
            if (d == null) {
                d = new q8(this.a.f().getMainLooper());
            }
            handler = d;
        }
        return handler;
    }
}
