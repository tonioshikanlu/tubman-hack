package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;

@m(generateAdapter = true)
public final class App {
    public final List<Asset> a;

    /* renamed from: b  reason: collision with root package name */
    public List<Asset> f7061b;
    public final Store c;
    public final Integration d;

    /* renamed from: e  reason: collision with root package name */
    public final Data f7062e;
    public List<Style> f;

    /* renamed from: g  reason: collision with root package name */
    public final Features f7063g;

    /* renamed from: h  reason: collision with root package name */
    public final Paywall f7064h;

    public App(List<Asset> list, List<Asset> list2, Store store, Integration integration, Data data, List<Style> list3, Features features, Paywall paywall) {
        this.a = list;
        this.f7061b = list2;
        this.c = store;
        this.d = integration;
        this.f7062e = data;
        this.f = list3;
        this.f7063g = features;
        this.f7064h = paywall;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof App)) {
            return false;
        }
        App app2 = (App) obj;
        return i.a(this.a, app2.a) && i.a(this.f7061b, app2.f7061b) && i.a(this.c, app2.c) && i.a(this.d, app2.d) && i.a(this.f7062e, app2.f7062e) && i.a(this.f, app2.f) && i.a(this.f7063g, app2.f7063g) && i.a(this.f7064h, app2.f7064h);
    }

    public int hashCode() {
        List<Asset> list = this.a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Asset> list2 = this.f7061b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Store store = this.c;
        int hashCode3 = (hashCode2 + (store != null ? store.hashCode() : 0)) * 31;
        Integration integration = this.d;
        int hashCode4 = (hashCode3 + (integration != null ? integration.hashCode() : 0)) * 31;
        Data data = this.f7062e;
        int hashCode5 = (hashCode4 + (data != null ? data.hashCode() : 0)) * 31;
        List<Style> list3 = this.f;
        int hashCode6 = (hashCode5 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Features features = this.f7063g;
        int hashCode7 = (hashCode6 + (features != null ? features.hashCode() : 0)) * 31;
        Paywall paywall = this.f7064h;
        if (paywall != null) {
            i2 = paywall.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("App(fonts=");
        y.append(this.a);
        y.append(", assets=");
        y.append(this.f7061b);
        y.append(", store=");
        y.append(this.c);
        y.append(", integration=");
        y.append(this.d);
        y.append(", data=");
        y.append(this.f7062e);
        y.append(", styles=");
        y.append(this.f);
        y.append(", features=");
        y.append(this.f7063g);
        y.append(", paywall=");
        y.append(this.f7064h);
        y.append(")");
        return y.toString();
    }
}
