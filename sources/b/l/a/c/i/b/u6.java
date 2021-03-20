package b.l.a.c.i.b;

import android.os.Bundle;
import java.util.List;

public final class u6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Bundle f4298h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ t6 f4299i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ t6 f4300j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ long f4301k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b7 f4302l;

    public u6(b7 b7Var, Bundle bundle, t6 t6Var, t6 t6Var2, long j2) {
        this.f4302l = b7Var;
        this.f4298h = bundle;
        this.f4299i = t6Var;
        this.f4300j = t6Var2;
        this.f4301k = j2;
    }

    public final void run() {
        b7 b7Var = this.f4302l;
        Bundle bundle = this.f4298h;
        t6 t6Var = this.f4299i;
        t6 t6Var2 = this.f4300j;
        long j2 = this.f4301k;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        b7Var.m(t6Var, t6Var2, j2, true, b7Var.a.t().t((String) null, "screen_view", bundle, (List<String>) null, true));
    }
}
