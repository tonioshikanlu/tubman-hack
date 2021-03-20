package com.google.api.client.auth.oauth2;

import b.l.b.a.c.c;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import com.google.api.client.http.HttpTransport;
import java.util.Objects;

public class AuthorizationCodeTokenRequest extends TokenRequest {
    @n
    private String code;
    @n("redirect_uri")
    private String redirectUri;

    public AuthorizationCodeTokenRequest(HttpTransport httpTransport, c cVar, b.l.b.a.b.c cVar2, String str) {
        super(httpTransport, cVar, cVar2, "authorization_code");
        Objects.requireNonNull(str);
        this.code = str;
    }

    /* renamed from: set  reason: collision with other method in class */
    public TokenRequest m2set(String str, Object obj) {
        return (AuthorizationCodeTokenRequest) super.set(str, obj);
    }

    public TokenRequest setGrantType(String str) {
        super.setGrantType(str);
        return this;
    }

    public AuthorizationCodeTokenRequest setRedirectUri(String str) {
        this.redirectUri = str;
        return this;
    }

    public TokenRequest setResponseClass(Class cls) {
        this.responseClass = cls;
        return this;
    }

    public TokenRequest setTokenServerUrl(b.l.b.a.b.c cVar) {
        super.setTokenServerUrl(cVar);
        return this;
    }

    public k set(String str, Object obj) {
        return (AuthorizationCodeTokenRequest) super.set(str, obj);
    }
}
