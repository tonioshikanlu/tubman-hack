package b.l.a.c.c.l.k;

import b.l.a.c.c.l.a;
import b.l.a.c.c.l.a.d;
import java.util.Arrays;

public final class b<O extends a.d> {
    public final boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    public final int f2615b;
    public final a<O> c;
    public final O d;

    public b(a<O> aVar, O o2) {
        this.c = aVar;
        this.d = o2;
        this.f2615b = Arrays.hashCode(new Object[]{aVar, o2});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return !this.a && !bVar.a && b.l.a.c.b.a.T(this.c, bVar.c) && b.l.a.c.b.a.T(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.f2615b;
    }
}
