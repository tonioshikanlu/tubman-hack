package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class JsonApp {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7121b;
    public final String c;
    public final App d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f7122e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7123g;

    public JsonApp(String str, String str2, String str3, App app2, Integer num, String str4, String str5) {
        this.a = str;
        this.f7121b = str2;
        this.c = str3;
        this.d = app2;
        this.f7122e = num;
        this.f = str4;
        this.f7123g = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonApp)) {
            return false;
        }
        JsonApp jsonApp = (JsonApp) obj;
        return i.a(this.a, jsonApp.a) && i.a(this.f7121b, jsonApp.f7121b) && i.a(this.c, jsonApp.c) && i.a(this.d, jsonApp.d) && i.a(this.f7122e, jsonApp.f7122e) && i.a(this.f, jsonApp.f) && i.a(this.f7123g, jsonApp.f7123g);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7121b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        App app2 = this.d;
        int hashCode4 = (hashCode3 + (app2 != null ? app2.hashCode() : 0)) * 31;
        Integer num = this.f7122e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f7123g;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode6 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("JsonApp(id=");
        y.append(this.a);
        y.append(", hash=");
        y.append(this.f7121b);
        y.append(", lastUpdate=");
        y.append(this.c);
        y.append(", app=");
        y.append(this.d);
        y.append(", statusCode=");
        y.append(this.f7122e);
        y.append(", message=");
        y.append(this.f);
        y.append(", error=");
        return a.q(y, this.f7123g, ")");
    }
}
