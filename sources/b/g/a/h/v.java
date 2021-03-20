package b.g.a.h;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

public class v {
    public static final String a = "b.g.a.h.v";

    /* renamed from: b  reason: collision with root package name */
    public static p f452b;

    @VisibleForTesting
    public static boolean a(@NonNull PackageManager packageManager) {
        return new Intent("android.intent.action.VIEW", Uri.parse("https://auth0.com")).resolveActivity(packageManager) != null;
    }
}
