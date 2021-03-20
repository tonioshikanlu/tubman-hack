package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import b.l.a.c.b.a;
import b.l.a.d.a.b.k0;
import b.l.a.d.a.b.r;
import b.l.a.d.a.b.s;
import b.l.a.d.a.b.x;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Objects;

public abstract class AssetPackState {
    public static AssetPackState b(@NonNull String str, int i2, int i3, long j2, long j3, double d, int i4) {
        return new x(str, i2, i3, j2, j3, (int) Math.rint(100.0d * d), i4);
    }

    public static AssetPackState d(Bundle bundle, String str, k0 k0Var, r rVar) {
        double doubleValue;
        Bundle bundle2 = bundle;
        String str2 = str;
        k0 k0Var2 = k0Var;
        int i2 = bundle2.getInt(a.R(NotificationCompat.CATEGORY_STATUS, str2));
        Objects.requireNonNull((s) rVar);
        int i3 = bundle2.getInt(a.R("error_code", str2));
        long j2 = bundle2.getLong(a.R("bytes_downloaded", str2));
        long j3 = bundle2.getLong(a.R("total_bytes_to_download", str2));
        synchronized (k0Var) {
            Double d = k0Var2.a.get(str2);
            doubleValue = d == null ? ShadowDrawableWrapper.COS_45 : d.doubleValue();
        }
        long j4 = bundle2.getLong(a.R("pack_version", str2));
        long j5 = bundle2.getLong(a.R("pack_base_version", str2));
        return b(str, i2, i3, j2, j3, doubleValue, (i2 != 4 || j5 == 0 || j5 == j4) ? 1 : 2);
    }

    public abstract int a();

    public abstract long c();

    public abstract int e();

    public abstract String f();

    public abstract int g();

    public abstract long h();

    public abstract int i();
}
