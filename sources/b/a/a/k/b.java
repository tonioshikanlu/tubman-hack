package b.a.a.k;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import b.a.a.k.a;
import b.l.b.a.a.b.b;
import b.l.b.a.a.b.c;
import b.l.b.a.a.b.d;
import b.l.b.a.a.b.f;
import b.l.b.a.a.b.h;
import b.l.b.a.b.p.e;
import b.l.b.a.d.m;
import com.appfoundry.previewer.model.AuthSettings;
import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.segment.analytics.integrations.BasePayload;
import com.wuman.android.auth.AuthorizationFlow;
import com.wuman.android.auth.OAuthManager;
import com.wuman.android.auth.oauth2.store.SharedPreferencesCredentialStore;
import e.t.g;
import e.x.c.i;
import java.io.IOException;
import java.util.Objects;
import java.util.regex.Pattern;

public final class b implements LoaderManager.LoaderCallbacks<a.C0014a<f>> {
    public final AuthSettings a;

    /* renamed from: b  reason: collision with root package name */
    public OAuthManager f326b;
    public h c;
    public i d;

    /* renamed from: e  reason: collision with root package name */
    public String f327e;
    public AuthorizationFlow f;

    /* renamed from: g  reason: collision with root package name */
    public String f328g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f329h;

    /* renamed from: i  reason: collision with root package name */
    public final FragmentManager f330i;

    public static final class a extends a<f> {

        /* renamed from: b  reason: collision with root package name */
        public boolean f331b;
        public final OAuthManager c;
        public final String d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, OAuthManager oAuthManager, String str) {
            super(context);
            i.e(context, BasePayload.CONTEXT_KEY);
            this.c = oAuthManager;
            this.d = str;
        }

        public Object b() {
            boolean z;
            OAuthManager oAuthManager = this.c;
            if (oAuthManager != null) {
                String str = this.d;
                Objects.requireNonNull(str);
                OAuthManager.AnonymousClass1 r4 = new OAuthManager.Future2Task<Boolean>((Handler) null, (OAuthManager.OAuthCallback) null, str) {
                    public final /* synthetic */ String val$userId;

                    {
                        this.val$userId = r4;
                    }

                    public void doWork() {
                        Boolean bool;
                        OAuthManager.LOGGER.info("deleteCredential");
                        h hVar = OAuthManager.this.mFlow.credentialStore;
                        if (hVar == null) {
                            bool = Boolean.FALSE;
                        } else {
                            hVar.delete(this.val$userId, (f) null);
                            bool = Boolean.TRUE;
                        }
                        set(bool);
                    }
                };
                oAuthManager.mExecutor.submit(new Runnable(oAuthManager, r4) {
                    public final /* synthetic */ Future2Task val$task;

                    {
                        this.val$task = r2;
                    }

                    public void run() {
                        this.val$task.start();
                    }
                });
                Boolean bool = (Boolean) r4.getResult();
                if (bool != null) {
                    z = bool.booleanValue();
                    this.f331b = z;
                    StringBuilder y = b.e.a.a.a.y("AuthManager: DeleteTokenLoader - token deleted: ");
                    y.append(this.f331b);
                    q.a.a.d.a(y.toString(), new Object[0]);
                    return null;
                }
            }
            z = false;
            this.f331b = z;
            StringBuilder y2 = b.e.a.a.a.y("AuthManager: DeleteTokenLoader - token deleted: ");
            y2.append(this.f331b);
            q.a.a.d.a(y2.toString(), new Object[0]);
            return null;
        }

        public void d(a.C0014a<f> aVar) {
            i.c(aVar);
            boolean z = this.f331b;
            aVar.c = z;
            aVar.d = z ? null : "error";
        }
    }

    /* renamed from: b.a.a.k.b$b  reason: collision with other inner class name */
    public static final class C0015b extends a<f> {

        /* renamed from: b  reason: collision with root package name */
        public final OAuthManager f332b;
        public final boolean c;
        public final String d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0015b(Context context, OAuthManager oAuthManager, boolean z, String str) {
            super(context);
            i.c(context);
            this.f332b = oAuthManager;
            this.c = z;
            this.d = str;
        }

        public Object b() {
            f fVar;
            f fVar2;
            String str = null;
            if (this.c) {
                OAuthManager oAuthManager = this.f332b;
                if (oAuthManager != null) {
                    String str2 = this.d;
                    Objects.requireNonNull(str2);
                    OAuthManager.AnonymousClass4 r5 = new OAuthManager.Future2Task<f>((Handler) null, (OAuthManager.OAuthCallback) null, str2) {
                        public final /* synthetic */ String val$userId;

                        {
                            this.val$userId = r4;
                        }

                        public void doWork() {
                            try {
                                OAuthManager.LOGGER.info("authorizeImplicitly");
                                f loadCredential = OAuthManager.this.mFlow.loadCredential(this.val$userId);
                                if (loadCredential == null || loadCredential.getAccessToken() == null || (loadCredential.getRefreshToken() == null && loadCredential.getExpiresInSeconds() != null && loadCredential.getExpiresInSeconds().longValue() <= 60)) {
                                    String redirectUri = OAuthManager.this.mUIController.getRedirectUri();
                                    AuthorizationFlow authorizationFlow = OAuthManager.this.mFlow;
                                    Objects.requireNonNull(authorizationFlow);
                                    d dVar = new d(authorizationFlow.authorizationServerEncodedUrl, authorizationFlow.clientId);
                                    dVar.g(authorizationFlow.scopes);
                                    dVar.d(redirectUri);
                                    OAuthManager.this.mUIController.requestAuthorization(dVar);
                                    loadCredential = OAuthManager.this.mFlow.createAndStoreCredential(OAuthManager.this.mUIController.waitForImplicitResponseUrl(), this.val$userId);
                                }
                                set(loadCredential);
                            } finally {
                                OAuthManager.this.mUIController.stop();
                            }
                        }
                    };
                    oAuthManager.mExecutor.submit(new Runnable(oAuthManager, r5) {
                        public final /* synthetic */ Future2Task val$task;

                        {
                            this.val$task = r2;
                        }

                        public void run() {
                            this.val$task.start();
                        }
                    });
                    fVar = (f) r5.getResult();
                } else {
                    fVar = null;
                }
                Object[] objArr = new Object[1];
                if (fVar != null) {
                    str = fVar.getAccessToken();
                }
                objArr[0] = str;
                q.a.a.d.a("AuthManager: GetTokenLoader: implicit -> token: %s", objArr);
            } else {
                OAuthManager oAuthManager2 = this.f332b;
                if (oAuthManager2 != null) {
                    String str3 = this.d;
                    Objects.requireNonNull(str3);
                    OAuthManager.AnonymousClass3 r52 = new OAuthManager.Future2Task<f>((Handler) null, (OAuthManager.OAuthCallback) null, str3) {
                        public final /* synthetic */ String val$userId;

                        {
                            this.val$userId = r4;
                        }

                        public void doWork() {
                            try {
                                f loadCredential = OAuthManager.this.mFlow.loadCredential(this.val$userId);
                                OAuthManager.LOGGER.info("authorizeExplicitly");
                                if (loadCredential == null || loadCredential.getAccessToken() == null || (loadCredential.getRefreshToken() == null && loadCredential.getExpiresInSeconds() != null && loadCredential.getExpiresInSeconds().longValue() <= 60)) {
                                    String redirectUri = OAuthManager.this.mUIController.getRedirectUri();
                                    AuthorizationFlow authorizationFlow = OAuthManager.this.mFlow;
                                    Objects.requireNonNull(authorizationFlow);
                                    b bVar = new b(authorizationFlow.authorizationServerEncodedUrl, authorizationFlow.clientId);
                                    bVar.g(authorizationFlow.scopes);
                                    bVar.d(redirectUri);
                                    OAuthManager.this.mUIController.requestAuthorization(bVar);
                                    AuthorizationCodeTokenRequest newTokenRequest = OAuthManager.this.mFlow.newTokenRequest(OAuthManager.this.mUIController.waitForExplicitCode());
                                    newTokenRequest.setRedirectUri(redirectUri);
                                    TokenResponse execute = newTokenRequest.execute();
                                    Objects.requireNonNull(OAuthManager.this);
                                    AuthorizationFlow authorizationFlow2 = OAuthManager.this.mFlow;
                                    String str = this.val$userId;
                                    f newCredential = authorizationFlow2.newCredential(str);
                                    newCredential.setFromTokenResponse(execute);
                                    h hVar = authorizationFlow2.credentialStore;
                                    if (hVar != null) {
                                        hVar.store(str, newCredential);
                                    }
                                    set(newCredential);
                                } else {
                                    set(loadCredential);
                                }
                            } finally {
                                OAuthManager.this.mUIController.stop();
                            }
                        }
                    };
                    oAuthManager2.mExecutor.submit(new Runnable(oAuthManager2, r52) {
                        public final /* synthetic */ Future2Task val$task;

                        {
                            this.val$task = r2;
                        }

                        public void run() {
                            this.val$task.start();
                        }
                    });
                    fVar2 = (f) r52.getResult();
                } else {
                    fVar2 = null;
                }
                Object[] objArr2 = new Object[1];
                if (fVar != null) {
                    str = fVar.getAccessToken();
                }
                objArr2[0] = str;
                q.a.a.d.a("AuthManager: GetTokenLoader: explicit -> token: %s", objArr2);
            }
            return fVar;
        }

        public void d(a.C0014a<f> aVar) {
            i.c(aVar);
            f fVar = (f) aVar.a;
            i.c(fVar);
            String accessToken = fVar.getAccessToken();
            i.d(accessToken, "data!!.accessToken");
            boolean z = !(accessToken.length() == 0);
            aVar.c = z;
            aVar.d = z ? null : "error";
        }
    }

    public b(Context context, FragmentManager fragmentManager, AuthSettings authSettings, Boolean bool, int i2) {
        String str;
        i.e(context, BasePayload.CONTEXT_KEY);
        i.e(fragmentManager, "fragmentManager");
        this.f329h = context;
        this.f330i = fragmentManager;
        this.a = authSettings;
        String str2 = "";
        this.f328g = str2;
        if (!(authSettings == null || (str = authSettings.f) == null)) {
            str2 = str;
        }
        this.f328g = str2;
        f fVar = new f(this, fragmentManager);
        SharedPreferencesCredentialStore sharedPreferencesCredentialStore = new SharedPreferencesCredentialStore(context, "authManager", new b.l.b.a.c.j.a());
        if (authSettings != null) {
            this.f327e = authSettings.d;
            String str3 = authSettings.c;
            Pattern pattern = c.a;
            AuthorizationFlow.Builder builder = new AuthorizationFlow.Builder(new c.a(), new e(), new b.l.b.a.c.j.a(), new b.l.b.a.b.c(authSettings.f7069e), new b.l.b.a.a.b.e(this.f327e, authSettings.f7070g), this.f327e, str3);
            builder.requestInitializer = d.a;
            i.d(builder, "builder");
            builder.scopes = g.F(authSettings.f7068b);
            builder.refreshListeners.add(new e(this));
            b.l.a.c.b.a.q(true);
            builder.credentialStore = sharedPreferencesCredentialStore;
            AuthorizationFlow authorizationFlow = new AuthorizationFlow(builder);
            this.f = authorizationFlow;
            q.a.a.d.a("AuthManager: scopes: %s", m.b(' ').a(authorizationFlow.scopes));
            this.f326b = new OAuthManager(this.f, fVar);
        }
    }

    public final void a(AppCompatActivity appCompatActivity) {
        h hVar;
        i.e(appCompatActivity, BasePayload.CONTEXT_KEY);
        LoaderManager instance = LoaderManager.getInstance(appCompatActivity);
        i.d(instance, "LoaderManager.getInstance(context)");
        CookieSyncManager.createInstance(appCompatActivity);
        CookieManager instance2 = CookieManager.getInstance();
        i.d(instance2, "CookieManager.getInstance()");
        instance2.removeAllCookie();
        if (instance.getLoader(1) == null) {
            instance.initLoader(1, (Bundle) null, this);
        } else {
            instance.restartLoader(1, (Bundle) null, this);
        }
        try {
            AuthorizationFlow authorizationFlow = this.f;
            if (authorizationFlow != null && (hVar = authorizationFlow.credentialStore) != null) {
                String str = this.f327e;
                hVar.delete(str, authorizationFlow.loadCredential(str));
            }
        } catch (IOException e2) {
            q.a.a.d.b("AuthManager: deleteCredential: Exception: %s", e2.toString());
        }
    }

    public Loader onCreateLoader(int i2, Bundle bundle) {
        return i2 == 0 ? new C0015b(this.f329h, this.f326b, false, this.f327e) : new a(this.f329h, this.f326b, this.f327e);
    }

    public void onLoadFinished(Loader loader, Object obj) {
        a.C0014a aVar = (a.C0014a) obj;
        i.e(loader, "loader");
        String str = null;
        if ((aVar != null ? (f) aVar.a : null) == null) {
            h hVar = this.c;
            if (hVar != null) {
                hVar.a(aVar != null ? aVar.d : null);
            }
            Object[] objArr = new Object[1];
            if (aVar != null) {
                str = aVar.d;
            }
            objArr[0] = str;
            q.a.a.d.b("AuthManager: data.data is null: %s", objArr);
        } else if (aVar.c) {
            Object[] objArr2 = new Object[1];
            f fVar = (f) aVar.a;
            if (fVar != null) {
                str = fVar.getAccessToken();
            }
            objArr2[0] = str;
            q.a.a.d.a("AuthManager: onLoadFinished: success: %s", objArr2);
            h hVar2 = this.c;
            if (hVar2 != null) {
                hVar2.b((f) aVar.a);
            }
        } else {
            h hVar3 = this.c;
            if (hVar3 != null) {
                hVar3.a(aVar.d);
            }
            q.a.a.d.b("AuthManager: onLoadFinished: not success: %s", aVar.d);
        }
    }

    public void onLoaderReset(Loader<a.C0014a<f>> loader) {
        i.e(loader, "loader");
        q.a.a.d.a("AuthManager: onLoaderReset: %s", loader.toString());
    }
}
