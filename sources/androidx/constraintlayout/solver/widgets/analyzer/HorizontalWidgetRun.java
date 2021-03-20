package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import b.e.a.a.a;
import java.util.List;

public class HorizontalWidgetRun extends WidgetRun {
    private static int[] tempDimensions = new int[2];

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0014 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.values()
                r0 = 4
                int[] r0 = new int[r0]
                $SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType = r0
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x000d }
                r1 = 1
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                int[] r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1 = 2
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType     // Catch:{ NoSuchFieldError -> 0x001b }
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x001b }
                r1 = 3
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x001b }
            L_0x001b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.AnonymousClass1.<clinit>():void");
        }
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.start.type = DependencyNode.Type.LEFT;
        this.end.type = DependencyNode.Type.RIGHT;
        this.orientation = 0;
    }

    private void computeInsetRatio(int[] iArr, int i2, int i3, int i4, int i5, float f, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 == -1) {
            int i9 = (int) ((((float) i8) * f) + 0.5f);
            int i10 = (int) ((((float) i7) / f) + 0.5f);
            if (i9 <= i7 && i8 <= i8) {
                iArr[0] = i9;
                iArr[1] = i8;
            } else if (i7 <= i7 && i10 <= i8) {
                iArr[0] = i7;
                iArr[1] = i10;
            }
        } else if (i6 == 0) {
            iArr[0] = (int) ((((float) i8) * f) + 0.5f);
            iArr[1] = i8;
        } else if (i6 == 1) {
            iArr[0] = i7;
            iArr[1] = (int) ((((float) i7) * f) + 0.5f);
        }
    }

    public void apply() {
        ConstraintAnchor constraintAnchor;
        DependencyNode dependencyNode;
        int i2;
        DependencyNode dependencyNode2;
        DependencyNode dependencyNode3;
        Object obj;
        List list;
        DependencyNode dependencyNode4;
        int i3;
        DependencyNode dependencyNode5;
        DependencyNode dependencyNode6;
        int i4;
        DependencyNode dependencyNode7;
        DependencyNode dependencyNode8;
        ConstraintWidget parent;
        ConstraintWidget parent2;
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget.measured) {
            this.dimension.resolve(constraintWidget.getWidth());
        }
        if (!this.dimension.resolved) {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = this.widget.getHorizontalDimensionBehaviour();
            this.dimensionBehavior = horizontalDimensionBehaviour;
            if (horizontalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (horizontalDimensionBehaviour == dimensionBehaviour && (((parent2 = this.widget.getParent()) != null && parent2.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) || parent2.getHorizontalDimensionBehaviour() == dimensionBehaviour)) {
                    int width = (parent2.getWidth() - this.widget.mLeft.getMargin()) - this.widget.mRight.getMargin();
                    addTarget(this.start, parent2.horizontalRun.start, this.widget.mLeft.getMargin());
                    addTarget(this.end, parent2.horizontalRun.end, -this.widget.mRight.getMargin());
                    this.dimension.resolve(width);
                    return;
                } else if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.dimension.resolve(this.widget.getWidth());
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.dimensionBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 == dimensionBehaviour3 && (((parent = this.widget.getParent()) != null && parent.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) || parent.getHorizontalDimensionBehaviour() == dimensionBehaviour3)) {
                addTarget(this.start, parent.horizontalRun.start, this.widget.mLeft.getMargin());
                addTarget(this.end, parent.horizontalRun.end, -this.widget.mRight.getMargin());
                return;
            }
        }
        DimensionDependency dimensionDependency = this.dimension;
        if (dimensionDependency.resolved) {
            ConstraintWidget constraintWidget2 = this.widget;
            if (constraintWidget2.measured) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                if (constraintAnchorArr[0].mTarget == null || constraintAnchorArr[1].mTarget == null) {
                    if (constraintAnchorArr[0].mTarget != null) {
                        dependencyNode8 = getTarget(constraintAnchorArr[0]);
                        if (dependencyNode8 != null) {
                            dependencyNode7 = this.start;
                            i4 = this.widget.mListAnchors[0].getMargin();
                        } else {
                            return;
                        }
                    } else if (constraintAnchorArr[1].mTarget != null) {
                        DependencyNode target = getTarget(constraintAnchorArr[1]);
                        if (target != null) {
                            addTarget(this.end, target, -this.widget.mListAnchors[1].getMargin());
                            dependencyNode6 = this.start;
                            dependencyNode5 = this.end;
                            i3 = -this.dimension.value;
                            addTarget(dependencyNode6, dependencyNode5, i3);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof Helper) && constraintWidget2.getParent() != null && this.widget.getAnchor(ConstraintAnchor.Type.CENTER).mTarget == null) {
                        dependencyNode8 = this.widget.getParent().horizontalRun.start;
                        dependencyNode7 = this.start;
                        i4 = this.widget.getX();
                    } else {
                        return;
                    }
                    addTarget(dependencyNode7, dependencyNode8, i4);
                    dependencyNode6 = this.end;
                    dependencyNode5 = this.start;
                    i3 = this.dimension.value;
                    addTarget(dependencyNode6, dependencyNode5, i3);
                    return;
                } else if (constraintWidget2.isInHorizontalChain()) {
                    this.start.margin = this.widget.mListAnchors[0].getMargin();
                    dependencyNode = this.end;
                    constraintAnchor = this.widget.mListAnchors[1];
                    dependencyNode.margin = -constraintAnchor.getMargin();
                } else {
                    DependencyNode target2 = getTarget(this.widget.mListAnchors[0]);
                    if (target2 != null) {
                        addTarget(this.start, target2, this.widget.mListAnchors[0].getMargin());
                    }
                    DependencyNode target3 = getTarget(this.widget.mListAnchors[1]);
                    if (target3 != null) {
                        addTarget(this.end, target3, -this.widget.mListAnchors[1].getMargin());
                    }
                    this.start.delegateToWidgetRun = true;
                    this.end.delegateToWidgetRun = true;
                    return;
                }
            }
        }
        if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.widget;
            int i5 = constraintWidget3.mMatchConstraintDefaultWidth;
            if (i5 == 2) {
                ConstraintWidget parent3 = constraintWidget3.getParent();
                if (parent3 != null) {
                    DimensionDependency dimensionDependency2 = parent3.verticalRun.dimension;
                    this.dimension.targets.add(dimensionDependency2);
                    dimensionDependency2.dependencies.add(this.dimension);
                    DimensionDependency dimensionDependency3 = this.dimension;
                    dimensionDependency3.delegateToWidgetRun = true;
                    dimensionDependency3.dependencies.add(this.start);
                    list = this.dimension.dependencies;
                    obj = this.end;
                }
            } else if (i5 == 3) {
                if (constraintWidget3.mMatchConstraintDefaultHeight == 3) {
                    this.start.updateDelegate = this;
                    this.end.updateDelegate = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget3.verticalRun;
                    verticalWidgetRun.start.updateDelegate = this;
                    verticalWidgetRun.end.updateDelegate = this;
                    dimensionDependency.updateDelegate = this;
                    if (constraintWidget3.isInVerticalChain()) {
                        this.dimension.targets.add(this.widget.verticalRun.dimension);
                        this.widget.verticalRun.dimension.dependencies.add(this.dimension);
                        VerticalWidgetRun verticalWidgetRun2 = this.widget.verticalRun;
                        verticalWidgetRun2.dimension.updateDelegate = this;
                        this.dimension.targets.add(verticalWidgetRun2.start);
                        this.dimension.targets.add(this.widget.verticalRun.end);
                        this.widget.verticalRun.start.dependencies.add(this.dimension);
                        list = this.widget.verticalRun.end.dependencies;
                        obj = this.dimension;
                    } else if (this.widget.isInHorizontalChain()) {
                        this.widget.verticalRun.dimension.targets.add(this.dimension);
                        list = this.dimension.dependencies;
                        obj = this.widget.verticalRun.dimension;
                    } else {
                        dependencyNode4 = this.widget.verticalRun.dimension;
                    }
                } else {
                    DimensionDependency dimensionDependency4 = constraintWidget3.verticalRun.dimension;
                    dimensionDependency.targets.add(dimensionDependency4);
                    dimensionDependency4.dependencies.add(this.dimension);
                    this.widget.verticalRun.start.dependencies.add(this.dimension);
                    this.widget.verticalRun.end.dependencies.add(this.dimension);
                    DimensionDependency dimensionDependency5 = this.dimension;
                    dimensionDependency5.delegateToWidgetRun = true;
                    dimensionDependency5.dependencies.add(this.start);
                    this.dimension.dependencies.add(this.end);
                    this.start.targets.add(this.dimension);
                    dependencyNode4 = this.end;
                }
                list = dependencyNode4.targets;
                obj = this.dimension;
            }
            list.add(obj);
        }
        ConstraintWidget constraintWidget4 = this.widget;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.mListAnchors;
        if (constraintAnchorArr2[0].mTarget == null || constraintAnchorArr2[1].mTarget == null) {
            if (constraintAnchorArr2[0].mTarget != null) {
                dependencyNode3 = getTarget(constraintAnchorArr2[0]);
                if (dependencyNode3 != null) {
                    dependencyNode2 = this.start;
                    i2 = this.widget.mListAnchors[0].getMargin();
                } else {
                    return;
                }
            } else if (constraintAnchorArr2[1].mTarget != null) {
                DependencyNode target4 = getTarget(constraintAnchorArr2[1]);
                if (target4 != null) {
                    addTarget(this.end, target4, -this.widget.mListAnchors[1].getMargin());
                    addTarget(this.start, this.end, -1, this.dimension);
                    return;
                }
                return;
            } else if (!(constraintWidget4 instanceof Helper) && constraintWidget4.getParent() != null) {
                dependencyNode3 = this.widget.getParent().horizontalRun.start;
                dependencyNode2 = this.start;
                i2 = this.widget.getX();
            } else {
                return;
            }
            addTarget(dependencyNode2, dependencyNode3, i2);
            addTarget(this.end, this.start, 1, this.dimension);
        } else if (constraintWidget4.isInHorizontalChain()) {
            this.start.margin = this.widget.mListAnchors[0].getMargin();
            dependencyNode = this.end;
            constraintAnchor = this.widget.mListAnchors[1];
            dependencyNode.margin = -constraintAnchor.getMargin();
        } else {
            DependencyNode target5 = getTarget(this.widget.mListAnchors[0]);
            DependencyNode target6 = getTarget(this.widget.mListAnchors[1]);
            target5.addDependency(this);
            target6.addDependency(this);
            this.mRunType = WidgetRun.RunType.CENTER;
        }
    }

    public void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.widget.setX(dependencyNode.value);
        }
    }

    public void clear() {
        this.runGroup = null;
        this.start.clear();
        this.end.clear();
        this.dimension.clear();
        this.resolved = false;
    }

    public void reset() {
        this.resolved = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.dimension.resolved = false;
    }

    public boolean supportsWrapComputation() {
        return this.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.widget.mMatchConstraintDefaultWidth == 0;
    }

    public String toString() {
        StringBuilder y = a.y("HorizontalRun ");
        y.append(this.widget.getDebugName());
        return y.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x028e, code lost:
        if (r14 != 1) goto L_0x02e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(androidx.constraintlayout.solver.widgets.analyzer.Dependency r17) {
        /*
            r16 = this;
            r8 = r16
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r0 = r8.mRunType
            int r0 = r0.ordinal()
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0025
            if (r0 == r1) goto L_0x001f
            if (r0 == r2) goto L_0x0013
            goto L_0x002a
        L_0x0013:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mRight
            r3 = r17
            r8.updateRunCenter(r3, r1, r0, r10)
            return
        L_0x001f:
            r3 = r17
            r16.updateRunEnd(r17)
            goto L_0x002a
        L_0x0025:
            r3 = r17
            r16.updateRunStart(r17)
        L_0x002a:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x02e3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x02e3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            int r3 = r0.mMatchConstraintDefaultWidth
            if (r3 == r1) goto L_0x02c6
            if (r3 == r2) goto L_0x0042
            goto L_0x02e3
        L_0x0042:
            int r1 = r0.mMatchConstraintDefaultHeight
            r3 = -1
            if (r1 == 0) goto L_0x0078
            if (r1 != r2) goto L_0x004a
            goto L_0x0078
        L_0x004a:
            int r0 = r0.getDimensionRatioSide()
            if (r0 == r3) goto L_0x0069
            if (r0 == 0) goto L_0x0057
            if (r0 == r9) goto L_0x0069
            r0 = r10
            goto L_0x02de
        L_0x0057:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int r1 = r1.value
            float r1 = (float) r1
            float r0 = r0.getDimensionRatio()
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x02de
        L_0x0069:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int r1 = r1.value
            float r1 = (float) r1
            float r0 = r0.getDimensionRatio()
            goto L_0x02db
        L_0x0078:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r12 = r1.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r13 = r1.end
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x0086
            r1 = r9
            goto L_0x0087
        L_0x0086:
            r1 = r10
        L_0x0087:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L_0x008f
            r2 = r9
            goto L_0x0090
        L_0x008f:
            r2 = r10
        L_0x0090:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L_0x0098
            r4 = r9
            goto L_0x0099
        L_0x0098:
            r4 = r10
        L_0x0099:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r0.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x00a1
            r5 = r9
            goto L_0x00a2
        L_0x00a1:
            r5 = r10
        L_0x00a2:
            int r14 = r0.getDimensionRatioSide()
            if (r1 == 0) goto L_0x01e6
            if (r2 == 0) goto L_0x01e6
            if (r4 == 0) goto L_0x01e6
            if (r5 == 0) goto L_0x01e6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            float r15 = r0.getDimensionRatio()
            boolean r0 = r12.resolved
            if (r0 == 0) goto L_0x0117
            boolean r0 = r13.resolved
            if (r0 == 0) goto L_0x0117
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.readyToSolve
            if (r1 == 0) goto L_0x0116
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r1 = r1.readyToSolve
            if (r1 != 0) goto L_0x00c9
            goto L_0x0116
        L_0x00c9:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.margin
            int r2 = r0 + r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.end
            int r1 = r1.margin
            int r3 = r0 - r1
            int r0 = r12.value
            int r1 = r12.margin
            int r4 = r0 + r1
            int r0 = r13.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = tempDimensions
            r1 = r1[r10]
            r0.resolve(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = tempDimensions
            r1 = r1[r9]
            r0.resolve(r1)
        L_0x0116:
            return
        L_0x0117:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.resolved
            if (r1 == 0) goto L_0x0174
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r2 = r1.resolved
            if (r2 == 0) goto L_0x0174
            boolean r2 = r12.readyToSolve
            if (r2 == 0) goto L_0x0173
            boolean r2 = r13.readyToSolve
            if (r2 != 0) goto L_0x012c
            goto L_0x0173
        L_0x012c:
            int r2 = r0.value
            int r0 = r0.margin
            int r2 = r2 + r0
            int r0 = r1.value
            int r1 = r1.margin
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r12.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r12.margin
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r13.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = tempDimensions
            r1 = r1[r10]
            r0.resolve(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = tempDimensions
            r1 = r1[r9]
            r0.resolve(r1)
            goto L_0x0174
        L_0x0173:
            return
        L_0x0174:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.readyToSolve
            if (r1 == 0) goto L_0x01e5
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r1 = r1.readyToSolve
            if (r1 == 0) goto L_0x01e5
            boolean r1 = r12.readyToSolve
            if (r1 == 0) goto L_0x01e5
            boolean r1 = r13.readyToSolve
            if (r1 != 0) goto L_0x0189
            goto L_0x01e5
        L_0x0189:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.margin
            int r2 = r0 + r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.end
            int r1 = r1.margin
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r12.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r12.margin
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r13.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = tempDimensions
            r1 = r1[r10]
            r0.resolve(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = tempDimensions
            r1 = r1[r9]
            goto L_0x02c1
        L_0x01e5:
            return
        L_0x01e6:
            if (r1 == 0) goto L_0x025d
            if (r4 == 0) goto L_0x025d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r0 = r0.readyToSolve
            if (r0 == 0) goto L_0x025c
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.end
            boolean r0 = r0.readyToSolve
            if (r0 != 0) goto L_0x01f7
            goto L_0x025c
        L_0x01f7:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            float r0 = r0.getDimensionRatio()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r8.start
            int r2 = r2.margin
            int r1 = r1 + r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r8.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r2.targets
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r8.end
            int r4 = r4.margin
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0239
            if (r14 == 0) goto L_0x0239
            if (r14 == r9) goto L_0x0227
            goto L_0x02e3
        L_0x0227:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r9)
            if (r2 == r3) goto L_0x024c
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L_0x024a
        L_0x0239:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r9)
            if (r2 == r3) goto L_0x024c
            float r1 = (float) r3
            float r1 = r1 / r0
        L_0x024a:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x024c:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            r0.resolve(r3)
            goto L_0x02e3
        L_0x025c:
            return
        L_0x025d:
            if (r2 == 0) goto L_0x02e3
            if (r5 == 0) goto L_0x02e3
            boolean r0 = r12.readyToSolve
            if (r0 == 0) goto L_0x02c5
            boolean r0 = r13.readyToSolve
            if (r0 != 0) goto L_0x026a
            goto L_0x02c5
        L_0x026a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            float r0 = r0.getDimensionRatio()
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r12.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            int r2 = r12.margin
            int r1 = r1 + r2
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r13.targets
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            int r4 = r13.margin
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02a3
            if (r14 == 0) goto L_0x0291
            if (r14 == r9) goto L_0x02a3
            goto L_0x02e3
        L_0x0291:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r10)
            if (r2 == r3) goto L_0x02b6
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x02b4
        L_0x02a3:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r10)
            if (r2 == r3) goto L_0x02b6
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x02b4:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02b6:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
        L_0x02c1:
            r0.resolve(r1)
            goto L_0x02e3
        L_0x02c5:
            return
        L_0x02c6:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L_0x02e3
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            boolean r1 = r0.resolved
            if (r1 == 0) goto L_0x02e3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.widget
            float r1 = r1.mMatchConstraintPercentWidth
            int r0 = r0.value
            float r0 = (float) r0
        L_0x02db:
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x02de:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r8.dimension
            r1.resolve(r0)
        L_0x02e3:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.readyToSolve
            if (r1 == 0) goto L_0x0403
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r2 = r1.readyToSolve
            if (r2 != 0) goto L_0x02f1
            goto L_0x0403
        L_0x02f1:
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x0300
            boolean r0 = r1.resolved
            if (r0 == 0) goto L_0x0300
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x0300
            return
        L_0x0300:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L_0x034a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x034a
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.widget
            int r1 = r0.mMatchConstraintDefaultWidth
            if (r1 != 0) goto L_0x034a
            boolean r0 = r0.isInHorizontalChain()
            if (r0 != 0) goto L_0x034a
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r0 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r8.start
            int r3 = r2.margin
            int r0 = r0 + r3
            int r1 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r8.end
            int r3 = r3.margin
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.resolve(r0)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.end
            r0.resolve(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r3)
            return
        L_0x034a:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L_0x03ae
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ae
            int r0 = r8.matchConstraintsType
            if (r0 != r9) goto L_0x03ae
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ae
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ae
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r0 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r8.start
            int r2 = r2.margin
            int r0 = r0 + r2
            int r1 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r8.end
            int r2 = r2.margin
            int r1 = r1 + r2
            int r1 = r1 - r0
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int r0 = r0.wrapValue
            int r0 = java.lang.Math.min(r1, r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.widget
            int r2 = r1.mMatchConstraintMaxWidth
            int r1 = r1.mMatchConstraintMinWidth
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03a9
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03a9:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r8.dimension
            r1.resolve(r0)
        L_0x03ae:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L_0x03b5
            return
        L_0x03b5:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r2 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r8.start
            int r3 = r3.margin
            int r2 = r2 + r3
            int r3 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r8.end
            int r4 = r4.margin
            int r3 = r3 + r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r8.widget
            float r4 = r4.getHorizontalBiasPercent()
            if (r0 != r1) goto L_0x03e4
            int r2 = r0.value
            int r3 = r1.value
            r4 = r11
        L_0x03e4:
            int r3 = r3 - r2
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int r0 = r0.value
            int r3 = r3 - r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.start
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r2 = r2 + r1
            int r1 = (int) r2
            r0.resolve(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r8.dimension
            int r2 = r2.value
            int r1 = r1 + r2
            r0.resolve(r1)
        L_0x0403:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.update(androidx.constraintlayout.solver.widgets.analyzer.Dependency):void");
    }
}
