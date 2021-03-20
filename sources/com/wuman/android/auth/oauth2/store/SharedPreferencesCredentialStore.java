package com.wuman.android.auth.oauth2.store;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import b.l.b.a.a.b.f;
import b.l.b.a.a.b.h;
import b.l.b.a.c.a;
import b.l.b.a.c.c;
import java.util.Objects;

@TargetApi(9)
public class SharedPreferencesCredentialStore implements h {
    public final c jsonFactory;
    public final SharedPreferences prefs;

    public SharedPreferencesCredentialStore(Context context, String str, c cVar) {
        Objects.requireNonNull(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        Objects.requireNonNull(sharedPreferences);
        this.prefs = sharedPreferences;
        this.jsonFactory = cVar;
    }

    public void delete(String str, f fVar) {
        Objects.requireNonNull(str);
        this.prefs.edit().remove(str).apply();
    }

    public boolean load(String str, f fVar) {
        Objects.requireNonNull(str);
        String string = this.prefs.getString(str, (String) null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        FilePersistedCredential filePersistedCredential = (FilePersistedCredential) this.jsonFactory.d(string).H(FilePersistedCredential.class, false, (a) null);
        if (filePersistedCredential == null) {
            return false;
        }
        filePersistedCredential.load(fVar);
        return true;
    }

    public void store(String str, f fVar) {
        Objects.requireNonNull(str);
        FilePersistedCredential filePersistedCredential = new FilePersistedCredential();
        filePersistedCredential.store(fVar);
        this.prefs.edit().putString(str, this.jsonFactory.e(filePersistedCredential, false)).apply();
    }
}
