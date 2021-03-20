package com.solidstategroup.bullettrain;

import b.j.a.a.o;
import b.j.a.a.p;
import b.j.a.a.r;
import b.j.a.a.u;
import b.j.a.b.j;
import java.io.Serializable;

@r(r.a.NON_NULL)
@p(ignoreUnknown = true)
public class Flag implements Serializable {
    private boolean enabled;
    private Feature feature;
    @u("feature_state_value")
    private String stateValue;

    @o
    private void fromPrototype(Flag flag) {
        setFeature(flag.getFeature());
        setStateValue(flag.getStateValue());
        setEnabled(flag.isEnabled());
    }

    public boolean canEqual(Object obj) {
        return obj instanceof Flag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Flag)) {
            return false;
        }
        Flag flag = (Flag) obj;
        if (!flag.canEqual(this)) {
            return false;
        }
        Feature feature2 = getFeature();
        Feature feature3 = flag.getFeature();
        if (feature2 != null ? !feature2.equals(feature3) : feature3 != null) {
            return false;
        }
        String stateValue2 = getStateValue();
        String stateValue3 = flag.getStateValue();
        if (stateValue2 != null ? stateValue2.equals(stateValue3) : stateValue3 == null) {
            return isEnabled() == flag.isEnabled();
        }
        return false;
    }

    public Feature getFeature() {
        return this.feature;
    }

    public String getStateValue() {
        return this.stateValue;
    }

    public int hashCode() {
        Feature feature2 = getFeature();
        int i2 = 43;
        int hashCode = feature2 == null ? 43 : feature2.hashCode();
        String stateValue2 = getStateValue();
        int i3 = (hashCode + 59) * 59;
        if (stateValue2 != null) {
            i2 = stateValue2.hashCode();
        }
        return ((i3 + i2) * 59) + (isEnabled() ? 79 : 97);
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    @o
    public void parse(String str) {
        fromPrototype((Flag) MapperFactory.getMappper().g(str, Flag.class));
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setFeature(Feature feature2) {
        this.feature = feature2;
    }

    public void setStateValue(String str) {
        this.stateValue = str;
    }

    @o
    public String toString() {
        try {
            return MapperFactory.getMappper().h(this);
        } catch (j unused) {
            return super.toString();
        }
    }
}
