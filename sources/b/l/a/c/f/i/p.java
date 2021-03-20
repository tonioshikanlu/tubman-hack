package b.l.a.c.f.i;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class p implements ThreadFactory {
    public final ThreadFactory a = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
