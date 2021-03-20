package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class UploadFile {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7182b;
    public final String c;
    public final Integer d;

    public UploadFile(String str, String str2, String str3, Integer num) {
        this.a = str;
        this.f7182b = str2;
        this.c = str3;
        this.d = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadFile)) {
            return false;
        }
        UploadFile uploadFile = (UploadFile) obj;
        return i.a(this.a, uploadFile.a) && i.a(this.f7182b, uploadFile.f7182b) && i.a(this.c, uploadFile.c) && i.a(this.d, uploadFile.d);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7182b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.d;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("UploadFile(originalname=");
        y.append(this.a);
        y.append(", mimetype=");
        y.append(this.f7182b);
        y.append(", url=");
        y.append(this.c);
        y.append(", size=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
