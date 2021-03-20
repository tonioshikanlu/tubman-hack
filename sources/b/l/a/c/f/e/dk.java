package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b.l.a.c.b.a;
import org.json.JSONObject;

public final class dk implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f2922h = "phone";

    /* renamed from: i  reason: collision with root package name */
    public String f2923i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f2924j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final String f2925k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public final String f2926l;

    @VisibleForTesting
    public dk(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        a.x("phone");
        a.x(str);
        this.f2923i = str;
        this.f2924j = str2;
        this.f2926l = str3;
        this.f2925k = str4;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f2923i);
        this.f2922h.hashCode();
        jSONObject.put("mfaProvider", 1);
        String str = this.f2925k;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.f2924j;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.f2926l;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
