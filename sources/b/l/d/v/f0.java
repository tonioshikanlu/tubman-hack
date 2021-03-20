package b.l.d.v;

import android.content.Intent;
import android.util.Log;

public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final g0 f5315h;

    /* renamed from: i  reason: collision with root package name */
    public final Intent f5316i;

    public f0(g0 g0Var, Intent intent) {
        this.f5315h = g0Var;
        this.f5316i = intent;
    }

    public final void run() {
        g0 g0Var = this.f5315h;
        String action = this.f5316i.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        g0Var.a();
    }
}
