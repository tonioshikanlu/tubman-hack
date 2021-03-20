package b.l.d.q.f.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import b.l.a.c.k.h;
import b.l.d.q.f.b;
import b.l.d.x.e;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

public class f0 implements g0 {
    public static final Pattern f = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: g  reason: collision with root package name */
    public static final String f5090g = Pattern.quote("/");
    public final h0 a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f5091b;
    public final String c;
    public final e d;

    /* renamed from: e  reason: collision with root package name */
    public String f5092e;

    public f0(Context context, String str, e eVar) {
        if (str != null) {
            this.f5091b = context;
            this.c = str;
            this.d = eVar;
            this.a = new h0();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        lowerCase = uuid == null ? null : f.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        b bVar = b.a;
        bVar.b("Created new Crashlytics IID: " + lowerCase);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    @NonNull
    public synchronized String b() {
        String str;
        String a2;
        b bVar = b.a;
        synchronized (this) {
            String str2 = this.f5092e;
            if (str2 != null) {
                return str2;
            }
            SharedPreferences h2 = e.h(this.f5091b);
            h<String> id = this.d.getId();
            String string = h2.getString("firebase.installation.id", (String) null);
            try {
                str = (String) q0.a(id);
            } catch (Exception e2) {
                if (bVar.a(3)) {
                    Log.d("FirebaseCrashlytics", "Failed to retrieve installation id", e2);
                }
                str = string != null ? string : null;
            }
            if (string == null) {
                SharedPreferences sharedPreferences = this.f5091b.getSharedPreferences("com.crashlytics.prefs", 0);
                String string2 = sharedPreferences.getString("crashlytics.installation.id", (String) null);
                bVar.b("No cached FID; legacy id is " + string2);
                if (string2 == null) {
                    this.f5092e = a(str, h2);
                } else {
                    this.f5092e = string2;
                    d(string2, str, h2, sharedPreferences);
                }
                String str3 = this.f5092e;
                return str3;
            }
            if (string.equals(str)) {
                this.f5092e = h2.getString("crashlytics.installation.id", (String) null);
                bVar.b("Found matching FID, using Crashlytics IID: " + this.f5092e);
                if (this.f5092e == null) {
                    a2 = a(str, h2);
                }
                String str4 = this.f5092e;
                return str4;
            }
            a2 = a(str, h2);
            this.f5092e = a2;
            String str42 = this.f5092e;
            return str42;
        }
    }

    public String c() {
        String str;
        h0 h0Var = this.a;
        Context context = this.f5091b;
        synchronized (h0Var) {
            if (h0Var.a == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                h0Var.a = installerPackageName;
            }
            str = "".equals(h0Var.a) ? null : h0Var.a;
        }
        return str;
    }

    public final synchronized void d(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        b bVar = b.a;
        bVar.b("Migrating legacy Crashlytics IID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", str2).apply();
        sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
    }

    public final String e(String str) {
        return str.replaceAll(f5090g, "");
    }
}
