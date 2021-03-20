package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.Reference;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Guideline;

public class GuidelineReference implements Reference {
    private Object key;
    private int mEnd = -1;
    private Guideline mGuidelineWidget;
    private int mOrientation;
    private float mPercent = 0.0f;
    private int mStart = -1;
    public final State mState;

    public GuidelineReference(State state) {
        this.mState = state;
    }

    public void apply() {
        this.mGuidelineWidget.setOrientation(this.mOrientation);
        int i2 = this.mStart;
        if (i2 != -1) {
            this.mGuidelineWidget.setGuideBegin(i2);
            return;
        }
        int i3 = this.mEnd;
        if (i3 != -1) {
            this.mGuidelineWidget.setGuideEnd(i3);
        } else {
            this.mGuidelineWidget.setGuidePercent(this.mPercent);
        }
    }

    public void end(Object obj) {
        this.mStart = -1;
        this.mEnd = this.mState.convertDimension(obj);
        this.mPercent = 0.0f;
    }

    public ConstraintWidget getConstraintWidget() {
        if (this.mGuidelineWidget == null) {
            this.mGuidelineWidget = new Guideline();
        }
        return this.mGuidelineWidget;
    }

    public Object getKey() {
        return this.key;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void percent(float f) {
        this.mStart = -1;
        this.mEnd = -1;
        this.mPercent = f;
    }

    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        this.mGuidelineWidget = constraintWidget instanceof Guideline ? (Guideline) constraintWidget : null;
    }

    public void setKey(Object obj) {
        this.key = obj;
    }

    public void setOrientation(int i2) {
        this.mOrientation = i2;
    }

    public void start(Object obj) {
        this.mStart = this.mState.convertDimension(obj);
        this.mEnd = -1;
        this.mPercent = 0.0f;
    }
}
