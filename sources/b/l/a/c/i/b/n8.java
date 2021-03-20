package b.l.a.c.i.b;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import b.l.a.c.c.p.c;
import java.util.Objects;

public final class n8 extends l {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o8 f4178e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n8(o8 o8Var, h5 h5Var) {
        super(h5Var);
        this.f4178e = o8Var;
    }

    @WorkerThread
    public final void a() {
        o8 o8Var = this.f4178e;
        o8Var.d.h();
        Objects.requireNonNull((c) o8Var.d.a.f4121n);
        o8Var.a(false, false, SystemClock.elapsedRealtime());
        c2 g2 = o8Var.d.a.g();
        Objects.requireNonNull((c) o8Var.d.a.f4121n);
        g2.k(SystemClock.elapsedRealtime());
    }
}
