package b.l.a.c.k;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class j {
    public static final Executor a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f4426b = new d0();

    public static final class a implements Executor {

        /* renamed from: h  reason: collision with root package name */
        public final Handler f4427h = new Handler(Looper.getMainLooper());

        public final void execute(@NonNull Runnable runnable) {
            this.f4427h.post(runnable);
        }
    }
}
