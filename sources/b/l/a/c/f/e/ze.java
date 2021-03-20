package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.d.o.d;
import java.util.Objects;

public final class ze implements ij<sk> {
    public final /* synthetic */ d a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ei f3441b;
    public final /* synthetic */ og c;

    public ze(og ogVar, d dVar, ei eiVar) {
        this.c = ogVar;
        this.a = dVar;
        this.f3441b = eiVar;
    }

    public final void a(Object obj) {
        bk bkVar = new bk(this.a, ((sk) obj).f3275i);
        og ogVar = this.c;
        ei eiVar = this.f3441b;
        Objects.requireNonNull(ogVar);
        Objects.requireNonNull(eiVar, "null reference");
        ogVar.a.o(bkVar, new af(ogVar, eiVar));
    }

    public final void d(@Nullable String str) {
        this.f3441b.f(a.T0(str));
    }
}
