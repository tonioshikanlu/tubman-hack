package b.l.a.d.a.b;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class e2 implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadFactory f4530b = new e2();
    public static final ThreadFactory c = new e2((byte[]) null);
    public final /* synthetic */ int a = 0;

    public e2() {
    }

    public e2(byte[] bArr) {
    }

    public final Thread newThread(Runnable runnable) {
        return this.a != 0 ? new Thread(runnable, "AssetPackBackgroundExecutor") : new Thread(runnable, "UpdateListenerExecutor");
    }
}
