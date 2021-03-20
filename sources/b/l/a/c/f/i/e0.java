package b.l.a.c.f.i;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class e0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f0 f3525h;

    public e0(f0 f0Var) {
        this.f3525h = f0Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f0 f0Var = this.f3525h;
        f0Var.c.execute(new x(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        f0 f0Var = this.f3525h;
        f0Var.c.execute(new d0(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        f0 f0Var = this.f3525h;
        f0Var.c.execute(new a0(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        f0 f0Var = this.f3525h;
        f0Var.c.execute(new z(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        r9 r9Var = new r9();
        f0 f0Var = this.f3525h;
        f0Var.c.execute(new c0(this, activity, r9Var));
        Bundle n2 = r9Var.n(50);
        if (n2 != null) {
            bundle.putAll(n2);
        }
    }

    public final void onActivityStarted(Activity activity) {
        f0 f0Var = this.f3525h;
        f0Var.c.execute(new y(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        f0 f0Var = this.f3525h;
        f0Var.c.execute(new b0(this, activity));
    }
}
