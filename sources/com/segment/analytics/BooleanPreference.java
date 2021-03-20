package com.segment.analytics;

import android.content.SharedPreferences;

public class BooleanPreference {
    private final boolean defaultValue;
    private final String key;
    private final SharedPreferences preferences;

    public BooleanPreference(SharedPreferences sharedPreferences, String str, boolean z) {
        this.preferences = sharedPreferences;
        this.key = str;
        this.defaultValue = z;
    }

    public boolean get() {
        return this.preferences.getBoolean(this.key, this.defaultValue);
    }

    public void set(boolean z) {
        this.preferences.edit().putBoolean(this.key, z).apply();
    }
}
