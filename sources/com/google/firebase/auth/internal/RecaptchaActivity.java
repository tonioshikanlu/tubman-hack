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
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import b.l.a.c.b.a;
import b.l.a.c.f.e.hl;
import b.l.a.c.f.e.ki;
import b.l.a.c.f.e.li;
import b.l.a.c.f.e.uj;
import b.l.d.d;
import b.l.d.o.e0.a0;
import b.l.d.o.e0.b0;
import b.l.d.o.e0.w;
import b.l.d.o.e0.x;
import com.amplitude.api.Constants;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.segment.analytics.integrations.BasePayload;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RecaptchaActivity extends FragmentActivity implements li {

    /* renamed from: i  reason: collision with root package name */
    public static final String f7345i = RecaptchaActivity.class.getSimpleName();

    /* renamed from: j  reason: collision with root package name */
    public static final ExecutorService f7346j;

    /* renamed from: k  reason: collision with root package name */
    public static long f7347k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final x f7348l = x.f5000b;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7349h = false;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f7346j = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a() {
        f7347k = 0;
        this.f7349h = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        f7348l.b(this);
        finish();
    }

    public final void b(Status status) {
        f7347k = 0;
        this.f7349h = false;
        Intent intent = new Intent();
        Map<String, String> map = w.a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        f7348l.b(this);
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
        Log.e(f7345i, "Device cannot resolve intent for: android.intent.action.VIEW");
        a();
    }

    @Nullable
    public final Uri.Builder l(Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        d d = d.d(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(d);
        a0 a0Var = a0.a;
        Context applicationContext = getApplicationContext();
        synchronized (a0Var) {
            a.x(str);
            a.x(uuid);
            SharedPreferences b2 = a0.b(applicationContext, str);
            a0.a(b2);
            SharedPreferences.Editor edit = b2.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra3);
            edit.apply();
        }
        String b3 = b0.a(getApplicationContext(), d.e()).b();
        String str3 = null;
        if (TextUtils.isEmpty(b3)) {
            Log.e(f7345i, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            b(a.T0("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (instance.f7334g) {
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            synchronized (instance.f7334g) {
            }
        } else {
            str3 = a.Z0();
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter(hl.f3048i, str3).appendQueryParameter("eventId", uuid);
        String valueOf = String.valueOf(stringExtra2);
        return appendQueryParameter.appendQueryParameter("v", valueOf.length() != 0 ? "X".concat(valueOf) : new String("X")).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b3);
    }

    @Nullable
    public final HttpURLConnection m(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            b.l.a.c.c.n.a aVar = li.c;
            Log.e(aVar.a, aVar.c("Error generating connection", new Object[0]));
            return null;
        }
    }

    public final void n(String str, @Nullable Status status) {
        if (status == null) {
            a();
        } else {
            b(status);
        }
    }

    public final void onCreate(Bundle bundle) {
        String str = f7345i;
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f7347k < Constants.EVENT_UPLOAD_PERIOD_MILLIS) {
                Log.e(str, "Could not start operation - already in progress");
                return;
            }
            f7347k = currentTimeMillis;
            if (bundle != null) {
                this.f7349h = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                return;
            }
            return;
        }
        String valueOf = String.valueOf(action);
        Log.e(str, valueOf.length() != 0 ? "Could not do operation - unknown action: ".concat(valueOf) : new String("Could not do operation - unknown action: "));
        a();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        String string;
        boolean isEmpty;
        String str = f7345i;
        super.onResume();
        String str2 = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                b(w.a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                a();
            } else {
                String stringExtra = intent.getStringExtra("link");
                a0 a0Var = a0.a;
                Context applicationContext = getApplicationContext();
                String packageName = getPackageName();
                String stringExtra2 = intent.getStringExtra("eventId");
                synchronized (a0Var) {
                    a.x(packageName);
                    a.x(stringExtra2);
                    SharedPreferences b2 = a0.b(applicationContext, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String string2 = b2.getString(format, (String) null);
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    string = b2.getString(format2, (String) null);
                    SharedPreferences.Editor edit = b2.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.apply();
                    isEmpty = TextUtils.isEmpty(string2);
                }
                if (!isEmpty) {
                    str2 = string;
                }
                if (TextUtils.isEmpty(str2)) {
                    Log.e(str, "Failed to find registration for this event - failing to prevent session injection.");
                    b(a.T0("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = b0.a(getApplicationContext(), d.d(str2).e()).c(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f7347k = 0;
                this.f7349h = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent2)) {
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit2.putString("recaptchaToken", queryParameter);
                    edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit2.putLong(BasePayload.TIMESTAMP_KEY, System.currentTimeMillis());
                    edit2.commit();
                } else {
                    f7348l.b(this);
                }
                finish();
            }
        } else if (!this.f7349h) {
            String packageName2 = getPackageName();
            try {
                new ki(packageName2, b.l.a.c.c.p.d.a(b.l.a.c.c.p.a.a(this, packageName2), false).toLowerCase(Locale.US), getIntent(), this).executeOnExecutor(f7346j, new Void[0]);
            } catch (PackageManager.NameNotFoundException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(packageName2).length() + 34 + valueOf.length());
                sb.append("Could not get package signature: ");
                sb.append(packageName2);
                sb.append(" ");
                sb.append(valueOf);
                Log.e(str, sb.toString());
                n(packageName2, (Status) null);
            }
            this.f7349h = true;
        } else {
            a();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f7349h);
    }
}
