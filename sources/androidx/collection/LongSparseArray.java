package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LongSparseArray<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private long[] mKeys;
    private int mSize;
    private Object[] mValues;

    public LongSparseArray() {
        this(10);
    }

    public LongSparseArray(int i2) {
        this.mGarbage = false;
        if (i2 == 0) {
            this.mKeys = ContainerHelpers.EMPTY_LONGS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
            return;
        }
        int idealLongArraySize = ContainerHelpers.idealLongArraySize(i2);
        this.mKeys = new long[idealLongArraySize];
        this.mValues = new Object[idealLongArraySize];
    }

    private void gc() {
        int i2 = this.mSize;
        long[] jArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != DELETED) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.mGarbage = false;
        this.mSize = i3;
    }

    public void append(long j2, E e2) {
        int i2 = this.mSize;
        if (i2 == 0 || j2 > this.mKeys[i2 - 1]) {
            if (this.mGarbage && i2 >= this.mKeys.length) {
                gc();
            }
            int i3 = this.mSize;
            if (i3 >= this.mKeys.length) {
                int idealLongArraySize = ContainerHelpers.idealLongArraySize(i3 + 1);
                long[] jArr = new long[idealLongArraySize];
                Object[] objArr = new Object[idealLongArraySize];
                long[] jArr2 = this.mKeys;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.mValues;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.mKeys = jArr;
                this.mValues = objArr;
            }
            this.mKeys[i3] = j2;
            this.mValues[i3] = e2;
            this.mSize = i3 + 1;
            return;
        }
        put(j2, e2);
    }

    public void clear() {
        int i2 = this.mSize;
        Object[] objArr = this.mValues;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public LongSparseArray<E> clone() {
        try {
            LongSparseArray<E> longSparseArray = (LongSparseArray) super.clone();
            longSparseArray.mKeys = (long[]) this.mKeys.clone();
            longSparseArray.mValues = (Object[]) this.mValues.clone();
            return longSparseArray;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean containsKey(long j2) {
        return indexOfKey(j2) >= 0;
    }

    public boolean containsValue(E e2) {
        return indexOfValue(e2) >= 0;
    }

    @Deprecated
    public void delete(long j2) {
        remove(j2);
    }

    @Nullable
    public E get(long j2) {
        return get(j2, (Object) null);
    }

    public E get(long j2, E e2) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j2);
        if (binarySearch >= 0) {
            E[] eArr = this.mValues;
            if (eArr[binarySearch] != DELETED) {
                return eArr[binarySearch];
            }
        }
        return e2;
    }

    public int indexOfKey(long j2) {
        if (this.mGarbage) {
            gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, j2);
    }

    public int indexOfValue(E e2) {
        if (this.mGarbage) {
            gc();
        }
        for (int i2 = 0; i2 < this.mSize; i2++) {
            if (this.mValues[i2] == e2) {
                return i2;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i2) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i2];
    }

    public void put(long j2, E e2) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j2);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e2;
            return;
        }
        int i2 = ~binarySearch;
        int i3 = this.mSize;
        if (i2 < i3) {
            Object[] objArr = this.mValues;
            if (objArr[i2] == DELETED) {
                this.mKeys[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.mGarbage && i3 >= this.mKeys.length) {
            gc();
            i2 = ~ContainerHelpers.binarySearch(this.mKeys, this.mSize, j2);
        }
        int i4 = this.mSize;
        if (i4 >= this.mKeys.length) {
            int idealLongArraySize = ContainerHelpers.idealLongArraySize(i4 + 1);
            long[] jArr = new long[idealLongArraySize];
            Object[] objArr2 = new Object[idealLongArraySize];
            long[] jArr2 = this.mKeys;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = jArr;
            this.mValues = objArr2;
        }
        int i5 = this.mSize;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.mKeys;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i2, objArr4, i6, this.mSize - i2);
        }
        this.mKeys[i2] = j2;
        this.mValues[i2] = e2;
        this.mSize++;
    }

    public void putAll(@NonNull LongSparseArray<? extends E> longSparseArray) {
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            put(longSparseArray.keyAt(i2), longSparseArray.valueAt(i2));
        }
    }

    @Nullable
    public E putIfAbsent(long j2, E e2) {
        E e3 = get(j2);
        if (e3 == null) {
            put(j2, e2);
        }
        return e3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.mValues;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void remove(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.mKeys
            int r1 = r2.mSize
            int r3 = androidx.collection.ContainerHelpers.binarySearch((long[]) r0, (int) r1, (long) r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.mValues
            r0 = r4[r3]
            java.lang.Object r1 = DELETED
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.mGarbage = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSparseArray.remove(long):void");
    }

    public boolean remove(long j2, Object obj) {
        int indexOfKey = indexOfKey(j2);
        if (indexOfKey < 0) {
            return false;
        }
        Object valueAt = valueAt(indexOfKey);
        if (obj != valueAt && (obj == null || !obj.equals(valueAt))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public void removeAt(int i2) {
        Object[] objArr = this.mValues;
        Object obj = objArr[i2];
        Object obj2 = DELETED;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.mGarbage = true;
        }
    }

    @Nullable
    public E replace(long j2, E e2) {
        int indexOfKey = indexOfKey(j2);
        if (indexOfKey < 0) {
            return null;
        }
        E[] eArr = this.mValues;
        E e3 = eArr[indexOfKey];
        eArr[indexOfKey] = e2;
        return e3;
    }

    public boolean replace(long j2, E e2, E e3) {
        int indexOfKey = indexOfKey(j2);
        if (indexOfKey < 0) {
            return false;
        }
        E e4 = this.mValues[indexOfKey];
        if (e4 != e2 && (e2 == null || !e2.equals(e4))) {
            return false;
        }
        this.mValues[indexOfKey] = e3;
        return true;
    }

    public void setValueAt(int i2, E e2) {
        if (this.mGarbage) {
            gc();
        }
        this.mValues[i2] = e2;
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.mSize; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i2));
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

    public E valueAt(int i2) {
        if (this.mGarbage) {
            gc();
        }
        return this.mValues[i2];
    }
}
