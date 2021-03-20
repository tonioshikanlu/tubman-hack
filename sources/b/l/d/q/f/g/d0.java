package b.l.d.q.f.g;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class d0 implements ThreadFactory {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f5071b;

    public class a extends c {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Runnable f5072h;

        public a(d0 d0Var, Runnable runnable) {
            this.f5072h = runnable;
        }

        public void a() {
            this.f5072h.run();
        }
    }

    public d0(String str, AtomicLong atomicLong) {
        this.a = str;
        this.f5071b = atomicLong;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(this, runnable));
        newThread.setName(this.a + this.f5071b.getAndIncrement());
        return newThread;
    }
}
