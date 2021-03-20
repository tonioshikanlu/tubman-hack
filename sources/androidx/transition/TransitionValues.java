package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import b.e.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TransitionValues {
    public final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();
    public final Map<String, Object> values = new HashMap();
    public View view;

    @Deprecated
    public TransitionValues() {
    }

    public TransitionValues(@NonNull View view2) {
        this.view = view2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    public String toString() {
        StringBuilder y = a.y("TransitionValues@");
        y.append(Integer.toHexString(hashCode()));
        y.append(":\n");
        StringBuilder B = a.B(y.toString(), "    view = ");
        B.append(this.view);
        B.append("\n");
        String m2 = a.m(B.toString(), "    values:");
        for (String next : this.values.keySet()) {
            m2 = m2 + "    " + next + ": " + this.values.get(next) + "\n";
        }
        return m2;
    }
}
