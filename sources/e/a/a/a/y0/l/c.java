package e.a.a.a.y0.l;

import e.x.c.i;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class c implements k {

    /* renamed from: b  reason: collision with root package name */
    public final Lock f9622b;

    public c(Lock lock, int i2) {
        ReentrantLock reentrantLock = (i2 & 1) != 0 ? new ReentrantLock() : null;
        i.e(reentrantLock, "lock");
        this.f9622b = reentrantLock;
    }

    public void lock() {
        this.f9622b.lock();
    }

    public void unlock() {
        this.f9622b.unlock();
    }
}
