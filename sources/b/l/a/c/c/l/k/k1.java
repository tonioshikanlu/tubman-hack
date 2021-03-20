package b.l.a.c.c.l.k;

import android.util.Log;
import b.l.a.c.c.b;
import b.l.a.c.c.l.k.g;
import b.l.a.c.c.m.n;
import b.l.a.c.c.m.t;
import b.l.a.c.j.b.l;
import com.google.android.gms.common.api.Scope;
import java.util.Objects;
import java.util.Set;

public final class k1 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ l f2687h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ i1 f2688i;

    public k1(i1 i1Var, l lVar) {
        this.f2688i = i1Var;
        this.f2687h = lVar;
    }

    public final void run() {
        i1 i1Var = this.f2688i;
        l lVar = this.f2687h;
        Objects.requireNonNull(i1Var);
        b bVar = lVar.f4414i;
        if (bVar.W()) {
            t tVar = lVar.f4415j;
            bVar = tVar.f2813j;
            if (!bVar.W()) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                j1 j1Var = i1Var.f2671g;
                n V = tVar.V();
                Set<Scope> set = i1Var.d;
                g.b bVar2 = (g.b) j1Var;
                Objects.requireNonNull(bVar2);
                if (V == null || set == null) {
                    Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                    bVar2.b(new b(4));
                    i1Var.f.b();
                }
                bVar2.c = V;
                bVar2.d = set;
                if (bVar2.f2660e) {
                    bVar2.a.j(V, set);
                }
                i1Var.f.b();
            }
        }
        ((g.b) i1Var.f2671g).b(bVar);
        i1Var.f.b();
    }
}
