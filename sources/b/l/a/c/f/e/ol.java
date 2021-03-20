package b.l.a.c.f.e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import org.json.JSONObject;

public final class ol implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f3206h = "phone";

    /* renamed from: i  reason: collision with root package name */
    public final String f3207i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3208j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final String f3209k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public final String f3210l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final String f3211m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final String f3212n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public vj f3213o;

    public ol(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        a.x("phone");
        a.x(str);
        this.f3207i = str;
        a.x(str2);
        this.f3208j = str2;
        this.f3210l = str3;
        this.f3209k = str4;
        this.f3211m = str5;
        this.f3212n = str6;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.f3207i);
        jSONObject.put("mfaEnrollmentId", this.f3208j);
        this.f3206h.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f3210l != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f3210l);
            if (!TextUtils.isEmpty(this.f3211m)) {
                jSONObject2.put("recaptchaToken", this.f3211m);
            }
            if (!TextUtils.isEmpty(this.f3212n)) {
                jSONObject2.put("safetyNetToken", this.f3212n);
            }
            vj vjVar = this.f3213o;
            if (vjVar != null) {
                jSONObject2.put("autoRetrievalInfo", vjVar.a());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
