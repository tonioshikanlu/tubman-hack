package b.l.a.c.k;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class t<TResult> implements b0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4440b = new Object();
    public c<TResult> c;

    public t(@NonNull Executor executor, @NonNull c<TResult> cVar) {
        this.a = executor;
        this.c = cVar;
    }

    public final void c(@NonNull h<TResult> hVar) {
        synchronized (this.f4440b) {
            if (this.c != null) {
                this.a.execute(new u(this, hVar));
            }
        }
    }

    public final void cancel() {
        synchronized (this.f4440b) {
            this.c = null;
        }
    }
}
