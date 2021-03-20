package b.l.d.q.f.g;

import b.l.d.q.f.b;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class e0 extends c {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f5084h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f5085i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f5086j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f5087k;

    public e0(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        this.f5084h = str;
        this.f5085i = executorService;
        this.f5086j = j2;
        this.f5087k = timeUnit;
    }

    public void a() {
        b bVar = b.a;
        try {
            bVar.b("Executing shutdown hook for " + this.f5084h);
            this.f5085i.shutdown();
            if (!this.f5085i.awaitTermination(this.f5086j, this.f5087k)) {
                bVar.b(this.f5084h + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f5085i.shutdownNow();
            }
        } catch (InterruptedException unused) {
            bVar.b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f5084h}));
            this.f5085i.shutdownNow();
        }
    }
}
