package b.l.d.o.e0;

import b.l.a.c.c.l.k.c;
import java.util.Objects;

public final class t implements c.a {
    public final /* synthetic */ u a;

    public t(u uVar) {
        this.a = uVar;
    }

    public final void a(boolean z) {
        if (z) {
            this.a.f4997b = true;
            k kVar = this.a.a;
            kVar.f.removeCallbacks(kVar.f4991g);
            return;
        }
        this.a.f4997b = false;
        Objects.requireNonNull(this.a);
    }
}
