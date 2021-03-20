package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.e.a.a.a;

public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    public int[] mCachedBorders;
    public final Rect mDecorInsets = new Rect();
    public boolean mPendingSpanCountChange = false;
    public final SparseIntArray mPreLayoutSpanIndexCache = new SparseIntArray();
    public final SparseIntArray mPreLayoutSpanSizeCache = new SparseIntArray();
    public View[] mSet;
    public int mSpanCount = -1;
    public SpanSizeLookup mSpanSizeLookup = new DefaultSpanSizeLookup();
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        public int getSpanIndex(int i2, int i3) {
            return i2 % i3;
        }

        public int getSpanSize(int i2) {
            return 1;
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        public int mSpanIndex = -1;
        public int mSpanSize = 0;

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
        }
    }

    public static abstract class SpanSizeLookup {
        private boolean mCacheSpanGroupIndices = false;
        private boolean mCacheSpanIndices = false;
        public final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        public final SparseIntArray mSpanIndexCache = new SparseIntArray();

        public static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i2) {
            int size = sparseIntArray.size() - 1;
            int i3 = 0;
            while (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                if (sparseIntArray.keyAt(i4) < i2) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            int i5 = i3 - 1;
            if (i5 < 0 || i5 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i5);
        }

        public int getCachedSpanGroupIndex(int i2, int i3) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i2, i3);
            }
            int i4 = this.mSpanGroupIndexCache.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int spanGroupIndex = getSpanGroupIndex(i2, i3);
            this.mSpanGroupIndexCache.put(i2, spanGroupIndex);
            return spanGroupIndex;
        }

        public int getCachedSpanIndex(int i2, int i3) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i2, i3);
            }
            int i4 = this.mSpanIndexCache.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int spanIndex = getSpanIndex(i2, i3);
            this.mSpanIndexCache.put(i2, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int findFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (findFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i2)) == -1) {
                i6 = 0;
                i5 = 0;
                i4 = 0;
            } else {
                i5 = this.mSpanGroupIndexCache.get(findFirstKeyLessThan);
                i4 = findFirstKeyLessThan + 1;
                i6 = getSpanSize(findFirstKeyLessThan) + getCachedSpanIndex(findFirstKeyLessThan, i3);
                if (i6 == i3) {
                    i5++;
                    i6 = 0;
                }
            }
            int spanSize = getSpanSize(i2);
            while (i4 < i2) {
                int spanSize2 = getSpanSize(i4);
                int i7 = i6 + spanSize2;
                if (i7 == i3) {
                    i5++;
                    i7 = 0;
                } else if (i7 > i3) {
                    i5++;
                    i7 = spanSize2;
                }
                i4++;
            }
            return i6 + spanSize > i3 ? i5 + 1 : i5;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                goto L_0x0030
            L_0x0020:
                r2 = r1
                r4 = r2
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r3 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                if (r4 != r7) goto L_0x002d
                r4 = r1
                goto L_0x0030
            L_0x002d:
                if (r4 <= r7) goto L_0x0030
                r4 = r3
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r4
                if (r0 > r7) goto L_0x0037
                return r4
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i2);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z;
        }
    }

    public GridLayoutManager(Context context, int i2) {
        super(context);
        setSpanCount(i2);
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(context, i3, z);
        setSpanCount(i2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        setSpanCount(RecyclerView.LayoutManager.getProperties(context, attributeSet, i2, i3).spanCount);
    }

    private void assignSpans(RecyclerView.Recycler recycler, RecyclerView.State state, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i3 = 1;
            i6 = i2;
            i4 = 0;
        } else {
            i4 = i2 - 1;
            i3 = -1;
        }
        while (i4 != i6) {
            View view = this.mSet[i4];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int spanSize = getSpanSize(recycler, state, getPosition(view));
            layoutParams.mSpanSize = spanSize;
            layoutParams.mSpanIndex = i5;
            i5 += spanSize;
            i4 += i3;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.mPreLayoutSpanSizeCache.put(viewLayoutPosition, layoutParams.getSpanSize());
            this.mPreLayoutSpanIndexCache.put(viewLayoutPosition, layoutParams.getSpanIndex());
        }
    }

    private void calculateItemBorders(int i2) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i2);
    }

    public static int[] calculateItemBorders(int[] iArr, int i2, int i3) {
        int i4;
        if (!(iArr != null && iArr.length == i2 + 1 && iArr[iArr.length - 1] == i3)) {
            iArr = new int[(i2 + 1)];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i3 / i2;
        int i7 = i3 % i2;
        int i8 = 0;
        for (int i9 = 1; i9 <= i2; i9++) {
            i5 += i7;
            if (i5 <= 0 || i2 - i5 >= i7) {
                i4 = i6;
            } else {
                i4 = i6 + 1;
                i5 -= i2;
            }
            i8 += i4;
            iArr[i9] = i8;
        }
        return iArr;
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private int computeScrollOffsetWithSpanInfo(RecyclerView.State state) {
        if (!(getChildCount() == 0 || state.getItemCount() == 0)) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled, true);
            if (!(findFirstVisibleChildClosestToStart == null || findFirstVisibleChildClosestToEnd == null)) {
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.mSpanCount);
                int cachedSpanGroupIndex2 = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.mSpanCount);
                int min = Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int max = this.mShouldReverseLayout ? Math.max(0, ((this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1) - Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2)) - 1) : Math.max(0, min);
                if (!isSmoothScrollbarEnabled) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.mOrientationHelper.getDecoratedEnd(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart))) / ((float) ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.mSpanCount) - this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.mSpanCount)) + 1)))) + ((float) (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart))));
            }
        }
        return 0;
    }

    private int computeScrollRangeWithSpanInfo(RecyclerView.State state) {
        if (!(getChildCount() == 0 || state.getItemCount() == 0)) {
            ensureLayoutState();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (!(findFirstVisibleChildClosestToStart == null || findFirstVisibleChildClosestToEnd == null)) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1;
                }
                int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart);
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.mSpanCount);
                return (int) ((((float) decoratedEnd) / ((float) ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.mSpanCount) - cachedSpanGroupIndex) + 1))) * ((float) (this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1)));
            }
        }
        return 0;
    }

    private void ensureAnchorIsInCorrectSpan(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i2) {
        boolean z = i2 == 1;
        int spanIndex = getSpanIndex(recycler, state, anchorInfo.mPosition);
        if (z) {
            while (spanIndex > 0) {
                int i3 = anchorInfo.mPosition;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    anchorInfo.mPosition = i4;
                    spanIndex = getSpanIndex(recycler, state, i4);
                } else {
                    return;
                }
            }
            return;
        }
        int itemCount = state.getItemCount() - 1;
        int i5 = anchorInfo.mPosition;
        while (i5 < itemCount) {
            int i6 = i5 + 1;
            int spanIndex2 = getSpanIndex(recycler, state, i6);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i5 = i6;
            spanIndex = spanIndex2;
        }
        anchorInfo.mPosition = i5;
    }

    private void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private int getSpanGroupIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(i2, this.mSpanCount);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i2);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    private int getSpanIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i2, this.mSpanCount);
        }
        int i3 = this.mPreLayoutSpanIndexCache.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i2);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getCachedSpanIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    private int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanSize(i2);
        }
        int i3 = this.mPreLayoutSpanSizeCache.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i2);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getSpanSize(convertPreLayoutPositionToPostLayout);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    private void guessMeasurement(float f, int i2) {
        calculateItemBorders(Math.max(Math.round(f * ((float) this.mSpanCount)), i2));
    }

    private void measureChild(View view, int i2, boolean z) {
        int i3;
        int i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i5 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i6 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.mOrientation == 1) {
            i3 = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, i2, i6, layoutParams.width, false);
            i4 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i5, layoutParams.height, true);
        } else {
            int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, i2, i5, layoutParams.height, false);
            int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i6, layoutParams.width, true);
            i4 = childMeasureSpec;
            i3 = childMeasureSpec2;
        }
        measureChildWithDecorationsAndMargin(view, i3, i4, z);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i2, int i3, boolean z) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i2, i3, layoutParams) : shouldMeasureChild(view, i2, i3, layoutParams)) {
            view.measure(i2, i3);
        }
    }

    private void updateMeasurements() {
        int i2;
        int i3;
        if (getOrientation() == 1) {
            i3 = getWidth() - getPaddingRight();
            i2 = getPaddingLeft();
        } else {
            i3 = getHeight() - getPaddingBottom();
            i2 = getPaddingTop();
        }
        calculateItemBorders(i3 - i2);
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i2 = this.mSpanCount;
        for (int i3 = 0; i3 < this.mSpanCount && layoutState.hasMore(state) && i2 > 0; i3++) {
            int i4 = layoutState.mCurrentPosition;
            layoutPrefetchRegistry.addPosition(i4, Math.max(0, layoutState.mScrollingOffset));
            i2 -= this.mSpanSizeLookup.getSpanSize(i4);
            layoutState.mCurrentPosition += layoutState.mItemDirection;
        }
    }

    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(state) : super.computeHorizontalScrollOffset(state);
    }

    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(state) : super.computeHorizontalScrollRange(state);
    }

    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(state) : super.computeVerticalScrollOffset(state);
    }

    public int computeVerticalScrollRange(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(state) : super.computeVerticalScrollRange(state);
    }

    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, int i2, int i3, int i4) {
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < i4 && getSpanIndex(recycler, state, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i5;
        }
        return view != null ? view : view2;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    public int getSpaceForSpanRange(int i2, int i3) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.mCachedBorders;
        int i4 = this.mSpanCount;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x01fc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layoutChunk(androidx.recyclerview.widget.RecyclerView.Recycler r19, androidx.recyclerview.widget.RecyclerView.State r20, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r21, androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mOrientationHelper
            int r3 = r3.getModeInOther()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r4 = r8
            goto L_0x0019
        L_0x0018:
            r4 = r5
        L_0x0019:
            int r9 = r18.getChildCount()
            if (r9 <= 0) goto L_0x0026
            int[] r9 = r6.mCachedBorders
            int r10 = r6.mSpanCount
            r9 = r9[r10]
            goto L_0x0027
        L_0x0026:
            r9 = r5
        L_0x0027:
            if (r4 == 0) goto L_0x002c
            r18.updateMeasurements()
        L_0x002c:
            int r10 = r2.mItemDirection
            if (r10 != r8) goto L_0x0032
            r10 = r8
            goto L_0x0033
        L_0x0032:
            r10 = r5
        L_0x0033:
            int r11 = r6.mSpanCount
            if (r10 != 0) goto L_0x0044
            int r11 = r2.mCurrentPosition
            int r11 = r6.getSpanIndex(r0, r1, r11)
            int r12 = r2.mCurrentPosition
            int r12 = r6.getSpanSize(r0, r1, r12)
            int r11 = r11 + r12
        L_0x0044:
            r12 = r5
        L_0x0045:
            int r13 = r6.mSpanCount
            if (r12 >= r13) goto L_0x0085
            boolean r13 = r2.hasMore(r1)
            if (r13 == 0) goto L_0x0085
            if (r11 <= 0) goto L_0x0085
            int r13 = r2.mCurrentPosition
            int r14 = r6.getSpanSize(r0, r1, r13)
            int r15 = r6.mSpanCount
            if (r14 > r15) goto L_0x006d
            int r11 = r11 - r14
            if (r11 >= 0) goto L_0x005f
            goto L_0x0085
        L_0x005f:
            android.view.View r13 = r2.next(r0)
            if (r13 != 0) goto L_0x0066
            goto L_0x0085
        L_0x0066:
            android.view.View[] r14 = r6.mSet
            r14[r12] = r13
            int r12 = r12 + 1
            goto L_0x0045
        L_0x006d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Item at position "
            java.lang.String r2 = " requires "
            java.lang.String r3 = " spans but GridLayoutManager has only "
            java.lang.StringBuilder r1 = b.e.a.a.a.A(r1, r13, r2, r14, r3)
            int r2 = r6.mSpanCount
            java.lang.String r3 = " spans."
            java.lang.String r1 = b.e.a.a.a.o(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x0085:
            if (r12 != 0) goto L_0x008a
            r7.mFinished = r8
            return
        L_0x008a:
            r11 = 0
            r6.assignSpans(r0, r1, r12, r10)
            r0 = r5
            r1 = r0
        L_0x0090:
            if (r5 >= r12) goto L_0x00db
            android.view.View[] r13 = r6.mSet
            r13 = r13[r5]
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r14 = r2.mScrapList
            if (r14 != 0) goto L_0x00a4
            if (r10 == 0) goto L_0x00a0
            r6.addView(r13)
            goto L_0x00ad
        L_0x00a0:
            r6.addView(r13, r0)
            goto L_0x00ad
        L_0x00a4:
            if (r10 == 0) goto L_0x00aa
            r6.addDisappearingView(r13)
            goto L_0x00ad
        L_0x00aa:
            r6.addDisappearingView(r13, r0)
        L_0x00ad:
            android.graphics.Rect r14 = r6.mDecorInsets
            r6.calculateItemDecorationsForChild(r13, r14)
            r6.measureChild(r13, r3, r0)
            androidx.recyclerview.widget.OrientationHelper r0 = r6.mOrientationHelper
            int r0 = r0.getDecoratedMeasurement(r13)
            if (r0 <= r1) goto L_0x00be
            r1 = r0
        L_0x00be:
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r0
            r14 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.OrientationHelper r15 = r6.mOrientationHelper
            int r13 = r15.getDecoratedMeasurementInOther(r13)
            float r13 = (float) r13
            float r13 = r13 * r14
            int r0 = r0.mSpanSize
            float r0 = (float) r0
            float r13 = r13 / r0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            r11 = r13
        L_0x00d7:
            int r5 = r5 + 1
            r0 = 0
            goto L_0x0090
        L_0x00db:
            if (r4 == 0) goto L_0x00f9
            r6.guessMeasurement(r11, r9)
            r0 = 0
            r1 = 0
        L_0x00e2:
            if (r0 >= r12) goto L_0x00f9
            android.view.View[] r3 = r6.mSet
            r3 = r3[r0]
            r4 = 1073741824(0x40000000, float:2.0)
            r6.measureChild(r3, r4, r8)
            androidx.recyclerview.widget.OrientationHelper r4 = r6.mOrientationHelper
            int r3 = r4.getDecoratedMeasurement(r3)
            if (r3 <= r1) goto L_0x00f6
            r1 = r3
        L_0x00f6:
            int r0 = r0 + 1
            goto L_0x00e2
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            if (r0 >= r12) goto L_0x0158
            android.view.View[] r3 = r6.mSet
            r3 = r3[r0]
            androidx.recyclerview.widget.OrientationHelper r4 = r6.mOrientationHelper
            int r4 = r4.getDecoratedMeasurement(r3)
            if (r4 == r1) goto L_0x0155
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r4
            android.graphics.Rect r5 = r4.mDecorInsets
            int r9 = r5.top
            int r10 = r5.bottom
            int r9 = r9 + r10
            int r10 = r4.topMargin
            int r9 = r9 + r10
            int r10 = r4.bottomMargin
            int r9 = r9 + r10
            int r10 = r5.left
            int r5 = r5.right
            int r10 = r10 + r5
            int r5 = r4.leftMargin
            int r10 = r10 + r5
            int r5 = r4.rightMargin
            int r10 = r10 + r5
            int r5 = r4.mSpanIndex
            int r11 = r4.mSpanSize
            int r5 = r6.getSpaceForSpanRange(r5, r11)
            int r11 = r6.mOrientation
            if (r11 != r8) goto L_0x0142
            int r4 = r4.width
            r11 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r4 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r5, r11, r10, r4, r13)
            int r5 = r1 - r9
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L_0x0152
        L_0x0142:
            r11 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r10 = r1 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r4 = r4.height
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r5, r11, r9, r4, r13)
            r4 = r10
        L_0x0152:
            r6.measureChildWithDecorationsAndMargin(r3, r4, r5, r8)
        L_0x0155:
            int r0 = r0 + 1
            goto L_0x00fa
        L_0x0158:
            r0 = 0
            r7.mConsumed = r1
            int r3 = r6.mOrientation
            r4 = -1
            if (r3 != r8) goto L_0x0172
            int r3 = r2.mLayoutDirection
            int r2 = r2.mOffset
            if (r3 != r4) goto L_0x0169
            int r1 = r2 - r1
            goto L_0x016f
        L_0x0169:
            int r1 = r1 + r2
            r17 = r2
            r2 = r1
            r1 = r17
        L_0x016f:
            r3 = r0
            r9 = r3
            goto L_0x0186
        L_0x0172:
            int r3 = r2.mLayoutDirection
            int r2 = r2.mOffset
            if (r3 != r4) goto L_0x0180
            int r1 = r2 - r1
            r9 = r0
            r3 = r1
            r1 = r9
            r0 = r2
            r2 = r1
            goto L_0x0186
        L_0x0180:
            int r1 = r1 + r2
            r9 = r0
            r3 = r2
            r2 = r9
            r0 = r1
            r1 = r2
        L_0x0186:
            if (r9 >= r12) goto L_0x020e
            android.view.View[] r4 = r6.mSet
            r10 = r4[r9]
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()
            r11 = r4
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r11 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r11
            int r4 = r6.mOrientation
            if (r4 != r8) goto L_0x01cc
            boolean r0 = r18.isLayoutRTL()
            if (r0 == 0) goto L_0x01b4
            int r0 = r18.getPaddingLeft()
            int[] r3 = r6.mCachedBorders
            int r4 = r6.mSpanCount
            int r5 = r11.mSpanIndex
            int r4 = r4 - r5
            r3 = r3[r4]
            int r0 = r0 + r3
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mOrientationHelper
            int r3 = r3.getDecoratedMeasurementInOther(r10)
            int r3 = r0 - r3
            goto L_0x01de
        L_0x01b4:
            int r0 = r18.getPaddingLeft()
            int[] r3 = r6.mCachedBorders
            int r4 = r11.mSpanIndex
            r3 = r3[r4]
            int r0 = r0 + r3
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mOrientationHelper
            int r3 = r3.getDecoratedMeasurementInOther(r10)
            int r3 = r3 + r0
            r16 = r0
            r14 = r1
            r15 = r2
            r13 = r3
            goto L_0x01e3
        L_0x01cc:
            int r1 = r18.getPaddingTop()
            int[] r2 = r6.mCachedBorders
            int r4 = r11.mSpanIndex
            r2 = r2[r4]
            int r1 = r1 + r2
            androidx.recyclerview.widget.OrientationHelper r2 = r6.mOrientationHelper
            int r2 = r2.getDecoratedMeasurementInOther(r10)
            int r2 = r2 + r1
        L_0x01de:
            r13 = r0
            r14 = r1
            r15 = r2
            r16 = r3
        L_0x01e3:
            r0 = r18
            r1 = r10
            r2 = r16
            r3 = r14
            r4 = r13
            r5 = r15
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            boolean r0 = r11.isItemRemoved()
            if (r0 != 0) goto L_0x01fa
            boolean r0 = r11.isItemChanged()
            if (r0 == 0) goto L_0x01fc
        L_0x01fa:
            r7.mIgnoreConsumed = r8
        L_0x01fc:
            boolean r0 = r7.mFocusable
            boolean r1 = r10.hasFocusable()
            r0 = r0 | r1
            r7.mFocusable = r0
            int r9 = r9 + 1
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            goto L_0x0186
        L_0x020e:
            android.view.View[] r0 = r6.mSet
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, androidx.recyclerview.widget.LinearLayoutManager$LayoutState, androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult):void");
    }

    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i2) {
        super.onAnchorReady(recycler, state, anchorInfo, i2);
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            ensureAnchorIsInCorrectSpan(recycler, state, anchorInfo, i2);
        }
        ensureViewSet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.Recycler r26, androidx.recyclerview.widget.RecyclerView.State r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.findContainingItemView(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.mSpanIndex
            int r5 = r5.mSpanSize
            int r5 = r5 + r6
            android.view.View r7 = super.onFocusSearchFailed(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.convertFocusDirectionToLayoutDirection(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.mShouldReverseLayout
            if (r7 == r10) goto L_0x0032
            r7 = r9
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.getChildCount()
            int r7 = r7 - r9
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r23.getChildCount()
            r11 = r7
            r12 = r9
            r7 = 0
        L_0x0045:
            int r13 = r0.mOrientation
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.isLayoutRTL()
            if (r13 == 0) goto L_0x0051
            r13 = r9
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.getSpanGroupIndex(r1, r2, r7)
            r15 = r10
            r16 = r15
            r8 = 0
            r17 = 0
            r10 = r7
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.getSpanGroupIndex(r1, r2, r10)
            android.view.View r1 = r0.getChildAt(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.mSpanIndex
            r18 = r3
            int r3 = r9.mSpanSize
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.isViewPartiallyVisible(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.mSpanIndex
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.mSpanIndex
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(recycler, state, layoutParams2.getViewLayoutPosition());
        if (this.mOrientation == 0) {
            i5 = layoutParams2.getSpanIndex();
            i4 = layoutParams2.getSpanSize();
            i2 = 1;
            z2 = false;
            z = false;
            i3 = spanGroupIndex;
        } else {
            i4 = 1;
            i3 = layoutParams2.getSpanIndex();
            i2 = layoutParams2.getSpanSize();
            z2 = false;
            z = false;
            i5 = spanGroupIndex;
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i5, i4, i3, i2, z2, z));
    }

    public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout()) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recycler, state);
        clearPreLayoutSpanMappingCache();
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSpanCountChange = false;
    }

    public int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i2, recycler, state);
    }

    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i2, recycler, state);
    }

    public void setMeasuredDimension(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i2, i3);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            i5 = RecyclerView.LayoutManager.chooseSize(i3, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            i4 = RecyclerView.LayoutManager.chooseSize(i2, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            i4 = RecyclerView.LayoutManager.chooseSize(i2, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            i5 = RecyclerView.LayoutManager.chooseSize(i3, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(i4, i5);
    }

    public void setSpanCount(int i2) {
        if (i2 != this.mSpanCount) {
            this.mPendingSpanCountChange = true;
            if (i2 >= 1) {
                this.mSpanCount = i2;
                this.mSpanSizeLookup.invalidateSpanIndexCache();
                requestLayout();
                return;
            }
            throw new IllegalArgumentException(a.g("Span count should be at least 1. Provided ", i2));
        }
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    public void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z) {
        this.mUsingSpansToEstimateScrollBarDimensions = z;
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }
}
