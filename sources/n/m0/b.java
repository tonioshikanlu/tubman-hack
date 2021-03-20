package n.m0;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10149b;

    public b(String str, boolean z) {
        this.a = str;
        this.f10149b = z;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(this.f10149b);
        return thread;
    }
}
