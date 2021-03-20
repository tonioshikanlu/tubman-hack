package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.a.c.c.p.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class wl extends a implements bj<wl> {
    public static final Parcelable.Creator<wl> CREATOR = new yl();

    /* renamed from: l  reason: collision with root package name */
    public static final String f3385l = wl.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public String f3386h;

    /* renamed from: i  reason: collision with root package name */
    public String f3387i;

    /* renamed from: j  reason: collision with root package name */
    public long f3388j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3389k;

    public wl() {
    }

    public wl(String str, String str2, long j2, boolean z) {
        this.f3386h = str;
        this.f3387i = str2;
        this.f3388j = j2;
        this.f3389k = z;
    }

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3386h = f.a(jSONObject.optString("idToken", (String) null));
            this.f3387i = f.a(jSONObject.optString("refreshToken", (String) null));
            this.f3388j = jSONObject.optLong("expiresIn", 0);
            this.f3389k = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw b.l.a.c.b.a.A1(e2, f3385l, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 2, this.f3386h, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3387i, false);
        long j2 = this.f3388j;
        b.l.a.c.b.a.I1(parcel, 4, 8);
        parcel.writeLong(j2);
        boolean z = this.f3389k;
        b.l.a.c.b.a.I1(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
