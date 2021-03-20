package com.google.api.client.http;

import b.l.b.a.b.k;
import java.util.Arrays;
import java.util.logging.Logger;

public abstract class HttpTransport {
    public static final Logger a = Logger.getLogger(HttpTransport.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f7330b;

    static {
        String[] strArr = {"DELETE", "GET", "POST", "PUT"};
        f7330b = strArr;
        Arrays.sort(strArr);
    }

    public abstract k a(String str, String str2);
}
