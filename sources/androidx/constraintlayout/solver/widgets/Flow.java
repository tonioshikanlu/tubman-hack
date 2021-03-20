package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private int[] mAlignedDimensions = null;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    /* access modifiers changed from: private */
    public ConstraintWidget[] mDisplayedWidgets;
    /* access modifiers changed from: private */
    public int mDisplayedWidgetsCount = 0;
    /* access modifiers changed from: private */
    public float mFirstHorizontalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mFirstHorizontalStyle = -1;
    /* access modifiers changed from: private */
    public float mFirstVerticalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mFirstVerticalStyle = -1;
    /* access modifiers changed from: private */
    public int mHorizontalAlign = 2;
    /* access modifiers changed from: private */
    public float mHorizontalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mHorizontalGap = 0;
    /* access modifiers changed from: private */
    public int mHorizontalStyle = -1;
    /* access modifiers changed from: private */
    public float mLastHorizontalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mLastHorizontalStyle = -1;
    /* access modifiers changed from: private */
    public float mLastVerticalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mLastVerticalStyle = -1;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    /* access modifiers changed from: private */
    public int mVerticalAlign = 2;
    /* access modifiers changed from: private */
    public float mVerticalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mVerticalGap = 0;
    /* access modifiers changed from: private */
    public int mVerticalStyle = -1;
    private int mWrapMode = 0;

    public class WidgetsList {
        /* access modifiers changed from: private */
        public ConstraintWidget biggest = null;
        public int biggestDimension = 0;
        private ConstraintAnchor mBottom;
        private int mCount = 0;
        private int mHeight = 0;
        private ConstraintAnchor mLeft;
        private int mMax = 0;
        private int mNbMatchConstraintsWidgets = 0;
        private int mOrientation = 0;
        private int mPaddingBottom = 0;
        private int mPaddingLeft = 0;
        private int mPaddingRight = 0;
        private int mPaddingTop = 0;
        private ConstraintAnchor mRight;
        private int mStartIndex = 0;
        private ConstraintAnchor mTop;
        private int mWidth = 0;

        public WidgetsList(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3) {
            this.mOrientation = i2;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i3;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.biggest = null;
            this.biggestDimension = 0;
            int i2 = this.mCount;
            int i3 = 0;
            while (i3 < i2 && this.mStartIndex + i3 < Flow.this.mDisplayedWidgetsCount) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i3];
                if (this.mOrientation == 0) {
                    int width = constraintWidget.getWidth();
                    int access$000 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        access$000 = 0;
                    }
                    this.mWidth = width + access$000 + this.mWidth;
                    int access$300 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.biggest == null || this.biggestDimension < access$300) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = access$300;
                        this.mHeight = access$300;
                    }
                } else {
                    int access$200 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int access$3002 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int access$100 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        access$100 = 0;
                    }
                    this.mHeight = access$3002 + access$100 + this.mHeight;
                    if (this.biggest == null || this.biggestDimension < access$200) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = access$200;
                        this.mWidth = access$200;
                    }
                }
                i3++;
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            int i2 = 0;
            if (this.mOrientation == 0) {
                int access$200 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    access$200 = 0;
                }
                int access$000 = Flow.this.mHorizontalGap;
                if (constraintWidget.getVisibility() != 8) {
                    i2 = access$000;
                }
                this.mWidth = access$200 + i2 + this.mWidth;
                int access$300 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.biggest == null || this.biggestDimension < access$300) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = access$300;
                    this.mHeight = access$300;
                }
            } else {
                int access$2002 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                int access$3002 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    access$3002 = 0;
                }
                int access$100 = Flow.this.mVerticalGap;
                if (constraintWidget.getVisibility() != 8) {
                    i2 = access$100;
                }
                this.mHeight = access$3002 + i2 + this.mHeight;
                if (this.biggest == null || this.biggestDimension < access$2002) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = access$2002;
                    this.mWidth = access$2002;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.biggestDimension = 0;
            this.biggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:125:0x023f  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void createConstraints(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.mCount
                r2 = 0
                r3 = r2
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.mStartIndex
                int r4 = r4 + r3
                androidx.constraintlayout.solver.widgets.Flow r5 = androidx.constraintlayout.solver.widgets.Flow.this
                int r5 = r5.mDisplayedWidgetsCount
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                androidx.constraintlayout.solver.widgets.Flow r4 = androidx.constraintlayout.solver.widgets.Flow.this
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r4 = r4.mDisplayedWidgets
                int r5 = r0.mStartIndex
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.resetAnchors()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x032b
                androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.biggest
                if (r3 != 0) goto L_0x002f
                goto L_0x032b
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = r2
            L_0x0036:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L_0x003a:
                if (r6 >= r1) goto L_0x0067
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.mStartIndex
                int r10 = r10 + r9
                androidx.constraintlayout.solver.widgets.Flow r11 = androidx.constraintlayout.solver.widgets.Flow.this
                int r11 = r11.mDisplayedWidgetsCount
                if (r10 < r11) goto L_0x004f
                goto L_0x0067
            L_0x004f:
                androidx.constraintlayout.solver.widgets.Flow r10 = androidx.constraintlayout.solver.widgets.Flow.this
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r10 = r10.mDisplayedWidgets
                int r11 = r0.mStartIndex
                int r11 = r11 + r9
                r9 = r10[r11]
                int r9 = r9.getVisibility()
                if (r9 != 0) goto L_0x0064
                if (r7 != r5) goto L_0x0063
                r7 = r6
            L_0x0063:
                r8 = r6
            L_0x0064:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0067:
                r6 = 0
                int r9 = r0.mOrientation
                if (r9 != 0) goto L_0x01db
                androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.biggest
                androidx.constraintlayout.solver.widgets.Flow r10 = androidx.constraintlayout.solver.widgets.Flow.this
                int r10 = r10.mVerticalStyle
                r9.setVerticalChainStyle(r10)
                int r10 = r0.mPaddingTop
                if (r18 <= 0) goto L_0x0082
                androidx.constraintlayout.solver.widgets.Flow r11 = androidx.constraintlayout.solver.widgets.Flow.this
                int r11 = r11.mVerticalGap
                int r10 = r10 + r11
            L_0x0082:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.mTop
                r11.connect(r12, r10)
                if (r19 == 0) goto L_0x0094
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mBottom
                int r12 = r0.mPaddingBottom
                r10.connect(r11, r12)
            L_0x0094:
                if (r18 <= 0) goto L_0x00a1
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.mTop
                androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r10.mOwner
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.mTop
                r10.connect(r11, r2)
            L_0x00a1:
                androidx.constraintlayout.solver.widgets.Flow r10 = androidx.constraintlayout.solver.widgets.Flow.this
                int r10 = r10.mVerticalAlign
                r11 = 3
                if (r10 != r11) goto L_0x00db
                boolean r10 = r9.hasBaseline()
                if (r10 != 0) goto L_0x00db
                r10 = r2
            L_0x00b1:
                if (r10 >= r1) goto L_0x00db
                if (r17 == 0) goto L_0x00b9
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00ba
            L_0x00b9:
                r12 = r10
            L_0x00ba:
                int r13 = r0.mStartIndex
                int r13 = r13 + r12
                androidx.constraintlayout.solver.widgets.Flow r14 = androidx.constraintlayout.solver.widgets.Flow.this
                int r14 = r14.mDisplayedWidgetsCount
                if (r13 < r14) goto L_0x00c6
                goto L_0x00db
            L_0x00c6:
                androidx.constraintlayout.solver.widgets.Flow r13 = androidx.constraintlayout.solver.widgets.Flow.this
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r13 = r13.mDisplayedWidgets
                int r14 = r0.mStartIndex
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.hasBaseline()
                if (r13 == 0) goto L_0x00d8
                goto L_0x00dc
            L_0x00d8:
                int r10 = r10 + 1
                goto L_0x00b1
            L_0x00db:
                r12 = r9
            L_0x00dc:
                r10 = r2
            L_0x00dd:
                if (r10 >= r1) goto L_0x032b
                if (r17 == 0) goto L_0x00e5
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e6
            L_0x00e5:
                r13 = r10
            L_0x00e6:
                int r14 = r0.mStartIndex
                int r14 = r14 + r13
                androidx.constraintlayout.solver.widgets.Flow r15 = androidx.constraintlayout.solver.widgets.Flow.this
                int r15 = r15.mDisplayedWidgetsCount
                if (r14 < r15) goto L_0x00f3
                goto L_0x032b
            L_0x00f3:
                androidx.constraintlayout.solver.widgets.Flow r14 = androidx.constraintlayout.solver.widgets.Flow.this
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r14 = r14.mDisplayedWidgets
                int r15 = r0.mStartIndex
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r10 != 0) goto L_0x0109
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r14.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mLeft
                int r3 = r0.mPaddingLeft
                r14.connect((androidx.constraintlayout.solver.widgets.ConstraintAnchor) r15, (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r11, (int) r3)
            L_0x0109:
                if (r13 != 0) goto L_0x014c
                androidx.constraintlayout.solver.widgets.Flow r3 = androidx.constraintlayout.solver.widgets.Flow.this
                int r3 = r3.mHorizontalStyle
                androidx.constraintlayout.solver.widgets.Flow r11 = androidx.constraintlayout.solver.widgets.Flow.this
                float r11 = r11.mHorizontalBias
                int r13 = r0.mStartIndex
                if (r13 != 0) goto L_0x0130
                androidx.constraintlayout.solver.widgets.Flow r13 = androidx.constraintlayout.solver.widgets.Flow.this
                int r13 = r13.mFirstHorizontalStyle
                if (r13 == r5) goto L_0x0130
                androidx.constraintlayout.solver.widgets.Flow r3 = androidx.constraintlayout.solver.widgets.Flow.this
                int r3 = r3.mFirstHorizontalStyle
                androidx.constraintlayout.solver.widgets.Flow r11 = androidx.constraintlayout.solver.widgets.Flow.this
                float r11 = r11.mFirstHorizontalBias
                goto L_0x0146
            L_0x0130:
                if (r19 == 0) goto L_0x0146
                androidx.constraintlayout.solver.widgets.Flow r13 = androidx.constraintlayout.solver.widgets.Flow.this
                int r13 = r13.mLastHorizontalStyle
                if (r13 == r5) goto L_0x0146
                androidx.constraintlayout.solver.widgets.Flow r3 = androidx.constraintlayout.solver.widgets.Flow.this
                int r3 = r3.mLastHorizontalStyle
                androidx.constraintlayout.solver.widgets.Flow r11 = androidx.constraintlayout.solver.widgets.Flow.this
                float r11 = r11.mLastHorizontalBias
            L_0x0146:
                r14.setHorizontalChainStyle(r3)
                r14.setHorizontalBiasPercent(r11)
            L_0x014c:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x0159
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r14.connect((androidx.constraintlayout.solver.widgets.ConstraintAnchor) r3, (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r11, (int) r13)
            L_0x0159:
                if (r6 == 0) goto L_0x0184
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r6.mRight
                androidx.constraintlayout.solver.widgets.Flow r13 = androidx.constraintlayout.solver.widgets.Flow.this
                int r13 = r13.mHorizontalGap
                r3.connect(r11, r13)
                if (r10 != r7) goto L_0x0171
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mLeft
                int r11 = r0.mPaddingLeft
                r3.setGoneMargin(r11)
            L_0x0171:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r6.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r14.mLeft
                r3.connect(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x0184
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r6.mRight
                int r6 = r0.mPaddingRight
                r3.setGoneMargin(r6)
            L_0x0184:
                if (r14 == r9) goto L_0x01d4
                androidx.constraintlayout.solver.widgets.Flow r3 = androidx.constraintlayout.solver.widgets.Flow.this
                int r3 = r3.mVerticalAlign
                r6 = 3
                if (r3 != r6) goto L_0x01a2
                boolean r3 = r12.hasBaseline()
                if (r3 == 0) goto L_0x01a2
                if (r14 == r12) goto L_0x01a2
                boolean r3 = r14.hasBaseline()
                if (r3 == 0) goto L_0x01a2
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mBaseline
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r12.mBaseline
                goto L_0x01d0
            L_0x01a2:
                androidx.constraintlayout.solver.widgets.Flow r3 = androidx.constraintlayout.solver.widgets.Flow.this
                int r3 = r3.mVerticalAlign
                if (r3 == 0) goto L_0x01cc
                r11 = 1
                if (r3 == r11) goto L_0x01c7
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mTop
                if (r4 == 0) goto L_0x01c2
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mTop
                int r13 = r0.mPaddingTop
                r3.connect(r11, r13)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r3.connect(r11, r13)
                goto L_0x01d5
            L_0x01c2:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.mTop
                r3.connect(r11, r2)
            L_0x01c7:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.mBottom
                goto L_0x01d0
            L_0x01cc:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.mTop
            L_0x01d0:
                r3.connect(r11, r2)
                goto L_0x01d5
            L_0x01d4:
                r6 = 3
            L_0x01d5:
                int r10 = r10 + 1
                r11 = r6
                r6 = r14
                goto L_0x00dd
            L_0x01db:
                androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.biggest
                androidx.constraintlayout.solver.widgets.Flow r9 = androidx.constraintlayout.solver.widgets.Flow.this
                int r9 = r9.mHorizontalStyle
                r3.setHorizontalChainStyle(r9)
                int r9 = r0.mPaddingLeft
                if (r18 <= 0) goto L_0x01f1
                androidx.constraintlayout.solver.widgets.Flow r10 = androidx.constraintlayout.solver.widgets.Flow.this
                int r10 = r10.mHorizontalGap
                int r9 = r9 + r10
            L_0x01f1:
                if (r17 == 0) goto L_0x0210
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mRight
                r10.connect(r11, r9)
                if (r19 == 0) goto L_0x0205
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.mLeft
                int r11 = r0.mPaddingRight
                r9.connect(r10, r11)
            L_0x0205:
                if (r18 <= 0) goto L_0x022f
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r0.mRight
                androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r9.mOwner
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mRight
                goto L_0x022c
            L_0x0210:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mLeft
                r10.connect(r11, r9)
                if (r19 == 0) goto L_0x0222
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.mRight
                int r11 = r0.mPaddingRight
                r9.connect(r10, r11)
            L_0x0222:
                if (r18 <= 0) goto L_0x022f
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r0.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r9.mOwner
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mLeft
            L_0x022c:
                r9.connect(r10, r2)
            L_0x022f:
                r9 = r2
            L_0x0230:
                if (r9 >= r1) goto L_0x032b
                int r10 = r0.mStartIndex
                int r10 = r10 + r9
                androidx.constraintlayout.solver.widgets.Flow r11 = androidx.constraintlayout.solver.widgets.Flow.this
                int r11 = r11.mDisplayedWidgetsCount
                if (r10 < r11) goto L_0x023f
                goto L_0x032b
            L_0x023f:
                androidx.constraintlayout.solver.widgets.Flow r10 = androidx.constraintlayout.solver.widgets.Flow.this
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r10 = r10.mDisplayedWidgets
                int r11 = r0.mStartIndex
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r9 != 0) goto L_0x0296
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.mTop
                int r13 = r0.mPaddingTop
                r10.connect((androidx.constraintlayout.solver.widgets.ConstraintAnchor) r11, (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r12, (int) r13)
                androidx.constraintlayout.solver.widgets.Flow r11 = androidx.constraintlayout.solver.widgets.Flow.this
                int r11 = r11.mVerticalStyle
                androidx.constraintlayout.solver.widgets.Flow r12 = androidx.constraintlayout.solver.widgets.Flow.this
                float r12 = r12.mVerticalBias
                int r13 = r0.mStartIndex
                if (r13 != 0) goto L_0x027a
                androidx.constraintlayout.solver.widgets.Flow r13 = androidx.constraintlayout.solver.widgets.Flow.this
                int r13 = r13.mFirstVerticalStyle
                if (r13 == r5) goto L_0x027a
                androidx.constraintlayout.solver.widgets.Flow r11 = androidx.constraintlayout.solver.widgets.Flow.this
                int r11 = r11.mFirstVerticalStyle
                androidx.constraintlayout.solver.widgets.Flow r12 = androidx.constraintlayout.solver.widgets.Flow.this
                float r12 = r12.mFirstVerticalBias
                goto L_0x0290
            L_0x027a:
                if (r19 == 0) goto L_0x0290
                androidx.constraintlayout.solver.widgets.Flow r13 = androidx.constraintlayout.solver.widgets.Flow.this
                int r13 = r13.mLastVerticalStyle
                if (r13 == r5) goto L_0x0290
                androidx.constraintlayout.solver.widgets.Flow r11 = androidx.constraintlayout.solver.widgets.Flow.this
                int r11 = r11.mLastVerticalStyle
                androidx.constraintlayout.solver.widgets.Flow r12 = androidx.constraintlayout.solver.widgets.Flow.this
                float r12 = r12.mLastVerticalBias
            L_0x0290:
                r10.setVerticalChainStyle(r11)
                r10.setVerticalBiasPercent(r12)
            L_0x0296:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x02a3
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r10.connect((androidx.constraintlayout.solver.widgets.ConstraintAnchor) r11, (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r12, (int) r13)
            L_0x02a3:
                if (r6 == 0) goto L_0x02ce
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r6.mBottom
                androidx.constraintlayout.solver.widgets.Flow r13 = androidx.constraintlayout.solver.widgets.Flow.this
                int r13 = r13.mVerticalGap
                r11.connect(r12, r13)
                if (r9 != r7) goto L_0x02bb
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.mTop
                int r12 = r0.mPaddingTop
                r11.setGoneMargin(r12)
            L_0x02bb:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r6.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r10.mTop
                r11.connect(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x02ce
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mBottom
                int r11 = r0.mPaddingBottom
                r6.setGoneMargin(r11)
            L_0x02ce:
                if (r10 == r3) goto L_0x0325
                r6 = 2
                androidx.constraintlayout.solver.widgets.Flow r11 = androidx.constraintlayout.solver.widgets.Flow.this
                int r11 = r11.mHorizontalAlign
                if (r17 == 0) goto L_0x02f6
                if (r11 == 0) goto L_0x02ee
                r12 = 1
                if (r11 == r12) goto L_0x02e9
                if (r11 == r6) goto L_0x02e1
                goto L_0x0325
            L_0x02e1:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
                goto L_0x02ee
            L_0x02e9:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mLeft
                goto L_0x02f2
            L_0x02ee:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mRight
            L_0x02f2:
                r6.connect(r11, r2)
                goto L_0x0325
            L_0x02f6:
                r12 = 1
                if (r11 == 0) goto L_0x031d
                if (r11 == r12) goto L_0x0318
                if (r11 == r6) goto L_0x02fe
                goto L_0x0326
            L_0x02fe:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r10.mLeft
                if (r4 == 0) goto L_0x0313
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mLeft
                int r13 = r0.mPaddingLeft
                r6.connect(r11, r13)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r6.connect(r11, r13)
                goto L_0x0326
            L_0x0313:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
            L_0x0318:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mRight
                goto L_0x0321
            L_0x031d:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mLeft
            L_0x0321:
                r6.connect(r11, r2)
                goto L_0x0326
            L_0x0325:
                r12 = 1
            L_0x0326:
                int r9 = r9 + 1
                r6 = r10
                goto L_0x0230
            L_0x032b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Flow.WidgetsList.createConstraints(boolean, int, boolean):void");
        }

        public int getHeight() {
            return this.mOrientation == 1 ? this.mHeight - Flow.this.mVerticalGap : this.mHeight;
        }

        public int getWidth() {
            return this.mOrientation == 0 ? this.mWidth - Flow.this.mHorizontalGap : this.mWidth;
        }

        public void measureMatchConstraints(int i2) {
            int i3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour;
            int i4;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
            Flow flow;
            int i5 = this.mNbMatchConstraintsWidgets;
            if (i5 != 0) {
                int i6 = this.mCount;
                int i7 = i2 / i5;
                int i8 = 0;
                while (i8 < i6 && this.mStartIndex + i8 < Flow.this.mDisplayedWidgetsCount) {
                    ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i8];
                    if (this.mOrientation == 0) {
                        if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                            flow = Flow.this;
                            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                            dimensionBehaviour = constraintWidget.getVerticalDimensionBehaviour();
                            i3 = constraintWidget.getHeight();
                            i4 = i7;
                        }
                        i8++;
                    } else {
                        if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                            flow = Flow.this;
                            dimensionBehaviour2 = constraintWidget.getHorizontalDimensionBehaviour();
                            i4 = constraintWidget.getWidth();
                            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                            i3 = i7;
                        }
                        i8++;
                    }
                    flow.measure(constraintWidget, dimensionBehaviour2, i4, dimensionBehaviour, i3);
                    i8++;
                }
                recomputeDimensions();
            }
        }

        public void setStartIndex(int i2) {
            this.mStartIndex = i2;
        }

        public void setup(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3, int i4, int i5, int i6, int i7) {
            this.mOrientation = i2;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i3;
            this.mPaddingTop = i4;
            this.mPaddingRight = i5;
            this.mPaddingBottom = i6;
            this.mMax = i7;
        }
    }

    private void createAlignedConstraints(boolean z) {
        ConstraintWidget constraintWidget;
        if (this.mAlignedDimensions != null && this.mAlignedBiggestElementsInCols != null && this.mAlignedBiggestElementsInRows != null) {
            for (int i2 = 0; i2 < this.mDisplayedWidgetsCount; i2++) {
                this.mDisplayedWidgets[i2].resetAnchors();
            }
            int[] iArr = this.mAlignedDimensions;
            int i3 = iArr[0];
            int i4 = iArr[1];
            ConstraintWidget constraintWidget2 = null;
            for (int i5 = 0; i5 < i3; i5++) {
                ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[z ? (i3 - i5) - 1 : i5];
                if (!(constraintWidget3 == null || constraintWidget3.getVisibility() == 8)) {
                    if (i5 == 0) {
                        constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                        constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                        constraintWidget3.setHorizontalBiasPercent(this.mHorizontalBias);
                    }
                    if (i5 == i3 - 1) {
                        constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                    }
                    if (i5 > 0) {
                        constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                        constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
            }
            for (int i6 = 0; i6 < i4; i6++) {
                ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i6];
                if (!(constraintWidget4 == null || constraintWidget4.getVisibility() == 8)) {
                    if (i6 == 0) {
                        constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                        constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                        constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                    }
                    if (i6 == i4 - 1) {
                        constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                    }
                    if (i6 > 0) {
                        constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                        constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.mOrientation == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                    if (!(i9 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i9]) == null || constraintWidget.getVisibility() == 8)) {
                        ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i7];
                        ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i8];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                            constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                            constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final int getWidgetHeight(ConstraintWidget constraintWidget, int i2) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (constraintWidget.mMatchConstraintPercentHeight * ((float) i2));
                if (i4 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                }
                return i4;
            } else if (i3 == 1) {
                return constraintWidget.getHeight();
            } else {
                if (i3 == 3) {
                    return (int) ((((float) constraintWidget.getWidth()) * constraintWidget.mDimensionRatio) + 0.5f);
                }
            }
        }
        return constraintWidget.getHeight();
    }

    /* access modifiers changed from: private */
    public final int getWidgetWidth(ConstraintWidget constraintWidget, int i2) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (constraintWidget.mMatchConstraintPercentWidth * ((float) i2));
                if (i4 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i4;
            } else if (i3 == 1) {
                return constraintWidget.getWidth();
            } else {
                if (i3 == 3) {
                    return (int) ((((float) constraintWidget.getHeight()) * constraintWidget.mDimensionRatio) + 0.5f);
                }
            }
        }
        return constraintWidget.getWidth();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0129 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    private void measureAligned(androidx.constraintlayout.solver.widgets.ConstraintWidget[] r17, int r18, int r19, int r20, int[] r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 0
            int r6 = r0.mMaxElementsWrap
            if (r3 != 0) goto L_0x0030
            if (r6 > 0) goto L_0x002d
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0014:
            if (r7 >= r2) goto L_0x002d
            if (r7 <= 0) goto L_0x001b
            int r9 = r0.mHorizontalGap
            int r8 = r8 + r9
        L_0x001b:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0020
            goto L_0x002a
        L_0x0020:
            int r9 = r0.getWidgetWidth(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            int r6 = r6 + 1
        L_0x002a:
            int r7 = r7 + 1
            goto L_0x0014
        L_0x002d:
            r7 = r6
            r6 = r5
            goto L_0x004f
        L_0x0030:
            if (r6 > 0) goto L_0x004e
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0035:
            if (r7 >= r2) goto L_0x004e
            if (r7 <= 0) goto L_0x003c
            int r9 = r0.mVerticalGap
            int r8 = r8 + r9
        L_0x003c:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0041
            goto L_0x004b
        L_0x0041:
            int r9 = r0.getWidgetHeight(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            int r6 = r6 + 1
        L_0x004b:
            int r7 = r7 + 1
            goto L_0x0035
        L_0x004e:
            r7 = r5
        L_0x004f:
            int[] r8 = r0.mAlignedDimensions
            if (r8 != 0) goto L_0x0058
            r8 = 2
            int[] r8 = new int[r8]
            r0.mAlignedDimensions = r8
        L_0x0058:
            r8 = 1
            if (r6 != 0) goto L_0x005d
            if (r3 == r8) goto L_0x0061
        L_0x005d:
            if (r7 != 0) goto L_0x0063
            if (r3 != 0) goto L_0x0063
        L_0x0061:
            r9 = r8
            goto L_0x0064
        L_0x0063:
            r9 = r5
        L_0x0064:
            if (r9 != 0) goto L_0x0129
            if (r3 != 0) goto L_0x0072
            float r6 = (float) r2
            float r10 = (float) r7
            float r6 = r6 / r10
            double r10 = (double) r6
            double r10 = java.lang.Math.ceil(r10)
            int r6 = (int) r10
            goto L_0x007b
        L_0x0072:
            float r7 = (float) r2
            float r10 = (float) r6
            float r7 = r7 / r10
            double r10 = (double) r7
            double r10 = java.lang.Math.ceil(r10)
            int r7 = (int) r10
        L_0x007b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r10 = r0.mAlignedBiggestElementsInCols
            r11 = 0
            if (r10 == 0) goto L_0x0088
            int r12 = r10.length
            if (r12 >= r7) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            java.util.Arrays.fill(r10, r11)
            goto L_0x008c
        L_0x0088:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r10 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r7]
            r0.mAlignedBiggestElementsInCols = r10
        L_0x008c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r10 = r0.mAlignedBiggestElementsInRows
            if (r10 == 0) goto L_0x0098
            int r12 = r10.length
            if (r12 >= r6) goto L_0x0094
            goto L_0x0098
        L_0x0094:
            java.util.Arrays.fill(r10, r11)
            goto L_0x009c
        L_0x0098:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r10 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r6]
            r0.mAlignedBiggestElementsInRows = r10
        L_0x009c:
            r10 = r5
        L_0x009d:
            if (r10 >= r7) goto L_0x00e5
            r11 = r5
        L_0x00a0:
            if (r11 >= r6) goto L_0x00e2
            int r12 = r11 * r7
            int r12 = r12 + r10
            if (r3 != r8) goto L_0x00aa
            int r12 = r10 * r6
            int r12 = r12 + r11
        L_0x00aa:
            int r13 = r1.length
            if (r12 < r13) goto L_0x00ae
            goto L_0x00df
        L_0x00ae:
            r12 = r1[r12]
            if (r12 != 0) goto L_0x00b3
            goto L_0x00df
        L_0x00b3:
            int r13 = r0.getWidgetWidth(r12, r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r14 = r0.mAlignedBiggestElementsInCols
            r15 = r14[r10]
            if (r15 == 0) goto L_0x00c5
            r14 = r14[r10]
            int r14 = r14.getWidth()
            if (r14 >= r13) goto L_0x00c9
        L_0x00c5:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r13 = r0.mAlignedBiggestElementsInCols
            r13[r10] = r12
        L_0x00c9:
            int r13 = r0.getWidgetHeight(r12, r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r14 = r0.mAlignedBiggestElementsInRows
            r15 = r14[r11]
            if (r15 == 0) goto L_0x00db
            r14 = r14[r11]
            int r14 = r14.getHeight()
            if (r14 >= r13) goto L_0x00df
        L_0x00db:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r13 = r0.mAlignedBiggestElementsInRows
            r13[r11] = r12
        L_0x00df:
            int r11 = r11 + 1
            goto L_0x00a0
        L_0x00e2:
            int r10 = r10 + 1
            goto L_0x009d
        L_0x00e5:
            r10 = r5
            r11 = r10
        L_0x00e7:
            if (r10 >= r7) goto L_0x00fc
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r12 = r0.mAlignedBiggestElementsInCols
            r12 = r12[r10]
            if (r12 == 0) goto L_0x00f9
            if (r10 <= 0) goto L_0x00f4
            int r13 = r0.mHorizontalGap
            int r11 = r11 + r13
        L_0x00f4:
            int r12 = r0.getWidgetWidth(r12, r4)
            int r11 = r11 + r12
        L_0x00f9:
            int r10 = r10 + 1
            goto L_0x00e7
        L_0x00fc:
            r10 = r5
            r12 = r10
        L_0x00fe:
            if (r10 >= r6) goto L_0x0113
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r13 = r0.mAlignedBiggestElementsInRows
            r13 = r13[r10]
            if (r13 == 0) goto L_0x0110
            if (r10 <= 0) goto L_0x010b
            int r14 = r0.mVerticalGap
            int r12 = r12 + r14
        L_0x010b:
            int r13 = r0.getWidgetHeight(r13, r4)
            int r12 = r12 + r13
        L_0x0110:
            int r10 = r10 + 1
            goto L_0x00fe
        L_0x0113:
            r21[r5] = r11
            r21[r8] = r12
            if (r3 != 0) goto L_0x0121
            if (r11 <= r4) goto L_0x0061
            if (r7 <= r8) goto L_0x0061
            int r7 = r7 + -1
            goto L_0x0064
        L_0x0121:
            if (r12 <= r4) goto L_0x0061
            if (r6 <= r8) goto L_0x0061
            int r6 = r6 + -1
            goto L_0x0064
        L_0x0129:
            int[] r1 = r0.mAlignedDimensions
            r1[r5] = r7
            r1[r8] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Flow.measureAligned(androidx.constraintlayout.solver.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i4, int[] iArr) {
        ConstraintAnchor constraintAnchor;
        int i5;
        int i6;
        int i7;
        ConstraintAnchor constraintAnchor2;
        int i8;
        int i9;
        int i10;
        int i11 = i2;
        int i12 = i4;
        if (i11 != 0) {
            this.mChainList.clear();
            WidgetsList widgetsList = new WidgetsList(i3, this.mLeft, this.mTop, this.mRight, this.mBottom, i4);
            this.mChainList.add(widgetsList);
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            if (i3 == 0) {
                while (i15 < i11) {
                    ConstraintWidget constraintWidget = constraintWidgetArr[i15];
                    int widgetWidth = getWidgetWidth(constraintWidget, i12);
                    if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i16 = i13;
                    boolean z = (i14 == i12 || (this.mHorizontalGap + i14) + widgetWidth > i12) && widgetsList.biggest != null;
                    if (!z && i15 > 0 && (i10 = this.mMaxElementsWrap) > 0 && i15 % i10 == 0) {
                        z = true;
                    }
                    if (z) {
                        widgetsList = new WidgetsList(i3, this.mLeft, this.mTop, this.mRight, this.mBottom, i4);
                        widgetsList.setStartIndex(i15);
                        this.mChainList.add(widgetsList);
                    } else if (i15 > 0) {
                        i14 = this.mHorizontalGap + widgetWidth + i14;
                        widgetsList.add(constraintWidget);
                        i15++;
                        i13 = i16;
                    }
                    i14 = widgetWidth;
                    widgetsList.add(constraintWidget);
                    i15++;
                    i13 = i16;
                }
            } else {
                while (i15 < i11) {
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i15];
                    int widgetHeight = getWidgetHeight(constraintWidget2, i12);
                    if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i17 = i13;
                    boolean z2 = (i14 == i12 || (this.mVerticalGap + i14) + widgetHeight > i12) && widgetsList.biggest != null;
                    if (!z2 && i15 > 0 && (i9 = this.mMaxElementsWrap) > 0 && i15 % i9 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        widgetsList = new WidgetsList(i3, this.mLeft, this.mTop, this.mRight, this.mBottom, i4);
                        widgetsList.setStartIndex(i15);
                        this.mChainList.add(widgetsList);
                    } else if (i15 > 0) {
                        i8 = this.mVerticalGap + widgetHeight + i14;
                        widgetsList.add(constraintWidget2);
                        i15++;
                        i13 = i17;
                    }
                    i8 = widgetHeight;
                    widgetsList.add(constraintWidget2);
                    i15++;
                    i13 = i17;
                }
            }
            int size = this.mChainList.size();
            ConstraintAnchor constraintAnchor3 = this.mLeft;
            ConstraintAnchor constraintAnchor4 = this.mTop;
            ConstraintAnchor constraintAnchor5 = this.mRight;
            ConstraintAnchor constraintAnchor6 = this.mBottom;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z3 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
            if (i13 > 0 && z3) {
                for (int i18 = 0; i18 < size; i18++) {
                    WidgetsList widgetsList2 = this.mChainList.get(i18);
                    widgetsList2.measureMatchConstraints(i12 - (i3 == 0 ? widgetsList2.getWidth() : widgetsList2.getHeight()));
                }
            }
            int i19 = paddingTop;
            int i20 = paddingRight;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = paddingLeft;
            ConstraintAnchor constraintAnchor7 = constraintAnchor4;
            ConstraintAnchor constraintAnchor8 = constraintAnchor3;
            int i25 = paddingBottom;
            while (i23 < size) {
                WidgetsList widgetsList3 = this.mChainList.get(i23);
                if (i3 == 0) {
                    if (i23 < size - 1) {
                        constraintAnchor2 = this.mChainList.get(i23 + 1).biggest.mTop;
                        i7 = 0;
                    } else {
                        constraintAnchor2 = this.mBottom;
                        i7 = getPaddingBottom();
                    }
                    ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                    int i26 = i21;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                    int i27 = i22;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                    i5 = i23;
                    widgetsList3.setup(i3, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i24, i19, i20, i7, i4);
                    int max = Math.max(i27, widgetsList3.getWidth());
                    int height = widgetsList3.getHeight() + i26;
                    if (i5 > 0) {
                        height += this.mVerticalGap;
                    }
                    constraintAnchor8 = constraintAnchor11;
                    i22 = max;
                    i21 = height;
                    i19 = 0;
                    constraintAnchor7 = constraintAnchor9;
                    constraintAnchor = constraintAnchor14;
                    int i28 = i7;
                    constraintAnchor6 = constraintAnchor2;
                    i25 = i28;
                } else {
                    ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                    int i29 = i21;
                    int i30 = i22;
                    i5 = i23;
                    if (i5 < size - 1) {
                        constraintAnchor = this.mChainList.get(i5 + 1).biggest.mLeft;
                        i6 = 0;
                    } else {
                        constraintAnchor = this.mRight;
                        i6 = getPaddingRight();
                    }
                    ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                    widgetsList3.setup(i3, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i24, i19, i6, i25, i4);
                    int width = widgetsList3.getWidth() + i30;
                    int max2 = Math.max(i29, widgetsList3.getHeight());
                    if (i5 > 0) {
                        width += this.mHorizontalGap;
                    }
                    i21 = max2;
                    i22 = width;
                    i24 = 0;
                    i20 = i6;
                    constraintAnchor8 = constraintAnchor16;
                }
                i23 = i5 + 1;
                int i31 = i4;
                constraintAnchor5 = constraintAnchor;
            }
            iArr[0] = i22;
            iArr[1] = i21;
        }
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i4, int[] iArr) {
        WidgetsList widgetsList;
        int i5 = i2;
        if (i5 != 0) {
            if (this.mChainList.size() == 0) {
                widgetsList = new WidgetsList(i3, this.mLeft, this.mTop, this.mRight, this.mBottom, i4);
                this.mChainList.add(widgetsList);
            } else {
                WidgetsList widgetsList2 = this.mChainList.get(0);
                widgetsList2.clear();
                widgetsList = widgetsList2;
                widgetsList.setup(i3, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i4);
            }
            for (int i6 = 0; i6 < i5; i6++) {
                widgetsList.add(constraintWidgetArr[i6]);
            }
            iArr[0] = widgetsList.getWidth();
            iArr[1] = widgetsList.getHeight();
        }
    }

    public void addToSolver(LinearSystem linearSystem, boolean z) {
        super.addToSolver(linearSystem, z);
        boolean isRtl = getParent() != null ? ((ConstraintWidgetContainer) getParent()).isRtl() : false;
        int i2 = this.mWrapMode;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = this.mChainList.size();
                int i3 = 0;
                while (i3 < size) {
                    this.mChainList.get(i3).createConstraints(isRtl, i3, i3 == size + -1);
                    i3++;
                }
            } else if (i2 == 2) {
                createAlignedConstraints(isRtl);
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(isRtl, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r6.mVerticalStyle == -1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r6.mVerticalStyle == -1) goto L_0x0054;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measure(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.mWidgetsCount
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.measureChildren()
            if (r0 != 0) goto L_0x001c
            r6.setMeasure(r11, r11)
            r6.needsCallbackFromSolver(r11)
            return
        L_0x001c:
            int r12 = r18.getPaddingLeft()
            int r13 = r18.getPaddingRight()
            int r14 = r18.getPaddingTop()
            int r15 = r18.getPaddingBottom()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.mOrientation
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004a
            int r2 = r6.mHorizontalStyle
            if (r2 != r1) goto L_0x0045
            r6.mHorizontalStyle = r11
        L_0x0045:
            int r2 = r6.mVerticalStyle
            if (r2 != r1) goto L_0x0056
            goto L_0x0054
        L_0x004a:
            int r2 = r6.mHorizontalStyle
            if (r2 != r1) goto L_0x0050
            r6.mHorizontalStyle = r11
        L_0x0050:
            int r2 = r6.mVerticalStyle
            if (r2 != r1) goto L_0x0056
        L_0x0054:
            r6.mVerticalStyle = r11
        L_0x0056:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r6.mWidgets
            r2 = r11
            r3 = r2
        L_0x005a:
            int r11 = r6.mWidgetsCount
            r0 = 8
            if (r2 >= r11) goto L_0x0070
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r11 = r6.mWidgets
            r11 = r11[r2]
            int r11 = r11.getVisibility()
            if (r11 != r0) goto L_0x006c
            int r3 = r3 + 1
        L_0x006c:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005a
        L_0x0070:
            if (r3 <= 0) goto L_0x008f
            int r11 = r11 - r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r11]
            r2 = 0
            r3 = 0
        L_0x0077:
            int r11 = r6.mWidgetsCount
            if (r2 >= r11) goto L_0x008d
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r11 = r6.mWidgets
            r11 = r11[r2]
            int r4 = r11.getVisibility()
            if (r4 == r0) goto L_0x0089
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x0089:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0077
        L_0x008d:
            r2 = r3
            goto L_0x0090
        L_0x008f:
            r2 = r11
        L_0x0090:
            r6.mDisplayedWidgets = r1
            r6.mDisplayedWidgetsCount = r2
            int r0 = r6.mWrapMode
            if (r0 == 0) goto L_0x00bd
            r4 = 1
            if (r0 == r4) goto L_0x00b0
            r3 = 2
            if (r0 == r3) goto L_0x00a3
            r11 = r4
            r17 = r5
        L_0x00a1:
            r0 = 0
            goto L_0x00ca
        L_0x00a3:
            int r3 = r6.mOrientation
            r0 = r18
            r11 = r4
            r4 = r16
            r17 = r5
            r0.measureAligned(r1, r2, r3, r4, r5)
            goto L_0x00a1
        L_0x00b0:
            r11 = r4
            r17 = r5
            int r3 = r6.mOrientation
            r0 = r18
            r4 = r16
            r0.measureChainWrap(r1, r2, r3, r4, r5)
            goto L_0x00a1
        L_0x00bd:
            r17 = r5
            r11 = 1
            int r3 = r6.mOrientation
            r0 = r18
            r4 = r16
            r0.measureNoWrap(r1, r2, r3, r4, r5)
            goto L_0x00a1
        L_0x00ca:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00da
            r1 = r8
            goto L_0x00e5
        L_0x00da:
            if (r7 != r3) goto L_0x00e1
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00e5
        L_0x00e1:
            if (r7 != 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r1 = r0
        L_0x00e5:
            if (r9 != r4) goto L_0x00e9
            r2 = r10
            goto L_0x00f4
        L_0x00e9:
            if (r9 != r3) goto L_0x00f0
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x00f4
        L_0x00f0:
            if (r9 != 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r2 = r0
        L_0x00f4:
            r6.setMeasure(r1, r2)
            r6.setWidth(r1)
            r6.setHeight(r2)
            int r1 = r6.mWidgetsCount
            if (r1 <= 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r11 = r0
        L_0x0103:
            r6.needsCallbackFromSolver(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Flow.measure(int, int, int, int):void");
    }

    public void setFirstHorizontalBias(float f) {
        this.mFirstHorizontalBias = f;
    }

    public void setFirstHorizontalStyle(int i2) {
        this.mFirstHorizontalStyle = i2;
    }

    public void setFirstVerticalBias(float f) {
        this.mFirstVerticalBias = f;
    }

    public void setFirstVerticalStyle(int i2) {
        this.mFirstVerticalStyle = i2;
    }

    public void setHorizontalAlign(int i2) {
        this.mHorizontalAlign = i2;
    }

    public void setHorizontalBias(float f) {
        this.mHorizontalBias = f;
    }

    public void setHorizontalGap(int i2) {
        this.mHorizontalGap = i2;
    }

    public void setHorizontalStyle(int i2) {
        this.mHorizontalStyle = i2;
    }

    public void setLastHorizontalBias(float f) {
        this.mLastHorizontalBias = f;
    }

    public void setLastHorizontalStyle(int i2) {
        this.mLastHorizontalStyle = i2;
    }

    public void setLastVerticalBias(float f) {
        this.mLastVerticalBias = f;
    }

    public void setLastVerticalStyle(int i2) {
        this.mLastVerticalStyle = i2;
    }

    public void setMaxElementsWrap(int i2) {
        this.mMaxElementsWrap = i2;
    }

    public void setOrientation(int i2) {
        this.mOrientation = i2;
    }

    public void setVerticalAlign(int i2) {
        this.mVerticalAlign = i2;
    }

    public void setVerticalBias(float f) {
        this.mVerticalBias = f;
    }

    public void setVerticalGap(int i2) {
        this.mVerticalGap = i2;
    }

    public void setVerticalStyle(int i2) {
        this.mVerticalStyle = i2;
    }

    public void setWrapMode(int i2) {
        this.mWrapMode = i2;
    }
}
