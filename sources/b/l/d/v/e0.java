package b.l.d.v;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.legacy.content.WakefulBroadcastReceiver;
import b.l.a.c.c.p.g.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class e0 extends Service {
    @VisibleForTesting

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f5308h;

    /* renamed from: i  reason: collision with root package name */
    public Binder f5309i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f5310j;

    /* renamed from: k  reason: collision with root package name */
    public int f5311k;

    /* renamed from: l  reason: collision with root package name */
    public int f5312l;

    public e0() {
        String simpleName = getClass().getSimpleName();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new String("Firebase-")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5308h = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f5310j = new Object();
        this.f5312l = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.f5310j) {
            int i2 = this.f5312l - 1;
            this.f5312l = i2;
            if (i2 == 0) {
                stopSelfResult(this.f5311k);
            }
        }
    }

    public abstract boolean b(Intent intent);

    public abstract void c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f5309i == null) {
            this.f5309i = new i0(this);
        }
        return this.f5309i;
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        synchronized (this.f5310j) {
            this.f5311k = i3;
            this.f5312l++;
        }
        Intent poll = y.a().d.poll();
        if (poll == null) {
            a(intent);
            return 2;
        } else if (b(poll)) {
            a(intent);
            return 2;
        } else {
            this.f5308h.execute(new c0(this, poll, intent));
            return 3;
        }
    }
}
