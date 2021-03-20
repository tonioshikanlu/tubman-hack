package b.l.a.c.i.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import java.util.Iterator;

public final class q extends a implements Iterable<String> {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f4228h;

    public q(Bundle bundle) {
        this.f4228h = bundle;
    }

    public final Object V(String str) {
        return this.f4228h.get(str);
    }

    public final Long W() {
        return Long.valueOf(this.f4228h.getLong("value"));
    }

    public final Double X() {
        return Double.valueOf(this.f4228h.getDouble("value"));
    }

    public final String Y(String str) {
        return this.f4228h.getString(str);
    }

    public final Bundle Z() {
        return new Bundle(this.f4228h);
    }

    public final Iterator<String> iterator() {
        return new p(this);
    }

    public final String toString() {
        return this.f4228h.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.F0(parcel, 2, Z(), false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
