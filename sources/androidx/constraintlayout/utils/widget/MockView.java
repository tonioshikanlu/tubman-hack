package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R;

public class MockView extends View {
    private int mDiagonalsColor = Color.argb(255, 0, 0, 0);
    private boolean mDrawDiagonals = true;
    private boolean mDrawLabel = true;
    private int mMargin = 4;
    private Paint mPaintDiagonals = new Paint();
    private Paint mPaintText = new Paint();
    private Paint mPaintTextBackground = new Paint();
    public String mText = null;
    private int mTextBackgroundColor = Color.argb(255, 50, 50, 50);
    private Rect mTextBounds = new Rect();
    private int mTextColor = Color.argb(255, 200, 200, 200);

    public MockView(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.MockView_mock_label) {
                    this.mText = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.MockView_mock_showDiagonals) {
                    this.mDrawDiagonals = obtainStyledAttributes.getBoolean(index, this.mDrawDiagonals);
                } else if (index == R.styleable.MockView_mock_diagonalsColor) {
                    this.mDiagonalsColor = obtainStyledAttributes.getColor(index, this.mDiagonalsColor);
                } else if (index == R.styleable.MockView_mock_labelBackgroundColor) {
                    this.mTextBackgroundColor = obtainStyledAttributes.getColor(index, this.mTextBackgroundColor);
                } else if (index == R.styleable.MockView_mock_labelColor) {
                    this.mTextColor = obtainStyledAttributes.getColor(index, this.mTextColor);
                } else if (index == R.styleable.MockView_mock_showLabel) {
                    this.mDrawLabel = obtainStyledAttributes.getBoolean(index, this.mDrawLabel);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.mText == null) {
            try {
                this.mText = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.mPaintDiagonals.setColor(this.mDiagonalsColor);
        this.mPaintDiagonals.setAntiAlias(true);
        this.mPaintText.setColor(this.mTextColor);
        this.mPaintText.setAntiAlias(true);
        this.mPaintTextBackground.setColor(this.mTextBackgroundColor);
        this.mMargin = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * ((float) this.mMargin));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.mDrawDiagonals) {
            width--;
            height--;
            float f = (float) width;
            float f2 = (float) height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.mPaintDiagonals);
            Canvas canvas2 = canvas;
            float f3 = f;
            canvas2.drawLine(0.0f, f2, f3, 0.0f, this.mPaintDiagonals);
            canvas2.drawLine(0.0f, 0.0f, f3, 0.0f, this.mPaintDiagonals);
            float f4 = f;
            float f5 = f2;
            canvas2.drawLine(f4, 0.0f, f3, f5, this.mPaintDiagonals);
            float f6 = f2;
            canvas2.drawLine(f4, f6, 0.0f, f5, this.mPaintDiagonals);
            canvas2.drawLine(0.0f, f6, 0.0f, 0.0f, this.mPaintDiagonals);
        }
        String str = this.mText;
        if (str != null && this.mDrawLabel) {
            this.mPaintText.getTextBounds(str, 0, str.length(), this.mTextBounds);
            float width2 = ((float) (width - this.mTextBounds.width())) / 2.0f;
            float height2 = (((float) (height - this.mTextBounds.height())) / 2.0f) + ((float) this.mTextBounds.height());
            this.mTextBounds.offset((int) width2, (int) height2);
            Rect rect = this.mTextBounds;
            int i2 = rect.left;
            int i3 = this.mMargin;
            rect.set(i2 - i3, rect.top - i3, rect.right + i3, rect.bottom + i3);
            canvas.drawRect(this.mTextBounds, this.mPaintTextBackground);
            canvas.drawText(this.mText, width2, height2, this.mPaintText);
        }
    }
}
