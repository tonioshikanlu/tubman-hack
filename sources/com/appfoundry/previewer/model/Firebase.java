package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Firebase {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7113b;

    public Firebase(String str, String str2) {
        this.a = str;
        this.f7113b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Firebase)) {
            return false;
        }
        Firebase firebase = (Firebase) obj;
        return i.a(this.a, firebase.a) && i.a(this.f7113b, firebase.f7113b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7113b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Firebase(plist=");
        y.append(this.a);
        y.append(", json=");
        return a.q(y, this.f7113b, ")");
    }
}
