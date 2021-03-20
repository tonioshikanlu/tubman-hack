package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

public class InterpolateOnScrollPositionChangeHelper {
    private final int[] containerLocation = new int[2];
    private ScrollView containingScrollView;
    private MaterialShapeDrawable materialShapeDrawable;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() {
        public void onScrollChanged() {
            InterpolateOnScrollPositionChangeHelper.this.updateInterpolationForScreenPosition();
        }
    };
    private final int[] scrollLocation = new int[2];
    private View shapedView;

    public InterpolateOnScrollPositionChangeHelper(View view, MaterialShapeDrawable materialShapeDrawable2, ScrollView scrollView) {
        this.shapedView = view;
        this.materialShapeDrawable = materialShapeDrawable2;
        this.containingScrollView = scrollView;
    }

    public void setContainingScrollView(ScrollView scrollView) {
        this.containingScrollView = scrollView;
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable2) {
        this.materialShapeDrawable = materialShapeDrawable2;
    }

    public void startListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.scrollChangedListener);
    }

    public void stopListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.scrollChangedListener);
    }

    public void updateInterpolationForScreenPosition() {
        MaterialShapeDrawable materialShapeDrawable2;
        float f;
        ScrollView scrollView = this.containingScrollView;
        if (scrollView != null) {
            if (scrollView.getChildCount() != 0) {
                this.containingScrollView.getLocationInWindow(this.scrollLocation);
                this.containingScrollView.getChildAt(0).getLocationInWindow(this.containerLocation);
                int top = (this.shapedView.getTop() - this.scrollLocation[1]) + this.containerLocation[1];
                int height = this.shapedView.getHeight();
                int height2 = this.containingScrollView.getHeight();
                if (top < 0) {
                    materialShapeDrawable2 = this.materialShapeDrawable;
                    f = (((float) top) / ((float) height)) + 1.0f;
                } else {
                    int i2 = top + height;
                    if (i2 > height2) {
                        int i3 = i2 - height2;
                        materialShapeDrawable2 = this.materialShapeDrawable;
                        f = 1.0f - (((float) i3) / ((float) height));
                    } else if (this.materialShapeDrawable.getInterpolation() != 1.0f) {
                        this.materialShapeDrawable.setInterpolation(1.0f);
                        this.shapedView.invalidate();
                        return;
                    } else {
                        return;
                    }
                }
                materialShapeDrawable2.setInterpolation(Math.max(0.0f, Math.min(1.0f, f)));
                this.shapedView.invalidate();
                return;
            }
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
    }
}
