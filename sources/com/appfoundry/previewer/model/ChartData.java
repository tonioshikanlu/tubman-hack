package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;

@m(generateAdapter = true)
public final class ChartData {
    public final List<Object> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7082b;

    public ChartData(List<? extends Object> list, String str) {
        this.a = list;
        this.f7082b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartData)) {
            return false;
        }
        ChartData chartData = (ChartData) obj;
        return i.a(this.a, chartData.a) && i.a(this.f7082b, chartData.f7082b);
    }

    public int hashCode() {
        List<Object> list = this.a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f7082b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("ChartData(data=");
        y.append(this.a);
        y.append(", name=");
        return a.q(y, this.f7082b, ")");
    }
}
