package b.l.a.c.i.b;

import android.os.Bundle;
import b.l.a.c.c.p.c;
import java.util.Objects;

public final class a9 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3908h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Bundle f3909i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b9 f3910j;

    public a9(b9 b9Var, String str, Bundle bundle) {
        this.f3910j = b9Var;
        this.f3908h = str;
        this.f3909i = bundle;
    }

    public final void run() {
        k9 t = this.f3910j.a.f3979j.t();
        String str = this.f3908h;
        Bundle bundle = this.f3909i;
        Objects.requireNonNull((c) this.f3910j.a.f3979j.f4121n);
        this.f3910j.a.V(t.J(str, "_err", bundle, "auto", System.currentTimeMillis(), false, false), this.f3908h);
    }
}
