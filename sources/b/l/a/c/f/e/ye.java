package b.l.a.c.f.e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.d.o.n0;

public final class ye implements ij<am> {
    public final /* synthetic */ ei a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ og f3408b;

    public ye(og ogVar, ei eiVar) {
        this.f3408b = ogVar;
        this.a = eiVar;
    }

    public final void a(Object obj) {
        am amVar = (am) obj;
        if (!TextUtils.isEmpty(amVar.f2852l)) {
            this.a.h(new ve(amVar.f2852l, amVar.f2851k, (n0) null));
            return;
        }
        this.f3408b.f(new sk(amVar.f2849i, amVar.f2848h, Long.valueOf(amVar.f2850j), "Bearer"), (String) null, (String) null, Boolean.FALSE, (n0) null, this.a, this);
    }

    public final void d(@Nullable String str) {
        this.a.f(a.T0(str));
    }
}
