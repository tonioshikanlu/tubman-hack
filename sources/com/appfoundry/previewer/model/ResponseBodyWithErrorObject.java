package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class ResponseBodyWithErrorObject {
    public final Integer a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7156b;
    public final String c;
    public final ErrorData d;

    public ResponseBodyWithErrorObject(Integer num, String str, String str2, ErrorData errorData) {
        this.a = num;
        this.f7156b = str;
        this.c = str2;
        this.d = errorData;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseBodyWithErrorObject)) {
            return false;
        }
        ResponseBodyWithErrorObject responseBodyWithErrorObject = (ResponseBodyWithErrorObject) obj;
        return i.a(this.a, responseBodyWithErrorObject.a) && i.a(this.f7156b, responseBodyWithErrorObject.f7156b) && i.a(this.c, responseBodyWithErrorObject.c) && i.a(this.d, responseBodyWithErrorObject.d);
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f7156b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ErrorData errorData = this.d;
        if (errorData != null) {
            i2 = errorData.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("ResponseBodyWithErrorObject(statusCode=");
        y.append(this.a);
        y.append(", message=");
        y.append(this.f7156b);
        y.append(", reason=");
        y.append(this.c);
        y.append(", error=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
