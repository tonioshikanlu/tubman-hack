package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Properties {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7153b;
    public final String c;

    public Properties(String str, String str2, String str3) {
        this.a = str;
        this.f7153b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Properties)) {
            return false;
        }
        Properties properties = (Properties) obj;
        return i.a(this.a, properties.a) && i.a(this.f7153b, properties.f7153b) && i.a(this.c, properties.c);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7153b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Properties(icon=");
        y.append(this.a);
        y.append(", link=");
        y.append(this.f7153b);
        y.append(", name=");
        return a.q(y, this.c, ")");
    }
}
