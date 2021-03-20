package com.auth0.android.provider;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;

public class WebAuthActivity extends AppCompatActivity {

    /* renamed from: l  reason: collision with root package name */
    public static final String f7186l = WebAuthActivity.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public WebView f7187h;

    /* renamed from: i  reason: collision with root package name */
    public ProgressBar f7188i;

    /* renamed from: j  reason: collision with root package name */
    public View f7189j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f7190k;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            WebAuthActivity.this.f7189j.setVisibility(8);
            String str = WebAuthActivity.f7186l;
            Log.v(WebAuthActivity.f7186l, "Retrying to load failed URL");
            WebAuthActivity.this.a();
        }
    }

    public class b extends WebChromeClient {
        public b() {
        }

        public void onProgressChanged(WebView webView, int i2) {
            super.onProgressChanged(webView, i2);
            if (i2 > 0) {
                WebAuthActivity.this.f7188i.setIndeterminate(false);
                WebAuthActivity.this.f7188i.setProgress(i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            java.lang.String r0 = f7186l
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r2 = 0
            r3 = 1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0030 }
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.isConnectedOrConnecting()     // Catch:{ SecurityException -> 0x0030 }
            if (r1 == 0) goto L_0x001a
            r1 = r3
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0031 }
            r4.<init>()     // Catch:{ SecurityException -> 0x0031 }
            java.lang.String r5 = "Is network available? "
            r4.append(r5)     // Catch:{ SecurityException -> 0x0031 }
            r4.append(r1)     // Catch:{ SecurityException -> 0x0031 }
            java.lang.String r4 = r4.toString()     // Catch:{ SecurityException -> 0x0031 }
            android.util.Log.v(r0, r4)     // Catch:{ SecurityException -> 0x0031 }
            goto L_0x0036
        L_0x0030:
            r1 = r3
        L_0x0031:
            java.lang.String r4 = "Could not check for Network status. Please, be sure to include the android.permission.ACCESS_NETWORK_STATE permission in the manifest"
            android.util.Log.w(r0, r4)
        L_0x0036:
            if (r1 != 0) goto L_0x0050
            r0 = 2131755050(0x7f10002a, float:1.9140968E38)
            java.lang.String r0 = r6.getString(r0)
            android.widget.TextView r1 = r6.f7190k
            r1.setText(r0)
            android.webkit.WebView r0 = r6.f7187h
            r1 = 4
            r0.setVisibility(r1)
            android.view.View r0 = r6.f7189j
            r0.setVisibility(r2)
            return
        L_0x0050:
            android.content.Intent r0 = r6.getIntent()
            android.net.Uri r0 = r0.getData()
            java.lang.String r1 = "redirect_uri"
            java.lang.String r1 = r0.getQueryParameter(r1)
            android.webkit.WebView r2 = r6.f7187h
            com.auth0.android.provider.WebAuthActivity$b r4 = new com.auth0.android.provider.WebAuthActivity$b
            r4.<init>()
            r2.setWebChromeClient(r4)
            android.webkit.WebView r2 = r6.f7187h
            com.auth0.android.provider.WebAuthActivity$c r4 = new com.auth0.android.provider.WebAuthActivity$c
            r4.<init>(r1)
            r2.setWebViewClient(r4)
            android.webkit.WebView r1 = r6.f7187h
            android.webkit.WebSettings r1 = r1.getSettings()
            r1.setJavaScriptEnabled(r3)
            r1.setSupportZoom(r3)
            r1.setBuiltInZoomControls(r3)
            android.webkit.WebView r1 = r6.f7187h
            java.lang.String r0 = r0.toString()
            r1.loadUrl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.auth0.android.provider.WebAuthActivity.a():void");
    }

    public void onCreate(Bundle bundle) {
        String str = f7186l;
        StringBuilder y = b.e.a.a.a.y("Creating a WebAuthActivity for navigating to ");
        y.append(getIntent().getData().toString());
        Log.v(str, y.toString());
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("fullscreen", false)) {
            Log.d(str, "Activity in fullscreen mode");
            getWindow().getDecorView().setSystemUiVisibility(1028);
        }
        setContentView((int) R.layout.com_auth0_activity_web_auth);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            String stringExtra = getIntent().getStringExtra("serviceName");
            supportActionBar.setIcon(17170445);
            supportActionBar.setDisplayShowTitleEnabled(false);
            supportActionBar.setDisplayUseLogoEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowCustomEnabled(true);
            supportActionBar.setTitle((CharSequence) stringExtra);
        }
        WebView webView = (WebView) findViewById(R.id.com_auth0_lock_webview);
        this.f7187h = webView;
        webView.setVisibility(4);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.com_auth0_lock_progressbar);
        this.f7188i = progressBar;
        progressBar.setIndeterminate(true);
        this.f7188i.setMax(100);
        View findViewById = findViewById(R.id.com_auth0_lock_error_view);
        this.f7189j = findViewById;
        findViewById.setVisibility(8);
        this.f7190k = (TextView) findViewById(R.id.com_auth0_lock_text);
        ((Button) findViewById(R.id.com_auth0_lock_retry)).setOnClickListener(new a());
        a();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (getIntent().getBooleanExtra("fullscreen", false)) {
            Log.d(f7186l, "Activity in fullscreen mode");
            getWindow().getDecorView().setSystemUiVisibility(1028);
        }
    }

    public class c extends WebViewClient {
        public final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            int i2 = 0;
            WebAuthActivity.this.f7188i.setProgress(0);
            boolean z = true;
            WebAuthActivity.this.f7188i.setIndeterminate(true);
            WebAuthActivity.this.f7188i.setVisibility(8);
            if (WebAuthActivity.this.f7189j.getVisibility() != 0) {
                z = false;
            }
            WebView webView2 = WebAuthActivity.this.f7187h;
            if (z) {
                i2 = 4;
            }
            webView2.setVisibility(i2);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            WebAuthActivity.this.f7188i.setProgress(0);
            WebAuthActivity.this.f7188i.setVisibility(0);
        }

        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            String str3 = WebAuthActivity.f7186l;
            Log.w(WebAuthActivity.f7186l, String.format("Load error (%d) %s", new Object[]{Integer.valueOf(i2), str}));
            WebAuthActivity webAuthActivity = WebAuthActivity.this;
            webAuthActivity.f7190k.setText(str);
            webAuthActivity.f7187h.setVisibility(4);
            webAuthActivity.f7189j.setVisibility(0);
            super.onReceivedError(webView, i2, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.startsWith(this.a)) {
                return false;
            }
            String str2 = WebAuthActivity.f7186l;
            Log.v(WebAuthActivity.f7186l, "Redirect URL was called");
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            WebAuthActivity.this.setResult(-1, intent);
            WebAuthActivity.this.finish();
            return true;
        }

        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String str = WebAuthActivity.f7186l;
            Log.w(WebAuthActivity.f7186l, String.format("Load error (%d) %s", new Object[]{Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription()}));
            WebAuthActivity webAuthActivity = WebAuthActivity.this;
            webAuthActivity.f7190k.setText(webResourceError.getDescription().toString());
            webAuthActivity.f7187h.setVisibility(4);
            webAuthActivity.f7189j.setVisibility(0);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }
}
