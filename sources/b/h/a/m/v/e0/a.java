package b.h.a.m.v.e0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class a implements ExecutorService {

    /* renamed from: i  reason: collision with root package name */
    public static final long f671i = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: j  reason: collision with root package name */
    public static volatile int f672j;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f673h;

    /* renamed from: b.h.a.m.v.e0.a$a  reason: collision with other inner class name */
    public static final class C0024a implements ThreadFactory {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f674b;
        public int c;

        /* renamed from: b.h.a.m.v.e0.a$a$a  reason: collision with other inner class name */
        public class C0025a extends Thread {
            public C0025a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C0024a.this.f674b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    Objects.requireNonNull(C0024a.this);
                    ((b.C0026a) b.f676b).a(th);
                }
            }
        }

        public C0024a(String str, b bVar, boolean z) {
            this.a = str;
            this.f674b = z;
        }

        public synchronized Thread newThread(@NonNull Runnable runnable) {
            C0025a aVar;
            aVar = new C0025a(runnable, "glide-" + this.a + "-thread-" + this.c);
            this.c = this.c + 1;
            return aVar;
        }
    }

    public interface b {
        public static final b a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f676b;

        /* renamed from: b.h.a.m.v.e0.a$b$a  reason: collision with other inner class name */
        public class C0026a implements b {
            public void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C0026a aVar = new C0026a();
            a = aVar;
            f676b = aVar;
        }
    }

    @VisibleForTesting
    public a(ExecutorService executorService) {
        this.f673h = executorService;
    }

    public static int a() {
        if (f672j == 0) {
            f672j = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f672j;
    }

    public boolean awaitTermination(long j2, @NonNull TimeUnit timeUnit) {
        return this.f673h.awaitTermination(j2, timeUnit);
    }

    public void execute(@NonNull Runnable runnable) {
        this.f673h.execute(runnable);
    }

    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) {
        return this.f673h.invokeAll(collection);
    }

    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j2, @NonNull TimeUnit timeUnit) {
        return this.f673h.invokeAll(collection, j2, timeUnit);
    }

    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) {
        return this.f673h.invokeAny(collection);
    }

    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j2, @NonNull TimeUnit timeUnit) {
        return this.f673h.invokeAny(collection, j2, timeUnit);
    }

    public boolean isShutdown() {
        return this.f673h.isShutdown();
    }

    public boolean isTerminated() {
        return this.f673h.isTerminated();
    }

    public void shutdown() {
        this.f673h.shutdown();
    }

    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f673h.shutdownNow();
    }

    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f673h.submit(runnable);
    }

    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f673h.submit(runnable, t);
    }

    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f673h.submit(callable);
    }

    public String toString() {
        return this.f673h.toString();
    }
}
