package com.google.api.client.auth.oauth2;

import b.l.a.c.b.a;
import b.l.b.a.b.c;
import b.l.b.a.d.m;
import b.l.b.a.d.n;
import java.util.Collection;
import java.util.Objects;

public class AuthorizationRequestUrl extends c {
    @n("client_id")
    private String clientId;
    @n("redirect_uri")
    private String redirectUri;
    @n("response_type")
    private String responseTypes;
    @n("scope")
    private String scopes;
    @n
    private String state;

    public AuthorizationRequestUrl(String str, String str2, Collection<String> collection) {
        super(str);
        a.q(this.fragment == null);
        c(str2);
        f(collection);
    }

    /* renamed from: a */
    public AuthorizationRequestUrl clone() {
        return (AuthorizationRequestUrl) super.clone();
    }

    /* renamed from: b */
    public AuthorizationRequestUrl set(String str, Object obj) {
        return (AuthorizationRequestUrl) super.set(str, obj);
    }

    public AuthorizationRequestUrl c(String str) {
        Objects.requireNonNull(str);
        this.clientId = str;
        return this;
    }

    public AuthorizationRequestUrl d(String str) {
        this.redirectUri = str;
        return this;
    }

    public AuthorizationRequestUrl f(Collection<String> collection) {
        this.responseTypes = m.b(' ').a(collection);
        return this;
    }

    public AuthorizationRequestUrl g(Collection<String> collection) {
        this.scopes = (collection == null || !collection.iterator().hasNext()) ? null : m.b(' ').a(collection);
        return this;
    }
}
