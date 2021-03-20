package b.l.d.q.f.m.k;

import android.text.TextUtils;
import b.l.d.q.f.g.f0;
import b.l.d.q.f.j.b;
import b.l.d.q.f.j.c;
import b.l.d.q.f.m.j.f;
import com.amplitude.api.DeviceInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5285b;

    public a(String str, b bVar) {
        if (str != null) {
            this.f5285b = bVar;
            this.a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public final b.l.d.q.f.j.a a(b.l.d.q.f.j.a aVar, f fVar) {
        b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.a);
        b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", DeviceInfo.OS_NAME);
        b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "17.3.1");
        b(aVar, "Accept", "application/json");
        b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f5280b);
        b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.c);
        b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.d);
        b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((f0) fVar.f5281e).b());
        return aVar;
    }

    public final void b(b.l.d.q.f.j.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.c.put(str, str2);
        }
    }

    public final Map<String, String> c(f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f5283h);
        hashMap.put("display_version", fVar.f5282g);
        hashMap.put("source", Integer.toString(fVar.f5284i));
        String str = fVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject d(c cVar) {
        b.l.d.q.f.b bVar = b.l.d.q.f.b.a;
        int i2 = cVar.a;
        bVar.b("Settings result was: " + i2);
        if (i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203) {
            String str = cVar.f5257b;
            try {
                return new JSONObject(str);
            } catch (Exception e2) {
                StringBuilder y = b.e.a.a.a.y("Failed to parse settings JSON from ");
                y.append(this.a);
                bVar.c(y.toString(), e2);
                bVar.b("Settings response " + str);
                return null;
            }
        } else {
            StringBuilder y2 = b.e.a.a.a.y("Failed to retrieve settings from ");
            y2.append(this.a);
            bVar.d(y2.toString());
            return null;
        }
    }
}
