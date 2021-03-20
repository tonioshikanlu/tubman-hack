package b.l.a.c.k;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class x<TResult> implements b0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4446b = new Object();
    public e<? super TResult> c;

    public x(@NonNull Executor executor, @NonNull e<? super TResult> eVar) {
        this.a = executor;
        this.c = eVar;
    }

    public final void c(@NonNull h<TResult> hVar) {
        if (hVar.n()) {
            synchronized (this.f4446b) {
                if (this.c != null) {
                    this.a.execute(new y(this, hVar));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f4446b) {
            this.c = null;
        }
    }
}
