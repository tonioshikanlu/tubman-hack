package b.l.a.c.f.e;

import b.l.a.c.b.a;
import b.l.a.c.c.p.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class cm implements bj<cm> {

    /* renamed from: n  reason: collision with root package name */
    public static final String f2896n = "cm";

    /* renamed from: h  reason: collision with root package name */
    public String f2897h;

    /* renamed from: i  reason: collision with root package name */
    public String f2898i;

    /* renamed from: j  reason: collision with root package name */
    public long f2899j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2900k;

    /* renamed from: l  reason: collision with root package name */
    public String f2901l;

    /* renamed from: m  reason: collision with root package name */
    public String f2902m;

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f2897h = f.a(jSONObject.optString("idToken", (String) null));
            this.f2898i = f.a(jSONObject.optString("refreshToken", (String) null));
            this.f2899j = jSONObject.optLong("expiresIn", 0);
            f.a(jSONObject.optString("localId", (String) null));
            this.f2900k = jSONObject.optBoolean("isNewUser", false);
            this.f2901l = f.a(jSONObject.optString("temporaryProof", (String) null));
            this.f2902m = f.a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw a.A1(e2, f2896n, str);
        }
    }
}
