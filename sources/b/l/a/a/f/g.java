package b.l.a.a.f;

import b.a.a.n.f;
import java.util.concurrent.Executor;

public class g implements Executor {

    /* renamed from: h  reason: collision with root package name */
    public final Executor f2483h;

    public static class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final Runnable f2484h;

        public a(Runnable runnable) {
            this.f2484h = runnable;
        }

        public void run() {
            try {
                this.f2484h.run();
            } catch (Exception e2) {
                f.e("Executor", "Background execution failure.", e2);
            }
        }
    }

    public g(Executor executor) {
        this.f2483h = executor;
    }

    public void execute(Runnable runnable) {
        this.f2483h.execute(new a(runnable));
    }
}
