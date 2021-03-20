package b.p.b;

import androidx.appcompat.widget.ActivityChooserView;
import b.p.b.a0.h;
import b.p.b.a0.i;
import b.p.b.d;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class k {
    public ExecutorService a;

    /* renamed from: b  reason: collision with root package name */
    public final Deque<d.c> f6721b = new ArrayDeque();
    public final Deque<d.c> c = new ArrayDeque();

    public k() {
        new ArrayDeque();
    }

    public synchronized void a(d.c cVar) {
        if (this.c.remove(cVar)) {
            c();
        } else {
            throw new AssertionError("AsyncCall wasn't running!");
        }
    }

    public synchronized ExecutorService b() {
        if (this.a == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            byte[] bArr = i.a;
            this.a = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, timeUnit, synchronousQueue, new h("OkHttp Dispatcher", false));
        }
        return this.a;
    }

    public final void c() {
        if (this.c.size() < 64 && !this.f6721b.isEmpty()) {
            Iterator<d.c> it = this.f6721b.iterator();
            while (it.hasNext()) {
                d.c next = it.next();
                if (d(next) < 5) {
                    it.remove();
                    this.c.add(next);
                    b().execute(next);
                }
                if (this.c.size() >= 64) {
                    return;
                }
            }
        }
    }

    public final int d(d.c cVar) {
        int i2 = 0;
        for (d.c cVar2 : this.c) {
            if (d.this.c.a.d.equals(d.this.c.a.d)) {
                i2++;
            }
        }
        return i2;
    }
}
