package b.p.b.a0;

import java.util.concurrent.ThreadFactory;

public final class h implements ThreadFactory {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6480b;

    public h(String str, boolean z) {
        this.a = str;
        this.f6480b = z;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(this.f6480b);
        return thread;
    }
}
