package b.l.a.c.k;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class v<TResult> implements b0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4443b = new Object();
    public d c;

    public v(@NonNull Executor executor, @NonNull d dVar) {
        this.a = executor;
        this.c = dVar;
    }

    public final void c(@NonNull h<TResult> hVar) {
        if (!hVar.n() && !hVar.l()) {
            synchronized (this.f4443b) {
                if (this.c != null) {
                    this.a.execute(new w(this, hVar));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f4443b) {
            this.c = null;
        }
    }
}
