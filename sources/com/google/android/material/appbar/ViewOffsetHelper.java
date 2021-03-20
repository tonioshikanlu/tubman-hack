package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

public class ViewOffsetHelper {
    private boolean horizontalOffsetEnabled = true;
    private int layoutLeft;
    private int layoutTop;
    private int offsetLeft;
    private int offsetTop;
    private boolean verticalOffsetEnabled = true;
    private final View view;

    public ViewOffsetHelper(View view2) {
        this.view = view2;
    }

    public void applyOffsets() {
        View view2 = this.view;
        ViewCompat.offsetTopAndBottom(view2, this.offsetTop - (view2.getTop() - this.layoutTop));
        View view3 = this.view;
        ViewCompat.offsetLeftAndRight(view3, this.offsetLeft - (view3.getLeft() - this.layoutLeft));
    }

    public int getLayoutLeft() {
        return this.layoutLeft;
    }

    public int getLayoutTop() {
        return this.layoutTop;
    }

    public int getLeftAndRightOffset() {
        return this.offsetLeft;
    }

    public int getTopAndBottomOffset() {
        return this.offsetTop;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.horizontalOffsetEnabled;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.verticalOffsetEnabled;
    }

    public void onViewLayout() {
        this.layoutTop = this.view.getTop();
        this.layoutLeft = this.view.getLeft();
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        this.horizontalOffsetEnabled = z;
    }

    public boolean setLeftAndRightOffset(int i2) {
        if (!this.horizontalOffsetEnabled || this.offsetLeft == i2) {
            return false;
        }
        this.offsetLeft = i2;
        applyOffsets();
        return true;
    }

    public boolean setTopAndBottomOffset(int i2) {
        if (!this.verticalOffsetEnabled || this.offsetTop == i2) {
            return false;
        }
        this.offsetTop = i2;
        applyOffsets();
        return true;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        this.verticalOffsetEnabled = z;
    }
}
