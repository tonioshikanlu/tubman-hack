package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Flow;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.solver.widgets.VirtualLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.NestedScrollingParent3;
import androidx.exifinterface.media.ExifInterface;
import b.e.a.a.a;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    public static final int MAX_KEY_FRAMES = 50;
    public static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    public boolean firstDown = true;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime = 0;
    /* access modifiers changed from: private */
    public int mBeginState = -1;
    private RectF mBoundsCheck = new RectF();
    public int mCurrentState = -1;
    public int mDebugPath = 0;
    private DecelerateInterpolator mDecelerateLogic = new DecelerateInterpolator();
    private DesignTool mDesignTool;
    public DevModeDraw mDevModeDraw;
    /* access modifiers changed from: private */
    public int mEndState = -1;
    public int mEndWrapHeight;
    public int mEndWrapWidth;
    public HashMap<View, MotionController> mFrameArrayList = new HashMap<>();
    private int mFrames = 0;
    public int mHeightMeasureMode;
    private boolean mInLayout = false;
    public boolean mInTransition = false;
    public boolean mIndirectTransition = false;
    private boolean mInteractionEnabled = true;
    public Interpolator mInterpolator;
    public boolean mIsAnimating = false;
    private boolean mKeepAnimating = false;
    private KeyCache mKeyCache = new KeyCache();
    private long mLastDrawTime = -1;
    private float mLastFps = 0.0f;
    /* access modifiers changed from: private */
    public int mLastHeightMeasureSpec = 0;
    public int mLastLayoutHeight;
    public int mLastLayoutWidth;
    public float mLastVelocity = 0.0f;
    /* access modifiers changed from: private */
    public int mLastWidthMeasureSpec = 0;
    private float mListenerPosition = 0.0f;
    private int mListenerState = 0;
    public boolean mMeasureDuringTransition = false;
    public Model mModel = new Model();
    private boolean mNeedsFireTransitionCompleted = false;
    public int mOldHeight;
    public int mOldWidth;
    private ArrayList<MotionHelper> mOnHideHelpers = null;
    private ArrayList<MotionHelper> mOnShowHelpers = null;
    public float mPostInterpolationPosition;
    private View mRegionView = null;
    public MotionScene mScene;
    public float mScrollTargetDT;
    public float mScrollTargetDX;
    public float mScrollTargetDY;
    public long mScrollTargetTime;
    public int mStartWrapHeight;
    public int mStartWrapWidth;
    private StateCache mStateCache;
    private StopLogic mStopLogic = new StopLogic();
    private boolean mTemporalInterpolator = false;
    public ArrayList<Integer> mTransitionCompleted = new ArrayList<>();
    private float mTransitionDuration = 1.0f;
    public float mTransitionGoalPosition = 0.0f;
    private boolean mTransitionInstantly;
    public float mTransitionLastPosition = 0.0f;
    private long mTransitionLastTime;
    private TransitionListener mTransitionListener;
    private ArrayList<TransitionListener> mTransitionListeners = null;
    public float mTransitionPosition = 0.0f;
    public TransitionState mTransitionState = TransitionState.UNDEFINED;
    public boolean mUndergoingMotion = false;
    public int mWidthMeasureMode;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001c */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values()
                r0 = 4
                int[] r1 = new int[r0]
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState = r1
                r2 = 1
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x000e }
                r3 = 0
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 2
                int[] r3 = $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState     // Catch:{ NoSuchFieldError -> 0x0015 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch:{ NoSuchFieldError -> 0x0015 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                r2 = 3
                int[] r3 = $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState     // Catch:{ NoSuchFieldError -> 0x001c }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch:{ NoSuchFieldError -> 0x001c }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r1 = $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass2.<clinit>():void");
        }
    }

    public class DecelerateInterpolator extends MotionInterpolator {
        public float currentP = 0.0f;
        public float initalV = 0.0f;
        public float maxA;

        public DecelerateInterpolator() {
        }

        public void config(float f, float f2, float f3) {
            this.initalV = f;
            this.currentP = f2;
            this.maxA = f3;
        }

        public float getInterpolation(float f) {
            float f2 = this.initalV;
            if (f2 > 0.0f) {
                float f3 = this.maxA;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                MotionLayout.this.mLastVelocity = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.currentP;
            }
            float f4 = this.maxA;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            MotionLayout.this.mLastVelocity = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.currentP;
        }

        public float getVelocity() {
            return MotionLayout.this.mLastVelocity;
        }
    }

    public class DevModeDraw {
        private static final int DEBUG_PATH_TICKS_PER_MS = 16;
        public final int DIAMOND_SIZE = 10;
        public final int GRAPH_COLOR = -13391360;
        public final int KEYFRAME_COLOR = -2067046;
        public final int RED_COLOR = -21965;
        public final int SHADOW_COLOR = 1996488704;
        public Rect mBounds = new Rect();
        public DashPathEffect mDashPathEffect;
        public Paint mFillPaint;
        public int mKeyFrameCount;
        public float[] mKeyFramePoints;
        public Paint mPaint;
        public Paint mPaintGraph;
        public Paint mPaintKeyframes;
        public Path mPath;
        public int[] mPathMode;
        public float[] mPoints;
        public boolean mPresentationMode = false;
        private float[] mRectangle;
        public int mShadowTranslate = 1;
        public Paint mTextPaint;

        public DevModeDraw() {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-21965);
            this.mPaint.setStrokeWidth(2.0f);
            this.mPaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.mPaintKeyframes = paint2;
            paint2.setAntiAlias(true);
            this.mPaintKeyframes.setColor(-2067046);
            this.mPaintKeyframes.setStrokeWidth(2.0f);
            this.mPaintKeyframes.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.mPaintGraph = paint3;
            paint3.setAntiAlias(true);
            this.mPaintGraph.setColor(-13391360);
            this.mPaintGraph.setStrokeWidth(2.0f);
            this.mPaintGraph.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.mTextPaint = paint4;
            paint4.setAntiAlias(true);
            this.mTextPaint.setColor(-13391360);
            this.mTextPaint.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.mRectangle = new float[8];
            Paint paint5 = new Paint();
            this.mFillPaint = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.mDashPathEffect = dashPathEffect;
            this.mPaintGraph.setPathEffect(dashPathEffect);
            this.mKeyFramePoints = new float[100];
            this.mPathMode = new int[50];
            if (this.mPresentationMode) {
                this.mPaint.setStrokeWidth(8.0f);
                this.mFillPaint.setStrokeWidth(8.0f);
                this.mPaintKeyframes.setStrokeWidth(8.0f);
                this.mShadowTranslate = 4;
            }
        }

        private void drawBasicPath(Canvas canvas) {
            canvas.drawLines(this.mPoints, this.mPaint);
        }

        private void drawPathAsConfigured(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i2 = 0; i2 < this.mKeyFrameCount; i2++) {
                int[] iArr = this.mPathMode;
                if (iArr[i2] == 1) {
                    z = true;
                }
                if (iArr[i2] == 2) {
                    z2 = true;
                }
            }
            if (z) {
                drawPathRelative(canvas);
            }
            if (z2) {
                drawPathCartesian(canvas);
            }
        }

        private void drawPathCartesian(Canvas canvas) {
            float[] fArr = this.mPoints;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.mPaintGraph);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.mPaintGraph);
        }

        private void drawPathCartesianTicks(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.mPoints;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder y = a.y("");
            y.append(((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
            String sb = y.toString();
            getTextBounds(sb, this.mTextPaint);
            canvas2.drawText(sb, ((min2 / 2.0f) - ((float) (this.mBounds.width() / 2))) + min, f2 - 20.0f, this.mTextPaint);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.mPaintGraph);
            StringBuilder y2 = a.y("");
            y2.append(((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            String sb2 = y2.toString();
            getTextBounds(sb2, this.mTextPaint);
            canvas2.drawText(sb2, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.mBounds.height() / 2))), this.mTextPaint);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.mPaintGraph);
        }

        private void drawPathRelative(Canvas canvas) {
            float[] fArr = this.mPoints;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.mPaintGraph);
        }

        private void drawPathRelativeTicks(Canvas canvas, float f, float f2) {
            float f3 = f;
            float f4 = f2;
            float[] fArr = this.mPoints;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f5 - f7), (double) (f6 - f8));
            float f9 = f7 - f5;
            float f10 = f8 - f6;
            float f11 = (((f4 - f6) * f10) + ((f3 - f5) * f9)) / (hypot * hypot);
            float f12 = f5 + (f9 * f11);
            float f13 = f6 + (f11 * f10);
            Path path = new Path();
            path.moveTo(f, f4);
            path.lineTo(f12, f13);
            float hypot2 = (float) Math.hypot((double) (f12 - f3), (double) (f13 - f4));
            StringBuilder y = a.y("");
            y.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            String sb = y.toString();
            getTextBounds(sb, this.mTextPaint);
            canvas.drawTextOnPath(sb, path, (hypot2 / 2.0f) - ((float) (this.mBounds.width() / 2)), -20.0f, this.mTextPaint);
            canvas.drawLine(f3, f4, f12, f13, this.mPaintGraph);
        }

        private void drawPathScreenTicks(Canvas canvas, float f, float f2, int i2, int i3) {
            Canvas canvas2 = canvas;
            StringBuilder y = a.y("");
            y.append(((float) ((int) (((double) (((f - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i2)))) + 0.5d))) / 100.0f);
            String sb = y.toString();
            getTextBounds(sb, this.mTextPaint);
            canvas2.drawText(sb, ((f / 2.0f) - ((float) (this.mBounds.width() / 2))) + 0.0f, f2 - 20.0f, this.mTextPaint);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.mPaintGraph);
            StringBuilder y2 = a.y("");
            y2.append(((float) ((int) (((double) (((f2 - ((float) (i3 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i3)))) + 0.5d))) / 100.0f);
            String sb2 = y2.toString();
            getTextBounds(sb2, this.mTextPaint);
            canvas2.drawText(sb2, f + 5.0f, 0.0f - ((f2 / 2.0f) - ((float) (this.mBounds.height() / 2))), this.mTextPaint);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.mPaintGraph);
        }

        private void drawRectangle(Canvas canvas, MotionController motionController) {
            this.mPath.reset();
            for (int i2 = 0; i2 <= 50; i2++) {
                motionController.buildRect(((float) i2) / ((float) 50), this.mRectangle, 0);
                Path path = this.mPath;
                float[] fArr = this.mRectangle;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.mPath;
                float[] fArr2 = this.mRectangle;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.mPath;
                float[] fArr3 = this.mRectangle;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.mPath;
                float[] fArr4 = this.mRectangle;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.mPath.close();
            }
            this.mPaint.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.mPath, this.mPaint);
            canvas.translate(-2.0f, -2.0f);
            this.mPaint.setColor(SupportMenu.CATEGORY_MASK);
            canvas.drawPath(this.mPath, this.mPaint);
        }

        private void drawTicks(Canvas canvas, int i2, int i3, MotionController motionController) {
            int i4;
            int i5;
            float f;
            float f2;
            int i6;
            Canvas canvas2 = canvas;
            int i7 = i2;
            MotionController motionController2 = motionController;
            View view = motionController2.mView;
            if (view != null) {
                i5 = view.getWidth();
                i4 = motionController2.mView.getHeight();
            } else {
                i5 = 0;
                i4 = 0;
            }
            for (int i8 = 1; i8 < i3 - 1; i8++) {
                if (i7 != 4 || this.mPathMode[i8 - 1] != 0) {
                    float[] fArr = this.mKeyFramePoints;
                    int i9 = i8 * 2;
                    float f3 = fArr[i9];
                    float f4 = fArr[i9 + 1];
                    this.mPath.reset();
                    this.mPath.moveTo(f3, f4 + 10.0f);
                    this.mPath.lineTo(f3 + 10.0f, f4);
                    this.mPath.lineTo(f3, f4 - 10.0f);
                    this.mPath.lineTo(f3 - 10.0f, f4);
                    this.mPath.close();
                    int i10 = i8 - 1;
                    motionController2.getKeyFrame(i10);
                    if (i7 == 4) {
                        int[] iArr = this.mPathMode;
                        if (iArr[i10] == 1) {
                            drawPathRelativeTicks(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i10] == 2) {
                            drawPathCartesianTicks(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i10] == 3) {
                            i6 = 3;
                            f2 = f4;
                            f = f3;
                            drawPathScreenTicks(canvas, f3 - 0.0f, f4 - 0.0f, i5, i4);
                            canvas2.drawPath(this.mPath, this.mFillPaint);
                        }
                        i6 = 3;
                        f2 = f4;
                        f = f3;
                        canvas2.drawPath(this.mPath, this.mFillPaint);
                    } else {
                        i6 = 3;
                        f2 = f4;
                        f = f3;
                    }
                    if (i7 == 2) {
                        drawPathRelativeTicks(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i7 == i6) {
                        drawPathCartesianTicks(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i7 == 6) {
                        drawPathScreenTicks(canvas, f - 0.0f, f2 - 0.0f, i5, i4);
                    }
                    canvas2.drawPath(this.mPath, this.mFillPaint);
                }
            }
            float[] fArr2 = this.mPoints;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.mPaintKeyframes);
                float[] fArr3 = this.mPoints;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.mPaintKeyframes);
            }
        }

        private void drawTranslation(Canvas canvas, float f, float f2, float f3, float f4) {
            canvas.drawRect(f, f2, f3, f4, this.mPaintGraph);
            canvas.drawLine(f, f2, f3, f4, this.mPaintGraph);
        }

        public void draw(Canvas canvas, HashMap<View, MotionController> hashMap, int i2, int i3) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i3 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.mEndState) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.mTextPaint);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.mPaint);
                }
                for (MotionController next : hashMap.values()) {
                    int drawPath = next.getDrawPath();
                    if (i3 > 0 && drawPath == 0) {
                        drawPath = 1;
                    }
                    if (drawPath != 0) {
                        this.mKeyFrameCount = next.buildKeyFrames(this.mKeyFramePoints, this.mPathMode);
                        if (drawPath >= 1) {
                            int i4 = i2 / 16;
                            float[] fArr = this.mPoints;
                            if (fArr == null || fArr.length != i4 * 2) {
                                this.mPoints = new float[(i4 * 2)];
                                this.mPath = new Path();
                            }
                            int i5 = this.mShadowTranslate;
                            canvas.translate((float) i5, (float) i5);
                            this.mPaint.setColor(1996488704);
                            this.mFillPaint.setColor(1996488704);
                            this.mPaintKeyframes.setColor(1996488704);
                            this.mPaintGraph.setColor(1996488704);
                            next.buildPath(this.mPoints, i4);
                            drawAll(canvas, drawPath, this.mKeyFrameCount, next);
                            this.mPaint.setColor(-21965);
                            this.mPaintKeyframes.setColor(-2067046);
                            this.mFillPaint.setColor(-2067046);
                            this.mPaintGraph.setColor(-13391360);
                            int i6 = this.mShadowTranslate;
                            canvas.translate((float) (-i6), (float) (-i6));
                            drawAll(canvas, drawPath, this.mKeyFrameCount, next);
                            if (drawPath == 5) {
                                drawRectangle(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void drawAll(Canvas canvas, int i2, int i3, MotionController motionController) {
            if (i2 == 4) {
                drawPathAsConfigured(canvas);
            }
            if (i2 == 2) {
                drawPathRelative(canvas);
            }
            if (i2 == 3) {
                drawPathCartesian(canvas);
            }
            drawBasicPath(canvas);
            drawTicks(canvas, i2, i3, motionController);
        }

        public void getTextBounds(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.mBounds);
        }
    }

    public class Model {
        public ConstraintSet mEnd = null;
        public int mEndId;
        public ConstraintWidgetContainer mLayoutEnd = new ConstraintWidgetContainer();
        public ConstraintWidgetContainer mLayoutStart = new ConstraintWidgetContainer();
        public ConstraintSet mStart = null;
        public int mStartId;

        public Model() {
        }

        private void debugLayout(String str, ConstraintWidgetContainer constraintWidgetContainer) {
            StringBuilder B = a.B(str, " ");
            B.append(Debug.getName((View) constraintWidgetContainer.getCompanionWidget()));
            String sb = B.toString();
            Log.v(MotionLayout.TAG, sb + "  ========= " + constraintWidgetContainer);
            int size = constraintWidgetContainer.getChildren().size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = sb + "[" + i2 + "] ";
                ConstraintWidget constraintWidget = constraintWidgetContainer.getChildren().get(i2);
                StringBuilder y = a.y("");
                String str3 = "_";
                y.append(constraintWidget.mTop.mTarget != null ? ExifInterface.GPS_DIRECTION_TRUE : str3);
                StringBuilder y2 = a.y(y.toString());
                y2.append(constraintWidget.mBottom.mTarget != null ? "B" : str3);
                StringBuilder y3 = a.y(y2.toString());
                y3.append(constraintWidget.mLeft.mTarget != null ? "L" : str3);
                StringBuilder y4 = a.y(y3.toString());
                if (constraintWidget.mRight.mTarget != null) {
                    str3 = "R";
                }
                y4.append(str3);
                String sb2 = y4.toString();
                View view = (View) constraintWidget.getCompanionWidget();
                String name = Debug.getName(view);
                if (view instanceof TextView) {
                    StringBuilder B2 = a.B(name, "(");
                    B2.append(((TextView) view).getText());
                    B2.append(")");
                    name = B2.toString();
                }
                Log.v(MotionLayout.TAG, str2 + "  " + name + " " + constraintWidget + " " + sb2);
            }
            Log.v(MotionLayout.TAG, sb + " done. ");
        }

        private void debugLayoutParam(String str, ConstraintLayout.LayoutParams layoutParams) {
            StringBuilder y = a.y(" ");
            y.append(layoutParams.startToStart != -1 ? "SS" : "__");
            StringBuilder y2 = a.y(y.toString());
            String str2 = "|__";
            y2.append(layoutParams.startToEnd != -1 ? "|SE" : str2);
            StringBuilder y3 = a.y(y2.toString());
            y3.append(layoutParams.endToStart != -1 ? "|ES" : str2);
            StringBuilder y4 = a.y(y3.toString());
            y4.append(layoutParams.endToEnd != -1 ? "|EE" : str2);
            StringBuilder y5 = a.y(y4.toString());
            y5.append(layoutParams.leftToLeft != -1 ? "|LL" : str2);
            StringBuilder y6 = a.y(y5.toString());
            y6.append(layoutParams.leftToRight != -1 ? "|LR" : str2);
            StringBuilder y7 = a.y(y6.toString());
            y7.append(layoutParams.rightToLeft != -1 ? "|RL" : str2);
            StringBuilder y8 = a.y(y7.toString());
            y8.append(layoutParams.rightToRight != -1 ? "|RR" : str2);
            StringBuilder y9 = a.y(y8.toString());
            y9.append(layoutParams.topToTop != -1 ? "|TT" : str2);
            StringBuilder y10 = a.y(y9.toString());
            y10.append(layoutParams.topToBottom != -1 ? "|TB" : str2);
            StringBuilder y11 = a.y(y10.toString());
            y11.append(layoutParams.bottomToTop != -1 ? "|BT" : str2);
            StringBuilder y12 = a.y(y11.toString());
            if (layoutParams.bottomToBottom != -1) {
                str2 = "|BB";
            }
            y12.append(str2);
            String sb = y12.toString();
            Log.v(MotionLayout.TAG, str + sb);
        }

        private void debugWidget(String str, ConstraintWidget constraintWidget) {
            String str2;
            String str3;
            String str4;
            StringBuilder y = a.y(" ");
            String str5 = "B";
            String str6 = "__";
            if (constraintWidget.mTop.mTarget != null) {
                StringBuilder y2 = a.y(ExifInterface.GPS_DIRECTION_TRUE);
                y2.append(constraintWidget.mTop.mTarget.mType == ConstraintAnchor.Type.TOP ? ExifInterface.GPS_DIRECTION_TRUE : str5);
                str2 = y2.toString();
            } else {
                str2 = str6;
            }
            y.append(str2);
            StringBuilder y3 = a.y(y.toString());
            if (constraintWidget.mBottom.mTarget != null) {
                StringBuilder y4 = a.y(str5);
                if (constraintWidget.mBottom.mTarget.mType == ConstraintAnchor.Type.TOP) {
                    str5 = ExifInterface.GPS_DIRECTION_TRUE;
                }
                y4.append(str5);
                str3 = y4.toString();
            } else {
                str3 = str6;
            }
            y3.append(str3);
            StringBuilder y5 = a.y(y3.toString());
            String str7 = "R";
            if (constraintWidget.mLeft.mTarget != null) {
                StringBuilder y6 = a.y("L");
                y6.append(constraintWidget.mLeft.mTarget.mType == ConstraintAnchor.Type.LEFT ? "L" : str7);
                str4 = y6.toString();
            } else {
                str4 = str6;
            }
            y5.append(str4);
            StringBuilder y7 = a.y(y5.toString());
            if (constraintWidget.mRight.mTarget != null) {
                StringBuilder y8 = a.y(str7);
                if (constraintWidget.mRight.mTarget.mType == ConstraintAnchor.Type.LEFT) {
                    str7 = "L";
                }
                y8.append(str7);
                str6 = y8.toString();
            }
            y7.append(str6);
            String sb = y7.toString();
            Log.v(MotionLayout.TAG, str + sb + " ---  " + constraintWidget);
        }

        private void setupConstraintWidget(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            sparseArray.put(MotionLayout.this.getId(), constraintWidgetContainer);
            Iterator<ConstraintWidget> it = constraintWidgetContainer.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                sparseArray.put(((View) next.getCompanionWidget()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = constraintWidgetContainer.getChildren().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.getCompanionWidget();
                constraintSet.applyToLayoutParams(view.getId(), layoutParams);
                next2.setWidth(constraintSet.getWidth(view.getId()));
                next2.setHeight(constraintSet.getHeight(view.getId()));
                if (view instanceof ConstraintHelper) {
                    constraintSet.applyToHelper((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).validateParams();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                next2.setVisibility(constraintSet.getVisibilityMode(view.getId()) == 1 ? view.getVisibility() : constraintSet.getVisibility(view.getId()));
            }
            Iterator<ConstraintWidget> it3 = constraintWidgetContainer.getChildren().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof VirtualLayout) {
                    Helper helper = (Helper) next3;
                    ((ConstraintHelper) next3.getCompanionWidget()).updatePreLayout(constraintWidgetContainer, helper, sparseArray);
                    ((VirtualLayout) helper).captureWidgets();
                }
            }
        }

        public void build() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.mFrameArrayList.clear();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = MotionLayout.this.getChildAt(i2);
                MotionLayout.this.mFrameArrayList.put(childAt, new MotionController(childAt));
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = MotionLayout.this.getChildAt(i3);
                MotionController motionController = MotionLayout.this.mFrameArrayList.get(childAt2);
                if (motionController != null) {
                    if (this.mStart != null) {
                        ConstraintWidget widget = getWidget(this.mLayoutStart, childAt2);
                        if (widget != null) {
                            motionController.setStartState(widget, this.mStart);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            Log.e(MotionLayout.TAG, Debug.getLocation() + "no widget for  " + Debug.getName(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.mEnd != null) {
                        ConstraintWidget widget2 = getWidget(this.mLayoutEnd, childAt2);
                        if (widget2 != null) {
                            motionController.setEndState(widget2, this.mEnd);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            Log.e(MotionLayout.TAG, Debug.getLocation() + "no widget for  " + Debug.getName(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
        }

        public void copy(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            HashMap hashMap = new HashMap();
            hashMap.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.getChildren().clear();
            constraintWidgetContainer2.copy(constraintWidgetContainer, hashMap);
            Iterator<ConstraintWidget> it = children.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                ConstraintWidget barrier = next instanceof androidx.constraintlayout.solver.widgets.Barrier ? new androidx.constraintlayout.solver.widgets.Barrier() : next instanceof Guideline ? new Guideline() : next instanceof Flow ? new Flow() : next instanceof Helper ? new HelperWidget() : new ConstraintWidget();
                constraintWidgetContainer2.add(barrier);
                hashMap.put(next, barrier);
            }
            Iterator<ConstraintWidget> it2 = children.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                ((ConstraintWidget) hashMap.get(next2)).copy(next2, hashMap);
            }
        }

        public ConstraintWidget getWidget(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            if (constraintWidgetContainer.getCompanionWidget() == view) {
                return constraintWidgetContainer;
            }
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            int size = children.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget = children.get(i2);
                if (constraintWidget.getCompanionWidget() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public void initFrom(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
            this.mStart = constraintSet;
            this.mEnd = constraintSet2;
            this.mLayoutStart = new ConstraintWidgetContainer();
            this.mLayoutEnd = new ConstraintWidgetContainer();
            this.mLayoutStart.setMeasurer(MotionLayout.this.mLayoutWidget.getMeasurer());
            this.mLayoutEnd.setMeasurer(MotionLayout.this.mLayoutWidget.getMeasurer());
            this.mLayoutStart.removeAllChildren();
            this.mLayoutEnd.removeAllChildren();
            copy(MotionLayout.this.mLayoutWidget, this.mLayoutStart);
            copy(MotionLayout.this.mLayoutWidget, this.mLayoutEnd);
            if (((double) MotionLayout.this.mTransitionLastPosition) > 0.5d) {
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
            } else {
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
            }
            this.mLayoutStart.setRtl(MotionLayout.this.isRtl());
            this.mLayoutStart.updateHierarchy();
            this.mLayoutEnd.setRtl(MotionLayout.this.isRtl());
            this.mLayoutEnd.updateHierarchy();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer2.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    this.mLayoutEnd.setHorizontalDimensionBehaviour(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutStart;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer3.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    this.mLayoutEnd.setVerticalDimensionBehaviour(dimensionBehaviour2);
                }
            }
        }

        public boolean isNotConfiguredWith(int i2, int i3) {
            return (i2 == this.mStartId && i3 == this.mEndId) ? false : true;
        }

        public void measure(int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.mWidthMeasureMode = mode;
            motionLayout.mHeightMeasureMode = mode2;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            MotionLayout motionLayout2 = MotionLayout.this;
            if (motionLayout2.mCurrentState == motionLayout2.getStartState()) {
                MotionLayout.this.resolveSystem(this.mLayoutEnd, optimizationLevel, i2, i3);
                if (this.mStart != null) {
                    MotionLayout.this.resolveSystem(this.mLayoutStart, optimizationLevel, i2, i3);
                }
            } else {
                if (this.mStart != null) {
                    MotionLayout.this.resolveSystem(this.mLayoutStart, optimizationLevel, i2, i3);
                }
                MotionLayout.this.resolveSystem(this.mLayoutEnd, optimizationLevel, i2, i3);
            }
            boolean z = false;
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout motionLayout3 = MotionLayout.this;
                motionLayout3.mWidthMeasureMode = mode;
                motionLayout3.mHeightMeasureMode = mode2;
                if (motionLayout3.mCurrentState == motionLayout3.getStartState()) {
                    MotionLayout.this.resolveSystem(this.mLayoutEnd, optimizationLevel, i2, i3);
                    if (this.mStart != null) {
                        MotionLayout.this.resolveSystem(this.mLayoutStart, optimizationLevel, i2, i3);
                    }
                } else {
                    if (this.mStart != null) {
                        MotionLayout.this.resolveSystem(this.mLayoutStart, optimizationLevel, i2, i3);
                    }
                    MotionLayout.this.resolveSystem(this.mLayoutEnd, optimizationLevel, i2, i3);
                }
                MotionLayout.this.mStartWrapWidth = this.mLayoutStart.getWidth();
                MotionLayout.this.mStartWrapHeight = this.mLayoutStart.getHeight();
                MotionLayout.this.mEndWrapWidth = this.mLayoutEnd.getWidth();
                MotionLayout.this.mEndWrapHeight = this.mLayoutEnd.getHeight();
                MotionLayout motionLayout4 = MotionLayout.this;
                motionLayout4.mMeasureDuringTransition = (motionLayout4.mStartWrapWidth == motionLayout4.mEndWrapWidth && motionLayout4.mStartWrapHeight == motionLayout4.mEndWrapHeight) ? false : true;
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            int i4 = motionLayout5.mStartWrapWidth;
            int i5 = motionLayout5.mStartWrapHeight;
            int i6 = motionLayout5.mWidthMeasureMode;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((motionLayout5.mPostInterpolationPosition * ((float) (motionLayout5.mEndWrapWidth - i4))) + ((float) i4));
            }
            int i7 = motionLayout5.mHeightMeasureMode;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i5 = (int) ((motionLayout5.mPostInterpolationPosition * ((float) (motionLayout5.mEndWrapHeight - i5))) + ((float) i5));
            }
            boolean z2 = this.mLayoutStart.isWidthMeasuredTooSmall() || this.mLayoutEnd.isWidthMeasuredTooSmall();
            if (this.mLayoutStart.isHeightMeasuredTooSmall() || this.mLayoutEnd.isHeightMeasuredTooSmall()) {
                z = true;
            }
            MotionLayout.this.resolveMeasuredDimension(i2, i3, i4, i5, z2, z);
        }

        public void reEvaluateState() {
            measure(MotionLayout.this.mLastWidthMeasureSpec, MotionLayout.this.mLastHeightMeasureSpec);
            MotionLayout.this.setupMotionViews();
        }

        public void setMeasuredId(int i2, int i3) {
            this.mStartId = i2;
            this.mEndId = i3;
        }
    }

    public interface MotionTracker {
        void addMovement(MotionEvent motionEvent);

        void clear();

        void computeCurrentVelocity(int i2);

        void computeCurrentVelocity(int i2, float f);

        float getXVelocity();

        float getXVelocity(int i2);

        float getYVelocity();

        float getYVelocity(int i2);

        void recycle();
    }

    public static class MyTracker implements MotionTracker {
        private static MyTracker me = new MyTracker();
        public VelocityTracker tracker;

        private MyTracker() {
        }

        public static MyTracker obtain() {
            me.tracker = VelocityTracker.obtain();
            return me;
        }

        public void addMovement(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        public void clear() {
            this.tracker.clear();
        }

        public void computeCurrentVelocity(int i2) {
            this.tracker.computeCurrentVelocity(i2);
        }

        public void computeCurrentVelocity(int i2, float f) {
            this.tracker.computeCurrentVelocity(i2, f);
        }

        public float getXVelocity() {
            return this.tracker.getXVelocity();
        }

        public float getXVelocity(int i2) {
            return this.tracker.getXVelocity(i2);
        }

        public float getYVelocity() {
            return this.tracker.getYVelocity();
        }

        public float getYVelocity(int i2) {
            return getYVelocity(i2);
        }

        public void recycle() {
            this.tracker.recycle();
            this.tracker = null;
        }
    }

    public class StateCache {
        public final String KeyEndState = "motion.EndState";
        public final String KeyProgress = "motion.progress";
        public final String KeyStartState = "motion.StartState";
        public final String KeyVelocity = "motion.velocity";
        public int endState = -1;
        public float mProgress = Float.NaN;
        public float mVelocity = Float.NaN;
        public int startState = -1;

        public StateCache() {
        }

        public void apply() {
            int i2 = this.startState;
            if (!(i2 == -1 && this.endState == -1)) {
                if (i2 == -1) {
                    MotionLayout.this.transitionToState(this.endState);
                } else {
                    int i3 = this.endState;
                    if (i3 == -1) {
                        MotionLayout.this.setState(i2, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i2, i3);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.mVelocity)) {
                MotionLayout.this.setProgress(this.mProgress, this.mVelocity);
                this.mProgress = Float.NaN;
                this.mVelocity = Float.NaN;
                this.startState = -1;
                this.endState = -1;
            } else if (!Float.isNaN(this.mProgress)) {
                MotionLayout.this.setProgress(this.mProgress);
            }
        }

        public Bundle getTransitionState() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.mProgress);
            bundle.putFloat("motion.velocity", this.mVelocity);
            bundle.putInt("motion.StartState", this.startState);
            bundle.putInt("motion.EndState", this.endState);
            return bundle;
        }

        public void recordState() {
            this.endState = MotionLayout.this.mEndState;
            this.startState = MotionLayout.this.mBeginState;
            this.mVelocity = MotionLayout.this.getVelocity();
            this.mProgress = MotionLayout.this.getProgress();
        }

        public void setEndState(int i2) {
            this.endState = i2;
        }

        public void setProgress(float f) {
            this.mProgress = f;
        }

        public void setStartState(int i2) {
            this.startState = i2;
        }

        public void setTransitionState(Bundle bundle) {
            this.mProgress = bundle.getFloat("motion.progress");
            this.mVelocity = bundle.getFloat("motion.velocity");
            this.startState = bundle.getInt("motion.StartState");
            this.endState = bundle.getInt("motion.EndState");
        }

        public void setVelocity(float f) {
            this.mVelocity = f;
        }
    }

    public interface TransitionListener {
        void onTransitionChange(MotionLayout motionLayout, int i2, int i3, float f);

        void onTransitionCompleted(MotionLayout motionLayout, int i2);

        void onTransitionStarted(MotionLayout motionLayout, int i2, int i3);

        void onTransitionTrigger(MotionLayout motionLayout, int i2, boolean z, float f);
    }

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        init((AttributeSet) null);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(attributeSet);
    }

    private void checkStructure() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int startId = motionScene.getStartId();
        MotionScene motionScene2 = this.mScene;
        checkStructure(startId, motionScene2.getConstraintSet(motionScene2.getStartId()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<MotionScene.Transition> it = this.mScene.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            MotionScene.Transition next = it.next();
            if (next == this.mScene.mCurrentTransition) {
                Log.v(TAG, "CHECK: CURRENT");
            }
            checkStructure(next);
            int startConstraintSetId = next.getStartConstraintSetId();
            int endConstraintSetId = next.getEndConstraintSetId();
            String name = Debug.getName(getContext(), startConstraintSetId);
            String name2 = Debug.getName(getContext(), endConstraintSetId);
            if (sparseIntArray.get(startConstraintSetId) == endConstraintSetId) {
                Log.e(TAG, "CHECK: two transitions with the same start and end " + name + "->" + name2);
            }
            if (sparseIntArray2.get(endConstraintSetId) == startConstraintSetId) {
                Log.e(TAG, "CHECK: you can't have reverse transitions" + name + "->" + name2);
            }
            sparseIntArray.put(startConstraintSetId, endConstraintSetId);
            sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
            if (this.mScene.getConstraintSet(startConstraintSetId) == null) {
                Log.e(TAG, " no such constraintSetStart " + name);
            }
            if (this.mScene.getConstraintSet(endConstraintSetId) == null) {
                Log.e(TAG, " no such constraintSetEnd " + name);
            }
        }
    }

    private void checkStructure(int i2, ConstraintSet constraintSet) {
        String name = Debug.getName(getContext(), i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            if (id == -1) {
                StringBuilder C = a.C("CHECK: ", name, " ALL VIEWS SHOULD HAVE ID's ");
                C.append(childAt.getClass().getName());
                C.append(" does not!");
                Log.w(TAG, C.toString());
            }
            if (constraintSet.getConstraint(id) == null) {
                StringBuilder C2 = a.C("CHECK: ", name, " NO CONSTRAINTS for ");
                C2.append(Debug.getName(childAt));
                Log.w(TAG, C2.toString());
            }
        }
        int[] knownIds = constraintSet.getKnownIds();
        for (int i4 = 0; i4 < knownIds.length; i4++) {
            int i5 = knownIds[i4];
            String name2 = Debug.getName(getContext(), i5);
            if (findViewById(knownIds[i4]) == null) {
                Log.w(TAG, "CHECK: " + name + " NO View matches id " + name2);
            }
            if (constraintSet.getHeight(i5) == -1) {
                Log.w(TAG, "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
            if (constraintSet.getWidth(i5) == -1) {
                Log.w(TAG, "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void checkStructure(MotionScene.Transition transition) {
        StringBuilder y = a.y("CHECK: transition = ");
        y.append(transition.debugString(getContext()));
        Log.v(TAG, y.toString());
        Log.v(TAG, "CHECK: transition.setDuration = " + transition.getDuration());
        if (transition.getStartConstraintSetId() == transition.getEndConstraintSetId()) {
            Log.e(TAG, "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void computeCurrentPositions() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.setStartCurrentState(childAt);
            }
        }
    }

    private void debugPos() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            StringBuilder y = a.y(" ");
            y.append(Debug.getLocation());
            y.append(" ");
            y.append(Debug.getName(this));
            y.append(" ");
            y.append(Debug.getName(getContext(), this.mCurrentState));
            y.append(" ");
            y.append(Debug.getName(childAt));
            y.append(childAt.getLeft());
            y.append(" ");
            y.append(childAt.getTop());
            Log.v(TAG, y.toString());
        }
    }

    private void evaluateLayout() {
        boolean z;
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.mInterpolator;
        float f = this.mTransitionLastPosition + (!(interpolator instanceof StopLogic) ? ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f);
        if (this.mTransitionInstantly) {
            f = this.mTransitionGoalPosition;
        }
        int i2 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i2 <= 0 || f < this.mTransitionGoalPosition) && (signum > 0.0f || f > this.mTransitionGoalPosition)) {
            z = false;
        } else {
            f = this.mTransitionGoalPosition;
            z = true;
        }
        if (interpolator != null && !z) {
            f = this.mTemporalInterpolator ? interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f) : interpolator.getInterpolation(f);
        }
        if ((i2 > 0 && f >= this.mTransitionGoalPosition) || (signum <= 0.0f && f <= this.mTransitionGoalPosition)) {
            f = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.interpolate(childAt, f, nanoTime2, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    private void fireTransitionChange() {
        ArrayList<TransitionListener> arrayList;
        if ((this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) && this.mListenerPosition != this.mTransitionPosition) {
            if (this.mListenerState != -1) {
                TransitionListener transitionListener = this.mTransitionListener;
                if (transitionListener != null) {
                    transitionListener.onTransitionStarted(this, this.mBeginState, this.mEndState);
                }
                ArrayList<TransitionListener> arrayList2 = this.mTransitionListeners;
                if (arrayList2 != null) {
                    Iterator<TransitionListener> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
                    }
                }
                this.mIsAnimating = true;
            }
            this.mListenerState = -1;
            float f = this.mTransitionPosition;
            this.mListenerPosition = f;
            TransitionListener transitionListener2 = this.mTransitionListener;
            if (transitionListener2 != null) {
                transitionListener2.onTransitionChange(this, this.mBeginState, this.mEndState, f);
            }
            ArrayList<TransitionListener> arrayList3 = this.mTransitionListeners;
            if (arrayList3 != null) {
                Iterator<TransitionListener> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
                }
            }
            this.mIsAnimating = true;
        }
    }

    private void fireTransitionStarted(MotionLayout motionLayout, int i2, int i3) {
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionStarted(this, i2, i3);
        }
        ArrayList<TransitionListener> arrayList = this.mTransitionListeners;
        if (arrayList != null) {
            Iterator<TransitionListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionStarted(motionLayout, i2, i3);
            }
        }
    }

    private boolean handlesTouchEvent(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (handlesTouchEvent(((float) view.getLeft()) + f, ((float) view.getTop()) + f2, viewGroup.getChildAt(i2), motionEvent)) {
                    return true;
                }
            }
        }
        this.mBoundsCheck.set(((float) view.getLeft()) + f, ((float) view.getTop()) + f2, f + ((float) view.getRight()), f2 + ((float) view.getBottom()));
        if (motionEvent.getAction() == 0) {
            return this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent);
        }
        if (view.onTouchEvent(motionEvent)) {
            return true;
        }
    }

    private void init(AttributeSet attributeSet) {
        MotionScene motionScene;
        int i2;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.mScene = new MotionScene(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else {
                    if (index == R.styleable.MotionLayout_showPaths) {
                        if (this.mDebugPath == 0) {
                            i2 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                        }
                    } else if (index == R.styleable.MotionLayout_motionDebug) {
                        i2 = obtainStyledAttributes.getInt(index, 0);
                    }
                    this.mDebugPath = i2;
                }
            }
            obtainStyledAttributes.recycle();
            if (this.mScene == null) {
                Log.e(TAG, "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            checkStructure();
        }
        if (this.mCurrentState == -1 && (motionScene = this.mScene) != null) {
            this.mCurrentState = motionScene.getStartId();
            this.mBeginState = this.mScene.getStartId();
            this.mEndState = this.mScene.getEndId();
        }
    }

    private void processTransitionCompleted() {
        ArrayList<TransitionListener> arrayList;
        if (this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) {
            this.mIsAnimating = false;
            Iterator<Integer> it = this.mTransitionCompleted.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                TransitionListener transitionListener = this.mTransitionListener;
                if (transitionListener != null) {
                    transitionListener.onTransitionCompleted(this, next.intValue());
                }
                ArrayList<TransitionListener> arrayList2 = this.mTransitionListeners;
                if (arrayList2 != null) {
                    Iterator<TransitionListener> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onTransitionCompleted(this, next.intValue());
                    }
                }
            }
            this.mTransitionCompleted.clear();
        }
    }

    /* access modifiers changed from: private */
    public void setupMotionViews() {
        int childCount = getChildCount();
        this.mModel.build();
        boolean z = true;
        this.mInTransition = true;
        int width = getWidth();
        int height = getHeight();
        int gatPathMotionArc = this.mScene.gatPathMotionArc();
        int i2 = 0;
        if (gatPathMotionArc != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                MotionController motionController = this.mFrameArrayList.get(getChildAt(i3));
                if (motionController != null) {
                    motionController.setPathMotionArc(gatPathMotionArc);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i4));
            if (motionController2 != null) {
                this.mScene.getKeyFrames(motionController2);
                motionController2.setup(width, height, this.mTransitionDuration, getNanoTime());
            }
        }
        float staggered = this.mScene.getStaggered();
        if (staggered != 0.0f) {
            boolean z2 = ((double) staggered) < ShadowDrawableWrapper.COS_45;
            float abs = Math.abs(staggered);
            float f = -3.4028235E38f;
            float f2 = Float.MAX_VALUE;
            float f3 = -3.4028235E38f;
            float f4 = Float.MAX_VALUE;
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    z = false;
                    break;
                }
                MotionController motionController3 = this.mFrameArrayList.get(getChildAt(i5));
                if (!Float.isNaN(motionController3.mMotionStagger)) {
                    break;
                }
                float finalX = motionController3.getFinalX();
                float finalY = motionController3.getFinalY();
                float f5 = z2 ? finalY - finalX : finalY + finalX;
                f4 = Math.min(f4, f5);
                f3 = Math.max(f3, f5);
                i5++;
            }
            if (z) {
                for (int i6 = 0; i6 < childCount; i6++) {
                    MotionController motionController4 = this.mFrameArrayList.get(getChildAt(i6));
                    if (!Float.isNaN(motionController4.mMotionStagger)) {
                        f2 = Math.min(f2, motionController4.mMotionStagger);
                        f = Math.max(f, motionController4.mMotionStagger);
                    }
                }
                while (i2 < childCount) {
                    MotionController motionController5 = this.mFrameArrayList.get(getChildAt(i2));
                    if (!Float.isNaN(motionController5.mMotionStagger)) {
                        motionController5.mStaggerScale = 1.0f / (1.0f - abs);
                        float f6 = motionController5.mMotionStagger;
                        motionController5.mStaggerOffset = abs - (z2 ? ((f - f6) / (f - f2)) * abs : ((f6 - f2) * abs) / (f - f2));
                    }
                    i2++;
                }
                return;
            }
            while (i2 < childCount) {
                MotionController motionController6 = this.mFrameArrayList.get(getChildAt(i2));
                float finalX2 = motionController6.getFinalX();
                float finalY2 = motionController6.getFinalY();
                float f7 = z2 ? finalY2 - finalX2 : finalY2 + finalX2;
                motionController6.mStaggerScale = 1.0f / (1.0f - abs);
                motionController6.mStaggerOffset = abs - (((f7 - f4) * abs) / (f3 - f4));
                i2++;
            }
        }
    }

    private static boolean willJump(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return ((f * f4) - (((f3 * f4) * f4) / 2.0f)) + f2 > 1.0f;
        }
        float f5 = (-f) / f3;
        return ((((f3 * f5) * f5) / 2.0f) + (f * f5)) + f2 < 0.0f;
    }

    public void addTransitionListener(TransitionListener transitionListener) {
        if (this.mTransitionListeners == null) {
            this.mTransitionListeners = new ArrayList<>();
        }
        this.mTransitionListeners.add(transitionListener);
    }

    public void animateTo(float f) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            float f2 = this.mTransitionLastPosition;
            float f3 = this.mTransitionPosition;
            if (f2 != f3 && this.mTransitionInstantly) {
                this.mTransitionLastPosition = f3;
            }
            float f4 = this.mTransitionLastPosition;
            if (f4 != f) {
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = f;
                this.mTransitionDuration = ((float) motionScene.getDuration()) / 1000.0f;
                setProgress(this.mTransitionGoalPosition);
                this.mInterpolator = this.mScene.getInterpolator();
                this.mTransitionInstantly = false;
                this.mAnimationStartTime = getNanoTime();
                this.mInTransition = true;
                this.mTransitionPosition = f4;
                this.mTransitionLastPosition = f4;
                invalidate();
            }
        }
    }

    public void disableAutoTransition(boolean z) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.disableAutoTransition(z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            r0 = 0
            r9.evaluate(r0)
            super.dispatchDraw(r10)
            androidx.constraintlayout.motion.widget.MotionScene r1 = r9.mScene
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            int r1 = r9.mDebugPath
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L_0x00cc
            boolean r1 = r9.isInEditMode()
            if (r1 != 0) goto L_0x00cc
            int r1 = r9.mFrames
            int r1 = r1 + r2
            r9.mFrames = r1
            long r3 = r9.getNanoTime()
            long r5 = r9.mLastDrawTime
            r7 = -1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0045
            long r5 = r3 - r5
            r7 = 200000000(0xbebc200, double:9.8813129E-316)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0047
            int r1 = r9.mFrames
            float r1 = (float) r1
            float r5 = (float) r5
            r6 = 814313567(0x3089705f, float:1.0E-9)
            float r5 = r5 * r6
            float r1 = r1 / r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r5
            int r1 = (int) r1
            float r1 = (float) r1
            float r1 = r1 / r5
            r9.mLastFps = r1
            r9.mFrames = r0
        L_0x0045:
            r9.mLastDrawTime = r3
        L_0x0047:
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = 1109917696(0x42280000, float:42.0)
            r0.setTextSize(r1)
            float r1 = r9.getProgress()
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            float r1 = (float) r1
            r3 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            float r5 = r9.mLastFps
            r4.append(r5)
            java.lang.String r5 = " fps "
            r4.append(r5)
            int r5 = r9.mBeginState
            java.lang.String r5 = androidx.constraintlayout.motion.widget.Debug.getState(r9, r5)
            r4.append(r5)
            java.lang.String r5 = " -> "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
            int r5 = r9.mEndState
            java.lang.String r5 = androidx.constraintlayout.motion.widget.Debug.getState(r9, r5)
            r4.append(r5)
            java.lang.String r5 = " (progress: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " ) state="
            r4.append(r1)
            int r1 = r9.mCurrentState
            r5 = -1
            if (r1 != r5) goto L_0x00a0
            java.lang.String r1 = "undefined"
            goto L_0x00a4
        L_0x00a0:
            java.lang.String r1 = androidx.constraintlayout.motion.widget.Debug.getState(r9, r1)
        L_0x00a4:
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setColor(r4)
            r4 = 1093664768(0x41300000, float:11.0)
            int r5 = r9.getHeight()
            int r5 = r5 + -29
            float r5 = (float) r5
            r10.drawText(r1, r4, r5, r0)
            r4 = -7864184(0xffffffffff880088, float:NaN)
            r0.setColor(r4)
            int r4 = r9.getHeight()
            int r4 = r4 + -30
            float r4 = (float) r4
            r10.drawText(r1, r3, r4, r0)
        L_0x00cc:
            int r0 = r9.mDebugPath
            if (r0 <= r2) goto L_0x00ea
            androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw r0 = r9.mDevModeDraw
            if (r0 != 0) goto L_0x00db
            androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw r0 = new androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw
            r0.<init>()
            r9.mDevModeDraw = r0
        L_0x00db:
            androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw r0 = r9.mDevModeDraw
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r9.mFrameArrayList
            androidx.constraintlayout.motion.widget.MotionScene r2 = r9.mScene
            int r2 = r2.getDuration()
            int r3 = r9.mDebugPath
            r0.draw(r10, r1, r2, r3)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void enableTransition(int i2, boolean z) {
        boolean z2;
        MotionScene.Transition transition = getTransition(i2);
        if (z) {
            z2 = true;
        } else {
            MotionScene motionScene = this.mScene;
            if (transition == motionScene.mCurrentTransition) {
                Iterator<MotionScene.Transition> it = motionScene.getTransitionsWithState(this.mCurrentState).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MotionScene.Transition next = it.next();
                    if (next.isEnabled()) {
                        this.mScene.mCurrentTransition = next;
                        break;
                    }
                }
            }
            z2 = false;
        }
        transition.setEnable(z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0205, code lost:
        if (r1 != r2) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0215, code lost:
        if (r1 != r2) goto L_0x0209;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void evaluate(boolean r23) {
        /*
            r22 = this;
            r0 = r22
            long r1 = r0.mTransitionLastTime
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            long r1 = r22.getNanoTime()
            r0.mTransitionLastTime = r1
        L_0x0010:
            float r1 = r0.mTransitionLastPosition
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 <= 0) goto L_0x0020
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0020
            r0.mCurrentState = r4
        L_0x0020:
            boolean r3 = r0.mKeepAnimating
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x0032
            boolean r3 = r0.mInTransition
            if (r3 == 0) goto L_0x01f9
            if (r23 != 0) goto L_0x0032
            float r3 = r0.mTransitionGoalPosition
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01f9
        L_0x0032:
            float r3 = r0.mTransitionGoalPosition
            float r3 = r3 - r1
            float r1 = java.lang.Math.signum(r3)
            long r8 = r22.getNanoTime()
            android.view.animation.Interpolator r3 = r0.mInterpolator
            boolean r10 = r3 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0053
            long r12 = r0.mTransitionLastTime
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.mTransitionDuration
            float r10 = r10 / r12
            r0.mLastVelocity = r10
            goto L_0x0054
        L_0x0053:
            r10 = r2
        L_0x0054:
            float r12 = r0.mTransitionLastPosition
            float r12 = r12 + r10
            boolean r13 = r0.mTransitionInstantly
            if (r13 == 0) goto L_0x005d
            float r12 = r0.mTransitionGoalPosition
        L_0x005d:
            int r13 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0067
            float r14 = r0.mTransitionGoalPosition
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x0071
        L_0x0067:
            int r14 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
            float r14 = r0.mTransitionGoalPosition
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
        L_0x0071:
            float r12 = r0.mTransitionGoalPosition
            r0.mInTransition = r7
            r14 = r6
            goto L_0x0078
        L_0x0077:
            r14 = r7
        L_0x0078:
            r0.mTransitionLastPosition = r12
            r0.mTransitionPosition = r12
            r0.mTransitionLastTime = r8
            r15 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r3 == 0) goto L_0x00ec
            if (r14 != 0) goto L_0x00ec
            boolean r14 = r0.mTemporalInterpolator
            if (r14 == 0) goto L_0x00d0
            long r4 = r0.mAnimationStartTime
            long r4 = r8 - r4
            float r4 = (float) r4
            float r4 = r4 * r11
            float r3 = r3.getInterpolation(r4)
            r0.mTransitionLastPosition = r3
            r0.mTransitionLastTime = r8
            android.view.animation.Interpolator r4 = r0.mInterpolator
            boolean r5 = r4 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r5 == 0) goto L_0x00eb
            androidx.constraintlayout.motion.widget.MotionInterpolator r4 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r4
            float r4 = r4.getVelocity()
            r0.mLastVelocity = r4
            float r5 = java.lang.Math.abs(r4)
            float r8 = r0.mTransitionDuration
            float r5 = r5 * r8
            int r5 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r5 > 0) goto L_0x00b2
            r0.mInTransition = r7
        L_0x00b2:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c2
            r5 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x00c2
            r0.mTransitionLastPosition = r5
            r0.mInTransition = r7
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x00c2:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00eb
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x00eb
            r0.mTransitionLastPosition = r2
            r0.mInTransition = r7
            r12 = r2
            goto L_0x00ec
        L_0x00d0:
            float r3 = r3.getInterpolation(r12)
            android.view.animation.Interpolator r4 = r0.mInterpolator
            boolean r5 = r4 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r5 == 0) goto L_0x00e1
            androidx.constraintlayout.motion.widget.MotionInterpolator r4 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r4
            float r4 = r4.getVelocity()
            goto L_0x00e9
        L_0x00e1:
            float r12 = r12 + r10
            float r4 = r4.getInterpolation(r12)
            float r4 = r4 - r3
            float r4 = r4 * r1
            float r4 = r4 / r10
        L_0x00e9:
            r0.mLastVelocity = r4
        L_0x00eb:
            r12 = r3
        L_0x00ec:
            float r3 = r0.mLastVelocity
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fb
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r0.setState(r3)
        L_0x00fb:
            if (r13 <= 0) goto L_0x0103
            float r3 = r0.mTransitionGoalPosition
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x010d
        L_0x0103:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0111
            float r3 = r0.mTransitionGoalPosition
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0111
        L_0x010d:
            float r12 = r0.mTransitionGoalPosition
            r0.mInTransition = r7
        L_0x0111:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x011b
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0122
        L_0x011b:
            r0.mInTransition = r7
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
        L_0x0122:
            int r3 = r22.getChildCount()
            r0.mKeepAnimating = r7
            long r8 = r22.getNanoTime()
            r0.mPostInterpolationPosition = r12
            r5 = r7
        L_0x012f:
            if (r5 >= r3) goto L_0x0157
            android.view.View r10 = r0.getChildAt(r5)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r11 = r0.mFrameArrayList
            java.lang.Object r11 = r11.get(r10)
            r16 = r11
            androidx.constraintlayout.motion.widget.MotionController r16 = (androidx.constraintlayout.motion.widget.MotionController) r16
            if (r16 == 0) goto L_0x0154
            boolean r11 = r0.mKeepAnimating
            androidx.constraintlayout.motion.widget.KeyCache r15 = r0.mKeyCache
            r17 = r10
            r18 = r12
            r19 = r8
            r21 = r15
            boolean r10 = r16.interpolate(r17, r18, r19, r21)
            r10 = r10 | r11
            r0.mKeepAnimating = r10
        L_0x0154:
            int r5 = r5 + 1
            goto L_0x012f
        L_0x0157:
            if (r13 <= 0) goto L_0x015f
            float r3 = r0.mTransitionGoalPosition
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0169
        L_0x015f:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x016b
            float r3 = r0.mTransitionGoalPosition
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x016b
        L_0x0169:
            r3 = r6
            goto L_0x016c
        L_0x016b:
            r3 = r7
        L_0x016c:
            boolean r5 = r0.mKeepAnimating
            if (r5 != 0) goto L_0x017b
            boolean r5 = r0.mInTransition
            if (r5 != 0) goto L_0x017b
            if (r3 == 0) goto L_0x017b
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r5 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r5)
        L_0x017b:
            boolean r5 = r0.mMeasureDuringTransition
            if (r5 == 0) goto L_0x0182
            r22.requestLayout()
        L_0x0182:
            boolean r5 = r0.mKeepAnimating
            r3 = r3 ^ r6
            r3 = r3 | r5
            r0.mKeepAnimating = r3
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x01a6
            int r3 = r0.mBeginState
            r5 = -1
            if (r3 == r5) goto L_0x01a6
            int r5 = r0.mCurrentState
            if (r5 == r3) goto L_0x01a6
            r0.mCurrentState = r3
            androidx.constraintlayout.motion.widget.MotionScene r5 = r0.mScene
            androidx.constraintlayout.widget.ConstraintSet r3 = r5.getConstraintSet(r3)
            r3.applyCustomAttributes(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x01a6:
            double r8 = (double) r12
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x01c4
            int r3 = r0.mCurrentState
            int r5 = r0.mEndState
            if (r3 == r5) goto L_0x01c4
            r0.mCurrentState = r5
            androidx.constraintlayout.motion.widget.MotionScene r3 = r0.mScene
            androidx.constraintlayout.widget.ConstraintSet r3 = r3.getConstraintSet(r5)
            r3.applyCustomAttributes(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x01c4:
            boolean r3 = r0.mKeepAnimating
            if (r3 != 0) goto L_0x01df
            boolean r3 = r0.mInTransition
            if (r3 == 0) goto L_0x01cd
            goto L_0x01df
        L_0x01cd:
            if (r13 <= 0) goto L_0x01d1
            if (r4 == 0) goto L_0x01d9
        L_0x01d1:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x01e2
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x01e2
        L_0x01d9:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            goto L_0x01e2
        L_0x01df:
            r22.invalidate()
        L_0x01e2:
            boolean r3 = r0.mKeepAnimating
            if (r3 != 0) goto L_0x01ee
            boolean r3 = r0.mInTransition
            if (r3 == 0) goto L_0x01ee
            if (r13 <= 0) goto L_0x01ee
            if (r4 == 0) goto L_0x01f6
        L_0x01ee:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x01f9
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x01f9
        L_0x01f6:
            r22.onNewStateAttachHandlers()
        L_0x01f9:
            float r1 = r0.mTransitionLastPosition
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x020d
            int r1 = r0.mCurrentState
            int r2 = r0.mEndState
            if (r1 == r2) goto L_0x0208
            goto L_0x0209
        L_0x0208:
            r6 = r7
        L_0x0209:
            r0.mCurrentState = r2
            r7 = r6
            goto L_0x0218
        L_0x020d:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0218
            int r1 = r0.mCurrentState
            int r2 = r0.mBeginState
            if (r1 == r2) goto L_0x0208
            goto L_0x0209
        L_0x0218:
            boolean r1 = r0.mNeedsFireTransitionCompleted
            r1 = r1 | r7
            r0.mNeedsFireTransitionCompleted = r1
            if (r7 == 0) goto L_0x0226
            boolean r1 = r0.mInLayout
            if (r1 != 0) goto L_0x0226
            r22.requestLayout()
        L_0x0226:
            float r1 = r0.mTransitionLastPosition
            r0.mTransitionPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.evaluate(boolean):void");
    }

    public void fireTransitionCompleted() {
        int i2;
        ArrayList<TransitionListener> arrayList;
        if ((this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            if (!this.mTransitionCompleted.isEmpty()) {
                ArrayList<Integer> arrayList2 = this.mTransitionCompleted;
                i2 = arrayList2.get(arrayList2.size() - 1).intValue();
            } else {
                i2 = -1;
            }
            int i3 = this.mCurrentState;
            if (!(i2 == i3 || i3 == -1)) {
                this.mTransitionCompleted.add(Integer.valueOf(i3));
            }
        }
        processTransitionCompleted();
    }

    public void fireTrigger(int i2, boolean z, float f) {
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, i2, z, f);
        }
        ArrayList<TransitionListener> arrayList = this.mTransitionListeners;
        if (arrayList != null) {
            Iterator<TransitionListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i2, z, f);
            }
        }
    }

    public void getAnchorDpDt(int i2, float f, float f2, float f3, float[] fArr) {
        HashMap<View, MotionController> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i2);
        MotionController motionController = hashMap.get(viewById);
        if (motionController != null) {
            motionController.getDpDt(f, f2, f3, fArr);
            float y = viewById.getY();
            this.lastPos = f;
            this.lastY = y;
            return;
        }
        String g2 = viewById == null ? a.g("", i2) : viewById.getContext().getResources().getResourceName(i2);
        Log.w(TAG, "WARNING could not find view id " + g2);
    }

    public ConstraintSet getConstraintSet(int i2) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSet(i2);
    }

    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSetIds();
    }

    public String getConstraintSetNames(int i2) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.lookUpConstraintName(i2);
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public void getDebugMode(boolean z) {
        this.mDebugPath = z ? 2 : 1;
        invalidate();
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getDefinedTransitions();
    }

    public DesignTool getDesignTool() {
        if (this.mDesignTool == null) {
            this.mDesignTool = new DesignTool(this);
        }
        return this.mDesignTool;
    }

    public int getEndState() {
        return this.mEndState;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    public int getStartState() {
        return this.mBeginState;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public MotionScene.Transition getTransition(int i2) {
        return this.mScene.getTransitionById(i2);
    }

    public Bundle getTransitionState() {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.recordState();
        return this.mStateCache.getTransitionState();
    }

    public long getTransitionTimeMs() {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mTransitionDuration = ((float) motionScene.getDuration()) / 1000.0f;
        }
        return (long) (this.mTransitionDuration * 1000.0f);
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    public void getViewVelocity(View view, float f, float f2, float[] fArr, int i2) {
        float f3;
        float f4 = this.mLastVelocity;
        float f5 = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float signum = Math.signum(this.mTransitionGoalPosition - f5);
            float interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + EPSILON);
            float interpolation2 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            f4 = (((interpolation - interpolation2) / EPSILON) * signum) / this.mTransitionDuration;
            f3 = interpolation2;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof MotionInterpolator) {
            f4 = ((MotionInterpolator) interpolator).getVelocity();
        }
        MotionController motionController = this.mFrameArrayList.get(view);
        if ((i2 & 1) == 0) {
            motionController.getPostLayoutDvDp(f3, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            motionController.getDpDt(f3, f, f2, fArr);
        }
        if (i2 < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public boolean isInteractionEnabled() {
        return this.mInteractionEnabled;
    }

    public void loadLayoutDescription(int i2) {
        if (i2 != 0) {
            try {
                this.mScene = new MotionScene(getContext(), this, i2);
                if (isAttachedToWindow()) {
                    this.mScene.readFallback(this);
                    this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
                    rebuildScene();
                    this.mScene.setRtl(isRtl());
                }
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        } else {
            this.mScene = null;
        }
    }

    public int lookUpConstraintId(String str) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return 0;
        }
        return motionScene.lookUpConstraintId(str);
    }

    public MotionTracker obtainVelocityTracker() {
        return MyTracker.obtain();
    }

    public void onAttachedToWindow() {
        int i2;
        super.onAttachedToWindow();
        MotionScene motionScene = this.mScene;
        if (!(motionScene == null || (i2 = this.mCurrentState) == -1)) {
            ConstraintSet constraintSet = motionScene.getConstraintSet(i2);
            this.mScene.readFallback(this);
            if (constraintSet != null) {
                constraintSet.applyTo(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        StateCache stateCache = this.mStateCache;
        if (stateCache != null) {
            stateCache.apply();
        } else if (this.mScene.mCurrentTransition.getAutoTransition() == 4) {
            transitionToEnd();
            setState(TransitionState.SETUP);
            setState(TransitionState.MOVING);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        int touchRegionId;
        RectF touchRegion;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && this.mInteractionEnabled && (transition = motionScene.mCurrentTransition) != null && transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && ((motionEvent.getAction() != 0 || (touchRegion = touchResponse.getTouchRegion(this, new RectF())) == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY())) && (touchRegionId = touchResponse.getTouchRegionId()) != -1)) {
            View view = this.mRegionView;
            if (view == null || view.getId() != touchRegionId) {
                this.mRegionView = findViewById(touchRegionId);
            }
            View view2 = this.mRegionView;
            if (view2 != null) {
                this.mBoundsCheck.set((float) view2.getLeft(), (float) this.mRegionView.getTop(), (float) this.mRegionView.getRight(), (float) this.mRegionView.getBottom());
                if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && !handlesTouchEvent(0.0f, 0.0f, this.mRegionView, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z, i2, i3, i4, i5);
                return;
            }
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (!(this.mLastLayoutWidth == i6 && this.mLastLayoutHeight == i7)) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i6;
            this.mLastLayoutHeight = i7;
            this.mOldWidth = i6;
            this.mOldHeight = i7;
            this.mInLayout = false;
        } finally {
            this.mInLayout = false;
        }
    }

    public void onMeasure(int i2, int i3) {
        if (this.mScene == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z = false;
        boolean z2 = (this.mLastWidthMeasureSpec == i2 && this.mLastHeightMeasureSpec == i3) ? false : true;
        if (this.mNeedsFireTransitionCompleted) {
            this.mNeedsFireTransitionCompleted = false;
            onNewStateAttachHandlers();
            processTransitionCompleted();
            z2 = true;
        }
        if (this.mDirtyHierarchy) {
            z2 = true;
        }
        this.mLastWidthMeasureSpec = i2;
        this.mLastHeightMeasureSpec = i3;
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if ((z2 || this.mModel.isNotConfiguredWith(startId, endId)) && this.mBeginState != -1) {
            super.onMeasure(i2, i3);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(startId), this.mScene.getConstraintSet(endId));
            this.mModel.reEvaluateState();
            this.mModel.setMeasuredId(startId, endId);
        } else {
            z = true;
        }
        if (this.mMeasureDuringTransition || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int width = this.mLayoutWidget.getWidth() + getPaddingRight() + getPaddingLeft();
            int height = this.mLayoutWidget.getHeight() + paddingBottom;
            int i4 = this.mWidthMeasureMode;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.mStartWrapWidth;
                width = (int) ((this.mPostInterpolationPosition * ((float) (this.mEndWrapWidth - i5))) + ((float) i5));
                requestLayout();
            }
            int i6 = this.mHeightMeasureMode;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.mStartWrapHeight;
                height = (int) ((this.mPostInterpolationPosition * ((float) (this.mEndWrapHeight - i7))) + ((float) i7));
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        evaluateLayout();
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(final View view, int i2, int i3, int[] iArr, int i4) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        int touchRegionId;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (transition = motionScene.mCurrentTransition) != null && transition.isEnabled()) {
            MotionScene.Transition transition2 = this.mScene.mCurrentTransition;
            if (transition2 == null || !transition2.isEnabled() || (touchResponse = transition2.getTouchResponse()) == null || (touchRegionId = touchResponse.getTouchRegionId()) == -1 || view.getId() == touchRegionId) {
                MotionScene motionScene2 = this.mScene;
                if (motionScene2 != null && motionScene2.getMoveWhenScrollAtTop()) {
                    float f = this.mTransitionPosition;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
                if (!(transition2.getTouchResponse() == null || (this.mScene.mCurrentTransition.getTouchResponse().getFlags() & 1) == 0)) {
                    float progressDirection = this.mScene.getProgressDirection((float) i2, (float) i3);
                    float f2 = this.mTransitionLastPosition;
                    if ((f2 <= 0.0f && progressDirection < 0.0f) || (f2 >= 1.0f && progressDirection > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new Runnable() {
                            public void run() {
                                view.setNestedScrollingEnabled(true);
                            }
                        });
                        return;
                    }
                }
                float f3 = this.mTransitionPosition;
                long nanoTime = getNanoTime();
                float f4 = (float) i2;
                this.mScrollTargetDX = f4;
                float f5 = (float) i3;
                this.mScrollTargetDY = f5;
                this.mScrollTargetDT = (float) (((double) (nanoTime - this.mScrollTargetTime)) * 1.0E-9d);
                this.mScrollTargetTime = nanoTime;
                this.mScene.processScrollMove(f4, f5);
                if (f3 != this.mTransitionPosition) {
                    iArr[0] = i2;
                    iArr[1] = i3;
                }
                evaluate(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.mUndergoingMotion = true;
                }
            }
        }
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (!(!this.mUndergoingMotion && i2 == 0 && i3 == 0)) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.mUndergoingMotion = false;
    }

    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
    }

    public void onNewStateAttachHandlers() {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            if (motionScene.autoTransition(this, this.mCurrentState)) {
                requestLayout();
                return;
            }
            int i2 = this.mCurrentState;
            if (i2 != -1) {
                this.mScene.addOnClickListeners(this, i2);
            }
            if (this.mScene.supportTouch()) {
                this.mScene.setupTouch();
            }
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setRtl(isRtl());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.mCurrentTransition;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3, int r4) {
        /*
            r0 = this;
            androidx.constraintlayout.motion.widget.MotionScene r1 = r0.mScene
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r1.mCurrentTransition
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r1.getTouchResponse()
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.MotionScene r1 = r0.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r1.getTouchResponse()
            int r1 = r1.getFlags()
            r1 = r1 & 2
            if (r1 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 1
            return r1
        L_0x0021:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onStartNestedScroll(android.view.View, android.view.View, int, int):boolean");
    }

    public void onStopNestedScroll(View view, int i2) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            float f = this.mScrollTargetDX;
            float f2 = this.mScrollTargetDT;
            motionScene.processScrollUp(f / f2, this.mScrollTargetDY / f2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null || !this.mInteractionEnabled || !motionScene.supportTouch()) {
            return super.onTouchEvent(motionEvent);
        }
        MotionScene.Transition transition = this.mScene.mCurrentTransition;
        if (transition != null && !transition.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        this.mScene.processTouchEvent(motionEvent, getCurrentState(), this);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new ArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new ArrayList<>();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void parseLayoutDescription(int i2) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e(TAG, "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.mModel.reEvaluateState();
        invalidate();
    }

    public boolean removeTransitionListener(TransitionListener transitionListener) {
        ArrayList<TransitionListener> arrayList = this.mTransitionListeners;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(transitionListener);
    }

    public void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (this.mMeasureDuringTransition || this.mCurrentState != -1 || (motionScene = this.mScene) == null || (transition = motionScene.mCurrentTransition) == null || transition.getLayoutDuringTransition() != 0) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i2) {
        this.mDebugPath = i2;
        invalidate();
    }

    public void setInteractionEnabled(boolean z) {
        this.mInteractionEnabled = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolator = this.mScene.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mOnHideHelpers.get(i2).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mOnShowHelpers.get(i2).setProgress(f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r5.mTransitionLastPosition == 0.0f) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r5.mTransitionLastPosition == 1.0f) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProgress(float r6) {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto L_0x000b
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0012
        L_0x000b:
            java.lang.String r3 = "MotionLayout"
            java.lang.String r4 = "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"
            android.util.Log.w(r3, r4)
        L_0x0012:
            boolean r3 = r5.isAttachedToWindow()
            if (r3 != 0) goto L_0x0029
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r5.mStateCache
            if (r0 != 0) goto L_0x0023
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>()
            r5.mStateCache = r0
        L_0x0023:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r5.mStateCache
            r0.setProgress(r6)
            return
        L_0x0029:
            if (r1 > 0) goto L_0x0038
            int r1 = r5.mBeginState
            r5.mCurrentState = r1
            float r1 = r5.mTransitionLastPosition
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004f
        L_0x0035:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            goto L_0x004c
        L_0x0038:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0047
            int r0 = r5.mEndState
            r5.mCurrentState = r0
            float r0 = r5.mTransitionLastPosition
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x004f
            goto L_0x0035
        L_0x0047:
            r0 = -1
            r5.mCurrentState = r0
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
        L_0x004c:
            r5.setState(r0)
        L_0x004f:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r5.mScene
            if (r0 != 0) goto L_0x0054
            return
        L_0x0054:
            r0 = 1
            r5.mTransitionInstantly = r0
            r5.mTransitionGoalPosition = r6
            r5.mTransitionPosition = r6
            r1 = -1
            r5.mTransitionLastTime = r1
            r5.mAnimationStartTime = r1
            r6 = 0
            r5.mInterpolator = r6
            r5.mInTransition = r0
            r5.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.setProgress(float):void");
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setProgress(f);
            this.mStateCache.setVelocity(f2);
            return;
        }
        setProgress(f);
        setState(TransitionState.MOVING);
        this.mLastVelocity = f2;
        animateTo(1.0f);
    }

    public void setScene(MotionScene motionScene) {
        this.mScene = motionScene;
        motionScene.setRtl(isRtl());
        rebuildScene();
    }

    public void setState(int i2, int i3, int i4) {
        setState(TransitionState.SETUP);
        this.mCurrentState = i2;
        this.mBeginState = -1;
        this.mEndState = -1;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i2, (float) i3, (float) i4);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.getConstraintSet(i2).applyTo(this);
        }
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState != transitionState2 || this.mCurrentState != -1) {
            TransitionState transitionState3 = this.mTransitionState;
            this.mTransitionState = transitionState;
            TransitionState transitionState4 = TransitionState.MOVING;
            if (transitionState3 == transitionState4 && transitionState == transitionState4) {
                fireTransitionChange();
            }
            int ordinal = transitionState3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (transitionState == transitionState4) {
                    fireTransitionChange();
                }
                if (transitionState != transitionState2) {
                    return;
                }
            } else if (!(ordinal == 2 && transitionState == transitionState2)) {
                return;
            }
            fireTransitionCompleted();
        }
    }

    public void setTransition(int i2) {
        if (this.mScene != null) {
            MotionScene.Transition transition = getTransition(i2);
            this.mBeginState = transition.getStartConstraintSetId();
            this.mEndState = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new StateCache();
                }
                this.mStateCache.setStartState(this.mBeginState);
                this.mStateCache.setEndState(this.mEndState);
                return;
            }
            float f = Float.NaN;
            int i3 = this.mCurrentState;
            float f2 = 0.0f;
            if (i3 == this.mBeginState) {
                f = 0.0f;
            } else if (i3 == this.mEndState) {
                f = 1.0f;
            }
            this.mScene.setTransition(transition);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            rebuildScene();
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.mTransitionLastPosition = f2;
            if (Float.isNaN(f)) {
                Log.v(TAG, Debug.getLocation() + " transitionToStart ");
                transitionToStart();
                return;
            }
            setProgress(f);
        }
    }

    public void setTransition(int i2, int i3) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setStartState(i2);
            this.mStateCache.setEndState(i3);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mBeginState = i2;
            this.mEndState = i3;
            motionScene.setTransition(i2, i3);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(i2), this.mScene.getConstraintSet(i3));
            rebuildScene();
            this.mTransitionLastPosition = 0.0f;
            transitionToStart();
        }
    }

    public void setTransition(MotionScene.Transition transition) {
        this.mScene.setTransition(transition);
        setState(TransitionState.SETUP);
        float f = this.mCurrentState == this.mScene.getEndId() ? 1.0f : 0.0f;
        this.mTransitionLastPosition = f;
        this.mTransitionPosition = f;
        this.mTransitionGoalPosition = f;
        this.mTransitionLastTime = transition.isTransitionFlag(1) ? -1 : getNanoTime();
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if (startId != this.mBeginState || endId != this.mEndState) {
            this.mBeginState = startId;
            this.mEndState = endId;
            this.mScene.setTransition(startId, endId);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            this.mModel.setMeasuredId(this.mBeginState, this.mEndState);
            this.mModel.reEvaluateState();
            rebuildScene();
        }
    }

    public void setTransitionDuration(int i2) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "MotionScene not defined");
        } else {
            motionScene.setDuration(i2);
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.mTransitionListener = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.setTransitionState(bundle);
        if (isAttachedToWindow()) {
            this.mStateCache.apply();
        }
    }

    public String toString() {
        Context context = getContext();
        return Debug.getName(context, this.mBeginState) + "->" + Debug.getName(context, this.mEndState) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    public void touchAnimateTo(int i2, float f, float f2) {
        Interpolator interpolator;
        if (this.mScene != null && this.mTransitionLastPosition != f) {
            this.mTemporalInterpolator = true;
            this.mAnimationStartTime = getNanoTime();
            float duration = ((float) this.mScene.getDuration()) / 1000.0f;
            this.mTransitionDuration = duration;
            this.mTransitionGoalPosition = f;
            this.mInTransition = true;
            if (i2 == 0 || i2 == 1 || i2 == 2) {
                if (i2 == 1) {
                    f = 0.0f;
                } else if (i2 == 2) {
                    f = 1.0f;
                }
                this.mStopLogic.config(this.mTransitionLastPosition, f, f2, duration, this.mScene.getMaxAcceleration(), this.mScene.getMaxVelocity());
            } else {
                if (i2 != 4) {
                    if (i2 == 5) {
                        if (!willJump(f2, this.mTransitionLastPosition, this.mScene.getMaxAcceleration())) {
                            this.mStopLogic.config(this.mTransitionLastPosition, f, f2, this.mTransitionDuration, this.mScene.getMaxAcceleration(), this.mScene.getMaxVelocity());
                            this.mLastVelocity = 0.0f;
                        }
                    }
                    this.mTransitionInstantly = false;
                    this.mAnimationStartTime = getNanoTime();
                    invalidate();
                }
                this.mDecelerateLogic.config(f2, this.mTransitionLastPosition, this.mScene.getMaxAcceleration());
                interpolator = this.mDecelerateLogic;
                this.mInterpolator = interpolator;
                this.mTransitionInstantly = false;
                this.mAnimationStartTime = getNanoTime();
                invalidate();
            }
            int i3 = this.mCurrentState;
            this.mTransitionGoalPosition = f;
            this.mCurrentState = i3;
            interpolator = this.mStopLogic;
            this.mInterpolator = interpolator;
            this.mTransitionInstantly = false;
            this.mAnimationStartTime = getNanoTime();
            invalidate();
        }
    }

    public void transitionToEnd() {
        animateTo(1.0f);
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToState(int i2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setEndState(i2);
            return;
        }
        transitionToState(i2, -1, -1);
    }

    public void transitionToState(int i2, int i3, int i4) {
        StateSet stateSet;
        int convertToConstraintSet;
        MotionScene motionScene = this.mScene;
        if (!(motionScene == null || (stateSet = motionScene.mStateSet) == null || (convertToConstraintSet = stateSet.convertToConstraintSet(this.mCurrentState, i2, (float) i3, (float) i4)) == -1)) {
            i2 = convertToConstraintSet;
        }
        int i5 = this.mCurrentState;
        if (i5 != i2) {
            if (this.mBeginState == i2) {
                animateTo(0.0f);
            } else if (this.mEndState == i2) {
                animateTo(1.0f);
            } else {
                this.mEndState = i2;
                if (i5 != -1) {
                    setTransition(i5, i2);
                    animateTo(1.0f);
                    this.mTransitionLastPosition = 0.0f;
                    transitionToEnd();
                    return;
                }
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = 1.0f;
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mTransitionLastTime = getNanoTime();
                this.mAnimationStartTime = getNanoTime();
                this.mTransitionInstantly = false;
                this.mInterpolator = null;
                this.mTransitionDuration = ((float) this.mScene.getDuration()) / 1000.0f;
                this.mBeginState = -1;
                this.mScene.setTransition(-1, this.mEndState);
                this.mScene.getStartId();
                int childCount = getChildCount();
                this.mFrameArrayList.clear();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    this.mFrameArrayList.put(childAt, new MotionController(childAt));
                }
                this.mInTransition = true;
                this.mModel.initFrom(this.mLayoutWidget, (ConstraintSet) null, this.mScene.getConstraintSet(i2));
                rebuildScene();
                this.mModel.build();
                computeCurrentPositions();
                int width = getWidth();
                int height = getHeight();
                for (int i7 = 0; i7 < childCount; i7++) {
                    MotionController motionController = this.mFrameArrayList.get(getChildAt(i7));
                    this.mScene.getKeyFrames(motionController);
                    motionController.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
                float staggered = this.mScene.getStaggered();
                if (staggered != 0.0f) {
                    float f = Float.MAX_VALUE;
                    float f2 = -3.4028235E38f;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i8));
                        float finalY = motionController2.getFinalY() + motionController2.getFinalX();
                        f = Math.min(f, finalY);
                        f2 = Math.max(f2, finalY);
                    }
                    for (int i9 = 0; i9 < childCount; i9++) {
                        MotionController motionController3 = this.mFrameArrayList.get(getChildAt(i9));
                        float finalX = motionController3.getFinalX();
                        float finalY2 = motionController3.getFinalY();
                        motionController3.mStaggerScale = 1.0f / (1.0f - staggered);
                        motionController3.mStaggerOffset = staggered - ((((finalX + finalY2) - f) * staggered) / (f2 - f));
                    }
                }
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mInTransition = true;
                invalidate();
            }
        }
    }

    public void updateState() {
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        rebuildScene();
    }

    public void updateState(int i2, ConstraintSet constraintSet) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setConstraintSet(i2, constraintSet);
        }
        updateState();
        if (this.mCurrentState == i2) {
            constraintSet.applyTo(this);
        }
    }
}
