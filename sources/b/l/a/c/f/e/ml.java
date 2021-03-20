package b.l.a.c.f.e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import org.json.JSONObject;

public final class ml implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f3166h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3167i = "phone";
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f3168j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final String f3169k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public final String f3170l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final String f3171m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public vj f3172n;

    public ml(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        a.x(str);
        this.f3166h = str;
        a.x("phone");
        this.f3168j = str2;
        this.f3169k = str3;
        this.f3170l = str4;
        this.f3171m = str5;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f3166h);
        this.f3167i.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f3168j != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f3168j);
            if (!TextUtils.isEmpty(this.f3170l)) {
                jSONObject2.put("recaptchaToken", this.f3170l);
            }
            if (!TextUtils.isEmpty(this.f3171m)) {
                jSONObject2.put("safetyNetToken", this.f3171m);
            }
            vj vjVar = this.f3172n;
            if (vjVar != null) {
                jSONObject2.put("autoRetrievalInfo", vjVar.a());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
