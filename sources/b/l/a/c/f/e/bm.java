package b.l.a.c.f.e;

import android.text.TextUtils;
import org.json.JSONObject;

public final class bm implements aj {

    /* renamed from: h  reason: collision with root package name */
    public String f2869h;

    /* renamed from: i  reason: collision with root package name */
    public String f2870i;

    /* renamed from: j  reason: collision with root package name */
    public String f2871j;

    /* renamed from: k  reason: collision with root package name */
    public String f2872k;

    /* renamed from: l  reason: collision with root package name */
    public String f2873l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2874m;

    public final String a() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f2872k)) {
            jSONObject.put("phoneNumber", this.f2869h);
            str2 = this.f2872k;
            str = "temporaryProof";
        } else {
            jSONObject.put("sessionInfo", this.f2870i);
            str2 = this.f2871j;
            str = "code";
        }
        jSONObject.put(str, str2);
        String str3 = this.f2873l;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        if (!this.f2874m) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
