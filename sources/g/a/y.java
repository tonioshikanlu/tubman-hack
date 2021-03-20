package g.a;

import b.q.a.a;
import e.a.a.a.y0.m.o1.c;
import e.b0.s;
import e.v.f;
import java.lang.Thread;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class y {
    public static final List<CoroutineExceptionHandler> a = s.j(c.i(a.a()));

    public static final void a(f fVar, Throwable th) {
        Throwable th2;
        for (CoroutineExceptionHandler handleException : a) {
            try {
                handleException.handleException(fVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    a.k(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
