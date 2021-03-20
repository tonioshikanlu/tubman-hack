package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.HelperReference;
import androidx.constraintlayout.solver.state.State;

public class ChainReference extends HelperReference {
    public float mBias = 0.5f;
    public State.Chain mStyle = State.Chain.SPREAD;

    public ChainReference(State state, State.Helper helper) {
        super(state, helper);
    }

    public void bias(float f) {
        this.mBias = f;
    }

    public float getBias() {
        return this.mBias;
    }

    public State.Chain getStyle() {
        return State.Chain.SPREAD;
    }

    public void style(State.Chain chain) {
        this.mStyle = chain;
    }
}
