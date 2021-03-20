package b.l.a.c.i.b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;

public final class g9 extends a {
    public static final Parcelable.Creator<g9> CREATOR = new h9();

    /* renamed from: h  reason: collision with root package name */
    public final int f4020h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4021i;

    /* renamed from: j  reason: collision with root package name */
    public final long f4022j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final Long f4023k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public final String f4024l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final String f4025m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final Double f4026n;

    public g9(int i2, String str, long j2, @Nullable Long l2, Float f, @Nullable String str2, @Nullable String str3, @Nullable Double d) {
        this.f4020h = i2;
        this.f4021i = str;
        this.f4022j = j2;
        this.f4023k = l2;
        if (i2 == 1) {
            this.f4026n = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f4026n = d;
        }
        this.f4024l = str2;
        this.f4025m = str3;
    }

    public g9(i9 i9Var) {
        this(i9Var.c, i9Var.d, i9Var.f4066e, i9Var.f4065b);
    }

    public g9(String str, long j2, @Nullable Object obj, @Nullable String str2) {
        b.l.a.c.b.a.x(str);
        this.f4020h = 2;
        this.f4021i = str;
        this.f4022j = j2;
        this.f4025m = str2;
        if (obj == null) {
            this.f4023k = null;
            this.f4026n = null;
            this.f4024l = null;
        } else if (obj instanceof Long) {
            this.f4023k = (Long) obj;
            this.f4026n = null;
            this.f4024l = null;
        } else if (obj instanceof String) {
            this.f4023k = null;
            this.f4026n = null;
            this.f4024l = (String) obj;
        } else if (obj instanceof Double) {
            this.f4023k = null;
            this.f4026n = (Double) obj;
            this.f4024l = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    @Nullable
    public final Object V() {
        Long l2 = this.f4023k;
        if (l2 != null) {
            return l2;
        }
        Double d = this.f4026n;
        if (d != null) {
            return d;
        }
        String str = this.f4024l;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        h9.a(this, parcel, i2);
    }
}
