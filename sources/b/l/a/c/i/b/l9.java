package b.l.a.c.i.b;

import b.l.a.c.f.i.tb;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class l9 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ tb f4133h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4134i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f4135j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4136k;

    public l9(AppMeasurementDynamiteService appMeasurementDynamiteService, tb tbVar, String str, String str2) {
        this.f4136k = appMeasurementDynamiteService;
        this.f4133h = tbVar;
        this.f4134i = str;
        this.f4135j = str2;
    }

    public final void run() {
        b8 z = this.f4136k.a.z();
        tb tbVar = this.f4133h;
        String str = this.f4134i;
        String str2 = this.f4135j;
        z.h();
        z.i();
        z.t(new s7(z, str, str2, z.v(false), tbVar));
    }
}
