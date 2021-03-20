package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Integration {
    public final OneSignal a;

    /* renamed from: b  reason: collision with root package name */
    public final Firebase f7120b;

    public Integration(OneSignal oneSignal, Firebase firebase) {
        this.a = oneSignal;
        this.f7120b = firebase;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Integration)) {
            return false;
        }
        Integration integration = (Integration) obj;
        return i.a(this.a, integration.a) && i.a(this.f7120b, integration.f7120b);
    }

    public int hashCode() {
        OneSignal oneSignal = this.a;
        int i2 = 0;
        int hashCode = (oneSignal != null ? oneSignal.hashCode() : 0) * 31;
        Firebase firebase = this.f7120b;
        if (firebase != null) {
            i2 = firebase.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Integration(oneSignal=");
        y.append(this.a);
        y.append(", firebase=");
        y.append(this.f7120b);
        y.append(")");
        return y.toString();
    }
}
