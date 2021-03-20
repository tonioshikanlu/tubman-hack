package b.l.a.d.a.i;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

public final class k<ResultT> implements l<ResultT> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4698b = new Object();
    @Nullable
    public final c<? super ResultT> c;

    public k(Executor executor, c<? super ResultT> cVar) {
        this.a = executor;
        this.c = cVar;
    }

    public final void a(r<ResultT> rVar) {
        if (rVar.g()) {
            synchronized (this.f4698b) {
                if (this.c != null) {
                    this.a.execute(new j(this, rVar));
                }
            }
        }
    }
}
