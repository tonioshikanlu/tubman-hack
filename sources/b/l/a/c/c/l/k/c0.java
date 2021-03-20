package b.l.a.c.c.l.k;

import androidx.annotation.BinderThread;
import b.l.a.c.j.b.e;
import b.l.a.c.j.b.l;
import java.lang.ref.WeakReference;

public final class c0 extends e {
    public final WeakReference<x> a;

    public c0(x xVar) {
        this.a = new WeakReference<>(xVar);
    }

    @BinderThread
    public final void h0(l lVar) {
        x xVar = (x) this.a.get();
        if (xVar != null) {
            p0 p0Var = xVar.a;
            p0Var.f2694e.sendMessage(p0Var.f2694e.obtainMessage(1, new f0(xVar, xVar, lVar)));
        }
    }
}
