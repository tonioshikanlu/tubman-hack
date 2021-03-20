package com.google.api.client.googleapis.auth.oauth2;

import b.l.b.a.a.b.d;
import b.l.b.a.b.c;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import com.google.api.client.auth.oauth2.AuthorizationRequestUrl;
import java.util.Collection;

public class GoogleBrowserClientRequestUrl extends d {
    @n("approval_prompt")
    private String approvalPrompt;

    public AuthorizationRequestUrl b(String str, Object obj) {
        return (GoogleBrowserClientRequestUrl) super.set(str, obj);
    }

    public AuthorizationRequestUrl c(String str) {
        return (GoogleBrowserClientRequestUrl) super.c(str);
    }

    public AuthorizationRequestUrl f(Collection collection) {
        return (GoogleBrowserClientRequestUrl) super.f(collection);
    }

    public d i(String str, Object obj) {
        return (GoogleBrowserClientRequestUrl) super.set(str, obj);
    }

    public d j(String str) {
        return (GoogleBrowserClientRequestUrl) super.c(str);
    }

    public d k(Collection collection) {
        return (GoogleBrowserClientRequestUrl) super.f(collection);
    }

    /* renamed from: m */
    public GoogleBrowserClientRequestUrl h() {
        return (GoogleBrowserClientRequestUrl) super.clone();
    }

    public c set(String str, Object obj) {
        return (GoogleBrowserClientRequestUrl) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m8set(String str, Object obj) {
        return (GoogleBrowserClientRequestUrl) super.set(str, obj);
    }
}
