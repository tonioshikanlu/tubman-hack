package b.l.a.c.f.i;

import android.os.SystemClock;
import b.l.a.c.c.p.c;
import java.util.Objects;

public abstract class v implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final long f3776h = System.currentTimeMillis();

    /* renamed from: i  reason: collision with root package name */
    public final long f3777i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3778j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ f0 f3779k;

    public v(f0 f0Var, boolean z) {
        this.f3779k = f0Var;
        Objects.requireNonNull((c) f0Var.f3547b);
        Objects.requireNonNull((c) f0Var.f3547b);
        this.f3777i = SystemClock.elapsedRealtime();
        this.f3778j = z;
    }

    public abstract void a();

    public void b() {
    }

    public final void run() {
        if (this.f3779k.f3549g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e2) {
            this.f3779k.b(e2, false, this.f3778j);
            b();
        }
    }
}
