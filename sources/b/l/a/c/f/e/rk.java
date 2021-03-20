package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class rk implements bj<rk> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f3263i = "rk";

    /* renamed from: h  reason: collision with root package name */
    public List<String> f3264h;

    public final rk a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3264h = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    this.f3264h.add(optJSONArray.getString(i2));
                }
            }
            return this;
        } catch (JSONException e2) {
            throw a.A1(e2, f3263i, str);
        }
    }

    public final /* bridge */ /* synthetic */ bj d(String str) {
        a(str);
        return this;
    }
}
