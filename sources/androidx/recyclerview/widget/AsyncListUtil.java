package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;
import b.e.a.a.a;

public class AsyncListUtil<T> {
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncListUtil";
    public boolean mAllowScrollHints;
    private final ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
    public final ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    public final DataCallback<T> mDataCallback;
    public int mDisplayedGeneration = 0;
    public int mItemCount = 0;
    private final ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
    public final ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    public final SparseIntArray mMissingPositions = new SparseIntArray();
    public final int[] mPrevRange = new int[2];
    public int mRequestedGeneration = 0;
    private int mScrollHint = 0;
    public final Class<T> mTClass;
    public final TileList<T> mTileList;
    public final int mTileSize;
    public final int[] mTmpRange = new int[2];
    public final int[] mTmpRangeExtended = new int[2];
    public final ViewCallback mViewCallback;

    public static abstract class DataCallback<T> {
        @WorkerThread
        public abstract void fillData(@NonNull T[] tArr, int i2, int i3);

        @WorkerThread
        public int getMaxCachedTiles() {
            return 10;
        }

        @WorkerThread
        public void recycleData(@NonNull T[] tArr, int i2) {
        }

        @WorkerThread
        public abstract int refreshData();
    }

    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        @UiThread
        public void extendRangeInto(@NonNull int[] iArr, @NonNull int[] iArr2, int i2) {
            int i3 = (iArr[1] - iArr[0]) + 1;
            int i4 = i3 / 2;
            iArr2[0] = iArr[0] - (i2 == 1 ? i3 : i4);
            int i5 = iArr[1];
            if (i2 != 2) {
                i3 = i4;
            }
            iArr2[1] = i5 + i3;
        }

        @UiThread
        public abstract void getItemRangeInto(@NonNull int[] iArr);

        @UiThread
        public abstract void onDataRefresh();

        @UiThread
        public abstract void onItemLoaded(int i2);
    }

    public AsyncListUtil(@NonNull Class<T> cls, int i2, @NonNull DataCallback<T> dataCallback, @NonNull ViewCallback viewCallback) {
        AnonymousClass1 r0 = new ThreadUtil.MainThreadCallback<T>() {
            private boolean isRequestedGeneration(int i2) {
                return i2 == AsyncListUtil.this.mRequestedGeneration;
            }

            private void recycleAllTiles() {
                for (int i2 = 0; i2 < AsyncListUtil.this.mTileList.size(); i2++) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mBackgroundProxy.recycleTile(asyncListUtil.mTileList.getAtIndex(i2));
                }
                AsyncListUtil.this.mTileList.clear();
            }

            public void addTile(int i2, TileList.Tile<T> tile) {
                if (!isRequestedGeneration(i2)) {
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(tile);
                    return;
                }
                TileList.Tile<T> addOrReplace = AsyncListUtil.this.mTileList.addOrReplace(tile);
                if (addOrReplace != null) {
                    StringBuilder y = a.y("duplicate tile @");
                    y.append(addOrReplace.mStartPosition);
                    Log.e(AsyncListUtil.TAG, y.toString());
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(addOrReplace);
                }
                int i3 = tile.mStartPosition + tile.mItemCount;
                int i4 = 0;
                while (i4 < AsyncListUtil.this.mMissingPositions.size()) {
                    int keyAt = AsyncListUtil.this.mMissingPositions.keyAt(i4);
                    if (tile.mStartPosition > keyAt || keyAt >= i3) {
                        i4++;
                    } else {
                        AsyncListUtil.this.mMissingPositions.removeAt(i4);
                        AsyncListUtil.this.mViewCallback.onItemLoaded(keyAt);
                    }
                }
            }

            public void removeTile(int i2, int i3) {
                if (isRequestedGeneration(i2)) {
                    TileList.Tile<T> removeAtPos = AsyncListUtil.this.mTileList.removeAtPos(i3);
                    if (removeAtPos == null) {
                        Log.e(AsyncListUtil.TAG, "tile not found @" + i3);
                        return;
                    }
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(removeAtPos);
                }
            }

            public void updateItemCount(int i2, int i3) {
                if (isRequestedGeneration(i2)) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mItemCount = i3;
                    asyncListUtil.mViewCallback.onDataRefresh();
                    AsyncListUtil asyncListUtil2 = AsyncListUtil.this;
                    asyncListUtil2.mDisplayedGeneration = asyncListUtil2.mRequestedGeneration;
                    recycleAllTiles();
                    AsyncListUtil asyncListUtil3 = AsyncListUtil.this;
                    asyncListUtil3.mAllowScrollHints = false;
                    asyncListUtil3.updateRange();
                }
            }
        };
        this.mMainThreadCallback = r0;
        AnonymousClass2 r1 = new ThreadUtil.BackgroundCallback<T>() {
            private int mFirstRequiredTileStart;
            private int mGeneration;
            private int mItemCount;
            private int mLastRequiredTileStart;
            public final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
            private TileList.Tile<T> mRecycledRoot;

            private TileList.Tile<T> acquireTile() {
                TileList.Tile<T> tile = this.mRecycledRoot;
                if (tile != null) {
                    this.mRecycledRoot = tile.mNext;
                    return tile;
                }
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                return new TileList.Tile<>(asyncListUtil.mTClass, asyncListUtil.mTileSize);
            }

            private void addTile(TileList.Tile<T> tile) {
                this.mLoadedTiles.put(tile.mStartPosition, true);
                AsyncListUtil.this.mMainThreadProxy.addTile(this.mGeneration, tile);
            }

            private void flushTileCache(int i2) {
                int maxCachedTiles = AsyncListUtil.this.mDataCallback.getMaxCachedTiles();
                while (this.mLoadedTiles.size() >= maxCachedTiles) {
                    int keyAt = this.mLoadedTiles.keyAt(0);
                    SparseBooleanArray sparseBooleanArray = this.mLoadedTiles;
                    int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                    int i3 = this.mFirstRequiredTileStart - keyAt;
                    int i4 = keyAt2 - this.mLastRequiredTileStart;
                    if (i3 > 0 && (i3 >= i4 || i2 == 2)) {
                        removeTile(keyAt);
                    } else if (i4 <= 0) {
                        return;
                    } else {
                        if (i3 < i4 || i2 == 1) {
                            removeTile(keyAt2);
                        } else {
                            return;
                        }
                    }
                }
            }

            private int getTileStart(int i2) {
                return i2 - (i2 % AsyncListUtil.this.mTileSize);
            }

            private boolean isTileLoaded(int i2) {
                return this.mLoadedTiles.get(i2);
            }

            private void log(String str, Object... objArr) {
                StringBuilder y = a.y("[BKGR] ");
                y.append(String.format(str, objArr));
                Log.d(AsyncListUtil.TAG, y.toString());
            }

            private void removeTile(int i2) {
                this.mLoadedTiles.delete(i2);
                AsyncListUtil.this.mMainThreadProxy.removeTile(this.mGeneration, i2);
            }

            private void requestTiles(int i2, int i3, int i4, boolean z) {
                int i5 = i2;
                while (i5 <= i3) {
                    AsyncListUtil.this.mBackgroundProxy.loadTile(z ? (i3 + i2) - i5 : i5, i4);
                    i5 += AsyncListUtil.this.mTileSize;
                }
            }

            public void loadTile(int i2, int i3) {
                if (!isTileLoaded(i2)) {
                    TileList.Tile acquireTile = acquireTile();
                    acquireTile.mStartPosition = i2;
                    int min = Math.min(AsyncListUtil.this.mTileSize, this.mItemCount - i2);
                    acquireTile.mItemCount = min;
                    AsyncListUtil.this.mDataCallback.fillData(acquireTile.mItems, acquireTile.mStartPosition, min);
                    flushTileCache(i3);
                    addTile(acquireTile);
                }
            }

            public void recycleTile(TileList.Tile<T> tile) {
                AsyncListUtil.this.mDataCallback.recycleData(tile.mItems, tile.mItemCount);
                tile.mNext = this.mRecycledRoot;
                this.mRecycledRoot = tile;
            }

            public void refresh(int i2) {
                this.mGeneration = i2;
                this.mLoadedTiles.clear();
                int refreshData = AsyncListUtil.this.mDataCallback.refreshData();
                this.mItemCount = refreshData;
                AsyncListUtil.this.mMainThreadProxy.updateItemCount(this.mGeneration, refreshData);
            }

            public void updateRange(int i2, int i3, int i4, int i5, int i6) {
                if (i2 <= i3) {
                    int tileStart = getTileStart(i2);
                    int tileStart2 = getTileStart(i3);
                    this.mFirstRequiredTileStart = getTileStart(i4);
                    int tileStart3 = getTileStart(i5);
                    this.mLastRequiredTileStart = tileStart3;
                    if (i6 == 1) {
                        requestTiles(this.mFirstRequiredTileStart, tileStart2, i6, true);
                        requestTiles(tileStart2 + AsyncListUtil.this.mTileSize, this.mLastRequiredTileStart, i6, false);
                        return;
                    }
                    requestTiles(tileStart, tileStart3, i6, false);
                    requestTiles(this.mFirstRequiredTileStart, tileStart - AsyncListUtil.this.mTileSize, i6, true);
                }
            }
        };
        this.mBackgroundCallback = r1;
        this.mTClass = cls;
        this.mTileSize = i2;
        this.mDataCallback = dataCallback;
        this.mViewCallback = viewCallback;
        this.mTileList = new TileList<>(i2);
        MessageThreadUtil messageThreadUtil = new MessageThreadUtil();
        this.mMainThreadProxy = messageThreadUtil.getMainThreadProxy(r0);
        this.mBackgroundProxy = messageThreadUtil.getBackgroundProxy(r1);
        refresh();
    }

    private boolean isRefreshPending() {
        return this.mRequestedGeneration != this.mDisplayedGeneration;
    }

    @Nullable
    public T getItem(int i2) {
        if (i2 < 0 || i2 >= this.mItemCount) {
            throw new IndexOutOfBoundsException(i2 + " is not within 0 and " + this.mItemCount);
        }
        T itemAt = this.mTileList.getItemAt(i2);
        if (itemAt == null && !isRefreshPending()) {
            this.mMissingPositions.put(i2, 0);
        }
        return itemAt;
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    public void log(String str, Object... objArr) {
        StringBuilder y = a.y("[MAIN] ");
        y.append(String.format(str, objArr));
        Log.d(TAG, y.toString());
    }

    public void onRangeChanged() {
        if (!isRefreshPending()) {
            updateRange();
            this.mAllowScrollHints = true;
        }
    }

    public void refresh() {
        this.mMissingPositions.clear();
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int i2 = this.mRequestedGeneration + 1;
        this.mRequestedGeneration = i2;
        backgroundCallback.refresh(i2);
    }

    public void updateRange() {
        this.mViewCallback.getItemRangeInto(this.mTmpRange);
        int[] iArr = this.mTmpRange;
        if (iArr[0] <= iArr[1] && iArr[0] >= 0 && iArr[1] < this.mItemCount) {
            if (this.mAllowScrollHints) {
                int i2 = iArr[0];
                int[] iArr2 = this.mPrevRange;
                if (i2 <= iArr2[1] && iArr2[0] <= iArr[1]) {
                    if (iArr[0] < iArr2[0]) {
                        this.mScrollHint = 1;
                    } else if (iArr[0] > iArr2[0]) {
                        this.mScrollHint = 2;
                    }
                    int[] iArr3 = this.mPrevRange;
                    iArr3[0] = iArr[0];
                    iArr3[1] = iArr[1];
                    this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
                    int[] iArr4 = this.mTmpRangeExtended;
                    iArr4[0] = Math.min(this.mTmpRange[0], Math.max(iArr4[0], 0));
                    int[] iArr5 = this.mTmpRangeExtended;
                    iArr5[1] = Math.max(this.mTmpRange[1], Math.min(iArr5[1], this.mItemCount - 1));
                    ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
                    int[] iArr6 = this.mTmpRange;
                    int i3 = iArr6[0];
                    int i4 = iArr6[1];
                    int[] iArr7 = this.mTmpRangeExtended;
                    backgroundCallback.updateRange(i3, i4, iArr7[0], iArr7[1], this.mScrollHint);
                }
            }
            this.mScrollHint = 0;
            int[] iArr32 = this.mPrevRange;
            iArr32[0] = iArr[0];
            iArr32[1] = iArr[1];
            this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
            int[] iArr42 = this.mTmpRangeExtended;
            iArr42[0] = Math.min(this.mTmpRange[0], Math.max(iArr42[0], 0));
            int[] iArr52 = this.mTmpRangeExtended;
            iArr52[1] = Math.max(this.mTmpRange[1], Math.min(iArr52[1], this.mItemCount - 1));
            ThreadUtil.BackgroundCallback<T> backgroundCallback2 = this.mBackgroundProxy;
            int[] iArr62 = this.mTmpRange;
            int i32 = iArr62[0];
            int i42 = iArr62[1];
            int[] iArr72 = this.mTmpRangeExtended;
            backgroundCallback2.updateRange(i32, i42, iArr72[0], iArr72[1], this.mScrollHint);
        }
    }
}
