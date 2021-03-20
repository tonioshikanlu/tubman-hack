package b.g.a.e;

import android.text.TextUtils;
import android.util.Log;
import b.g.a.b;
import java.util.HashMap;
import java.util.Map;

public class c extends b {

    /* renamed from: h  reason: collision with root package name */
    public String f408h;

    /* renamed from: i  reason: collision with root package name */
    public String f409i;

    /* renamed from: j  reason: collision with root package name */
    public Map<String, Object> f410j;

    public c(String str, int i2) {
        super("An error occurred when trying to authenticate with the server.");
        this.f408h = str != null ? "a0.sdk.internal_error.plain" : "a0.sdk.internal_error.empty";
        this.f409i = str == null ? "Empty response body" : str;
    }

    public c(String str, b bVar) {
        super(str, bVar);
    }

    public String a() {
        String str = this.f408h;
        return str != null ? str : "a0.sdk.internal_error.unknown";
    }

    public String b() {
        if (!TextUtils.isEmpty(this.f409i)) {
            return this.f409i;
        }
        if (!"a0.sdk.internal_error.unknown".equals(a())) {
            return "Failed with unknown error";
        }
        return String.format("Received error with code %s", new Object[]{a()});
    }

    public c(String str, String str2) {
        super("An error occurred when trying to authenticate with the server.");
        this.f408h = str;
        this.f409i = str2;
    }

    public c(Map<String, Object> map) {
        super("An error occurred when trying to authenticate with the server.");
        String str;
        HashMap hashMap = new HashMap(map);
        this.f410j = hashMap;
        String str2 = (String) (hashMap.containsKey("error") ? this.f410j.get("error") : this.f410j.get("code"));
        this.f408h = str2 == null ? "a0.sdk.internal_error.unknown" : str2;
        if (!this.f410j.containsKey("description")) {
            this.f409i = (String) this.f410j.get("error_description");
            if (!"invalid_request".equals(a())) {
                return;
            }
            if ("OIDC conformant clients cannot use /oauth/access_token".equals(b()) || "OIDC conformant clients cannot use /oauth/ro".equals(b())) {
                Log.w(b.class.getSimpleName(), "Your Auth0 Application is configured as 'OIDC Conformant' but this instance it's not. To authenticate you will need to enable the flag by calling Auth0#setOIDCConformant(true) on the Auth0 instance you used in the setup.");
                return;
            }
            return;
        }
        Object obj = this.f410j.get("description");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            if ("invalid_password".equals(this.f408h) && "PasswordStrengthError".equals(this.f410j.get("name"))) {
                str = new e((Map) obj).a;
            } else {
                return;
            }
        }
        this.f409i = str;
    }
}
