package b.l.a.c.k;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

public abstract class h<TResult> {
    @NonNull
    public h<TResult> a(@NonNull Executor executor, @NonNull b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    public h<TResult> b(@NonNull Activity activity, @NonNull c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public h<TResult> c(@NonNull c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public abstract h<TResult> d(@NonNull Executor executor, @NonNull d dVar);

    @NonNull
    public abstract h<TResult> e(@NonNull Executor executor, @NonNull e<? super TResult> eVar);

    @NonNull
    public <TContinuationResult> h<TContinuationResult> f(@NonNull a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    public <TContinuationResult> h<TContinuationResult> g(@NonNull Executor executor, @NonNull a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    public <TContinuationResult> h<TContinuationResult> h(@NonNull Executor executor, @NonNull a<TResult, h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    public abstract Exception i();

    @Nullable
    public abstract TResult j();

    @Nullable
    public abstract <X extends Throwable> TResult k(@NonNull Class<X> cls);

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    @NonNull
    public <TContinuationResult> h<TContinuationResult> o(@NonNull Executor executor, @NonNull g<TResult, TContinuationResult> gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
