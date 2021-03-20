package b.g.a.e.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class i implements j {
    public final SharedPreferences a;

    public i(@NonNull Context context) {
        if (!TextUtils.isEmpty("com.auth0.authentication.storage")) {
            this.a = context.getSharedPreferences("com.auth0.authentication.storage", 0);
            return;
        }
        throw new IllegalArgumentException("The SharedPreferences name is invalid.");
    }

    @Nullable
    public Long a(@NonNull String str) {
        if (!this.a.contains(str)) {
            return null;
        }
        return Long.valueOf(this.a.getLong(str, 0));
    }

    public void b(@NonNull String str, @Nullable String str2) {
        (str2 == null ? this.a.edit().remove(str) : this.a.edit().putString(str, str2)).apply();
    }

    @Nullable
    public Boolean c(@NonNull String str) {
        if (!this.a.contains(str)) {
            return null;
        }
        return Boolean.valueOf(this.a.getBoolean(str, false));
    }

    public void d(@NonNull String str, @Nullable Boolean bool) {
        (bool == null ? this.a.edit().remove(str) : this.a.edit().putBoolean(str, bool.booleanValue())).apply();
    }

    public void e(@NonNull String str) {
        this.a.edit().remove(str).apply();
    }

    public void f(@NonNull String str, @Nullable Long l2) {
        (l2 == null ? this.a.edit().remove(str) : this.a.edit().putLong(str, l2.longValue())).apply();
    }

    @Nullable
    public String g(@NonNull String str) {
        if (!this.a.contains(str)) {
            return null;
        }
        return this.a.getString(str, (String) null);
    }
}
