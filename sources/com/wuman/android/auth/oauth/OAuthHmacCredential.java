package com.wuman.android.auth.oauth;

import b.l.b.a.a.a.a;
import b.l.b.a.a.a.b;
import b.l.b.a.a.b.f;
import b.l.b.a.b.h;
import com.google.api.client.auth.oauth2.TokenResponse;
import java.util.Objects;

public class OAuthHmacCredential extends f {
    public b authorizer;
    public String consumerKey;
    public String sharedSecret;
    public String tokenSharedSecret;

    public boolean handleResponse(b.l.b.a.b.f fVar, h hVar, boolean z) {
        if (hVar.f != 401) {
            return false;
        }
        super.setAccessToken((String) null);
        postConstruct();
        return false;
    }

    public void initialize(b.l.b.a.b.f fVar) {
        b bVar = this.authorizer;
        Objects.requireNonNull(bVar);
        fVar.a = bVar;
        fVar.a = this;
        fVar.f4730n = this;
    }

    public void intercept(b.l.b.a.b.f fVar) {
        super.intercept(fVar);
        this.authorizer.intercept(fVar);
    }

    public final void postConstruct() {
        a aVar = new a();
        aVar.a = this.sharedSecret;
        aVar.f4703b = this.tokenSharedSecret;
        b bVar = new b();
        this.authorizer = bVar;
        bVar.f4706b = this.consumerKey;
        bVar.a = aVar;
        bVar.f4708g = getAccessToken();
    }

    public f setAccessToken(String str) {
        super.setAccessToken(str);
        postConstruct();
        return this;
    }

    public f setExpirationTimeMilliseconds(Long l2) {
        super.setExpirationTimeMilliseconds(l2);
        return this;
    }

    public f setExpiresInSeconds(Long l2) {
        return (OAuthHmacCredential) super.setExpiresInSeconds(l2);
    }

    public f setFromTokenResponse(TokenResponse tokenResponse) {
        super.setFromTokenResponse(tokenResponse);
        return this;
    }

    public f setRefreshToken(String str) {
        super.setRefreshToken(str);
        return this;
    }
}
