package b.j.a.b.w;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class l {
    public final Map<SoftReference<a>, Boolean> a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final ReferenceQueue<a> f1584b = new ReferenceQueue<>();

    public static final class a {
        public static final l a = new l();
    }
}
