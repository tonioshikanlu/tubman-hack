package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class a extends b.l.a.c.c.m.v.a {
    public static final Parcelable.Creator<a> CREATOR = new l0();

    /* renamed from: h  reason: collision with root package name */
    public final String f4927h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4928i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4929j;

    /* renamed from: k  reason: collision with root package name */
    public final String f4930k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f4931l;

    /* renamed from: m  reason: collision with root package name */
    public final String f4932m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f4933n;

    /* renamed from: o  reason: collision with root package name */
    public String f4934o;

    /* renamed from: p  reason: collision with root package name */
    public int f4935p;

    /* renamed from: q  reason: collision with root package name */
    public String f4936q;

    /* renamed from: b.l.d.o.a$a  reason: collision with other inner class name */
    public static class C0076a {
    }

    public a(C0076a aVar) {
        this.f4927h = null;
        this.f4928i = null;
        this.f4929j = null;
        this.f4930k = null;
        this.f4931l = false;
        this.f4932m = null;
        this.f4933n = false;
        this.f4936q = null;
    }

    public a(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i2, String str7) {
        this.f4927h = str;
        this.f4928i = str2;
        this.f4929j = str3;
        this.f4930k = str4;
        this.f4931l = z;
        this.f4932m = str5;
        this.f4933n = z2;
        this.f4934o = str6;
        this.f4935p = i2;
        this.f4936q = str7;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f4927h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f4928i, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f4929j, false);
        b.l.a.c.b.a.K0(parcel, 4, this.f4930k, false);
        boolean z = this.f4931l;
        b.l.a.c.b.a.I1(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 6, this.f4932m, false);
        boolean z2 = this.f4933n;
        b.l.a.c.b.a.I1(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 8, this.f4934o, false);
        int i3 = this.f4935p;
        b.l.a.c.b.a.I1(parcel, 9, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.K0(parcel, 10, this.f4936q, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
