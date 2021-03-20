package b.l.a.c.f.e;

import androidx.core.app.NotificationCompat;
import b.l.a.c.b.a;
import b.l.a.c.c.p.f;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class am implements bj<am> {

    /* renamed from: m  reason: collision with root package name */
    public static final String f2847m = "am";

    /* renamed from: h  reason: collision with root package name */
    public String f2848h;

    /* renamed from: i  reason: collision with root package name */
    public String f2849i;

    /* renamed from: j  reason: collision with root package name */
    public long f2850j;

    /* renamed from: k  reason: collision with root package name */
    public List<vk> f2851k;

    /* renamed from: l  reason: collision with root package name */
    public String f2852l;

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            f.a(jSONObject.optString("localId", (String) null));
            f.a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            f.a(jSONObject.optString("displayName", (String) null));
            this.f2848h = f.a(jSONObject.optString("idToken", (String) null));
            f.a(jSONObject.optString("photoUrl", (String) null));
            this.f2849i = f.a(jSONObject.optString("refreshToken", (String) null));
            this.f2850j = jSONObject.optLong("expiresIn", 0);
            this.f2851k = vk.W(jSONObject.optJSONArray("mfaInfo"));
            this.f2852l = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw a.A1(e2, f2847m, str);
        }
    }
}
