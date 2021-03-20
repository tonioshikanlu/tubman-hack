package b.l.a.d.a.e;

import androidx.annotation.Nullable;
import b.l.a.d.a.i.n;

public abstract class g implements Runnable {
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final n<?> f4660h;

    public g() {
        this.f4660h = null;
    }

    public g(@Nullable n<?> nVar) {
        this.f4660h = nVar;
    }

    public abstract void a();

    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            n<?> nVar = this.f4660h;
            if (nVar != null) {
                nVar.a(e2);
            }
        }
    }
}
