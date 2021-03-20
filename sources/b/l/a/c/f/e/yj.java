package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class yj extends a implements bj<yj> {
    public static final Parcelable.Creator<yj> CREATOR = new zj();

    /* renamed from: n  reason: collision with root package name */
    public static final String f3412n = yj.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public String f3413h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3414i;

    /* renamed from: j  reason: collision with root package name */
    public String f3415j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3416k;

    /* renamed from: l  reason: collision with root package name */
    public ql f3417l;

    /* renamed from: m  reason: collision with root package name */
    public List<String> f3418m;

    public yj() {
        this.f3417l = new ql((List<String>) null);
    }

    public yj(String str, boolean z, String str2, boolean z2, ql qlVar, List<String> list) {
        this.f3413h = str;
        this.f3414i = z;
        this.f3415j = str2;
        this.f3416k = z2;
        this.f3417l = qlVar == null ? new ql((List<String>) null) : new ql(qlVar.f3245i);
        this.f3418m = list;
    }

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3413h = jSONObject.optString("authUri", (String) null);
            this.f3414i = jSONObject.optBoolean("registered", false);
            this.f3415j = jSONObject.optString("providerId", (String) null);
            this.f3416k = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.f3417l = new ql((List<String>) null);
            } else {
                this.f3417l = new ql(1, b.l.a.c.b.a.e1(jSONObject.optJSONArray("allProviders")));
            }
            this.f3418m = b.l.a.c.b.a.e1(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw b.l.a.c.b.a.A1(e2, f3412n, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 2, this.f3413h, false);
        boolean z = this.f3414i;
        b.l.a.c.b.a.I1(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 4, this.f3415j, false);
        boolean z2 = this.f3416k;
        b.l.a.c.b.a.I1(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        b.l.a.c.b.a.J0(parcel, 6, this.f3417l, i2, false);
        b.l.a.c.b.a.L0(parcel, 7, this.f3418m, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
