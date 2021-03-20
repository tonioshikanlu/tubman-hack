package b.l.a.d.a.i;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

public final class i<ResultT> implements l<ResultT> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4695b = new Object();
    @Nullable
    public final b c;

    public i(Executor executor, b bVar) {
        this.a = executor;
        this.c = bVar;
    }

    public final void a(r<ResultT> rVar) {
        if (!rVar.g()) {
            synchronized (this.f4695b) {
                if (this.c != null) {
                    this.a.execute(new h(this, rVar));
                }
            }
        }
    }
}
