package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import b.l.a.c.b.a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ck implements bj<ck> {

    /* renamed from: n  reason: collision with root package name */
    public static final String f2886n = "ck";

    /* renamed from: h  reason: collision with root package name */
    public String f2887h;

    /* renamed from: i  reason: collision with root package name */
    public String f2888i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2889j;

    /* renamed from: k  reason: collision with root package name */
    public long f2890k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public List<vk> f2891l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public String f2892m;

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", (String) null);
            jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null);
            this.f2887h = jSONObject.optString("idToken", (String) null);
            this.f2888i = jSONObject.optString("refreshToken", (String) null);
            this.f2889j = jSONObject.optBoolean("isNewUser", false);
            this.f2890k = jSONObject.optLong("expiresIn", 0);
            this.f2891l = vk.W(jSONObject.optJSONArray("mfaInfo"));
            this.f2892m = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw a.A1(e2, f2886n, str);
        }
    }
}
