package com.google.api.client.auth.oauth2;

import b.l.b.a.a.b.j;
import b.l.b.a.b.d;
import b.l.b.a.b.f;
import b.l.b.a.b.g;
import b.l.b.a.b.h;
import b.l.b.a.c.a;
import b.l.b.a.c.c;
import b.l.b.a.c.e;
import b.l.b.a.d.k;
import b.l.b.a.d.m;
import b.l.b.a.d.n;
import com.google.api.client.http.HttpTransport;
import java.util.Collection;
import java.util.Objects;

public class TokenRequest extends k {
    public d clientAuthentication;
    @n("grant_type")
    private String grantType;
    public final c jsonFactory;
    public g requestInitializer;
    public Class<? extends TokenResponse> responseClass;
    @n("scope")
    private String scopes;
    public b.l.b.a.b.c tokenServerUrl;
    public final HttpTransport transport;

    public TokenRequest(HttpTransport httpTransport, c cVar, b.l.b.a.b.c cVar2, String str) {
        Objects.requireNonNull(httpTransport);
        this.transport = httpTransport;
        Objects.requireNonNull(cVar);
        this.jsonFactory = cVar;
        setTokenServerUrl(cVar2);
        setGrantType(str);
        setResponseClass(TokenResponse.class);
    }

    public TokenResponse execute() {
        HttpTransport httpTransport = this.transport;
        j jVar = new j(this);
        Objects.requireNonNull(httpTransport);
        b.l.b.a.b.c cVar = this.tokenServerUrl;
        b.l.b.a.b.n nVar = new b.l.b.a.b.n(this);
        Object obj = null;
        f fVar = new f(httpTransport, (String) null);
        jVar.initialize(fVar);
        fVar.d("POST");
        if (cVar != null) {
            fVar.f4727k = cVar;
        }
        fVar.f4724h = nVar;
        fVar.f4731o = new e(this.jsonFactory);
        boolean z = false;
        fVar.f4733q = false;
        h b2 = fVar.b();
        if (b2.e()) {
            Class<? extends TokenResponse> cls = this.responseClass;
            int i2 = b2.f;
            if (b2.f4737h.f4726j.equals("HEAD") || i2 / 100 == 1 || i2 == 204 || i2 == 304) {
                b2.d();
            } else {
                z = true;
            }
            if (z) {
                e eVar = (e) b2.f4737h.f4731o;
                b.l.b.a.c.f b3 = eVar.a.b(b2.b(), b2.c());
                eVar.a(b3);
                obj = b3.H(cls, true, (a) null);
            }
            return (TokenResponse) obj;
        }
        throw b.l.b.a.a.b.k.a(this.jsonFactory, b2);
    }

    public TokenRequest set(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    public TokenRequest setGrantType(String str) {
        Objects.requireNonNull(str);
        this.grantType = str;
        return this;
    }

    public TokenRequest setResponseClass(Class<? extends TokenResponse> cls) {
        this.responseClass = cls;
        return this;
    }

    public TokenRequest setScopes(Collection<String> collection) {
        this.scopes = collection == null ? null : m.b(' ').a(collection);
        return this;
    }

    public TokenRequest setTokenServerUrl(b.l.b.a.b.c cVar) {
        this.tokenServerUrl = cVar;
        b.l.a.c.b.a.q(cVar.fragment == null);
        return this;
    }
}
