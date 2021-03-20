package b.l.a.c.f.e;

import android.util.Log;
import androidx.annotation.NonNull;
import b.e.a.a.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class wj implements bj<wj> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f3383i = "b.l.a.c.f.e.wj";

    /* renamed from: h  reason: collision with root package name */
    public String f3384h;

    public final wj a(@NonNull String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f3384h = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e2) {
            String str2 = f3383i;
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52 + String.valueOf(message).length());
            sb.append("Failed to parse error for string [");
            sb.append(str);
            sb.append("] with exception: ");
            sb.append(message);
            Log.e(str2, sb.toString());
            throw new vg(a.r(new StringBuilder(String.valueOf(str).length() + 35), "Failed to parse error for string [", str, "]"), e2);
        }
    }

    public final /* bridge */ /* synthetic */ bj d(@NonNull String str) {
        a(str);
        return this;
    }
}
