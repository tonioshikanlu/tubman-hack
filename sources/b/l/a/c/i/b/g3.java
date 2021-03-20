package b.l.a.c.i.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import b.l.a.c.c.f;
import b.l.a.c.c.m.b;
import b.l.a.c.c.m.k;

public final class g3 extends b<a3> {
    public g3(Context context, Looper looper, b.a aVar, b.C0060b bVar) {
        super(context, looper, k.a(context), f.f2599b, 93, aVar, bVar, (String) null);
    }

    @NonNull
    public final String C() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @NonNull
    public final String D() {
        return "com.google.android.gms.measurement.START";
    }

    public final int n() {
        return 12451000;
    }

    public final /* bridge */ /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof a3 ? (a3) queryLocalInterface : new y2(iBinder);
    }
}
