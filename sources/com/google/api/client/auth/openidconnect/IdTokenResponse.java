package com.google.api.client.auth.openidconnect;

import b.l.b.a.c.b;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import com.google.api.client.auth.oauth2.TokenResponse;

public class IdTokenResponse extends TokenResponse {
    @n("id_token")
    private String idToken;

    public TokenResponse c(String str, Object obj) {
        return (IdTokenResponse) super.set(str, obj);
    }

    /* renamed from: d */
    public IdTokenResponse clone() {
        return (IdTokenResponse) super.clone();
    }

    public b set(String str, Object obj) {
        return (IdTokenResponse) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m6set(String str, Object obj) {
        return (IdTokenResponse) super.set(str, obj);
    }
}
