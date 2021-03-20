package b.j.a.c.e0;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class k implements Iterable<i> {

    /* renamed from: h  reason: collision with root package name */
    public Map<w, i> f1922h;

    public k() {
    }

    public k(Map<w, i> map) {
        this.f1922h = map;
    }

    public Iterator<i> iterator() {
        Map<w, i> map = this.f1922h;
        return map == null ? Collections.emptyIterator() : map.values().iterator();
    }
}
