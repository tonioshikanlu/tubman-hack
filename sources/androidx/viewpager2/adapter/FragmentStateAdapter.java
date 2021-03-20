package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b.e.a.a.a;

public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    public final FragmentManager mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    public final LongSparseArray<Fragment> mFragments;
    private boolean mHasStaleFragments;
    public boolean mIsInGracePeriod;
    private final LongSparseArray<Integer> mItemIdToViewHolder;
    public final Lifecycle mLifecycle;
    private final LongSparseArray<Fragment.SavedState> mSavedStates;

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

    public class FragmentMaxLifecycleEnforcer {
        private RecyclerView.AdapterDataObserver mDataObserver;
        private LifecycleEventObserver mLifecycleObserver;
        private ViewPager2.OnPageChangeCallback mPageChangeCallback;
        private long mPrimaryItemId = -1;
        private ViewPager2 mViewPager;

        public FragmentMaxLifecycleEnforcer() {
        }

        @NonNull
        private ViewPager2 inferViewPager(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void register(@NonNull RecyclerView recyclerView) {
            this.mViewPager = inferViewPager(recyclerView);
            AnonymousClass1 r2 = new ViewPager2.OnPageChangeCallback() {
                public void onPageScrollStateChanged(int i2) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }

                public void onPageSelected(int i2) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mPageChangeCallback = r2;
            this.mViewPager.registerOnPageChangeCallback(r2);
            AnonymousClass2 r22 = new DataSetChangeObserver() {
                public void onChanged() {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(true);
                }
            };
            this.mDataObserver = r22;
            FragmentStateAdapter.this.registerAdapterDataObserver(r22);
            AnonymousClass3 r23 = new LifecycleEventObserver() {
                public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mLifecycleObserver = r23;
            FragmentStateAdapter.this.mLifecycle.addObserver(r23);
        }

        public void unregister(@NonNull RecyclerView recyclerView) {
            inferViewPager(recyclerView).unregisterOnPageChangeCallback(this.mPageChangeCallback);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.mDataObserver);
            FragmentStateAdapter.this.mLifecycle.removeObserver(this.mLifecycleObserver);
            this.mViewPager = null;
        }

        public void updateFragmentMaxLifecycle(boolean z) {
            int currentItem;
            Fragment fragment;
            if (!FragmentStateAdapter.this.shouldDelayFragmentTransactions() && this.mViewPager.getScrollState() == 0 && !FragmentStateAdapter.this.mFragments.isEmpty() && FragmentStateAdapter.this.getItemCount() != 0 && (currentItem = this.mViewPager.getCurrentItem()) < FragmentStateAdapter.this.getItemCount()) {
                long itemId = FragmentStateAdapter.this.getItemId(currentItem);
                if ((itemId != this.mPrimaryItemId || z) && (fragment = FragmentStateAdapter.this.mFragments.get(itemId)) != null && fragment.isAdded()) {
                    this.mPrimaryItemId = itemId;
                    FragmentTransaction beginTransaction = FragmentStateAdapter.this.mFragmentManager.beginTransaction();
                    Fragment fragment2 = null;
                    for (int i2 = 0; i2 < FragmentStateAdapter.this.mFragments.size(); i2++) {
                        long keyAt = FragmentStateAdapter.this.mFragments.keyAt(i2);
                        Fragment valueAt = FragmentStateAdapter.this.mFragments.valueAt(i2);
                        if (valueAt.isAdded()) {
                            if (keyAt != this.mPrimaryItemId) {
                                beginTransaction.setMaxLifecycle(valueAt, Lifecycle.State.STARTED);
                            } else {
                                fragment2 = valueAt;
                            }
                            valueAt.setMenuVisibility(keyAt == this.mPrimaryItemId);
                        }
                    }
                    if (fragment2 != null) {
                        beginTransaction.setMaxLifecycle(fragment2, Lifecycle.State.RESUMED);
                    }
                    if (!beginTransaction.isEmpty()) {
                        beginTransaction.commitNow();
                    }
                }
            }
        }
    }

    public FragmentStateAdapter(@NonNull Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    public FragmentStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        this.mFragments = new LongSparseArray<>();
        this.mSavedStates = new LongSparseArray<>();
        this.mItemIdToViewHolder = new LongSparseArray<>();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = lifecycle;
        super.setHasStableIds(true);
    }

    @NonNull
    private static String createKey(@NonNull String str, long j2) {
        return a.j(str, j2);
    }

    private void ensureFragment(int i2) {
        long itemId = getItemId(i2);
        if (!this.mFragments.containsKey(itemId)) {
            Fragment createFragment = createFragment(i2);
            createFragment.setInitialSavedState(this.mSavedStates.get(itemId));
            this.mFragments.put(itemId, createFragment);
        }
    }

    private boolean isFragmentViewBound(long j2) {
        View view;
        if (this.mItemIdToViewHolder.containsKey(j2)) {
            return true;
        }
        Fragment fragment = this.mFragments.get(j2);
        if (fragment == null || (view = fragment.getView()) == null) {
            return false;
        }
        return view.getParent() != null;
    }

    private static boolean isValidKey(@NonNull String str, @NonNull String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i2) {
        Long l2 = null;
        for (int i3 = 0; i3 < this.mItemIdToViewHolder.size(); i3++) {
            if (this.mItemIdToViewHolder.valueAt(i3).intValue() == i2) {
                if (l2 == null) {
                    l2 = Long.valueOf(this.mItemIdToViewHolder.keyAt(i3));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l2;
    }

    private static long parseIdFromKey(@NonNull String str, @NonNull String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j2) {
        ViewParent parent;
        Fragment fragment = this.mFragments.get(j2);
        if (fragment != null) {
            if (!(fragment.getView() == null || (parent = fragment.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!containsItem(j2)) {
                this.mSavedStates.remove(j2);
            }
            if (!fragment.isAdded()) {
                this.mFragments.remove(j2);
            } else if (shouldDelayFragmentTransactions()) {
                this.mHasStaleFragments = true;
            } else {
                if (fragment.isAdded() && containsItem(j2)) {
                    this.mSavedStates.put(j2, this.mFragmentManager.saveFragmentInstanceState(fragment));
                }
                this.mFragmentManager.beginTransaction().remove(fragment).commitNow();
                this.mFragments.remove(j2);
            }
        }
    }

    private void scheduleGracePeriodEnd() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final AnonymousClass4 r1 = new Runnable() {
            public void run() {
                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                fragmentStateAdapter.mIsInGracePeriod = false;
                fragmentStateAdapter.gcFragments();
            }
        };
        this.mLifecycle.addObserver(new LifecycleEventObserver() {
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(r1);
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }
        });
        handler.postDelayed(r1, GRACE_WINDOW_TIME_MS);
    }

    private void scheduleViewAttach(final Fragment fragment, @NonNull final FrameLayout frameLayout) {
        this.mFragmentManager.registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() {
            public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
                if (fragment == fragment) {
                    fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                    FragmentStateAdapter.this.addViewToContainer(view, frameLayout);
                }
            }
        }, false);
    }

    public void addViewToContainer(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public boolean containsItem(long j2) {
        return j2 >= 0 && j2 < ((long) getItemCount());
    }

    @NonNull
    public abstract Fragment createFragment(int i2);

    public void gcFragments() {
        if (this.mHasStaleFragments && !shouldDelayFragmentTransactions()) {
            ArraySet<Long> arraySet = new ArraySet<>();
            for (int i2 = 0; i2 < this.mFragments.size(); i2++) {
                long keyAt = this.mFragments.keyAt(i2);
                if (!containsItem(keyAt)) {
                    arraySet.add(Long.valueOf(keyAt));
                    this.mItemIdToViewHolder.remove(keyAt);
                }
            }
            if (!this.mIsInGracePeriod) {
                this.mHasStaleFragments = false;
                for (int i3 = 0; i3 < this.mFragments.size(); i3++) {
                    long keyAt2 = this.mFragments.keyAt(i3);
                    if (!isFragmentViewBound(keyAt2)) {
                        arraySet.add(Long.valueOf(keyAt2));
                    }
                }
            }
            for (Long longValue : arraySet) {
                removeFragment(longValue.longValue());
            }
        }
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        Preconditions.checkArgument(this.mFragmentMaxLifecycleEnforcer == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.register(recyclerView);
    }

    public final void onBindViewHolder(@NonNull final FragmentViewHolder fragmentViewHolder, int i2) {
        long itemId = fragmentViewHolder.getItemId();
        int id = fragmentViewHolder.getContainer().getId();
        Long itemForViewHolder = itemForViewHolder(id);
        if (!(itemForViewHolder == null || itemForViewHolder.longValue() == itemId)) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(itemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.put(itemId, Integer.valueOf(id));
        ensureFragment(i2);
        final FrameLayout container = fragmentViewHolder.getContainer();
        if (ViewCompat.isAttachedToWindow(container)) {
            if (container.getParent() == null) {
                container.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        if (container.getParent() != null) {
                            container.removeOnLayoutChangeListener(this);
                            FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                        }
                    }
                });
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        gcFragments();
    }

    @NonNull
    public final FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        return FragmentViewHolder.create(viewGroup);
    }

    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.unregister(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    public final boolean onFailedToRecycleView(@NonNull FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    public final void onViewAttachedToWindow(@NonNull FragmentViewHolder fragmentViewHolder) {
        placeFragmentInViewHolder(fragmentViewHolder);
        gcFragments();
    }

    public final void onViewRecycled(@NonNull FragmentViewHolder fragmentViewHolder) {
        Long itemForViewHolder = itemForViewHolder(fragmentViewHolder.getContainer().getId());
        if (itemForViewHolder != null) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(itemForViewHolder.longValue());
        }
    }

    public void placeFragmentInViewHolder(@NonNull final FragmentViewHolder fragmentViewHolder) {
        Fragment fragment = this.mFragments.get(fragmentViewHolder.getItemId());
        if (fragment != null) {
            FrameLayout container = fragmentViewHolder.getContainer();
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (fragment.isAdded() && view == null) {
                scheduleViewAttach(fragment, container);
            } else if (!fragment.isAdded() || view.getParent() == null) {
                if (fragment.isAdded()) {
                    addViewToContainer(view, container);
                } else if (!shouldDelayFragmentTransactions()) {
                    scheduleViewAttach(fragment, container);
                    FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
                    StringBuilder y = a.y("f");
                    y.append(fragmentViewHolder.getItemId());
                    beginTransaction.add(fragment, y.toString()).setMaxLifecycle(fragment, Lifecycle.State.STARTED).commitNow();
                    this.mFragmentMaxLifecycleEnforcer.updateFragmentMaxLifecycle(false);
                } else if (!this.mFragmentManager.isDestroyed()) {
                    this.mLifecycle.addObserver(new LifecycleEventObserver() {
                        public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                            if (!FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                                lifecycleOwner.getLifecycle().removeObserver(this);
                                if (ViewCompat.isAttachedToWindow(fragmentViewHolder.getContainer())) {
                                    FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                                }
                            }
                        }
                    });
                }
            } else if (view.getParent() != container) {
                addViewToContainer(view, container);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void restoreState(@NonNull Parcelable parcelable) {
        LongSparseArray longSparseArray;
        long j2;
        Object obj;
        if (!this.mSavedStates.isEmpty() || !this.mFragments.isEmpty()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                j2 = parseIdFromKey(str, KEY_PREFIX_FRAGMENT);
                obj = this.mFragmentManager.getFragment(bundle, str);
                longSparseArray = this.mFragments;
            } else if (isValidKey(str, KEY_PREFIX_STATE)) {
                j2 = parseIdFromKey(str, KEY_PREFIX_STATE);
                obj = (Fragment.SavedState) bundle.getParcelable(str);
                if (containsItem(j2)) {
                    longSparseArray = this.mSavedStates;
                }
            } else {
                throw new IllegalArgumentException(a.m("Unexpected key in savedState: ", str));
            }
            longSparseArray.put(j2, obj);
        }
        if (!this.mFragments.isEmpty()) {
            this.mHasStaleFragments = true;
            this.mIsInGracePeriod = true;
            gcFragments();
            scheduleGracePeriodEnd();
        }
    }

    @NonNull
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mSavedStates.size() + this.mFragments.size());
        for (int i2 = 0; i2 < this.mFragments.size(); i2++) {
            long keyAt = this.mFragments.keyAt(i2);
            Fragment fragment = this.mFragments.get(keyAt);
            if (fragment != null && fragment.isAdded()) {
                this.mFragmentManager.putFragment(bundle, createKey(KEY_PREFIX_FRAGMENT, keyAt), fragment);
            }
        }
        for (int i3 = 0; i3 < this.mSavedStates.size(); i3++) {
            long keyAt2 = this.mSavedStates.keyAt(i3);
            if (containsItem(keyAt2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, keyAt2), this.mSavedStates.get(keyAt2));
            }
        }
        return bundle;
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.isStateSaved();
    }
}
