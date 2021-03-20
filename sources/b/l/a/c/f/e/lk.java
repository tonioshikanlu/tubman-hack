package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.d.o.n0;
import java.util.ArrayList;
import java.util.List;

public final class lk extends a {
    public static final Parcelable.Creator<lk> CREATOR = new mk();

    /* renamed from: h  reason: collision with root package name */
    public String f3125h;

    /* renamed from: i  reason: collision with root package name */
    public String f3126i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3127j;

    /* renamed from: k  reason: collision with root package name */
    public String f3128k;

    /* renamed from: l  reason: collision with root package name */
    public String f3129l;

    /* renamed from: m  reason: collision with root package name */
    public al f3130m;

    /* renamed from: n  reason: collision with root package name */
    public String f3131n;

    /* renamed from: o  reason: collision with root package name */
    public String f3132o;

    /* renamed from: p  reason: collision with root package name */
    public long f3133p;

    /* renamed from: q  reason: collision with root package name */
    public long f3134q;
    public boolean r;
    public n0 s;
    public List<vk> t;

    public lk() {
        this.f3130m = new al();
    }

    public lk(String str, String str2, boolean z, String str3, String str4, al alVar, String str5, String str6, long j2, long j3, boolean z2, n0 n0Var, List<vk> list) {
        al alVar2;
        this.f3125h = str;
        this.f3126i = str2;
        this.f3127j = z;
        this.f3128k = str3;
        this.f3129l = str4;
        if (alVar == null) {
            alVar2 = new al();
        } else {
            List<yk> list2 = alVar.f2846h;
            al alVar3 = new al();
            if (list2 != null) {
                alVar3.f2846h.addAll(list2);
            }
            alVar2 = alVar3;
        }
        this.f3130m = alVar2;
        this.f3131n = str5;
        this.f3132o = str6;
        this.f3133p = j2;
        this.f3134q = j3;
        this.r = z2;
        this.s = n0Var;
        this.t = list == null ? new ArrayList<>() : list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 2, this.f3125h, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3126i, false);
        boolean z = this.f3127j;
        b.l.a.c.b.a.I1(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 5, this.f3128k, false);
        b.l.a.c.b.a.K0(parcel, 6, this.f3129l, false);
        b.l.a.c.b.a.J0(parcel, 7, this.f3130m, i2, false);
        b.l.a.c.b.a.K0(parcel, 8, this.f3131n, false);
        b.l.a.c.b.a.K0(parcel, 9, this.f3132o, false);
        long j2 = this.f3133p;
        b.l.a.c.b.a.I1(parcel, 10, 8);
        parcel.writeLong(j2);
        long j3 = this.f3134q;
        b.l.a.c.b.a.I1(parcel, 11, 8);
        parcel.writeLong(j3);
        boolean z2 = this.r;
        b.l.a.c.b.a.I1(parcel, 12, 4);
        parcel.writeInt(z2 ? 1 : 0);
        b.l.a.c.b.a.J0(parcel, 13, this.s, i2, false);
        b.l.a.c.b.a.N0(parcel, 14, this.t, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
