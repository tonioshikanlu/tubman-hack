package b.l.a.c.i.b;

import android.os.Bundle;
import android.os.RemoteException;
import b.l.a.c.f.i.wb;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class o9 implements l5 {
    public final wb a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4204b;

    public o9(AppMeasurementDynamiteService appMeasurementDynamiteService, wb wbVar) {
        this.f4204b = appMeasurementDynamiteService;
        this.a = wbVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j2) {
        try {
            this.a.b0(str, str2, bundle, j2);
        } catch (RemoteException e2) {
            l4 l4Var = this.f4204b.a;
            if (l4Var != null) {
                l4Var.a().f4091i.b("Event listener threw exception", e2);
            }
        }
    }
}
