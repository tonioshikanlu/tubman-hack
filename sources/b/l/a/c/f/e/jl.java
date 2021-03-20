package b.l.a.c.f.e;

import androidx.core.app.NotificationCompat;
import b.l.a.c.b.a;
import b.l.a.c.c.p.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class jl implements bj<jl> {

    /* renamed from: m  reason: collision with root package name */
    public static final String f3094m = "jl";

    /* renamed from: h  reason: collision with root package name */
    public String f3095h;

    /* renamed from: i  reason: collision with root package name */
    public al f3096i;

    /* renamed from: j  reason: collision with root package name */
    public String f3097j;

    /* renamed from: k  reason: collision with root package name */
    public String f3098k;

    /* renamed from: l  reason: collision with root package name */
    public long f3099l;

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3095h = f.a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            f.a(jSONObject.optString("passwordHash", (String) null));
            jSONObject.optBoolean("emailVerified", false);
            f.a(jSONObject.optString("displayName", (String) null));
            f.a(jSONObject.optString("photoUrl", (String) null));
            this.f3096i = al.V(jSONObject.optJSONArray("providerUserInfo"));
            this.f3097j = f.a(jSONObject.optString("idToken", (String) null));
            this.f3098k = f.a(jSONObject.optString("refreshToken", (String) null));
            this.f3099l = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw a.A1(e2, f3094m, str);
        }
    }
}
