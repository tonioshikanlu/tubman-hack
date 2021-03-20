package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class BravoIdTokenResponseFromBackend {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7081b;
    public final String c;
    public final String d;

    public BravoIdTokenResponseFromBackend(String str, String str2, String str3, String str4) {
        this.a = str;
        this.f7081b = str2;
        this.c = str3;
        this.d = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BravoIdTokenResponseFromBackend)) {
            return false;
        }
        BravoIdTokenResponseFromBackend bravoIdTokenResponseFromBackend = (BravoIdTokenResponseFromBackend) obj;
        return i.a(this.a, bravoIdTokenResponseFromBackend.a) && i.a(this.f7081b, bravoIdTokenResponseFromBackend.f7081b) && i.a(this.c, bravoIdTokenResponseFromBackend.c) && i.a(this.d, bravoIdTokenResponseFromBackend.d);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7081b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("BravoIdTokenResponseFromBackend(id=");
        y.append(this.a);
        y.append(", email=");
        y.append(this.f7081b);
        y.append(", name=");
        y.append(this.c);
        y.append(", token=");
        return a.q(y, this.d, ")");
    }
}
