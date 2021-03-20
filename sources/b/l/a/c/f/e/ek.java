package b.l.a.c.f.e;

import b.l.a.c.b.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class ek implements bj<ek> {

    /* renamed from: j  reason: collision with root package name */
    public static final String f2943j = "ek";

    /* renamed from: h  reason: collision with root package name */
    public String f2944h;

    /* renamed from: i  reason: collision with root package name */
    public String f2945i;

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f2944h = jSONObject.optString("idToken", (String) null);
            this.f2945i = jSONObject.optString("refreshToken", (String) null);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw a.A1(e2, f2943j, str);
        }
    }
}
