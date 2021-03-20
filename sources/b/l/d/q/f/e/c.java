package b.l.d.q.f.e;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c implements b, a {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5055b = new Object();
    public CountDownLatch c;

    public c(@NonNull e eVar, int i2, TimeUnit timeUnit) {
        this.a = eVar;
    }

    public void a(@NonNull String str, @Nullable Bundle bundle) {
        b bVar = b.a;
        synchronized (this.f5055b) {
            bVar.b("Logging Crashlytics event to Firebase");
            this.c = new CountDownLatch(1);
            this.a.a.c("clx", str, bundle);
            bVar.b("Awaiting app exception callback from FA...");
            try {
                bVar.b(this.c.await((long) 500, TimeUnit.MILLISECONDS) ? "App exception callback received from FA listener." : "Timeout exceeded while awaiting app exception callback from FA listener.");
            } catch (InterruptedException unused) {
                bVar.b("Interrupted while awaiting app exception callback from FA listener.");
            }
            this.c = null;
        }
    }

    public void b(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
