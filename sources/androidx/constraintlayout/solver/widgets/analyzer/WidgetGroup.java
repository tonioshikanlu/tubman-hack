package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.Chain;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import b.e.a.a.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class WidgetGroup {
    private static final boolean DEBUG = false;
    public static int count;
    public boolean authoritative = false;
    public int id = -1;
    private int moveTo = -1;
    public int orientation = 0;
    public ArrayList<MeasureResult> results = null;
    public ArrayList<ConstraintWidget> widgets = new ArrayList<>();

    public class MeasureResult {
        public int baseline;
        public int bottom;
        public int left;
        public int orientation;
        public int right;
        public int top;
        public WeakReference<ConstraintWidget> widgetRef;

        public MeasureResult(ConstraintWidget constraintWidget, LinearSystem linearSystem, int i2) {
            this.widgetRef = new WeakReference<>(constraintWidget);
            this.left = linearSystem.getObjectVariableValue(constraintWidget.mLeft);
            this.top = linearSystem.getObjectVariableValue(constraintWidget.mTop);
            this.right = linearSystem.getObjectVariableValue(constraintWidget.mRight);
            this.bottom = linearSystem.getObjectVariableValue(constraintWidget.mBottom);
            this.baseline = linearSystem.getObjectVariableValue(constraintWidget.mBaseline);
            this.orientation = i2;
        }

        public void apply() {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.widgetRef.get();
            if (constraintWidget != null) {
                constraintWidget.setFinalFrame(this.left, this.top, this.right, this.bottom, this.baseline, this.orientation);
            }
        }
    }

    public WidgetGroup(int i2) {
        int i3 = count;
        count = i3 + 1;
        this.id = i3;
        this.orientation = i2;
    }

    private boolean contains(ConstraintWidget constraintWidget) {
        return this.widgets.contains(constraintWidget);
    }

    private String getOrientationString() {
        int i2 = this.orientation;
        return i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown";
    }

    private int measureWrap(int i2, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(i2);
        if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
            return i2 == 0 ? constraintWidget.getWidth() : constraintWidget.getHeight();
        }
        return -1;
    }

    private int solverMeasure(LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i2) {
        int objectVariableValue;
        ConstraintAnchor constraintAnchor;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) arrayList.get(0).getParent();
        linearSystem.reset();
        constraintWidgetContainer.addToSolver(linearSystem, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).addToSolver(linearSystem, false);
        }
        if (i2 == 0 && constraintWidgetContainer.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i2 == 1 && constraintWidgetContainer.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.minimize();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.results = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.results.add(new MeasureResult(arrayList.get(i4), linearSystem, i2));
        }
        if (i2 == 0) {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mLeft);
            constraintAnchor = constraintWidgetContainer.mRight;
        } else {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mTop);
            constraintAnchor = constraintWidgetContainer.mBottom;
        }
        int objectVariableValue2 = linearSystem.getObjectVariableValue(constraintAnchor);
        linearSystem.reset();
        return objectVariableValue2 - objectVariableValue;
    }

    public boolean add(ConstraintWidget constraintWidget) {
        if (this.widgets.contains(constraintWidget)) {
            return false;
        }
        this.widgets.add(constraintWidget);
        return true;
    }

    public void apply() {
        if (this.results != null && this.authoritative) {
            for (int i2 = 0; i2 < this.results.size(); i2++) {
                this.results.get(i2).apply();
            }
        }
    }

    public void cleanup(ArrayList<WidgetGroup> arrayList) {
        int size = this.widgets.size();
        if (this.moveTo != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                WidgetGroup widgetGroup = arrayList.get(i2);
                if (this.moveTo == widgetGroup.id) {
                    moveTo(this.orientation, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void clear() {
        this.widgets.clear();
    }

    public int getId() {
        return this.id;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean intersectWith(WidgetGroup widgetGroup) {
        for (int i2 = 0; i2 < this.widgets.size(); i2++) {
            if (widgetGroup.contains(this.widgets.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public boolean isAuthoritative() {
        return this.authoritative;
    }

    public int measureWrap(LinearSystem linearSystem, int i2) {
        if (this.widgets.size() == 0) {
            return 0;
        }
        return solverMeasure(linearSystem, this.widgets, i2);
    }

    public void moveTo(int i2, WidgetGroup widgetGroup) {
        Iterator<ConstraintWidget> it = this.widgets.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            widgetGroup.add(next);
            int id2 = widgetGroup.getId();
            if (i2 == 0) {
                next.horizontalGroup = id2;
            } else {
                next.verticalGroup = id2;
            }
        }
        this.moveTo = widgetGroup.id;
    }

    public void setAuthoritative(boolean z) {
        this.authoritative = z;
    }

    public void setOrientation(int i2) {
        this.orientation = i2;
    }

    public int size() {
        return this.widgets.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getOrientationString());
        sb.append(" [");
        String o2 = a.o(sb, this.id, "] <");
        Iterator<ConstraintWidget> it = this.widgets.iterator();
        while (it.hasNext()) {
            StringBuilder B = a.B(o2, " ");
            B.append(it.next().getDebugName());
            o2 = B.toString();
        }
        return a.m(o2, " >");
    }
}
