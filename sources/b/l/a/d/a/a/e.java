package b.l.a.d.a.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import b.l.a.c.b.a;
import b.l.a.d.a.d.b;
import b.l.a.d.a.i.n;
import b.l.a.d.a.i.r;

public final class e implements b {
    public final p a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4450b;
    public final Context c;

    public e(p pVar, d dVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = pVar;
        this.f4450b = dVar;
        this.c = context;
    }

    public final r<Void> a() {
        p pVar = this.a;
        String packageName = this.c.getPackageName();
        if (pVar.a == null) {
            return p.b();
        }
        p.f4461e.b(4, "completeUpdate(%s)", new Object[]{packageName});
        n nVar = new n();
        pVar.a.a(new l(pVar, nVar, nVar, packageName));
        return nVar.a;
    }

    public final r<a> b() {
        p pVar = this.a;
        String packageName = this.c.getPackageName();
        if (pVar.a == null) {
            return p.b();
        }
        p.f4461e.b(4, "requestUpdateInfo(%s)", new Object[]{packageName});
        n nVar = new n();
        pVar.a.a(new k(pVar, nVar, packageName, nVar));
        return nVar.a;
    }

    public final synchronized void c(b bVar) {
        d dVar = this.f4450b;
        synchronized (dVar) {
            dVar.a.b(4, "registerListener", new Object[0]);
            a.P(bVar, "Registered Play Core listener should not be null.");
            dVar.d.add(bVar);
            dVar.b();
        }
    }

    public final boolean d(a aVar, int i2, Activity activity, int i3) {
        c c2 = c.c(i2);
        if (!(aVar.j(c2) != null)) {
            return false;
        }
        activity.startIntentSenderForResult(aVar.j(c2).getIntentSender(), i3, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }

    public final synchronized void e(b bVar) {
        d dVar = this.f4450b;
        synchronized (dVar) {
            dVar.a.b(4, "unregisterListener", new Object[0]);
            a.P(bVar, "Unregistered Play Core listener should not be null.");
            dVar.d.remove(bVar);
            dVar.b();
        }
    }
}
