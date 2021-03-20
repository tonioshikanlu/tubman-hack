package b.l.a.c.f.e;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class s2<P> {
    public final ConcurrentMap<r2, List<q2<P>>> a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Class<P> f3267b;

    public s2(Class<P> cls) {
        this.f3267b = cls;
    }

    public final List<q2<P>> a(byte[] bArr) {
        List<q2<P>> list = (List) this.a.get(new r2(bArr));
        return list != null ? list : Collections.emptyList();
    }
}
