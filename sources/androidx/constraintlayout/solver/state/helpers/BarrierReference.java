package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.HelperReference;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.solver.widgets.Barrier;
import androidx.constraintlayout.solver.widgets.HelperWidget;

public class BarrierReference extends HelperReference {
    private Barrier mBarrierWidget;
    private State.Direction mDirection;
    private int mMargin;

    /* renamed from: androidx.constraintlayout.solver.state.helpers.BarrierReference$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$state$State$Direction;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|7|8|9|11|12|13|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        static {
            /*
                androidx.constraintlayout.solver.state.State.Direction.values()
                r0 = 6
                int[] r1 = new int[r0]
                $SwitchMap$androidx$constraintlayout$solver$state$State$Direction = r1
                r2 = 1
                androidx.constraintlayout.solver.state.State$Direction r3 = androidx.constraintlayout.solver.state.State.Direction.LEFT     // Catch:{ NoSuchFieldError -> 0x000e }
                r3 = 0
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                int[] r1 = $SwitchMap$androidx$constraintlayout$solver$state$State$Direction     // Catch:{ NoSuchFieldError -> 0x0015 }
                androidx.constraintlayout.solver.state.State$Direction r3 = androidx.constraintlayout.solver.state.State.Direction.START     // Catch:{ NoSuchFieldError -> 0x0015 }
                r3 = 2
                r1[r3] = r3     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                r1 = 3
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Direction     // Catch:{ NoSuchFieldError -> 0x001c }
                androidx.constraintlayout.solver.state.State$Direction r4 = androidx.constraintlayout.solver.state.State.Direction.RIGHT     // Catch:{ NoSuchFieldError -> 0x001c }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 4
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Direction     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.constraintlayout.solver.state.State$Direction r4 = androidx.constraintlayout.solver.state.State.Direction.END     // Catch:{ NoSuchFieldError -> 0x0023 }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                r1 = 5
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Direction     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.state.State$Direction r4 = androidx.constraintlayout.solver.state.State.Direction.TOP     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$state$State$Direction     // Catch:{ NoSuchFieldError -> 0x0030 }
                androidx.constraintlayout.solver.state.State$Direction r3 = androidx.constraintlayout.solver.state.State.Direction.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0030 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0030 }
            L_0x0030:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.state.helpers.BarrierReference.AnonymousClass1.<clinit>():void");
        }
    }

    public BarrierReference(State state) {
        super(state, State.Helper.BARRIER);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != 5) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void apply() {
        /*
            r5 = this;
            r5.getHelperWidget()
            androidx.constraintlayout.solver.state.State$Direction r0 = r5.mDirection
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x001b
            if (r0 == r3) goto L_0x001f
            if (r0 == r2) goto L_0x001b
            if (r0 == r1) goto L_0x001f
            r3 = 4
            if (r0 == r3) goto L_0x001d
            r2 = 5
            if (r0 == r2) goto L_0x0020
        L_0x001b:
            r1 = r4
            goto L_0x0020
        L_0x001d:
            r1 = r2
            goto L_0x0020
        L_0x001f:
            r1 = r3
        L_0x0020:
            androidx.constraintlayout.solver.widgets.Barrier r0 = r5.mBarrierWidget
            r0.setBarrierType(r1)
            androidx.constraintlayout.solver.widgets.Barrier r0 = r5.mBarrierWidget
            int r1 = r5.mMargin
            r0.setMargin(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.state.helpers.BarrierReference.apply():void");
    }

    public HelperWidget getHelperWidget() {
        if (this.mBarrierWidget == null) {
            this.mBarrierWidget = new Barrier();
        }
        return this.mBarrierWidget;
    }

    public void margin(int i2) {
        this.mMargin = i2;
    }

    public void margin(Object obj) {
        margin(this.mState.convertDimension(obj));
    }

    public void setBarrierDirection(State.Direction direction) {
        this.mDirection = direction;
    }
}
