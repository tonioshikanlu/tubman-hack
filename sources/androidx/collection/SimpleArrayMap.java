package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class SimpleArrayMap<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";
    @Nullable
    public static Object[] mBaseCache;
    public static int mBaseCacheSize;
    @Nullable
    public static Object[] mTwiceBaseCache;
    public static int mTwiceBaseCacheSize;
    public Object[] mArray;
    public int[] mHashes;
    public int mSize;

    public SimpleArrayMap() {
        this.mHashes = ContainerHelpers.EMPTY_INTS;
        this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }

    public SimpleArrayMap(int i2) {
        if (i2 == 0) {
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            allocArrays(i2);
        }
        this.mSize = 0;
    }

    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this();
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }

    private void allocArrays(int i2) {
        Class<SimpleArrayMap> cls = SimpleArrayMap.class;
        if (i2 == 8) {
            synchronized (cls) {
                Object[] objArr = mTwiceBaseCache;
                if (objArr != null) {
                    this.mArray = objArr;
                    mTwiceBaseCache = (Object[]) objArr[0];
                    this.mHashes = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    mTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (cls) {
                Object[] objArr2 = mBaseCache;
                if (objArr2 != null) {
                    this.mArray = objArr2;
                    mBaseCache = (Object[]) objArr2[0];
                    this.mHashes = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    mBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[i2];
        this.mArray = new Object[(i2 << 1)];
    }

    private static int binarySearchHashes(int[] iArr, int i2, int i3) {
        try {
            return ContainerHelpers.binarySearch(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i2) {
        Class<SimpleArrayMap> cls = SimpleArrayMap.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (mTwiceBaseCacheSize < 10) {
                    objArr[0] = mTwiceBaseCache;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    mTwiceBaseCache = objArr;
                    mTwiceBaseCacheSize++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (mBaseCacheSize < 10) {
                    objArr[0] = mBaseCache;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    mBaseCache = objArr;
                    mBaseCacheSize++;
                }
            }
        }
    }

    public void clear() {
        int i2 = this.mSize;
        if (i2 > 0) {
            int[] iArr = this.mHashes;
            Object[] objArr = this.mArray;
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
            freeArrays(iArr, objArr, i2);
        }
        if (this.mSize > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@Nullable Object obj) {
        return indexOfKey(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return indexOfValue(obj) >= 0;
    }

    public void ensureCapacity(int i2) {
        int i3 = this.mSize;
        int[] iArr = this.mHashes;
        if (iArr.length < i2) {
            Object[] objArr = this.mArray;
            allocArrays(i2);
            if (this.mSize > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i3);
                System.arraycopy(objArr, 0, this.mArray, 0, i3 << 1);
            }
            freeArrays(iArr, objArr, i3);
        }
        if (this.mSize != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleArrayMap) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
            if (size() != simpleArrayMap.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.mSize) {
                try {
                    Object keyAt = keyAt(i2);
                    Object valueAt = valueAt(i2);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!valueAt.equals(obj2)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.mSize) {
                try {
                    Object keyAt2 = keyAt(i3);
                    Object valueAt2 = valueAt(i3);
                    Object obj3 = map.get(keyAt2);
                    if (valueAt2 == null) {
                        if (obj3 != null || !map.containsKey(keyAt2)) {
                            return false;
                        }
                    } else if (!valueAt2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @Nullable
    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? this.mArray[(indexOfKey << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.mHashes;
        Object[] objArr = this.mArray;
        int i2 = this.mSize;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public int indexOf(Object obj, int i2) {
        int i3 = this.mSize;
        if (i3 == 0) {
            return -1;
        }
        int binarySearchHashes = binarySearchHashes(this.mHashes, i3, i2);
        if (binarySearchHashes < 0 || obj.equals(this.mArray[binarySearchHashes << 1])) {
            return binarySearchHashes;
        }
        int i4 = binarySearchHashes + 1;
        while (i4 < i3 && this.mHashes[i4] == i2) {
            if (obj.equals(this.mArray[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        int i5 = binarySearchHashes - 1;
        while (i5 >= 0 && this.mHashes[i5] == i2) {
            if (obj.equals(this.mArray[i5 << 1])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public int indexOfKey(@Nullable Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    public int indexOfNull() {
        int i2 = this.mSize;
        if (i2 == 0) {
            return -1;
        }
        int binarySearchHashes = binarySearchHashes(this.mHashes, i2, 0);
        if (binarySearchHashes < 0 || this.mArray[binarySearchHashes << 1] == null) {
            return binarySearchHashes;
        }
        int i3 = binarySearchHashes + 1;
        while (i3 < i2 && this.mHashes[i3] == 0) {
            if (this.mArray[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = binarySearchHashes - 1;
        while (i4 >= 0 && this.mHashes[i4] == 0) {
            if (this.mArray[i4 << 1] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public int indexOfValue(Object obj) {
        int i2 = this.mSize * 2;
        Object[] objArr = this.mArray;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    public K keyAt(int i2) {
        return this.mArray[i2 << 1];
    }

    @Nullable
    public V put(K k2, V v) {
        int i2;
        int i3;
        int i4 = this.mSize;
        if (k2 == null) {
            i3 = indexOfNull();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            i3 = indexOf(k2, hashCode);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            V[] vArr = this.mArray;
            V v2 = vArr[i5];
            vArr[i5] = v;
            return v2;
        }
        int i6 = ~i3;
        int[] iArr = this.mHashes;
        if (i4 >= iArr.length) {
            int i7 = 4;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i7 = 8;
            }
            Object[] objArr = this.mArray;
            allocArrays(i7);
            if (i4 == this.mSize) {
                int[] iArr2 = this.mHashes;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.mArray, 0, objArr.length);
                }
                freeArrays(iArr, objArr, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.mHashes;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr2 = this.mArray;
            System.arraycopy(objArr2, i6 << 1, objArr2, i8 << 1, (this.mSize - i6) << 1);
        }
        int i9 = this.mSize;
        if (i4 == i9) {
            int[] iArr4 = this.mHashes;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr3 = this.mArray;
                int i10 = i6 << 1;
                objArr3[i10] = k2;
                objArr3[i10 + 1] = v;
                this.mSize = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@NonNull SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i2 = simpleArrayMap.mSize;
        ensureCapacity(this.mSize + i2);
        if (this.mSize != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(simpleArrayMap.keyAt(i3), simpleArrayMap.valueAt(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(simpleArrayMap.mHashes, 0, this.mHashes, 0, i2);
            System.arraycopy(simpleArrayMap.mArray, 0, this.mArray, 0, i2 << 1);
            this.mSize = i2;
        }
    }

    @Nullable
    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        return v2 == null ? put(k2, v) : v2;
    }

    @Nullable
    public V remove(Object obj) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey < 0) {
            return false;
        }
        Object valueAt = valueAt(indexOfKey);
        if (obj2 != valueAt && (obj2 == null || !obj2.equals(valueAt))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public V removeAt(int i2) {
        V[] vArr = this.mArray;
        int i3 = i2 << 1;
        V v = vArr[i3 + 1];
        int i4 = this.mSize;
        int i5 = 0;
        if (i4 <= 1) {
            freeArrays(this.mHashes, vArr, i4);
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.mHashes;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr = this.mArray;
                    System.arraycopy(objArr, i8 << 1, objArr, i3, i9 << 1);
                }
                Object[] objArr2 = this.mArray;
                int i10 = i6 << 1;
                objArr2[i10] = null;
                objArr2[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                allocArrays(i7);
                if (i4 == this.mSize) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.mHashes, 0, i2);
                        System.arraycopy(vArr, 0, this.mArray, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr, i11, this.mHashes, i2, i12);
                        System.arraycopy(vArr, i11 << 1, this.mArray, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.mSize) {
            this.mSize = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    @Nullable
    public V replace(K k2, V v) {
        int indexOfKey = indexOfKey(k2);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v);
        }
        return null;
    }

    public boolean replace(K k2, V v, V v2) {
        int indexOfKey = indexOfKey(k2);
        if (indexOfKey < 0) {
            return false;
        }
        V valueAt = valueAt(indexOfKey);
        if (valueAt != v && (v == null || !v.equals(valueAt))) {
            return false;
        }
        setValueAt(indexOfKey, v2);
        return true;
    }

    public V setValueAt(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        V[] vArr = this.mArray;
        V v2 = vArr[i3];
        vArr[i3] = v;
        return v2;
    }

    public int size() {
        return this.mSize;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.mSize; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object keyAt = keyAt(i2);
            if (keyAt != this) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public V valueAt(int i2) {
        return this.mArray[(i2 << 1) + 1];
    }
}
