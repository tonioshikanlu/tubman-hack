package b.l.a.c.f.e;

import android.util.Log;
import b.e.a.a.a;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public final class uk {
    public Long a;

    /* renamed from: b  reason: collision with root package name */
    public Long f3333b;

    public static uk a(String str) {
        try {
            uk ukVar = new uk();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            ukVar.a = Long.valueOf(jSONObject.optLong("iat"));
            ukVar.f3333b = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return ukVar;
        } catch (JSONException e2) {
            if (Log.isLoggable("JwtToken", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 41);
                sb.append("Failed to read JwtToken from JSONObject. ");
                sb.append(valueOf);
                Log.d("JwtToken", sb.toString());
            }
            String valueOf2 = String.valueOf(e2);
            throw new UnsupportedEncodingException(a.q(new StringBuilder(valueOf2.length() + 41), "Failed to read JwtToken from JSONObject. ", valueOf2));
        }
    }
}
