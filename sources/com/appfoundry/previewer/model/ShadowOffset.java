package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class ShadowOffset {
    public final Float a;

    /* renamed from: b  reason: collision with root package name */
    public final Float f7159b;

    public ShadowOffset(Float f, Float f2) {
        this.a = f;
        this.f7159b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowOffset)) {
            return false;
        }
        ShadowOffset shadowOffset = (ShadowOffset) obj;
        return i.a(this.a, shadowOffset.a) && i.a(this.f7159b, shadowOffset.f7159b);
    }

    public int hashCode() {
        Float f = this.a;
        int i2 = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f7159b;
        if (f2 != null) {
            i2 = f2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("ShadowOffset(x=");
        y.append(this.a);
        y.append(", y=");
        y.append(this.f7159b);
        y.append(")");
        return y.toString();
    }
}
