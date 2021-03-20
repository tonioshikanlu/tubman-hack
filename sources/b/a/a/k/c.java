package b.a.a.k;

import android.content.SharedPreferences;
import b.f.a.e;
import b.l.b.a.a.b.f;
import com.wuman.android.auth.AuthorizationFlow;
import e.x.c.i;
import java.io.IOException;
import q.a.a;

public final class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f333h;

    public c(b bVar) {
        this.f333h = bVar;
    }

    public final void run() {
        try {
            b bVar = this.f333h;
            AuthorizationFlow authorizationFlow = bVar.f;
            Long l2 = null;
            f loadCredential = authorizationFlow != null ? authorizationFlow.loadCredential(bVar.f327e) : null;
            if (loadCredential != null) {
                SharedPreferences sharedPreferences = e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
                i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
                String str = e.c().getPackageName() + b.a.a.n.f.g() + "app_oauth_token";
                i.e(str, "key");
                loadCredential.setAccessToken(sharedPreferences.getString(str, ""));
            }
            if (loadCredential != null) {
                SharedPreferences sharedPreferences2 = e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
                i.d(sharedPreferences2, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
                String str2 = e.c().getPackageName() + b.a.a.n.f.g() + "refreshToken";
                i.e(str2, "key");
                loadCredential.setRefreshToken(sharedPreferences2.getString(str2, ""));
            }
            if (loadCredential != null) {
                SharedPreferences sharedPreferences3 = e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
                i.d(sharedPreferences3, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
                String str3 = e.c().getPackageName() + b.a.a.n.f.g() + "expirationTimeMilliseconds";
                i.e(str3, "key");
                String string = sharedPreferences3.getString(str3, "");
                if (string != null) {
                    l2 = Long.valueOf(Long.parseLong(string));
                }
                loadCredential.setExpirationTimeMilliseconds(l2);
            }
            if (loadCredential != null) {
                loadCredential.refreshToken();
            }
        } catch (IOException e2) {
            a.d.b("Error refreshing token: %s", e2.toString());
        }
    }
}
