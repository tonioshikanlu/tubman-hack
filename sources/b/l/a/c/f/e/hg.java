package b.l.a.c.f.e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;

public final class hg implements ij<ul> {
    public final /* synthetic */ ei a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ og f3034b;

    public hg(og ogVar, ei eiVar) {
        this.f3034b = ogVar;
        this.a = eiVar;
    }

    public final void a(Object obj) {
        ul ulVar = (ul) obj;
        if (!(!TextUtils.isEmpty(ulVar.w))) {
            og.b(this.f3034b, ulVar, this.a, this);
        } else {
            this.a.h(new ve(ulVar.w, ulVar.v, ulVar.a()));
        }
    }

    public final void d(@Nullable String str) {
        this.a.f(a.T0(str));
    }
}
