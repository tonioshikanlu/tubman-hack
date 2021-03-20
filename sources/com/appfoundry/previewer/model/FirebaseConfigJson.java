package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;

@m(generateAdapter = true)
public final class FirebaseConfigJson {
    public final FirebaseProjectInfo a;

    /* renamed from: b  reason: collision with root package name */
    public final List<FirebaseClient> f7116b;

    public FirebaseConfigJson(FirebaseProjectInfo firebaseProjectInfo, List<FirebaseClient> list) {
        this.a = firebaseProjectInfo;
        this.f7116b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseConfigJson)) {
            return false;
        }
        FirebaseConfigJson firebaseConfigJson = (FirebaseConfigJson) obj;
        return i.a(this.a, firebaseConfigJson.a) && i.a(this.f7116b, firebaseConfigJson.f7116b);
    }

    public int hashCode() {
        FirebaseProjectInfo firebaseProjectInfo = this.a;
        int i2 = 0;
        int hashCode = (firebaseProjectInfo != null ? firebaseProjectInfo.hashCode() : 0) * 31;
        List<FirebaseClient> list = this.f7116b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("FirebaseConfigJson(project_info=");
        y.append(this.a);
        y.append(", client=");
        y.append(this.f7116b);
        y.append(")");
        return y.toString();
    }
}
