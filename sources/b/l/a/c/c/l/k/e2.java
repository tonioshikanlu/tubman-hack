package b.l.a.c.c.l.k;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Objects;

public final class e2 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f2633h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f2634i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d2 f2635j;

    public e2(d2 d2Var, LifecycleCallback lifecycleCallback, String str) {
        this.f2635j = d2Var;
        this.f2633h = lifecycleCallback;
        this.f2634i = str;
    }

    public final void run() {
        d2 d2Var = this.f2635j;
        if (d2Var.f2630i > 0) {
            LifecycleCallback lifecycleCallback = this.f2633h;
            Bundle bundle = d2Var.f2631j;
            lifecycleCallback.d(bundle != null ? bundle.getBundle(this.f2634i) : null);
        }
        if (this.f2635j.f2630i >= 2) {
            this.f2633h.f();
        }
        if (this.f2635j.f2630i >= 3) {
            Objects.requireNonNull(this.f2633h);
        }
        if (this.f2635j.f2630i >= 4) {
            this.f2633h.g();
        }
        if (this.f2635j.f2630i >= 5) {
            Objects.requireNonNull(this.f2633h);
        }
    }
}
