package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.2";
    public SparseArray<View> mChildrenByIds = new SparseArray<>();
    /* access modifiers changed from: private */
    public ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList<>(4);
    public ConstraintLayoutStates mConstraintLayoutSpec = null;
    private ConstraintSet mConstraintSet = null;
    private int mConstraintSetId = -1;
    private ConstraintsChangedListener mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    public boolean mDirtyHierarchy = true;
    private int mLastMeasureHeight = -1;
    public int mLastMeasureHeightMode = 0;
    public int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    public int mLastMeasureWidthMode = 0;
    public int mLastMeasureWidthSize = -1;
    public ConstraintWidgetContainer mLayoutWidget = new ConstraintWidgetContainer();
    private int mMaxHeight = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private int mMaxWidth = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public Measurer mMeasurer = new Measurer(this);
    private Metrics mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private int mOnMeasureHeightMeasureSpec = 0;
    private int mOnMeasureWidthMeasureSpec = 0;
    /* access modifiers changed from: private */
    public int mOptimizationLevel = 257;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values()
                r0 = 4
                int[] r1 = new int[r0]
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = r1
                r2 = 1
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x000e }
                r3 = 0
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 2
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch:{ NoSuchFieldError -> 0x0015 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x0015 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch:{ NoSuchFieldError -> 0x001c }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x001c }
                r3 = 3
                r2[r3] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.<clinit>():void");
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int END = 7;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public int baselineToBaseline = -1;
        public int bottomToBottom = -1;
        public int bottomToTop = -1;
        public float circleAngle = 0.0f;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public boolean constrainedHeight = false;
        public boolean constrainedWidth = false;
        public String constraintTag = null;
        public String dimensionRatio = null;
        public int dimensionRatioSide = 1;
        public float dimensionRatioValue = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int endToEnd = -1;
        public int endToStart = -1;
        public int goneBottomMargin = -1;
        public int goneEndMargin = -1;
        public int goneLeftMargin = -1;
        public int goneRightMargin = -1;
        public int goneStartMargin = -1;
        public int goneTopMargin = -1;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean helped = false;
        public float horizontalBias = 0.5f;
        public int horizontalChainStyle = 0;
        public boolean horizontalDimensionFixed = true;
        public float horizontalWeight = -1.0f;
        public boolean isGuideline = false;
        public boolean isHelper = false;
        public boolean isInPlaceholder = false;
        public boolean isVirtualGroup = false;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int matchConstraintDefaultHeight = 0;
        public int matchConstraintDefaultWidth = 0;
        public int matchConstraintMaxHeight = 0;
        public int matchConstraintMaxWidth = 0;
        public int matchConstraintMinHeight = 0;
        public int matchConstraintMinWidth = 0;
        public float matchConstraintPercentHeight = 1.0f;
        public float matchConstraintPercentWidth = 1.0f;
        public boolean needsBaseline = false;
        public int orientation = -1;
        public int resolveGoneLeftMargin = -1;
        public int resolveGoneRightMargin = -1;
        public int resolvedGuideBegin;
        public int resolvedGuideEnd;
        public float resolvedGuidePercent;
        public float resolvedHorizontalBias = 0.5f;
        public int resolvedLeftToLeft = -1;
        public int resolvedLeftToRight = -1;
        public int resolvedRightToLeft = -1;
        public int resolvedRightToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int topToBottom = -1;
        public int topToTop = -1;
        public float verticalBias = 0.5f;
        public int verticalChainStyle = 0;
        public boolean verticalDimensionFixed = true;
        public float verticalWeight = -1.0f;
        public ConstraintWidget widget = new ConstraintWidget();

        public static class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TAG = 51;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int UNUSED = 0;
            public static final SparseIntArray map;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                map = sparseIntArray;
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
            }

            private Table() {
            }
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x021e, code lost:
            android.util.Log.e(androidx.constraintlayout.widget.ConstraintLayout.TAG, r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public LayoutParams(android.content.Context r11, android.util.AttributeSet r12) {
            /*
                r10 = this;
                r10.<init>(r11, r12)
                r0 = -1
                r10.guideBegin = r0
                r10.guideEnd = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10.guidePercent = r1
                r10.leftToLeft = r0
                r10.leftToRight = r0
                r10.rightToLeft = r0
                r10.rightToRight = r0
                r10.topToTop = r0
                r10.topToBottom = r0
                r10.bottomToTop = r0
                r10.bottomToBottom = r0
                r10.baselineToBaseline = r0
                r10.circleConstraint = r0
                r2 = 0
                r10.circleRadius = r2
                r3 = 0
                r10.circleAngle = r3
                r10.startToEnd = r0
                r10.startToStart = r0
                r10.endToStart = r0
                r10.endToEnd = r0
                r10.goneLeftMargin = r0
                r10.goneTopMargin = r0
                r10.goneRightMargin = r0
                r10.goneBottomMargin = r0
                r10.goneStartMargin = r0
                r10.goneEndMargin = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r10.horizontalBias = r4
                r10.verticalBias = r4
                r5 = 0
                r10.dimensionRatio = r5
                r10.dimensionRatioValue = r3
                r6 = 1
                r10.dimensionRatioSide = r6
                r10.horizontalWeight = r1
                r10.verticalWeight = r1
                r10.horizontalChainStyle = r2
                r10.verticalChainStyle = r2
                r10.matchConstraintDefaultWidth = r2
                r10.matchConstraintDefaultHeight = r2
                r10.matchConstraintMinWidth = r2
                r10.matchConstraintMinHeight = r2
                r10.matchConstraintMaxWidth = r2
                r10.matchConstraintMaxHeight = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r10.matchConstraintPercentWidth = r1
                r10.matchConstraintPercentHeight = r1
                r10.editorAbsoluteX = r0
                r10.editorAbsoluteY = r0
                r10.orientation = r0
                r10.constrainedWidth = r2
                r10.constrainedHeight = r2
                r10.constraintTag = r5
                r10.horizontalDimensionFixed = r6
                r10.verticalDimensionFixed = r6
                r10.needsBaseline = r2
                r10.isGuideline = r2
                r10.isHelper = r2
                r10.isInPlaceholder = r2
                r10.isVirtualGroup = r2
                r10.resolvedLeftToLeft = r0
                r10.resolvedLeftToRight = r0
                r10.resolvedRightToLeft = r0
                r10.resolvedRightToRight = r0
                r10.resolveGoneLeftMargin = r0
                r10.resolveGoneRightMargin = r0
                r10.resolvedHorizontalBias = r4
                androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = new androidx.constraintlayout.solver.widgets.ConstraintWidget
                r1.<init>()
                r10.widget = r1
                r10.helped = r2
                int[] r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout
                android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1)
                int r12 = r11.getIndexCount()
                r1 = r2
            L_0x009e:
                if (r1 >= r12) goto L_0x03c5
                int r4 = r11.getIndex(r1)
                android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.Table.map
                int r5 = r5.get(r4)
                java.lang.String r7 = "ConstraintLayout"
                r8 = 2
                r9 = -2
                switch(r5) {
                    case 1: goto L_0x03b9;
                    case 2: goto L_0x03a8;
                    case 3: goto L_0x039f;
                    case 4: goto L_0x038a;
                    case 5: goto L_0x0381;
                    case 6: goto L_0x0378;
                    case 7: goto L_0x036f;
                    case 8: goto L_0x035e;
                    case 9: goto L_0x034d;
                    case 10: goto L_0x033b;
                    case 11: goto L_0x0329;
                    case 12: goto L_0x0317;
                    case 13: goto L_0x0305;
                    case 14: goto L_0x02f3;
                    case 15: goto L_0x02e1;
                    case 16: goto L_0x02cf;
                    case 17: goto L_0x02bd;
                    case 18: goto L_0x02ab;
                    case 19: goto L_0x0299;
                    case 20: goto L_0x0287;
                    case 21: goto L_0x027d;
                    case 22: goto L_0x0273;
                    case 23: goto L_0x0269;
                    case 24: goto L_0x025f;
                    case 25: goto L_0x0255;
                    case 26: goto L_0x024b;
                    case 27: goto L_0x0241;
                    case 28: goto L_0x0237;
                    case 29: goto L_0x022d;
                    case 30: goto L_0x0223;
                    case 31: goto L_0x0214;
                    case 32: goto L_0x0209;
                    case 33: goto L_0x01f3;
                    case 34: goto L_0x01dd;
                    case 35: goto L_0x01cd;
                    case 36: goto L_0x01b7;
                    case 37: goto L_0x01a1;
                    case 38: goto L_0x0191;
                    default: goto L_0x00b1;
                }
            L_0x00b1:
                switch(r5) {
                    case 44: goto L_0x00f6;
                    case 45: goto L_0x00ec;
                    case 46: goto L_0x00e2;
                    case 47: goto L_0x00da;
                    case 48: goto L_0x00d2;
                    case 49: goto L_0x00c8;
                    case 50: goto L_0x00be;
                    case 51: goto L_0x00b6;
                    default: goto L_0x00b4;
                }
            L_0x00b4:
                goto L_0x03c1
            L_0x00b6:
                java.lang.String r4 = r11.getString(r4)
                r10.constraintTag = r4
                goto L_0x03c1
            L_0x00be:
                int r5 = r10.editorAbsoluteY
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.editorAbsoluteY = r4
                goto L_0x03c1
            L_0x00c8:
                int r5 = r10.editorAbsoluteX
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.editorAbsoluteX = r4
                goto L_0x03c1
            L_0x00d2:
                int r4 = r11.getInt(r4, r2)
                r10.verticalChainStyle = r4
                goto L_0x03c1
            L_0x00da:
                int r4 = r11.getInt(r4, r2)
                r10.horizontalChainStyle = r4
                goto L_0x03c1
            L_0x00e2:
                float r5 = r10.verticalWeight
                float r4 = r11.getFloat(r4, r5)
                r10.verticalWeight = r4
                goto L_0x03c1
            L_0x00ec:
                float r5 = r10.horizontalWeight
                float r4 = r11.getFloat(r4, r5)
                r10.horizontalWeight = r4
                goto L_0x03c1
            L_0x00f6:
                java.lang.String r4 = r11.getString(r4)
                r10.dimensionRatio = r4
                r5 = 2143289344(0x7fc00000, float:NaN)
                r10.dimensionRatioValue = r5
                r10.dimensionRatioSide = r0
                if (r4 == 0) goto L_0x03c1
                int r4 = r4.length()
                java.lang.String r5 = r10.dimensionRatio
                r7 = 44
                int r5 = r5.indexOf(r7)
                if (r5 <= 0) goto L_0x0134
                int r7 = r4 + -1
                if (r5 >= r7) goto L_0x0134
                java.lang.String r7 = r10.dimensionRatio
                java.lang.String r7 = r7.substring(r2, r5)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x0127
                r10.dimensionRatioSide = r2
                goto L_0x0131
            L_0x0127:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L_0x0131
                r10.dimensionRatioSide = r6
            L_0x0131:
                int r5 = r5 + 1
                goto L_0x0135
            L_0x0134:
                r5 = r2
            L_0x0135:
                java.lang.String r7 = r10.dimensionRatio
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L_0x0180
                int r4 = r4 + -1
                if (r7 >= r4) goto L_0x0180
                java.lang.String r4 = r10.dimensionRatio
                java.lang.String r4 = r4.substring(r5, r7)
                java.lang.String r5 = r10.dimensionRatio
                int r7 = r7 + 1
                java.lang.String r5 = r5.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x03c1
                int r7 = r5.length()
                if (r7 <= 0) goto L_0x03c1
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03c1 }
                float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x03c1 }
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03c1
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03c1
                int r7 = r10.dimensionRatioSide     // Catch:{ NumberFormatException -> 0x03c1 }
                if (r7 != r6) goto L_0x017a
                float r5 = r5 / r4
                float r4 = java.lang.Math.abs(r5)     // Catch:{ NumberFormatException -> 0x03c1 }
            L_0x0176:
                r10.dimensionRatioValue = r4     // Catch:{ NumberFormatException -> 0x03c1 }
                goto L_0x03c1
            L_0x017a:
                float r4 = r4 / r5
                float r4 = java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03c1 }
                goto L_0x0176
            L_0x0180:
                java.lang.String r4 = r10.dimensionRatio
                java.lang.String r4 = r4.substring(r5)
                int r5 = r4.length()
                if (r5 <= 0) goto L_0x03c1
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03c1 }
                goto L_0x0176
            L_0x0191:
                float r5 = r10.matchConstraintPercentHeight
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.matchConstraintPercentHeight = r4
                r10.matchConstraintDefaultHeight = r8
                goto L_0x03c1
            L_0x01a1:
                int r5 = r10.matchConstraintMaxHeight     // Catch:{ Exception -> 0x01ab }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01ab }
                r10.matchConstraintMaxHeight = r5     // Catch:{ Exception -> 0x01ab }
                goto L_0x03c1
            L_0x01ab:
                int r5 = r10.matchConstraintMaxHeight
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03c1
                r10.matchConstraintMaxHeight = r9
                goto L_0x03c1
            L_0x01b7:
                int r5 = r10.matchConstraintMinHeight     // Catch:{ Exception -> 0x01c1 }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01c1 }
                r10.matchConstraintMinHeight = r5     // Catch:{ Exception -> 0x01c1 }
                goto L_0x03c1
            L_0x01c1:
                int r5 = r10.matchConstraintMinHeight
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03c1
                r10.matchConstraintMinHeight = r9
                goto L_0x03c1
            L_0x01cd:
                float r5 = r10.matchConstraintPercentWidth
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.matchConstraintPercentWidth = r4
                r10.matchConstraintDefaultWidth = r8
                goto L_0x03c1
            L_0x01dd:
                int r5 = r10.matchConstraintMaxWidth     // Catch:{ Exception -> 0x01e7 }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01e7 }
                r10.matchConstraintMaxWidth = r5     // Catch:{ Exception -> 0x01e7 }
                goto L_0x03c1
            L_0x01e7:
                int r5 = r10.matchConstraintMaxWidth
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03c1
                r10.matchConstraintMaxWidth = r9
                goto L_0x03c1
            L_0x01f3:
                int r5 = r10.matchConstraintMinWidth     // Catch:{ Exception -> 0x01fd }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01fd }
                r10.matchConstraintMinWidth = r5     // Catch:{ Exception -> 0x01fd }
                goto L_0x03c1
            L_0x01fd:
                int r5 = r10.matchConstraintMinWidth
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03c1
                r10.matchConstraintMinWidth = r9
                goto L_0x03c1
            L_0x0209:
                int r4 = r11.getInt(r4, r2)
                r10.matchConstraintDefaultHeight = r4
                if (r4 != r6) goto L_0x03c1
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x021e
            L_0x0214:
                int r4 = r11.getInt(r4, r2)
                r10.matchConstraintDefaultWidth = r4
                if (r4 != r6) goto L_0x03c1
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x021e:
                android.util.Log.e(r7, r4)
                goto L_0x03c1
            L_0x0223:
                float r5 = r10.verticalBias
                float r4 = r11.getFloat(r4, r5)
                r10.verticalBias = r4
                goto L_0x03c1
            L_0x022d:
                float r5 = r10.horizontalBias
                float r4 = r11.getFloat(r4, r5)
                r10.horizontalBias = r4
                goto L_0x03c1
            L_0x0237:
                boolean r5 = r10.constrainedHeight
                boolean r4 = r11.getBoolean(r4, r5)
                r10.constrainedHeight = r4
                goto L_0x03c1
            L_0x0241:
                boolean r5 = r10.constrainedWidth
                boolean r4 = r11.getBoolean(r4, r5)
                r10.constrainedWidth = r4
                goto L_0x03c1
            L_0x024b:
                int r5 = r10.goneEndMargin
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.goneEndMargin = r4
                goto L_0x03c1
            L_0x0255:
                int r5 = r10.goneStartMargin
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.goneStartMargin = r4
                goto L_0x03c1
            L_0x025f:
                int r5 = r10.goneBottomMargin
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.goneBottomMargin = r4
                goto L_0x03c1
            L_0x0269:
                int r5 = r10.goneRightMargin
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.goneRightMargin = r4
                goto L_0x03c1
            L_0x0273:
                int r5 = r10.goneTopMargin
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.goneTopMargin = r4
                goto L_0x03c1
            L_0x027d:
                int r5 = r10.goneLeftMargin
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.goneLeftMargin = r4
                goto L_0x03c1
            L_0x0287:
                int r5 = r10.endToEnd
                int r5 = r11.getResourceId(r4, r5)
                r10.endToEnd = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.endToEnd = r4
                goto L_0x03c1
            L_0x0299:
                int r5 = r10.endToStart
                int r5 = r11.getResourceId(r4, r5)
                r10.endToStart = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.endToStart = r4
                goto L_0x03c1
            L_0x02ab:
                int r5 = r10.startToStart
                int r5 = r11.getResourceId(r4, r5)
                r10.startToStart = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.startToStart = r4
                goto L_0x03c1
            L_0x02bd:
                int r5 = r10.startToEnd
                int r5 = r11.getResourceId(r4, r5)
                r10.startToEnd = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.startToEnd = r4
                goto L_0x03c1
            L_0x02cf:
                int r5 = r10.baselineToBaseline
                int r5 = r11.getResourceId(r4, r5)
                r10.baselineToBaseline = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.baselineToBaseline = r4
                goto L_0x03c1
            L_0x02e1:
                int r5 = r10.bottomToBottom
                int r5 = r11.getResourceId(r4, r5)
                r10.bottomToBottom = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.bottomToBottom = r4
                goto L_0x03c1
            L_0x02f3:
                int r5 = r10.bottomToTop
                int r5 = r11.getResourceId(r4, r5)
                r10.bottomToTop = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.bottomToTop = r4
                goto L_0x03c1
            L_0x0305:
                int r5 = r10.topToBottom
                int r5 = r11.getResourceId(r4, r5)
                r10.topToBottom = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.topToBottom = r4
                goto L_0x03c1
            L_0x0317:
                int r5 = r10.topToTop
                int r5 = r11.getResourceId(r4, r5)
                r10.topToTop = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.topToTop = r4
                goto L_0x03c1
            L_0x0329:
                int r5 = r10.rightToRight
                int r5 = r11.getResourceId(r4, r5)
                r10.rightToRight = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.rightToRight = r4
                goto L_0x03c1
            L_0x033b:
                int r5 = r10.rightToLeft
                int r5 = r11.getResourceId(r4, r5)
                r10.rightToLeft = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.rightToLeft = r4
                goto L_0x03c1
            L_0x034d:
                int r5 = r10.leftToRight
                int r5 = r11.getResourceId(r4, r5)
                r10.leftToRight = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.leftToRight = r4
                goto L_0x03c1
            L_0x035e:
                int r5 = r10.leftToLeft
                int r5 = r11.getResourceId(r4, r5)
                r10.leftToLeft = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.leftToLeft = r4
                goto L_0x03c1
            L_0x036f:
                float r5 = r10.guidePercent
                float r4 = r11.getFloat(r4, r5)
                r10.guidePercent = r4
                goto L_0x03c1
            L_0x0378:
                int r5 = r10.guideEnd
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.guideEnd = r4
                goto L_0x03c1
            L_0x0381:
                int r5 = r10.guideBegin
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.guideBegin = r4
                goto L_0x03c1
            L_0x038a:
                float r5 = r10.circleAngle
                float r4 = r11.getFloat(r4, r5)
                r5 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r5
                r10.circleAngle = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x03c1
                float r4 = r5 - r4
                float r4 = r4 % r5
                r10.circleAngle = r4
                goto L_0x03c1
            L_0x039f:
                int r5 = r10.circleRadius
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.circleRadius = r4
                goto L_0x03c1
            L_0x03a8:
                int r5 = r10.circleConstraint
                int r5 = r11.getResourceId(r4, r5)
                r10.circleConstraint = r5
                if (r5 != r0) goto L_0x03c1
                int r4 = r11.getInt(r4, r0)
                r10.circleConstraint = r4
                goto L_0x03c1
            L_0x03b9:
                int r5 = r10.orientation
                int r4 = r11.getInt(r4, r5)
                r10.orientation = r4
            L_0x03c1:
                int r1 = r1 + 1
                goto L_0x009e
            L_0x03c5:
                r11.recycle()
                r10.validate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = layoutParams.guideBegin;
            this.guideEnd = layoutParams.guideEnd;
            this.guidePercent = layoutParams.guidePercent;
            this.leftToLeft = layoutParams.leftToLeft;
            this.leftToRight = layoutParams.leftToRight;
            this.rightToLeft = layoutParams.rightToLeft;
            this.rightToRight = layoutParams.rightToRight;
            this.topToTop = layoutParams.topToTop;
            this.topToBottom = layoutParams.topToBottom;
            this.bottomToTop = layoutParams.bottomToTop;
            this.bottomToBottom = layoutParams.bottomToBottom;
            this.baselineToBaseline = layoutParams.baselineToBaseline;
            this.circleConstraint = layoutParams.circleConstraint;
            this.circleRadius = layoutParams.circleRadius;
            this.circleAngle = layoutParams.circleAngle;
            this.startToEnd = layoutParams.startToEnd;
            this.startToStart = layoutParams.startToStart;
            this.endToStart = layoutParams.endToStart;
            this.endToEnd = layoutParams.endToEnd;
            this.goneLeftMargin = layoutParams.goneLeftMargin;
            this.goneTopMargin = layoutParams.goneTopMargin;
            this.goneRightMargin = layoutParams.goneRightMargin;
            this.goneBottomMargin = layoutParams.goneBottomMargin;
            this.goneStartMargin = layoutParams.goneStartMargin;
            this.goneEndMargin = layoutParams.goneEndMargin;
            this.horizontalBias = layoutParams.horizontalBias;
            this.verticalBias = layoutParams.verticalBias;
            this.dimensionRatio = layoutParams.dimensionRatio;
            this.dimensionRatioValue = layoutParams.dimensionRatioValue;
            this.dimensionRatioSide = layoutParams.dimensionRatioSide;
            this.horizontalWeight = layoutParams.horizontalWeight;
            this.verticalWeight = layoutParams.verticalWeight;
            this.horizontalChainStyle = layoutParams.horizontalChainStyle;
            this.verticalChainStyle = layoutParams.verticalChainStyle;
            this.constrainedWidth = layoutParams.constrainedWidth;
            this.constrainedHeight = layoutParams.constrainedHeight;
            this.matchConstraintDefaultWidth = layoutParams.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = layoutParams.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = layoutParams.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = layoutParams.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = layoutParams.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = layoutParams.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = layoutParams.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = layoutParams.matchConstraintPercentHeight;
            this.editorAbsoluteX = layoutParams.editorAbsoluteX;
            this.editorAbsoluteY = layoutParams.editorAbsoluteY;
            this.orientation = layoutParams.orientation;
            this.horizontalDimensionFixed = layoutParams.horizontalDimensionFixed;
            this.verticalDimensionFixed = layoutParams.verticalDimensionFixed;
            this.needsBaseline = layoutParams.needsBaseline;
            this.isGuideline = layoutParams.isGuideline;
            this.resolvedLeftToLeft = layoutParams.resolvedLeftToLeft;
            this.resolvedLeftToRight = layoutParams.resolvedLeftToRight;
            this.resolvedRightToLeft = layoutParams.resolvedRightToLeft;
            this.resolvedRightToRight = layoutParams.resolvedRightToRight;
            this.resolveGoneLeftMargin = layoutParams.resolveGoneLeftMargin;
            this.resolveGoneRightMargin = layoutParams.resolveGoneRightMargin;
            this.resolvedHorizontalBias = layoutParams.resolvedHorizontalBias;
            this.constraintTag = layoutParams.constraintTag;
            this.widget = layoutParams.widget;
        }

        public String getConstraintTag() {
            return this.constraintTag;
        }

        public ConstraintWidget getConstraintWidget() {
            return this.widget;
        }

        public void reset() {
            ConstraintWidget constraintWidget = this.widget;
            if (constraintWidget != null) {
                constraintWidget.reset();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ce, code lost:
            if (r1 > 0) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00dd, code lost:
            if (r1 > 0) goto L_0x00d0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00ef  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r10) {
            /*
                r9 = this;
                int r0 = r9.leftMargin
                int r1 = r9.rightMargin
                super.resolveLayoutDirection(r10)
                int r10 = r9.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r10) goto L_0x0011
                r10 = r3
                goto L_0x0012
            L_0x0011:
                r10 = r2
            L_0x0012:
                r4 = -1
                r9.resolvedRightToLeft = r4
                r9.resolvedRightToRight = r4
                r9.resolvedLeftToLeft = r4
                r9.resolvedLeftToRight = r4
                r9.resolveGoneLeftMargin = r4
                r9.resolveGoneRightMargin = r4
                int r5 = r9.goneLeftMargin
                r9.resolveGoneLeftMargin = r5
                int r5 = r9.goneRightMargin
                r9.resolveGoneRightMargin = r5
                float r5 = r9.horizontalBias
                r9.resolvedHorizontalBias = r5
                int r6 = r9.guideBegin
                r9.resolvedGuideBegin = r6
                int r7 = r9.guideEnd
                r9.resolvedGuideEnd = r7
                float r8 = r9.guidePercent
                r9.resolvedGuidePercent = r8
                if (r10 == 0) goto L_0x0090
                int r10 = r9.startToEnd
                if (r10 == r4) goto L_0x0041
                r9.resolvedRightToLeft = r10
            L_0x003f:
                r2 = r3
                goto L_0x0048
            L_0x0041:
                int r10 = r9.startToStart
                if (r10 == r4) goto L_0x0048
                r9.resolvedRightToRight = r10
                goto L_0x003f
            L_0x0048:
                int r10 = r9.endToStart
                if (r10 == r4) goto L_0x004f
                r9.resolvedLeftToRight = r10
                r2 = r3
            L_0x004f:
                int r10 = r9.endToEnd
                if (r10 == r4) goto L_0x0056
                r9.resolvedLeftToLeft = r10
                r2 = r3
            L_0x0056:
                int r10 = r9.goneStartMargin
                if (r10 == r4) goto L_0x005c
                r9.resolveGoneRightMargin = r10
            L_0x005c:
                int r10 = r9.goneEndMargin
                if (r10 == r4) goto L_0x0062
                r9.resolveGoneLeftMargin = r10
            L_0x0062:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x006a
                float r2 = r10 - r5
                r9.resolvedHorizontalBias = r2
            L_0x006a:
                boolean r2 = r9.isGuideline
                if (r2 == 0) goto L_0x00b4
                int r2 = r9.orientation
                if (r2 != r3) goto L_0x00b4
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0080
                float r10 = r10 - r8
                r9.resolvedGuidePercent = r10
                r9.resolvedGuideBegin = r4
                r9.resolvedGuideEnd = r4
                goto L_0x00b4
            L_0x0080:
                if (r6 == r4) goto L_0x0089
                r9.resolvedGuideEnd = r6
                r9.resolvedGuideBegin = r4
            L_0x0086:
                r9.resolvedGuidePercent = r2
                goto L_0x00b4
            L_0x0089:
                if (r7 == r4) goto L_0x00b4
                r9.resolvedGuideBegin = r7
                r9.resolvedGuideEnd = r4
                goto L_0x0086
            L_0x0090:
                int r10 = r9.startToEnd
                if (r10 == r4) goto L_0x0096
                r9.resolvedLeftToRight = r10
            L_0x0096:
                int r10 = r9.startToStart
                if (r10 == r4) goto L_0x009c
                r9.resolvedLeftToLeft = r10
            L_0x009c:
                int r10 = r9.endToStart
                if (r10 == r4) goto L_0x00a2
                r9.resolvedRightToLeft = r10
            L_0x00a2:
                int r10 = r9.endToEnd
                if (r10 == r4) goto L_0x00a8
                r9.resolvedRightToRight = r10
            L_0x00a8:
                int r10 = r9.goneStartMargin
                if (r10 == r4) goto L_0x00ae
                r9.resolveGoneLeftMargin = r10
            L_0x00ae:
                int r10 = r9.goneEndMargin
                if (r10 == r4) goto L_0x00b4
                r9.resolveGoneRightMargin = r10
            L_0x00b4:
                int r10 = r9.endToStart
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.endToEnd
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.startToStart
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.startToEnd
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.rightToLeft
                if (r10 == r4) goto L_0x00d3
                r9.resolvedRightToLeft = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00e0
                if (r1 <= 0) goto L_0x00e0
            L_0x00d0:
                r9.rightMargin = r1
                goto L_0x00e0
            L_0x00d3:
                int r10 = r9.rightToRight
                if (r10 == r4) goto L_0x00e0
                r9.resolvedRightToRight = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00e0
                if (r1 <= 0) goto L_0x00e0
                goto L_0x00d0
            L_0x00e0:
                int r10 = r9.leftToLeft
                if (r10 == r4) goto L_0x00ef
                r9.resolvedLeftToLeft = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00fc
                if (r0 <= 0) goto L_0x00fc
            L_0x00ec:
                r9.leftMargin = r0
                goto L_0x00fc
            L_0x00ef:
                int r10 = r9.leftToRight
                if (r10 == r4) goto L_0x00fc
                r9.resolvedLeftToRight = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00fc
                if (r0 <= 0) goto L_0x00fc
                goto L_0x00ec
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public void setWidgetDebugName(String str) {
            this.widget.setDebugName(str);
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            int i2 = this.width;
            if (i2 == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            int i3 = this.height;
            if (i3 == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.horizontalDimensionFixed = false;
                if (i2 == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.verticalDimensionFixed = false;
                if (i3 == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent != -1.0f || this.guideBegin != -1 || this.guideEnd != -1) {
                this.isGuideline = true;
                this.horizontalDimensionFixed = true;
                this.verticalDimensionFixed = true;
                if (!(this.widget instanceof Guideline)) {
                    this.widget = new Guideline();
                }
                ((Guideline) this.widget).setOrientation(this.orientation);
            }
        }
    }

    public class Measurer implements BasicMeasure.Measurer {
        public ConstraintLayout layout;
        public int layoutHeightSpec;
        public int layoutWidthSpec;
        public int paddingBottom;
        public int paddingHeight;
        public int paddingTop;
        public int paddingWidth;

        public Measurer(ConstraintLayout constraintLayout) {
            this.layout = constraintLayout;
        }

        private boolean isSimilarSpec(int i2, int i3, int i4) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
            }
            return false;
        }

        public void captureLayoutInfos(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.paddingTop = i4;
            this.paddingBottom = i5;
            this.paddingWidth = i6;
            this.paddingHeight = i7;
            this.layoutWidthSpec = i2;
            this.layoutHeightSpec = i3;
        }

        public final void didMeasures() {
            int childCount = this.layout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.layout.getChildAt(i2);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).updatePostMeasure(this.layout);
                }
            }
            int size = this.layout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ((ConstraintHelper) this.layout.mConstraintHelpers.get(i3)).updatePostMeasure(this.layout);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: int[]} */
        /* JADX WARNING: type inference failed for: r16v1 */
        /* JADX WARNING: type inference failed for: r16v2 */
        /* JADX WARNING: type inference failed for: r16v3 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x01c0  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x01c2  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x01cc  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01d6  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x01d8  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01e1  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x01ee A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x020b  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x0215  */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x0229  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0234  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x0240  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x024a  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x0257  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x025c  */
        /* JADX WARNING: Removed duplicated region for block: B:151:0x0261  */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x0269  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x0270  */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x0277  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x0288  */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x02a3 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:174:0x02ae  */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x02b3  */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x02b7  */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x02d1  */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x02d3  */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x02de  */
        /* JADX WARNING: Removed duplicated region for block: B:187:0x02e1  */
        /* JADX WARNING: Removed duplicated region for block: B:190:0x02e8  */
        /* JADX WARNING: Removed duplicated region for block: B:191:0x02ea  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x011d  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0193  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0195  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0198  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x01b4  */
        /* JADX WARNING: Unknown variable types count: 1 */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void measure(androidx.constraintlayout.solver.widgets.ConstraintWidget r20, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure r21) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r20.getVisibility()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001f
                boolean r3 = r20.isInPlaceholder()
                if (r3 != 0) goto L_0x001f
                r2.measuredWidth = r5
                r2.measuredHeight = r5
                r2.measuredBaseline = r5
                return
            L_0x001f:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.horizontalBehavior
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r2.verticalBehavior
                int r6 = r2.horizontalDimension
                int r7 = r2.verticalDimension
                int r8 = r0.paddingTop
                int r9 = r0.paddingBottom
                int r8 = r8 + r9
                int r9 = r0.paddingWidth
                java.lang.Object r10 = r20.getCompanionWidget()
                android.view.View r10 = (android.view.View) r10
                int r11 = r3.ordinal()
                r12 = -1
                r13 = -2
                r15 = 3
                r14 = 2
                r5 = 1
                if (r11 == 0) goto L_0x00a5
                if (r11 == r5) goto L_0x0097
                if (r11 == r14) goto L_0x0059
                if (r11 == r15) goto L_0x0049
                r6 = 0
            L_0x0046:
                r9 = 0
                goto L_0x00b1
            L_0x0049:
                int r6 = r0.layoutWidthSpec
                int r11 = r20.getHorizontalMargin()
                int r11 = r11 + r9
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r11, r12)
                int[] r9 = r1.wrapMeasure
                r9[r14] = r12
                goto L_0x0046
            L_0x0059:
                int r6 = r0.layoutWidthSpec
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r13)
                int r9 = r1.mMatchConstraintDefaultWidth
                if (r9 != r5) goto L_0x0065
                r9 = r5
                goto L_0x0066
            L_0x0065:
                r9 = 0
            L_0x0066:
                int[] r11 = r1.wrapMeasure
                r16 = 0
                r11[r14] = r16
                boolean r12 = r2.useCurrentDimensions
                if (r12 == 0) goto L_0x0094
                if (r9 == 0) goto L_0x007e
                r12 = r11[r15]
                if (r12 == 0) goto L_0x007e
                r11 = r11[r16]
                int r12 = r20.getWidth()
                if (r11 != r12) goto L_0x0082
            L_0x007e:
                boolean r11 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r11 == 0) goto L_0x0084
            L_0x0082:
                r11 = r5
                goto L_0x0085
            L_0x0084:
                r11 = 0
            L_0x0085:
                if (r9 == 0) goto L_0x0089
                if (r11 == 0) goto L_0x0094
            L_0x0089:
                int r6 = r20.getWidth()
                r11 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
                goto L_0x0046
            L_0x0094:
                r11 = 1073741824(0x40000000, float:2.0)
                goto L_0x00a3
            L_0x0097:
                r11 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.layoutWidthSpec
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r13)
                int[] r9 = r1.wrapMeasure
                r9[r14] = r13
            L_0x00a3:
                r9 = r5
                goto L_0x00b1
            L_0x00a5:
                r11 = 1073741824(0x40000000, float:2.0)
                int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
                int[] r11 = r1.wrapMeasure
                r11[r14] = r6
                r6 = r9
                goto L_0x0046
            L_0x00b1:
                int r11 = r4.ordinal()
                if (r11 == 0) goto L_0x011d
                if (r11 == r5) goto L_0x010f
                if (r11 == r14) goto L_0x00d2
                if (r11 == r15) goto L_0x00c1
                r7 = 0
            L_0x00be:
                r8 = 0
                goto L_0x0129
            L_0x00c1:
                int r7 = r0.layoutHeightSpec
                int r11 = r20.getVerticalMargin()
                int r11 = r11 + r8
                r8 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r11, r8)
                int[] r11 = r1.wrapMeasure
                r11[r15] = r8
                goto L_0x00be
            L_0x00d2:
                int r7 = r0.layoutHeightSpec
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r13)
                int r8 = r1.mMatchConstraintDefaultHeight
                if (r8 != r5) goto L_0x00de
                r8 = r5
                goto L_0x00df
            L_0x00de:
                r8 = 0
            L_0x00df:
                int[] r11 = r1.wrapMeasure
                r12 = 0
                r11[r15] = r12
                boolean r12 = r2.useCurrentDimensions
                if (r12 == 0) goto L_0x010c
                if (r8 == 0) goto L_0x00f6
                r12 = r11[r14]
                if (r12 == 0) goto L_0x00f6
                r11 = r11[r5]
                int r12 = r20.getHeight()
                if (r11 != r12) goto L_0x00fa
            L_0x00f6:
                boolean r11 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r11 == 0) goto L_0x00fc
            L_0x00fa:
                r11 = r5
                goto L_0x00fd
            L_0x00fc:
                r11 = 0
            L_0x00fd:
                if (r8 == 0) goto L_0x0101
                if (r11 == 0) goto L_0x010c
            L_0x0101:
                int r7 = r20.getHeight()
                r11 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r11)
                goto L_0x00be
            L_0x010c:
                r11 = 1073741824(0x40000000, float:2.0)
                goto L_0x011b
            L_0x010f:
                r11 = 1073741824(0x40000000, float:2.0)
                int r7 = r0.layoutHeightSpec
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r13)
                int[] r8 = r1.wrapMeasure
                r8[r15] = r13
            L_0x011b:
                r8 = r5
                goto L_0x0129
            L_0x011d:
                r11 = 1073741824(0x40000000, float:2.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r11)
                int[] r11 = r1.wrapMeasure
                r11[r15] = r7
                r7 = r8
                goto L_0x00be
            L_0x0129:
                androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r20.getParent()
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r11 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r11
                if (r11 == 0) goto L_0x01ab
                androidx.constraintlayout.widget.ConstraintLayout r12 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r12 = r12.mOptimizationLevel
                r13 = 256(0x100, float:3.59E-43)
                boolean r12 = androidx.constraintlayout.solver.widgets.Optimizer.enabled(r12, r13)
                if (r12 == 0) goto L_0x01ab
                int r12 = r10.getMeasuredWidth()
                int r13 = r20.getWidth()
                if (r12 != r13) goto L_0x01ab
                int r12 = r10.getMeasuredWidth()
                int r13 = r11.getWidth()
                if (r12 >= r13) goto L_0x01ab
                int r12 = r10.getMeasuredHeight()
                int r13 = r20.getHeight()
                if (r12 != r13) goto L_0x01ab
                int r12 = r10.getMeasuredHeight()
                int r11 = r11.getHeight()
                if (r12 >= r11) goto L_0x01ab
                int r11 = r10.getBaseline()
                int r12 = r20.getBaselineDistance()
                if (r11 != r12) goto L_0x01ab
                boolean r11 = r20.isMeasureRequested()
                if (r11 != 0) goto L_0x01ab
                int r11 = r20.getLastHorizontalMeasureSpec()
                int r12 = r20.getWidth()
                boolean r11 = r0.isSimilarSpec(r11, r6, r12)
                if (r11 == 0) goto L_0x0195
                int r11 = r20.getLastVerticalMeasureSpec()
                int r12 = r20.getHeight()
                boolean r11 = r0.isSimilarSpec(r11, r7, r12)
                if (r11 == 0) goto L_0x0195
                r11 = r5
                goto L_0x0196
            L_0x0195:
                r11 = 0
            L_0x0196:
                if (r11 == 0) goto L_0x01ab
                int r3 = r20.getWidth()
                r2.measuredWidth = r3
                int r3 = r20.getHeight()
                r2.measuredHeight = r3
                int r1 = r20.getBaselineDistance()
                r2.measuredBaseline = r1
                return
            L_0x01ab:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r3 != r11) goto L_0x01b1
                r12 = r5
                goto L_0x01b2
            L_0x01b1:
                r12 = 0
            L_0x01b2:
                if (r4 != r11) goto L_0x01b6
                r11 = r5
                goto L_0x01b7
            L_0x01b6:
                r11 = 0
            L_0x01b7:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                if (r4 == r13) goto L_0x01c2
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r4 != r15) goto L_0x01c0
                goto L_0x01c2
            L_0x01c0:
                r4 = 0
                goto L_0x01c3
            L_0x01c2:
                r4 = r5
            L_0x01c3:
                if (r3 == r13) goto L_0x01cc
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r3 != r13) goto L_0x01ca
                goto L_0x01cc
            L_0x01ca:
                r3 = 0
                goto L_0x01cd
            L_0x01cc:
                r3 = r5
            L_0x01cd:
                r13 = 0
                if (r12 == 0) goto L_0x01d8
                float r15 = r1.mDimensionRatio
                int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                if (r15 <= 0) goto L_0x01d8
                r15 = r5
                goto L_0x01d9
            L_0x01d8:
                r15 = 0
            L_0x01d9:
                if (r11 == 0) goto L_0x01e3
                float r5 = r1.mDimensionRatio
                int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                if (r5 <= 0) goto L_0x01e3
                r5 = 1
                goto L_0x01e4
            L_0x01e3:
                r5 = 0
            L_0x01e4:
                android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r13 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r13
                boolean r14 = r2.useCurrentDimensions
                if (r14 != 0) goto L_0x0203
                if (r12 == 0) goto L_0x0203
                int r12 = r1.mMatchConstraintDefaultWidth
                if (r12 != 0) goto L_0x0203
                if (r11 == 0) goto L_0x0203
                int r11 = r1.mMatchConstraintDefaultHeight
                if (r11 == 0) goto L_0x01fb
                goto L_0x0203
            L_0x01fb:
                r0 = 0
                r3 = 0
                r4 = -1
                r14 = 0
                r16 = 0
                goto L_0x02cf
            L_0x0203:
                boolean r11 = r10 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r11 == 0) goto L_0x0215
                boolean r11 = r1 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout
                if (r11 == 0) goto L_0x0215
                r11 = r1
                androidx.constraintlayout.solver.widgets.VirtualLayout r11 = (androidx.constraintlayout.solver.widgets.VirtualLayout) r11
                r12 = r10
                androidx.constraintlayout.widget.VirtualLayout r12 = (androidx.constraintlayout.widget.VirtualLayout) r12
                r12.onMeasure(r11, r6, r7)
                goto L_0x021b
            L_0x0215:
                r10.measure(r6, r7)
                r1.setLastMeasureSpec(r6, r7)
            L_0x021b:
                int r11 = r10.getMeasuredWidth()
                int r12 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                if (r9 == 0) goto L_0x0234
                int[] r9 = r1.wrapMeasure
                r16 = 0
                r9[r16] = r11
                r18 = 2
                r9[r18] = r12
                goto L_0x023e
            L_0x0234:
                r16 = 0
                r18 = 2
                int[] r9 = r1.wrapMeasure
                r9[r16] = r16
                r9[r18] = r16
            L_0x023e:
                if (r8 == 0) goto L_0x024a
                int[] r8 = r1.wrapMeasure
                r9 = 1
                r8[r9] = r12
                r17 = 3
                r8[r17] = r11
                goto L_0x0253
            L_0x024a:
                r9 = 1
                r17 = 3
                int[] r8 = r1.wrapMeasure
                r8[r9] = r16
                r8[r17] = r16
            L_0x0253:
                int r8 = r1.mMatchConstraintMinWidth
                if (r8 <= 0) goto L_0x025c
                int r8 = java.lang.Math.max(r8, r11)
                goto L_0x025d
            L_0x025c:
                r8 = r11
            L_0x025d:
                int r9 = r1.mMatchConstraintMaxWidth
                if (r9 <= 0) goto L_0x0265
                int r8 = java.lang.Math.min(r9, r8)
            L_0x0265:
                int r9 = r1.mMatchConstraintMinHeight
                if (r9 <= 0) goto L_0x0270
                int r9 = java.lang.Math.max(r9, r12)
                r17 = r6
                goto L_0x0273
            L_0x0270:
                r17 = r6
                r9 = r12
            L_0x0273:
                int r6 = r1.mMatchConstraintMaxHeight
                if (r6 <= 0) goto L_0x027b
                int r9 = java.lang.Math.min(r6, r9)
            L_0x027b:
                androidx.constraintlayout.widget.ConstraintLayout r6 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r6 = r6.mOptimizationLevel
                r0 = 1
                boolean r6 = androidx.constraintlayout.solver.widgets.Optimizer.enabled(r6, r0)
                if (r6 != 0) goto L_0x02a1
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r15 == 0) goto L_0x0296
                if (r4 == 0) goto L_0x0296
                float r3 = r1.mDimensionRatio
                float r4 = (float) r9
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r8 = r0
                goto L_0x02a1
            L_0x0296:
                if (r5 == 0) goto L_0x02a1
                if (r3 == 0) goto L_0x02a1
                float r3 = r1.mDimensionRatio
                float r4 = (float) r8
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r9 = r0
            L_0x02a1:
                if (r11 != r8) goto L_0x02aa
                if (r12 == r9) goto L_0x02a6
                goto L_0x02aa
            L_0x02a6:
                r0 = r8
                r3 = r9
            L_0x02a8:
                r4 = -1
                goto L_0x02cf
            L_0x02aa:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r11 == r8) goto L_0x02b3
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
                goto L_0x02b5
            L_0x02b3:
                r6 = r17
            L_0x02b5:
                if (r12 == r9) goto L_0x02bb
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            L_0x02bb:
                r10.measure(r6, r7)
                r1.setLastMeasureSpec(r6, r7)
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                r14 = r4
                goto L_0x02a8
            L_0x02cf:
                if (r14 == r4) goto L_0x02d3
                r4 = 1
                goto L_0x02d5
            L_0x02d3:
                r4 = r16
            L_0x02d5:
                int r5 = r2.horizontalDimension
                if (r0 != r5) goto L_0x02e1
                int r5 = r2.verticalDimension
                if (r3 == r5) goto L_0x02de
                goto L_0x02e1
            L_0x02de:
                r5 = r16
                goto L_0x02e2
            L_0x02e1:
                r5 = 1
            L_0x02e2:
                r2.measuredNeedsSolverPass = r5
                boolean r5 = r13.needsBaseline
                if (r5 == 0) goto L_0x02ea
                r9 = 1
                goto L_0x02eb
            L_0x02ea:
                r9 = r4
            L_0x02eb:
                if (r9 == 0) goto L_0x02f9
                r4 = -1
                if (r14 == r4) goto L_0x02f9
                int r1 = r20.getBaselineDistance()
                if (r1 == r14) goto L_0x02f9
                r1 = 1
                r2.measuredNeedsSolverPass = r1
            L_0x02f9:
                r2.measuredWidth = r0
                r2.measuredHeight = r3
                r2.measuredHasBaseline = r9
                r2.measuredBaseline = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.Measurer.measure(androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure):void");
        }
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        init((AttributeSet) null, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(attributeSet, i2, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        init(attributeSet, i2, i3);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    private final ConstraintWidget getTargetWidget(int i2) {
        if (i2 == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i2);
        if (view == null && (view = findViewById(i2)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    private void init(AttributeSet attributeSet, int i2, int i3) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mLayoutWidget.setMeasurer(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout, i2, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.load(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i2));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (isInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).setDebugName(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        ConstraintSet constraintSet = this.mConstraintSet;
        if (constraintSet != null) {
            constraintSet.applyToInternal(this, true);
        }
        this.mLayoutWidget.removeAllChildren();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.mConstraintHelpers.get(i5).updatePreLayout(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                this.mLayoutWidget.add(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, (LayoutParams) childAt5.getLayoutParams(), this.mTempMapIdToWidget);
            }
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (getChildAt(i2).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void applyConstraintsFromLayoutParams(boolean r19, android.view.View r20, androidx.constraintlayout.solver.widgets.ConstraintWidget r21, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r22, android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r22.validate()
            r10 = 0
            r8.helped = r10
            int r2 = r20.getVisibility()
            r7.setVisibility(r2)
            boolean r2 = r8.isInPlaceholder
            r11 = 1
            if (r2 == 0) goto L_0x0024
            r7.setInPlaceholder(r11)
            r2 = 8
            r7.setVisibility(r2)
        L_0x0024:
            r7.setCompanionWidget(r1)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r2 == 0) goto L_0x0036
            androidx.constraintlayout.widget.ConstraintHelper r1 = (androidx.constraintlayout.widget.ConstraintHelper) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2 = r0.mLayoutWidget
            boolean r2 = r2.isRtl()
            r1.resolveRtl(r7, r2)
        L_0x0036:
            boolean r1 = r8.isGuideline
            r12 = -1
            if (r1 == 0) goto L_0x005d
            r1 = r7
            androidx.constraintlayout.solver.widgets.Guideline r1 = (androidx.constraintlayout.solver.widgets.Guideline) r1
            int r2 = r8.resolvedGuideBegin
            int r3 = r8.resolvedGuideEnd
            float r4 = r8.resolvedGuidePercent
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x004f
            r1.setGuidePercent((float) r4)
            goto L_0x026d
        L_0x004f:
            if (r2 == r12) goto L_0x0056
            r1.setGuideBegin(r2)
            goto L_0x026d
        L_0x0056:
            if (r3 == r12) goto L_0x026d
            r1.setGuideEnd(r3)
            goto L_0x026d
        L_0x005d:
            int r1 = r8.resolvedLeftToLeft
            int r2 = r8.resolvedLeftToRight
            int r13 = r8.resolvedRightToLeft
            int r14 = r8.resolvedRightToRight
            int r6 = r8.resolveGoneLeftMargin
            int r15 = r8.resolveGoneRightMargin
            float r5 = r8.resolvedHorizontalBias
            int r3 = r8.circleConstraint
            if (r3 == r12) goto L_0x0080
            java.lang.Object r1 = r9.get(r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r1
            if (r1 == 0) goto L_0x01a4
            float r2 = r8.circleAngle
            int r3 = r8.circleRadius
            r7.connectCircularConstraint(r1, r2, r3)
            goto L_0x01a4
        L_0x0080:
            if (r1 == r12) goto L_0x009c
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0099
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            int r2 = r8.leftMargin
            r1 = r21
            r16 = r2
            r2 = r4
            r17 = r5
            r5 = r16
            goto L_0x00b1
        L_0x0099:
            r17 = r5
            goto L_0x00b4
        L_0x009c:
            r17 = r5
            if (r2 == r12) goto L_0x00b4
            java.lang.Object r1 = r9.get(r2)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x00b4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            int r5 = r8.leftMargin
            r1 = r21
        L_0x00b1:
            r1.immediateConnect(r2, r3, r4, r5, r6)
        L_0x00b4:
            if (r13 == r12) goto L_0x00c8
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x00de
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            int r5 = r8.rightMargin
            r1 = r21
            goto L_0x00da
        L_0x00c8:
            if (r14 == r12) goto L_0x00de
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x00de
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            int r5 = r8.rightMargin
            r1 = r21
            r2 = r4
        L_0x00da:
            r6 = r15
            r1.immediateConnect(r2, r3, r4, r5, r6)
        L_0x00de:
            int r1 = r8.topToTop
            if (r1 == r12) goto L_0x00f5
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x010f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            int r5 = r8.topMargin
            int r6 = r8.goneTopMargin
            r1 = r21
            r2 = r4
            goto L_0x010c
        L_0x00f5:
            int r1 = r8.topToBottom
            if (r1 == r12) goto L_0x010f
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x010f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.goneTopMargin
            r1 = r21
        L_0x010c:
            r1.immediateConnect(r2, r3, r4, r5, r6)
        L_0x010f:
            int r1 = r8.bottomToTop
            if (r1 == r12) goto L_0x0127
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0140
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.goneBottomMargin
            r1 = r21
            goto L_0x013d
        L_0x0127:
            int r1 = r8.bottomToBottom
            if (r1 == r12) goto L_0x0140
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0140
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.goneBottomMargin
            r1 = r21
            r2 = r4
        L_0x013d:
            r1.immediateConnect(r2, r3, r4, r5, r6)
        L_0x0140:
            int r1 = r8.baselineToBaseline
            if (r1 == r12) goto L_0x0191
            android.util.SparseArray<android.view.View> r2 = r0.mChildrenByIds
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.baselineToBaseline
            java.lang.Object r2 = r9.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0191
            if (r1 == 0) goto L_0x0191
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r3 == 0) goto L_0x0191
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            r8.needsBaseline = r11
            r1.needsBaseline = r11
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r7.getAnchor(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.getAnchor(r3)
            r4.connect(r2, r10, r12, r11)
            r7.setHasBaseline(r11)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.widget
            r1.setHasBaseline(r11)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.getAnchor(r1)
            r1.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.getAnchor(r1)
            r1.reset()
        L_0x0191:
            r1 = 0
            r2 = r17
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x019b
            r7.setHorizontalBiasPercent(r2)
        L_0x019b:
            float r2 = r8.verticalBias
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x01a4
            r7.setVerticalBiasPercent(r2)
        L_0x01a4:
            if (r19 == 0) goto L_0x01b3
            int r1 = r8.editorAbsoluteX
            if (r1 != r12) goto L_0x01ae
            int r2 = r8.editorAbsoluteY
            if (r2 == r12) goto L_0x01b3
        L_0x01ae:
            int r2 = r8.editorAbsoluteY
            r7.setOrigin(r1, r2)
        L_0x01b3:
            boolean r1 = r8.horizontalDimensionFixed
            r2 = -2
            if (r1 != 0) goto L_0x01e6
            int r1 = r8.width
            if (r1 != r12) goto L_0x01dd
            boolean r1 = r8.constrainedWidth
            if (r1 == 0) goto L_0x01c3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            goto L_0x01c5
        L_0x01c3:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
        L_0x01c5:
            r7.setHorizontalDimensionBehaviour(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.getAnchor(r1)
            int r3 = r8.leftMargin
            r1.mMargin = r3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.getAnchor(r1)
            int r3 = r8.rightMargin
            r1.mMargin = r3
            goto L_0x01f9
        L_0x01dd:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r7.setHorizontalDimensionBehaviour(r1)
            r7.setWidth(r10)
            goto L_0x01f9
        L_0x01e6:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7.setHorizontalDimensionBehaviour(r1)
            int r1 = r8.width
            r7.setWidth(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x01f9
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7.setHorizontalDimensionBehaviour(r1)
        L_0x01f9:
            boolean r1 = r8.verticalDimensionFixed
            if (r1 != 0) goto L_0x022b
            int r1 = r8.height
            if (r1 != r12) goto L_0x0222
            boolean r1 = r8.constrainedHeight
            if (r1 == 0) goto L_0x0208
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            goto L_0x020a
        L_0x0208:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
        L_0x020a:
            r7.setVerticalDimensionBehaviour(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.getAnchor(r1)
            int r2 = r8.topMargin
            r1.mMargin = r2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.getAnchor(r1)
            int r2 = r8.bottomMargin
            r1.mMargin = r2
            goto L_0x023e
        L_0x0222:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r7.setVerticalDimensionBehaviour(r1)
            r7.setHeight(r10)
            goto L_0x023e
        L_0x022b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7.setVerticalDimensionBehaviour(r1)
            int r1 = r8.height
            r7.setHeight(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x023e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7.setVerticalDimensionBehaviour(r1)
        L_0x023e:
            java.lang.String r1 = r8.dimensionRatio
            r7.setDimensionRatio(r1)
            float r1 = r8.horizontalWeight
            r7.setHorizontalWeight(r1)
            float r1 = r8.verticalWeight
            r7.setVerticalWeight(r1)
            int r1 = r8.horizontalChainStyle
            r7.setHorizontalChainStyle(r1)
            int r1 = r8.verticalChainStyle
            r7.setVerticalChainStyle(r1)
            int r1 = r8.matchConstraintDefaultWidth
            int r2 = r8.matchConstraintMinWidth
            int r3 = r8.matchConstraintMaxWidth
            float r4 = r8.matchConstraintPercentWidth
            r7.setHorizontalMatchStyle(r1, r2, r3, r4)
            int r1 = r8.matchConstraintDefaultHeight
            int r2 = r8.matchConstraintMinHeight
            int r3 = r8.matchConstraintMaxHeight
            float r4 = r8.matchConstraintPercentHeight
            r7.setVerticalMatchStyle(r1, r2, r3, r4)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.mConstraintHelpers.get(i2).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i5 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(SupportMenu.CATEGORY_MASK);
                        float f = (float) i4;
                        float f2 = (float) (i4 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i5;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i5 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.fillMetrics(metrics);
    }

    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Object getDesignInformation(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    public View getViewById(int i2) {
        return this.mChildrenByIds.get(i2);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    public boolean isRtl() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i2) {
        if (i2 != 0) {
            try {
                this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i2);
                return;
            } catch (Resources.NotFoundException unused) {
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.widget;
            if ((childAt.getVisibility() != 8 || layoutParams.isGuideline || layoutParams.isHelper || layoutParams.isVirtualGroup || isInEditMode) && !layoutParams.isInPlaceholder) {
                int x = constraintWidget.getX();
                int y = constraintWidget.getY();
                int width = constraintWidget.getWidth() + x;
                int height = constraintWidget.getHeight() + y;
                childAt.layout(x, y, width, height);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(x, y, width, height);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.mConstraintHelpers.get(i7).updatePostLayout(this);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        if (!this.mDirtyHierarchy) {
            int i4 = this.mOnMeasureWidthMeasureSpec;
            if (!(i4 == i2 && this.mOnMeasureHeightMeasureSpec == i3)) {
                if (i4 == i2 && View.MeasureSpec.getMode(i2) == 1073741824 && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i3) >= this.mLayoutWidget.getHeight()) {
                    this.mOnMeasureWidthMeasureSpec = i2;
                    this.mOnMeasureHeightMeasureSpec = i3;
                }
            }
            resolveMeasuredDimension(i2, i3, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
        }
        this.mOnMeasureWidthMeasureSpec = i2;
        this.mOnMeasureHeightMeasureSpec = i3;
        this.mLayoutWidget.setRtl(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.updateHierarchy();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i2, i3);
        resolveMeasuredDimension(i2, i3, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Guideline guideline = new Guideline();
            layoutParams.widget = guideline;
            layoutParams.isGuideline = true;
            guideline.setOrientation(layoutParams.orientation);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.validateParams();
            ((LayoutParams) view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.remove(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i2) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i2);
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        Measurer measurer = this.mMeasurer;
        int i6 = measurer.paddingHeight;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i4 + measurer.paddingWidth, i2, 0);
        int resolveSizeAndState2 = ViewGroup.resolveSizeAndState(i5 + i6, i3, 0);
        int i7 = resolveSizeAndState & ViewCompat.MEASURED_SIZE_MASK;
        int i8 = resolveSizeAndState2 & ViewCompat.MEASURED_SIZE_MASK;
        int min = Math.min(this.mMaxWidth, i7);
        int min2 = Math.min(this.mMaxHeight, i8);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    public void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.captureLayoutInfos(i3, i4, max, max2, paddingWidth, i5);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? isRtl() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i6, mode2, i7);
        constraintWidgetContainer.measure(i2, mode, i6, mode2, i7, this.mLastMeasureWidth, this.mLastMeasureHeight, max5, max);
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void setDesignInformation(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setId(int i2) {
        this.mChildrenByIds.remove(getId());
        super.setId(i2);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.mMaxHeight) {
            this.mMaxHeight = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.mMaxWidth) {
            this.mMaxWidth = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.mMinHeight) {
            this.mMinHeight = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.mMinWidth) {
            this.mMinWidth = i2;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.setOnConstraintsChanged(constraintsChangedListener);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.mOptimizationLevel = i2;
        this.mLayoutWidget.setOptimizationLevel(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSelfDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = r7.mMeasurer
            int r1 = r0.paddingHeight
            int r0 = r0.paddingWidth
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L_0x0028
            if (r9 == 0) goto L_0x0023
            if (r9 == r4) goto L_0x001a
            r9 = r2
        L_0x0018:
            r10 = r6
            goto L_0x0032
        L_0x001a:
            int r9 = r7.mMaxWidth
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L_0x0032
        L_0x0023:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L_0x0018
            goto L_0x002c
        L_0x0028:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L_0x0032
        L_0x002c:
            int r10 = r7.mMinWidth
            int r10 = java.lang.Math.max(r6, r10)
        L_0x0032:
            if (r11 == r5) goto L_0x0047
            if (r11 == 0) goto L_0x0042
            if (r11 == r4) goto L_0x003a
        L_0x0038:
            r12 = r6
            goto L_0x0051
        L_0x003a:
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L_0x0051
        L_0x0042:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L_0x0038
            goto L_0x004b
        L_0x0047:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L_0x0051
        L_0x004b:
            int r11 = r7.mMinHeight
            int r12 = java.lang.Math.max(r6, r11)
        L_0x0051:
            int r11 = r8.getWidth()
            if (r10 != r11) goto L_0x005d
            int r11 = r8.getHeight()
            if (r12 == r11) goto L_0x0060
        L_0x005d:
            r8.invalidateMeasures()
        L_0x0060:
            r8.setX(r6)
            r8.setY(r6)
            int r11 = r7.mMaxWidth
            int r11 = r11 - r0
            r8.setMaxWidth(r11)
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            r8.setMaxHeight(r11)
            r8.setMinWidth(r6)
            r8.setMinHeight(r6)
            r8.setHorizontalDimensionBehaviour(r9)
            r8.setWidth(r10)
            r8.setVerticalDimensionBehaviour(r2)
            r8.setHeight(r12)
            int r9 = r7.mMinWidth
            int r9 = r9 - r0
            r8.setMinWidth(r9)
            int r9 = r7.mMinHeight
            int r9 = r9 - r1
            r8.setMinHeight(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, int, int, int, int):void");
    }

    public void setState(int i2, int i3, int i4) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i2, (float) i3, (float) i4);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
