package com.wuman.android.auth.oauth2.store;

import b.l.b.a.c.b;
import b.l.b.a.d.k;
import b.l.b.a.d.n;
import java.util.HashMap;
import java.util.Map;

public class FilePersistedCredentials extends b {
    @n
    private Map<String, FilePersistedCredential> credentials = new HashMap();

    public FilePersistedCredentials clone() {
        return (FilePersistedCredentials) super.clone();
    }

    public b set(String str, Object obj) {
        return (FilePersistedCredentials) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public k m22set(String str, Object obj) {
        return (FilePersistedCredentials) super.set(str, obj);
    }
}
