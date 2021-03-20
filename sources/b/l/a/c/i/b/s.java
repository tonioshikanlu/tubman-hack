package b.l.a.c.i.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import java.util.Objects;

public final class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new t();

    /* renamed from: h  reason: collision with root package name */
    public final String f4248h;

    /* renamed from: i  reason: collision with root package name */
    public final q f4249i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4250j;

    /* renamed from: k  reason: collision with root package name */
    public final long f4251k;

    public s(s sVar, long j2) {
        Objects.requireNonNull(sVar, "null reference");
        this.f4248h = sVar.f4248h;
        this.f4249i = sVar.f4249i;
        this.f4250j = sVar.f4250j;
        this.f4251k = j2;
    }

    public s(String str, q qVar, String str2, long j2) {
        this.f4248h = str;
        this.f4249i = qVar;
        this.f4250j = str2;
        this.f4251k = j2;
    }

    public final String toString() {
        String str = this.f4250j;
        String str2 = this.f4248h;
        String valueOf = String.valueOf(this.f4249i);
        StringBuilder sb = new StringBuilder(b.e.a.a.a.b(String.valueOf(str).length(), 21, String.valueOf(str2).length(), valueOf.length()));
        b.e.a.a.a.L(sb, "origin=", str, ",name=", str2);
        return b.e.a.a.a.q(sb, ",params=", valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        t.a(this, parcel, i2);
    }
}
