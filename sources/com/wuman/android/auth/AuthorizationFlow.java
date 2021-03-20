package com.wuman.android.auth;

import b.l.b.a.a.b.a;
import b.l.b.a.a.b.f;
import b.l.b.a.a.b.h;
import b.l.b.a.a.b.i;
import b.l.b.a.b.d;
import b.l.b.a.b.g;
import b.l.b.a.c.c;
import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.http.HttpTransport;
import com.wuman.android.auth.oauth2.explicit.LenientAuthorizationCodeTokenRequest;
import com.wuman.android.auth.oauth2.implicit.ImplicitResponseUrl;
import java.util.Objects;
import java.util.logging.Logger;

public class AuthorizationFlow extends a {

    public static class Builder extends a.C0068a {
        public Builder(f.a aVar, HttpTransport httpTransport, c cVar, b.l.b.a.b.c cVar2, d dVar, String str, String str2) {
            super(aVar, httpTransport, cVar, cVar2, dVar, str, str2);
        }
    }

    static {
        Logger.getLogger("OAuthAndroid");
    }

    public AuthorizationFlow(Builder builder) {
        super(builder);
    }

    public f createAndStoreCredential(ImplicitResponseUrl implicitResponseUrl, String str) {
        b.l.b.a.b.c cVar;
        f.b bVar = new f.b(this.method);
        bVar.transport = this.transport;
        bVar.jsonFactory = this.jsonFactory;
        String str2 = this.tokenServerEncodedUrl;
        if (str2 == null) {
            cVar = null;
        } else {
            cVar = new b.l.b.a.b.c(str2);
        }
        bVar.tokenServerUrl = cVar;
        bVar.clientAuthentication = this.clientAuthentication;
        bVar.requestInitializer = this.requestInitializer;
        b.l.b.a.d.f fVar = this.clock;
        Objects.requireNonNull(fVar);
        bVar.clock = fVar;
        h hVar = this.credentialStore;
        if (hVar != null) {
            bVar.refreshListeners.add(new i(str, hVar));
        }
        bVar.refreshListeners.addAll(this.refreshListeners);
        f fVar2 = new f(bVar);
        fVar2.setAccessToken(implicitResponseUrl.getAccessToken());
        f expiresInSeconds = fVar2.setExpiresInSeconds(implicitResponseUrl.getExpiresInSeconds());
        h hVar2 = this.credentialStore;
        if (hVar2 != null) {
            hVar2.store(str, expiresInSeconds);
        }
        return expiresInSeconds;
    }

    public AuthorizationCodeTokenRequest newTokenRequest(String str) {
        LenientAuthorizationCodeTokenRequest lenientAuthorizationCodeTokenRequest = new LenientAuthorizationCodeTokenRequest(this.transport, this.jsonFactory, new b.l.b.a.b.c(this.tokenServerEncodedUrl), str);
        lenientAuthorizationCodeTokenRequest.clientAuthentication = this.clientAuthentication;
        lenientAuthorizationCodeTokenRequest.setScopes(this.scopes);
        lenientAuthorizationCodeTokenRequest.requestInitializer = new g() {
            public void initialize(b.l.b.a.b.f fVar) {
                g gVar = AuthorizationFlow.this.requestInitializer;
                if (gVar != null) {
                    gVar.initialize(fVar);
                }
                fVar.f4721b.n("application/json");
            }
        };
        return lenientAuthorizationCodeTokenRequest;
    }
}
