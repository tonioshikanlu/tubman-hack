package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class FirebaseProjectInfo {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7117b;
    public final String c;
    public final String d;

    public FirebaseProjectInfo(String str, String str2, String str3, String str4) {
        this.a = str;
        this.f7117b = str2;
        this.c = str3;
        this.d = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseProjectInfo)) {
            return false;
        }
        FirebaseProjectInfo firebaseProjectInfo = (FirebaseProjectInfo) obj;
        return i.a(this.a, firebaseProjectInfo.a) && i.a(this.f7117b, firebaseProjectInfo.f7117b) && i.a(this.c, firebaseProjectInfo.c) && i.a(this.d, firebaseProjectInfo.d);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7117b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("FirebaseProjectInfo(project_number=");
        y.append(this.a);
        y.append(", firebase_url=");
        y.append(this.f7117b);
        y.append(", project_id=");
        y.append(this.c);
        y.append(", storage_bucket=");
        return a.q(y, this.d, ")");
    }
}
