package b.l.d.v;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class g0 {
    public final Intent a;

    /* renamed from: b  reason: collision with root package name */
    public final BroadcastReceiver.PendingResult f5317b;
    public boolean c = false;
    public final ScheduledFuture<?> d;

    public g0(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.a = intent;
        this.f5317b = pendingResult;
        this.d = scheduledExecutorService.schedule(new f0(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    public final synchronized void a() {
        if (!this.c) {
            this.f5317b.finish();
            this.d.cancel(false);
            this.c = true;
        }
    }
}
