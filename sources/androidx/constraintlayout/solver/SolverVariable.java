package androidx.constraintlayout.solver;

import androidx.exifinterface.media.ExifInterface;
import b.e.a.a.a;
import java.util.Arrays;
import java.util.HashSet;

public class SolverVariable {
    private static final boolean INTERNAL_DEBUG = false;
    public static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    public int definitionId = -1;
    public float[] goalStrengthVector = new float[9];
    public int id = -1;
    public boolean inGoal;
    public HashSet<ArrayRow> inRows = null;
    public boolean isFinalValue = false;
    public boolean isSynonym = false;
    public ArrayRow[] mClientEquations = new ArrayRow[16];
    public int mClientEquationsCount = 0;
    private String mName;
    public Type mType;
    public int strength = 0;
    public float[] strengthVector = new float[9];
    public int synonym = -1;
    public float synonymDelta = 0.0f;
    public int usageInRowCount = 0;

    /* renamed from: androidx.constraintlayout.solver.SolverVariable$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
        static {
            /*
                androidx.constraintlayout.solver.SolverVariable.Type.values()
                r0 = 5
                int[] r1 = new int[r0]
                $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type = r1
                r2 = 1
                androidx.constraintlayout.solver.SolverVariable$Type r3 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED     // Catch:{ NoSuchFieldError -> 0x000e }
                r3 = 0
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 2
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x0015 }
                androidx.constraintlayout.solver.SolverVariable$Type r4 = androidx.constraintlayout.solver.SolverVariable.Type.CONSTANT     // Catch:{ NoSuchFieldError -> 0x0015 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                r2 = 3
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x001c }
                androidx.constraintlayout.solver.SolverVariable$Type r4 = androidx.constraintlayout.solver.SolverVariable.Type.SLACK     // Catch:{ NoSuchFieldError -> 0x001c }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r1 = 4
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.constraintlayout.solver.SolverVariable$Type r4 = androidx.constraintlayout.solver.SolverVariable.Type.ERROR     // Catch:{ NoSuchFieldError -> 0x0023 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x0029 }
                androidx.constraintlayout.solver.SolverVariable$Type r3 = androidx.constraintlayout.solver.SolverVariable.Type.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0029 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0029 }
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.SolverVariable.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.mType = type;
    }

    public SolverVariable(String str, Type type) {
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type, String str) {
        int i2;
        StringBuilder sb;
        if (str != null) {
            sb = a.y(str);
            i2 = uniqueErrorId;
        } else {
            int ordinal = type.ordinal();
            if (ordinal == 0) {
                sb = a.y("U");
                i2 = uniqueUnrestrictedId + 1;
                uniqueUnrestrictedId = i2;
            } else if (ordinal == 1) {
                sb = a.y("C");
                i2 = uniqueConstantId + 1;
                uniqueConstantId = i2;
            } else if (ordinal == 2) {
                sb = a.y(ExifInterface.LATITUDE_SOUTH);
                i2 = uniqueSlackId + 1;
                uniqueSlackId = i2;
            } else if (ordinal == 3) {
                sb = a.y("e");
                i2 = uniqueErrorId + 1;
                uniqueErrorId = i2;
            } else if (ordinal == 4) {
                sb = a.y(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
                i2 = uniqueId + 1;
                uniqueId = i2;
            } else {
                throw new AssertionError(type.name());
            }
        }
        sb.append(i2);
        return sb.toString();
    }

    public static void increaseErrorId() {
        uniqueErrorId++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i2 = 0;
        while (true) {
            int i3 = this.mClientEquationsCount;
            if (i2 >= i3) {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i3 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i4 = this.mClientEquationsCount;
                arrayRowArr2[i4] = arrayRow;
                this.mClientEquationsCount = i4 + 1;
                return;
            } else if (this.mClientEquations[i2] != arrayRow) {
                i2++;
            } else {
                return;
            }
        }
    }

    public void clearStrengths() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.strengthVector[i2] = 0.0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i2 = this.mClientEquationsCount;
        int i3 = 0;
        while (i3 < i2) {
            if (this.mClientEquations[i3] == arrayRow) {
                while (i3 < i2 - 1) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i4 = i3 + 1;
                    arrayRowArr[i3] = arrayRowArr[i4];
                    i3 = i4;
                }
                this.mClientEquationsCount--;
                return;
            }
            i3++;
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.definitionId = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        int i2 = this.mClientEquationsCount;
        for (int i3 = 0; i3 < i2; i3++) {
            this.mClientEquations[i3] = null;
        }
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.goalStrengthVector, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f) {
        this.computedValue = f;
        this.isFinalValue = true;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        int i2 = this.mClientEquationsCount;
        this.definitionId = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.mClientEquations[i3].updateFromFinalVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f) {
        this.isSynonym = true;
        this.synonym = solverVariable.id;
        this.synonymDelta = f;
        int i2 = this.mClientEquationsCount;
        this.definitionId = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.mClientEquations[i3].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    public String strengthsToString() {
        String str = this + "[";
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.strengthVector.length) {
            StringBuilder y = a.y(str);
            y.append(this.strengthVector[i2]);
            String sb = y.toString();
            float[] fArr = this.strengthVector;
            if (fArr[i2] > 0.0f) {
                z2 = false;
            } else if (fArr[i2] < 0.0f) {
                z2 = true;
            }
            if (fArr[i2] != 0.0f) {
                z = false;
            }
            int length = fArr.length - 1;
            StringBuilder y2 = a.y(sb);
            y2.append(i2 < length ? ", " : "] ");
            str = y2.toString();
            i2++;
        }
        if (z2) {
            str = a.m(str, " (-)");
        }
        return z ? a.m(str, " (*)") : str;
    }

    public String toString() {
        StringBuilder sb;
        if (this.mName != null) {
            sb = a.y("");
            sb.append(this.mName);
        } else {
            sb = a.y("");
            sb.append(this.id);
        }
        return sb.toString();
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i2 = this.mClientEquationsCount;
        for (int i3 = 0; i3 < i2; i3++) {
            this.mClientEquations[i3].updateFromRow(linearSystem, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }
}
