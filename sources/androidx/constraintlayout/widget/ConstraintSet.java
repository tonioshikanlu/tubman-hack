package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import b.e.a.a.a;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.segment.analytics.AnalyticsContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintSet {
    private static final int ALPHA = 43;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_TO_BASELINE = 1;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    private static final int CONSTRAINED_HEIGHT = 81;
    private static final int CONSTRAINED_WIDTH = 80;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    public static final int INVISIBLE = 4;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 82;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    /* access modifiers changed from: private */
    public static final int[] VISIBILITY_FLAGS = {0, 4, 8};
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    private static SparseIntArray mapToConstant;
    private HashMap<Integer, Constraint> mConstraints = new HashMap<>();
    private boolean mForceId = true;
    private HashMap<String, ConstraintAttribute> mSavedAttributes = new HashMap<>();
    private boolean mValidate;

    public static class Constraint {
        public final Layout layout = new Layout();
        public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap<>();
        public int mViewId;
        public final Motion motion = new Motion();
        public final PropertySet propertySet = new PropertySet();
        public final Transform transform = new Transform();

        /* access modifiers changed from: private */
        public void fillFrom(int i2, ConstraintLayout.LayoutParams layoutParams) {
            this.mViewId = i2;
            Layout layout2 = this.layout;
            layout2.leftToLeft = layoutParams.leftToLeft;
            layout2.leftToRight = layoutParams.leftToRight;
            layout2.rightToLeft = layoutParams.rightToLeft;
            layout2.rightToRight = layoutParams.rightToRight;
            layout2.topToTop = layoutParams.topToTop;
            layout2.topToBottom = layoutParams.topToBottom;
            layout2.bottomToTop = layoutParams.bottomToTop;
            layout2.bottomToBottom = layoutParams.bottomToBottom;
            layout2.baselineToBaseline = layoutParams.baselineToBaseline;
            layout2.startToEnd = layoutParams.startToEnd;
            layout2.startToStart = layoutParams.startToStart;
            layout2.endToStart = layoutParams.endToStart;
            layout2.endToEnd = layoutParams.endToEnd;
            layout2.horizontalBias = layoutParams.horizontalBias;
            layout2.verticalBias = layoutParams.verticalBias;
            layout2.dimensionRatio = layoutParams.dimensionRatio;
            layout2.circleConstraint = layoutParams.circleConstraint;
            layout2.circleRadius = layoutParams.circleRadius;
            layout2.circleAngle = layoutParams.circleAngle;
            layout2.editorAbsoluteX = layoutParams.editorAbsoluteX;
            layout2.editorAbsoluteY = layoutParams.editorAbsoluteY;
            layout2.orientation = layoutParams.orientation;
            layout2.guidePercent = layoutParams.guidePercent;
            layout2.guideBegin = layoutParams.guideBegin;
            layout2.guideEnd = layoutParams.guideEnd;
            Layout layout3 = this.layout;
            layout3.mWidth = layoutParams.width;
            layout3.mHeight = layoutParams.height;
            layout3.leftMargin = layoutParams.leftMargin;
            layout3.rightMargin = layoutParams.rightMargin;
            layout3.topMargin = layoutParams.topMargin;
            layout3.bottomMargin = layoutParams.bottomMargin;
            layout3.verticalWeight = layoutParams.verticalWeight;
            layout3.horizontalWeight = layoutParams.horizontalWeight;
            layout3.verticalChainStyle = layoutParams.verticalChainStyle;
            layout3.horizontalChainStyle = layoutParams.horizontalChainStyle;
            layout3.constrainedWidth = layoutParams.constrainedWidth;
            layout3.constrainedHeight = layoutParams.constrainedHeight;
            layout3.widthDefault = layoutParams.matchConstraintDefaultWidth;
            layout3.heightDefault = layoutParams.matchConstraintDefaultHeight;
            layout3.widthMax = layoutParams.matchConstraintMaxWidth;
            layout3.heightMax = layoutParams.matchConstraintMaxHeight;
            layout3.widthMin = layoutParams.matchConstraintMinWidth;
            layout3.heightMin = layoutParams.matchConstraintMinHeight;
            layout3.widthPercent = layoutParams.matchConstraintPercentWidth;
            layout3.heightPercent = layoutParams.matchConstraintPercentHeight;
            layout3.mConstraintTag = layoutParams.constraintTag;
            layout3.goneTopMargin = layoutParams.goneTopMargin;
            layout3.goneBottomMargin = layoutParams.goneBottomMargin;
            layout3.goneLeftMargin = layoutParams.goneLeftMargin;
            layout3.goneRightMargin = layoutParams.goneRightMargin;
            Layout layout4 = this.layout;
            layout4.goneStartMargin = layoutParams.goneStartMargin;
            layout4.goneEndMargin = layoutParams.goneEndMargin;
            layout4.endMargin = layoutParams.getMarginEnd();
            this.layout.startMargin = layoutParams.getMarginStart();
        }

        /* access modifiers changed from: private */
        public void fillFromConstraints(int i2, Constraints.LayoutParams layoutParams) {
            fillFrom(i2, layoutParams);
            this.propertySet.alpha = layoutParams.alpha;
            Transform transform2 = this.transform;
            transform2.rotation = layoutParams.rotation;
            transform2.rotationX = layoutParams.rotationX;
            transform2.rotationY = layoutParams.rotationY;
            transform2.scaleX = layoutParams.scaleX;
            transform2.scaleY = layoutParams.scaleY;
            transform2.transformPivotX = layoutParams.transformPivotX;
            transform2.transformPivotY = layoutParams.transformPivotY;
            transform2.translationX = layoutParams.translationX;
            transform2.translationY = layoutParams.translationY;
            transform2.translationZ = layoutParams.translationZ;
            transform2.elevation = layoutParams.elevation;
            transform2.applyElevation = layoutParams.applyElevation;
        }

        /* access modifiers changed from: private */
        public void fillFromConstraints(ConstraintHelper constraintHelper, int i2, Constraints.LayoutParams layoutParams) {
            fillFromConstraints(i2, layoutParams);
            if (constraintHelper instanceof Barrier) {
                Layout layout2 = this.layout;
                layout2.mHelperType = 1;
                Barrier barrier = (Barrier) constraintHelper;
                layout2.mBarrierDirection = barrier.getType();
                this.layout.mReferenceIds = barrier.getReferencedIds();
                this.layout.mBarrierMargin = barrier.getMargin();
            }
        }

        private ConstraintAttribute get(String str, ConstraintAttribute.AttributeType attributeType) {
            if (this.mCustomConstraints.containsKey(str)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str);
                if (constraintAttribute.getType() == attributeType) {
                    return constraintAttribute;
                }
                StringBuilder y = a.y("ConstraintAttribute is already a ");
                y.append(constraintAttribute.getType().name());
                throw new IllegalArgumentException(y.toString());
            }
            ConstraintAttribute constraintAttribute2 = new ConstraintAttribute(str, attributeType);
            this.mCustomConstraints.put(str, constraintAttribute2);
            return constraintAttribute2;
        }

        /* access modifiers changed from: private */
        public void setColorValue(String str, int i2) {
            get(str, ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(i2);
        }

        /* access modifiers changed from: private */
        public void setFloatValue(String str, float f) {
            get(str, ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(f);
        }

        /* access modifiers changed from: private */
        public void setIntValue(String str, int i2) {
            get(str, ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(i2);
        }

        /* access modifiers changed from: private */
        public void setStringValue(String str, String str2) {
            get(str, ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(str2);
        }

        public void applyTo(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout2 = this.layout;
            layoutParams.leftToLeft = layout2.leftToLeft;
            layoutParams.leftToRight = layout2.leftToRight;
            layoutParams.rightToLeft = layout2.rightToLeft;
            layoutParams.rightToRight = layout2.rightToRight;
            layoutParams.topToTop = layout2.topToTop;
            layoutParams.topToBottom = layout2.topToBottom;
            layoutParams.bottomToTop = layout2.bottomToTop;
            layoutParams.bottomToBottom = layout2.bottomToBottom;
            layoutParams.baselineToBaseline = layout2.baselineToBaseline;
            layoutParams.startToEnd = layout2.startToEnd;
            layoutParams.startToStart = layout2.startToStart;
            layoutParams.endToStart = layout2.endToStart;
            layoutParams.endToEnd = layout2.endToEnd;
            layoutParams.leftMargin = layout2.leftMargin;
            layoutParams.rightMargin = layout2.rightMargin;
            layoutParams.topMargin = layout2.topMargin;
            layoutParams.bottomMargin = layout2.bottomMargin;
            layoutParams.goneStartMargin = layout2.goneStartMargin;
            layoutParams.goneEndMargin = layout2.goneEndMargin;
            layoutParams.goneTopMargin = layout2.goneTopMargin;
            layoutParams.goneBottomMargin = layout2.goneBottomMargin;
            layoutParams.horizontalBias = layout2.horizontalBias;
            layoutParams.verticalBias = layout2.verticalBias;
            layoutParams.circleConstraint = layout2.circleConstraint;
            layoutParams.circleRadius = layout2.circleRadius;
            Layout layout3 = this.layout;
            layoutParams.circleAngle = layout3.circleAngle;
            layoutParams.dimensionRatio = layout3.dimensionRatio;
            layoutParams.editorAbsoluteX = layout3.editorAbsoluteX;
            layoutParams.editorAbsoluteY = layout3.editorAbsoluteY;
            layoutParams.verticalWeight = layout3.verticalWeight;
            layoutParams.horizontalWeight = layout3.horizontalWeight;
            layoutParams.verticalChainStyle = layout3.verticalChainStyle;
            layoutParams.horizontalChainStyle = layout3.horizontalChainStyle;
            layoutParams.constrainedWidth = layout3.constrainedWidth;
            layoutParams.constrainedHeight = layout3.constrainedHeight;
            layoutParams.matchConstraintDefaultWidth = layout3.widthDefault;
            layoutParams.matchConstraintDefaultHeight = layout3.heightDefault;
            layoutParams.matchConstraintMaxWidth = layout3.widthMax;
            layoutParams.matchConstraintMaxHeight = layout3.heightMax;
            layoutParams.matchConstraintMinWidth = layout3.widthMin;
            layoutParams.matchConstraintMinHeight = layout3.heightMin;
            layoutParams.matchConstraintPercentWidth = layout3.widthPercent;
            layoutParams.matchConstraintPercentHeight = layout3.heightPercent;
            layoutParams.orientation = layout3.orientation;
            layoutParams.guidePercent = layout3.guidePercent;
            layoutParams.guideBegin = layout3.guideBegin;
            layoutParams.guideEnd = layout3.guideEnd;
            layoutParams.width = layout3.mWidth;
            layoutParams.height = layout3.mHeight;
            String str = layout3.mConstraintTag;
            if (str != null) {
                layoutParams.constraintTag = str;
            }
            layoutParams.setMarginStart(this.layout.startMargin);
            layoutParams.setMarginEnd(this.layout.endMargin);
            layoutParams.validate();
        }

        public Constraint clone() {
            Constraint constraint = new Constraint();
            constraint.layout.copyFrom(this.layout);
            constraint.motion.copyFrom(this.motion);
            constraint.propertySet.copyFrom(this.propertySet);
            constraint.transform.copyFrom(this.transform);
            constraint.mViewId = this.mViewId;
            return constraint;
        }
    }

    public static class Layout {
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        private static final int UNUSED = 76;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_PERCENT = 69;
        private static SparseIntArray mapToConstant;
        public int baselineToBaseline = -1;
        public int bottomMargin = -1;
        public int bottomToBottom = -1;
        public int bottomToTop = -1;
        public float circleAngle = 0.0f;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public boolean constrainedHeight = false;
        public boolean constrainedWidth = false;
        public String dimensionRatio = null;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int endMargin = -1;
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
        public int heightDefault = 0;
        public int heightMax = -1;
        public int heightMin = -1;
        public float heightPercent = 1.0f;
        public float horizontalBias = 0.5f;
        public int horizontalChainStyle = 0;
        public float horizontalWeight = -1.0f;
        public int leftMargin = -1;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public boolean mApply = false;
        public boolean mBarrierAllowsGoneWidgets = true;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public String mConstraintTag;
        public int mHeight;
        public int mHelperType = -1;
        public boolean mIsGuideline = false;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public int orientation = -1;
        public int rightMargin = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int startMargin = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int topMargin = -1;
        public int topToBottom = -1;
        public int topToTop = -1;
        public float verticalBias = 0.5f;
        public int verticalChainStyle = 0;
        public float verticalWeight = -1.0f;
        public int widthDefault = 0;
        public int widthMax = -1;
        public int widthMin = -1;
        public float widthPercent = 1.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            mapToConstant.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            mapToConstant.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            mapToConstant.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            mapToConstant.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            mapToConstant.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            mapToConstant.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            mapToConstant.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            mapToConstant.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            mapToConstant.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            mapToConstant.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            mapToConstant.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            mapToConstant.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            mapToConstant.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            mapToConstant.append(R.styleable.Layout_android_orientation, 26);
            mapToConstant.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            mapToConstant.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            mapToConstant.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            mapToConstant.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginTop, 16);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginRight, 14);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginStart, 15);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            mapToConstant.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            mapToConstant.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            mapToConstant.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            mapToConstant.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            mapToConstant.append(R.styleable.Layout_layout_constraintLeft_creator, 76);
            mapToConstant.append(R.styleable.Layout_layout_constraintTop_creator, 76);
            mapToConstant.append(R.styleable.Layout_layout_constraintRight_creator, 76);
            mapToConstant.append(R.styleable.Layout_layout_constraintBottom_creator, 76);
            mapToConstant.append(R.styleable.Layout_layout_constraintBaseline_creator, 76);
            mapToConstant.append(R.styleable.Layout_android_layout_marginLeft, 23);
            mapToConstant.append(R.styleable.Layout_android_layout_marginRight, 27);
            mapToConstant.append(R.styleable.Layout_android_layout_marginStart, 30);
            mapToConstant.append(R.styleable.Layout_android_layout_marginEnd, 8);
            mapToConstant.append(R.styleable.Layout_android_layout_marginTop, 33);
            mapToConstant.append(R.styleable.Layout_android_layout_marginBottom, 2);
            mapToConstant.append(R.styleable.Layout_android_layout_width, 22);
            mapToConstant.append(R.styleable.Layout_android_layout_height, 21);
            mapToConstant.append(R.styleable.Layout_layout_constraintCircle, 61);
            mapToConstant.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            mapToConstant.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            mapToConstant.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            mapToConstant.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            mapToConstant.append(R.styleable.Layout_chainUseRtl, 71);
            mapToConstant.append(R.styleable.Layout_barrierDirection, 72);
            mapToConstant.append(R.styleable.Layout_barrierMargin, 73);
            mapToConstant.append(R.styleable.Layout_constraint_referenced_ids, 74);
            mapToConstant.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void copyFrom(Layout layout) {
            this.mIsGuideline = layout.mIsGuideline;
            this.mWidth = layout.mWidth;
            this.mApply = layout.mApply;
            this.mHeight = layout.mHeight;
            this.guideBegin = layout.guideBegin;
            this.guideEnd = layout.guideEnd;
            this.guidePercent = layout.guidePercent;
            this.leftToLeft = layout.leftToLeft;
            this.leftToRight = layout.leftToRight;
            this.rightToLeft = layout.rightToLeft;
            this.rightToRight = layout.rightToRight;
            this.topToTop = layout.topToTop;
            this.topToBottom = layout.topToBottom;
            this.bottomToTop = layout.bottomToTop;
            this.bottomToBottom = layout.bottomToBottom;
            this.baselineToBaseline = layout.baselineToBaseline;
            this.startToEnd = layout.startToEnd;
            this.startToStart = layout.startToStart;
            this.endToStart = layout.endToStart;
            this.endToEnd = layout.endToEnd;
            this.horizontalBias = layout.horizontalBias;
            this.verticalBias = layout.verticalBias;
            this.dimensionRatio = layout.dimensionRatio;
            this.circleConstraint = layout.circleConstraint;
            this.circleRadius = layout.circleRadius;
            this.circleAngle = layout.circleAngle;
            this.editorAbsoluteX = layout.editorAbsoluteX;
            this.editorAbsoluteY = layout.editorAbsoluteY;
            this.orientation = layout.orientation;
            this.leftMargin = layout.leftMargin;
            this.rightMargin = layout.rightMargin;
            this.topMargin = layout.topMargin;
            this.bottomMargin = layout.bottomMargin;
            this.endMargin = layout.endMargin;
            this.startMargin = layout.startMargin;
            this.goneLeftMargin = layout.goneLeftMargin;
            this.goneTopMargin = layout.goneTopMargin;
            this.goneRightMargin = layout.goneRightMargin;
            this.goneBottomMargin = layout.goneBottomMargin;
            this.goneEndMargin = layout.goneEndMargin;
            this.goneStartMargin = layout.goneStartMargin;
            this.verticalWeight = layout.verticalWeight;
            this.horizontalWeight = layout.horizontalWeight;
            this.horizontalChainStyle = layout.horizontalChainStyle;
            this.verticalChainStyle = layout.verticalChainStyle;
            this.widthDefault = layout.widthDefault;
            this.heightDefault = layout.heightDefault;
            this.widthMax = layout.widthMax;
            this.heightMax = layout.heightMax;
            this.widthMin = layout.widthMin;
            this.heightMin = layout.heightMin;
            this.widthPercent = layout.widthPercent;
            this.heightPercent = layout.heightPercent;
            this.mBarrierDirection = layout.mBarrierDirection;
            this.mBarrierMargin = layout.mBarrierMargin;
            this.mHelperType = layout.mHelperType;
            this.mConstraintTag = layout.mConstraintTag;
            int[] iArr = layout.mReferenceIds;
            if (iArr != null) {
                this.mReferenceIds = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.mReferenceIds = null;
            }
            this.mReferenceIdString = layout.mReferenceIdString;
            this.constrainedWidth = layout.constrainedWidth;
            this.constrainedHeight = layout.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = layout.mBarrierAllowsGoneWidgets;
        }

        /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void dump(androidx.constraintlayout.motion.widget.MotionScene r10, java.lang.StringBuilder r11) {
            /*
                r9 = this;
                java.lang.Class r0 = r9.getClass()
                java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
                java.lang.String r1 = "\n"
                r11.append(r1)
                r1 = 0
            L_0x000e:
                int r2 = r0.length
                if (r1 >= r2) goto L_0x007d
                r2 = r0[r1]
                java.lang.String r3 = r2.getName()
                int r4 = r2.getModifiers()
                boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
                if (r4 == 0) goto L_0x0022
                goto L_0x007a
            L_0x0022:
                java.lang.Object r4 = r2.get(r9)     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.Class r2 = r2.getType()     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.String r6 = "\"\n"
                java.lang.String r7 = " = \""
                java.lang.String r8 = "    "
                if (r2 != r5) goto L_0x0059
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ IllegalAccessException -> 0x0076 }
                int r2 = r4.intValue()     // Catch:{ IllegalAccessException -> 0x0076 }
                r5 = -1
                if (r2 == r5) goto L_0x007a
                int r2 = r4.intValue()     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.String r2 = r10.lookUpConstraintName(r2)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r8)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r3)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r7)     // Catch:{ IllegalAccessException -> 0x0076 }
                if (r2 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r4 = r2
            L_0x0052:
                r11.append(r4)     // Catch:{ IllegalAccessException -> 0x0076 }
            L_0x0055:
                r11.append(r6)     // Catch:{ IllegalAccessException -> 0x0076 }
                goto L_0x007a
            L_0x0059:
                java.lang.Class r5 = java.lang.Float.TYPE     // Catch:{ IllegalAccessException -> 0x0076 }
                if (r2 != r5) goto L_0x007a
                java.lang.Float r4 = (java.lang.Float) r4     // Catch:{ IllegalAccessException -> 0x0076 }
                float r2 = r4.floatValue()     // Catch:{ IllegalAccessException -> 0x0076 }
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 == 0) goto L_0x007a
                r11.append(r8)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r3)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r7)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r4)     // Catch:{ IllegalAccessException -> 0x0076 }
                goto L_0x0055
            L_0x0076:
                r2 = move-exception
                r2.printStackTrace()
            L_0x007a:
                int r1 = r1 + 1
                goto L_0x000e
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.Layout.dump(androidx.constraintlayout.motion.widget.MotionScene, java.lang.StringBuilder):void");
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            String str;
            StringBuilder sb;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = mapToConstant.get(index);
                if (i3 == 80) {
                    this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.baselineToBaseline = ConstraintSet.lookupID(obtainStyledAttributes, index, this.baselineToBaseline);
                            break;
                        case 2:
                            this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.bottomMargin);
                            break;
                        case 3:
                            this.bottomToBottom = ConstraintSet.lookupID(obtainStyledAttributes, index, this.bottomToBottom);
                            break;
                        case 4:
                            this.bottomToTop = ConstraintSet.lookupID(obtainStyledAttributes, index, this.bottomToTop);
                            break;
                        case 5:
                            this.dimensionRatio = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                            break;
                        case 7:
                            this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                            break;
                        case 8:
                            this.endMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.endMargin);
                            break;
                        case 9:
                            this.endToEnd = ConstraintSet.lookupID(obtainStyledAttributes, index, this.endToEnd);
                            break;
                        case 10:
                            this.endToStart = ConstraintSet.lookupID(obtainStyledAttributes, index, this.endToStart);
                            break;
                        case 11:
                            this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                            break;
                        case 12:
                            this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                            break;
                        case 13:
                            this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                            break;
                        case 14:
                            this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                            break;
                        case 15:
                            this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                            break;
                        case 16:
                            this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                            break;
                        case 17:
                            this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                            break;
                        case 18:
                            this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                            break;
                        case 19:
                            this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                            break;
                        case 20:
                            this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                            break;
                        case 21:
                            this.mHeight = obtainStyledAttributes.getLayoutDimension(index, this.mHeight);
                            break;
                        case 22:
                            this.mWidth = obtainStyledAttributes.getLayoutDimension(index, this.mWidth);
                            break;
                        case 23:
                            this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.leftMargin);
                            break;
                        case 24:
                            this.leftToLeft = ConstraintSet.lookupID(obtainStyledAttributes, index, this.leftToLeft);
                            break;
                        case 25:
                            this.leftToRight = ConstraintSet.lookupID(obtainStyledAttributes, index, this.leftToRight);
                            break;
                        case 26:
                            this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                            break;
                        case 27:
                            this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.rightMargin);
                            break;
                        case 28:
                            this.rightToLeft = ConstraintSet.lookupID(obtainStyledAttributes, index, this.rightToLeft);
                            break;
                        case 29:
                            this.rightToRight = ConstraintSet.lookupID(obtainStyledAttributes, index, this.rightToRight);
                            break;
                        case 30:
                            this.startMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.startMargin);
                            break;
                        case 31:
                            this.startToEnd = ConstraintSet.lookupID(obtainStyledAttributes, index, this.startToEnd);
                            break;
                        case 32:
                            this.startToStart = ConstraintSet.lookupID(obtainStyledAttributes, index, this.startToStart);
                            break;
                        case 33:
                            this.topMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.topMargin);
                            break;
                        case 34:
                            this.topToBottom = ConstraintSet.lookupID(obtainStyledAttributes, index, this.topToBottom);
                            break;
                        case 35:
                            this.topToTop = ConstraintSet.lookupID(obtainStyledAttributes, index, this.topToTop);
                            break;
                        case 36:
                            this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                            break;
                        case 37:
                            this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                            break;
                        case 38:
                            this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                            break;
                        case 39:
                            this.horizontalChainStyle = obtainStyledAttributes.getInt(index, this.horizontalChainStyle);
                            break;
                        case 40:
                            this.verticalChainStyle = obtainStyledAttributes.getInt(index, this.verticalChainStyle);
                            break;
                        default:
                            switch (i3) {
                                case 54:
                                    this.widthDefault = obtainStyledAttributes.getInt(index, this.widthDefault);
                                    break;
                                case 55:
                                    this.heightDefault = obtainStyledAttributes.getInt(index, this.heightDefault);
                                    break;
                                case 56:
                                    this.widthMax = obtainStyledAttributes.getDimensionPixelSize(index, this.widthMax);
                                    break;
                                case 57:
                                    this.heightMax = obtainStyledAttributes.getDimensionPixelSize(index, this.heightMax);
                                    break;
                                case 58:
                                    this.widthMin = obtainStyledAttributes.getDimensionPixelSize(index, this.widthMin);
                                    break;
                                case 59:
                                    this.heightMin = obtainStyledAttributes.getDimensionPixelSize(index, this.heightMin);
                                    break;
                                default:
                                    switch (i3) {
                                        case 61:
                                            this.circleConstraint = ConstraintSet.lookupID(obtainStyledAttributes, index, this.circleConstraint);
                                            break;
                                        case 62:
                                            this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                                            break;
                                        case 63:
                                            this.circleAngle = obtainStyledAttributes.getFloat(index, this.circleAngle);
                                            break;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.widthPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.heightPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e(ConstraintSet.TAG, "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.mBarrierDirection = obtainStyledAttributes.getInt(index, this.mBarrierDirection);
                                                    continue;
                                                case 73:
                                                    this.mBarrierMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.mBarrierMargin);
                                                    continue;
                                                case 74:
                                                    this.mReferenceIdString = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.mBarrierAllowsGoneWidgets = obtainStyledAttributes.getBoolean(index, this.mBarrierAllowsGoneWidgets);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.mConstraintTag = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(mapToConstant.get(index));
                                            Log.w(ConstraintSet.TAG, sb.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class Motion {
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 6;
        private static final int PATH_MOTION_ARC = 2;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static SparseIntArray mapToConstant;
        public int mAnimateRelativeTo = -1;
        public boolean mApply = false;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPathMotionArc = -1;
        public float mPathRotate = Float.NaN;
        public String mTransitionEasing = null;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            mapToConstant.append(R.styleable.Motion_pathMotionArc, 2);
            mapToConstant.append(R.styleable.Motion_transitionEasing, 3);
            mapToConstant.append(R.styleable.Motion_drawPath, 4);
            mapToConstant.append(R.styleable.Motion_animate_relativeTo, 5);
            mapToConstant.append(R.styleable.Motion_motionStagger, 6);
        }

        public void copyFrom(Motion motion) {
            this.mApply = motion.mApply;
            this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
            this.mTransitionEasing = motion.mTransitionEasing;
            this.mPathMotionArc = motion.mPathMotionArc;
            this.mDrawPath = motion.mDrawPath;
            this.mPathRotate = motion.mPathRotate;
            this.mMotionStagger = motion.mMotionStagger;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (mapToConstant.get(index)) {
                    case 1:
                        this.mPathRotate = obtainStyledAttributes.getFloat(index, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = obtainStyledAttributes.getInt(index, this.mPathMotionArc);
                        break;
                    case 3:
                        this.mTransitionEasing = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : Easing.NAMED_EASING[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.mDrawPath = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = ConstraintSet.lookupID(obtainStyledAttributes, index, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mMotionStagger = obtainStyledAttributes.getFloat(index, this.mMotionStagger);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class PropertySet {
        public float alpha = 1.0f;
        public boolean mApply = false;
        public float mProgress = Float.NaN;
        public int mVisibilityMode = 0;
        public int visibility = 0;

        public void copyFrom(PropertySet propertySet) {
            this.mApply = propertySet.mApply;
            this.visibility = propertySet.visibility;
            this.alpha = propertySet.alpha;
            this.mProgress = propertySet.mProgress;
            this.mVisibilityMode = propertySet.mVisibilityMode;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.alpha = obtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    this.visibility = obtainStyledAttributes.getInt(index, this.visibility);
                    this.visibility = ConstraintSet.VISIBILITY_FLAGS[this.visibility];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.mVisibilityMode = obtainStyledAttributes.getInt(index, this.mVisibilityMode);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.mProgress = obtainStyledAttributes.getFloat(index, this.mProgress);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class Transform {
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static SparseIntArray mapToConstant;
        public boolean applyElevation = false;
        public float elevation = 0.0f;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            mapToConstant.append(R.styleable.Transform_android_rotationX, 2);
            mapToConstant.append(R.styleable.Transform_android_rotationY, 3);
            mapToConstant.append(R.styleable.Transform_android_scaleX, 4);
            mapToConstant.append(R.styleable.Transform_android_scaleY, 5);
            mapToConstant.append(R.styleable.Transform_android_transformPivotX, 6);
            mapToConstant.append(R.styleable.Transform_android_transformPivotY, 7);
            mapToConstant.append(R.styleable.Transform_android_translationX, 8);
            mapToConstant.append(R.styleable.Transform_android_translationY, 9);
            mapToConstant.append(R.styleable.Transform_android_translationZ, 10);
            mapToConstant.append(R.styleable.Transform_android_elevation, 11);
        }

        public void copyFrom(Transform transform) {
            this.mApply = transform.mApply;
            this.rotation = transform.rotation;
            this.rotationX = transform.rotationX;
            this.rotationY = transform.rotationY;
            this.scaleX = transform.scaleX;
            this.scaleY = transform.scaleY;
            this.transformPivotX = transform.transformPivotX;
            this.transformPivotY = transform.transformPivotY;
            this.translationX = transform.translationX;
            this.translationY = transform.translationY;
            this.translationZ = transform.translationZ;
            this.applyElevation = transform.applyElevation;
            this.elevation = transform.elevation;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (mapToConstant.get(index)) {
                    case 1:
                        this.rotation = obtainStyledAttributes.getFloat(index, this.rotation);
                        break;
                    case 2:
                        this.rotationX = obtainStyledAttributes.getFloat(index, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = obtainStyledAttributes.getFloat(index, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = obtainStyledAttributes.getFloat(index, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = obtainStyledAttributes.getFloat(index, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = obtainStyledAttributes.getDimension(index, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = obtainStyledAttributes.getDimension(index, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = obtainStyledAttributes.getDimension(index, this.translationX);
                        break;
                    case 9:
                        this.translationY = obtainStyledAttributes.getDimension(index, this.translationY);
                        break;
                    case 10:
                        this.translationZ = obtainStyledAttributes.getDimension(index, this.translationZ);
                        break;
                    case 11:
                        this.applyElevation = true;
                        this.elevation = obtainStyledAttributes.getDimension(index, this.elevation);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        mapToConstant = sparseIntArray;
        sparseIntArray.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        mapToConstant.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        mapToConstant.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        mapToConstant.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        mapToConstant.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        mapToConstant.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        mapToConstant.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        mapToConstant.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        mapToConstant.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        mapToConstant.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        mapToConstant.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        mapToConstant.append(R.styleable.Constraint_android_orientation, 27);
        mapToConstant.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        mapToConstant.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        mapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        mapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        mapToConstant.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        mapToConstant.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        mapToConstant.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        mapToConstant.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        mapToConstant.append(R.styleable.Constraint_layout_constraintLeft_creator, 82);
        mapToConstant.append(R.styleable.Constraint_layout_constraintTop_creator, 82);
        mapToConstant.append(R.styleable.Constraint_layout_constraintRight_creator, 82);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBottom_creator, 82);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_creator, 82);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginRight, 28);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginStart, 31);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginTop, 34);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        mapToConstant.append(R.styleable.Constraint_android_layout_width, 23);
        mapToConstant.append(R.styleable.Constraint_android_layout_height, 21);
        mapToConstant.append(R.styleable.Constraint_android_visibility, 22);
        mapToConstant.append(R.styleable.Constraint_android_alpha, 43);
        mapToConstant.append(R.styleable.Constraint_android_elevation, 44);
        mapToConstant.append(R.styleable.Constraint_android_rotationX, 45);
        mapToConstant.append(R.styleable.Constraint_android_rotationY, 46);
        mapToConstant.append(R.styleable.Constraint_android_rotation, 60);
        mapToConstant.append(R.styleable.Constraint_android_scaleX, 47);
        mapToConstant.append(R.styleable.Constraint_android_scaleY, 48);
        mapToConstant.append(R.styleable.Constraint_android_transformPivotX, 49);
        mapToConstant.append(R.styleable.Constraint_android_transformPivotY, 50);
        mapToConstant.append(R.styleable.Constraint_android_translationX, 51);
        mapToConstant.append(R.styleable.Constraint_android_translationY, 52);
        mapToConstant.append(R.styleable.Constraint_android_translationZ, 53);
        mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        mapToConstant.append(R.styleable.Constraint_layout_constraintCircle, 61);
        mapToConstant.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        mapToConstant.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        mapToConstant.append(R.styleable.Constraint_animate_relativeTo, 64);
        mapToConstant.append(R.styleable.Constraint_transitionEasing, 65);
        mapToConstant.append(R.styleable.Constraint_drawPath, 66);
        mapToConstant.append(R.styleable.Constraint_transitionPathRotate, 67);
        mapToConstant.append(R.styleable.Constraint_motionStagger, 79);
        mapToConstant.append(R.styleable.Constraint_android_id, 38);
        mapToConstant.append(R.styleable.Constraint_motionProgress, 68);
        mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        mapToConstant.append(R.styleable.Constraint_chainUseRtl, 71);
        mapToConstant.append(R.styleable.Constraint_barrierDirection, 72);
        mapToConstant.append(R.styleable.Constraint_barrierMargin, 73);
        mapToConstant.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        mapToConstant.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        mapToConstant.append(R.styleable.Constraint_pathMotionArc, 76);
        mapToConstant.append(R.styleable.Constraint_layout_constraintTag, 77);
        mapToConstant.append(R.styleable.Constraint_visibilityMode, 78);
        mapToConstant.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        mapToConstant.append(R.styleable.Constraint_layout_constrainedHeight, 81);
    }

    private void addAttributes(ConstraintAttribute.AttributeType attributeType, String... strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (this.mSavedAttributes.containsKey(strArr[i2])) {
                ConstraintAttribute constraintAttribute = this.mSavedAttributes.get(strArr[i2]);
                if (constraintAttribute.getType() != attributeType) {
                    StringBuilder y = a.y("ConstraintAttribute is already a ");
                    y.append(constraintAttribute.getType().name());
                    throw new IllegalArgumentException(y.toString());
                }
            } else {
                this.mSavedAttributes.put(strArr[i2], new ConstraintAttribute(strArr[i2], attributeType));
            }
        }
    }

    private int[] convertReferenceString(View view, String str) {
        int i2;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = R.id.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, AnalyticsContext.Device.DEVICE_ID_KEY, context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i2 = ((Integer) designInformation).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    private void createHorizontalChain(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6, int i7, int i8) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                get(iArr2[0]).layout.horizontalWeight = fArr2[0];
            }
            get(iArr2[0]).layout.horizontalChainStyle = i6;
            connect(iArr2[0], i7, i2, i3, -1);
            for (int i9 = 1; i9 < iArr2.length; i9++) {
                int i10 = iArr2[i9];
                int i11 = i9 - 1;
                connect(iArr2[i9], i7, iArr2[i11], i8, -1);
                connect(iArr2[i11], i8, iArr2[i9], i7, -1);
                if (fArr2 != null) {
                    get(iArr2[i9]).layout.horizontalWeight = fArr2[i9];
                }
            }
            connect(iArr2[iArr2.length - 1], i8, i4, i5, -1);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    private Constraint fillFromAttributeList(Context context, AttributeSet attributeSet) {
        Constraint constraint = new Constraint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Constraint);
        populateConstraint(context, constraint, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return constraint;
    }

    private Constraint get(int i2) {
        if (!this.mConstraints.containsKey(Integer.valueOf(i2))) {
            this.mConstraints.put(Integer.valueOf(i2), new Constraint());
        }
        return this.mConstraints.get(Integer.valueOf(i2));
    }

    /* access modifiers changed from: private */
    public static int lookupID(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    private void populateConstraint(Context context, Constraint constraint, TypedArray typedArray) {
        String str;
        StringBuilder sb;
        Motion motion;
        String str2;
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (!(index == R.styleable.Constraint_android_id || R.styleable.Constraint_android_layout_marginStart == index || R.styleable.Constraint_android_layout_marginEnd == index)) {
                constraint.motion.mApply = true;
                constraint.layout.mApply = true;
                constraint.propertySet.mApply = true;
                constraint.transform.mApply = true;
            }
            switch (mapToConstant.get(index)) {
                case 1:
                    Layout layout = constraint.layout;
                    layout.baselineToBaseline = lookupID(typedArray, index, layout.baselineToBaseline);
                    continue;
                case 2:
                    Layout layout2 = constraint.layout;
                    layout2.bottomMargin = typedArray.getDimensionPixelSize(index, layout2.bottomMargin);
                    continue;
                case 3:
                    Layout layout3 = constraint.layout;
                    layout3.bottomToBottom = lookupID(typedArray, index, layout3.bottomToBottom);
                    continue;
                case 4:
                    Layout layout4 = constraint.layout;
                    layout4.bottomToTop = lookupID(typedArray, index, layout4.bottomToTop);
                    continue;
                case 5:
                    constraint.layout.dimensionRatio = typedArray.getString(index);
                    continue;
                case 6:
                    Layout layout5 = constraint.layout;
                    layout5.editorAbsoluteX = typedArray.getDimensionPixelOffset(index, layout5.editorAbsoluteX);
                    continue;
                case 7:
                    Layout layout6 = constraint.layout;
                    layout6.editorAbsoluteY = typedArray.getDimensionPixelOffset(index, layout6.editorAbsoluteY);
                    continue;
                case 8:
                    Layout layout7 = constraint.layout;
                    layout7.endMargin = typedArray.getDimensionPixelSize(index, layout7.endMargin);
                    continue;
                case 9:
                    Layout layout8 = constraint.layout;
                    layout8.endToEnd = lookupID(typedArray, index, layout8.endToEnd);
                    continue;
                case 10:
                    Layout layout9 = constraint.layout;
                    layout9.endToStart = lookupID(typedArray, index, layout9.endToStart);
                    continue;
                case 11:
                    Layout layout10 = constraint.layout;
                    layout10.goneBottomMargin = typedArray.getDimensionPixelSize(index, layout10.goneBottomMargin);
                    continue;
                case 12:
                    Layout layout11 = constraint.layout;
                    layout11.goneEndMargin = typedArray.getDimensionPixelSize(index, layout11.goneEndMargin);
                    continue;
                case 13:
                    Layout layout12 = constraint.layout;
                    layout12.goneLeftMargin = typedArray.getDimensionPixelSize(index, layout12.goneLeftMargin);
                    continue;
                case 14:
                    Layout layout13 = constraint.layout;
                    layout13.goneRightMargin = typedArray.getDimensionPixelSize(index, layout13.goneRightMargin);
                    continue;
                case 15:
                    Layout layout14 = constraint.layout;
                    layout14.goneStartMargin = typedArray.getDimensionPixelSize(index, layout14.goneStartMargin);
                    continue;
                case 16:
                    Layout layout15 = constraint.layout;
                    layout15.goneTopMargin = typedArray.getDimensionPixelSize(index, layout15.goneTopMargin);
                    continue;
                case 17:
                    Layout layout16 = constraint.layout;
                    layout16.guideBegin = typedArray.getDimensionPixelOffset(index, layout16.guideBegin);
                    continue;
                case 18:
                    Layout layout17 = constraint.layout;
                    layout17.guideEnd = typedArray.getDimensionPixelOffset(index, layout17.guideEnd);
                    continue;
                case 19:
                    Layout layout18 = constraint.layout;
                    layout18.guidePercent = typedArray.getFloat(index, layout18.guidePercent);
                    continue;
                case 20:
                    Layout layout19 = constraint.layout;
                    layout19.horizontalBias = typedArray.getFloat(index, layout19.horizontalBias);
                    continue;
                case 21:
                    Layout layout20 = constraint.layout;
                    layout20.mHeight = typedArray.getLayoutDimension(index, layout20.mHeight);
                    continue;
                case 22:
                    PropertySet propertySet = constraint.propertySet;
                    propertySet.visibility = typedArray.getInt(index, propertySet.visibility);
                    PropertySet propertySet2 = constraint.propertySet;
                    propertySet2.visibility = VISIBILITY_FLAGS[propertySet2.visibility];
                    continue;
                case 23:
                    Layout layout21 = constraint.layout;
                    layout21.mWidth = typedArray.getLayoutDimension(index, layout21.mWidth);
                    continue;
                case 24:
                    Layout layout22 = constraint.layout;
                    layout22.leftMargin = typedArray.getDimensionPixelSize(index, layout22.leftMargin);
                    continue;
                case 25:
                    Layout layout23 = constraint.layout;
                    layout23.leftToLeft = lookupID(typedArray, index, layout23.leftToLeft);
                    continue;
                case 26:
                    Layout layout24 = constraint.layout;
                    layout24.leftToRight = lookupID(typedArray, index, layout24.leftToRight);
                    continue;
                case 27:
                    Layout layout25 = constraint.layout;
                    layout25.orientation = typedArray.getInt(index, layout25.orientation);
                    continue;
                case 28:
                    Layout layout26 = constraint.layout;
                    layout26.rightMargin = typedArray.getDimensionPixelSize(index, layout26.rightMargin);
                    continue;
                case 29:
                    Layout layout27 = constraint.layout;
                    layout27.rightToLeft = lookupID(typedArray, index, layout27.rightToLeft);
                    continue;
                case 30:
                    Layout layout28 = constraint.layout;
                    layout28.rightToRight = lookupID(typedArray, index, layout28.rightToRight);
                    continue;
                case 31:
                    Layout layout29 = constraint.layout;
                    layout29.startMargin = typedArray.getDimensionPixelSize(index, layout29.startMargin);
                    continue;
                case 32:
                    Layout layout30 = constraint.layout;
                    layout30.startToEnd = lookupID(typedArray, index, layout30.startToEnd);
                    continue;
                case 33:
                    Layout layout31 = constraint.layout;
                    layout31.startToStart = lookupID(typedArray, index, layout31.startToStart);
                    continue;
                case 34:
                    Layout layout32 = constraint.layout;
                    layout32.topMargin = typedArray.getDimensionPixelSize(index, layout32.topMargin);
                    continue;
                case 35:
                    Layout layout33 = constraint.layout;
                    layout33.topToBottom = lookupID(typedArray, index, layout33.topToBottom);
                    continue;
                case 36:
                    Layout layout34 = constraint.layout;
                    layout34.topToTop = lookupID(typedArray, index, layout34.topToTop);
                    continue;
                case 37:
                    Layout layout35 = constraint.layout;
                    layout35.verticalBias = typedArray.getFloat(index, layout35.verticalBias);
                    continue;
                case 38:
                    constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                    continue;
                case 39:
                    Layout layout36 = constraint.layout;
                    layout36.horizontalWeight = typedArray.getFloat(index, layout36.horizontalWeight);
                    continue;
                case 40:
                    Layout layout37 = constraint.layout;
                    layout37.verticalWeight = typedArray.getFloat(index, layout37.verticalWeight);
                    continue;
                case 41:
                    Layout layout38 = constraint.layout;
                    layout38.horizontalChainStyle = typedArray.getInt(index, layout38.horizontalChainStyle);
                    continue;
                case 42:
                    Layout layout39 = constraint.layout;
                    layout39.verticalChainStyle = typedArray.getInt(index, layout39.verticalChainStyle);
                    continue;
                case 43:
                    PropertySet propertySet3 = constraint.propertySet;
                    propertySet3.alpha = typedArray.getFloat(index, propertySet3.alpha);
                    continue;
                case 44:
                    Transform transform = constraint.transform;
                    transform.applyElevation = true;
                    transform.elevation = typedArray.getDimension(index, transform.elevation);
                    continue;
                case 45:
                    Transform transform2 = constraint.transform;
                    transform2.rotationX = typedArray.getFloat(index, transform2.rotationX);
                    continue;
                case 46:
                    Transform transform3 = constraint.transform;
                    transform3.rotationY = typedArray.getFloat(index, transform3.rotationY);
                    continue;
                case 47:
                    Transform transform4 = constraint.transform;
                    transform4.scaleX = typedArray.getFloat(index, transform4.scaleX);
                    continue;
                case 48:
                    Transform transform5 = constraint.transform;
                    transform5.scaleY = typedArray.getFloat(index, transform5.scaleY);
                    continue;
                case 49:
                    Transform transform6 = constraint.transform;
                    transform6.transformPivotX = typedArray.getDimension(index, transform6.transformPivotX);
                    continue;
                case 50:
                    Transform transform7 = constraint.transform;
                    transform7.transformPivotY = typedArray.getDimension(index, transform7.transformPivotY);
                    continue;
                case 51:
                    Transform transform8 = constraint.transform;
                    transform8.translationX = typedArray.getDimension(index, transform8.translationX);
                    continue;
                case 52:
                    Transform transform9 = constraint.transform;
                    transform9.translationY = typedArray.getDimension(index, transform9.translationY);
                    continue;
                case 53:
                    Transform transform10 = constraint.transform;
                    transform10.translationZ = typedArray.getDimension(index, transform10.translationZ);
                    continue;
                case 54:
                    Layout layout40 = constraint.layout;
                    layout40.widthDefault = typedArray.getInt(index, layout40.widthDefault);
                    continue;
                case 55:
                    Layout layout41 = constraint.layout;
                    layout41.heightDefault = typedArray.getInt(index, layout41.heightDefault);
                    continue;
                case 56:
                    Layout layout42 = constraint.layout;
                    layout42.widthMax = typedArray.getDimensionPixelSize(index, layout42.widthMax);
                    continue;
                case 57:
                    Layout layout43 = constraint.layout;
                    layout43.heightMax = typedArray.getDimensionPixelSize(index, layout43.heightMax);
                    continue;
                case 58:
                    Layout layout44 = constraint.layout;
                    layout44.widthMin = typedArray.getDimensionPixelSize(index, layout44.widthMin);
                    continue;
                case 59:
                    Layout layout45 = constraint.layout;
                    layout45.heightMin = typedArray.getDimensionPixelSize(index, layout45.heightMin);
                    continue;
                case 60:
                    Transform transform11 = constraint.transform;
                    transform11.rotation = typedArray.getFloat(index, transform11.rotation);
                    continue;
                case 61:
                    Layout layout46 = constraint.layout;
                    layout46.circleConstraint = lookupID(typedArray, index, layout46.circleConstraint);
                    continue;
                case 62:
                    Layout layout47 = constraint.layout;
                    layout47.circleRadius = typedArray.getDimensionPixelSize(index, layout47.circleRadius);
                    continue;
                case 63:
                    Layout layout48 = constraint.layout;
                    layout48.circleAngle = typedArray.getFloat(index, layout48.circleAngle);
                    continue;
                case 64:
                    Motion motion2 = constraint.motion;
                    motion2.mAnimateRelativeTo = lookupID(typedArray, index, motion2.mAnimateRelativeTo);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        motion = constraint.motion;
                        str2 = typedArray.getString(index);
                    } else {
                        motion = constraint.motion;
                        str2 = Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                    }
                    motion.mTransitionEasing = str2;
                    continue;
                case 66:
                    constraint.motion.mDrawPath = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    Motion motion3 = constraint.motion;
                    motion3.mPathRotate = typedArray.getFloat(index, motion3.mPathRotate);
                    continue;
                case 68:
                    PropertySet propertySet4 = constraint.propertySet;
                    propertySet4.mProgress = typedArray.getFloat(index, propertySet4.mProgress);
                    continue;
                case 69:
                    constraint.layout.widthPercent = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    constraint.layout.heightPercent = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    Layout layout49 = constraint.layout;
                    layout49.mBarrierDirection = typedArray.getInt(index, layout49.mBarrierDirection);
                    continue;
                case 73:
                    Layout layout50 = constraint.layout;
                    layout50.mBarrierMargin = typedArray.getDimensionPixelSize(index, layout50.mBarrierMargin);
                    continue;
                case 74:
                    constraint.layout.mReferenceIdString = typedArray.getString(index);
                    continue;
                case 75:
                    Layout layout51 = constraint.layout;
                    layout51.mBarrierAllowsGoneWidgets = typedArray.getBoolean(index, layout51.mBarrierAllowsGoneWidgets);
                    continue;
                case 76:
                    Motion motion4 = constraint.motion;
                    motion4.mPathMotionArc = typedArray.getInt(index, motion4.mPathMotionArc);
                    continue;
                case 77:
                    constraint.layout.mConstraintTag = typedArray.getString(index);
                    continue;
                case 78:
                    PropertySet propertySet5 = constraint.propertySet;
                    propertySet5.mVisibilityMode = typedArray.getInt(index, propertySet5.mVisibilityMode);
                    continue;
                case 79:
                    Motion motion5 = constraint.motion;
                    motion5.mMotionStagger = typedArray.getFloat(index, motion5.mMotionStagger);
                    continue;
                case 80:
                    Layout layout52 = constraint.layout;
                    layout52.constrainedWidth = typedArray.getBoolean(index, layout52.constrainedWidth);
                    continue;
                case 81:
                    Layout layout53 = constraint.layout;
                    layout53.constrainedHeight = typedArray.getBoolean(index, layout53.constrainedHeight);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(mapToConstant.get(index));
            Log.w(TAG, sb.toString());
        }
    }

    private String sideToString(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    private static String[] splitString(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            if (charArray[i3] == ',' && !z) {
                arrayList.add(new String(charArray, i2, i3 - i2));
                i2 = i3 + 1;
            } else if (charArray[i3] == '\"') {
                z = !z;
            }
        }
        arrayList.add(new String(charArray, i2, charArray.length - i2));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void addColorAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    public void addFloatAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    public void addIntAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    public void addStringAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    public void addToHorizontalChain(int i2, int i3, int i4) {
        connect(i2, 1, i3, i3 == 0 ? 1 : 2, 0);
        connect(i2, 2, i4, i4 == 0 ? 2 : 1, 0);
        if (i3 != 0) {
            connect(i3, 2, i2, 1, 0);
        }
        if (i4 != 0) {
            connect(i4, 1, i2, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i2, int i3, int i4) {
        connect(i2, 6, i3, i3 == 0 ? 6 : 7, 0);
        connect(i2, 7, i4, i4 == 0 ? 7 : 6, 0);
        if (i3 != 0) {
            connect(i3, 7, i2, 6, 0);
        }
        if (i4 != 0) {
            connect(i4, 6, i2, 7, 0);
        }
    }

    public void addToVerticalChain(int i2, int i3, int i4) {
        connect(i2, 3, i3, i3 == 0 ? 3 : 4, 0);
        connect(i2, 4, i4, i4 == 0 ? 4 : 3, 0);
        if (i3 != 0) {
            connect(i3, 4, i2, 3, 0);
        }
        if (i4 != 0) {
            connect(i4, 3, i2, 4, 0);
        }
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                StringBuilder y = a.y("id unknown ");
                y.append(Debug.getName(childAt));
                Log.v(TAG, y.toString());
            } else if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.mConstraints.containsKey(Integer.valueOf(id))) {
                ConstraintAttribute.setAttributes(childAt, this.mConstraints.get(Integer.valueOf(id)).mCustomConstraints);
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, true);
        constraintLayout.setConstraintSet((ConstraintSet) null);
        constraintLayout.requestLayout();
    }

    public void applyToHelper(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        int id = constraintHelper.getId();
        if (this.mConstraints.containsKey(Integer.valueOf(id))) {
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
            if (constraintWidget instanceof HelperWidget) {
                constraintHelper.loadParameters(constraint, (HelperWidget) constraintWidget, layoutParams, sparseArray);
            }
        }
    }

    public void applyToInternal(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.mConstraints.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                StringBuilder y = a.y("id unknown ");
                y.append(Debug.getName(childAt));
                Log.w(TAG, y.toString());
            } else if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.mConstraints.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        constraint.layout.mHelperType = 1;
                    }
                    int i3 = constraint.layout.mHelperType;
                    if (i3 != -1 && i3 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(constraint.layout.mBarrierDirection);
                        barrier.setMargin(constraint.layout.mBarrierMargin);
                        barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                        Layout layout = constraint.layout;
                        int[] iArr = layout.mReferenceIds;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = layout.mReferenceIdString;
                            if (str != null) {
                                layout.mReferenceIds = convertReferenceString(barrier, str);
                                barrier.setReferencedIds(constraint.layout.mReferenceIds);
                            }
                        }
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.validate();
                    constraint.applyTo(layoutParams);
                    if (z) {
                        ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                    }
                    childAt.setLayoutParams(layoutParams);
                    PropertySet propertySet = constraint.propertySet;
                    if (propertySet.mVisibilityMode == 0) {
                        childAt.setVisibility(propertySet.visibility);
                    }
                    childAt.setAlpha(constraint.propertySet.alpha);
                    childAt.setRotation(constraint.transform.rotation);
                    childAt.setRotationX(constraint.transform.rotationX);
                    childAt.setRotationY(constraint.transform.rotationY);
                    childAt.setScaleX(constraint.transform.scaleX);
                    childAt.setScaleY(constraint.transform.scaleY);
                    if (!Float.isNaN(constraint.transform.transformPivotX)) {
                        childAt.setPivotX(constraint.transform.transformPivotX);
                    }
                    if (!Float.isNaN(constraint.transform.transformPivotY)) {
                        childAt.setPivotY(constraint.transform.transformPivotY);
                    }
                    childAt.setTranslationX(constraint.transform.translationX);
                    childAt.setTranslationY(constraint.transform.translationY);
                    childAt.setTranslationZ(constraint.transform.translationZ);
                    Transform transform = constraint.transform;
                    if (transform.applyElevation) {
                        childAt.setElevation(transform.elevation);
                    }
                } else {
                    Log.v(TAG, "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Constraint constraint2 = this.mConstraints.get(num);
            int i4 = constraint2.layout.mHelperType;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                Layout layout2 = constraint2.layout;
                int[] iArr2 = layout2.mReferenceIds;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = layout2.mReferenceIdString;
                    if (str2 != null) {
                        layout2.mReferenceIds = convertReferenceString(barrier2, str2);
                        barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                    }
                }
                barrier2.setType(constraint2.layout.mBarrierDirection);
                barrier2.setMargin(constraint2.layout.mBarrierMargin);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.validateParams();
                constraint2.applyTo(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (constraint2.layout.mIsGuideline) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                constraint2.applyTo(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public void applyToLayoutParams(int i2, ConstraintLayout.LayoutParams layoutParams) {
        if (this.mConstraints.containsKey(Integer.valueOf(i2))) {
            this.mConstraints.get(Integer.valueOf(i2)).applyTo(layoutParams);
        }
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, false);
        constraintLayout.setConstraintSet((ConstraintSet) null);
    }

    public void center(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f) {
        int i9;
        int i10;
        ConstraintSet constraintSet;
        int i11 = i4;
        float f2 = f;
        if (i5 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i8 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f2 <= 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else {
            if (i11 == 1 || i11 == 2) {
                constraintSet = this;
                i10 = i2;
                constraintSet.connect(i10, 1, i3, i4, i5);
                i9 = 2;
            } else if (i11 == 6 || i11 == 7) {
                constraintSet = this;
                i10 = i2;
                constraintSet.connect(i10, 6, i3, i4, i5);
                i9 = 7;
            } else {
                int i12 = i2;
                connect(i12, 3, i3, i4, i5);
                connect(i12, 4, i6, i7, i8);
                this.mConstraints.get(Integer.valueOf(i2)).layout.verticalBias = f2;
                return;
            }
            constraintSet.connect(i10, i9, i6, i7, i8);
            this.mConstraints.get(Integer.valueOf(i2)).layout.horizontalBias = f2;
        }
    }

    public void centerHorizontally(int i2, int i3) {
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ConstraintSet constraintSet;
        if (i3 == 0) {
            i9 = 0;
            i8 = 1;
            i7 = 0;
            i6 = 0;
            i5 = 2;
            i4 = 0;
            f = 0.5f;
            constraintSet = this;
            i10 = i2;
        } else {
            i8 = 2;
            i7 = 0;
            i5 = 1;
            i4 = 0;
            f = 0.5f;
            constraintSet = this;
            i10 = i2;
            i9 = i3;
            i6 = i3;
        }
        constraintSet.center(i10, i9, i8, i7, i6, i5, i4, f);
    }

    public void centerHorizontally(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f) {
        connect(i2, 1, i3, i4, i5);
        connect(i2, 2, i6, i7, i8);
        this.mConstraints.get(Integer.valueOf(i2)).layout.horizontalBias = f;
    }

    public void centerHorizontallyRtl(int i2, int i3) {
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ConstraintSet constraintSet;
        if (i3 == 0) {
            i9 = 0;
            i8 = 6;
            i7 = 0;
            i6 = 0;
            i5 = 7;
            i4 = 0;
            f = 0.5f;
            constraintSet = this;
            i10 = i2;
        } else {
            i8 = 7;
            i7 = 0;
            i5 = 6;
            i4 = 0;
            f = 0.5f;
            constraintSet = this;
            i10 = i2;
            i9 = i3;
            i6 = i3;
        }
        constraintSet.center(i10, i9, i8, i7, i6, i5, i4, f);
    }

    public void centerHorizontallyRtl(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f) {
        connect(i2, 6, i3, i4, i5);
        connect(i2, 7, i6, i7, i8);
        this.mConstraints.get(Integer.valueOf(i2)).layout.horizontalBias = f;
    }

    public void centerVertically(int i2, int i3) {
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ConstraintSet constraintSet;
        if (i3 == 0) {
            i9 = 0;
            i8 = 3;
            i7 = 0;
            i6 = 0;
            i5 = 4;
            i4 = 0;
            f = 0.5f;
            constraintSet = this;
            i10 = i2;
        } else {
            i8 = 4;
            i7 = 0;
            i5 = 3;
            i4 = 0;
            f = 0.5f;
            constraintSet = this;
            i10 = i2;
            i9 = i3;
            i6 = i3;
        }
        constraintSet.center(i10, i9, i8, i7, i6, i5, i4, f);
    }

    public void centerVertically(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f) {
        connect(i2, 3, i3, i4, i5);
        connect(i2, 4, i6, i7, i8);
        this.mConstraints.get(Integer.valueOf(i2)).layout.verticalBias = f;
    }

    public void clear(int i2) {
        this.mConstraints.remove(Integer.valueOf(i2));
    }

    public void clear(int i2, int i3) {
        if (this.mConstraints.containsKey(Integer.valueOf(i2))) {
            Constraint constraint = this.mConstraints.get(Integer.valueOf(i2));
            switch (i3) {
                case 1:
                    Layout layout = constraint.layout;
                    layout.leftToRight = -1;
                    layout.leftToLeft = -1;
                    layout.leftMargin = -1;
                    layout.goneLeftMargin = -1;
                    return;
                case 2:
                    Layout layout2 = constraint.layout;
                    layout2.rightToRight = -1;
                    layout2.rightToLeft = -1;
                    layout2.rightMargin = -1;
                    layout2.goneRightMargin = -1;
                    return;
                case 3:
                    Layout layout3 = constraint.layout;
                    layout3.topToBottom = -1;
                    layout3.topToTop = -1;
                    layout3.topMargin = -1;
                    layout3.goneTopMargin = -1;
                    return;
                case 4:
                    Layout layout4 = constraint.layout;
                    layout4.bottomToTop = -1;
                    layout4.bottomToBottom = -1;
                    layout4.bottomMargin = -1;
                    layout4.goneBottomMargin = -1;
                    return;
                case 5:
                    constraint.layout.baselineToBaseline = -1;
                    return;
                case 6:
                    Layout layout5 = constraint.layout;
                    layout5.startToEnd = -1;
                    layout5.startToStart = -1;
                    layout5.startMargin = -1;
                    layout5.goneStartMargin = -1;
                    return;
                case 7:
                    Layout layout6 = constraint.layout;
                    layout6.endToStart = -1;
                    layout6.endToEnd = -1;
                    layout6.endMargin = -1;
                    layout6.goneEndMargin = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void clone(Context context, int i2) {
        clone((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void clone(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.mConstraints.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.mForceId || id != -1) {
                if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                    this.mConstraints.put(Integer.valueOf(id), new Constraint());
                }
                Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                constraint.mCustomConstraints = ConstraintAttribute.extractAttributes(this.mSavedAttributes, childAt);
                constraint.fillFrom(id, layoutParams);
                constraint.propertySet.visibility = childAt.getVisibility();
                constraint.propertySet.alpha = childAt.getAlpha();
                constraint.transform.rotation = childAt.getRotation();
                constraint.transform.rotationX = childAt.getRotationX();
                constraint.transform.rotationY = childAt.getRotationY();
                constraint.transform.scaleX = childAt.getScaleX();
                constraint.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == ShadowDrawableWrapper.COS_45 && ((double) pivotY) == ShadowDrawableWrapper.COS_45)) {
                    Transform transform = constraint.transform;
                    transform.transformPivotX = pivotX;
                    transform.transformPivotY = pivotY;
                }
                constraint.transform.translationX = childAt.getTranslationX();
                constraint.transform.translationY = childAt.getTranslationY();
                constraint.transform.translationZ = childAt.getTranslationZ();
                Transform transform2 = constraint.transform;
                if (transform2.applyElevation) {
                    transform2.elevation = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    constraint.layout.mBarrierAllowsGoneWidgets = barrier.allowsGoneWidget();
                    constraint.layout.mReferenceIds = barrier.getReferencedIds();
                    constraint.layout.mBarrierDirection = barrier.getType();
                    constraint.layout.mBarrierMargin = barrier.getMargin();
                }
                i2++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void clone(ConstraintSet constraintSet) {
        this.mConstraints.clear();
        for (Integer next : constraintSet.mConstraints.keySet()) {
            this.mConstraints.put(next, constraintSet.mConstraints.get(next).clone());
        }
    }

    public void clone(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.mConstraints.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraints.getChildAt(i2);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.mForceId || id != -1) {
                if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                    this.mConstraints.put(Integer.valueOf(id), new Constraint());
                }
                Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    constraint.fillFromConstraints((ConstraintHelper) childAt, id, layoutParams);
                }
                constraint.fillFromConstraints(id, layoutParams);
                i2++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void connect(int i2, int i3, int i4, int i5) {
        Layout layout;
        if (!this.mConstraints.containsKey(Integer.valueOf(i2))) {
            this.mConstraints.put(Integer.valueOf(i2), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i2));
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    Layout layout2 = constraint.layout;
                    layout2.leftToLeft = i4;
                    layout2.leftToRight = -1;
                    return;
                } else if (i5 == 2) {
                    Layout layout3 = constraint.layout;
                    layout3.leftToRight = i4;
                    layout3.leftToLeft = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("left to "), sideToString(i5), " undefined"));
                }
            case 2:
                if (i5 == 1) {
                    Layout layout4 = constraint.layout;
                    layout4.rightToLeft = i4;
                    layout4.rightToRight = -1;
                    return;
                } else if (i5 == 2) {
                    Layout layout5 = constraint.layout;
                    layout5.rightToRight = i4;
                    layout5.rightToLeft = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
                }
            case 3:
                if (i5 == 3) {
                    layout = constraint.layout;
                    layout.topToTop = i4;
                    layout.topToBottom = -1;
                    break;
                } else if (i5 == 4) {
                    layout = constraint.layout;
                    layout.topToBottom = i4;
                    layout.topToTop = -1;
                    break;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
                }
            case 4:
                if (i5 == 4) {
                    layout = constraint.layout;
                    layout.bottomToBottom = i4;
                    layout.bottomToTop = -1;
                    break;
                } else if (i5 == 3) {
                    layout = constraint.layout;
                    layout.bottomToTop = i4;
                    layout.bottomToBottom = -1;
                    break;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
                }
            case 5:
                if (i5 == 5) {
                    Layout layout6 = constraint.layout;
                    layout6.baselineToBaseline = i4;
                    layout6.bottomToBottom = -1;
                    layout6.bottomToTop = -1;
                    layout6.topToTop = -1;
                    layout6.topToBottom = -1;
                    return;
                }
                throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
            case 6:
                if (i5 == 6) {
                    Layout layout7 = constraint.layout;
                    layout7.startToStart = i4;
                    layout7.startToEnd = -1;
                    return;
                } else if (i5 == 7) {
                    Layout layout8 = constraint.layout;
                    layout8.startToEnd = i4;
                    layout8.startToStart = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
                }
            case 7:
                if (i5 == 7) {
                    Layout layout9 = constraint.layout;
                    layout9.endToEnd = i4;
                    layout9.endToStart = -1;
                    return;
                } else if (i5 == 6) {
                    Layout layout10 = constraint.layout;
                    layout10.endToStart = i4;
                    layout10.endToEnd = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
                }
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(sideToString(i3));
                sb.append(" to ");
                throw new IllegalArgumentException(a.q(sb, sideToString(i5), " unknown"));
        }
        layout.baselineToBaseline = -1;
    }

    public void connect(int i2, int i3, int i4, int i5, int i6) {
        Layout layout;
        Layout layout2;
        if (!this.mConstraints.containsKey(Integer.valueOf(i2))) {
            this.mConstraints.put(Integer.valueOf(i2), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i2));
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    Layout layout3 = constraint.layout;
                    layout3.leftToLeft = i4;
                    layout3.leftToRight = -1;
                } else if (i5 == 2) {
                    Layout layout4 = constraint.layout;
                    layout4.leftToRight = i4;
                    layout4.leftToLeft = -1;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("Left to "), sideToString(i5), " undefined"));
                }
                constraint.layout.leftMargin = i6;
                return;
            case 2:
                if (i5 == 1) {
                    Layout layout5 = constraint.layout;
                    layout5.rightToLeft = i4;
                    layout5.rightToRight = -1;
                } else if (i5 == 2) {
                    Layout layout6 = constraint.layout;
                    layout6.rightToRight = i4;
                    layout6.rightToLeft = -1;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
                }
                constraint.layout.rightMargin = i6;
                return;
            case 3:
                if (i5 == 3) {
                    layout = constraint.layout;
                    layout.topToTop = i4;
                    layout.topToBottom = -1;
                } else if (i5 == 4) {
                    layout = constraint.layout;
                    layout.topToBottom = i4;
                    layout.topToTop = -1;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
                }
                layout.baselineToBaseline = -1;
                constraint.layout.topMargin = i6;
                return;
            case 4:
                if (i5 == 4) {
                    layout2 = constraint.layout;
                    layout2.bottomToBottom = i4;
                    layout2.bottomToTop = -1;
                } else if (i5 == 3) {
                    layout2 = constraint.layout;
                    layout2.bottomToTop = i4;
                    layout2.bottomToBottom = -1;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
                }
                layout2.baselineToBaseline = -1;
                constraint.layout.bottomMargin = i6;
                return;
            case 5:
                if (i5 == 5) {
                    Layout layout7 = constraint.layout;
                    layout7.baselineToBaseline = i4;
                    layout7.bottomToBottom = -1;
                    layout7.bottomToTop = -1;
                    layout7.topToTop = -1;
                    layout7.topToBottom = -1;
                    return;
                }
                throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
            case 6:
                if (i5 == 6) {
                    Layout layout8 = constraint.layout;
                    layout8.startToStart = i4;
                    layout8.startToEnd = -1;
                } else if (i5 == 7) {
                    Layout layout9 = constraint.layout;
                    layout9.startToEnd = i4;
                    layout9.startToStart = -1;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
                }
                constraint.layout.startMargin = i6;
                return;
            case 7:
                if (i5 == 7) {
                    Layout layout10 = constraint.layout;
                    layout10.endToEnd = i4;
                    layout10.endToStart = -1;
                } else if (i5 == 6) {
                    Layout layout11 = constraint.layout;
                    layout11.endToStart = i4;
                    layout11.endToEnd = -1;
                } else {
                    throw new IllegalArgumentException(a.q(a.y("right to "), sideToString(i5), " undefined"));
                }
                constraint.layout.endMargin = i6;
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(sideToString(i3));
                sb.append(" to ");
                throw new IllegalArgumentException(a.q(sb, sideToString(i5), " unknown"));
        }
    }

    public void constrainCircle(int i2, int i3, int i4, float f) {
        Layout layout = get(i2).layout;
        layout.circleConstraint = i3;
        layout.circleRadius = i4;
        layout.circleAngle = f;
    }

    public void constrainDefaultHeight(int i2, int i3) {
        get(i2).layout.heightDefault = i3;
    }

    public void constrainDefaultWidth(int i2, int i3) {
        get(i2).layout.widthDefault = i3;
    }

    public void constrainHeight(int i2, int i3) {
        get(i2).layout.mHeight = i3;
    }

    public void constrainMaxHeight(int i2, int i3) {
        get(i2).layout.heightMax = i3;
    }

    public void constrainMaxWidth(int i2, int i3) {
        get(i2).layout.widthMax = i3;
    }

    public void constrainMinHeight(int i2, int i3) {
        get(i2).layout.heightMin = i3;
    }

    public void constrainMinWidth(int i2, int i3) {
        get(i2).layout.widthMin = i3;
    }

    public void constrainPercentHeight(int i2, float f) {
        get(i2).layout.heightPercent = f;
    }

    public void constrainPercentWidth(int i2, float f) {
        get(i2).layout.widthPercent = f;
    }

    public void constrainWidth(int i2, int i3) {
        get(i2).layout.mWidth = i3;
    }

    public void constrainedHeight(int i2, boolean z) {
        get(i2).layout.constrainedHeight = z;
    }

    public void constrainedWidth(int i2, boolean z) {
        get(i2).layout.constrainedWidth = z;
    }

    public void create(int i2, int i3) {
        Layout layout = get(i2).layout;
        layout.mIsGuideline = true;
        layout.orientation = i3;
    }

    public void createBarrier(int i2, int i3, int i4, int... iArr) {
        Layout layout = get(i2).layout;
        layout.mHelperType = 1;
        layout.mBarrierDirection = i3;
        layout.mBarrierMargin = i4;
        layout.mIsGuideline = false;
        layout.mReferenceIds = iArr;
    }

    public void createHorizontalChain(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
        createHorizontalChain(i2, i3, i4, i5, iArr, fArr, i6, 1, 2);
    }

    public void createHorizontalChainRtl(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
        createHorizontalChain(i2, i3, i4, i5, iArr, fArr, i6, 6, 7);
    }

    public void createVerticalChain(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                get(iArr2[0]).layout.verticalWeight = fArr2[0];
            }
            get(iArr2[0]).layout.verticalChainStyle = i6;
            connect(iArr2[0], 3, i2, i3, 0);
            for (int i7 = 1; i7 < iArr2.length; i7++) {
                int i8 = iArr2[i7];
                int i9 = i7 - 1;
                connect(iArr2[i7], 3, iArr2[i9], 4, 0);
                connect(iArr2[i9], 4, iArr2[i7], 3, 0);
                if (fArr2 != null) {
                    get(iArr2[i7]).layout.verticalWeight = fArr2[i7];
                }
            }
            connect(iArr2[iArr2.length - 1], 4, i4, i5, 0);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    public void dump(MotionScene motionScene, int... iArr) {
        HashSet hashSet;
        Set<Integer> keySet = this.mConstraints.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int valueOf : iArr) {
                hashSet.add(Integer.valueOf(valueOf));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            sb.append("<Constraint id=");
            sb.append(num);
            sb.append(" \n");
            this.mConstraints.get(num).layout.dump(motionScene, sb);
            sb.append("/>\n");
        }
        System.out.println(sb.toString());
    }

    public boolean getApplyElevation(int i2) {
        return get(i2).transform.applyElevation;
    }

    public Constraint getConstraint(int i2) {
        if (this.mConstraints.containsKey(Integer.valueOf(i2))) {
            return this.mConstraints.get(Integer.valueOf(i2));
        }
        return null;
    }

    public HashMap<String, ConstraintAttribute> getCustomAttributeSet() {
        return this.mSavedAttributes;
    }

    public int getHeight(int i2) {
        return get(i2).layout.mHeight;
    }

    public int[] getKnownIds() {
        Integer[] numArr = (Integer[]) this.mConstraints.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    public Constraint getParameters(int i2) {
        return get(i2);
    }

    public int[] getReferencedIds(int i2) {
        int[] iArr = get(i2).layout.mReferenceIds;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public int getVisibility(int i2) {
        return get(i2).propertySet.visibility;
    }

    public int getVisibilityMode(int i2) {
        return get(i2).propertySet.mVisibilityMode;
    }

    public int getWidth(int i2) {
        return get(i2).layout.mWidth;
    }

    public boolean isForceId() {
        return this.mForceId;
    }

    public void load(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    Constraint fillFromAttributeList = fillFromAttributeList(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        fillFromAttributeList.layout.mIsGuideline = true;
                    }
                    this.mConstraints.put(Integer.valueOf(fillFromAttributeList.mViewId), fillFromAttributeList);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0179, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void load(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x0188
            if (r0 == 0) goto L_0x0176
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x0179
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0179
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r3 = r2.mViewId     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2 = r1
            goto L_0x0179
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            switch(r8) {
                case -2025855158: goto L_0x0086;
                case -1984451626: goto L_0x007c;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0042:
            goto L_0x0090
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = r6
            goto L_0x0091
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = r3
            goto L_0x0091
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x007c:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0086:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = r7
        L_0x0091:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x016c;
                case 1: goto L_0x015d;
                case 2: goto L_0x0150;
                case 3: goto L_0x012b;
                case 4: goto L_0x0106;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ba;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0179
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.mCustomConstraints     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00a1:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00ba:
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r2.motion     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.fillFromAttributeList(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00c7:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00e0:
            if (r2 == 0) goto L_0x00ed
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r2.layout     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.fillFromAttributeList(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00ed:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0106:
            if (r2 == 0) goto L_0x0112
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r2.transform     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.fillFromAttributeList(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0112:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x012b:
            if (r2 == 0) goto L_0x0137
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r2.propertySet     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.fillFromAttributeList(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0137:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0150:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r9.fillFromAttributeList(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r0.layout     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.mHelperType = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x015d:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r9.fillFromAttributeList(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r0.layout     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.mIsGuideline = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.mApply = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x016c:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r9.fillFromAttributeList(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0174:
            r2 = r0
            goto L_0x0179
        L_0x0176:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0179:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0006
        L_0x017f:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x0188
        L_0x0184:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void parseColorAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i2 = 0; i2 < split.length; i2++) {
            String[] split2 = split[i2].split("=");
            if (split2.length != 2) {
                StringBuilder y = a.y(" Unable to parse ");
                y.append(split[i2]);
                Log.w(TAG, y.toString());
            } else {
                constraint.setColorValue(split2[0], Color.parseColor(split2[1]));
            }
        }
    }

    public void parseFloatAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i2 = 0; i2 < split.length; i2++) {
            String[] split2 = split[i2].split("=");
            if (split2.length != 2) {
                StringBuilder y = a.y(" Unable to parse ");
                y.append(split[i2]);
                Log.w(TAG, y.toString());
            } else {
                constraint.setFloatValue(split2[0], Float.parseFloat(split2[1]));
            }
        }
    }

    public void parseIntAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i2 = 0; i2 < split.length; i2++) {
            String[] split2 = split[i2].split("=");
            if (split2.length != 2) {
                StringBuilder y = a.y(" Unable to parse ");
                y.append(split[i2]);
                Log.w(TAG, y.toString());
            } else {
                constraint.setFloatValue(split2[0], (float) Integer.decode(split2[1]).intValue());
            }
        }
    }

    public void parseStringAttributes(Constraint constraint, String str) {
        String[] splitString = splitString(str);
        for (int i2 = 0; i2 < splitString.length; i2++) {
            String[] split = splitString[i2].split("=");
            StringBuilder y = a.y(" Unable to parse ");
            y.append(splitString[i2]);
            Log.w(TAG, y.toString());
            constraint.setStringValue(split[0], split[1]);
        }
    }

    public void readFallback(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.mForceId || id != -1) {
                if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                    this.mConstraints.put(Integer.valueOf(id), new Constraint());
                }
                Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                if (!constraint.layout.mApply) {
                    constraint.fillFrom(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        constraint.layout.mReferenceIds = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            constraint.layout.mBarrierAllowsGoneWidgets = barrier.allowsGoneWidget();
                            constraint.layout.mBarrierDirection = barrier.getType();
                            constraint.layout.mBarrierMargin = barrier.getMargin();
                        }
                    }
                    constraint.layout.mApply = true;
                }
                PropertySet propertySet = constraint.propertySet;
                if (!propertySet.mApply) {
                    propertySet.visibility = childAt.getVisibility();
                    constraint.propertySet.alpha = childAt.getAlpha();
                    constraint.propertySet.mApply = true;
                }
                Transform transform = constraint.transform;
                if (!transform.mApply) {
                    transform.mApply = true;
                    transform.rotation = childAt.getRotation();
                    constraint.transform.rotationX = childAt.getRotationX();
                    constraint.transform.rotationY = childAt.getRotationY();
                    constraint.transform.scaleX = childAt.getScaleX();
                    constraint.transform.scaleY = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == ShadowDrawableWrapper.COS_45 && ((double) pivotY) == ShadowDrawableWrapper.COS_45)) {
                        Transform transform2 = constraint.transform;
                        transform2.transformPivotX = pivotX;
                        transform2.transformPivotY = pivotY;
                    }
                    constraint.transform.translationX = childAt.getTranslationX();
                    constraint.transform.translationY = childAt.getTranslationY();
                    constraint.transform.translationZ = childAt.getTranslationZ();
                    Transform transform3 = constraint.transform;
                    if (transform3.applyElevation) {
                        transform3.elevation = childAt.getElevation();
                    }
                }
                i2++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void readFallback(ConstraintSet constraintSet) {
        for (Integer next : constraintSet.mConstraints.keySet()) {
            int intValue = next.intValue();
            Constraint constraint = constraintSet.mConstraints.get(next);
            if (!this.mConstraints.containsKey(Integer.valueOf(intValue))) {
                this.mConstraints.put(Integer.valueOf(intValue), new Constraint());
            }
            Constraint constraint2 = this.mConstraints.get(Integer.valueOf(intValue));
            Layout layout = constraint2.layout;
            if (!layout.mApply) {
                layout.copyFrom(constraint.layout);
            }
            PropertySet propertySet = constraint2.propertySet;
            if (!propertySet.mApply) {
                propertySet.copyFrom(constraint.propertySet);
            }
            Transform transform = constraint2.transform;
            if (!transform.mApply) {
                transform.copyFrom(constraint.transform);
            }
            Motion motion = constraint2.motion;
            if (!motion.mApply) {
                motion.copyFrom(constraint.motion);
            }
            for (String next2 : constraint.mCustomConstraints.keySet()) {
                if (!constraint2.mCustomConstraints.containsKey(next2)) {
                    constraint2.mCustomConstraints.put(next2, constraint.mCustomConstraints.get(next2));
                }
            }
        }
    }

    public void removeAttribute(String str) {
        this.mSavedAttributes.remove(str);
    }

    public void removeFromHorizontalChain(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ConstraintSet constraintSet;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ConstraintSet constraintSet2;
        int i13;
        if (this.mConstraints.containsKey(Integer.valueOf(i2))) {
            Layout layout = this.mConstraints.get(Integer.valueOf(i2)).layout;
            int i14 = layout.leftToRight;
            int i15 = layout.rightToLeft;
            if (i14 == -1 && i15 == -1) {
                int i16 = layout.startToEnd;
                int i17 = layout.endToStart;
                if (!(i16 == -1 && i17 == -1)) {
                    if (i16 != -1 && i17 != -1) {
                        i12 = 0;
                        constraintSet2 = this;
                        constraintSet2.connect(i16, 7, i17, 6, 0);
                        i10 = 6;
                        i11 = 7;
                        i13 = i17;
                        i9 = i14;
                    } else if (!(i14 == -1 && i17 == -1)) {
                        i9 = layout.rightToRight;
                        if (i9 != -1) {
                            i10 = 7;
                            i11 = 7;
                            i12 = 0;
                            constraintSet2 = this;
                            i13 = i14;
                        } else {
                            i9 = layout.leftToLeft;
                            if (i9 != -1) {
                                i10 = 6;
                                i11 = 6;
                                i12 = 0;
                                constraintSet2 = this;
                                i13 = i17;
                            }
                        }
                    }
                    constraintSet2.connect(i13, i10, i9, i11, i12);
                }
                clear(i2, 6);
                i3 = 7;
            } else {
                if (i14 == -1 || i15 == -1) {
                    if (!(i14 == -1 && i15 == -1)) {
                        i4 = layout.rightToRight;
                        if (i4 != -1) {
                            i5 = 2;
                            i6 = 2;
                            i7 = 0;
                            constraintSet = this;
                            i8 = i14;
                        } else {
                            i4 = layout.leftToLeft;
                            if (i4 != -1) {
                                i5 = 1;
                                i6 = 1;
                                i7 = 0;
                                constraintSet = this;
                                i8 = i15;
                            }
                        }
                    }
                    clear(i2, 1);
                    i3 = 2;
                } else {
                    i7 = 0;
                    constraintSet = this;
                    constraintSet.connect(i14, 2, i15, 1, 0);
                    i5 = 1;
                    i6 = 2;
                    i8 = i15;
                    i4 = i14;
                }
                constraintSet.connect(i8, i5, i4, i6, i7);
                clear(i2, 1);
                i3 = 2;
            }
            clear(i2, i3);
        }
    }

    public void removeFromVerticalChain(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        ConstraintSet constraintSet;
        int i7;
        if (this.mConstraints.containsKey(Integer.valueOf(i2))) {
            Layout layout = this.mConstraints.get(Integer.valueOf(i2)).layout;
            int i8 = layout.topToBottom;
            int i9 = layout.bottomToTop;
            if (!(i8 == -1 && i9 == -1)) {
                if (i8 != -1 && i9 != -1) {
                    i6 = 0;
                    constraintSet = this;
                    constraintSet.connect(i8, 4, i9, 3, 0);
                    i4 = 3;
                    i5 = 4;
                    i7 = i9;
                    i3 = i8;
                } else if (!(i8 == -1 && i9 == -1)) {
                    i3 = layout.bottomToBottom;
                    if (i3 != -1) {
                        i4 = 4;
                        i5 = 4;
                        i6 = 0;
                        constraintSet = this;
                        i7 = i8;
                    } else {
                        i3 = layout.topToTop;
                        if (i3 != -1) {
                            i4 = 3;
                            i5 = 3;
                            i6 = 0;
                            constraintSet = this;
                            i7 = i9;
                        }
                    }
                }
                constraintSet.connect(i7, i4, i3, i5, i6);
            }
        }
        clear(i2, 3);
        clear(i2, 4);
    }

    public void setAlpha(int i2, float f) {
        get(i2).propertySet.alpha = f;
    }

    public void setApplyElevation(int i2, boolean z) {
        get(i2).transform.applyElevation = z;
    }

    public void setBarrierType(int i2, int i3) {
        get(i2).layout.mHelperType = i3;
    }

    public void setColorValue(int i2, String str, int i3) {
        get(i2).setColorValue(str, i3);
    }

    public void setDimensionRatio(int i2, String str) {
        get(i2).layout.dimensionRatio = str;
    }

    public void setEditorAbsoluteX(int i2, int i3) {
        get(i2).layout.editorAbsoluteX = i3;
    }

    public void setEditorAbsoluteY(int i2, int i3) {
        get(i2).layout.editorAbsoluteY = i3;
    }

    public void setElevation(int i2, float f) {
        get(i2).transform.elevation = f;
        get(i2).transform.applyElevation = true;
    }

    public void setFloatValue(int i2, String str, float f) {
        get(i2).setFloatValue(str, f);
    }

    public void setForceId(boolean z) {
        this.mForceId = z;
    }

    public void setGoneMargin(int i2, int i3, int i4) {
        Constraint constraint = get(i2);
        switch (i3) {
            case 1:
                constraint.layout.goneLeftMargin = i4;
                return;
            case 2:
                constraint.layout.goneRightMargin = i4;
                return;
            case 3:
                constraint.layout.goneTopMargin = i4;
                return;
            case 4:
                constraint.layout.goneBottomMargin = i4;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                constraint.layout.goneStartMargin = i4;
                return;
            case 7:
                constraint.layout.goneEndMargin = i4;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setGuidelineBegin(int i2, int i3) {
        get(i2).layout.guideBegin = i3;
        get(i2).layout.guideEnd = -1;
        get(i2).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i2, int i3) {
        get(i2).layout.guideEnd = i3;
        get(i2).layout.guideBegin = -1;
        get(i2).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i2, float f) {
        get(i2).layout.guidePercent = f;
        get(i2).layout.guideEnd = -1;
        get(i2).layout.guideBegin = -1;
    }

    public void setHorizontalBias(int i2, float f) {
        get(i2).layout.horizontalBias = f;
    }

    public void setHorizontalChainStyle(int i2, int i3) {
        get(i2).layout.horizontalChainStyle = i3;
    }

    public void setHorizontalWeight(int i2, float f) {
        get(i2).layout.horizontalWeight = f;
    }

    public void setIntValue(int i2, String str, int i3) {
        get(i2).setIntValue(str, i3);
    }

    public void setMargin(int i2, int i3, int i4) {
        Constraint constraint = get(i2);
        switch (i3) {
            case 1:
                constraint.layout.leftMargin = i4;
                return;
            case 2:
                constraint.layout.rightMargin = i4;
                return;
            case 3:
                constraint.layout.topMargin = i4;
                return;
            case 4:
                constraint.layout.bottomMargin = i4;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                constraint.layout.startMargin = i4;
                return;
            case 7:
                constraint.layout.endMargin = i4;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setReferencedIds(int i2, int... iArr) {
        get(i2).layout.mReferenceIds = iArr;
    }

    public void setRotation(int i2, float f) {
        get(i2).transform.rotation = f;
    }

    public void setRotationX(int i2, float f) {
        get(i2).transform.rotationX = f;
    }

    public void setRotationY(int i2, float f) {
        get(i2).transform.rotationY = f;
    }

    public void setScaleX(int i2, float f) {
        get(i2).transform.scaleX = f;
    }

    public void setScaleY(int i2, float f) {
        get(i2).transform.scaleY = f;
    }

    public void setStringValue(int i2, String str, String str2) {
        get(i2).setStringValue(str, str2);
    }

    public void setTransformPivot(int i2, float f, float f2) {
        Transform transform = get(i2).transform;
        transform.transformPivotY = f2;
        transform.transformPivotX = f;
    }

    public void setTransformPivotX(int i2, float f) {
        get(i2).transform.transformPivotX = f;
    }

    public void setTransformPivotY(int i2, float f) {
        get(i2).transform.transformPivotY = f;
    }

    public void setTranslation(int i2, float f, float f2) {
        Transform transform = get(i2).transform;
        transform.translationX = f;
        transform.translationY = f2;
    }

    public void setTranslationX(int i2, float f) {
        get(i2).transform.translationX = f;
    }

    public void setTranslationY(int i2, float f) {
        get(i2).transform.translationY = f;
    }

    public void setTranslationZ(int i2, float f) {
        get(i2).transform.translationZ = f;
    }

    public void setValidateOnParse(boolean z) {
        this.mValidate = z;
    }

    public void setVerticalBias(int i2, float f) {
        get(i2).layout.verticalBias = f;
    }

    public void setVerticalChainStyle(int i2, int i3) {
        get(i2).layout.verticalChainStyle = i3;
    }

    public void setVerticalWeight(int i2, float f) {
        get(i2).layout.verticalWeight = f;
    }

    public void setVisibility(int i2, int i3) {
        get(i2).propertySet.visibility = i3;
    }

    public void setVisibilityMode(int i2, int i3) {
        get(i2).propertySet.mVisibilityMode = i3;
    }
}
