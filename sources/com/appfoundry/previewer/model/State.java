package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class State {
    public final Override a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7161b;
    public final String c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7162e;

    public State(Override override, String str, String str2, String str3, String str4) {
        this.a = override;
        this.f7161b = str;
        this.c = str2;
        this.d = str3;
        this.f7162e = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof State)) {
            return false;
        }
        State state = (State) obj;
        return i.a(this.a, state.a) && i.a(this.f7161b, state.f7161b) && i.a(this.c, state.c) && i.a(this.d, state.d) && i.a(this.f7162e, state.f7162e);
    }

    public int hashCode() {
        Override override = this.a;
        int i2 = 0;
        int hashCode = (override != null ? override.hashCode() : 0) * 31;
        String str = this.f7161b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f7162e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("State(override=");
        y.append(this.a);
        y.append(", on=");
        y.append(this.f7161b);
        y.append(", target=");
        y.append(this.c);
        y.append(", show=");
        y.append(this.d);
        y.append(", nodeId=");
        return a.q(y, this.f7162e, ")");
    }
}
