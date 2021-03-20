package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import b.l.a.c.c.m.v.a;
import b.l.a.c.c.p.f;
import com.amplitude.api.Constants;
import org.json.JSONException;
import org.json.JSONObject;

public final class sk extends a implements bj<sk> {
    public static final Parcelable.Creator<sk> CREATOR = new tk();

    /* renamed from: m  reason: collision with root package name */
    public static final String f3273m = sk.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public String f3274h;

    /* renamed from: i  reason: collision with root package name */
    public String f3275i;

    /* renamed from: j  reason: collision with root package name */
    public Long f3276j;

    /* renamed from: k  reason: collision with root package name */
    public String f3277k;

    /* renamed from: l  reason: collision with root package name */
    public Long f3278l;

    public sk() {
        this.f3278l = Long.valueOf(System.currentTimeMillis());
    }

    public sk(String str, String str2, Long l2, String str3) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f3274h = str;
        this.f3275i = str2;
        this.f3276j = l2;
        this.f3277k = str3;
        this.f3278l = valueOf;
    }

    public sk(String str, String str2, Long l2, String str3, Long l3) {
        this.f3274h = str;
        this.f3275i = str2;
        this.f3276j = l2;
        this.f3277k = str3;
        this.f3278l = l3;
    }

    public static sk X(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            sk skVar = new sk();
            skVar.f3274h = jSONObject.optString("refresh_token", (String) null);
            skVar.f3275i = jSONObject.optString("access_token", (String) null);
            skVar.f3276j = Long.valueOf(jSONObject.optLong("expires_in"));
            skVar.f3277k = jSONObject.optString("token_type", (String) null);
            skVar.f3278l = Long.valueOf(jSONObject.optLong("issued_at"));
            return skVar;
        } catch (JSONException e2) {
            Log.d(f3273m, "Failed to read GetTokenResponse from JSONObject");
            throw new fc(e2);
        }
    }

    public final boolean V() {
        return System.currentTimeMillis() + Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS < (this.f3276j.longValue() * 1000) + this.f3278l.longValue();
    }

    public final String W() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f3274h);
            jSONObject.put("access_token", this.f3275i);
            jSONObject.put("expires_in", this.f3276j);
            jSONObject.put("token_type", this.f3277k);
            jSONObject.put("issued_at", this.f3278l);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d(f3273m, "Failed to convert GetTokenResponse to JSON");
            throw new fc(e2);
        }
    }

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3274h = f.a(jSONObject.optString("refresh_token"));
            this.f3275i = f.a(jSONObject.optString("access_token"));
            this.f3276j = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.f3277k = f.a(jSONObject.optString("token_type"));
            this.f3278l = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw b.l.a.c.b.a.A1(e2, f3273m, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 2, this.f3274h, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3275i, false);
        Long l2 = this.f3276j;
        b.l.a.c.b.a.I0(parcel, 4, Long.valueOf(l2 == null ? 0 : l2.longValue()), false);
        b.l.a.c.b.a.K0(parcel, 5, this.f3277k, false);
        b.l.a.c.b.a.I0(parcel, 6, Long.valueOf(this.f3278l.longValue()), false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
