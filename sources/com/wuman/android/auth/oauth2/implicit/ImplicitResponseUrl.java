package com.wuman.android.auth.oauth2.implicit;

import b.l.a.c.b.a;
import b.l.b.a.b.c;
import b.l.b.a.b.o;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

public class ImplicitResponseUrl extends c {
    @n("access_token")
    private String accessToken;
    @n
    private String error;
    @n("error_description")
    private String errorDescription;
    @n("error_uri")
    private String errorUri;
    @n("expires_in")
    private Long expiresInSeconds;
    @n
    private String scope;
    @n
    private String state;
    @n("token_type")
    private String tokenType;

    public ImplicitResponseUrl() {
    }

    public ImplicitResponseUrl(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            int port = uri.getPort();
            String rawPath = uri.getRawPath();
            String rawFragment = uri.getRawFragment();
            uri.getRawQuery();
            String rawUserInfo = uri.getRawUserInfo();
            Objects.requireNonNull(scheme);
            this.scheme = scheme;
            Objects.requireNonNull(host);
            this.host = host;
            a.o(port >= -1, "expected port >= -1");
            this.port = port;
            this.pathParts = c.toPathParts(rawPath, false);
            String str2 = null;
            this.fragment = rawFragment != null ? b.l.b.a.d.z.a.a(rawFragment) : null;
            if (rawFragment != null) {
                o.b(rawFragment, this);
            }
            this.userInfo = rawUserInfo != null ? b.l.b.a.d.z.a.a(rawUserInfo) : str2;
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public ImplicitResponseUrl clone() {
        return (ImplicitResponseUrl) super.clone();
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final Long getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    public c set(String str, Object obj) {
        return (ImplicitResponseUrl) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m20set(String str, Object obj) {
        return (ImplicitResponseUrl) super.set(str, obj);
    }
}
