package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    @Nullable
    public MapCollections<K, V> mCollections;

    public ArrayMap() {
    }

    public ArrayMap(int i2) {
        super(i2);
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    private MapCollections<K, V> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new MapCollections<K, V>() {
                public void colClear() {
                    ArrayMap.this.clear();
                }

                public Object colGetEntry(int i2, int i3) {
                    return ArrayMap.this.mArray[(i2 << 1) + i3];
                }

                public Map<K, V> colGetMap() {
                    return ArrayMap.this;
                }

                public int colGetSize() {
                    return ArrayMap.this.mSize;
                }

                public int colIndexOfKey(Object obj) {
                    return ArrayMap.this.indexOfKey(obj);
                }

                public int colIndexOfValue(Object obj) {
                    return ArrayMap.this.indexOfValue(obj);
                }

                public void colPut(K k2, V v) {
                    ArrayMap.this.put(k2, v);
                }

                public void colRemoveAt(int i2) {
                    ArrayMap.this.removeAt(i2);
                }

                public V colSetValue(int i2, V v) {
                    return ArrayMap.this.setValueAt(i2, v);
                }
            };
        }
        return this.mCollections;
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        return MapCollections.containsAllHelper(this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return getCollection().getEntrySet();
    }

    public Set<K> keySet() {
        return getCollection().getKeySet();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(map.size() + this.mSize);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        return MapCollections.removeAllHelper(this, collection);
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        return MapCollections.retainAllHelper(this, collection);
    }

    public Collection<V> values() {
        return getCollection().getValues();
    }
}
