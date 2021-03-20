package b.l.a.c.k;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class n<TResult, TContinuationResult> implements b0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final a<TResult, TContinuationResult> f4432b;
    public final e0<TContinuationResult> c;

    public n(@NonNull Executor executor, @NonNull a<TResult, TContinuationResult> aVar, @NonNull e0<TContinuationResult> e0Var) {
        this.a = executor;
        this.f4432b = aVar;
        this.c = e0Var;
    }

    public final void c(@NonNull h<TResult> hVar) {
        this.a.execute(new o(this, hVar));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
