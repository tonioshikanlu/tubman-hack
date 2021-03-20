package b.l.d.q.f.g;

import android.os.Bundle;
import com.segment.analytics.integrations.BasePayload;
import java.util.concurrent.Callable;

public class j implements Callable<Void> {
    public final /* synthetic */ long a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f5093b;

    public j(q qVar, long j2) {
        this.f5093b = qVar;
        this.a = j2;
    }

    public Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong(BasePayload.TIMESTAMP_KEY, this.a);
        this.f5093b.f5111l.a("_ae", bundle);
        return null;
    }
}
