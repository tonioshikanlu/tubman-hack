package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class ErrorData {
    public final Integer a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7110b;

    public ErrorData(Integer num, String str) {
        this.a = num;
        this.f7110b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorData)) {
            return false;
        }
        ErrorData errorData = (ErrorData) obj;
        return i.a(this.a, errorData.a) && i.a(this.f7110b, errorData.f7110b);
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f7110b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("ErrorData(statusCode=");
        y.append(this.a);
        y.append(", pageState=");
        return a.q(y, this.f7110b, ")");
    }
}
