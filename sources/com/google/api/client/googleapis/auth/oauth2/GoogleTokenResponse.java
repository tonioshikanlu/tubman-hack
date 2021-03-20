package com.google.api.client.googleapis.auth.oauth2;

import b.l.b.a.c.b;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import com.google.api.client.auth.oauth2.TokenResponse;

public class GoogleTokenResponse extends TokenResponse {
    @n("id_token")
    private String idToken;

    public TokenResponse c(String str, Object obj) {
        return (GoogleTokenResponse) super.set(str, obj);
    }

    /* renamed from: d */
    public GoogleTokenResponse clone() {
        return (GoogleTokenResponse) super.clone();
    }

    public b set(String str, Object obj) {
        return (GoogleTokenResponse) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m12set(String str, Object obj) {
        return (GoogleTokenResponse) super.set(str, obj);
    }
}
