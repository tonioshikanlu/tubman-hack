package b.l.d.v;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import b.l.a.c.c.p.g.a;
import b.l.a.c.k.h;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static f f5313e;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f5314b;
    public h c = new h(this, (e) null);
    public int d = 1;

    @VisibleForTesting
    public f(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5314b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized f b(Context context) {
        f fVar;
        synchronized (f.class) {
            if (f5313e == null) {
                f5313e = new f(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a("MessengerIpcClient"))));
            }
            fVar = f5313e;
        }
        return fVar;
    }

    public final synchronized <T> h<T> a(m<T> mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(mVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.c.b(mVar)) {
            h hVar = new h(this, (e) null);
            this.c = hVar;
            hVar.b(mVar);
        }
        return mVar.f5330b.a;
    }
}
