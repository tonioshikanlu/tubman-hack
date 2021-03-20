package b.l.d.o.e0;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import b.l.a.c.b.a;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class w {
    @VisibleForTesting
    public static final Map<String, String> a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map<String, String> map = a;
                if (map.containsKey(string)) {
                    String str2 = map.get(string);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string2).length());
                    sb.append(str2);
                    sb.append(":");
                    sb.append(string2);
                    return a.T0(sb.toString());
                }
            }
            String valueOf = String.valueOf(str);
            return a.T0(valueOf.length() != 0 ? "WEB_INTERNAL_ERROR:".concat(valueOf) : new String("WEB_INTERNAL_ERROR:"));
        } catch (JSONException e2) {
            String localizedMessage = e2.getLocalizedMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(localizedMessage).length());
            b.e.a.a.a.L(sb2, "WEB_INTERNAL_ERROR:", str, "[ ", localizedMessage);
            sb2.append(" ]");
            return a.T0(sb2.toString());
        }
    }
}
