package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;

@m(generateAdapter = true)
public final class Data {
    public final List<Page> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Page> f7108b;

    public Data(List<Page> list, List<Page> list2) {
        this.a = list;
        this.f7108b = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return i.a(this.a, data.a) && i.a(this.f7108b, data.f7108b);
    }

    public int hashCode() {
        List<Page> list = this.a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Page> list2 = this.f7108b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Data(menus=");
        y.append(this.a);
        y.append(", pages=");
        y.append(this.f7108b);
        y.append(")");
        return y.toString();
    }
}
