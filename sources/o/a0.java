package o;

import e.x.c.i;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class a0 {
    public static final a0 d = new a();
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public long f10441b;
    public long c;

    public static final class a extends a0 {
        public a0 d(long j2) {
            return this;
        }

        public void f() {
        }

        public a0 g(long j2, TimeUnit timeUnit) {
            i.e(timeUnit, "unit");
            return this;
        }
    }

    public a0 a() {
        this.a = false;
        return this;
    }

    public a0 b() {
        this.c = 0;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.f10441b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public a0 d(long j2) {
        this.a = true;
        this.f10441b = j2;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.f10441b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public a0 g(long j2, TimeUnit timeUnit) {
        i.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(b.e.a.a.a.j("timeout < 0: ", j2).toString());
    }
}
