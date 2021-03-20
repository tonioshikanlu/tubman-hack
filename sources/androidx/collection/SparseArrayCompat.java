package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SparseArrayCompat<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public SparseArrayCompat() {
        this(10);
    }

    public SparseArrayCompat(int i2) {
        this.mGarbage = false;
        if (i2 == 0) {
            this.mKeys = ContainerHelpers.EMPTY_INTS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
            return;
        }
        int idealIntArraySize = ContainerHelpers.idealIntArraySize(i2);
        this.mKeys = new int[idealIntArraySize];
        this.mValues = new Object[idealIntArraySize];
    }

    private void gc() {
        int i2 = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != DELETED) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.mGarbage = false;
        this.mSize = i3;
    }

    public void append(int i2, E e2) {
        int i3 = this.mSize;
        if (i3 == 0 || i2 > this.mKeys[i3 - 1]) {
            if (this.mGarbage && i3 >= this.mKeys.length) {
                gc();
            }
            int i4 = this.mSize;
            if (i4 >= this.mKeys.length) {
                int idealIntArraySize = ContainerHelpers.idealIntArraySize(i4 + 1);
                int[] iArr = new int[idealIntArraySize];
                Object[] objArr = new Object[idealIntArraySize];
                int[] iArr2 = this.mKeys;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.mValues;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.mKeys = iArr;
                this.mValues = objArr;
            }
            this.mKeys[i4] = i2;
            this.mValues[i4] = e2;
            this.mSize = i4 + 1;
            return;
        }
        put(i2, e2);
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

    public SparseArrayCompat<E> clone() {
        try {
            SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.mKeys = (int[]) this.mKeys.clone();
            sparseArrayCompat.mValues = (Object[]) this.mValues.clone();
            return sparseArrayCompat;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean containsKey(int i2) {
        return indexOfKey(i2) >= 0;
    }

    public boolean containsValue(E e2) {
        return indexOfValue(e2) >= 0;
    }

    @Deprecated
    public void delete(int i2) {
        remove(i2);
    }

    @Nullable
    public E get(int i2) {
        return get(i2, (Object) null);
    }

    public E get(int i2, E e2) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i2);
        if (binarySearch >= 0) {
            E[] eArr = this.mValues;
            if (eArr[binarySearch] != DELETED) {
                return eArr[binarySearch];
            }
        }
        return e2;
    }

    public int indexOfKey(int i2) {
        if (this.mGarbage) {
            gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, i2);
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

    public int keyAt(int i2) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i2];
    }

    public void put(int i2, E e2) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i2);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e2;
            return;
        }
        int i3 = ~binarySearch;
        int i4 = this.mSize;
        if (i3 < i4) {
            Object[] objArr = this.mValues;
            if (objArr[i3] == DELETED) {
                this.mKeys[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.mGarbage && i4 >= this.mKeys.length) {
            gc();
            i3 = ~ContainerHelpers.binarySearch(this.mKeys, this.mSize, i2);
        }
        int i5 = this.mSize;
        if (i5 >= this.mKeys.length) {
            int idealIntArraySize = ContainerHelpers.idealIntArraySize(i5 + 1);
            int[] iArr = new int[idealIntArraySize];
            Object[] objArr2 = new Object[idealIntArraySize];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = iArr;
            this.mValues = objArr2;
        }
        int i6 = this.mSize;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.mKeys;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i3, objArr4, i7, this.mSize - i3);
        }
        this.mKeys[i3] = i2;
        this.mValues[i3] = e2;
        this.mSize++;
    }

    public void putAll(@NonNull SparseArrayCompat<? extends E> sparseArrayCompat) {
        int size = sparseArrayCompat.size();
        for (int i2 = 0; i2 < size; i2++) {
            put(sparseArrayCompat.keyAt(i2), sparseArrayCompat.valueAt(i2));
        }
    }

    @Nullable
    public E putIfAbsent(int i2, E e2) {
        E e3 = get(i2);
        if (e3 == null) {
            put(i2, e2);
        }
        return e3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.mValues;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void remove(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.mKeys
            int r1 = r3.mSize
            int r4 = androidx.collection.ContainerHelpers.binarySearch((int[]) r0, (int) r1, (int) r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.mValues
            r1 = r0[r4]
            java.lang.Object r2 = DELETED
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.mGarbage = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SparseArrayCompat.remove(int):void");
    }

    public boolean remove(int i2, Object obj) {
        int indexOfKey = indexOfKey(i2);
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

    public void removeAtRange(int i2, int i3) {
        int min = Math.min(this.mSize, i3 + i2);
        while (i2 < min) {
            removeAt(i2);
            i2++;
        }
    }

    @Nullable
    public E replace(int i2, E e2) {
        int indexOfKey = indexOfKey(i2);
        if (indexOfKey < 0) {
            return null;
        }
        E[] eArr = this.mValues;
        E e3 = eArr[indexOfKey];
        eArr[indexOfKey] = e2;
        return e3;
    }

    public boolean replace(int i2, E e2, E e3) {
        int indexOfKey = indexOfKey(i2);
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
