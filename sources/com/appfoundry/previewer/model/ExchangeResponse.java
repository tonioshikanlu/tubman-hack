package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class ExchangeResponse {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7111b;

    public ExchangeResponse(int i2, String str) {
        i.e(str, "response");
        this.a = i2;
        this.f7111b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeResponse)) {
            return false;
        }
        ExchangeResponse exchangeResponse = (ExchangeResponse) obj;
        return this.a == exchangeResponse.a && i.a(this.f7111b, exchangeResponse.f7111b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.f7111b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = a.y("ExchangeResponse(statusCode=");
        y.append(this.a);
        y.append(", response=");
        return a.q(y, this.f7111b, ")");
    }
}
