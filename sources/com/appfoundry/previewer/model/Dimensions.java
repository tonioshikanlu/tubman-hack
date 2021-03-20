package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Dimensions {
    public final Float a;

    /* renamed from: b  reason: collision with root package name */
    public final Float f7109b;
    public final Float c;
    public final Float d;

    public Dimensions(Float f, Float f2, Float f3, Float f4) {
        this.a = f;
        this.f7109b = f2;
        this.c = f3;
        this.d = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dimensions)) {
            return false;
        }
        Dimensions dimensions = (Dimensions) obj;
        return i.a(this.a, dimensions.a) && i.a(this.f7109b, dimensions.f7109b) && i.a(this.c, dimensions.c) && i.a(this.d, dimensions.d);
    }

    public int hashCode() {
        Float f = this.a;
        int i2 = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f7109b;
        int hashCode2 = (hashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.c;
        int hashCode3 = (hashCode2 + (f3 != null ? f3.hashCode() : 0)) * 31;
        Float f4 = this.d;
        if (f4 != null) {
            i2 = f4.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Dimensions(left=");
        y.append(this.a);
        y.append(", top=");
        y.append(this.f7109b);
        y.append(", right=");
        y.append(this.c);
        y.append(", bottom=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
