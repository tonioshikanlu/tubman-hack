package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;

@m(generateAdapter = true)
public final class BoundJson {
    public final BoundNode a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Style> f7074b;
    public final List<Asset> c;
    public final String d;

    public BoundJson(BoundNode boundNode, List<Style> list, List<Asset> list2, String str) {
        this.a = boundNode;
        this.f7074b = list;
        this.c = list2;
        this.d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundJson)) {
            return false;
        }
        BoundJson boundJson = (BoundJson) obj;
        return i.a(this.a, boundJson.a) && i.a(this.f7074b, boundJson.f7074b) && i.a(this.c, boundJson.c) && i.a(this.d, boundJson.d);
    }

    public int hashCode() {
        BoundNode boundNode = this.a;
        int i2 = 0;
        int hashCode = (boundNode != null ? boundNode.hashCode() : 0) * 31;
        List<Style> list = this.f7074b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Asset> list2 = this.c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("BoundJson(data=");
        y.append(this.a);
        y.append(", styles=");
        y.append(this.f7074b);
        y.append(", assets=");
        y.append(this.c);
        y.append(", nextLink=");
        return a.q(y, this.d, ")");
    }
}
