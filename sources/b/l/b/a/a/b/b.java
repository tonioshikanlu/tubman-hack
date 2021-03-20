package b.l.b.a.a.b;

import com.google.api.client.auth.oauth2.AuthorizationRequestUrl;
import java.util.Collection;
import java.util.Collections;

public class b extends AuthorizationRequestUrl {
    public b(String str, String str2) {
        super(str, str2, Collections.singleton("code"));
    }

    /* renamed from: h */
    public b clone() {
        return (b) super.clone();
    }

    /* renamed from: i */
    public b set(String str, Object obj) {
        return (b) super.set(str, obj);
    }

    /* renamed from: j */
    public b c(String str) {
        super.c(str);
        return this;
    }

    /* renamed from: k */
    public b f(Collection<String> collection) {
        super.f(collection);
        return this;
    }
}
