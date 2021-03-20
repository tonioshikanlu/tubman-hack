package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;

@m(generateAdapter = true)
public final class Params {
    public final String A;
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7139b;
    public final String c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7140e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final Float f7141g;

    /* renamed from: h  reason: collision with root package name */
    public final Float f7142h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7143i;

    /* renamed from: j  reason: collision with root package name */
    public final String f7144j;

    /* renamed from: k  reason: collision with root package name */
    public final String f7145k;

    /* renamed from: l  reason: collision with root package name */
    public final String f7146l;

    /* renamed from: m  reason: collision with root package name */
    public final String f7147m;

    /* renamed from: n  reason: collision with root package name */
    public final String f7148n;

    /* renamed from: o  reason: collision with root package name */
    public final String f7149o;

    /* renamed from: p  reason: collision with root package name */
    public final String f7150p;

    /* renamed from: q  reason: collision with root package name */
    public final Boolean f7151q;
    public final String r;
    public final Boolean s;
    public final Map t;
    public final List<Marker> u;
    public final Float v;
    public final String w;
    public final List<String> x;
    public final List<ChartData> y;
    public final List<String> z;

    public Params(String str, String str2, String str3, String str4, String str5, String str6, Float f2, Float f3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, Boolean bool2, Map map, List<Marker> list, Float f4, String str16, List<String> list2, List<ChartData> list3, List<String> list4, String str17) {
        this.a = str;
        this.f7139b = str2;
        this.c = str3;
        this.d = str4;
        this.f7140e = str5;
        this.f = str6;
        this.f7141g = f2;
        this.f7142h = f3;
        this.f7143i = str7;
        this.f7144j = str8;
        this.f7145k = str9;
        this.f7146l = str10;
        this.f7147m = str11;
        this.f7148n = str12;
        this.f7149o = str13;
        this.f7150p = str14;
        this.f7151q = bool;
        this.r = str15;
        this.s = bool2;
        this.t = map;
        this.u = list;
        this.v = f4;
        this.w = str16;
        this.x = list2;
        this.y = list3;
        this.z = list4;
        this.A = str17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Params)) {
            return false;
        }
        Params params = (Params) obj;
        return i.a(this.a, params.a) && i.a(this.f7139b, params.f7139b) && i.a(this.c, params.c) && i.a(this.d, params.d) && i.a(this.f7140e, params.f7140e) && i.a(this.f, params.f) && i.a(this.f7141g, params.f7141g) && i.a(this.f7142h, params.f7142h) && i.a(this.f7143i, params.f7143i) && i.a(this.f7144j, params.f7144j) && i.a(this.f7145k, params.f7145k) && i.a(this.f7146l, params.f7146l) && i.a(this.f7147m, params.f7147m) && i.a(this.f7148n, params.f7148n) && i.a(this.f7149o, params.f7149o) && i.a(this.f7150p, params.f7150p) && i.a(this.f7151q, params.f7151q) && i.a(this.r, params.r) && i.a(this.s, params.s) && i.a(this.t, params.t) && i.a(this.u, params.u) && i.a(this.v, params.v) && i.a(this.w, params.w) && i.a(this.x, params.x) && i.a(this.y, params.y) && i.a(this.z, params.z) && i.a(this.A, params.A);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7139b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f7140e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Float f2 = this.f7141g;
        int hashCode7 = (hashCode6 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f7142h;
        int hashCode8 = (hashCode7 + (f3 != null ? f3.hashCode() : 0)) * 31;
        String str7 = this.f7143i;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f7144j;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f7145k;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f7146l;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f7147m;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f7148n;
        int hashCode14 = (hashCode13 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f7149o;
        int hashCode15 = (hashCode14 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f7150p;
        int hashCode16 = (hashCode15 + (str14 != null ? str14.hashCode() : 0)) * 31;
        Boolean bool = this.f7151q;
        int hashCode17 = (hashCode16 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str15 = this.r;
        int hashCode18 = (hashCode17 + (str15 != null ? str15.hashCode() : 0)) * 31;
        Boolean bool2 = this.s;
        int hashCode19 = (hashCode18 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Map map = this.t;
        int hashCode20 = (hashCode19 + (map != null ? map.hashCode() : 0)) * 31;
        List<Marker> list = this.u;
        int hashCode21 = (hashCode20 + (list != null ? list.hashCode() : 0)) * 31;
        Float f4 = this.v;
        int hashCode22 = (hashCode21 + (f4 != null ? f4.hashCode() : 0)) * 31;
        String str16 = this.w;
        int hashCode23 = (hashCode22 + (str16 != null ? str16.hashCode() : 0)) * 31;
        List<String> list2 = this.x;
        int hashCode24 = (hashCode23 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<ChartData> list3 = this.y;
        int hashCode25 = (hashCode24 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.z;
        int hashCode26 = (hashCode25 + (list4 != null ? list4.hashCode() : 0)) * 31;
        String str17 = this.A;
        if (str17 != null) {
            i2 = str17.hashCode();
        }
        return hashCode26 + i2;
    }

    public String toString() {
        StringBuilder y2 = a.y("Params(url=");
        y2.append(this.a);
        y2.append(", title=");
        y2.append(this.f7139b);
        y2.append(", datetime=");
        y2.append(this.c);
        y2.append(", phone=");
        y2.append(this.d);
        y2.append(", email=");
        y2.append(this.f7140e);
        y2.append(", place=");
        y2.append(this.f);
        y2.append(", lat=");
        y2.append(this.f7141g);
        y2.append(", long=");
        y2.append(this.f7142h);
        y2.append(", startDate=");
        y2.append(this.f7143i);
        y2.append(", endDate=");
        y2.append(this.f7144j);
        y2.append(", id=");
        y2.append(this.f7145k);
        y2.append(", provider=");
        y2.append(this.f7146l);
        y2.append(", message=");
        y2.append(this.f7147m);
        y2.append(", href=");
        y2.append(this.f7148n);
        y2.append(", triggerUrl=");
        y2.append(this.f7149o);
        y2.append(", confirmPrompt=");
        y2.append(this.f7150p);
        y2.append(", infinite=");
        y2.append(this.f7151q);
        y2.append(", animation=");
        y2.append(this.r);
        y2.append(", automatic=");
        y2.append(this.s);
        y2.append(", map=");
        y2.append(this.t);
        y2.append(", markers=");
        y2.append(this.u);
        y2.append(", zoom=");
        y2.append(this.v);
        y2.append(", chartType=");
        y2.append(this.w);
        y2.append(", categories=");
        y2.append(this.x);
        y2.append(", series=");
        y2.append(this.y);
        y2.append(", colors=");
        y2.append(this.z);
        y2.append(", hrefRemote=");
        return a.q(y2, this.A, ")");
    }
}
