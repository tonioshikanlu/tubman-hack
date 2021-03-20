package com.google.api.client.googleapis.auth.oauth2;

import b.l.b.a.c.b;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import com.google.api.client.auth.openidconnect.IdToken$Payload;
import com.google.api.client.json.webtoken.JsonWebToken$Payload;

public class GoogleIdToken$Payload extends IdToken$Payload {
    @n("email")
    private String email;
    @n("email_verified")
    private Object emailVerified;
    @n("hd")
    private String hostedDomain;

    public JsonWebToken$Payload b(String str, Object obj) {
        return (GoogleIdToken$Payload) super.set(str, obj);
    }

    public IdToken$Payload d(String str, Object obj) {
        return (GoogleIdToken$Payload) super.set(str, obj);
    }

    /* renamed from: f */
    public GoogleIdToken$Payload clone() {
        return (GoogleIdToken$Payload) super.clone();
    }

    public b set(String str, Object obj) {
        return (GoogleIdToken$Payload) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m11set(String str, Object obj) {
        return (GoogleIdToken$Payload) super.set(str, obj);
    }
}
