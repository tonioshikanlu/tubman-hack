package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    private HashMap<K, SafeIterableMap.Entry<K, V>> mHashMap = new HashMap<>();

    public Map.Entry<K, V> ceil(K k2) {
        if (contains(k2)) {
            return this.mHashMap.get(k2).mPrevious;
        }
        return null;
    }

    public boolean contains(K k2) {
        return this.mHashMap.containsKey(k2);
    }

    public SafeIterableMap.Entry<K, V> get(K k2) {
        return this.mHashMap.get(k2);
    }

    public V putIfAbsent(@NonNull K k2, @NonNull V v) {
        SafeIterableMap.Entry entry = get(k2);
        if (entry != null) {
            return entry.mValue;
        }
        this.mHashMap.put(k2, put(k2, v));
        return null;
    }

    public V remove(@NonNull K k2) {
        V remove = super.remove(k2);
        this.mHashMap.remove(k2);
        return remove;
    }
}
