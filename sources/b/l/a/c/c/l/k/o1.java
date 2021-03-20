package b.l.a.c.c.l.k;

import b.l.a.c.c.l.a;
import b.l.a.c.c.l.h;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class o1 {
    public static final Status d = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: e  reason: collision with root package name */
    public static final BasePendingResult<?>[] f2689e = new BasePendingResult[0];
    public final Set<BasePendingResult<?>> a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b  reason: collision with root package name */
    public final p1 f2690b = new n1(this);
    public final Map<a.c<?>, a.f> c;

    public o1(Map<a.c<?>, a.f> map) {
        this.c = map;
    }

    public final void a() {
        boolean z;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.a.toArray(f2689e)) {
            basePendingResult.f7269g.set((Object) null);
            synchronized (basePendingResult.a) {
                if (((GoogleApiClient) basePendingResult.c.get()) == null || !basePendingResult.f7275m) {
                    basePendingResult.a();
                }
                synchronized (basePendingResult.a) {
                    z = basePendingResult.f7273k;
                }
            }
            if (z) {
                this.a.remove(basePendingResult);
            }
        }
    }

    public final void b(BasePendingResult<? extends h> basePendingResult) {
        this.a.add(basePendingResult);
        basePendingResult.f7269g.set(this.f2690b);
    }
}
