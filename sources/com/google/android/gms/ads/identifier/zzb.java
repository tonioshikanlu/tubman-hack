package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import b.l.a.c.c.i;

public final class zzb {
    private SharedPreferences zzs;

    public zzb(Context context) {
        Context context2;
        SharedPreferences sharedPreferences;
        try {
            boolean z = i.a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                sharedPreferences = null;
            } else {
                sharedPreferences = context2.getSharedPreferences("google_ads_flags", 0);
            }
            this.zzs = sharedPreferences;
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.zzs = null;
        }
    }

    public final boolean getBoolean(String str, boolean z) {
        try {
            SharedPreferences sharedPreferences = this.zzs;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    public final float getFloat(String str, float f) {
        try {
            SharedPreferences sharedPreferences = this.zzs;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    public final String getString(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.zzs;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
