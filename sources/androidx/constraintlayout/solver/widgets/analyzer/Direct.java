package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.Barrier;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;

public class Direct {
    private static final boolean APPLY_MATCH_PARENT = false;
    private static final boolean DEBUG = false;
    private static BasicMeasure.Measure measure = new BasicMeasure.Measure();

    private static boolean canMeasure(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = constraintWidget.getVerticalDimensionBehaviour();
        ConstraintWidgetContainer constraintWidgetContainer = constraintWidget.getParent() != null ? (ConstraintWidgetContainer) constraintWidget.getParent() : null;
        if (constraintWidgetContainer != null) {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = constraintWidgetContainer.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (constraintWidgetContainer != null) {
            ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour2 = constraintWidgetContainer.getVerticalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = horizontalDimensionBehaviour == dimensionBehaviour3 || horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0 && constraintWidget.mDimensionRatio == 0.0f && constraintWidget.hasDanglingDimension(0)) || constraintWidget.isResolvedHorizontally();
        boolean z2 = verticalDimensionBehaviour == dimensionBehaviour3 || verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0 && constraintWidget.mDimensionRatio == 0.0f && constraintWidget.hasDanglingDimension(1)) || constraintWidget.isResolvedVertically();
        if (constraintWidget.mDimensionRatio <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        r10 = r9.mRight.mTarget;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        r5 = r9.mLeft.mTarget;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void horizontalSolvingPass(androidx.constraintlayout.solver.widgets.ConstraintWidget r13, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer r14) {
        /*
            boolean r0 = r13 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            r1 = 0
            if (r0 != 0) goto L_0x0019
            boolean r0 = r13.isMeasureRequested()
            if (r0 == 0) goto L_0x0019
            boolean r0 = canMeasure(r13)
            if (r0 == 0) goto L_0x0019
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer.measure(r13, r14, r0, r1)
        L_0x0019:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.getAnchor(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r13.getAnchor(r2)
            int r3 = r0.getFinalValue()
            int r4 = r2.getFinalValue()
            java.util.HashSet r5 = r0.getDependents()
            r6 = 0
            r7 = 1
            r8 = 8
            if (r5 == 0) goto L_0x0118
            boolean r5 = r0.hasFinalValue()
            if (r5 == 0) goto L_0x0118
            java.util.HashSet r0 = r0.getDependents()
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0118
            java.lang.Object r5 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r5.mOwner
            boolean r10 = canMeasure(r9)
            boolean r11 = r9.isMeasureRequested()
            if (r11 == 0) goto L_0x0067
            if (r10 == 0) goto L_0x0067
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r11 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure
            r11.<init>()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer.measure(r9, r14, r11, r1)
        L_0x0067:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x00c5
            if (r10 == 0) goto L_0x0072
            goto L_0x00c5
        L_0x0072:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = r9.getHorizontalDimensionBehaviour()
            if (r10 != r12) goto L_0x0045
            int r10 = r9.getVisibility()
            if (r10 == r8) goto L_0x008a
            int r10 = r9.mMatchConstraintDefaultWidth
            if (r10 != 0) goto L_0x0045
            float r10 = r9.getDimensionRatio()
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0045
        L_0x008a:
            boolean r10 = r9.isInHorizontalChain()
            if (r10 != 0) goto L_0x0045
            boolean r10 = r9.isInVirtualLayout()
            if (r10 != 0) goto L_0x0045
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.mLeft
            if (r5 != r10) goto L_0x00a6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.mTarget
            if (r10 == 0) goto L_0x00a6
            boolean r10 = r10.hasFinalValue()
            if (r10 != 0) goto L_0x00b6
        L_0x00a6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.mRight
            if (r5 != r10) goto L_0x00b8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r9.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x00b8
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L_0x00b8
        L_0x00b6:
            r5 = r7
            goto L_0x00b9
        L_0x00b8:
            r5 = r1
        L_0x00b9:
            if (r5 == 0) goto L_0x0045
            boolean r5 = r9.isInHorizontalChain()
            if (r5 != 0) goto L_0x0045
            solveHorizontalMatchConstraint(r13, r14, r9)
            goto L_0x0045
        L_0x00c5:
            boolean r10 = r9.isMeasureRequested()
            if (r10 == 0) goto L_0x00cd
            goto L_0x0045
        L_0x00cd:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.mLeft
            if (r5 != r10) goto L_0x00e9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 != 0) goto L_0x00e9
            int r5 = r10.getMargin()
            int r5 = r5 + r3
            int r10 = r9.getWidth()
            int r10 = r10 + r5
            r9.setFinalHorizontal(r5, r10)
        L_0x00e4:
            horizontalSolvingPass(r9, r14)
            goto L_0x0045
        L_0x00e9:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.mRight
            if (r5 != r11) goto L_0x0101
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r10.mTarget
            if (r12 != 0) goto L_0x0101
            int r5 = r11.getMargin()
            int r5 = r3 - r5
            int r10 = r9.getWidth()
            int r10 = r5 - r10
            r9.setFinalHorizontal(r10, r5)
            goto L_0x00e4
        L_0x0101:
            if (r5 != r10) goto L_0x0045
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r11.mTarget
            if (r5 == 0) goto L_0x0045
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L_0x0045
            boolean r5 = r9.isInHorizontalChain()
            if (r5 != 0) goto L_0x0045
            solveHorizontalCenterConstraints(r14, r9)
            goto L_0x0045
        L_0x0118:
            boolean r0 = r13 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r0 == 0) goto L_0x011d
            return
        L_0x011d:
            java.util.HashSet r0 = r2.getDependents()
            if (r0 == 0) goto L_0x01fa
            boolean r0 = r2.hasFinalValue()
            if (r0 == 0) goto L_0x01fa
            java.util.HashSet r0 = r2.getDependents()
            java.util.Iterator r0 = r0.iterator()
        L_0x0131:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01fa
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r2.mOwner
            boolean r5 = canMeasure(r3)
            boolean r9 = r3.isMeasureRequested()
            if (r9 == 0) goto L_0x0153
            if (r5 == 0) goto L_0x0153
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r9 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure
            r9.<init>()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer.measure(r3, r14, r9, r1)
        L_0x0153:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.mLeft
            if (r2 != r9) goto L_0x0163
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L_0x0163
            boolean r9 = r9.hasFinalValue()
            if (r9 != 0) goto L_0x0173
        L_0x0163:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.mRight
            if (r2 != r9) goto L_0x0175
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L_0x0175
            boolean r9 = r9.hasFinalValue()
            if (r9 == 0) goto L_0x0175
        L_0x0173:
            r9 = r7
            goto L_0x0176
        L_0x0175:
            r9 = r1
        L_0x0176:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = r3.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x01b1
            if (r5 == 0) goto L_0x0181
            goto L_0x01b1
        L_0x0181:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r3.getHorizontalDimensionBehaviour()
            if (r2 != r11) goto L_0x0131
            int r2 = r3.getVisibility()
            if (r2 == r8) goto L_0x0199
            int r2 = r3.mMatchConstraintDefaultWidth
            if (r2 != 0) goto L_0x0131
            float r2 = r3.getDimensionRatio()
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0131
        L_0x0199:
            boolean r2 = r3.isInHorizontalChain()
            if (r2 != 0) goto L_0x0131
            boolean r2 = r3.isInVirtualLayout()
            if (r2 != 0) goto L_0x0131
            if (r9 == 0) goto L_0x0131
            boolean r2 = r3.isInHorizontalChain()
            if (r2 != 0) goto L_0x0131
            solveHorizontalMatchConstraint(r13, r14, r3)
            goto L_0x0131
        L_0x01b1:
            boolean r5 = r3.isMeasureRequested()
            if (r5 == 0) goto L_0x01b9
            goto L_0x0131
        L_0x01b9:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r3.mLeft
            if (r2 != r5) goto L_0x01d5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.mTarget
            if (r10 != 0) goto L_0x01d5
            int r2 = r5.getMargin()
            int r2 = r2 + r4
            int r5 = r3.getWidth()
            int r5 = r5 + r2
            r3.setFinalHorizontal(r2, r5)
        L_0x01d0:
            horizontalSolvingPass(r3, r14)
            goto L_0x0131
        L_0x01d5:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mRight
            if (r2 != r10) goto L_0x01ed
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r5.mTarget
            if (r2 != 0) goto L_0x01ed
            int r2 = r10.getMargin()
            int r2 = r4 - r2
            int r5 = r3.getWidth()
            int r5 = r2 - r5
            r3.setFinalHorizontal(r5, r2)
            goto L_0x01d0
        L_0x01ed:
            if (r9 == 0) goto L_0x0131
            boolean r2 = r3.isInHorizontalChain()
            if (r2 != 0) goto L_0x0131
            solveHorizontalCenterConstraints(r14, r3)
            goto L_0x0131
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.Direct.horizontalSolvingPass(androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer):void");
    }

    private static void solveBarrier(Barrier barrier, BasicMeasure.Measurer measurer, int i2) {
        if (!barrier.allSolved()) {
            return;
        }
        if (i2 == 0) {
            horizontalSolvingPass(barrier, measurer);
        } else {
            verticalSolvingPass(barrier, measurer);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01cf, code lost:
        if (r5[r21].mTarget.mOwner == r1) goto L_0x01d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean solveChain(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r18, androidx.constraintlayout.solver.LinearSystem r19, int r20, int r21, androidx.constraintlayout.solver.widgets.ChainHead r22, boolean r23, boolean r24, boolean r25) {
        /*
            r0 = 0
            if (r25 == 0) goto L_0x0004
            return r0
        L_0x0004:
            if (r20 != 0) goto L_0x000d
            boolean r1 = r18.isResolvedHorizontally()
            if (r1 != 0) goto L_0x0014
            return r0
        L_0x000d:
            boolean r1 = r18.isResolvedVertically()
            if (r1 != 0) goto L_0x0014
            return r0
        L_0x0014:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r22.getFirst()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r22.getLast()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r22.getFirstVisibleWidget()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r22.getLastVisibleWidget()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r22.getHead()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r1.mListAnchors
            r6 = r6[r21]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            int r7 = r21 + 1
            r2 = r2[r7]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r6.mTarget
            if (r8 == 0) goto L_0x0225
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r2.mTarget
            if (r9 != 0) goto L_0x003c
            goto L_0x0225
        L_0x003c:
            boolean r8 = r8.hasFinalValue()
            if (r8 == 0) goto L_0x0225
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.mTarget
            boolean r8 = r8.hasFinalValue()
            if (r8 != 0) goto L_0x004c
            goto L_0x0225
        L_0x004c:
            if (r3 == 0) goto L_0x0225
            if (r4 != 0) goto L_0x0052
            goto L_0x0225
        L_0x0052:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            int r6 = r6.getFinalValue()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r3.mListAnchors
            r8 = r8[r21]
            int r8 = r8.getMargin()
            int r8 = r8 + r6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            int r2 = r2.getFinalValue()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r4.mListAnchors
            r6 = r6[r7]
            int r6 = r6.getMargin()
            int r2 = r2 - r6
            int r6 = r2 - r8
            if (r6 > 0) goto L_0x0075
            return r0
        L_0x0075:
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r9 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure
            r9.<init>()
            r10 = r0
            r11 = r10
            r13 = r11
            r14 = r13
            r12 = r1
        L_0x007f:
            r16 = 0
            if (r10 != 0) goto L_0x00f7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r15 = r12.mListAnchors
            r15 = r15[r21]
            boolean r15 = canMeasure(r12)
            if (r15 != 0) goto L_0x008e
            return r0
        L_0x008e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r15 = r12.mListDimensionBehaviors
            r15 = r15[r20]
            r17 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r1) goto L_0x0099
            return r0
        L_0x0099:
            boolean r1 = r12.isMeasureRequested()
            if (r1 == 0) goto L_0x00a6
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r1 = r18.getMeasurer()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer.measure(r12, r1, r9, r0)
        L_0x00a6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r12.mListAnchors
            r1 = r1[r21]
            int r1 = r1.getMargin()
            int r1 = r1 + r14
            if (r20 != 0) goto L_0x00b6
            int r14 = r12.getWidth()
            goto L_0x00ba
        L_0x00b6:
            int r14 = r12.getHeight()
        L_0x00ba:
            int r14 = r14 + r1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r12.mListAnchors
            r1 = r1[r7]
            int r1 = r1.getMargin()
            int r14 = r14 + r1
            int r13 = r13 + 1
            int r1 = r12.getVisibility()
            r15 = 8
            if (r1 == r15) goto L_0x00d0
            int r11 = r11 + 1
        L_0x00d0:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r12.mListAnchors
            r1 = r1[r7]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x00ed
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r15 = r1.mListAnchors
            r0 = r15[r21]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L_0x00ed
            r0 = r15[r21]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mOwner
            if (r0 == r12) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            r16 = r1
        L_0x00ed:
            if (r16 == 0) goto L_0x00f2
            r12 = r16
            goto L_0x00f3
        L_0x00f2:
            r10 = 1
        L_0x00f3:
            r1 = r17
            r0 = 0
            goto L_0x007f
        L_0x00f7:
            r17 = r1
            r0 = 0
            if (r11 != 0) goto L_0x00fd
            return r0
        L_0x00fd:
            if (r11 == r13) goto L_0x0100
            return r0
        L_0x0100:
            if (r6 >= r14) goto L_0x0103
            return r0
        L_0x0103:
            int r6 = r6 - r14
            r0 = 2
            if (r23 == 0) goto L_0x010c
            int r1 = r11 + 1
            int r6 = r6 / r1
        L_0x010a:
            r1 = 1
            goto L_0x0113
        L_0x010c:
            if (r24 == 0) goto L_0x010a
            if (r11 <= r0) goto L_0x010a
            int r6 = r6 / r11
            r1 = 1
            int r6 = r6 - r1
        L_0x0113:
            if (r11 != r1) goto L_0x0144
            if (r20 != 0) goto L_0x011c
            float r0 = r5.getHorizontalBiasPercent()
            goto L_0x0120
        L_0x011c:
            float r0 = r5.getVerticalBiasPercent()
        L_0x0120:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = (float) r8
            float r2 = r2 + r1
            float r1 = (float) r6
            float r1 = r1 * r0
            float r1 = r1 + r2
            int r0 = (int) r1
            if (r20 != 0) goto L_0x0133
            int r1 = r3.getWidth()
            int r1 = r1 + r0
            r3.setFinalHorizontal(r0, r1)
            goto L_0x013b
        L_0x0133:
            int r1 = r3.getHeight()
            int r1 = r1 + r0
            r3.setFinalVertical(r0, r1)
        L_0x013b:
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r0 = r18.getMeasurer()
            horizontalSolvingPass(r3, r0)
            r0 = 1
            return r0
        L_0x0144:
            if (r23 == 0) goto L_0x01db
            int r8 = r8 + r6
            r1 = r17
            r0 = 0
        L_0x014a:
            if (r0 != 0) goto L_0x0224
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r1.mListAnchors
            r2 = r2[r21]
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 != r3) goto L_0x0173
            if (r20 != 0) goto L_0x0165
            r1.setFinalHorizontal(r8, r8)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r2 = r18.getMeasurer()
            horizontalSolvingPass(r1, r2)
            goto L_0x016f
        L_0x0165:
            r1.setFinalVertical(r8, r8)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r2 = r18.getMeasurer()
            verticalSolvingPass(r1, r2)
        L_0x016f:
            r2 = r19
            r4 = 0
            goto L_0x01b4
        L_0x0173:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r1.mListAnchors
            r2 = r2[r21]
            int r2 = r2.getMargin()
            int r2 = r2 + r8
            if (r20 != 0) goto L_0x0192
            int r4 = r1.getWidth()
            int r4 = r4 + r2
            r1.setFinalHorizontal(r2, r4)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r4 = r18.getMeasurer()
            horizontalSolvingPass(r1, r4)
            int r4 = r1.getWidth()
            goto L_0x01a5
        L_0x0192:
            int r4 = r1.getHeight()
            int r4 = r4 + r2
            r1.setFinalVertical(r2, r4)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r4 = r18.getMeasurer()
            verticalSolvingPass(r1, r4)
            int r4 = r1.getHeight()
        L_0x01a5:
            int r4 = r4 + r2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r1.mListAnchors
            r2 = r2[r7]
            int r2 = r2.getMargin()
            int r2 = r2 + r4
            int r2 = r2 + r6
            r8 = r2
            r4 = 0
            r2 = r19
        L_0x01b4:
            r1.addToSolver(r2, r4)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r1.mListAnchors
            r4 = r4[r7]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L_0x01d1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r4.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r4.mListAnchors
            r9 = r5[r21]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L_0x01d1
            r5 = r5[r21]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.mOwner
            if (r5 == r1) goto L_0x01d3
        L_0x01d1:
            r4 = r16
        L_0x01d3:
            if (r4 == 0) goto L_0x01d8
            r1 = r4
            goto L_0x014a
        L_0x01d8:
            r0 = 1
            goto L_0x014a
        L_0x01db:
            if (r24 == 0) goto L_0x0224
            if (r11 != r0) goto L_0x0222
            if (r20 != 0) goto L_0x0201
            int r0 = r3.getWidth()
            int r0 = r0 + r8
            r3.setFinalHorizontal(r8, r0)
            int r0 = r4.getWidth()
            int r0 = r2 - r0
            r4.setFinalHorizontal(r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r0 = r18.getMeasurer()
            horizontalSolvingPass(r3, r0)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r0 = r18.getMeasurer()
            horizontalSolvingPass(r4, r0)
            goto L_0x0220
        L_0x0201:
            int r0 = r3.getHeight()
            int r0 = r0 + r8
            r3.setFinalVertical(r8, r0)
            int r0 = r4.getHeight()
            int r0 = r2 - r0
            r4.setFinalVertical(r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r0 = r18.getMeasurer()
            verticalSolvingPass(r3, r0)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r0 = r18.getMeasurer()
            verticalSolvingPass(r4, r0)
        L_0x0220:
            r0 = 1
            return r0
        L_0x0222:
            r0 = 0
            return r0
        L_0x0224:
            r0 = 1
        L_0x0225:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.Direct.solveChain(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem, int, int, androidx.constraintlayout.solver.widgets.ChainHead, boolean, boolean, boolean):boolean");
    }

    private static void solveHorizontalCenterConstraints(BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget) {
        float horizontalBiasPercent = constraintWidget.getHorizontalBiasPercent();
        int finalValue = constraintWidget.mLeft.mTarget.getFinalValue();
        int finalValue2 = constraintWidget.mRight.mTarget.getFinalValue();
        int margin = constraintWidget.mLeft.getMargin() + finalValue;
        int margin2 = finalValue2 - constraintWidget.mRight.getMargin();
        if (finalValue == finalValue2) {
            horizontalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int width = constraintWidget.getWidth();
        int i2 = (finalValue2 - finalValue) - width;
        if (finalValue > finalValue2) {
            i2 = (finalValue - finalValue2) - width;
        }
        if (((ConstraintWidgetContainer) constraintWidget.getParent()).isRtl()) {
            horizontalBiasPercent = 1.0f - horizontalBiasPercent;
        }
        int i3 = ((int) ((horizontalBiasPercent * ((float) i2)) + 0.5f)) + finalValue;
        int i4 = i3 + width;
        if (finalValue > finalValue2) {
            i4 = i3 - width;
        }
        constraintWidget.setFinalHorizontal(i3, i4);
        horizontalSolvingPass(constraintWidget, measurer);
    }

    private static void solveHorizontalMatchConstraint(ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2) {
        float horizontalBiasPercent = constraintWidget2.getHorizontalBiasPercent();
        int margin = constraintWidget2.mLeft.getMargin() + constraintWidget2.mLeft.mTarget.getFinalValue();
        int finalValue = constraintWidget2.mRight.mTarget.getFinalValue() - constraintWidget2.mRight.getMargin();
        if (finalValue >= margin) {
            int width = constraintWidget2.getWidth();
            if (constraintWidget2.getVisibility() != 8) {
                int i2 = constraintWidget2.mMatchConstraintDefaultWidth;
                if (i2 == 2) {
                    if (!(constraintWidget instanceof ConstraintWidgetContainer)) {
                        constraintWidget = constraintWidget.getParent();
                    }
                    width = (int) (constraintWidget2.getHorizontalBiasPercent() * 0.5f * ((float) constraintWidget.getWidth()));
                } else if (i2 == 0) {
                    width = finalValue - margin;
                }
                width = Math.max(constraintWidget2.mMatchConstraintMinWidth, width);
                int i3 = constraintWidget2.mMatchConstraintMaxWidth;
                if (i3 > 0) {
                    width = Math.min(i3, width);
                }
            }
            int i4 = margin + ((int) ((horizontalBiasPercent * ((float) ((finalValue - margin) - width))) + 0.5f));
            constraintWidget2.setFinalHorizontal(i4, width + i4);
            horizontalSolvingPass(constraintWidget2, measurer);
        }
    }

    private static void solveVerticalCenterConstraints(BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget) {
        float verticalBiasPercent = constraintWidget.getVerticalBiasPercent();
        int finalValue = constraintWidget.mTop.mTarget.getFinalValue();
        int finalValue2 = constraintWidget.mBottom.mTarget.getFinalValue();
        int margin = constraintWidget.mTop.getMargin() + finalValue;
        int margin2 = finalValue2 - constraintWidget.mBottom.getMargin();
        if (finalValue == finalValue2) {
            verticalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int height = constraintWidget.getHeight();
        int i2 = (finalValue2 - finalValue) - height;
        if (finalValue > finalValue2) {
            i2 = (finalValue - finalValue2) - height;
        }
        int i3 = (int) ((verticalBiasPercent * ((float) i2)) + 0.5f);
        int i4 = finalValue + i3;
        int i5 = i4 + height;
        if (finalValue > finalValue2) {
            i4 = finalValue - i3;
            i5 = i4 - height;
        }
        constraintWidget.setFinalVertical(i4, i5);
        verticalSolvingPass(constraintWidget, measurer);
    }

    private static void solveVerticalMatchConstraint(ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2) {
        float verticalBiasPercent = constraintWidget2.getVerticalBiasPercent();
        int margin = constraintWidget2.mTop.getMargin() + constraintWidget2.mTop.mTarget.getFinalValue();
        int finalValue = constraintWidget2.mBottom.mTarget.getFinalValue() - constraintWidget2.mBottom.getMargin();
        if (finalValue >= margin) {
            int height = constraintWidget2.getHeight();
            if (constraintWidget2.getVisibility() != 8) {
                int i2 = constraintWidget2.mMatchConstraintDefaultHeight;
                if (i2 == 2) {
                    if (!(constraintWidget instanceof ConstraintWidgetContainer)) {
                        constraintWidget = constraintWidget.getParent();
                    }
                    height = (int) (verticalBiasPercent * 0.5f * ((float) constraintWidget.getHeight()));
                } else if (i2 == 0) {
                    height = finalValue - margin;
                }
                height = Math.max(constraintWidget2.mMatchConstraintMinHeight, height);
                int i3 = constraintWidget2.mMatchConstraintMaxHeight;
                if (i3 > 0) {
                    height = Math.min(i3, height);
                }
            }
            int i4 = margin + ((int) ((verticalBiasPercent * ((float) ((finalValue - margin) - height))) + 0.5f));
            constraintWidget2.setFinalVertical(i4, height + i4);
            verticalSolvingPass(constraintWidget2, measurer);
        }
    }

    public static void solvingPass(ConstraintWidgetContainer constraintWidgetContainer, BasicMeasure.Measurer measurer) {
        int relativePercent;
        int relativePercent2;
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidgetContainer.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = constraintWidgetContainer.getVerticalDimensionBehaviour();
        constraintWidgetContainer.resetFinalResolution();
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        for (int i2 = 0; i2 < size; i2++) {
            children.get(i2).resetFinalResolution();
        }
        if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
            constraintWidgetContainer.setFinalHorizontal(0, constraintWidgetContainer.getWidth());
        } else {
            constraintWidgetContainer.setFinalLeft(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget = children.get(i3);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    if (guideline.getRelativeBegin() != -1) {
                        relativePercent2 = guideline.getRelativeBegin();
                    } else if (guideline.getRelativeEnd() == -1 || !constraintWidgetContainer.isResolvedHorizontally()) {
                        if (constraintWidgetContainer.isResolvedHorizontally()) {
                            relativePercent2 = (int) ((guideline.getRelativePercent() * ((float) constraintWidgetContainer.getWidth())) + 0.5f);
                        }
                        z = true;
                    } else {
                        relativePercent2 = constraintWidgetContainer.getWidth() - guideline.getRelativeEnd();
                    }
                    guideline.setFinalValue(relativePercent2);
                    z = true;
                }
            } else if ((constraintWidget instanceof Barrier) && ((Barrier) constraintWidget).getOrientation() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget2 = children.get(i4);
                if (constraintWidget2 instanceof Guideline) {
                    Guideline guideline2 = (Guideline) constraintWidget2;
                    if (guideline2.getOrientation() == 1) {
                        horizontalSolvingPass(guideline2, measurer);
                    }
                }
            }
        }
        horizontalSolvingPass(constraintWidgetContainer, measurer);
        if (z2) {
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget3 = children.get(i5);
                if (constraintWidget3 instanceof Barrier) {
                    Barrier barrier = (Barrier) constraintWidget3;
                    if (barrier.getOrientation() == 0) {
                        solveBarrier(barrier, measurer, 0);
                    }
                }
            }
        }
        if (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
            constraintWidgetContainer.setFinalVertical(0, constraintWidgetContainer.getHeight());
        } else {
            constraintWidgetContainer.setFinalTop(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            ConstraintWidget constraintWidget4 = children.get(i6);
            if (constraintWidget4 instanceof Guideline) {
                Guideline guideline3 = (Guideline) constraintWidget4;
                if (guideline3.getOrientation() == 0) {
                    if (guideline3.getRelativeBegin() != -1) {
                        relativePercent = guideline3.getRelativeBegin();
                    } else if (guideline3.getRelativeEnd() == -1 || !constraintWidgetContainer.isResolvedVertically()) {
                        if (constraintWidgetContainer.isResolvedVertically()) {
                            relativePercent = (int) ((guideline3.getRelativePercent() * ((float) constraintWidgetContainer.getHeight())) + 0.5f);
                        }
                        z3 = true;
                    } else {
                        relativePercent = constraintWidgetContainer.getHeight() - guideline3.getRelativeEnd();
                    }
                    guideline3.setFinalValue(relativePercent);
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof Barrier) && ((Barrier) constraintWidget4).getOrientation() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget5 = children.get(i7);
                if (constraintWidget5 instanceof Guideline) {
                    Guideline guideline4 = (Guideline) constraintWidget5;
                    if (guideline4.getOrientation() == 0) {
                        verticalSolvingPass(guideline4, measurer);
                    }
                }
            }
        }
        verticalSolvingPass(constraintWidgetContainer, measurer);
        if (z4) {
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget6 = children.get(i8);
                if (constraintWidget6 instanceof Barrier) {
                    Barrier barrier2 = (Barrier) constraintWidget6;
                    if (barrier2.getOrientation() == 1) {
                        solveBarrier(barrier2, measurer, 1);
                    }
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            ConstraintWidget constraintWidget7 = children.get(i9);
            if (constraintWidget7.isMeasureRequested() && canMeasure(constraintWidget7)) {
                ConstraintWidgetContainer.measure(constraintWidget7, measurer, measure, false);
                horizontalSolvingPass(constraintWidget7, measurer);
                verticalSolvingPass(constraintWidget7, measurer);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        r10 = r9.mBottom.mTarget;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        r5 = r9.mTop.mTarget;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void verticalSolvingPass(androidx.constraintlayout.solver.widgets.ConstraintWidget r13, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer r14) {
        /*
            boolean r0 = r13 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            r1 = 0
            if (r0 != 0) goto L_0x0019
            boolean r0 = r13.isMeasureRequested()
            if (r0 == 0) goto L_0x0019
            boolean r0 = canMeasure(r13)
            if (r0 == 0) goto L_0x0019
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer.measure(r13, r14, r0, r1)
        L_0x0019:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.getAnchor(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r13.getAnchor(r2)
            int r3 = r0.getFinalValue()
            int r4 = r2.getFinalValue()
            java.util.HashSet r5 = r0.getDependents()
            r6 = 0
            r7 = 1
            r8 = 8
            if (r5 == 0) goto L_0x0112
            boolean r5 = r0.hasFinalValue()
            if (r5 == 0) goto L_0x0112
            java.util.HashSet r0 = r0.getDependents()
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0112
            java.lang.Object r5 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r5.mOwner
            boolean r10 = canMeasure(r9)
            boolean r11 = r9.isMeasureRequested()
            if (r11 == 0) goto L_0x0067
            if (r10 == 0) goto L_0x0067
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r11 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure
            r11.<init>()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer.measure(r9, r14, r11, r1)
        L_0x0067:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x00c5
            if (r10 == 0) goto L_0x0072
            goto L_0x00c5
        L_0x0072:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = r9.getVerticalDimensionBehaviour()
            if (r10 != r12) goto L_0x0045
            int r10 = r9.getVisibility()
            if (r10 == r8) goto L_0x008a
            int r10 = r9.mMatchConstraintDefaultHeight
            if (r10 != 0) goto L_0x0045
            float r10 = r9.getDimensionRatio()
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0045
        L_0x008a:
            boolean r10 = r9.isInVerticalChain()
            if (r10 != 0) goto L_0x0045
            boolean r10 = r9.isInVirtualLayout()
            if (r10 != 0) goto L_0x0045
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.mTop
            if (r5 != r10) goto L_0x00a6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.mTarget
            if (r10 == 0) goto L_0x00a6
            boolean r10 = r10.hasFinalValue()
            if (r10 != 0) goto L_0x00b6
        L_0x00a6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.mBottom
            if (r5 != r10) goto L_0x00b8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r9.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x00b8
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L_0x00b8
        L_0x00b6:
            r5 = r7
            goto L_0x00b9
        L_0x00b8:
            r5 = r1
        L_0x00b9:
            if (r5 == 0) goto L_0x0045
            boolean r5 = r9.isInVerticalChain()
            if (r5 != 0) goto L_0x0045
            solveVerticalMatchConstraint(r13, r14, r9)
            goto L_0x0045
        L_0x00c5:
            boolean r10 = r9.isMeasureRequested()
            if (r10 == 0) goto L_0x00cd
            goto L_0x0045
        L_0x00cd:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.mTop
            if (r5 != r10) goto L_0x00e9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 != 0) goto L_0x00e9
            int r5 = r10.getMargin()
            int r5 = r5 + r3
            int r10 = r9.getHeight()
            int r10 = r10 + r5
            r9.setFinalVertical(r5, r10)
        L_0x00e4:
            verticalSolvingPass(r9, r14)
            goto L_0x0045
        L_0x00e9:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.mBottom
            if (r5 != r11) goto L_0x0101
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r11.mTarget
            if (r12 != 0) goto L_0x0101
            int r5 = r11.getMargin()
            int r5 = r3 - r5
            int r10 = r9.getHeight()
            int r10 = r5 - r10
            r9.setFinalVertical(r10, r5)
            goto L_0x00e4
        L_0x0101:
            if (r5 != r10) goto L_0x0045
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r11.mTarget
            if (r5 == 0) goto L_0x0045
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L_0x0045
            solveVerticalCenterConstraints(r14, r9)
            goto L_0x0045
        L_0x0112:
            boolean r0 = r13 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r0 == 0) goto L_0x0117
            return
        L_0x0117:
            java.util.HashSet r0 = r2.getDependents()
            if (r0 == 0) goto L_0x01f4
            boolean r0 = r2.hasFinalValue()
            if (r0 == 0) goto L_0x01f4
            java.util.HashSet r0 = r2.getDependents()
            java.util.Iterator r0 = r0.iterator()
        L_0x012b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01f4
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r2.mOwner
            boolean r5 = canMeasure(r3)
            boolean r9 = r3.isMeasureRequested()
            if (r9 == 0) goto L_0x014d
            if (r5 == 0) goto L_0x014d
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r9 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure
            r9.<init>()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer.measure(r3, r14, r9, r1)
        L_0x014d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.mTop
            if (r2 != r9) goto L_0x015d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L_0x015d
            boolean r9 = r9.hasFinalValue()
            if (r9 != 0) goto L_0x016d
        L_0x015d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.mBottom
            if (r2 != r9) goto L_0x016f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L_0x016f
            boolean r9 = r9.hasFinalValue()
            if (r9 == 0) goto L_0x016f
        L_0x016d:
            r9 = r7
            goto L_0x0170
        L_0x016f:
            r9 = r1
        L_0x0170:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = r3.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x01ab
            if (r5 == 0) goto L_0x017b
            goto L_0x01ab
        L_0x017b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r3.getVerticalDimensionBehaviour()
            if (r2 != r11) goto L_0x012b
            int r2 = r3.getVisibility()
            if (r2 == r8) goto L_0x0193
            int r2 = r3.mMatchConstraintDefaultHeight
            if (r2 != 0) goto L_0x012b
            float r2 = r3.getDimensionRatio()
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x012b
        L_0x0193:
            boolean r2 = r3.isInVerticalChain()
            if (r2 != 0) goto L_0x012b
            boolean r2 = r3.isInVirtualLayout()
            if (r2 != 0) goto L_0x012b
            if (r9 == 0) goto L_0x012b
            boolean r2 = r3.isInVerticalChain()
            if (r2 != 0) goto L_0x012b
            solveVerticalMatchConstraint(r13, r14, r3)
            goto L_0x012b
        L_0x01ab:
            boolean r5 = r3.isMeasureRequested()
            if (r5 == 0) goto L_0x01b3
            goto L_0x012b
        L_0x01b3:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r3.mTop
            if (r2 != r5) goto L_0x01cf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.mTarget
            if (r10 != 0) goto L_0x01cf
            int r2 = r5.getMargin()
            int r2 = r2 + r4
            int r5 = r3.getHeight()
            int r5 = r5 + r2
            r3.setFinalVertical(r2, r5)
        L_0x01ca:
            verticalSolvingPass(r3, r14)
            goto L_0x012b
        L_0x01cf:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mBottom
            if (r2 != r10) goto L_0x01e7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r5.mTarget
            if (r2 != 0) goto L_0x01e7
            int r2 = r10.getMargin()
            int r2 = r4 - r2
            int r5 = r3.getHeight()
            int r5 = r2 - r5
            r3.setFinalVertical(r5, r2)
            goto L_0x01ca
        L_0x01e7:
            if (r9 == 0) goto L_0x012b
            boolean r2 = r3.isInVerticalChain()
            if (r2 != 0) goto L_0x012b
            solveVerticalCenterConstraints(r14, r3)
            goto L_0x012b
        L_0x01f4:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r13.getAnchor(r0)
            java.util.HashSet r0 = r13.getDependents()
            if (r0 == 0) goto L_0x0250
            boolean r0 = r13.hasFinalValue()
            if (r0 == 0) goto L_0x0250
            int r0 = r13.getFinalValue()
            java.util.HashSet r13 = r13.getDependents()
            java.util.Iterator r13 = r13.iterator()
        L_0x0212:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0250
            java.lang.Object r2 = r13.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r2.mOwner
            boolean r4 = canMeasure(r3)
            boolean r5 = r3.isMeasureRequested()
            if (r5 == 0) goto L_0x0234
            if (r4 == 0) goto L_0x0234
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r5 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure
            r5.<init>()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer.measure(r3, r14, r5, r1)
        L_0x0234:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = r3.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x023e
            if (r4 == 0) goto L_0x0212
        L_0x023e:
            boolean r4 = r3.isMeasureRequested()
            if (r4 == 0) goto L_0x0245
            goto L_0x0212
        L_0x0245:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mBaseline
            if (r2 != r4) goto L_0x0212
            r3.setFinalBaseline(r0)
            verticalSolvingPass(r3, r14)
            goto L_0x0212
        L_0x0250:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.Direct.verticalSolvingPass(androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer):void");
    }
}
