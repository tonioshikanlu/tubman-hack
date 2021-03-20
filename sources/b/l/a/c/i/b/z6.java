package b.l.a.c.i.b;

import b.l.a.c.c.f;
import b.l.a.c.f.i.tb;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

public final class z6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ tb f4395h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ s f4396i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f4397j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4398k;

    public z6(AppMeasurementDynamiteService appMeasurementDynamiteService, tb tbVar, s sVar, String str) {
        this.f4398k = appMeasurementDynamiteService;
        this.f4395h = tbVar;
        this.f4396i = sVar;
        this.f4397j = str;
    }

    public final void run() {
        b8 z = this.f4398k.a.z();
        tb tbVar = this.f4395h;
        s sVar = this.f4396i;
        String str = this.f4397j;
        z.h();
        z.i();
        k9 t = z.a.t();
        Objects.requireNonNull(t);
        if (f.f2599b.b(t.a.a, 12451000) != 0) {
            z.a.a().f4091i.a("Not bundling data. Service unavailable or out of date");
            z.a.t().S(tbVar, new byte[0]);
            return;
        }
        z.t(new l7(z, sVar, str, tbVar));
    }
}
