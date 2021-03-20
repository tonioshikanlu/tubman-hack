package b.l.d.v;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class i0 extends Binder {
    public final e0 a;

    public i0(e0 e0Var) {
        this.a = e0Var;
    }

    public final void a(g0 g0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "service received new intent via bind strategy");
            }
            if (this.a.b(g0Var.a)) {
                g0Var.a();
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "intent being queued for bg execution");
            }
            this.a.f5308h.execute(new h0(this, g0Var));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
