package b.l.a.c.f.i;

import android.app.Activity;
import android.os.Bundle;
import b.l.a.c.d.d;

public final class x extends v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Bundle f3801l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Activity f3802m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ e0 f3803n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(e0 e0Var, Bundle bundle, Activity activity) {
        super(e0Var.f3525h, true);
        this.f3803n = e0Var;
        this.f3801l = bundle;
        this.f3802m = activity;
    }

    public final void a() {
        Bundle bundle;
        if (this.f3801l != null) {
            bundle = new Bundle();
            if (this.f3801l.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f3801l.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        this.f3803n.f3525h.f3550h.onActivityCreated(new d(this.f3802m), bundle, this.f3777i);
    }
}
