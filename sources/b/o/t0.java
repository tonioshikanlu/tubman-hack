package b.o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.segment.analytics.AnalyticsContext;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class t0 {
    @NonNull
    public String a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public a f6286b;
    @Nullable
    public String c;
    @NonNull
    public List<d1> d = new ArrayList();
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public List<e1> f6287e = new ArrayList();
    public h1 f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6288g;

    public enum a {
        IN_APP_WEBVIEW("webview"),
        BROWSER("browser"),
        REPLACE_CONTENT("replacement");
        

        /* renamed from: h  reason: collision with root package name */
        public String f6293h;

        /* access modifiers changed from: public */
        a(String str) {
            this.f6293h = str;
        }

        public String toString() {
            return this.f6293h;
        }
    }

    public t0(@NonNull JSONObject jSONObject) {
        a aVar = null;
        this.a = jSONObject.optString(AnalyticsContext.Device.DEVICE_ID_KEY, (String) null);
        jSONObject.optString("name", (String) null);
        this.c = jSONObject.optString("url", (String) null);
        String optString = jSONObject.optString("url_target", (String) null);
        a[] values = a.values();
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                break;
            }
            a aVar2 = values[i2];
            if (aVar2.f6293h.equalsIgnoreCase(optString)) {
                aVar = aVar2;
                break;
            }
            i2++;
        }
        this.f6286b = aVar;
        if (aVar == null) {
            this.f6286b = a.IN_APP_WEBVIEW;
        }
        jSONObject.optBoolean("close", true);
        if (jSONObject.has("outcomes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                this.d.add(new d1((JSONObject) jSONArray.get(i3)));
            }
        }
        if (jSONObject.has("tags")) {
            this.f = new h1(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has("prompts")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("prompts");
            for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                if (jSONArray2.get(i4).equals("location")) {
                    this.f6287e.add(new c1());
                }
            }
        }
    }
}
