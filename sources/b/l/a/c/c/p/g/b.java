package b.l.a.c.c.p.g;

import b.l.a.c.b.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b implements ThreadFactory {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f2825b = new AtomicInteger();
    public final ThreadFactory c = Executors.defaultThreadFactory();

    public b(String str) {
        a.B(str, "Name must not be null");
        this.a = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new c(runnable, 0));
        String str = this.a;
        int andIncrement = this.f2825b.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
