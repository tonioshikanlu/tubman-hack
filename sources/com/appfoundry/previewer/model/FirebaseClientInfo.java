package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class FirebaseClientInfo {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseAndroidClientInfo f7115b;

    public FirebaseClientInfo(String str, FirebaseAndroidClientInfo firebaseAndroidClientInfo) {
        this.a = str;
        this.f7115b = firebaseAndroidClientInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseClientInfo)) {
            return false;
        }
        FirebaseClientInfo firebaseClientInfo = (FirebaseClientInfo) obj;
        return i.a(this.a, firebaseClientInfo.a) && i.a(this.f7115b, firebaseClientInfo.f7115b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        FirebaseAndroidClientInfo firebaseAndroidClientInfo = this.f7115b;
        if (firebaseAndroidClientInfo != null) {
            i2 = firebaseAndroidClientInfo.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("FirebaseClientInfo(mobilesdk_app_id=");
        y.append(this.a);
        y.append(", android_client_info=");
        y.append(this.f7115b);
        y.append(")");
        return y.toString();
    }
}
