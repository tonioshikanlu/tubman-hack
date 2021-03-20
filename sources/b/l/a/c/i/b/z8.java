package b.l.a.c.i.b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class z8 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ n9 f4404h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4405i;

    public z8(AppMeasurementDynamiteService appMeasurementDynamiteService, n9 n9Var) {
        this.f4405i = appMeasurementDynamiteService;
        this.f4404h = n9Var;
    }

    public final void run() {
        this.f4405i.a.s().p(this.f4404h);
    }
}
