package b.l.a.c.i.b;

import b.l.a.c.f.i.tb;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class m9 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ tb f4161h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4162i;

    public m9(AppMeasurementDynamiteService appMeasurementDynamiteService, tb tbVar) {
        this.f4162i = appMeasurementDynamiteService;
        this.f4161h = tbVar;
    }

    public final void run() {
        this.f4162i.a.t().T(this.f4161h, this.f4162i.a.i());
    }
}
