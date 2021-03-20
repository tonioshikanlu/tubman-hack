package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import com.google.android.material.shadow.ShadowDrawableWrapper;

public class Layer extends ConstraintHelper {
    private static final String TAG = "Layer";
    private boolean mApplyElevationOnAttach;
    private boolean mApplyVisibilityOnAttach;
    public float mComputedCenterX = Float.NaN;
    public float mComputedCenterY = Float.NaN;
    public float mComputedMaxX = Float.NaN;
    public float mComputedMaxY = Float.NaN;
    public float mComputedMinX = Float.NaN;
    public float mComputedMinY = Float.NaN;
    public ConstraintLayout mContainer;
    private float mGroupRotateAngle = Float.NaN;
    public boolean mNeedBounds = true;
    private float mRotationCenterX = Float.NaN;
    private float mRotationCenterY = Float.NaN;
    private float mScaleX = 1.0f;
    private float mScaleY = 1.0f;
    private float mShiftX = 0.0f;
    private float mShiftY = 0.0f;
    public View[] mViews = null;

    public Layer(Context context) {
        super(context);
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Layer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    private void reCacheViews() {
        int i2;
        if (this.mContainer != null && (i2 = this.mCount) != 0) {
            View[] viewArr = this.mViews;
            if (viewArr == null || viewArr.length != i2) {
                this.mViews = new View[i2];
            }
            for (int i3 = 0; i3 < this.mCount; i3++) {
                this.mViews[i3] = this.mContainer.getViewById(this.mIds[i3]);
            }
        }
    }

    private void transform() {
        if (this.mContainer != null) {
            if (this.mViews == null) {
                reCacheViews();
            }
            calcCenters();
            double radians = Float.isNaN(this.mGroupRotateAngle) ? ShadowDrawableWrapper.COS_45 : Math.toRadians((double) this.mGroupRotateAngle);
            float sin = (float) Math.sin(radians);
            float cos = (float) Math.cos(radians);
            float f = this.mScaleX;
            float f2 = f * cos;
            float f3 = this.mScaleY;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i2 = 0; i2 < this.mCount; i2++) {
                View view = this.mViews[i2];
                int left = view.getLeft();
                int top = view.getTop();
                float right = ((float) ((view.getRight() + left) / 2)) - this.mComputedCenterX;
                float bottom = ((float) ((view.getBottom() + top) / 2)) - this.mComputedCenterY;
                view.setTranslationX((((f4 * bottom) + (f2 * right)) - right) + this.mShiftX);
                view.setTranslationY((((f6 * bottom) + (right * f5)) - bottom) + this.mShiftY);
                view.setScaleY(this.mScaleY);
                view.setScaleX(this.mScaleX);
                if (!Float.isNaN(this.mGroupRotateAngle)) {
                    view.setRotation(this.mGroupRotateAngle);
                }
            }
        }
    }

    public void calcCenters() {
        if (this.mContainer != null) {
            if (!this.mNeedBounds && !Float.isNaN(this.mComputedCenterX) && !Float.isNaN(this.mComputedCenterY)) {
                return;
            }
            if (Float.isNaN(this.mRotationCenterX) || Float.isNaN(this.mRotationCenterY)) {
                View[] views = getViews(this.mContainer);
                int left = views[0].getLeft();
                int top = views[0].getTop();
                int right = views[0].getRight();
                int bottom = views[0].getBottom();
                for (int i2 = 0; i2 < this.mCount; i2++) {
                    View view = views[i2];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.mComputedMaxX = (float) right;
                this.mComputedMaxY = (float) bottom;
                this.mComputedMinX = (float) left;
                this.mComputedMinY = (float) top;
                this.mComputedCenterX = Float.isNaN(this.mRotationCenterX) ? (float) ((left + right) / 2) : this.mRotationCenterX;
                this.mComputedCenterY = Float.isNaN(this.mRotationCenterY) ? (float) ((top + bottom) / 2) : this.mRotationCenterY;
                return;
            }
            this.mComputedCenterY = this.mRotationCenterY;
            this.mComputedCenterX = this.mRotationCenterX;
        }
    }

    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.mApplyVisibilityOnAttach = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.mApplyElevationOnAttach = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mContainer = (ConstraintLayout) getParent();
        if (this.mApplyVisibilityOnAttach || this.mApplyElevationOnAttach) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.mCount; i2++) {
                View viewById = this.mContainer.getViewById(this.mIds[i2]);
                if (viewById != null) {
                    if (this.mApplyVisibilityOnAttach) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.mApplyElevationOnAttach && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        applyLayoutFeatures();
    }

    public void setPivotX(float f) {
        this.mRotationCenterX = f;
        transform();
    }

    public void setPivotY(float f) {
        this.mRotationCenterY = f;
        transform();
    }

    public void setRotation(float f) {
        this.mGroupRotateAngle = f;
        transform();
    }

    public void setScaleX(float f) {
        this.mScaleX = f;
        transform();
    }

    public void setScaleY(float f) {
        this.mScaleY = f;
        transform();
    }

    public void setTranslationX(float f) {
        this.mShiftX = f;
        transform();
    }

    public void setTranslationY(float f) {
        this.mShiftY = f;
        transform();
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        applyLayoutFeatures();
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
        reCacheViews();
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).getConstraintWidget();
        constraintWidget.setWidth(0);
        constraintWidget.setHeight(0);
        calcCenters();
        layout(((int) this.mComputedMinX) - getPaddingLeft(), ((int) this.mComputedMinY) - getPaddingTop(), getPaddingRight() + ((int) this.mComputedMaxX), getPaddingBottom() + ((int) this.mComputedMaxY));
        transform();
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
        this.mContainer = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f || !Float.isNaN(this.mGroupRotateAngle)) {
            this.mGroupRotateAngle = rotation;
        }
    }
}
