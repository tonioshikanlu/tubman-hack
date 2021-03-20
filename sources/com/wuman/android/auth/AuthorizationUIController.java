package com.wuman.android.auth;

import b.l.b.a.a.b.b;
import b.l.b.a.a.b.d;
import com.wuman.android.auth.oauth2.implicit.ImplicitResponseUrl;

public interface AuthorizationUIController {
    String getRedirectUri();

    void requestAuthorization(b bVar);

    void requestAuthorization(d dVar);

    void stop();

    String waitForExplicitCode();

    ImplicitResponseUrl waitForImplicitResponseUrl();
}
