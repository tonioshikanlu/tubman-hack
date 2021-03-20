package b.l.a.c.i.b;

import b.l.a.c.f.i.tb;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class z7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ tb f4399h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4400i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f4401j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f4402k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4403l;

    public z7(AppMeasurementDynamiteService appMeasurementDynamiteService, tb tbVar, String str, String str2, boolean z) {
        this.f4403l = appMeasurementDynamiteService;
        this.f4399h = tbVar;
        this.f4400i = str;
        this.f4401j = str2;
        this.f4402k = z;
    }

    public final void run() {
        b8 z = this.f4403l.a.z();
        tb tbVar = this.f4399h;
        String str = this.f4400i;
        String str2 = this.f4401j;
        boolean z2 = this.f4402k;
        z.h();
        z.i();
        z.t(new c7(z, str, str2, z.v(false), z2, tbVar));
    }
}
