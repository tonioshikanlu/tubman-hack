package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularProgressDrawable extends Drawable implements Animatable {
    private static final int ANIMATION_DURATION = 1332;
    private static final int ARROW_HEIGHT = 5;
    private static final int ARROW_HEIGHT_LARGE = 6;
    private static final int ARROW_WIDTH = 10;
    private static final int ARROW_WIDTH_LARGE = 12;
    private static final float CENTER_RADIUS = 7.5f;
    private static final float CENTER_RADIUS_LARGE = 11.0f;
    private static final int[] COLORS = {-16777216};
    private static final float COLOR_CHANGE_OFFSET = 0.75f;
    public static final int DEFAULT = 1;
    private static final float GROUP_FULL_ROTATION = 216.0f;
    public static final int LARGE = 0;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
    private static final float MAX_PROGRESS_ARC = 0.8f;
    private static final float MIN_PROGRESS_ARC = 0.01f;
    private static final float RING_ROTATION = 0.20999998f;
    private static final float SHRINK_OFFSET = 0.5f;
    private static final float STROKE_WIDTH = 2.5f;
    private static final float STROKE_WIDTH_LARGE = 3.0f;
    private Animator mAnimator;
    public boolean mFinishing;
    private Resources mResources;
    private final Ring mRing;
    private float mRotation;
    public float mRotationCount;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    public static class Ring {
        public int mAlpha;
        public Path mArrow;
        public int mArrowHeight;
        public final Paint mArrowPaint;
        public float mArrowScale;
        public int mArrowWidth;
        public final Paint mCirclePaint;
        public int mColorIndex;
        public int[] mColors;
        public int mCurrentColor;
        public float mEndTrim;
        public final Paint mPaint;
        public float mRingCenterRadius;
        public float mRotation;
        public boolean mShowArrow;
        public float mStartTrim;
        public float mStartingEndTrim;
        public float mStartingRotation;
        public float mStartingStartTrim;
        public float mStrokeWidth;
        public final RectF mTempBounds = new RectF();

        public Ring() {
            Paint paint = new Paint();
            this.mPaint = paint;
            Paint paint2 = new Paint();
            this.mArrowPaint = paint2;
            Paint paint3 = new Paint();
            this.mCirclePaint = paint3;
            this.mStartTrim = 0.0f;
            this.mEndTrim = 0.0f;
            this.mRotation = 0.0f;
            this.mStrokeWidth = 5.0f;
            this.mArrowScale = 1.0f;
            this.mAlpha = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void draw(Canvas canvas, Rect rect) {
            RectF rectF = this.mTempBounds;
            float f = this.mRingCenterRadius;
            float f2 = (this.mStrokeWidth / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.mArrowWidth) * this.mArrowScale) / 2.0f, this.mStrokeWidth / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.mStartTrim;
            float f4 = this.mRotation;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.mEndTrim + f4) * 360.0f) - f5;
            this.mPaint.setColor(this.mCurrentColor);
            this.mPaint.setAlpha(this.mAlpha);
            float f7 = this.mStrokeWidth / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.mCirclePaint);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.mPaint);
            drawTriangle(canvas, f5, f6, rectF);
        }

        public void drawTriangle(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.mShowArrow) {
                Path path = this.mArrow;
                if (path == null) {
                    Path path2 = new Path();
                    this.mArrow = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.mArrow.moveTo(0.0f, 0.0f);
                this.mArrow.lineTo(((float) this.mArrowWidth) * this.mArrowScale, 0.0f);
                Path path3 = this.mArrow;
                float f3 = this.mArrowScale;
                path3.lineTo((((float) this.mArrowWidth) * f3) / 2.0f, ((float) this.mArrowHeight) * f3);
                this.mArrow.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((((float) this.mArrowWidth) * this.mArrowScale) / 2.0f), (this.mStrokeWidth / 2.0f) + rectF.centerY());
                this.mArrow.close();
                this.mArrowPaint.setColor(this.mCurrentColor);
                this.mArrowPaint.setAlpha(this.mAlpha);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.mArrow, this.mArrowPaint);
                canvas.restore();
            }
        }

        public int getAlpha() {
            return this.mAlpha;
        }

        public float getArrowHeight() {
            return (float) this.mArrowHeight;
        }

        public float getArrowScale() {
            return this.mArrowScale;
        }

        public float getArrowWidth() {
            return (float) this.mArrowWidth;
        }

        public int getBackgroundColor() {
            return this.mCirclePaint.getColor();
        }

        public float getCenterRadius() {
            return this.mRingCenterRadius;
        }

        public int[] getColors() {
            return this.mColors;
        }

        public float getEndTrim() {
            return this.mEndTrim;
        }

        public int getNextColor() {
            return this.mColors[getNextColorIndex()];
        }

        public int getNextColorIndex() {
            return (this.mColorIndex + 1) % this.mColors.length;
        }

        public float getRotation() {
            return this.mRotation;
        }

        public boolean getShowArrow() {
            return this.mShowArrow;
        }

        public float getStartTrim() {
            return this.mStartTrim;
        }

        public int getStartingColor() {
            return this.mColors[this.mColorIndex];
        }

        public float getStartingEndTrim() {
            return this.mStartingEndTrim;
        }

        public float getStartingRotation() {
            return this.mStartingRotation;
        }

        public float getStartingStartTrim() {
            return this.mStartingStartTrim;
        }

        public Paint.Cap getStrokeCap() {
            return this.mPaint.getStrokeCap();
        }

        public float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        public void goToNextColor() {
            setColorIndex(getNextColorIndex());
        }

        public void resetOriginals() {
            this.mStartingStartTrim = 0.0f;
            this.mStartingEndTrim = 0.0f;
            this.mStartingRotation = 0.0f;
            setStartTrim(0.0f);
            setEndTrim(0.0f);
            setRotation(0.0f);
        }

        public void setAlpha(int i2) {
            this.mAlpha = i2;
        }

        public void setArrowDimensions(float f, float f2) {
            this.mArrowWidth = (int) f;
            this.mArrowHeight = (int) f2;
        }

        public void setArrowScale(float f) {
            if (f != this.mArrowScale) {
                this.mArrowScale = f;
            }
        }

        public void setBackgroundColor(int i2) {
            this.mCirclePaint.setColor(i2);
        }

        public void setCenterRadius(float f) {
            this.mRingCenterRadius = f;
        }

        public void setColor(int i2) {
            this.mCurrentColor = i2;
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mPaint.setColorFilter(colorFilter);
        }

        public void setColorIndex(int i2) {
            this.mColorIndex = i2;
            this.mCurrentColor = this.mColors[i2];
        }

        public void setColors(@NonNull int[] iArr) {
            this.mColors = iArr;
            setColorIndex(0);
        }

        public void setEndTrim(float f) {
            this.mEndTrim = f;
        }

        public void setRotation(float f) {
            this.mRotation = f;
        }

        public void setShowArrow(boolean z) {
            if (this.mShowArrow != z) {
                this.mShowArrow = z;
            }
        }

        public void setStartTrim(float f) {
            this.mStartTrim = f;
        }

        public void setStrokeCap(Paint.Cap cap) {
            this.mPaint.setStrokeCap(cap);
        }

        public void setStrokeWidth(float f) {
            this.mStrokeWidth = f;
            this.mPaint.setStrokeWidth(f);
        }

        public void storeOriginals() {
            this.mStartingStartTrim = this.mStartTrim;
            this.mStartingEndTrim = this.mEndTrim;
            this.mStartingRotation = this.mRotation;
        }
    }

    public CircularProgressDrawable(@NonNull Context context) {
        this.mResources = ((Context) Preconditions.checkNotNull(context)).getResources();
        Ring ring = new Ring();
        this.mRing = ring;
        ring.setColors(COLORS);
        setStrokeWidth(STROKE_WIDTH);
        setupAnimators();
    }

    private void applyFinishTranslation(float f, Ring ring) {
        updateRingColor(f, ring);
        ring.setStartTrim((((ring.getStartingEndTrim() - MIN_PROGRESS_ARC) - ring.getStartingStartTrim()) * f) + ring.getStartingStartTrim());
        ring.setEndTrim(ring.getStartingEndTrim());
        ring.setRotation(((((float) (Math.floor((double) (ring.getStartingRotation() / MAX_PROGRESS_ARC)) + 1.0d)) - ring.getStartingRotation()) * f) + ring.getStartingRotation());
    }

    private int evaluateColorChange(float f, int i2, int i3) {
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        return ((i4 + ((int) (((float) (((i3 >> 24) & 255) - i4)) * f))) << 24) | ((i5 + ((int) (((float) (((i3 >> 16) & 255) - i5)) * f))) << 16) | ((i6 + ((int) (((float) (((i3 >> 8) & 255) - i6)) * f))) << 8) | (i7 + ((int) (f * ((float) ((i3 & 255) - i7)))));
    }

    private float getRotation() {
        return this.mRotation;
    }

    private void setRotation(float f) {
        this.mRotation = f;
    }

    private void setSizeParameters(float f, float f2, float f3, float f4) {
        Ring ring = this.mRing;
        float f5 = this.mResources.getDisplayMetrics().density;
        ring.setStrokeWidth(f2 * f5);
        ring.setCenterRadius(f * f5);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f3 * f5, f4 * f5);
    }

    private void setupAnimators() {
        final Ring ring = this.mRing;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressDrawable.this.updateRingColor(floatValue, ring);
                CircularProgressDrawable.this.applyTransformation(floatValue, ring, false);
                CircularProgressDrawable.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(LINEAR_INTERPOLATOR);
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
                CircularProgressDrawable.this.applyTransformation(1.0f, ring, true);
                ring.storeOriginals();
                ring.goToNextColor();
                CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
                if (circularProgressDrawable.mFinishing) {
                    circularProgressDrawable.mFinishing = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    ring.setShowArrow(false);
                    return;
                }
                circularProgressDrawable.mRotationCount += 1.0f;
            }

            public void onAnimationStart(Animator animator) {
                CircularProgressDrawable.this.mRotationCount = 0.0f;
            }
        });
        this.mAnimator = ofFloat;
    }

    public void applyTransformation(float f, Ring ring, boolean z) {
        float f2;
        float f3;
        if (this.mFinishing) {
            applyFinishTranslation(f, ring);
        } else if (f != 1.0f || z) {
            float startingRotation = ring.getStartingRotation();
            if (f < 0.5f) {
                f2 = ring.getStartingStartTrim();
                f3 = (MATERIAL_INTERPOLATOR.getInterpolation(f / 0.5f) * 0.79f) + MIN_PROGRESS_ARC + f2;
            } else {
                float startingStartTrim = ring.getStartingStartTrim() + 0.79f;
                float f4 = startingStartTrim;
                f2 = startingStartTrim - (((1.0f - MATERIAL_INTERPOLATOR.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + MIN_PROGRESS_ARC);
                f3 = f4;
            }
            float f5 = (f + this.mRotationCount) * GROUP_FULL_ROTATION;
            ring.setStartTrim(f2);
            ring.setEndTrim(f3);
            ring.setRotation((RING_ROTATION * f) + startingRotation);
            setRotation(f5);
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        this.mRing.draw(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.mRing.getAlpha();
    }

    public boolean getArrowEnabled() {
        return this.mRing.getShowArrow();
    }

    public float getArrowHeight() {
        return this.mRing.getArrowHeight();
    }

    public float getArrowScale() {
        return this.mRing.getArrowScale();
    }

    public float getArrowWidth() {
        return this.mRing.getArrowWidth();
    }

    public int getBackgroundColor() {
        return this.mRing.getBackgroundColor();
    }

    public float getCenterRadius() {
        return this.mRing.getCenterRadius();
    }

    @NonNull
    public int[] getColorSchemeColors() {
        return this.mRing.getColors();
    }

    public float getEndTrim() {
        return this.mRing.getEndTrim();
    }

    public int getOpacity() {
        return -3;
    }

    public float getProgressRotation() {
        return this.mRing.getRotation();
    }

    public float getStartTrim() {
        return this.mRing.getStartTrim();
    }

    @NonNull
    public Paint.Cap getStrokeCap() {
        return this.mRing.getStrokeCap();
    }

    public float getStrokeWidth() {
        return this.mRing.getStrokeWidth();
    }

    public boolean isRunning() {
        return this.mAnimator.isRunning();
    }

    public void setAlpha(int i2) {
        this.mRing.setAlpha(i2);
        invalidateSelf();
    }

    public void setArrowDimensions(float f, float f2) {
        this.mRing.setArrowDimensions(f, f2);
        invalidateSelf();
    }

    public void setArrowEnabled(boolean z) {
        this.mRing.setShowArrow(z);
        invalidateSelf();
    }

    public void setArrowScale(float f) {
        this.mRing.setArrowScale(f);
        invalidateSelf();
    }

    public void setBackgroundColor(int i2) {
        this.mRing.setBackgroundColor(i2);
        invalidateSelf();
    }

    public void setCenterRadius(float f) {
        this.mRing.setCenterRadius(f);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mRing.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(@NonNull int... iArr) {
        this.mRing.setColors(iArr);
        this.mRing.setColorIndex(0);
        invalidateSelf();
    }

    public void setProgressRotation(float f) {
        this.mRing.setRotation(f);
        invalidateSelf();
    }

    public void setStartEndTrim(float f, float f2) {
        this.mRing.setStartTrim(f);
        this.mRing.setEndTrim(f2);
        invalidateSelf();
    }

    public void setStrokeCap(@NonNull Paint.Cap cap) {
        this.mRing.setStrokeCap(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f) {
        this.mRing.setStrokeWidth(f);
        invalidateSelf();
    }

    public void setStyle(int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i2 == 0) {
            f = CENTER_RADIUS_LARGE;
            f4 = STROKE_WIDTH_LARGE;
            f3 = 12.0f;
            f2 = 6.0f;
        } else {
            f = CENTER_RADIUS;
            f4 = STROKE_WIDTH;
            f3 = 10.0f;
            f2 = 5.0f;
        }
        setSizeParameters(f, f4, f3, f2);
        invalidateSelf();
    }

    public void start() {
        long j2;
        Animator animator;
        this.mAnimator.cancel();
        this.mRing.storeOriginals();
        if (this.mRing.getEndTrim() != this.mRing.getStartTrim()) {
            this.mFinishing = true;
            animator = this.mAnimator;
            j2 = 666;
        } else {
            this.mRing.setColorIndex(0);
            this.mRing.resetOriginals();
            animator = this.mAnimator;
            j2 = 1332;
        }
        animator.setDuration(j2);
        this.mAnimator.start();
    }

    public void stop() {
        this.mAnimator.cancel();
        setRotation(0.0f);
        this.mRing.setShowArrow(false);
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        invalidateSelf();
    }

    public void updateRingColor(float f, Ring ring) {
        ring.setColor(f > 0.75f ? evaluateColorChange((f - 0.75f) / 0.25f, ring.getStartingColor(), ring.getNextColor()) : ring.getStartingColor());
    }
}
