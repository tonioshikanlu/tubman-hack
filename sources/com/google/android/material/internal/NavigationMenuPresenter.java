package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.R;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuPresenter implements MenuPresenter {
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    public NavigationMenuAdapter adapter;
    private MenuPresenter.Callback callback;
    public boolean hasCustomItemIconSize;
    public LinearLayout headerLayout;
    public ColorStateList iconTintList;
    private int id;
    public boolean isBehindStatusBar = true;
    public Drawable itemBackground;
    public int itemHorizontalPadding;
    public int itemIconPadding;
    public int itemIconSize;
    /* access modifiers changed from: private */
    public int itemMaxLines;
    public LayoutInflater layoutInflater;
    public MenuBuilder menu;
    private NavigationMenuView menuView;
    public final View.OnClickListener onClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            boolean z = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean performItemAction = navigationMenuPresenter.menu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData == null || !itemData.isCheckable() || !performItemAction) {
                z = false;
            } else {
                NavigationMenuPresenter.this.adapter.setCheckedItem(itemData);
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };
    private int overScrollMode = -1;
    public int paddingSeparator;
    private int paddingTopDefault;
    public int textAppearance;
    public boolean textAppearanceSet;
    public ColorStateList textColor;

    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    public class NavigationMenuAdapter extends RecyclerView.Adapter<ViewHolder> {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private MenuItemImpl checkedItem;
        private final ArrayList<NavigationMenuItem> items = new ArrayList<>();
        private boolean updateSuspended;

        public NavigationMenuAdapter() {
            prepareMenuItems();
        }

        private void appendTransparentIconIfMissing(int i2, int i3) {
            while (i2 < i3) {
                ((NavigationMenuTextItem) this.items.get(i2)).needsEmptyIcon = true;
                i2++;
            }
        }

        private void prepareMenuItems() {
            if (!this.updateSuspended) {
                boolean z = true;
                this.updateSuspended = true;
                this.items.clear();
                this.items.add(new NavigationMenuHeaderItem());
                int i2 = -1;
                int size = NavigationMenuPresenter.this.menu.getVisibleItems().size();
                int i3 = 0;
                boolean z2 = false;
                int i4 = 0;
                while (i3 < size) {
                    MenuItemImpl menuItemImpl = NavigationMenuPresenter.this.menu.getVisibleItems().get(i3);
                    if (menuItemImpl.isChecked()) {
                        setCheckedItem(menuItemImpl);
                    }
                    if (menuItemImpl.isCheckable()) {
                        menuItemImpl.setExclusiveCheckable(false);
                    }
                    if (menuItemImpl.hasSubMenu()) {
                        SubMenu subMenu = menuItemImpl.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.items.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.paddingSeparator, 0));
                            }
                            this.items.add(new NavigationMenuTextItem(menuItemImpl));
                            int size2 = this.items.size();
                            int size3 = subMenu.size();
                            int i5 = 0;
                            boolean z3 = false;
                            while (i5 < size3) {
                                MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i5);
                                if (menuItemImpl2.isVisible()) {
                                    if (!z3 && menuItemImpl2.getIcon() != null) {
                                        z3 = z;
                                    }
                                    if (menuItemImpl2.isCheckable()) {
                                        menuItemImpl2.setExclusiveCheckable(false);
                                    }
                                    if (menuItemImpl.isChecked()) {
                                        setCheckedItem(menuItemImpl);
                                    }
                                    this.items.add(new NavigationMenuTextItem(menuItemImpl2));
                                }
                                i5++;
                                z = true;
                            }
                            if (z3) {
                                appendTransparentIconIfMissing(size2, this.items.size());
                            }
                        }
                    } else {
                        int groupId = menuItemImpl.getGroupId();
                        if (groupId != i2) {
                            i4 = this.items.size();
                            z2 = menuItemImpl.getIcon() != null;
                            if (i3 != 0) {
                                i4++;
                                ArrayList<NavigationMenuItem> arrayList = this.items;
                                int i6 = NavigationMenuPresenter.this.paddingSeparator;
                                arrayList.add(new NavigationMenuSeparatorItem(i6, i6));
                            }
                        } else if (!z2 && menuItemImpl.getIcon() != null) {
                            appendTransparentIconIfMissing(i4, this.items.size());
                            z2 = true;
                        }
                        NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(menuItemImpl);
                        navigationMenuTextItem.needsEmptyIcon = z2;
                        this.items.add(navigationMenuTextItem);
                        i2 = groupId;
                    }
                    i3++;
                    z = true;
                }
                this.updateSuspended = false;
            }
        }

        @NonNull
        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            MenuItemImpl menuItemImpl = this.checkedItem;
            if (menuItemImpl != null) {
                bundle.putInt(STATE_CHECKED_ITEM, menuItemImpl.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.items.size();
            for (int i2 = 0; i2 < size; i2++) {
                NavigationMenuItem navigationMenuItem = this.items.get(i2);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    MenuItemImpl menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        public MenuItemImpl getCheckedItem() {
            return this.checkedItem;
        }

        public int getItemCount() {
            return this.items.size();
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public int getItemViewType(int i2) {
            NavigationMenuItem navigationMenuItem = this.items.get(i2);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public int getRowCount() {
            int i2 = NavigationMenuPresenter.this.headerLayout.getChildCount() == 0 ? 0 : 1;
            for (int i3 = 0; i3 < NavigationMenuPresenter.this.adapter.getItemCount(); i3++) {
                if (NavigationMenuPresenter.this.adapter.getItemViewType(i3) == 0) {
                    i2++;
                }
            }
            return i2;
        }

        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i2) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
                navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.iconTintList);
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                if (navigationMenuPresenter.textAppearanceSet) {
                    navigationMenuItemView.setTextAppearance(navigationMenuPresenter.textAppearance);
                }
                ColorStateList colorStateList = NavigationMenuPresenter.this.textColor;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = NavigationMenuPresenter.this.itemBackground;
                ViewCompat.setBackground(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.items.get(i2);
                navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
                navigationMenuItemView.setHorizontalPadding(NavigationMenuPresenter.this.itemHorizontalPadding);
                navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
                NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
                if (navigationMenuPresenter2.hasCustomItemIconSize) {
                    navigationMenuItemView.setIconSize(navigationMenuPresenter2.itemIconSize);
                }
                navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.itemMaxLines);
                navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), 0);
            } else if (itemViewType == 1) {
                ((TextView) viewHolder.itemView).setText(((NavigationMenuTextItem) this.items.get(i2)).getMenuItem().getTitle());
            } else if (itemViewType == 2) {
                NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.items.get(i2);
                viewHolder.itemView.setPadding(0, navigationMenuSeparatorItem.getPaddingTop(), 0, navigationMenuSeparatorItem.getPaddingBottom());
            }
        }

        @Nullable
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            if (i2 == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.layoutInflater, viewGroup, navigationMenuPresenter.onClickListener);
            } else if (i2 == 1) {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            } else {
                if (i2 == 2) {
                    return new SeparatorViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
                }
                if (i2 != 3) {
                    return null;
                }
                return new HeaderViewHolder(NavigationMenuPresenter.this.headerLayout);
            }
        }

        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }

        public void restoreInstanceState(@NonNull Bundle bundle) {
            MenuItemImpl menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            MenuItemImpl menuItem2;
            int i2 = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i2 != 0) {
                this.updateSuspended = true;
                int size = this.items.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    NavigationMenuItem navigationMenuItem = this.items.get(i3);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.getItemId() == i2) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                    i3++;
                }
                this.updateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.items.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    NavigationMenuItem navigationMenuItem2 = this.items.get(i4);
                    if (!(!(navigationMenuItem2 instanceof NavigationMenuTextItem) || (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) == null || (actionView = menuItem.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl) {
            if (this.checkedItem != menuItemImpl && menuItemImpl.isCheckable()) {
                MenuItemImpl menuItemImpl2 = this.checkedItem;
                if (menuItemImpl2 != null) {
                    menuItemImpl2.setChecked(false);
                }
                this.checkedItem = menuItemImpl;
                menuItemImpl.setChecked(true);
            }
        }

        public void setUpdateSuspended(boolean z) {
            this.updateSuspended = z;
        }

        public void update() {
            prepareMenuItems();
            notifyDataSetChanged();
        }
    }

    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    public interface NavigationMenuItem {
    }

    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int i2, int i3) {
            this.paddingTop = i2;
            this.paddingBottom = i3;
        }

        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }
    }

    public static class NavigationMenuTextItem implements NavigationMenuItem {
        private final MenuItemImpl menuItem;
        public boolean needsEmptyIcon;

        public NavigationMenuTextItem(MenuItemImpl menuItemImpl) {
            this.menuItem = menuItemImpl;
        }

        public MenuItemImpl getMenuItem() {
            return this.menuItem;
        }
    }

    public class NavigationMenuViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
        public NavigationMenuViewAccessibilityDelegate(@NonNull RecyclerView recyclerView) {
            super(recyclerView);
        }

        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(NavigationMenuPresenter.this.adapter.getRowCount(), 0, false));
        }
    }

    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }

    private void updateTopPadding() {
        int i2 = (this.headerLayout.getChildCount() != 0 || !this.isBehindStatusBar) ? 0 : this.paddingTopDefault;
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    public void addHeaderView(@NonNull View view) {
        this.headerLayout.addView(view);
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public void dispatchApplyWindowInsets(@NonNull WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.paddingTopDefault != systemWindowInsetTop) {
            this.paddingTopDefault = systemWindowInsetTop;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.getSystemWindowInsetBottom());
        ViewCompat.dispatchApplyWindowInsets(this.headerLayout, windowInsetsCompat);
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    @Nullable
    public MenuItemImpl getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int i2) {
        return this.headerLayout.getChildAt(i2);
    }

    public int getId() {
        return this.id;
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    @Nullable
    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.menuView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.layoutInflater.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.menuView));
            if (this.adapter == null) {
                this.adapter = new NavigationMenuAdapter();
            }
            int i2 = this.overScrollMode;
            if (i2 != -1) {
                this.menuView.setOverScrollMode(i2);
            }
            this.headerLayout = (LinearLayout) this.layoutInflater.inflate(R.layout.design_navigation_item_header, this.menuView, false);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    public View inflateHeaderView(@LayoutRes int i2) {
        View inflate = this.layoutInflater.inflate(i2, this.headerLayout, false);
        addHeaderView(inflate);
        return inflate;
    }

    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = menuBuilder;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback2 = this.callback;
        if (callback2 != null) {
            callback2.onCloseMenu(menuBuilder, z);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.restoreInstanceState(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @NonNull
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.menuView != null) {
            SparseArray sparseArray = new SparseArray();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.headerLayout != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void removeHeaderView(@NonNull View view) {
        this.headerLayout.removeView(view);
        if (this.headerLayout.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.menuView;
            navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void setBehindStatusBar(boolean z) {
        if (this.isBehindStatusBar != z) {
            this.isBehindStatusBar = z;
            updateTopPadding();
        }
    }

    public void setCallback(MenuPresenter.Callback callback2) {
        this.callback = callback2;
    }

    public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl) {
        this.adapter.setCheckedItem(menuItemImpl);
    }

    public void setId(int i2) {
        this.id = i2;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.itemBackground = drawable;
        updateMenuView(false);
    }

    public void setItemHorizontalPadding(int i2) {
        this.itemHorizontalPadding = i2;
        updateMenuView(false);
    }

    public void setItemIconPadding(int i2) {
        this.itemIconPadding = i2;
        updateMenuView(false);
    }

    public void setItemIconSize(@Dimension int i2) {
        if (this.itemIconSize != i2) {
            this.itemIconSize = i2;
            this.hasCustomItemIconSize = true;
            updateMenuView(false);
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i2) {
        this.itemMaxLines = i2;
        updateMenuView(false);
    }

    public void setItemTextAppearance(@StyleRes int i2) {
        this.textAppearance = i2;
        this.textAppearanceSet = true;
        updateMenuView(false);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateMenuView(false);
    }

    public void setOverScrollMode(int i2) {
        this.overScrollMode = i2;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void setUpdateSuspended(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z);
        }
    }

    public void updateMenuView(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }
}
