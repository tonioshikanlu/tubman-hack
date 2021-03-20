package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

public final class TabLayoutMediator {
    @Nullable
    private RecyclerView.Adapter<?> adapter;
    private boolean attached;
    private final boolean autoRefresh;
    @Nullable
    private TabLayoutOnPageChangeCallback onPageChangeCallback;
    @Nullable
    private TabLayout.OnTabSelectedListener onTabSelectedListener;
    @Nullable
    private RecyclerView.AdapterDataObserver pagerAdapterObserver;
    private final boolean smoothScroll;
    private final TabConfigurationStrategy tabConfigurationStrategy;
    @NonNull
    private final TabLayout tabLayout;
    @NonNull
    private final ViewPager2 viewPager;

    public class PagerAdapterObserver extends RecyclerView.AdapterDataObserver {
        public PagerAdapterObserver() {
        }

        public void onChanged() {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        public void onItemRangeChanged(int i2, int i3) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        public void onItemRangeChanged(int i2, int i3, @Nullable Object obj) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        public void onItemRangeInserted(int i2, int i3) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        public void onItemRangeMoved(int i2, int i3, int i4) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        public void onItemRangeRemoved(int i2, int i3) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }
    }

    public interface TabConfigurationStrategy {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i2);
    }

    public static class TabLayoutOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
        private int previousScrollState;
        private int scrollState;
        @NonNull
        private final WeakReference<TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference<>(tabLayout);
            reset();
        }

        public void onPageScrollStateChanged(int i2) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i2;
        }

        public void onPageScrolled(int i2, float f, int i3) {
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i4 = this.scrollState;
                boolean z = false;
                boolean z2 = i4 != 2 || this.previousScrollState == 1;
                if (!(i4 == 2 && this.previousScrollState == 0)) {
                    z = true;
                }
                tabLayout.setScrollPosition(i2, f, z2, z);
            }
        }

        public void onPageSelected(int i2) {
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i2 && i2 < tabLayout.getTabCount()) {
                int i3 = this.scrollState;
                tabLayout.selectTab(tabLayout.getTabAt(i2), i3 == 0 || (i3 == 2 && this.previousScrollState == 0));
            }
        }

        public void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    public static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
        private final boolean smoothScroll;
        private final ViewPager2 viewPager;

        public ViewPagerOnTabSelectedListener(ViewPager2 viewPager2, boolean z) {
            this.viewPager = viewPager2;
            this.smoothScroll = z;
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(@NonNull TabLayout.Tab tab) {
            this.viewPager.setCurrentItem(tab.getPosition(), this.smoothScroll);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout2, @NonNull ViewPager2 viewPager2, @NonNull TabConfigurationStrategy tabConfigurationStrategy2) {
        this(tabLayout2, viewPager2, true, tabConfigurationStrategy2);
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout2, @NonNull ViewPager2 viewPager2, boolean z, @NonNull TabConfigurationStrategy tabConfigurationStrategy2) {
        this(tabLayout2, viewPager2, z, true, tabConfigurationStrategy2);
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout2, @NonNull ViewPager2 viewPager2, boolean z, boolean z2, @NonNull TabConfigurationStrategy tabConfigurationStrategy2) {
        this.tabLayout = tabLayout2;
        this.viewPager = viewPager2;
        this.autoRefresh = z;
        this.smoothScroll = z2;
        this.tabConfigurationStrategy = tabConfigurationStrategy2;
    }

    public void attach() {
        if (!this.attached) {
            RecyclerView.Adapter<?> adapter2 = this.viewPager.getAdapter();
            this.adapter = adapter2;
            if (adapter2 != null) {
                this.attached = true;
                TabLayoutOnPageChangeCallback tabLayoutOnPageChangeCallback = new TabLayoutOnPageChangeCallback(this.tabLayout);
                this.onPageChangeCallback = tabLayoutOnPageChangeCallback;
                this.viewPager.registerOnPageChangeCallback(tabLayoutOnPageChangeCallback);
                ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(this.viewPager, this.smoothScroll);
                this.onTabSelectedListener = viewPagerOnTabSelectedListener;
                this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) viewPagerOnTabSelectedListener);
                if (this.autoRefresh) {
                    PagerAdapterObserver pagerAdapterObserver2 = new PagerAdapterObserver();
                    this.pagerAdapterObserver = pagerAdapterObserver2;
                    this.adapter.registerAdapterDataObserver(pagerAdapterObserver2);
                }
                populateTabsFromPagerAdapter();
                this.tabLayout.setScrollPosition(this.viewPager.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public void detach() {
        RecyclerView.Adapter<?> adapter2;
        if (this.autoRefresh && (adapter2 = this.adapter) != null) {
            adapter2.unregisterAdapterDataObserver(this.pagerAdapterObserver);
            this.pagerAdapterObserver = null;
        }
        this.tabLayout.removeOnTabSelectedListener(this.onTabSelectedListener);
        this.viewPager.unregisterOnPageChangeCallback(this.onPageChangeCallback);
        this.onTabSelectedListener = null;
        this.onPageChangeCallback = null;
        this.adapter = null;
        this.attached = false;
    }

    public boolean isAttached() {
        return this.attached;
    }

    public void populateTabsFromPagerAdapter() {
        int min;
        this.tabLayout.removeAllTabs();
        RecyclerView.Adapter<?> adapter2 = this.adapter;
        if (adapter2 != null) {
            int itemCount = adapter2.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                TabLayout.Tab newTab = this.tabLayout.newTab();
                this.tabConfigurationStrategy.onConfigureTab(newTab, i2);
                this.tabLayout.addTab(newTab, false);
            }
            if (itemCount > 0 && (min = Math.min(this.viewPager.getCurrentItem(), this.tabLayout.getTabCount() - 1)) != this.tabLayout.getSelectedTabPosition()) {
                TabLayout tabLayout2 = this.tabLayout;
                tabLayout2.selectTab(tabLayout2.getTabAt(min));
            }
        }
    }
}
