package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import b.e.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final boolean DEBUG = false;
    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private final AnchorInfo mAnchorInfo = new AnchorInfo();
    private final Runnable mCheckForGapsRunnable = new Runnable() {
        public void run() {
            StaggeredGridLayoutManager.this.checkForGaps();
        }
    };
    private int mFullSizeSpec;
    private int mGapStrategy = 2;
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    @NonNull
    private final LayoutState mLayoutState;
    public LazySpanLookup mLazySpanLookup = new LazySpanLookup();
    private int mOrientation;
    private SavedState mPendingSavedState;
    public int mPendingScrollPosition = -1;
    public int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    private int[] mPrefetchDistances;
    @NonNull
    public OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;
    public boolean mReverseLayout = false;
    @NonNull
    public OrientationHelper mSecondaryOrientation;
    public boolean mShouldReverseLayout = false;
    private int mSizePerSpan;
    private boolean mSmoothScrollbarEnabled = true;
    private int mSpanCount = -1;
    public Span[] mSpans;
    private final Rect mTmpRect = new Rect();

    public class AnchorInfo {
        public boolean mInvalidateOffsets;
        public boolean mLayoutFromEnd;
        public int mOffset;
        public int mPosition;
        public int[] mSpanReferenceLines;
        public boolean mValid;

        public AnchorInfo() {
            reset();
        }

        public void assignCoordinateFromPadding() {
            this.mOffset = this.mLayoutFromEnd ? StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() : StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
        }

        public void assignCoordinateFromPadding(int i2) {
            this.mOffset = this.mLayoutFromEnd ? StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() - i2 : StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding() + i2;
        }

        public void reset() {
            this.mPosition = -1;
            this.mOffset = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mInvalidateOffsets = false;
            this.mValid = false;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void saveSpanReferenceLines(Span[] spanArr) {
            int length = spanArr.length;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr == null || iArr.length < length) {
                this.mSpanReferenceLines = new int[StaggeredGridLayoutManager.this.mSpans.length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.mSpanReferenceLines[i2] = spanArr[i2].getStartLine(Integer.MIN_VALUE);
            }
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        public boolean mFullSpan;
        public Span mSpan;

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

        public final int getSpanIndex() {
            Span span = this.mSpan;
            if (span == null) {
                return -1;
            }
            return span.mIndex;
        }

        public boolean isFullSpan() {
            return this.mFullSpan;
        }

        public void setFullSpan(boolean z) {
            this.mFullSpan = z;
        }
    }

    public static class LazySpanLookup {
        private static final int MIN_SIZE = 10;
        public int[] mData;
        public List<FullSpanItem> mFullSpanItems;

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() {
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public FullSpanItem[] newArray(int i2) {
                    return new FullSpanItem[i2];
                }
            };
            public int mGapDir;
            public int[] mGapPerSpan;
            public boolean mHasUnwantedGapAfter;
            public int mPosition;

            public FullSpanItem() {
            }

            public FullSpanItem(Parcel parcel) {
                this.mPosition = parcel.readInt();
                this.mGapDir = parcel.readInt();
                this.mHasUnwantedGapAfter = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.mGapPerSpan = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public int getGapForSpan(int i2) {
                int[] iArr = this.mGapPerSpan;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i2];
            }

            public String toString() {
                StringBuilder y = a.y("FullSpanItem{mPosition=");
                y.append(this.mPosition);
                y.append(", mGapDir=");
                y.append(this.mGapDir);
                y.append(", mHasUnwantedGapAfter=");
                y.append(this.mHasUnwantedGapAfter);
                y.append(", mGapPerSpan=");
                y.append(Arrays.toString(this.mGapPerSpan));
                y.append('}');
                return y.toString();
            }

            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.mPosition);
                parcel.writeInt(this.mGapDir);
                parcel.writeInt(this.mHasUnwantedGapAfter ? 1 : 0);
                int[] iArr = this.mGapPerSpan;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.mGapPerSpan);
            }
        }

        private int invalidateFullSpansAfter(int i2) {
            if (this.mFullSpanItems == null) {
                return -1;
            }
            FullSpanItem fullSpanItem = getFullSpanItem(i2);
            if (fullSpanItem != null) {
                this.mFullSpanItems.remove(fullSpanItem);
            }
            int size = this.mFullSpanItems.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                } else if (this.mFullSpanItems.get(i3).mPosition >= i2) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 == -1) {
                return -1;
            }
            this.mFullSpanItems.remove(i3);
            return this.mFullSpanItems.get(i3).mPosition;
        }

        private void offsetFullSpansForAddition(int i2, int i3) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.mFullSpanItems.get(size);
                    int i4 = fullSpanItem.mPosition;
                    if (i4 >= i2) {
                        fullSpanItem.mPosition = i4 + i3;
                    }
                }
            }
        }

        private void offsetFullSpansForRemoval(int i2, int i3) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list != null) {
                int i4 = i2 + i3;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.mFullSpanItems.get(size);
                    int i5 = fullSpanItem.mPosition;
                    if (i5 >= i2) {
                        if (i5 < i4) {
                            this.mFullSpanItems.remove(size);
                        } else {
                            fullSpanItem.mPosition = i5 - i3;
                        }
                    }
                }
            }
        }

        public void addFullSpanItem(FullSpanItem fullSpanItem) {
            if (this.mFullSpanItems == null) {
                this.mFullSpanItems = new ArrayList();
            }
            int size = this.mFullSpanItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                FullSpanItem fullSpanItem2 = this.mFullSpanItems.get(i2);
                if (fullSpanItem2.mPosition == fullSpanItem.mPosition) {
                    this.mFullSpanItems.remove(i2);
                }
                if (fullSpanItem2.mPosition >= fullSpanItem.mPosition) {
                    this.mFullSpanItems.add(i2, fullSpanItem);
                    return;
                }
            }
            this.mFullSpanItems.add(fullSpanItem);
        }

        public void clear() {
            int[] iArr = this.mData;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.mFullSpanItems = null;
        }

        public void ensureSize(int i2) {
            int[] iArr = this.mData;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i2, 10) + 1)];
                this.mData = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int[] iArr3 = new int[sizeForPosition(i2)];
                this.mData = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.mData;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int forceInvalidateAfter(int i2) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.mFullSpanItems.get(size).mPosition >= i2) {
                        this.mFullSpanItems.remove(size);
                    }
                }
            }
            return invalidateAfter(i2);
        }

        public FullSpanItem getFirstFullSpanItemInRange(int i2, int i3, int i4, boolean z) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                FullSpanItem fullSpanItem = this.mFullSpanItems.get(i5);
                int i6 = fullSpanItem.mPosition;
                if (i6 >= i3) {
                    return null;
                }
                if (i6 >= i2 && (i4 == 0 || fullSpanItem.mGapDir == i4 || (z && fullSpanItem.mHasUnwantedGapAfter))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem getFullSpanItem(int i2) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.mFullSpanItems.get(size);
                if (fullSpanItem.mPosition == i2) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int getSpan(int i2) {
            int[] iArr = this.mData;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }

        public int invalidateAfter(int i2) {
            int[] iArr = this.mData;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            int invalidateFullSpansAfter = invalidateFullSpansAfter(i2);
            if (invalidateFullSpansAfter == -1) {
                int[] iArr2 = this.mData;
                Arrays.fill(iArr2, i2, iArr2.length, -1);
                return this.mData.length;
            }
            int i3 = invalidateFullSpansAfter + 1;
            Arrays.fill(this.mData, i2, i3, -1);
            return i3;
        }

        public void offsetForAddition(int i2, int i3) {
            int[] iArr = this.mData;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                ensureSize(i4);
                int[] iArr2 = this.mData;
                System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
                Arrays.fill(this.mData, i2, i4, -1);
                offsetFullSpansForAddition(i2, i3);
            }
        }

        public void offsetForRemoval(int i2, int i3) {
            int[] iArr = this.mData;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                ensureSize(i4);
                int[] iArr2 = this.mData;
                System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
                int[] iArr3 = this.mData;
                Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
                offsetFullSpansForRemoval(i2, i3);
            }
        }

        public void setSpan(int i2, Span span) {
            ensureSize(i2);
            this.mData[i2] = span.mIndex;
        }

        public int sizeForPosition(int i2) {
            int length = this.mData.length;
            while (length <= i2) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        public boolean mAnchorLayoutFromEnd;
        public int mAnchorPosition;
        public List<LazySpanLookup.FullSpanItem> mFullSpanItems;
        public boolean mLastLayoutRTL;
        public boolean mReverseLayout;
        public int[] mSpanLookup;
        public int mSpanLookupSize;
        public int[] mSpanOffsets;
        public int mSpanOffsetsSize;
        public int mVisibleAnchorPosition;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mVisibleAnchorPosition = parcel.readInt();
            int readInt = parcel.readInt();
            this.mSpanOffsetsSize = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.mSpanOffsets = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.mSpanLookupSize = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.mSpanLookup = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            this.mLastLayoutRTL = parcel.readInt() == 1 ? true : z;
            this.mFullSpanItems = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }

        public int describeContents() {
            return 0;
        }

        public void invalidateAnchorPositionInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        public void invalidateSpanInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout ? 1 : 0);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
            parcel.writeInt(this.mLastLayoutRTL ? 1 : 0);
            parcel.writeList(this.mFullSpanItems);
        }
    }

    public class Span {
        public static final int INVALID_LINE = Integer.MIN_VALUE;
        public int mCachedEnd = Integer.MIN_VALUE;
        public int mCachedStart = Integer.MIN_VALUE;
        public int mDeletedSize = 0;
        public final int mIndex;
        public ArrayList<View> mViews = new ArrayList<>();

        public Span(int i2) {
            this.mIndex = i2;
        }

        public void appendToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(view);
            this.mCachedEnd = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view) + this.mDeletedSize;
            }
        }

        public void cacheReferenceLineAndClear(boolean z, int i2) {
            int endLine = z ? getEndLine(Integer.MIN_VALUE) : getStartLine(Integer.MIN_VALUE);
            clear();
            if (endLine != Integer.MIN_VALUE) {
                if (z && endLine < StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding()) {
                    return;
                }
                if (z || endLine <= StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding()) {
                    if (i2 != Integer.MIN_VALUE) {
                        endLine += i2;
                    }
                    this.mCachedEnd = endLine;
                    this.mCachedStart = endLine;
                }
            }
        }

        public void calculateCachedEnd() {
            LazySpanLookup.FullSpanItem fullSpanItem;
            ArrayList<View> arrayList = this.mViews;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
            if (layoutParams.mFullSpan && (fullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition())) != null && fullSpanItem.mGapDir == 1) {
                this.mCachedEnd = fullSpanItem.getGapForSpan(this.mIndex) + this.mCachedEnd;
            }
        }

        public void calculateCachedStart() {
            LazySpanLookup.FullSpanItem fullSpanItem;
            View view = this.mViews.get(0);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
            if (layoutParams.mFullSpan && (fullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition())) != null && fullSpanItem.mGapDir == -1) {
                this.mCachedStart -= fullSpanItem.getGapForSpan(this.mIndex);
            }
        }

        public void clear() {
            this.mViews.clear();
            invalidateCache();
            this.mDeletedSize = 0;
        }

        public int findFirstCompletelyVisibleItemPosition() {
            int i2;
            int i3;
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                i3 = this.mViews.size() - 1;
                i2 = -1;
            } else {
                i3 = 0;
                i2 = this.mViews.size();
            }
            return findOneVisibleChild(i3, i2, true);
        }

        public int findFirstPartiallyVisibleItemPosition() {
            int i2;
            int i3;
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                i3 = this.mViews.size() - 1;
                i2 = -1;
            } else {
                i3 = 0;
                i2 = this.mViews.size();
            }
            return findOnePartiallyVisibleChild(i3, i2, true);
        }

        public int findFirstVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOneVisibleChild(this.mViews.size() - 1, -1, false) : findOneVisibleChild(0, this.mViews.size(), false);
        }

        public int findLastCompletelyVisibleItemPosition() {
            int i2;
            int i3;
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                i3 = 0;
                i2 = this.mViews.size();
            } else {
                i3 = this.mViews.size() - 1;
                i2 = -1;
            }
            return findOneVisibleChild(i3, i2, true);
        }

        public int findLastPartiallyVisibleItemPosition() {
            int i2;
            int i3;
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                i3 = 0;
                i2 = this.mViews.size();
            } else {
                i3 = this.mViews.size() - 1;
                i2 = -1;
            }
            return findOnePartiallyVisibleChild(i3, i2, true);
        }

        public int findLastVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOneVisibleChild(0, this.mViews.size(), false) : findOneVisibleChild(this.mViews.size() - 1, -1, false);
        }

        public int findOnePartiallyOrCompletelyVisibleChild(int i2, int i3, boolean z, boolean z2, boolean z3) {
            int startAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
            int endAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding();
            int i4 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.mViews.get(i2);
                int decoratedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
                int decoratedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
                boolean z4 = false;
                boolean z5 = !z3 ? decoratedStart < endAfterPadding : decoratedStart <= endAfterPadding;
                if (!z3 ? decoratedEnd > startAfterPadding : decoratedEnd >= startAfterPadding) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                        }
                    } else if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                    }
                    return StaggeredGridLayoutManager.this.getPosition(view);
                }
                i2 += i4;
            }
            return -1;
        }

        public int findOnePartiallyVisibleChild(int i2, int i3, boolean z) {
            return findOnePartiallyOrCompletelyVisibleChild(i2, i3, false, false, z);
        }

        public int findOneVisibleChild(int i2, int i3, boolean z) {
            return findOnePartiallyOrCompletelyVisibleChild(i2, i3, z, true, false);
        }

        public int getDeletedSize() {
            return this.mDeletedSize;
        }

        public int getEndLine() {
            int i2 = this.mCachedEnd;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        public int getEndLine(int i2) {
            int i3 = this.mCachedEnd;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.mViews.size() == 0) {
                return i2;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        public View getFocusableViewAfter(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.mViews.size() - 1;
                while (size >= 0) {
                    View view2 = this.mViews.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.mReverseLayout && staggeredGridLayoutManager2.getPosition(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.mViews.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.mViews.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.mReverseLayout && staggeredGridLayoutManager3.getPosition(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.mReverseLayout && staggeredGridLayoutManager4.getPosition(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        public LayoutParams getLayoutParams(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        public int getStartLine() {
            int i2 = this.mCachedStart;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }

        public int getStartLine(int i2) {
            int i3 = this.mCachedStart;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.mViews.size() == 0) {
                return i2;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }

        public void invalidateCache() {
            this.mCachedStart = Integer.MIN_VALUE;
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        public void onOffset(int i2) {
            int i3 = this.mCachedStart;
            if (i3 != Integer.MIN_VALUE) {
                this.mCachedStart = i3 + i2;
            }
            int i4 = this.mCachedEnd;
            if (i4 != Integer.MIN_VALUE) {
                this.mCachedEnd = i4 + i2;
            }
        }

        public void popEnd() {
            int size = this.mViews.size();
            View remove = this.mViews.remove(size - 1);
            LayoutParams layoutParams = getLayoutParams(remove);
            layoutParams.mSpan = null;
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(remove);
            }
            if (size == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        public void popStart() {
            View remove = this.mViews.remove(0);
            LayoutParams layoutParams = getLayoutParams(remove);
            layoutParams.mSpan = null;
            if (this.mViews.size() == 0) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(remove);
            }
            this.mCachedStart = Integer.MIN_VALUE;
        }

        public void prependToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(0, view);
            this.mCachedStart = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view) + this.mDeletedSize;
            }
        }

        public void setLine(int i2) {
            this.mCachedStart = i2;
            this.mCachedEnd = i2;
        }
    }

    public StaggeredGridLayoutManager(int i2, int i3) {
        this.mOrientation = i3;
        setSpanCount(i2);
        this.mLayoutState = new LayoutState();
        createOrientationHelpers();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i2, i3);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        this.mLayoutState = new LayoutState();
        createOrientationHelpers();
    }

    private void appendViewToAllSpans(View view) {
        for (int i2 = this.mSpanCount - 1; i2 >= 0; i2--) {
            this.mSpans[i2].appendToSpan(view);
        }
    }

    private void applyPendingSavedState(AnchorInfo anchorInfo) {
        boolean z;
        SavedState savedState = this.mPendingSavedState;
        int i2 = savedState.mSpanOffsetsSize;
        if (i2 > 0) {
            if (i2 == this.mSpanCount) {
                for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                    this.mSpans[i3].clear();
                    SavedState savedState2 = this.mPendingSavedState;
                    int i4 = savedState2.mSpanOffsets[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        i4 += savedState2.mAnchorLayoutFromEnd ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
                    }
                    this.mSpans[i3].setLine(i4);
                }
            } else {
                savedState.invalidateSpanInfo();
                SavedState savedState3 = this.mPendingSavedState;
                savedState3.mAnchorPosition = savedState3.mVisibleAnchorPosition;
            }
        }
        SavedState savedState4 = this.mPendingSavedState;
        this.mLastLayoutRTL = savedState4.mLastLayoutRTL;
        setReverseLayout(savedState4.mReverseLayout);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.mPendingSavedState;
        int i5 = savedState5.mAnchorPosition;
        if (i5 != -1) {
            this.mPendingScrollPosition = i5;
            z = savedState5.mAnchorLayoutFromEnd;
        } else {
            z = this.mShouldReverseLayout;
        }
        anchorInfo.mLayoutFromEnd = z;
        if (savedState5.mSpanLookupSize > 1) {
            LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
            lazySpanLookup.mData = savedState5.mSpanLookup;
            lazySpanLookup.mFullSpanItems = savedState5.mFullSpanItems;
        }
    }

    private void attachViewToSpans(View view, LayoutParams layoutParams, LayoutState layoutState) {
        if (layoutState.mLayoutDirection == 1) {
            if (layoutParams.mFullSpan) {
                appendViewToAllSpans(view);
            } else {
                layoutParams.mSpan.appendToSpan(view);
            }
        } else if (layoutParams.mFullSpan) {
            prependViewToAllSpans(view);
        } else {
            layoutParams.mSpan.prependToSpan(view);
        }
    }

    private int calculateScrollDirectionForPosition(int i2) {
        if (getChildCount() == 0) {
            return this.mShouldReverseLayout ? 1 : -1;
        }
        return (i2 < getFirstChildPosition()) != this.mShouldReverseLayout ? -1 : 1;
    }

    private boolean checkSpanForGap(Span span) {
        if (this.mShouldReverseLayout) {
            if (span.getEndLine() < this.mPrimaryOrientation.getEndAfterPadding()) {
                ArrayList<View> arrayList = span.mViews;
                return !span.getLayoutParams(arrayList.get(arrayList.size() - 1)).mFullSpan;
            }
        } else if (span.getStartLine() > this.mPrimaryOrientation.getStartAfterPadding()) {
            return !span.getLayoutParams(span.mViews.get(0)).mFullSpan;
        }
        return false;
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollExtent(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollOffset(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollRange(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int convertFocusDirectionToLayoutDirection(int i2) {
        if (i2 == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i2 == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i2 == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i2 == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i2 == 66) {
            return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i2 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.mOrientation == 1 ? 1 : Integer.MIN_VALUE;
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i3 = 0; i3 < this.mSpanCount; i3++) {
            fullSpanItem.mGapPerSpan[i3] = i2 - this.mSpans[i3].getEndLine(i2);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i3 = 0; i3 < this.mSpanCount; i3++) {
            fullSpanItem.mGapPerSpan[i3] = this.mSpans[i3].getStartLine(i2) - i2;
        }
        return fullSpanItem;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v5 */
    private int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state) {
        Span span;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        boolean z;
        RecyclerView.Recycler recycler2 = recycler;
        LayoutState layoutState2 = layoutState;
        ? r9 = 0;
        this.mRemainingSpans.set(0, this.mSpanCount, true);
        int i8 = this.mLayoutState.mInfinite ? layoutState2.mLayoutDirection == 1 ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : Integer.MIN_VALUE : layoutState2.mLayoutDirection == 1 ? layoutState2.mEndLine + layoutState2.mAvailable : layoutState2.mStartLine - layoutState2.mAvailable;
        updateAllRemainingSpans(layoutState2.mLayoutDirection, i8);
        int endAfterPadding = this.mShouldReverseLayout ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
        boolean z2 = false;
        while (layoutState.hasMore(state) && (this.mLayoutState.mInfinite || !this.mRemainingSpans.isEmpty())) {
            View next = layoutState2.next(recycler2);
            LayoutParams layoutParams = (LayoutParams) next.getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            int span2 = this.mLazySpanLookup.getSpan(viewLayoutPosition);
            boolean z3 = span2 == -1 ? true : r9;
            if (z3) {
                span = layoutParams.mFullSpan ? this.mSpans[r9] : getNextSpan(layoutState2);
                this.mLazySpanLookup.setSpan(viewLayoutPosition, span);
            } else {
                span = this.mSpans[span2];
            }
            Span span3 = span;
            layoutParams.mSpan = span3;
            if (layoutState2.mLayoutDirection == 1) {
                addView(next);
            } else {
                addView(next, r9);
            }
            measureChildWithDecorationsAndMargin(next, layoutParams, r9);
            if (layoutState2.mLayoutDirection == 1) {
                int maxEnd = layoutParams.mFullSpan ? getMaxEnd(endAfterPadding) : span3.getEndLine(endAfterPadding);
                int decoratedMeasurement = this.mPrimaryOrientation.getDecoratedMeasurement(next) + maxEnd;
                if (z3 && layoutParams.mFullSpan) {
                    LazySpanLookup.FullSpanItem createFullSpanItemFromEnd = createFullSpanItemFromEnd(maxEnd);
                    createFullSpanItemFromEnd.mGapDir = -1;
                    createFullSpanItemFromEnd.mPosition = viewLayoutPosition;
                    this.mLazySpanLookup.addFullSpanItem(createFullSpanItemFromEnd);
                }
                i2 = decoratedMeasurement;
                i3 = maxEnd;
            } else {
                int minStart = layoutParams.mFullSpan ? getMinStart(endAfterPadding) : span3.getStartLine(endAfterPadding);
                i3 = minStart - this.mPrimaryOrientation.getDecoratedMeasurement(next);
                if (z3 && layoutParams.mFullSpan) {
                    LazySpanLookup.FullSpanItem createFullSpanItemFromStart = createFullSpanItemFromStart(minStart);
                    createFullSpanItemFromStart.mGapDir = 1;
                    createFullSpanItemFromStart.mPosition = viewLayoutPosition;
                    this.mLazySpanLookup.addFullSpanItem(createFullSpanItemFromStart);
                }
                i2 = minStart;
            }
            if (layoutParams.mFullSpan && layoutState2.mItemDirection == -1) {
                if (!z3) {
                    if (!(layoutState2.mLayoutDirection == 1 ? areAllEndsEqual() : areAllStartsEqual())) {
                        LazySpanLookup.FullSpanItem fullSpanItem = this.mLazySpanLookup.getFullSpanItem(viewLayoutPosition);
                        if (fullSpanItem != null) {
                            fullSpanItem.mHasUnwantedGapAfter = true;
                        }
                    }
                }
                this.mLaidOutInvalidFullSpan = true;
            }
            attachViewToSpans(next, layoutParams, layoutState2);
            if (!isLayoutRTL() || this.mOrientation != 1) {
                int startAfterPadding = layoutParams.mFullSpan ? this.mSecondaryOrientation.getStartAfterPadding() : (span3.mIndex * this.mSizePerSpan) + this.mSecondaryOrientation.getStartAfterPadding();
                i5 = startAfterPadding;
                i4 = this.mSecondaryOrientation.getDecoratedMeasurement(next) + startAfterPadding;
            } else {
                int endAfterPadding2 = layoutParams.mFullSpan ? this.mSecondaryOrientation.getEndAfterPadding() : this.mSecondaryOrientation.getEndAfterPadding() - (((this.mSpanCount - 1) - span3.mIndex) * this.mSizePerSpan);
                i4 = endAfterPadding2;
                i5 = endAfterPadding2 - this.mSecondaryOrientation.getDecoratedMeasurement(next);
            }
            if (this.mOrientation == 1) {
                staggeredGridLayoutManager = this;
                view = next;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = next;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.layoutDecoratedWithMargins(view, i7, i5, i6, i2);
            if (layoutParams.mFullSpan) {
                updateAllRemainingSpans(this.mLayoutState.mLayoutDirection, i8);
            } else {
                updateRemainingSpans(span3, this.mLayoutState.mLayoutDirection, i8);
            }
            recycle(recycler2, this.mLayoutState);
            if (this.mLayoutState.mStopInFocusable && next.hasFocusable()) {
                if (layoutParams.mFullSpan) {
                    this.mRemainingSpans.clear();
                } else {
                    z = false;
                    this.mRemainingSpans.set(span3.mIndex, false);
                    r9 = z;
                    z2 = true;
                }
            }
            z = false;
            r9 = z;
            z2 = true;
        }
        int i9 = r9;
        if (!z2) {
            recycle(recycler2, this.mLayoutState);
        }
        int startAfterPadding2 = this.mLayoutState.mLayoutDirection == -1 ? this.mPrimaryOrientation.getStartAfterPadding() - getMinStart(this.mPrimaryOrientation.getStartAfterPadding()) : getMaxEnd(this.mPrimaryOrientation.getEndAfterPadding()) - this.mPrimaryOrientation.getEndAfterPadding();
        return startAfterPadding2 > 0 ? Math.min(layoutState2.mAvailable, startAfterPadding2) : i9;
    }

    private int findFirstReferenceChildPosition(int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            int position = getPosition(getChildAt(i3));
            if (position >= 0 && position < i2) {
                return position;
            }
        }
        return 0;
    }

    private int findLastReferenceChildPosition(int i2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i2) {
                return position;
            }
        }
        return 0;
    }

    private void fixEndGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int endAfterPadding;
        int maxEnd = getMaxEnd(Integer.MIN_VALUE);
        if (maxEnd != Integer.MIN_VALUE && (endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - maxEnd) > 0) {
            int i2 = endAfterPadding - (-scrollBy(-endAfterPadding, recycler, state));
            if (z && i2 > 0) {
                this.mPrimaryOrientation.offsetChildren(i2);
            }
        }
    }

    private void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int startAfterPadding;
        int minStart = getMinStart(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        if (minStart != Integer.MAX_VALUE && (startAfterPadding = minStart - this.mPrimaryOrientation.getStartAfterPadding()) > 0) {
            int scrollBy = startAfterPadding - scrollBy(startAfterPadding, recycler, state);
            if (z && scrollBy > 0) {
                this.mPrimaryOrientation.offsetChildren(-scrollBy);
            }
        }
    }

    private int getMaxEnd(int i2) {
        int endLine = this.mSpans[0].getEndLine(i2);
        for (int i3 = 1; i3 < this.mSpanCount; i3++) {
            int endLine2 = this.mSpans[i3].getEndLine(i2);
            if (endLine2 > endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMaxStart(int i2) {
        int startLine = this.mSpans[0].getStartLine(i2);
        for (int i3 = 1; i3 < this.mSpanCount; i3++) {
            int startLine2 = this.mSpans[i3].getStartLine(i2);
            if (startLine2 > startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private int getMinEnd(int i2) {
        int endLine = this.mSpans[0].getEndLine(i2);
        for (int i3 = 1; i3 < this.mSpanCount; i3++) {
            int endLine2 = this.mSpans[i3].getEndLine(i2);
            if (endLine2 < endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMinStart(int i2) {
        int startLine = this.mSpans[0].getStartLine(i2);
        for (int i3 = 1; i3 < this.mSpanCount; i3++) {
            int startLine2 = this.mSpans[i3].getStartLine(i2);
            if (startLine2 < startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private Span getNextSpan(LayoutState layoutState) {
        int i2;
        int i3;
        int i4 = -1;
        if (preferLastSpan(layoutState.mLayoutDirection)) {
            i3 = this.mSpanCount - 1;
            i2 = -1;
        } else {
            i3 = 0;
            i4 = this.mSpanCount;
            i2 = 1;
        }
        Span span = null;
        if (layoutState.mLayoutDirection == 1) {
            int i5 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
            while (i3 != i4) {
                Span span2 = this.mSpans[i3];
                int endLine = span2.getEndLine(startAfterPadding);
                if (endLine < i5) {
                    span = span2;
                    i5 = endLine;
                }
                i3 += i2;
            }
            return span;
        }
        int i6 = Integer.MIN_VALUE;
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        while (i3 != i4) {
            Span span3 = this.mSpans[i3];
            int startLine = span3.getStartLine(endAfterPadding);
            if (startLine > i6) {
                span = span3;
                i6 = startLine;
            }
            i3 += i2;
        }
        return span;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleUpdate(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.mShouldReverseLayout
            if (r0 == 0) goto L_0x0009
            int r0 = r6.getLastChildPosition()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.getFirstChildPosition()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.mLazySpanLookup
            r4.invalidateAfter(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForRemoval(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.mLazySpanLookup
            r7.offsetForAddition(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForRemoval(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForAddition(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.mShouldReverseLayout
            if (r7 == 0) goto L_0x004d
            int r7 = r6.getFirstChildPosition()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.getLastChildPosition()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.requestLayout()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.handleUpdate(int, int, int):void");
    }

    private void measureChildWithDecorationsAndMargin(View view, int i2, int i3, boolean z) {
        calculateItemDecorationsForChild(view, this.mTmpRect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = layoutParams.leftMargin;
        Rect rect = this.mTmpRect;
        int updateSpecWithExtra = updateSpecWithExtra(i2, i4 + rect.left, layoutParams.rightMargin + rect.right);
        int i5 = layoutParams.topMargin;
        Rect rect2 = this.mTmpRect;
        int updateSpecWithExtra2 = updateSpecWithExtra(i3, i5 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (z ? shouldReMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, layoutParams) : shouldMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, layoutParams)) {
            view.measure(updateSpecWithExtra, updateSpecWithExtra2);
        }
    }

    private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutParams, boolean z) {
        int i2;
        int i3;
        if (layoutParams.mFullSpan) {
            if (this.mOrientation == 1) {
                i3 = this.mFullSizeSpec;
            } else {
                measureChildWithDecorationsAndMargin(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), layoutParams.width, true), this.mFullSizeSpec, z);
                return;
            }
        } else if (this.mOrientation == 1) {
            i3 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, layoutParams.width, false);
        } else {
            i3 = RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), layoutParams.width, true);
            i2 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, layoutParams.height, false);
            measureChildWithDecorationsAndMargin(view, i3, i2, z);
        }
        i2 = RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), layoutParams.height, true);
        measureChildWithDecorationsAndMargin(view, i3, i2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (checkForGaps() != false) goto L_0x014f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r0 = r8.mAnchorInfo
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.mPendingSavedState
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.mPendingScrollPosition
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.getItemCount()
            if (r1 != 0) goto L_0x0018
            r8.removeAndRecycleAllViews(r9)
            r0.reset()
            return
        L_0x0018:
            boolean r1 = r0.mValid
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.mPendingScrollPosition
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.mPendingSavedState
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.reset()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.mPendingSavedState
            if (r5 == 0) goto L_0x0037
            r8.applyPendingSavedState(r0)
            goto L_0x003e
        L_0x0037:
            r8.resolveShouldLayoutReverse()
            boolean r5 = r8.mShouldReverseLayout
            r0.mLayoutFromEnd = r5
        L_0x003e:
            r8.updateAnchorInfoForLayout(r10, r0)
            r0.mValid = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.mPendingSavedState
            if (r5 != 0) goto L_0x0060
            int r5 = r8.mPendingScrollPosition
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.mLayoutFromEnd
            boolean r6 = r8.mLastLayoutFromEnd
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.isLayoutRTL()
            boolean r6 = r8.mLastLayoutRTL
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.mLazySpanLookup
            r5.clear()
            r0.mInvalidateOffsets = r4
        L_0x0060:
            int r5 = r8.getChildCount()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.mPendingSavedState
            if (r5 == 0) goto L_0x006e
            int r5 = r5.mSpanOffsetsSize
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.mInvalidateOffsets
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.mSpanCount
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r8.mSpans
            r5 = r5[r1]
            r5.clear()
            int r5 = r0.mOffset
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r6 = r8.mSpans
            r6 = r6[r1]
            r6.setLine(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r1 = r8.mAnchorInfo
            int[] r1 = r1.mSpanReferenceLines
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.mSpanCount
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r8.mSpans
            r5 = r5[r1]
            r5.clear()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r6 = r8.mAnchorInfo
            int[] r6 = r6.mSpanReferenceLines
            r6 = r6[r1]
            r5.setLine(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.mSpanCount
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r8.mSpans
            r5 = r5[r1]
            boolean r6 = r8.mShouldReverseLayout
            int r7 = r0.mOffset
            r5.cacheReferenceLineAndClear(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r1 = r8.mAnchorInfo
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r8.mSpans
            r1.saveSpanReferenceLines(r5)
        L_0x00c9:
            r8.detachAndScrapAttachedViews(r9)
            androidx.recyclerview.widget.LayoutState r1 = r8.mLayoutState
            r1.mRecycle = r3
            r8.mLaidOutInvalidFullSpan = r3
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mSecondaryOrientation
            int r1 = r1.getTotalSpace()
            r8.updateMeasureSpecs(r1)
            int r1 = r0.mPosition
            r8.updateLayoutState(r1, r10)
            boolean r1 = r0.mLayoutFromEnd
            if (r1 == 0) goto L_0x00f0
            r8.setLayoutStateDirection(r2)
            androidx.recyclerview.widget.LayoutState r1 = r8.mLayoutState
            r8.fill(r9, r1, r10)
            r8.setLayoutStateDirection(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.setLayoutStateDirection(r4)
            androidx.recyclerview.widget.LayoutState r1 = r8.mLayoutState
            r8.fill(r9, r1, r10)
            r8.setLayoutStateDirection(r2)
        L_0x00fb:
            androidx.recyclerview.widget.LayoutState r1 = r8.mLayoutState
            int r2 = r0.mPosition
            int r5 = r1.mItemDirection
            int r2 = r2 + r5
            r1.mCurrentPosition = r2
            r8.fill(r9, r1, r10)
            r8.repositionToWrapContentIfNecessary()
            int r1 = r8.getChildCount()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.mShouldReverseLayout
            if (r1 == 0) goto L_0x011b
            r8.fixEndGap(r9, r10, r4)
            r8.fixStartGap(r9, r10, r3)
            goto L_0x0121
        L_0x011b:
            r8.fixStartGap(r9, r10, r4)
            r8.fixEndGap(r9, r10, r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.isPreLayout()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.mGapStrategy
            if (r11 == 0) goto L_0x013f
            int r11 = r8.getChildCount()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.mLaidOutInvalidFullSpan
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.hasGapsToFix()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = r4
            goto L_0x0140
        L_0x013f:
            r11 = r3
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.mCheckForGapsRunnable
            r8.removeCallbacks(r11)
            boolean r11 = r8.checkForGaps()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = r3
        L_0x014f:
            boolean r11 = r10.isPreLayout()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r11 = r8.mAnchorInfo
            r11.reset()
        L_0x015a:
            boolean r11 = r0.mLayoutFromEnd
            r8.mLastLayoutFromEnd = r11
            boolean r11 = r8.isLayoutRTL()
            r8.mLastLayoutRTL = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r11 = r8.mAnchorInfo
            r11.reset()
            r8.onLayoutChildren(r9, r10, r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    private boolean preferLastSpan(int i2) {
        if (this.mOrientation == 0) {
            return (i2 == -1) != this.mShouldReverseLayout;
        }
        return ((i2 == -1) == this.mShouldReverseLayout) == isLayoutRTL();
    }

    private void prependViewToAllSpans(View view) {
        for (int i2 = this.mSpanCount - 1; i2 >= 0; i2--) {
            this.mSpans[i2].prependToSpan(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.mLayoutDirection == -1) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void recycle(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.LayoutState r4) {
        /*
            r2 = this;
            boolean r0 = r4.mRecycle
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.mInfinite
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.mAvailable
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.mLayoutDirection
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.mEndLine
        L_0x0014:
            r2.recycleFromEnd(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.mStartLine
        L_0x001a:
            r2.recycleFromStart(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.mLayoutDirection
            if (r0 != r1) goto L_0x0037
            int r0 = r4.mStartLine
            int r1 = r2.getMaxStart(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.mEndLine
            int r4 = r4.mAvailable
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.mEndLine
            int r0 = r2.getMinEnd(r0)
            int r1 = r4.mEndLine
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.mStartLine
            int r4 = r4.mAvailable
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.recycle(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.LayoutState):void");
    }

    private void recycleFromEnd(RecyclerView.Recycler recycler, int i2) {
        int childCount = getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.getDecoratedStart(childAt) >= i2 && this.mPrimaryOrientation.getTransformedStartWithDecoration(childAt) >= i2) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mFullSpan) {
                    int i3 = 0;
                    while (i3 < this.mSpanCount) {
                        if (this.mSpans[i3].mViews.size() != 1) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.mSpanCount; i4++) {
                        this.mSpans[i4].popEnd();
                    }
                } else if (layoutParams.mSpan.mViews.size() != 1) {
                    layoutParams.mSpan.popEnd();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, recycler);
                childCount--;
            } else {
                return;
            }
        }
    }

    private void recycleFromStart(RecyclerView.Recycler recycler, int i2) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) <= i2 && this.mPrimaryOrientation.getTransformedEndWithDecoration(childAt) <= i2) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mFullSpan) {
                    int i3 = 0;
                    while (i3 < this.mSpanCount) {
                        if (this.mSpans[i3].mViews.size() != 1) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.mSpanCount; i4++) {
                        this.mSpans[i4].popStart();
                    }
                } else if (layoutParams.mSpan.mViews.size() != 1) {
                    layoutParams.mSpan.popStart();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    private void repositionToWrapContentIfNecessary() {
        if (this.mSecondaryOrientation.getMode() != 1073741824) {
            float f = 0.0f;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                float decoratedMeasurement = (float) this.mSecondaryOrientation.getDecoratedMeasurement(childAt);
                if (decoratedMeasurement >= f) {
                    if (((LayoutParams) childAt.getLayoutParams()).isFullSpan()) {
                        decoratedMeasurement = (decoratedMeasurement * 1.0f) / ((float) this.mSpanCount);
                    }
                    f = Math.max(f, decoratedMeasurement);
                }
            }
            int i3 = this.mSizePerSpan;
            int round = Math.round(f * ((float) this.mSpanCount));
            if (this.mSecondaryOrientation.getMode() == Integer.MIN_VALUE) {
                round = Math.min(round, this.mSecondaryOrientation.getTotalSpace());
            }
            updateMeasureSpecs(round);
            if (this.mSizePerSpan != i3) {
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt2 = getChildAt(i4);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (!layoutParams.mFullSpan) {
                        if (!isLayoutRTL() || this.mOrientation != 1) {
                            int i5 = layoutParams.mSpan.mIndex;
                            int i6 = this.mOrientation;
                            int i7 = (this.mSizePerSpan * i5) - (i5 * i3);
                            if (i6 == 1) {
                                childAt2.offsetLeftAndRight(i7);
                            } else {
                                childAt2.offsetTopAndBottom(i7);
                            }
                        } else {
                            int i8 = this.mSpanCount;
                            int i9 = layoutParams.mSpan.mIndex;
                            childAt2.offsetLeftAndRight(((-((i8 - 1) - i9)) * this.mSizePerSpan) - ((-((i8 - 1) - i9)) * i3));
                        }
                    }
                }
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        this.mShouldReverseLayout = (this.mOrientation == 1 || !isLayoutRTL()) ? this.mReverseLayout : !this.mReverseLayout;
    }

    private void setLayoutStateDirection(int i2) {
        LayoutState layoutState = this.mLayoutState;
        layoutState.mLayoutDirection = i2;
        int i3 = 1;
        if (this.mShouldReverseLayout != (i2 == -1)) {
            i3 = -1;
        }
        layoutState.mItemDirection = i3;
    }

    private void updateAllRemainingSpans(int i2, int i3) {
        for (int i4 = 0; i4 < this.mSpanCount; i4++) {
            if (!this.mSpans[i4].mViews.isEmpty()) {
                updateRemainingSpans(this.mSpans[i4], i2, i3);
            }
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorInfo) {
        boolean z = this.mLastLayoutFromEnd;
        int itemCount = state.getItemCount();
        anchorInfo.mPosition = z ? findLastReferenceChildPosition(itemCount) : findFirstReferenceChildPosition(itemCount);
        anchorInfo.mOffset = Integer.MIN_VALUE;
        return true;
    }

    private void updateLayoutState(int i2, RecyclerView.State state) {
        int i3;
        int i4;
        int targetScrollPosition;
        LayoutState layoutState = this.mLayoutState;
        boolean z = false;
        layoutState.mAvailable = 0;
        layoutState.mCurrentPosition = i2;
        if (!isSmoothScrolling() || (targetScrollPosition = state.getTargetScrollPosition()) == -1) {
            i4 = 0;
            i3 = 0;
        } else {
            if (this.mShouldReverseLayout == (targetScrollPosition < i2)) {
                i4 = this.mPrimaryOrientation.getTotalSpace();
                i3 = 0;
            } else {
                i3 = this.mPrimaryOrientation.getTotalSpace();
                i4 = 0;
            }
        }
        if (getClipToPadding()) {
            this.mLayoutState.mStartLine = this.mPrimaryOrientation.getStartAfterPadding() - i3;
            this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEndAfterPadding() + i4;
        } else {
            this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEnd() + i4;
            this.mLayoutState.mStartLine = -i3;
        }
        LayoutState layoutState2 = this.mLayoutState;
        layoutState2.mStopInFocusable = false;
        layoutState2.mRecycle = true;
        if (this.mPrimaryOrientation.getMode() == 0 && this.mPrimaryOrientation.getEnd() == 0) {
            z = true;
        }
        layoutState2.mInfinite = z;
    }

    private void updateRemainingSpans(Span span, int i2, int i3) {
        int deletedSize = span.getDeletedSize();
        if (i2 == -1) {
            if (span.getStartLine() + deletedSize > i3) {
                return;
            }
        } else if (span.getEndLine() - deletedSize < i3) {
            return;
        }
        this.mRemainingSpans.set(span.mIndex, false);
    }

    private int updateSpecWithExtra(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    public boolean areAllEndsEqual() {
        int endLine = this.mSpans[0].getEndLine(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            if (this.mSpans[i2].getEndLine(Integer.MIN_VALUE) != endLine) {
                return false;
            }
        }
        return true;
    }

    public boolean areAllStartsEqual() {
        int startLine = this.mSpans[0].getStartLine(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            if (this.mSpans[i2].getStartLine(Integer.MIN_VALUE) != startLine) {
                return false;
            }
        }
        return true;
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public boolean checkForGaps() {
        int i2;
        int i3;
        if (getChildCount() == 0 || this.mGapStrategy == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.mShouldReverseLayout) {
            i3 = getLastChildPosition();
            i2 = getFirstChildPosition();
        } else {
            i3 = getFirstChildPosition();
            i2 = getLastChildPosition();
        }
        if (i3 == 0 && hasGapsToFix() != null) {
            this.mLazySpanLookup.clear();
        } else if (!this.mLaidOutInvalidFullSpan) {
            return false;
        } else {
            int i4 = this.mShouldReverseLayout ? -1 : 1;
            int i5 = i2 + 1;
            LazySpanLookup.FullSpanItem firstFullSpanItemInRange = this.mLazySpanLookup.getFirstFullSpanItemInRange(i3, i5, i4, true);
            if (firstFullSpanItemInRange == null) {
                this.mLaidOutInvalidFullSpan = false;
                this.mLazySpanLookup.forceInvalidateAfter(i5);
                return false;
            }
            LazySpanLookup.FullSpanItem firstFullSpanItemInRange2 = this.mLazySpanLookup.getFirstFullSpanItemInRange(i3, firstFullSpanItemInRange.mPosition, i4 * -1, true);
            if (firstFullSpanItemInRange2 == null) {
                this.mLazySpanLookup.forceInvalidateAfter(firstFullSpanItemInRange.mPosition);
            } else {
                this.mLazySpanLookup.forceInvalidateAfter(firstFullSpanItemInRange2.mPosition + 1);
            }
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i4;
        int i5;
        if (this.mOrientation != 0) {
            i2 = i3;
        }
        if (getChildCount() != 0 && i2 != 0) {
            prepareLayoutStateForDelta(i2, state);
            int[] iArr = this.mPrefetchDistances;
            if (iArr == null || iArr.length < this.mSpanCount) {
                this.mPrefetchDistances = new int[this.mSpanCount];
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.mSpanCount; i7++) {
                LayoutState layoutState = this.mLayoutState;
                if (layoutState.mItemDirection == -1) {
                    i5 = layoutState.mStartLine;
                    i4 = this.mSpans[i7].getStartLine(i5);
                } else {
                    i5 = this.mSpans[i7].getEndLine(layoutState.mEndLine);
                    i4 = this.mLayoutState.mEndLine;
                }
                int i8 = i5 - i4;
                if (i8 >= 0) {
                    this.mPrefetchDistances[i6] = i8;
                    i6++;
                }
            }
            Arrays.sort(this.mPrefetchDistances, 0, i6);
            for (int i9 = 0; i9 < i6 && this.mLayoutState.hasMore(state); i9++) {
                layoutPrefetchRegistry.addPosition(this.mLayoutState.mCurrentPosition, this.mPrefetchDistances[i9]);
                LayoutState layoutState2 = this.mLayoutState;
                layoutState2.mCurrentPosition += layoutState2.mItemDirection;
            }
        }
    }

    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public PointF computeScrollVectorForPosition(int i2) {
        int calculateScrollDirectionForPosition = calculateScrollDirectionForPosition(i2);
        PointF pointF = new PointF();
        if (calculateScrollDirectionForPosition == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = (float) calculateScrollDirectionForPosition;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) calculateScrollDirectionForPosition;
        }
        return pointF;
    }

    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder y = a.y("Provided int[]'s size must be more than or equal to span count. Expected:");
            y.append(this.mSpanCount);
            y.append(", array size:");
            y.append(iArr.length);
            throw new IllegalArgumentException(y.toString());
        }
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            iArr[i2] = this.mSpans[i2].findFirstCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public View findFirstVisibleItemClosestToEnd(boolean z) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            int decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd <= endAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View findFirstVisibleItemClosestToStart(boolean z) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart >= startAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public int findFirstVisibleItemPositionInt() {
        View findFirstVisibleItemClosestToEnd = this.mShouldReverseLayout ? findFirstVisibleItemClosestToEnd(true) : findFirstVisibleItemClosestToStart(true);
        if (findFirstVisibleItemClosestToEnd == null) {
            return -1;
        }
        return getPosition(findFirstVisibleItemClosestToEnd);
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder y = a.y("Provided int[]'s size must be more than or equal to span count. Expected:");
            y.append(this.mSpanCount);
            y.append(", array size:");
            y.append(iArr.length);
            throw new IllegalArgumentException(y.toString());
        }
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            iArr[i2] = this.mSpans[i2].findFirstVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder y = a.y("Provided int[]'s size must be more than or equal to span count. Expected:");
            y.append(this.mSpanCount);
            y.append(", array size:");
            y.append(iArr.length);
            throw new IllegalArgumentException(y.toString());
        }
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            iArr[i2] = this.mSpans[i2].findLastCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder y = a.y("Provided int[]'s size must be more than or equal to span count. Expected:");
            y.append(this.mSpanCount);
            y.append(", array size:");
            y.append(iArr.length);
            throw new IllegalArgumentException(y.toString());
        }
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            iArr[i2] = this.mSpans[i2].findLastVisibleItemPosition();
        }
        return iArr;
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
        return this.mOrientation == 1 ? this.mSpanCount : super.getColumnCountForAccessibility(recycler, state);
    }

    public int getFirstChildPosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int getGapStrategy() {
        return this.mGapStrategy;
    }

    public int getLastChildPosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return this.mOrientation == 0 ? this.mSpanCount : super.getRowCountForAccessibility(recycler, state);
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View hasGapsToFix() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.mSpanCount
            r2.<init>(r3)
            int r3 = r12.mSpanCount
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.mOrientation
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.mShouldReverseLayout
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            int r9 = r9.mIndex
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            boolean r9 = r12.checkSpanForGap(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            int r9 = r9.mIndex
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.mFullSpan
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.mShouldReverseLayout
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedEnd(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedEnd(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedStart(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedStart(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = r1
            goto L_0x008b
        L_0x008a:
            r10 = r4
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r8 = r8.mSpan
            int r8 = r8.mIndex
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r9.mSpan
            int r9 = r9.mIndex
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = r1
            goto L_0x00a1
        L_0x00a0:
            r8 = r4
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = r1
            goto L_0x00a6
        L_0x00a5:
            r9 = r4
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.hasGapsToFix():android.view.View");
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    public boolean isAutoMeasureEnabled() {
        return this.mGapStrategy != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public void offsetChildrenHorizontal(int i2) {
        super.offsetChildrenHorizontal(i2);
        for (int i3 = 0; i3 < this.mSpanCount; i3++) {
            this.mSpans[i3].onOffset(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        super.offsetChildrenVertical(i2);
        for (int i3 = 0; i3 < this.mSpanCount; i3++) {
            this.mSpans[i3].onOffset(i2);
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].clear();
        }
        recyclerView.requestLayout();
    }

    @Nullable
    public View onFocusSearchFailed(View view, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View findContainingItemView;
        View focusableViewAfter;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i2);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) findContainingItemView.getLayoutParams();
        boolean z = layoutParams.mFullSpan;
        Span span = layoutParams.mSpan;
        int lastChildPosition = convertFocusDirectionToLayoutDirection == 1 ? getLastChildPosition() : getFirstChildPosition();
        updateLayoutState(lastChildPosition, state);
        setLayoutStateDirection(convertFocusDirectionToLayoutDirection);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = layoutState.mItemDirection + lastChildPosition;
        layoutState.mAvailable = (int) (((float) this.mPrimaryOrientation.getTotalSpace()) * MAX_SCROLL_FACTOR);
        LayoutState layoutState2 = this.mLayoutState;
        layoutState2.mStopInFocusable = true;
        layoutState2.mRecycle = false;
        fill(recycler, layoutState2, state);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        if (!z && (focusableViewAfter = span.getFocusableViewAfter(lastChildPosition, convertFocusDirectionToLayoutDirection)) != null && focusableViewAfter != findContainingItemView) {
            return focusableViewAfter;
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i3 = this.mSpanCount - 1; i3 >= 0; i3--) {
                View focusableViewAfter2 = this.mSpans[i3].getFocusableViewAfter(lastChildPosition, convertFocusDirectionToLayoutDirection);
                if (focusableViewAfter2 != null && focusableViewAfter2 != findContainingItemView) {
                    return focusableViewAfter2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.mSpanCount; i4++) {
                View focusableViewAfter3 = this.mSpans[i4].getFocusableViewAfter(lastChildPosition, convertFocusDirectionToLayoutDirection);
                if (focusableViewAfter3 != null && focusableViewAfter3 != findContainingItemView) {
                    return focusableViewAfter3;
                }
            }
        }
        boolean z2 = (this.mReverseLayout ^ true) == (convertFocusDirectionToLayoutDirection == -1);
        if (!z) {
            View findViewByPosition = findViewByPosition(z2 ? span.findFirstPartiallyVisibleItemPosition() : span.findLastPartiallyVisibleItemPosition());
            if (!(findViewByPosition == null || findViewByPosition == findContainingItemView)) {
                return findViewByPosition;
            }
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i5 = this.mSpanCount - 1; i5 >= 0; i5--) {
                if (i5 != span.mIndex) {
                    Span[] spanArr = this.mSpans;
                    View findViewByPosition2 = findViewByPosition(z2 ? spanArr[i5].findFirstPartiallyVisibleItemPosition() : spanArr[i5].findLastPartiallyVisibleItemPosition());
                    if (!(findViewByPosition2 == null || findViewByPosition2 == findContainingItemView)) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.mSpanCount; i6++) {
                Span[] spanArr2 = this.mSpans;
                View findViewByPosition3 = findViewByPosition(z2 ? spanArr2[i6].findFirstPartiallyVisibleItemPosition() : spanArr2[i6].findLastPartiallyVisibleItemPosition());
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (findFirstVisibleItemClosestToStart != null && findFirstVisibleItemClosestToEnd != null) {
                int position = getPosition(findFirstVisibleItemClosestToStart);
                int position2 = getPosition(findFirstVisibleItemClosestToEnd);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
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
        int i6 = 1;
        if (this.mOrientation == 0) {
            i5 = layoutParams2.getSpanIndex();
            if (layoutParams2.mFullSpan) {
                i6 = this.mSpanCount;
            }
            i4 = i6;
            i3 = -1;
            i2 = -1;
        } else {
            i5 = -1;
            i4 = -1;
            i3 = layoutParams2.getSpanIndex();
            if (layoutParams2.mFullSpan) {
                i6 = this.mSpanCount;
            }
            i2 = i6;
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i5, i4, i3, i2, false, false));
    }

    public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        handleUpdate(i2, i3, 1);
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        handleUpdate(i2, i3, 8);
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        handleUpdate(i2, i3, 2);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
        handleUpdate(i2, i3, 4);
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        onLayoutChildren(recycler, state, true);
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo.reset();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        int i2;
        int i3;
        int[] iArr;
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        savedState.mReverseLayout = this.mReverseLayout;
        savedState.mAnchorLayoutFromEnd = this.mLastLayoutFromEnd;
        savedState.mLastLayoutRTL = this.mLastLayoutRTL;
        LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.mData) == null) {
            savedState.mSpanLookupSize = 0;
        } else {
            savedState.mSpanLookup = iArr;
            savedState.mSpanLookupSize = iArr.length;
            savedState.mFullSpanItems = lazySpanLookup.mFullSpanItems;
        }
        if (getChildCount() > 0) {
            savedState.mAnchorPosition = this.mLastLayoutFromEnd ? getLastChildPosition() : getFirstChildPosition();
            savedState.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
            int i4 = this.mSpanCount;
            savedState.mSpanOffsetsSize = i4;
            savedState.mSpanOffsets = new int[i4];
            for (int i5 = 0; i5 < this.mSpanCount; i5++) {
                if (this.mLastLayoutFromEnd) {
                    i2 = this.mSpans[i5].getEndLine(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.mPrimaryOrientation.getEndAfterPadding();
                    } else {
                        savedState.mSpanOffsets[i5] = i2;
                    }
                } else {
                    i2 = this.mSpans[i5].getStartLine(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.mPrimaryOrientation.getStartAfterPadding();
                    } else {
                        savedState.mSpanOffsets[i5] = i2;
                    }
                }
                i2 -= i3;
                savedState.mSpanOffsets[i5] = i2;
            }
        } else {
            savedState.mAnchorPosition = -1;
            savedState.mVisibleAnchorPosition = -1;
            savedState.mSpanOffsetsSize = 0;
        }
        return savedState;
    }

    public void onScrollStateChanged(int i2) {
        if (i2 == 0) {
            checkForGaps();
        }
    }

    public void prepareLayoutStateForDelta(int i2, RecyclerView.State state) {
        int i3;
        int i4;
        if (i2 > 0) {
            i4 = getLastChildPosition();
            i3 = 1;
        } else {
            i3 = -1;
            i4 = getFirstChildPosition();
        }
        this.mLayoutState.mRecycle = true;
        updateLayoutState(i4, state);
        setLayoutStateDirection(i3);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = i4 + layoutState.mItemDirection;
        layoutState.mAvailable = Math.abs(i2);
    }

    public int scrollBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i2, state);
        int fill = fill(recycler, this.mLayoutState, state);
        if (this.mLayoutState.mAvailable >= fill) {
            i2 = i2 < 0 ? -fill : fill;
        }
        this.mPrimaryOrientation.offsetChildren(-i2);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        LayoutState layoutState = this.mLayoutState;
        layoutState.mAvailable = 0;
        recycle(recycler, layoutState);
        return i2;
    }

    public int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i2, recycler, state);
    }

    public void scrollToPosition(int i2) {
        SavedState savedState = this.mPendingSavedState;
        if (!(savedState == null || savedState.mAnchorPosition == i2)) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i2;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i2, int i3) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i2;
        this.mPendingScrollPositionOffset = i3;
        requestLayout();
    }

    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i2, recycler, state);
    }

    public void setGapStrategy(int i2) {
        assertNotInLayoutOrScroll((String) null);
        if (i2 != this.mGapStrategy) {
            if (i2 == 0 || i2 == 2) {
                this.mGapStrategy = i2;
                requestLayout();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    public void setMeasuredDimension(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            i5 = RecyclerView.LayoutManager.chooseSize(i3, rect.height() + paddingBottom, getMinimumHeight());
            i4 = RecyclerView.LayoutManager.chooseSize(i2, (this.mSizePerSpan * this.mSpanCount) + paddingRight, getMinimumWidth());
        } else {
            i4 = RecyclerView.LayoutManager.chooseSize(i2, rect.width() + paddingRight, getMinimumWidth());
            i5 = RecyclerView.LayoutManager.chooseSize(i3, (this.mSizePerSpan * this.mSpanCount) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(i4, i5);
    }

    public void setOrientation(int i2) {
        if (i2 == 0 || i2 == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i2 != this.mOrientation) {
                this.mOrientation = i2;
                OrientationHelper orientationHelper = this.mPrimaryOrientation;
                this.mPrimaryOrientation = this.mSecondaryOrientation;
                this.mSecondaryOrientation = orientationHelper;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        SavedState savedState = this.mPendingSavedState;
        if (!(savedState == null || savedState.mReverseLayout == z)) {
            savedState.mReverseLayout = z;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSpanCount(int i2) {
        assertNotInLayoutOrScroll((String) null);
        if (i2 != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i2;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new Span[this.mSpanCount];
            for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                this.mSpans[i3] = new Span(i3);
            }
            requestLayout();
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i2);
        startSmoothScroll(linearSmoothScroller);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    public boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i2;
        int i3;
        int i4;
        boolean z = false;
        if (!state.isPreLayout() && (i2 = this.mPendingScrollPosition) != -1) {
            if (i2 < 0 || i2 >= state.getItemCount()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.mPendingSavedState;
                if (savedState == null || savedState.mAnchorPosition == -1 || savedState.mSpanOffsetsSize < 1) {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        anchorInfo.mPosition = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
                        if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                            if (anchorInfo.mLayoutFromEnd) {
                                i4 = this.mPrimaryOrientation.getEndAfterPadding() - this.mPendingScrollPositionOffset;
                                i3 = this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                            } else {
                                i4 = this.mPrimaryOrientation.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                                i3 = this.mPrimaryOrientation.getDecoratedStart(findViewByPosition);
                            }
                            anchorInfo.mOffset = i4 - i3;
                            return true;
                        } else if (this.mPrimaryOrientation.getDecoratedMeasurement(findViewByPosition) > this.mPrimaryOrientation.getTotalSpace()) {
                            anchorInfo.mOffset = anchorInfo.mLayoutFromEnd ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
                            return true;
                        } else {
                            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(findViewByPosition) - this.mPrimaryOrientation.getStartAfterPadding();
                            if (decoratedStart < 0) {
                                anchorInfo.mOffset = -decoratedStart;
                                return true;
                            }
                            int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                            if (endAfterPadding < 0) {
                                anchorInfo.mOffset = endAfterPadding;
                                return true;
                            }
                            anchorInfo.mOffset = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.mPendingScrollPosition;
                        anchorInfo.mPosition = i5;
                        int i6 = this.mPendingScrollPositionOffset;
                        if (i6 == Integer.MIN_VALUE) {
                            if (calculateScrollDirectionForPosition(i5) == 1) {
                                z = true;
                            }
                            anchorInfo.mLayoutFromEnd = z;
                            anchorInfo.assignCoordinateFromPadding();
                        } else {
                            anchorInfo.assignCoordinateFromPadding(i6);
                        }
                        anchorInfo.mInvalidateOffsets = true;
                    }
                } else {
                    anchorInfo.mOffset = Integer.MIN_VALUE;
                    anchorInfo.mPosition = this.mPendingScrollPosition;
                }
                return true;
            }
        }
        return false;
    }

    public void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorInfo) {
        if (!updateAnchorFromPendingData(state, anchorInfo) && !updateAnchorFromChildren(state, anchorInfo)) {
            anchorInfo.assignCoordinateFromPadding();
            anchorInfo.mPosition = 0;
        }
    }

    public void updateMeasureSpecs(int i2) {
        this.mSizePerSpan = i2 / this.mSpanCount;
        this.mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(i2, this.mSecondaryOrientation.getMode());
    }
}
