package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class UploadInfoResponse {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7183b;
    public final Integer c;

    public UploadInfoResponse(String str, String str2, Integer num) {
        this.a = str;
        this.f7183b = str2;
        this.c = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadInfoResponse)) {
            return false;
        }
        UploadInfoResponse uploadInfoResponse = (UploadInfoResponse) obj;
        return i.a(this.a, uploadInfoResponse.a) && i.a(this.f7183b, uploadInfoResponse.f7183b) && i.a(this.c, uploadInfoResponse.c);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7183b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.c;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("UploadInfoResponse(publicUrl=");
        y.append(this.a);
        y.append(", uploadUrl=");
        y.append(this.f7183b);
        y.append(", expiresIn=");
        y.append(this.c);
        y.append(")");
        return y.toString();
    }
}
