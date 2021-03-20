package b.l.a.c.c.p.g;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class a implements ThreadFactory {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f2824b = Executors.defaultThreadFactory();

    public a(String str) {
        b.l.a.c.b.a.B(str, "Name must not be null");
        this.a = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f2824b.newThread(new c(runnable, 0));
        newThread.setName(this.a);
        return newThread;
    }
}
