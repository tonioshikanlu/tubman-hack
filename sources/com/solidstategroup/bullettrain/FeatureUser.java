package com.solidstategroup.bullettrain;

import b.e.a.a.a;

public class FeatureUser {
    private String identifier;

    public boolean canEqual(Object obj) {
        return obj instanceof FeatureUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeatureUser)) {
            return false;
        }
        FeatureUser featureUser = (FeatureUser) obj;
        if (!featureUser.canEqual(this)) {
            return false;
        }
        String identifier2 = getIdentifier();
        String identifier3 = featureUser.getIdentifier();
        return identifier2 != null ? identifier2.equals(identifier3) : identifier3 == null;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        String identifier2 = getIdentifier();
        return 59 + (identifier2 == null ? 43 : identifier2.hashCode());
    }

    public void setIdentifier(String str) {
        this.identifier = str;
    }

    public String toString() {
        StringBuilder y = a.y("FeatureUser(identifier=");
        y.append(getIdentifier());
        y.append(")");
        return y.toString();
    }
}
