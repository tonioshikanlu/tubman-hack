package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Store {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7166b;
    public final String c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7167e;
    public final Integer f;

    public Store(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.a = str;
        this.f7166b = str2;
        this.c = str3;
        this.d = str4;
        this.f7167e = str5;
        this.f = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Store)) {
            return false;
        }
        Store store = (Store) obj;
        return i.a(this.a, store.a) && i.a(this.f7166b, store.f7166b) && i.a(this.c, store.c) && i.a(this.d, store.d) && i.a(this.f7167e, store.f7167e) && i.a(this.f, store.f);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7166b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f7167e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.f;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Store(name=");
        y.append(this.a);
        y.append(", icon=");
        y.append(this.f7166b);
        y.append(", splash=");
        y.append(this.c);
        y.append(", description=");
        y.append(this.d);
        y.append(", bundleId=");
        y.append(this.f7167e);
        y.append(", ratingAppAlert=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
