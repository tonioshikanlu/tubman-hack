package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;

@m(generateAdapter = true)
public final class Paywall {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f7152b;

    public Paywall(String str, List<String> list) {
        this.a = str;
        this.f7152b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Paywall)) {
            return false;
        }
        Paywall paywall = (Paywall) obj;
        return i.a(this.a, paywall.a) && i.a(this.f7152b, paywall.f7152b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f7152b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Paywall(message=");
        y.append(this.a);
        y.append(", features=");
        y.append(this.f7152b);
        y.append(")");
        return y.toString();
    }
}
