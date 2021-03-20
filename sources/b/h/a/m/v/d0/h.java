package b.h.a.m.v.d0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.m;
import b.h.a.m.v.d0.i;
import b.h.a.m.v.l;
import b.h.a.m.v.w;
import b.h.a.s.g;

public class h extends g<m, w<?>> implements i {
    public i.a d;

    public h(long j2) {
        super(j2);
    }

    public int b(@Nullable Object obj) {
        w wVar = (w) obj;
        if (wVar == null) {
            return 1;
        }
        return wVar.a();
    }

    public void c(@NonNull Object obj, @Nullable Object obj2) {
        m mVar = (m) obj;
        w wVar = (w) obj2;
        i.a aVar = this.d;
        if (aVar != null && wVar != null) {
            ((l) aVar).f720e.a(wVar, true);
        }
    }
}
