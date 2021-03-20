package b.l.d.q.f.g;

import android.os.Looper;
import b.l.a.c.b.a;
import b.l.a.c.k.h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class q0 {
    public static final ExecutorService a = a.g("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T a(h<T> hVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hVar.g(a, new n0(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (hVar.n()) {
            return hVar.j();
        }
        if (hVar.l()) {
            throw new CancellationException("Task is already canceled");
        } else if (hVar.m()) {
            throw new IllegalStateException(hVar.i());
        } else {
            throw new TimeoutException();
        }
    }
}
