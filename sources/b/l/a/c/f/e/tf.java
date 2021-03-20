package b.l.a.c.f.e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.d.o.n0;

public final class tf implements ij<em> {
    public final /* synthetic */ uf a;

    public tf(uf ufVar) {
        this.a = ufVar;
    }

    public final void a(Object obj) {
        em emVar = (em) obj;
        if (TextUtils.isEmpty(emVar.f2947h) || TextUtils.isEmpty(emVar.f2948i)) {
            this.a.f3330b.f(a.T0("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        sk skVar = new sk(emVar.f2948i, emVar.f2947h, Long.valueOf(a.S0(emVar.f2947h)), "Bearer");
        uf ufVar = this.a;
        ufVar.c.f(skVar, (String) null, (String) null, Boolean.FALSE, (n0) null, ufVar.f3330b, this);
    }

    public final void d(@Nullable String str) {
        this.a.f3330b.f(a.T0(str));
    }
}
