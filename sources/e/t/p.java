package e.t;

import e.x.c.i;
import e.x.c.z.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class p implements Map, Serializable, a {

    /* renamed from: h  reason: collision with root package name */
    public static final p f7935h = new p();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            i.e((Void) obj, "value");
        }
        return false;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return q.f7936h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return q.f7936h;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return o.f7934h;
    }
}
