package e.a.a.a.y0.h;

import java.util.Iterator;
import java.util.Map;

public class k extends l {

    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: h  reason: collision with root package name */
        public Map.Entry<K, k> f9249h;

        public b(Map.Entry entry, a aVar) {
            this.f9249h = entry;
        }

        public K getKey() {
            return this.f9249h.getKey();
        }

        public Object getValue() {
            k value = this.f9249h.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        public Object setValue(Object obj) {
            if (obj instanceof p) {
                k value = this.f9249h.getValue();
                p pVar = value.f9251b;
                value.f9251b = (p) obj;
                value.a = true;
                return pVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: h  reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f9250h;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f9250h = it;
        }

        public boolean hasNext() {
            return this.f9250h.hasNext();
        }

        public Object next() {
            Map.Entry next = this.f9250h.next();
            return next.getValue() instanceof k ? new b(next, (a) null) : next;
        }

        public void remove() {
            this.f9250h.remove();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|(3:6|7|8)|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.a.a.a.y0.h.p a() {
        /*
            r1 = this;
            e.a.a.a.y0.h.p r0 = r1.f9251b
            if (r0 == 0) goto L_0x0005
            goto L_0x000f
        L_0x0005:
            monitor-enter(r1)
            e.a.a.a.y0.h.p r0 = r1.f9251b     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000e
        L_0x000b:
            r0 = 0
            r1.f9251b = r0     // Catch:{ IOException -> 0x000e }
        L_0x000e:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
        L_0x000f:
            e.a.a.a.y0.h.p r0 = r1.f9251b
            return r0
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.h.k.a():e.a.a.a.y0.h.p");
    }

    public boolean equals(Object obj) {
        return a().equals(obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
