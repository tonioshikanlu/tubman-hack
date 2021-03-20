package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import b.e.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;

public class ChainRun extends WidgetRun {
    private int chainStyle;
    public ArrayList<WidgetRun> widgets = new ArrayList<>();

    public ChainRun(ConstraintWidget constraintWidget, int i2) {
        super(constraintWidget);
        this.orientation = i2;
        build();
    }

    private void build() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.widget;
        do {
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget2.getPreviousChainMember(this.orientation);
        } while (constraintWidget2 != null);
        this.widget = constraintWidget;
        this.widgets.add(constraintWidget.getRun(this.orientation));
        ConstraintWidget nextChainMember = constraintWidget.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.widgets.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i2 = this.orientation;
            if (i2 == 0) {
                next.widget.horizontalChainRun = this;
            } else if (i2 == 1) {
                next.widget.verticalChainRun = this;
            }
        }
        if ((this.orientation == 0 && ((ConstraintWidgetContainer) this.widget.getParent()).isRtl()) && this.widgets.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.widgets;
            this.widget = arrayList.get(arrayList.size() - 1).widget;
        }
        this.chainStyle = this.orientation == 0 ? this.widget.getHorizontalChainStyle() : this.widget.getVerticalChainStyle();
    }

    private ConstraintWidget getFirstVisibleWidget() {
        for (int i2 = 0; i2 < this.widgets.size(); i2++) {
            WidgetRun widgetRun = this.widgets.get(i2);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    private ConstraintWidget getLastVisibleWidget() {
        for (int size = this.widgets.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.widgets.get(size);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void apply() {
        /*
            r5 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r5.widgets
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r1
            r1.apply()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r2 = r5.widgets
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.widget
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r5.widgets
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r0 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.widget
            int r4 = r5.orientation
            if (r4 != 0) goto L_0x0070
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r5.getTarget(r1, r3)
            int r1 = r1.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r5.getFirstVisibleWidget()
            if (r4 == 0) goto L_0x0052
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r4.mLeft
            int r1 = r1.getMargin()
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r5.start
            r5.addTarget(r4, r2, r1)
        L_0x0059:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r5.getTarget(r0, r3)
            int r0 = r0.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r5.getLastVisibleWidget()
            if (r2 == 0) goto L_0x006d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mRight
            int r0 = r0.getMargin()
        L_0x006d:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00a5
        L_0x0070:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r5.getTarget(r2, r1)
            int r2 = r2.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r5.getFirstVisibleWidget()
            if (r4 == 0) goto L_0x0088
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r4.mTop
            int r2 = r2.getMargin()
        L_0x0088:
            if (r3 == 0) goto L_0x008f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r5.start
            r5.addTarget(r4, r3, r2)
        L_0x008f:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r5.getTarget(r0, r1)
            int r0 = r0.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r5.getLastVisibleWidget()
            if (r2 == 0) goto L_0x00a3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mBottom
            int r0 = r0.getMargin()
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
        L_0x00a5:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r5.end
            int r0 = -r0
            r5.addTarget(r2, r1, r0)
        L_0x00ab:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            r0.updateDelegate = r5
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.end
            r0.updateDelegate = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.ChainRun.apply():void");
    }

    public void applyToWidget() {
        for (int i2 = 0; i2 < this.widgets.size(); i2++) {
            this.widgets.get(i2).applyToWidget();
        }
    }

    public void clear() {
        this.runGroup = null;
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    public long getWrapDimension() {
        int size = this.widgets.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            WidgetRun widgetRun = this.widgets.get(i2);
            j2 = ((long) widgetRun.end.margin) + widgetRun.getWrapDimension() + j2 + ((long) widgetRun.start.margin);
        }
        return j2;
    }

    public void reset() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    public boolean supportsWrapComputation() {
        int size = this.widgets.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.widgets.get(i2).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder y = a.y("ChainRun ");
        y.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        String sb = y.toString();
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            String m2 = a.m(sb, "<");
            sb = a.m(m2 + it.next(), "> ");
        }
        return sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x019f, code lost:
        if (r1 != r7) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c5, code lost:
        if (r1 != r7) goto L_0x01c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(androidx.constraintlayout.solver.widgets.analyzer.Dependency r26) {
        /*
            r25 = this;
            r0 = r25
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r1 = r1.resolved
            if (r1 == 0) goto L_0x0407
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.end
            boolean r1 = r1.resolved
            if (r1 != 0) goto L_0x0010
            goto L_0x0407
        L_0x0010:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.getParent()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r3 == 0) goto L_0x0023
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r1
            boolean r1 = r1.isRtl()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r0.end
            int r3 = r3.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r0.start
            int r4 = r4.value
            int r3 = r3 - r4
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r0.widgets
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r8 = r0.widgets
            java.lang.Object r8 = r8.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r8.widget
            int r8 = r8.getVisibility()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = r6
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r10 = r0.widgets
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r10.widget
            int r10 = r10.getVisibility()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            if (r9 >= r11) goto L_0x010b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0071:
            if (r13 >= r4) goto L_0x00fd
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r2 = r0.widgets
            java.lang.Object r2 = r2.get(r13)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r2.widget
            int r11 = r11.getVisibility()
            if (r11 != r7) goto L_0x0085
            goto L_0x00f6
        L_0x0085:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0090
            if (r13 < r5) goto L_0x0090
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r11 = r2.start
            int r11 = r11.margin
            int r14 = r14 + r11
        L_0x0090:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r11 = r2.dimension
            int r7 = r11.value
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = r2.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009c
            r10 = 1
            goto L_0x009d
        L_0x009c:
            r10 = 0
        L_0x009d:
            if (r10 == 0) goto L_0x00bf
            int r11 = r0.orientation
            if (r11 != 0) goto L_0x00ae
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = r2.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r12 = r12.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r12 = r12.dimension
            boolean r12 = r12.resolved
            if (r12 != 0) goto L_0x00ae
            return
        L_0x00ae:
            r12 = 1
            if (r11 != r12) goto L_0x00bc
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r2.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r11 = r11.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r11 = r11.dimension
            boolean r11 = r11.resolved
            if (r11 != 0) goto L_0x00bc
            return
        L_0x00bc:
            r19 = r7
            goto L_0x00d5
        L_0x00bf:
            r19 = r7
            r12 = 1
            int r7 = r2.matchConstraintsType
            if (r7 != r12) goto L_0x00cd
            if (r9 != 0) goto L_0x00cd
            int r7 = r11.wrapValue
            int r15 = r15 + 1
            goto L_0x00d3
        L_0x00cd:
            boolean r7 = r11.resolved
            if (r7 == 0) goto L_0x00d5
            r7 = r19
        L_0x00d3:
            r10 = 1
            goto L_0x00d7
        L_0x00d5:
            r7 = r19
        L_0x00d7:
            if (r10 != 0) goto L_0x00eb
            int r15 = r15 + 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r2.widget
            float[] r7 = r7.mWeight
            int r10 = r0.orientation
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ec
            float r17 = r17 + r7
            goto L_0x00ec
        L_0x00eb:
            int r14 = r14 + r7
        L_0x00ec:
            if (r13 >= r8) goto L_0x00f6
            if (r13 >= r6) goto L_0x00f6
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.end
            int r2 = r2.margin
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f6:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0071
        L_0x00fd:
            if (r14 < r3) goto L_0x0108
            if (r15 != 0) goto L_0x0102
            goto L_0x0108
        L_0x0102:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0108:
            r2 = r16
            goto L_0x0110
        L_0x010b:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x0110:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r0.start
            int r7 = r7.value
            if (r1 == 0) goto L_0x011a
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r0.end
            int r7 = r7.value
        L_0x011a:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x012b
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            if (r1 == 0) goto L_0x012a
            int r7 = r7 + r10
            goto L_0x012b
        L_0x012a:
            int r7 = r7 - r10
        L_0x012b:
            if (r15 <= 0) goto L_0x0238
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x0137:
            if (r12 >= r4) goto L_0x01ea
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r9 = r9.get(r12)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r9
            r19 = r11
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r9.widget
            int r11 = r11.getVisibility()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0151
            goto L_0x01d0
        L_0x0151:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01d0
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r11 = r9.dimension
            boolean r14 = r11.resolved
            if (r14 != 0) goto L_0x01d0
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0174
            androidx.constraintlayout.solver.widgets.ConstraintWidget r14 = r9.widget
            float[] r14 = r14.mWeight
            r21 = r7
            int r7 = r0.orientation
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x0178
        L_0x0174:
            r21 = r7
            r7 = r19
        L_0x0178:
            int r14 = r0.orientation
            if (r14 != 0) goto L_0x01a2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r14 = r9.widget
            r22 = r10
            int r10 = r14.mMatchConstraintMaxWidth
            int r14 = r14.mMatchConstraintMinWidth
            r23 = r1
            int r1 = r9.matchConstraintsType
            r24 = r2
            r2 = 1
            if (r1 != r2) goto L_0x0194
            int r1 = r11.wrapValue
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x0195
        L_0x0194:
            r1 = r7
        L_0x0195:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x019f
            int r1 = java.lang.Math.min(r10, r1)
        L_0x019f:
            if (r1 == r7) goto L_0x01ca
            goto L_0x01c7
        L_0x01a2:
            r23 = r1
            r24 = r2
            r22 = r10
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r9.widget
            int r2 = r1.mMatchConstraintMaxHeight
            int r1 = r1.mMatchConstraintMinHeight
            int r10 = r9.matchConstraintsType
            r14 = 1
            if (r10 != r14) goto L_0x01ba
            int r10 = r11.wrapValue
            int r10 = java.lang.Math.min(r7, r10)
            goto L_0x01bb
        L_0x01ba:
            r10 = r7
        L_0x01bb:
            int r1 = java.lang.Math.max(r1, r10)
            if (r2 <= 0) goto L_0x01c5
            int r1 = java.lang.Math.min(r2, r1)
        L_0x01c5:
            if (r1 == r7) goto L_0x01ca
        L_0x01c7:
            int r13 = r13 + 1
            r7 = r1
        L_0x01ca:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r9.dimension
            r1.resolve(r7)
            goto L_0x01d8
        L_0x01d0:
            r23 = r1
            r24 = r2
            r21 = r7
            r22 = r10
        L_0x01d8:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r2 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0137
        L_0x01ea:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0229
            int r15 = r15 - r13
            r1 = 0
            r2 = 0
        L_0x01f7:
            if (r1 >= r4) goto L_0x0227
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r7 = r0.widgets
            java.lang.Object r7 = r7.get(r1)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r7.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L_0x020c
            goto L_0x0224
        L_0x020c:
            if (r1 <= 0) goto L_0x0215
            if (r1 < r5) goto L_0x0215
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.start
            int r9 = r9.margin
            int r2 = r2 + r9
        L_0x0215:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r9 = r7.dimension
            int r9 = r9.value
            int r2 = r2 + r9
            if (r1 >= r8) goto L_0x0224
            if (r1 >= r6) goto L_0x0224
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.end
            int r7 = r7.margin
            int r7 = -r7
            int r2 = r2 + r7
        L_0x0224:
            int r1 = r1 + 1
            goto L_0x01f7
        L_0x0227:
            r14 = r2
            goto L_0x022b
        L_0x0229:
            r14 = r20
        L_0x022b:
            int r1 = r0.chainStyle
            r2 = 2
            if (r1 != r2) goto L_0x0236
            if (r13 != 0) goto L_0x0236
            r1 = 0
            r0.chainStyle = r1
            goto L_0x0242
        L_0x0236:
            r1 = 0
            goto L_0x0242
        L_0x0238:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            r1 = 0
            r2 = 2
        L_0x0242:
            if (r14 <= r3) goto L_0x0246
            r0.chainStyle = r2
        L_0x0246:
            if (r24 <= 0) goto L_0x024e
            if (r15 != 0) goto L_0x024e
            if (r5 != r6) goto L_0x024e
            r0.chainStyle = r2
        L_0x024e:
            int r2 = r0.chainStyle
            r7 = 1
            r9 = r24
            if (r2 != r7) goto L_0x02e2
            if (r9 <= r7) goto L_0x025c
            int r3 = r3 - r14
            int r2 = r9 + -1
            int r3 = r3 / r2
            goto L_0x0263
        L_0x025c:
            if (r9 != r7) goto L_0x0262
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L_0x0263
        L_0x0262:
            r3 = r1
        L_0x0263:
            if (r15 <= 0) goto L_0x0266
            r3 = r1
        L_0x0266:
            r2 = r1
            r7 = r21
        L_0x0269:
            if (r2 >= r4) goto L_0x0407
            if (r23 == 0) goto L_0x0272
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x0273
        L_0x0272:
            r1 = r2
        L_0x0273:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r1.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L_0x0290
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            r1.resolve(r7)
            goto L_0x02df
        L_0x0290:
            if (r2 <= 0) goto L_0x0297
            if (r23 == 0) goto L_0x0296
            int r7 = r7 - r3
            goto L_0x0297
        L_0x0296:
            int r7 = r7 + r3
        L_0x0297:
            if (r2 <= 0) goto L_0x02a4
            if (r2 < r5) goto L_0x02a4
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.start
            int r9 = r9.margin
            if (r23 == 0) goto L_0x02a3
            int r7 = r7 - r9
            goto L_0x02a4
        L_0x02a3:
            int r7 = r7 + r9
        L_0x02a4:
            if (r23 == 0) goto L_0x02a9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.end
            goto L_0x02ab
        L_0x02a9:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.start
        L_0x02ab:
            r9.resolve(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r9 = r1.dimension
            int r10 = r9.value
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02bf
            int r11 = r1.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L_0x02bf
            int r10 = r9.wrapValue
        L_0x02bf:
            if (r23 == 0) goto L_0x02c3
            int r7 = r7 - r10
            goto L_0x02c4
        L_0x02c3:
            int r7 = r7 + r10
        L_0x02c4:
            if (r23 == 0) goto L_0x02c9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.start
            goto L_0x02cb
        L_0x02c9:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.end
        L_0x02cb:
            r9.resolve(r7)
            r9 = 1
            r1.resolved = r9
            if (r2 >= r8) goto L_0x02df
            if (r2 >= r6) goto L_0x02df
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            if (r23 == 0) goto L_0x02de
            int r7 = r7 - r1
            goto L_0x02df
        L_0x02de:
            int r7 = r7 + r1
        L_0x02df:
            int r2 = r2 + 1
            goto L_0x0269
        L_0x02e2:
            if (r2 != 0) goto L_0x0367
            int r3 = r3 - r14
            r2 = 1
            int r7 = r9 + 1
            int r3 = r3 / r7
            if (r15 <= 0) goto L_0x02ec
            r3 = r1
        L_0x02ec:
            r2 = r1
            r7 = r21
        L_0x02ef:
            if (r2 >= r4) goto L_0x0407
            if (r23 == 0) goto L_0x02f8
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x02f9
        L_0x02f8:
            r1 = r2
        L_0x02f9:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r1.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L_0x0316
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            r1.resolve(r7)
            goto L_0x0364
        L_0x0316:
            if (r23 == 0) goto L_0x031a
            int r7 = r7 - r3
            goto L_0x031b
        L_0x031a:
            int r7 = r7 + r3
        L_0x031b:
            if (r2 <= 0) goto L_0x0328
            if (r2 < r5) goto L_0x0328
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.start
            int r9 = r9.margin
            if (r23 == 0) goto L_0x0327
            int r7 = r7 - r9
            goto L_0x0328
        L_0x0327:
            int r7 = r7 + r9
        L_0x0328:
            if (r23 == 0) goto L_0x032d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.end
            goto L_0x032f
        L_0x032d:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.start
        L_0x032f:
            r9.resolve(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r9 = r1.dimension
            int r10 = r9.value
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0347
            int r11 = r1.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L_0x0347
            int r9 = r9.wrapValue
            int r10 = java.lang.Math.min(r10, r9)
        L_0x0347:
            if (r23 == 0) goto L_0x034b
            int r7 = r7 - r10
            goto L_0x034c
        L_0x034b:
            int r7 = r7 + r10
        L_0x034c:
            if (r23 == 0) goto L_0x0351
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.start
            goto L_0x0353
        L_0x0351:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r1.end
        L_0x0353:
            r9.resolve(r7)
            if (r2 >= r8) goto L_0x0364
            if (r2 >= r6) goto L_0x0364
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            if (r23 == 0) goto L_0x0363
            int r7 = r7 - r1
            goto L_0x0364
        L_0x0363:
            int r7 = r7 + r1
        L_0x0364:
            int r2 = r2 + 1
            goto L_0x02ef
        L_0x0367:
            r7 = 2
            if (r2 != r7) goto L_0x0407
            int r2 = r0.orientation
            if (r2 != 0) goto L_0x0375
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.widget
            float r2 = r2.getHorizontalBiasPercent()
            goto L_0x037b
        L_0x0375:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.widget
            float r2 = r2.getVerticalBiasPercent()
        L_0x037b:
            if (r23 == 0) goto L_0x0381
            r7 = 1065353216(0x3f800000, float:1.0)
            float r2 = r7 - r2
        L_0x0381:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x038c
            if (r15 <= 0) goto L_0x038d
        L_0x038c:
            r2 = r1
        L_0x038d:
            if (r23 == 0) goto L_0x0392
            int r7 = r21 - r2
            goto L_0x0394
        L_0x0392:
            int r7 = r21 + r2
        L_0x0394:
            r2 = r1
        L_0x0395:
            if (r2 >= r4) goto L_0x0407
            if (r23 == 0) goto L_0x039e
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x039f
        L_0x039e:
            r1 = r2
        L_0x039f:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r3 = r0.widgets
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r1.widget
            int r3 = r3.getVisibility()
            r9 = 8
            if (r3 != r9) goto L_0x03bd
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r1.start
            r3.resolve(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            r1.resolve(r7)
            r12 = 1
            goto L_0x0404
        L_0x03bd:
            if (r2 <= 0) goto L_0x03ca
            if (r2 < r5) goto L_0x03ca
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r1.start
            int r3 = r3.margin
            if (r23 == 0) goto L_0x03c9
            int r7 = r7 - r3
            goto L_0x03ca
        L_0x03c9:
            int r7 = r7 + r3
        L_0x03ca:
            if (r23 == 0) goto L_0x03cf
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r1.end
            goto L_0x03d1
        L_0x03cf:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r1.start
        L_0x03d1:
            r3.resolve(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r3 = r1.dimension
            int r10 = r3.value
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03e6
            int r11 = r1.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L_0x03e7
            int r10 = r3.wrapValue
            goto L_0x03e7
        L_0x03e6:
            r12 = 1
        L_0x03e7:
            if (r23 == 0) goto L_0x03eb
            int r7 = r7 - r10
            goto L_0x03ec
        L_0x03eb:
            int r7 = r7 + r10
        L_0x03ec:
            if (r23 == 0) goto L_0x03f1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r1.start
            goto L_0x03f3
        L_0x03f1:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r1.end
        L_0x03f3:
            r3.resolve(r7)
            if (r2 >= r8) goto L_0x0404
            if (r2 >= r6) goto L_0x0404
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            if (r23 == 0) goto L_0x0403
            int r7 = r7 - r1
            goto L_0x0404
        L_0x0403:
            int r7 = r7 + r1
        L_0x0404:
            int r2 = r2 + 1
            goto L_0x0395
        L_0x0407:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.ChainRun.update(androidx.constraintlayout.solver.widgets.analyzer.Dependency):void");
    }
}
