package b.l.a.c.i.b;

import b.l.a.c.f.i.tb;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class y5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ tb f4380h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4381i;

    public y5(AppMeasurementDynamiteService appMeasurementDynamiteService, tb tbVar) {
        this.f4381i = appMeasurementDynamiteService;
        this.f4380h = tbVar;
    }

    public final void run() {
        b8 z = this.f4381i.a.z();
        tb tbVar = this.f4380h;
        z.h();
        z.i();
        z.t(new g7(z, z.v(false), tbVar));
    }
}
