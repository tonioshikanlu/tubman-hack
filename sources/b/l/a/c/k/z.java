package b.l.a.c.k;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class z<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, b0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final g<TResult, TContinuationResult> f4449b;
    public final e0<TContinuationResult> c;

    public z(@NonNull Executor executor, @NonNull g<TResult, TContinuationResult> gVar, @NonNull e0<TContinuationResult> e0Var) {
        this.a = executor;
        this.f4449b = gVar;
        this.c = e0Var;
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.c.q(tcontinuationresult);
    }

    public final void b(@NonNull Exception exc) {
        this.c.p(exc);
    }

    public final void c(@NonNull h<TResult> hVar) {
        this.a.execute(new a0(this, hVar));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void d() {
        this.c.r();
    }
}
