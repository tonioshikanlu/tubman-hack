package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.d.d;
import b.l.d.l;

public class FirebaseInitProvider extends ContentProvider {
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        a.B(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        d dVar;
        String str;
        String str2;
        Context context = getContext();
        synchronized (d.f4909i) {
            if (d.f4911k.containsKey("[DEFAULT]")) {
                dVar = d.c();
            } else {
                l a = l.a(context);
                if (a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    dVar = null;
                } else {
                    dVar = d.g(context, a, "[DEFAULT]");
                }
            }
        }
        if (dVar == null) {
            str2 = "FirebaseInitProvider";
            str = "FirebaseApp initialization unsuccessful";
        } else {
            str2 = "FirebaseInitProvider";
            str = "FirebaseApp initialization successful";
        }
        Log.i(str2, str);
        return false;
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
