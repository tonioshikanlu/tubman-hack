package b.l.a.c.f.e;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class z<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public static final z f3427i;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3428h = true;

    static {
        z zVar = new z();
        f3427i = zVar;
        zVar.f3428h = false;
    }

    public z() {
    }

    public z(Map<K, V> map) {
        super(map);
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = j.a;
            int i2 = r0;
            for (byte b2 : (byte[]) obj) {
                i2 = (i2 * 31) + b2;
            }
            if (i2 == 0) {
                return 1;
            }
            return i2;
        } else if (!(obj instanceof g)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final z<K, V> a() {
        return isEmpty() ? new z<>() : new z<>(this);
    }

    public final void c() {
        if (!this.f3428h) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        c();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (Map.Entry entry : entrySet()) {
            i2 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i2;
    }

    public final V put(K k2, V v) {
        c();
        Charset charset = j.a;
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v);
        return super.put(k2, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        c();
        for (Object next : map.keySet()) {
            Charset charset = j.a;
            Objects.requireNonNull(next);
            Objects.requireNonNull(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        c();
        return super.remove(obj);
    }
}
