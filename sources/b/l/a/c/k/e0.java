package b.l.a.c.k;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.c.l.k.h;
import b.l.a.c.c.l.k.i;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class e0<TResult> extends h<TResult> {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final c0<TResult> f4421b = new c0<>();
    public boolean c;
    public volatile boolean d;

    /* renamed from: e  reason: collision with root package name */
    public TResult f4422e;
    public Exception f;

    public static class a extends LifecycleCallback {

        /* renamed from: b  reason: collision with root package name */
        public final List<WeakReference<b0<?>>> f4423b = new ArrayList();

        public a(i iVar) {
            super(iVar);
            this.a.a("TaskOnStopCallback", this);
        }

        @MainThread
        public void g() {
            synchronized (this.f4423b) {
                for (WeakReference<b0<?>> weakReference : this.f4423b) {
                    b0 b0Var = (b0) weakReference.get();
                    if (b0Var != null) {
                        b0Var.cancel();
                    }
                }
                this.f4423b.clear();
            }
        }
    }

    @NonNull
    public final h<TResult> a(@NonNull Executor executor, @NonNull b bVar) {
        this.f4421b.b(new r(executor, bVar));
        s();
        return this;
    }

    @NonNull
    public final h<TResult> b(@NonNull Activity activity, @NonNull c<TResult> cVar) {
        t tVar = new t(j.a, cVar);
        this.f4421b.b(tVar);
        i b2 = LifecycleCallback.b(new h(activity));
        a aVar = (a) b2.b("TaskOnStopCallback", a.class);
        if (aVar == null) {
            aVar = new a(b2);
        }
        synchronized (aVar.f4423b) {
            aVar.f4423b.add(new WeakReference(tVar));
        }
        s();
        return this;
    }

    @NonNull
    public final h<TResult> c(@NonNull c<TResult> cVar) {
        this.f4421b.b(new t(j.a, cVar));
        s();
        return this;
    }

    @NonNull
    public final h<TResult> d(@NonNull Executor executor, @NonNull d dVar) {
        this.f4421b.b(new v(executor, dVar));
        s();
        return this;
    }

    @NonNull
    public final h<TResult> e(@NonNull Executor executor, @NonNull e<? super TResult> eVar) {
        this.f4421b.b(new x(executor, eVar));
        s();
        return this;
    }

    @NonNull
    public final <TContinuationResult> h<TContinuationResult> f(@NonNull a<TResult, TContinuationResult> aVar) {
        return g(j.a, aVar);
    }

    @NonNull
    public final <TContinuationResult> h<TContinuationResult> g(@NonNull Executor executor, @NonNull a<TResult, TContinuationResult> aVar) {
        e0 e0Var = new e0();
        this.f4421b.b(new n(executor, aVar, e0Var));
        s();
        return e0Var;
    }

    @NonNull
    public final <TContinuationResult> h<TContinuationResult> h(@NonNull Executor executor, @NonNull a<TResult, h<TContinuationResult>> aVar) {
        e0 e0Var = new e0();
        this.f4421b.b(new p(executor, aVar, e0Var));
        s();
        return e0Var;
    }

    @Nullable
    public final Exception i() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final TResult j() {
        TResult tresult;
        synchronized (this.a) {
            b.l.a.c.b.a.G(this.c, "Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            } else if (this.f == null) {
                tresult = this.f4422e;
            } else {
                throw new f(this.f);
            }
        }
        return tresult;
    }

    public final <X extends Throwable> TResult k(@NonNull Class<X> cls) {
        TResult tresult;
        synchronized (this.a) {
            b.l.a.c.b.a.G(this.c, "Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            } else if (cls.isInstance(this.f)) {
                throw ((Throwable) cls.cast(this.f));
            } else if (this.f == null) {
                tresult = this.f4422e;
            } else {
                throw new f(this.f);
            }
        }
        return tresult;
    }

    public final boolean l() {
        return this.d;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.d && this.f == null;
        }
        return z;
    }

    @NonNull
    public final <TContinuationResult> h<TContinuationResult> o(Executor executor, g<TResult, TContinuationResult> gVar) {
        e0 e0Var = new e0();
        this.f4421b.b(new z(executor, gVar, e0Var));
        s();
        return e0Var;
    }

    public final void p(@NonNull Exception exc) {
        b.l.a.c.b.a.B(exc, "Exception must not be null");
        synchronized (this.a) {
            b.l.a.c.b.a.G(!this.c, "Task is already complete");
            this.c = true;
            this.f = exc;
        }
        this.f4421b.a(this);
    }

    public final void q(TResult tresult) {
        synchronized (this.a) {
            b.l.a.c.b.a.G(!this.c, "Task is already complete");
            this.c = true;
            this.f4422e = tresult;
        }
        this.f4421b.a(this);
    }

    public final boolean r() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.f4421b.a(this);
            return true;
        }
    }

    public final void s() {
        synchronized (this.a) {
            if (this.c) {
                this.f4421b.a(this);
            }
        }
    }
}
