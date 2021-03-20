package b.l.a.c.f.e;

import android.content.Context;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;

public final class pf implements ij<sk> {
    public final /* synthetic */ sl a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ei f3229b;
    public final /* synthetic */ og c;

    public pf(og ogVar, sl slVar, ei eiVar) {
        this.c = ogVar;
        this.a = slVar;
        this.f3229b = eiVar;
    }

    public final void a(Object obj) {
        sl slVar = this.a;
        slVar.v = true;
        String str = ((sk) obj).f3275i;
        a.x(str);
        slVar.f3280i = str;
        this.c.a.c((Context) null, this.a, new of(this, this));
    }

    public final void d(@Nullable String str) {
        this.f3229b.f(a.T0(str));
    }
}
