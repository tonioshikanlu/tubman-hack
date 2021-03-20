package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class AuthInfoFromBackend {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7067b;
    public final Boolean c;
    public final AuthSettings d;

    public AuthInfoFromBackend(String str, String str2, Boolean bool, AuthSettings authSettings) {
        this.a = str;
        this.f7067b = str2;
        this.c = bool;
        this.d = authSettings;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthInfoFromBackend)) {
            return false;
        }
        AuthInfoFromBackend authInfoFromBackend = (AuthInfoFromBackend) obj;
        return i.a(this.a, authInfoFromBackend.a) && i.a(this.f7067b, authInfoFromBackend.f7067b) && i.a(this.c, authInfoFromBackend.c) && i.a(this.d, authInfoFromBackend.d);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7067b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        AuthSettings authSettings = this.d;
        if (authSettings != null) {
            i2 = authSettings.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("AuthInfoFromBackend(collectionId=");
        y.append(this.a);
        y.append(", type=");
        y.append(this.f7067b);
        y.append(", interactive=");
        y.append(this.c);
        y.append(", settings=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
