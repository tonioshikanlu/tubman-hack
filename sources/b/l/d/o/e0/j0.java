package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import b.l.a.c.b.a;
import b.l.a.c.f.e.sk;
import b.l.d.d;
import b.l.d.o.b0;
import b.l.d.o.n0;
import b.l.d.o.p;
import b.l.d.o.t;
import b.l.d.o.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class j0 extends p {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* renamed from: h  reason: collision with root package name */
    public sk f4978h;

    /* renamed from: i  reason: collision with root package name */
    public g0 f4979i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4980j;

    /* renamed from: k  reason: collision with root package name */
    public String f4981k;

    /* renamed from: l  reason: collision with root package name */
    public List<g0> f4982l;

    /* renamed from: m  reason: collision with root package name */
    public List<String> f4983m;

    /* renamed from: n  reason: collision with root package name */
    public String f4984n;

    /* renamed from: o  reason: collision with root package name */
    public Boolean f4985o;

    /* renamed from: p  reason: collision with root package name */
    public l0 f4986p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4987q;
    public n0 r;
    public p s;

    public j0(sk skVar, g0 g0Var, String str, String str2, List<g0> list, List<String> list2, String str3, Boolean bool, l0 l0Var, boolean z, n0 n0Var, p pVar) {
        this.f4978h = skVar;
        this.f4979i = g0Var;
        this.f4980j = str;
        this.f4981k = str2;
        this.f4982l = list;
        this.f4983m = list2;
        this.f4984n = str3;
        this.f4985o = bool;
        this.f4986p = l0Var;
        this.f4987q = z;
        this.r = n0Var;
        this.s = pVar;
    }

    public j0(d dVar, List<? extends b0> list) {
        dVar.a();
        this.f4980j = dVar.f4912b;
        this.f4981k = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f4984n = ExifInterface.GPS_MEASUREMENT_2D;
        c0(list);
    }

    @NonNull
    public final String R() {
        return this.f4979i.f4969i;
    }

    @Nullable
    public final String V() {
        return this.f4979i.f4972l;
    }

    public final /* bridge */ /* synthetic */ d W() {
        return new d(this);
    }

    @NonNull
    public final List<? extends b0> X() {
        return this.f4982l;
    }

    @Nullable
    public final String Y() {
        String str;
        Map map;
        sk skVar = this.f4978h;
        if (skVar == null || (str = skVar.f3275i) == null || (map = (Map) n.a(str).f5010b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @NonNull
    public final String Z() {
        return this.f4979i.f4968h;
    }

    public final boolean a0() {
        String str;
        Boolean bool = this.f4985o;
        if (bool == null || bool.booleanValue()) {
            sk skVar = this.f4978h;
            if (skVar != null) {
                Map map = (Map) n.a(skVar.f3275i).f5010b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z = false;
            if (this.f4982l.size() <= 1 && (str == null || !str.equals("custom"))) {
                z = true;
            }
            this.f4985o = Boolean.valueOf(z);
        }
        return this.f4985o.booleanValue();
    }

    @Nullable
    public final List<String> b0() {
        return this.f4983m;
    }

    @NonNull
    public final p c0(List<? extends b0> list) {
        Objects.requireNonNull(list, "null reference");
        this.f4982l = new ArrayList(list.size());
        this.f4983m = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            b0 b0Var = (b0) list.get(i2);
            if (b0Var.R().equals("firebase")) {
                this.f4979i = (g0) b0Var;
            } else {
                this.f4983m.add(b0Var.R());
            }
            this.f4982l.add((g0) b0Var);
        }
        if (this.f4979i == null) {
            this.f4979i = this.f4982l.get(0);
        }
        return this;
    }

    public final p d0() {
        this.f4985o = Boolean.FALSE;
        return this;
    }

    @NonNull
    public final d e0() {
        return d.d(this.f4980j);
    }

    @NonNull
    public final sk f0() {
        return this.f4978h;
    }

    public final void g0(sk skVar) {
        this.f4978h = skVar;
    }

    @NonNull
    public final String h0() {
        return this.f4978h.W();
    }

    @NonNull
    public final String i0() {
        return this.f4978h.f3275i;
    }

    public final void j0(List<t> list) {
        p pVar;
        if (list.isEmpty()) {
            pVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (t next : list) {
                if (next instanceof y) {
                    arrayList.add((y) next);
                }
            }
            pVar = new p(arrayList);
        }
        this.s = pVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.J0(parcel, 1, this.f4978h, i2, false);
        a.J0(parcel, 2, this.f4979i, i2, false);
        a.K0(parcel, 3, this.f4980j, false);
        a.K0(parcel, 4, this.f4981k, false);
        a.N0(parcel, 5, this.f4982l, false);
        a.L0(parcel, 6, this.f4983m, false);
        a.K0(parcel, 7, this.f4984n, false);
        a.E0(parcel, 8, Boolean.valueOf(a0()), false);
        a.J0(parcel, 9, this.f4986p, i2, false);
        boolean z = this.f4987q;
        a.I1(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        a.J0(parcel, 11, this.r, i2, false);
        a.J0(parcel, 12, this.s, i2, false);
        a.H1(parcel, P0);
    }
}
