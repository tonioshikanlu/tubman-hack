package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;

public class MotionHelper extends ConstraintHelper implements Animatable, MotionLayout.TransitionListener {
    private float mProgress;
    private boolean mUseOnHide = false;
    private boolean mUseOnShow = false;
    public View[] views;

    public MotionHelper(Context context) {
        super(context);
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(attributeSet);
    }

    public float getProgress() {
        return this.mProgress;
    }

    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.MotionHelper_onShow) {
                    this.mUseOnShow = obtainStyledAttributes.getBoolean(index, this.mUseOnShow);
                } else if (index == R.styleable.MotionHelper_onHide) {
                    this.mUseOnHide = obtainStyledAttributes.getBoolean(index, this.mUseOnHide);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public boolean isUseOnHide() {
        return this.mUseOnHide;
    }

    public boolean isUsedOnShow() {
        return this.mUseOnShow;
    }

    public void onTransitionChange(MotionLayout motionLayout, int i2, int i3, float f) {
    }

    public void onTransitionCompleted(MotionLayout motionLayout, int i2) {
    }

    public void onTransitionStarted(MotionLayout motionLayout, int i2, int i3) {
    }

    public void onTransitionTrigger(MotionLayout motionLayout, int i2, boolean z, float f) {
    }

    public void setProgress(float f) {
        this.mProgress = f;
        int i2 = 0;
        if (this.mCount > 0) {
            this.views = getViews((ConstraintLayout) getParent());
            while (i2 < this.mCount) {
                setProgress(this.views[i2], f);
                i2++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i2 < childCount) {
            View childAt = viewGroup.getChildAt(i2);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f);
            }
            i2++;
        }
    }

    public void setProgress(View view, float f) {
    }
}
