package b.l.a.c.f.g;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import b.l.a.c.c.m.d;
import com.google.android.gms.common.api.GoogleApiClient;

public final class p extends w {
    public final k F;

    public p(Context context, Looper looper, GoogleApiClient.b bVar, GoogleApiClient.c cVar, String str, d dVar) {
        super(context, looper, bVar, cVar, str, dVar);
        this.F = new k(context, this.E);
    }

    public final void b() {
        synchronized (this.F) {
            if (a()) {
                try {
                    this.F.a();
                    this.F.c();
                } catch (Exception e2) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e2);
                }
            }
            super.b();
        }
    }
}
