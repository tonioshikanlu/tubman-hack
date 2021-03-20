package b.l.a.c.f.e;

import b.l.a.c.b.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class gk implements bj<gk> {

    /* renamed from: j  reason: collision with root package name */
    public static final String f3017j = "gk";

    /* renamed from: h  reason: collision with root package name */
    public String f3018h;

    /* renamed from: i  reason: collision with root package name */
    public String f3019i;

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3018h = jSONObject.optString("idToken", (String) null);
            this.f3019i = jSONObject.optString("refreshToken", (String) null);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw a.A1(e2, f3017j, str);
        }
    }
}
