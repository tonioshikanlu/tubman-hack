package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import org.json.JSONObject;

public final class xj implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f3404h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3405i = "http://localhost";
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f3406j;

    public xj(String str, @Nullable String str2) {
        a.x(str);
        this.f3404h = str;
        this.f3406j = str2;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f3404h);
        jSONObject.put("continueUri", this.f3405i);
        String str = this.f3406j;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
