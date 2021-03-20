package androidx.constraintlayout.solver.state;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public class Dimension {
    public static final Object FIXED_DIMENSION = new Object();
    public static final Object PARENT_DIMENSION = new Object();
    public static final Object PERCENT_DIMENSION = new Object();
    public static final Object SPREAD_DIMENSION = new Object();
    public static final Object WRAP_DIMENSION = new Object();
    private final int WRAP_CONTENT = -2;
    public Object mInitialValue = WRAP_DIMENSION;
    public boolean mIsSuggested = false;
    public int mMax = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public int mMin = 0;
    public float mPercent = 1.0f;
    public float mRatio = 1.0f;
    public int mValue = 0;

    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    private Dimension() {
    }

    private Dimension(Object obj) {
        this.mInitialValue = obj;
    }

    public static Dimension Fixed(int i2) {
        Dimension dimension = new Dimension(FIXED_DIMENSION);
        dimension.fixed(i2);
        return dimension;
    }

    public static Dimension Fixed(Object obj) {
        Dimension dimension = new Dimension(FIXED_DIMENSION);
        dimension.fixed(obj);
        return dimension;
    }

    public static Dimension Parent() {
        return new Dimension(PARENT_DIMENSION);
    }

    public static Dimension Percent(Object obj, float f) {
        Dimension dimension = new Dimension(PERCENT_DIMENSION);
        dimension.percent(obj, f);
        return dimension;
    }

    public static Dimension Spread() {
        return new Dimension(SPREAD_DIMENSION);
    }

    public static Dimension Suggested(int i2) {
        Dimension dimension = new Dimension();
        dimension.suggested(i2);
        return dimension;
    }

    public static Dimension Suggested(Object obj) {
        Dimension dimension = new Dimension();
        dimension.suggested(obj);
        return dimension;
    }

    public static Dimension Wrap() {
        return new Dimension(WRAP_DIMENSION);
    }

    public void apply(State state, ConstraintWidget constraintWidget, int i2) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i3 = 2;
        if (i2 == 0) {
            if (this.mIsSuggested) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.mInitialValue;
                if (obj == WRAP_DIMENSION) {
                    i3 = 1;
                } else if (obj != PERCENT_DIMENSION) {
                    i3 = 0;
                }
                constraintWidget.setHorizontalMatchStyle(i3, this.mMin, this.mMax, this.mPercent);
                return;
            }
            int i4 = this.mMin;
            if (i4 > 0) {
                constraintWidget.setMinWidth(i4);
            }
            int i5 = this.mMax;
            if (i5 < Integer.MAX_VALUE) {
                constraintWidget.setMaxWidth(i5);
            }
            Object obj2 = this.mInitialValue;
            if (obj2 == WRAP_DIMENSION) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            } else if (obj2 == PARENT_DIMENSION) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            } else if (obj2 == null) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.setWidth(this.mValue);
                return;
            } else {
                return;
            }
            constraintWidget.setHorizontalDimensionBehaviour(dimensionBehaviour2);
        } else if (this.mIsSuggested) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.mInitialValue;
            if (obj3 == WRAP_DIMENSION) {
                i3 = 1;
            } else if (obj3 != PERCENT_DIMENSION) {
                i3 = 0;
            }
            constraintWidget.setVerticalMatchStyle(i3, this.mMin, this.mMax, this.mPercent);
        } else {
            int i6 = this.mMin;
            if (i6 > 0) {
                constraintWidget.setMinHeight(i6);
            }
            int i7 = this.mMax;
            if (i7 < Integer.MAX_VALUE) {
                constraintWidget.setMaxHeight(i7);
            }
            Object obj4 = this.mInitialValue;
            if (obj4 == WRAP_DIMENSION) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            } else if (obj4 == PARENT_DIMENSION) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            } else if (obj4 == null) {
                constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.setHeight(this.mValue);
                return;
            } else {
                return;
            }
            constraintWidget.setVerticalDimensionBehaviour(dimensionBehaviour);
        }
    }

    public Dimension fixed(int i2) {
        this.mInitialValue = null;
        this.mValue = i2;
        return this;
    }

    public Dimension fixed(Object obj) {
        this.mInitialValue = obj;
        if (obj instanceof Integer) {
            this.mValue = ((Integer) obj).intValue();
            this.mInitialValue = null;
        }
        return this;
    }

    public float getRatio() {
        return this.mRatio;
    }

    public int getValue() {
        return this.mValue;
    }

    public Dimension max(int i2) {
        if (this.mMax >= 0) {
            this.mMax = i2;
        }
        return this;
    }

    public Dimension max(Object obj) {
        Object obj2 = WRAP_DIMENSION;
        if (obj == obj2 && this.mIsSuggested) {
            this.mInitialValue = obj2;
            this.mMax = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return this;
    }

    public Dimension min(int i2) {
        if (i2 >= 0) {
            this.mMin = i2;
        }
        return this;
    }

    public Dimension min(Object obj) {
        if (obj == WRAP_DIMENSION) {
            this.mMin = -2;
        }
        return this;
    }

    public Dimension percent(Object obj, float f) {
        this.mPercent = f;
        return this;
    }

    public Dimension ratio(float f) {
        return this;
    }

    public void setRatio(float f) {
        this.mRatio = f;
    }

    public void setValue(int i2) {
        this.mIsSuggested = false;
        this.mInitialValue = null;
        this.mValue = i2;
    }

    public Dimension suggested(int i2) {
        this.mIsSuggested = true;
        return this;
    }

    public Dimension suggested(Object obj) {
        this.mInitialValue = obj;
        this.mIsSuggested = true;
        return this;
    }
}
