package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.analyzer.Grouping;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor {
    private static final boolean ALLOW_BINARY = false;
    private static final int UNSET_GONE_MARGIN = -1;
    private HashSet<ConstraintAnchor> mDependents = null;
    private int mFinalValue;
    public int mGoneMargin = -1;
    private boolean mHasFinalValue;
    public int mMargin = 0;
    public final ConstraintWidget mOwner;
    public SolverVariable mSolverVariable;
    public ConstraintAnchor mTarget;
    public final Type mType;

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintAnchor$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0031 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                r0 = 9
                int[] r1 = new int[r0]
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = r1
                r2 = 1
                r3 = 6
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x000f }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r1 = 2
                int[] r4 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x0016 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0016 }
                r4[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                r4 = 3
                r2[r4] = r4     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 4
                int[] r4 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x0024 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0024 }
                r4[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r1 = 5
                int[] r4 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x002b }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x002b }
                r4[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x0031 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0031 }
                r2[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0031 }
            L_0x0031:
                int[] r1 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2 = 7
                r1[r2] = r2     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r1 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 8
                r1[r2] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r1 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch:{ NoSuchFieldError -> 0x0047 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x0047 }
                r2 = 0
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.mOwner = constraintWidget;
        this.mType = type;
    }

    private boolean isConnectionToMe(ConstraintWidget constraintWidget, HashSet<ConstraintWidget> hashSet) {
        if (hashSet.contains(constraintWidget)) {
            return false;
        }
        hashSet.add(constraintWidget);
        if (constraintWidget == getOwner()) {
            return true;
        }
        ArrayList<ConstraintAnchor> anchors = constraintWidget.getAnchors();
        int size = anchors.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintAnchor constraintAnchor = anchors.get(i2);
            if (constraintAnchor.isSimilarDimensionConnection(this) && constraintAnchor.isConnected() && isConnectionToMe(constraintAnchor.getTarget().getOwner(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean connect(ConstraintAnchor constraintAnchor, int i2) {
        return connect(constraintAnchor, i2, -1, false);
    }

    public boolean connect(ConstraintAnchor constraintAnchor, int i2, int i3, boolean z) {
        if (constraintAnchor == null) {
            reset();
            return true;
        } else if (!z && !isValidConnection(constraintAnchor)) {
            return false;
        } else {
            this.mTarget = constraintAnchor;
            if (constraintAnchor.mDependents == null) {
                constraintAnchor.mDependents = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.mTarget.mDependents;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i2 > 0) {
                this.mMargin = i2;
            } else {
                this.mMargin = 0;
            }
            this.mGoneMargin = i3;
            return true;
        }
    }

    public void copyFrom(ConstraintAnchor constraintAnchor, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        ConstraintAnchor constraintAnchor2;
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor3 = this.mTarget;
        if (!(constraintAnchor3 == null || (hashSet = constraintAnchor3.mDependents) == null)) {
            hashSet.remove(this);
        }
        ConstraintAnchor constraintAnchor4 = constraintAnchor.mTarget;
        if (constraintAnchor4 != null) {
            constraintAnchor2 = hashMap.get(constraintAnchor.mTarget.mOwner).getAnchor(constraintAnchor4.getType());
        } else {
            constraintAnchor2 = null;
        }
        this.mTarget = constraintAnchor2;
        ConstraintAnchor constraintAnchor5 = this.mTarget;
        if (constraintAnchor5 != null) {
            if (constraintAnchor5.mDependents == null) {
                constraintAnchor5.mDependents = new HashSet<>();
            }
            this.mTarget.mDependents.add(this);
        }
        this.mMargin = constraintAnchor.mMargin;
        this.mGoneMargin = constraintAnchor.mGoneMargin;
    }

    public void findDependents(int i2, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        HashSet<ConstraintAnchor> hashSet = this.mDependents;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                Grouping.findDependents(it.next().mOwner, i2, arrayList, widgetGroup);
            }
        }
    }

    public HashSet<ConstraintAnchor> getDependents() {
        return this.mDependents;
    }

    public int getFinalValue() {
        if (!this.mHasFinalValue) {
            return 0;
        }
        return this.mFinalValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = r3.mTarget;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getMargin() {
        /*
            r3 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r3.mOwner
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.mGoneMargin
            r2 = -1
            if (r0 <= r2) goto L_0x0020
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L_0x0020
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mOwner
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x0020
            int r0 = r3.mGoneMargin
            return r0
        L_0x0020:
            int r0 = r3.mMargin
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintAnchor.getMargin():int");
    }

    public final ConstraintAnchor getOpposite() {
        switch (this.mType.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.mOwner.mRight;
            case 2:
                return this.mOwner.mBottom;
            case 3:
                return this.mOwner.mLeft;
            case 4:
                return this.mOwner.mTop;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public ConstraintWidget getOwner() {
        return this.mOwner;
    }

    public SolverVariable getSolverVariable() {
        return this.mSolverVariable;
    }

    public ConstraintAnchor getTarget() {
        return this.mTarget;
    }

    public Type getType() {
        return this.mType;
    }

    public boolean hasCenteredDependents() {
        HashSet<ConstraintAnchor> hashSet = this.mDependents;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().getOpposite().isConnected()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDependents() {
        HashSet<ConstraintAnchor> hashSet = this.mDependents;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean hasFinalValue() {
        return this.mHasFinalValue;
    }

    public boolean isConnected() {
        return this.mTarget != null;
    }

    public boolean isConnectionAllowed(ConstraintWidget constraintWidget) {
        if (isConnectionToMe(constraintWidget, new HashSet())) {
            return false;
        }
        ConstraintWidget parent = getOwner().getParent();
        return parent == constraintWidget || constraintWidget.getParent() == parent;
    }

    public boolean isConnectionAllowed(ConstraintWidget constraintWidget, ConstraintAnchor constraintAnchor) {
        return isConnectionAllowed(constraintWidget);
    }

    public boolean isSideAnchor() {
        switch (this.mType.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isSimilarDimensionConnection(ConstraintAnchor constraintAnchor) {
        Type type = constraintAnchor.getType();
        Type type2 = this.mType;
        if (type == type2) {
            return true;
        }
        switch (type2.ordinal()) {
            case 0:
                return false;
            case 1:
            case 3:
            case 7:
                return type == Type.LEFT || type == Type.RIGHT || type == Type.CENTER_X;
            case 2:
            case 4:
            case 5:
            case 8:
                return type == Type.TOP || type == Type.BOTTOM || type == Type.CENTER_Y || type == Type.BASELINE;
            case 6:
                return type != Type.BASELINE;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isValidConnection(ConstraintAnchor constraintAnchor) {
        boolean z = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type type = constraintAnchor.getType();
        Type type2 = this.mType;
        if (type == type2) {
            return type2 != Type.BASELINE || (constraintAnchor.getOwner().hasBaseline() && getOwner().hasBaseline());
        }
        switch (type2.ordinal()) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = type == Type.LEFT || type == Type.RIGHT;
                if (!(constraintAnchor.getOwner() instanceof Guideline)) {
                    return z2;
                }
                if (z2 || type == Type.CENTER_X) {
                    z = true;
                }
                return z;
            case 2:
            case 4:
                boolean z3 = type == Type.TOP || type == Type.BOTTOM;
                if (!(constraintAnchor.getOwner() instanceof Guideline)) {
                    return z3;
                }
                if (z3 || type == Type.CENTER_Y) {
                    z = true;
                }
                return z;
            case 6:
                return (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isVerticalAnchor() {
        switch (this.mType.ordinal()) {
            case 0:
            case 2:
            case 4:
            case 5:
            case 8:
                return true;
            case 1:
            case 3:
            case 6:
            case 7:
                return false;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public void reset() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.mTarget;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.mDependents) == null)) {
            hashSet.remove(this);
            if (this.mTarget.mDependents.size() == 0) {
                this.mTarget.mDependents = null;
            }
        }
        this.mDependents = null;
        this.mTarget = null;
        this.mMargin = 0;
        this.mGoneMargin = -1;
        this.mHasFinalValue = false;
        this.mFinalValue = 0;
    }

    public void resetFinalResolution() {
        this.mHasFinalValue = false;
        this.mFinalValue = 0;
    }

    public void resetSolverVariable(Cache cache) {
        SolverVariable solverVariable = this.mSolverVariable;
        if (solverVariable == null) {
            this.mSolverVariable = new SolverVariable(SolverVariable.Type.UNRESTRICTED, (String) null);
        } else {
            solverVariable.reset();
        }
    }

    public void setFinalValue(int i2) {
        this.mFinalValue = i2;
        this.mHasFinalValue = true;
    }

    public void setGoneMargin(int i2) {
        if (isConnected()) {
            this.mGoneMargin = i2;
        }
    }

    public void setMargin(int i2) {
        if (isConnected()) {
            this.mMargin = i2;
        }
    }

    public String toString() {
        return this.mOwner.getDebugName() + ":" + this.mType.toString();
    }
}
