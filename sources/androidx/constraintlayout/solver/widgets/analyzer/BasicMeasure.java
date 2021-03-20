package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.constraintlayout.solver.widgets.VirtualLayout;
import java.util.ArrayList;

public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private ConstraintWidgetContainer constraintWidgetContainer;
    private Measure mMeasure = new Measure();
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>();

    public static class Measure {
        public ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public boolean useCurrentDimensions;
        public ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget constraintWidget, Measure measure);
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer2) {
        this.constraintWidgetContainer = constraintWidgetContainer2;
    }

    private boolean measure(Measurer measurer, ConstraintWidget constraintWidget, boolean z) {
        this.mMeasure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.mMeasure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.mMeasure.horizontalDimension = constraintWidget.getWidth();
        this.mMeasure.verticalDimension = constraintWidget.getHeight();
        Measure measure = this.mMeasure;
        measure.measuredNeedsSolverPass = false;
        measure.useCurrentDimensions = z;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = dimensionBehaviour == dimensionBehaviour2;
        boolean z3 = measure.verticalBehavior == dimensionBehaviour2;
        boolean z4 = z2 && constraintWidget.mDimensionRatio > 0.0f;
        boolean z5 = z3 && constraintWidget.mDimensionRatio > 0.0f;
        if (z4 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z5 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
        Measure measure2 = this.mMeasure;
        measure2.useCurrentDimensions = false;
        return measure2.measuredNeedsSolverPass;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        if (r5.isInHorizontalChain() == false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void measureChildren(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r13) {
        /*
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r13.mChildren
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.optimizeFor(r1)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r2 = r13.getMeasurer()
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r4 >= r0) goto L_0x00a1
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r5 = r13.mChildren
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r6 == 0) goto L_0x0022
            goto L_0x009d
        L_0x0022:
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r6 == 0) goto L_0x0028
            goto L_0x009d
        L_0x0028:
            boolean r6 = r5.isInVirtualLayout()
            if (r6 == 0) goto L_0x0030
            goto L_0x009d
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r6 = r5.horizontalRun
            if (r6 == 0) goto L_0x0047
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r7 = r5.verticalRun
            if (r7 == 0) goto L_0x0047
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r6 = r6.dimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L_0x0047
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r6 = r7.dimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L_0x0047
            goto L_0x009d
        L_0x0047:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.getDimensionBehaviour(r3)
            r7 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.getDimensionBehaviour(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.mMatchConstraintDefaultWidth
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.mMatchConstraintDefaultHeight
            if (r10 == r7) goto L_0x0060
            r10 = r7
            goto L_0x0061
        L_0x0060:
            r10 = r3
        L_0x0061:
            if (r10 != 0) goto L_0x008b
            boolean r11 = r13.optimizeFor(r7)
            if (r11 == 0) goto L_0x008b
            boolean r11 = r5 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout
            if (r11 != 0) goto L_0x008b
            if (r6 != r9) goto L_0x007c
            int r11 = r5.mMatchConstraintDefaultWidth
            if (r11 != 0) goto L_0x007c
            if (r8 == r9) goto L_0x007c
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L_0x007c
            r10 = r7
        L_0x007c:
            if (r8 != r9) goto L_0x008b
            int r8 = r5.mMatchConstraintDefaultHeight
            if (r8 != 0) goto L_0x008b
            if (r6 == r9) goto L_0x008b
            boolean r6 = r5.isInHorizontalChain()
            if (r6 != 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r7 = r10
        L_0x008c:
            if (r7 == 0) goto L_0x008f
            goto L_0x009d
        L_0x008f:
            r12.measure(r2, r5, r3)
            androidx.constraintlayout.solver.Metrics r5 = r13.mMetrics
            if (r5 == 0) goto L_0x009d
            long r6 = r5.measuredWidgets
            r8 = 1
            long r6 = r6 + r8
            r5.measuredWidgets = r6
        L_0x009d:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a1:
            r2.didMeasures()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.measureChildren(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer):void");
    }

    private void solveLinearSystem(ConstraintWidgetContainer constraintWidgetContainer2, String str, int i2, int i3) {
        int minWidth = constraintWidgetContainer2.getMinWidth();
        int minHeight = constraintWidgetContainer2.getMinHeight();
        constraintWidgetContainer2.setMinWidth(0);
        constraintWidgetContainer2.setMinHeight(0);
        constraintWidgetContainer2.setWidth(i2);
        constraintWidgetContainer2.setHeight(i3);
        constraintWidgetContainer2.setMinWidth(minWidth);
        constraintWidgetContainer2.setMinHeight(minHeight);
        this.constraintWidgetContainer.layout();
    }

    public long solverMeasure(ConstraintWidgetContainer constraintWidgetContainer2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        boolean z;
        int i12;
        boolean z2;
        boolean z3;
        boolean z4;
        int i13;
        Measurer measurer;
        boolean z5;
        int i14;
        int i15;
        int i16;
        boolean z6;
        boolean z7;
        Metrics metrics;
        ConstraintWidgetContainer constraintWidgetContainer3 = constraintWidgetContainer2;
        int i17 = i2;
        int i18 = i5;
        int i19 = i7;
        Measurer measurer2 = constraintWidgetContainer2.getMeasurer();
        int size = constraintWidgetContainer3.mChildren.size();
        int width = constraintWidgetContainer2.getWidth();
        int height = constraintWidgetContainer2.getHeight();
        boolean enabled = Optimizer.enabled(i17, 128);
        boolean z8 = enabled || Optimizer.enabled(i17, 64);
        if (z8) {
            int i20 = 0;
            while (true) {
                if (i20 >= size) {
                    break;
                }
                ConstraintWidget constraintWidget = constraintWidgetContainer3.mChildren.get(i20);
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z9 = (horizontalDimensionBehaviour == dimensionBehaviour) && (constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) && constraintWidget.getDimensionRatio() > 0.0f;
                if ((!constraintWidget.isInHorizontalChain() || !z9) && ((!constraintWidget.isInVerticalChain() || !z9) && !(constraintWidget instanceof VirtualLayout) && !constraintWidget.isInHorizontalChain() && !constraintWidget.isInVerticalChain())) {
                    i20++;
                }
            }
            z8 = false;
        }
        if (z8 && (metrics = LinearSystem.sMetrics) != null) {
            metrics.measures++;
        }
        boolean z10 = z8 & ((i18 == 1073741824 && i19 == 1073741824) || enabled);
        int i21 = 2;
        if (z10) {
            int min = Math.min(constraintWidgetContainer2.getMaxWidth(), i6);
            int min2 = Math.min(constraintWidgetContainer2.getMaxHeight(), i8);
            if (i18 == 1073741824 && constraintWidgetContainer2.getWidth() != min) {
                constraintWidgetContainer3.setWidth(min);
                constraintWidgetContainer2.invalidateGraph();
            }
            if (i19 == 1073741824 && constraintWidgetContainer2.getHeight() != min2) {
                constraintWidgetContainer3.setHeight(min2);
                constraintWidgetContainer2.invalidateGraph();
            }
            if (i18 == 1073741824 && i19 == 1073741824) {
                z = constraintWidgetContainer3.directMeasure(enabled);
                i11 = 2;
            } else {
                boolean directMeasureSetup = constraintWidgetContainer3.directMeasureSetup(enabled);
                if (i18 == 1073741824) {
                    z7 = directMeasureSetup & constraintWidgetContainer3.directMeasureWithOrientation(enabled, 0);
                    i11 = 1;
                } else {
                    z7 = directMeasureSetup;
                    i11 = 0;
                }
                if (i19 == 1073741824) {
                    z = constraintWidgetContainer3.directMeasureWithOrientation(enabled, 1) & z7;
                    i11++;
                } else {
                    z = z7;
                }
            }
            if (z) {
                constraintWidgetContainer3.updateFromRuns(i18 == 1073741824, i19 == 1073741824);
            }
        } else {
            z = false;
            i11 = 0;
        }
        if (z && i11 == 2) {
            return 0;
        }
        int optimizationLevel = constraintWidgetContainer2.getOptimizationLevel();
        if (size > 0) {
            measureChildren(constraintWidgetContainer2);
        }
        int size2 = this.mVariableDimensionsWidgets.size();
        if (size > 0) {
            solveLinearSystem(constraintWidgetContainer3, "First pass", width, height);
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = constraintWidgetContainer2.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z11 = horizontalDimensionBehaviour2 == dimensionBehaviour2;
            boolean z12 = constraintWidgetContainer2.getVerticalDimensionBehaviour() == dimensionBehaviour2;
            int max = Math.max(constraintWidgetContainer2.getWidth(), this.constraintWidgetContainer.getMinWidth());
            int max2 = Math.max(constraintWidgetContainer2.getHeight(), this.constraintWidgetContainer.getMinHeight());
            int i22 = 0;
            boolean z13 = false;
            while (i22 < size2) {
                ConstraintWidget constraintWidget2 = this.mVariableDimensionsWidgets.get(i22);
                if (!(constraintWidget2 instanceof VirtualLayout)) {
                    i14 = optimizationLevel;
                    i16 = width;
                    i15 = height;
                } else {
                    int width2 = constraintWidget2.getWidth();
                    i14 = optimizationLevel;
                    int height2 = constraintWidget2.getHeight();
                    i16 = width;
                    boolean measure = z13 | measure(measurer2, constraintWidget2, true);
                    Metrics metrics2 = constraintWidgetContainer3.mMetrics;
                    boolean z14 = measure;
                    i15 = height;
                    if (metrics2 != null) {
                        metrics2.measuredMatchWidgets++;
                    }
                    int width3 = constraintWidget2.getWidth();
                    int height3 = constraintWidget2.getHeight();
                    if (width3 != width2) {
                        constraintWidget2.setWidth(width3);
                        if (z11 && constraintWidget2.getRight() > max) {
                            max = Math.max(max, constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin() + constraintWidget2.getRight());
                        }
                        z6 = true;
                    } else {
                        z6 = z14;
                    }
                    if (height3 != height2) {
                        constraintWidget2.setHeight(height3);
                        if (z12 && constraintWidget2.getBottom() > max2) {
                            max2 = Math.max(max2, constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin() + constraintWidget2.getBottom());
                        }
                        z6 = true;
                    }
                    z13 = z6 | ((VirtualLayout) constraintWidget2).needSolverPass();
                }
                i22++;
                optimizationLevel = i14;
                width = i16;
                height = i15;
                i21 = 2;
            }
            int i23 = optimizationLevel;
            int i24 = width;
            int i25 = height;
            int i26 = i21;
            int i27 = 0;
            while (i27 < i26) {
                int i28 = 0;
                while (i28 < size2) {
                    ConstraintWidget constraintWidget3 = this.mVariableDimensionsWidgets.get(i28);
                    if ((!(constraintWidget3 instanceof Helper) || (constraintWidget3 instanceof VirtualLayout)) && !(constraintWidget3 instanceof Guideline) && constraintWidget3.getVisibility() != 8 && ((!z10 || !constraintWidget3.horizontalRun.dimension.resolved || !constraintWidget3.verticalRun.dimension.resolved) && !(constraintWidget3 instanceof VirtualLayout))) {
                        int width4 = constraintWidget3.getWidth();
                        int height4 = constraintWidget3.getHeight();
                        int baselineDistance = constraintWidget3.getBaselineDistance();
                        z5 = z10;
                        z2 |= measure(measurer2, constraintWidget3, true);
                        Metrics metrics3 = constraintWidgetContainer3.mMetrics;
                        i13 = size2;
                        measurer = measurer2;
                        if (metrics3 != null) {
                            metrics3.measuredMatchWidgets++;
                        }
                        int width5 = constraintWidget3.getWidth();
                        int height5 = constraintWidget3.getHeight();
                        if (width5 != width4) {
                            constraintWidget3.setWidth(width5);
                            if (z11 && constraintWidget3.getRight() > max) {
                                max = Math.max(max, constraintWidget3.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin() + constraintWidget3.getRight());
                            }
                            z2 = true;
                        }
                        if (height5 != height4) {
                            constraintWidget3.setHeight(height5);
                            if (z12 && constraintWidget3.getBottom() > max2) {
                                max2 = Math.max(max2, constraintWidget3.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin() + constraintWidget3.getBottom());
                            }
                            z2 = true;
                        }
                        if (constraintWidget3.hasBaseline() && baselineDistance != constraintWidget3.getBaselineDistance()) {
                            z2 = true;
                        }
                    } else {
                        z5 = z10;
                        i13 = size2;
                        measurer = measurer2;
                    }
                    i28++;
                    size2 = i13;
                    z10 = z5;
                    measurer2 = measurer;
                }
                boolean z15 = z10;
                int i29 = size2;
                Measurer measurer3 = measurer2;
                if (!z2) {
                    break;
                }
                solveLinearSystem(constraintWidgetContainer3, "intermediate pass", i24, i25);
                i27++;
                z10 = z15;
                measurer2 = measurer3;
                i26 = 2;
                z13 = false;
                size2 = i29;
            }
            int i30 = i24;
            int i31 = i25;
            if (z2) {
                solveLinearSystem(constraintWidgetContainer3, "2nd pass", i30, i31);
                if (constraintWidgetContainer2.getWidth() < max) {
                    constraintWidgetContainer3.setWidth(max);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (constraintWidgetContainer2.getHeight() < max2) {
                    constraintWidgetContainer3.setHeight(max2);
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (z4) {
                    solveLinearSystem(constraintWidgetContainer3, "3rd pass", i30, i31);
                }
            }
            i12 = i23;
        } else {
            i12 = optimizationLevel;
        }
        constraintWidgetContainer3.setOptimizationLevel(i12);
        return 0;
    }

    public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer2) {
        this.mVariableDimensionsWidgets.clear();
        int size = constraintWidgetContainer2.mChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer2.mChildren.get(i2);
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == dimensionBehaviour || constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) {
                this.mVariableDimensionsWidgets.add(constraintWidget);
            }
        }
        constraintWidgetContainer2.invalidateGraph();
    }
}
