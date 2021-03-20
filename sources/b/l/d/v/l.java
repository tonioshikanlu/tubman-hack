package b.l.d.v;

import android.util.Log;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final h f5327h;

    /* renamed from: i  reason: collision with root package name */
    public final m f5328i;

    public l(h hVar, m mVar) {
        this.f5327h = hVar;
        this.f5328i = mVar;
    }

    public final void run() {
        h hVar = this.f5327h;
        int i2 = this.f5328i.a;
        synchronized (hVar) {
            m mVar = hVar.f5319e.get(i2);
            if (mVar != null) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Timing out request: ");
                sb.append(i2);
                Log.w("MessengerIpcClient", sb.toString());
                hVar.f5319e.remove(i2);
                mVar.b(new p(3, "Timed out waiting for response"));
                hVar.c();
            }
        }
    }
}
