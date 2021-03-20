package com.google.api.client.googleapis.auth.oauth2;

import b.l.b.a.a.b.b;
import b.l.b.a.b.c;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import com.google.api.client.auth.oauth2.AuthorizationRequestUrl;
import java.util.Collection;

public class GoogleAuthorizationCodeRequestUrl extends b {
    @n("access_type")
    private String accessType;
    @n("approval_prompt")
    private String approvalPrompt;

    public AuthorizationRequestUrl b(String str, Object obj) {
        return (GoogleAuthorizationCodeRequestUrl) super.set(str, obj);
    }

    public AuthorizationRequestUrl c(String str) {
        return (GoogleAuthorizationCodeRequestUrl) super.c(str);
    }

    public AuthorizationRequestUrl f(Collection collection) {
        return (GoogleAuthorizationCodeRequestUrl) super.f(collection);
    }

    public b i(String str, Object obj) {
        return (GoogleAuthorizationCodeRequestUrl) super.set(str, obj);
    }

    public b j(String str) {
        return (GoogleAuthorizationCodeRequestUrl) super.c(str);
    }

    public b k(Collection collection) {
        return (GoogleAuthorizationCodeRequestUrl) super.f(collection);
    }

    /* renamed from: m */
    public GoogleAuthorizationCodeRequestUrl h() {
        return (GoogleAuthorizationCodeRequestUrl) super.clone();
    }

    public c set(String str, Object obj) {
        return (GoogleAuthorizationCodeRequestUrl) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m7set(String str, Object obj) {
        return (GoogleAuthorizationCodeRequestUrl) super.set(str, obj);
    }
}
