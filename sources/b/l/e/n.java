package b.l.e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class n extends q implements Iterable<q> {

    /* renamed from: h  reason: collision with root package name */
    public final List<q> f5566h = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).f5566h.equals(this.f5566h));
    }

    public int hashCode() {
        return this.f5566h.hashCode();
    }

    public Iterator<q> iterator() {
        return this.f5566h.iterator();
    }

    public long n() {
        if (this.f5566h.size() == 1) {
            return this.f5566h.get(0).n();
        }
        throw new IllegalStateException();
    }

    public String p() {
        if (this.f5566h.size() == 1) {
            return this.f5566h.get(0).p();
        }
        throw new IllegalStateException();
    }
}
