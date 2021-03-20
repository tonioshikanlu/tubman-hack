package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import java.util.ArrayList;

public class Grouping {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_GROUPING = false;

    public static WidgetGroup findDependents(ConstraintWidget constraintWidget, int i2, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        ConstraintAnchor constraintAnchor;
        int findGroupInDependents;
        int i3 = i2 == 0 ? constraintWidget.horizontalGroup : constraintWidget.verticalGroup;
        int i4 = 0;
        if (i3 != -1 && (widgetGroup == null || i3 != widgetGroup.id)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                WidgetGroup widgetGroup2 = arrayList.get(i5);
                if (widgetGroup2.getId() == i3) {
                    if (widgetGroup != null) {
                        widgetGroup.moveTo(i2, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                } else {
                    i5++;
                }
            }
        } else if (i3 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if ((constraintWidget instanceof HelperWidget) && (findGroupInDependents = ((HelperWidget) constraintWidget).findGroupInDependents(i2)) != -1) {
                int i6 = 0;
                while (true) {
                    if (i6 >= arrayList.size()) {
                        break;
                    }
                    WidgetGroup widgetGroup3 = arrayList.get(i6);
                    if (widgetGroup3.getId() == findGroupInDependents) {
                        widgetGroup = widgetGroup3;
                        break;
                    }
                    i6++;
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup(i2);
            }
            arrayList.add(widgetGroup);
        }
        if (widgetGroup.add(constraintWidget)) {
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                ConstraintAnchor anchor = guideline.getAnchor();
                if (guideline.getOrientation() == 0) {
                    i4 = 1;
                }
                anchor.findDependents(i4, arrayList, widgetGroup);
            }
            int id = widgetGroup.getId();
            if (i2 == 0) {
                constraintWidget.horizontalGroup = id;
                constraintWidget.mLeft.findDependents(i2, arrayList, widgetGroup);
                constraintAnchor = constraintWidget.mRight;
            } else {
                constraintWidget.verticalGroup = id;
                constraintWidget.mTop.findDependents(i2, arrayList, widgetGroup);
                constraintWidget.mBaseline.findDependents(i2, arrayList, widgetGroup);
                constraintAnchor = constraintWidget.mBottom;
            }
            constraintAnchor.findDependents(i2, arrayList, widgetGroup);
            constraintWidget.mCenter.findDependents(i2, arrayList, widgetGroup);
        }
        return widgetGroup;
    }

    private static WidgetGroup findGroup(ArrayList<WidgetGroup> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            WidgetGroup widgetGroup = arrayList.get(i3);
            if (i2 == widgetGroup.id) {
                return widgetGroup;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:177:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x039b A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean simpleSolvingPass(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r16, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.getChildren()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = r16.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = r16.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = r5.getVerticalDimensionBehaviour()
            boolean r6 = validInGroup(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof androidx.constraintlayout.solver.widgets.Flow
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            androidx.constraintlayout.solver.Metrics r4 = r0.mMetrics
            if (r4 == 0) goto L_0x003e
            long r5 = r4.grouping
            r7 = 1
            long r5 = r5 + r7
            r4.grouping = r5
        L_0x003e:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0045:
            if (r5 >= r2) goto L_0x011c
            java.lang.Object r13 = r1.get(r5)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r13
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = r16.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r15 = r16.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r13.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = r13.getVerticalDimensionBehaviour()
            boolean r4 = validInGroup(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x006b
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r4 = r0.mMeasure
            r12 = r17
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer.measure(r13, r12, r4, r3)
            goto L_0x006d
        L_0x006b:
            r12 = r17
        L_0x006d:
            boolean r4 = r13 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r4 == 0) goto L_0x0096
            r14 = r13
            androidx.constraintlayout.solver.widgets.Guideline r14 = (androidx.constraintlayout.solver.widgets.Guideline) r14
            int r15 = r14.getOrientation()
            if (r15 != 0) goto L_0x0084
            if (r8 != 0) goto L_0x0081
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0081:
            r8.add(r14)
        L_0x0084:
            int r15 = r14.getOrientation()
            r3 = 1
            if (r15 != r3) goto L_0x0096
            if (r6 != 0) goto L_0x0093
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
        L_0x0093:
            r6.add(r14)
        L_0x0096:
            boolean r3 = r13 instanceof androidx.constraintlayout.solver.widgets.HelperWidget
            if (r3 == 0) goto L_0x00d7
            boolean r3 = r13 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r3 == 0) goto L_0x00c0
            r3 = r13
            androidx.constraintlayout.solver.widgets.Barrier r3 = (androidx.constraintlayout.solver.widgets.Barrier) r3
            int r14 = r3.getOrientation()
            if (r14 != 0) goto L_0x00b1
            if (r7 != 0) goto L_0x00ae
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00ae:
            r7.add(r3)
        L_0x00b1:
            int r14 = r3.getOrientation()
            r15 = 1
            if (r14 != r15) goto L_0x00d7
            if (r9 != 0) goto L_0x00d4
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L_0x00d4
        L_0x00c0:
            r3 = r13
            androidx.constraintlayout.solver.widgets.HelperWidget r3 = (androidx.constraintlayout.solver.widgets.HelperWidget) r3
            if (r7 != 0) goto L_0x00ca
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00ca:
            r7.add(r3)
            if (r9 != 0) goto L_0x00d4
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00d4:
            r9.add(r3)
        L_0x00d7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x00f4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x00f4
            if (r4 != 0) goto L_0x00f4
            boolean r3 = r13 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r3 != 0) goto L_0x00f4
            if (r10 != 0) goto L_0x00f1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10 = r3
        L_0x00f1:
            r10.add(r13)
        L_0x00f4:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x0117
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x0117
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.mBaseline
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x0117
            if (r4 != 0) goto L_0x0117
            boolean r3 = r13 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r3 != 0) goto L_0x0117
            if (r11 != 0) goto L_0x0114
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x0114:
            r11.add(r13)
        L_0x0117:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x0045
        L_0x011c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x0139
            java.util.Iterator r4 = r6.iterator()
        L_0x0127:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0139
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.Guideline r5 = (androidx.constraintlayout.solver.widgets.Guideline) r5
            r6 = 0
            r12 = 0
            findDependents(r5, r6, r3, r12)
            goto L_0x0127
        L_0x0139:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x015a
            java.util.Iterator r4 = r7.iterator()
        L_0x0141:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x015a
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.HelperWidget r5 = (androidx.constraintlayout.solver.widgets.HelperWidget) r5
            androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup r7 = findDependents(r5, r6, r3, r12)
            r5.addDependents(r3, r6, r7)
            r7.cleanup(r3)
            r6 = 0
            r12 = 0
            goto L_0x0141
        L_0x015a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x0182
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x016e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0182
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 0
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x016e
        L_0x0182:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x01aa
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x0196:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01aa
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 0
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x0196
        L_0x01aa:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x01d2
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x01be:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01d2
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 0
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x01be
        L_0x01d2:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01ea
            java.util.Iterator r4 = r10.iterator()
        L_0x01da:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ea
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r5
            findDependents(r5, r6, r3, r7)
            goto L_0x01da
        L_0x01ea:
            if (r8 == 0) goto L_0x0201
            java.util.Iterator r4 = r8.iterator()
        L_0x01f0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0201
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.Guideline r5 = (androidx.constraintlayout.solver.widgets.Guideline) r5
            r6 = 1
            findDependents(r5, r6, r3, r7)
            goto L_0x01f0
        L_0x0201:
            r6 = 1
            if (r9 == 0) goto L_0x0221
            java.util.Iterator r4 = r9.iterator()
        L_0x0208:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0221
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.HelperWidget r5 = (androidx.constraintlayout.solver.widgets.HelperWidget) r5
            androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup r8 = findDependents(r5, r6, r3, r7)
            r5.addDependents(r3, r6, r8)
            r8.cleanup(r3)
            r6 = 1
            r7 = 0
            goto L_0x0208
        L_0x0221:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x0249
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x0235:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0249
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 1
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x0235
        L_0x0249:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x0271
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x025d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0271
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 1
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x025d
        L_0x0271:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x0299
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x0285:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0299
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 1
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x0285
        L_0x0299:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x02c1
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x02ad:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02c1
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 1
            r12 = 0
            findDependents(r5, r6, r3, r12)
            goto L_0x02ad
        L_0x02c1:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02d9
            java.util.Iterator r4 = r11.iterator()
        L_0x02c9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02d9
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r5
            findDependents(r5, r6, r3, r12)
            goto L_0x02c9
        L_0x02d9:
            r4 = 0
        L_0x02da:
            if (r4 >= r2) goto L_0x0306
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r5
            boolean r6 = r5.oppositeDimensionsTied()
            if (r6 == 0) goto L_0x0303
            int r6 = r5.horizontalGroup
            androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup r6 = findGroup(r3, r6)
            int r5 = r5.verticalGroup
            androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup r5 = findGroup(r3, r5)
            if (r6 == 0) goto L_0x0303
            if (r5 == 0) goto L_0x0303
            r7 = 0
            r6.moveTo(r7, r5)
            r7 = 2
            r5.setOrientation(r7)
            r3.remove(r6)
        L_0x0303:
            int r4 = r4 + 1
            goto L_0x02da
        L_0x0306:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x030f
            r1 = 0
            return r1
        L_0x030f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L_0x0351
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x031d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0342
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup r4 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup) r4
            int r5 = r4.getOrientation()
            r7 = 1
            if (r5 != r7) goto L_0x0331
            goto L_0x031d
        L_0x0331:
            r5 = 0
            r4.setAuthoritative(r5)
            androidx.constraintlayout.solver.LinearSystem r7 = r16.getSystem()
            int r7 = r4.measureWrap((androidx.constraintlayout.solver.LinearSystem) r7, (int) r5)
            if (r7 <= r6) goto L_0x031d
            r2 = r4
            r6 = r7
            goto L_0x031d
        L_0x0342:
            if (r2 == 0) goto L_0x0351
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.setHorizontalDimensionBehaviour(r1)
            r0.setWidth(r6)
            r1 = 1
            r2.setAuthoritative(r1)
            goto L_0x0352
        L_0x0351:
            r2 = r12
        L_0x0352:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r4) goto L_0x0396
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x0360:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0385
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup r4 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup) r4
            int r5 = r4.getOrientation()
            if (r5 != 0) goto L_0x0373
            goto L_0x0360
        L_0x0373:
            r5 = 0
            r4.setAuthoritative(r5)
            androidx.constraintlayout.solver.LinearSystem r7 = r16.getSystem()
            r8 = 1
            int r7 = r4.measureWrap((androidx.constraintlayout.solver.LinearSystem) r7, (int) r8)
            if (r7 <= r6) goto L_0x0360
            r3 = r4
            r6 = r7
            goto L_0x0360
        L_0x0385:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x0398
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.setVerticalDimensionBehaviour(r1)
            r0.setHeight(r6)
            r3.setAuthoritative(r8)
            r4 = r3
            goto L_0x0399
        L_0x0396:
            r5 = 0
            r8 = 1
        L_0x0398:
            r4 = r12
        L_0x0399:
            if (r2 != 0) goto L_0x03a0
            if (r4 == 0) goto L_0x039e
            goto L_0x03a0
        L_0x039e:
            r3 = r5
            goto L_0x03a1
        L_0x03a0:
            r3 = r8
        L_0x03a1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.Grouping.simpleSolvingPass(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean validInGroup(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r5, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r6, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r7, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r8) {
        /*
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r1
            goto L_0x0014
        L_0x0013:
            r5 = r2
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = r1
            goto L_0x0024
        L_0x0023:
            r6 = r2
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.Grouping.validInGroup(androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour):boolean");
    }
}
