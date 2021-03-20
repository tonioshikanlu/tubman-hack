package b.l.a.c.f.g;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b.l.a.c.c.m.d;
import b.l.a.c.c.m.i;
import com.google.android.gms.common.api.GoogleApiClient;

public class w extends i<i> {
    public final String D;
    public final x<i> E = new x(this);

    public w(Context context, Looper looper, GoogleApiClient.b bVar, GoogleApiClient.c cVar, String str, d dVar) {
        super(context, looper, 23, dVar, bVar, cVar);
        this.D = str;
    }

    public String C() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public String D() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public int n() {
        return 11925000;
    }

    public /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new j(iBinder);
    }

    public Bundle z() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.D);
        return bundle;
    }
}
