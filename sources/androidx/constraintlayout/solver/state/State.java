package androidx.constraintlayout.solver.state;

import androidx.constraintlayout.solver.state.helpers.AlignHorizontallyReference;
import androidx.constraintlayout.solver.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.solver.state.helpers.BarrierReference;
import androidx.constraintlayout.solver.state.helpers.GuidelineReference;
import androidx.constraintlayout.solver.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.solver.state.helpers.VerticalChainReference;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import b.e.a.a.a;
import java.util.HashMap;
import java.util.Iterator;

public class State {
    public static final int CONSTRAINT_RATIO = 2;
    public static final int CONSTRAINT_SPREAD = 0;
    public static final int CONSTRAINT_WRAP = 1;
    public static final Integer PARENT = 0;
    public static final int UNKNOWN = -1;
    public HashMap<Object, HelperReference> mHelperReferences = new HashMap<>();
    public final ConstraintReference mParent;
    public HashMap<Object, Reference> mReferences = new HashMap<>();
    private int numHelpers;

    /* renamed from: androidx.constraintlayout.solver.state.State$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$state$State$Helper;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
        static {
            /*
                androidx.constraintlayout.solver.state.State.Helper.values()
                r0 = 7
                int[] r0 = new int[r0]
                $SwitchMap$androidx$constraintlayout$solver$state$State$Helper = r0
                r1 = 1
                androidx.constraintlayout.solver.state.State$Helper r2 = androidx.constraintlayout.solver.state.State.Helper.HORIZONTAL_CHAIN     // Catch:{ NoSuchFieldError -> 0x000e }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r0 = 2
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$state$State$Helper     // Catch:{ NoSuchFieldError -> 0x0015 }
                androidx.constraintlayout.solver.state.State$Helper r3 = androidx.constraintlayout.solver.state.State.Helper.VERTICAL_CHAIN     // Catch:{ NoSuchFieldError -> 0x0015 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                r1 = 3
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$state$State$Helper     // Catch:{ NoSuchFieldError -> 0x001c }
                androidx.constraintlayout.solver.state.State$Helper r3 = androidx.constraintlayout.solver.state.State.Helper.ALIGN_HORIZONTALLY     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r0 = 4
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$state$State$Helper     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.constraintlayout.solver.state.State$Helper r3 = androidx.constraintlayout.solver.state.State.Helper.ALIGN_VERTICALLY     // Catch:{ NoSuchFieldError -> 0x0023 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r1 = $SwitchMap$androidx$constraintlayout$solver$state$State$Helper     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.state.State$Helper r2 = androidx.constraintlayout.solver.state.State.Helper.BARRIER     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 5
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.state.State.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY
    }

    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public State() {
        ConstraintReference constraintReference = new ConstraintReference(this);
        this.mParent = constraintReference;
        this.numHelpers = 0;
        this.mReferences.put(PARENT, constraintReference);
    }

    private String createHelperKey() {
        StringBuilder y = a.y("__HELPER_KEY_");
        int i2 = this.numHelpers;
        this.numHelpers = i2 + 1;
        return a.o(y, i2, "__");
    }

    public void apply(ConstraintWidgetContainer constraintWidgetContainer) {
        constraintWidgetContainer.removeAllChildren();
        this.mParent.getWidth().apply(this, constraintWidgetContainer, 0);
        this.mParent.getHeight().apply(this, constraintWidgetContainer, 1);
        for (Object next : this.mHelperReferences.keySet()) {
            HelperWidget helperWidget = this.mHelperReferences.get(next).getHelperWidget();
            if (helperWidget != null) {
                Reference reference = this.mReferences.get(next);
                if (reference == null) {
                    reference = constraints(next);
                }
                reference.setConstraintWidget(helperWidget);
            }
        }
        for (Object obj : this.mReferences.keySet()) {
            Reference reference2 = this.mReferences.get(obj);
            if (reference2 != this.mParent) {
                ConstraintWidget constraintWidget = reference2.getConstraintWidget();
                constraintWidget.setParent((ConstraintWidget) null);
                if (reference2 instanceof GuidelineReference) {
                    reference2.apply();
                }
                constraintWidgetContainer.add(constraintWidget);
            } else {
                reference2.setConstraintWidget(constraintWidgetContainer);
            }
        }
        for (Object obj2 : this.mHelperReferences.keySet()) {
            HelperReference helperReference = this.mHelperReferences.get(obj2);
            if (helperReference.getHelperWidget() != null) {
                Iterator<Object> it = helperReference.mReferences.iterator();
                while (it.hasNext()) {
                    helperReference.getHelperWidget().add(this.mReferences.get(it.next()).getConstraintWidget());
                }
                helperReference.apply();
            }
        }
        for (Object obj3 : this.mReferences.keySet()) {
            this.mReferences.get(obj3).apply();
        }
    }

    public BarrierReference barrier(Object obj, Direction direction) {
        BarrierReference barrierReference = (BarrierReference) helper(obj, Helper.BARRIER);
        barrierReference.setBarrierDirection(direction);
        return barrierReference;
    }

    public AlignHorizontallyReference centerHorizontally(Object... objArr) {
        AlignHorizontallyReference alignHorizontallyReference = (AlignHorizontallyReference) helper((Object) null, Helper.ALIGN_HORIZONTALLY);
        alignHorizontallyReference.add(objArr);
        return alignHorizontallyReference;
    }

    public AlignVerticallyReference centerVertically(Object... objArr) {
        AlignVerticallyReference alignVerticallyReference = (AlignVerticallyReference) helper((Object) null, Helper.ALIGN_VERTICALLY);
        alignVerticallyReference.add(objArr);
        return alignVerticallyReference;
    }

    public ConstraintReference constraints(Object obj) {
        Reference reference = this.mReferences.get(obj);
        if (reference == null) {
            reference = createConstraintReference(obj);
            this.mReferences.put(obj, reference);
            reference.setKey(obj);
        }
        if (reference instanceof ConstraintReference) {
            return (ConstraintReference) reference;
        }
        return null;
    }

    public int convertDimension(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public ConstraintReference createConstraintReference(Object obj) {
        return new ConstraintReference(this);
    }

    public void directMapping() {
        for (Object next : this.mReferences.keySet()) {
            constraints(next).setView(next);
        }
    }

    public GuidelineReference guideline(Object obj, int i2) {
        Reference reference = this.mReferences.get(obj);
        GuidelineReference guidelineReference = reference;
        if (reference == null) {
            GuidelineReference guidelineReference2 = new GuidelineReference(this);
            guidelineReference2.setOrientation(i2);
            guidelineReference2.setKey(obj);
            this.mReferences.put(obj, guidelineReference2);
            guidelineReference = guidelineReference2;
        }
        return (GuidelineReference) guidelineReference;
    }

    public State height(Dimension dimension) {
        return setHeight(dimension);
    }

    public HelperReference helper(Object obj, Helper helper) {
        HelperReference helperReference;
        if (obj == null) {
            obj = createHelperKey();
        }
        HelperReference helperReference2 = this.mHelperReferences.get(obj);
        if (helperReference2 == null) {
            int ordinal = helper.ordinal();
            if (ordinal == 0) {
                helperReference = new HorizontalChainReference(this);
            } else if (ordinal == 1) {
                helperReference = new VerticalChainReference(this);
            } else if (ordinal == 2) {
                helperReference = new AlignHorizontallyReference(this);
            } else if (ordinal == 3) {
                helperReference = new AlignVerticallyReference(this);
            } else if (ordinal != 4) {
                helperReference2 = new HelperReference(this, helper);
                this.mHelperReferences.put(obj, helperReference2);
            } else {
                helperReference = new BarrierReference(this);
            }
            helperReference2 = helperReference;
            this.mHelperReferences.put(obj, helperReference2);
        }
        return helperReference2;
    }

    public HorizontalChainReference horizontalChain(Object... objArr) {
        HorizontalChainReference horizontalChainReference = (HorizontalChainReference) helper((Object) null, Helper.HORIZONTAL_CHAIN);
        horizontalChainReference.add(objArr);
        return horizontalChainReference;
    }

    public GuidelineReference horizontalGuideline(Object obj) {
        return guideline(obj, 0);
    }

    public void map(Object obj, Object obj2) {
        constraints(obj).setView(obj2);
    }

    public Reference reference(Object obj) {
        return this.mReferences.get(obj);
    }

    public void reset() {
        this.mHelperReferences.clear();
    }

    public State setHeight(Dimension dimension) {
        this.mParent.setHeight(dimension);
        return this;
    }

    public State setWidth(Dimension dimension) {
        this.mParent.setWidth(dimension);
        return this;
    }

    public VerticalChainReference verticalChain(Object... objArr) {
        VerticalChainReference verticalChainReference = (VerticalChainReference) helper((Object) null, Helper.VERTICAL_CHAIN);
        verticalChainReference.add(objArr);
        return verticalChainReference;
    }

    public GuidelineReference verticalGuideline(Object obj) {
        return guideline(obj, 1);
    }

    public State width(Dimension dimension) {
        return setWidth(dimension);
    }
}
