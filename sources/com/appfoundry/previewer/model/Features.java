package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Features {
    public final Boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f7112b;
    public final Boolean c;

    public Features(Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = bool;
        this.f7112b = bool2;
        this.c = bool3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Features)) {
            return false;
        }
        Features features = (Features) obj;
        return i.a(this.a, features.a) && i.a(this.f7112b, features.f7112b) && i.a(this.c, features.c);
    }

    public int hashCode() {
        Boolean bool = this.a;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.f7112b;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.c;
        if (bool3 != null) {
            i2 = bool3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Features(auth=");
        y.append(this.a);
        y.append(", audio=");
        y.append(this.f7112b);
        y.append(", watermark=");
        y.append(this.c);
        y.append(")");
        return y.toString();
    }
}
