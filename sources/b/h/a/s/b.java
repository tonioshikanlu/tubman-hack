package b.h.a.s;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

public final class b<K, V> extends ArrayMap<K, V> {

    /* renamed from: h  reason: collision with root package name */
    public int f1006h;

    public void clear() {
        this.f1006h = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f1006h == 0) {
            this.f1006h = super.hashCode();
        }
        return this.f1006h;
    }

    public V put(K k2, V v) {
        this.f1006h = 0;
        return super.put(k2, v);
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f1006h = 0;
        super.putAll(simpleArrayMap);
    }

    public V removeAt(int i2) {
        this.f1006h = 0;
        return super.removeAt(i2);
    }

    public V setValueAt(int i2, V v) {
        this.f1006h = 0;
        return super.setValueAt(i2, v);
    }
}
