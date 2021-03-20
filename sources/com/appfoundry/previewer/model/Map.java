package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;

@m(generateAdapter = true)
public final class Map {
    public final Integer a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Float> f7124b;
    public final Boolean c;

    public Map(Integer num, List<Float> list, Boolean bool) {
        this.a = num;
        this.f7124b = list;
        this.c = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return i.a(this.a, map.a) && i.a(this.f7124b, map.f7124b) && i.a(this.c, map.c);
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<Float> list = this.f7124b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Map(zoom=");
        y.append(this.a);
        y.append(", center=");
        y.append(this.f7124b);
        y.append(", interactive=");
        y.append(this.c);
        y.append(")");
        return y.toString();
    }
}
