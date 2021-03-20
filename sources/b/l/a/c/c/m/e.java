package b.l.a.c.c.m;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.a.c.c.h;
import b.l.a.c.c.q.a;
import b.l.a.c.c.q.b;

public final class e {
    public static final SimpleArrayMap<String, String> a = new SimpleArrayMap<>();

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            a a2 = b.a(context);
            return a2.a.getPackageManager().getApplicationLabel(a2.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    @NonNull
    public static String b(Context context, int i2) {
        return context.getResources().getString(i2 != 1 ? i2 != 2 ? i2 != 3 ? 17039370 : R.string.common_google_play_services_enable_button : R.string.common_google_play_services_update_button : R.string.common_google_play_services_install_button);
    }

    @NonNull
    public static String c(Context context, int i2) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i2 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{a2});
        } else if (i2 != 2) {
            if (i2 == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{a2});
            } else if (i2 == 5) {
                return f(context, "common_google_play_services_invalid_account_text", a2);
            } else {
                if (i2 == 7) {
                    return f(context, "common_google_play_services_network_error_text", a2);
                }
                if (i2 == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{a2});
                } else if (i2 == 20) {
                    return f(context, "common_google_play_services_restricted_profile_text", a2);
                } else {
                    switch (i2) {
                        case 16:
                            return f(context, "common_google_play_services_api_unavailable_text", a2);
                        case 17:
                            return f(context, "common_google_play_services_sign_in_failed_text", a2);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{a2});
                        default:
                            return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{a2});
                    }
                }
            }
        } else if (b.l.a.c.b.a.i0(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{a2});
        }
    }

    @Nullable
    public static String d(Context context, int i2) {
        String str;
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i2);
                str = sb.toString();
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    @Nullable
    public static String e(Context context, String str) {
        Resources resources;
        SimpleArrayMap<String, String> simpleArrayMap = a;
        synchronized (simpleArrayMap) {
            String str2 = simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            int i2 = h.f2601e;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            a.put(str, string);
            return string;
        }
    }

    public static String f(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e2 = e(context, str);
        if (e2 == null) {
            e2 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e2, new Object[]{str2});
    }
}
