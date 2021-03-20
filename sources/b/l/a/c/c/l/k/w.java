package b.l.a.c.c.l.k;

import android.app.NotificationManager;
import android.content.Context;
import b.l.a.c.c.f;
import b.l.a.c.c.i;
import java.util.Objects;

public final class w implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ x f2715h;

    public w(x xVar) {
        this.f2715h = xVar;
    }

    public final void run() {
        x xVar = this.f2715h;
        f fVar = xVar.d;
        Context context = xVar.c;
        Objects.requireNonNull(fVar);
        if (!i.c.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }
}
