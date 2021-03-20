package b.l.a.c.k;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class r<TResult> implements b0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4438b = new Object();
    public b c;

    public r(@NonNull Executor executor, @NonNull b bVar) {
        this.a = executor;
        this.c = bVar;
    }

    public final void c(@NonNull h hVar) {
        if (hVar.l()) {
            synchronized (this.f4438b) {
                if (this.c != null) {
                    this.a.execute(new s(this));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f4438b) {
            this.c = null;
        }
    }
}
