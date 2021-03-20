package b.l.a.c.c.p.g;

import android.os.Process;

public final class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f2826h;

    public c(Runnable runnable, int i2) {
        this.f2826h = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f2826h.run();
    }
}
