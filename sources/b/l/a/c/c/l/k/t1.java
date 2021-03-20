package b.l.a.c.c.l.k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.c.d;
import b.l.a.c.c.l.k.g;
import b.l.a.c.c.l.k.j;
import b.l.a.c.k.i;

public final class t1 extends r1<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    public final j.a<?> f2707b;

    public t1(j.a<?> aVar, i<Boolean> iVar) {
        super(4, iVar);
        this.f2707b = aVar;
    }

    public final /* bridge */ /* synthetic */ void b(@NonNull c2 c2Var, boolean z) {
    }

    @Nullable
    public final d[] f(g.a<?> aVar) {
        if (aVar.f2652g.get(this.f2707b) == null) {
            return null;
        }
        throw null;
    }

    public final boolean g(g.a<?> aVar) {
        if (aVar.f2652g.get(this.f2707b) == null) {
            return false;
        }
        throw null;
    }

    public final void h(g.a<?> aVar) {
        if (aVar.f2652g.remove(this.f2707b) == null) {
            this.a.b(Boolean.FALSE);
            return;
        }
        throw null;
    }
}
