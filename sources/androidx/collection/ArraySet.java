package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ArraySet<E> implements Collection<E>, Set<E> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final int[] INT = new int[0];
    private static final Object[] OBJECT = new Object[0];
    private static final String TAG = "ArraySet";
    @Nullable
    private static Object[] sBaseCache;
    private static int sBaseCacheSize;
    @Nullable
    private static Object[] sTwiceBaseCache;
    private static int sTwiceBaseCacheSize;
    public Object[] mArray;
    private MapCollections<E, E> mCollections;
    private int[] mHashes;
    public int mSize;

    public ArraySet() {
        this(0);
    }

    public ArraySet(int i2) {
        if (i2 == 0) {
            this.mHashes = INT;
            this.mArray = OBJECT;
        } else {
            allocArrays(i2);
        }
        this.mSize = 0;
    }

    public ArraySet(@Nullable ArraySet<E> arraySet) {
        this();
        if (arraySet != null) {
            addAll(arraySet);
        }
    }

    public ArraySet(@Nullable Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    private void allocArrays(int i2) {
        if (i2 == 8) {
            synchronized (ArraySet.class) {
                Object[] objArr = sTwiceBaseCache;
                if (objArr != null) {
                    this.mArray = objArr;
                    sTwiceBaseCache = (Object[]) objArr[0];
                    this.mHashes = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    sTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (ArraySet.class) {
                Object[] objArr2 = sBaseCache;
                if (objArr2 != null) {
                    this.mArray = objArr2;
                    sBaseCache = (Object[]) objArr2[0];
                    this.mHashes = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    sBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[i2];
        this.mArray = new Object[i2];
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (ArraySet.class) {
                if (sTwiceBaseCacheSize < 10) {
                    objArr[0] = sTwiceBaseCache;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    sTwiceBaseCache = objArr;
                    sTwiceBaseCacheSize++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ArraySet.class) {
                if (sBaseCacheSize < 10) {
                    objArr[0] = sBaseCache;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    sBaseCache = objArr;
                    sBaseCacheSize++;
                }
            }
        }
    }

    private MapCollections<E, E> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new MapCollections<E, E>() {
                public void colClear() {
                    ArraySet.this.clear();
                }

                public Object colGetEntry(int i2, int i3) {
                    return ArraySet.this.mArray[i2];
                }

                public Map<E, E> colGetMap() {
                    throw new UnsupportedOperationException("not a map");
                }

                public int colGetSize() {
                    return ArraySet.this.mSize;
                }

                public int colIndexOfKey(Object obj) {
                    return ArraySet.this.indexOf(obj);
                }

                public int colIndexOfValue(Object obj) {
                    return ArraySet.this.indexOf(obj);
                }

                public void colPut(E e2, E e3) {
                    ArraySet.this.add(e2);
                }

                public void colRemoveAt(int i2) {
                    ArraySet.this.removeAt(i2);
                }

                public E colSetValue(int i2, E e2) {
                    throw new UnsupportedOperationException("not a map");
                }
            };
        }
        return this.mCollections;
    }

    private int indexOf(Object obj, int i2) {
        int i3 = this.mSize;
        if (i3 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpers.binarySearch(this.mHashes, i3, i2);
        if (binarySearch < 0 || obj.equals(this.mArray[binarySearch])) {
            return binarySearch;
        }
        int i4 = binarySearch + 1;
        while (i4 < i3 && this.mHashes[i4] == i2) {
            if (obj.equals(this.mArray[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = binarySearch - 1;
        while (i5 >= 0 && this.mHashes[i5] == i2) {
            if (obj.equals(this.mArray[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    private int indexOfNull() {
        int i2 = this.mSize;
        if (i2 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpers.binarySearch(this.mHashes, i2, 0);
        if (binarySearch < 0 || this.mArray[binarySearch] == null) {
            return binarySearch;
        }
        int i3 = binarySearch + 1;
        while (i3 < i2 && this.mHashes[i3] == 0) {
            if (this.mArray[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = binarySearch - 1;
        while (i4 >= 0 && this.mHashes[i4] == 0) {
            if (this.mArray[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean add(@Nullable E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = indexOfNull();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = indexOf(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.mSize;
        int[] iArr = this.mHashes;
        if (i5 >= iArr.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.mArray;
            allocArrays(i6);
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.mArray, 0, objArr.length);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
        int i7 = this.mSize;
        if (i4 < i7) {
            int[] iArr3 = this.mHashes;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.mArray;
            System.arraycopy(objArr2, i4, objArr2, i8, this.mSize - i4);
        }
        this.mHashes[i4] = i2;
        this.mArray[i4] = e2;
        this.mSize++;
        return true;
    }

    public void addAll(@NonNull ArraySet<? extends E> arraySet) {
        int i2 = arraySet.mSize;
        ensureCapacity(this.mSize + i2);
        if (this.mSize != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                add(arraySet.valueAt(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(arraySet.mHashes, 0, this.mHashes, 0, i2);
            System.arraycopy(arraySet.mArray, 0, this.mArray, 0, i2);
            this.mSize = i2;
        }
    }

    public boolean addAll(@NonNull Collection<? extends E> collection) {
        ensureCapacity(collection.size() + this.mSize);
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i2 = this.mSize;
        if (i2 != 0) {
            freeArrays(this.mHashes, this.mArray, i2);
            this.mHashes = INT;
            this.mArray = OBJECT;
            this.mSize = 0;
        }
    }

    public boolean contains(@Nullable Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public void ensureCapacity(int i2) {
        int[] iArr = this.mHashes;
        if (iArr.length < i2) {
            Object[] objArr = this.mArray;
            allocArrays(i2);
            int i3 = this.mSize;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i3);
                System.arraycopy(objArr, 0, this.mArray, 0, this.mSize);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.mSize) {
                try {
                    if (!set.contains(valueAt(i2))) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.mHashes;
        int i2 = this.mSize;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(@Nullable Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    public Iterator<E> iterator() {
        return getCollection().getKeySet().iterator();
    }

    public boolean remove(@Nullable Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public boolean removeAll(@NonNull ArraySet<? extends E> arraySet) {
        int i2 = arraySet.mSize;
        int i3 = this.mSize;
        for (int i4 = 0; i4 < i2; i4++) {
            remove(arraySet.valueAt(i4));
        }
        return i3 != this.mSize;
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public E removeAt(int i2) {
        E[] eArr = this.mArray;
        E e2 = eArr[i2];
        int i3 = this.mSize;
        if (i3 <= 1) {
            freeArrays(this.mHashes, eArr, i3);
            this.mHashes = INT;
            this.mArray = OBJECT;
            this.mSize = 0;
        } else {
            int[] iArr = this.mHashes;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.mSize = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr = this.mArray;
                    System.arraycopy(objArr, i6, objArr, i2, this.mSize - i2);
                }
                this.mArray[this.mSize] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                allocArrays(i4);
                this.mSize--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.mHashes, 0, i2);
                    System.arraycopy(eArr, 0, this.mArray, 0, i2);
                }
                int i7 = this.mSize;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.mHashes, i2, i7 - i2);
                    System.arraycopy(eArr, i8, this.mArray, i2, this.mSize - i2);
                }
            }
        }
        return e2;
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.mSize - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.mArray[i2])) {
                removeAt(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.mSize;
    }

    @NonNull
    public Object[] toArray() {
        int i2 = this.mSize;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.mArray, 0, objArr, 0, i2);
        return objArr;
    }

    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.mSize) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.mSize);
        }
        System.arraycopy(this.mArray, 0, tArr, 0, this.mSize);
        int length = tArr.length;
        int i2 = this.mSize;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.mSize; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Nullable
    public E valueAt(int i2) {
        return this.mArray[i2];
    }
}
