package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Shadow {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Float f7158b;
    public final ShadowOffset c;

    public Shadow(String str, Float f, ShadowOffset shadowOffset) {
        this.a = str;
        this.f7158b = f;
        this.c = shadowOffset;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return i.a(this.a, shadow.a) && i.a(this.f7158b, shadow.f7158b) && i.a(this.c, shadow.c);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Float f = this.f7158b;
        int hashCode2 = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        ShadowOffset shadowOffset = this.c;
        if (shadowOffset != null) {
            i2 = shadowOffset.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Shadow(color=");
        y.append(this.a);
        y.append(", radius=");
        y.append(this.f7158b);
        y.append(", offset=");
        y.append(this.c);
        y.append(")");
        return y.toString();
    }
}
