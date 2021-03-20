package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Resolution {
    public final Integer a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f7154b;

    public Resolution(Integer num, Integer num2) {
        this.a = num;
        this.f7154b = num2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resolution)) {
            return false;
        }
        Resolution resolution = (Resolution) obj;
        return i.a(this.a, resolution.a) && i.a(this.f7154b, resolution.f7154b);
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f7154b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Resolution(width=");
        y.append(this.a);
        y.append(", height=");
        y.append(this.f7154b);
        y.append(")");
        return y.toString();
    }
}
