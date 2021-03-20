package b.l.a.d.a.i;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class q implements Executor {

    /* renamed from: h  reason: collision with root package name */
    public final Handler f4700h = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f4700h.post(runnable);
    }
}
