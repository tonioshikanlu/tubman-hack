package e.a.a.a.y0.b.c1;

import e.x.c.i;
import java.util.List;
import java.util.Set;

public final class x implements w {
    public final List<a0> a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<a0> f8278b;
    public final List<a0> c;

    public x(List<a0> list, Set<a0> set, List<a0> list2) {
        i.e(list, "allDependencies");
        i.e(set, "modulesWhoseInternalsAreVisible");
        i.e(list2, "expectedByDependencies");
        this.a = list;
        this.f8278b = set;
        this.c = list2;
    }

    public Set<a0> a() {
        return this.f8278b;
    }

    public List<a0> b() {
        return this.a;
    }

    public List<a0> c() {
        return this.c;
    }
}
