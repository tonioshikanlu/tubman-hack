package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.ConstraintReference;
import androidx.constraintlayout.solver.state.State;
import java.util.Iterator;

public class HorizontalChainReference extends ChainReference {
    private Object mEndToEnd;
    private Object mEndToStart;
    private Object mStartToEnd;
    private Object mStartToStart;

    /* renamed from: androidx.constraintlayout.solver.state.helpers.HorizontalChainReference$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$state$State$Chain;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
        static {
            /*
                androidx.constraintlayout.solver.state.State.Chain.values()
                r0 = 3
                int[] r1 = new int[r0]
                $SwitchMap$androidx$constraintlayout$solver$state$State$Chain = r1
                r2 = 1
                androidx.constraintlayout.solver.state.State$Chain r3 = androidx.constraintlayout.solver.state.State.Chain.SPREAD     // Catch:{ NoSuchFieldError -> 0x000e }
                r3 = 0
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 2
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$state$State$Chain     // Catch:{ NoSuchFieldError -> 0x0015 }
                androidx.constraintlayout.solver.state.State$Chain r4 = androidx.constraintlayout.solver.state.State.Chain.SPREAD_INSIDE     // Catch:{ NoSuchFieldError -> 0x0015 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$state$State$Chain     // Catch:{ NoSuchFieldError -> 0x001b }
                androidx.constraintlayout.solver.state.State$Chain r3 = androidx.constraintlayout.solver.state.State.Chain.PACKED     // Catch:{ NoSuchFieldError -> 0x001b }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001b }
            L_0x001b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.state.helpers.HorizontalChainReference.AnonymousClass1.<clinit>():void");
        }
    }

    public HorizontalChainReference(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    public void apply() {
        Iterator<Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            this.mState.constraints(it.next()).clearHorizontal();
        }
        Iterator<Object> it2 = this.mReferences.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            ConstraintReference constraints = this.mState.constraints(it2.next());
            if (constraintReference2 == null) {
                Object obj = this.mStartToStart;
                if (obj == null) {
                    Object obj2 = this.mStartToEnd;
                    if (obj2 != null) {
                        constraints.startToEnd(obj2);
                        constraintReference2 = constraints;
                    } else {
                        obj = State.PARENT;
                    }
                }
                constraints.startToStart(obj);
                constraintReference2 = constraints;
            }
            if (constraintReference != null) {
                constraintReference.endToStart(constraints.getKey());
                constraints.startToEnd(constraintReference.getKey());
            }
            constraintReference = constraints;
        }
        if (constraintReference != null) {
            Object obj3 = this.mEndToStart;
            if (obj3 != null) {
                constraintReference.endToStart(obj3);
            } else {
                Object obj4 = this.mEndToEnd;
                if (obj4 == null) {
                    obj4 = State.PARENT;
                }
                constraintReference.endToEnd(obj4);
            }
        }
        if (constraintReference2 != null) {
            float f = this.mBias;
            if (f != 0.5f) {
                constraintReference2.horizontalBias(f);
            }
        }
        int ordinal = this.mStyle.ordinal();
        if (ordinal != 0) {
            int i2 = 1;
            if (ordinal != 1) {
                i2 = 2;
                if (ordinal != 2) {
                    return;
                }
            }
            constraintReference2.setHorizontalChainStyle(i2);
            return;
        }
        constraintReference2.setHorizontalChainStyle(0);
    }

    public void endToEnd(Object obj) {
        this.mEndToEnd = obj;
    }

    public void endToStart(Object obj) {
        this.mEndToStart = obj;
    }

    public void startToEnd(Object obj) {
        this.mStartToEnd = obj;
    }

    public void startToStart(Object obj) {
        this.mStartToStart = obj;
    }
}
