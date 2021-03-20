package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b.l.a.c.b.a;
import org.json.JSONObject;

public final class fk implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f2971h = "phone";

    /* renamed from: i  reason: collision with root package name */
    public final String f2972i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f2973j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final String f2974k;

    @VisibleForTesting
    public fk(String str, @Nullable String str2, @Nullable String str3) {
        a.x("phone");
        a.x(str);
        this.f2972i = str;
        this.f2973j = str2;
        this.f2974k = str3;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        this.f2971h.hashCode();
        jSONObject.put("mfaProvider", 1);
        jSONObject.put("mfaPendingCredential", this.f2972i);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f2973j;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.f2974k;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
