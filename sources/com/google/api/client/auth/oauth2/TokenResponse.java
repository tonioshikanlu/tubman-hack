package com.google.api.client.auth.oauth2;

import b.l.b.a.c.b;
import b.l.b.a.d.n;

public class TokenResponse extends b {
    @n("access_token")
    private String accessToken;
    @n("expires_in")
    private Long expiresInSeconds;
    @n("refresh_token")
    private String refreshToken;
    @n
    private String scope;
    @n("token_type")
    private String tokenType;

    /* renamed from: a */
    public TokenResponse clone() {
        return (TokenResponse) super.clone();
    }

    public String b() {
        return this.refreshToken;
    }

    /* renamed from: c */
    public TokenResponse set(String str, Object obj) {
        return (TokenResponse) super.set(str, obj);
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public Long getExpiresInSeconds() {
        return this.expiresInSeconds;
    }
}
