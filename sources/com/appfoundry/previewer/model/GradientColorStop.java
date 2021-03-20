package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class GradientColorStop {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7119b;

    public GradientColorStop(String str, float f) {
        this.a = str;
        this.f7119b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientColorStop)) {
            return false;
        }
        GradientColorStop gradientColorStop = (GradientColorStop) obj;
        return i.a(this.a, gradientColorStop.a) && Float.compare(this.f7119b, gradientColorStop.f7119b) == 0;
    }

    public int hashCode() {
        String str = this.a;
        return Float.hashCode(this.f7119b) + ((str != null ? str.hashCode() : 0) * 31);
    }

    public String toString() {
        StringBuilder y = a.y("GradientColorStop(color=");
        y.append(this.a);
        y.append(", position=");
        y.append(this.f7119b);
        y.append(")");
        return y.toString();
    }
}
