package com.google.api.client.googleapis.json;

import b.l.b.a.c.b;
import b.l.b.a.d.g;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import java.util.List;

public class GoogleJsonError extends b {
    @n
    private int code;
    @n
    private List<ErrorInfo> errors;
    @n
    private String message;

    public static class ErrorInfo extends b {
        @n
        private String domain;
        @n
        private String location;
        @n
        private String locationType;
        @n
        private String message;
        @n
        private String reason;

        /* renamed from: a */
        public ErrorInfo clone() {
            return (ErrorInfo) super.clone();
        }

        public b set(String str, Object obj) {
            return (ErrorInfo) super.set(str, obj);
        }

        /* renamed from: set  reason: collision with other method in class */
        public k m14set(String str, Object obj) {
            return (ErrorInfo) super.set(str, obj);
        }
    }

    static {
        g.h(ErrorInfo.class);
    }

    /* renamed from: a */
    public GoogleJsonError clone() {
        return (GoogleJsonError) super.clone();
    }

    public b set(String str, Object obj) {
        return (GoogleJsonError) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m13set(String str, Object obj) {
        return (GoogleJsonError) super.set(str, obj);
    }
}
