package b.l.d.u;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class c implements ThreadFactory {
    public static final c a = new c();

    public Thread newThread(Runnable runnable) {
        int i2 = d.f5294b;
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
