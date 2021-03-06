package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.R;
import androidx.viewpager2.adapter.StatefulAdapter;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ViewPager2 extends ViewGroup {
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static boolean sFeatureEnhancedA11yEnabled = true;
    public AccessibilityProvider mAccessibilityProvider;
    public int mCurrentItem;
    private RecyclerView.AdapterDataObserver mCurrentItemDataSetChangeObserver = new DataSetChangeObserver() {
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.mCurrentItemDirty = true;
            viewPager2.mScrollEventAdapter.notifyDataSetChangeHappened();
        }
    };
    public boolean mCurrentItemDirty = false;
    private CompositeOnPageChangeCallback mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback(3);
    private FakeDrag mFakeDragger;
    private LinearLayoutManager mLayoutManager;
    private int mOffscreenPageLimit = -1;
    private CompositeOnPageChangeCallback mPageChangeEventDispatcher;
    private PageTransformerAdapter mPageTransformerAdapter;
    private PagerSnapHelper mPagerSnapHelper;
    private Parcelable mPendingAdapterState;
    private int mPendingCurrentItem = -1;
    public RecyclerView mRecyclerView;
    private RecyclerView.ItemAnimator mSavedItemAnimator = null;
    private boolean mSavedItemAnimatorPresent = false;
    public ScrollEventAdapter mScrollEventAdapter;
    private final Rect mTmpChildRect = new Rect();
    private final Rect mTmpContainerRect = new Rect();
    private boolean mUserInputEnabled = true;

    public abstract class AccessibilityProvider {
        private AccessibilityProvider() {
        }

        public boolean handlesGetAccessibilityClassName() {
            return false;
        }

        public boolean handlesLmPerformAccessibilityAction(int i2) {
            return false;
        }

        public boolean handlesPerformAccessibilityAction(int i2, Bundle bundle) {
            return false;
        }

        public boolean handlesRvGetAccessibilityClassName() {
            return false;
        }

        public void onAttachAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        public void onDetachAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        public String onGetAccessibilityClassName() {
            throw new IllegalStateException("Not implemented.");
        }

        public void onInitialize(@NonNull CompositeOnPageChangeCallback compositeOnPageChangeCallback, @NonNull RecyclerView recyclerView) {
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void onLmInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public boolean onLmPerformAccessibilityAction(int i2) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean onPerformAccessibilityAction(int i2, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void onRestorePendingState() {
        }

        public CharSequence onRvGetAccessibilityClassName() {
            throw new IllegalStateException("Not implemented.");
        }

        public void onRvInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        public void onSetLayoutDirection() {
        }

        public void onSetNewCurrentItem() {
        }

        public void onSetOrientation() {
        }

        public void onSetUserInputEnabled() {
        }
    }

    public class BasicAccessibilityProvider extends AccessibilityProvider {
        public BasicAccessibilityProvider() {
            super();
        }

        public boolean handlesLmPerformAccessibilityAction(int i2) {
            return (i2 == 8192 || i2 == 4096) && !ViewPager2.this.isUserInputEnabled();
        }

        public boolean handlesRvGetAccessibilityClassName() {
            return true;
        }

        public void onLmInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (!ViewPager2.this.isUserInputEnabled()) {
                accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfoCompat.setScrollable(false);
            }
        }

        public boolean onLmPerformAccessibilityAction(int i2) {
            if (handlesLmPerformAccessibilityAction(i2)) {
                return false;
            }
            throw new IllegalStateException();
        }

        public CharSequence onRvGetAccessibilityClassName() {
            if (handlesRvGetAccessibilityClassName()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        private DataSetChangeObserver() {
        }

        public abstract void onChanged();

        public final void onItemRangeChanged(int i2, int i3) {
            onChanged();
        }

        public final void onItemRangeChanged(int i2, int i3, @Nullable Object obj) {
            onChanged();
        }

        public final void onItemRangeInserted(int i2, int i3) {
            onChanged();
        }

        public final void onItemRangeMoved(int i2, int i3, int i4) {
            onChanged();
        }

        public final void onItemRangeRemoved(int i2, int i3) {
            onChanged();
        }
    }

    public class LinearLayoutManagerImpl extends LinearLayoutManager {
        public LinearLayoutManagerImpl(Context context) {
            super(context);
        }

        public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(state, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
            ViewPager2.this.mAccessibilityProvider.onLmInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
        }

        public boolean performAccessibilityAction(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, int i2, @Nullable Bundle bundle) {
            return ViewPager2.this.mAccessibilityProvider.handlesLmPerformAccessibilityAction(i2) ? ViewPager2.this.mAccessibilityProvider.onLmPerformAccessibilityAction(i2) : super.performAccessibilityAction(recycler, state, i2, bundle);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @IntRange(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffscreenPageLimit {
    }

    public static abstract class OnPageChangeCallback {
        public void onPageScrollStateChanged(int i2) {
        }

        public void onPageScrolled(int i2, float f, @Px int i3) {
        }

        public void onPageSelected(int i2) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public class PageAwareAccessibilityProvider extends AccessibilityProvider {
        private final AccessibilityViewCommand mActionPageBackward = new AccessibilityViewCommand() {
            public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                PageAwareAccessibilityProvider.this.setCurrentItemFromAccessibilityCommand(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        };
        private final AccessibilityViewCommand mActionPageForward = new AccessibilityViewCommand() {
            public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                PageAwareAccessibilityProvider.this.setCurrentItemFromAccessibilityCommand(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        };
        private RecyclerView.AdapterDataObserver mAdapterDataObserver;

        public PageAwareAccessibilityProvider() {
            super();
        }

        private void addCollectionInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i2;
            int i3;
            if (ViewPager2.this.getAdapter() == null) {
                i3 = 0;
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i3 = ViewPager2.this.getAdapter().getItemCount();
                i2 = 0;
            } else {
                i2 = ViewPager2.this.getAdapter().getItemCount();
                i3 = 0;
            }
            AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(i3, i2, false, 0));
        }

        private void addScrollActions(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.isUserInputEnabled()) {
                if (ViewPager2.this.mCurrentItem > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        public boolean handlesGetAccessibilityClassName() {
            return true;
        }

        public boolean handlesPerformAccessibilityAction(int i2, Bundle bundle) {
            return i2 == 8192 || i2 == 4096;
        }

        public void onAttachAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
            updatePageAccessibilityActions();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.mAdapterDataObserver);
            }
        }

        public void onDetachAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.mAdapterDataObserver);
            }
        }

        public String onGetAccessibilityClassName() {
            if (handlesGetAccessibilityClassName()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        public void onInitialize(@NonNull CompositeOnPageChangeCallback compositeOnPageChangeCallback, @NonNull RecyclerView recyclerView) {
            ViewCompat.setImportantForAccessibility(recyclerView, 2);
            this.mAdapterDataObserver = new DataSetChangeObserver() {
                public void onChanged() {
                    PageAwareAccessibilityProvider.this.updatePageAccessibilityActions();
                }
            };
            if (ViewCompat.getImportantForAccessibility(ViewPager2.this) == 0) {
                ViewCompat.setImportantForAccessibility(ViewPager2.this, 1);
            }
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            addCollectionInfo(accessibilityNodeInfo);
            addScrollActions(accessibilityNodeInfo);
        }

        public boolean onPerformAccessibilityAction(int i2, Bundle bundle) {
            if (handlesPerformAccessibilityAction(i2, bundle)) {
                setCurrentItemFromAccessibilityCommand(i2 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
                return true;
            }
            throw new IllegalStateException();
        }

        public void onRestorePendingState() {
            updatePageAccessibilityActions();
        }

        public void onRvInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(onGetAccessibilityClassName());
        }

        public void onSetLayoutDirection() {
            updatePageAccessibilityActions();
        }

        public void onSetNewCurrentItem() {
            updatePageAccessibilityActions();
        }

        public void onSetOrientation() {
            updatePageAccessibilityActions();
        }

        public void onSetUserInputEnabled() {
            updatePageAccessibilityActions();
        }

        public void setCurrentItemFromAccessibilityCommand(int i2) {
            if (ViewPager2.this.isUserInputEnabled()) {
                ViewPager2.this.setCurrentItemInternal(i2, true);
            }
        }

        public void updatePageAccessibilityActions() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i2 = 16908360;
            ViewCompat.removeAccessibilityAction(viewPager2, 16908360);
            ViewCompat.removeAccessibilityAction(viewPager2, 16908361);
            ViewCompat.removeAccessibilityAction(viewPager2, 16908358);
            ViewCompat.removeAccessibilityAction(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.isUserInputEnabled()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean isRtl = ViewPager2.this.isRtl();
                    int i3 = isRtl ? 16908360 : 16908361;
                    if (isRtl) {
                        i2 = 16908361;
                    }
                    if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                        ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i3, (CharSequence) null), (CharSequence) null, this.mActionPageForward);
                    }
                    if (ViewPager2.this.mCurrentItem > 0) {
                        ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, (CharSequence) null), (CharSequence) null, this.mActionPageBackward);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                    ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908359, (CharSequence) null), (CharSequence) null, this.mActionPageForward);
                }
                if (ViewPager2.this.mCurrentItem > 0) {
                    ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908358, (CharSequence) null), (CharSequence) null, this.mActionPageBackward);
                }
            }
        }
    }

    public interface PageTransformer {
        void transformPage(@NonNull View view, float f);
    }

    public class PagerSnapHelperImpl extends PagerSnapHelper {
        public PagerSnapHelperImpl() {
        }

        @Nullable
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            if (ViewPager2.this.isFakeDragging()) {
                return null;
            }
            return super.findSnapView(layoutManager);
        }
    }

    public class RecyclerViewImpl extends RecyclerView {
        public RecyclerViewImpl(@NonNull Context context) {
            super(context);
        }

        @RequiresApi(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.mAccessibilityProvider.handlesRvGetAccessibilityClassName() ? ViewPager2.this.mAccessibilityProvider.onRvGetAccessibilityClassName() : super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.mCurrentItem);
            accessibilityEvent.setToIndex(ViewPager2.this.mCurrentItem);
            ViewPager2.this.mAccessibilityProvider.onRvInitializeAccessibilityEvent(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onTouchEvent(motionEvent);
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        public Parcelable mAdapterState;
        public int mCurrentItem;
        public int mRecyclerViewId;

        public SavedState(Parcel parcel) {
            super(parcel);
            readValues(parcel, (ClassLoader) null);
        }

        @RequiresApi(24)
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readValues(parcel, classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readValues(Parcel parcel, ClassLoader classLoader) {
            this.mRecyclerViewId = parcel.readInt();
            this.mCurrentItem = parcel.readInt();
            this.mAdapterState = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.mRecyclerViewId);
            parcel.writeInt(this.mCurrentItem);
            parcel.writeParcelable(this.mAdapterState, i2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollState {
    }

    public static class SmoothScrollToPosition implements Runnable {
        private final int mPosition;
        private final RecyclerView mRecyclerView;

        public SmoothScrollToPosition(int i2, RecyclerView recyclerView) {
            this.mPosition = i2;
            this.mRecyclerView = recyclerView;
        }

        public void run() {
            this.mRecyclerView.smoothScrollToPosition(this.mPosition);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        initialize(context, (AttributeSet) null);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        initialize(context, attributeSet);
    }

    @RequiresApi(21)
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        initialize(context, attributeSet);
    }

    private RecyclerView.OnChildAttachStateChangeListener enforceChildFillListener() {
        return new RecyclerView.OnChildAttachStateChangeListener() {
            public void onChildViewAttachedToWindow(@NonNull View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (layoutParams.width != -1 || layoutParams.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }

            public void onChildViewDetachedFromWindow(@NonNull View view) {
            }
        };
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        this.mAccessibilityProvider = sFeatureEnhancedA11yEnabled ? new PageAwareAccessibilityProvider() : new BasicAccessibilityProvider();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.mRecyclerView = recyclerViewImpl;
        recyclerViewImpl.setId(ViewCompat.generateViewId());
        this.mRecyclerView.setDescendantFocusability(131072);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl(context);
        this.mLayoutManager = linearLayoutManagerImpl;
        this.mRecyclerView.setLayoutManager(linearLayoutManagerImpl);
        this.mRecyclerView.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        this.mRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRecyclerView.addOnChildAttachStateChangeListener(enforceChildFillListener());
        ScrollEventAdapter scrollEventAdapter = new ScrollEventAdapter(this);
        this.mScrollEventAdapter = scrollEventAdapter;
        this.mFakeDragger = new FakeDrag(this, scrollEventAdapter, this.mRecyclerView);
        PagerSnapHelperImpl pagerSnapHelperImpl = new PagerSnapHelperImpl();
        this.mPagerSnapHelper = pagerSnapHelperImpl;
        pagerSnapHelperImpl.attachToRecyclerView(this.mRecyclerView);
        this.mRecyclerView.addOnScrollListener(this.mScrollEventAdapter);
        CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback(3);
        this.mPageChangeEventDispatcher = compositeOnPageChangeCallback;
        this.mScrollEventAdapter.setOnPageChangeCallback(compositeOnPageChangeCallback);
        AnonymousClass2 r3 = new OnPageChangeCallback() {
            public void onPageScrollStateChanged(int i2) {
                if (i2 == 0) {
                    ViewPager2.this.updateCurrentItem();
                }
            }

            public void onPageSelected(int i2) {
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.mCurrentItem != i2) {
                    viewPager2.mCurrentItem = i2;
                    viewPager2.mAccessibilityProvider.onSetNewCurrentItem();
                }
            }
        };
        AnonymousClass3 r4 = new OnPageChangeCallback() {
            public void onPageSelected(int i2) {
                ViewPager2.this.clearFocus();
                if (ViewPager2.this.hasFocus()) {
                    ViewPager2.this.mRecyclerView.requestFocus(2);
                }
            }
        };
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(r3);
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(r4);
        this.mAccessibilityProvider.onInitialize(this.mPageChangeEventDispatcher, this.mRecyclerView);
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(this.mExternalPageChangeCallbacks);
        PageTransformerAdapter pageTransformerAdapter = new PageTransformerAdapter(this.mLayoutManager);
        this.mPageTransformerAdapter = pageTransformerAdapter;
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(pageTransformerAdapter);
        RecyclerView recyclerView = this.mRecyclerView;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void registerCurrentItemDataSetTracker(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    private void restorePendingState() {
        RecyclerView.Adapter adapter;
        if (this.mPendingCurrentItem != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.mPendingAdapterState;
            if (parcelable != null) {
                if (adapter instanceof StatefulAdapter) {
                    ((StatefulAdapter) adapter).restoreState(parcelable);
                }
                this.mPendingAdapterState = null;
            }
            int max = Math.max(0, Math.min(this.mPendingCurrentItem, adapter.getItemCount() - 1));
            this.mCurrentItem = max;
            this.mPendingCurrentItem = -1;
            this.mRecyclerView.scrollToPosition(max);
            this.mAccessibilityProvider.onRestorePendingState();
        }
    }

    private void setOrientation(Context context, AttributeSet attributeSet) {
        int[] iArr = R.styleable.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(R.styleable.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void unregisterCurrentItemDataSetTracker(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    public void addItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration) {
        this.mRecyclerView.addItemDecoration(itemDecoration);
    }

    public void addItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration, int i2) {
        this.mRecyclerView.addItemDecoration(itemDecoration, i2);
    }

    public boolean beginFakeDrag() {
        return this.mFakeDragger.beginFakeDrag();
    }

    public boolean canScrollHorizontally(int i2) {
        return this.mRecyclerView.canScrollHorizontally(i2);
    }

    public boolean canScrollVertically(int i2) {
        return this.mRecyclerView.canScrollVertically(i2);
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i2 = ((SavedState) parcelable).mRecyclerViewId;
            sparseArray.put(this.mRecyclerView.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        restorePendingState();
    }

    public boolean endFakeDrag() {
        return this.mFakeDragger.endFakeDrag();
    }

    public boolean fakeDragBy(@Px @SuppressLint({"SupportAnnotationUsage"}) float f) {
        return this.mFakeDragger.fakeDragBy(f);
    }

    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        return this.mAccessibilityProvider.handlesGetAccessibilityClassName() ? this.mAccessibilityProvider.onGetAccessibilityClassName() : super.getAccessibilityClassName();
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        return this.mRecyclerView.getAdapter();
    }

    public int getCurrentItem() {
        return this.mCurrentItem;
    }

    @NonNull
    public RecyclerView.ItemDecoration getItemDecorationAt(int i2) {
        return this.mRecyclerView.getItemDecorationAt(i2);
    }

    public int getItemDecorationCount() {
        return this.mRecyclerView.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getOrientation() {
        return this.mLayoutManager.getOrientation();
    }

    public int getPageSize() {
        int i2;
        int i3;
        RecyclerView recyclerView = this.mRecyclerView;
        if (getOrientation() == 0) {
            i2 = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i3 = recyclerView.getPaddingRight();
        } else {
            i2 = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i3 = recyclerView.getPaddingBottom();
        }
        return i2 - i3;
    }

    public int getScrollState() {
        return this.mScrollEventAdapter.getScrollState();
    }

    public void invalidateItemDecorations() {
        this.mRecyclerView.invalidateItemDecorations();
    }

    public boolean isFakeDragging() {
        return this.mFakeDragger.isFakeDragging();
    }

    public boolean isRtl() {
        return this.mLayoutManager.getLayoutDirection() == 1;
    }

    public boolean isUserInputEnabled() {
        return this.mUserInputEnabled;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.mAccessibilityProvider.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        this.mTmpContainerRect.left = getPaddingLeft();
        this.mTmpContainerRect.right = (i4 - i2) - getPaddingRight();
        this.mTmpContainerRect.top = getPaddingTop();
        this.mTmpContainerRect.bottom = (i5 - i3) - getPaddingBottom();
        Gravity.apply(BadgeDrawable.TOP_START, measuredWidth, measuredHeight, this.mTmpContainerRect, this.mTmpChildRect);
        RecyclerView recyclerView = this.mRecyclerView;
        Rect rect = this.mTmpChildRect;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.mCurrentItemDirty) {
            updateCurrentItem();
        }
    }

    public void onMeasure(int i2, int i3) {
        measureChild(this.mRecyclerView, i2, i3);
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        int measuredState = this.mRecyclerView.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), ViewGroup.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mPendingCurrentItem = savedState.mCurrentItem;
        this.mPendingAdapterState = savedState.mAdapterState;
    }

    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mRecyclerViewId = this.mRecyclerView.getId();
        int i2 = this.mPendingCurrentItem;
        if (i2 == -1) {
            i2 = this.mCurrentItem;
        }
        savedState.mCurrentItem = i2;
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable == null) {
            RecyclerView.Adapter adapter = this.mRecyclerView.getAdapter();
            if (adapter instanceof StatefulAdapter) {
                parcelable = ((StatefulAdapter) adapter).saveState();
            }
            return savedState;
        }
        savedState.mAdapterState = parcelable;
        return savedState;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @RequiresApi(16)
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        return this.mAccessibilityProvider.handlesPerformAccessibilityAction(i2, bundle) ? this.mAccessibilityProvider.onPerformAccessibilityAction(i2, bundle) : super.performAccessibilityAction(i2, bundle);
    }

    public void registerOnPageChangeCallback(@NonNull OnPageChangeCallback onPageChangeCallback) {
        this.mExternalPageChangeCallbacks.addOnPageChangeCallback(onPageChangeCallback);
    }

    public void removeItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration) {
        this.mRecyclerView.removeItemDecoration(itemDecoration);
    }

    public void removeItemDecorationAt(int i2) {
        this.mRecyclerView.removeItemDecorationAt(i2);
    }

    public void requestTransform() {
        if (this.mPageTransformerAdapter.getPageTransformer() != null) {
            double relativeScrollPosition = this.mScrollEventAdapter.getRelativeScrollPosition();
            int i2 = (int) relativeScrollPosition;
            float f = (float) (relativeScrollPosition - ((double) i2));
            this.mPageTransformerAdapter.onPageScrolled(i2, f, Math.round(((float) getPageSize()) * f));
        }
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.mRecyclerView.getAdapter();
        this.mAccessibilityProvider.onDetachAdapter(adapter2);
        unregisterCurrentItemDataSetTracker(adapter2);
        this.mRecyclerView.setAdapter(adapter);
        this.mCurrentItem = 0;
        restorePendingState();
        this.mAccessibilityProvider.onAttachAdapter(adapter);
        registerCurrentItemDataSetTracker(adapter);
    }

    public void setCurrentItem(int i2) {
        setCurrentItem(i2, true);
    }

    public void setCurrentItem(int i2, boolean z) {
        if (!isFakeDragging()) {
            setCurrentItemInternal(i2, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public void setCurrentItemInternal(int i2, boolean z) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.mPendingCurrentItem != -1) {
                this.mPendingCurrentItem = Math.max(i2, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i2, 0), adapter.getItemCount() - 1);
            if (min != this.mCurrentItem || !this.mScrollEventAdapter.isIdle()) {
                int i3 = this.mCurrentItem;
                if (min != i3 || !z) {
                    double d = (double) i3;
                    this.mCurrentItem = min;
                    this.mAccessibilityProvider.onSetNewCurrentItem();
                    if (!this.mScrollEventAdapter.isIdle()) {
                        d = this.mScrollEventAdapter.getRelativeScrollPosition();
                    }
                    this.mScrollEventAdapter.notifyProgrammaticScroll(min, z);
                    if (!z) {
                        this.mRecyclerView.scrollToPosition(min);
                        return;
                    }
                    double d2 = (double) min;
                    if (Math.abs(d2 - d) > 3.0d) {
                        this.mRecyclerView.scrollToPosition(d2 > d ? min - 3 : min + 3);
                        RecyclerView recyclerView = this.mRecyclerView;
                        recyclerView.post(new SmoothScrollToPosition(min, recyclerView));
                        return;
                    }
                    this.mRecyclerView.smoothScrollToPosition(min);
                }
            }
        }
    }

    @RequiresApi(17)
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.mAccessibilityProvider.onSetLayoutDirection();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 >= 1 || i2 == -1) {
            this.mOffscreenPageLimit = i2;
            this.mRecyclerView.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i2) {
        this.mLayoutManager.setOrientation(i2);
        this.mAccessibilityProvider.onSetOrientation();
    }

    public void setPageTransformer(@Nullable PageTransformer pageTransformer) {
        boolean z = this.mSavedItemAnimatorPresent;
        if (pageTransformer != null) {
            if (!z) {
                this.mSavedItemAnimator = this.mRecyclerView.getItemAnimator();
                this.mSavedItemAnimatorPresent = true;
            }
            this.mRecyclerView.setItemAnimator((RecyclerView.ItemAnimator) null);
        } else if (z) {
            this.mRecyclerView.setItemAnimator(this.mSavedItemAnimator);
            this.mSavedItemAnimator = null;
            this.mSavedItemAnimatorPresent = false;
        }
        if (pageTransformer != this.mPageTransformerAdapter.getPageTransformer()) {
            this.mPageTransformerAdapter.setPageTransformer(pageTransformer);
            requestTransform();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.mUserInputEnabled = z;
        this.mAccessibilityProvider.onSetUserInputEnabled();
    }

    public void snapToPage() {
        View findSnapView = this.mPagerSnapHelper.findSnapView(this.mLayoutManager);
        if (findSnapView != null) {
            int[] calculateDistanceToFinalSnap = this.mPagerSnapHelper.calculateDistanceToFinalSnap(this.mLayoutManager, findSnapView);
            if (calculateDistanceToFinalSnap[0] != 0 || calculateDistanceToFinalSnap[1] != 0) {
                this.mRecyclerView.smoothScrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
            }
        }
    }

    public void unregisterOnPageChangeCallback(@NonNull OnPageChangeCallback onPageChangeCallback) {
        this.mExternalPageChangeCallbacks.removeOnPageChangeCallback(onPageChangeCallback);
    }

    public void updateCurrentItem() {
        PagerSnapHelper pagerSnapHelper = this.mPagerSnapHelper;
        if (pagerSnapHelper != null) {
            View findSnapView = pagerSnapHelper.findSnapView(this.mLayoutManager);
            if (findSnapView != null) {
                int position = this.mLayoutManager.getPosition(findSnapView);
                if (position != this.mCurrentItem && getScrollState() == 0) {
                    this.mPageChangeEventDispatcher.onPageSelected(position);
                }
                this.mCurrentItemDirty = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }
}
