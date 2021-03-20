package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class BackendResponse {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Params f7073b;

    public BackendResponse(String str, Params params) {
        this.a = str;
        this.f7073b = params;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return i.a(this.a, backendResponse.a) && i.a(this.f7073b, backendResponse.f7073b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Params params = this.f7073b;
        if (params != null) {
            i2 = params.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("BackendResponse(action=");
        y.append(this.a);
        y.append(", params=");
        y.append(this.f7073b);
        y.append(")");
        return y.toString();
    }
}
