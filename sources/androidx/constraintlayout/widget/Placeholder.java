package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Placeholder extends View {
    private View mContent = null;
    private int mContentId = -1;
    private int mEmptyVisibility = 4;

    public Placeholder(Context context) {
        super(context);
        init((AttributeSet) null);
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2);
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        super.setVisibility(this.mEmptyVisibility);
        this.mContentId = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.ConstraintLayout_placeholder_content) {
                    this.mContentId = obtainStyledAttributes.getResourceId(index, this.mContentId);
                } else if (index == R.styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.mEmptyVisibility = obtainStyledAttributes.getInt(index, this.mEmptyVisibility);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.mContent;
    }

    public int getEmptyVisibility() {
        return this.mEmptyVisibility;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) rect.height()) / 2.0f) + (((float) height) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i2) {
        View findViewById;
        if (this.mContentId != i2) {
            View view = this.mContent;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.mContent.getLayoutParams()).isInPlaceholder = false;
                this.mContent = null;
            }
            this.mContentId = i2;
            if (i2 != -1 && (findViewById = ((View) getParent()).findViewById(i2)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i2) {
        this.mEmptyVisibility = i2;
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
        if (this.mContent != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.mContent.getLayoutParams();
            layoutParams2.widget.setVisibility(0);
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = layoutParams.widget.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
            if (horizontalDimensionBehaviour != dimensionBehaviour) {
                layoutParams.widget.setWidth(layoutParams2.widget.getWidth());
            }
            if (layoutParams.widget.getVerticalDimensionBehaviour() != dimensionBehaviour) {
                layoutParams.widget.setHeight(layoutParams2.widget.getHeight());
            }
            layoutParams2.widget.setVisibility(8);
        }
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        if (this.mContentId == -1 && !isInEditMode()) {
            setVisibility(this.mEmptyVisibility);
        }
        View findViewById = constraintLayout.findViewById(this.mContentId);
        this.mContent = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).isInPlaceholder = true;
            this.mContent.setVisibility(0);
            setVisibility(0);
        }
    }
}
