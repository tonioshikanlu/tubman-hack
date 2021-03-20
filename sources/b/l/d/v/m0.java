package b.l.d.v;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class m0 implements ThreadFactory {
    public static final ThreadFactory a = new m0();

    public final Thread newThread(Runnable runnable) {
        int i2 = j0.a;
        return new Thread(runnable, "firebase-iid-executor");
    }
}
