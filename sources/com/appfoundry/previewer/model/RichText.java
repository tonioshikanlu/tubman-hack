package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class RichText {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7157b;
    public final String c;

    public RichText(String str, String str2, String str3) {
        this.a = str;
        this.f7157b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichText)) {
            return false;
        }
        RichText richText = (RichText) obj;
        return i.a(this.a, richText.a) && i.a(this.f7157b, richText.f7157b) && i.a(this.c, richText.c);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7157b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("RichText(text=");
        y.append(this.a);
        y.append(", styleId=");
        y.append(this.f7157b);
        y.append(", anchor=");
        return a.q(y, this.c, ")");
    }
}
