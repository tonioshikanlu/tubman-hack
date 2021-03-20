package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Marker {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Geometry f7125b;
    public final Properties c;

    public Marker(String str, Geometry geometry, Properties properties) {
        i.e(str, "type");
        this.a = str;
        this.f7125b = geometry;
        this.c = properties;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Marker)) {
            return false;
        }
        Marker marker = (Marker) obj;
        return i.a(this.a, marker.a) && i.a(this.f7125b, marker.f7125b) && i.a(this.c, marker.c);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Geometry geometry = this.f7125b;
        int hashCode2 = (hashCode + (geometry != null ? geometry.hashCode() : 0)) * 31;
        Properties properties = this.c;
        if (properties != null) {
            i2 = properties.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Marker(type=");
        y.append(this.a);
        y.append(", geometry=");
        y.append(this.f7125b);
        y.append(", properties=");
        y.append(this.c);
        y.append(")");
        return y.toString();
    }
}
