package b.l.f.c0.c0.f;

import java.util.ArrayList;
import java.util.List;

public final class b {
    public final List<a> a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5607b;
    public final boolean c;

    public b(List<a> list, int i2, boolean z) {
        this.a = new ArrayList(list);
        this.f5607b = i2;
        this.c = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.a) || this.c != bVar.c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() ^ Boolean.valueOf(this.c).hashCode();
    }

    public String toString() {
        return "{ " + this.a + " }";
    }
}
