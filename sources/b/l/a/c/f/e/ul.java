package b.l.a.c.f.e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import b.l.a.c.b.a;
import b.l.a.c.c.p.f;
import b.l.d.o.n0;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ul implements bj<ul> {
    public static final String x = "ul";

    /* renamed from: h  reason: collision with root package name */
    public boolean f3334h;

    /* renamed from: i  reason: collision with root package name */
    public String f3335i;

    /* renamed from: j  reason: collision with root package name */
    public String f3336j;

    /* renamed from: k  reason: collision with root package name */
    public long f3337k;

    /* renamed from: l  reason: collision with root package name */
    public String f3338l;

    /* renamed from: m  reason: collision with root package name */
    public String f3339m;

    /* renamed from: n  reason: collision with root package name */
    public String f3340n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3341o;

    /* renamed from: p  reason: collision with root package name */
    public String f3342p;

    /* renamed from: q  reason: collision with root package name */
    public String f3343q;
    public String r;
    public String s;
    public String t;
    public String u;
    public List<vk> v;
    public String w;

    @Nullable
    public final n0 a() {
        if (TextUtils.isEmpty(this.f3342p) && TextUtils.isEmpty(this.f3343q)) {
            return null;
        }
        String str = this.f3339m;
        String str2 = this.f3343q;
        String str3 = this.f3342p;
        String str4 = this.t;
        String str5 = this.r;
        a.y(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new n0(str, str2, str3, (sl) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3334h = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f3335i = f.a(jSONObject.optString("idToken", (String) null));
            this.f3336j = f.a(jSONObject.optString("refreshToken", (String) null));
            this.f3337k = jSONObject.optLong("expiresIn", 0);
            f.a(jSONObject.optString("localId", (String) null));
            this.f3338l = f.a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            f.a(jSONObject.optString("displayName", (String) null));
            f.a(jSONObject.optString("photoUrl", (String) null));
            this.f3339m = f.a(jSONObject.optString("providerId", (String) null));
            this.f3340n = f.a(jSONObject.optString("rawUserInfo", (String) null));
            this.f3341o = jSONObject.optBoolean("isNewUser", false);
            this.f3342p = jSONObject.optString("oauthAccessToken", (String) null);
            this.f3343q = jSONObject.optString("oauthIdToken", (String) null);
            this.s = f.a(jSONObject.optString("errorMessage", (String) null));
            this.t = f.a(jSONObject.optString("pendingToken", (String) null));
            this.u = f.a(jSONObject.optString("tenantId", (String) null));
            this.v = vk.W(jSONObject.optJSONArray("mfaInfo"));
            this.w = f.a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.r = f.a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw a.A1(e2, x, str);
        }
    }
}
