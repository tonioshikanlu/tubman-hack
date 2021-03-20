package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;

@m(generateAdapter = true)
public final class Actions {
    public final Tap a;

    public Actions(Tap tap) {
        this.a = tap;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Actions) && i.a(this.a, ((Actions) obj).a);
        }
        return true;
    }

    public int hashCode() {
        Tap tap = this.a;
        if (tap != null) {
            return tap.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder y = a.y("Actions(tap=");
        y.append(this.a);
        y.append(")");
        return y.toString();
    }
}
