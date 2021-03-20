package b.l.a.c.f.e;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class y0 extends AbstractSet<Map.Entry> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ z0 f3407h;

    public /* synthetic */ y0(z0 z0Var) {
        this.f3407h = z0Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f3407h.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f3407h.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f3407h.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator<Map.Entry> iterator() {
        return new x0(this.f3407h);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f3407h.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f3407h.size();
    }
}
