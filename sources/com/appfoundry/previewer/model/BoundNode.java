package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import com.segment.analytics.AnalyticsContext;
import e.x.c.i;
import java.util.List;

@m(generateAdapter = true)
public final class BoundNode {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7075b;
    public final List<String> c;
    public final Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final Container f7076e;
    public final Container f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Container> f7077g;

    /* renamed from: h  reason: collision with root package name */
    public List<Container> f7078h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7079i;

    /* renamed from: j  reason: collision with root package name */
    public final String f7080j;

    public BoundNode(String str, String str2, List<String> list, Boolean bool, Container container, Container container2, List<Container> list2, List<Container> list3, String str3, String str4) {
        i.e(str, AnalyticsContext.Device.DEVICE_ID_KEY);
        this.a = str;
        this.f7075b = str2;
        this.c = list;
        this.d = bool;
        this.f7076e = container;
        this.f = container2;
        this.f7077g = list2;
        this.f7078h = list3;
        this.f7079i = str3;
        this.f7080j = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundNode)) {
            return false;
        }
        BoundNode boundNode = (BoundNode) obj;
        return i.a(this.a, boundNode.a) && i.a(this.f7075b, boundNode.f7075b) && i.a(this.c, boundNode.c) && i.a(this.d, boundNode.d) && i.a(this.f7076e, boundNode.f7076e) && i.a(this.f, boundNode.f) && i.a(this.f7077g, boundNode.f7077g) && i.a(this.f7078h, boundNode.f7078h) && i.a(this.f7079i, boundNode.f7079i) && i.a(this.f7080j, boundNode.f7080j);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7075b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Container container = this.f7076e;
        int hashCode5 = (hashCode4 + (container != null ? container.hashCode() : 0)) * 31;
        Container container2 = this.f;
        int hashCode6 = (hashCode5 + (container2 != null ? container2.hashCode() : 0)) * 31;
        List<Container> list2 = this.f7077g;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Container> list3 = this.f7078h;
        int hashCode8 = (hashCode7 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str3 = this.f7079i;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f7080j;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode9 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("BoundNode(id=");
        y.append(this.a);
        y.append(", type=");
        y.append(this.f7075b);
        y.append(", tags=");
        y.append(this.c);
        y.append(", start=");
        y.append(this.d);
        y.append(", background=");
        y.append(this.f7076e);
        y.append(", topBar=");
        y.append(this.f);
        y.append(", body=");
        y.append(this.f7077g);
        y.append(", layers=");
        y.append(this.f7078h);
        y.append(", remote=");
        y.append(this.f7079i);
        y.append(", remoteForm=");
        return a.q(y, this.f7080j, ")");
    }
}
