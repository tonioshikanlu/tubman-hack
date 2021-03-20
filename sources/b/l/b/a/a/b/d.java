package b.l.b.a.a.b;

import com.google.api.client.auth.oauth2.AuthorizationRequestUrl;
import com.segment.analytics.AnalyticsContext;
import java.util.Collection;
import java.util.Collections;

public class d extends AuthorizationRequestUrl {
    public d(String str, String str2) {
        super(str, str2, Collections.singleton(AnalyticsContext.Device.DEVICE_TOKEN_KEY));
    }

    /* renamed from: h */
    public d clone() {
        return (d) super.clone();
    }

    /* renamed from: i */
    public d set(String str, Object obj) {
        return (d) super.set(str, obj);
    }

    /* renamed from: j */
    public d c(String str) {
        super.c(str);
        return this;
    }

    /* renamed from: k */
    public d f(Collection<String> collection) {
        super.f(collection);
        return this;
    }
}
