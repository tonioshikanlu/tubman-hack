package b.l.a.c.c.l.k;

import android.os.Looper;
import androidx.annotation.NonNull;
import b.l.a.c.c.l.a;
import b.l.a.c.c.m.b;
import java.lang.ref.WeakReference;

public final class z implements b.c {
    public final WeakReference<x> a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?> f2742b;
    public final boolean c;

    public z(x xVar, a<?> aVar, boolean z) {
        this.a = new WeakReference<>(xVar);
        this.f2742b = aVar;
        this.c = z;
    }

    public final void a(@NonNull b.l.a.c.c.b bVar) {
        x xVar = (x) this.a.get();
        if (xVar != null) {
            b.l.a.c.b.a.G(Looper.myLooper() == xVar.a.f2701m.f2676g, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            xVar.f2718b.lock();
            try {
                if (xVar.n(0)) {
                    if (!bVar.W()) {
                        xVar.l(bVar, this.f2742b, this.c);
                    }
                    if (xVar.e()) {
                        xVar.f();
                    }
                }
            } finally {
                xVar.f2718b.unlock();
            }
        }
    }
}
