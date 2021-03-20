package b.l.d.v;

import android.text.TextUtils;
import android.util.Log;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.BasePayload;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class a0 {
    public static final long d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f5302e = 0;
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5303b;
    public final long c;

    public a0(String str, String str2, long j2) {
        this.a = str;
        this.f5303b = str2;
        this.c = j2;
    }

    public static String a(String str, String str2, long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AnalyticsContext.Device.DEVICE_TOKEN_KEY, str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(BasePayload.TIMESTAMP_KEY, j2);
            return jSONObject.toString();
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static a0 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new a0(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new a0(jSONObject.getString(AnalyticsContext.Device.DEVICE_TOKEN_KEY), jSONObject.getString("appVersion"), jSONObject.getLong(BasePayload.TIMESTAMP_KEY));
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
