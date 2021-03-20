package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.ArrayRow;
import b.e.a.a.a;
import java.util.Arrays;
import java.util.Comparator;

public class PriorityGoalRow extends ArrayRow {
    private static final boolean DEBUG = false;
    public static final int NOT_FOUND = -1;
    private static final float epsilon = 1.0E-4f;
    private int TABLE_SIZE = 128;
    public GoalVariableAccessor accessor = new GoalVariableAccessor(this);
    private SolverVariable[] arrayGoals = new SolverVariable[128];
    public Cache mCache;
    private int numGoals = 0;
    private SolverVariable[] sortArray = new SolverVariable[128];

    public class GoalVariableAccessor implements Comparable {
        public PriorityGoalRow row;
        public SolverVariable variable;

        public GoalVariableAccessor(PriorityGoalRow priorityGoalRow) {
            this.row = priorityGoalRow;
        }

        public void add(SolverVariable solverVariable) {
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.variable.goalStrengthVector;
                fArr[i2] = fArr[i2] + solverVariable.goalStrengthVector[i2];
                if (Math.abs(fArr[i2]) < 1.0E-4f) {
                    this.variable.goalStrengthVector[i2] = 0.0f;
                }
            }
        }

        public boolean addToGoal(SolverVariable solverVariable, float f) {
            boolean z = true;
            if (this.variable.inGoal) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr = this.variable.goalStrengthVector;
                    fArr[i2] = (solverVariable.goalStrengthVector[i2] * f) + fArr[i2];
                    if (Math.abs(fArr[i2]) < 1.0E-4f) {
                        this.variable.goalStrengthVector[i2] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    PriorityGoalRow.this.removeGoal(this.variable);
                }
                return false;
            }
            for (int i3 = 0; i3 < 9; i3++) {
                float f2 = solverVariable.goalStrengthVector[i3];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    this.variable.goalStrengthVector[i3] = f3;
                } else {
                    this.variable.goalStrengthVector[i3] = 0.0f;
                }
            }
            return true;
        }

        public int compareTo(Object obj) {
            return this.variable.id - ((SolverVariable) obj).id;
        }

        public void init(SolverVariable solverVariable) {
            this.variable = solverVariable;
        }

        public final boolean isNegative() {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f = this.variable.goalStrengthVector[i2];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i2 = 0; i2 < 9; i2++) {
                if (this.variable.goalStrengthVector[i2] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isSmallerThan(SolverVariable solverVariable) {
            int i2 = 8;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                float f = solverVariable.goalStrengthVector[i2];
                float f2 = this.variable.goalStrengthVector[i2];
                if (f2 == f) {
                    i2--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public void reset() {
            Arrays.fill(this.variable.goalStrengthVector, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.variable != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    StringBuilder y = a.y(str);
                    y.append(this.variable.goalStrengthVector[i2]);
                    y.append(" ");
                    str = y.toString();
                }
            }
            StringBuilder B = a.B(str, "] ");
            B.append(this.variable);
            return B.toString();
        }
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.mCache = cache;
    }

    private final void addToGoal(SolverVariable solverVariable) {
        int i2;
        int i3 = this.numGoals + 1;
        SolverVariable[] solverVariableArr = this.arrayGoals;
        if (i3 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.arrayGoals = solverVariableArr2;
            this.sortArray = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.arrayGoals;
        int i4 = this.numGoals;
        solverVariableArr3[i4] = solverVariable;
        int i5 = i4 + 1;
        this.numGoals = i5;
        if (i5 > 1 && solverVariableArr3[i5 - 1].id > solverVariable.id) {
            int i6 = 0;
            while (true) {
                i2 = this.numGoals;
                if (i6 >= i2) {
                    break;
                }
                this.sortArray[i6] = this.arrayGoals[i6];
                i6++;
            }
            Arrays.sort(this.sortArray, 0, i2, new Comparator<SolverVariable>() {
                public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
                    return solverVariable.id - solverVariable2.id;
                }
            });
            for (int i7 = 0; i7 < this.numGoals; i7++) {
                this.arrayGoals[i7] = this.sortArray[i7];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    /* access modifiers changed from: private */
    public final void removeGoal(SolverVariable solverVariable) {
        int i2 = 0;
        while (i2 < this.numGoals) {
            if (this.arrayGoals[i2] == solverVariable) {
                while (true) {
                    int i3 = this.numGoals;
                    if (i2 < i3 - 1) {
                        SolverVariable[] solverVariableArr = this.arrayGoals;
                        int i4 = i2 + 1;
                        solverVariableArr[i2] = solverVariableArr[i4];
                        i2 = i4;
                    } else {
                        this.numGoals = i3 - 1;
                        solverVariable.inGoal = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public void addError(SolverVariable solverVariable) {
        this.accessor.init(solverVariable);
        this.accessor.reset();
        solverVariable.goalStrengthVector[solverVariable.strength] = 1.0f;
        addToGoal(solverVariable);
    }

    public void clear() {
        this.numGoals = 0;
        this.constantValue = 0.0f;
    }

    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.numGoals; i3++) {
            SolverVariable solverVariable = this.arrayGoals[i3];
            if (!zArr[solverVariable.id]) {
                this.accessor.init(solverVariable);
                GoalVariableAccessor goalVariableAccessor = this.accessor;
                if (i2 == -1) {
                    if (!goalVariableAccessor.isNegative()) {
                    }
                } else if (!goalVariableAccessor.isSmallerThan(this.arrayGoals[i2])) {
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.arrayGoals[i2];
    }

    public boolean isEmpty() {
        return this.numGoals == 0;
    }

    public String toString() {
        StringBuilder B = a.B("", " goal -> (");
        B.append(this.constantValue);
        B.append(") : ");
        String sb = B.toString();
        for (int i2 = 0; i2 < this.numGoals; i2++) {
            this.accessor.init(this.arrayGoals[i2]);
            sb = sb + this.accessor + " ";
        }
        return sb;
    }

    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        SolverVariable solverVariable = arrayRow.variable;
        if (solverVariable != null) {
            ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
            int currentSize = arrayRowVariables.getCurrentSize();
            for (int i2 = 0; i2 < currentSize; i2++) {
                SolverVariable variable = arrayRowVariables.getVariable(i2);
                float variableValue = arrayRowVariables.getVariableValue(i2);
                this.accessor.init(variable);
                if (this.accessor.addToGoal(solverVariable, variableValue)) {
                    addToGoal(variable);
                }
                this.constantValue = (arrayRow.constantValue * variableValue) + this.constantValue;
            }
            removeGoal(solverVariable);
        }
    }
}
