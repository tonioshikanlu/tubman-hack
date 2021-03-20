package b.l.a.c.f.e;

import b.l.a.c.b.a;
import b.l.a.c.c.p.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class pl implements bj<pl> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f3237i = "pl";

    /* renamed from: h  reason: collision with root package name */
    public String f3238h;

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.f3238h = f.a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw a.A1(e2, f3237i, str);
        }
    }
}
