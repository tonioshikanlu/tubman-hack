package b.l.a.c.i.b;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;

public final class q8 extends a4 {
    public Handler c;
    public final p8 d = new p8(this);

    /* renamed from: e  reason: collision with root package name */
    public final o8 f4237e = new o8(this);
    public final m8 f = new m8(this);

    public q8(l4 l4Var) {
        super(l4Var);
    }

    public final boolean k() {
        return false;
    }

    @WorkerThread
    public final void l() {
        h();
        if (this.c == null) {
            this.c = new b.l.a.c.f.i.q8(Looper.getMainLooper());
        }
    }
}
