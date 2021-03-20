package b.l.a.c.f.e;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.d.o.n0;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

public final class og {
    public final jj a;

    public og(jj jjVar) {
        this.a = jjVar;
    }

    public static void b(og ogVar, ul ulVar, ei eiVar, ij ijVar) {
        Status status;
        if (ulVar.f3334h || !TextUtils.isEmpty(ulVar.s)) {
            n0 a2 = ulVar.a();
            String str = ulVar.f3338l;
            String str2 = ulVar.u;
            if (ulVar.f3334h) {
                status = new Status(17012);
            } else {
                status = a.T0(ulVar.s);
            }
            te teVar = new te(status, a2, str, str2);
            Objects.requireNonNull(eiVar);
            try {
                eiVar.a.O(teVar);
            } catch (RemoteException e2) {
                b.l.a.c.c.n.a aVar = eiVar.f2940b;
                Log.e(aVar.a, aVar.c("RemoteException when sending failure result with credential", new Object[0]), e2);
            }
        } else {
            ogVar.f(new sk(ulVar.f3336j, ulVar.f3335i, Long.valueOf(ulVar.f3337k), "Bearer"), ulVar.f3340n, ulVar.f3339m, Boolean.valueOf(ulVar.f3341o), ulVar.a(), eiVar, ijVar);
        }
    }

    public static void c(og ogVar, ei eiVar, sk skVar, il ilVar, ij ijVar) {
        Objects.requireNonNull(eiVar, "null reference");
        ogVar.a.g(new ik(skVar.f3275i), new bf(ogVar, ijVar, eiVar, skVar, ilVar));
    }

    public static void d(og ogVar, ei eiVar, sk skVar, lk lkVar, il ilVar, ij ijVar) {
        Objects.requireNonNull(eiVar, "null reference");
        Objects.requireNonNull(skVar, "null reference");
        Objects.requireNonNull(lkVar, "null reference");
        Objects.requireNonNull(ilVar, "null reference");
        Objects.requireNonNull(ijVar, "null reference");
        ogVar.a.h(ilVar, new cf(ogVar, ilVar, lkVar, eiVar, skVar, ijVar));
    }

    public final void e(String str, ij<sk> ijVar) {
        a.x(str);
        sk X = sk.X(str);
        if (X.V()) {
            ijVar.a(X);
            return;
        }
        this.a.a(new hk(X.f3274h), new ng(ijVar));
    }

    public final void f(sk skVar, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable n0 n0Var, ei eiVar, ij ijVar) {
        Objects.requireNonNull(skVar, "null reference");
        Objects.requireNonNull(ijVar, "null reference");
        Objects.requireNonNull(eiVar, "null reference");
        this.a.g(new ik(skVar.f3275i), new df(ijVar, str2, str, bool, n0Var, eiVar, skVar));
    }
}
