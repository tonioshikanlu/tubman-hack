package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Coordinate {
    public final Float a;

    /* renamed from: b  reason: collision with root package name */
    public final Float f7107b;

    public Coordinate(Float f, Float f2) {
        this.a = f;
        this.f7107b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinate)) {
            return false;
        }
        Coordinate coordinate = (Coordinate) obj;
        return i.a(this.a, coordinate.a) && i.a(this.f7107b, coordinate.f7107b);
    }

    public int hashCode() {
        Float f = this.a;
        int i2 = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f7107b;
        if (f2 != null) {
            i2 = f2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Coordinate(x=");
        y.append(this.a);
        y.append(", y=");
        y.append(this.f7107b);
        y.append(")");
        return y.toString();
    }
}
