package com.wuman.android.auth.oauth2.store;

import b.l.b.a.a.b.f;
import b.l.b.a.c.b;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import com.wuman.android.auth.oauth.OAuthHmacCredential;

public class FilePersistedCredential extends b {
    @n("access_token")
    private String accessToken;
    @n("consumer_key")
    private String consumerKey;
    @n("expiration_time_millis")
    private Long expirationTimeMillis;
    @n("refresh_token")
    private String refreshToken;
    @n("shared_secret")
    private String sharedSecret;
    @n("token_shared_secret")
    private String tokenSharedSecret;

    public FilePersistedCredential clone() {
        return (FilePersistedCredential) super.clone();
    }

    public void load(f fVar) {
        fVar.setAccessToken(this.accessToken);
        fVar.setRefreshToken(this.refreshToken);
        fVar.setExpirationTimeMilliseconds(this.expirationTimeMillis);
        if (fVar instanceof OAuthHmacCredential) {
            OAuthHmacCredential oAuthHmacCredential = (OAuthHmacCredential) fVar;
            oAuthHmacCredential.tokenSharedSecret = this.tokenSharedSecret;
            oAuthHmacCredential.postConstruct();
            oAuthHmacCredential.consumerKey = this.consumerKey;
            oAuthHmacCredential.postConstruct();
            oAuthHmacCredential.sharedSecret = this.sharedSecret;
            oAuthHmacCredential.postConstruct();
        }
    }

    public b set(String str, Object obj) {
        return (FilePersistedCredential) super.set(str, obj);
    }

    public void store(f fVar) {
        this.accessToken = fVar.getAccessToken();
        this.refreshToken = fVar.getRefreshToken();
        this.expirationTimeMillis = fVar.getExpirationTimeMilliseconds();
        if (fVar instanceof OAuthHmacCredential) {
            OAuthHmacCredential oAuthHmacCredential = (OAuthHmacCredential) fVar;
            this.tokenSharedSecret = oAuthHmacCredential.tokenSharedSecret;
            this.consumerKey = oAuthHmacCredential.consumerKey;
            this.sharedSecret = oAuthHmacCredential.sharedSecret;
        }
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m21set(String str, Object obj) {
        return (FilePersistedCredential) super.set(str, obj);
    }
}
