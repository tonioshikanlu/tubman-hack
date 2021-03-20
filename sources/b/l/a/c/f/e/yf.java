package b.l.a.c.f.e;

import android.content.Context;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;

public final class yf implements ij<sk> {
    public final /* synthetic */ dk a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ei f3409b;
    public final /* synthetic */ og c;

    public yf(og ogVar, dk dkVar, ei eiVar) {
        this.c = ogVar;
        this.a = dkVar;
        this.f3409b = eiVar;
    }

    public final void a(Object obj) {
        dk dkVar = this.a;
        dkVar.f2923i = ((sk) obj).f3275i;
        this.c.a.q((Context) null, dkVar, new xf(this));
    }

    public final void d(@Nullable String str) {
        this.f3409b.f(a.T0(str));
    }
}
