package b.l.a.c.f.e;

import java.util.List;

public final class r extends s {
    public final <L> List<L> a(Object obj, long j2) {
        i iVar = (i) n1.q(obj, j2);
        if (iVar.a()) {
            return iVar;
        }
        int size = iVar.size();
        i h2 = iVar.h(size == 0 ? 10 : size + size);
        n1.f3182e.s(obj, j2, h2);
        return h2;
    }

    public final void b(Object obj, long j2) {
        ((i) n1.q(obj, j2)).b();
    }

    public final <E> void c(Object obj, Object obj2, long j2) {
        i iVar = (i) n1.q(obj, j2);
        i iVar2 = (i) n1.q(obj2, j2);
        int size = iVar.size();
        int size2 = iVar2.size();
        if (size > 0 && size2 > 0) {
            if (!iVar.a()) {
                iVar = iVar.h(size2 + size);
            }
            iVar.addAll(iVar2);
        }
        if (size > 0) {
            iVar2 = iVar;
        }
        n1.f3182e.s(obj, j2, iVar2);
    }
}
