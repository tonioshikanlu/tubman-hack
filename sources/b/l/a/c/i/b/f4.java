package b.l.a.c.i.b;

import java.lang.Thread;

public final class f4 implements Thread.UncaughtExceptionHandler {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i4 f4001b;

    public f4(i4 i4Var, String str) {
        this.f4001b = i4Var;
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f4001b.a.a().f.b(this.a, th);
    }
}
