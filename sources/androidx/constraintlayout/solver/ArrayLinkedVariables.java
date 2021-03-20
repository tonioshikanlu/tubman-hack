package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.ArrayRow;
import b.e.a.a.a;
import java.io.PrintStream;
import java.util.Arrays;

public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    public static final int NONE = -1;
    private static float epsilon = 0.001f;
    private int ROW_SIZE = 8;
    private SolverVariable candidate = null;
    public int currentSize = 0;
    private int[] mArrayIndices = new int[8];
    private int[] mArrayNextIndices = new int[8];
    private float[] mArrayValues = new float[8];
    public final Cache mCache;
    private boolean mDidFillOnce = false;
    private int mHead = -1;
    private int mLast = -1;
    private final ArrayRow mRow;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
    }

    public void add(SolverVariable solverVariable, float f, boolean z) {
        float f2 = epsilon;
        if (f <= (-f2) || f >= f2) {
            int i2 = this.mHead;
            if (i2 == -1) {
                this.mHead = 0;
                this.mArrayValues[0] = f;
                this.mArrayIndices[0] = solverVariable.id;
                this.mArrayNextIndices[0] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(this.mRow);
                this.currentSize++;
                if (!this.mDidFillOnce) {
                    int i3 = this.mLast + 1;
                    this.mLast = i3;
                    int[] iArr = this.mArrayIndices;
                    if (i3 >= iArr.length) {
                        this.mDidFillOnce = true;
                        this.mLast = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.currentSize) {
                int[] iArr2 = this.mArrayIndices;
                int i6 = iArr2[i2];
                int i7 = solverVariable.id;
                if (i6 == i7) {
                    float[] fArr = this.mArrayValues;
                    float f3 = fArr[i2] + f;
                    float f4 = epsilon;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.mHead) {
                            this.mHead = this.mArrayNextIndices[i2];
                        } else {
                            int[] iArr3 = this.mArrayNextIndices;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z) {
                            solverVariable.removeFromRow(this.mRow);
                        }
                        if (this.mDidFillOnce) {
                            this.mLast = i2;
                        }
                        solverVariable.usageInRowCount--;
                        this.currentSize--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.mArrayNextIndices[i2];
                i4++;
            }
            int i8 = this.mLast;
            int i9 = i8 + 1;
            if (this.mDidFillOnce) {
                int[] iArr4 = this.mArrayIndices;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.mArrayIndices;
            if (i8 >= iArr5.length && this.currentSize < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.mArrayIndices;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.mArrayIndices;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.ROW_SIZE * 2;
                this.ROW_SIZE = i11;
                this.mDidFillOnce = false;
                this.mLast = i8 - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, i11);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
            }
            this.mArrayIndices[i8] = solverVariable.id;
            this.mArrayValues[i8] = f;
            int[] iArr8 = this.mArrayNextIndices;
            if (i5 != -1) {
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                iArr8[i8] = this.mHead;
                this.mHead = i8;
            }
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.currentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
            int i12 = this.mLast;
            int[] iArr9 = this.mArrayIndices;
            if (i12 >= iArr9.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr9.length - 1;
            }
        }
    }

    public final void clear() {
        int i2 = this.mHead;
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i2]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.mRow);
            }
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.currentSize = 0;
    }

    public boolean contains(SolverVariable solverVariable) {
        int i2 = this.mHead;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            if (this.mArrayIndices[i2] == solverVariable.id) {
                return true;
            }
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
        return false;
    }

    public void display() {
        int i2 = this.currentSize;
        System.out.print("{ ");
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable variable = getVariable(i3);
            if (variable != null) {
                PrintStream printStream = System.out;
                printStream.print(variable + " = " + getVariableValue(i3) + " ");
            }
        }
        System.out.println(" }");
    }

    public void divideByAmount(float f) {
        int i2 = this.mHead;
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            float[] fArr = this.mArrayValues;
            fArr[i2] = fArr[i2] / f;
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
    }

    public final float get(SolverVariable solverVariable) {
        int i2 = this.mHead;
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            if (this.mArrayIndices[i2] == solverVariable.id) {
                return this.mArrayValues[i2];
            }
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
        return 0.0f;
    }

    public int getCurrentSize() {
        return this.currentSize;
    }

    public int getHead() {
        return this.mHead;
    }

    public final int getId(int i2) {
        return this.mArrayIndices[i2];
    }

    public final int getNextIndice(int i2) {
        return this.mArrayNextIndices[i2];
    }

    public SolverVariable getPivotCandidate() {
        SolverVariable solverVariable = this.candidate;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i2 = this.mHead;
        int i3 = 0;
        SolverVariable solverVariable2 = null;
        while (i2 != -1 && i3 < this.currentSize) {
            if (this.mArrayValues[i2] < 0.0f) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i2]];
                if (solverVariable2 == null || solverVariable2.strength < solverVariable3.strength) {
                    solverVariable2 = solverVariable3;
                }
            }
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
        return solverVariable2;
    }

    public final float getValue(int i2) {
        return this.mArrayValues[i2];
    }

    public SolverVariable getVariable(int i2) {
        int i3 = this.mHead;
        int i4 = 0;
        while (i3 != -1 && i4 < this.currentSize) {
            if (i4 == i2) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[i3]];
            }
            i3 = this.mArrayNextIndices[i3];
            i4++;
        }
        return null;
    }

    public float getVariableValue(int i2) {
        int i3 = this.mHead;
        int i4 = 0;
        while (i3 != -1 && i4 < this.currentSize) {
            if (i4 == i2) {
                return this.mArrayValues[i3];
            }
            i3 = this.mArrayNextIndices[i3];
            i4++;
        }
        return 0.0f;
    }

    public boolean hasAtLeastOnePositiveVariable() {
        int i2 = this.mHead;
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            if (this.mArrayValues[i2] > 0.0f) {
                return true;
            }
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
        return false;
    }

    public int indexOf(SolverVariable solverVariable) {
        int i2 = this.mHead;
        if (i2 == -1) {
            return -1;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            if (this.mArrayIndices[i2] == solverVariable.id) {
                return i2;
            }
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
        return -1;
    }

    public void invert() {
        int i2 = this.mHead;
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            float[] fArr = this.mArrayValues;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
    }

    public final void put(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            remove(solverVariable, true);
            return;
        }
        int i2 = this.mHead;
        if (i2 == -1) {
            this.mHead = 0;
            this.mArrayValues[0] = f;
            this.mArrayIndices[0] = solverVariable.id;
            this.mArrayNextIndices[0] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.currentSize++;
            if (!this.mDidFillOnce) {
                int i3 = this.mLast + 1;
                this.mLast = i3;
                int[] iArr = this.mArrayIndices;
                if (i3 >= iArr.length) {
                    this.mDidFillOnce = true;
                    this.mLast = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.currentSize) {
            int[] iArr2 = this.mArrayIndices;
            int i6 = iArr2[i2];
            int i7 = solverVariable.id;
            if (i6 == i7) {
                this.mArrayValues[i2] = f;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.mArrayNextIndices[i2];
            i4++;
        }
        int i8 = this.mLast;
        int i9 = i8 + 1;
        if (this.mDidFillOnce) {
            int[] iArr3 = this.mArrayIndices;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.mArrayIndices;
        if (i8 >= iArr4.length && this.currentSize < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.mArrayIndices;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.mArrayIndices;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.ROW_SIZE * 2;
            this.ROW_SIZE = i11;
            this.mDidFillOnce = false;
            this.mLast = i8 - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, i11);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
        }
        this.mArrayIndices[i8] = solverVariable.id;
        this.mArrayValues[i8] = f;
        int[] iArr7 = this.mArrayNextIndices;
        if (i5 != -1) {
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            iArr7[i8] = this.mHead;
            this.mHead = i8;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.mRow);
        int i12 = this.currentSize + 1;
        this.currentSize = i12;
        if (!this.mDidFillOnce) {
            this.mLast++;
        }
        int[] iArr8 = this.mArrayIndices;
        if (i12 >= iArr8.length) {
            this.mDidFillOnce = true;
        }
        if (this.mLast >= iArr8.length) {
            this.mDidFillOnce = true;
            this.mLast = iArr8.length - 1;
        }
    }

    public final float remove(SolverVariable solverVariable, boolean z) {
        if (this.candidate == solverVariable) {
            this.candidate = null;
        }
        int i2 = this.mHead;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.currentSize) {
            if (this.mArrayIndices[i2] == solverVariable.id) {
                if (i2 == this.mHead) {
                    this.mHead = this.mArrayNextIndices[i2];
                } else {
                    int[] iArr = this.mArrayNextIndices;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    solverVariable.removeFromRow(this.mRow);
                }
                solverVariable.usageInRowCount--;
                this.currentSize--;
                this.mArrayIndices[i2] = -1;
                if (this.mDidFillOnce) {
                    this.mLast = i2;
                }
                return this.mArrayValues[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.mArrayNextIndices[i2];
        }
        return 0.0f;
    }

    public int sizeInBytes() {
        return (this.mArrayIndices.length * 4 * 3) + 0 + 36;
    }

    public String toString() {
        int i2 = this.mHead;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            StringBuilder y = a.y(a.m(str, " -> "));
            y.append(this.mArrayValues[i2]);
            y.append(" : ");
            StringBuilder y2 = a.y(y.toString());
            y2.append(this.mCache.mIndexedVariables[this.mArrayIndices[i2]]);
            str = y2.toString();
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
        return str;
    }

    public float use(ArrayRow arrayRow, boolean z) {
        float f = get(arrayRow.variable);
        remove(arrayRow.variable, z);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize2 = arrayRowVariables.getCurrentSize();
        for (int i2 = 0; i2 < currentSize2; i2++) {
            SolverVariable variable = arrayRowVariables.getVariable(i2);
            add(variable, arrayRowVariables.get(variable) * f, z);
        }
        return f;
    }
}
