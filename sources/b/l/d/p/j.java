package b.l.d.p;

import b.l.d.w.a;
import b.l.d.w.b;
import java.util.Objects;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final c0 f5037h;

    /* renamed from: i  reason: collision with root package name */
    public final b f5038i;

    public j(c0 c0Var, b bVar) {
        this.f5037h = c0Var;
        this.f5038i = bVar;
    }

    public void run() {
        a<T> aVar;
        c0 c0Var = this.f5037h;
        b<T> bVar = this.f5038i;
        int i2 = m.f5041g;
        if (c0Var.f5029b == b0.a) {
            synchronized (c0Var) {
                aVar = c0Var.a;
                c0Var.a = null;
                c0Var.f5029b = bVar;
            }
            Objects.requireNonNull((a0) aVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
