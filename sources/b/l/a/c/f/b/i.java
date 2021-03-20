package b.l.a.c.f.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b.l.a.c.c.l.k.f;
import b.l.a.c.c.l.k.l;
import b.l.a.c.c.m.d;

public final class i extends b.l.a.c.c.m.i<e> {
    public i(Context context, Looper looper, d dVar, f fVar, l lVar) {
        super(context, looper, 126, dVar, fVar, lVar);
    }

    public final String C() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    public final String D() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    public final int n() {
        return 12451000;
    }

    public final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new d(iBinder);
    }

    public final b.l.a.c.c.d[] y() {
        return b.d;
    }
}
