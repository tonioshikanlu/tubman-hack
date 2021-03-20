package b.l.a.c.f.i;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class l6<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public static final l6 f3644i;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3645h = true;

    static {
        l6 l6Var = new l6();
        f3644i = l6Var;
        l6Var.f3645h = false;
    }

    public l6() {
    }

    public l6(Map<K, V> map) {
        super(map);
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = w5.a;
            int i2 = r0;
            for (byte b2 : (byte[]) obj) {
                i2 = (i2 * 31) + b2;
            }
            if (i2 == 0) {
                return 1;
            }
            return i2;
        } else if (!(obj instanceof r5)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        if (!this.f3645h) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        b();
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
            i2 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i2;
    }

    public final V put(K k2, V v) {
        b();
        Charset charset = w5.a;
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v);
        return super.put(k2, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        b();
        for (Object next : map.keySet()) {
            Charset charset = w5.a;
            Objects.requireNonNull(next);
            Objects.requireNonNull(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        b();
        return super.remove(obj);
    }
}
