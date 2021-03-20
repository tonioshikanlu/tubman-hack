package com.google.api.client.auth.openidconnect;

import b.l.b.a.d.n;
import com.google.api.client.json.webtoken.JsonWebToken$Payload;
import java.util.List;

public class IdToken$Payload extends JsonWebToken$Payload {
    @n("at_hash")
    private String accessTokenHash;
    @n("auth_time")
    private Long authorizationTimeSeconds;
    @n("azp")
    private String authorizedParty;
    @n("acr")
    private String classReference;
    @n("amr")
    private List<String> methodsReferences;
    @n
    private String nonce;

    /* renamed from: c */
    public IdToken$Payload clone() {
        return (IdToken$Payload) super.clone();
    }

    /* renamed from: d */
    public IdToken$Payload set(String str, Object obj) {
        return (IdToken$Payload) super.set(str, obj);
    }
}
