package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import b.e.a.a.a;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    private static int POOL_SIZE = 1000;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static Metrics sMetrics;
    private int TABLE_SIZE;
    public boolean graphOptimizer;
    public boolean hasSimpleDefinition;
    private boolean[] mAlreadyTestedCandidates;
    public final Cache mCache;
    private Row mGoal;
    private int mMaxColumns;
    private int mMaxRows;
    public int mNumColumns;
    public int mNumRows;
    private SolverVariable[] mPoolVariables;
    private int mPoolVariablesCount;
    public ArrayRow[] mRows;
    private Row mTempGoal;
    private HashMap<String, SolverVariable> mVariables;
    public int mVariablesID;
    public boolean newgraphOptimizer;

    public interface Row {
        void addError(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(Row row);

        boolean isEmpty();

        void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z);

        void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z);

        void updateFromSystem(LinearSystem linearSystem);
    }

    public class ValuesRow extends ArrayRow {
        public ValuesRow(Cache cache) {
            this.variables = new SolverVariableValues(this, cache);
        }
    }

    public LinearSystem() {
        this.hasSimpleDefinition = false;
        this.mVariablesID = 0;
        this.mVariables = null;
        this.TABLE_SIZE = 32;
        this.mMaxColumns = 32;
        this.mRows = null;
        this.graphOptimizer = false;
        this.newgraphOptimizer = false;
        this.mAlreadyTestedCandidates = new boolean[32];
        this.mNumColumns = 1;
        this.mNumRows = 0;
        this.mMaxRows = 32;
        this.mPoolVariables = new SolverVariable[POOL_SIZE];
        this.mPoolVariablesCount = 0;
        this.mRows = new ArrayRow[32];
        releaseRows();
        Cache cache = new Cache();
        this.mCache = cache;
        this.mGoal = new PriorityGoalRow(cache);
        this.mTempGoal = OPTIMIZED_ENGINE ? new ValuesRow(cache) : new ArrayRow(cache);
    }

    private SolverVariable acquireSolverVariable(SolverVariable.Type type, String str) {
        SolverVariable acquire = this.mCache.solverVariablePool.acquire();
        if (acquire == null) {
            acquire = new SolverVariable(type, str);
        } else {
            acquire.reset();
        }
        acquire.setType(type, str);
        int i2 = this.mPoolVariablesCount;
        int i3 = POOL_SIZE;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            POOL_SIZE = i4;
            this.mPoolVariables = (SolverVariable[]) Arrays.copyOf(this.mPoolVariables, i4);
        }
        SolverVariable[] solverVariableArr = this.mPoolVariables;
        int i5 = this.mPoolVariablesCount;
        this.mPoolVariablesCount = i5 + 1;
        solverVariableArr[i5] = acquire;
        return acquire;
    }

    private void addError(ArrayRow arrayRow) {
        arrayRow.addError(this, 0);
    }

    private final void addRow(ArrayRow arrayRow) {
        int i2;
        if (!SIMPLIFY_SYNONYMS || !arrayRow.isSimpleDefinition) {
            ArrayRow[] arrayRowArr = this.mRows;
            int i3 = this.mNumRows;
            arrayRowArr[i3] = arrayRow;
            SolverVariable solverVariable = arrayRow.variable;
            solverVariable.definitionId = i3;
            this.mNumRows = i3 + 1;
            solverVariable.updateReferencesWithNewDefinition(this, arrayRow);
        } else {
            arrayRow.variable.setFinalValue(this, arrayRow.constantValue);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i4 = 0;
            while (i4 < this.mNumRows) {
                if (this.mRows[i4] == null) {
                    System.out.println("WTF");
                }
                ArrayRow[] arrayRowArr2 = this.mRows;
                if (arrayRowArr2[i4] != null && arrayRowArr2[i4].isSimpleDefinition) {
                    ArrayRow arrayRow2 = arrayRowArr2[i4];
                    arrayRow2.variable.setFinalValue(this, arrayRow2.constantValue);
                    (OPTIMIZED_ENGINE ? this.mCache.optimizedArrayRowPool : this.mCache.arrayRowPool).release(arrayRow2);
                    this.mRows[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.mNumRows;
                        if (i5 >= i2) {
                            break;
                        }
                        ArrayRow[] arrayRowArr3 = this.mRows;
                        int i7 = i5 - 1;
                        arrayRowArr3[i7] = arrayRowArr3[i5];
                        if (arrayRowArr3[i7].variable.definitionId == i5) {
                            arrayRowArr3[i7].variable.definitionId = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.mRows[i6] = null;
                    }
                    this.mNumRows = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    private void addSingleError(ArrayRow arrayRow, int i2) {
        addSingleError(arrayRow, i2, 0);
    }

    private void computeValues() {
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            ArrayRow arrayRow = this.mRows[i2];
            arrayRow.variable.computedValue = arrayRow.constantValue;
        }
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        return linearSystem.createRow().createRowDimensionPercent(solverVariable, solverVariable2, f);
    }

    private SolverVariable createVariable(String str, SolverVariable.Type type) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.variables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(type, (String) null);
        acquireSolverVariable.setName(str);
        int i2 = this.mVariablesID + 1;
        this.mVariablesID = i2;
        this.mNumColumns++;
        acquireSolverVariable.id = i2;
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        this.mVariables.put(str, acquireSolverVariable);
        this.mCache.mIndexedVariables[this.mVariablesID] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    private void displayRows() {
        displaySolverVariables();
        String str = "";
        int i2 = 0;
        while (true) {
            int i3 = this.mNumRows;
            StringBuilder y = a.y(str);
            if (i2 < i3) {
                y.append(this.mRows[i2]);
                str = a.m(y.toString(), "\n");
                i2++;
            } else {
                y.append(this.mGoal);
                y.append("\n");
                System.out.println(y.toString());
                return;
            }
        }
    }

    private void displaySolverVariables() {
        StringBuilder y = a.y("Display Rows (");
        y.append(this.mNumRows);
        y.append("x");
        System.out.println(a.o(y, this.mNumColumns, ")\n"));
    }

    private int enforceBFS(Row row) {
        boolean z;
        int i2 = 0;
        while (true) {
            if (i2 >= this.mNumRows) {
                z = false;
                break;
            }
            ArrayRow[] arrayRowArr = this.mRows;
            if (arrayRowArr[i2].variable.mType != SolverVariable.Type.UNRESTRICTED && arrayRowArr[i2].constantValue < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            Metrics metrics = sMetrics;
            if (metrics != null) {
                metrics.bfs++;
            }
            i3++;
            float f = Float.MAX_VALUE;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < this.mNumRows; i7++) {
                ArrayRow arrayRow = this.mRows[i7];
                if (arrayRow.variable.mType != SolverVariable.Type.UNRESTRICTED && !arrayRow.isSimpleDefinition && arrayRow.constantValue < 0.0f) {
                    int i8 = 9;
                    if (SKIP_COLUMNS) {
                        int currentSize = arrayRow.variables.getCurrentSize();
                        int i9 = 0;
                        while (i9 < currentSize) {
                            SolverVariable variable = arrayRow.variables.getVariable(i9);
                            float f2 = arrayRow.variables.get(variable);
                            if (f2 > 0.0f) {
                                int i10 = 0;
                                while (i10 < i8) {
                                    float f3 = variable.strengthVector[i10] / f2;
                                    if ((f3 < f && i10 == i6) || i10 > i6) {
                                        i5 = variable.id;
                                        i6 = i10;
                                        i4 = i7;
                                        f = f3;
                                    }
                                    i10++;
                                    i8 = 9;
                                }
                            }
                            i9++;
                            i8 = 9;
                        }
                    } else {
                        for (int i11 = 1; i11 < this.mNumColumns; i11++) {
                            SolverVariable solverVariable = this.mCache.mIndexedVariables[i11];
                            float f4 = arrayRow.variables.get(solverVariable);
                            if (f4 > 0.0f) {
                                for (int i12 = 0; i12 < 9; i12++) {
                                    float f5 = solverVariable.strengthVector[i12] / f4;
                                    if ((f5 < f && i12 == i6) || i12 > i6) {
                                        i5 = i11;
                                        i6 = i12;
                                        i4 = i7;
                                        f = f5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i4 != -1) {
                ArrayRow arrayRow2 = this.mRows[i4];
                arrayRow2.variable.definitionId = -1;
                Metrics metrics2 = sMetrics;
                if (metrics2 != null) {
                    metrics2.pivots++;
                }
                arrayRow2.pivot(this.mCache.mIndexedVariables[i5]);
                SolverVariable solverVariable2 = arrayRow2.variable;
                solverVariable2.definitionId = i4;
                solverVariable2.updateReferencesWithNewDefinition(this, arrayRow2);
            } else {
                z2 = true;
            }
            if (i3 > this.mNumColumns / 2) {
                z2 = true;
            }
        }
        return i3;
    }

    private String getDisplaySize(int i2) {
        int i3 = i2 * 4;
        int i4 = i3 / 1024;
        int i5 = i4 / 1024;
        return i5 > 0 ? a.h("", i5, " Mb") : i4 > 0 ? a.h("", i4, " Kb") : a.h("", i3, " bytes");
    }

    private String getDisplayStrength(int i2) {
        return i2 == 1 ? "LOW" : i2 == 2 ? "MEDIUM" : i2 == 3 ? "HIGH" : i2 == 4 ? "HIGHEST" : i2 == 5 ? "EQUALITY" : i2 == 8 ? "FIXED" : i2 == 6 ? "BARRIER" : "NONE";
    }

    public static Metrics getMetrics() {
        return sMetrics;
    }

    private void increaseTableSize() {
        int i2 = this.TABLE_SIZE * 2;
        this.TABLE_SIZE = i2;
        this.mRows = (ArrayRow[]) Arrays.copyOf(this.mRows, i2);
        Cache cache = this.mCache;
        cache.mIndexedVariables = (SolverVariable[]) Arrays.copyOf(cache.mIndexedVariables, this.TABLE_SIZE);
        int i3 = this.TABLE_SIZE;
        this.mAlreadyTestedCandidates = new boolean[i3];
        this.mMaxColumns = i3;
        this.mMaxRows = i3;
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.tableSizeIncrease++;
            metrics.maxTableSize = Math.max(metrics.maxTableSize, (long) i3);
            Metrics metrics2 = sMetrics;
            metrics2.lastTableSize = metrics2.maxTableSize;
        }
    }

    private final int optimize(Row row, boolean z) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.optimize++;
        }
        for (int i2 = 0; i2 < this.mNumColumns; i2++) {
            this.mAlreadyTestedCandidates[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.iterations++;
            }
            i3++;
            if (i3 >= this.mNumColumns * 2) {
                return i3;
            }
            if (row.getKey() != null) {
                this.mAlreadyTestedCandidates[row.getKey().id] = true;
            }
            SolverVariable pivotCandidate = row.getPivotCandidate(this, this.mAlreadyTestedCandidates);
            if (pivotCandidate != null) {
                boolean[] zArr = this.mAlreadyTestedCandidates;
                int i4 = pivotCandidate.id;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (pivotCandidate != null) {
                float f = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.mNumRows; i6++) {
                    ArrayRow arrayRow = this.mRows[i6];
                    if (arrayRow.variable.mType != SolverVariable.Type.UNRESTRICTED && !arrayRow.isSimpleDefinition && arrayRow.hasVariable(pivotCandidate)) {
                        float f2 = arrayRow.variables.get(pivotCandidate);
                        if (f2 < 0.0f) {
                            float f3 = (-arrayRow.constantValue) / f2;
                            if (f3 < f) {
                                i5 = i6;
                                f = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    ArrayRow arrayRow2 = this.mRows[i5];
                    arrayRow2.variable.definitionId = -1;
                    Metrics metrics3 = sMetrics;
                    if (metrics3 != null) {
                        metrics3.pivots++;
                    }
                    arrayRow2.pivot(pivotCandidate);
                    SolverVariable solverVariable = arrayRow2.variable;
                    solverVariable.definitionId = i5;
                    solverVariable.updateReferencesWithNewDefinition(this, arrayRow2);
                }
            } else {
                z2 = true;
            }
        }
        return i3;
    }

    private void releaseRows() {
        int i2 = 0;
        if (OPTIMIZED_ENGINE) {
            while (i2 < this.mNumRows) {
                ArrayRow arrayRow = this.mRows[i2];
                if (arrayRow != null) {
                    this.mCache.optimizedArrayRowPool.release(arrayRow);
                }
                this.mRows[i2] = null;
                i2++;
            }
            return;
        }
        while (i2 < this.mNumRows) {
            ArrayRow arrayRow2 = this.mRows[i2];
            if (arrayRow2 != null) {
                this.mCache.arrayRowPool.release(arrayRow2);
            }
            this.mRows[i2] = null;
            i2++;
        }
    }

    public void addCenterPoint(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i2) {
        ConstraintWidget constraintWidget3 = constraintWidget;
        ConstraintWidget constraintWidget4 = constraintWidget2;
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable createObjectVariable = createObjectVariable(constraintWidget3.getAnchor(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable createObjectVariable2 = createObjectVariable(constraintWidget3.getAnchor(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable createObjectVariable3 = createObjectVariable(constraintWidget3.getAnchor(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable createObjectVariable4 = createObjectVariable(constraintWidget3.getAnchor(type4));
        SolverVariable createObjectVariable5 = createObjectVariable(constraintWidget4.getAnchor(type));
        SolverVariable createObjectVariable6 = createObjectVariable(constraintWidget4.getAnchor(type2));
        SolverVariable createObjectVariable7 = createObjectVariable(constraintWidget4.getAnchor(type3));
        SolverVariable createObjectVariable8 = createObjectVariable(constraintWidget4.getAnchor(type4));
        ArrayRow createRow = createRow();
        double d = (double) f;
        SolverVariable solverVariable = createObjectVariable7;
        double d2 = (double) i2;
        createRow.createRowWithAngle(createObjectVariable2, createObjectVariable4, createObjectVariable6, createObjectVariable8, (float) (Math.sin(d) * d2));
        addConstraint(createRow);
        ArrayRow createRow2 = createRow();
        createRow2.createRowWithAngle(createObjectVariable, createObjectVariable3, createObjectVariable5, solverVariable, (float) (Math.cos(d) * d2));
        addConstraint(createRow2);
    }

    public void addCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3, int i4) {
        int i5 = i4;
        ArrayRow createRow = createRow();
        createRow.createRowCentering(solverVariable, solverVariable2, i2, f, solverVariable3, solverVariable4, i3);
        if (i5 != 8) {
            createRow.addError(this, i5);
        }
        addConstraint(createRow);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addConstraint(androidx.constraintlayout.solver.ArrayRow r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            androidx.constraintlayout.solver.Metrics r0 = sMetrics
            r1 = 1
            if (r0 == 0) goto L_0x0017
            long r3 = r0.constraints
            long r3 = r3 + r1
            r0.constraints = r3
            boolean r3 = r8.isSimpleDefinition
            if (r3 == 0) goto L_0x0017
            long r3 = r0.simpleconstraints
            long r3 = r3 + r1
            r0.simpleconstraints = r3
        L_0x0017:
            int r0 = r7.mNumRows
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.mMaxRows
            if (r0 >= r4) goto L_0x0026
            int r0 = r7.mNumColumns
            int r0 = r0 + r3
            int r4 = r7.mMaxColumns
            if (r0 < r4) goto L_0x0029
        L_0x0026:
            r7.increaseTableSize()
        L_0x0029:
            r0 = 0
            boolean r4 = r8.isSimpleDefinition
            if (r4 != 0) goto L_0x009e
            r8.updateFromSystem(r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0038
            return
        L_0x0038:
            r8.ensurePositiveConstant()
            boolean r4 = r8.chooseSubject(r7)
            if (r4 == 0) goto L_0x0095
            androidx.constraintlayout.solver.SolverVariable r4 = r7.createExtraVariable()
            r8.variable = r4
            int r5 = r7.mNumRows
            r7.addRow(r8)
            int r6 = r7.mNumRows
            int r5 = r5 + r3
            if (r6 != r5) goto L_0x0095
            androidx.constraintlayout.solver.LinearSystem$Row r0 = r7.mTempGoal
            r0.initFromRow(r8)
            androidx.constraintlayout.solver.LinearSystem$Row r0 = r7.mTempGoal
            r7.optimize(r0, r3)
            int r0 = r4.definitionId
            r5 = -1
            if (r0 != r5) goto L_0x0096
            androidx.constraintlayout.solver.SolverVariable r0 = r8.variable
            if (r0 != r4) goto L_0x0076
            androidx.constraintlayout.solver.SolverVariable r0 = r8.pickPivot(r4)
            if (r0 == 0) goto L_0x0076
            androidx.constraintlayout.solver.Metrics r4 = sMetrics
            if (r4 == 0) goto L_0x0073
            long r5 = r4.pivots
            long r5 = r5 + r1
            r4.pivots = r5
        L_0x0073:
            r8.pivot(r0)
        L_0x0076:
            boolean r0 = r8.isSimpleDefinition
            if (r0 != 0) goto L_0x007f
            androidx.constraintlayout.solver.SolverVariable r0 = r8.variable
            r0.updateReferencesWithNewDefinition(r7, r8)
        L_0x007f:
            boolean r0 = OPTIMIZED_ENGINE
            if (r0 == 0) goto L_0x0088
            androidx.constraintlayout.solver.Cache r0 = r7.mCache
            androidx.constraintlayout.solver.Pools$Pool<androidx.constraintlayout.solver.ArrayRow> r0 = r0.optimizedArrayRowPool
            goto L_0x008c
        L_0x0088:
            androidx.constraintlayout.solver.Cache r0 = r7.mCache
            androidx.constraintlayout.solver.Pools$Pool<androidx.constraintlayout.solver.ArrayRow> r0 = r0.arrayRowPool
        L_0x008c:
            r0.release(r8)
            int r0 = r7.mNumRows
            int r0 = r0 - r3
            r7.mNumRows = r0
            goto L_0x0096
        L_0x0095:
            r3 = r0
        L_0x0096:
            boolean r0 = r8.hasKeyVariable()
            if (r0 != 0) goto L_0x009d
            return
        L_0x009d:
            r0 = r3
        L_0x009e:
            if (r0 != 0) goto L_0x00a3
            r7.addRow(r8)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.LinearSystem.addConstraint(androidx.constraintlayout.solver.ArrayRow):void");
    }

    public ArrayRow addEquality(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        if (!USE_BASIC_SYNONYMS || i3 != 8 || !solverVariable2.isFinalValue || solverVariable.definitionId != -1) {
            ArrayRow createRow = createRow();
            createRow.createRowEquals(solverVariable, solverVariable2, i2);
            if (i3 != 8) {
                createRow.addError(this, i3);
            }
            addConstraint(createRow);
            return createRow;
        }
        solverVariable.setFinalValue(this, solverVariable2.computedValue + ((float) i2));
        return null;
    }

    public void addEquality(SolverVariable solverVariable, int i2) {
        ArrayRow arrayRow;
        if (!USE_BASIC_SYNONYMS || solverVariable.definitionId != -1) {
            int i3 = solverVariable.definitionId;
            if (i3 != -1) {
                ArrayRow arrayRow2 = this.mRows[i3];
                if (!arrayRow2.isSimpleDefinition) {
                    if (arrayRow2.variables.getCurrentSize() == 0) {
                        arrayRow2.isSimpleDefinition = true;
                    } else {
                        arrayRow = createRow();
                        arrayRow.createRowEquals(solverVariable, i2);
                    }
                }
                arrayRow2.constantValue = (float) i2;
                return;
            }
            arrayRow = createRow();
            arrayRow.createRowDefinition(solverVariable, i2);
            addConstraint(arrayRow);
            return;
        }
        float f = (float) i2;
        solverVariable.setFinalValue(this, f);
        for (int i4 = 0; i4 < this.mVariablesID + 1; i4++) {
            SolverVariable solverVariable2 = this.mCache.mIndexedVariables[i4];
            if (solverVariable2 != null && solverVariable2.isSynonym && solverVariable2.synonym == solverVariable.id) {
                solverVariable2.setFinalValue(this, solverVariable2.synonymDelta + f);
            }
        }
    }

    public void addGreaterBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, boolean z) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i2);
        addConstraint(createRow);
    }

    public void addGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i2);
        if (i3 != 8) {
            addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * -1.0f), i3);
        }
        addConstraint(createRow);
    }

    public void addLowerBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, boolean z) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i2);
        addConstraint(createRow);
    }

    public void addLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i2);
        if (i3 != 8) {
            addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * -1.0f), i3);
        }
        addConstraint(createRow);
    }

    public void addRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i2) {
        ArrayRow createRow = createRow();
        createRow.createRowDimensionRatio(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i2 != 8) {
            createRow.addError(this, i2);
        }
        addConstraint(createRow);
    }

    public void addSingleError(ArrayRow arrayRow, int i2, int i3) {
        arrayRow.addSingleError(createErrorVariable(i3, (String) null), i2);
    }

    public void addSynonym(SolverVariable solverVariable, SolverVariable solverVariable2, int i2) {
        if (solverVariable.definitionId == -1 && i2 == 0) {
            if (solverVariable2.isSynonym) {
                solverVariable2 = this.mCache.mIndexedVariables[solverVariable2.synonym];
            }
            if (solverVariable.isSynonym) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[solverVariable.synonym];
            } else {
                solverVariable.setSynonym(this, solverVariable2, 0.0f);
            }
        } else {
            addEquality(solverVariable, solverVariable2, i2, 8);
        }
    }

    public final void cleanupRows() {
        int i2;
        int i3 = 0;
        while (i3 < this.mNumRows) {
            ArrayRow arrayRow = this.mRows[i3];
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.isSimpleDefinition = true;
            }
            if (arrayRow.isSimpleDefinition) {
                SolverVariable solverVariable = arrayRow.variable;
                solverVariable.computedValue = arrayRow.constantValue;
                solverVariable.removeFromRow(arrayRow);
                int i4 = i3;
                while (true) {
                    i2 = this.mNumRows;
                    if (i4 >= i2 - 1) {
                        break;
                    }
                    ArrayRow[] arrayRowArr = this.mRows;
                    int i5 = i4 + 1;
                    arrayRowArr[i4] = arrayRowArr[i5];
                    i4 = i5;
                }
                this.mRows[i2 - 1] = null;
                this.mNumRows = i2 - 1;
                i3--;
                (OPTIMIZED_ENGINE ? this.mCache.optimizedArrayRowPool : this.mCache.arrayRowPool).release(arrayRow);
            }
            i3++;
        }
    }

    public SolverVariable createErrorVariable(int i2, String str) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.errors++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.ERROR, str);
        int i3 = this.mVariablesID + 1;
        this.mVariablesID = i3;
        this.mNumColumns++;
        acquireSolverVariable.id = i3;
        acquireSolverVariable.strength = i2;
        this.mCache.mIndexedVariables[i3] = acquireSolverVariable;
        this.mGoal.addError(acquireSolverVariable);
        return acquireSolverVariable;
    }

    public SolverVariable createExtraVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.extravariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, (String) null);
        int i2 = this.mVariablesID + 1;
        this.mVariablesID = i2;
        this.mNumColumns++;
        acquireSolverVariable.id = i2;
        this.mCache.mIndexedVariables[i2] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    public SolverVariable createObjectVariable(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.getSolverVariable();
            if (solverVariable == null) {
                constraintAnchor.resetSolverVariable(this.mCache);
                solverVariable = constraintAnchor.getSolverVariable();
            }
            int i2 = solverVariable.id;
            if (i2 == -1 || i2 > this.mVariablesID || this.mCache.mIndexedVariables[i2] == null) {
                if (i2 != -1) {
                    solverVariable.reset();
                }
                int i3 = this.mVariablesID + 1;
                this.mVariablesID = i3;
                this.mNumColumns++;
                solverVariable.id = i3;
                solverVariable.mType = SolverVariable.Type.UNRESTRICTED;
                this.mCache.mIndexedVariables[i3] = solverVariable;
            }
        }
        return solverVariable;
    }

    public ArrayRow createRow() {
        ArrayRow arrayRow;
        if (OPTIMIZED_ENGINE) {
            arrayRow = this.mCache.optimizedArrayRowPool.acquire();
            if (arrayRow == null) {
                arrayRow = new ValuesRow(this.mCache);
                OPTIMIZED_ARRAY_ROW_CREATION++;
                SolverVariable.increaseErrorId();
                return arrayRow;
            }
        } else {
            arrayRow = this.mCache.arrayRowPool.acquire();
            if (arrayRow == null) {
                arrayRow = new ArrayRow(this.mCache);
                ARRAY_ROW_CREATION++;
                SolverVariable.increaseErrorId();
                return arrayRow;
            }
        }
        arrayRow.reset();
        SolverVariable.increaseErrorId();
        return arrayRow;
    }

    public SolverVariable createSlackVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.slackvariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, (String) null);
        int i2 = this.mVariablesID + 1;
        this.mVariablesID = i2;
        this.mNumColumns++;
        acquireSolverVariable.id = i2;
        this.mCache.mIndexedVariables[i2] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    public void displayReadableRows() {
        displaySolverVariables();
        String o2 = a.o(a.y(" num vars "), this.mVariablesID, "\n");
        for (int i2 = 0; i2 < this.mVariablesID + 1; i2++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[i2];
            if (solverVariable != null && solverVariable.isFinalValue) {
                o2 = o2 + " $[" + i2 + "] => " + solverVariable + " = " + solverVariable.computedValue + "\n";
            }
        }
        String m2 = a.m(o2, "\n");
        for (int i3 = 0; i3 < this.mVariablesID + 1; i3++) {
            SolverVariable[] solverVariableArr = this.mCache.mIndexedVariables;
            SolverVariable solverVariable2 = solverVariableArr[i3];
            if (solverVariable2 != null && solverVariable2.isSynonym) {
                m2 = m2 + " ~[" + i3 + "] => " + solverVariable2 + " = " + solverVariableArr[solverVariable2.synonym] + " + " + solverVariable2.synonymDelta + "\n";
            }
        }
        String m3 = a.m(m2, "\n\n #  ");
        for (int i4 = 0; i4 < this.mNumRows; i4++) {
            StringBuilder y = a.y(m3);
            y.append(this.mRows[i4].toReadableString());
            m3 = a.m(y.toString(), "\n #  ");
        }
        if (this.mGoal != null) {
            StringBuilder B = a.B(m3, "Goal: ");
            B.append(this.mGoal);
            B.append("\n");
            m3 = B.toString();
        }
        System.out.println(m3);
    }

    public void displaySystemInformations() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.TABLE_SIZE; i3++) {
            ArrayRow[] arrayRowArr = this.mRows;
            if (arrayRowArr[i3] != null) {
                i2 += arrayRowArr[i3].sizeInBytes();
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.mNumRows; i5++) {
            ArrayRow[] arrayRowArr2 = this.mRows;
            if (arrayRowArr2[i5] != null) {
                i4 += arrayRowArr2[i5].sizeInBytes();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder y = a.y("Linear System -> Table size: ");
        y.append(this.TABLE_SIZE);
        y.append(" (");
        int i6 = this.TABLE_SIZE;
        y.append(getDisplaySize(i6 * i6));
        y.append(") -- row sizes: ");
        y.append(getDisplaySize(i2));
        y.append(", actual size: ");
        y.append(getDisplaySize(i4));
        y.append(" rows: ");
        y.append(this.mNumRows);
        y.append("/");
        y.append(this.mMaxRows);
        y.append(" cols: ");
        y.append(this.mNumColumns);
        y.append("/");
        y.append(this.mMaxColumns);
        y.append(" ");
        y.append(0);
        y.append(" occupied cells, ");
        y.append(getDisplaySize(0));
        printStream.println(y.toString());
    }

    public void displayVariablesReadableRows() {
        displaySolverVariables();
        String str = "";
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            if (this.mRows[i2].variable.mType == SolverVariable.Type.UNRESTRICTED) {
                StringBuilder y = a.y(str);
                y.append(this.mRows[i2].toReadableString());
                str = a.m(y.toString(), "\n");
            }
        }
        StringBuilder y2 = a.y(str);
        y2.append(this.mGoal);
        y2.append("\n");
        System.out.println(y2.toString());
    }

    public void fillMetrics(Metrics metrics) {
        sMetrics = metrics;
    }

    public Cache getCache() {
        return this.mCache;
    }

    public Row getGoal() {
        return this.mGoal;
    }

    public int getMemoryUsed() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.mNumRows; i3++) {
            ArrayRow[] arrayRowArr = this.mRows;
            if (arrayRowArr[i3] != null) {
                i2 = arrayRowArr[i3].sizeInBytes() + i2;
            }
        }
        return i2;
    }

    public int getNumEquations() {
        return this.mNumRows;
    }

    public int getNumVariables() {
        return this.mVariablesID;
    }

    public int getObjectVariableValue(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    public ArrayRow getRow(int i2) {
        return this.mRows[i2];
    }

    public float getValueFor(String str) {
        SolverVariable variable = getVariable(str, SolverVariable.Type.UNRESTRICTED);
        if (variable == null) {
            return 0.0f;
        }
        return variable.computedValue;
    }

    public SolverVariable getVariable(String str, SolverVariable.Type type) {
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        SolverVariable solverVariable = this.mVariables.get(str);
        return solverVariable == null ? createVariable(str, type) : solverVariable;
    }

    public void minimize() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimize++;
        }
        if (this.mGoal.isEmpty()) {
            computeValues();
            return;
        }
        if (this.graphOptimizer || this.newgraphOptimizer) {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.graphOptimizer++;
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.mNumRows) {
                    z = true;
                    break;
                } else if (!this.mRows[i2].isSimpleDefinition) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Metrics metrics3 = sMetrics;
                if (metrics3 != null) {
                    metrics3.fullySolved++;
                }
                computeValues();
                return;
            }
        }
        minimizeGoal(this.mGoal);
    }

    public void minimizeGoal(Row row) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimizeGoal++;
            metrics.maxVariables = Math.max(metrics.maxVariables, (long) this.mNumColumns);
            Metrics metrics2 = sMetrics;
            metrics2.maxRows = Math.max(metrics2.maxRows, (long) this.mNumRows);
        }
        enforceBFS(row);
        optimize(row, false);
        computeValues();
    }

    public void removeRow(ArrayRow arrayRow) {
        SolverVariable solverVariable;
        int i2;
        if (arrayRow.isSimpleDefinition && (solverVariable = arrayRow.variable) != null) {
            int i3 = solverVariable.definitionId;
            if (i3 != -1) {
                while (true) {
                    i2 = this.mNumRows;
                    if (i3 >= i2 - 1) {
                        break;
                    }
                    ArrayRow[] arrayRowArr = this.mRows;
                    int i4 = i3 + 1;
                    SolverVariable solverVariable2 = arrayRowArr[i4].variable;
                    if (solverVariable2.definitionId == i4) {
                        solverVariable2.definitionId = i3;
                    }
                    arrayRowArr[i3] = arrayRowArr[i4];
                    i3 = i4;
                }
                this.mNumRows = i2 - 1;
            }
            SolverVariable solverVariable3 = arrayRow.variable;
            if (!solverVariable3.isFinalValue) {
                solverVariable3.setFinalValue(this, arrayRow.constantValue);
            }
            (OPTIMIZED_ENGINE ? this.mCache.optimizedArrayRowPool : this.mCache.arrayRowPool).release(arrayRow);
        }
    }

    public void reset() {
        Cache cache;
        int i2 = 0;
        while (true) {
            cache = this.mCache;
            SolverVariable[] solverVariableArr = cache.mIndexedVariables;
            if (i2 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i2];
            if (solverVariable != null) {
                solverVariable.reset();
            }
            i2++;
        }
        cache.solverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        Arrays.fill(this.mCache.mIndexedVariables, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.mVariables;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.mVariablesID = 0;
        this.mGoal.clear();
        this.mNumColumns = 1;
        for (int i3 = 0; i3 < this.mNumRows; i3++) {
            ArrayRow[] arrayRowArr = this.mRows;
            if (arrayRowArr[i3] != null) {
                arrayRowArr[i3].used = false;
            }
        }
        releaseRows();
        this.mNumRows = 0;
        this.mTempGoal = OPTIMIZED_ENGINE ? new ValuesRow(this.mCache) : new ArrayRow(this.mCache);
    }
}
