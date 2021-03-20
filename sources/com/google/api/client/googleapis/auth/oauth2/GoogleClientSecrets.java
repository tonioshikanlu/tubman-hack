package com.google.api.client.googleapis.auth.oauth2;

import b.l.b.a.c.b;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import java.util.List;

public final class GoogleClientSecrets extends b {
    @n
    private Details installed;
    @n
    private Details web;

    public static final class Details extends b {
        @n("auth_uri")
        private String authUri;
        @n("client_id")
        private String clientId;
        @n("client_secret")
        private String clientSecret;
        @n("redirect_uris")
        private List<String> redirectUris;
        @n("token_uri")
        private String tokenUri;

        /* renamed from: a */
        public Details clone() {
            return (Details) super.clone();
        }

        public b set(String str, Object obj) {
            return (Details) super.set(str, obj);
        }

        /* renamed from: set  reason: collision with other method in class */
        public k m10set(String str, Object obj) {
            return (Details) super.set(str, obj);
        }
    }

    /* renamed from: a */
    public GoogleClientSecrets clone() {
        return (GoogleClientSecrets) super.clone();
    }

    public b set(String str, Object obj) {
        return (GoogleClientSecrets) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m9set(String str, Object obj) {
        return (GoogleClientSecrets) super.set(str, obj);
    }
}
