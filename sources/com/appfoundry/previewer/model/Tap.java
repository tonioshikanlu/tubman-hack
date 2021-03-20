package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Tap {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Params f7181b;

    public Tap(String str, Params params) {
        this.a = str;
        this.f7181b = params;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tap)) {
            return false;
        }
        Tap tap = (Tap) obj;
        return i.a(this.a, tap.a) && i.a(this.f7181b, tap.f7181b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Params params = this.f7181b;
        if (params != null) {
            i2 = params.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Tap(action=");
        y.append(this.a);
        y.append(", params=");
        y.append(this.f7181b);
        y.append(")");
        return y.toString();
    }
}
