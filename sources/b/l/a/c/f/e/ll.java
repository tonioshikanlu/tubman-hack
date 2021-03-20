package b.l.a.c.f.e;

import androidx.core.app.NotificationCompat;
import b.l.a.c.b.a;
import b.l.a.c.c.p.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class ll implements bj<ll> {

    /* renamed from: k  reason: collision with root package name */
    public static final String f3135k = "ll";

    /* renamed from: h  reason: collision with root package name */
    public String f3136h;

    /* renamed from: i  reason: collision with root package name */
    public String f3137i;

    /* renamed from: j  reason: collision with root package name */
    public long f3138j;

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3136h = f.a(jSONObject.optString("idToken", (String) null));
            f.a(jSONObject.optString("displayName", (String) null));
            f.a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            this.f3137i = f.a(jSONObject.optString("refreshToken", (String) null));
            this.f3138j = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw a.A1(e2, f3135k, str);
        }
    }
}
