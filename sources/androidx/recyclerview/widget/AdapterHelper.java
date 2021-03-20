package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdapterHelper implements OpReorderer.Callback {
    private static final boolean DEBUG = false;
    public static final int POSITION_TYPE_INVISIBLE = 0;
    public static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final String TAG = "AHT";
    public final Callback mCallback;
    public final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    public Runnable mOnItemProcessedCallback;
    public final OpReorderer mOpReorderer;
    public final ArrayList<UpdateOp> mPendingUpdates;
    public final ArrayList<UpdateOp> mPostponedList;
    private Pools.Pool<UpdateOp> mUpdateOpPool;

    public interface Callback {
        RecyclerView.ViewHolder findViewHolder(int i2);

        void markViewHoldersUpdated(int i2, int i3, Object obj);

        void offsetPositionsForAdd(int i2, int i3);

        void offsetPositionsForMove(int i2, int i3);

        void offsetPositionsForRemovingInvisible(int i2, int i3);

        void offsetPositionsForRemovingLaidOutOrNewView(int i2, int i3);

        void onDispatchFirstPass(UpdateOp updateOp);

        void onDispatchSecondPass(UpdateOp updateOp);
    }

    public static class UpdateOp {
        public static final int ADD = 1;
        public static final int MOVE = 8;
        public static final int POOL_SIZE = 30;
        public static final int REMOVE = 2;
        public static final int UPDATE = 4;
        public int cmd;
        public int itemCount;
        public Object payload;
        public int positionStart;

        public UpdateOp(int i2, int i3, int i4, Object obj) {
            this.cmd = i2;
            this.positionStart = i3;
            this.itemCount = i4;
            this.payload = obj;
        }

        public String cmdToString() {
            int i2 = this.cmd;
            return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UpdateOp updateOp = (UpdateOp) obj;
            int i2 = this.cmd;
            if (i2 != updateOp.cmd) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.itemCount - this.positionStart) == 1 && this.itemCount == updateOp.positionStart && this.positionStart == updateOp.itemCount) {
                return true;
            }
            if (this.itemCount != updateOp.itemCount || this.positionStart != updateOp.positionStart) {
                return false;
            }
            Object obj2 = this.payload;
            Object obj3 = updateOp.payload;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.cmd * 31) + this.positionStart) * 31) + this.itemCount;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + cmdToString() + ",s:" + this.positionStart + "c:" + this.itemCount + ",p:" + this.payload + "]";
        }
    }

    public AdapterHelper(Callback callback) {
        this(callback, false);
    }

    public AdapterHelper(Callback callback, boolean z) {
        this.mUpdateOpPool = new Pools.SimplePool(30);
        this.mPendingUpdates = new ArrayList<>();
        this.mPostponedList = new ArrayList<>();
        this.mExistingUpdateTypes = 0;
        this.mCallback = callback;
        this.mDisableRecycler = z;
        this.mOpReorderer = new OpReorderer(this);
    }

    private void applyAdd(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyMove(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyRemove(UpdateOp updateOp) {
        char c;
        boolean z;
        boolean z2;
        int i2 = updateOp.positionStart;
        int i3 = updateOp.itemCount + i2;
        char c2 = 65535;
        int i4 = i2;
        int i5 = 0;
        while (i4 < i3) {
            if (this.mCallback.findViewHolder(i4) != null || canFindInPreLayout(i4)) {
                if (c2 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(2, i2, i5, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, i2, i5, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i4 -= i5;
                i3 -= i5;
                i5 = 1;
            } else {
                i5++;
            }
            i4++;
            c2 = c;
        }
        if (i5 != updateOp.itemCount) {
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(2, i2, i5, (Object) null);
        }
        if (c2 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private void applyUpdate(UpdateOp updateOp) {
        int i2 = updateOp.positionStart;
        int i3 = updateOp.itemCount + i2;
        int i4 = 0;
        boolean z = true;
        int i5 = i2;
        while (i2 < i3) {
            if (this.mCallback.findViewHolder(i2) != null || canFindInPreLayout(i2)) {
                if (!z) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(4, i5, i4, updateOp.payload));
                    i5 = i2;
                    i4 = 0;
                }
                z = true;
            } else {
                if (z) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(4, i5, i4, updateOp.payload));
                    i5 = i2;
                    i4 = 0;
                }
                z = false;
            }
            i4++;
            i2++;
        }
        if (i4 != updateOp.itemCount) {
            Object obj = updateOp.payload;
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(4, i5, i4, obj);
        }
        if (!z) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private boolean canFindInPreLayout(int i2) {
        int size = this.mPostponedList.size();
        for (int i3 = 0; i3 < size; i3++) {
            UpdateOp updateOp = this.mPostponedList.get(i3);
            int i4 = updateOp.cmd;
            if (i4 == 8) {
                if (findPositionOffset(updateOp.itemCount, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = updateOp.positionStart;
                int i6 = updateOp.itemCount + i5;
                while (i5 < i6) {
                    if (findPositionOffset(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void dispatchAndUpdateViewHolders(UpdateOp updateOp) {
        int i2;
        int i3 = updateOp.cmd;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int updatePositionWithPostponed = updatePositionWithPostponed(updateOp.positionStart, i3);
        int i4 = updateOp.positionStart;
        int i5 = updateOp.cmd;
        if (i5 == 2) {
            i2 = 0;
        } else if (i5 == 4) {
            i2 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + updateOp);
        }
        int i6 = 1;
        for (int i7 = 1; i7 < updateOp.itemCount; i7++) {
            int updatePositionWithPostponed2 = updatePositionWithPostponed((i2 * i7) + updateOp.positionStart, updateOp.cmd);
            int i8 = updateOp.cmd;
            if (i8 == 2 ? updatePositionWithPostponed2 == updatePositionWithPostponed : i8 == 4 && updatePositionWithPostponed2 == updatePositionWithPostponed + 1) {
                i6++;
            } else {
                UpdateOp obtainUpdateOp = obtainUpdateOp(i8, updatePositionWithPostponed, i6, updateOp.payload);
                dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp, i4);
                recycleUpdateOp(obtainUpdateOp);
                if (updateOp.cmd == 4) {
                    i4 += i6;
                }
                i6 = 1;
                updatePositionWithPostponed = updatePositionWithPostponed2;
            }
        }
        Object obj = updateOp.payload;
        recycleUpdateOp(updateOp);
        if (i6 > 0) {
            UpdateOp obtainUpdateOp2 = obtainUpdateOp(updateOp.cmd, updatePositionWithPostponed, i6, obj);
            dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp2, i4);
            recycleUpdateOp(obtainUpdateOp2);
        }
    }

    private void postponeAndUpdateViewHolders(UpdateOp updateOp) {
        this.mPostponedList.add(updateOp);
        int i2 = updateOp.cmd;
        if (i2 == 1) {
            this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
        } else if (i2 == 2) {
            this.mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateOp.positionStart, updateOp.itemCount);
        } else if (i2 == 4) {
            this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
        } else if (i2 == 8) {
            this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    private int updatePositionWithPostponed(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        for (int size = this.mPostponedList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = this.mPostponedList.get(size);
            int i10 = updateOp.cmd;
            if (i10 == 8) {
                int i11 = updateOp.positionStart;
                int i12 = updateOp.itemCount;
                if (i11 < i12) {
                    i6 = i11;
                    i5 = i12;
                } else {
                    i5 = i11;
                    i6 = i12;
                }
                if (i2 < i6 || i2 > i5) {
                    if (i2 < i11) {
                        if (i3 == 1) {
                            updateOp.positionStart = i11 + 1;
                            i7 = i12 + 1;
                        } else if (i3 == 2) {
                            updateOp.positionStart = i11 - 1;
                            i7 = i12 - 1;
                        }
                        updateOp.itemCount = i7;
                    }
                } else if (i6 == i11) {
                    if (i3 == 1) {
                        i9 = i12 + 1;
                    } else {
                        if (i3 == 2) {
                            i9 = i12 - 1;
                        }
                        i2++;
                    }
                    updateOp.itemCount = i9;
                    i2++;
                } else {
                    if (i3 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i3 == 2) {
                            i8 = i11 - 1;
                        }
                        i2--;
                    }
                    updateOp.positionStart = i8;
                    i2--;
                }
            } else {
                int i13 = updateOp.positionStart;
                if (i13 > i2) {
                    if (i3 == 1) {
                        i4 = i13 + 1;
                    } else if (i3 == 2) {
                        i4 = i13 - 1;
                    }
                    updateOp.positionStart = i4;
                } else if (i10 == 1) {
                    i2 -= updateOp.itemCount;
                } else if (i10 == 2) {
                    i2 += updateOp.itemCount;
                }
            }
        }
        for (int size2 = this.mPostponedList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = this.mPostponedList.get(size2);
            if (updateOp2.cmd == 8) {
                int i14 = updateOp2.itemCount;
                if (i14 != updateOp2.positionStart && i14 >= 0) {
                }
            } else if (updateOp2.itemCount > 0) {
            }
            this.mPostponedList.remove(size2);
            recycleUpdateOp(updateOp2);
        }
        return i2;
    }

    public AdapterHelper addUpdateOp(UpdateOp... updateOpArr) {
        Collections.addAll(this.mPendingUpdates, updateOpArr);
        return this;
    }

    public int applyPendingUpdatesToPosition(int i2) {
        int size = this.mPendingUpdates.size();
        for (int i3 = 0; i3 < size; i3++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i3);
            int i4 = updateOp.cmd;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = updateOp.positionStart;
                    if (i5 <= i2) {
                        int i6 = updateOp.itemCount;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = updateOp.positionStart;
                    if (i7 == i2) {
                        i2 = updateOp.itemCount;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (updateOp.itemCount <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (updateOp.positionStart <= i2) {
                i2 += updateOp.itemCount;
            }
        }
        return i2;
    }

    public void consumePostponedUpdates() {
        int size = this.mPostponedList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mCallback.onDispatchSecondPass(this.mPostponedList.get(i2));
        }
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    public void consumeUpdatesInOnePass() {
        consumePostponedUpdates();
        int size = this.mPendingUpdates.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i2);
            int i3 = updateOp.cmd;
            if (i3 == 1) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            } else if (i3 == 2) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForRemovingInvisible(updateOp.positionStart, updateOp.itemCount);
            } else if (i3 == 4) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
            } else if (i3 == 8) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.mExistingUpdateTypes = 0;
    }

    public void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateOp, int i2) {
        this.mCallback.onDispatchFirstPass(updateOp);
        int i3 = updateOp.cmd;
        if (i3 == 2) {
            this.mCallback.offsetPositionsForRemovingInvisible(i2, updateOp.itemCount);
        } else if (i3 == 4) {
            this.mCallback.markViewHoldersUpdated(i2, updateOp.itemCount, updateOp.payload);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int findPositionOffset(int i2) {
        return findPositionOffset(i2, 0);
    }

    public int findPositionOffset(int i2, int i3) {
        int size = this.mPostponedList.size();
        while (i3 < size) {
            UpdateOp updateOp = this.mPostponedList.get(i3);
            int i4 = updateOp.cmd;
            if (i4 == 8) {
                int i5 = updateOp.positionStart;
                if (i5 == i2) {
                    i2 = updateOp.itemCount;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (updateOp.itemCount <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = updateOp.positionStart;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = updateOp.itemCount;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += updateOp.itemCount;
                }
            }
            i3++;
        }
        return i2;
    }

    public boolean hasAnyUpdateTypes(int i2) {
        return (i2 & this.mExistingUpdateTypes) != 0;
    }

    public boolean hasPendingUpdates() {
        return this.mPendingUpdates.size() > 0;
    }

    public boolean hasUpdates() {
        return !this.mPostponedList.isEmpty() && !this.mPendingUpdates.isEmpty();
    }

    public UpdateOp obtainUpdateOp(int i2, int i3, int i4, Object obj) {
        UpdateOp acquire = this.mUpdateOpPool.acquire();
        if (acquire == null) {
            return new UpdateOp(i2, i3, i4, obj);
        }
        acquire.cmd = i2;
        acquire.positionStart = i3;
        acquire.itemCount = i4;
        acquire.payload = obj;
        return acquire;
    }

    public boolean onItemRangeChanged(int i2, int i3, Object obj) {
        if (i3 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(4, i2, i3, obj));
        this.mExistingUpdateTypes |= 4;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeInserted(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(1, i2, i3, (Object) null));
        this.mExistingUpdateTypes |= 1;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeMoved(int i2, int i3, int i4) {
        if (i2 == i3) {
            return false;
        }
        if (i4 == 1) {
            this.mPendingUpdates.add(obtainUpdateOp(8, i2, i3, (Object) null));
            this.mExistingUpdateTypes |= 8;
            return this.mPendingUpdates.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public boolean onItemRangeRemoved(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(2, i2, i3, (Object) null));
        this.mExistingUpdateTypes |= 2;
        return this.mPendingUpdates.size() == 1;
    }

    public void preProcess() {
        this.mOpReorderer.reorderOps(this.mPendingUpdates);
        int size = this.mPendingUpdates.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i2);
            int i3 = updateOp.cmd;
            if (i3 == 1) {
                applyAdd(updateOp);
            } else if (i3 == 2) {
                applyRemove(updateOp);
            } else if (i3 == 4) {
                applyUpdate(updateOp);
            } else if (i3 == 8) {
                applyMove(updateOp);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.mPendingUpdates.clear();
    }

    public void recycleUpdateOp(UpdateOp updateOp) {
        if (!this.mDisableRecycler) {
            updateOp.payload = null;
            this.mUpdateOpPool.release(updateOp);
        }
    }

    public void recycleUpdateOpsAndClearList(List<UpdateOp> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            recycleUpdateOp(list.get(i2));
        }
        list.clear();
    }

    public void reset() {
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }
}
