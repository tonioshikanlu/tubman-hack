package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import b.e.a.a.a;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    public static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Slider;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final long LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final long LABEL_ANIMATION_EXIT_DURATION = 117;
    private static final String TAG = BaseSlider.class.getSimpleName();
    private static final double THRESHOLD = 1.0E-4d;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    public static final int UNIT_PX = 0;
    public static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERRROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.";
    private BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;
    /* access modifiers changed from: private */
    @NonNull
    public final AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;
    @NonNull
    private final Paint activeTicksPaint;
    @NonNull
    private final Paint activeTrackPaint;
    @NonNull
    private final List<L> changeListeners;
    private int defaultThumbRadius;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;
    @NonNull
    private ColorStateList haloColor;
    @NonNull
    private final Paint haloPaint;
    private int haloRadius;
    @NonNull
    private final Paint inactiveTicksPaint;
    @NonNull
    private final Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    @NonNull
    private final TooltipDrawableFactory labelMaker;
    private int labelPadding;
    /* access modifiers changed from: private */
    @NonNull
    public final List<TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTrackSidePadding;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;
    @NonNull
    private final MaterialShapeDrawable thumbDrawable;
    private boolean thumbIsPressed;
    @NonNull
    private final Paint thumbPaint;
    private int thumbRadius;
    @NonNull
    private ColorStateList tickColorActive;
    @NonNull
    private ColorStateList tickColorInactive;
    private boolean tickVisible;
    private float[] ticksCoordinates;
    private float touchDownX;
    @NonNull
    private final List<T> touchListeners;
    private float touchPosition;
    @NonNull
    private ColorStateList trackColorActive;
    @NonNull
    private ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackSidePadding;
    private int trackTop;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetHeight;

    public class AccessibilityEventSender implements Runnable {
        public int virtualViewId;

        private AccessibilityEventSender() {
            this.virtualViewId = -1;
        }

        public void run() {
            BaseSlider.this.accessibilityHelper.sendEventForVirtualView(this.virtualViewId, 4);
        }

        public void setVirtualViewId(int i2) {
            this.virtualViewId = i2;
        }
    }

    public static class AccessibilityHelper extends ExploreByTouchHelper {
        private final BaseSlider<?, ?, ?> slider;
        public Rect virtualViewBounds = new Rect();

        public AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.slider = baseSlider;
        }

        @NonNull
        private String startOrEndDescription(int i2) {
            Context context;
            int i3;
            if (i2 == this.slider.getValues().size() - 1) {
                context = this.slider.getContext();
                i3 = R.string.material_slider_range_end;
            } else if (i2 != 0) {
                return "";
            } else {
                context = this.slider.getContext();
                i3 = R.string.material_slider_range_start;
            }
            return context.getString(i3);
        }

        public int getVirtualViewAt(float f, float f2) {
            for (int i2 = 0; i2 < this.slider.getValues().size(); i2++) {
                this.slider.updateBoundsForVirturalViewId(i2, this.virtualViewBounds);
                if (this.virtualViewBounds.contains((int) f, (int) f2)) {
                    return i2;
                }
            }
            return -1;
        }

        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i2 = 0; i2 < this.slider.getValues().size(); i2++) {
                list.add(Integer.valueOf(i2));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
            if (com.google.android.material.slider.BaseSlider.access$600(r4.slider, r5, r7.getFloat(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) != false) goto L_0x0030;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPerformActionForVirtualView(int r5, int r6, android.os.Bundle r7) {
            /*
                r4 = this;
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.slider
                boolean r0 = r0.isEnabled()
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                r0 = 4096(0x1000, float:5.74E-42)
                r2 = 1
                r3 = 8192(0x2000, float:1.14794E-41)
                if (r6 == r0) goto L_0x003f
                if (r6 == r3) goto L_0x003f
                r0 = 16908349(0x102003d, float:2.38774E-38)
                if (r6 == r0) goto L_0x0019
                return r1
            L_0x0019:
                if (r7 == 0) goto L_0x003e
                java.lang.String r6 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
                boolean r0 = r7.containsKey(r6)
                if (r0 != 0) goto L_0x0024
                goto L_0x003e
            L_0x0024:
                float r6 = r7.getFloat(r6)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                boolean r6 = r7.snapThumbToValue(r5, r6)
                if (r6 == 0) goto L_0x003e
            L_0x0030:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                r6.updateHaloHotspot()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                r6.postInvalidate()
                r4.invalidateVirtualView(r5)
                return r2
            L_0x003e:
                return r1
            L_0x003f:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                r0 = 20
                float r7 = r7.calculateStepIncrement(r0)
                if (r6 != r3) goto L_0x004a
                float r7 = -r7
            L_0x004a:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                boolean r6 = r6.isRtl()
                if (r6 == 0) goto L_0x0053
                float r7 = -r7
            L_0x0053:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                java.util.List r6 = r6.getValues()
                java.lang.Object r6 = r6.get(r5)
                java.lang.Float r6 = (java.lang.Float) r6
                float r6 = r6.floatValue()
                float r6 = r6 + r7
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                float r7 = r7.getValueFrom()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.slider
                float r0 = r0.getValueTo()
                float r6 = androidx.core.math.MathUtils.clamp((float) r6, (float) r7, (float) r0)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                boolean r6 = r7.snapThumbToValue(r5, r6)
                if (r6 == 0) goto L_0x007d
                goto L_0x0030
            L_0x007d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.AccessibilityHelper.onPerformActionForVirtualView(int, int, android.os.Bundle):boolean");
        }

        public void onPopulateNodeForVirtualView(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.slider.getValues();
            float floatValue = values.get(i2).floatValue();
            float valueFrom = this.slider.getValueFrom();
            float valueTo = this.slider.getValueTo();
            if (this.slider.isEnabled()) {
                if (floatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (floatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, floatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.slider.getContentDescription() != null) {
                sb.append(this.slider.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(startOrEndDescription(i2));
                sb.append(this.slider.formatValue(floatValue));
            }
            accessibilityNodeInfoCompat.setContentDescription(sb.toString());
            this.slider.updateBoundsForVirturalViewId(i2, this.virtualViewBounds);
            accessibilityNodeInfoCompat.setBoundsInParent(this.virtualViewBounds);
        }
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() {
            @NonNull
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel);
            }

            @NonNull
            public SliderState[] newArray(int i2) {
                return new SliderState[i2];
            }
        };
        public boolean hasFocus;
        public float stepSize;
        public float valueFrom;
        public float valueTo;
        public ArrayList<Float> values;

        private SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }
    }

    public interface TooltipDrawableFactory {
        TooltipDrawable createTooltipDrawable();
    }

    public BaseSlider(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public BaseSlider(@NonNull Context context, @Nullable final AttributeSet attributeSet, final int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, DEF_STYLE_RES), attributeSet, i2);
        this.labels = new ArrayList();
        this.changeListeners = new ArrayList();
        this.touchListeners = new ArrayList();
        this.labelsAreAnimatedIn = false;
        this.thumbIsPressed = false;
        this.values = new ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = 0.0f;
        this.tickVisible = true;
        this.isLongPress = false;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.thumbDrawable = materialShapeDrawable;
        this.separationUnit = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.inactiveTrackPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.activeTrackPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.thumbPaint = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.haloPaint = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.inactiveTicksPaint = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.activeTicksPaint = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        loadResources(context2.getResources());
        this.labelMaker = new TooltipDrawableFactory() {
            public TooltipDrawable createTooltipDrawable() {
                TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(BaseSlider.this.getContext(), attributeSet, R.styleable.Slider, i2, BaseSlider.DEF_STYLE_RES, new int[0]);
                TooltipDrawable access$000 = BaseSlider.parseLabelDrawable(BaseSlider.this.getContext(), obtainStyledAttributes);
                obtainStyledAttributes.recycle();
                return access$000;
            }
        };
        processAttributes(context2, attributeSet, i2);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.scaledTouchSlop = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper2 = new AccessibilityHelper(this);
        this.accessibilityHelper = accessibilityHelper2;
        ViewCompat.setAccessibilityDelegate(this, accessibilityHelper2);
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    private Float calculateIncrementForKey(int i2) {
        float calculateStepIncrement = this.isLongPress ? calculateStepIncrement(20) : calculateStepIncrement();
        if (i2 == 21) {
            if (!isRtl()) {
                calculateStepIncrement = -calculateStepIncrement;
            }
            return Float.valueOf(calculateStepIncrement);
        } else if (i2 == 22) {
            if (isRtl()) {
                calculateStepIncrement = -calculateStepIncrement;
            }
            return Float.valueOf(calculateStepIncrement);
        } else if (i2 == 69) {
            return Float.valueOf(-calculateStepIncrement);
        } else {
            if (i2 == 70 || i2 == 81) {
                return Float.valueOf(calculateStepIncrement);
            }
            return null;
        }
    }

    private float calculateStepIncrement() {
        float f = this.stepSize;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* access modifiers changed from: private */
    public float calculateStepIncrement(int i2) {
        float calculateStepIncrement = calculateStepIncrement();
        float f = (this.valueTo - this.valueFrom) / calculateStepIncrement;
        float f2 = (float) i2;
        return f <= f2 ? calculateStepIncrement : ((float) Math.round(f / f2)) * calculateStepIncrement;
    }

    private int calculateTop() {
        int i2 = this.trackTop;
        int i3 = 0;
        if (this.labelBehavior == 1) {
            i3 = this.labels.get(0).getIntrinsicHeight();
        }
        return i2 + i3;
    }

    private ValueAnimator createLabelAnimator(boolean z) {
        float f = 0.0f;
        float animatorCurrentValueOrDefault = getAnimatorCurrentValueOrDefault(z ? this.labelsOutAnimator : this.labelsInAnimator, z ? 0.0f : 1.0f);
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{animatorCurrentValueOrDefault, f});
        ofFloat.setDuration(z ? LABEL_ANIMATION_ENTER_DURATION : LABEL_ANIMATION_EXIT_DURATION);
        ofFloat.setInterpolator(z ? AnimationUtils.DECELERATE_INTERPOLATOR : AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (TooltipDrawable revealFraction : BaseSlider.this.labels) {
                    revealFraction.setRevealFraction(floatValue);
                }
                ViewCompat.postInvalidateOnAnimation(BaseSlider.this);
            }
        });
        return ofFloat;
    }

    private void createLabelPool() {
        if (this.labels.size() > this.values.size()) {
            List<TooltipDrawable> subList = this.labels.subList(this.values.size(), this.labels.size());
            for (TooltipDrawable next : subList) {
                if (ViewCompat.isAttachedToWindow(this)) {
                    detachLabelFromContentView(next);
                }
            }
            subList.clear();
        }
        while (this.labels.size() < this.values.size()) {
            TooltipDrawable createTooltipDrawable = this.labelMaker.createTooltipDrawable();
            this.labels.add(createTooltipDrawable);
            if (ViewCompat.isAttachedToWindow(this)) {
                attachLabelToContentView(createTooltipDrawable);
            }
        }
        int i2 = 1;
        if (this.labels.size() == 1) {
            i2 = 0;
        }
        for (TooltipDrawable strokeWidth : this.labels) {
            strokeWidth.setStrokeWidth((float) i2);
        }
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(this);
        if (contentViewOverlay != null) {
            contentViewOverlay.remove(tooltipDrawable);
            tooltipDrawable.detachView(ViewUtils.getContentView(this));
        }
    }

    private float dimenToValue(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - ((float) this.trackSidePadding)) / ((float) this.trackWidth);
        float f3 = this.valueFrom;
        return a.a(f3, this.valueTo, f2, f3);
    }

    private void dispatchOnChangedFromUser(int i2) {
        for (L onValueChange : this.changeListeners) {
            onValueChange.onValueChange(this, this.values.get(i2).floatValue(), true);
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null && accessibilityManager2.isEnabled()) {
            scheduleAccessibilityEventSender(i2);
        }
    }

    private void dispatchOnChangedProgramatically() {
        for (L l2 : this.changeListeners) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                l2.onValueChange(this, it.next().floatValue(), false);
            }
        }
    }

    private void drawActiveTrack(@NonNull Canvas canvas, int i2, int i3) {
        float[] activeRange = getActiveRange();
        int i4 = this.trackSidePadding;
        float f = (float) i2;
        float f2 = activeRange[1] * f;
        float f3 = (float) i3;
        Canvas canvas2 = canvas;
        canvas2.drawLine((activeRange[0] * f) + ((float) i4), f3, f2 + ((float) i4), f3, this.activeTrackPaint);
    }

    private void drawInactiveTrack(@NonNull Canvas canvas, int i2, int i3) {
        float[] activeRange = getActiveRange();
        int i4 = this.trackSidePadding;
        float f = (float) i2;
        float f2 = (activeRange[1] * f) + ((float) i4);
        if (f2 < ((float) (i4 + i2))) {
            float f3 = (float) i3;
            canvas.drawLine(f2, f3, (float) (i4 + i2), f3, this.inactiveTrackPaint);
        }
        int i5 = this.trackSidePadding;
        float f4 = (activeRange[0] * f) + ((float) i5);
        if (f4 > ((float) i5)) {
            float f5 = (float) i3;
            canvas.drawLine((float) i5, f5, f4, f5, this.inactiveTrackPaint);
        }
    }

    private void drawThumbs(@NonNull Canvas canvas, int i2, int i3) {
        if (!isEnabled()) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                canvas.drawCircle((normalizeValue(it.next().floatValue()) * ((float) i2)) + ((float) this.trackSidePadding), (float) i3, (float) this.thumbRadius, this.thumbPaint);
            }
        }
        Iterator<Float> it2 = this.values.iterator();
        while (it2.hasNext()) {
            canvas.save();
            int normalizeValue = this.trackSidePadding + ((int) (normalizeValue(it2.next().floatValue()) * ((float) i2)));
            int i4 = this.thumbRadius;
            canvas.translate((float) (normalizeValue - i4), (float) (i3 - i4));
            this.thumbDrawable.draw(canvas);
            canvas.restore();
        }
    }

    private void ensureLabelsAdded() {
        if (this.labelBehavior != 2) {
            if (!this.labelsAreAnimatedIn) {
                this.labelsAreAnimatedIn = true;
                ValueAnimator createLabelAnimator = createLabelAnimator(true);
                this.labelsInAnimator = createLabelAnimator;
                this.labelsOutAnimator = null;
                createLabelAnimator.start();
            }
            Iterator<TooltipDrawable> it = this.labels.iterator();
            for (int i2 = 0; i2 < this.values.size() && it.hasNext(); i2++) {
                if (i2 != this.focusedThumbIdx) {
                    setValueForLabel(it.next(), this.values.get(i2).floatValue());
                }
            }
            if (it.hasNext()) {
                setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
            } else {
                throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.labels.size()), Integer.valueOf(this.values.size())}));
            }
        }
    }

    private void ensureLabelsRemoved() {
        if (this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = false;
            ValueAnimator createLabelAnimator = createLabelAnimator(false);
            this.labelsOutAnimator = createLabelAnimator;
            this.labelsInAnimator = null;
            createLabelAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    for (TooltipDrawable remove : BaseSlider.this.labels) {
                        ViewUtils.getContentViewOverlay(BaseSlider.this).remove(remove);
                    }
                }
            });
            this.labelsOutAnimator.start();
        }
    }

    private void focusThumbOnFocusGained(int i2) {
        if (i2 == 1) {
            moveFocus(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        } else if (i2 == 2) {
            moveFocus(Integer.MIN_VALUE);
        } else if (i2 == 17) {
            moveFocusInAbsoluteDirection(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        } else if (i2 == 66) {
            moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
        }
    }

    /* access modifiers changed from: private */
    public String formatValue(float f) {
        if (hasLabelFormatter()) {
            return this.formatter.getFormattedValue(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", new Object[]{Float.valueOf(f)});
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.values.size() == 1) {
            floatValue2 = this.valueFrom;
        }
        float normalizeValue = normalizeValue(floatValue2);
        float normalizeValue2 = normalizeValue(floatValue);
        if (isRtl()) {
            return new float[]{normalizeValue2, normalizeValue};
        }
        return new float[]{normalizeValue, normalizeValue2};
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    private float getClampedValue(int i2, float f) {
        float f2 = 0.0f;
        if (this.stepSize == 0.0f) {
            f2 = getMinSeparation();
        }
        if (this.separationUnit == 0) {
            f2 = dimenToValue(f2);
        }
        if (isRtl()) {
            f2 = -f2;
        }
        int i3 = i2 + 1;
        int i4 = i2 - 1;
        return MathUtils.clamp(f, i4 < 0 ? this.valueFrom : this.values.get(i4).floatValue() + f2, i3 >= this.values.size() ? this.valueTo : this.values.get(i3).floatValue() - f2);
    }

    @ColorInt
    private int getColorForState(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private float getValueOfTouchPosition() {
        double snapPosition = snapPosition(this.touchPosition);
        if (isRtl()) {
            snapPosition = 1.0d - snapPosition;
        }
        float f = this.valueTo;
        float f2 = this.valueFrom;
        return (float) ((snapPosition * ((double) (f - f2))) + ((double) f2));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.touchPosition;
        if (isRtl()) {
            f = 1.0f - f;
        }
        float f2 = this.valueTo;
        float f3 = this.valueFrom;
        return a.a(f2, f3, f, f3);
    }

    private void invalidateTrack() {
        this.inactiveTrackPaint.setStrokeWidth((float) this.trackHeight);
        this.activeTrackPaint.setStrokeWidth((float) this.trackHeight);
        this.inactiveTicksPaint.setStrokeWidth(((float) this.trackHeight) / 2.0f);
        this.activeTicksPaint.setStrokeWidth(((float) this.trackHeight) / 2.0f);
    }

    private boolean isInVerticalScrollingContainer() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    private void loadResources(@NonNull Resources resources) {
        this.widgetHeight = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.minTrackSidePadding = dimensionPixelOffset;
        this.trackSidePadding = dimensionPixelOffset;
        this.defaultThumbRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.trackTop = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_top);
        this.labelPadding = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
    }

    private void maybeCalculateTicksCoordinates() {
        if (this.stepSize > 0.0f) {
            validateConfigurationIfDirty();
            int min = Math.min((int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f), (this.trackWidth / (this.trackHeight * 2)) + 1);
            float[] fArr = this.ticksCoordinates;
            if (fArr == null || fArr.length != min * 2) {
                this.ticksCoordinates = new float[(min * 2)];
            }
            float f = ((float) this.trackWidth) / ((float) (min - 1));
            for (int i2 = 0; i2 < min * 2; i2 += 2) {
                float[] fArr2 = this.ticksCoordinates;
                fArr2[i2] = (((float) (i2 / 2)) * f) + ((float) this.trackSidePadding);
                fArr2[i2 + 1] = (float) calculateTop();
            }
        }
    }

    private void maybeDrawHalo(@NonNull Canvas canvas, int i2, int i3) {
        if (shouldDrawCompatHalo()) {
            int normalizeValue = (int) ((normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * ((float) i2)) + ((float) this.trackSidePadding));
            if (Build.VERSION.SDK_INT < 28) {
                int i4 = this.haloRadius;
                canvas.clipRect((float) (normalizeValue - i4), (float) (i3 - i4), (float) (normalizeValue + i4), (float) (i4 + i3), Region.Op.UNION);
            }
            canvas.drawCircle((float) normalizeValue, (float) i3, (float) this.haloRadius, this.haloPaint);
        }
    }

    private void maybeDrawTicks(@NonNull Canvas canvas) {
        if (this.tickVisible && this.stepSize > 0.0f) {
            float[] activeRange = getActiveRange();
            int pivotIndex = pivotIndex(this.ticksCoordinates, activeRange[0]);
            int pivotIndex2 = pivotIndex(this.ticksCoordinates, activeRange[1]);
            int i2 = pivotIndex * 2;
            canvas.drawPoints(this.ticksCoordinates, 0, i2, this.inactiveTicksPaint);
            int i3 = pivotIndex2 * 2;
            canvas.drawPoints(this.ticksCoordinates, i2, i3 - i2, this.activeTicksPaint);
            float[] fArr = this.ticksCoordinates;
            canvas.drawPoints(fArr, i3, fArr.length - i3, this.inactiveTicksPaint);
        }
    }

    private void maybeIncreaseTrackSidePadding() {
        this.trackSidePadding = this.minTrackSidePadding + Math.max(this.thumbRadius - this.defaultThumbRadius, 0);
        if (ViewCompat.isLaidOut(this)) {
            updateTrackWidth(getWidth());
        }
    }

    private boolean moveFocus(int i2) {
        int i3 = this.focusedThumbIdx;
        int clamp = (int) MathUtils.clamp(((long) i3) + ((long) i2), 0, (long) (this.values.size() - 1));
        this.focusedThumbIdx = clamp;
        if (clamp == i3) {
            return false;
        }
        if (this.activeThumbIdx != -1) {
            this.activeThumbIdx = clamp;
        }
        updateHaloHotspot();
        postInvalidate();
        return true;
    }

    private boolean moveFocusInAbsoluteDirection(int i2) {
        if (isRtl()) {
            i2 = i2 == Integer.MIN_VALUE ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : -i2;
        }
        return moveFocus(i2);
    }

    private float normalizeValue(float f) {
        float f2 = this.valueFrom;
        float f3 = (f - f2) / (this.valueTo - f2);
        return isRtl() ? 1.0f - f3 : f3;
    }

    private Boolean onKeyDownNoActiveThumb(int i2, @NonNull KeyEvent keyEvent) {
        boolean moveFocus;
        Boolean bool = Boolean.TRUE;
        if (i2 != 61) {
            if (i2 != 66) {
                if (i2 != 81) {
                    if (i2 == 69) {
                        moveFocus(-1);
                        return bool;
                    } else if (i2 != 70) {
                        switch (i2) {
                            case 21:
                                moveFocusInAbsoluteDirection(-1);
                                return bool;
                            case 22:
                                moveFocusInAbsoluteDirection(1);
                                return bool;
                            case 23:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                moveFocus(1);
                return bool;
            }
            this.activeThumbIdx = this.focusedThumbIdx;
            postInvalidate();
            return bool;
        }
        if (keyEvent.hasNoModifiers()) {
            moveFocus = moveFocus(1);
        } else if (!keyEvent.isShiftPressed()) {
            return Boolean.FALSE;
        } else {
            moveFocus = moveFocus(-1);
        }
        return Boolean.valueOf(moveFocus);
    }

    private void onStartTrackingTouch() {
        for (T onStartTrackingTouch : this.touchListeners) {
            onStartTrackingTouch.onStartTrackingTouch(this);
        }
    }

    private void onStopTrackingTouch() {
        for (T onStopTrackingTouch : this.touchListeners) {
            onStopTrackingTouch.onStopTrackingTouch(this);
        }
    }

    /* access modifiers changed from: private */
    @NonNull
    public static TooltipDrawable parseLabelDrawable(@NonNull Context context, @NonNull TypedArray typedArray) {
        return TooltipDrawable.createFromAttributes(context, (AttributeSet) null, 0, typedArray.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip));
    }

    private static int pivotIndex(float[] fArr, float f) {
        return Math.round(f * ((float) ((fArr.length / 2) - 1)));
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Slider, i2, DEF_STYLE_RES, new int[0]);
        this.valueFrom = obtainStyledAttributes.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.valueTo = obtainStyledAttributes.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.valueFrom));
        this.stepSize = obtainStyledAttributes.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        int i3 = R.styleable.Slider_trackColor;
        boolean hasValue = obtainStyledAttributes.hasValue(i3);
        int i4 = hasValue ? i3 : R.styleable.Slider_trackColorInactive;
        if (!hasValue) {
            i3 = R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, i4);
        if (colorStateList == null) {
            colorStateList = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i3);
        if (colorStateList2 == null) {
            colorStateList2 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.thumbDrawable.setFillColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_thumbColor));
        int i5 = R.styleable.Slider_thumbStrokeColor;
        if (obtainStyledAttributes.hasValue(i5)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, i5));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = AppCompatResources.getColorStateList(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        this.tickVisible = obtainStyledAttributes.getBoolean(R.styleable.Slider_tickVisible, true);
        int i6 = R.styleable.Slider_tickColor;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i6);
        int i7 = hasValue2 ? i6 : R.styleable.Slider_tickColorInactive;
        if (!hasValue2) {
            i6 = R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i7);
        if (colorStateList4 == null) {
            colorStateList4 = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i6);
        if (colorStateList5 == null) {
            colorStateList5 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0));
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        this.labelBehavior = obtainStyledAttributes.getInt(R.styleable.Slider_labelBehavior, 0);
        if (!obtainStyledAttributes.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
    }

    private void scheduleAccessibilityEventSender(int i2) {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender2 = this.accessibilityEventSender;
        if (accessibilityEventSender2 == null) {
            this.accessibilityEventSender = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender2);
        }
        this.accessibilityEventSender.setVirtualViewId(i2);
        postDelayed(this.accessibilityEventSender, 200);
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f) {
        tooltipDrawable.setText(formatValue(f));
        int normalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f) * ((float) this.trackWidth)))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int calculateTop = calculateTop() - (this.labelPadding + this.thumbRadius);
        tooltipDrawable.setBounds(normalizeValue, calculateTop - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + normalizeValue, calculateTop);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect);
        tooltipDrawable.setBounds(rect);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.values.size() != arrayList.size() || !this.values.equals(arrayList)) {
                this.values = arrayList;
                this.dirtyConfig = true;
                this.focusedThumbIdx = 0;
                updateHaloHotspot();
                createLabelPool();
                dispatchOnChangedProgramatically();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    private boolean shouldDrawCompatHalo() {
        return this.forceDrawCompatHalo || !(getBackground() instanceof RippleDrawable);
    }

    private boolean snapActiveThumbToValue(float f) {
        return snapThumbToValue(this.activeThumbIdx, f);
    }

    private double snapPosition(float f) {
        float f2 = this.stepSize;
        if (f2 <= 0.0f) {
            return (double) f;
        }
        int i2 = (int) ((this.valueTo - this.valueFrom) / f2);
        return ((double) Math.round(f * ((float) i2))) / ((double) i2);
    }

    /* access modifiers changed from: private */
    public boolean snapThumbToValue(int i2, float f) {
        if (((double) Math.abs(f - this.values.get(i2).floatValue())) < THRESHOLD) {
            return false;
        }
        this.values.set(i2, Float.valueOf(getClampedValue(i2, f)));
        this.focusedThumbIdx = i2;
        dispatchOnChangedFromUser(i2);
        return true;
    }

    private boolean snapTouchPosition() {
        return snapActiveThumbToValue(getValueOfTouchPosition());
    }

    /* access modifiers changed from: private */
    public void updateHaloHotspot() {
        if (!shouldDrawCompatHalo() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int normalizeValue = (int) ((normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * ((float) this.trackWidth)) + ((float) this.trackSidePadding));
                int calculateTop = calculateTop();
                int i2 = this.haloRadius;
                DrawableCompat.setHotspotBounds(background, normalizeValue - i2, calculateTop - i2, normalizeValue + i2, calculateTop + i2);
            }
        }
    }

    private void updateTrackWidth(int i2) {
        this.trackWidth = Math.max(i2 - (this.trackSidePadding * 2), 0);
        maybeCalculateTicksCoordinates();
    }

    private void validateConfigurationIfDirty() {
        if (this.dirtyConfig) {
            validateValueFrom();
            validateValueTo();
            validateStepSize();
            validateValues();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
        }
    }

    private void validateStepSize() {
        if (this.stepSize > 0.0f && !valueLandsOnTick(this.valueTo)) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, new Object[]{Float.toString(this.stepSize), Float.toString(this.valueFrom), Float.toString(this.valueTo)}));
        }
    }

    private void validateValueFrom() {
        if (this.valueFrom >= this.valueTo) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE_FROM, new Object[]{Float.toString(this.valueFrom), Float.toString(this.valueTo)}));
        }
    }

    private void validateValueTo() {
        if (this.valueTo <= this.valueFrom) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE_TO, new Object[]{Float.toString(this.valueTo), Float.toString(this.valueFrom)}));
        }
    }

    private void validateValues() {
        Iterator<Float> it = this.values.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.valueFrom || next.floatValue() > this.valueTo) {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE, new Object[]{Float.toString(next.floatValue()), Float.toString(this.valueFrom), Float.toString(this.valueTo)}));
            } else if (this.stepSize > 0.0f && !valueLandsOnTick(next.floatValue())) {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_DISCRETE_VALUE, new Object[]{Float.toString(next.floatValue()), Float.toString(this.valueFrom), Float.toString(this.stepSize), Float.toString(this.stepSize)}));
            }
        }
    }

    private boolean valueLandsOnTick(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.valueFrom))).divide(new BigDecimal(Float.toString(this.stepSize)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < THRESHOLD;
    }

    private float valueToX(float f) {
        return (normalizeValue(f) * ((float) this.trackWidth)) + ((float) this.trackSidePadding);
    }

    private void warnAboutFloatingPointError() {
        float f = this.stepSize;
        if (f != 0.0f) {
            if (((float) ((int) f)) != f) {
                Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERRROR, new Object[]{"stepSize", Float.valueOf(f)}));
            }
            float f2 = this.valueFrom;
            if (((float) ((int) f2)) != f2) {
                Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERRROR, new Object[]{"valueFrom", Float.valueOf(f2)}));
            }
            float f3 = this.valueTo;
            if (((float) ((int) f3)) != f3) {
                Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERRROR, new Object[]{"valueTo", Float.valueOf(f3)}));
            }
        }
    }

    public void addOnChangeListener(@Nullable L l2) {
        this.changeListeners.add(l2);
    }

    public void addOnSliderTouchListener(@NonNull T t) {
        this.touchListeners.add(t);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.accessibilityHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        for (TooltipDrawable next : this.labels) {
            if (next.isStateful()) {
                next.setState(getDrawableState());
            }
        }
        if (this.thumbDrawable.isStateful()) {
            this.thumbDrawable.setState(getDrawableState());
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    @VisibleForTesting
    public void forceDrawCompatHalo(boolean z) {
        this.forceDrawCompatHalo = z;
    }

    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    @Dimension
    public int getHaloRadius() {
        return this.haloRadius;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public float getThumbElevation() {
        return this.thumbDrawable.getElevation();
    }

    @Dimension
    public int getThumbRadius() {
        return this.thumbRadius;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.thumbDrawable.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.thumbDrawable.getStrokeWidth();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.thumbDrawable.getFillColor();
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.tickColorInactive.equals(this.tickColorActive)) {
            return this.tickColorActive;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    @Dimension
    public int getTrackHeight() {
        return this.trackHeight;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.trackColorInactive.equals(this.trackColorActive)) {
            return this.trackColorActive;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Dimension
    public int getTrackWidth() {
        return this.trackWidth;
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public float getValueTo() {
        return this.valueTo;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.values);
    }

    public boolean hasLabelFormatter() {
        return this.formatter != null;
    }

    public final boolean isRtl() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public boolean isTickVisible() {
        return this.tickVisible;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (TooltipDrawable attachLabelToContentView : this.labels) {
            attachLabelToContentView(attachLabelToContentView);
        }
    }

    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender2 = this.accessibilityEventSender;
        if (accessibilityEventSender2 != null) {
            removeCallbacks(accessibilityEventSender2);
        }
        this.labelsAreAnimatedIn = false;
        for (TooltipDrawable detachLabelFromContentView : this.labels) {
            detachLabelFromContentView(detachLabelFromContentView);
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(@NonNull Canvas canvas) {
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            maybeCalculateTicksCoordinates();
        }
        super.onDraw(canvas);
        int calculateTop = calculateTop();
        drawInactiveTrack(canvas, this.trackWidth, calculateTop);
        if (((Float) Collections.max(getValues())).floatValue() > this.valueFrom) {
            drawActiveTrack(canvas, this.trackWidth, calculateTop);
        }
        maybeDrawTicks(canvas);
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            maybeDrawHalo(canvas, this.trackWidth, calculateTop);
            if (this.activeThumbIdx != -1) {
                ensureLabelsAdded();
            }
        }
        drawThumbs(canvas, this.trackWidth, calculateTop);
    }

    public void onFocusChanged(boolean z, int i2, @Nullable Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (!z) {
            this.activeThumbIdx = -1;
            ensureLabelsRemoved();
            this.accessibilityHelper.clearKeyboardFocusForVirtualView(this.focusedThumbIdx);
            return;
        }
        focusThumbOnFocusGained(i2);
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(this.focusedThumbIdx);
    }

    public boolean onKeyDown(int i2, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.values.size() == 1) {
            this.activeThumbIdx = 0;
        }
        if (this.activeThumbIdx == -1) {
            Boolean onKeyDownNoActiveThumb = onKeyDownNoActiveThumb(i2, keyEvent);
            return onKeyDownNoActiveThumb != null ? onKeyDownNoActiveThumb.booleanValue() : super.onKeyDown(i2, keyEvent);
        }
        this.isLongPress |= keyEvent.isLongPress();
        Float calculateIncrementForKey = calculateIncrementForKey(i2);
        if (calculateIncrementForKey != null) {
            if (snapActiveThumbToValue(calculateIncrementForKey.floatValue() + this.values.get(this.activeThumbIdx).floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i2 != 23) {
            if (i2 != 61) {
                if (i2 != 66) {
                    return super.onKeyDown(i2, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return moveFocus(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return moveFocus(-1);
                }
                return false;
            }
        }
        this.activeThumbIdx = -1;
        ensureLabelsRemoved();
        postInvalidate();
        return true;
    }

    public boolean onKeyUp(int i2, @NonNull KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(i2, keyEvent);
    }

    public void onMeasure(int i2, int i3) {
        int i4 = this.widgetHeight;
        int i5 = 0;
        if (this.labelBehavior == 1) {
            i5 = this.labels.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(i4 + i5, BasicMeasure.EXACTLY));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.valueFrom;
        this.valueTo = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.stepSize = sliderState.stepSize;
        if (sliderState.hasFocus) {
            requestFocus();
        }
        dispatchOnChangedProgramatically();
    }

    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.valueFrom;
        sliderState.valueTo = this.valueTo;
        sliderState.values = new ArrayList<>(this.values);
        sliderState.stepSize = this.stepSize;
        sliderState.hasFocus = hasFocus();
        return sliderState;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        updateTrackWidth(i2);
        updateHaloHotspot();
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - ((float) this.trackSidePadding)) / ((float) this.trackWidth);
        this.touchPosition = f;
        float max = Math.max(0.0f, f);
        this.touchPosition = max;
        this.touchPosition = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.thumbIsPressed = false;
                MotionEvent motionEvent2 = this.lastEvent;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.lastEvent.getX() - motionEvent.getX()) <= ((float) this.scaledTouchSlop) && Math.abs(this.lastEvent.getY() - motionEvent.getY()) <= ((float) this.scaledTouchSlop) && pickActiveThumb()) {
                    onStartTrackingTouch();
                }
                if (this.activeThumbIdx != -1) {
                    snapTouchPosition();
                    this.activeThumbIdx = -1;
                    onStopTrackingTouch();
                }
                ensureLabelsRemoved();
            } else if (actionMasked == 2) {
                if (!this.thumbIsPressed) {
                    if (isInVerticalScrollingContainer() && Math.abs(x - this.touchDownX) < ((float) this.scaledTouchSlop)) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    onStartTrackingTouch();
                }
                if (pickActiveThumb()) {
                    this.thumbIsPressed = true;
                    snapTouchPosition();
                    updateHaloHotspot();
                }
            }
            invalidate();
        } else {
            this.touchDownX = x;
            if (!isInVerticalScrollingContainer()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.thumbIsPressed = true;
                    snapTouchPosition();
                    updateHaloHotspot();
                    invalidate();
                    onStartTrackingTouch();
                }
            }
        }
        setPressed(this.thumbIsPressed);
        this.lastEvent = MotionEvent.obtain(motionEvent);
        return true;
    }

    public boolean pickActiveThumb() {
        if (this.activeThumbIdx != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float valueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float abs = Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i2 = 1; i2 < this.values.size(); i2++) {
            float abs2 = Math.abs(this.values.get(i2).floatValue() - valueOfTouchPositionAbsolute);
            float valueToX2 = valueToX(this.values.get(i2).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z = !isRtl() ? valueToX2 - valueToX < 0.0f : valueToX2 - valueToX > 0.0f;
            if (Float.compare(abs2, abs) >= 0) {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(valueToX2 - valueToX) < ((float) this.scaledTouchSlop)) {
                    this.activeThumbIdx = -1;
                    return false;
                } else if (!z) {
                }
            }
            this.activeThumbIdx = i2;
            abs = abs2;
        }
        return this.activeThumbIdx != -1;
    }

    public void removeOnChangeListener(@NonNull L l2) {
        this.changeListeners.remove(l2);
    }

    public void removeOnSliderTouchListener(@NonNull T t) {
        this.touchListeners.remove(t);
    }

    public void setActiveThumbIndex(int i2) {
        this.activeThumbIdx = i2;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, (Paint) null);
    }

    public void setFocusedThumbIndex(int i2) {
        if (i2 < 0 || i2 >= this.values.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.focusedThumbIdx = i2;
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(i2);
        postInvalidate();
    }

    public void setHaloRadius(@Dimension @IntRange(from = 0) int i2) {
        if (i2 != this.haloRadius) {
            this.haloRadius = i2;
            Drawable background = getBackground();
            if (shouldDrawCompatHalo() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.haloRadius);
            }
        }
    }

    public void setHaloRadiusResource(@DimenRes int i2) {
        setHaloRadius(getResources().getDimensionPixelSize(i2));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.haloColor)) {
            this.haloColor = colorStateList;
            Drawable background = getBackground();
            if (shouldDrawCompatHalo() || !(background instanceof RippleDrawable)) {
                this.haloPaint.setColor(getColorForState(colorStateList));
                this.haloPaint.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i2) {
        if (this.labelBehavior != i2) {
            this.labelBehavior = i2;
            requestLayout();
        }
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.formatter = labelFormatter;
    }

    public void setSeparationUnit(int i2) {
        this.separationUnit = i2;
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, new Object[]{Float.toString(f), Float.toString(this.valueFrom), Float.toString(this.valueTo)}));
        } else if (this.stepSize != f) {
            this.stepSize = f;
            this.dirtyConfig = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.thumbDrawable.setElevation(f);
    }

    public void setThumbElevationResource(@DimenRes int i2) {
        setThumbElevation(getResources().getDimension(i2));
    }

    public void setThumbRadius(@Dimension @IntRange(from = 0) int i2) {
        if (i2 != this.thumbRadius) {
            this.thumbRadius = i2;
            maybeIncreaseTrackSidePadding();
            this.thumbDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, (float) this.thumbRadius).build());
            MaterialShapeDrawable materialShapeDrawable = this.thumbDrawable;
            int i3 = this.thumbRadius;
            materialShapeDrawable.setBounds(0, 0, i3 * 2, i3 * 2);
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(@DimenRes int i2) {
        setThumbRadius(getResources().getDimensionPixelSize(i2));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.thumbDrawable.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i2) {
        if (i2 != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i2));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.thumbDrawable.setStrokeWidth(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i2) {
        if (i2 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i2));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.thumbDrawable.getFillColor())) {
            this.thumbDrawable.setFillColor(colorStateList);
            invalidate();
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.tickColorActive)) {
            this.tickColorActive = colorStateList;
            this.activeTicksPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.tickColorInactive)) {
            this.tickColorInactive = colorStateList;
            this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.tickVisible != z) {
            this.tickVisible = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.trackColorActive)) {
            this.trackColorActive = colorStateList;
            this.activeTrackPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(@Dimension @IntRange(from = 0) int i2) {
        if (this.trackHeight != i2) {
            this.trackHeight = i2;
            invalidateTrack();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.trackColorInactive)) {
            this.trackColorInactive = colorStateList;
            this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.valueFrom = f;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.valueTo = f;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList(list));
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public void updateBoundsForVirturalViewId(int i2, Rect rect) {
        int normalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i2).floatValue()) * ((float) this.trackWidth)));
        int calculateTop = calculateTop();
        int i3 = this.thumbRadius;
        rect.set(normalizeValue - i3, calculateTop - i3, normalizeValue + i3, calculateTop + i3);
    }
}
