package com.google.api.client.json.webtoken;

import b.l.b.a.c.b;
import b.l.b.a.d.n;

public class JsonWebToken$Payload extends b {
    @n("aud")
    private Object audience;
    @n("exp")
    private Long expirationTimeSeconds;
    @n("iat")
    private Long issuedAtTimeSeconds;
    @n("iss")
    private String issuer;
    @n("jti")
    private String jwtId;
    @n("nbf")
    private Long notBeforeTimeSeconds;
    @n("sub")
    private String subject;
    @n("typ")
    private String type;

    /* renamed from: a */
    public JsonWebToken$Payload clone() {
        return (JsonWebToken$Payload) super.clone();
    }

    /* renamed from: b */
    public JsonWebToken$Payload set(String str, Object obj) {
        return (JsonWebToken$Payload) super.set(str, obj);
    }
}
