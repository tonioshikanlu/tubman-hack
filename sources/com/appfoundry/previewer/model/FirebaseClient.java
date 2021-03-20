package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;

@m(generateAdapter = true)
public final class FirebaseClient {
    public final FirebaseClientInfo a;

    /* renamed from: b  reason: collision with root package name */
    public final List<FirebaseApiKey> f7114b;

    public FirebaseClient(FirebaseClientInfo firebaseClientInfo, List<FirebaseApiKey> list) {
        this.a = firebaseClientInfo;
        this.f7114b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseClient)) {
            return false;
        }
        FirebaseClient firebaseClient = (FirebaseClient) obj;
        return i.a(this.a, firebaseClient.a) && i.a(this.f7114b, firebaseClient.f7114b);
    }

    public int hashCode() {
        FirebaseClientInfo firebaseClientInfo = this.a;
        int i2 = 0;
        int hashCode = (firebaseClientInfo != null ? firebaseClientInfo.hashCode() : 0) * 31;
        List<FirebaseApiKey> list = this.f7114b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("FirebaseClient(client_info=");
        y.append(this.a);
        y.append(", api_key=");
        y.append(this.f7114b);
        y.append(")");
        return y.toString();
    }
}
