package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class FirebaseAndroidClientInfo {
    public final String a;

    public FirebaseAndroidClientInfo(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FirebaseAndroidClientInfo) && i.a(this.a, ((FirebaseAndroidClientInfo) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.q(a.y("FirebaseAndroidClientInfo(package_name="), this.a, ")");
    }
}
