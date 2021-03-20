package b.l.a.c.f.e;

import b.l.a.c.b.a;
import b.l.a.c.c.p.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class em implements bj<em> {

    /* renamed from: j  reason: collision with root package name */
    public static final String f2946j = "em";

    /* renamed from: h  reason: collision with root package name */
    public String f2947h;

    /* renamed from: i  reason: collision with root package name */
    public String f2948i;

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f2947h = f.a(jSONObject.optString("idToken", (String) null));
            this.f2948i = f.a(jSONObject.optString("refreshToken", (String) null));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw a.A1(e2, f2946j, str);
        }
    }
}
