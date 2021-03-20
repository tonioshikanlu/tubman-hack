package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import org.json.JSONObject;

public final class cl implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f2893h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final String f2894i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f2895j;

    public cl(String str, @Nullable String str2, @Nullable String str3) {
        a.x(str);
        this.f2893h = str;
        this.f2894i = str2;
        this.f2895j = str3;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.f2893h);
        String str = this.f2894i;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.f2895j;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
