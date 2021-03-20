package b.h.a.s;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class e {
    public static final Executor a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f1012b = new b();

    public class a implements Executor {

        /* renamed from: h  reason: collision with root package name */
        public final Handler f1013h = new Handler(Looper.getMainLooper());

        public void execute(@NonNull Runnable runnable) {
            this.f1013h.post(runnable);
        }
    }

    public class b implements Executor {
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }
}
