package b.l.d.o.e0;

import android.os.Handler;
import android.os.Looper;
import b.l.a.c.f.e.f9;
import java.util.concurrent.Executor;

public final class v implements Executor {

    /* renamed from: i  reason: collision with root package name */
    public static final v f4998i = new v();

    /* renamed from: h  reason: collision with root package name */
    public final Handler f4999h = new f9(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f4999h.post(runnable);
    }
}
