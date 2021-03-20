package androidx.constraintlayout.solver.state;

import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import b.e.a.a.a;
import java.util.ArrayList;

public class ConstraintReference implements Reference {
    private Object key;
    public Object mBaselineToBaseline = null;
    public Object mBottomToBottom = null;
    public Object mBottomToTop = null;
    private ConstraintWidget mConstraintWidget;
    public Object mEndToEnd = null;
    public Object mEndToStart = null;
    public float mHorizontalBias = 0.5f;
    public int mHorizontalChainStyle = 0;
    public Dimension mHorizontalDimension;
    public State.Constraint mLast = null;
    public Object mLeftToLeft = null;
    public Object mLeftToRight = null;
    public int mMarginBottom = 0;
    public int mMarginBottomGone = 0;
    public int mMarginEnd = 0;
    public int mMarginEndGone = 0;
    public int mMarginLeft = 0;
    public int mMarginLeftGone = 0;
    public int mMarginRight = 0;
    public int mMarginRightGone = 0;
    public int mMarginStart = 0;
    public int mMarginStartGone = 0;
    public int mMarginTop = 0;
    public int mMarginTopGone = 0;
    public Object mRightToLeft = null;
    public Object mRightToRight = null;
    public Object mStartToEnd = null;
    public Object mStartToStart = null;
    public final State mState;
    public Object mTopToBottom = null;
    public Object mTopToTop = null;
    public float mVerticalBias = 0.5f;
    public int mVerticalChainStyle = 0;
    public Dimension mVerticalDimension;
    private Object mView;

    /* renamed from: androidx.constraintlayout.solver.state.ConstraintReference$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0071 */
        static {
            /*
                androidx.constraintlayout.solver.state.State.Constraint.values()
                r0 = 15
                int[] r1 = new int[r0]
                $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint = r1
                r2 = 1
                androidx.constraintlayout.solver.state.State$Constraint r3 = androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_LEFT     // Catch:{ NoSuchFieldError -> 0x000f }
                r3 = 0
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r1 = 2
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0016 }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_RIGHT     // Catch:{ NoSuchFieldError -> 0x0016 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r2 = 3
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r1 = 4
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0024 }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_RIGHT     // Catch:{ NoSuchFieldError -> 0x0024 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 5
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x002b }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.START_TO_START     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r1 = 6
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0032 }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.START_TO_END     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                r2 = 7
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0039 }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.END_TO_START     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                r1 = 8
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0041 }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.END_TO_END     // Catch:{ NoSuchFieldError -> 0x0041 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                r2 = 9
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_TOP     // Catch:{ NoSuchFieldError -> 0x0049 }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r1 = 10
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0051 }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0051 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                r2 = 11
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_TOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                r1 = 12
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0061 }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0061 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0061 }
            L_0x0061:
                r2 = 13
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0069 }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.BASELINE_TO_BASELINE     // Catch:{ NoSuchFieldError -> 0x0069 }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                r1 = 14
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0071 }
                androidx.constraintlayout.solver.state.State$Constraint r4 = androidx.constraintlayout.solver.state.State.Constraint.CENTER_HORIZONTALLY     // Catch:{ NoSuchFieldError -> 0x0071 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0077 }
                androidx.constraintlayout.solver.state.State$Constraint r3 = androidx.constraintlayout.solver.state.State.Constraint.CENTER_VERTICALLY     // Catch:{ NoSuchFieldError -> 0x0077 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.<clinit>():void");
        }
    }

    public interface ConstraintReferenceFactory {
        ConstraintReference create(State state);
    }

    public class IncorrectConstraintException extends Exception {
        private final ArrayList<String> mErrors;

        public IncorrectConstraintException(ArrayList<String> arrayList) {
            this.mErrors = arrayList;
        }

        public ArrayList<String> getErrors() {
            return this.mErrors;
        }

        public String toString() {
            StringBuilder y = a.y("IncorrectConstraintException: ");
            y.append(this.mErrors.toString());
            return y.toString();
        }
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.WRAP_DIMENSION;
        this.mHorizontalDimension = Dimension.Fixed(obj);
        this.mVerticalDimension = Dimension.Fixed(obj);
        this.mState = state;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginTop;
        r1 = r6.mMarginTopGone;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginEnd;
        r1 = r6.mMarginEndGone;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginStart;
        r1 = r6.mMarginStartGone;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0094, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginRight;
        r1 = r6.mMarginRightGone;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ac, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginLeft;
        r1 = r6.mMarginLeftGone;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
        r7.connect(r8, r0, r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginBottom;
        r1 = r6.mMarginBottomGone;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyConnection(androidx.constraintlayout.solver.widgets.ConstraintWidget r7, java.lang.Object r8, androidx.constraintlayout.solver.state.State.Constraint r9) {
        /*
            r6 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r6.getTarget(r8)
            if (r2 != 0) goto L_0x0007
            return
        L_0x0007:
            int[] r8 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint
            int r0 = r9.ordinal()
            r8 = r8[r0]
            int r8 = r9.ordinal()
            r9 = 0
            switch(r8) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x009d;
                case 2: goto L_0x008c;
                case 3: goto L_0x0085;
                case 4: goto L_0x0076;
                case 5: goto L_0x006d;
                case 6: goto L_0x005c;
                case 7: goto L_0x0055;
                case 8: goto L_0x0046;
                case 9: goto L_0x003d;
                case 10: goto L_0x002b;
                case 11: goto L_0x0024;
                case 12: goto L_0x0019;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x00b7
        L_0x0019:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            r4 = 0
            r5 = 0
            r0 = r7
            r1 = r3
            r0.immediateConnect(r1, r2, r3, r4, r5)
            goto L_0x00b7
        L_0x0024:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            goto L_0x0033
        L_0x002b:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
        L_0x0033:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginBottom
            int r1 = r6.mMarginBottomGone
            goto L_0x00b4
        L_0x003d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            goto L_0x004c
        L_0x0046:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
        L_0x004c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginTop
            int r1 = r6.mMarginTopGone
            goto L_0x00b4
        L_0x0055:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            goto L_0x0064
        L_0x005c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
        L_0x0064:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginEnd
            int r1 = r6.mMarginEndGone
            goto L_0x00b4
        L_0x006d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            goto L_0x007c
        L_0x0076:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
        L_0x007c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginStart
            int r1 = r6.mMarginStartGone
            goto L_0x00b4
        L_0x0085:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            goto L_0x0094
        L_0x008c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
        L_0x0094:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginRight
            int r1 = r6.mMarginRightGone
            goto L_0x00b4
        L_0x009d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            goto L_0x00ac
        L_0x00a6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
        L_0x00ac:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginLeft
            int r1 = r6.mMarginLeftGone
        L_0x00b4:
            r7.connect(r8, r0, r1, r9)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.state.ConstraintReference.applyConnection(androidx.constraintlayout.solver.widgets.ConstraintWidget, java.lang.Object, androidx.constraintlayout.solver.state.State$Constraint):void");
    }

    private void dereference() {
        this.mLeftToLeft = get(this.mLeftToLeft);
        this.mLeftToRight = get(this.mLeftToRight);
        this.mRightToLeft = get(this.mRightToLeft);
        this.mRightToRight = get(this.mRightToRight);
        this.mStartToStart = get(this.mStartToStart);
        this.mStartToEnd = get(this.mStartToEnd);
        this.mEndToStart = get(this.mEndToStart);
        this.mEndToEnd = get(this.mEndToEnd);
        this.mTopToTop = get(this.mTopToTop);
        this.mTopToBottom = get(this.mTopToBottom);
        this.mBottomToTop = get(this.mBottomToTop);
        this.mBottomToBottom = get(this.mBottomToBottom);
        this.mBaselineToBaseline = get(this.mBaselineToBaseline);
    }

    private Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof ConstraintReference) ? this.mState.reference(obj) : obj;
    }

    private ConstraintWidget getTarget(Object obj) {
        if (obj instanceof Reference) {
            return ((Reference) obj).getConstraintWidget();
        }
        return null;
    }

    public void apply() {
        ConstraintWidget constraintWidget = this.mConstraintWidget;
        if (constraintWidget != null) {
            this.mHorizontalDimension.apply(this.mState, constraintWidget, 0);
            this.mVerticalDimension.apply(this.mState, this.mConstraintWidget, 1);
            dereference();
            applyConnection(this.mConstraintWidget, this.mLeftToLeft, State.Constraint.LEFT_TO_LEFT);
            applyConnection(this.mConstraintWidget, this.mLeftToRight, State.Constraint.LEFT_TO_RIGHT);
            applyConnection(this.mConstraintWidget, this.mRightToLeft, State.Constraint.RIGHT_TO_LEFT);
            applyConnection(this.mConstraintWidget, this.mRightToRight, State.Constraint.RIGHT_TO_RIGHT);
            applyConnection(this.mConstraintWidget, this.mStartToStart, State.Constraint.START_TO_START);
            applyConnection(this.mConstraintWidget, this.mStartToEnd, State.Constraint.START_TO_END);
            applyConnection(this.mConstraintWidget, this.mEndToStart, State.Constraint.END_TO_START);
            applyConnection(this.mConstraintWidget, this.mEndToEnd, State.Constraint.END_TO_END);
            applyConnection(this.mConstraintWidget, this.mTopToTop, State.Constraint.TOP_TO_TOP);
            applyConnection(this.mConstraintWidget, this.mTopToBottom, State.Constraint.TOP_TO_BOTTOM);
            applyConnection(this.mConstraintWidget, this.mBottomToTop, State.Constraint.BOTTOM_TO_TOP);
            applyConnection(this.mConstraintWidget, this.mBottomToBottom, State.Constraint.BOTTOM_TO_BOTTOM);
            applyConnection(this.mConstraintWidget, this.mBaselineToBaseline, State.Constraint.BASELINE_TO_BASELINE);
            int i2 = this.mHorizontalChainStyle;
            if (i2 != 0) {
                this.mConstraintWidget.setHorizontalChainStyle(i2);
            }
            int i3 = this.mVerticalChainStyle;
            if (i3 != 0) {
                this.mConstraintWidget.setVerticalChainStyle(i3);
            }
            this.mConstraintWidget.setHorizontalBiasPercent(this.mHorizontalBias);
            this.mConstraintWidget.setVerticalBiasPercent(this.mVerticalBias);
        }
    }

    public ConstraintReference baseline() {
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public ConstraintReference baselineToBaseline(Object obj) {
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        this.mBaselineToBaseline = obj;
        return this;
    }

    public ConstraintReference bias(float f) {
        State.Constraint constraint = this.mLast;
        if (constraint == null) {
            return this;
        }
        switch (constraint.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 13:
                this.mHorizontalBias = f;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 14:
                this.mVerticalBias = f;
                break;
        }
        return this;
    }

    public ConstraintReference bottom() {
        this.mLast = this.mBottomToTop != null ? State.Constraint.BOTTOM_TO_TOP : State.Constraint.BOTTOM_TO_BOTTOM;
        return this;
    }

    public ConstraintReference bottomToBottom(Object obj) {
        this.mLast = State.Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = obj;
        return this;
    }

    public ConstraintReference bottomToTop(Object obj) {
        this.mLast = State.Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = obj;
        return this;
    }

    public ConstraintReference centerHorizontally(Object obj) {
        Object obj2 = get(obj);
        this.mStartToStart = obj2;
        this.mEndToEnd = obj2;
        this.mLast = State.Constraint.CENTER_HORIZONTALLY;
        this.mHorizontalBias = 0.5f;
        return this;
    }

    public ConstraintReference centerVertically(Object obj) {
        Object obj2 = get(obj);
        this.mTopToTop = obj2;
        this.mBottomToBottom = obj2;
        this.mLast = State.Constraint.CENTER_VERTICALLY;
        this.mVerticalBias = 0.5f;
        return this;
    }

    public ConstraintReference clear() {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (constraint.ordinal()) {
                case 0:
                case 1:
                    this.mLeftToLeft = null;
                    this.mLeftToRight = null;
                    this.mMarginLeft = 0;
                    this.mMarginLeftGone = 0;
                    break;
                case 2:
                case 3:
                    this.mRightToLeft = null;
                    this.mRightToRight = null;
                    this.mMarginRight = 0;
                    this.mMarginRightGone = 0;
                    break;
                case 4:
                case 5:
                    this.mStartToStart = null;
                    this.mStartToEnd = null;
                    this.mMarginStart = 0;
                    this.mMarginStartGone = 0;
                    break;
                case 6:
                case 7:
                    this.mEndToStart = null;
                    this.mEndToEnd = null;
                    this.mMarginEnd = 0;
                    this.mMarginEndGone = 0;
                    break;
                case 8:
                case 9:
                    this.mTopToTop = null;
                    this.mTopToBottom = null;
                    this.mMarginTop = 0;
                    this.mMarginTopGone = 0;
                    break;
                case 10:
                case 11:
                    this.mBottomToTop = null;
                    this.mBottomToBottom = null;
                    this.mMarginBottom = 0;
                    break;
                case 12:
                    this.mBaselineToBaseline = null;
                    break;
            }
        } else {
            this.mLeftToLeft = null;
            this.mLeftToRight = null;
            this.mMarginLeft = 0;
            this.mRightToLeft = null;
            this.mRightToRight = null;
            this.mMarginRight = 0;
            this.mStartToStart = null;
            this.mStartToEnd = null;
            this.mMarginStart = 0;
            this.mEndToStart = null;
            this.mEndToEnd = null;
            this.mMarginEnd = 0;
            this.mTopToTop = null;
            this.mTopToBottom = null;
            this.mMarginTop = 0;
            this.mBottomToTop = null;
            this.mBottomToBottom = null;
            this.mMarginBottom = 0;
            this.mBaselineToBaseline = null;
            this.mHorizontalBias = 0.5f;
            this.mVerticalBias = 0.5f;
            this.mMarginLeftGone = 0;
            this.mMarginRightGone = 0;
            this.mMarginStartGone = 0;
            this.mMarginEndGone = 0;
            this.mMarginTopGone = 0;
        }
        this.mMarginBottomGone = 0;
        return this;
    }

    public ConstraintReference clearHorizontal() {
        start().clear();
        end().clear();
        left().clear();
        right().clear();
        return this;
    }

    public ConstraintReference clearVertical() {
        top().clear();
        baseline().clear();
        bottom().clear();
        return this;
    }

    public ConstraintWidget createConstraintWidget() {
        return new ConstraintWidget(getWidth().getValue(), getHeight().getValue());
    }

    public ConstraintReference end() {
        this.mLast = this.mEndToStart != null ? State.Constraint.END_TO_START : State.Constraint.END_TO_END;
        return this;
    }

    public ConstraintReference endToEnd(Object obj) {
        this.mLast = State.Constraint.END_TO_END;
        this.mEndToEnd = obj;
        return this;
    }

    public ConstraintReference endToStart(Object obj) {
        this.mLast = State.Constraint.END_TO_START;
        this.mEndToStart = obj;
        return this;
    }

    public ConstraintWidget getConstraintWidget() {
        if (this.mConstraintWidget == null) {
            ConstraintWidget createConstraintWidget = createConstraintWidget();
            this.mConstraintWidget = createConstraintWidget;
            createConstraintWidget.setCompanionWidget(this.mView);
        }
        return this.mConstraintWidget;
    }

    public Dimension getHeight() {
        return this.mVerticalDimension;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public Object getKey() {
        return this.key;
    }

    public int getVerticalChainStyle(int i2) {
        return this.mVerticalChainStyle;
    }

    public Object getView() {
        return this.mView;
    }

    public Dimension getWidth() {
        return this.mHorizontalDimension;
    }

    public ConstraintReference height(Dimension dimension) {
        return setHeight(dimension);
    }

    public ConstraintReference horizontalBias(float f) {
        this.mHorizontalBias = f;
        return this;
    }

    public ConstraintReference left() {
        this.mLast = this.mLeftToLeft != null ? State.Constraint.LEFT_TO_LEFT : State.Constraint.LEFT_TO_RIGHT;
        return this;
    }

    public ConstraintReference leftToLeft(Object obj) {
        this.mLast = State.Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = obj;
        return this;
    }

    public ConstraintReference leftToRight(Object obj) {
        this.mLast = State.Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = obj;
        return this;
    }

    public ConstraintReference margin(int i2) {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (constraint.ordinal()) {
                case 0:
                case 1:
                    this.mMarginLeft = i2;
                    break;
                case 2:
                case 3:
                    this.mMarginRight = i2;
                    break;
                case 4:
                case 5:
                    this.mMarginStart = i2;
                    break;
                case 6:
                case 7:
                    this.mMarginEnd = i2;
                    break;
                case 8:
                case 9:
                    this.mMarginTop = i2;
                    break;
                case 10:
                case 11:
                    break;
            }
        } else {
            this.mMarginLeft = i2;
            this.mMarginRight = i2;
            this.mMarginStart = i2;
            this.mMarginEnd = i2;
            this.mMarginTop = i2;
        }
        this.mMarginBottom = i2;
        return this;
    }

    public ConstraintReference margin(Object obj) {
        return margin(this.mState.convertDimension(obj));
    }

    public ConstraintReference marginGone(int i2) {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (constraint.ordinal()) {
                case 0:
                case 1:
                    this.mMarginLeftGone = i2;
                    break;
                case 2:
                case 3:
                    this.mMarginRightGone = i2;
                    break;
                case 4:
                case 5:
                    this.mMarginStartGone = i2;
                    break;
                case 6:
                case 7:
                    this.mMarginEndGone = i2;
                    break;
                case 8:
                case 9:
                    this.mMarginTopGone = i2;
                    break;
                case 10:
                case 11:
                    break;
            }
        } else {
            this.mMarginLeftGone = i2;
            this.mMarginRightGone = i2;
            this.mMarginStartGone = i2;
            this.mMarginEndGone = i2;
            this.mMarginTopGone = i2;
        }
        this.mMarginBottomGone = i2;
        return this;
    }

    public ConstraintReference right() {
        this.mLast = this.mRightToLeft != null ? State.Constraint.RIGHT_TO_LEFT : State.Constraint.RIGHT_TO_RIGHT;
        return this;
    }

    public ConstraintReference rightToLeft(Object obj) {
        this.mLast = State.Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = obj;
        return this;
    }

    public ConstraintReference rightToRight(Object obj) {
        this.mLast = State.Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = obj;
        return this;
    }

    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget != null) {
            this.mConstraintWidget = constraintWidget;
            constraintWidget.setCompanionWidget(this.mView);
        }
    }

    public ConstraintReference setHeight(Dimension dimension) {
        this.mVerticalDimension = dimension;
        return this;
    }

    public void setHorizontalChainStyle(int i2) {
        this.mHorizontalChainStyle = i2;
    }

    public void setKey(Object obj) {
        this.key = obj;
    }

    public void setVerticalChainStyle(int i2) {
        this.mVerticalChainStyle = i2;
    }

    public void setView(Object obj) {
        this.mView = obj;
        ConstraintWidget constraintWidget = this.mConstraintWidget;
        if (constraintWidget != null) {
            constraintWidget.setCompanionWidget(obj);
        }
    }

    public ConstraintReference setWidth(Dimension dimension) {
        this.mHorizontalDimension = dimension;
        return this;
    }

    public ConstraintReference start() {
        this.mLast = this.mStartToStart != null ? State.Constraint.START_TO_START : State.Constraint.START_TO_END;
        return this;
    }

    public ConstraintReference startToEnd(Object obj) {
        this.mLast = State.Constraint.START_TO_END;
        this.mStartToEnd = obj;
        return this;
    }

    public ConstraintReference startToStart(Object obj) {
        this.mLast = State.Constraint.START_TO_START;
        this.mStartToStart = obj;
        return this;
    }

    public ConstraintReference top() {
        this.mLast = this.mTopToTop != null ? State.Constraint.TOP_TO_TOP : State.Constraint.TOP_TO_BOTTOM;
        return this;
    }

    public ConstraintReference topToBottom(Object obj) {
        this.mLast = State.Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = obj;
        return this;
    }

    public ConstraintReference topToTop(Object obj) {
        this.mLast = State.Constraint.TOP_TO_TOP;
        this.mTopToTop = obj;
        return this;
    }

    public void validate() {
        ArrayList arrayList = new ArrayList();
        if (!(this.mLeftToLeft == null || this.mLeftToRight == null)) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (!(this.mRightToLeft == null || this.mRightToRight == null)) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (!(this.mStartToStart == null || this.mStartToEnd == null)) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (!(this.mEndToStart == null || this.mEndToEnd == null)) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if (!((this.mLeftToLeft == null && this.mLeftToRight == null && this.mRightToLeft == null && this.mRightToRight == null) || (this.mStartToStart == null && this.mStartToEnd == null && this.mEndToStart == null && this.mEndToEnd == null))) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new IncorrectConstraintException(arrayList);
        }
    }

    public ConstraintReference verticalBias(float f) {
        this.mVerticalBias = f;
        return this;
    }

    public ConstraintReference width(Dimension dimension) {
        return setWidth(dimension);
    }
}
