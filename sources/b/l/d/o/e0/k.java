package b.l.d.o.e0;

import android.os.Handler;
import android.os.HandlerThread;
import b.l.a.c.c.n.a;
import b.l.a.c.f.e.f9;
import b.l.d.d;
import com.amplitude.api.Constants;

public final class k {

    /* renamed from: h  reason: collision with root package name */
    public static final a f4988h = new a("TokenRefresher", "FirebaseAuth:");
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f4989b;
    public volatile long c;
    public final long d = Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS;

    /* renamed from: e  reason: collision with root package name */
    public final HandlerThread f4990e;
    public final Handler f;

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f4991g;

    public k(d dVar) {
        f4988h.d("Initializing TokenRefresher", new Object[0]);
        this.a = dVar;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f4990e = handlerThread;
        handlerThread.start();
        this.f = new f9(handlerThread.getLooper());
        dVar.a();
        this.f4991g = new j(this, dVar.f4912b);
    }
}
