package b.l.a.c.j.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import b.l.a.c.c.m.b;
import b.l.a.c.c.m.d;
import b.l.a.c.c.m.i;
import b.l.a.c.c.m.n;
import b.l.a.c.c.m.s;
import b.l.a.c.j.e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;

public class a extends i<f> implements e {
    public final boolean D;
    public final d E;
    public final Bundle F;
    public Integer G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, Looper looper, d dVar, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        d dVar2 = dVar;
        b.l.a.c.j.a aVar = dVar2.f2772g;
        Integer num = dVar2.f2774i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar2.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (aVar != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        this.D = true;
        this.E = dVar2;
        this.F = bundle;
        this.G = dVar2.f2774i;
    }

    public String C() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public String D() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void c() {
        r(new b.d());
    }

    public final void d() {
        try {
            ((f) B()).U(this.G.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void g(n nVar, boolean z) {
        try {
            ((f) B()).H0(nVar, this.G.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void l(d dVar) {
        b.l.a.c.b.a.B(dVar, "Expecting a valid ISignInCallbacks");
        try {
            Account account = this.E.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = b.l.a.c.a.a.b.a.a.a(this.f2747g).b();
            }
            ((f) B()).V0(new j(new s(account, this.G.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.h0(new l());
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    public int n() {
        return 12451000;
    }

    public boolean t() {
        return this.D;
    }

    public /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new h(iBinder);
    }

    public Bundle z() {
        if (!this.f2747g.getPackageName().equals(this.E.f2771e)) {
            this.F.putString("com.google.android.gms.signin.internal.realClientPackageName", this.E.f2771e);
        }
        return this.F;
    }
}
