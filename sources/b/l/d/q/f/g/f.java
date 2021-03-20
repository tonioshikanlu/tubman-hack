package b.l.d.q.f.g;

import b.l.a.c.k.h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class f {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public h<Void> f5088b = b.l.a.c.b.a.X(null);
    public final Object c = new Object();
    public final ThreadLocal<Boolean> d = new ThreadLocal<>();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            f.this.d.set(Boolean.TRUE);
        }
    }

    public f(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    public void a() {
        if (!Boolean.TRUE.equals(this.d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public <T> h<T> b(Callable<T> callable) {
        h<TContinuationResult> g2;
        synchronized (this.c) {
            g2 = this.f5088b.g(this.a, new g(this, callable));
            this.f5088b = g2.g(this.a, new h(this));
        }
        return g2;
    }

    public <T> h<T> c(Callable<h<T>> callable) {
        h<TContinuationResult> h2;
        synchronized (this.c) {
            h2 = this.f5088b.h(this.a, new g(this, callable));
            this.f5088b = h2.g(this.a, new h(this));
        }
        return h2;
    }
}
