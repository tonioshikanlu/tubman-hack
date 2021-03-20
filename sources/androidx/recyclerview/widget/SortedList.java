package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class SortedList<T> {
    private static final int CAPACITY_GROWTH = 10;
    private static final int DELETION = 2;
    private static final int INSERTION = 1;
    public static final int INVALID_POSITION = -1;
    private static final int LOOKUP = 4;
    private static final int MIN_CAPACITY = 10;
    private BatchedCallback mBatchedCallback;
    private Callback mCallback;
    public T[] mData;
    private int mNewDataStart;
    private T[] mOldData;
    private int mOldDataSize;
    private int mOldDataStart;
    private int mSize;
    private final Class<T> mTClass;

    public static class BatchedCallback<T2> extends Callback<T2> {
        private final BatchingListUpdateCallback mBatchingListUpdateCallback;
        public final Callback<T2> mWrappedCallback;

        public BatchedCallback(Callback<T2> callback) {
            this.mWrappedCallback = callback;
            this.mBatchingListUpdateCallback = new BatchingListUpdateCallback(callback);
        }

        public boolean areContentsTheSame(T2 t2, T2 t22) {
            return this.mWrappedCallback.areContentsTheSame(t2, t22);
        }

        public boolean areItemsTheSame(T2 t2, T2 t22) {
            return this.mWrappedCallback.areItemsTheSame(t2, t22);
        }

        public int compare(T2 t2, T2 t22) {
            return this.mWrappedCallback.compare(t2, t22);
        }

        public void dispatchLastEvent() {
            this.mBatchingListUpdateCallback.dispatchLastEvent();
        }

        @Nullable
        public Object getChangePayload(T2 t2, T2 t22) {
            return this.mWrappedCallback.getChangePayload(t2, t22);
        }

        public void onChanged(int i2, int i3) {
            this.mBatchingListUpdateCallback.onChanged(i2, i3, (Object) null);
        }

        public void onChanged(int i2, int i3, Object obj) {
            this.mBatchingListUpdateCallback.onChanged(i2, i3, obj);
        }

        public void onInserted(int i2, int i3) {
            this.mBatchingListUpdateCallback.onInserted(i2, i3);
        }

        public void onMoved(int i2, int i3) {
            this.mBatchingListUpdateCallback.onMoved(i2, i3);
        }

        public void onRemoved(int i2, int i3) {
            this.mBatchingListUpdateCallback.onRemoved(i2, i3);
        }
    }

    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t2, T2 t22);

        public abstract boolean areItemsTheSame(T2 t2, T2 t22);

        public abstract int compare(T2 t2, T2 t22);

        @Nullable
        public Object getChangePayload(T2 t2, T2 t22) {
            return null;
        }

        public abstract void onChanged(int i2, int i3);

        public void onChanged(int i2, int i3, Object obj) {
            onChanged(i2, i3);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback) {
        this(cls, callback, 10);
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i2) {
        this.mTClass = cls;
        this.mData = (Object[]) Array.newInstance(cls, i2);
        this.mCallback = callback;
        this.mSize = 0;
    }

    private int add(T t, boolean z) {
        int findIndexOf = findIndexOf(t, this.mData, 0, this.mSize, 1);
        if (findIndexOf == -1) {
            findIndexOf = 0;
        } else if (findIndexOf < this.mSize) {
            T t2 = this.mData[findIndexOf];
            if (this.mCallback.areItemsTheSame(t2, t)) {
                if (this.mCallback.areContentsTheSame(t2, t)) {
                    this.mData[findIndexOf] = t;
                    return findIndexOf;
                }
                this.mData[findIndexOf] = t;
                Callback callback = this.mCallback;
                callback.onChanged(findIndexOf, 1, callback.getChangePayload(t2, t));
                return findIndexOf;
            }
        }
        addToData(findIndexOf, t);
        if (z) {
            this.mCallback.onInserted(findIndexOf, 1);
        }
        return findIndexOf;
    }

    private void addAllInternal(T[] tArr) {
        if (tArr.length >= 1) {
            int sortAndDedup = sortAndDedup(tArr);
            if (this.mSize == 0) {
                this.mData = tArr;
                this.mSize = sortAndDedup;
                this.mCallback.onInserted(0, sortAndDedup);
                return;
            }
            merge(tArr, sortAndDedup);
        }
    }

    private void addToData(int i2, T t) {
        int i3 = this.mSize;
        if (i2 <= i3) {
            T[] tArr = this.mData;
            if (i3 == tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(this.mTClass, tArr.length + 10);
                System.arraycopy(this.mData, 0, tArr2, 0, i2);
                tArr2[i2] = t;
                System.arraycopy(this.mData, i2, tArr2, i2 + 1, this.mSize - i2);
                this.mData = tArr2;
            } else {
                System.arraycopy(tArr, i2, tArr, i2 + 1, i3 - i2);
                this.mData[i2] = t;
            }
            this.mSize++;
            return;
        }
        StringBuilder z = a.z("cannot add item to ", i2, " because size is ");
        z.append(this.mSize);
        throw new IndexOutOfBoundsException(z.toString());
    }

    private T[] copyArray(T[] tArr) {
        T[] tArr2 = (Object[]) Array.newInstance(this.mTClass, tArr.length);
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int findIndexOf(T t, T[] tArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            int i5 = (i2 + i3) / 2;
            T t2 = tArr[i5];
            int compare = this.mCallback.compare(t2, t);
            if (compare < 0) {
                i2 = i5 + 1;
            } else if (compare != 0) {
                i3 = i5;
            } else if (this.mCallback.areItemsTheSame(t2, t)) {
                return i5;
            } else {
                int linearEqualitySearch = linearEqualitySearch(t, i5, i2, i3);
                return i4 == 1 ? linearEqualitySearch == -1 ? i5 : linearEqualitySearch : linearEqualitySearch;
            }
        }
        if (i4 == 1) {
            return i2;
        }
        return -1;
    }

    private int findSameItem(T t, T[] tArr, int i2, int i3) {
        while (i2 < i3) {
            if (this.mCallback.areItemsTheSame(tArr[i2], t)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private int linearEqualitySearch(T t, int i2, int i3, int i4) {
        T t2;
        int i5 = i2 - 1;
        while (i5 >= i3) {
            T t3 = this.mData[i5];
            if (this.mCallback.compare(t3, t) != 0) {
                break;
            } else if (this.mCallback.areItemsTheSame(t3, t)) {
                return i5;
            } else {
                i5--;
            }
        }
        do {
            i2++;
            if (i2 >= i4) {
                return -1;
            }
            t2 = this.mData[i2];
            if (this.mCallback.compare(t2, t) != 0) {
                return -1;
            }
        } while (!this.mCallback.areItemsTheSame(t2, t));
        return i2;
    }

    private void merge(T[] tArr, int i2) {
        boolean z = !(this.mCallback instanceof BatchedCallback);
        if (z) {
            beginBatchedUpdates();
        }
        this.mOldData = this.mData;
        int i3 = 0;
        this.mOldDataStart = 0;
        int i4 = this.mSize;
        this.mOldDataSize = i4;
        this.mData = (Object[]) Array.newInstance(this.mTClass, i4 + i2 + 10);
        this.mNewDataStart = 0;
        while (true) {
            int i5 = this.mOldDataStart;
            int i6 = this.mOldDataSize;
            if (i5 >= i6 && i3 >= i2) {
                break;
            } else if (i5 == i6) {
                int i7 = i2 - i3;
                System.arraycopy(tArr, i3, this.mData, this.mNewDataStart, i7);
                int i8 = this.mNewDataStart + i7;
                this.mNewDataStart = i8;
                this.mSize += i7;
                this.mCallback.onInserted(i8 - i7, i7);
                break;
            } else if (i3 == i2) {
                int i9 = i6 - i5;
                System.arraycopy(this.mOldData, i5, this.mData, this.mNewDataStart, i9);
                this.mNewDataStart += i9;
                break;
            } else {
                T t = this.mOldData[i5];
                T t2 = tArr[i3];
                int compare = this.mCallback.compare(t, t2);
                if (compare > 0) {
                    T[] tArr2 = this.mData;
                    int i10 = this.mNewDataStart;
                    int i11 = i10 + 1;
                    this.mNewDataStart = i11;
                    tArr2[i10] = t2;
                    this.mSize++;
                    i3++;
                    this.mCallback.onInserted(i11 - 1, 1);
                } else if (compare != 0 || !this.mCallback.areItemsTheSame(t, t2)) {
                    T[] tArr3 = this.mData;
                    int i12 = this.mNewDataStart;
                    this.mNewDataStart = i12 + 1;
                    tArr3[i12] = t;
                    this.mOldDataStart++;
                } else {
                    T[] tArr4 = this.mData;
                    int i13 = this.mNewDataStart;
                    this.mNewDataStart = i13 + 1;
                    tArr4[i13] = t2;
                    i3++;
                    this.mOldDataStart++;
                    if (!this.mCallback.areContentsTheSame(t, t2)) {
                        Callback callback = this.mCallback;
                        callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t, t2));
                    }
                }
            }
        }
        this.mOldData = null;
        if (z) {
            endBatchedUpdates();
        }
    }

    private boolean remove(T t, boolean z) {
        int findIndexOf = findIndexOf(t, this.mData, 0, this.mSize, 2);
        if (findIndexOf == -1) {
            return false;
        }
        removeItemAtIndex(findIndexOf, z);
        return true;
    }

    private void removeItemAtIndex(int i2, boolean z) {
        T[] tArr = this.mData;
        System.arraycopy(tArr, i2 + 1, tArr, i2, (this.mSize - i2) - 1);
        int i3 = this.mSize - 1;
        this.mSize = i3;
        this.mData[i3] = null;
        if (z) {
            this.mCallback.onRemoved(i2, 1);
        }
    }

    private void replaceAllInsert(T t) {
        T[] tArr = this.mData;
        int i2 = this.mNewDataStart;
        tArr[i2] = t;
        int i3 = i2 + 1;
        this.mNewDataStart = i3;
        this.mSize++;
        this.mCallback.onInserted(i3 - 1, 1);
    }

    private void replaceAllInternal(@NonNull T[] tArr) {
        boolean z = !(this.mCallback instanceof BatchedCallback);
        if (z) {
            beginBatchedUpdates();
        }
        this.mOldDataStart = 0;
        this.mOldDataSize = this.mSize;
        this.mOldData = this.mData;
        this.mNewDataStart = 0;
        int sortAndDedup = sortAndDedup(tArr);
        this.mData = (Object[]) Array.newInstance(this.mTClass, sortAndDedup);
        while (true) {
            int i2 = this.mNewDataStart;
            if (i2 >= sortAndDedup && this.mOldDataStart >= this.mOldDataSize) {
                break;
            }
            int i3 = this.mOldDataStart;
            int i4 = this.mOldDataSize;
            if (i3 >= i4) {
                int i5 = sortAndDedup - i2;
                System.arraycopy(tArr, i2, this.mData, i2, i5);
                this.mNewDataStart += i5;
                this.mSize += i5;
                this.mCallback.onInserted(i2, i5);
                break;
            } else if (i2 >= sortAndDedup) {
                int i6 = i4 - i3;
                this.mSize -= i6;
                this.mCallback.onRemoved(i2, i6);
                break;
            } else {
                T t = this.mOldData[i3];
                T t2 = tArr[i2];
                int compare = this.mCallback.compare(t, t2);
                if (compare < 0) {
                    replaceAllRemove();
                } else {
                    if (compare <= 0) {
                        if (!this.mCallback.areItemsTheSame(t, t2)) {
                            replaceAllRemove();
                        } else {
                            T[] tArr2 = this.mData;
                            int i7 = this.mNewDataStart;
                            tArr2[i7] = t2;
                            this.mOldDataStart++;
                            this.mNewDataStart = i7 + 1;
                            if (!this.mCallback.areContentsTheSame(t, t2)) {
                                Callback callback = this.mCallback;
                                callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t, t2));
                            }
                        }
                    }
                    replaceAllInsert(t2);
                }
            }
        }
        this.mOldData = null;
        if (z) {
            endBatchedUpdates();
        }
    }

    private void replaceAllRemove() {
        this.mSize--;
        this.mOldDataStart++;
        this.mCallback.onRemoved(this.mNewDataStart, 1);
    }

    private int sortAndDedup(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.mCallback);
        int i2 = 0;
        int i3 = 1;
        for (int i4 = 1; i4 < tArr.length; i4++) {
            T t = tArr[i4];
            if (this.mCallback.compare(tArr[i2], t) == 0) {
                int findSameItem = findSameItem(t, tArr, i2, i3);
                if (findSameItem != -1) {
                    tArr[findSameItem] = t;
                } else {
                    if (i3 != i4) {
                        tArr[i3] = t;
                    }
                    i3++;
                }
            } else {
                if (i3 != i4) {
                    tArr[i3] = t;
                }
                i2 = i3;
                i3++;
            }
        }
        return i3;
    }

    private void throwIfInMutationOperation() {
        if (this.mOldData != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public int add(T t) {
        throwIfInMutationOperation();
        return add(t, true);
    }

    public void addAll(@NonNull Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance(this.mTClass, collection.size())), true);
    }

    public void addAll(@NonNull T... tArr) {
        addAll(tArr, false);
    }

    public void addAll(@NonNull T[] tArr, boolean z) {
        throwIfInMutationOperation();
        if (tArr.length != 0) {
            if (z) {
                addAllInternal(tArr);
            } else {
                addAllInternal(copyArray(tArr));
            }
        }
    }

    public void beginBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (!(callback instanceof BatchedCallback)) {
            if (this.mBatchedCallback == null) {
                this.mBatchedCallback = new BatchedCallback(callback);
            }
            this.mCallback = this.mBatchedCallback;
        }
    }

    public void clear() {
        throwIfInMutationOperation();
        int i2 = this.mSize;
        if (i2 != 0) {
            Arrays.fill(this.mData, 0, i2, (Object) null);
            this.mSize = 0;
            this.mCallback.onRemoved(0, i2);
        }
    }

    public void endBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.mCallback;
        BatchedCallback batchedCallback = this.mBatchedCallback;
        if (callback2 == batchedCallback) {
            this.mCallback = batchedCallback.mWrappedCallback;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r1 = r3.mNewDataStart;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T get(int r4) {
        /*
            r3 = this;
            int r0 = r3.mSize
            if (r4 >= r0) goto L_0x001a
            if (r4 < 0) goto L_0x001a
            T[] r0 = r3.mOldData
            if (r0 == 0) goto L_0x0015
            int r1 = r3.mNewDataStart
            if (r4 < r1) goto L_0x0015
            int r4 = r4 - r1
            int r1 = r3.mOldDataStart
            int r4 = r4 + r1
            r4 = r0[r4]
            return r4
        L_0x0015:
            T[] r0 = r3.mData
            r4 = r0[r4]
            return r4
        L_0x001a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Asked to get item at "
            java.lang.String r2 = " but size is "
            java.lang.StringBuilder r4 = b.e.a.a.a.z(r1, r4, r2)
            int r1 = r3.mSize
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.SortedList.get(int):java.lang.Object");
    }

    public int indexOf(T t) {
        if (this.mOldData != null) {
            int findIndexOf = findIndexOf(t, this.mData, 0, this.mNewDataStart, 4);
            if (findIndexOf != -1) {
                return findIndexOf;
            }
            int findIndexOf2 = findIndexOf(t, this.mOldData, this.mOldDataStart, this.mOldDataSize, 4);
            if (findIndexOf2 != -1) {
                return (findIndexOf2 - this.mOldDataStart) + this.mNewDataStart;
            }
            return -1;
        }
        return findIndexOf(t, this.mData, 0, this.mSize, 4);
    }

    public void recalculatePositionOfItemAt(int i2) {
        throwIfInMutationOperation();
        Object obj = get(i2);
        removeItemAtIndex(i2, false);
        int add = add(obj, false);
        if (i2 != add) {
            this.mCallback.onMoved(i2, add);
        }
    }

    public boolean remove(T t) {
        throwIfInMutationOperation();
        return remove(t, true);
    }

    public T removeItemAt(int i2) {
        throwIfInMutationOperation();
        T t = get(i2);
        removeItemAtIndex(i2, true);
        return t;
    }

    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance(this.mTClass, collection.size())), true);
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void replaceAll(@NonNull T[] tArr, boolean z) {
        throwIfInMutationOperation();
        if (z) {
            replaceAllInternal(tArr);
        } else {
            replaceAllInternal(copyArray(tArr));
        }
    }

    public int size() {
        return this.mSize;
    }

    public void updateItemAt(int i2, T t) {
        throwIfInMutationOperation();
        T t2 = get(i2);
        boolean z = t2 == t || !this.mCallback.areContentsTheSame(t2, t);
        if (t2 == t || this.mCallback.compare(t2, t) != 0) {
            if (z) {
                Callback callback = this.mCallback;
                callback.onChanged(i2, 1, callback.getChangePayload(t2, t));
            }
            removeItemAtIndex(i2, false);
            int add = add(t, false);
            if (i2 != add) {
                this.mCallback.onMoved(i2, add);
                return;
            }
            return;
        }
        this.mData[i2] = t;
        if (z) {
            Callback callback2 = this.mCallback;
            callback2.onChanged(i2, 1, callback2.getChangePayload(t2, t));
        }
    }
}
