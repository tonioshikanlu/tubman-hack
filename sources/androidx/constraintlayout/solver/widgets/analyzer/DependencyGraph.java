package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.Barrier;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import b.e.a.a.a;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DependencyGraph {
    private static final boolean USE_GROUPS = true;
    private ConstraintWidgetContainer container;
    private ConstraintWidgetContainer mContainer;
    public ArrayList<RunGroup> mGroups = new ArrayList<>();
    private BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
    private BasicMeasure.Measurer mMeasurer = null;
    private boolean mNeedBuildGraph = true;
    private boolean mNeedRedoMeasures = true;
    private ArrayList<WidgetRun> mRuns = new ArrayList<>();
    private ArrayList<RunGroup> runGroups = new ArrayList<>();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        this.container = constraintWidgetContainer;
        this.mContainer = constraintWidgetContainer;
    }

    private void applyGroup(DependencyNode dependencyNode, int i2, int i3, DependencyNode dependencyNode2, ArrayList<RunGroup> arrayList, RunGroup runGroup) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun.runGroup == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            if (widgetRun != constraintWidgetContainer.horizontalRun && widgetRun != constraintWidgetContainer.verticalRun) {
                if (runGroup == null) {
                    runGroup = new RunGroup(widgetRun, i3);
                    arrayList.add(runGroup);
                }
                widgetRun.runGroup = runGroup;
                runGroup.add(widgetRun);
                for (Dependency next : widgetRun.start.dependencies) {
                    if (next instanceof DependencyNode) {
                        applyGroup((DependencyNode) next, i2, 0, dependencyNode2, arrayList, runGroup);
                    }
                }
                for (Dependency next2 : widgetRun.end.dependencies) {
                    if (next2 instanceof DependencyNode) {
                        applyGroup((DependencyNode) next2, i2, 1, dependencyNode2, arrayList, runGroup);
                    }
                }
                if (i2 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    for (Dependency next3 : ((VerticalWidgetRun) widgetRun).baseline.dependencies) {
                        if (next3 instanceof DependencyNode) {
                            applyGroup((DependencyNode) next3, i2, 2, dependencyNode2, arrayList, runGroup);
                        }
                    }
                }
                for (DependencyNode next4 : widgetRun.start.targets) {
                    if (next4 == dependencyNode2) {
                        runGroup.dual = true;
                    }
                    applyGroup(next4, i2, 0, dependencyNode2, arrayList, runGroup);
                }
                for (DependencyNode next5 : widgetRun.end.targets) {
                    if (next5 == dependencyNode2) {
                        runGroup.dual = true;
                    }
                    applyGroup(next5, i2, 1, dependencyNode2, arrayList, runGroup);
                }
                if (i2 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    for (DependencyNode applyGroup : ((VerticalWidgetRun) widgetRun).baseline.targets) {
                        applyGroup(applyGroup, i2, 2, dependencyNode2, arrayList, runGroup);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        if (r2.mMatchConstraintDefaultHeight == 0) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean basicMeasureWidgets(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r1 = r0.mChildren
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x026c
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r2.mListDimensionBehaviors
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.getVisibility()
            r7 = 8
            if (r6 != r7) goto L_0x0027
        L_0x0024:
            r2.measured = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.mMatchConstraintPercentWidth
            r11 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L_0x0036
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.mMatchConstraintDefaultWidth = r7
        L_0x0036:
            float r6 = r2.mMatchConstraintPercentHeight
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.mMatchConstraintDefaultHeight = r7
        L_0x0042:
            float r6 = r2.getDimensionRatio()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 3
            if (r6 <= 0) goto L_0x0077
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r9) goto L_0x0058
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r9) goto L_0x005b
        L_0x0058:
            r2.mMatchConstraintDefaultWidth = r8
            goto L_0x0077
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r9) goto L_0x0065
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r9) goto L_0x0068
        L_0x0065:
            r2.mMatchConstraintDefaultHeight = r8
            goto L_0x0077
        L_0x0068:
            if (r5 != r6) goto L_0x0077
            if (r4 != r6) goto L_0x0077
            int r6 = r2.mMatchConstraintDefaultWidth
            if (r6 != 0) goto L_0x0072
            r2.mMatchConstraintDefaultWidth = r8
        L_0x0072:
            int r6 = r2.mMatchConstraintDefaultHeight
            if (r6 != 0) goto L_0x0077
            goto L_0x0065
        L_0x0077:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008d
            int r9 = r2.mMatchConstraintDefaultWidth
            if (r9 != r10) goto L_0x008d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r2.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L_0x008b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r2.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 != 0) goto L_0x008d
        L_0x008b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x008d:
            r9 = r5
            if (r4 != r6) goto L_0x00a2
            int r5 = r2.mMatchConstraintDefaultHeight
            if (r5 != r10) goto L_0x00a2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r2.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x00a0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r2.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 != 0) goto L_0x00a2
        L_0x00a0:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x00a2:
            r12 = r4
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r4 = r2.horizontalRun
            r4.dimensionBehavior = r9
            int r5 = r2.mMatchConstraintDefaultWidth
            r4.matchConstraintsType = r5
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r4 = r2.verticalRun
            r4.dimensionBehavior = r12
            int r13 = r2.mMatchConstraintDefaultHeight
            r4.matchConstraintsType = r13
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r9 == r4) goto L_0x00bf
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 == r14) goto L_0x00bf
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 != r14) goto L_0x00cb
        L_0x00bf:
            if (r12 == r4) goto L_0x0218
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 == r14) goto L_0x0218
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cb
            goto L_0x0218
        L_0x00cb:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r6) goto L_0x0148
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d7
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 != r11) goto L_0x0148
        L_0x00d7:
            if (r5 != r8) goto L_0x00f7
            if (r12 != r15) goto L_0x00e5
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.measure(r5, r6, r7, r8, r9)
        L_0x00e5:
            int r9 = r2.getHeight()
            float r3 = (float) r9
            float r4 = r2.mDimensionRatio
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
        L_0x00ef:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
        L_0x00f1:
            r4 = r16
            r5 = r2
            r6 = r8
            goto L_0x0251
        L_0x00f7:
            if (r5 != r10) goto L_0x010f
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r2 = r2.getWidth()
        L_0x010b:
            r3.wrapValue = r2
            goto L_0x0008
        L_0x010f:
            if (r5 != r7) goto L_0x0131
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r0.mListDimensionBehaviors
            r15 = r11[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r15 == r7) goto L_0x011d
            r11 = r11[r3]
            if (r11 != r4) goto L_0x0148
        L_0x011d:
            float r3 = r2.mMatchConstraintPercentWidth
            int r4 = r17.getWidth()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            int r9 = r2.getHeight()
            r4 = r16
            r5 = r2
            r6 = r7
            r7 = r3
            goto L_0x0145
        L_0x0131:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r2.mListAnchors
            r11 = r7[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 == 0) goto L_0x013f
            r7 = r7[r10]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 != 0) goto L_0x0148
        L_0x013f:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
        L_0x0145:
            r8 = r12
            goto L_0x0251
        L_0x0148:
            if (r12 != r6) goto L_0x01c1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 == r11) goto L_0x0152
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 != r7) goto L_0x01c1
        L_0x0152:
            if (r13 != r8) goto L_0x0177
            if (r9 != r11) goto L_0x0160
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.measure(r5, r6, r7, r8, r9)
        L_0x0160:
            int r7 = r2.getWidth()
            float r3 = r2.mDimensionRatio
            int r4 = r2.getDimensionRatioSide()
            r5 = -1
            if (r4 != r5) goto L_0x0171
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x0171:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00ef
        L_0x0177:
            if (r13 != r10) goto L_0x0186
            r7 = 0
            r3 = 0
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            r4.measure(r5, r6, r7, r8, r9)
            goto L_0x020e
        L_0x0186:
            r7 = 2
            if (r13 != r7) goto L_0x01ab
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r0.mListDimensionBehaviors
            r8 = r7[r10]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 == r11) goto L_0x0195
            r7 = r7[r10]
            if (r7 != r4) goto L_0x01c1
        L_0x0195:
            float r3 = r2.mMatchConstraintPercentHeight
            int r7 = r2.getWidth()
            int r4 = r17.getHeight()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            goto L_0x0251
        L_0x01ab:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r2.mListAnchors
            r7 = 2
            r15 = r4[r7]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r15.mTarget
            if (r7 == 0) goto L_0x01ba
            r4 = r4[r8]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 != 0) goto L_0x01c1
        L_0x01ba:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            goto L_0x0145
        L_0x01c1:
            if (r9 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x01f9
            if (r13 != r10) goto L_0x01ca
            goto L_0x01f9
        L_0x01ca:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.mListDimensionBehaviors
            r5 = r4[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 == r8) goto L_0x01db
            r3 = r4[r3]
            if (r3 != r8) goto L_0x0008
        L_0x01db:
            r3 = r4[r10]
            if (r3 == r8) goto L_0x01e3
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
        L_0x01e3:
            float r3 = r2.mMatchConstraintPercentWidth
            float r4 = r2.mMatchConstraintPercentHeight
            int r5 = r17.getWidth()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.getHeight()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f1
        L_0x01f9:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.wrapValue = r4
        L_0x020e:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r2 = r2.getHeight()
            goto L_0x010b
        L_0x0218:
            int r3 = r2.getWidth()
            if (r9 != r4) goto L_0x0231
            int r3 = r17.getWidth()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r2.mLeft
            int r5 = r5.mMargin
            int r3 = r3 - r5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r2.mRight
            int r5 = r5.mMargin
            int r3 = r3 - r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7 = r3
            r6 = r5
            goto L_0x0233
        L_0x0231:
            r7 = r3
            r6 = r9
        L_0x0233:
            int r3 = r2.getHeight()
            if (r12 != r4) goto L_0x024c
            int r3 = r17.getHeight()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r2.mTop
            int r4 = r4.mMargin
            int r3 = r3 - r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r2.mBottom
            int r4 = r4.mMargin
            int r3 = r3 - r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r9 = r3
            r8 = r4
            goto L_0x024e
        L_0x024c:
            r9 = r3
            r8 = r12
        L_0x024e:
            r4 = r16
            r5 = r2
        L_0x0251:
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.resolve(r4)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getHeight()
            r3.resolve(r4)
            goto L_0x0024
        L_0x026c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph.basicMeasureWidgets(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer):boolean");
    }

    private int computeWrap(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
        int size = this.mGroups.size();
        long j2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j2 = Math.max(j2, this.mGroups.get(i3).computeWrapSize(constraintWidgetContainer, i2));
        }
        return (int) j2;
    }

    private void displayGraph() {
        Iterator<WidgetRun> it = this.mRuns.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = generateDisplayGraph(it.next(), str);
        }
        String m2 = a.m(str, "\n}\n");
        PrintStream printStream = System.out;
        printStream.println("content:<<\n" + m2 + "\n>>");
    }

    private void findGroup(WidgetRun widgetRun, int i2, ArrayList<RunGroup> arrayList) {
        for (Dependency next : widgetRun.start.dependencies) {
            if (next instanceof DependencyNode) {
                applyGroup((DependencyNode) next, i2, 0, widgetRun.end, arrayList, (RunGroup) null);
            } else if (next instanceof WidgetRun) {
                applyGroup(((WidgetRun) next).start, i2, 0, widgetRun.end, arrayList, (RunGroup) null);
            }
        }
        for (Dependency next2 : widgetRun.end.dependencies) {
            if (next2 instanceof DependencyNode) {
                applyGroup((DependencyNode) next2, i2, 1, widgetRun.start, arrayList, (RunGroup) null);
            } else if (next2 instanceof WidgetRun) {
                applyGroup(((WidgetRun) next2).end, i2, 1, widgetRun.start, arrayList, (RunGroup) null);
            }
        }
        if (i2 == 1) {
            for (Dependency next3 : ((VerticalWidgetRun) widgetRun).baseline.dependencies) {
                if (next3 instanceof DependencyNode) {
                    applyGroup((DependencyNode) next3, i2, 2, (DependencyNode) null, arrayList, (RunGroup) null);
                }
            }
        }
    }

    private String generateChainDisplayGraph(ChainRun chainRun, String str) {
        int i2 = chainRun.orientation;
        StringBuilder y = a.y("cluster_");
        y.append(chainRun.widget.getDebugName());
        String sb = y.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb);
        sb2.append(i2 == 0 ? "_h" : "_v");
        String n2 = a.n("subgraph ", sb2.toString(), " {\n");
        Iterator<WidgetRun> it = chainRun.widgets.iterator();
        String str2 = "";
        while (it.hasNext()) {
            WidgetRun next = it.next();
            String debugName = next.widget.getDebugName();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(debugName);
            sb3.append(i2 == 0 ? "_HORIZONTAL" : "_VERTICAL");
            n2 = a.n(n2, sb3.toString(), ";\n");
            str2 = generateDisplayGraph(next, str2);
        }
        return a.n(str, str2, a.m(n2, "}\n"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (r9.widget.getDimensionRatio() > 0.0f) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0112, code lost:
        if (r9.widget.getDimensionRatio() > 0.0f) goto L_0x0114;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String generateDisplayGraph(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r9, java.lang.String r10) {
        /*
            r8 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r9.end
            boolean r2 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences
            if (r2 != 0) goto L_0x0028
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r2 = r0.dependencies
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0028
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r2 = r1.dependencies
            boolean r2 = r2.isEmpty()
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0028
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r1.targets
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0028
            return r10
        L_0x0028:
            java.lang.StringBuilder r10 = b.e.a.a.a.y(r10)
            java.lang.String r2 = r8.nodeDefinition(r9)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            boolean r2 = r8.isCenteredConnection(r0, r1)
            java.lang.String r10 = r8.generateDisplayNode(r0, r2, r10)
            java.lang.String r10 = r8.generateDisplayNode(r1, r2, r10)
            boolean r3 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            if (r3 == 0) goto L_0x0050
            r4 = r9
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r4 = (androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) r4
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r4.baseline
            java.lang.String r10 = r8.generateDisplayNode(r4, r2, r10)
        L_0x0050:
            boolean r2 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun
            r4 = 0
            java.lang.String r5 = " -> "
            java.lang.String r6 = "\n"
            if (r2 != 0) goto L_0x00f7
            boolean r2 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            if (r2 == 0) goto L_0x0066
            r7 = r9
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.ChainRun) r7
            int r7 = r7.orientation
            if (r7 != 0) goto L_0x0066
            goto L_0x00f7
        L_0x0066:
            if (r3 != 0) goto L_0x0072
            if (r2 == 0) goto L_0x0181
            r2 = r9
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r2 = (androidx.constraintlayout.solver.widgets.analyzer.ChainRun) r2
            int r2 = r2.orientation
            r3 = 1
            if (r2 != r3) goto L_0x0181
        L_0x0072:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r2 == r3) goto L_0x0091
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x0081
            goto L_0x0091
        L_0x0081:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r0) goto L_0x0181
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r9.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0181
            goto L_0x0114
        L_0x0091:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r0.targets
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00c4
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r1.targets
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00c4
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r6)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x017d
        L_0x00c4:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r0.targets
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0181
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r1.targets
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0181
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r6)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r1.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x017d
        L_0x00f7:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r2 == r3) goto L_0x011a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x0106
            goto L_0x011a
        L_0x0106:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r0) goto L_0x0181
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r9.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0181
        L_0x0114:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r9.widget
            r0.getDebugName()
            goto L_0x0181
        L_0x011a:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r0.targets
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x014c
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r1.targets
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x014c
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r6)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x017d
        L_0x014c:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r0.targets
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0181
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r1.targets
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0181
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r6)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r1.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x017d:
            java.lang.String r10 = b.e.a.a.a.q(r1, r10, r0)
        L_0x0181:
            boolean r0 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            if (r0 == 0) goto L_0x018c
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r9 = (androidx.constraintlayout.solver.widgets.analyzer.ChainRun) r9
            java.lang.String r9 = r8.generateChainDisplayGraph(r9, r10)
            return r9
        L_0x018c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph.generateDisplayGraph(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, java.lang.String):java.lang.String");
    }

    private String generateDisplayNode(DependencyNode dependencyNode, boolean z, String str) {
        for (DependencyNode name : dependencyNode.targets) {
            StringBuilder y = a.y("\n");
            y.append(dependencyNode.name());
            StringBuilder B = a.B(y.toString(), " -> ");
            B.append(name.name());
            String sb = B.toString();
            if (dependencyNode.margin > 0 || z || (dependencyNode.run instanceof HelperReferences)) {
                String m2 = a.m(sb, "[");
                if (dependencyNode.margin > 0) {
                    m2 = a.o(a.B(m2, "label=\""), dependencyNode.margin, "\"");
                    if (z) {
                        m2 = a.m(m2, ",");
                    }
                }
                if (z) {
                    m2 = a.m(m2, " style=dashed ");
                }
                if (dependencyNode.run instanceof HelperReferences) {
                    m2 = a.m(m2, " style=bold,color=gray ");
                }
                sb = a.m(m2, "]");
            }
            str = a.m(str, a.m(sb, "\n"));
        }
        return str;
    }

    private boolean isCenteredConnection(DependencyNode dependencyNode, DependencyNode dependencyNode2) {
        int i2 = 0;
        for (DependencyNode dependencyNode3 : dependencyNode.targets) {
            if (dependencyNode3 != dependencyNode2) {
                i2++;
            }
        }
        int i3 = 0;
        for (DependencyNode dependencyNode4 : dependencyNode2.targets) {
            if (dependencyNode4 != dependencyNode) {
                i3++;
            }
        }
        return i2 > 0 && i3 > 0;
    }

    private void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
        BasicMeasure.Measure measure = this.mMeasure;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i2;
        measure.verticalDimension = i3;
        this.mMeasurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String nodeDefinition(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.widget
            java.lang.String r1 = r1.getDebugName()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            if (r0 != 0) goto L_0x0011
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.getHorizontalDimensionBehaviour()
            goto L_0x0015
        L_0x0011:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.getVerticalDimensionBehaviour()
        L_0x0015:
            androidx.constraintlayout.solver.widgets.analyzer.RunGroup r3 = r10.runGroup
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            if (r0 != 0) goto L_0x0024
            java.lang.String r5 = "_HORIZONTAL"
            goto L_0x0026
        L_0x0024:
            java.lang.String r5 = "_VERTICAL"
        L_0x0026:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = " [shape=none, label=<"
            java.lang.String r4 = b.e.a.a.a.m(r4, r5)
            java.lang.String r5 = "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">"
            java.lang.String r4 = b.e.a.a.a.m(r4, r5)
            java.lang.String r5 = "  <TR>"
            java.lang.String r4 = b.e.a.a.a.m(r4, r5)
            java.lang.String r5 = " BGCOLOR=\"green\""
            java.lang.String r6 = "    <TD "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r4 = b.e.a.a.a.q(r7, r4, r6)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r10.start
            boolean r7 = r7.resolved
            if (r0 != 0) goto L_0x005f
            if (r7 == 0) goto L_0x0058
            java.lang.String r4 = b.e.a.a.a.m(r4, r5)
        L_0x0058:
            java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
            java.lang.String r7 = " PORT=\"LEFT\" BORDER=\"1\">L</TD>"
            goto L_0x006b
        L_0x005f:
            if (r7 == 0) goto L_0x0065
            java.lang.String r4 = b.e.a.a.a.m(r4, r5)
        L_0x0065:
            java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
            java.lang.String r7 = " PORT=\"TOP\" BORDER=\"1\">T</TD>"
        L_0x006b:
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "    <TD BORDER=\"1\" "
            java.lang.String r4 = b.e.a.a.a.m(r4, r7)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r10.dimension
            boolean r7 = r7.resolved
            if (r7 == 0) goto L_0x008b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r10.widget
            boolean r8 = r8.measured
            if (r8 != 0) goto L_0x008b
            java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
            java.lang.String r7 = " BGCOLOR=\"green\" "
            goto L_0x00a8
        L_0x008b:
            if (r7 == 0) goto L_0x009a
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r10.widget
            boolean r8 = r8.measured
            if (r8 == 0) goto L_0x009a
            java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
            java.lang.String r7 = " BGCOLOR=\"lightgray\" "
            goto L_0x00a8
        L_0x009a:
            if (r7 != 0) goto L_0x00af
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r10.widget
            boolean r7 = r7.measured
            if (r7 == 0) goto L_0x00af
            java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
            java.lang.String r7 = " BGCOLOR=\"yellow\" "
        L_0x00a8:
            r4.append(r7)
            java.lang.String r4 = r4.toString()
        L_0x00af:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r7) goto L_0x00b9
            java.lang.String r2 = "style=\"dashed\""
            java.lang.String r4 = b.e.a.a.a.m(r4, r2)
        L_0x00b9:
            if (r3 == 0) goto L_0x00d6
            java.lang.String r2 = " ["
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            int r3 = r3.groupIndex
            int r3 = r3 + 1
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            int r3 = androidx.constraintlayout.solver.widgets.analyzer.RunGroup.index
            java.lang.String r7 = "]"
            java.lang.String r2 = b.e.a.a.a.o(r2, r3, r7)
            goto L_0x00d8
        L_0x00d6:
            java.lang.String r2 = ""
        L_0x00d8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = ">"
            r3.append(r4)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = " </TD>"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r0 != 0) goto L_0x010b
            java.lang.String r0 = b.e.a.a.a.m(r1, r6)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r10.end
            boolean r10 = r10.resolved
            if (r10 == 0) goto L_0x0104
            java.lang.String r0 = b.e.a.a.a.m(r0, r5)
        L_0x0104:
            java.lang.StringBuilder r10 = b.e.a.a.a.y(r0)
            java.lang.String r0 = " PORT=\"RIGHT\" BORDER=\"1\">R</TD>"
            goto L_0x013a
        L_0x010b:
            java.lang.String r0 = b.e.a.a.a.m(r1, r6)
            boolean r1 = r10 instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            if (r1 == 0) goto L_0x0120
            r1 = r10
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.baseline
            boolean r1 = r1.resolved
            if (r1 == 0) goto L_0x0120
            java.lang.String r0 = b.e.a.a.a.m(r0, r5)
        L_0x0120:
            java.lang.String r1 = " PORT=\"BASELINE\" BORDER=\"1\">b</TD>"
            java.lang.String r0 = b.e.a.a.a.m(r0, r1)
            java.lang.String r0 = b.e.a.a.a.m(r0, r6)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r10.end
            boolean r10 = r10.resolved
            if (r10 == 0) goto L_0x0134
            java.lang.String r0 = b.e.a.a.a.m(r0, r5)
        L_0x0134:
            java.lang.StringBuilder r10 = b.e.a.a.a.y(r0)
            java.lang.String r0 = " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>"
        L_0x013a:
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "  </TR></TABLE>"
            java.lang.String r10 = b.e.a.a.a.m(r10, r0)
            java.lang.String r0 = ">];\n"
            java.lang.String r10 = b.e.a.a.a.m(r10, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph.nodeDefinition(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun):java.lang.String");
    }

    public void buildGraph() {
        buildGraph(this.mRuns);
        this.mGroups.clear();
        RunGroup.index = 0;
        findGroup(this.container.horizontalRun, 0, this.mGroups);
        findGroup(this.container.verticalRun, 1, this.mGroups);
        this.mNeedBuildGraph = false;
    }

    public void buildGraph(ArrayList<WidgetRun> arrayList) {
        Object helperReferences;
        arrayList.clear();
        this.mContainer.horizontalRun.clear();
        this.mContainer.verticalRun.clear();
        arrayList.add(this.mContainer.horizontalRun);
        arrayList.add(this.mContainer.verticalRun);
        Iterator<ConstraintWidget> it = this.mContainer.mChildren.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof Guideline) {
                helperReferences = new GuidelineReference(next);
            } else {
                if (next.isInHorizontalChain()) {
                    if (next.horizontalChainRun == null) {
                        next.horizontalChainRun = new ChainRun(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.horizontalChainRun);
                } else {
                    arrayList.add(next.horizontalRun);
                }
                if (next.isInVerticalChain()) {
                    if (next.verticalChainRun == null) {
                        next.verticalChainRun = new ChainRun(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.verticalChainRun);
                } else {
                    arrayList.add(next.verticalRun);
                }
                if (next instanceof HelperWidget) {
                    helperReferences = new HelperReferences(next);
                }
            }
            arrayList.add(helperReferences);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.widget != this.mContainer) {
                next2.apply();
            }
        }
    }

    public void defineTerminalWidgets(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        if (this.mNeedBuildGraph) {
            buildGraph();
            Iterator<ConstraintWidget> it = this.container.mChildren.iterator();
            boolean z = false;
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                boolean[] zArr = next.isTerminalWidget;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof Barrier) {
                    z = true;
                }
            }
            if (!z) {
                Iterator<RunGroup> it2 = this.mGroups.iterator();
                while (it2.hasNext()) {
                    RunGroup next2 = it2.next();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    next2.defineTerminalWidgets(dimensionBehaviour == dimensionBehaviour3, dimensionBehaviour2 == dimensionBehaviour3);
                }
            }
        }
    }

    public boolean directMeasure(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.mNeedBuildGraph || this.mNeedRedoMeasures) {
            Iterator<ConstraintWidget> it = this.container.mChildren.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                next.horizontalRun.reset();
                next.verticalRun.reset();
            }
            this.container.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            constraintWidgetContainer.measured = false;
            constraintWidgetContainer.horizontalRun.reset();
            this.container.verticalRun.reset();
            this.mNeedRedoMeasures = false;
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.container.setX(0);
        this.container.setY(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.container.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.container.getDimensionBehaviour(1);
        if (this.mNeedBuildGraph) {
            buildGraph();
        }
        int x = this.container.getX();
        int y = this.container.getY();
        this.container.horizontalRun.start.resolve(x);
        this.container.verticalRun.start.resolve(y);
        measureWidgets();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour3 || dimensionBehaviour2 == dimensionBehaviour3) {
            if (z4) {
                Iterator<WidgetRun> it2 = this.mRuns.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().supportsWrapComputation()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer2 = this.container;
                constraintWidgetContainer2.setWidth(computeWrap(constraintWidgetContainer2, 0));
                ConstraintWidgetContainer constraintWidgetContainer3 = this.container;
                constraintWidgetContainer3.horizontalRun.dimension.resolve(constraintWidgetContainer3.getWidth());
            }
            if (z4 && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer4 = this.container;
                constraintWidgetContainer4.setHeight(computeWrap(constraintWidgetContainer4, 1));
                ConstraintWidgetContainer constraintWidgetContainer5 = this.container;
                constraintWidgetContainer5.verticalRun.dimension.resolve(constraintWidgetContainer5.getHeight());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.container;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer6.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int width = constraintWidgetContainer6.getWidth() + x;
            this.container.horizontalRun.end.resolve(width);
            this.container.horizontalRun.dimension.resolve(width - x);
            measureWidgets();
            ConstraintWidgetContainer constraintWidgetContainer7 = this.container;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidgetContainer7.mListDimensionBehaviors;
            if (dimensionBehaviourArr2[1] == dimensionBehaviour5 || dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer7.getHeight() + y;
                this.container.verticalRun.end.resolve(height);
                this.container.verticalRun.dimension.resolve(height - y);
            }
            measureWidgets();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<WidgetRun> it3 = this.mRuns.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.widget != this.container || next2.resolved) {
                next2.applyToWidget();
            }
        }
        Iterator<WidgetRun> it4 = this.mRuns.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            WidgetRun next3 = it4.next();
            if ((z2 || next3.widget != this.container) && (!next3.start.resolved || ((!next3.end.resolved && !(next3 instanceof GuidelineReference)) || (!next3.dimension.resolved && !(next3 instanceof ChainRun) && !(next3 instanceof GuidelineReference))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.container.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.container.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    public boolean directMeasureSetup(boolean z) {
        if (this.mNeedBuildGraph) {
            Iterator<ConstraintWidget> it = this.container.mChildren.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                HorizontalWidgetRun horizontalWidgetRun = next.horizontalRun;
                horizontalWidgetRun.dimension.resolved = false;
                horizontalWidgetRun.resolved = false;
                horizontalWidgetRun.reset();
                VerticalWidgetRun verticalWidgetRun = next.verticalRun;
                verticalWidgetRun.dimension.resolved = false;
                verticalWidgetRun.resolved = false;
                verticalWidgetRun.reset();
            }
            this.container.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            constraintWidgetContainer.measured = false;
            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidgetContainer.horizontalRun;
            horizontalWidgetRun2.dimension.resolved = false;
            horizontalWidgetRun2.resolved = false;
            horizontalWidgetRun2.reset();
            VerticalWidgetRun verticalWidgetRun2 = this.container.verticalRun;
            verticalWidgetRun2.dimension.resolved = false;
            verticalWidgetRun2.resolved = false;
            verticalWidgetRun2.reset();
            buildGraph();
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.container.setX(0);
        this.container.setY(0);
        this.container.horizontalRun.start.resolve(0);
        this.container.verticalRun.start.resolve(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013e A[EDGE_INSN: B:78:0x013e->B:64:0x013e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean directMeasureWithOrientation(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r9.container
            r2 = 0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.getDimensionBehaviour(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getDimensionBehaviour(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r9.container
            int r4 = r4.getX()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r9.container
            int r5 = r5.getY()
            if (r10 == 0) goto L_0x0086
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0086
        L_0x0023:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r6 = r9.mRuns
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r7
            int r8 = r7.orientation
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.supportsWrapComputation()
            if (r7 != 0) goto L_0x0029
            r10 = r2
        L_0x0040:
            if (r11 != 0) goto L_0x0063
            if (r10 == 0) goto L_0x0086
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r10) goto L_0x0086
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setHorizontalDimensionBehaviour(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r2)
            r10.setWidth(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r6 = r10.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10.getWidth()
            goto L_0x0083
        L_0x0063:
            if (r10 == 0) goto L_0x0086
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r10) goto L_0x0086
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setVerticalDimensionBehaviour(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r0)
            r10.setHeight(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r6 = r10.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10.getHeight()
        L_0x0083:
            r6.resolve(r10)
        L_0x0086:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            if (r11 != 0) goto L_0x00b1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r10.mListDimensionBehaviors
            r6 = r5[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto L_0x0098
            r5 = r5[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r6) goto L_0x00c0
        L_0x0098:
            int r10 = r10.getWidth()
            int r10 = r10 + r4
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r5.end
            r5.resolve(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r5 = r5.dimension
            int r10 = r10 - r4
            r5.resolve(r10)
            goto L_0x00da
        L_0x00b1:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r10.mListDimensionBehaviors
            r6 = r4[r0]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto L_0x00c2
            r4 = r4[r0]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r4 != r6) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r10 = r2
            goto L_0x00db
        L_0x00c2:
            int r10 = r10.getHeight()
            int r10 = r10 + r5
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r4.end
            r4.resolve(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r4 = r4.dimension
            int r10 = r10 - r5
            r4.resolve(r10)
        L_0x00da:
            r10 = r0
        L_0x00db:
            r9.measureWidgets()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        L_0x00e4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0104
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r5
            int r6 = r5.orientation
            if (r6 == r11) goto L_0x00f5
            goto L_0x00e4
        L_0x00f5:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L_0x0100
            boolean r6 = r5.resolved
            if (r6 != 0) goto L_0x0100
            goto L_0x00e4
        L_0x0100:
            r5.applyToWidget()
            goto L_0x00e4
        L_0x0104:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        L_0x010a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r5
            int r6 = r5.orientation
            if (r6 == r11) goto L_0x011b
            goto L_0x010a
        L_0x011b:
            if (r10 != 0) goto L_0x0124
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L_0x0124
            goto L_0x010a
        L_0x0124:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r5.start
            boolean r6 = r6.resolved
            if (r6 != 0) goto L_0x012c
        L_0x012a:
            r0 = r2
            goto L_0x013e
        L_0x012c:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r5.end
            boolean r6 = r6.resolved
            if (r6 != 0) goto L_0x0133
            goto L_0x012a
        L_0x0133:
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            if (r6 != 0) goto L_0x010a
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r5 = r5.dimension
            boolean r5 = r5.resolved
            if (r5 != 0) goto L_0x010a
            goto L_0x012a
        L_0x013e:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setHorizontalDimensionBehaviour(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setVerticalDimensionBehaviour(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph.directMeasureWithOrientation(boolean, int):boolean");
    }

    public void invalidateGraph() {
        this.mNeedBuildGraph = true;
    }

    public void invalidateMeasures() {
        this.mNeedRedoMeasures = true;
    }

    public void measureWidgets() {
        DimensionDependency dimensionDependency;
        DimensionDependency dimensionDependency2;
        int width;
        DimensionDependency dimensionDependency3;
        int width2;
        Iterator<ConstraintWidget> it = this.container.mChildren.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.measured) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.mListDimensionBehaviors;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i2 = next.mMatchConstraintDefaultWidth;
                int i3 = next.mMatchConstraintDefaultHeight;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i3 == 1)) {
                    z = true;
                }
                DimensionDependency dimensionDependency4 = next.horizontalRun.dimension;
                boolean z3 = dimensionDependency4.resolved;
                DimensionDependency dimensionDependency5 = next.verticalRun.dimension;
                boolean z4 = dimensionDependency5.resolved;
                if (!z3 || !z4) {
                    if (!z3 || !z) {
                        if (z4 && z2) {
                            measure(next, dimensionBehaviour3, dimensionDependency4.value, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency5.value);
                            if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                dimensionDependency3 = next.horizontalRun.dimension;
                                width2 = next.getWidth();
                            } else {
                                dimensionDependency2 = next.horizontalRun.dimension;
                                width = next.getWidth();
                                dimensionDependency2.resolve(width);
                            }
                        }
                        if (next.measured && (dimensionDependency = next.verticalRun.baselineDimension) != null) {
                            dimensionDependency.resolve(next.getBaselineDistance());
                        }
                    } else {
                        measure(next, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency4.value, dimensionBehaviour3, dimensionDependency5.value);
                        if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            dimensionDependency3 = next.verticalRun.dimension;
                            width2 = next.getHeight();
                        } else {
                            dimensionDependency2 = next.verticalRun.dimension;
                            width = next.getHeight();
                            dimensionDependency2.resolve(width);
                        }
                    }
                    dimensionDependency3.wrapValue = width2;
                    dimensionDependency.resolve(next.getBaselineDistance());
                } else {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    measure(next, dimensionBehaviour4, dimensionDependency4.value, dimensionBehaviour4, dimensionDependency5.value);
                }
                next.measured = true;
                dimensionDependency.resolve(next.getBaselineDistance());
            }
        }
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
    }
}
