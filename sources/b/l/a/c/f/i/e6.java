package b.l.a.c.f.i;

public final class e6 extends f6 {
    public final void a(Object obj, long j2) {
        ((v5) y7.q(obj, j2)).b();
    }

    public final <E> void b(Object obj, Object obj2, long j2) {
        v5 v5Var = (v5) y7.q(obj, j2);
        v5 v5Var2 = (v5) y7.q(obj2, j2);
        int size = v5Var.size();
        int size2 = v5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!v5Var.a()) {
                v5Var = v5Var.h(size2 + size);
            }
            v5Var.addAll(v5Var2);
        }
        if (size > 0) {
            v5Var2 = v5Var;
        }
        y7.f3819e.s(obj, j2, v5Var2);
    }
}
