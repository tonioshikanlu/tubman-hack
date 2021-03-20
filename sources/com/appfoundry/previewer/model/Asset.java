package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import com.segment.analytics.AnalyticsContext;
import e.x.c.i;

@m(generateAdapter = true)
public final class Asset {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public String f7065b;
    public final String c;
    public final Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7066e;
    public final Resolution f;

    public Asset(String str, String str2, String str3, Boolean bool, String str4, Resolution resolution) {
        i.e(str, AnalyticsContext.Device.DEVICE_ID_KEY);
        this.a = str;
        this.f7065b = str2;
        this.c = str3;
        this.d = bool;
        this.f7066e = str4;
        this.f = resolution;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return i.a(this.a, asset.a) && i.a(this.f7065b, asset.f7065b) && i.a(this.c, asset.c) && i.a(this.d, asset.d) && i.a(this.f7066e, asset.f7066e) && i.a(this.f, asset.f);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7065b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.f7066e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Resolution resolution = this.f;
        if (resolution != null) {
            i2 = resolution.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Asset(id=");
        y.append(this.a);
        y.append(", url=");
        y.append(this.f7065b);
        y.append(", thumbUrl=");
        y.append(this.c);
        y.append(", preload=");
        y.append(this.d);
        y.append(", type=");
        y.append(this.f7066e);
        y.append(", originalSize=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
