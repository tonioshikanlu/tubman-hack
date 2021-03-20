package b.l.a.c.i.b;

import android.content.ComponentName;
import android.content.Context;

public final class x7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a8 f4372h;

    public x7(a8 a8Var) {
        this.f4372h = a8Var;
    }

    public final void run() {
        b8 b8Var = this.f4372h.c;
        Context context = b8Var.a.a;
        y9 y9Var = this.f4372h.c.a.f;
        b8.q(b8Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
