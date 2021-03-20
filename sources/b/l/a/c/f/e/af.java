package b.l.a.c.f.e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.d.o.n0;

public final class af implements ij<ck> {
    public final /* synthetic */ ei a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ og f2843b;

    public af(og ogVar, ei eiVar) {
        this.f2843b = ogVar;
        this.a = eiVar;
    }

    public final void a(Object obj) {
        ck ckVar = (ck) obj;
        if (!TextUtils.isEmpty(ckVar.f2892m)) {
            this.a.h(new ve(ckVar.f2892m, ckVar.f2891l, (n0) null));
            return;
        }
        this.f2843b.f(new sk(ckVar.f2888i, ckVar.f2887h, Long.valueOf(ckVar.f2890k), "Bearer"), (String) null, (String) null, Boolean.valueOf(ckVar.f2889j), (n0) null, this.a, this);
    }

    public final void d(@Nullable String str) {
        this.a.f(a.T0(str));
    }
}
