package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class AuthSettings {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7068b;
    public final String c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7069e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7070g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7071h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7072i;

    public AuthSettings(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.f7068b = str2;
        this.c = str3;
        this.d = str4;
        this.f7069e = str5;
        this.f = str6;
        this.f7070g = str7;
        this.f7071h = str8;
        this.f7072i = str9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthSettings)) {
            return false;
        }
        AuthSettings authSettings = (AuthSettings) obj;
        return i.a(this.a, authSettings.a) && i.a(this.f7068b, authSettings.f7068b) && i.a(this.c, authSettings.c) && i.a(this.d, authSettings.d) && i.a(this.f7069e, authSettings.f7069e) && i.a(this.f, authSettings.f) && i.a(this.f7070g, authSettings.f7070g) && i.a(this.f7071h, authSettings.f7071h) && i.a(this.f7072i, authSettings.f7072i);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7068b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f7069e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f7070g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f7071h;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f7072i;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        return hashCode8 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("AuthSettings(grant=");
        y.append(this.a);
        y.append(", scope=");
        y.append(this.f7068b);
        y.append(", authUrl=");
        y.append(this.c);
        y.append(", clientId=");
        y.append(this.d);
        y.append(", tokenUrl=");
        y.append(this.f7069e);
        y.append(", callbackUrl=");
        y.append(this.f);
        y.append(", clientSecret=");
        y.append(this.f7070g);
        y.append(", json=");
        y.append(this.f7071h);
        y.append(", jsonVision=");
        return a.q(y, this.f7072i, ")");
    }
}
