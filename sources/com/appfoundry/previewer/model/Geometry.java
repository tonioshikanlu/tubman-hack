package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;

@m(generateAdapter = true)
public final class Geometry {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Float> f7118b;

    public Geometry(String str, List<Float> list) {
        this.a = str;
        this.f7118b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Geometry)) {
            return false;
        }
        Geometry geometry = (Geometry) obj;
        return i.a(this.a, geometry.a) && i.a(this.f7118b, geometry.f7118b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Float> list = this.f7118b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Geometry(type=");
        y.append(this.a);
        y.append(", coordinates=");
        y.append(this.f7118b);
        y.append(")");
        return y.toString();
    }
}
