package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class ResponseBody {
    public final Integer a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7155b;
    public final String c;
    public final String d;

    public ResponseBody(Integer num, String str, String str2, String str3) {
        this.a = num;
        this.f7155b = str;
        this.c = str2;
        this.d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseBody)) {
            return false;
        }
        ResponseBody responseBody = (ResponseBody) obj;
        return i.a(this.a, responseBody.a) && i.a(this.f7155b, responseBody.f7155b) && i.a(this.c, responseBody.c) && i.a(this.d, responseBody.d);
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f7155b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("ResponseBody(statusCode=");
        y.append(this.a);
        y.append(", message=");
        y.append(this.f7155b);
        y.append(", reason=");
        y.append(this.c);
        y.append(", error=");
        return a.q(y, this.d, ")");
    }
}
