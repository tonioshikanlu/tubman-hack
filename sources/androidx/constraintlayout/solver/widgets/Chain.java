package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import java.util.ArrayList;

public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX WARNING: type inference failed for: r5v10, types: [androidx.constraintlayout.solver.SolverVariable] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r8 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r8 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r5 = false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x04fe A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0393 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:320:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r37, androidx.constraintlayout.solver.LinearSystem r38, int r39, int r40, androidx.constraintlayout.solver.widgets.ChainHead r41) {
        /*
            r0 = r37
            r9 = r38
            r1 = r41
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r1.mFirst
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r1.mLast
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = r1.mFirstVisibleWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = r1.mLastVisibleWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r1.mHead
            float r3 = r1.mTotalWeight
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.mListDimensionBehaviors
            r4 = r4[r39]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x001d
            r4 = r7
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r39 != 0) goto L_0x0030
            int r8 = r2.mHorizontalChainStyle
            if (r8 != 0) goto L_0x0027
            r14 = r7
            goto L_0x0028
        L_0x0027:
            r14 = 0
        L_0x0028:
            if (r8 != r7) goto L_0x002c
            r15 = r7
            goto L_0x002d
        L_0x002c:
            r15 = 0
        L_0x002d:
            if (r8 != r5) goto L_0x0040
            goto L_0x003e
        L_0x0030:
            int r8 = r2.mVerticalChainStyle
            if (r8 != 0) goto L_0x0036
            r14 = r7
            goto L_0x0037
        L_0x0036:
            r14 = 0
        L_0x0037:
            if (r8 != r7) goto L_0x003b
            r15 = r7
            goto L_0x003c
        L_0x003b:
            r15 = 0
        L_0x003c:
            if (r8 != r5) goto L_0x0040
        L_0x003e:
            r5 = r7
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            r7 = r10
            r8 = 0
        L_0x0043:
            r21 = 0
            if (r8 != 0) goto L_0x0123
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r7.mListAnchors
            r6 = r6[r40]
            if (r5 == 0) goto L_0x0050
            r19 = 1
            goto L_0x0052
        L_0x0050:
            r19 = 4
        L_0x0052:
            int r22 = r6.getMargin()
            r23 = r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r7.mListDimensionBehaviors
            r3 = r3[r39]
            r24 = r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r8) goto L_0x006c
            int[] r3 = r7.mResolvedMatchConstraintDefault
            r3 = r3[r39]
            if (r3 != 0) goto L_0x006c
            r25 = r15
            r3 = 1
            goto L_0x006f
        L_0x006c:
            r25 = r15
            r3 = 0
        L_0x006f:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r6.mTarget
            if (r15 == 0) goto L_0x007b
            if (r7 == r10) goto L_0x007b
            int r15 = r15.getMargin()
            int r22 = r15 + r22
        L_0x007b:
            r15 = r22
            if (r5 == 0) goto L_0x0088
            if (r7 == r10) goto L_0x0088
            if (r7 == r12) goto L_0x0088
            r22 = r14
            r19 = 8
            goto L_0x008a
        L_0x0088:
            r22 = r14
        L_0x008a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r6.mTarget
            r26 = r2
            if (r14 == 0) goto L_0x00ba
            if (r7 != r12) goto L_0x009d
            androidx.constraintlayout.solver.SolverVariable r2 = r6.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r14 = r14.mSolverVariable
            r27 = r10
            r10 = 6
            r9.addGreaterThan(r2, r14, r15, r10)
            goto L_0x00a8
        L_0x009d:
            r27 = r10
            androidx.constraintlayout.solver.SolverVariable r2 = r6.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r10 = r14.mSolverVariable
            r14 = 8
            r9.addGreaterThan(r2, r10, r15, r14)
        L_0x00a8:
            if (r3 == 0) goto L_0x00ae
            if (r5 != 0) goto L_0x00ae
            r2 = 5
            goto L_0x00b0
        L_0x00ae:
            r2 = r19
        L_0x00b0:
            androidx.constraintlayout.solver.SolverVariable r3 = r6.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            r9.addEquality(r3, r6, r15, r2)
            goto L_0x00bc
        L_0x00ba:
            r27 = r10
        L_0x00bc:
            if (r4 == 0) goto L_0x00f0
            int r2 = r7.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x00de
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r7.mListDimensionBehaviors
            r2 = r2[r39]
            if (r2 != r8) goto L_0x00de
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r7.mListAnchors
            int r3 = r40 + 1
            r3 = r2[r3]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r2 = r2[r40]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            r6 = 5
            r8 = 0
            r9.addGreaterThan(r3, r2, r8, r6)
            goto L_0x00df
        L_0x00de:
            r8 = 0
        L_0x00df:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r7.mListAnchors
            r2 = r2[r40]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r0.mListAnchors
            r3 = r3[r40]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r6 = 8
            r9.addGreaterThan(r2, r3, r8, r6)
        L_0x00f0:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r7.mListAnchors
            int r3 = r40 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L_0x010f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r2.mListAnchors
            r6 = r3[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            if (r6 == 0) goto L_0x010f
            r3 = r3[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.mOwner
            if (r3 == r7) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r21 = r2
        L_0x010f:
            if (r21 == 0) goto L_0x0116
            r7 = r21
            r8 = r24
            goto L_0x0117
        L_0x0116:
            r8 = 1
        L_0x0117:
            r14 = r22
            r3 = r23
            r15 = r25
            r2 = r26
            r10 = r27
            goto L_0x0043
        L_0x0123:
            r26 = r2
            r23 = r3
            r27 = r10
            r22 = r14
            r25 = r15
            if (r13 == 0) goto L_0x0190
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r11.mListAnchors
            int r3 = r40 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L_0x0190
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r13.mListAnchors
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r13.mListDimensionBehaviors
            r6 = r6[r39]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x014d
            int[] r6 = r13.mResolvedMatchConstraintDefault
            r6 = r6[r39]
            if (r6 != 0) goto L_0x014d
            r6 = 1
            goto L_0x014e
        L_0x014d:
            r6 = 0
        L_0x014e:
            if (r6 == 0) goto L_0x0166
            if (r5 != 0) goto L_0x0166
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r2.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.mOwner
            if (r7 != r0) goto L_0x0166
            androidx.constraintlayout.solver.SolverVariable r7 = r2.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            int r8 = r2.getMargin()
            int r8 = -r8
            r10 = 5
            r9.addEquality(r7, r6, r8, r10)
            goto L_0x017c
        L_0x0166:
            r10 = 5
            if (r5 == 0) goto L_0x017c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r2.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.mOwner
            if (r7 != r0) goto L_0x017c
            androidx.constraintlayout.solver.SolverVariable r7 = r2.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            int r8 = r2.getMargin()
            int r8 = -r8
            r14 = 4
            r9.addEquality(r7, r6, r8, r14)
        L_0x017c:
            androidx.constraintlayout.solver.SolverVariable r6 = r2.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r11.mListAnchors
            r3 = r7[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            int r2 = r2.getMargin()
            int r2 = -r2
            r7 = 6
            r9.addLowerThan(r6, r3, r2, r7)
            goto L_0x0191
        L_0x0190:
            r10 = 5
        L_0x0191:
            if (r4 == 0) goto L_0x01ac
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            int r2 = r40 + 1
            r0 = r0[r2]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r11.mListAnchors
            r4 = r3[r2]
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            r2 = r3[r2]
            int r2 = r2.getMargin()
            r3 = 8
            r9.addGreaterThan(r0, r4, r2, r3)
        L_0x01ac:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r1.mWeightedMatchConstraintsWidgets
            if (r0 == 0) goto L_0x0252
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0252
            boolean r4 = r1.mHasUndefinedWeights
            if (r4 == 0) goto L_0x01c3
            boolean r4 = r1.mHasComplexMatchWeights
            if (r4 != 0) goto L_0x01c3
            int r4 = r1.mWidgetsMatchCount
            float r4 = (float) r4
            goto L_0x01c5
        L_0x01c3:
            r4 = r23
        L_0x01c5:
            r6 = 0
            r29 = r6
            r7 = r21
            r8 = 0
        L_0x01cb:
            if (r8 >= r2) goto L_0x0252
            java.lang.Object r14 = r0.get(r8)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r14 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r14
            float[] r15 = r14.mWeight
            r15 = r15[r39]
            int r16 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x01f6
            boolean r15 = r1.mHasComplexMatchWeights
            if (r15 == 0) goto L_0x01f2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r14 = r14.mListAnchors
            int r15 = r40 + 1
            r15 = r14[r15]
            androidx.constraintlayout.solver.SolverVariable r15 = r15.mSolverVariable
            r14 = r14[r40]
            androidx.constraintlayout.solver.SolverVariable r14 = r14.mSolverVariable
            r3 = 0
            r10 = 4
            r9.addEquality(r15, r14, r3, r10)
            r6 = r3
            goto L_0x020d
        L_0x01f2:
            r10 = 4
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01f7
        L_0x01f6:
            r10 = 4
        L_0x01f7:
            int r3 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0210
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r14.mListAnchors
            int r14 = r40 + 1
            r14 = r3[r14]
            androidx.constraintlayout.solver.SolverVariable r14 = r14.mSolverVariable
            r3 = r3[r40]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r6 = 0
            r15 = 8
            r9.addEquality(r14, r3, r6, r15)
        L_0x020d:
            r17 = r0
            goto L_0x0249
        L_0x0210:
            r6 = 0
            if (r7 == 0) goto L_0x0244
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r7.mListAnchors
            r7 = r3[r40]
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
            int r17 = r40 + 1
            r3 = r3[r17]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r14.mListAnchors
            r10 = r6[r40]
            androidx.constraintlayout.solver.SolverVariable r10 = r10.mSolverVariable
            r6 = r6[r17]
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            r17 = r0
            androidx.constraintlayout.solver.ArrayRow r0 = r38.createRow()
            r28 = r0
            r30 = r4
            r31 = r15
            r32 = r7
            r33 = r3
            r34 = r10
            r35 = r6
            r28.createRowEqualMatchDimensions(r29, r30, r31, r32, r33, r34, r35)
            r9.addConstraint(r0)
            goto L_0x0246
        L_0x0244:
            r17 = r0
        L_0x0246:
            r7 = r14
            r29 = r15
        L_0x0249:
            int r8 = r8 + 1
            r0 = r17
            r3 = 1
            r6 = 0
            r10 = 5
            goto L_0x01cb
        L_0x0252:
            if (r12 == 0) goto L_0x02a7
            if (r12 == r13) goto L_0x0258
            if (r5 == 0) goto L_0x02a7
        L_0x0258:
            r10 = r27
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r10.mListAnchors
            r0 = r0[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r11.mListAnchors
            int r2 = r40 + 1
            r1 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L_0x026c
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            r3 = r0
            goto L_0x026e
        L_0x026c:
            r3 = r21
        L_0x026e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mTarget
            if (r0 == 0) goto L_0x0276
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            r5 = r0
            goto L_0x0278
        L_0x0276:
            r5 = r21
        L_0x0278:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r13.mListAnchors
            r1 = r1[r2]
            if (r3 == 0) goto L_0x04c2
            if (r5 == 0) goto L_0x04c2
            r2 = r26
            if (r39 != 0) goto L_0x028b
            float r2 = r2.mHorizontalBiasPercent
            goto L_0x028d
        L_0x028b:
            float r2 = r2.mVerticalBiasPercent
        L_0x028d:
            r4 = r2
            int r6 = r0.getMargin()
            int r7 = r1.getMargin()
            androidx.constraintlayout.solver.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r8 = r1.mSolverVariable
            r10 = 7
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04c2
        L_0x02a7:
            r10 = r27
            if (r22 == 0) goto L_0x0397
            if (r12 == 0) goto L_0x0397
            int r0 = r1.mWidgetsMatchCount
            if (r0 <= 0) goto L_0x02b8
            int r1 = r1.mWidgetsCount
            if (r1 != r0) goto L_0x02b8
            r16 = 1
            goto L_0x02ba
        L_0x02b8:
            r16 = 0
        L_0x02ba:
            r14 = r12
            r15 = r14
        L_0x02bc:
            if (r14 == 0) goto L_0x04c2
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r14.mNextChainWidget
            r0 = r0[r39]
            r8 = r0
        L_0x02c3:
            if (r8 == 0) goto L_0x02d2
            int r0 = r8.getVisibility()
            r6 = 8
            if (r0 != r6) goto L_0x02d4
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r8.mNextChainWidget
            r8 = r0[r39]
            goto L_0x02c3
        L_0x02d2:
            r6 = 8
        L_0x02d4:
            if (r8 != 0) goto L_0x02dd
            if (r14 != r13) goto L_0x02d9
            goto L_0x02dd
        L_0x02d9:
            r17 = r8
            goto L_0x038a
        L_0x02dd:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r14.mListAnchors
            r0 = r0[r40]
            androidx.constraintlayout.solver.SolverVariable r1 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mTarget
            if (r2 == 0) goto L_0x02ea
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            goto L_0x02ec
        L_0x02ea:
            r2 = r21
        L_0x02ec:
            if (r15 == r14) goto L_0x02f7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r15.mListAnchors
            int r3 = r40 + 1
            r2 = r2[r3]
        L_0x02f4:
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            goto L_0x030a
        L_0x02f7:
            if (r14 != r12) goto L_0x030a
            if (r15 != r14) goto L_0x030a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r10.mListAnchors
            r3 = r2[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x0308
            r2 = r2[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            goto L_0x02f4
        L_0x0308:
            r2 = r21
        L_0x030a:
            int r0 = r0.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r14.mListAnchors
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.getMargin()
            if (r8 == 0) goto L_0x032c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r8.mListAnchors
            r5 = r5[r40]
            androidx.constraintlayout.solver.SolverVariable r7 = r5.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r14.mListAnchors
            r6 = r6[r4]
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            r36 = r7
            r7 = r6
            r6 = r36
            goto L_0x033f
        L_0x032c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r11.mListAnchors
            r5 = r5[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x0337
            androidx.constraintlayout.solver.SolverVariable r6 = r5.mSolverVariable
            goto L_0x0339
        L_0x0337:
            r6 = r21
        L_0x0339:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r14.mListAnchors
            r7 = r7[r4]
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
        L_0x033f:
            if (r5 == 0) goto L_0x0346
            int r5 = r5.getMargin()
            int r3 = r3 + r5
        L_0x0346:
            if (r15 == 0) goto L_0x0351
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r15.mListAnchors
            r5 = r5[r4]
            int r5 = r5.getMargin()
            int r0 = r0 + r5
        L_0x0351:
            if (r1 == 0) goto L_0x02d9
            if (r2 == 0) goto L_0x02d9
            if (r6 == 0) goto L_0x02d9
            if (r7 == 0) goto L_0x02d9
            if (r14 != r12) goto L_0x0363
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r40]
            int r0 = r0.getMargin()
        L_0x0363:
            r5 = r0
            if (r14 != r13) goto L_0x0371
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r4]
            int r0 = r0.getMargin()
            r17 = r0
            goto L_0x0373
        L_0x0371:
            r17 = r3
        L_0x0373:
            if (r16 == 0) goto L_0x0378
            r18 = 8
            goto L_0x037a
        L_0x0378:
            r18 = 5
        L_0x037a:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r17
            r17 = r8
            r8 = r18
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x038a:
            int r0 = r14.getVisibility()
            r8 = 8
            if (r0 == r8) goto L_0x0393
            r15 = r14
        L_0x0393:
            r14 = r17
            goto L_0x02bc
        L_0x0397:
            r8 = 8
            if (r25 == 0) goto L_0x04c2
            if (r12 == 0) goto L_0x04c2
            int r0 = r1.mWidgetsMatchCount
            if (r0 <= 0) goto L_0x03a8
            int r1 = r1.mWidgetsCount
            if (r1 != r0) goto L_0x03a8
            r16 = 1
            goto L_0x03aa
        L_0x03a8:
            r16 = 0
        L_0x03aa:
            r14 = r12
            r15 = r14
        L_0x03ac:
            if (r14 == 0) goto L_0x0464
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r14.mNextChainWidget
            r0 = r0[r39]
        L_0x03b2:
            if (r0 == 0) goto L_0x03bf
            int r1 = r0.getVisibility()
            if (r1 != r8) goto L_0x03bf
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r0.mNextChainWidget
            r0 = r0[r39]
            goto L_0x03b2
        L_0x03bf:
            if (r14 == r12) goto L_0x0451
            if (r14 == r13) goto L_0x0451
            if (r0 == 0) goto L_0x0451
            if (r0 != r13) goto L_0x03ca
            r7 = r21
            goto L_0x03cb
        L_0x03ca:
            r7 = r0
        L_0x03cb:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r14.mListAnchors
            r0 = r0[r40]
            androidx.constraintlayout.solver.SolverVariable r1 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mTarget
            if (r2 == 0) goto L_0x03d7
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
        L_0x03d7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r15.mListAnchors
            int r3 = r40 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            int r0 = r0.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r14.mListAnchors
            r4 = r4[r3]
            int r4 = r4.getMargin()
            if (r7 == 0) goto L_0x03fb
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r7.mListAnchors
            r5 = r5[r40]
            androidx.constraintlayout.solver.SolverVariable r6 = r5.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r5.mTarget
            if (r8 == 0) goto L_0x03f8
            goto L_0x040a
        L_0x03f8:
            r8 = r21
            goto L_0x040c
        L_0x03fb:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r13.mListAnchors
            r5 = r5[r40]
            if (r5 == 0) goto L_0x0404
            androidx.constraintlayout.solver.SolverVariable r6 = r5.mSolverVariable
            goto L_0x0406
        L_0x0404:
            r6 = r21
        L_0x0406:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r14.mListAnchors
            r8 = r8[r3]
        L_0x040a:
            androidx.constraintlayout.solver.SolverVariable r8 = r8.mSolverVariable
        L_0x040c:
            if (r5 == 0) goto L_0x0416
            int r5 = r5.getMargin()
            int r5 = r5 + r4
            r17 = r5
            goto L_0x0418
        L_0x0416:
            r17 = r4
        L_0x0418:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r15.mListAnchors
            r3 = r4[r3]
            int r3 = r3.getMargin()
            int r3 = r3 + r0
            if (r16 == 0) goto L_0x0426
            r18 = 8
            goto L_0x0428
        L_0x0426:
            r18 = 4
        L_0x0428:
            if (r1 == 0) goto L_0x0446
            if (r2 == 0) goto L_0x0446
            if (r6 == 0) goto L_0x0446
            if (r8 == 0) goto L_0x0446
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r5 = r6
            r19 = 4
            r6 = r8
            r20 = r7
            r7 = r17
            r17 = r15
            r15 = 8
            r8 = r18
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x044e
        L_0x0446:
            r20 = r7
            r17 = r15
            r15 = 8
            r19 = 4
        L_0x044e:
            r0 = r20
            goto L_0x0456
        L_0x0451:
            r17 = r15
            r19 = 4
            r15 = r8
        L_0x0456:
            int r1 = r14.getVisibility()
            if (r1 == r15) goto L_0x045d
            goto L_0x045f
        L_0x045d:
            r14 = r17
        L_0x045f:
            r8 = r15
            r15 = r14
            r14 = r0
            goto L_0x03ac
        L_0x0464:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r10.mListAnchors
            r1 = r1[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r13.mListAnchors
            int r3 = r40 + 1
            r10 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r11.mListAnchors
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r2.mTarget
            if (r1 == 0) goto L_0x04b1
            if (r12 == r13) goto L_0x048b
            androidx.constraintlayout.solver.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            int r0 = r0.getMargin()
            r15 = 5
            r9.addEquality(r2, r1, r0, r15)
            goto L_0x04b2
        L_0x048b:
            r15 = 5
            if (r14 == 0) goto L_0x04b2
            androidx.constraintlayout.solver.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r3 = r1.mSolverVariable
            int r4 = r0.getMargin()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.solver.SolverVariable r6 = r10.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r7 = r14.mSolverVariable
            int r8 = r10.getMargin()
            r16 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04b2
        L_0x04b1:
            r15 = 5
        L_0x04b2:
            if (r14 == 0) goto L_0x04c2
            if (r12 == r13) goto L_0x04c2
            androidx.constraintlayout.solver.SolverVariable r0 = r10.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r1 = r14.mSolverVariable
            int r2 = r10.getMargin()
            int r2 = -r2
            r9.addEquality(r0, r1, r2, r15)
        L_0x04c2:
            if (r22 != 0) goto L_0x04c6
            if (r25 == 0) goto L_0x051e
        L_0x04c6:
            if (r12 == 0) goto L_0x051e
            if (r12 == r13) goto L_0x051e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r1 = r0[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r13.mListAnchors
            int r3 = r40 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.mTarget
            if (r4 == 0) goto L_0x04db
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            goto L_0x04dd
        L_0x04db:
            r4 = r21
        L_0x04dd:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r2.mTarget
            if (r5 == 0) goto L_0x04e4
            androidx.constraintlayout.solver.SolverVariable r5 = r5.mSolverVariable
            goto L_0x04e6
        L_0x04e4:
            r5 = r21
        L_0x04e6:
            if (r11 == r13) goto L_0x04f6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r11.mListAnchors
            r5 = r5[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x04f4
            androidx.constraintlayout.solver.SolverVariable r5 = r5.mSolverVariable
            r21 = r5
        L_0x04f4:
            r5 = r21
        L_0x04f6:
            if (r12 != r13) goto L_0x04fc
            r1 = r0[r40]
            r2 = r0[r3]
        L_0x04fc:
            if (r4 == 0) goto L_0x051e
            if (r5 == 0) goto L_0x051e
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = r1.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r3]
            int r8 = r0.getMargin()
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r10 = r2.mSolverVariable
            r11 = 5
            r0 = r38
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r8
            r8 = r11
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x051e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Chain.applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem, int, int, androidx.constraintlayout.solver.widgets.ChainHead):void");
    }

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i2) {
        ChainHead[] chainHeadArr;
        int i3;
        int i4;
        if (i2 == 0) {
            i4 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            int i5 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            int i6 = i5;
            i3 = 2;
            i4 = i6;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            ChainHead chainHead = chainHeadArr[i7];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i2, i3, chainHead);
            }
        }
    }
}
