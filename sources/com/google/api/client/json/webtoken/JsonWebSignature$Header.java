package com.google.api.client.json.webtoken;

import b.l.b.a.c.b;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import java.util.ArrayList;
import java.util.List;

public class JsonWebSignature$Header extends JsonWebToken$Header {
    @n("alg")
    private String algorithm;
    @n("crit")
    private List<String> critical;
    @n("jwk")
    private String jwk;
    @n("jku")
    private String jwkUrl;
    @n("kid")
    private String keyId;
    @n("x5c")
    private ArrayList<String> x509Certificates;
    @n("x5t")
    private String x509Thumbprint;
    @n("x5u")
    private String x509Url;

    public JsonWebToken$Header b(String str, Object obj) {
        return (JsonWebSignature$Header) super.set(str, obj);
    }

    /* renamed from: c */
    public JsonWebSignature$Header clone() {
        return (JsonWebSignature$Header) super.clone();
    }

    public b set(String str, Object obj) {
        return (JsonWebSignature$Header) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m18set(String str, Object obj) {
        return (JsonWebSignature$Header) super.set(str, obj);
    }
}
