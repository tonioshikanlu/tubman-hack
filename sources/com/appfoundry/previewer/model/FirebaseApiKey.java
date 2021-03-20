package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class FirebaseApiKey {
    public final String a;

    public FirebaseApiKey(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FirebaseApiKey) && i.a(this.a, ((FirebaseApiKey) obj).a);
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
        return a.q(a.y("FirebaseApiKey(current_key="), this.a, ")");
    }
}
