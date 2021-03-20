package androidx.constraintlayout.solver.widgets;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.analyzer.ChainRun;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import b.e.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    public static final int DIMENSION_HORIZONTAL = 0;
    public static final int DIMENSION_VERTICAL = 1;
    public static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    private boolean OPTIMIZE_WRAP;
    private boolean OPTIMIZE_WRAP_ON_RESOLVED;
    private boolean hasBaseline;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    public HorizontalWidgetRun horizontalRun;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    public ArrayList<ConstraintAnchor> mAnchors;
    public ConstraintAnchor mBaseline;
    public int mBaselineDistance;
    public ConstraintAnchor mBottom;
    public boolean mBottomHasCentered;
    public ConstraintAnchor mCenter;
    public ConstraintAnchor mCenterX;
    public ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    public int mDimensionRatioSide;
    public int mDistToBottom;
    public int mDistToLeft;
    public int mDistToRight;
    public int mDistToTop;
    public boolean mGroupsToSolver;
    public int mHeight;
    public float mHorizontalBiasPercent;
    public boolean mHorizontalChainFixedPosition;
    public int mHorizontalChainStyle;
    public ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    public boolean mHorizontalWrapVisited;
    private boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    private int mLastHorizontalMeasureSpec;
    private int mLastVerticalMeasureSpec;
    public ConstraintAnchor mLeft;
    public boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    public ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    private boolean mMeasureRequested;
    public int mMinHeight;
    public int mMinWidth;
    public ConstraintWidget[] mNextChainWidget;
    public int mOffsetX;
    public int mOffsetY;
    public ConstraintWidget mParent;
    public int mRelX;
    public int mRelY;
    public float mResolvedDimensionRatio;
    public int mResolvedDimensionRatioSide;
    public boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    public boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    public boolean mTopHasCentered;
    private String mType;
    public float mVerticalBiasPercent;
    public boolean mVerticalChainFixedPosition;
    public int mVerticalChainStyle;
    public ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    public boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    public int mWidth;
    public int mX;
    public int mY;
    public boolean measured;
    private boolean resolvedHorizontal;
    private boolean resolvedVertical;
    public WidgetRun[] run;
    public ChainRun verticalChainRun;
    public int verticalGroup;
    public VerticalWidgetRun verticalRun;
    public int[] wrapMeasure;

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|5|6|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|5|6|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0041 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x005e */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values()
                r0 = 4
                int[] r1 = new int[r0]
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = r1
                r2 = 0
                r3 = 1
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x000e }
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 2
                int[] r4 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch:{ NoSuchFieldError -> 0x0015 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x0015 }
                r4[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                r4 = 3
                int[] r5 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch:{ NoSuchFieldError -> 0x001c }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x001c }
                r5[r4] = r4     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r5 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0022 }
                r5[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                r5 = 9
                int[] r6 = new int[r5]
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = r6
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x002f }
                r6[r3] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x002f:
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0035 }
                r3[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r1 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x003b }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x003b }
                r1[r4] = r4     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                int[] r1 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x0041 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0041 }
                r1[r0] = r0     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                int[] r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x0048 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0048 }
                r1 = 5
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x004f }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x004f }
                r1 = 6
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0056 }
                r1 = 7
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x005e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x005e }
                r1 = 8
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x0064 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x0064 }
                r0[r2] = r5     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.<clinit>():void");
        }
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
    }

    public ConstraintWidget(int i2, int i3) {
        this(0, 0, i2, i3);
    }

    public ConstraintWidget(int i2, int i3, int i4, int i5) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.mX = i2;
        this.mY = i3;
        this.mWidth = i4;
        this.mHeight = i5;
        addAnchors();
    }

    public ConstraintWidget(String str) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
        setDebugName(str);
    }

    public ConstraintWidget(String str, int i2, int i3) {
        this(i2, i3);
        setDebugName(str);
    }

    public ConstraintWidget(String str, int i2, int i3, int i4, int i5) {
        this(i2, i3, i4, i5);
        setDebugName(str);
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    /* JADX WARNING: Removed duplicated region for block: B:206:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x049e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x04da A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:343:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:347:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01cf A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyConstraints(androidx.constraintlayout.solver.LinearSystem r32, boolean r33, boolean r34, boolean r35, boolean r36, androidx.constraintlayout.solver.SolverVariable r37, androidx.constraintlayout.solver.SolverVariable r38, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r39, boolean r40, androidx.constraintlayout.solver.widgets.ConstraintAnchor r41, androidx.constraintlayout.solver.widgets.ConstraintAnchor r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            r31 = this;
            r0 = r31
            r10 = r32
            r11 = r37
            r12 = r38
            r13 = r41
            r14 = r42
            r15 = r45
            r1 = r46
            r2 = r54
            r3 = r55
            r4 = r56
            androidx.constraintlayout.solver.SolverVariable r9 = r10.createObjectVariable(r13)
            androidx.constraintlayout.solver.SolverVariable r8 = r10.createObjectVariable(r14)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r41.getTarget()
            androidx.constraintlayout.solver.SolverVariable r7 = r10.createObjectVariable(r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r42.getTarget()
            androidx.constraintlayout.solver.SolverVariable r6 = r10.createObjectVariable(r5)
            androidx.constraintlayout.solver.Metrics r5 = androidx.constraintlayout.solver.LinearSystem.getMetrics()
            if (r5 == 0) goto L_0x0040
            androidx.constraintlayout.solver.Metrics r5 = androidx.constraintlayout.solver.LinearSystem.getMetrics()
            long r11 = r5.nonresolvedWidgets
            r16 = 1
            long r11 = r11 + r16
            r5.nonresolvedWidgets = r11
        L_0x0040:
            boolean r11 = r41.isConnected()
            boolean r12 = r42.isConnected()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r0.mCenter
            boolean r16 = r5.isConnected()
            if (r12 == 0) goto L_0x0053
            int r5 = r11 + 1
            goto L_0x0054
        L_0x0053:
            r5 = r11
        L_0x0054:
            if (r16 == 0) goto L_0x0058
            int r5 = r5 + 1
        L_0x0058:
            if (r48 == 0) goto L_0x005d
            r18 = 3
            goto L_0x005f
        L_0x005d:
            r18 = r53
        L_0x005f:
            int r2 = r39.ordinal()
            r14 = 1
            if (r2 == 0) goto L_0x006c
            if (r2 == r14) goto L_0x006c
            r14 = 2
            if (r2 == r14) goto L_0x0071
            r14 = 3
        L_0x006c:
            r14 = r18
        L_0x006e:
            r18 = 0
            goto L_0x0078
        L_0x0071:
            r14 = r18
            r2 = 4
            if (r14 == r2) goto L_0x006e
            r18 = 1
        L_0x0078:
            int r2 = r0.mVisibility
            r13 = 8
            if (r2 != r13) goto L_0x0082
            r2 = 0
            r18 = 0
            goto L_0x0084
        L_0x0082:
            r2 = r44
        L_0x0084:
            if (r58 == 0) goto L_0x00a7
            if (r11 != 0) goto L_0x0092
            if (r12 != 0) goto L_0x0092
            if (r16 != 0) goto L_0x0092
            r13 = r43
            r10.addEquality(r9, r13)
            goto L_0x00a2
        L_0x0092:
            if (r11 == 0) goto L_0x00a2
            if (r12 != 0) goto L_0x00a2
            int r13 = r41.getMargin()
            r20 = r6
            r6 = 8
            r10.addEquality(r9, r7, r13, r6)
            goto L_0x00aa
        L_0x00a2:
            r20 = r6
            r6 = 8
            goto L_0x00aa
        L_0x00a7:
            r20 = r6
            r6 = r13
        L_0x00aa:
            if (r18 != 0) goto L_0x00d7
            if (r40 == 0) goto L_0x00c3
            r6 = 0
            r13 = 3
            r10.addEquality(r8, r9, r6, r13)
            r13 = 8
            if (r15 <= 0) goto L_0x00ba
            r10.addGreaterThan(r8, r9, r15, r13)
        L_0x00ba:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r2) goto L_0x00c8
            r10.addLowerThan(r8, r9, r1, r13)
            goto L_0x00c8
        L_0x00c3:
            r13 = r6
            r6 = 0
            r10.addEquality(r8, r9, r2, r13)
        L_0x00c8:
            r1 = r5
            r19 = r6
            r2 = r7
            r15 = r8
            r21 = r18
            r13 = r20
            r18 = r36
        L_0x00d3:
            r20 = r3
            goto L_0x01cd
        L_0x00d7:
            r1 = 2
            r6 = 0
            if (r5 == r1) goto L_0x00fd
            if (r48 != 0) goto L_0x00fd
            r1 = 1
            if (r14 == r1) goto L_0x00e2
            if (r14 != 0) goto L_0x00fd
        L_0x00e2:
            int r1 = java.lang.Math.max(r3, r2)
            if (r4 <= 0) goto L_0x00ec
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00ec:
            r2 = 8
            r10.addEquality(r8, r9, r1, r2)
            r18 = r36
            r1 = r5
            r19 = r6
            r21 = r19
            r2 = r7
            r15 = r8
            r13 = r20
            goto L_0x00d3
        L_0x00fd:
            r1 = -2
            if (r3 != r1) goto L_0x0102
            r13 = r2
            goto L_0x0103
        L_0x0102:
            r13 = r3
        L_0x0103:
            if (r4 != r1) goto L_0x0107
            r1 = r2
            goto L_0x0108
        L_0x0107:
            r1 = r4
        L_0x0108:
            if (r2 <= 0) goto L_0x010e
            r3 = 1
            if (r14 == r3) goto L_0x010e
            r2 = r6
        L_0x010e:
            if (r13 <= 0) goto L_0x0119
            r3 = 8
            r10.addGreaterThan(r8, r9, r13, r3)
            int r2 = java.lang.Math.max(r2, r13)
        L_0x0119:
            if (r1 <= 0) goto L_0x0132
            if (r34 == 0) goto L_0x0122
            r3 = 1
            if (r14 != r3) goto L_0x0122
            r3 = r6
            goto L_0x0123
        L_0x0122:
            r3 = 1
        L_0x0123:
            if (r3 == 0) goto L_0x012b
            r3 = 8
            r10.addLowerThan(r8, r9, r1, r3)
            goto L_0x012d
        L_0x012b:
            r3 = 8
        L_0x012d:
            int r2 = java.lang.Math.min(r2, r1)
            goto L_0x0134
        L_0x0132:
            r3 = 8
        L_0x0134:
            r4 = 1
            if (r14 != r4) goto L_0x0156
            if (r34 == 0) goto L_0x013d
            r10.addEquality(r8, r9, r2, r3)
            goto L_0x0144
        L_0x013d:
            r4 = 5
            r10.addEquality(r8, r9, r2, r4)
            r10.addLowerThan(r8, r9, r2, r3)
        L_0x0144:
            r4 = r1
            r1 = r5
            r19 = r6
            r2 = r7
            r15 = r8
            r21 = r18
            r18 = r36
            r30 = r20
            r20 = r13
            r13 = r30
            goto L_0x01cd
        L_0x0156:
            r2 = 2
            if (r14 != r2) goto L_0x01ba
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = r41.getType()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r3 == r4) goto L_0x017b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = r41.getType()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r3 != r2) goto L_0x016a
            goto L_0x017b
        L_0x016a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.getAnchor(r3)
            androidx.constraintlayout.solver.SolverVariable r2 = r10.createObjectVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            goto L_0x0189
        L_0x017b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.getAnchor(r4)
            androidx.constraintlayout.solver.SolverVariable r2 = r10.createObjectVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
        L_0x0189:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.getAnchor(r4)
            androidx.constraintlayout.solver.SolverVariable r3 = r10.createObjectVariable(r3)
            r18 = r2
            r2 = r3
            androidx.constraintlayout.solver.ArrayRow r3 = r32.createRow()
            r4 = r8
            r40 = r1
            r1 = r5
            r5 = r9
            r19 = r6
            r44 = r13
            r13 = r20
            r6 = r2
            r2 = r7
            r7 = r18
            r15 = r8
            r8 = r57
            androidx.constraintlayout.solver.ArrayRow r3 = r3.createRowDimensionRatio(r4, r5, r6, r7, r8)
            r10.addConstraint(r3)
            r18 = r36
            r4 = r40
            r20 = r44
            r21 = r19
            goto L_0x01cd
        L_0x01ba:
            r40 = r1
            r1 = r5
            r19 = r6
            r2 = r7
            r15 = r8
            r44 = r13
            r13 = r20
            r4 = r40
            r20 = r44
            r21 = r18
            r18 = 1
        L_0x01cd:
            if (r58 == 0) goto L_0x04cf
            if (r50 == 0) goto L_0x01d3
            goto L_0x04cf
        L_0x01d3:
            if (r11 != 0) goto L_0x01da
            if (r12 != 0) goto L_0x01da
            if (r16 != 0) goto L_0x01da
            goto L_0x01de
        L_0x01da:
            if (r11 == 0) goto L_0x01e3
            if (r12 != 0) goto L_0x01e3
        L_0x01de:
            r3 = r15
            r4 = r19
            goto L_0x049a
        L_0x01e3:
            if (r11 != 0) goto L_0x021b
            if (r12 == 0) goto L_0x021b
            int r1 = r42.getMargin()
            int r1 = -r1
            r2 = 8
            r10.addEquality(r15, r13, r1, r2)
            if (r34 == 0) goto L_0x01de
            boolean r1 = r0.OPTIMIZE_WRAP
            if (r1 == 0) goto L_0x0211
            boolean r1 = r9.isFinalValue
            if (r1 == 0) goto L_0x0211
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.mParent
            if (r1 == 0) goto L_0x0211
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r1
            r7 = r41
            r8 = r19
            if (r33 == 0) goto L_0x020c
            r1.addHorizontalWrapMinVariable(r7)
            goto L_0x0498
        L_0x020c:
            r1.addVerticalWrapMinVariable(r7)
            goto L_0x0498
        L_0x0211:
            r8 = r19
            r6 = r37
            r1 = 5
            r10.addGreaterThan(r9, r6, r8, r1)
            goto L_0x0498
        L_0x021b:
            r6 = r37
            r7 = r41
            r8 = r19
            if (r11 == 0) goto L_0x0498
            if (r12 == 0) goto L_0x0498
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r1.mOwner
            r12 = r42
            r3 = 2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r12.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r1.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r31.getParent()
            r16 = 6
            if (r21 == 0) goto L_0x031f
            if (r14 != 0) goto L_0x0283
            if (r4 != 0) goto L_0x0261
            if (r20 != 0) goto L_0x0261
            boolean r3 = r2.isFinalValue
            if (r3 == 0) goto L_0x0258
            boolean r3 = r13.isFinalValue
            if (r3 == 0) goto L_0x0258
            int r1 = r41.getMargin()
            r3 = 8
            r10.addEquality(r9, r2, r1, r3)
            int r1 = r42.getMargin()
            int r1 = -r1
            r10.addEquality(r15, r13, r1, r3)
            return
        L_0x0258:
            r3 = r8
            r19 = r3
            r4 = 1
            r22 = 8
            r23 = 8
            goto L_0x0269
        L_0x0261:
            r4 = r8
            r3 = 1
            r19 = 1
            r22 = 5
            r23 = 5
        L_0x0269:
            boolean r8 = r11 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r8 != 0) goto L_0x0277
            boolean r8 = r5 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r8 == 0) goto L_0x0272
            goto L_0x0277
        L_0x0272:
            r8 = r38
            r24 = r22
            goto L_0x027d
        L_0x0277:
            r8 = r38
            r24 = r22
            r23 = 4
        L_0x027d:
            r22 = r4
            r4 = r16
            goto L_0x036c
        L_0x0283:
            r8 = 1
            if (r14 != r8) goto L_0x0295
            r8 = r38
            r4 = r16
            r3 = 1
            r19 = 1
            r22 = 0
            r23 = 4
        L_0x0291:
            r24 = 8
            goto L_0x036c
        L_0x0295:
            r8 = 3
            if (r14 != r8) goto L_0x0317
            int r8 = r0.mResolvedDimensionRatioSide
            r3 = -1
            if (r8 != r3) goto L_0x02b1
            r8 = r38
            r3 = 1
            if (r51 == 0) goto L_0x02a8
            if (r34 == 0) goto L_0x02a6
            r4 = 5
            goto L_0x02aa
        L_0x02a6:
            r4 = 4
            goto L_0x02aa
        L_0x02a8:
            r4 = 8
        L_0x02aa:
            r19 = 1
            r22 = 1
            r23 = 5
            goto L_0x0291
        L_0x02b1:
            if (r48 == 0) goto L_0x02d6
            r3 = r54
            r8 = 2
            if (r3 == r8) goto L_0x02be
            r4 = 1
            if (r3 != r4) goto L_0x02bc
            goto L_0x02be
        L_0x02bc:
            r3 = 0
            goto L_0x02bf
        L_0x02be:
            r3 = 1
        L_0x02bf:
            if (r3 != 0) goto L_0x02c5
            r3 = 8
            r4 = 5
            goto L_0x02c7
        L_0x02c5:
            r3 = 5
            r4 = 4
        L_0x02c7:
            r8 = r38
            r24 = r3
            r23 = r4
            r4 = r16
            r3 = 1
            r19 = 1
            r22 = 1
            goto L_0x036c
        L_0x02d6:
            if (r4 <= 0) goto L_0x02e5
            r8 = r38
            r4 = r16
            r3 = 1
            r19 = 1
            r22 = 1
            r23 = 5
            goto L_0x036a
        L_0x02e5:
            if (r4 != 0) goto L_0x030d
            if (r20 != 0) goto L_0x030d
            if (r51 != 0) goto L_0x02f8
            r8 = r38
            r4 = r16
            r3 = 1
            r19 = 1
            r22 = 1
            r23 = 8
            goto L_0x036a
        L_0x02f8:
            if (r11 == r1) goto L_0x02fe
            if (r5 == r1) goto L_0x02fe
            r3 = 4
            goto L_0x02ff
        L_0x02fe:
            r3 = 5
        L_0x02ff:
            r8 = r38
            r24 = r3
            r4 = r16
            r3 = 1
            r19 = 1
            r22 = 1
            r23 = 4
            goto L_0x036c
        L_0x030d:
            r8 = r38
            r4 = r16
            r3 = 1
            r19 = 1
            r22 = 1
            goto L_0x0368
        L_0x0317:
            r8 = r38
            r4 = r16
            r3 = 0
            r19 = 0
            goto L_0x0366
        L_0x031f:
            boolean r3 = r2.isFinalValue
            if (r3 == 0) goto L_0x035f
            boolean r3 = r13.isFinalValue
            if (r3 == 0) goto L_0x035f
            int r1 = r41.getMargin()
            int r3 = r42.getMargin()
            r4 = 8
            r48 = r32
            r49 = r9
            r50 = r2
            r51 = r1
            r52 = r47
            r53 = r13
            r54 = r15
            r55 = r3
            r56 = r4
            r48.addCentering(r49, r50, r51, r52, r53, r54, r55, r56)
            if (r34 == 0) goto L_0x035e
            if (r18 == 0) goto L_0x035e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r12.mTarget
            if (r1 == 0) goto L_0x0355
            int r1 = r42.getMargin()
            r8 = r38
            goto L_0x0358
        L_0x0355:
            r8 = r38
            r1 = 0
        L_0x0358:
            if (r13 == r8) goto L_0x035e
            r2 = 5
            r10.addGreaterThan(r8, r15, r1, r2)
        L_0x035e:
            return
        L_0x035f:
            r8 = r38
            r4 = r16
            r3 = 1
            r19 = 1
        L_0x0366:
            r22 = 0
        L_0x0368:
            r23 = 4
        L_0x036a:
            r24 = 5
        L_0x036c:
            if (r19 == 0) goto L_0x0377
            if (r2 != r13) goto L_0x0377
            if (r11 == r1) goto L_0x0377
            r19 = 0
            r25 = 0
            goto L_0x0379
        L_0x0377:
            r25 = 1
        L_0x0379:
            if (r3 == 0) goto L_0x03bd
            if (r21 != 0) goto L_0x038e
            if (r49 != 0) goto L_0x038e
            if (r51 != 0) goto L_0x038e
            if (r2 != r6) goto L_0x038e
            if (r13 != r8) goto L_0x038e
            r24 = 0
            r25 = 8
            r26 = 0
            r27 = 8
            goto L_0x0396
        L_0x038e:
            r27 = r24
            r26 = r25
            r24 = r34
            r25 = r4
        L_0x0396:
            int r4 = r41.getMargin()
            int r28 = r42.getMargin()
            r3 = r1
            r1 = r32
            r39 = r2
            r29 = 4
            r2 = r9
            r12 = r3
            r3 = r39
            r53 = r14
            r14 = r5
            r5 = r47
            r6 = r13
            r7 = r15
            r8 = r28
            r17 = r12
            r12 = r9
            r9 = r25
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
            r25 = r26
            goto L_0x03cb
        L_0x03bd:
            r17 = r1
            r39 = r2
            r12 = r9
            r53 = r14
            r29 = 4
            r14 = r5
            r27 = r24
            r24 = r34
        L_0x03cb:
            int r1 = r0.mVisibility
            r2 = 8
            if (r1 != r2) goto L_0x03d8
            boolean r1 = r42.hasDependents()
            if (r1 != 0) goto L_0x03d8
            return
        L_0x03d8:
            r1 = r39
            if (r19 == 0) goto L_0x0400
            if (r24 == 0) goto L_0x03ed
            if (r1 == r13) goto L_0x03ed
            if (r21 != 0) goto L_0x03ed
            boolean r2 = r11 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r2 != 0) goto L_0x03ea
            boolean r2 = r14 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r2 == 0) goto L_0x03ed
        L_0x03ea:
            r2 = r16
            goto L_0x03ef
        L_0x03ed:
            r2 = r27
        L_0x03ef:
            int r3 = r41.getMargin()
            r10.addGreaterThan(r12, r1, r3, r2)
            int r3 = r42.getMargin()
            int r3 = -r3
            r10.addLowerThan(r15, r13, r3, r2)
            r27 = r2
        L_0x0400:
            if (r24 == 0) goto L_0x0412
            if (r52 == 0) goto L_0x0412
            boolean r2 = r11 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r2 != 0) goto L_0x0412
            boolean r2 = r14 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r2 != 0) goto L_0x0412
            r2 = r16
            r3 = r2
            r25 = 1
            goto L_0x0416
        L_0x0412:
            r2 = r23
            r3 = r27
        L_0x0416:
            if (r25 == 0) goto L_0x0469
            if (r22 == 0) goto L_0x0446
            if (r51 == 0) goto L_0x041e
            if (r35 == 0) goto L_0x0446
        L_0x041e:
            r4 = r17
            if (r11 == r4) goto L_0x0427
            if (r14 != r4) goto L_0x0425
            goto L_0x0427
        L_0x0425:
            r16 = r2
        L_0x0427:
            boolean r5 = r11 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r5 != 0) goto L_0x042f
            boolean r5 = r14 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r5 == 0) goto L_0x0431
        L_0x042f:
            r16 = 5
        L_0x0431:
            boolean r5 = r11 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r5 != 0) goto L_0x0439
            boolean r5 = r14 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r5 == 0) goto L_0x043b
        L_0x0439:
            r16 = 5
        L_0x043b:
            if (r51 == 0) goto L_0x043f
            r5 = 5
            goto L_0x0441
        L_0x043f:
            r5 = r16
        L_0x0441:
            int r2 = java.lang.Math.max(r5, r2)
            goto L_0x0448
        L_0x0446:
            r4 = r17
        L_0x0448:
            if (r24 == 0) goto L_0x0459
            int r2 = java.lang.Math.min(r3, r2)
            if (r48 == 0) goto L_0x0459
            if (r51 != 0) goto L_0x0459
            if (r11 == r4) goto L_0x0456
            if (r14 != r4) goto L_0x0459
        L_0x0456:
            r14 = r29
            goto L_0x045a
        L_0x0459:
            r14 = r2
        L_0x045a:
            int r2 = r41.getMargin()
            r10.addEquality(r12, r1, r2, r14)
            int r2 = r42.getMargin()
            int r2 = -r2
            r10.addEquality(r15, r13, r2, r14)
        L_0x0469:
            if (r24 == 0) goto L_0x047b
            r2 = r37
            if (r2 != r1) goto L_0x0474
            int r3 = r41.getMargin()
            goto L_0x0475
        L_0x0474:
            r3 = 0
        L_0x0475:
            if (r1 == r2) goto L_0x047b
            r1 = 5
            r10.addGreaterThan(r12, r2, r3, r1)
        L_0x047b:
            if (r24 == 0) goto L_0x0495
            if (r21 == 0) goto L_0x0495
            r3 = r15
            if (r45 != 0) goto L_0x0496
            if (r20 != 0) goto L_0x0496
            if (r21 == 0) goto L_0x048f
            r2 = r53
            r1 = 3
            if (r2 != r1) goto L_0x048f
            r1 = 8
            r4 = 0
            goto L_0x0491
        L_0x048f:
            r4 = 0
            r1 = 5
        L_0x0491:
            r10.addGreaterThan(r3, r12, r4, r1)
            goto L_0x049c
        L_0x0495:
            r3 = r15
        L_0x0496:
            r4 = 0
            goto L_0x049c
        L_0x0498:
            r4 = r8
            r3 = r15
        L_0x049a:
            r24 = r34
        L_0x049c:
            if (r24 == 0) goto L_0x04ce
            if (r18 == 0) goto L_0x04ce
            r1 = r42
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mTarget
            if (r2 == 0) goto L_0x04ae
            int r2 = r42.getMargin()
            r5 = r38
            r4 = r2
            goto L_0x04b0
        L_0x04ae:
            r5 = r38
        L_0x04b0:
            if (r13 == r5) goto L_0x04ce
            boolean r2 = r0.OPTIMIZE_WRAP
            if (r2 == 0) goto L_0x04ca
            boolean r2 = r3.isFinalValue
            if (r2 == 0) goto L_0x04ca
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.mParent
            if (r2 == 0) goto L_0x04ca
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r2
            if (r33 == 0) goto L_0x04c6
            r2.addHorizontalWrapMaxVariable(r1)
            goto L_0x04c9
        L_0x04c6:
            r2.addVerticalWrapMaxVariable(r1)
        L_0x04c9:
            return
        L_0x04ca:
            r1 = 5
            r10.addGreaterThan(r5, r3, r4, r1)
        L_0x04ce:
            return
        L_0x04cf:
            r2 = r37
            r5 = r38
            r12 = r9
            r3 = r15
            r4 = r19
            r6 = 2
            if (r1 >= r6) goto L_0x0519
            if (r34 == 0) goto L_0x0519
            if (r18 == 0) goto L_0x0519
            r1 = 8
            r10.addGreaterThan(r12, r2, r4, r1)
            if (r33 != 0) goto L_0x04ee
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != 0) goto L_0x04ec
            goto L_0x04ee
        L_0x04ec:
            r13 = r4
            goto L_0x04ef
        L_0x04ee:
            r13 = 1
        L_0x04ef:
            if (r33 != 0) goto L_0x0511
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x0511
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.mOwner
            float r2 = r1.mDimensionRatio
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x050f
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.mListDimensionBehaviors
            r2 = r1[r4]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r6) goto L_0x050f
            r2 = 1
            r1 = r1[r2]
            if (r1 != r6) goto L_0x050f
            r14 = r2
            goto L_0x0512
        L_0x050f:
            r14 = r4
            goto L_0x0512
        L_0x0511:
            r14 = r13
        L_0x0512:
            if (r14 == 0) goto L_0x0519
            r1 = 8
            r10.addGreaterThan(r5, r3, r4, r1)
        L_0x0519:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.applyConstraints(androidx.constraintlayout.solver.LinearSystem, boolean, boolean, boolean, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private boolean isChainHead(int i2) {
        int i3 = i2 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        if (!(constraintAnchorArr[i3].mTarget == null || constraintAnchorArr[i3].mTarget.mTarget == constraintAnchorArr[i3])) {
            int i4 = i3 + 1;
            return constraintAnchorArr[i4].mTarget != null && constraintAnchorArr[i4].mTarget.mTarget == constraintAnchorArr[i4];
        }
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i2, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                Optimizer.checkMatchParent(constraintWidgetContainer, linearSystem, this);
                hashSet.remove(this);
                addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
            } else {
                return;
            }
        }
        if (i2 == 0) {
            HashSet<ConstraintAnchor> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                Iterator<ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i2, true);
                }
            }
            HashSet<ConstraintAnchor> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                Iterator<ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            Iterator<ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i2, true);
            }
        }
        HashSet<ConstraintAnchor> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            Iterator<ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i2, true);
            }
        }
        HashSet<ConstraintAnchor> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            Iterator<ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i2, true);
            }
        }
    }

    public boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0569  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x05df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addToSolver(androidx.constraintlayout.solver.LinearSystem r54, boolean r55) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mLeft
            androidx.constraintlayout.solver.SolverVariable r13 = r14.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mRight
            androidx.constraintlayout.solver.SolverVariable r12 = r14.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mTop
            androidx.constraintlayout.solver.SolverVariable r11 = r14.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mBottom
            androidx.constraintlayout.solver.SolverVariable r10 = r14.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.solver.SolverVariable r9 = r14.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x0034
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r0.mListDimensionBehaviors
            r1 = r1[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L_0x0034
            r1 = r8
            goto L_0x0035
        L_0x0034:
            r1 = r7
        L_0x0035:
            if (r0 == 0) goto L_0x0041
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.mListDimensionBehaviors
            r0 = r0[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r2) goto L_0x0041
            r0 = r8
            goto L_0x0042
        L_0x0041:
            r0 = r7
        L_0x0042:
            r6 = r0
            r5 = r1
            goto L_0x0047
        L_0x0045:
            r5 = r7
            r6 = r5
        L_0x0047:
            int r0 = r15.mVisibility
            r4 = 8
            if (r0 != r4) goto L_0x005e
            boolean r0 = r53.hasDependencies()
            if (r0 != 0) goto L_0x005e
            boolean[] r0 = r15.mIsInBarrier
            boolean r1 = r0[r7]
            if (r1 != 0) goto L_0x005e
            boolean r0 = r0[r8]
            if (r0 != 0) goto L_0x005e
            return
        L_0x005e:
            boolean r0 = r15.resolvedHorizontal
            r3 = 5
            if (r0 != 0) goto L_0x0067
            boolean r1 = r15.resolvedVertical
            if (r1 == 0) goto L_0x00e4
        L_0x0067:
            if (r0 == 0) goto L_0x0096
            int r0 = r15.mX
            r14.addEquality(r13, r0)
            int r0 = r15.mX
            int r1 = r15.mWidth
            int r0 = r0 + r1
            r14.addEquality(r12, r0)
            if (r5 == 0) goto L_0x0096
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x0096
            boolean r1 = r15.OPTIMIZE_WRAP_ON_RESOLVED
            if (r1 == 0) goto L_0x008d
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.mLeft
            r0.addVerticalWrapMinVariable(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.mRight
            r0.addHorizontalWrapMaxVariable(r1)
            goto L_0x0096
        L_0x008d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.solver.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r12, r7, r3)
        L_0x0096:
            boolean r0 = r15.resolvedVertical
            if (r0 == 0) goto L_0x00d7
            int r0 = r15.mY
            r14.addEquality(r11, r0)
            int r0 = r15.mY
            int r1 = r15.mHeight
            int r0 = r0 + r1
            r14.addEquality(r10, r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mBaseline
            boolean r0 = r0.hasDependents()
            if (r0 == 0) goto L_0x00b7
            int r0 = r15.mY
            int r1 = r15.mBaselineDistance
            int r0 = r0 + r1
            r14.addEquality(r9, r0)
        L_0x00b7:
            if (r6 == 0) goto L_0x00d7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x00d7
            boolean r1 = r15.OPTIMIZE_WRAP_ON_RESOLVED
            if (r1 == 0) goto L_0x00ce
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.mTop
            r0.addVerticalWrapMinVariable(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.mBottom
            r0.addVerticalWrapMaxVariable(r1)
            goto L_0x00d7
        L_0x00ce:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.solver.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r10, r7, r3)
        L_0x00d7:
            boolean r0 = r15.resolvedHorizontal
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r15.resolvedVertical
            if (r0 == 0) goto L_0x00e4
            r15.resolvedHorizontal = r7
            r15.resolvedVertical = r7
            return
        L_0x00e4:
            androidx.constraintlayout.solver.Metrics r0 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            r1 = 1
            if (r0 == 0) goto L_0x00ef
            long r3 = r0.widgets
            long r3 = r3 + r1
            r0.widgets = r3
        L_0x00ef:
            if (r55 == 0) goto L_0x0185
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r3 = r15.horizontalRun
            if (r3 == 0) goto L_0x0185
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r4 = r15.verticalRun
            if (r4 == 0) goto L_0x0185
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = r3.start
            boolean r7 = r8.resolved
            if (r7 == 0) goto L_0x0185
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.end
            boolean r3 = r3.resolved
            if (r3 == 0) goto L_0x0185
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r4.start
            boolean r3 = r3.resolved
            if (r3 == 0) goto L_0x0185
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r4.end
            boolean r3 = r3.resolved
            if (r3 == 0) goto L_0x0185
            if (r0 == 0) goto L_0x0118
            long r3 = r0.graphSolved
            long r3 = r3 + r1
            r0.graphSolved = r3
        L_0x0118:
            int r0 = r8.value
            r14.addEquality(r13, r0)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r12, r0)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            r14.addEquality(r11, r0)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r10, r0)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.baseline
            int r0 = r0.value
            r14.addEquality(r9, r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x017f
            if (r5 == 0) goto L_0x0161
            boolean[] r0 = r15.isTerminalWidget
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0161
            boolean r0 = r53.isInHorizontalChain()
            if (r0 != 0) goto L_0x0161
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.solver.SolverVariable r0 = r14.createObjectVariable(r0)
            r2 = 8
            r14.addGreaterThan(r0, r12, r1, r2)
        L_0x0161:
            if (r6 == 0) goto L_0x017f
            boolean[] r0 = r15.isTerminalWidget
            r1 = 1
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x017f
            boolean r0 = r53.isInVerticalChain()
            if (r0 != 0) goto L_0x017f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.solver.SolverVariable r0 = r14.createObjectVariable(r0)
            r1 = 8
            r2 = 0
            r14.addGreaterThan(r0, r10, r2, r1)
            goto L_0x0180
        L_0x017f:
            r2 = 0
        L_0x0180:
            r15.resolvedHorizontal = r2
            r15.resolvedVertical = r2
            return
        L_0x0185:
            if (r0 == 0) goto L_0x018c
            long r3 = r0.linearSolved
            long r3 = r3 + r1
            r0.linearSolved = r3
        L_0x018c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x0207
            r0 = 0
            boolean r1 = r15.isChainHead(r0)
            if (r1 == 0) goto L_0x01a0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r15.mParent
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r1
            r1.addChain(r15, r0)
            r0 = 1
            goto L_0x01a4
        L_0x01a0:
            boolean r0 = r53.isInHorizontalChain()
        L_0x01a4:
            r1 = 1
            boolean r2 = r15.isChainHead(r1)
            if (r2 == 0) goto L_0x01b4
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r2
            r2.addChain(r15, r1)
            r1 = 1
            goto L_0x01b8
        L_0x01b4:
            boolean r1 = r53.isInVerticalChain()
        L_0x01b8:
            if (r0 != 0) goto L_0x01db
            if (r5 == 0) goto L_0x01db
            int r2 = r15.mVisibility
            r3 = 8
            if (r2 == r3) goto L_0x01db
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x01db
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x01db
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mRight
            androidx.constraintlayout.solver.SolverVariable r2 = r14.createObjectVariable(r2)
            r3 = 1
            r4 = 0
            r14.addGreaterThan(r2, r12, r4, r3)
        L_0x01db:
            if (r1 != 0) goto L_0x0202
            if (r6 == 0) goto L_0x0202
            int r2 = r15.mVisibility
            r3 = 8
            if (r2 == r3) goto L_0x0202
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x0202
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x0202
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.mBaseline
            if (r2 != 0) goto L_0x0202
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mBottom
            androidx.constraintlayout.solver.SolverVariable r2 = r14.createObjectVariable(r2)
            r3 = 1
            r4 = 0
            r14.addGreaterThan(r2, r10, r4, r3)
        L_0x0202:
            r29 = r0
            r28 = r1
            goto L_0x020b
        L_0x0207:
            r28 = 0
            r29 = 0
        L_0x020b:
            int r0 = r15.mWidth
            int r1 = r15.mMinWidth
            if (r0 >= r1) goto L_0x0212
            goto L_0x0213
        L_0x0212:
            r1 = r0
        L_0x0213:
            int r2 = r15.mHeight
            int r3 = r15.mMinHeight
            if (r2 >= r3) goto L_0x021a
            goto L_0x021b
        L_0x021a:
            r3 = r2
        L_0x021b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r15.mListDimensionBehaviors
            r7 = 0
            r8 = r4[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r20 = r1
            if (r8 == r7) goto L_0x0228
            r8 = 1
            goto L_0x0229
        L_0x0228:
            r8 = 0
        L_0x0229:
            r18 = 1
            r1 = r4[r18]
            r21 = r3
            if (r1 == r7) goto L_0x0233
            r1 = 1
            goto L_0x0234
        L_0x0233:
            r1 = 0
        L_0x0234:
            int r3 = r15.mDimensionRatioSide
            r15.mResolvedDimensionRatioSide = r3
            r22 = r9
            float r9 = r15.mDimensionRatio
            r15.mResolvedDimensionRatio = r9
            r23 = r10
            int r10 = r15.mMatchConstraintDefaultWidth
            r27 = r11
            int r11 = r15.mMatchConstraintDefaultHeight
            r24 = 0
            int r24 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            r25 = 4
            r30 = r12
            if (r24 <= 0) goto L_0x02d7
            int r12 = r15.mVisibility
            r31 = r13
            r13 = 8
            if (r12 == r13) goto L_0x02d9
            r12 = 0
            r13 = r4[r12]
            if (r13 != r7) goto L_0x0260
            if (r10 != 0) goto L_0x0260
            r10 = 3
        L_0x0260:
            r13 = 1
            r12 = r4[r13]
            if (r12 != r7) goto L_0x0268
            if (r11 != 0) goto L_0x0268
            r11 = 3
        L_0x0268:
            r12 = 0
            r14 = r4[r12]
            if (r14 != r7) goto L_0x027a
            r12 = r4[r13]
            if (r12 != r7) goto L_0x027a
            r12 = 3
            if (r10 != r12) goto L_0x027b
            if (r11 != r12) goto L_0x027b
            r15.setupDimensionRatio(r5, r6, r8, r1)
            goto L_0x02cb
        L_0x027a:
            r12 = 3
        L_0x027b:
            r1 = 0
            r8 = r4[r1]
            if (r8 != r7) goto L_0x029e
            if (r10 != r12) goto L_0x029e
            r15.mResolvedDimensionRatioSide = r1
            float r0 = (float) r2
            float r9 = r9 * r0
            int r1 = (int) r9
            r2 = 1
            r0 = r4[r2]
            if (r0 == r7) goto L_0x0294
            r33 = r11
            r32 = r21
            r34 = r25
            r14 = 0
            goto L_0x029b
        L_0x0294:
            r14 = r2
            r34 = r10
            r33 = r11
            r32 = r21
        L_0x029b:
            r19 = 0
            goto L_0x02e5
        L_0x029e:
            r2 = 1
            r1 = r4[r2]
            if (r1 != r7) goto L_0x02cb
            r1 = 3
            if (r11 != r1) goto L_0x02cb
            r15.mResolvedDimensionRatioSide = r2
            r1 = -1
            if (r3 != r1) goto L_0x02b0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r9
            r15.mResolvedDimensionRatio = r1
        L_0x02b0:
            float r1 = r15.mResolvedDimensionRatio
            float r0 = (float) r0
            float r1 = r1 * r0
            int r3 = (int) r1
            r19 = 0
            r0 = r4[r19]
            r32 = r3
            r34 = r10
            if (r0 == r7) goto L_0x02c6
            r14 = r19
            r1 = r20
            r33 = r25
            goto L_0x02e5
        L_0x02c6:
            r33 = r11
            r1 = r20
            goto L_0x02d5
        L_0x02cb:
            r19 = 0
            r34 = r10
            r33 = r11
            r1 = r20
            r32 = r21
        L_0x02d5:
            r14 = 1
            goto L_0x02e5
        L_0x02d7:
            r31 = r13
        L_0x02d9:
            r19 = 0
            r34 = r10
            r33 = r11
            r14 = r19
            r1 = r20
            r32 = r21
        L_0x02e5:
            int[] r0 = r15.mResolvedMatchConstraintDefault
            r0[r19] = r34
            r2 = 1
            r0[r2] = r33
            r15.mResolvedHasRatio = r14
            if (r14 == 0) goto L_0x02fa
            int r0 = r15.mResolvedDimensionRatioSide
            r2 = -1
            if (r0 == 0) goto L_0x02f7
            if (r0 != r2) goto L_0x02fb
        L_0x02f7:
            r20 = 1
            goto L_0x02fd
        L_0x02fa:
            r2 = -1
        L_0x02fb:
            r20 = 0
        L_0x02fd:
            if (r14 == 0) goto L_0x0309
            int r0 = r15.mResolvedDimensionRatioSide
            r3 = 1
            if (r0 == r3) goto L_0x0306
            if (r0 != r2) goto L_0x0309
        L_0x0306:
            r35 = 1
            goto L_0x030b
        L_0x0309:
            r35 = 0
        L_0x030b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x031a
            boolean r0 = r15 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L_0x031a
            r9 = 1
            goto L_0x031b
        L_0x031a:
            r9 = 0
        L_0x031b:
            if (r9 == 0) goto L_0x0320
            r21 = 0
            goto L_0x0322
        L_0x0320:
            r21 = r1
        L_0x0322:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mCenter
            boolean r0 = r0.isConnected()
            r1 = 1
            r36 = r0 ^ 1
            boolean[] r0 = r15.mIsInBarrier
            r2 = 0
            boolean r37 = r0[r2]
            boolean r38 = r0[r1]
            int r0 = r15.mHorizontalResolution
            r12 = 2
            r39 = 0
            if (r0 == r12) goto L_0x0444
            boolean r0 = r15.resolvedHorizontal
            if (r0 != 0) goto L_0x0444
            if (r55 == 0) goto L_0x03a0
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            if (r0 == 0) goto L_0x03a0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r2 = r1.resolved
            if (r2 == 0) goto L_0x03a0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 != 0) goto L_0x0350
            goto L_0x03a0
        L_0x0350:
            if (r55 == 0) goto L_0x039c
            int r0 = r1.value
            r11 = r54
            r10 = r31
            r11.addEquality(r10, r0)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r8 = r30
            r11.addEquality(r8, r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x0386
            if (r5 == 0) goto L_0x0386
            boolean[] r0 = r15.isTerminalWidget
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0386
            boolean r0 = r53.isInHorizontalChain()
            if (r0 != 0) goto L_0x0386
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.solver.SolverVariable r0 = r11.createObjectVariable(r0)
            r4 = 8
            r11.addGreaterThan(r0, r8, r1, r4)
        L_0x0386:
            r47 = r5
            r31 = r6
            r48 = r7
            r30 = r8
            r40 = r10
            r52 = r13
            r41 = r14
            r49 = r22
            r50 = r23
            r51 = r27
            goto L_0x0456
        L_0x039c:
            r11 = r54
            goto L_0x0444
        L_0x03a0:
            r11 = r54
            r8 = r30
            r10 = r31
            r4 = 8
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x03b5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.solver.SolverVariable r0 = r11.createObjectVariable(r0)
            r16 = r0
            goto L_0x03b7
        L_0x03b5:
            r16 = r39
        L_0x03b7:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x03c4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mLeft
            androidx.constraintlayout.solver.SolverVariable r0 = r11.createObjectVariable(r0)
            r30 = r0
            goto L_0x03c6
        L_0x03c4:
            r30 = r39
        L_0x03c6:
            boolean[] r0 = r15.isTerminalWidget
            r19 = 0
            boolean r31 = r0[r19]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r40 = r0[r19]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.mRight
            int r12 = r15.mX
            int r2 = r15.mMinWidth
            int[] r4 = r15.mMaxDimension
            r44 = r4[r19]
            float r4 = r15.mHorizontalBiasPercent
            r18 = 1
            r0 = r0[r18]
            if (r0 != r7) goto L_0x03e7
            r45 = r18
            goto L_0x03e9
        L_0x03e7:
            r45 = r19
        L_0x03e9:
            int r0 = r15.mMatchConstraintMinWidth
            r24 = r0
            int r0 = r15.mMatchConstraintMaxWidth
            r25 = r0
            float r0 = r15.mMatchConstraintPercentWidth
            r26 = r0
            r0 = r53
            r46 = r1
            r1 = r54
            r42 = r2
            r2 = 1
            r17 = r3
            r3 = r5
            r43 = r4
            r4 = r6
            r47 = r5
            r5 = r31
            r31 = r6
            r6 = r30
            r48 = r7
            r7 = r16
            r16 = r8
            r8 = r40
            r49 = r22
            r18 = r10
            r50 = r23
            r10 = r17
            r51 = r27
            r11 = r46
            r30 = r16
            r52 = r13
            r40 = r18
            r13 = r21
            r41 = r14
            r14 = r42
            r15 = r44
            r16 = r43
            r17 = r20
            r18 = r45
            r19 = r29
            r20 = r28
            r21 = r37
            r22 = r34
            r23 = r33
            r27 = r36
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0456
        L_0x0444:
            r47 = r5
            r48 = r7
            r52 = r13
            r41 = r14
            r49 = r22
            r50 = r23
            r51 = r27
            r40 = r31
            r31 = r6
        L_0x0456:
            if (r55 == 0) goto L_0x04bc
            r15 = r53
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            if (r0 == 0) goto L_0x04af
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r2 = r1.resolved
            if (r2 == 0) goto L_0x04af
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x04af
            int r0 = r1.value
            r14 = r54
            r13 = r51
            r14.addEquality(r13, r0)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r12 = r50
            r14.addEquality(r12, r0)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.baseline
            int r0 = r0.value
            r1 = r49
            r14.addEquality(r1, r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x04a9
            if (r28 != 0) goto L_0x04a9
            if (r31 == 0) goto L_0x04a9
            boolean[] r2 = r15.isTerminalWidget
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x04a5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.solver.SolverVariable r0 = r14.createObjectVariable(r0)
            r2 = 8
            r10 = 0
            r14.addGreaterThan(r0, r12, r10, r2)
            goto L_0x04ad
        L_0x04a5:
            r2 = 8
            r10 = 0
            goto L_0x04ad
        L_0x04a9:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x04ad:
            r8 = r10
            goto L_0x04cb
        L_0x04af:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x04ca
        L_0x04bc:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x04ca:
            r8 = r11
        L_0x04cb:
            int r0 = r15.mVerticalResolution
            r3 = 2
            if (r0 != r3) goto L_0x04d2
            r7 = r10
            goto L_0x04d3
        L_0x04d2:
            r7 = r8
        L_0x04d3:
            if (r7 == 0) goto L_0x05a9
            boolean r0 = r15.resolvedVertical
            if (r0 != 0) goto L_0x05a9
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L_0x04e7
            boolean r0 = r15 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L_0x04e7
            r9 = r11
            goto L_0x04e8
        L_0x04e7:
            r9 = r10
        L_0x04e8:
            if (r9 == 0) goto L_0x04ec
            r32 = r10
        L_0x04ec:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x04f8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.solver.SolverVariable r0 = r14.createObjectVariable(r0)
            r7 = r0
            goto L_0x04fa
        L_0x04f8:
            r7 = r39
        L_0x04fa:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x0506
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTop
            androidx.constraintlayout.solver.SolverVariable r0 = r14.createObjectVariable(r0)
            r6 = r0
            goto L_0x0508
        L_0x0506:
            r6 = r39
        L_0x0508:
            int r0 = r15.mBaselineDistance
            if (r0 > 0) goto L_0x0510
            int r0 = r15.mVisibility
            if (r0 != r2) goto L_0x0546
        L_0x0510:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L_0x0537
            int r0 = r53.getBaselineDistance()
            r14.addEquality(r1, r13, r0, r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.solver.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addEquality(r1, r0, r10, r2)
            if (r31 == 0) goto L_0x0534
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mBottom
            androidx.constraintlayout.solver.SolverVariable r0 = r14.createObjectVariable(r0)
            r1 = 5
            r14.addGreaterThan(r7, r0, r10, r1)
        L_0x0534:
            r27 = r10
            goto L_0x0548
        L_0x0537:
            int r0 = r15.mVisibility
            if (r0 != r2) goto L_0x053f
            r14.addEquality(r1, r13, r10, r2)
            goto L_0x0546
        L_0x053f:
            int r0 = r53.getBaselineDistance()
            r14.addEquality(r1, r13, r0, r2)
        L_0x0546:
            r27 = r36
        L_0x0548:
            boolean[] r0 = r15.isTerminalWidget
            boolean r5 = r0[r11]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = r0[r11]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r15.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.mBottom
            int r1 = r15.mY
            int r2 = r15.mMinHeight
            int[] r10 = r15.mMaxDimension
            r16 = r10[r11]
            float r10 = r15.mVerticalBiasPercent
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x0569
            r18 = 1
            goto L_0x056b
        L_0x0569:
            r18 = r17
        L_0x056b:
            int r0 = r15.mMatchConstraintMinHeight
            r24 = r0
            int r0 = r15.mMatchConstraintMaxHeight
            r25 = r0
            float r0 = r15.mMatchConstraintPercentHeight
            r26 = r0
            r0 = r53
            r19 = r1
            r1 = r54
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r31
            r21 = r4
            r4 = r47
            r17 = r10
            r10 = r21
            r31 = r12
            r12 = r19
            r36 = r13
            r13 = r32
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r35
            r19 = r28
            r20 = r29
            r21 = r38
            r22 = r33
            r23 = r34
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x05ad
        L_0x05a9:
            r31 = r12
            r36 = r13
        L_0x05ad:
            if (r41 == 0) goto L_0x05d5
            r6 = 8
            r7 = r53
            int r0 = r7.mResolvedDimensionRatioSide
            r1 = 1
            float r5 = r7.mResolvedDimensionRatio
            if (r0 != r1) goto L_0x05c5
            r0 = r54
            r1 = r31
            r2 = r36
            r3 = r30
            r4 = r40
            goto L_0x05d1
        L_0x05c5:
            r6 = 8
            r0 = r54
            r1 = r30
            r2 = r40
            r3 = r31
            r4 = r36
        L_0x05d1:
            r0.addRatio(r1, r2, r3, r4, r5, r6)
            goto L_0x05d7
        L_0x05d5:
            r7 = r53
        L_0x05d7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mCenter
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x05ff
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mCenter
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getOwner()
            float r1 = r7.mCircleConstraintAngle
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r7.mCenter
            int r2 = r2.getMargin()
            r3 = r54
            r3.addCenterPoint(r7, r0, r1, r2)
        L_0x05ff:
            r0 = 0
            r7.resolvedHorizontal = r0
            r7.resolvedVertical = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.addToSolver(androidx.constraintlayout.solver.LinearSystem, boolean):void");
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018b, code lost:
        if (r11.isConnected() != false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b4, code lost:
        if (r11.isConnected() != false) goto L_0x01b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r9, androidx.constraintlayout.solver.widgets.ConstraintWidget r10, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r11, int r12) {
        /*
            r8 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            r1 = 0
            if (r9 != r0) goto L_0x009a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            if (r11 != r0) goto L_0x0074
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r8.getAnchor(r12)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.getAnchor(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r8.getAnchor(r5)
            r7 = 1
            if (r11 == 0) goto L_0x0028
            boolean r11 = r11.isConnected()
            if (r11 != 0) goto L_0x0030
        L_0x0028:
            if (r2 == 0) goto L_0x0032
            boolean r11 = r2.isConnected()
            if (r11 == 0) goto L_0x0032
        L_0x0030:
            r9 = r1
            goto L_0x0039
        L_0x0032:
            r8.connect(r9, r10, r9, r1)
            r8.connect(r12, r10, r12, r1)
            r9 = r7
        L_0x0039:
            if (r4 == 0) goto L_0x0041
            boolean r11 = r4.isConnected()
            if (r11 != 0) goto L_0x0049
        L_0x0041:
            if (r6 == 0) goto L_0x004b
            boolean r11 = r6.isConnected()
            if (r11 == 0) goto L_0x004b
        L_0x0049:
            r7 = r1
            goto L_0x0051
        L_0x004b:
            r8.connect(r3, r10, r3, r1)
            r8.connect(r5, r10, r5, r1)
        L_0x0051:
            if (r9 == 0) goto L_0x005e
            if (r7 == 0) goto L_0x005e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getAnchor(r0)
            goto L_0x00be
        L_0x005e:
            if (r9 == 0) goto L_0x006f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X
        L_0x0062:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r11.connect(r9, r1)
            goto L_0x01bf
        L_0x006f:
            if (r7 == 0) goto L_0x01bf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y
            goto L_0x0062
        L_0x0074:
            if (r11 == r9) goto L_0x0089
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            if (r11 != r12) goto L_0x007b
            goto L_0x0089
        L_0x007b:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r11 == r9) goto L_0x0083
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r11 != r12) goto L_0x01bf
        L_0x0083:
            r8.connect(r9, r10, r11, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            goto L_0x008e
        L_0x0089:
            r8.connect(r9, r10, r11, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
        L_0x008e:
            r8.connect(r9, r10, r11, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r0)
        L_0x0095:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            goto L_0x00be
        L_0x009a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X
            if (r9 != r2) goto L_0x00c3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            if (r11 == r3) goto L_0x00a6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            if (r11 != r4) goto L_0x00c3
        L_0x00a6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            r9.connect(r10, r1)
            r11.connect(r10, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r2)
        L_0x00be:
            r9.connect(r10, r1)
            goto L_0x01bf
        L_0x00c3:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r9 != r3) goto L_0x00ec
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r11 == r4) goto L_0x00cf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r11 != r5) goto L_0x00ec
        L_0x00cf:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r11)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r8.getAnchor(r4)
            r10.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r8.getAnchor(r10)
            r10.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r8.getAnchor(r3)
            r10.connect(r9, r1)
            goto L_0x01bf
        L_0x00ec:
            if (r9 != r2) goto L_0x010f
            if (r11 != r2) goto L_0x010f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r2)
            goto L_0x0095
        L_0x010f:
            if (r9 != r3) goto L_0x0133
            if (r11 != r3) goto L_0x0133
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r3)
            goto L_0x0095
        L_0x0133:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            boolean r11 = r4.isValidConnection(r10)
            if (r11 == 0) goto L_0x01bf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            if (r9 != r11) goto L_0x015d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            if (r9 == 0) goto L_0x0156
            r9.reset()
        L_0x0156:
            if (r11 == 0) goto L_0x015b
            r11.reset()
        L_0x015b:
            r12 = r1
            goto L_0x01bc
        L_0x015d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r9 == r1) goto L_0x018e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r9 != r1) goto L_0x0166
            goto L_0x018e
        L_0x0166:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            if (r9 == r11) goto L_0x016e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            if (r9 != r11) goto L_0x01bc
        L_0x016e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r11.getTarget()
            if (r0 == r10) goto L_0x017b
            r11.reset()
        L_0x017b:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.getOpposite()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r2)
            boolean r0 = r11.isConnected()
            if (r0 == 0) goto L_0x01bc
            goto L_0x01b6
        L_0x018e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            if (r11 == 0) goto L_0x0197
            r11.reset()
        L_0x0197:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r11.getTarget()
            if (r0 == r10) goto L_0x01a4
            r11.reset()
        L_0x01a4:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.getOpposite()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r3)
            boolean r0 = r11.isConnected()
            if (r0 == 0) goto L_0x01bc
        L_0x01b6:
            r9.reset()
            r11.reset()
        L_0x01bc:
            r4.connect(r10, r12)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type, androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type, int):void");
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i2);
        }
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i2) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        immediateConnect(type, constraintWidget, type, i2, 0);
        this.mCircleConstraintAngle = f;
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.hasBaseline = constraintWidget.hasBaseline;
        this.inPlaceholder = constraintWidget.inPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        ConstraintWidget constraintWidget2 = null;
        this.mParent = this.mParent == null ? null : hashMap.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.mX = constraintWidget.mX;
        this.mY = constraintWidget.mY;
        this.mRelX = constraintWidget.mRelX;
        this.mRelY = constraintWidget.mRelY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
        this.mVisibility = constraintWidget.mVisibility;
        this.mDebugName = constraintWidget.mDebugName;
        this.mType = constraintWidget.mType;
        this.mDistToTop = constraintWidget.mDistToTop;
        this.mDistToLeft = constraintWidget.mDistToLeft;
        this.mDistToRight = constraintWidget.mDistToRight;
        this.mDistToBottom = constraintWidget.mDistToBottom;
        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
        this.mRightHasCentered = constraintWidget.mRightHasCentered;
        this.mTopHasCentered = constraintWidget.mTopHasCentered;
        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget3 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget3 == null ? null : hashMap.get(constraintWidget3);
        ConstraintWidget constraintWidget4 = constraintWidget.mVerticalNextWidget;
        if (constraintWidget4 != null) {
            constraintWidget2 = hashMap.get(constraintWidget4);
        }
        this.mVerticalNextWidget = constraintWidget2;
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public void ensureMeasureRequested() {
        this.mMeasureRequested = true;
    }

    public void ensureWidgetRuns() {
        if (this.horizontalRun == null) {
            this.horizontalRun = new HorizontalWidgetRun(this);
        }
        if (this.verticalRun == null) {
            this.verticalRun = new VerticalWidgetRun(this);
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            default:
                throw new AssertionError(type.name());
        }
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public float getBiasPercent(int i2) {
        if (i2 == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i2 == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public DimensionBehaviour getDimensionBehaviour(int i2) {
        if (i2 == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i2 == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i2 = 0;
        if (constraintAnchor != null) {
            i2 = 0 + constraintAnchor.mMargin;
        }
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i2 + constraintAnchor2.mMargin : i2;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.mLastHorizontalMeasureSpec;
    }

    public int getLastVerticalMeasureSpec() {
        return this.mLastVerticalMeasureSpec;
    }

    public int getLeft() {
        return getX();
    }

    public int getLength(int i2) {
        if (i2 == 0) {
            return getWidth();
        }
        if (i2 == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.mBottom;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.solver.widgets.ConstraintWidget getNextChainMember(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.getNextChainMember(int):androidx.constraintlayout.solver.widgets.ConstraintWidget");
    }

    public int getOptimizerWrapHeight() {
        int i2;
        int i3 = this.mHeight;
        if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i3;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            i2 = Math.max(this.mMatchConstraintMinHeight, i3);
        } else {
            i2 = this.mMatchConstraintMinHeight;
            if (i2 > 0) {
                this.mHeight = i2;
            } else {
                i2 = 0;
            }
        }
        int i4 = this.mMatchConstraintMaxHeight;
        return (i4 <= 0 || i4 >= i2) ? i2 : i4;
    }

    public int getOptimizerWrapWidth() {
        int i2;
        int i3 = this.mWidth;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i3;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            i2 = Math.max(this.mMatchConstraintMinWidth, i3);
        } else {
            i2 = this.mMatchConstraintMinWidth;
            if (i2 > 0) {
                this.mWidth = i2;
            } else {
                i2 = 0;
            }
        }
        int i4 = this.mMatchConstraintMaxWidth;
        return (i4 <= 0 || i4 >= i2) ? i2 : i4;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.mTop;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.solver.widgets.ConstraintWidget getPreviousChainMember(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.getPreviousChainMember(int):androidx.constraintlayout.solver.widgets.ConstraintWidget");
    }

    public int getRelativePositioning(int i2) {
        if (i2 == 0) {
            return this.mRelX;
        }
        if (i2 == 1) {
            return this.mRelY;
        }
        return 0;
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getRootX() {
        return this.mX + this.mOffsetX;
    }

    public int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public WidgetRun getRun(int i2) {
        if (i2 == 0) {
            return this.horizontalRun;
        }
        if (i2 == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public int getTop() {
        return getY();
    }

    public String getType() {
        return this.mType;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int i2 = 0;
        if (this.mLeft != null) {
            i2 = 0 + this.mTop.mMargin;
        }
        return this.mRight != null ? i2 + this.mBottom.mMargin : i2;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.mX : ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.mY : ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.mY;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public boolean hasDanglingDimension(int i2) {
        if (i2 == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        return ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0)) + (this.mBaseline.mTarget != null ? 1 : 0) < 2;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mAnchors.get(i2).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2, int i3) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i2, i3, true);
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isInHorizontalChain() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public boolean isInVerticalChain() {
        ConstraintAnchor constraintAnchor = this.mTop;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtuaLayout;
    }

    public boolean isMeasureRequested() {
        return this.mMeasureRequested && this.mVisibility != 8;
    }

    public boolean isResolvedHorizontally() {
        return this.resolvedHorizontal || (this.mLeft.hasFinalValue() && this.mRight.hasFinalValue());
    }

    public boolean isResolvedVertically() {
        return this.resolvedVertical || (this.mTop.hasFinalValue() && this.mBottom.hasFinalValue());
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public boolean oppositeDimensionDependsOn(int i2) {
        char c = i2 == 0 ? (char) 1 : 0;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i2];
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[c];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour3 && dimensionBehaviour2 == dimensionBehaviour3;
    }

    public boolean oppositeDimensionsTied() {
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.mMatchConstraintMaxHeight = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtuaLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.mMeasureRequested = true;
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() == null || !(getParent() instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
            ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
            ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
            ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
            if (constraintAnchor == anchor5) {
                if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                    anchor.reset();
                    anchor2.reset();
                }
                if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                    anchor3.reset();
                    anchor4.reset();
                }
                this.mHorizontalBiasPercent = 0.5f;
            } else {
                if (constraintAnchor == anchor6) {
                    if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                        anchor.reset();
                        anchor2.reset();
                    }
                    this.mHorizontalBiasPercent = 0.5f;
                } else if (constraintAnchor == anchor7) {
                    if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                        anchor3.reset();
                        anchor4.reset();
                    }
                } else if (constraintAnchor == anchor || constraintAnchor == anchor2 ? !(!anchor.isConnected() || anchor.getTarget() != anchor2.getTarget()) : (constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                    anchor5.reset();
                }
                constraintAnchor.reset();
            }
            this.mVerticalBiasPercent = 0.5f;
            constraintAnchor.reset();
        }
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent == null || !(parent instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            int size = this.mAnchors.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAnchors.get(i2).reset();
            }
        }
    }

    public void resetFinalResolution() {
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        int size = this.mAnchors.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mAnchors.get(i2).resetFinalResolution();
        }
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    public void setBaselineDistance(int i2) {
        this.mBaselineDistance = i2;
        this.hasBaseline = i2 > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.mContainerItemSkip = i2;
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        createObjectVariable.setName(str + ".left");
        createObjectVariable2.setName(str + ".top");
        createObjectVariable3.setName(str + ".right");
        createObjectVariable4.setName(str + ".bottom");
        SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
        createObjectVariable5.setName(str + ".baseline");
    }

    public void setDimension(int i2, int i3) {
        this.mWidth = i2;
        int i4 = this.mMinWidth;
        if (i2 < i4) {
            this.mWidth = i4;
        }
        this.mHeight = i3;
        int i5 = this.mMinHeight;
        if (i3 < i5) {
            this.mHeight = i5;
        }
    }

    public void setDimensionRatio(float f, int i2) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDimensionRatio(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = r4
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = r5
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = r0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.mDimensionRatio = r9
            r8.mDimensionRatioSide = r1
        L_0x008d:
            return
        L_0x008e:
            r8.mDimensionRatio = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.setDimensionRatio(java.lang.String):void");
    }

    public void setFinalBaseline(int i2) {
        if (this.hasBaseline) {
            int i3 = i2 - this.mBaselineDistance;
            int i4 = this.mHeight + i3;
            this.mY = i3;
            this.mTop.setFinalValue(i3);
            this.mBottom.setFinalValue(i4);
            this.mBaseline.setFinalValue(i2);
            this.resolvedVertical = true;
        }
    }

    public void setFinalFrame(int i2, int i3, int i4, int i5, int i6, int i7) {
        setFrame(i2, i3, i4, i5);
        setBaselineDistance(i6);
        if (i7 == 0) {
            this.resolvedHorizontal = true;
        } else {
            if (i7 == 1) {
                this.resolvedHorizontal = false;
            } else if (i7 == 2) {
                this.resolvedHorizontal = true;
            } else {
                this.resolvedHorizontal = false;
            }
            this.resolvedVertical = true;
            return;
        }
        this.resolvedVertical = false;
    }

    public void setFinalHorizontal(int i2, int i3) {
        this.mLeft.setFinalValue(i2);
        this.mRight.setFinalValue(i3);
        this.mX = i2;
        this.mWidth = i3 - i2;
        this.resolvedHorizontal = true;
    }

    public void setFinalLeft(int i2) {
        this.mLeft.setFinalValue(i2);
        this.mX = i2;
    }

    public void setFinalTop(int i2) {
        this.mTop.setFinalValue(i2);
        this.mY = i2;
    }

    public void setFinalVertical(int i2, int i3) {
        this.mTop.setFinalValue(i2);
        this.mBottom.setFinalValue(i3);
        this.mY = i2;
        this.mHeight = i3 - i2;
        if (this.hasBaseline) {
            this.mBaseline.setFinalValue(i2 + this.mBaselineDistance);
        }
        this.resolvedVertical = true;
    }

    public void setFrame(int i2, int i3, int i4) {
        if (i4 == 0) {
            setHorizontalDimension(i2, i3);
        } else if (i4 == 1) {
            setVerticalDimension(i2, i3);
        }
    }

    public void setFrame(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.mX = i2;
        this.mY = i3;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i8 < (i7 = this.mWidth)) {
            i8 = i7;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i9 < (i6 = this.mHeight)) {
            i9 = i6;
        }
        this.mWidth = i8;
        this.mHeight = i9;
        int i10 = this.mMinHeight;
        if (i9 < i10) {
            this.mHeight = i10;
        }
        int i11 = this.mMinWidth;
        if (i8 < i11) {
            this.mWidth = i11;
        }
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i2) {
        ConstraintAnchor constraintAnchor;
        int ordinal = type.ordinal();
        if (ordinal == 1) {
            constraintAnchor = this.mLeft;
        } else if (ordinal == 2) {
            constraintAnchor = this.mTop;
        } else if (ordinal == 3) {
            constraintAnchor = this.mRight;
        } else if (ordinal == 4) {
            constraintAnchor = this.mBottom;
        } else {
            return;
        }
        constraintAnchor.mGoneMargin = i2;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public void setHeight(int i2) {
        this.mHeight = i2;
        int i3 = this.mMinHeight;
        if (i2 < i3) {
            this.mHeight = i3;
        }
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setHorizontalChainStyle(int i2) {
        this.mHorizontalChainStyle = i2;
    }

    public void setHorizontalDimension(int i2, int i3) {
        this.mX = i2;
        int i4 = i3 - i2;
        this.mWidth = i4;
        int i5 = this.mMinWidth;
        if (i4 < i5) {
            this.mWidth = i5;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setHorizontalMatchStyle(int i2, int i3, int i4, float f) {
        this.mMatchConstraintDefaultWidth = i2;
        this.mMatchConstraintMinWidth = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.mMatchConstraintMaxWidth = i4;
        this.mMatchConstraintPercentWidth = f;
        if (f > 0.0f && f < 1.0f && i2 == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setInBarrier(int i2, boolean z) {
        this.mIsInBarrier[i2] = z;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtuaLayout = z;
    }

    public void setLastMeasureSpec(int i2, int i3) {
        this.mLastHorizontalMeasureSpec = i2;
        this.mLastVerticalMeasureSpec = i3;
        setMeasureRequested(false);
    }

    public void setLength(int i2, int i3) {
        if (i3 == 0) {
            setWidth(i2);
        } else if (i3 == 1) {
            setHeight(i2);
        }
    }

    public void setMaxHeight(int i2) {
        this.mMaxDimension[1] = i2;
    }

    public void setMaxWidth(int i2) {
        this.mMaxDimension[0] = i2;
    }

    public void setMeasureRequested(boolean z) {
        this.mMeasureRequested = z;
    }

    public void setMinHeight(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.mMinHeight = i2;
    }

    public void setMinWidth(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.mMinWidth = i2;
    }

    public void setOffset(int i2, int i3) {
        this.mOffsetX = i2;
        this.mOffsetY = i3;
    }

    public void setOrigin(int i2, int i3) {
        this.mX = i2;
        this.mY = i3;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setRelativePositioning(int i2, int i3) {
        if (i3 == 0) {
            this.mRelX = i2;
        } else if (i3 == 1) {
            this.mRelY = i2;
        }
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setVerticalChainStyle(int i2) {
        this.mVerticalChainStyle = i2;
    }

    public void setVerticalDimension(int i2, int i3) {
        this.mY = i2;
        int i4 = i3 - i2;
        this.mHeight = i4;
        int i5 = this.mMinHeight;
        if (i4 < i5) {
            this.mHeight = i5;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public void setVerticalMatchStyle(int i2, int i3, int i4, float f) {
        this.mMatchConstraintDefaultHeight = i2;
        this.mMatchConstraintMinHeight = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.mMatchConstraintMaxHeight = i4;
        this.mMatchConstraintPercentHeight = f;
        if (f > 0.0f && f < 1.0f && i2 == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setVisibility(int i2) {
        this.mVisibility = i2;
    }

    public void setWidth(int i2) {
        this.mWidth = i2;
        int i3 = this.mMinWidth;
        if (i2 < i3) {
            this.mWidth = i3;
        }
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public void setX(int i2) {
        this.mX = i2;
    }

    public void setY(int i2) {
        this.mY = i2;
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i2 = this.mMatchConstraintMinWidth;
            if (i2 > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (i2 == 0 && this.mMatchConstraintMinHeight > 0) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(this.mType != null ? a.q(a.y("type: "), this.mType, " ") : str);
        if (this.mDebugName != null) {
            str = a.q(a.y("id: "), this.mDebugName, " ");
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.mX);
        sb.append(", ");
        sb.append(this.mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        return a.o(sb, this.mHeight, ")");
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i2;
        int i3;
        boolean isResolved = z & this.horizontalRun.isResolved();
        boolean isResolved2 = z2 & this.verticalRun.isResolved();
        HorizontalWidgetRun horizontalWidgetRun = this.horizontalRun;
        int i4 = horizontalWidgetRun.start.value;
        VerticalWidgetRun verticalWidgetRun = this.verticalRun;
        int i5 = verticalWidgetRun.start.value;
        int i6 = horizontalWidgetRun.end.value;
        int i7 = verticalWidgetRun.end.value;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (isResolved) {
            this.mX = i4;
        }
        if (isResolved2) {
            this.mY = i5;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (isResolved) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i9 < (i3 = this.mWidth)) {
                i9 = i3;
            }
            this.mWidth = i9;
            int i11 = this.mMinWidth;
            if (i9 < i11) {
                this.mWidth = i11;
            }
        }
        if (isResolved2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i10 < (i2 = this.mHeight)) {
                i10 = i2;
            }
            this.mHeight = i10;
            int i12 = this.mMinHeight;
            if (i10 < i12) {
                this.mHeight = i12;
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z) {
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z && (horizontalWidgetRun = this.horizontalRun) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.start;
            if (dependencyNode.resolved) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.end;
                if (dependencyNode2.resolved) {
                    objectVariableValue = dependencyNode.value;
                    objectVariableValue3 = dependencyNode2.value;
                }
            }
        }
        if (z && (verticalWidgetRun = this.verticalRun) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.start;
            if (dependencyNode3.resolved) {
                DependencyNode dependencyNode4 = verticalWidgetRun.end;
                if (dependencyNode4.resolved) {
                    objectVariableValue2 = dependencyNode3.value;
                    objectVariableValue4 = dependencyNode4.value;
                }
            }
        }
        int i2 = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i2 < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue4 = 0;
            objectVariableValue = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }
}
