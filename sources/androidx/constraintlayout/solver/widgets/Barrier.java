package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import b.e.a.a.a;
import java.util.HashMap;

public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private static final boolean USE_RESOLUTION = true;
    private boolean mAllowsGoneWidget = true;
    private int mBarrierType = 0;
    private int mMargin = 0;
    public boolean resolved = false;

    public Barrier() {
    }

    public Barrier(String str) {
        setDebugName(str);
    }

    public void addToSolver(LinearSystem linearSystem, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor;
        int i2;
        int i3;
        int i4;
        SolverVariable solverVariable2;
        int i5;
        ConstraintAnchor[] constraintAnchorArr2 = this.mListAnchors;
        constraintAnchorArr2[0] = this.mLeft;
        constraintAnchorArr2[2] = this.mTop;
        constraintAnchorArr2[1] = this.mRight;
        constraintAnchorArr2[3] = this.mBottom;
        int i6 = 0;
        while (true) {
            constraintAnchorArr = this.mListAnchors;
            if (i6 >= constraintAnchorArr.length) {
                break;
            }
            constraintAnchorArr[i6].mSolverVariable = linearSystem.createObjectVariable(constraintAnchorArr[i6]);
            i6++;
        }
        int i7 = this.mBarrierType;
        if (i7 >= 0 && i7 < 4) {
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i7];
            if (!this.resolved) {
                allSolved();
            }
            if (this.resolved) {
                this.resolved = false;
                int i8 = this.mBarrierType;
                if (i8 == 0 || i8 == 1) {
                    linearSystem.addEquality(this.mLeft.mSolverVariable, this.mX);
                    solverVariable2 = this.mRight.mSolverVariable;
                    i5 = this.mX;
                } else if (i8 == 2 || i8 == 3) {
                    linearSystem.addEquality(this.mTop.mSolverVariable, this.mY);
                    solverVariable2 = this.mBottom.mSolverVariable;
                    i5 = this.mY;
                } else {
                    return;
                }
                linearSystem.addEquality(solverVariable2, i5);
                return;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= this.mWidgetsCount) {
                    z2 = false;
                    break;
                }
                ConstraintWidget constraintWidget = this.mWidgets[i9];
                if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i3 = this.mBarrierType) == 0 || i3 == 1) && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mLeft.mTarget != null && constraintWidget.mRight.mTarget != null) || (((i4 = this.mBarrierType) == 2 || i4 == 3) && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mTop.mTarget != null && constraintWidget.mBottom.mTarget != null))) {
                    z2 = true;
                } else {
                    i9++;
                }
            }
            z2 = true;
            boolean z3 = this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents();
            boolean z4 = this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents();
            boolean z5 = !z2 && (((i2 = this.mBarrierType) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4))));
            int i10 = 5;
            if (!z5) {
                i10 = 4;
            }
            for (int i11 = 0; i11 < this.mWidgetsCount; i11++) {
                ConstraintWidget constraintWidget2 = this.mWidgets[i11];
                if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                    SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.mBarrierType]);
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
                    int i12 = this.mBarrierType;
                    constraintAnchorArr3[i12].mSolverVariable = createObjectVariable;
                    int i13 = (constraintAnchorArr3[i12].mTarget == null || constraintAnchorArr3[i12].mTarget.mOwner != this) ? 0 : constraintAnchorArr3[i12].mMargin + 0;
                    if (i12 == 0 || i12 == 2) {
                        linearSystem.addLowerBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin - i13, z2);
                    } else {
                        linearSystem.addGreaterBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin + i13, z2);
                    }
                    linearSystem.addEquality(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin + i13, i10);
                }
            }
            int i14 = this.mBarrierType;
            if (i14 == 0) {
                linearSystem.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 4);
                solverVariable = this.mLeft.mSolverVariable;
                constraintAnchor = this.mParent.mLeft;
            } else if (i14 == 1) {
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 4);
                solverVariable = this.mLeft.mSolverVariable;
                constraintAnchor = this.mParent.mRight;
            } else if (i14 == 2) {
                linearSystem.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 4);
                solverVariable = this.mTop.mSolverVariable;
                constraintAnchor = this.mParent.mTop;
            } else if (i14 == 3) {
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 4);
                solverVariable = this.mTop.mSolverVariable;
                constraintAnchor = this.mParent.mBottom;
            } else {
                return;
            }
            linearSystem.addEquality(solverVariable, constraintAnchor.mSolverVariable, 0, 0);
        }
    }

    public boolean allSolved() {
        int i2;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        ConstraintAnchor.Type type3;
        int i3;
        int i4;
        int i5 = 0;
        boolean z = true;
        while (true) {
            i2 = this.mWidgetsCount;
            if (i5 >= i2) {
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i5];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i3 = this.mBarrierType) == 0 || i3 == 1) && !constraintWidget.isResolvedHorizontally()) || (((i4 = this.mBarrierType) == 2 || i4 == 3) && !constraintWidget.isResolvedVertically()))) {
                z = false;
            }
            i5++;
        }
        if (!z || i2 <= 0) {
            return false;
        }
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < this.mWidgetsCount; i7++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i7];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                if (!z2) {
                    int i8 = this.mBarrierType;
                    if (i8 == 0) {
                        type3 = ConstraintAnchor.Type.LEFT;
                    } else if (i8 == 1) {
                        type3 = ConstraintAnchor.Type.RIGHT;
                    } else if (i8 == 2) {
                        type3 = ConstraintAnchor.Type.TOP;
                    } else {
                        if (i8 == 3) {
                            type3 = ConstraintAnchor.Type.BOTTOM;
                        }
                        z2 = true;
                    }
                    i6 = constraintWidget2.getAnchor(type3).getFinalValue();
                    z2 = true;
                }
                int i9 = this.mBarrierType;
                if (i9 == 0) {
                    type2 = ConstraintAnchor.Type.LEFT;
                } else {
                    if (i9 == 1) {
                        type = ConstraintAnchor.Type.RIGHT;
                    } else if (i9 == 2) {
                        type2 = ConstraintAnchor.Type.TOP;
                    } else if (i9 == 3) {
                        type = ConstraintAnchor.Type.BOTTOM;
                    }
                    i6 = Math.max(i6, constraintWidget2.getAnchor(type).getFinalValue());
                }
                i6 = Math.min(i6, constraintWidget2.getAnchor(type2).getFinalValue());
            }
        }
        int i10 = i6 + this.mMargin;
        int i11 = this.mBarrierType;
        if (i11 == 0 || i11 == 1) {
            setFinalHorizontal(i10, i10);
        } else {
            setFinalVertical(i10, i10);
        }
        this.resolved = true;
        return true;
    }

    public boolean allowedInBarrier() {
        return true;
    }

    public boolean allowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Barrier barrier = (Barrier) constraintWidget;
        this.mBarrierType = barrier.mBarrierType;
        this.mAllowsGoneWidget = barrier.mAllowsGoneWidget;
        this.mMargin = barrier.mMargin;
    }

    public int getBarrierType() {
        return this.mBarrierType;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public int getOrientation() {
        int i2 = this.mBarrierType;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    public boolean isResolvedHorizontally() {
        return this.resolved;
    }

    public boolean isResolvedVertically() {
        return this.resolved;
    }

    public void markWidgets() {
        for (int i2 = 0; i2 < this.mWidgetsCount; i2++) {
            ConstraintWidget constraintWidget = this.mWidgets[i2];
            int i3 = this.mBarrierType;
            if (i3 == 0 || i3 == 1) {
                constraintWidget.setInBarrier(0, true);
            } else if (i3 == 2 || i3 == 3) {
                constraintWidget.setInBarrier(1, true);
            }
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.mAllowsGoneWidget = z;
    }

    public void setBarrierType(int i2) {
        this.mBarrierType = i2;
    }

    public void setMargin(int i2) {
        this.mMargin = i2;
    }

    public String toString() {
        StringBuilder y = a.y("[Barrier] ");
        y.append(getDebugName());
        y.append(" {");
        String sb = y.toString();
        for (int i2 = 0; i2 < this.mWidgetsCount; i2++) {
            ConstraintWidget constraintWidget = this.mWidgets[i2];
            if (i2 > 0) {
                sb = a.m(sb, ", ");
            }
            StringBuilder y2 = a.y(sb);
            y2.append(constraintWidget.getDebugName());
            sb = y2.toString();
        }
        return a.m(sb, "}");
    }
}
