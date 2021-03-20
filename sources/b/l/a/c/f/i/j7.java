package b.l.a.c.f.i;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class j7 extends AbstractSet<Map.Entry> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ k7 f3621h;

    public /* synthetic */ j7(k7 k7Var) {
        this.f3621h = k7Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f3621h.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f3621h.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f3621h.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator<Map.Entry> iterator() {
        return new i7(this.f3621h);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f3621h.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f3621h.size();
    }
}
