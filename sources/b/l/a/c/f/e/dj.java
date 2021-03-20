package b.l.a.c.f.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

public final class dj extends jj {
    public ui a = null;

    /* renamed from: b  reason: collision with root package name */
    public vi f2919b = null;
    public lj c = null;
    public final cj d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f2920e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public ej f2921g;

    public dj(Context context, String str, cj cjVar) {
        tj tjVar;
        tj tjVar2;
        this.f2920e = context.getApplicationContext();
        a.x(str);
        this.f = str;
        this.d = cjVar;
        String t1 = a.t1("firebear.secureToken");
        if (TextUtils.isEmpty(t1)) {
            Map<String, tj> map = uj.a;
            synchronized (map) {
                tjVar2 = map.get(str);
            }
            if (tjVar2 == null) {
                t1 = "https://".concat("securetoken.googleapis.com/v1");
            } else {
                throw null;
            }
        } else {
            String valueOf = String.valueOf(t1);
            Log.e("LocalClient", valueOf.length() != 0 ? "Found hermetic configuration for secureToken URL: ".concat(valueOf) : new String("Found hermetic configuration for secureToken URL: "));
        }
        if (this.c == null) {
            this.c = new lj(t1, u());
        }
        String t12 = a.t1("firebear.identityToolkit");
        if (TextUtils.isEmpty(t12)) {
            t12 = uj.a(str);
        } else {
            String valueOf2 = String.valueOf(t12);
            Log.e("LocalClient", valueOf2.length() != 0 ? "Found hermetic configuration for identityToolkit URL: ".concat(valueOf2) : new String("Found hermetic configuration for identityToolkit URL: "));
        }
        if (this.a == null) {
            this.a = new ui(t12, u());
        }
        String t13 = a.t1("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(t13)) {
            Map<String, tj> map2 = uj.a;
            synchronized (map2) {
                tjVar = map2.get(str);
            }
            if (tjVar == null) {
                t13 = "https://".concat("identitytoolkit.googleapis.com/v2/accounts");
            } else {
                throw null;
            }
        } else {
            String valueOf3 = String.valueOf(t13);
            Log.e("LocalClient", valueOf3.length() != 0 ? "Found hermetic configuration for identityToolkitV2 URL: ".concat(valueOf3) : new String("Found hermetic configuration for identityToolkitV2 URL: "));
        }
        if (this.f2919b == null) {
            this.f2919b = new vi(t13, u());
        }
        Map<String, WeakReference<dj>> map3 = uj.f3332b;
        synchronized (map3) {
            map3.put(str, new WeakReference(this));
        }
    }

    public final void a(hk hkVar, ij<sk> ijVar) {
        lj ljVar = this.c;
        a.m1(ljVar.a("/token", this.f), hkVar, ijVar, sk.class, ljVar.f3165b);
    }

    public final void b(vl vlVar, ij<wl> ijVar) {
        ui uiVar = this.a;
        a.m1(uiVar.a("/verifyCustomToken", this.f), vlVar, ijVar, wl.class, uiVar.f3165b);
    }

    public final void c(Context context, sl slVar, ij<ul> ijVar) {
        Objects.requireNonNull(slVar, "null reference");
        ui uiVar = this.a;
        a.m1(uiVar.a("/verifyAssertion", this.f), slVar, ijVar, ul.class, uiVar.f3165b);
    }

    public final void d(kl klVar, ij<ll> ijVar) {
        ui uiVar = this.a;
        a.m1(uiVar.a("/signupNewUser", this.f), klVar, ijVar, ll.class, uiVar.f3165b);
    }

    public final void e(Context context, zl zlVar, ij<am> ijVar) {
        ui uiVar = this.a;
        a.m1(uiVar.a("/verifyPassword", this.f), zlVar, ijVar, am.class, uiVar.f3165b);
    }

    public final void f(cl clVar, ij<dl> ijVar) {
        ui uiVar = this.a;
        a.m1(uiVar.a("/resetPassword", this.f), clVar, ijVar, dl.class, uiVar.f3165b);
    }

    public final void g(ik ikVar, ij<jk> ijVar) {
        ui uiVar = this.a;
        a.m1(uiVar.a("/getAccountInfo", this.f), ikVar, ijVar, jk.class, uiVar.f3165b);
    }

    public final void h(il ilVar, ij<jl> ijVar) {
        ui uiVar = this.a;
        a.m1(uiVar.a("/setAccountInfo", this.f), ilVar, ijVar, jl.class, uiVar.f3165b);
    }

    public final void i(xj xjVar, ij<yj> ijVar) {
        ui uiVar = this.a;
        a.m1(uiVar.a("/createAuthUri", this.f), xjVar, ijVar, yj.class, uiVar.f3165b);
    }

    public final void j(pk pkVar, ij<qk> ijVar) {
        if (pkVar.f3235l != null) {
            u().f2942e = pkVar.f3235l.f4934o;
        }
        ui uiVar = this.a;
        a.m1(uiVar.a("/getOobConfirmationCode", this.f), pkVar, ijVar, qk.class, uiVar.f3165b);
    }

    public final void k(fl flVar, ij<hl> ijVar) {
        if (!TextUtils.isEmpty(flVar.f2978k)) {
            u().f2942e = flVar.f2978k;
        }
        ui uiVar = this.a;
        a.m1(uiVar.a("/sendVerificationCode", this.f), flVar, ijVar, hl.class, uiVar.f3165b);
    }

    public final void l(Context context, bm bmVar, ij<cm> ijVar) {
        Objects.requireNonNull(bmVar, "null reference");
        ui uiVar = this.a;
        a.m1(uiVar.a("/verifyPhoneNumber", this.f), bmVar, ijVar, cm.class, uiVar.f3165b);
    }

    public final void m(ak akVar, ij<Void> ijVar) {
        ui uiVar = this.a;
        a.m1(uiVar.a("/deleteAccount", this.f), akVar, ijVar, Void.class, uiVar.f3165b);
    }

    public final void n(@Nullable String str, ij<Void> ijVar) {
        ej u = u();
        Objects.requireNonNull(u);
        u.d = !TextUtils.isEmpty(str);
        ((fg) ijVar).a.g();
    }

    public final void o(bk bkVar, ij<ck> ijVar) {
        ui uiVar = this.a;
        a.m1(uiVar.a("/emailLinkSignin", this.f), bkVar, ijVar, ck.class, uiVar.f3165b);
    }

    public final void p(ml mlVar, ij<nl> ijVar) {
        if (!TextUtils.isEmpty(mlVar.f3169k)) {
            u().f2942e = mlVar.f3169k;
        }
        vi viVar = this.f2919b;
        a.m1(viVar.a("/mfaEnrollment:start", this.f), mlVar, ijVar, nl.class, viVar.f3165b);
    }

    public final void q(Context context, dk dkVar, ij<ek> ijVar) {
        Objects.requireNonNull(dkVar, "null reference");
        vi viVar = this.f2919b;
        a.m1(viVar.a("/mfaEnrollment:finalize", this.f), dkVar, ijVar, ek.class, viVar.f3165b);
    }

    public final void r(dm dmVar, ij<em> ijVar) {
        vi viVar = this.f2919b;
        a.m1(viVar.a("/mfaEnrollment:withdraw", this.f), dmVar, ijVar, em.class, viVar.f3165b);
    }

    public final void s(ol olVar, ij<pl> ijVar) {
        if (!TextUtils.isEmpty(olVar.f3209k)) {
            u().f2942e = olVar.f3209k;
        }
        vi viVar = this.f2919b;
        a.m1(viVar.a("/mfaSignIn:start", this.f), olVar, ijVar, pl.class, viVar.f3165b);
    }

    public final void t(Context context, fk fkVar, ij<gk> ijVar) {
        vi viVar = this.f2919b;
        a.m1(viVar.a("/mfaSignIn:finalize", this.f), fkVar, ijVar, gk.class, viVar.f3165b);
    }

    @NonNull
    public final ej u() {
        if (this.f2921g == null) {
            this.f2921g = new ej(this.f2920e, this.d.a());
        }
        return this.f2921g;
    }
}
