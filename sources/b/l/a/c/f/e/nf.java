package b.l.a.c.f.e;

import android.content.Context;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;

public final class nf implements ij<sk> {
    public final /* synthetic */ bm a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ei f3191b;
    public final /* synthetic */ og c;

    public nf(og ogVar, bm bmVar, ei eiVar) {
        this.c = ogVar;
        this.a = bmVar;
        this.f3191b = eiVar;
    }

    public final void a(Object obj) {
        bm bmVar = this.a;
        bmVar.f2873l = ((sk) obj).f3275i;
        this.c.a.l((Context) null, bmVar, new mf(this, this));
    }

    public final void d(@Nullable String str) {
        this.f3191b.f(a.T0(str));
    }
}
