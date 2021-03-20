package b.l.d.q.f.g;

import b.l.a.c.k.a;
import b.l.a.c.k.h;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final /* synthetic */ class n0 implements a {
    public final CountDownLatch a;

    public n0(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public Object a(h hVar) {
        CountDownLatch countDownLatch = this.a;
        ExecutorService executorService = q0.a;
        countDownLatch.countDown();
        return null;
    }
}
