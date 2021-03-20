package b.l.a.c.c.l.k;

import java.lang.ref.WeakReference;

public final class n0 extends a1 {
    public WeakReference<j0> a;

    public n0(j0 j0Var) {
        this.a = new WeakReference<>(j0Var);
    }

    public final void a() {
        j0 j0Var = (j0) this.a.get();
        if (j0Var != null) {
            j0.k(j0Var);
        }
    }
}
