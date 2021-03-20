package com.auth0.android.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import b.e.a.a.a;
import b.g.a.h.e;
import b.g.a.h.g;
import b.g.a.h.h;
import b.g.a.h.i;
import b.g.a.h.v;
import java.util.Objects;

public class AuthenticationActivity extends Activity {

    /* renamed from: h  reason: collision with root package name */
    public boolean f7184h;

    /* renamed from: i  reason: collision with root package name */
    public h f7185i;

    public static void a(@NonNull Context context, @NonNull Uri uri, @Nullable i iVar) {
        Intent intent = new Intent(context, AuthenticationActivity.class);
        intent.putExtra("com.auth0.android.EXTRA_AUTHORIZE_URI", uri);
        intent.putExtra("com.auth0.android.EXTRA_USE_BROWSER", true);
        intent.putExtra("com.auth0.android.EXTRA_CT_OPTIONS", iVar);
        intent.addFlags(67108864);
        context.startActivity(intent);
    }

    @VisibleForTesting
    public void b(Intent intent) {
        if (v.f452b == null) {
            Log.w(v.a, "There is no previous instance of this provider.");
            return;
        }
        if (v.f452b.a(new e(intent))) {
            v.f452b = null;
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == 0) {
            intent = new Intent();
        }
        b(intent);
        finish();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f7184h = bundle.getBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", false);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        h hVar = this.f7185i;
        if (hVar != null) {
            Objects.requireNonNull(hVar);
            Log.v(h.f427g, "Trying to unbind the service");
            Context context = (Context) hVar.a.get();
            if (hVar.f && context != null) {
                context.unbindService(hVar);
                hVar.f = false;
            }
            this.f7185i = null;
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume() {
        String str;
        super.onResume();
        Intent intent = getIntent();
        if (this.f7184h || intent.getExtras() != null) {
            boolean z = true;
            if (!this.f7184h) {
                this.f7184h = true;
                Bundle extras = getIntent().getExtras();
                Uri uri = (Uri) extras.getParcelable("com.auth0.android.EXTRA_AUTHORIZE_URI");
                if (!extras.getBoolean("com.auth0.android.EXTRA_USE_BROWSER", true)) {
                    Intent intent2 = new Intent(this, WebAuthActivity.class);
                    intent2.setData(uri);
                    intent2.putExtra("serviceName", extras.getString("com.auth0.android.EXTRA_CONNECTION_NAME"));
                    intent2.putExtra("fullscreen", extras.getBoolean("com.auth0.android.EXTRA_USE_FULL_SCREEN"));
                    startActivityForResult(intent2, 33);
                    return;
                }
                h hVar = new h(this);
                this.f7185i = hVar;
                hVar.f429e = (i) extras.getParcelable("com.auth0.android.EXTRA_CT_OPTIONS");
                h hVar2 = this.f7185i;
                Objects.requireNonNull(hVar2);
                String str2 = h.f427g;
                Log.v(str2, "Trying to bind the service");
                Context context = (Context) hVar2.a.get();
                hVar2.f = false;
                if (!(context == null || (str = hVar2.d) == null)) {
                    hVar2.f = CustomTabsClient.bindCustomTabsService(context, str, hVar2);
                }
                StringBuilder y = a.y("Bind request result: ");
                y.append(hVar2.f);
                Log.v(str2, y.toString());
                h hVar3 = this.f7185i;
                Context context2 = (Context) hVar3.a.get();
                if (context2 == null) {
                    Log.v(str2, "Custom Tab Context was no longer valid.");
                    return;
                }
                if (hVar3.f429e == null) {
                    hVar3.f429e = new i(false, 0, (i.a) null);
                }
                new Thread(new g(hVar3, context2, uri)).start();
                return;
            }
            if (intent.getData() != null) {
                z = false;
            }
            if (z) {
                setResult(0);
            }
            b(intent);
            finish();
            return;
        }
        finish();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", this.f7184h);
    }
}
