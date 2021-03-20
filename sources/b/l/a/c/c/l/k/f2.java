package b.l.a.c.c.l.k;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Objects;

public final class f2 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f2637h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f2638i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g2 f2639j;

    public f2(g2 g2Var, LifecycleCallback lifecycleCallback, String str) {
        this.f2639j = g2Var;
        this.f2637h = lifecycleCallback;
        this.f2638i = str;
    }

    public final void run() {
        g2 g2Var = this.f2639j;
        if (g2Var.f2664i > 0) {
            LifecycleCallback lifecycleCallback = this.f2637h;
            Bundle bundle = g2Var.f2665j;
            lifecycleCallback.d(bundle != null ? bundle.getBundle(this.f2638i) : null);
        }
        if (this.f2639j.f2664i >= 2) {
            this.f2637h.f();
        }
        if (this.f2639j.f2664i >= 3) {
            Objects.requireNonNull(this.f2637h);
        }
        if (this.f2639j.f2664i >= 4) {
            this.f2637h.g();
        }
        if (this.f2639j.f2664i >= 5) {
            Objects.requireNonNull(this.f2637h);
        }
    }
}
