package b.j.a.c.j0;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class m<K, V> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final transient int f2225h;

    /* renamed from: i  reason: collision with root package name */
    public final transient ConcurrentHashMap<K, V> f2226i;

    public m(int i2, int i3) {
        this.f2226i = new ConcurrentHashMap<>(i2, 0.8f, 4);
        this.f2225h = i3;
    }

    public V a(Object obj) {
        return this.f2226i.get(obj);
    }

    public V b(K k2, V v) {
        if (this.f2226i.size() >= this.f2225h) {
            synchronized (this) {
                if (this.f2226i.size() >= this.f2225h) {
                    this.f2226i.clear();
                }
            }
        }
        return this.f2226i.put(k2, v);
    }

    public V c(K k2, V v) {
        if (this.f2226i.size() >= this.f2225h) {
            synchronized (this) {
                if (this.f2226i.size() >= this.f2225h) {
                    this.f2226i.clear();
                }
            }
        }
        return this.f2226i.putIfAbsent(k2, v);
    }
}
