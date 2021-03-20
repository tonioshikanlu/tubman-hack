package com.google.api.client.auth.oauth2;

import b.l.b.a.c.b;
import b.l.b.a.d.k;
import b.l.b.a.d.n;

public class TokenErrorResponse extends b {
    @n
    private String error;
    @n("error_description")
    private String errorDescription;
    @n("error_uri")
    private String errorUri;

    /* renamed from: a */
    public TokenErrorResponse clone() {
        return (TokenErrorResponse) super.clone();
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public b set(String str, Object obj) {
        return (TokenErrorResponse) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m5set(String str, Object obj) {
        return (TokenErrorResponse) super.set(str, obj);
    }
}
