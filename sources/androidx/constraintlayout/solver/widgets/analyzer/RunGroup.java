package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import b.e.a.a.a;
import java.util.ArrayList;

public class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    public int direction;
    public boolean dual = false;
    public WidgetRun firstRun = null;
    public int groupIndex = 0;
    public WidgetRun lastRun = null;
    public int position = 0;
    public ArrayList<WidgetRun> runs = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i2) {
        int i3 = index;
        this.groupIndex = i3;
        index = i3 + 1;
        this.firstRun = widgetRun;
        this.lastRun = widgetRun;
        this.direction = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean defineTerminalWidget(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r6, int r7) {
        /*
            r5 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r6.widget
            boolean[] r0 = r0.isTerminalWidget
            boolean r0 = r0[r7]
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r6.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005a
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r2 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r3 == 0) goto L_0x0012
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r3 = r2.run
            if (r3 != r6) goto L_0x0029
            goto L_0x0012
        L_0x0029:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.start
            if (r2 != r3) goto L_0x0012
            boolean r3 = r6 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            if (r3 == 0) goto L_0x004a
            r3 = r6
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r3 = (androidx.constraintlayout.solver.widgets.analyzer.ChainRun) r3
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r3 = r3.widgets
            java.util.Iterator r3 = r3.iterator()
        L_0x003a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0054
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r4
            r5.defineTerminalWidget(r4, r7)
            goto L_0x003a
        L_0x004a:
            boolean r3 = r6 instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences
            if (r3 != 0) goto L_0x0054
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r6.widget
            boolean[] r3 = r3.isTerminalWidget
            r3[r7] = r1
        L_0x0054:
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = r2.run
            r5.defineTerminalWidget(r2, r7)
            goto L_0x0012
        L_0x005a:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r6.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r0 = r0.iterator()
        L_0x0062:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r2 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r3 == 0) goto L_0x0062
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r3 = r2.run
            if (r3 != r6) goto L_0x0079
            goto L_0x0062
        L_0x0079:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.start
            if (r2 != r3) goto L_0x0062
            boolean r3 = r6 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            if (r3 == 0) goto L_0x009a
            r3 = r6
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r3 = (androidx.constraintlayout.solver.widgets.analyzer.ChainRun) r3
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r3 = r3.widgets
            java.util.Iterator r3 = r3.iterator()
        L_0x008a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r4
            r5.defineTerminalWidget(r4, r7)
            goto L_0x008a
        L_0x009a:
            boolean r3 = r6 instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences
            if (r3 != 0) goto L_0x00a4
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r6.widget
            boolean[] r3 = r3.isTerminalWidget
            r3[r7] = r1
        L_0x00a4:
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = r2.run
            r5.defineTerminalWidget(r2, r7)
            goto L_0x0062
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.RunGroup.defineTerminalWidget(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, int):boolean");
    }

    private long traverseEnd(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.dependencies.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = dependencyNode.dependencies.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j3 = Math.min(j3, traverseEnd(dependencyNode2, ((long) dependencyNode2.margin) + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return j3;
        }
        long wrapDimension = j2 - widgetRun.getWrapDimension();
        return Math.min(Math.min(j3, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - ((long) widgetRun.start.margin));
    }

    private long traverseStart(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.dependencies.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = dependencyNode.dependencies.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j3 = Math.max(j3, traverseStart(dependencyNode2, ((long) dependencyNode2.margin) + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return j3;
        }
        long wrapDimension = j2 + widgetRun.getWrapDimension();
        return Math.max(Math.max(j3, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - ((long) widgetRun.end.margin));
    }

    public void add(WidgetRun widgetRun) {
        this.runs.add(widgetRun);
        this.lastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
        long j2;
        long j3;
        WidgetRun widgetRun = this.firstRun;
        long j4 = 0;
        if (widgetRun instanceof ChainRun) {
            if (((ChainRun) widgetRun).orientation != i2) {
                return 0;
            }
        } else if (i2 == 0) {
            if (!(widgetRun instanceof HorizontalWidgetRun)) {
                return 0;
            }
        } else if (!(widgetRun instanceof VerticalWidgetRun)) {
            return 0;
        }
        DependencyNode dependencyNode = (i2 == 0 ? constraintWidgetContainer.horizontalRun : constraintWidgetContainer.verticalRun).start;
        DependencyNode dependencyNode2 = (i2 == 0 ? constraintWidgetContainer.horizontalRun : constraintWidgetContainer.verticalRun).end;
        boolean contains = widgetRun.start.targets.contains(dependencyNode);
        boolean contains2 = this.firstRun.end.targets.contains(dependencyNode2);
        long wrapDimension = this.firstRun.getWrapDimension();
        if (!contains || !contains2) {
            if (contains) {
                DependencyNode dependencyNode3 = this.firstRun.start;
                j2 = traverseStart(dependencyNode3, (long) dependencyNode3.margin);
                j3 = ((long) this.firstRun.start.margin) + wrapDimension;
            } else if (contains2) {
                DependencyNode dependencyNode4 = this.firstRun.end;
                long traverseEnd = traverseEnd(dependencyNode4, (long) dependencyNode4.margin);
                j3 = ((long) (-this.firstRun.end.margin)) + wrapDimension;
                j2 = -traverseEnd;
            } else {
                WidgetRun widgetRun2 = this.firstRun;
                return (widgetRun2.getWrapDimension() + ((long) widgetRun2.start.margin)) - ((long) this.firstRun.end.margin);
            }
            return Math.max(j2, j3);
        }
        long traverseStart = traverseStart(this.firstRun.start, 0);
        long traverseEnd2 = traverseEnd(this.firstRun.end, 0);
        long j5 = traverseStart - wrapDimension;
        WidgetRun widgetRun3 = this.firstRun;
        int i3 = widgetRun3.end.margin;
        if (j5 >= ((long) (-i3))) {
            j5 += (long) i3;
        }
        int i4 = widgetRun3.start.margin;
        long j6 = ((-traverseEnd2) - wrapDimension) - ((long) i4);
        if (j6 >= ((long) i4)) {
            j6 -= (long) i4;
        }
        float biasPercent = widgetRun3.widget.getBiasPercent(i2);
        if (biasPercent > 0.0f) {
            j4 = (long) ((((float) j5) / (1.0f - biasPercent)) + (((float) j6) / biasPercent));
        }
        float f = (float) j4;
        long a = ((long) ((f * biasPercent) + 0.5f)) + wrapDimension + ((long) a.a(1.0f, biasPercent, f, 0.5f));
        WidgetRun widgetRun4 = this.firstRun;
        return (((long) widgetRun4.start.margin) + a) - ((long) widgetRun4.end.margin);
    }

    public void defineTerminalWidgets(boolean z, boolean z2) {
        if (z) {
            WidgetRun widgetRun = this.firstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z2) {
            WidgetRun widgetRun2 = this.firstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}
