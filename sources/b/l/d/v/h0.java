package b.l.d.v;

import android.util.Log;

public final class h0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g0 f5320h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ i0 f5321i;

    public h0(i0 i0Var, g0 g0Var) {
        this.f5321i = i0Var;
        this.f5320h = g0Var;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f5321i.a.c(this.f5320h.a);
        this.f5320h.a();
    }
}
