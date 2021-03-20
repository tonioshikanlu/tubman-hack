package b.l.d.q.f.g;

import android.util.Log;
import b.l.d.q.f.b;
import b.l.d.q.f.m.f;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

public class a0 implements Thread.UncaughtExceptionHandler {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5059b;
    public final Thread.UncaughtExceptionHandler c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public interface a {
    }

    public a0(a aVar, f fVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = aVar;
        this.f5059b = fVar;
        this.c = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str;
        b bVar = b.a;
        this.d.set(true);
        if (thread == null) {
            str = "Could not handle uncaught exception; null thread";
        } else if (th == null) {
            str = "Could not handle uncaught exception; null throwable";
        } else {
            ((k) this.a).a(this.f5059b, thread, th);
            bVar.b("Crashlytics completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.d.set(false);
        }
        try {
            bVar.d(str);
        } catch (Exception e2) {
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e2);
            }
        } catch (Throwable th2) {
            bVar.b("Crashlytics completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.d.set(false);
            throw th2;
        }
        bVar.b("Crashlytics completed exception processing. Invoking default exception handler.");
        this.c.uncaughtException(thread, th);
        this.d.set(false);
    }
}
