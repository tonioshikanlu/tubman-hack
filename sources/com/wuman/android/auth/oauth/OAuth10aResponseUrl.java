package com.wuman.android.auth.oauth;

import b.l.b.a.b.c;
import b.l.b.a.d.k;
import b.l.b.a.d.n;

public class OAuth10aResponseUrl extends c {
    @n("error")
    private String error;
    @n("oauth_token")
    private String token;
    @n("oauth_verifier")
    private String verifier;

    public OAuth10aResponseUrl() {
    }

    public OAuth10aResponseUrl(String str) {
        super(str);
    }

    public OAuth10aResponseUrl clone() {
        return (OAuth10aResponseUrl) super.clone();
    }

    public final String getError() {
        return this.error;
    }

    public final String getVerifier() {
        return this.verifier;
    }

    public c set(String str, Object obj) {
        return (OAuth10aResponseUrl) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m19set(String str, Object obj) {
        return (OAuth10aResponseUrl) super.set(str, obj);
    }
}
