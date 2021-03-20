package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import b.l.a.c.c.n.a;
import b.l.a.c.f.e.ki;
import b.l.a.c.f.e.li;
import b.l.a.c.f.e.sl;
import b.l.a.c.f.e.tj;
import b.l.a.c.f.e.uj;
import b.l.d.d;
import b.l.d.o.e0.a0;
import b.l.d.o.e0.b0;
import b.l.d.o.e0.w;
import b.l.d.o.e0.x;
import b.l.d.o.e0.z;
import com.amplitude.api.Constants;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.segment.analytics.integrations.BasePayload;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@KeepName
public class GenericIdpActivity extends FragmentActivity implements li {

    /* renamed from: j  reason: collision with root package name */
    public static long f7341j;

    /* renamed from: k  reason: collision with root package name */
    public static final x f7342k = x.f5000b;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f7343h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7344i = false;

    public GenericIdpActivity() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7343h = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* JADX INFO: finally extract failed */
    @Nullable
    public final Uri.Builder a(Uri.Builder builder, Intent intent, String str, String str2) {
        String str3;
        String str4;
        Uri.Builder builder2 = builder;
        Intent intent2 = intent;
        String str5 = str;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            str3 = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str6 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str6);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(str6, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            str3 = jSONObject.toString();
        }
        String uuid = UUID.randomUUID().toString();
        try {
            str4 = new String(MessageDigest.getInstance("SHA-256").digest(UUID.randomUUID().toString().getBytes()));
            int length = str4.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                char charAt = str4.charAt(i2);
                if (charAt >= 'A' && charAt <= 'Z') {
                    char[] charArray = str4.toCharArray();
                    while (i2 < length) {
                        char c = charArray[i2];
                        if (c >= 'A' && c <= 'Z') {
                            charArray[i2] = (char) (c ^ ' ');
                        }
                        i2++;
                    }
                    str4 = String.valueOf(charArray);
                } else {
                    i2++;
                }
            }
        } catch (NoSuchAlgorithmException unused2) {
            a aVar = li.c;
            Log.e(aVar.a, aVar.c("Failed to get SHA-256 MessageDigest", new Object[0]));
            str4 = null;
        }
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        a0 a0Var = a0.a;
        Context applicationContext = getApplicationContext();
        synchronized (a0Var) {
            try {
                b.l.a.c.b.a.x(str);
                b.l.a.c.b.a.x(uuid);
                b.l.a.c.b.a.x(str4);
                b.l.a.c.b.a.x(stringExtra4);
                SharedPreferences b2 = a0.b(applicationContext, str5);
                a0.a(b2);
                SharedPreferences.Editor edit = b2.edit();
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{uuid}), str4);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), action);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{uuid}), stringExtra2);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra4);
                edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        String b3 = b0.a(getApplicationContext(), d.d(stringExtra4).e()).b();
        if (TextUtils.isEmpty(b3)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            c(b.l.a.c.b.a.T0("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (str4 == null) {
            return null;
        }
        Uri.Builder appendQueryParameter = builder2.appendQueryParameter("eid", "p");
        String valueOf = String.valueOf(stringExtra5);
        appendQueryParameter.appendQueryParameter("v", valueOf.length() != 0 ? "X".concat(valueOf) : new String("X")).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", str4).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str5).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b3);
        if (!TextUtils.isEmpty(join)) {
            builder2.appendQueryParameter("scopes", join);
        }
        if (!TextUtils.isEmpty(str3)) {
            builder2.appendQueryParameter("customParameters", str3);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder2.appendQueryParameter("tid", stringExtra3);
        }
        return builder2;
    }

    public final void b() {
        f7341j = 0;
        this.f7344i = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent)) {
            f7342k.a(this, b.l.a.c.b.a.T0("WEB_CONTEXT_CANCELED"));
        } else {
            f7342k.b(this);
        }
        finish();
    }

    public final void c(Status status) {
        f7341j = 0;
        this.f7344i = false;
        Intent intent = new Intent();
        Map<String, String> map = w.a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent)) {
            f7342k.a(getApplicationContext(), status);
        } else {
            f7342k.b(this);
        }
        finish();
    }

    public final Context i() {
        return getApplicationContext();
    }

    public final String j(String str) {
        return uj.a(str);
    }

    public final void k(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("com.android.browser.application_id", str);
                intent.addFlags(BasicMeasure.EXACTLY);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.addFlags(BasicMeasure.EXACTLY);
            build.intent.addFlags(268435456);
            build.launchUrl(this, uri);
            return;
        }
        Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        b();
    }

    @Nullable
    public final Uri.Builder l(Intent intent, String str, String str2) {
        return a(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Nullable
    public final HttpURLConnection m(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    public final void n(String str, @Nullable Status status) {
        if (status == null) {
            b();
        } else {
            c(status);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f7341j < Constants.EVENT_UPLOAD_PERIOD_MILLIS) {
                Log.e("GenericIdpActivity", "Could not start operation - already in progress");
                return;
            }
            f7341j = currentTimeMillis;
            if (bundle != null) {
                this.f7344i = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        String valueOf = String.valueOf(action);
        Log.e("GenericIdpActivity", valueOf.length() != 0 ? "Could not do operation - unknown action: ".concat(valueOf) : new String("Could not do operation - unknown action: "));
        b();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        tj tjVar;
        z zVar;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                c(w.a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                b();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                synchronized (a0.a) {
                    b.l.a.c.b.a.x(packageName);
                    b.l.a.c.b.a.x(stringExtra2);
                    SharedPreferences b2 = a0.b(this, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{stringExtra2});
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{stringExtra2});
                    String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    String string = b2.getString(format, (String) null);
                    String string2 = b2.getString(format2, (String) null);
                    String string3 = b2.getString(format3, (String) null);
                    String string4 = b2.getString("com.google.firebase.auth.api.gms.config.tenant.id", (String) null);
                    String string5 = b2.getString(format4, (String) null);
                    SharedPreferences.Editor edit = b2.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.remove(format3);
                    edit.remove(format4);
                    edit.apply();
                    zVar = (string == null || string2 == null || string3 == null) ? null : new z(string, string2, string3, string4, string5);
                }
                if (zVar == null) {
                    b();
                }
                if (booleanExtra) {
                    stringExtra = b0.a(getApplicationContext(), d.d(zVar.f5002e).e()).c(stringExtra);
                }
                sl slVar = new sl(zVar, stringExtra);
                String str2 = zVar.d;
                String str3 = zVar.f5001b;
                slVar.u = str2;
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str3) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str3) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str3)) {
                    f7341j = 0;
                    this.f7344i = false;
                    Intent intent2 = new Intent();
                    Parcel obtain = Parcel.obtain();
                    slVar.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str3);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent2)) {
                        SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                        Parcel obtain2 = Parcel.obtain();
                        slVar.writeToParcel(obtain2, 0);
                        byte[] marshall2 = obtain2.marshall();
                        obtain2.recycle();
                        if (marshall2 != null) {
                            str = Base64.encodeToString(marshall2, 10);
                        }
                        edit2.putString("verifyAssertionRequest", str);
                        edit2.putString("operation", str3);
                        edit2.putString("tenantId", str2);
                        edit2.putLong(BasePayload.TIMESTAMP_KEY, System.currentTimeMillis());
                        edit2.commit();
                    } else {
                        f7342k.b(this);
                    }
                    finish();
                    return;
                }
                Log.e("GenericIdpActivity", str3.length() != 0 ? "unsupported operation: ".concat(str3) : new String("unsupported operation: "));
                b();
            }
        } else if (!this.f7344i) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = b.l.a.c.c.p.d.a(b.l.a.c.c.p.a.a(this, packageName2), false).toLowerCase(Locale.US);
                d d = d.d(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                Map<String, tj> map = uj.a;
                d.a();
                if (!map.containsKey(d.c.a)) {
                    new ki(packageName2, lowerCase, getIntent(), this).executeOnExecutor(this.f7343h, new Void[0]);
                    this.f7344i = true;
                    return;
                }
                d.a();
                String str4 = d.c.a;
                synchronized (map) {
                    tjVar = map.get(str4);
                }
                if (tjVar == null) {
                    throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
                }
                throw null;
            } catch (PackageManager.NameNotFoundException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(packageName2).length() + 34 + valueOf.length());
                sb.append("Could not get package signature: ");
                sb.append(packageName2);
                sb.append(" ");
                sb.append(valueOf);
                Log.e("GenericIdpActivity", sb.toString());
                n(packageName2, (Status) null);
            }
        } else {
            b();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f7344i);
    }
}
