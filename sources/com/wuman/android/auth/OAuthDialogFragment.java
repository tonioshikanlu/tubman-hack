package com.wuman.android.auth;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import b.a.a.k.f;
import b.e.a.a.a;
import com.google.api.client.auth.oauth2.AuthorizationCodeResponseUrl;
import com.wuman.android.auth.oauth.OAuth10aResponseUrl;
import com.wuman.android.auth.oauth2.implicit.ImplicitResponseUrl;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Logger;

public class OAuthDialogFragment extends DialogFragmentCompat {
    public static final Logger LOGGER = Logger.getLogger("OAuthAndroid");
    public static boolean severalScopes;
    public AuthorizationDialogController mController;
    public boolean mFullScreen;
    public boolean mHideFullScreenTitle;
    public boolean mHorizontalProgress;
    public String progressColor;

    public OAuthDialogFragment(DialogFragment dialogFragment, boolean z, boolean z2, boolean z3) {
        super(dialogFragment);
        this.mFullScreen = z;
        this.mHorizontalProgress = z2;
        this.mHideFullScreenTitle = z3;
    }

    public OAuthDialogFragment(androidx.fragment.app.DialogFragment dialogFragment, boolean z, boolean z2, boolean z3, String str) {
        super(dialogFragment);
        this.mFullScreen = z;
        this.mHorizontalProgress = z2;
        this.mHideFullScreenTitle = z3;
        this.progressColor = str;
    }

    public static void access$000(OAuthDialogFragment oAuthDialogFragment, String str, View view, int i2) {
        KeyEvent.Callback callback;
        AuthorizationDialogController authorizationDialogController = oAuthDialogFragment.mController;
        View view2 = null;
        if (view != null) {
            view2 = view.findViewById(16908308);
            callback = view.findViewById(16908301);
            view = view.findViewById(16908312);
        } else {
            callback = null;
        }
        if (view != null) {
            if (view2 != null && (view2 instanceof TextView)) {
                ((TextView) view2).setText(i2 + "%");
            }
            int i3 = 0;
            if (callback != null && (callback instanceof ProgressBar)) {
                if (i2 > 0 && i2 < 100) {
                    ((ProgressBar) callback).setIndeterminate(false);
                }
                ((ProgressBar) callback).setProgress(i2);
            }
            if (i2 == 100) {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
    }

    public static boolean isRedirectUriFound(String str, String str2) {
        boolean isOpaque;
        Set<String> set;
        try {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            if (parse == null || parse2 == null || (isOpaque = parse2.isOpaque()) != parse.isOpaque()) {
                return false;
            }
            if (isOpaque) {
                return TextUtils.equals(str, str2);
            }
            if (!TextUtils.equals(parse2.getScheme(), parse.getScheme()) || !TextUtils.equals(parse2.getAuthority(), parse.getAuthority()) || parse2.getPort() != parse.getPort()) {
                return false;
            }
            if (!TextUtils.isEmpty(parse2.getPath()) && !TextUtils.equals(parse2.getPath(), parse.getPath())) {
                return false;
            }
            if (!parse2.isOpaque()) {
                String encodedQuery = parse2.getEncodedQuery();
                if (encodedQuery == null) {
                    set = Collections.emptySet();
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int i2 = 0;
                    do {
                        int indexOf = encodedQuery.indexOf(38, i2);
                        if (indexOf == -1) {
                            indexOf = encodedQuery.length();
                        }
                        int indexOf2 = encodedQuery.indexOf(61, i2);
                        if (indexOf2 > indexOf || indexOf2 == -1) {
                            indexOf2 = indexOf;
                        }
                        linkedHashSet.add(Uri.decode(encodedQuery.substring(i2, indexOf2)));
                        i2 = indexOf + 1;
                    } while (i2 < encodedQuery.length());
                    set = Collections.unmodifiableSet(linkedHashSet);
                }
                for (String str3 : set) {
                    if (!TextUtils.equals(parse2.getQueryParameter(str3), parse.getQueryParameter(str3))) {
                        return false;
                    }
                }
                String fragment = parse2.getFragment();
                if (TextUtils.isEmpty(fragment) || TextUtils.equals(fragment, parse.getFragment())) {
                    return true;
                }
                return false;
            }
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        View findViewById;
        WebView webView = (WebView) getView().findViewById(16908300);
        if (webView != null) {
            Fragment fragment = this.supportFragment;
            String string = (fragment != null ? fragment.getArguments() : this.nativeFragment.getArguments()).getString("authRequestUrl");
            if (severalScopes) {
                try {
                    String str = ((f) this.mController).a.f328g;
                    string = string.replace(str, URLEncoder.encode(str, "UTF-8"));
                } catch (IOException e2) {
                    Log.e("IOException", e2.getLocalizedMessage());
                }
            }
            webView.loadUrl(string);
        }
        if (this.mFullScreen) {
            getDialog().getWindow().setLayout(-1, -1);
            getDialog().getWindow().setBackgroundDrawable((Drawable) null);
        }
        if (this.mHorizontalProgress && (findViewById = getDialog().findViewById(getDialog().getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null))) != null) {
            findViewById.setBackgroundColor(getDialog().getContext().getResources().getColor(17170446));
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        AuthorizationDialogController authorizationDialogController = this.mController;
        if (authorizationDialogController != null) {
            ((DialogFragmentController) authorizationDialogController).set((String) null, "user_cancelled", (ImplicitResponseUrl) null, true);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Objects.requireNonNull((DialogFragmentController) this.mController);
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Objects.requireNonNull(this.mController);
        Context context = layoutInflater.getContext();
        int min = (int) Math.min(((float) context.getResources().getDisplayMetrics().heightPixels) * 0.8f, 1024.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WebView webView = new WebView(context);
        webView.setId(16908300);
        frameLayout.addView(webView, this.mFullScreen ? new ViewGroup.LayoutParams(-1, -1) : new ViewGroup.LayoutParams(-1, min));
        if (!this.mHorizontalProgress || this.mHideFullScreenTitle) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setId(16908312);
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            linearLayout.setGravity(81);
            ProgressBar progressBar = new ProgressBar(context, (AttributeSet) null, 16842873);
            progressBar.setId(16908301);
            int parseColor = Color.parseColor(this.progressColor);
            progressBar.setIndeterminateTintList(new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}, new int[]{-16842912}, new int[]{16842919}}, new int[]{parseColor, parseColor, parseColor, parseColor}));
            linearLayout.addView(progressBar, new ViewGroup.LayoutParams(-2, -2));
            TextView textView = new TextView(context, (AttributeSet) null, 16842884);
            textView.setId(16908308);
            linearLayout.addView(textView, new ViewGroup.LayoutParams(-2, -2));
            frameLayout.addView(linearLayout, (!this.mFullScreen || !this.mHideFullScreenTitle) ? new ViewGroup.LayoutParams(-1, min) : new ViewGroup.LayoutParams(-1, -1));
        } else {
            RelativeLayout relativeLayout = new RelativeLayout(context);
            relativeLayout.setId(16908312);
            relativeLayout.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(10);
            layoutParams.topMargin = -20;
            ProgressBar progressBar2 = new ProgressBar(context, (AttributeSet) null, 16842872);
            progressBar2.setIndeterminate(true);
            progressBar2.setId(16908301);
            relativeLayout.addView(progressBar2, layoutParams);
            frameLayout.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        return frameLayout;
    }

    public void onDestroy() {
        this.mController = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void onViewCreated(View view, Bundle bundle) {
        View findViewById = view.findViewById(16908300);
        if (findViewById == null) {
            throw new RuntimeException("Your content must have a WebView whose id attribute is 'android.R.id.primary'");
        } else if (findViewById instanceof WebView) {
            WebView webView = (WebView) findViewById;
            WebSettings settings = webView.getSettings();
            settings.setSavePassword(false);
            settings.setSaveFormData(false);
            settings.setUserAgentString("Mozilla/5.0 (iPad; CPU OS 7_0 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) CriOS/30.0.1599.12 Mobile/11A465 Safari/8536.25 (3B92C18B-D9DE-4CB7-A02A-22FD2AF17C8F)");
            webView.setOnKeyListener(new View.OnKeyListener(this) {
                public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                    WebView webView = (WebView) view;
                    if (i2 != 4 || !webView.canGoBack()) {
                        return false;
                    }
                    webView.goBack();
                    return true;
                }
            });
            Objects.requireNonNull(this.mController);
            settings.setJavaScriptEnabled(true);
            Objects.requireNonNull(this.mController);
            Objects.requireNonNull(this.mController);
            webView.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView webView, int i2) {
                    super.onProgressChanged(webView, i2);
                    if (i2 != 0 && i2 != 100) {
                        OAuthDialogFragment.access$000(OAuthDialogFragment.this, webView.getUrl(), OAuthDialogFragment.this.getView(), i2);
                    }
                }
            });
            webView.setWebViewClient(new WebViewClient() {
                public final boolean interceptUrlCompat(WebView webView, String str, boolean z) {
                    OAuthDialogFragment oAuthDialogFragment;
                    AuthorizationDialogController authorizationDialogController;
                    OAuthDialogFragment oAuthDialogFragment2 = OAuthDialogFragment.this;
                    Fragment fragment = oAuthDialogFragment2.supportFragment;
                    if (fragment != null ? fragment.isAdded() : oAuthDialogFragment2.nativeFragment.isAdded()) {
                        OAuthDialogFragment oAuthDialogFragment3 = OAuthDialogFragment.this;
                        Fragment fragment2 = oAuthDialogFragment3.supportFragment;
                        if (!(fragment2 != null ? fragment2.isRemoving() : oAuthDialogFragment3.nativeFragment.isRemoving()) && (authorizationDialogController = oAuthDialogFragment.mController) != null) {
                            try {
                                String str2 = ((f) authorizationDialogController).a.f328g;
                                Fragment fragment3 = (oAuthDialogFragment = OAuthDialogFragment.this).supportFragment;
                                String string = (fragment3 != null ? fragment3.getArguments() : oAuthDialogFragment.nativeFragment.getArguments()).getString("authType");
                                OAuthDialogFragment.LOGGER.info("url: " + str + ", redirect: " + str2 + ", callback: " + OAuthDialogFragment.isRedirectUriFound(str, str2));
                                if (OAuthDialogFragment.isRedirectUriFound(str, str2)) {
                                    if (TextUtils.equals(string, "10a")) {
                                        OAuth10aResponseUrl oAuth10aResponseUrl = new OAuth10aResponseUrl(str);
                                        ((DialogFragmentController) OAuthDialogFragment.this.mController).set(oAuth10aResponseUrl.getVerifier(), oAuth10aResponseUrl.getError(), (ImplicitResponseUrl) null, true);
                                    } else if (TextUtils.equals(string, "explicit")) {
                                        try {
                                            AuthorizationCodeResponseUrl authorizationCodeResponseUrl = new AuthorizationCodeResponseUrl(str);
                                            String error = authorizationCodeResponseUrl.getError();
                                            if (!TextUtils.isEmpty(error) && !TextUtils.isEmpty(authorizationCodeResponseUrl.getErrorDescription())) {
                                                error = error + ": " + authorizationCodeResponseUrl.getErrorDescription();
                                            }
                                            ((DialogFragmentController) OAuthDialogFragment.this.mController).set(authorizationCodeResponseUrl.b(), error, (ImplicitResponseUrl) null, true);
                                        } catch (Exception unused) {
                                            OAuthDialogFragment.LOGGER.info("EXCEPTION CAUGHT: Strava's response is not standard, apparently");
                                            String substring = str.substring(str.indexOf("code=") + 5);
                                            int indexOf = substring.indexOf("&");
                                            if (indexOf != -1) {
                                                substring = substring.substring(0, indexOf);
                                            }
                                            str.substring(str.indexOf("code=") + 5, str.indexOf("&scope"));
                                            ((DialogFragmentController) OAuthDialogFragment.this.mController).set(substring, (String) null, (ImplicitResponseUrl) null, true);
                                        }
                                    } else {
                                        ImplicitResponseUrl implicitResponseUrl = new ImplicitResponseUrl(str);
                                        String error2 = implicitResponseUrl.getError();
                                        if (!TextUtils.isEmpty(error2) && !TextUtils.isEmpty(implicitResponseUrl.getErrorDescription())) {
                                            StringBuilder B = a.B(error2, ": ");
                                            B.append(implicitResponseUrl.getErrorDescription());
                                            error2 = B.toString();
                                        }
                                        ((DialogFragmentController) OAuthDialogFragment.this.mController).set(implicitResponseUrl.getAccessToken(), error2, implicitResponseUrl, true);
                                    }
                                    return true;
                                }
                                if (z) {
                                    webView.loadUrl(str);
                                }
                                return false;
                            } catch (IOException e2) {
                                OAuthDialogFragment oAuthDialogFragment4 = OAuthDialogFragment.this;
                                String message = e2.getMessage();
                                AuthorizationDialogController authorizationDialogController2 = oAuthDialogFragment4.mController;
                                if (authorizationDialogController2 != null) {
                                    ((DialogFragmentController) authorizationDialogController2).set((String) null, message, (ImplicitResponseUrl) null, true);
                                }
                            }
                        }
                    }
                    return false;
                }

                public void onPageFinished(WebView webView, String str) {
                    OAuthDialogFragment oAuthDialogFragment = OAuthDialogFragment.this;
                    OAuthDialogFragment.access$000(oAuthDialogFragment, str, oAuthDialogFragment.getView(), 100);
                }

                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    Logger logger = OAuthDialogFragment.LOGGER;
                    logger.info("onPageStarted: " + str);
                    if (!interceptUrlCompat(webView, str, false)) {
                        OAuthDialogFragment oAuthDialogFragment = OAuthDialogFragment.this;
                        OAuthDialogFragment.access$000(oAuthDialogFragment, str, oAuthDialogFragment.getView(), 0);
                    }
                }

                public void onReceivedError(WebView webView, int i2, String str, String str2) {
                    super.onReceivedError(webView, i2, str, str2);
                    AuthorizationDialogController authorizationDialogController = OAuthDialogFragment.this.mController;
                    if (authorizationDialogController != null) {
                        ((DialogFragmentController) authorizationDialogController).set((String) null, str, (ImplicitResponseUrl) null, true);
                    }
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    Logger logger = OAuthDialogFragment.LOGGER;
                    logger.info("shouldOverrideUrlLoading: " + str);
                    interceptUrlCompat(webView, str, true);
                    return true;
                }
            });
        } else {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.primary' that is not a WebView class");
        }
    }
}
