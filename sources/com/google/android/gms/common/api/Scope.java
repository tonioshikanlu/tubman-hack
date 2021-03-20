package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.l.l;
import b.l.a.c.c.m.v.a;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new l();

    /* renamed from: h  reason: collision with root package name */
    public final int f7256h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7257i;

    public Scope(int i2, String str) {
        b.l.a.c.b.a.y(str, "scopeUri must not be null or empty");
        this.f7256h = i2;
        this.f7257i = str;
    }

    public Scope(String str) {
        b.l.a.c.b.a.y(str, "scopeUri must not be null or empty");
        this.f7256h = 1;
        this.f7257i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f7257i.equals(((Scope) obj).f7257i);
    }

    public final int hashCode() {
        return this.f7257i.hashCode();
    }

    public final String toString() {
        return this.f7257i;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f7256h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.K0(parcel, 2, this.f7257i, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
