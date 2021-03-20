package b.l.a.d.a.i;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

public final class g<ResultT> implements l<ResultT> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4692b = new Object();
    @Nullable
    public final a<ResultT> c;

    public g(Executor executor, a<ResultT> aVar) {
        this.a = executor;
        this.c = aVar;
    }

    public final void a(r<ResultT> rVar) {
        synchronized (this.f4692b) {
            if (this.c != null) {
                this.a.execute(new f(this, rVar));
            }
        }
    }
}
