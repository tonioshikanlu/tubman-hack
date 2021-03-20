package b.l.a.d.a.i;

import java.util.concurrent.Executor;

public final class r<ResultT> extends r<ResultT> {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final m<ResultT> f4701b = new m<>();
    public boolean c;
    public ResultT d;

    /* renamed from: e  reason: collision with root package name */
    public Exception f4702e;

    public final void a(ResultT resultt) {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.d = resultt;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.f4701b.b(this);
    }

    public final r<ResultT> b(Executor executor, b bVar) {
        this.f4701b.a(new i(executor, bVar));
        e();
        return this;
    }

    public final r<ResultT> c(Executor executor, c<? super ResultT> cVar) {
        this.f4701b.a(new k(executor, cVar));
        e();
        return this;
    }

    public final void d(Exception exc) {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.f4702e = exc;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.f4701b.b(this);
    }

    public final void e() {
        synchronized (this.a) {
            if (this.c) {
                this.f4701b.b(this);
            }
        }
    }

    public final ResultT f() {
        ResultT resultt;
        synchronized (this.a) {
            if (this.c) {
                Exception exc = this.f4702e;
                if (exc == null) {
                    resultt = this.d;
                } else {
                    throw new d(exc);
                }
            } else {
                throw new IllegalStateException("Task is not yet complete");
            }
        }
        return resultt;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.f4702e == null) {
                z = true;
            }
        }
        return z;
    }
}
