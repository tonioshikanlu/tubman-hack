package b.a.a.j;

import android.webkit.URLUtil;
import b.a.a.g.b0;
import b.a.a.g.v;
import b.o.i2;
import b.o.l1;
import b.o.m1;
import e.x.c.i;
import org.json.JSONObject;
import p.a.a.c;

public final class a implements i2.l {
    public void a(m1 m1Var) {
        Object obj;
        c cVar;
        i.e(m1Var, "result");
        l1.a aVar = m1Var.f6200b.a;
        JSONObject jSONObject = m1Var.a.a.f6210e;
        if (jSONObject != null) {
            String optString = jSONObject.optString("action", "");
            if (aVar == l1.a.Opened) {
                if (i.a(optString, "openurl")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("params");
                    String optString2 = optJSONObject != null ? optJSONObject.optString("url") : null;
                    if (optString2 != null && URLUtil.isValidUrl(optString2)) {
                        cVar = c.b();
                        obj = new b0(optString2, (String) null);
                    } else {
                        return;
                    }
                } else if (i.a(optString, "goto")) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("params");
                    String optString3 = optJSONObject2 != null ? optJSONObject2.optString("href") : null;
                    if (optString3 != null) {
                        cVar = c.b();
                        obj = new v(optString3, (String) null, (Boolean) null, 6);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                cVar.g(obj);
            }
        }
    }
}
