package b.l.d.q.f.g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.k.g;
import b.l.a.c.k.h;
import b.l.d.q.f.b;
import b.l.d.q.f.m.j.a;
import java.util.Arrays;
import java.util.concurrent.Executor;

public class l implements g<a, Void> {
    public final /* synthetic */ Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f5097b;

    public l(m mVar, Executor executor) {
        this.f5097b = mVar;
        this.a = executor;
    }

    @NonNull
    public h a(@Nullable Object obj) {
        if (((a) obj) == null) {
            b.a.f("Received null app settings, cannot send reports at crash time.");
            return b.l.a.c.b.a.X(null);
        }
        return b.l.a.c.b.a.D0(Arrays.asList(new h[]{q.b(this.f5097b.f5099e), this.f5097b.f5099e.f5112m.c(this.a)}));
    }
}
