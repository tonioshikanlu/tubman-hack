package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.List;

public class ClockHandView extends View {
    private static final int ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;
    private ValueAnimator rotationAnimator;
    private int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;
    @Px
    private final int selectorStrokeWidth;

    public interface OnActionUpListener {
        void onActionUp(@FloatRange(from = 0.0d, to = 360.0d) float f, boolean z);
    }

    public interface OnRotateListener {
        void onRotate(@FloatRange(from = 0.0d, to = 360.0d) float f, boolean z);
    }

    public ClockHandView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.listeners = new ArrayList();
        Paint paint2 = new Paint();
        this.paint = paint2;
        this.selectorBox = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i2, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.selectorStrokeWidth = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint2.setAntiAlias(true);
        paint2.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.circleRadius) * ((float) Math.cos(this.degRad))) + f, (((float) this.circleRadius) * ((float) Math.sin(this.degRad))) + f2, (float) this.selectorRadius, this.paint);
        double sin = Math.sin(this.degRad);
        double cos = Math.cos(this.degRad);
        double d = (double) ((float) (this.circleRadius - this.selectorRadius));
        float f3 = (float) (width + ((int) (cos * d)));
        float f4 = (float) (height + ((int) (d * sin)));
        this.paint.setStrokeWidth((float) this.selectorStrokeWidth);
        canvas.drawLine(f, f2, f3, f4, this.paint);
        canvas.drawCircle(f, f2, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private Pair<Float, Float> getValuesForAnimation(float f) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f) > 180.0f) {
            if (handRotation > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (handRotation < 180.0f && f > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f));
    }

    private boolean handleTouchInput(float f, float f2, boolean z, boolean z2, boolean z3) {
        float degreesFromXY = (float) getDegreesFromXY(f, f2);
        boolean z4 = false;
        boolean z5 = getHandRotation() != degreesFromXY;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.animatingOnTouchUp) {
            z4 = true;
        }
        setHandRotation(degreesFromXY, z4);
        return true;
    }

    /* access modifiers changed from: private */
    public void setHandRotationInternal(@FloatRange(from = 0.0d, to = 360.0d) float f, boolean z) {
        float f2 = f % 360.0f;
        this.originalDeg = f2;
        this.degRad = Math.toRadians((double) (f2 - 90.0f));
        float cos = (((float) this.circleRadius) * ((float) Math.cos(this.degRad))) + ((float) (getWidth() / 2));
        float sin = (((float) this.circleRadius) * ((float) Math.sin(this.degRad))) + ((float) (getHeight() / 2));
        RectF rectF = this.selectorBox;
        int i2 = this.selectorRadius;
        rectF.set(cos - ((float) i2), sin - ((float) i2), cos + ((float) i2), sin + ((float) i2));
        for (OnRotateListener onRotate : this.listeners) {
            onRotate.onRotate(f2, z);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    @FloatRange(from = 0.0d, to = 360.0d)
    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        setHandRotation(getHandRotation());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        OnActionUpListener onActionUpListener2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.downX = x;
            this.downY = y;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z3 = false;
            z2 = false;
            z = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i2 = (int) (x - this.downX);
            int i3 = (int) (y - this.downY);
            this.isInTapRegion = (i3 * i3) + (i2 * i2) > this.scaledTouchSlop;
            boolean z4 = this.changedDuringTouch;
            z3 = actionMasked == 1;
            z = false;
            z2 = z4;
        } else {
            z3 = false;
            z2 = false;
            z = false;
        }
        boolean handleTouchInput = handleTouchInput(x, y, z2, z, z3) | this.changedDuringTouch;
        this.changedDuringTouch = handleTouchInput;
        if (handleTouchInput && z3 && (onActionUpListener2 = this.onActionUpListener) != null) {
            onActionUpListener2.onActionUp((float) getDegreesFromXY(x, y), this.isInTapRegion);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.animatingOnTouchUp = z;
    }

    public void setCircleRadius(@Dimension int i2) {
        this.circleRadius = i2;
        invalidate();
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f) {
        setHandRotation(f, false);
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f, boolean z) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            setHandRotationInternal(f, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue()});
        this.rotationAnimator = ofFloat;
        ofFloat.setDuration(200);
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.this.setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.rotationAnimator.start();
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener2) {
        this.onActionUpListener = onActionUpListener2;
    }
}
