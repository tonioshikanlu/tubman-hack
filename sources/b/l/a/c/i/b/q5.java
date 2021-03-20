package b.l.a.c.i.b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.appfoundry.previewer.constants.AnimationStrength;

public final class q5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ m6 f4232h;

    public q5(m6 m6Var) {
        this.f4232h = m6Var;
    }

    public final void run() {
        r9 r9Var = this.f4232h.f4156n;
        r9Var.a.d().h();
        if (r9Var.c()) {
            if (r9Var.b()) {
                r9Var.a.q().z.b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(AnimationStrength.MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                r9Var.a.s().A("auto", "_cmpx", bundle);
            } else {
                String a = r9Var.a.q().z.a();
                if (TextUtils.isEmpty(a)) {
                    r9Var.a.a().f4089g.a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((r9Var.a.q().A.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    r9Var.a.s().A((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                r9Var.a.q().z.b((String) null);
            }
            r9Var.a.q().A.b(0);
        }
    }
}
