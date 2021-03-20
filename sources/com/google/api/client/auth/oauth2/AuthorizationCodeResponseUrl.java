package com.google.api.client.auth.oauth2;

import b.l.a.c.b.a;
import b.l.b.a.b.c;
import b.l.b.a.d.k;
import b.l.b.a.d.n;

public class AuthorizationCodeResponseUrl extends c {
    @n
    private String code;
    @n
    private String error;
    @n("error_description")
    private String errorDescription;
    @n("error_uri")
    private String errorUri;
    @n
    private String state;

    public AuthorizationCodeResponseUrl(String str) {
        super(str);
        a.q((this.code == null) == (this.error == null) ? false : true);
    }

    /* renamed from: a */
    public AuthorizationCodeResponseUrl clone() {
        return (AuthorizationCodeResponseUrl) super.clone();
    }

    public final String b() {
        return this.code;
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public c set(String str, Object obj) {
        return (AuthorizationCodeResponseUrl) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m1set(String str, Object obj) {
        return (AuthorizationCodeResponseUrl) super.set(str, obj);
    }
}
