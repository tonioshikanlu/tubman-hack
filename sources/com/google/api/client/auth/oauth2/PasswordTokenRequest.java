package com.google.api.client.auth.oauth2;

import b.l.b.a.b.c;
import b.l.b.a.d.k;
import b.l.b.a.d.n;

public class PasswordTokenRequest extends TokenRequest {
    @n
    private String password;
    @n
    private String username;

    /* renamed from: set  reason: collision with other method in class */
    public TokenRequest m3set(String str, Object obj) {
        return (PasswordTokenRequest) super.set(str, obj);
    }

    public TokenRequest setGrantType(String str) {
        super.setGrantType(str);
        return this;
    }

    public TokenRequest setResponseClass(Class cls) {
        this.responseClass = cls;
        return this;
    }

    public TokenRequest setTokenServerUrl(c cVar) {
        super.setTokenServerUrl(cVar);
        return this;
    }

    public k set(String str, Object obj) {
        return (PasswordTokenRequest) super.set(str, obj);
    }
}
